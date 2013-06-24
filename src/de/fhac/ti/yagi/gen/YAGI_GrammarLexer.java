// $ANTLR 3.4 /home/thens/yagi/yagi-vm/YAGI_Grammar.g 2013-06-24 18:03:53
package de.fhac.ti.yagi.gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class YAGI_GrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int COMMENT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int STRING=7;
    public static final int WHITESPACE=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public YAGI_GrammarLexer() {} 
    public YAGI_GrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public YAGI_GrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/thens/yagi/yagi-vm/YAGI_Grammar.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:9:6: ( '!=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:9:8: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:10:7: ( '$' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:10:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:11:7: ( '(' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:12:7: ( ')' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:13:7: ( '+=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:13:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:14:7: ( ',' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:15:7: ( '-=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:15:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:16:7: ( ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:17:7: ( '<' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:17:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:18:7: ( '<=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:18:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:19:7: ( '=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:20:7: ( '==' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:20:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:21:7: ( '>' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:22:7: ( '>=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:22:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:23:7: ( 'action' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:23:9: 'action'
            {
            match("action"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:24:7: ( 'actions' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:24:9: 'actions'
            {
            match("actions"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:25:7: ( 'and' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:25:9: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:26:7: ( 'effect:' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:26:9: 'effect:'
            {
            match("effect:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:27:7: ( 'end action' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:27:9: 'end action'
            {
            match("end action"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:28:7: ( 'fact' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:28:9: 'fact'
            {
            match("fact"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:29:7: ( 'facts' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:29:9: 'facts'
            {
            match("facts"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:30:7: ( 'false' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:30:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:31:7: ( 'fluent' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:31:9: 'fluent'
            {
            match("fluent"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:32:7: ( 'fluents' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:32:9: 'fluents'
            {
            match("fluents"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:33:7: ( 'in' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:33:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:34:7: ( 'list' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:34:9: 'list'
            {
            match("list"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:35:7: ( 'not' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:35:9: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:36:7: ( 'or' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:36:9: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:37:7: ( 'precondition:' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:37:9: 'precondition:'
            {
            match("precondition:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:38:7: ( 'signal:' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:38:9: 'signal:'
            {
            match("signal:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:39:7: ( 'true' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:39:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:40:7: ( '{' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:41:7: ( '}' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:41:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:500:11: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:500:13: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:500:13: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:502:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:502:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:502:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:504:4: ( ( '0' .. '9' )+ )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:504:13: ( '0' .. '9' )+
            {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:504:13: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:506:7: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:506:13: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:506:17: (~ ( '\\\\' | '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:508:8: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:508:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:508:18: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:508:32: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:508:32: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:510:13: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:510:18: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:510:46: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | WHITESPACE | ID | INT | STRING | COMMENT )
        int alt9=38;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:135: T__30
                {
                mT__30(); 


                }
                break;
            case 23 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:141: T__31
                {
                mT__31(); 


                }
                break;
            case 24 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:147: T__32
                {
                mT__32(); 


                }
                break;
            case 25 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:153: T__33
                {
                mT__33(); 


                }
                break;
            case 26 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:159: T__34
                {
                mT__34(); 


                }
                break;
            case 27 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:165: T__35
                {
                mT__35(); 


                }
                break;
            case 28 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:171: T__36
                {
                mT__36(); 


                }
                break;
            case 29 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:177: T__37
                {
                mT__37(); 


                }
                break;
            case 30 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:183: T__38
                {
                mT__38(); 


                }
                break;
            case 31 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:189: T__39
                {
                mT__39(); 


                }
                break;
            case 32 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:195: T__40
                {
                mT__40(); 


                }
                break;
            case 33 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:201: T__41
                {
                mT__41(); 


                }
                break;
            case 34 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:207: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 35 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:218: ID
                {
                mID(); 


                }
                break;
            case 36 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:221: INT
                {
                mINT(); 


                }
                break;
            case 37 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:225: STRING
                {
                mSTRING(); 


                }
                break;
            case 38 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:232: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\11\uffff\1\36\1\40\1\42\12\31\15\uffff\6\31\1\67\2\31\1\72\4\31"+
        "\1\77\5\31\1\uffff\1\31\1\106\1\uffff\4\31\1\uffff\1\31\1\uffff"+
        "\1\115\2\31\1\120\1\uffff\2\31\1\123\2\31\1\126\1\uffff\1\127\1"+
        "\31\1\uffff\2\31\1\uffff\1\134\1\31\2\uffff\1\137\2\31\1\142\2\uffff"+
        "\1\143\1\uffff\1\31\3\uffff\5\31\1\uffff";
    static final String DFA9_eofS =
        "\152\uffff";
    static final String DFA9_minS =
        "\1\11\10\uffff\3\75\1\143\1\146\1\141\1\156\1\151\1\157\2\162\1"+
        "\151\1\162\15\uffff\1\164\1\144\1\146\1\144\1\143\1\165\1\60\1\163"+
        "\1\164\1\60\1\145\1\147\1\165\1\151\1\60\1\145\1\40\1\164\1\163"+
        "\1\145\1\uffff\1\164\1\60\1\uffff\1\143\1\156\1\145\1\157\1\uffff"+
        "\1\143\1\uffff\1\60\1\145\1\156\1\60\1\uffff\1\157\1\141\1\60\1"+
        "\156\1\164\1\60\1\uffff\1\60\1\164\1\uffff\1\156\1\154\1\uffff\1"+
        "\60\1\72\2\uffff\1\60\1\144\1\72\1\60\2\uffff\1\60\1\uffff\1\151"+
        "\3\uffff\1\164\1\151\1\157\1\156\1\72\1\uffff";
    static final String DFA9_maxS =
        "\1\175\10\uffff\3\75\2\156\1\154\1\156\1\151\1\157\2\162\1\151\1"+
        "\162\15\uffff\1\164\1\144\1\146\1\144\1\154\1\165\1\172\1\163\1"+
        "\164\1\172\1\145\1\147\1\165\1\151\1\172\1\145\1\40\1\164\1\163"+
        "\1\145\1\uffff\1\164\1\172\1\uffff\1\143\1\156\1\145\1\157\1\uffff"+
        "\1\143\1\uffff\1\172\1\145\1\156\1\172\1\uffff\1\157\1\141\1\172"+
        "\1\156\1\164\1\172\1\uffff\1\172\1\164\1\uffff\1\156\1\154\1\uffff"+
        "\1\172\1\72\2\uffff\1\172\1\144\1\72\1\172\2\uffff\1\172\1\uffff"+
        "\1\151\3\uffff\1\164\1\151\1\157\1\156\1\72\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\15\uffff\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\1\46\1\12\1\11\1\14\1\13\1\16\1\15\24\uffff\1\31"+
        "\2\uffff\1\34\4\uffff\1\21\1\uffff\1\23\4\uffff\1\33\6\uffff\1\24"+
        "\2\uffff\1\32\2\uffff\1\37\2\uffff\1\25\1\26\4\uffff\1\17\1\22\1"+
        "\uffff\1\27\1\uffff\1\36\1\20\1\30\5\uffff\1\35";
    static final String DFA9_specialS =
        "\152\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\30\1\uffff\2\30\22\uffff\1\30\1\1\1\33\1\uffff\1\2\3\uffff"+
            "\1\3\1\4\1\uffff\1\5\1\6\1\7\1\uffff\1\34\12\32\1\uffff\1\10"+
            "\1\11\1\12\1\13\2\uffff\32\31\4\uffff\1\31\1\uffff\1\14\3\31"+
            "\1\15\1\16\2\31\1\17\2\31\1\20\1\31\1\21\1\22\1\23\2\31\1\24"+
            "\1\25\6\31\1\26\1\uffff\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\37",
            "\1\41",
            "\1\43\12\uffff\1\44",
            "\1\45\7\uffff\1\46",
            "\1\47\12\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\10\uffff\1\65",
            "\1\66",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\70",
            "\1\71",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\114\7\31",
            "\1\116",
            "\1\117",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\121",
            "\1\122",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\124",
            "\1\125",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\133\7\31",
            "\1\135",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31\1\136\7\31",
            "\1\140",
            "\1\141",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\144",
            "",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | WHITESPACE | ID | INT | STRING | COMMENT );";
        }
    }
 

}