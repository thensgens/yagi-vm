grammar YAGI;

options {
  language = Java;
  backtrack = true;
}

@lexer::header {package de.fhac.ti.antlr;}

@header {
  package de.fhac.ti.antlr;
  
	import java.util.HashMap;
	import java.util.Map;
	import java.util.HashSet;
	import java.util.Set;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.logging.Level;
	import java.util.logging.Logger;
}

@members {
	Map<String,Integer> fluents, actions;
	HashSet<String> localvars,argvars;
	Logger LOGGER;
	
 	public YAGIParser(Map fluents, Map actions, TokenStream input, Logger LOGGER) 
 		throws Exception
 	{
        this(input, new RecognizerSharedState());
        this.fluents = fluents;
        this.actions = actions;
        this.LOGGER = LOGGER;
        localvars = new HashSet<String>();
        argvars = new HashSet<String>();
        }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// PARSER RULES
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
line	:	declaration | block;

declaration:	fluent_decl {System.out.println("In declaration grammar rule...");}
		| fact_decl {System.out.println("In declaration grammar rule...");};

block	:	;
	
fluent_decl:	'fluent' ID {System.out.println("In fluent_decl grammar rule...");};

fact_decl:	'fact' ID  {	System.out.println("In fact_decl grammar rule...");};


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// LEXER RULES
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

STRING
    :  '"' ( ~('\\'|'"') )* '"'
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
