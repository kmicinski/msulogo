// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogoAST.g 2011-02-16 02:47:17
package org.msu.logocompiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoASTLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int FUNCALL=4;
    public static final int BLOCK=5;
    public static final int WHILE=6;
    public static final int IF=7;
    public static final int COMMAND=8;
    public static final int COMPAREOP=9;
    public static final int TERMOP=10;
    public static final int FACTOROP=11;
    public static final int REFOP=12;
    public static final int ID=13;
    public static final int NUMBER=14;
    public static final int LETTER=15;
    public static final int NEWLINE=16;
    public static final int COMMENT=17;
    public static final int WHITESPACE=18;
    public static final int DIGIT=19;

    // delegates
    // delegators

    public LogoASTLexer() {;} 
    public LogoASTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoASTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "LogoAST.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:3:7: ( '[' )
            // LogoAST.g:3:9: '['
            {
            match('['); 

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
            // LogoAST.g:4:7: ( ']' )
            // LogoAST.g:4:9: ']'
            {
            match(']'); 

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
            // LogoAST.g:5:7: ( '(' )
            // LogoAST.g:5:9: '('
            {
            match('('); 

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
            // LogoAST.g:6:7: ( ')' )
            // LogoAST.g:6:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "COMMAND"
    public final void mCOMMAND() throws RecognitionException {
        try {
            int _type = COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:108:9: ( 'print' | 'make' | 'forward' | 'penup' | 'pendown' | 'color' | 'right' | 'beginfill' | 'endfill' | 'goto' | 'circle' | 'left' )
            int alt1=12;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // LogoAST.g:109:10: 'print'
                    {
                    match("print"); 


                    }
                    break;
                case 2 :
                    // LogoAST.g:110:4: 'make'
                    {
                    match("make"); 


                    }
                    break;
                case 3 :
                    // LogoAST.g:111:6: 'forward'
                    {
                    match("forward"); 


                    }
                    break;
                case 4 :
                    // LogoAST.g:112:6: 'penup'
                    {
                    match("penup"); 


                    }
                    break;
                case 5 :
                    // LogoAST.g:113:6: 'pendown'
                    {
                    match("pendown"); 


                    }
                    break;
                case 6 :
                    // LogoAST.g:114:6: 'color'
                    {
                    match("color"); 


                    }
                    break;
                case 7 :
                    // LogoAST.g:115:6: 'right'
                    {
                    match("right"); 


                    }
                    break;
                case 8 :
                    // LogoAST.g:116:6: 'beginfill'
                    {
                    match("beginfill"); 


                    }
                    break;
                case 9 :
                    // LogoAST.g:117:6: 'endfill'
                    {
                    match("endfill"); 


                    }
                    break;
                case 10 :
                    // LogoAST.g:118:6: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 11 :
                    // LogoAST.g:119:6: 'circle'
                    {
                    match("circle"); 


                    }
                    break;
                case 12 :
                    // LogoAST.g:120:6: 'left'
                    {
                    match("left"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMAND"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // LogoAST.g:122:17: ( 'a' .. 'z' | 'A' .. 'Z' )
            // LogoAST.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "COMPAREOP"
    public final void mCOMPAREOP() throws RecognitionException {
        try {
            int _type = COMPAREOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:127:2: ( '>' | '<' | '>=' | '<=' | '=' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=3;
                }
                else {
                    alt2=1;}
                }
                break;
            case '<':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=2;}
                }
                break;
            case '=':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // LogoAST.g:127:4: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // LogoAST.g:128:4: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // LogoAST.g:129:4: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // LogoAST.g:130:4: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // LogoAST.g:131:4: '='
                    {
                    match('='); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPAREOP"

    // $ANTLR start "TERMOP"
    public final void mTERMOP() throws RecognitionException {
        try {
            int _type = TERMOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:133:8: ( '+' | '-' )
            // LogoAST.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TERMOP"

    // $ANTLR start "REFOP"
    public final void mREFOP() throws RecognitionException {
        try {
            int _type = REFOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:138:7: ( '\"' | ':' )
            // LogoAST.g:
            {
            if ( input.LA(1)=='\"'||input.LA(1)==':' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFOP"

    // $ANTLR start "FACTOROP"
    public final void mFACTOROP() throws RecognitionException {
        try {
            int _type = FACTOROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:142:9: ( '*' | '/' | 'modulo' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt3=1;
                }
                break;
            case '/':
                {
                alt3=2;
                }
                break;
            case 'm':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // LogoAST.g:143:3: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // LogoAST.g:144:4: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // LogoAST.g:145:4: 'modulo'
                    {
                    match("modulo"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FACTOROP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:147:9: ( ';' ( . )* NEWLINE )
            // LogoAST.g:148:9: ';' ( . )* NEWLINE
            {
            match(';'); 
            // LogoAST.g:148:13: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\r') ) {
                    alt4=2;
                }
                else if ( (LA4_0=='\n') ) {
                    alt4=2;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LogoAST.g:148:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            mNEWLINE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:150:7: ( 'while' )
            // LogoAST.g:150:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:152:4: ( 'if' )
            // LogoAST.g:152:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:154:4: ( ( '_' )* LETTER ( LETTER | '_' | NUMBER )* )
            // LogoAST.g:155:9: ( '_' )* LETTER ( LETTER | '_' | NUMBER )*
            {
            // LogoAST.g:155:9: ( '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='_') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // LogoAST.g:155:11: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            mLETTER(); 
            // LogoAST.g:155:25: ( LETTER | '_' | NUMBER )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=1;
                    }
                    break;
                case '_':
                    {
                    alt6=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // LogoAST.g:155:26: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // LogoAST.g:155:35: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // LogoAST.g:155:41: NUMBER
            	    {
            	    mNUMBER(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:157:12: ( ( '\\t' | ' ' )+ )
            // LogoAST.g:158:9: ( '\\t' | ' ' )+
            {
            // LogoAST.g:158:9: ( '\\t' | ' ' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // LogoAST.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:161:9: ( ( '\\r' )? '\\n' )
            // LogoAST.g:162:9: ( '\\r' )? '\\n'
            {
            // LogoAST.g:162:9: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // LogoAST.g:162:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:164:8: ( ( DIGIT )+ )
            // LogoAST.g:165:9: ( DIGIT )+
            {
            // LogoAST.g:165:9: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // LogoAST.g:165:10: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // LogoAST.g:167:16: ( '0' .. '9' )
            // LogoAST.g:167:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // LogoAST.g:1:8: ( T__20 | T__21 | T__22 | T__23 | COMMAND | COMPAREOP | TERMOP | REFOP | FACTOROP | COMMENT | WHILE | IF | ID | WHITESPACE | NEWLINE | NUMBER )
        int alt10=16;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // LogoAST.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // LogoAST.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // LogoAST.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // LogoAST.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // LogoAST.g:1:34: COMMAND
                {
                mCOMMAND(); 

                }
                break;
            case 6 :
                // LogoAST.g:1:42: COMPAREOP
                {
                mCOMPAREOP(); 

                }
                break;
            case 7 :
                // LogoAST.g:1:52: TERMOP
                {
                mTERMOP(); 

                }
                break;
            case 8 :
                // LogoAST.g:1:59: REFOP
                {
                mREFOP(); 

                }
                break;
            case 9 :
                // LogoAST.g:1:65: FACTOROP
                {
                mFACTOROP(); 

                }
                break;
            case 10 :
                // LogoAST.g:1:74: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 11 :
                // LogoAST.g:1:82: WHILE
                {
                mWHILE(); 

                }
                break;
            case 12 :
                // LogoAST.g:1:88: IF
                {
                mIF(); 

                }
                break;
            case 13 :
                // LogoAST.g:1:91: ID
                {
                mID(); 

                }
                break;
            case 14 :
                // LogoAST.g:1:94: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 15 :
                // LogoAST.g:1:105: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 16 :
                // LogoAST.g:1:113: NUMBER
                {
                mNUMBER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA1_eotS =
        "\21\uffff";
    static final String DFA1_eofS =
        "\21\uffff";
    static final String DFA1_minS =
        "\1\142\1\145\2\uffff\1\151\6\uffff\1\156\2\uffff\1\144\2\uffff";
    static final String DFA1_maxS =
        "\2\162\2\uffff\1\157\6\uffff\1\156\2\uffff\1\165\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\7\1\10\1\11\1\12\1\14\1\1\1\uffff\1\6"+
        "\1\13\1\uffff\1\4\1\5";
    static final String DFA1_specialS =
        "\21\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\1\4\1\uffff\1\7\1\3\1\10\4\uffff\1\11\1\2\2\uffff\1\1\1"+
            "\uffff\1\5",
            "\1\13\14\uffff\1\12",
            "",
            "",
            "\1\15\5\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "",
            "",
            "\1\20\20\uffff\1\17",
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
            return "108:1: COMMAND : ( 'print' | 'make' | 'forward' | 'penup' | 'pendown' | 'color' | 'right' | 'beginfill' | 'endfill' | 'goto' | 'circle' | 'left' );";
        }
    }
    static final String DFA10_eotS =
        "\5\uffff\11\25\5\uffff\2\25\4\uffff\15\25\1\64\15\25\1\uffff\3\25"+
        "\1\106\7\25\2\106\1\25\2\106\1\25\1\uffff\2\25\1\106\1\25\1\106"+
        "\2\25\1\125\1\25\1\21\1\25\1\106\2\25\1\uffff\2\106\1\25\1\106\1"+
        "\25\1\106";
    static final String DFA10_eofS =
        "\134\uffff";
    static final String DFA10_minS =
        "\1\11\4\uffff\1\145\1\141\1\157\2\151\1\145\1\156\1\157\1\145\5"+
        "\uffff\1\150\1\146\4\uffff\1\151\1\156\1\153\1\144\1\162\1\154\1"+
        "\162\2\147\1\144\1\164\1\146\1\151\1\60\1\156\1\144\1\145\1\165"+
        "\1\167\1\157\1\143\1\150\1\151\1\146\1\157\1\164\1\154\1\uffff\1"+
        "\164\1\160\1\157\1\60\1\154\1\141\1\162\1\154\1\164\1\156\1\151"+
        "\2\60\1\145\2\60\1\167\1\uffff\1\157\1\162\1\60\1\145\1\60\1\146"+
        "\1\154\1\60\1\156\1\60\1\144\1\60\1\151\1\154\1\uffff\2\60\1\154"+
        "\1\60\1\154\1\60";
    static final String DFA10_maxS =
        "\1\172\4\uffff\1\162\3\157\1\151\1\145\1\156\1\157\1\145\5\uffff"+
        "\1\150\1\146\4\uffff\1\151\1\156\1\153\1\144\1\162\1\154\1\162\2"+
        "\147\1\144\1\164\1\146\1\151\1\172\1\156\1\165\1\145\1\165\1\167"+
        "\1\157\1\143\1\150\1\151\1\146\1\157\1\164\1\154\1\uffff\1\164\1"+
        "\160\1\157\1\172\1\154\1\141\1\162\1\154\1\164\1\156\1\151\2\172"+
        "\1\145\2\172\1\167\1\uffff\1\157\1\162\1\172\1\145\1\172\1\146\1"+
        "\154\1\172\1\156\1\172\1\144\1\172\1\151\1\154\1\uffff\2\172\1\154"+
        "\1\172\1\154\1\172";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\11\uffff\1\6\1\7\1\10\1\11\1\12\2\uffff"+
        "\1\15\1\16\1\17\1\20\33\uffff\1\14\21\uffff\1\5\16\uffff\1\13\6"+
        "\uffff";
    static final String DFA10_specialS =
        "\134\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\26\1\27\2\uffff\1\27\22\uffff\1\26\1\uffff\1\20\5\uffff\1"+
            "\3\1\4\1\21\1\17\1\uffff\1\17\1\uffff\1\21\12\30\1\20\1\22\3"+
            "\16\2\uffff\32\25\1\1\1\uffff\1\2\1\uffff\1\25\1\uffff\1\25"+
            "\1\12\1\10\1\25\1\13\1\7\1\14\1\25\1\24\2\25\1\15\1\6\2\25\1"+
            "\5\1\25\1\11\4\25\1\23\3\25",
            "",
            "",
            "",
            "",
            "\1\32\14\uffff\1\31",
            "\1\33\15\uffff\1\34",
            "\1\35",
            "\1\37\5\uffff\1\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\65",
            "\1\67\20\uffff\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\116",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\122",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\123",
            "\1\124",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\126",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\127",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\130",
            "\1\131",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\132",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\133",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | COMMAND | COMPAREOP | TERMOP | REFOP | FACTOROP | COMMENT | WHILE | IF | ID | WHITESPACE | NEWLINE | NUMBER );";
        }
    }
 

}