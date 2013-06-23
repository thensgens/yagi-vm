// $ANTLR 3.1.3 May 27, 2013 16:53:35 /home/thens/yagi/yagi-vm/YAGI_Grammar.g 2013-06-23 11:35:23

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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:1: line : ( declaration | block | term | list );
    public final void line() throws RecognitionException {
        YAGI_GrammarParser.term_return term1 = null;

        String list2 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:5: ( declaration | block | term | list )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line62);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:53:10: block
                    {
                    pushFollow(FOLLOW_block_in_line84);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:56:10: term
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
                                  	     // no need for type related conversions here.. just output the
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:72:10: list
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:78:1: declaration : ( fluent_decl | fact_decl | action_decl | assignment );
    public final void declaration() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:79:2: ( fluent_decl | fact_decl | action_decl | assignment )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:79:8: fluent_decl
                    {
                    pushFollow(FOLLOW_fluent_decl_in_declaration158);
                    fluent_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:80:14: fact_decl
                    {
                    pushFollow(FOLLOW_fact_decl_in_declaration173);
                    fact_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:81:11: action_decl
                    {
                    pushFollow(FOLLOW_action_decl_in_declaration185);
                    action_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:82:11: assignment
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:84:1: block : (s= statement | (s= statement )* );
    public final void block() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:85:2: (s= statement | (s= statement )* )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:85:4: s= statement
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:87:4: (s= statement )*
                    {
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:87:4: (s= statement )*
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
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:87:5: s= statement
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:1: statement : ( action_exec | pick | choose );
    public final void statement() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:91:2: ( action_exec | pick | choose )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:91:4: action_exec
                    {
                    pushFollow(FOLLOW_action_exec_in_statement242);
                    action_exec();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      		    // pretty much execute the specified action
                      		    // ...
                      		
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:95:5: pick
                    {
                    pushFollow(FOLLOW_pick_in_statement250);
                    pick();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:96:5: choose
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:98:1: action_exec : ;
    public final void action_exec() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:99:2: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:99:4: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action_exec"


    // $ANTLR start "pick"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:1: pick : ;
    public final void pick() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:6: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:101:8: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pick"


    // $ANTLR start "choose"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:103:1: choose : ;
    public final void choose() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:103:8: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:103:10: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "choose"


    // $ANTLR start "action_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:105:1: action_decl : ;
    public final void action_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:105:12: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:105:17: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action_decl"


    // $ANTLR start "assignment"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:107:1: assignment : assign ;
    public final void assignment() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:107:11: ( assign )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:107:13: assign
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:109:1: assign : ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var '=' valexpr ';' | var '+=' valexpr ';' | var '-=' valexpr ';' );
    public final void assign() throws RecognitionException {
        YAGI_GrammarParser.term_return term3 = null;

        YAGI_GrammarParser.setexpr_return setexpr4 = null;

        YAGI_GrammarParser.term_return term5 = null;

        YAGI_GrammarParser.setexpr_return setexpr6 = null;

        YAGI_GrammarParser.term_return term7 = null;

        YAGI_GrammarParser.setexpr_return setexpr8 = null;

        YAGI_GrammarParser.var_return var9 = null;

        YAGI_GrammarParser.valexpr_return valexpr10 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:109:8: ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var '=' valexpr ';' | var '+=' valexpr ';' | var '-=' valexpr ';' )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:109:10: term '=' setexpr ';'
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:124:5: term '+=' setexpr ';'
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:133:5: term '-=' setexpr ';'
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:147:5: var '=' valexpr ';'
                    {
                    pushFollow(FOLLOW_var_in_assign358);
                    var9=var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_assign360); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign362);
                    valexpr10=valexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign364); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       
                      	    Var newVar = new Var((var9!=null?var9.id:null), (valexpr10!=null?valexpr10.v:null), (valexpr10!=null?valexpr10.setType:null));
                      	    mMemory.addGlobalVar(newVar);       
                      	
                    }

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:151:5: var '+=' valexpr ';'
                    {
                    pushFollow(FOLLOW_var_in_assign372);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,11,FOLLOW_11_in_assign374); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign376);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign378); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:152:4: var '-=' valexpr ';'
                    {
                    pushFollow(FOLLOW_var_in_assign383);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,12,FOLLOW_12_in_assign385); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign387);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign389); if (state.failed) return ;

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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:154:1: term returns [boolean exists, String output, String error, String id] : ID ;
    public final YAGI_GrammarParser.term_return term() throws RecognitionException {
        YAGI_GrammarParser.term_return retval = new YAGI_GrammarParser.term_return();
        retval.start = input.LT(1);

        Token ID11=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:155:2: ( ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:155:4: ID
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_term403); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	retval.id = (ID11!=null?ID11.getText():null);
                      retval.exists = true;
              	if (!mMemory.containsTerm((ID11!=null?ID11.getText():null))) {
              	    retval.error = "Term '" + (ID11!=null?ID11.getText():null) + "' is not specified yet.";
              	    retval.exists = false;
              	} else {
              	    retval.output = "Term '" + (ID11!=null?ID11.getText():null) + "' exists.";
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:166:1: list returns [String output] : 'list' list_term ';' ;
    public final String list() throws RecognitionException {
        String output = null;

        String list_term12 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:166:29: ( 'list' list_term ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:167:2: 'list' list_term ';'
            {
            match(input,13,FOLLOW_13_in_list419); if (state.failed) return output;
            pushFollow(FOLLOW_list_term_in_list421);
            list_term12=list_term();

            state._fsp--;
            if (state.failed) return output;
            match(input,10,FOLLOW_10_in_list423); if (state.failed) return output;
            if ( state.backtracking==0 ) {
               output = list_term12; 
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:169:1: list_term returns [String output] : ( 'fluents' | 'facts' );
    public final String list_term() throws RecognitionException {
        String output = null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:169:35: ( 'fluents' | 'facts' )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:170:2: 'fluents'
                    {
                    match(input,14,FOLLOW_14_in_list_term442); if (state.failed) return output;
                    if ( state.backtracking==0 ) {

                      	    output = mMemory.listTerm(TermType.FLUENT);
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:174:2: 'facts'
                    {
                    match(input,15,FOLLOW_15_in_list_term451); if (state.failed) return output;
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:181:1: setexpr returns [List<SetItem> elems, SetType setType, boolean valid, String error] : set ;
    public final YAGI_GrammarParser.setexpr_return setexpr() throws RecognitionException {
        YAGI_GrammarParser.setexpr_return retval = new YAGI_GrammarParser.setexpr_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.set_return set13 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:181:85: ( set )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:182:2: set
            {
            pushFollow(FOLLOW_set_in_setexpr472);
            set13=set();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.valid = (set13!=null?set13.valid:false);
              	      retval.error = (set13!=null?set13.error:null);
              	      retval.elems = (set13!=null?set13.elems:null);
              	      retval.setType = (set13!=null?set13.setType:null);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:187:1: set returns [List<SetItem> elems, SetType setType, boolean valid, String error] : ( '{' a= value ( ',' b= value )* '}' | t= term );
    public final YAGI_GrammarParser.set_return set() throws RecognitionException {
        YAGI_GrammarParser.set_return retval = new YAGI_GrammarParser.set_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.value_return a = null;

        YAGI_GrammarParser.value_return b = null;

        YAGI_GrammarParser.term_return t = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:187:81: ( '{' a= value ( ',' b= value )* '}' | t= term )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:188:2: '{' a= value ( ',' b= value )* '}'
                    {
                    match(input,16,FOLLOW_16_in_set488); if (state.failed) return retval;
                    pushFollow(FOLLOW_value_in_set492);
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:195:2: ( ',' b= value )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:195:3: ',' b= value
                    	    {
                    	    match(input,17,FOLLOW_17_in_set498); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_value_in_set502);
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

                    match(input,18,FOLLOW_18_in_set509); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:199:4: t= term
                    {
                    pushFollow(FOLLOW_term_in_set516);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:213:1: value returns [SetType type, String v] : ( INT | STRING | var );
    public final YAGI_GrammarParser.value_return value() throws RecognitionException {
        YAGI_GrammarParser.value_return retval = new YAGI_GrammarParser.value_return();
        retval.start = input.LT(1);

        Token INT14=null;
        Token STRING15=null;
        YAGI_GrammarParser.var_return var16 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:214:2: ( INT | STRING | var )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:214:4: INT
                    {
                    INT14=(Token)match(input,INT,FOLLOW_INT_in_value532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (INT14!=null?INT14.getText():null);
                      			 retval.type = SetType.INT;
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:216:4: STRING
                    {
                    STRING15=(Token)match(input,STRING,FOLLOW_STRING_in_value539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (STRING15!=null?STRING15.getText():null);
                      			 retval.type = SetType.STRING;
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:218:4: var
                    {
                    pushFollow(FOLLOW_var_in_value547);
                    var16=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (var16!=null?var16.id:null);
                      			 retval.type = (var16!=null?var16.setType:null);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:221:1: var returns [String id, SetType setType] : '$' ID ;
    public final YAGI_GrammarParser.var_return var() throws RecognitionException {
        YAGI_GrammarParser.var_return retval = new YAGI_GrammarParser.var_return();
        retval.start = input.LT(1);

        Token ID17=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:222:2: ( '$' ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:222:4: '$' ID
            {
            match(input,19,FOLLOW_19_in_var567); if (state.failed) return retval;
            ID17=(Token)match(input,ID,FOLLOW_ID_in_var569); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	    retval.id = (ID17!=null?ID17.getText():null);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:227:1: valexpr returns [String v, SetType setType] : value ;
    public final YAGI_GrammarParser.valexpr_return valexpr() throws RecognitionException {
        YAGI_GrammarParser.valexpr_return retval = new YAGI_GrammarParser.valexpr_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.value_return value18 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:228:2: ( value )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:232:2: value
            {
            pushFollow(FOLLOW_value_in_valexpr591);
            value18=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	    retval.v = (value18!=null?value18.v:null);
              	    retval.setType = (value18!=null?value18.type:null);
              	
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:237:1: fluent_decl : 'fluent' ID ';' ;
    public final void fluent_decl() throws RecognitionException {
        Token ID19=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:237:12: ( 'fluent' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:237:15: 'fluent' ID ';'
            {
            match(input,20,FOLLOW_20_in_fluent_decl602); if (state.failed) return ;
            ID19=(Token)match(input,ID,FOLLOW_ID_in_fluent_decl604); if (state.failed) return ;
            match(input,10,FOLLOW_10_in_fluent_decl606); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               
              	Fluent fluent = new Fluent((ID19!=null?ID19.getText():null), TermType.FLUENT);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:248:1: fact_decl : 'fact' ID ';' ;
    public final void fact_decl() throws RecognitionException {
        Token ID20=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:248:10: ( 'fact' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:248:13: 'fact' ID ';'
            {
            match(input,21,FOLLOW_21_in_fact_decl617); if (state.failed) return ;
            ID20=(Token)match(input,ID,FOLLOW_ID_in_fact_decl619); if (state.failed) return ;
            match(input,10,FOLLOW_10_in_fact_decl621); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               
              	Fact fact = new Fact((ID20!=null?ID20.getText():null), TermType.FACT);
              	try {
              	    mMemory.addFact(fact); 
              	} catch (InvalidModelException e) {
              	    e.printStackTrace();	
              	} catch (TermAlreadyDeclaredException e) {
              	    mInstance.output("Error. Term with the id '" + (ID20!=null?ID20.getText():null) + "' is already defined.");
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
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:10: ( declaration )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:10: declaration
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
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:53:10: ( block )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:53:10: block
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
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:85:4: (s= statement )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:85:4: s= statement
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
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:87:5: (s= statement )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:87:5: s= statement
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
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:91:4: ( action_exec )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:91:4: action_exec
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
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:95:5: ( pick )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:95:5: pick
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
        "\3\uffff\1\3\1\2\1\1\1\uffff\1\4\1\5\1\6";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\16\uffff\1\2",
            "\1\5\1\uffff\1\4\1\3",
            "\1\6",
            "",
            "",
            "",
            "\1\7\1\uffff\1\10\1\11",
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
            return "109:1: assign : ( term '=' setexpr ';' | term '+=' setexpr ';' | term '-=' setexpr ';' | var '=' valexpr ';' | var '+=' valexpr ';' | var '-=' valexpr ';' );";
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
    public static final BitSet FOLLOW_var_in_assign358 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assign360 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign372 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_assign374 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign376 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign383 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assign385 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign387 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_list419 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_list_term_in_list421 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_list423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_list_term442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_list_term451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_setexpr472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_set488 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_value_in_set492 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_set498 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_value_in_set502 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_set509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_set516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_value547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_var567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valexpr591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_fluent_decl602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fluent_decl604 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fluent_decl606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_fact_decl617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fact_decl619 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fact_decl621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1_YAGI_Grammar62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred2_YAGI_Grammar84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred7_YAGI_Grammar217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred8_YAGI_Grammar227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_exec_in_synpred9_YAGI_Grammar242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_synpred10_YAGI_Grammar250 = new BitSet(new long[]{0x0000000000000002L});

}