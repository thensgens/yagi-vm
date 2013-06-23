grammar YAGI_Grammar;

options {
  language = Java;
  backtrack = true;
}

@lexer::header {package de.fhac.ti.yagi.gen;}

@header {
  package de.fhac.ti.yagi.gen;
  
    import java.util.HashMap;
    import java.util.Map;
    import java.util.HashSet;
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
    import de.fhac.ti.yagi.vm.memory.SetItem;    
    import de.fhac.ti.yagi.vm.memory.models.AbstractGlobalModel;
    import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
    import de.fhac.ti.yagi.vm.exceptions.TermAlreadyDeclaredException;
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
       	         AbstractGlobalModel model = mMemory.getTerm($term.id);
       	         SetType setType = model.getSetType();
		 Set<SetItem> values = model.getValues();
		 for (SetItem item : values) {
            	     // no need for type related conversions here.. just output the
	             // values's string representation
		     mInstance.output(item.toString());
		 }
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
	:    	fluent_decl
        |   	fact_decl
        |	action_decl
        |	assignment ;
        
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
	:	;
	
pick	:	;

choose	:	;

action_decl:    ;

assignment:	assign ;   

assign	:	term '=' setexpr ';' {
	if ($term.exists && $setexpr.valid) {
	    AbstractGlobalModel model = mMemory.getTerm($term.id);
	    model.clear();
	    model.setSetType($setexpr.setType);
	    model.addAll($setexpr.elems);
	} else {
	    mInstance.output("Error during assignment: ");
	    if (!$term.exists) {
	        mInstance.output($term.error);
	    } else if (!$setexpr.valid) {
	        mInstance.output($setexpr.error);
	    }
	}
	}
	| 	term '+=' setexpr ';' {
	    AbstractGlobalModel model = mMemory.getTerm($term.id);
    	    // this operation is only permitted if the set types are compatible
    	    if (model.getSetType() == $setexpr.setType) {
    	        model.addAll($setexpr.elems);   
    	    } else {
    	        mInstance.output("Types are incompatible. Operation omitted.");
    	    }
	}
	| 	term '-=' setexpr ';' {
	    AbstractGlobalModel model = mMemory.getTerm($term.id);
    	    // this operation is only permitted if the set types are compatible
    	    if (model.getSetType() == $setexpr.setType) {
    	        model.removeAll($setexpr.elems);   
    	    } else {
    	        mInstance.output("Types are incompatible. Operation omitted.");
    	    }
	}
	
	/* the following rules are not used as assignments (like in the
	   "original" YAGI grammar).
	*/
	// this rule is currently used for 'bootstrapping' the first vars (testing purposes)
	| 	var '=' valexpr ';' { 
	    Var newVar = new Var($var.id, $valexpr.v, $valexpr.setType);
	    mMemory.addGlobalVar(newVar);       
	}
	| 	var '+=' valexpr ';'
	|	var '-=' valexpr ';' ;

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
	
list returns [String output]:
	'list' list_term ';' { $output = $list_term.output; } ; 	

list_term returns [String output] :	
	'fluents' {
	    $output = mMemory.listTerm(TermType.FLUENT);
	}
	|	
	'facts' {
	    $output = mMemory.listTerm(TermType.FACT);
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
	'{' a=value {
	    $elems = new ArrayList<SetItem>();
	    SetItem item = new SetItem($a.v);
	    $elems.add(item);
	    $setType = $a.type;
	    $valid = true;
	}
	(',' b=value {
	    SetItem item = new SetItem($b.v);
	    $elems.add(item);
	} )* '}'
	|	t=term {
	    $valid = $t.exists;
	    if ($valid) {
	        AbstractGlobalModel term = mMemory.getTerm($t.id);
	        $elems = new ArrayList<SetItem>();
	        for (SetItem item : term.getValues()) {
	            $elems.add(item);
	        }
	        $setType = term.getSetType();
	    } else {
	        $error = $term.error;
	    }
	} ;

value returns [SetType type, String v]
	:	INT	{$v = $INT.text;
			 $type = SetType.INT;}
	|	STRING  {$v = $STRING.text;
			 $type = SetType.STRING;}
	|	var     {$v = $var.id;
			 $type = $var.setType;} ;

var returns [String id, SetType setType]
	:	'$' ID {
	    $id = $ID.text;
	    $setType = SetType.UNDEFINED;
	} ;

valexpr	returns [String v, SetType setType]
	:		
	/* only simple value expressions for now...
	    ... value (('+'|'-') value)* ; ...
	*/
	value {
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
