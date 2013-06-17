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
    import de.fhac.ti.yagi.vm.memory.models.Fluent;
    import de.fhac.ti.yagi.vm.memory.models.Fact;
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
       	     } else {
	       	 mInstance.output("Term " + $term.id + " is not defined yet.");
       	     }
       	 } 
       	 |
       	 list { mInstance.output($list.output); } ;

declaration:    fluent_decl
        |   
        fact_decl 
        |
        action_decl
        |
        assignment ;
        
block:      ;

action_decl:    ;

assignment:	assign ;   

assign	:	term '=' setexpr {
	if ($term.exists && $setexpr.valid) {
	    
	} else {
	    mInstance.output("Error during assignment.");
	    if (!$term.exists) {
	        mInstance.output($term.error);
	    } else if (!$setexpr.valid) {
	        mInstance.output($setexpr.error);
	    }
	}
	}
	| 	term '+=' setexpr
	| 	term '-=' setexpr
	| 	var  '=' valexpr
	| 	var '+=' valexpr ;

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
setexpr returns [boolean valid, String error] :
	set { $valid = $set.valid;
	      $error = $set.error;} ;

set  returns [boolean valid, String error] :
	'{' value (',' value)* '}'
	|	term {
	    $valid = $term.exists;
	    if (!$valid) {
	        $error = $term.error;
	    }
	} ;

value	:	INT
	|	STRING
	|	var ;

var	:	'$' ID ;

valexpr	:	value (('+'|'-') value)* ;

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
