// $ANTLR 3.1.3 May 27, 2013 16:53:35 /home/thens/yagi/yagi-vm/YAGI_Grammar.g 2013-06-22 23:21:54

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
    import de.fhac.ti.yagi.vm.memory.SetItem;    
    import de.fhac.ti.yagi.vm.memory.models.AbstractGlobalModel;
    import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
    import de.fhac.ti.yagi.vm.exceptions.TermAlreadyDeclaredException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class YAGI_GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "STRING", "WHITESPACE", "COMMENT", "'='", "';'", "'+='", "'-='", "'list'", "'fluents'", "'facts'", "'{'", "','", "'}'", "'$'", "'fluent'", "'fact'"
    };
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=7;
    public static final int INT=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int COMMENT=8;
    public static final int STRING=6;

    // delegates
    // delegators


        public YAGI_GrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public YAGI_GrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return YAGI_GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/home/thens/yagi/yagi-vm/YAGI_Grammar.g"; }

        
    	YagiVM mInstance;
    	MemoryManagement mMemory;

        public YAGI_GrammarParser(YagiVM instance, TokenStream input) 
            throws Exception
        {
            this(input, new RecognizerSharedState());
            mInstance = instance;
            mMemory = mInstance.getMemoryModel();
        }  



    // $ANTLR start "line"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:50:1: line : ( declaration | block | term | list );
    public final void line() throws RecognitionException {
        YAGI_GrammarParser.term_return term1 = null;

        String list2 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:50:5: ( declaration | block | term | list )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
            case 21:
                {
                alt1=1;
                }
                break;
            case EOF:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1_YAGI_Grammar()) ) {
                    alt1=1;
                }
                else if ( (synpred2_YAGI_Grammar()) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==9||(LA1_3>=11 && LA1_3<=12)) ) {
                    alt1=1;
                }
                else if ( (LA1_3==EOF) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:50:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line62);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:52:10: block
                    {
                    pushFollow(FOLLOW_block_in_line84);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:55:10: term
                    {
                    pushFollow(FOLLOW_term_in_line117);
                    term1=term();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                             	     if ((term1!=null?term1.exists:false)) {
                             	         /* output the term's values here... */
                             	         AbstractGlobalModel model = mMemory.getTerm((term1!=null?term1.id:null));
                             	         SetType setType = model.getSetType();
                      		 Set<SetItem> values = model.getValues();
                      		 for (SetItem item : values) {
                                  	     // no need type related conversions here.. just output the
                      	             // values's string representation
                      		     mInstance.output(item.toString());
                      		 }
                             	     } else {
                      	       	 mInstance.output("Term " + (term1!=null?term1.id:null) + " is not defined yet.");
                             	     }
                             	 
                    }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:71:10: list
                    {
                    pushFollow(FOLLOW_list_in_line142);
                    list2=list();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       
                             	     if (list2 != null) {
                             	         mInstance.output(list2);
                             	     }
                             	 
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
        return ;
    }
    // $ANTLR end "line"


    // $ANTLR start "declaration"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:77:1: declaration : ( fluent_decl | fact_decl | action_decl | assignment );
    public final void declaration() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:78:2: ( fluent_decl | fact_decl | action_decl | assignment )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case EOF:
                {
                alt2=3;
                }
                break;
            case ID:
            case 19:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:78:8: fluent_decl
                    {
                    pushFollow(FOLLOW_fluent_decl_in_declaration158);
                    fluent_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:79:14: fact_decl
                    {
                    pushFollow(FOLLOW_fact_decl_in_declaration173);
                    fact_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:80:11: action_decl
                    {
                    pushFollow(FOLLOW_action_decl_in_declaration185);
                    action_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:81:11: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_declaration197);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "declaration"


    // $ANTLR start "block"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:83:1: block : (s= statement | (s= statement )* );
    public final void block() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:84:2: (s= statement | (s= statement )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred7_YAGI_Grammar()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:84:4: s= statement
                    {
                    pushFollow(FOLLOW_statement_in_block217);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:4: (s= statement )*
                    {
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:4: (s= statement )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==EOF) ) {
                            int LA3_1 = input.LA(2);

                            if ( (synpred8_YAGI_Grammar()) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:5: s= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_block227);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    if ( state.backtracking==0 ) {

                    	      		
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // $ANTLR end "block"


    // $ANTLR start "statement"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:89:1: statement : ( action_exec | pick | choose );
    public final void statement() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:2: ( action_exec | pick | choose )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred9_YAGI_Grammar()) ) {
                    alt5=1;
                }
                else if ( (synpred10_YAGI_Grammar()) ) {
                    alt5=2;
                }
                else if ( (true) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:4: action_exec
                    {
                    pushFollow(FOLLOW_action_exec_in_statement242);
                    action_exec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      		    // pretty much execute (and everything that's necessary) the action
                      		    // ...
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:94:5: pick
                    {
                    pushFollow(FOLLOW_pick_in_statement250);
                    pick();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:95:5: choose
                    {
                    pushFollow(FOLLOW_choose_in_statement256);
                    choose();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "statement"


    // $ANTLR start "action_exec"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:97:1: action_exec : ;
    public final void action_exec() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:98:2: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:98:4: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action_exec"


    // $ANTLR start "pick"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:100:1: pick : ;
    public final void pick() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:100:6: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:100:8: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pick"


    // $ANTLR start "choose"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:102:1: choose : ;
    public final void choose() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:102:8: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:102:10: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "choose"


    // $ANTLR start "action_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:104:1: action_decl : ;
    public final void action_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:104:12: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:104:17: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action_decl"


    // $ANTLR start "assignment"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:106:1: assignment : assign ;
    public final void assignment() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:106:11: ( assign )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:106:13: assign
            {
            pushFollow(FOLLOW_assign_in_assignment297);
            assign();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "assignment"


    // $ANTLR start "assign"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:108:1: assign : ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var '=' valexpr | var '+=' valexpr | var '-=' valexpr );
    public final void assign() throws RecognitionException {
        YAGI_GrammarParser.term_return term3 = null;

        YAGI_GrammarParser.setexpr_return setexpr4 = null;

        YAGI_GrammarParser.term_return term5 = null;

        YAGI_GrammarParser.setexpr_return setexpr6 = null;

        YAGI_GrammarParser.term_return term7 = null;

        YAGI_GrammarParser.setexpr_return setexpr8 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:108:8: ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var '=' valexpr | var '+=' valexpr | var '-=' valexpr )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:108:10: term '=' setexpr ';'
                    {
                    pushFollow(FOLLOW_term_in_assign309);
                    term3=term();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_assign311); if (state.failed) return ;
                    pushFollow(FOLLOW_setexpr_in_assign313);
                    setexpr4=setexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign315); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      	if ((term3!=null?term3.exists:false) && (setexpr4!=null?setexpr4.valid:false)) {
                      	    AbstractGlobalModel model = mMemory.getTerm((term3!=null?term3.id:null));
                      	    model.clear();
                      	    model.setSetType((setexpr4!=null?setexpr4.setType:null));
                      	    model.addAll((setexpr4!=null?setexpr4.elems:null));
                      	} else {
                      	    mInstance.output("Error during assignment: ");
                      	    if (!(term3!=null?term3.exists:false)) {
                      	        mInstance.output((term3!=null?term3.error:null));
                      	    } else if (!(setexpr4!=null?setexpr4.valid:false)) {
                      	        mInstance.output((setexpr4!=null?setexpr4.error:null));
                      	    }
                      	}
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:123:5: term '+=' setexpr ';'
                    {
                    pushFollow(FOLLOW_term_in_assign323);
                    term5=term();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,11,FOLLOW_11_in_assign325); if (state.failed) return ;
                    pushFollow(FOLLOW_setexpr_in_assign327);
                    setexpr6=setexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign329); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      	    AbstractGlobalModel model = mMemory.getTerm((term5!=null?term5.id:null));
                          	    // this operation is only permitted if the set types are compatible
                          	    if (model.getSetType() == (setexpr6!=null?setexpr6.setType:null)) {
                          	        model.addAll((setexpr6!=null?setexpr6.elems:null));   
                          	    } else {
                          	        mInstance.output("Types are incompatible. Operation omitted.");
                          	    }
                      	
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:132:5: term '-=' setexpr ';'
                    {
                    pushFollow(FOLLOW_term_in_assign337);
                    term7=term();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,12,FOLLOW_12_in_assign339); if (state.failed) return ;
                    pushFollow(FOLLOW_setexpr_in_assign341);
                    setexpr8=setexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign343); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      	    AbstractGlobalModel model = mMemory.getTerm((term7!=null?term7.id:null));
                          	    // this operation is only permitted if the set types are compatible
                          	    if (model.getSetType() == (setexpr8!=null?setexpr8.setType:null)) {
                          	        model.removeAll((setexpr8!=null?setexpr8.elems:null));   
                          	    } else {
                          	        mInstance.output("Types are incompatible. Operation omitted.");
                          	    }
                      	
                    }

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:145:5: var '=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign356);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_assign358); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign360);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                            
                      	
                    }

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:147:5: var '+=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign368);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,11,FOLLOW_11_in_assign370); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign372);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:148:4: var '-=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign377);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,12,FOLLOW_12_in_assign379); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign381);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "assign"

    public static class term_return extends ParserRuleReturnScope {
        public boolean exists;
        public String output;
        public String error;
        public String id;
    };

    // $ANTLR start "term"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:150:1: term returns [boolean exists, String output, String error, String id] : ID ;
    public final YAGI_GrammarParser.term_return term() throws RecognitionException {
        YAGI_GrammarParser.term_return retval = new YAGI_GrammarParser.term_return();
        retval.start = input.LT(1);

        Token ID9=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:151:2: ( ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:151:4: ID
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_term395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	retval.id = (ID9!=null?ID9.getText():null);
                      retval.exists = true;
              	if (!mMemory.containsTerm((ID9!=null?ID9.getText():null))) {
              	    retval.error = "Term '" + (ID9!=null?ID9.getText():null) + "' is not specified yet.";
              	    retval.exists = false;
              	} else {
              	    retval.output = "Term '" + (ID9!=null?ID9.getText():null) + "' exists.";
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
    // $ANTLR end "term"


    // $ANTLR start "list"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:162:1: list returns [String output] : 'list' list_term ';' ;
    public final String list() throws RecognitionException {
        String output = null;

        String list_term10 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:162:29: ( 'list' list_term ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:163:2: 'list' list_term ';'
            {
            match(input,13,FOLLOW_13_in_list411); if (state.failed) return output;
            pushFollow(FOLLOW_list_term_in_list413);
            list_term10=list_term();

            state._fsp--;
            if (state.failed) return output;
            match(input,10,FOLLOW_10_in_list415); if (state.failed) return output;
            if ( state.backtracking==0 ) {
               output = list_term10; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return output;
    }
    // $ANTLR end "list"


    // $ANTLR start "list_term"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:165:1: list_term returns [String output] : ( 'fluents' | 'facts' );
    public final String list_term() throws RecognitionException {
        String output = null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:165:35: ( 'fluents' | 'facts' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return output;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:166:2: 'fluents'
                    {
                    match(input,14,FOLLOW_14_in_list_term434); if (state.failed) return output;
                    if ( state.backtracking==0 ) {

                      	    output = mMemory.listTerm(TermType.FLUENT);
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:170:2: 'facts'
                    {
                    match(input,15,FOLLOW_15_in_list_term443); if (state.failed) return output;
                    if ( state.backtracking==0 ) {

                      	    output = mMemory.listTerm(TermType.FACT);
                      	
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
        return output;
    }
    // $ANTLR end "list_term"

    public static class setexpr_return extends ParserRuleReturnScope {
        public List<SetItem> elems;
        public SetType setType;
        public boolean valid;
        public String error;
    };

    // $ANTLR start "setexpr"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:177:1: setexpr returns [List<SetItem> elems, SetType setType, boolean valid, String error] : set ;
    public final YAGI_GrammarParser.setexpr_return setexpr() throws RecognitionException {
        YAGI_GrammarParser.setexpr_return retval = new YAGI_GrammarParser.setexpr_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.set_return set11 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:177:85: ( set )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:178:2: set
            {
            pushFollow(FOLLOW_set_in_setexpr464);
            set11=set();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.valid = (set11!=null?set11.valid:false);
              	      retval.error = (set11!=null?set11.error:null);
              	      retval.elems = (set11!=null?set11.elems:null);
              	      retval.setType = (set11!=null?set11.setType:null);
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
        public List<SetItem> elems;
        public SetType setType;
        public boolean valid;
        public String error;
    };

    // $ANTLR start "set"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:183:1: set returns [List<SetItem> elems, SetType setType, boolean valid, String error] : ( '{' a= value ( ',' b= value )* '}' | t= term );
    public final YAGI_GrammarParser.set_return set() throws RecognitionException {
        YAGI_GrammarParser.set_return retval = new YAGI_GrammarParser.set_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.value_return a = null;

        YAGI_GrammarParser.value_return b = null;

        YAGI_GrammarParser.term_return t = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:183:81: ( '{' a= value ( ',' b= value )* '}' | t= term )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:184:2: '{' a= value ( ',' b= value )* '}'
                    {
                    match(input,16,FOLLOW_16_in_set480); if (state.failed) return retval;
                    pushFollow(FOLLOW_value_in_set484);
                    a=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      	    retval.elems = new ArrayList<SetItem>();
                      	    SetItem item = new SetItem((a!=null?a.v:null));
                      	    retval.elems.add(item);
                      	    retval.setType = (a!=null?a.type:null);
                      	    retval.valid = true;
                      	
                    }
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:191:2: ( ',' b= value )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:191:3: ',' b= value
                    	    {
                    	    match(input,17,FOLLOW_17_in_set490); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_value_in_set494);
                    	    b=value();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {

                    	      	    SetItem item = new SetItem((b!=null?b.v:null));
                    	      	    retval.elems.add(item);
                    	      	
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_set501); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:195:4: t= term
                    {
                    pushFollow(FOLLOW_term_in_set508);
                    t=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      	    retval.valid = (t!=null?t.exists:false);
                      	    if (retval.valid) {
                      	        AbstractGlobalModel term = mMemory.getTerm((t!=null?t.id:null));
                      	        retval.elems = new ArrayList<SetItem>();
                      	        for (SetItem item : term.getValues()) {
                      	            retval.elems.add(item);
                      	        }
                      	        retval.setType = term.getSetType();
                      	    } else {
                      	        retval.error = (t!=null?t.error:null);
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
    // $ANTLR end "set"

    public static class value_return extends ParserRuleReturnScope {
        public SetType type;
        public String v;
    };

    // $ANTLR start "value"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:209:1: value returns [SetType type, String v] : ( INT | STRING | var );
    public final YAGI_GrammarParser.value_return value() throws RecognitionException {
        YAGI_GrammarParser.value_return retval = new YAGI_GrammarParser.value_return();
        retval.start = input.LT(1);

        Token INT12=null;
        Token STRING13=null;
        YAGI_GrammarParser.var_return var14 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:210:2: ( INT | STRING | var )
            int alt10=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt10=1;
                }
                break;
            case STRING:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:210:4: INT
                    {
                    INT12=(Token)match(input,INT,FOLLOW_INT_in_value524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (INT12!=null?INT12.getText():null);
                      			 retval.type = SetType.INT;
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:212:4: STRING
                    {
                    STRING13=(Token)match(input,STRING,FOLLOW_STRING_in_value531); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (STRING13!=null?STRING13.getText():null);
                      			 retval.type = SetType.STRING;
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:214:4: var
                    {
                    pushFollow(FOLLOW_var_in_value539);
                    var14=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (var14!=null?var14.id:null);
                      			 retval.type = (var14!=null?var14.setType:null);
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
    // $ANTLR end "value"

    public static class var_return extends ParserRuleReturnScope {
        public String id;
        public SetType setType;
    };

    // $ANTLR start "var"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:217:1: var returns [String id, SetType setType] : '$' ID ;
    public final YAGI_GrammarParser.var_return var() throws RecognitionException {
        YAGI_GrammarParser.var_return retval = new YAGI_GrammarParser.var_return();
        retval.start = input.LT(1);

        Token ID15=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:218:2: ( '$' ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:218:4: '$' ID
            {
            match(input,19,FOLLOW_19_in_var559); if (state.failed) return retval;
            ID15=(Token)match(input,ID,FOLLOW_ID_in_var561); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	    retval.id = (ID15!=null?ID15.getText():null);
              	    retval.setType = SetType.UNDEFINED;
              	
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
    // $ANTLR end "var"

    public static class valexpr_return extends ParserRuleReturnScope {
        public String v;
        public SetType setType;
    };

    // $ANTLR start "valexpr"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:223:1: valexpr returns [String v, SetType setType] : value ;
    public final YAGI_GrammarParser.valexpr_return valexpr() throws RecognitionException {
        YAGI_GrammarParser.valexpr_return retval = new YAGI_GrammarParser.valexpr_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.value_return value16 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:224:2: ( value )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:228:2: value
            {
            pushFollow(FOLLOW_value_in_valexpr583);
            value16=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	    retval.v = (value16!=null?value16.v:null);
              	    retval.setType = (value16!=null?value16.type:null);
              	
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


    // $ANTLR start "fluent_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:233:1: fluent_decl : 'fluent' ID ';' ;
    public final void fluent_decl() throws RecognitionException {
        Token ID17=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:233:12: ( 'fluent' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:233:15: 'fluent' ID ';'
            {
            match(input,20,FOLLOW_20_in_fluent_decl594); if (state.failed) return ;
            ID17=(Token)match(input,ID,FOLLOW_ID_in_fluent_decl596); if (state.failed) return ;
            match(input,10,FOLLOW_10_in_fluent_decl598); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               
              	Fluent fluent = new Fluent((ID17!=null?ID17.getText():null), TermType.FLUENT);
              	try {
              	    mMemory.addFluent(fluent); 
              	} catch (InvalidModelException e) {
              	    e.printStackTrace();	
              	} catch (TermAlreadyDeclaredException e) {
              	    e.printStackTrace();
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
        return ;
    }
    // $ANTLR end "fluent_decl"


    // $ANTLR start "fact_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:244:1: fact_decl : 'fact' ID ';' ;
    public final void fact_decl() throws RecognitionException {
        Token ID18=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:244:10: ( 'fact' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:244:13: 'fact' ID ';'
            {
            match(input,21,FOLLOW_21_in_fact_decl609); if (state.failed) return ;
            ID18=(Token)match(input,ID,FOLLOW_ID_in_fact_decl611); if (state.failed) return ;
            match(input,10,FOLLOW_10_in_fact_decl613); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               
              	Fact fact = new Fact((ID18!=null?ID18.getText():null), TermType.FACT);
              	try {
              	    mMemory.addFact(fact); 
              	} catch (InvalidModelException e) {
              	    e.printStackTrace();	
              	} catch (TermAlreadyDeclaredException e) {
              	    mInstance.output("Error. Term with the id '" + (ID18!=null?ID18.getText():null) + "' is already defined.");
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
        return ;
    }
    // $ANTLR end "fact_decl"

    // $ANTLR start synpred1_YAGI_Grammar
    public final void synpred1_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:50:10: ( declaration )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:50:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred1_YAGI_Grammar62);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_YAGI_Grammar

    // $ANTLR start synpred2_YAGI_Grammar
    public final void synpred2_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:52:10: ( block )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:52:10: block
        {
        pushFollow(FOLLOW_block_in_synpred2_YAGI_Grammar84);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_YAGI_Grammar

    // $ANTLR start synpred7_YAGI_Grammar
    public final void synpred7_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:84:4: (s= statement )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:84:4: s= statement
        {
        pushFollow(FOLLOW_statement_in_synpred7_YAGI_Grammar217);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_YAGI_Grammar

    // $ANTLR start synpred8_YAGI_Grammar
    public final void synpred8_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:5: (s= statement )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:5: s= statement
        {
        pushFollow(FOLLOW_statement_in_synpred8_YAGI_Grammar227);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_YAGI_Grammar

    // $ANTLR start synpred9_YAGI_Grammar
    public final void synpred9_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:4: ( action_exec )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:4: action_exec
        {
        pushFollow(FOLLOW_action_exec_in_synpred9_YAGI_Grammar242);
        action_exec();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_YAGI_Grammar

    // $ANTLR start synpred10_YAGI_Grammar
    public final void synpred10_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:94:5: ( pick )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:94:5: pick
        {
        pushFollow(FOLLOW_pick_in_synpred10_YAGI_Grammar250);
        pick();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_YAGI_Grammar

    // Delegated rules

    public final boolean synpred2_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\4\1\11\1\4\3\uffff\1\11\3\uffff";
    static final String DFA6_maxS =
        "\1\23\1\14\1\4\3\uffff\1\14\3\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\1\3\1\2\1\uffff\1\6\1\5\1\4";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\16\uffff\1\2",
            "\1\3\1\uffff\1\5\1\4",
            "\1\6",
            "",
            "",
            "",
            "\1\11\1\uffff\1\10\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "108:1: assign : ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var '=' valexpr | var '+=' valexpr | var '-=' valexpr );";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_line62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_line84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_line142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fluent_decl_in_declaration158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_decl_in_declaration173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_decl_in_declaration185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_declaration197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_exec_in_statement242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_statement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_choose_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assignment297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign309 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assign311 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_setexpr_in_assign313 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign323 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_assign325 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_setexpr_in_assign327 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assign339 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_setexpr_in_assign341 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign356 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assign358 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign368 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_assign370 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign377 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assign379 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_list411 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_list_term_in_list413 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_list415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_list_term434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_list_term443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_setexpr464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_set480 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_value_in_set484 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_set490 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_value_in_set494 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_set501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_set508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_value539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_var559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valexpr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_fluent_decl594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fluent_decl596 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fluent_decl598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_fact_decl609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fact_decl611 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fact_decl613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1_YAGI_Grammar62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred2_YAGI_Grammar84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred7_YAGI_Grammar217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred8_YAGI_Grammar227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_exec_in_synpred9_YAGI_Grammar242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_synpred10_YAGI_Grammar250 = new BitSet(new long[]{0x0000000000000002L});

}