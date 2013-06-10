// $ANTLR 3.1.3 May 27, 2013 16:53:35 /home/thens/yagi/yagi-vm/YAGI_Grammar.g 2013-06-10 23:08:29

  package de.fhac.ti.yagi.gen;
  
    import java.util.HashMap;
    import java.util.Map;
    import java.util.HashSet;
    import java.util.Set;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.logging.Level;
    import java.util.logging.Logger;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class YAGI_GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WHITESPACE", "INT", "STRING", "COMMENT", "'fluent'", "';'", "'fact'"
    };
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int WHITESPACE=5;
    public static final int INT=6;
    public static final int COMMENT=8;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int STRING=7;

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


        Map<String,Integer> fluents, actions;
        HashSet<String> localvars,argvars;
        Logger LOGGER;
        
        public YAGI_GrammarParser(TokenStream input, Logger LOGGER) 
            throws Exception
        {
            this(input, new RecognizerSharedState());
            this.LOGGER = LOGGER;
            localvars = new HashSet<String>();
            argvars = new HashSet<String>();
            }  



    // $ANTLR start "line"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:43:1: line : ( declaration | block );
    public final void line() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:43:5: ( declaration | block )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9||LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                int LA1_2 = input.LA(2);

                if ( (synpred1_YAGI_Grammar()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:43:10: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line61);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println("in line grammar rule...");
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:45:10: block
                    {
                    pushFollow(FOLLOW_block_in_line85);
                    block();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println("in block grammar rule...");
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:47:1: declaration : ( fluent_decl | fact_decl | action_decl | assignment );
    public final void declaration() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:47:12: ( fluent_decl | fact_decl | action_decl | assignment )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case EOF:
                {
                int LA2_3 = input.LA(2);

                if ( (synpred4_YAGI_Grammar()) ) {
                    alt2=3;
                }
                else if ( (true) ) {
                    alt2=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:47:17: fluent_decl
                    {
                    pushFollow(FOLLOW_fluent_decl_in_declaration104);
                    fluent_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println("in declaration grammar rule...");
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:49:9: fact_decl
                    {
                    pushFollow(FOLLOW_fact_decl_in_declaration129);
                    fact_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println("in declaration grammar rule...");
                    }

                    }
                    break;
                case 3 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:9: action_decl
                    {
                    pushFollow(FOLLOW_action_decl_in_declaration154);
                    action_decl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:53:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_declaration174);
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:55:1: block : ;
    public final void block() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:55:6: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:55:13: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "action_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:57:1: action_decl : ;
    public final void action_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:57:12: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:57:17: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "action_decl"


    // $ANTLR start "assignment"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:59:1: assignment : ;
    public final void assignment() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:59:11: ()
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:59:13: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "fluent_decl"
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:61:1: fluent_decl : 'fluent' ID ';' ;
    public final void fluent_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:61:12: ( 'fluent' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:61:18: 'fluent' ID ';'
            {
            match(input,9,FOLLOW_9_in_fluent_decl223); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_fluent_decl225); if (state.failed) return ;
            match(input,10,FOLLOW_10_in_fluent_decl227); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              System.out.println("in fluent_decl grammar rule...");
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
    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:63:1: fact_decl : 'fact' ID ';' ;
    public final void fact_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:63:10: ( 'fact' ID ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:63:14: 'fact' ID ';'
            {
            match(input,11,FOLLOW_11_in_fact_decl239); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_fact_decl241); if (state.failed) return ;
            match(input,10,FOLLOW_10_in_fact_decl243); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              System.out.println("in fact_decl grammar rule...");
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
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:43:10: ( declaration )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:43:10: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred1_YAGI_Grammar61);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_YAGI_Grammar

    // $ANTLR start synpred4_YAGI_Grammar
    public final void synpred4_YAGI_Grammar_fragment() throws RecognitionException {   
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:9: ( action_decl )
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:51:9: action_decl
        {
        pushFollow(FOLLOW_action_decl_in_synpred4_YAGI_Grammar154);
        action_decl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_YAGI_Grammar

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


 

    public static final BitSet FOLLOW_declaration_in_line61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_line85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fluent_decl_in_declaration104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_decl_in_declaration129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_decl_in_declaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_declaration174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_fluent_decl223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fluent_decl225 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fluent_decl227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_fact_decl239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fact_decl241 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_fact_decl243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1_YAGI_Grammar61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_decl_in_synpred4_YAGI_Grammar154 = new BitSet(new long[]{0x0000000000000002L});

}