// $ANTLR 3.1.3 May 27, 2013 21:18:26 /home/thens/yagi/yagi-vm/YAGI_Grammar.g 2013-06-22 10:43:42
package de.fhac.ti.yagi.gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class YAGI_GrammarLexer extends Lexer {
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

    public YAGI_GrammarLexer() {;} 
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
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:9:6: ( '=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:9:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:10:7: ( '+=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:10:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:11:7: ( '-=' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:11:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:12:7: ( 'list' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:12:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:13:7: ( ';' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:14:7: ( 'fluents' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:14:9: 'fluents'
            {
            match("fluents"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:15:7: ( 'facts' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:15:9: 'facts'
            {
            match("facts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:16:7: ( '{' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:17:7: ( ',' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:18:7: ( '}' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:19:7: ( '$' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:19:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:20:7: ( '+' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:21:7: ( '-' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:21:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:22:7: ( 'fluent' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:22:9: 'fluent'
            {
            match("fluent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:23:7: ( 'fact' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:23:9: 'fact'
            {
            match("fact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:195:11: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:195:13: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:195:13: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||(LA1_0>='\f' && LA1_0<='\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:197:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:197:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:197:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:199:4: ( ( '0' .. '9' )+ )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:199:13: ( '0' .. '9' )+
            {
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:199:13: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:199:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:201:7: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:201:13: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:201:17: (~ ( '\\\\' | '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:201:19: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:203:8: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:203:13: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:203:18: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:203:18: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:203:32: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:203:32: '\\r'
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
                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:205:13: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:205:18: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:205:46: .
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
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | WHITESPACE | ID | INT | STRING | COMMENT )
        int alt9=20;
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
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:99: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 17 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:110: ID
                {
                mID(); 

                }
                break;
            case 18 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:113: INT
                {
                mINT(); 

                }
                break;
            case 19 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:117: STRING
                {
                mSTRING(); 

                }
                break;
            case 20 :
                // /home/thens/yagi/yagi-vm/YAGI_Grammar.g:1:124: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\21\1\23\1\14\1\uffff\1\14\15\uffff\6\14\1\35\1\14\1\40"+
        "\1\uffff\1\14\1\42\1\uffff\1\44\1\uffff\1\45\2\uffff";
    static final String DFA9_eofS =
        "\46\uffff";
    static final String DFA9_minS =
        "\1\11\1\uffff\2\75\1\151\1\uffff\1\141\15\uffff\1\163\1\165\1\143"+
        "\1\164\1\145\1\164\1\60\1\156\1\60\1\uffff\1\164\1\60\1\uffff\1"+
        "\60\1\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\175\1\uffff\2\75\1\151\1\uffff\1\154\15\uffff\1\163\1\165\1\143"+
        "\1\164\1\145\1\164\1\172\1\156\1\172\1\uffff\1\164\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\uffff\1\10\1\11\1\12\1\13\1\20\1\21\1"+
        "\22\1\23\1\24\1\2\1\14\1\3\1\15\11\uffff\1\4\2\uffff\1\17\1\uffff"+
        "\1\7\1\uffff\1\16\1\6";
    static final String DFA9_specialS =
        "\46\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\13\1\uffff\2\13\22\uffff\1\13\1\uffff\1\16\1\uffff\1\12\6"+
            "\uffff\1\2\1\10\1\3\1\uffff\1\17\12\15\1\uffff\1\5\1\uffff\1"+
            "\1\3\uffff\32\14\4\uffff\1\14\1\uffff\5\14\1\6\5\14\1\4\16\14"+
            "\1\7\1\uffff\1\11",
            "",
            "\1\20",
            "\1\22",
            "\1\24",
            "",
            "\1\26\12\uffff\1\25",
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
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "\1\36",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\22\14\1\37\7\14",
            "",
            "\1\41",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\22\14\1\43\7\14",
            "",
            "\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | WHITESPACE | ID | INT | STRING | COMMENT );";
        }
    }
 

}