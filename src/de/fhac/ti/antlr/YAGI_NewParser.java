// $ANTLR 3.1.3 May 27, 2013 16:53:35 /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g 2013-06-10 13:45:38

  package de.fhac.ti.antlr;
  
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
public class YAGI_NewParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WHITESPACE", "INT", "STRING", "COMMENT", "'fluent'", "'fact'"
    };
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


        public YAGI_NewParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public YAGI_NewParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return YAGI_NewParser.tokenNames; }
    public String getGrammarFileName() { return "/home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g"; }


    	Map<String,Integer> fluents, actions;
    	HashSet<String> localvars,argvars;
    	Logger LOGGER;
    	
     	public YAGI_NewParser(Map fluents, Map actions, TokenStream input, Logger LOGGER) 
     		throws Exception
     	{
            this(input, new RecognizerSharedState());
            this.fluents = fluents;
            this.actions = actions;
            this.LOGGER = LOGGER;
            localvars = new HashSet<String>();
            argvars = new HashSet<String>();
        	}  



    // $ANTLR start "line"
    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:45:1: line : ( declaration | block );
    public final void line() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:45:6: ( declaration | block )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=9 && LA1_0<=10)) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:45:8: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line59);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println("in line grammar rule...");
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:47:3: block
                    {
                    pushFollow(FOLLOW_block_in_line69);
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
    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:50:1: declaration : ( fluent_decl | fact_decl );
    public final void declaration() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:50:12: ( fluent_decl | fact_decl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            else if ( (LA2_0==10) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:50:14: fluent_decl
                    {
                    pushFollow(FOLLOW_fluent_decl_in_declaration86);
                    fluent_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println("in declaration grammar rule...");
                    }

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:52:3: fact_decl
                    {
                    pushFollow(FOLLOW_fact_decl_in_declaration97);
                    fact_decl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      System.out.println("in declaration grammar rule...");
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
    // $ANTLR end "declaration"


    // $ANTLR start "block"
    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:55:1: block : ;
    public final void block() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:55:6: ()
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:55:9: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "fluent_decl"
    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:58:1: fluent_decl : 'fluent' ID ;
    public final void fluent_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:58:12: ( 'fluent' ID )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:58:14: 'fluent' ID
            {
            match(input,9,FOLLOW_9_in_fluent_decl119); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_fluent_decl121); if (state.failed) return ;
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
    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:61:1: fact_decl : 'fact' ID ;
    public final void fact_decl() throws RecognitionException {
        try {
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:61:10: ( 'fact' ID )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:61:12: 'fact' ID
            {
            match(input,10,FOLLOW_10_in_fact_decl132); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_fact_decl134); if (state.failed) return ;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_line59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_line69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fluent_decl_in_declaration86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_decl_in_declaration97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_fluent_decl119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fluent_decl121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_fact_decl132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fact_decl134 = new BitSet(new long[]{0x0000000000000002L});

}