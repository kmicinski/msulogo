// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogoAST.g 2011-02-23 18:33:07

package org.msu.logocompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoASTLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int FUNCALL=4;
    public static final int FUNCALLSTMT=5;
    public static final int BLOCK=6;
    public static final int SEXPR=7;
    public static final int WHILE=8;
    public static final int IF=9;
    public static final int IFELSE=10;
    public static final int COMMAND=11;
    public static final int COMPAREOP=12;
    public static final int TERMOP=13;
    public static final int FACTOROP=14;
    public static final int REFOP=15;
    public static final int ID=16;
    public static final int NUMBER=17;
    public static final int UNARYOP=18;
    public static final int FUNC=19;
    public static final int LETTER=20;
    public static final int NEWLINE=21;
    public static final int COMMENT=22;
    public static final int WHITESPACE=23;
    public static final int DIGIT=24;

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

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:7:7: ( '[' )
            // LogoAST.g:7:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:8:7: ( ']' )
            // LogoAST.g:8:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:9:7: ( '(' )
            // LogoAST.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:10:7: ( ')' )
            // LogoAST.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:11:7: ( 'not' )
            // LogoAST.g:11:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "COMMAND"
    public final void mCOMMAND() throws RecognitionException {
        try {
            int _type = COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:119:9: ( 'print' | 'make' | 'forward' | 'penup' | 'pendown' | 'color' | 'right' | 'beginfill' | 'endfill' | 'goto' | 'circle' | 'left' )
            int alt1=12;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // LogoAST.g:120:10: 'print'
                    {
                    match("print"); 


                    }
                    break;
                case 2 :
                    // LogoAST.g:121:4: 'make'
                    {
                    match("make"); 


                    }
                    break;
                case 3 :
                    // LogoAST.g:122:6: 'forward'
                    {
                    match("forward"); 


                    }
                    break;
                case 4 :
                    // LogoAST.g:123:6: 'penup'
                    {
                    match("penup"); 


                    }
                    break;
                case 5 :
                    // LogoAST.g:124:6: 'pendown'
                    {
                    match("pendown"); 


                    }
                    break;
                case 6 :
                    // LogoAST.g:125:6: 'color'
                    {
                    match("color"); 


                    }
                    break;
                case 7 :
                    // LogoAST.g:126:6: 'right'
                    {
                    match("right"); 


                    }
                    break;
                case 8 :
                    // LogoAST.g:127:6: 'beginfill'
                    {
                    match("beginfill"); 


                    }
                    break;
                case 9 :
                    // LogoAST.g:128:6: 'endfill'
                    {
                    match("endfill"); 


                    }
                    break;
                case 10 :
                    // LogoAST.g:129:6: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 11 :
                    // LogoAST.g:130:6: 'circle'
                    {
                    match("circle"); 


                    }
                    break;
                case 12 :
                    // LogoAST.g:131:6: 'left'
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

    // $ANTLR start "UNARYOP"
    public final void mUNARYOP() throws RecognitionException {
        try {
            int _type = UNARYOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:133:9: ()
            // LogoAST.g:134:9: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNARYOP"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:136:5: ( 'modulo' )
            // LogoAST.g:137:9: 'modulo'
            {
            match("modulo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // LogoAST.g:139:17: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // LogoAST.g:144:2: ( '>' | '<' | '>=' | '<=' | '=' )
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
                    // LogoAST.g:144:4: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // LogoAST.g:145:4: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // LogoAST.g:146:4: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // LogoAST.g:147:4: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // LogoAST.g:148:4: '='
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
            // LogoAST.g:150:8: ( '+' | '-' )
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
            // LogoAST.g:155:7: ( '\"' | ':' )
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
            // LogoAST.g:159:9: ( '*' | '/' )
            // LogoAST.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
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
    // $ANTLR end "FACTOROP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:163:9: ( ';' ( . )* NEWLINE )
            // LogoAST.g:164:9: ';' ( . )* NEWLINE
            {
            match(';'); 
            // LogoAST.g:164:13: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\r') ) {
                    alt3=2;
                }
                else if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // LogoAST.g:164:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mNEWLINE(); 
             _channel = HIDDEN; 

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
            // LogoAST.g:166:7: ( 'while' )
            // LogoAST.g:166:9: 'while'
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
            // LogoAST.g:168:4: ( 'if' )
            // LogoAST.g:168:6: 'if'
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

    // $ANTLR start "IFELSE"
    public final void mIFELSE() throws RecognitionException {
        try {
            int _type = IFELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:171:5: ( 'ifelse' )
            // LogoAST.g:171:9: 'ifelse'
            {
            match("ifelse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IFELSE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoAST.g:173:4: ( ( '_' )* LETTER ( LETTER | '_' | NUMBER )* )
            // LogoAST.g:174:9: ( '_' )* LETTER ( LETTER | '_' | NUMBER )*
            {
            // LogoAST.g:174:9: ( '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='_') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LogoAST.g:174:11: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            mLETTER(); 
            // LogoAST.g:174:25: ( LETTER | '_' | NUMBER )*
            loop5:
            do {
                int alt5=4;
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
                    alt5=1;
                    }
                    break;
                case '_':
                    {
                    alt5=2;
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
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // LogoAST.g:174:26: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // LogoAST.g:174:35: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 3 :
            	    // LogoAST.g:174:41: NUMBER
            	    {
            	    mNUMBER(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // LogoAST.g:176:12: ( ( '\\t' | ' ' )+ )
            // LogoAST.g:177:9: ( '\\t' | ' ' )+
            {
            // LogoAST.g:177:9: ( '\\t' | ' ' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // LogoAST.g:180:9: ( ( '\\r' )? '\\n' )
            // LogoAST.g:181:9: ( '\\r' )? '\\n'
            {
            // LogoAST.g:181:9: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // LogoAST.g:181:10: '\\r'
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
            // LogoAST.g:183:8: ( ( DIGIT )+ )
            // LogoAST.g:184:9: ( DIGIT )+
            {
            // LogoAST.g:184:9: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // LogoAST.g:184:10: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // LogoAST.g:186:16: ( '0' .. '9' )
            // LogoAST.g:186:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // LogoAST.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | COMMAND | UNARYOP | FUNC | COMPAREOP | TERMOP | REFOP | FACTOROP | COMMENT | WHILE | IF | IFELSE | ID | WHITESPACE | NEWLINE | NUMBER )
        int alt9=20;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // LogoAST.g:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // LogoAST.g:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // LogoAST.g:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // LogoAST.g:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // LogoAST.g:1:34: T__29
                {
                mT__29(); 

                }
                break;
            case 6 :
                // LogoAST.g:1:40: COMMAND
                {
                mCOMMAND(); 

                }
                break;
            case 7 :
                // LogoAST.g:1:48: UNARYOP
                {
                mUNARYOP(); 

                }
                break;
            case 8 :
                // LogoAST.g:1:56: FUNC
                {
                mFUNC(); 

                }
                break;
            case 9 :
                // LogoAST.g:1:61: COMPAREOP
                {
                mCOMPAREOP(); 

                }
                break;
            case 10 :
                // LogoAST.g:1:71: TERMOP
                {
                mTERMOP(); 

                }
                break;
            case 11 :
                // LogoAST.g:1:78: REFOP
                {
                mREFOP(); 

                }
                break;
            case 12 :
                // LogoAST.g:1:84: FACTOROP
                {
                mFACTOROP(); 

                }
                break;
            case 13 :
                // LogoAST.g:1:93: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 14 :
                // LogoAST.g:1:101: WHILE
                {
                mWHILE(); 

                }
                break;
            case 15 :
                // LogoAST.g:1:107: IF
                {
                mIF(); 

                }
                break;
            case 16 :
                // LogoAST.g:1:110: IFELSE
                {
                mIFELSE(); 

                }
                break;
            case 17 :
                // LogoAST.g:1:117: ID
                {
                mID(); 

                }
                break;
            case 18 :
                // LogoAST.g:1:120: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 19 :
                // LogoAST.g:1:131: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 20 :
                // LogoAST.g:1:139: NUMBER
                {
                mNUMBER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA9 dfa9 = new DFA9(this);
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
            return "119:1: COMMAND : ( 'print' | 'make' | 'forward' | 'penup' | 'pendown' | 'color' | 'right' | 'beginfill' | 'endfill' | 'goto' | 'circle' | 'left' );";
        }
    }
    static final String DFA9_eotS =
        "\1\17\4\uffff\12\27\6\uffff\2\27\4\uffff\16\27\1\71\1\72\16\27\2"+
        "\uffff\3\27\1\115\7\27\2\115\2\27\2\115\1\27\1\uffff\2\27\1\115"+
        "\1\27\1\115\2\27\1\135\2\27\1\140\1\27\1\115\2\27\1\uffff\1\144"+
        "\1\115\1\uffff\1\115\1\27\1\115\1\uffff\1\27\1\115";
    static final String DFA9_eofS =
        "\147\uffff";
    static final String DFA9_minS =
        "\1\11\4\uffff\1\157\1\145\1\141\1\157\2\151\1\145\1\156\1\157\1"+
        "\145\6\uffff\1\150\1\146\4\uffff\1\164\1\151\1\156\1\153\1\144\1"+
        "\162\1\154\1\162\2\147\1\144\1\164\1\146\1\151\2\60\1\156\1\144"+
        "\1\145\1\165\1\167\1\157\1\143\1\150\1\151\1\146\1\157\1\164\2\154"+
        "\2\uffff\1\164\1\160\1\157\1\60\1\154\1\141\1\162\1\154\1\164\1"+
        "\156\1\151\2\60\1\145\1\163\2\60\1\167\1\uffff\1\157\1\162\1\60"+
        "\1\145\1\60\1\146\1\154\1\60\1\145\1\156\1\60\1\144\1\60\1\151\1"+
        "\154\1\uffff\2\60\1\uffff\1\60\1\154\1\60\1\uffff\1\154\1\60";
    static final String DFA9_maxS =
        "\1\172\4\uffff\1\157\1\162\3\157\1\151\1\145\1\156\1\157\1\145\6"+
        "\uffff\1\150\1\146\4\uffff\1\164\1\151\1\156\1\153\1\144\1\162\1"+
        "\154\1\162\2\147\1\144\1\164\1\146\1\151\2\172\1\156\1\165\1\145"+
        "\1\165\1\167\1\157\1\143\1\150\1\151\1\146\1\157\1\164\2\154\2\uffff"+
        "\1\164\1\160\1\157\1\172\1\154\1\141\1\162\1\154\1\164\1\156\1\151"+
        "\2\172\1\145\1\163\2\172\1\167\1\uffff\1\157\1\162\1\172\1\145\1"+
        "\172\1\146\1\154\1\172\1\145\1\156\1\172\1\144\1\172\1\151\1\154"+
        "\1\uffff\2\172\1\uffff\1\172\1\154\1\172\1\uffff\1\154\1\172";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\12\uffff\1\7\1\11\1\12\1\13\1\14\1\15\2"+
        "\uffff\1\21\1\22\1\23\1\24\36\uffff\1\17\1\5\22\uffff\1\6\17\uffff"+
        "\1\16\2\uffff\1\10\3\uffff\1\20\2\uffff";
    static final String DFA9_specialS =
        "\147\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\30\1\31\2\uffff\1\31\22\uffff\1\30\1\uffff\1\22\5\uffff\1"+
            "\3\1\4\1\23\1\21\1\uffff\1\21\1\uffff\1\23\12\32\1\22\1\24\3"+
            "\20\2\uffff\32\27\1\1\1\uffff\1\2\1\uffff\1\27\1\uffff\1\27"+
            "\1\13\1\11\1\27\1\14\1\10\1\15\1\27\1\26\2\27\1\16\1\7\1\5\1"+
            "\27\1\6\1\27\1\12\4\27\1\25\3\27",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\35\14\uffff\1\34",
            "\1\36\15\uffff\1\37",
            "\1\40",
            "\1\42\5\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
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
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\70\25\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\73",
            "\1\75\20\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\125",
            "\1\126",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\132",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\133",
            "\1\134",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\136",
            "\1\137",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\141",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\142",
            "\1\143",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\145",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\146",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27"
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
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | COMMAND | UNARYOP | FUNC | COMPAREOP | TERMOP | REFOP | FACTOROP | COMMENT | WHILE | IF | IFELSE | ID | WHITESPACE | NEWLINE | NUMBER );";
        }
    }
 

}