// $ANTLR 3.1.3 May 27, 2013 16:53:35 /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g 2013-06-10 14:09:48

  package org.yagi;
  
	import alice.tuprolog.Prolog;
	import alice.tuprolog.SolveInfo;
	import alice.tuprolog.MalformedGoalException;
	import alice.tuprolog.NoSolutionException;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.HashSet;
	import java.util.Set;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	import org.yagi.TestOutput;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class YAGIParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "STRING", "WHITESPACE", "COMMENT", "';'", "'proc'", "'('", "')'", "'end proc'", "','", "'pick'", "'from'", "'such'", "'end pick'", "'test'", "'for'", "'in'", "'do'", "'end for'", "'if'", "'then'", "'else'", "'end if'", "'choose'", "'or'", "'end choose'", "'action'", "'precondition:'", "'effect:'", "'signal:'", "'end action'", "'='", "'+='", "'-='", "'not'", "'exists'", "'all'", "'and'", "'true'", "'false'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'{'", "'}'", "'['", "']'", "'$'", "'fluent'", "'fact'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int T__10=10;
    public static final int COMMENT=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int WHITESPACE=7;
    public static final int INT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=6;

    // delegates
    // delegators


        public YAGIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public YAGIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return YAGIParser.tokenNames; }
    public String getGrammarFileName() { return "/home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g"; }


    	Map<String,Integer> fluents, actions;
    	HashSet<String> localvars,argvars;
    	int prologVars = 0;
    	Prolog engine;
    	Logger LOGGER;
    	
     	public YAGIParser(Map fluents, Map actions, Prolog engine, TokenStream input, Logger LOGGER) 
     		throws Exception
     	{
            this(input, new RecognizerSharedState());
            this.fluents = fluents;
            this.actions = actions;
            this.engine = engine;
            this.LOGGER = LOGGER;
            localvars = new HashSet<String>();
            argvars = new HashSet<String>();
        }
        
        String getNewPrologVar(){
        	prologVars++;
        	return "Y" + Integer.toString(prologVars);
        }
        
        String genFreeVars(int argnum){
    		String s = "";
    		int i;
    		for (i = 0; i< argnum - 1 ; i++)
    			s += "X"+ Integer.toString(i) + ",";
    		s += "X" + Integer.toString(i);
    		return s;
        }


    public static class line_return extends ParserRuleReturnScope {
        public String ret;
        public String pcode;
    };

    // $ANTLR start "line"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:64:1: line returns [String ret, String pcode] : ( declaration | block | term );
    public final YAGIParser.line_return line() throws RecognitionException {
        YAGIParser.line_return retval = new YAGIParser.line_return();
        retval.start = input.LT(1);

        String declaration1 = null;

        String block2 = null;

        YAGIParser.term_return term3 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:65:2: ( declaration | block | term )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:65:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line61);
                    declaration1=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.ret = declaration1;
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:66:5: block
                    {
                    pushFollow(FOLLOW_block_in_line81);
                    block2=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                          
                      	           try { 
                      	              retval.pcode = "do(" + block2 + ", s0, SS), unwind(SS,S).";
                                      LOGGER.log(Level.FINER, "Prolog code to be executed (Golog block): " + retval.pcode);
                      	              SolveInfo info = engine.solve(retval.pcode); 
                                      retval.ret = info.getTerm("S").toString();
                                    } catch (NoSolutionException e){
                                      retval.ret = "[false]";
                                    } catch (Exception e){
                                      LOGGER.log(Level.SEVERE, "Exception " + e);
                                      
                                    }           
                                    LOGGER.log(Level.FINER, "Prolog S:" + retval.ret);
                                  
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:80:7: term
                    {
                    pushFollow(FOLLOW_term_in_line91);
                    term3=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                   Integer v = fluents.get((term3!=null?term3.id:null));
                                   if (v==null){
                                      retval.ret = "[Fluent " + (term3!=null?term3.id:null).substring(1) + " undefined]";
                                   }
                                   else{
                                    try { 
                                      retval.pcode = "restoreSitArg(" + (term3!=null?term3.pcode:null) + ",s0,X), findall(" + (term3!=null?term3.pvar:null) + ", X, L).";
                                      LOGGER.log(Level.FINER, "Prolog code to be executed (Golog term): " + retval.pcode);
                                      SolveInfo info = engine.solve(retval.pcode); 
                                      retval.ret = info.getTerm("L").toString();
                                      retval.ret = "{" + retval.ret.substring(1,retval.ret.length()-1) + "}";
                                    } catch (NoSolutionException e){
                                      retval.ret = "[false]";
                                    } catch (Exception e){
                                      LOGGER.log(Level.SEVERE, "Exception " + e);
                                      
                                    }           
                                    LOGGER.log(Level.FINER, "Prolog S:" + retval.ret);
                                   }
                                  
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "line"


    // $ANTLR start "declaration"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:104:1: declaration returns [String ret] : ( fluent_decl ';' | fact_decl ';' | action_decl | proc_decl | assignment );
    public final String declaration() throws RecognitionException {
        String ret = null;

        String assignment4 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:105:2: ( fluent_decl ';' | fact_decl ';' | action_decl | proc_decl | assignment )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt2=1;
                }
                break;
            case 59:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 10:
                {
                alt2=4;
                }
                break;
            case ID:
            case 20:
            case 24:
            case 57:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:105:4: fluent_decl ';'
                    {
                    pushFollow(FOLLOW_fluent_decl_in_declaration110);
                    fluent_decl();

                    state._fsp--;
                    if (state.failed) return ret;
                    match(input,9,FOLLOW_9_in_declaration112); if (state.failed) return ret;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:106:4: fact_decl ';'
                    {
                    pushFollow(FOLLOW_fact_decl_in_declaration117);
                    fact_decl();

                    state._fsp--;
                    if (state.failed) return ret;
                    match(input,9,FOLLOW_9_in_declaration119); if (state.failed) return ret;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:107:4: action_decl
                    {
                    pushFollow(FOLLOW_action_decl_in_declaration124);
                    action_decl();

                    state._fsp--;
                    if (state.failed) return ret;

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:108:4: proc_decl
                    {
                    pushFollow(FOLLOW_proc_decl_in_declaration129);
                    proc_decl();

                    state._fsp--;
                    if (state.failed) return ret;

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:109:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_declaration134);
                    assignment4=assignment();

                    state._fsp--;
                    if (state.failed) return ret;
                    if ( state.backtracking==0 ) {
                      ret = assignment4;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "proc_decl"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:115:1: proc_decl : 'proc' ID '(' varlist ')' block 'end proc' ;
    public final void proc_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:116:2: ( 'proc' ID '(' varlist ')' block 'end proc' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:116:4: 'proc' ID '(' varlist ')' block 'end proc'
            {
            match(input,10,FOLLOW_10_in_proc_decl164); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_proc_decl166); if (state.failed) return ;
            match(input,11,FOLLOW_11_in_proc_decl168); if (state.failed) return ;
            pushFollow(FOLLOW_varlist_in_proc_decl170);
            varlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,12,FOLLOW_12_in_proc_decl172); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_proc_decl174);
            block();

            state._fsp--;
            if (state.failed) return ;
            match(input,13,FOLLOW_13_in_proc_decl176); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              LOGGER.log(Level.WARNING, "Proc declaration is not supported in this version, declaration is ignored.");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "proc_decl"


    // $ANTLR start "block"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:122:1: block returns [String pcode] : s= statement (s= statement )* ;
    public final String block() throws RecognitionException {
        String pcode = null;

        String s = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:123:2: (s= statement (s= statement )* )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:123:4: s= statement (s= statement )*
            {
            pushFollow(FOLLOW_statement_in_block200);
            s=statement();

            state._fsp--;
            if (state.failed) return pcode;
            if ( state.backtracking==0 ) {
              pcode = s;
            }
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:124:4: (s= statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==15||(LA3_0>=19 && LA3_0<=20)||LA3_0==24||LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:124:5: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block223);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return pcode;
            	    if ( state.backtracking==0 ) {
            	      pcode += " : " + s;
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "block"


    // $ANTLR start "statement"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:127:1: statement returns [String pcode] : ( action_exec ';' | pick | test ';' | for_loop | if_then_else | choose );
    public final String statement() throws RecognitionException {
        String pcode = null;

        String action_exec5 = null;

        String pick6 = null;

        String test7 = null;

        String choose8 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:128:2: ( action_exec ';' | pick | test ';' | for_loop | if_then_else | choose )
            int alt4=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return pcode;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:128:4: action_exec ';'
                    {
                    pushFollow(FOLLOW_action_exec_in_statement254);
                    action_exec5=action_exec();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,9,FOLLOW_9_in_statement256); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = action_exec5;
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:129:4: pick
                    {
                    pushFollow(FOLLOW_pick_in_statement271);
                    pick6=pick();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = pick6;
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:130:4: test ';'
                    {
                    pushFollow(FOLLOW_test_in_statement297);
                    test7=test();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,9,FOLLOW_9_in_statement299); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = test7;
                    }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:131:4: for_loop
                    {
                    pushFollow(FOLLOW_for_loop_in_statement321);
                    for_loop();

                    state._fsp--;
                    if (state.failed) return pcode;

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:132:4: if_then_else
                    {
                    pushFollow(FOLLOW_if_then_else_in_statement326);
                    if_then_else();

                    state._fsp--;
                    if (state.failed) return pcode;

                    }
                    break;
                case 6 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:133:4: choose
                    {
                    pushFollow(FOLLOW_choose_in_statement331);
                    choose8=choose();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = choose8;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "statement"


    // $ANTLR start "action_exec"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:136:1: action_exec returns [String pcode] : ( ID '(' ')' | ID '(' arglist ')' );
    public final String action_exec() throws RecognitionException {
        String pcode = null;

        Token ID9=null;
        Token ID10=null;
        String arglist11 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:137:2: ( ID '(' ')' | ID '(' arglist ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==11) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==12) ) {
                        int LA5_3 = input.LA(4);

                        if ( (synpred13_YAGI()) ) {
                            alt5=1;
                        }
                        else if ( (true) ) {
                            alt5=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return pcode;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA5_2>=INT && LA5_2<=STRING)||LA5_2==57) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return pcode;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return pcode;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return pcode;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:137:4: ID '(' ')'
                    {
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_action_exec365); if (state.failed) return pcode;
                    match(input,11,FOLLOW_11_in_action_exec367); if (state.failed) return pcode;
                    match(input,12,FOLLOW_12_in_action_exec369); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = (ID9!=null?ID9.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:138:5: ID '(' arglist ')'
                    {
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_action_exec390); if (state.failed) return pcode;
                    match(input,11,FOLLOW_11_in_action_exec392); if (state.failed) return pcode;
                    pushFollow(FOLLOW_arglist_in_action_exec394);
                    arglist11=arglist();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,12,FOLLOW_12_in_action_exec396); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = (ID10!=null?ID10.getText():null) + "(" + arglist11 + ")";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "action_exec"


    // $ANTLR start "arglist"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:141:1: arglist returns [String pcode] : ( | v= value ( ',' v= value )* );
    public final String arglist() throws RecognitionException {
        String pcode = null;

        String v = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:142:2: ( | v= value ( ',' v= value )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=INT && LA7_0<=STRING)||LA7_0==57) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return pcode;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:143:2: 
                    {
                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:143:4: v= value ( ',' v= value )*
                    {
                    pushFollow(FOLLOW_value_in_arglist425);
                    v=value();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = v;
                    }
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:144:4: ( ',' v= value )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:144:6: ',' v= value
                    	    {
                    	    match(input,14,FOLLOW_14_in_arglist451); if (state.failed) return pcode;
                    	    pushFollow(FOLLOW_value_in_arglist455);
                    	    v=value();

                    	    state._fsp--;
                    	    if (state.failed) return pcode;
                    	    if ( state.backtracking==0 ) {
                    	      pcode += "," + v;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "arglist"


    // $ANTLR start "pick"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:148:1: pick returns [String pcode] : 'pick' var 'from' setexpr 'such' block 'end pick' ;
    public final String pick() throws RecognitionException {
        String pcode = null;

        String var12 = null;

        YAGIParser.setexpr_return setexpr13 = null;

        String block14 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:149:3: ( 'pick' var 'from' setexpr 'such' block 'end pick' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:149:5: 'pick' var 'from' setexpr 'such' block 'end pick'
            {
            match(input,15,FOLLOW_15_in_pick490); if (state.failed) return pcode;
            pushFollow(FOLLOW_var_in_pick492);
            var12=var();

            state._fsp--;
            if (state.failed) return pcode;
            match(input,16,FOLLOW_16_in_pick494); if (state.failed) return pcode;
            pushFollow(FOLLOW_setexpr_in_pick496);
            setexpr13=setexpr();

            state._fsp--;
            if (state.failed) return pcode;
            match(input,17,FOLLOW_17_in_pick498); if (state.failed) return pcode;
            pushFollow(FOLLOW_block_in_pick500);
            block14=block();

            state._fsp--;
            if (state.failed) return pcode;
            match(input,18,FOLLOW_18_in_pick502); if (state.failed) return pcode;
            if ( state.backtracking==0 ) {
              pcode = "pi(" + var12 + ", (?( yeq(" + (setexpr13!=null?setexpr13.pvar:null) + "," + var12 + ")" 
                    + " & " + (setexpr13!=null?setexpr13.pcode:null) + ")) : " + block14 + ")";
                   LOGGER.log(Level.FINER, "pick parsed, pcode: " + pcode);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "pick"


    // $ANTLR start "test"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:156:1: test returns [String pcode] : 'test' formula ;
    public final String test() throws RecognitionException {
        String pcode = null;

        String formula15 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:157:3: ( 'test' formula )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:157:5: 'test' formula
            {
            match(input,19,FOLLOW_19_in_test526); if (state.failed) return pcode;
            pushFollow(FOLLOW_formula_in_test528);
            formula15=formula();

            state._fsp--;
            if (state.failed) return pcode;
            if ( state.backtracking==0 ) {
              pcode = "?(" + formula15 + ")";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "test"


    // $ANTLR start "for_loop"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:160:1: for_loop : 'for' var 'in' setexpr 'do' block 'end for' ;
    public final void for_loop() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:160:9: ( 'for' var 'in' setexpr 'do' block 'end for' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:160:11: 'for' var 'in' setexpr 'do' block 'end for'
            {
            match(input,20,FOLLOW_20_in_for_loop549); if (state.failed) return ;
            pushFollow(FOLLOW_var_in_for_loop551);
            var();

            state._fsp--;
            if (state.failed) return ;
            match(input,21,FOLLOW_21_in_for_loop553); if (state.failed) return ;
            pushFollow(FOLLOW_setexpr_in_for_loop555);
            setexpr();

            state._fsp--;
            if (state.failed) return ;
            match(input,22,FOLLOW_22_in_for_loop557); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_for_loop559);
            block();

            state._fsp--;
            if (state.failed) return ;
            match(input,23,FOLLOW_23_in_for_loop561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              LOGGER.log(Level.WARNING, "(Bounded loops not supported in this version.");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "for_loop"


    // $ANTLR start "if_then_else"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:164:1: if_then_else : 'if' formula 'then' block ( 'else' block )? 'end if' ;
    public final void if_then_else() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:165:2: ( 'if' formula 'then' block ( 'else' block )? 'end if' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:165:4: 'if' formula 'then' block ( 'else' block )? 'end if'
            {
            match(input,24,FOLLOW_24_in_if_then_else579); if (state.failed) return ;
            pushFollow(FOLLOW_formula_in_if_then_else581);
            formula();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_if_then_else583); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_if_then_else585);
            block();

            state._fsp--;
            if (state.failed) return ;
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:165:30: ( 'else' block )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:165:31: 'else' block
                    {
                    match(input,26,FOLLOW_26_in_if_then_else588); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_if_then_else590);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_if_then_else594); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              LOGGER.log(Level.WARNING, "if-then-else not supported in this version, please use ?() and ( : ) instead.");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "if_then_else"


    // $ANTLR start "choose"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:169:1: choose returns [String pcode] : 'choose' b= block ( 'or' b= block )+ 'end choose' ;
    public final String choose() throws RecognitionException {
        String pcode = null;

        String b = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:170:3: ( 'choose' b= block ( 'or' b= block )+ 'end choose' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:170:5: 'choose' b= block ( 'or' b= block )+ 'end choose'
            {
            match(input,28,FOLLOW_28_in_choose616); if (state.failed) return pcode;
            pushFollow(FOLLOW_block_in_choose620);
            b=block();

            state._fsp--;
            if (state.failed) return pcode;
            if ( state.backtracking==0 ) {
              pcode = b;
            }
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:171:5: ( 'or' b= block )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:171:7: 'or' b= block
            	    {
            	    match(input,29,FOLLOW_29_in_choose641); if (state.failed) return pcode;
            	    pushFollow(FOLLOW_block_in_choose645);
            	    b=block();

            	    state._fsp--;
            	    if (state.failed) return pcode;
            	    if ( state.backtracking==0 ) {
            	      pcode = "(" + pcode + "#" + b + ")";
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return pcode;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match(input,30,FOLLOW_30_in_choose667); if (state.failed) return pcode;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "choose"


    // $ANTLR start "action_decl"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:179:1: action_decl : 'action' ID '(' varlist ')' ( 'precondition:' formula )? ( 'effect:' assignment )? ( 'signal:' valexpr )? 'end action' ;
    public final void action_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:180:2: ( 'action' ID '(' varlist ')' ( 'precondition:' formula )? ( 'effect:' assignment )? ( 'signal:' valexpr )? 'end action' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:180:4: 'action' ID '(' varlist ')' ( 'precondition:' formula )? ( 'effect:' assignment )? ( 'signal:' valexpr )? 'end action'
            {
            match(input,31,FOLLOW_31_in_action_decl683); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_action_decl685); if (state.failed) return ;
            match(input,11,FOLLOW_11_in_action_decl687); if (state.failed) return ;
            pushFollow(FOLLOW_varlist_in_action_decl689);
            varlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,12,FOLLOW_12_in_action_decl691); if (state.failed) return ;
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:181:3: ( 'precondition:' formula )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:181:4: 'precondition:' formula
                    {
                    match(input,32,FOLLOW_32_in_action_decl696); if (state.failed) return ;
                    pushFollow(FOLLOW_formula_in_action_decl698);
                    formula();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:182:3: ( 'effect:' assignment )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:182:4: 'effect:' assignment
                    {
                    match(input,33,FOLLOW_33_in_action_decl705); if (state.failed) return ;
                    pushFollow(FOLLOW_assignment_in_action_decl707);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:183:3: ( 'signal:' valexpr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:183:4: 'signal:' valexpr
                    {
                    match(input,34,FOLLOW_34_in_action_decl714); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_action_decl716);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_action_decl722); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              LOGGER.log(Level.WARNING, "Action declaration is not supported in this version, declaration is ignored.");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action_decl"


    // $ANTLR start "varlist"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:188:1: varlist : ( | var ( ',' var )* );
    public final void varlist() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:189:2: ( | var ( ',' var )* )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==57) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:190:2: 
                    {
                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:190:4: var ( ',' var )*
                    {
                    pushFollow(FOLLOW_var_in_varlist743);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:190:8: ( ',' var )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:190:10: ',' var
                    	    {
                    	    match(input,14,FOLLOW_14_in_varlist747); if (state.failed) return ;
                    	    pushFollow(FOLLOW_var_in_varlist749);
                    	    var();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varlist"


    // $ANTLR start "assignment"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:197:1: assignment returns [String ret] : ( assign ';' | for_loop_assign | conditional_assign );
    public final String assignment() throws RecognitionException {
        String ret = null;

        YAGIParser.assign_return assign16 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:198:2: ( assign ';' | for_loop_assign | conditional_assign )
            int alt15=3;
            switch ( input.LA(1) ) {
            case ID:
            case 57:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:198:4: assign ';'
                    {
                    pushFollow(FOLLOW_assign_in_assignment771);
                    assign16=assign();

                    state._fsp--;
                    if (state.failed) return ret;
                    match(input,9,FOLLOW_9_in_assignment773); if (state.failed) return ret;
                    if ( state.backtracking==0 ) {
                      ret = (assign16!=null?assign16.ret:null);
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:199:4: for_loop_assign
                    {
                    pushFollow(FOLLOW_for_loop_assign_in_assignment788);
                    for_loop_assign();

                    state._fsp--;
                    if (state.failed) return ret;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:200:4: conditional_assign
                    {
                    pushFollow(FOLLOW_conditional_assign_in_assignment793);
                    conditional_assign();

                    state._fsp--;
                    if (state.failed) return ret;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "for_loop_assign"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:203:1: for_loop_assign : 'for' var 'in' setexpr 'do' assignment 'end for' ;
    public final void for_loop_assign() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:204:2: ( 'for' var 'in' setexpr 'do' assignment 'end for' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:204:4: 'for' var 'in' setexpr 'do' assignment 'end for'
            {
            match(input,20,FOLLOW_20_in_for_loop_assign804); if (state.failed) return ;
            pushFollow(FOLLOW_var_in_for_loop_assign806);
            var();

            state._fsp--;
            if (state.failed) return ;
            match(input,21,FOLLOW_21_in_for_loop_assign808); if (state.failed) return ;
            pushFollow(FOLLOW_setexpr_in_for_loop_assign810);
            setexpr();

            state._fsp--;
            if (state.failed) return ;
            match(input,22,FOLLOW_22_in_for_loop_assign812); if (state.failed) return ;
            pushFollow(FOLLOW_assignment_in_for_loop_assign814);
            assignment();

            state._fsp--;
            if (state.failed) return ;
            match(input,23,FOLLOW_23_in_for_loop_assign816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              LOGGER.log(Level.WARNING, "For-loop assignment is not supported in this version, statement is ignored.");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "for_loop_assign"


    // $ANTLR start "conditional_assign"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:208:1: conditional_assign : 'if' formula 'then' assignment ( 'else' assignment )? 'end if' ;
    public final void conditional_assign() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:209:2: ( 'if' formula 'then' assignment ( 'else' assignment )? 'end if' )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:209:4: 'if' formula 'then' assignment ( 'else' assignment )? 'end if'
            {
            match(input,24,FOLLOW_24_in_conditional_assign834); if (state.failed) return ;
            pushFollow(FOLLOW_formula_in_conditional_assign836);
            formula();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_conditional_assign838); if (state.failed) return ;
            pushFollow(FOLLOW_assignment_in_conditional_assign840);
            assignment();

            state._fsp--;
            if (state.failed) return ;
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:209:35: ( 'else' assignment )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:209:36: 'else' assignment
                    {
                    match(input,26,FOLLOW_26_in_conditional_assign843); if (state.failed) return ;
                    pushFollow(FOLLOW_assignment_in_conditional_assign845);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_conditional_assign849); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditional_assign"

    public static class assign_return extends ParserRuleReturnScope {
        public String pcode;
        public String ret;
    };

    // $ANTLR start "assign"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:212:1: assign returns [String pcode, String ret] : ( term '=' setexpr | term '+=' setexpr | term '-=' setexpr | var '=' valexpr | var '+=' valexpr | var '-=' valexpr );
    public final YAGIParser.assign_return assign() throws RecognitionException {
        YAGIParser.assign_return retval = new YAGIParser.assign_return();
        retval.start = input.LT(1);

        YAGIParser.term_return term17 = null;

        YAGIParser.setexpr_return setexpr18 = null;

        YAGIParser.term_return term19 = null;

        YAGIParser.setexpr_return setexpr20 = null;

        YAGIParser.term_return term21 = null;

        YAGIParser.setexpr_return setexpr22 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:213:2: ( term '=' setexpr | term '+=' setexpr | term '-=' setexpr | var '=' valexpr | var '+=' valexpr | var '-=' valexpr )
            int alt17=6;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:213:4: term '=' setexpr
                    {
                    pushFollow(FOLLOW_term_in_assign865);
                    term17=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,36,FOLLOW_36_in_assign868); if (state.failed) return retval;
                    pushFollow(FOLLOW_setexpr_in_assign870);
                    setexpr18=setexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      						 Integer v = fluents.get((term17!=null?term17.id:null));
                                   if (v==null){
                                      retval.ret = "[Fluent " + (term17!=null?term17.id:null).substring(1) + " undefined]";
                                   }
                                   else{
                                    try { 
                                      retval.pcode = "restoreSitArg("+ (term17!=null?term17.pcode:null) +",s0,X), retractall(X).";
                                      LOGGER.log(Level.FINER, "Prolog code to be executed (Golog assign): " + retval.pcode);
                                      SolveInfo info = engine.solve(retval.pcode); 
                                      retval.pcode = "findall(" + (setexpr18!=null?setexpr18.pvar:null) + ", "  
                                                + "holds(" + (setexpr18!=null?setexpr18.pcode:null) + " & " + "yeq(" + (setexpr18!=null?setexpr18.pvar:null) + "," + (term17!=null?term17.pvar:null) + ") & "
                                                + "restoreSitArg(" + (term17!=null?term17.pcode:null) + ", s0, X)" + " & " + "assert(X), s0), L).";
                              //        retval.pcode = "findall(" + (setexpr18!=null?setexpr18.pvar:null) + ", (" + (setexpr18!=null?setexpr18.pcode:null) + "," + (setexpr18!=null?setexpr18.pvar:null) + "=" + (term17!=null?term17.pvar:null) 
                              //                  + ",restoreSitArg("+ (term17!=null?term17.pcode:null) +",s0,X), assert(X)), L).";
                                      LOGGER.log(Level.FINER, "Prolog code to be executed (Golog assign): " + retval.pcode);
                                      info = engine.solve(retval.pcode); 
                                      retval.ret = " ";
                                    } catch (Exception e){
                                      LOGGER.log(Level.SEVERE, "Exception " + e);
                                      
                                    }           
                                    //LOGGER.log(Level.FINER, "Prolog S:" + retval.ret);

                                    System.out.println(new TestOutput().getName());
                                   }	
                      				   
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:241:4: term '+=' setexpr
                    {
                    pushFollow(FOLLOW_term_in_assign882);
                    term19=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,37,FOLLOW_37_in_assign884); if (state.failed) return retval;
                    pushFollow(FOLLOW_setexpr_in_assign886);
                    setexpr20=setexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                   Integer v = fluents.get((term19!=null?term19.id:null));
                                   if (v==null){
                                      retval.ret = "[Fluent " + (term19!=null?term19.id:null).substring(1) + " undefined]";
                                   }
                                   else{
                                    try { 
                                      retval.pcode = "findall(" + (setexpr20!=null?setexpr20.pvar:null) + ", "  
                                                + "holds(" + (setexpr20!=null?setexpr20.pcode:null) + " & " + "yeq(" + (setexpr20!=null?setexpr20.pvar:null) + "," + (term19!=null?term19.pvar:null) + ") & "
                                                + "restoreSitArg(" + (term19!=null?term19.pcode:null) + ", s0, X)" + " & " + "assert(X), s0), L).";
                                      LOGGER.log(Level.FINER, "Prolog code to be executed (Golog assign): " + retval.pcode);
                                      SolveInfo info = engine.solve(retval.pcode); 
                                      retval.ret = " ";
                                    } catch (Exception e){
                                      LOGGER.log(Level.SEVERE, "Exception " + e);
                                      
                                    }           
                                    //LOGGER.log(Level.FINER, "Prolog S:" + retval.ret);
                                   }  
                                 
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:262:5: term '-=' setexpr
                    {
                    pushFollow(FOLLOW_term_in_assign905);
                    term21=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,38,FOLLOW_38_in_assign907); if (state.failed) return retval;
                    pushFollow(FOLLOW_setexpr_in_assign909);
                    setexpr22=setexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                   Integer v = fluents.get((term21!=null?term21.id:null));
                                   if (v==null){
                                      retval.ret = "[Fluent " + (term21!=null?term21.id:null).substring(1) + " undefined]";
                                   }
                                   else{
                                    try { 
                                      retval.pcode = "findall(" + (setexpr22!=null?setexpr22.pvar:null) + ", "  
                                                + "holds(" + (setexpr22!=null?setexpr22.pcode:null) + " & " + "yeq(" + (setexpr22!=null?setexpr22.pvar:null) + "," + (term21!=null?term21.pvar:null) + ") & "
                                                + "restoreSitArg(" + (term21!=null?term21.pcode:null) + ", s0, X)" + " & " + "retract(X), s0), L).";
                                      LOGGER.log(Level.FINER, "Prolog code to be executed (Golog assign): " + retval.pcode);
                                      SolveInfo info = engine.solve(retval.pcode); 
                                      retval.ret = " ";
                                    } catch (Exception e){
                                      LOGGER.log(Level.SEVERE, "Exception " + e);
                                      
                                    }           
                                    //LOGGER.log(Level.FINER, "Prolog S:" + retval.ret);
                                   }  
                                 
                    }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:283:5: var '=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign927);
                    var();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,36,FOLLOW_36_in_assign929); if (state.failed) return retval;
                    pushFollow(FOLLOW_valexpr_in_assign931);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:284:5: var '+=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign937);
                    var();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,37,FOLLOW_37_in_assign939); if (state.failed) return retval;
                    pushFollow(FOLLOW_valexpr_in_assign941);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:285:5: var '-=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign947);
                    var();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,38,FOLLOW_38_in_assign949); if (state.failed) return retval;
                    pushFollow(FOLLOW_valexpr_in_assign951);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"


    // $ANTLR start "formula"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:304:1: formula returns [String pcode] : (a= atom | 'not' '(' b= formula ')' | '(' a= atom c= connective b= formula ')' | 'exists' v= var 'in' s= setexpr 'such' b= formula | 'all' v= var 'in' s= setexpr 'such' b= formula );
    public final String formula() throws RecognitionException {
        String pcode = null;

        String a = null;

        String b = null;

        String c = null;

        String v = null;

        YAGIParser.setexpr_return s = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:305:2: (a= atom | 'not' '(' b= formula ')' | '(' a= atom c= connective b= formula ')' | 'exists' v= var 'in' s= setexpr 'such' b= formula | 'all' v= var 'in' s= setexpr 'such' b= formula )
            int alt18=5;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case STRING:
            case 43:
            case 44:
            case 53:
            case 57:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 11:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            case 41:
                {
                alt18=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return pcode;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:305:4: a= atom
                    {
                    pushFollow(FOLLOW_atom_in_formula976);
                    a=atom();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = a;
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:306:4: 'not' '(' b= formula ')'
                    {
                    match(input,39,FOLLOW_39_in_formula986); if (state.failed) return pcode;
                    match(input,11,FOLLOW_11_in_formula988); if (state.failed) return pcode;
                    pushFollow(FOLLOW_formula_in_formula992);
                    b=formula();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,12,FOLLOW_12_in_formula994); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "-(" + b + ")";
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:308:4: '(' a= atom c= connective b= formula ')'
                    {
                    match(input,11,FOLLOW_11_in_formula1008); if (state.failed) return pcode;
                    pushFollow(FOLLOW_atom_in_formula1012);
                    a=atom();

                    state._fsp--;
                    if (state.failed) return pcode;
                    pushFollow(FOLLOW_connective_in_formula1016);
                    c=connective();

                    state._fsp--;
                    if (state.failed) return pcode;
                    pushFollow(FOLLOW_formula_in_formula1020);
                    b=formula();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,12,FOLLOW_12_in_formula1022); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "(" + a + c + b + ")";
                    }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:310:4: 'exists' v= var 'in' s= setexpr 'such' b= formula
                    {
                    match(input,40,FOLLOW_40_in_formula1036); if (state.failed) return pcode;
                    pushFollow(FOLLOW_var_in_formula1040);
                    v=var();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,21,FOLLOW_21_in_formula1042); if (state.failed) return pcode;
                    pushFollow(FOLLOW_setexpr_in_formula1046);
                    s=setexpr();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,17,FOLLOW_17_in_formula1048); if (state.failed) return pcode;
                    pushFollow(FOLLOW_formula_in_formula1052);
                    b=formula();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "some(" + v + ", (( yeq(" + (s!=null?s.pvar:null) + "," + v + ")" + " & " + (s!=null?s.pcode:null) + ") & " + b + "))";
                    }

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:312:4: 'all' v= var 'in' s= setexpr 'such' b= formula
                    {
                    match(input,41,FOLLOW_41_in_formula1066); if (state.failed) return pcode;
                    pushFollow(FOLLOW_var_in_formula1070);
                    v=var();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,21,FOLLOW_21_in_formula1072); if (state.failed) return pcode;
                    pushFollow(FOLLOW_setexpr_in_formula1076);
                    s=setexpr();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,17,FOLLOW_17_in_formula1078); if (state.failed) return pcode;
                    pushFollow(FOLLOW_formula_in_formula1082);
                    b=formula();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "all(" + v + ", (( yeq(" + (s!=null?s.pvar:null) + ","+ v + ")" + " & " + (s!=null?s.pcode:null) + ") => " + b + "))";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "formula"


    // $ANTLR start "connective"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:316:1: connective returns [String op] : ( 'and' | 'or' );
    public final String connective() throws RecognitionException {
        String op = null;

        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:317:2: ( 'and' | 'or' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:317:4: 'and'
                    {
                    match(input,42,FOLLOW_42_in_connective1107); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = " & ";
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:318:4: 'or'
                    {
                    match(input,29,FOLLOW_29_in_connective1117); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = " v ";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "connective"


    // $ANTLR start "atom"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:321:1: atom returns [String pcode] : (e1= valexpr c= comp_op e2= valexpr | setexpr comp_op setexpr | b1= value 'in' b2= setexpr | 'true' | 'false' );
    public final String atom() throws RecognitionException {
        String pcode = null;

        YAGIParser.valexpr_return e1 = null;

        String c = null;

        YAGIParser.valexpr_return e2 = null;

        String b1 = null;

        YAGIParser.setexpr_return b2 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:322:2: (e1= valexpr c= comp_op e2= valexpr | setexpr comp_op setexpr | b1= value 'in' b2= setexpr | 'true' | 'false' )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:322:4: e1= valexpr c= comp_op e2= valexpr
                    {
                    pushFollow(FOLLOW_valexpr_in_atom1140);
                    e1=valexpr();

                    state._fsp--;
                    if (state.failed) return pcode;
                    pushFollow(FOLLOW_comp_op_in_atom1144);
                    c=comp_op();

                    state._fsp--;
                    if (state.failed) return pcode;
                    pushFollow(FOLLOW_valexpr_in_atom1148);
                    e2=valexpr();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "(" + (e1!=null?e1.d:null) + c + (e2!=null?e2.d:null) + ")";
                      							  LOGGER.log(Level.FINER, "Token atom parsed, pcode: " + pcode);
                      							
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:326:4: setexpr comp_op setexpr
                    {
                    pushFollow(FOLLOW_setexpr_in_atom1162);
                    setexpr();

                    state._fsp--;
                    if (state.failed) return pcode;
                    pushFollow(FOLLOW_comp_op_in_atom1164);
                    comp_op();

                    state._fsp--;
                    if (state.failed) return pcode;
                    pushFollow(FOLLOW_setexpr_in_atom1166);
                    setexpr();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      LOGGER.log(Level.WARNING, "Comparison between set expressions is not supported in this version, the corresponding atom is ignored.");
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:328:4: b1= value 'in' b2= setexpr
                    {
                    pushFollow(FOLLOW_value_in_atom1182);
                    b1=value();

                    state._fsp--;
                    if (state.failed) return pcode;
                    match(input,21,FOLLOW_21_in_atom1184); if (state.failed) return pcode;
                    pushFollow(FOLLOW_setexpr_in_atom1188);
                    b2=setexpr();

                    state._fsp--;
                    if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "( yeq(" + b1 + "," + (b2!=null?b2.pvar:null) + ")" + " & " + (b2!=null?b2.pcode:null) + ")";
                      							 LOGGER.log(Level.FINER, "Token atom parsed, pcode: " + pcode);
                      							
                    }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:332:4: 'true'
                    {
                    match(input,43,FOLLOW_43_in_atom1203); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "true";
                    }

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:333:5: 'false'
                    {
                    match(input,44,FOLLOW_44_in_atom1214); if (state.failed) return pcode;
                    if ( state.backtracking==0 ) {
                      pcode = "false";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pcode;
    }
    // $ANTLR end "atom"


    // $ANTLR start "comp_op"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:336:1: comp_op returns [String op] : ( '==' | '!=' | '<=' | '>=' | '<' | '>' );
    public final String comp_op() throws RecognitionException {
        String op = null;

        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:337:2: ( '==' | '!=' | '<=' | '>=' | '<' | '>' )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt21=1;
                }
                break;
            case 46:
                {
                alt21=2;
                }
                break;
            case 47:
                {
                alt21=3;
                }
                break;
            case 48:
                {
                alt21=4;
                }
                break;
            case 49:
                {
                alt21=5;
                }
                break;
            case 50:
                {
                alt21=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:337:4: '=='
                    {
                    match(input,45,FOLLOW_45_in_comp_op1235); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = "=";
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:338:4: '!='
                    {
                    match(input,46,FOLLOW_46_in_comp_op1245); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = "\\=";
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:339:4: '<='
                    {
                    match(input,47,FOLLOW_47_in_comp_op1255); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = "=<";
                    }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:340:4: '>='
                    {
                    match(input,48,FOLLOW_48_in_comp_op1265); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = ">=";
                    }

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:341:4: '<'
                    {
                    match(input,49,FOLLOW_49_in_comp_op1276); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = "<";
                    }

                    }
                    break;
                case 6 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:342:4: '>'
                    {
                    match(input,50,FOLLOW_50_in_comp_op1287); if (state.failed) return op;
                    if ( state.backtracking==0 ) {
                      op = ">";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "comp_op"

    public static class setexpr_return extends ParserRuleReturnScope {
        public List<String> elems;
        public String pvar;
        public String pcode;
        public Boolean simple;
    };

    // $ANTLR start "setexpr"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:349:1: setexpr returns [List<String> elems, String pvar, String pcode, Boolean simple] : e= set ( ( '+' | '-' ) set )* ;
    public final YAGIParser.setexpr_return setexpr() throws RecognitionException {
        YAGIParser.setexpr_return retval = new YAGIParser.setexpr_return();
        retval.start = input.LT(1);

        YAGIParser.set_return e = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:350:2: (e= set ( ( '+' | '-' ) set )* )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:350:4: e= set ( ( '+' | '-' ) set )*
            {
            pushFollow(FOLLOW_set_in_setexpr1315);
            e=set();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.elems = (e!=null?e.elems:null); retval.simple =true; retval.pvar = (e!=null?e.pvar:null); retval.pcode = (e!=null?e.pcode:null);
            }
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:351:3: ( ( '+' | '-' ) set )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=51 && LA22_0<=52)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:351:4: ( '+' | '-' ) set
            	    {
            	    if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_set_in_setexpr1332);
            	    set();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      retval.simple = false;
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              if (!retval.simple) LOGGER.log(Level.WARNING, "Arithmetic not supported in this version, only the first value of the expression is considered.");
              							 LOGGER.log(Level.FINER, "Token setexpr parsed, pcode: " + retval.pcode + " pvar: " + retval.pvar);
              							
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setexpr"

    public static class set_return extends ParserRuleReturnScope {
        public List<String> elems;
        public String pvar;
        public String pcode;
    };

    // $ANTLR start "set"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:357:1: set returns [List<String> elems, String pvar, String pcode] : ( '{' a= value ( ',' b= value )* '}' | e= term );
    public final YAGIParser.set_return set() throws RecognitionException {
        YAGIParser.set_return retval = new YAGIParser.set_return();
        retval.start = input.LT(1);

        String a = null;

        String b = null;

        YAGIParser.term_return e = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:358:2: ( '{' a= value ( ',' b= value )* '}' | e= term )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==53) ) {
                alt24=1;
            }
            else if ( (LA24_0==ID) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:358:4: '{' a= value ( ',' b= value )* '}'
                    {
                    match(input,53,FOLLOW_53_in_set1361); if (state.failed) return retval;
                    pushFollow(FOLLOW_value_in_set1365);
                    a=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.elems = new ArrayList<String>(); retval.elems.add(a); 
                      						 retval.pvar = getNewPrologVar();
                      						 retval.pcode = "(yeq(" + retval.pvar + "," + a + ")";
                      						
                    }
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:362:3: ( ',' b= value )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:362:5: ',' b= value
                    	    {
                    	    match(input,14,FOLLOW_14_in_set1375); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_value_in_set1379);
                    	    b=value();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	      retval.elems.add(b); 
                    	      						 retval.pcode += " v " + "yeq(" + retval.pvar + "," + b + ")";
                    	      						
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,54,FOLLOW_54_in_set1389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.pcode += ")";
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:366:4: e= term
                    {
                    pushFollow(FOLLOW_term_in_set1400);
                    e=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.pvar = (e!=null?e.pvar:null); retval.pcode = (e!=null?e.pcode:null);
                      						 LOGGER.log(Level.FINER, "Token set parsed, pcode: " + retval.pcode + " pvar: " + retval.pvar);	
                      						
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "set"

    public static class term_return extends ParserRuleReturnScope {
        public String id;
        public List<String> args;
        public String pvar;
        public String pcode;
    };

    // $ANTLR start "term"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:371:1: term returns [String id, List<String> args, String pvar, String pcode] : ID ( '[' value ']' )* ;
    public final YAGIParser.term_return term() throws RecognitionException {
        YAGIParser.term_return retval = new YAGIParser.term_return();
        retval.start = input.LT(1);

        Token ID23=null;
        String value24 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:372:3: ( ID ( '[' value ']' )* )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:372:5: ID ( '[' value ']' )*
            {
            ID23=(Token)match(input,ID,FOLLOW_ID_in_term1420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.id = "f" + (ID23!=null?ID23.getText():null); retval.args = new ArrayList<String>();
            }
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:373:4: ( '[' value ']' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:373:6: '[' value ']'
            	    {
            	    match(input,55,FOLLOW_55_in_term1433); if (state.failed) return retval;
            	    pushFollow(FOLLOW_value_in_term1435);
            	    value24=value();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,56,FOLLOW_56_in_term1437); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      retval.args.add(value24);
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              retval.pcode = retval.id + "(";
               						 for (int i=0; i<retval.args.size(); i++)
               							retval.pcode += retval.args.get(i) + ",";
               						 retval.pvar = getNewPrologVar();
               						 retval.pcode += retval.pvar + ")";
              						 LOGGER.log(Level.FINER, "Token term parsed, pcode: " + retval.pcode + " pvar: " + retval.pvar);
               						
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class valexpr_return extends ParserRuleReturnScope {
        public String d;
        public Boolean simple;
    };

    // $ANTLR start "valexpr"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:383:1: valexpr returns [String d, Boolean simple] : e= value ( ( '+' | '-' ) value )* ;
    public final YAGIParser.valexpr_return valexpr() throws RecognitionException {
        YAGIParser.valexpr_return retval = new YAGIParser.valexpr_return();
        retval.start = input.LT(1);

        String e = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:384:2: (e= value ( ( '+' | '-' ) value )* )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:384:4: e= value ( ( '+' | '-' ) value )*
            {
            pushFollow(FOLLOW_value_in_valexpr1468);
            e=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.d = e; retval.simple =true;
            }
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:385:3: ( ( '+' | '-' ) value )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=51 && LA26_0<=52)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:385:4: ( '+' | '-' ) value
            	    {
            	    if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_value_in_valexpr1484);
            	    value();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      retval.simple = false;
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              if (!retval.simple) LOGGER.log(Level.WARNING, "Arithmetic not supported in this version, only the first value of the expression is considered.");
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valexpr"


    // $ANTLR start "value"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:389:1: value returns [String d] : ( INT | STRING | var );
    public final String value() throws RecognitionException {
        String d = null;

        Token INT25=null;
        Token STRING26=null;
        String var27 = null;


        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:390:2: ( INT | STRING | var )
            int alt27=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt27=1;
                }
                break;
            case STRING:
                {
                alt27=2;
                }
                break;
            case 57:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return d;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:390:4: INT
                    {
                    INT25=(Token)match(input,INT,FOLLOW_INT_in_value1510); if (state.failed) return d;
                    if ( state.backtracking==0 ) {
                      d = (INT25!=null?INT25.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:391:4: STRING
                    {
                    STRING26=(Token)match(input,STRING,FOLLOW_STRING_in_value1518); if (state.failed) return d;
                    if ( state.backtracking==0 ) {
                      d = (STRING26!=null?STRING26.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:392:4: var
                    {
                    pushFollow(FOLLOW_var_in_value1525);
                    var27=var();

                    state._fsp--;
                    if (state.failed) return d;
                    if ( state.backtracking==0 ) {
                      d = var27;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "value"


    // $ANTLR start "var"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:395:1: var returns [String id] : '$' ID ;
    public final String var() throws RecognitionException {
        String id = null;

        Token ID28=null;

        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:396:2: ( '$' ID )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:396:4: '$' ID
            {
            match(input,57,FOLLOW_57_in_var1543); if (state.failed) return id;
            ID28=(Token)match(input,ID,FOLLOW_ID_in_var1545); if (state.failed) return id;
            if ( state.backtracking==0 ) {
              if (argvars.contains((ID28!=null?ID28.getText():null))){ 
              				 	id = "ArgVar"+(ID28!=null?ID28.getText():null);
              				 }else {
              				 	id = "locVar"+(ID28!=null?ID28.getText():null);
              				 }
              				
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "var"

    public static class fluent_decl_return extends ParserRuleReturnScope {
        public String pcode;
        public String id;
        public int argnum;
    };

    // $ANTLR start "fluent_decl"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:407:1: fluent_decl returns [String pcode, String id, int argnum] : 'fluent' ID ( '[' ']' )* ;
    public final YAGIParser.fluent_decl_return fluent_decl() throws RecognitionException {
        YAGIParser.fluent_decl_return retval = new YAGIParser.fluent_decl_return();
        retval.start = input.LT(1);

        Token ID29=null;

        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:408:2: ( 'fluent' ID ( '[' ']' )* )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:408:4: 'fluent' ID ( '[' ']' )*
            {
            match(input,58,FOLLOW_58_in_fluent_decl1566); if (state.failed) return retval;
            ID29=(Token)match(input,ID,FOLLOW_ID_in_fluent_decl1568); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.id = (ID29!=null?ID29.getText():null); retval.argnum = 0;
            }
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:409:3: ( '[' ']' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:409:4: '[' ']'
            	    {
            	    match(input,55,FOLLOW_55_in_fluent_decl1576); if (state.failed) return retval;
            	    match(input,56,FOLLOW_56_in_fluent_decl1578); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      retval.argnum++;
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              String freevars;
              					 Integer v = fluents.get(retval.id);
              					 if (v==null){
              					 	// Add the fluent information to the Map 
              					 	fluents.put(retval.id,new Integer(retval.argnum));
              					 	try { 
              						 	// Provide the clause for restoring the situation argument
              						 	freevars = genFreeVars(retval.argnum+1);
              						 	retval.pcode = "assert(restoreSitArg(" + "f" + retval.id + "(" + freevars + "),S," + "f" + retval.id + "(" + freevars + ",S))).";
              					 		engine.solve(retval.pcode); 
              						 	LOGGER.log(Level.FINER, "Prolog code executed: " + retval.pcode);
              					 	}catch (MalformedGoalException exc){
              					 		LOGGER.log(Level.SEVERE, "MalformedGoalException " + exc);
              					 	}					 	
              					 	LOGGER.log(Level.FINE, "fluent " + retval.id + " initialized.");
              					 }else{
              						try { 
              							// First retract all existing atoms of the fluent
              					 		freevars = genFreeVars(v+1);
              					 		retval.pcode = "retractall(" + "f" + retval.id + "(" + freevars + ")).";
              					 		engine.solve(retval.pcode); 
              						 	LOGGER.log(Level.FINER, "Prolog code executed: " + retval.pcode);
              					 		// Then retract the clause for restoring the situation argument
              					 		retval.pcode = "retract(restoreSitArg(" + "f" + retval.id + "(" + freevars + "),S," + "f" + retval.id + "(" + freevars + ",S))).";
              					 		engine.solve(retval.pcode); 
              						 	LOGGER.log(Level.FINER, "Prolog code executed: " + retval.pcode);
              						 	// Then assert the new clause for restoring the situation argument
              						 	freevars = genFreeVars(retval.argnum+1);					 	
              						 	retval.pcode = "assert(restoreSitArg(" + "f"+ retval.id + "(" + freevars + "),S," + "f" + retval.id + "(" + freevars + ",S))).";					 	
              					 		engine.solve(retval.pcode); 
              						 	LOGGER.log(Level.FINER, "Prolog code executed: " + retval.pcode);
              					 	}catch (MalformedGoalException exc){
              					 		LOGGER.log(Level.SEVERE, "MalformedGoalException " + exc);
              					 	}
              					 	// Finally, add the fluent information to the Map 
              					 	fluents.put(retval.id,new Integer(retval.argnum));
              					 	// Log the event
              					 	LOGGER.log(Level.FINE, "fluent " + retval.id + " re-initialized (old values have been discarded).");
              					 }
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fluent_decl"


    // $ANTLR start "fact_decl"
    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:451:1: fact_decl : 'fact' ID ( '[' ']' )* ;
    public final void fact_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:452:1: ( 'fact' ID ( '[' ']' )* )
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:452:3: 'fact' ID ( '[' ']' )*
            {
            match(input,59,FOLLOW_59_in_fact_decl1600); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_fact_decl1602); if (state.failed) return ;
            // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:452:13: ( '[' ']' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==55) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:452:14: '[' ']'
            	    {
            	    match(input,55,FOLLOW_55_in_fact_decl1605); if (state.failed) return ;
            	    match(input,56,FOLLOW_56_in_fact_decl1607); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              LOGGER.log(Level.WARNING, "Facts not supported in this version, please use normal fluents instead.");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fact_decl"

    // $ANTLR start synpred1_YAGI
    public final void synpred1_YAGI_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:65:4: ( declaration )
        // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:65:4: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred1_YAGI61);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_YAGI

    // $ANTLR start synpred2_YAGI
    public final void synpred2_YAGI_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:66:5: ( block )
        // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:66:5: block
        {
        pushFollow(FOLLOW_block_in_synpred2_YAGI81);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_YAGI

    // $ANTLR start synpred13_YAGI
    public final void synpred13_YAGI_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:137:4: ( ID '(' ')' )
        // /home/thens/yagi/yagi-read-only/src/org/yagi/YAGI.g:137:4: ID '(' ')'
        {
        match(input,ID,FOLLOW_ID_in_synpred13_YAGI365); if (state.failed) return ;
        match(input,11,FOLLOW_11_in_synpred13_YAGI367); if (state.failed) return ;
        match(input,12,FOLLOW_12_in_synpred13_YAGI369); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_YAGI

    // Delegated rules

    public final boolean synpred1_YAGI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_YAGI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_YAGI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_YAGI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_YAGI() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_YAGI_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\4\4\uffff\1\0\1\uffff\2\0\4\uffff";
    static final String DFA1_maxS =
        "\1\73\4\uffff\1\0\1\uffff\2\0\4\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\2\uffff\1\3";
    static final String DFA1_specialS =
        "\5\uffff\1\0\1\uffff\1\1\1\2\4\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\5\uffff\1\1\4\uffff\1\11\3\uffff\1\11\1\7\3\uffff\1\10"+
            "\3\uffff\1\11\2\uffff\1\1\31\uffff\3\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "64:1: line returns [String ret, String pcode] : ( declaration | block | term );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_YAGI()) ) {s = 1;}

                        else if ( (synpred2_YAGI()) ) {s = 9;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_YAGI()) ) {s = 1;}

                        else if ( (synpred2_YAGI()) ) {s = 9;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_YAGI()) ) {s = 1;}

                        else if ( (synpred2_YAGI()) ) {s = 9;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\20\uffff";
    static final String DFA17_eofS =
        "\20\uffff";
    static final String DFA17_minS =
        "\1\4\1\44\1\4\1\5\3\uffff\1\44\2\70\1\4\3\uffff\1\44\1\70";
    static final String DFA17_maxS =
        "\1\71\1\67\1\4\1\71\3\uffff\1\46\2\70\1\4\3\uffff\1\67\1\70";
    static final String DFA17_acceptS =
        "\4\uffff\1\3\1\2\1\1\4\uffff\1\5\1\6\1\4\2\uffff";
    static final String DFA17_specialS =
        "\20\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\64\uffff\1\2",
            "\1\6\1\5\1\4\20\uffff\1\3",
            "\1\7",
            "\1\10\1\11\62\uffff\1\12",
            "",
            "",
            "",
            "\1\15\1\13\1\14",
            "\1\16",
            "\1\16",
            "\1\17",
            "",
            "",
            "",
            "\1\6\1\5\1\4\20\uffff\1\3",
            "\1\16"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "212:1: assign returns [String pcode, String ret] : ( term '=' setexpr | term '+=' setexpr | term '-=' setexpr | var '=' valexpr | var '+=' valexpr | var '-=' valexpr );";
        }
    }
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\4\2\25\1\4\5\uffff\1\25";
    static final String DFA20_maxS =
        "\1\71\2\64\1\4\5\uffff\1\64";
    static final String DFA20_acceptS =
        "\4\uffff\1\2\1\4\1\5\1\3\1\1\1\uffff";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\4\1\1\1\2\44\uffff\1\5\1\6\10\uffff\1\4\3\uffff\1\3",
            "\1\7\27\uffff\10\10",
            "\1\7\27\uffff\10\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\7\27\uffff\10\10"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "321:1: atom returns [String pcode] : (e1= valexpr c= comp_op e2= valexpr | setexpr comp_op setexpr | b1= value 'in' b2= setexpr | 'true' | 'false' );";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_line61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_line81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fluent_decl_in_declaration110 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_declaration112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_decl_in_declaration117 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_declaration119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_decl_in_declaration124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_decl_in_declaration129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_declaration134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_proc_decl164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_proc_decl166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_proc_decl168 = new BitSet(new long[]{0x0200000000001000L});
    public static final BitSet FOLLOW_varlist_in_proc_decl170 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_proc_decl172 = new BitSet(new long[]{0x0000000011188010L});
    public static final BitSet FOLLOW_block_in_proc_decl174 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_proc_decl176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block200 = new BitSet(new long[]{0x0000000011188012L});
    public static final BitSet FOLLOW_statement_in_block223 = new BitSet(new long[]{0x0000000011188012L});
    public static final BitSet FOLLOW_action_exec_in_statement254 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_statement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_statement297 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_in_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_then_else_in_statement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_statement331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_action_exec365 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_action_exec367 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_action_exec369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_action_exec390 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_action_exec392 = new BitSet(new long[]{0x0200000000001060L});
    public static final BitSet FOLLOW_arglist_in_action_exec394 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_action_exec396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_arglist425 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_arglist451 = new BitSet(new long[]{0x0200000000004060L});
    public static final BitSet FOLLOW_value_in_arglist455 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15_in_pick490 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_var_in_pick492 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_pick494 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_pick496 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_pick498 = new BitSet(new long[]{0x0000000011188010L});
    public static final BitSet FOLLOW_block_in_pick500 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_pick502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_test526 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_test528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_for_loop549 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_var_in_for_loop551 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_for_loop553 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_for_loop555 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_for_loop557 = new BitSet(new long[]{0x0000000011188010L});
    public static final BitSet FOLLOW_block_in_for_loop559 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_for_loop561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_if_then_else579 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_if_then_else581 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_if_then_else583 = new BitSet(new long[]{0x0000000011188010L});
    public static final BitSet FOLLOW_block_in_if_then_else585 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_if_then_else588 = new BitSet(new long[]{0x0000000011188010L});
    public static final BitSet FOLLOW_block_in_if_then_else590 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_if_then_else594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_choose616 = new BitSet(new long[]{0x0000000011188010L});
    public static final BitSet FOLLOW_block_in_choose620 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_choose641 = new BitSet(new long[]{0x0000000011188010L});
    public static final BitSet FOLLOW_block_in_choose645 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_choose667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_action_decl683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_action_decl685 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_action_decl687 = new BitSet(new long[]{0x0200000000001000L});
    public static final BitSet FOLLOW_varlist_in_action_decl689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_action_decl691 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_32_in_action_decl696 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_action_decl698 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_33_in_action_decl705 = new BitSet(new long[]{0x0220007001100010L});
    public static final BitSet FOLLOW_assignment_in_action_decl707 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_action_decl714 = new BitSet(new long[]{0x0218000000000060L});
    public static final BitSet FOLLOW_valexpr_in_action_decl716 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_action_decl722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varlist743 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_varlist747 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_var_in_varlist749 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_assign_in_assignment771 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assignment773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_loop_assign_in_assignment788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_assign_in_assignment793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_for_loop_assign804 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_var_in_for_loop_assign806 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_for_loop_assign808 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_for_loop_assign810 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_for_loop_assign812 = new BitSet(new long[]{0x0220007001100010L});
    public static final BitSet FOLLOW_assignment_in_for_loop_assign814 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_for_loop_assign816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_conditional_assign834 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_conditional_assign836 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_conditional_assign838 = new BitSet(new long[]{0x0220007001100010L});
    public static final BitSet FOLLOW_assignment_in_conditional_assign840 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_conditional_assign843 = new BitSet(new long[]{0x0220007001100010L});
    public static final BitSet FOLLOW_assignment_in_conditional_assign845 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_conditional_assign849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign865 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_assign868 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_assign870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign882 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_assign884 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_assign886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign905 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assign907 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_assign909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign927 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_assign929 = new BitSet(new long[]{0x0218000000000060L});
    public static final BitSet FOLLOW_valexpr_in_assign931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign937 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_assign939 = new BitSet(new long[]{0x0218000000000060L});
    public static final BitSet FOLLOW_valexpr_in_assign941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign947 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assign949 = new BitSet(new long[]{0x0218000000000060L});
    public static final BitSet FOLLOW_valexpr_in_assign951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_formula976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_formula986 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_formula988 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_formula992 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_formula994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_formula1008 = new BitSet(new long[]{0x0238180000200070L});
    public static final BitSet FOLLOW_atom_in_formula1012 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_connective_in_formula1016 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_formula1020 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_formula1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_formula1036 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_var_in_formula1040 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_formula1042 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_formula1046 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_formula1048 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_formula1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_formula1066 = new BitSet(new long[]{0x0200000000200000L});
    public static final BitSet FOLLOW_var_in_formula1070 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_formula1072 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_formula1076 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_formula1078 = new BitSet(new long[]{0x02381B8000200870L});
    public static final BitSet FOLLOW_formula_in_formula1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_connective1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_connective1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valexpr_in_atom1140 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_comp_op_in_atom1144 = new BitSet(new long[]{0x0218000000000060L});
    public static final BitSet FOLLOW_valexpr_in_atom1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setexpr_in_atom1162 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_comp_op_in_atom1164 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_atom1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_atom1182 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_atom1184 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_setexpr_in_atom1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_atom1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_atom1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_comp_op1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_comp_op1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_comp_op1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_comp_op1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_comp_op1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_comp_op1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_setexpr1315 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_set_in_setexpr1326 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_setexpr1332 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_53_in_set1361 = new BitSet(new long[]{0x0240000000004060L});
    public static final BitSet FOLLOW_value_in_set1365 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_14_in_set1375 = new BitSet(new long[]{0x0240000000004060L});
    public static final BitSet FOLLOW_value_in_set1379 = new BitSet(new long[]{0x0040000000004000L});
    public static final BitSet FOLLOW_54_in_set1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_set1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1420 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_term1433 = new BitSet(new long[]{0x0300000000000060L});
    public static final BitSet FOLLOW_value_in_term1435 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_term1437 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_value_in_valexpr1468 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_set_in_valexpr1478 = new BitSet(new long[]{0x0218000000000060L});
    public static final BitSet FOLLOW_value_in_valexpr1484 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_INT_in_value1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_value1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_var1543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_fluent_decl1566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fluent_decl1568 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_fluent_decl1576 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_fluent_decl1578 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_59_in_fact_decl1600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fact_decl1602 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_fact_decl1605 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_fact_decl1607 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1_YAGI61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred2_YAGI81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred13_YAGI365 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred13_YAGI367 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred13_YAGI369 = new BitSet(new long[]{0x0000000000000002L});

}