grammar YAGI_Grammar;

options {
  language = Java;
  backtrack = true;
}

@lexer::header {package de.fhac.ti.yagi.gen;}

@header {
  package de.fhac.ti.yagi.gen;
  
    import java.util.Map;
    import java.util.Set;
    import java.util.ArrayList;
    import java.util.List;
    
    import de.fhac.ti.yagi.vm.YagiVM;
    import de.fhac.ti.yagi.vm.memory.MemoryManagement;
    import de.fhac.ti.yagi.vm.memory.MemoryManagement.TermType;
       
    import de.fhac.ti.yagi.vm.memory.SetType;
    import de.fhac.ti.yagi.vm.memory.models.Fluent;
    import de.fhac.ti.yagi.vm.memory.models.Fact;
    import de.fhac.ti.yagi.vm.memory.models.Var;
    import de.fhac.ti.yagi.vm.memory.models.action.Action;
    import de.fhac.ti.yagi.vm.memory.models.action.Assign;
    import de.fhac.ti.yagi.vm.memory.models.action.Signal;
    import de.fhac.ti.yagi.vm.memory.models.action.Assign.AssignState;    
    import de.fhac.ti.yagi.vm.memory.models.action.Formula;
    import de.fhac.ti.yagi.vm.memory.models.action.Formula.FormulaRule;
    import de.fhac.ti.yagi.vm.memory.models.action.Atom;    
    import de.fhac.ti.yagi.vm.memory.models.action.Atom.AtomRule;
    import de.fhac.ti.yagi.vm.memory.models.action.Connective;    
    import de.fhac.ti.yagi.vm.memory.models.action.Connective.ConnectiveState;    
    import de.fhac.ti.yagi.vm.memory.models.action.CompOperator;
    import de.fhac.ti.yagi.vm.memory.SetItem;    
    import de.fhac.ti.yagi.vm.memory.models.AbstractSimpleModel;
    
    import java.io.IOException;
    import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
    import de.fhac.ti.yagi.vm.exceptions.TermAlreadyDeclaredException;
    import de.fhac.ti.yagi.vm.exceptions.IncompatibleOperationException;
    import de.fhac.ti.yagi.vm.exceptions.ArgumentCountMismatchException;
    import de.fhac.ti.yagi.vm.exceptions.ArgumentNotValidException;
}

@members {    
	YagiVM mInstance;
	MemoryManagement mMemory;

    public YAGI_GrammarParser(YagiVM instance, TokenStream input) 
        throws Exception
    {
        this(input, new RecognizerSharedState());
        mInstance = instance;
        mMemory = mInstance.getMemoryModel();
    }  
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// PARSER RULES
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////


line:  	 declaration
       	 |
       	 block
       	 | 
       	 // this rule is basically used for outputting the term
       	 term {
       	     if ($term.exists) {
       	         /* output the term's values here... */
       	         // currently workaround for testing.. will crash if actions/procs are accessed
       	         AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm($term.id);
       	         SetType setType = model.getSetType();
		 Set<SetItem> values = model.getValues();
		 StringBuilder strBuilder = new StringBuilder();
		 for (SetItem item : values) {
            	     // no need for type related conversions here.. just output the
	             // values's string representation
	             strBuilder.append(item.toString()).append("/");
		 }
		 strBuilder.delete(strBuilder.length() - 1, strBuilder.length());
		 mInstance.output(strBuilder.toString());
       	     } else {
	       	 mInstance.output("Term " + $term.id + " is not defined yet.");
       	     }
       	 } 
       	 |
       	 list { 
       	     if ($list.output != null) {
       	         mInstance.output($list.output);
       	     }
       	 } ;

declaration
	:   	fluent_decl
        |   	fact_decl
        |	action_decl
        |	assignment[true] ;
        
block
	:	s=statement {
		}
	|	(s=statement {
		} )* ;

statement
	:	action_exec {
		    // pretty much execute the specified action
		    // ...
		}
	| 	pick
	| 	choose ;

action_exec
	:	//ID '(' ')' {}
	 	i=ID '(' a=arglist ')' {
		    if ($a.error) {
		    	mInstance.output("Argument is not declared yet.");
		    } else { 
		        // ouch, this could potentially crash...
		        Action action = (Action)mMemory.getTerm($i.text);
		        try {
		            action.updateScope($a.args);
		            action.execute(mInstance.getOutputStream());
		        } catch (ArgumentCountMismatchException e) {
		            mInstance.output("Argument count mismatch.");
		        } catch (ArgumentNotValidException e) {
		           mInstance.output(e.getMessage()); 
		        } catch (IOException e) {
		        }
		    }
		} ;
	
arglist	returns [List<Var> args, boolean error]
        :	//{ $args = new ArrayList<Var>(); }
         	v1=value[mMemory.getGlobalVar()] {
        	    $args = new ArrayList<Var>();
        	    $error = false;
	            Var newVar;
		    if ($v1.type == SetType.UNDEFINED) {
		        // this means that we try to a access a non-declared variable
		        $error = true;
		    } else { 
		        $error = false;
		        newVar = new Var($v1.name, $v1.v, $v1.type);
		        $args.add(newVar);
		    }   	        
		}
		( ',' v2=value[mMemory.getGlobalVar()] {
		    $error = false;
		    Map<String, Var> theScope = mMemory.getGlobalVar();
	            Var newVar;
		    if ($v2.type == SetType.UNDEFINED) {
		        // this means that we try to a access a non-declared variable
		        $error = true;
		    } else { 
		        $error = false;
		        newVar = new Var($v2.name, $v2.v, $v2.type);
		        $args.add(newVar);
		    }
		} )* ;

pick	:	;

choose	:	;

action_decl returns [Action tempAction]
        :      'action' ID {
                    $tempAction = new Action($ID.text);
                } '(' varlist ')' {
		    $tempAction.setScope($varlist.varList);
		}
		('precondition:' f=formula[$tempAction.getScope()] {
		    if ($f.valid) {
		    	$tempAction.setFormula($f.formulaObj);
		    } else {
		        mInstance.output(f.error);
		    }
		} )?
		('effect:' a=assignment[false] {
		    $tempAction.setAssignment($a.assignObj);
		} )?
		('signal:' v=valexpr[$tempAction.getScope()] {
		    Var theVar = new Var($v.name, $v.v, $v.setType);
		    Signal signal = new Signal(theVar);
  	            $tempAction.setSignal(signal);
		} )?
		'end action' {
		    // add the new action to the memory model...
		    try {
	                mMemory.addAction($tempAction);
	            } catch (InvalidModelException e) {
	                e.printStackTrace();	
	            } catch (TermAlreadyDeclaredException e) {
	                e.printStackTrace();
	            }	
		};

assignment[boolean execute] returns [Assign assignObj]
	:	assign[execute] { $assignObj = $assign.assignObj; } ;   

assign[boolean execute] returns [Assign assignObj]	
	:	term '=' setexpr ';' {
	// directly execute this assignment
	if ($term.exists && $setexpr.valid && execute) {
	    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm($term.id);
	    model.clear();
	    model.setSetType($setexpr.setType);
	    model.addAll($setexpr.elems);
	}
	// the execution is delayed (e.g. assignment in an action) 
	else if ($term.exists && $setexpr.valid && !execute) {
	    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm($term.id);
	    $assignObj = new Assign(AssignState.ASSIGN, model, $setexpr.setType, $setexpr.elems);
	}
	else {
	    mInstance.output("Error during assignment: ");
	    if (!$term.exists) {
	        mInstance.output($term.error);
	    } else if (!$setexpr.valid) {
	        mInstance.output($setexpr.error);
	    }
	}
	}
	| 	term '+=' setexpr ';' {
		if ($term.exists && $setexpr.valid && execute) {
		    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm($term.id);
	    	    // this operation is only permitted if the set types are compatible
	    	    if (model.getSetType() == $setexpr.setType) {
	    	        model.addAll($setexpr.elems);   
	    	    } else {
	    	        mInstance.output("Types are incompatible. Operation omitted.");
	    	    }
    	    	} else if ($term.exists && $setexpr.valid && !execute) {
		    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm($term.id);
		    $assignObj = new Assign(AssignState.PLUS_ASSIGN, model, $setexpr.setType, $setexpr.elems);
    	    	}
	}
	| 	term '-=' setexpr ';' {
		if ($term.exists && $setexpr.valid && execute) {
		    AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm($term.id);
	    	    // this operation is only permitted if the set types are compatible
	    	    if (model.getSetType() == $setexpr.setType) {
	    	        model.removeAll($setexpr.elems);   
	    	    } else {
	    	        mInstance.output("Types are incompatible. Operation omitted.");
	    	    }
    	        }
    	        else if ($term.exists && $setexpr.valid && !execute) {
	    		AbstractSimpleModel model = (AbstractSimpleModel)mMemory.getTerm($term.id);
	    		$assignObj = new Assign(AssignState.MINUS_ASSIGN, model, $setexpr.setType, $setexpr.elems);
		}
	}
	
	/* the following rules are not used as assignments (like in the
	   "original" YAGI grammar).
	*/
	// this rule is currently used for 'bootstrapping' the first vars (testing purposes)
	| 	var[mMemory.getGlobalVar()] '=' valexpr[mMemory.getGlobalVar()] ';' { 
	    Var newVar = new Var($var.id, $valexpr.v, $valexpr.setType);
	    mMemory.addGlobalVar(newVar);       
	}
	| 	var '+=' valexpr ';'
	|	var '-=' valexpr ';' 
		;

term returns [boolean exists, String output, String error, String id]
	:	ID {
	$id = $ID.text;
        $exists = true;
	if (!mMemory.containsTerm($ID.text)) {
	    $error = "Term '" + $ID.text + "' is not specified yet.";
	    $exists = false;
	} else {
	    $output = "Term '" + $ID.text + "' exists.";
	}
	} ;
	
varlist returns [List<Var> varList]
	:	v1=var[mMemory.getGlobalVar()] {
		    $varList = new ArrayList<Var>();
		    Var newVar = new Var($v1.id, null, $v1.setType); 
		    $varList.add(newVar); 
		}
		( ',' v2=var[mMemory.getGlobalVar()] {
		    Var newVar = new Var($v2.id, null, $v2.setType); 
		    $varList.add(newVar);
		} )* ;
		
formula[Map<String, Var> theScope] returns [Formula formulaObj, boolean valid, String error]
	:   a=atom[theScope] {
	    if ($a.valid) {
	    	$formulaObj = new Formula(FormulaRule.FIRST, theScope);
	    	$formulaObj.setAtom($a.atomResult);          
	    } else {
	        $error = $a.error;
	    }
	    $valid = $a.valid;
	}			
	|	'not' '(' b=formula[theScope] ')'	{
	    if ($a.valid) {
		$formulaObj = new Formula(FormulaRule.SECOND, theScope);
		$formulaObj.setFormula($b.formulaObj);
	    } else {
	        $error = $a.error;
	    }
	    $valid = $a.valid;
	}			
	|	'(' a=atom[theScope] c=connective b=formula[theScope] ')' {
	    if ($a.valid && $b.valid) {
  	        $formulaObj = new Formula(FormulaRule.THIRD, theScope);
	        Connective conn = new Connective($c.connState, $a.atomResult, $b.formulaObj);
	        $formulaObj.setConnective(conn);
	    } else {
	        $error = $a.error;
	    }
	    $valid = $a.valid;
	}	
	/* these rules are not implemented for now... */
	//|	'exists' v=var 'in' s=setexpr 'such' b=formula
	//|	'all' v=var 'in' s=setexpr 'such' b=formula ;
	;

atom[Map<String, Var> theScope] returns [Atom atomResult, boolean valid, String error]
	:	e1=valexpr[theScope] c=comp_op e2=valexpr[theScope] {
	            $atomResult = new Atom(AtomRule.FIRST, theScope);
	            Var first = new Var($e1.name, $e1.v, $e1.setType);
	    	    Var second = new Var($e2.name, $e2.v, $e2.setType);
	    	    CompOperator op = $c.op;
	    	    $atomResult.setFirstVar(first);
    	    	    $atomResult.setSecondVar(second);
    	    	    $atomResult.setCompOp(op);
    	    	    $valid = true;
    	    	    $error = "";
	}
	|	s1=setexpr c=comp_op s2=setexpr {
	}
	|	v1=value[mMemory.getGlobalVar()] 'in' s2=setexpr {
	            if ($s2.valid) {
		        $atomResult = new Atom(AtomRule.THIRD, theScope);
		        Var theVar = new Var($v1.name, $v1.v, $v1.type);
		        $atomResult.setFirstVar(theVar);
		        $atomResult.setFirstSet($s2.elems);
		        $atomResult.setFirstSetType($s2.setType);
		    } else {
		        $error = $s2.error;
		    }
		    $valid = $s2.valid;
	}	
	|	'true' {$atomResult = new Atom(AtomRule.FOURTH, theScope);
			$atomResult.setStaticExpression(true);
			$valid = true; $error = ""; }
	| 	'false' {$atomResult = new Atom(AtomRule.FIFTH, theScope);
			$atomResult.setStaticExpression(false);
			$valid = true; $error = ""; } ;
	
connective returns [ConnectiveState connState]
	:	'and' {$connState = ConnectiveState.AND; }
	|	'or'  {$connState = ConnectiveState.OR; } ;	
	
comp_op returns [CompOperator op]
	:	'=='	 { $op = CompOperator.EQUALS; }
	|	'!='	 { $op = CompOperator.NOT_EQUALS; }
	|	'<='	 { $op = CompOperator.LESS_OR_EQUAL; }
	|	'>=' 	 { $op = CompOperator.GREATER_OR_EQUAL; }
	|	'<'	 { $op = CompOperator.LESS; }
	|	'>' 	 { $op = CompOperator.GREATER; } ;

list returns [String output]:
	'list' list_term ';' { $output = $list_term.output; } ; 	

list_term returns [String output] :	
	'fluents' {
	    $output = mMemory.listTerm(TermType.FLUENT);
	}
	|	
	'facts' {
	    $output = mMemory.listTerm(TermType.FACT);
	} 
	|
	'actions' {
	    $output = mMemory.listTerm(TermType.ACTION);
	} ;
	// later on more list terms should be supported (e.g. actions, procs, ...)	
	// ...

// simplified expression for now (also allowed: {1} + {2,3} ...)
setexpr returns [List<SetItem> elems, SetType setType, boolean valid, String error] :
	set { $valid = $set.valid;
	      $error = $set.error;
	      $elems = $set.elems;
	      $setType = $set.setType;} ;

set returns [List<SetItem> elems, SetType setType, boolean valid, String error] :
	'{' a=value[mMemory.getGlobalVar()] {
	    $elems = new ArrayList<SetItem>();
	    SetItem item = new SetItem($a.v);
	    $elems.add(item);
	    $setType = $a.type;
	    $valid = true;
	}
	(',' b=value[mMemory.getGlobalVar()] {
	    SetItem item = new SetItem($b.v);
	    $elems.add(item);
	} )* '}'
	|	t=term {
	    $valid = $t.exists;
	    if ($valid) {
	        AbstractSimpleModel term = (AbstractSimpleModel)mMemory.getTerm($t.id);
	        $elems = new ArrayList<SetItem>();
	        for (SetItem item : term.getValues()) {
	            $elems.add(item);
	        }
	        $setType = term.getSetType();
	    } else {
	        $error = $t.error;
	    }
	} ;
	
value[Map<String, Var> theScope] returns [String name, String v, SetType type]
	:	INT	{$name = "primitive";
	 		 $v = $INT.text;
			 $type = SetType.INT;}
	|	STRING  {$name = "primitive";
			 $v = $STRING.text;
			 $type = SetType.STRING;}
	|	var[theScope]     {$name = $var.id;
			 $v = $var.v;
			 $type = $var.setType;} ;
	
	
var[Map<String, Var> theScope] returns [String id, String v, SetType setType]
	:	'$' ID {
	    if ($theScope.containsKey($ID.text)) {
                $id = $ID.text;
                $v = $theScope.get($ID.text).getmValue();
                $setType = $theScope.get($ID.text).getSetType();
            } else {
                $id = $ID.text;
                $v = null;
                $setType = SetType.UNDEFINED;
            }
	} ;		
 
valexpr[Map<String, Var> theScope] returns [String name, String v, SetType setType]
	:		
	/* only simple value expressions for now...
	    ... value (('+'|'-') value)* ; ...
	*/
	value[theScope] {
	    $name = $value.name;
	    $v = $value.v;
	    $setType = $value.type;
	} ;

fluent_decl: 	'fluent' ID ';' { 
	Fluent fluent = new Fluent($ID.text, TermType.FLUENT);
	try {
	    mMemory.addFluent(fluent); 
	} catch (InvalidModelException e) {
	    e.printStackTrace();	
	} catch (TermAlreadyDeclaredException e) {
	    e.printStackTrace();
	}	
	} ;

fact_decl: 	'fact' ID ';' { 
	Fact fact = new Fact($ID.text, TermType.FACT);
	try {
	    mMemory.addFact(fact); 
	} catch (InvalidModelException e) {
	    e.printStackTrace();	
	} catch (TermAlreadyDeclaredException e) {
	    mInstance.output("Error. Term with the id '" + $ID.text + "' is already defined.");
	}
	} ;


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// LEXER RULES
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

WHITESPACE: ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;

ID:     ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT:        '0'..'9'+ ;

STRING:     '"' ( ~('\\'|'"') )* '"' ;

COMMENT:    '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
            |
            '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;} ;
