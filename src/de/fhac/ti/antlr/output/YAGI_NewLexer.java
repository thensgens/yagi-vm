// $ANTLR 3.1.3 May 27, 2013 16:53:35 /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g 2013-06-10 13:28:18
package de.fhac.ti.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class YAGI_NewLexer extends Lexer {
    public static final int T__10=10;
    public static final int WHITESPACE=5;
    public static final int INT=6;
    public static final int ID=4;
    public static final int COMMENT=8;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int STRING=7;

    // delegates
    // delegators

    public YAGI_NewLexer() {;} 
    public YAGI_NewLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public YAGI_NewLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:9:6: ( 'fluent' )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:9:8: 'fluent'
            {
            match("fluent"); 


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
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:10:7: ( 'fact' )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:10:9: 'fact'
            {
            match("fact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:68:11: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:68:13: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:68:13: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:
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
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:70:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:70:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:70:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:
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
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:72:4: ( ( '0' .. '9' )+ )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:72:7: ( '0' .. '9' )+
            {
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:72:7: ( '0' .. '9' )+
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
            	    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:72:7: '0' .. '9'
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
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:74:7: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:74:10: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:74:14: (~ ( '\\\\' | '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:74:16: ~ ( '\\\\' | '\"' )
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
            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:76:8: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:76:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:76:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:76:16: ~ ( '\\n' | '\\r' )
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

                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:76:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:76:30: '\\r'
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
                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:78:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:78:12: ( options {greedy=false; } : . )*
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
                    	    // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:78:40: .
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
        // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:8: ( T__9 | T__10 | WHITESPACE | ID | INT | STRING | COMMENT )
        int alt9=7;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:21: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 4 :
                // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:32: ID
                {
                mID(); 

                }
                break;
            case 5 :
                // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:35: INT
                {
                mINT(); 

                }
                break;
            case 6 :
                // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:39: STRING
                {
                mSTRING(); 

                }
                break;
            case 7 :
                // /home/thens/yagi/yagi-modified/src/de/fhac/ti/antlr/YAGI_New.g:1:46: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\3\5\uffff\5\3\1\16\1\3\1\uffff\1\20\1\uffff";
    static final String DFA9_eofS =
        "\21\uffff";
    static final String DFA9_minS =
        "\1\11\1\141\5\uffff\1\165\1\143\1\145\1\164\1\156\1\60\1\164\1\uffff"+
        "\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\172\1\154\5\uffff\1\165\1\143\1\145\1\164\1\156\1\172\1\164\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\7\uffff\1\2\1\uffff\1\1";
    static final String DFA9_specialS =
        "\21\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\2\1\uffff\2\2\22\uffff\1\2\1\uffff\1\5\14\uffff\1\6\12\4"+
            "\7\uffff\32\3\4\uffff\1\3\1\uffff\5\3\1\1\24\3",
            "\1\10\12\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\12\3\7\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
            "\1\17",
            "",
            "\12\3\7\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
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
            return "1:1: Tokens : ( T__9 | T__10 | WHITESPACE | ID | INT | STRING | COMMENT );";
        }
    }
 

}