// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogoTurtle.g 2011-03-24 04:13:12

package org.msu.logocompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoTurtleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int FUNCALL=4;
    public static final int FUNCALLSTMT=5;
    public static final int BLOCK=6;
    public static final int EXPRSTMT=7;
    public static final int FLOATCONST=8;
    public static final int INTCONST=9;
    public static final int OUTPUT=10;
    public static final int FUNCDEF=11;
    public static final int ARGLIST=12;
    public static final int QUOTE=13;
    public static final int COLON=14;
    public static final int REFOP=15;
    public static final int PROGRAM=16;
    public static final int ID=17;
    public static final int WHILE=18;
    public static final int IF=19;
    public static final int IFELSE=20;
    public static final int FD=21;
    public static final int BK=22;
    public static final int LT=23;
    public static final int RT=24;
    public static final int SH=25;
    public static final int COMPAREOP=26;
    public static final int TERMOP=27;
    public static final int FACTOROP=28;
    public static final int FLOAT=29;
    public static final int INTEGER=30;
    public static final int LETTER=31;
    public static final int NEWLINE=32;
    public static final int COMMENT=33;
    public static final int DIGIT=34;
    public static final int WHITESPACE=35;

    // delegates
    // delegators

    public LogoTurtleLexer() {;} 
    public LogoTurtleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoTurtleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "LogoTurtle.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:7:7: ( 'to' )
            // LogoTurtle.g:7:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:8:7: ( '(' )
            // LogoTurtle.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:9:7: ( ')' )
            // LogoTurtle.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:10:7: ( 'end' )
            // LogoTurtle.g:10:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:11:7: ( ':' )
            // LogoTurtle.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:12:7: ( '[' )
            // LogoTurtle.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:13:7: ( ']' )
            // LogoTurtle.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:14:7: ( 'output' )
            // LogoTurtle.g:14:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:15:7: ( 'print' )
            // LogoTurtle.g:15:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:16:7: ( 'pendown' )
            // LogoTurtle.g:16:9: 'pendown'
            {
            match("pendown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:17:7: ( 'pd' )
            // LogoTurtle.g:17:9: 'pd'
            {
            match("pd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:18:7: ( 'penup' )
            // LogoTurtle.g:18:9: 'penup'
            {
            match("penup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:19:7: ( 'pu' )
            // LogoTurtle.g:19:9: 'pu'
            {
            match("pu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:20:7: ( 'make' )
            // LogoTurtle.g:20:9: 'make'
            {
            match("make"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:21:7: ( 'setpos' )
            // LogoTurtle.g:21:9: 'setpos'
            {
            match("setpos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:22:7: ( 'circle' )
            // LogoTurtle.g:22:9: 'circle'
            {
            match("circle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:23:7: ( 'setpencolor' )
            // LogoTurtle.g:23:9: 'setpencolor'
            {
            match("setpencolor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:24:7: ( 'beginfill' )
            // LogoTurtle.g:24:9: 'beginfill'
            {
            match("beginfill"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:25:7: ( 'endfill' )
            // LogoTurtle.g:25:9: 'endfill'
            {
            match("endfill"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:26:7: ( '\"' )
            // LogoTurtle.g:26:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "FD"
    public final void mFD() throws RecognitionException {
        try {
            int _type = FD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:127:4: ( 'forward' | 'fd' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='f') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='o') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='d') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // LogoTurtle.g:127:6: 'forward'
                    {
                    match("forward"); 


                    }
                    break;
                case 2 :
                    // LogoTurtle.g:127:18: 'fd'
                    {
                    match("fd"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FD"

    // $ANTLR start "BK"
    public final void mBK() throws RecognitionException {
        try {
            int _type = BK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:128:4: ( 'back' | 'bk' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='b') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='a') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='k') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // LogoTurtle.g:128:6: 'back'
                    {
                    match("back"); 


                    }
                    break;
                case 2 :
                    // LogoTurtle.g:128:15: 'bk'
                    {
                    match("bk"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BK"

    // $ANTLR start "RT"
    public final void mRT() throws RecognitionException {
        try {
            int _type = RT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:129:4: ( 'right' | 'rt' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='r') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='i') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='t') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // LogoTurtle.g:129:6: 'right'
                    {
                    match("right"); 


                    }
                    break;
                case 2 :
                    // LogoTurtle.g:129:16: 'rt'
                    {
                    match("rt"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RT"

    // $ANTLR start "SH"
    public final void mSH() throws RecognitionException {
        try {
            int _type = SH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:130:4: ( 'setheading' | 'seth' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='s') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='e') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='t') ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3=='h') ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4=='e') ) {
                                alt4=1;
                            }
                            else {
                                alt4=2;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // LogoTurtle.g:130:6: 'setheading'
                    {
                    match("setheading"); 


                    }
                    break;
                case 2 :
                    // LogoTurtle.g:130:21: 'seth'
                    {
                    match("seth"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SH"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:131:4: ( 'left' | 'lt' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='l') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='e') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='t') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // LogoTurtle.g:131:6: 'left'
                    {
                    match("left"); 


                    }
                    break;
                case 2 :
                    // LogoTurtle.g:131:15: 'lt'
                    {
                    match("lt"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // LogoTurtle.g:174:17: ( 'a' .. 'z' | 'A' .. 'Z' )
            // LogoTurtle.g:
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
            // LogoTurtle.g:179:2: ( '>' | '<' | '>=' | '<=' | '=' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='=') ) {
                    alt6=3;
                }
                else {
                    alt6=1;}
                }
                break;
            case '<':
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='=') ) {
                    alt6=4;
                }
                else {
                    alt6=2;}
                }
                break;
            case '=':
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // LogoTurtle.g:179:4: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // LogoTurtle.g:180:4: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // LogoTurtle.g:181:4: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // LogoTurtle.g:182:4: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // LogoTurtle.g:183:4: '='
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
            // LogoTurtle.g:185:8: ( '+' | '-' )
            // LogoTurtle.g:
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

    // $ANTLR start "FACTOROP"
    public final void mFACTOROP() throws RecognitionException {
        try {
            int _type = FACTOROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:190:9: ( '*' | '/' )
            // LogoTurtle.g:
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
            // LogoTurtle.g:194:9: ( ';' ( . )* NEWLINE )
            // LogoTurtle.g:195:9: ';' ( . )* NEWLINE
            {
            match(';'); 
            // LogoTurtle.g:195:13: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\r') ) {
                    alt7=2;
                }
                else if ( (LA7_0=='\n') ) {
                    alt7=2;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // LogoTurtle.g:195:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // LogoTurtle.g:197:7: ( 'while' )
            // LogoTurtle.g:197:9: 'while'
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
            // LogoTurtle.g:199:4: ( 'if' )
            // LogoTurtle.g:199:6: 'if'
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
            // LogoTurtle.g:202:5: ( 'ifelse' )
            // LogoTurtle.g:202:9: 'ifelse'
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
            // LogoTurtle.g:204:4: ( ( '_' )* LETTER ( LETTER | '_' | DIGIT )* )
            // LogoTurtle.g:205:9: ( '_' )* LETTER ( LETTER | '_' | DIGIT )*
            {
            // LogoTurtle.g:205:9: ( '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='_') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // LogoTurtle.g:205:11: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            mLETTER(); 
            // LogoTurtle.g:205:25: ( LETTER | '_' | DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // LogoTurtle.g:
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
            	    break loop9;
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

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:207:7: ( ( DIGIT )+ '.' ( DIGIT )* )
            // LogoTurtle.g:208:2: ( DIGIT )+ '.' ( DIGIT )*
            {
            // LogoTurtle.g:208:2: ( DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // LogoTurtle.g:208:2: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match('.'); 
            // LogoTurtle.g:208:13: ( DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // LogoTurtle.g:208:13: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:210:9: ( ( DIGIT )+ )
            // LogoTurtle.g:211:9: ( DIGIT )+
            {
            // LogoTurtle.g:211:9: ( DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // LogoTurtle.g:211:10: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // LogoTurtle.g:213:16: ( '0' .. '9' )
            // LogoTurtle.g:213:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // LogoTurtle.g:215:12: ( ( '\\t' | ' ' )+ )
            // LogoTurtle.g:216:9: ( '\\t' | ' ' )+
            {
            // LogoTurtle.g:216:9: ( '\\t' | ' ' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // LogoTurtle.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // LogoTurtle.g:219:9: ( ( '\\r' )? '\\n' )
            // LogoTurtle.g:220:9: ( '\\r' )? '\\n'
            {
            // LogoTurtle.g:220:9: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // LogoTurtle.g:220:10: '\\r'
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

    public void mTokens() throws RecognitionException {
        // LogoTurtle.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | FD | BK | RT | SH | LT | COMPAREOP | TERMOP | FACTOROP | COMMENT | WHILE | IF | IFELSE | ID | FLOAT | INTEGER | WHITESPACE | NEWLINE )
        int alt15=37;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // LogoTurtle.g:1:10: T__36
                {
                mT__36(); 

                }
                break;
            case 2 :
                // LogoTurtle.g:1:16: T__37
                {
                mT__37(); 

                }
                break;
            case 3 :
                // LogoTurtle.g:1:22: T__38
                {
                mT__38(); 

                }
                break;
            case 4 :
                // LogoTurtle.g:1:28: T__39
                {
                mT__39(); 

                }
                break;
            case 5 :
                // LogoTurtle.g:1:34: T__40
                {
                mT__40(); 

                }
                break;
            case 6 :
                // LogoTurtle.g:1:40: T__41
                {
                mT__41(); 

                }
                break;
            case 7 :
                // LogoTurtle.g:1:46: T__42
                {
                mT__42(); 

                }
                break;
            case 8 :
                // LogoTurtle.g:1:52: T__43
                {
                mT__43(); 

                }
                break;
            case 9 :
                // LogoTurtle.g:1:58: T__44
                {
                mT__44(); 

                }
                break;
            case 10 :
                // LogoTurtle.g:1:64: T__45
                {
                mT__45(); 

                }
                break;
            case 11 :
                // LogoTurtle.g:1:70: T__46
                {
                mT__46(); 

                }
                break;
            case 12 :
                // LogoTurtle.g:1:76: T__47
                {
                mT__47(); 

                }
                break;
            case 13 :
                // LogoTurtle.g:1:82: T__48
                {
                mT__48(); 

                }
                break;
            case 14 :
                // LogoTurtle.g:1:88: T__49
                {
                mT__49(); 

                }
                break;
            case 15 :
                // LogoTurtle.g:1:94: T__50
                {
                mT__50(); 

                }
                break;
            case 16 :
                // LogoTurtle.g:1:100: T__51
                {
                mT__51(); 

                }
                break;
            case 17 :
                // LogoTurtle.g:1:106: T__52
                {
                mT__52(); 

                }
                break;
            case 18 :
                // LogoTurtle.g:1:112: T__53
                {
                mT__53(); 

                }
                break;
            case 19 :
                // LogoTurtle.g:1:118: T__54
                {
                mT__54(); 

                }
                break;
            case 20 :
                // LogoTurtle.g:1:124: T__55
                {
                mT__55(); 

                }
                break;
            case 21 :
                // LogoTurtle.g:1:130: FD
                {
                mFD(); 

                }
                break;
            case 22 :
                // LogoTurtle.g:1:133: BK
                {
                mBK(); 

                }
                break;
            case 23 :
                // LogoTurtle.g:1:136: RT
                {
                mRT(); 

                }
                break;
            case 24 :
                // LogoTurtle.g:1:139: SH
                {
                mSH(); 

                }
                break;
            case 25 :
                // LogoTurtle.g:1:142: LT
                {
                mLT(); 

                }
                break;
            case 26 :
                // LogoTurtle.g:1:145: COMPAREOP
                {
                mCOMPAREOP(); 

                }
                break;
            case 27 :
                // LogoTurtle.g:1:155: TERMOP
                {
                mTERMOP(); 

                }
                break;
            case 28 :
                // LogoTurtle.g:1:162: FACTOROP
                {
                mFACTOROP(); 

                }
                break;
            case 29 :
                // LogoTurtle.g:1:171: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 30 :
                // LogoTurtle.g:1:179: WHILE
                {
                mWHILE(); 

                }
                break;
            case 31 :
                // LogoTurtle.g:1:185: IF
                {
                mIF(); 

                }
                break;
            case 32 :
                // LogoTurtle.g:1:188: IFELSE
                {
                mIFELSE(); 

                }
                break;
            case 33 :
                // LogoTurtle.g:1:195: ID
                {
                mID(); 

                }
                break;
            case 34 :
                // LogoTurtle.g:1:198: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 35 :
                // LogoTurtle.g:1:204: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 36 :
                // LogoTurtle.g:1:212: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 37 :
                // LogoTurtle.g:1:223: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\30\2\uffff\1\30\3\uffff\6\30\1\uffff\3\30\4\uffff\2\30"+
        "\1\uffff\1\61\2\uffff\1\63\4\30\1\70\1\71\5\30\1\77\1\30\1\101\1"+
        "\30\1\103\1\30\1\105\1\30\1\110\3\uffff\1\112\3\30\2\uffff\5\30"+
        "\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff\2\30\1\uffff\1\30"+
        "\1\uffff\4\30\1\137\1\30\1\143\2\30\1\77\2\30\1\105\4\30\1\154\1"+
        "\30\1\156\1\uffff\3\30\1\uffff\3\30\1\103\1\165\2\30\1\170\1\uffff"+
        "\1\30\1\uffff\1\172\2\30\1\175\2\30\1\uffff\1\u0080\1\u0081\1\uffff"+
        "\1\u0082\1\uffff\2\30\1\uffff\1\30\1\101\3\uffff\5\30\1\u008b\1"+
        "\30\1\143\1\uffff\1\u008d\1\uffff";
    static final String DFA15_eofS =
        "\u008e\uffff";
    static final String DFA15_minS =
        "\1\11\1\157\2\uffff\1\156\3\uffff\1\165\1\144\1\141\1\145\1\151"+
        "\1\141\1\uffff\1\144\1\151\1\145\4\uffff\1\150\1\146\1\uffff\1\56"+
        "\2\uffff\1\60\1\144\1\164\1\151\1\156\2\60\1\153\1\164\1\162\1\147"+
        "\1\143\1\60\1\162\1\60\1\147\1\60\1\146\1\60\1\151\1\60\3\uffff"+
        "\1\60\1\160\1\156\1\144\2\uffff\1\145\1\150\1\143\1\151\1\153\1"+
        "\uffff\1\167\1\uffff\1\150\1\uffff\1\164\1\uffff\2\154\1\uffff\1"+
        "\151\1\uffff\1\165\1\164\1\157\1\160\1\60\1\145\1\60\1\154\1\156"+
        "\1\60\1\141\1\164\1\60\1\145\1\163\1\154\1\164\1\60\1\167\1\60\1"+
        "\uffff\1\163\1\156\1\141\1\uffff\1\145\1\146\1\162\2\60\1\145\1"+
        "\154\1\60\1\uffff\1\156\1\uffff\1\60\1\143\1\144\1\60\1\151\1\144"+
        "\1\uffff\2\60\1\uffff\1\60\1\uffff\1\157\1\151\1\uffff\1\154\1\60"+
        "\3\uffff\1\154\1\156\1\154\1\157\1\147\1\60\1\162\1\60\1\uffff\1"+
        "\60\1\uffff";
    static final String DFA15_maxS =
        "\1\172\1\157\2\uffff\1\156\3\uffff\2\165\1\141\1\145\1\151\1\153"+
        "\1\uffff\1\157\2\164\4\uffff\1\150\1\146\1\uffff\1\71\2\uffff\1"+
        "\172\1\144\1\164\1\151\1\156\2\172\1\153\1\164\1\162\1\147\1\143"+
        "\1\172\1\162\1\172\1\147\1\172\1\146\1\172\1\151\1\172\3\uffff\1"+
        "\172\1\160\1\156\1\165\2\uffff\1\145\1\160\1\143\1\151\1\153\1\uffff"+
        "\1\167\1\uffff\1\150\1\uffff\1\164\1\uffff\2\154\1\uffff\1\151\1"+
        "\uffff\1\165\1\164\1\157\1\160\1\172\1\157\1\172\1\154\1\156\1\172"+
        "\1\141\1\164\1\172\1\145\1\163\1\154\1\164\1\172\1\167\1\172\1\uffff"+
        "\1\163\1\156\1\141\1\uffff\1\145\1\146\1\162\2\172\1\145\1\154\1"+
        "\172\1\uffff\1\156\1\uffff\1\172\1\143\1\144\1\172\1\151\1\144\1"+
        "\uffff\2\172\1\uffff\1\172\1\uffff\1\157\1\151\1\uffff\1\154\1\172"+
        "\3\uffff\1\154\1\156\1\154\1\157\1\147\1\172\1\162\1\172\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\6\uffff\1\24\3\uffff\1\32\1"+
        "\33\1\34\1\35\2\uffff\1\41\1\uffff\1\44\1\45\25\uffff\1\43\1\42"+
        "\1\1\4\uffff\1\13\1\15\5\uffff\1\26\1\uffff\1\25\1\uffff\1\27\1"+
        "\uffff\1\31\2\uffff\1\37\1\uffff\1\4\24\uffff\1\16\3\uffff\1\30"+
        "\10\uffff\1\11\1\uffff\1\14\6\uffff\1\36\2\uffff\1\10\1\uffff\1"+
        "\17\2\uffff\1\20\2\uffff\1\40\1\23\1\12\10\uffff\1\22\1\uffff\1"+
        "\21";
    static final String DFA15_specialS =
        "\u008e\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\32\1\33\2\uffff\1\33\22\uffff\1\32\1\uffff\1\16\5\uffff\1"+
            "\2\1\3\1\24\1\23\1\uffff\1\23\1\uffff\1\24\12\31\1\5\1\25\3"+
            "\22\2\uffff\32\30\1\6\1\uffff\1\7\1\uffff\1\30\1\uffff\1\30"+
            "\1\15\1\14\1\30\1\4\1\17\2\30\1\27\2\30\1\21\1\12\1\30\1\10"+
            "\1\11\1\30\1\20\1\13\1\1\2\30\1\26\3\30",
            "\1\34",
            "",
            "",
            "\1\35",
            "",
            "",
            "",
            "\1\36",
            "\1\41\1\40\14\uffff\1\37\2\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\47\3\uffff\1\46\5\uffff\1\50",
            "",
            "\1\52\12\uffff\1\51",
            "\1\53\12\uffff\1\54",
            "\1\55\16\uffff\1\56",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "",
            "\1\62\1\uffff\12\31",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\100",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\102",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\104",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\106",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4\30\1\107\25\30",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\5\30\1\111\24\30",
            "\1\113",
            "\1\114",
            "\1\115\20\uffff\1\116",
            "",
            "",
            "\1\117",
            "\1\121\7\uffff\1\120",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "",
            "\1\126",
            "",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\141\11\uffff\1\140",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4\30\1\142\25\30",
            "\1\144",
            "\1\145",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\146",
            "\1\147",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\155",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\166",
            "\1\167",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\171",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\173",
            "\1\174",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\176",
            "\1\177",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u008c",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | FD | BK | RT | SH | LT | COMPAREOP | TERMOP | FACTOROP | COMMENT | WHILE | IF | IFELSE | ID | FLOAT | INTEGER | WHITESPACE | NEWLINE );";
        }
    }
 

}