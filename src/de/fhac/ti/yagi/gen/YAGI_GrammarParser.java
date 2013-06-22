// $ANTLR 3.1.3 May 27, 2013 16:53:35 /home/thens/yagi/yagi-vm/YAGI_Grammar.g 2013-06-22 21:20:46

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
    import de.fhac.ti.yagi.vm.memory.models.AbstractGlobalModel.SetType;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "STRING", "WHITESPACE", "COMMENT", "'='", "'+='", "'-='", "'list'", "';'", "'fluents'", "'facts'", "'{'", "','", "'}'", "'$'", "'+'", "'-'", "'fluent'", "'fact'"
    };
    public static final int T__23=23;
    public static final int T__22=22;
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



    // $ANTLR start "declaration"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:1: declaration : ( fluent_decl | fact_decl | action_decl | assignment );
    public final void declaration() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:12: ( fluent_decl | fact_decl | action_decl | assignment )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case EOF:
                {
                alt1=3;
                }
                break;
            case ID:
            case 19:
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:17: fluent_decl
                    {
                    pushFollow(FOLLOW_fluent_decl_in_declaration63);
                    fluent_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:53:9: fact_decl
                    {
                    pushFollow(FOLLOW_fact_decl_in_declaration86);
                    fact_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:55:9: action_decl
                    {
                    pushFollow(FOLLOW_action_decl_in_declaration107);
                    action_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:57:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_declaration127);
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


    // $ANTLR start "line"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:58:1: line : ( declaration | block | term | list );
    public final void line() throws RecognitionException {
        YAGI_GrammarParser.term_return term1 = null;

        String list2 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:58:5: ( declaration | block | term | list )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 19:
            case 22:
            case 23:
                {
                alt2=1;
                }
                break;
            case EOF:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred4_YAGI_Grammar()) ) {
                    alt2=1;
                }
                else if ( (synpred5_YAGI_Grammar()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=9 && LA2_3<=11)) ) {
                    alt2=1;
                }
                else if ( (LA2_3==EOF) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 12:
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:58:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line137);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:60:10: block
                    {
                    pushFollow(FOLLOW_block_in_line159);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:63:10: term
                    {
                    pushFollow(FOLLOW_term_in_line192);
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:79:10: list
                    {
                    pushFollow(FOLLOW_list_in_line217);
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


    // $ANTLR start "block"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:1: block : ;
    public final void block() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:6: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:86:13: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "action_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:88:1: action_decl : ;
    public final void action_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:88:12: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:88:17: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action_decl"


    // $ANTLR start "assignment"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:1: assignment : assign ;
    public final void assignment() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:11: ( assign )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:90:13: assign
            {
            pushFollow(FOLLOW_assign_in_assignment256);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:92:1: assign : ( term '=' setexpr | term '+=' setexpr | term '-=' setexpr | var '=' valexpr | var '+=' valexpr );
    public final void assign() throws RecognitionException {
        YAGI_GrammarParser.term_return term3 = null;

        YAGI_GrammarParser.setexpr_return setexpr4 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:92:8: ( term '=' setexpr | term '+=' setexpr | term '-=' setexpr | var '=' valexpr | var '+=' valexpr )
            int alt3=5;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                switch ( input.LA(2) ) {
                case 9:
                    {
                    alt3=1;
                    }
                    break;
                case 11:
                    {
                    alt3=3;
                    }
                    break;
                case 10:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==19) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==ID) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==9) ) {
                        alt3=4;
                    }
                    else if ( (LA3_6==10) ) {
                        alt3=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:92:10: term '=' setexpr
                    {
                    pushFollow(FOLLOW_term_in_assign268);
                    term3=term();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_assign270); if (state.failed) return ;
                    pushFollow(FOLLOW_setexpr_in_assign272);
                    setexpr4=setexpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      	if ((term3!=null?term3.exists:false) && (setexpr4!=null?setexpr4.valid:false)) {
                      	    AbstractGlobalModel model = mMemory.getTerm((term3!=null?term3.id:null));
                      	    model.clear();
                      	    model.setSetType((setexpr4!=null?setexpr4.setType:null));
                      	    model.addAll((setexpr4!=null?setexpr4.elems:null));
                      	} else {
                      	    mInstance.output("Error during assignment. ");
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:107:5: term '+=' setexpr
                    {
                    pushFollow(FOLLOW_term_in_assign280);
                    term();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign282); if (state.failed) return ;
                    pushFollow(FOLLOW_setexpr_in_assign284);
                    setexpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:108:5: term '-=' setexpr
                    {
                    pushFollow(FOLLOW_term_in_assign290);
                    term();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,11,FOLLOW_11_in_assign292); if (state.failed) return ;
                    pushFollow(FOLLOW_setexpr_in_assign294);
                    setexpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:109:5: var '=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign300);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_assign303); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign305);
                    valexpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:110:5: var '+=' valexpr
                    {
                    pushFollow(FOLLOW_var_in_assign311);
                    var();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_assign313); if (state.failed) return ;
                    pushFollow(FOLLOW_valexpr_in_assign315);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:112:1: term returns [boolean exists, String output, String error, String id] : ID ;
    public final YAGI_GrammarParser.term_return term() throws RecognitionException {
        YAGI_GrammarParser.term_return retval = new YAGI_GrammarParser.term_return();
        retval.start = input.LT(1);

        Token ID5=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:113:2: ( ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:113:4: ID
            {
            ID5=(Token)match(input,ID,FOLLOW_ID_in_term329); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

              	retval.id = (ID5!=null?ID5.getText():null);
                      retval.exists = true;
              	if (!mMemory.containsTerm((ID5!=null?ID5.getText():null))) {
              	    retval.error = "Term '" + (ID5!=null?ID5.getText():null) + "' is not specified yet.";
              	    retval.exists = false;
              	} else {
              	    retval.output = "Term '" + (ID5!=null?ID5.getText():null) + "' exists.";
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:124:1: list returns [String output] : 'list' list_term ';' ;
    public final String list() throws RecognitionException {
        String output = null;

        String list_term6 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:124:29: ( 'list' list_term ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:125:2: 'list' list_term ';'
            {
            match(input,12,FOLLOW_12_in_list345); if (state.failed) return output;
            pushFollow(FOLLOW_list_term_in_list347);
            list_term6=list_term();

            state._fsp--;
            if (state.failed) return output;
            match(input,13,FOLLOW_13_in_list349); if (state.failed) return output;
            if ( state.backtracking==0 ) {
               output = list_term6; 
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:127:1: list_term returns [String output] : ( 'fluents' | 'facts' );
    public final String list_term() throws RecognitionException {
        String output = null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:127:35: ( 'fluents' | 'facts' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return output;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:128:2: 'fluents'
                    {
                    match(input,14,FOLLOW_14_in_list_term368); if (state.failed) return output;
                    if ( state.backtracking==0 ) {

                      	    output = mMemory.listTerm(TermType.FLUENT);
                      	
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:132:2: 'facts'
                    {
                    match(input,15,FOLLOW_15_in_list_term377); if (state.failed) return output;
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:139:1: setexpr returns [List<SetItem> elems, SetType setType, boolean valid, String error] : set ;
    public final YAGI_GrammarParser.setexpr_return setexpr() throws RecognitionException {
        YAGI_GrammarParser.setexpr_return retval = new YAGI_GrammarParser.setexpr_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.set_return set7 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:139:85: ( set )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:140:2: set
            {
            pushFollow(FOLLOW_set_in_setexpr398);
            set7=set();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.valid = (set7!=null?set7.valid:false);
              	      retval.error = (set7!=null?set7.error:null);
              	      retval.elems = (set7!=null?set7.elems:null);
              	      retval.setType = (set7!=null?set7.setType:null);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:145:1: set returns [List<SetItem> elems, SetType setType, boolean valid, String error] : ( '{' a= value ( ',' b= value )* '}' | term );
    public final YAGI_GrammarParser.set_return set() throws RecognitionException {
        YAGI_GrammarParser.set_return retval = new YAGI_GrammarParser.set_return();
        retval.start = input.LT(1);

        YAGI_GrammarParser.value_return a = null;

        YAGI_GrammarParser.value_return b = null;

        YAGI_GrammarParser.term_return term8 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:145:81: ( '{' a= value ( ',' b= value )* '}' | term )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:146:2: '{' a= value ( ',' b= value )* '}'
                    {
                    match(input,16,FOLLOW_16_in_set414); if (state.failed) return retval;
                    pushFollow(FOLLOW_value_in_set418);
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:153:2: ( ',' b= value )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:153:3: ',' b= value
                    	    {
                    	    match(input,17,FOLLOW_17_in_set424); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_value_in_set428);
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
                    	    break loop5;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_set435); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:157:4: term
                    {
                    pushFollow(FOLLOW_term_in_set440);
                    term8=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                      	    retval.valid = (term8!=null?term8.exists:false);
                      	    if (!retval.valid) {
                      	        retval.error = (term8!=null?term8.error:null);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:164:1: value returns [SetType type, String v] : ( INT | STRING | var );
    public final YAGI_GrammarParser.value_return value() throws RecognitionException {
        YAGI_GrammarParser.value_return retval = new YAGI_GrammarParser.value_return();
        retval.start = input.LT(1);

        Token INT9=null;
        Token STRING10=null;
        String var11 = null;


        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:165:2: ( INT | STRING | var )
            int alt7=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt7=1;
                }
                break;
            case STRING:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:165:4: INT
                    {
                    INT9=(Token)match(input,INT,FOLLOW_INT_in_value456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (INT9!=null?INT9.getText():null);
                      			 retval.type = SetType.INT;
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:167:4: STRING
                    {
                    STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_value463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = (STRING10!=null?STRING10.getText():null);
                      			 retval.type = SetType.STRING;
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:169:4: var
                    {
                    pushFollow(FOLLOW_var_in_value471);
                    var11=var();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.v = var11;
                      			 retval.type = SetType.VAR;
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


    // $ANTLR start "var"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:172:1: var returns [String id] : '$' ID ;
    public final String var() throws RecognitionException {
        String id = null;

        Token ID12=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:173:2: ( '$' ID )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:173:4: '$' ID
            {
            match(input,19,FOLLOW_19_in_var491); if (state.failed) return id;
            ID12=(Token)match(input,ID,FOLLOW_ID_in_var493); if (state.failed) return id;
            if ( state.backtracking==0 ) {

              	    id = "FooBar" + (ID12!=null?ID12.getText():null);
              	
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


    // $ANTLR start "valexpr"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:177:1: valexpr : value ( ( '+' | '-' ) value )* ;
    public final void valexpr() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:177:9: ( value ( ( '+' | '-' ) value )* )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:177:11: value ( ( '+' | '-' ) value )*
            {
            pushFollow(FOLLOW_value_in_valexpr504);
            value();

            state._fsp--;
            if (state.failed) return ;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:177:17: ( ( '+' | '-' ) value )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:177:18: ( '+' | '-' ) value
            	    {
            	    if ( (input.LA(1)>=20 && input.LA(1)<=21) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_value_in_valexpr513);
            	    value();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
        return ;
    }
    // $ANTLR end "valexpr"


    // $ANTLR start "fluent_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:179:1: fluent_decl : 'fluent' ID ';' ;
    public final void fluent_decl() throws RecognitionException {
        Token ID13=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:179:12: ( 'fluent' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:179:15: 'fluent' ID ';'
            {
            match(input,22,FOLLOW_22_in_fluent_decl524); if (state.failed) return ;
            ID13=(Token)match(input,ID,FOLLOW_ID_in_fluent_decl526); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_fluent_decl528); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               
              	Fluent fluent = new Fluent((ID13!=null?ID13.getText():null), TermType.FLUENT);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:190:1: fact_decl : 'fact' ID ';' ;
    public final void fact_decl() throws RecognitionException {
        Token ID14=null;

        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:190:10: ( 'fact' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:190:13: 'fact' ID ';'
            {
            match(input,23,FOLLOW_23_in_fact_decl539); if (state.failed) return ;
            ID14=(Token)match(input,ID,FOLLOW_ID_in_fact_decl541); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_fact_decl543); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               
              	Fact fact = new Fact((ID14!=null?ID14.getText():null), TermType.FACT);
              	try {
              	    mMemory.addFact(fact); 
              	} catch (InvalidModelException e) {
              	    e.printStackTrace();	
              	} catch (TermAlreadyDeclaredException e) {
              	    mInstance.output("Error. Term with the id '" + (ID14!=null?ID14.getText():null) + "' is already defined.");
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

    // $ANTLR start synpred4_YAGI_Grammar
    public final void synpred4_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:58:10: ( declaration )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:58:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred4_YAGI_Grammar137);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_YAGI_Grammar

    // $ANTLR start synpred5_YAGI_Grammar
    public final void synpred5_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:60:10: ( block )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:60:10: block
        {
        pushFollow(FOLLOW_block_in_synpred5_YAGI_Grammar159);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_YAGI_Grammar

    // Delegated rules

    public final boolean synpred4_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_YAGI_Grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_YAGI_Grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_fluent_decl_in_declaration63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_decl_in_declaration86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_decl_in_declaration107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_declaration127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_line137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_line159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_line192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_line217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assignment256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign268 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assign270 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_setexpr_in_assign272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign280 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign282 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_setexpr_in_assign284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_assign290 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_assign292 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_setexpr_in_assign294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign300 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_assign303 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign311 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_assign313 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_valexpr_in_assign315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_list345 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_list_term_in_list347 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_list349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_list_term368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_list_term377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_setexpr398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_set414 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_value_in_set418 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_set424 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_value_in_set428 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_set435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_set440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_value471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_var491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valexpr504 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_set_in_valexpr507 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_value_in_valexpr513 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_22_in_fluent_decl524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fluent_decl526 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_fluent_decl528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_fact_decl539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fact_decl541 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_fact_decl543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred4_YAGI_Grammar137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred5_YAGI_Grammar159 = new BitSet(new long[]{0x0000000000000002L});

}