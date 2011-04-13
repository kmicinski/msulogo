// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogoTurtle.g 2011-03-24 04:13:11

package org.msu.logocompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class LogoTurtleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCALL", "FUNCALLSTMT", "BLOCK", "EXPRSTMT", "FLOATCONST", "INTCONST", "OUTPUT", "FUNCDEF", "ARGLIST", "QUOTE", "COLON", "REFOP", "PROGRAM", "ID", "WHILE", "IF", "IFELSE", "FD", "BK", "LT", "RT", "SH", "COMPAREOP", "TERMOP", "FACTOROP", "FLOAT", "INTEGER", "LETTER", "NEWLINE", "COMMENT", "DIGIT", "WHITESPACE", "'to'", "'('", "')'", "'end'", "':'", "'['", "']'", "'output'", "'print'", "'pendown'", "'pd'", "'penup'", "'pu'", "'make'", "'setpos'", "'circle'", "'setpencolor'", "'beginfill'", "'endfill'", "'\"'"
    };
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


        public LogoTurtleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoTurtleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LogoTurtleParser.tokenNames; }
    public String getGrammarFileName() { return "LogoTurtle.g"; }


        private int mNumLines = 0;
        private int mNumCommands = 0;
        private int mNumIds = 0;
        private int mNumNumbers = 0;
        private int mNumMathOps = 0;
        private int mNumRefOps = 0;
        private int mNumNewlines = 0;
        private int mNumComments = 0;
        
        private void incNumLines() { mNumLines++; }
        private void incNumCommands() { mNumCommands++; }
        private void incNumIds() { mNumIds++; }
        private void incNumNumbers() { mNumNumbers++; }
        private void incNumMathOps() { mNumMathOps++; }
        private void incNumRefOps() { mNumRefOps++; }
        private void incNumNewlines() { mNumNewlines++; }
        private void incNumComments() { mNumComments++; }
        
        public int getNumLines() { return mNumLines; }
        public int getNumCommands() { return mNumCommands; }
        public int getNumMathOps() { return mNumMathOps; }
        public int getNumNumbers() { return mNumNumbers; }
        public int getNumIds() { return mNumIds; }
        public int getNumRefOps() { return mNumRefOps; }
        public int getNumNewlines() { return mNumNewlines; }
        public int getNumComments() { return mNumComments; }
        


    public static class translation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "translation_unit"
    // LogoTurtle.g:82:1: translation_unit : ( elementary_unit )+ -> ^( PROGRAM ( elementary_unit )+ ) ;
    public final LogoTurtleParser.translation_unit_return translation_unit() throws RecognitionException {
        LogoTurtleParser.translation_unit_return retval = new LogoTurtleParser.translation_unit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoTurtleParser.elementary_unit_return elementary_unit1 = null;


        RewriteRuleSubtreeStream stream_elementary_unit=new RewriteRuleSubtreeStream(adaptor,"rule elementary_unit");
        try {
            // LogoTurtle.g:83:2: ( ( elementary_unit )+ -> ^( PROGRAM ( elementary_unit )+ ) )
            // LogoTurtle.g:83:4: ( elementary_unit )+
            {
            // LogoTurtle.g:83:4: ( elementary_unit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=ID && LA1_0<=SH)||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=43 && LA1_0<=54)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // LogoTurtle.g:83:5: elementary_unit
            	    {
            	    pushFollow(FOLLOW_elementary_unit_in_translation_unit161);
            	    elementary_unit1=elementary_unit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elementary_unit.add(elementary_unit1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: elementary_unit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:23: -> ^( PROGRAM ( elementary_unit )+ )
            {
                // LogoTurtle.g:83:26: ^( PROGRAM ( elementary_unit )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                if ( !(stream_elementary_unit.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_elementary_unit.hasNext() ) {
                    adaptor.addChild(root_1, stream_elementary_unit.nextTree());

                }
                stream_elementary_unit.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "translation_unit"

    public static class elementary_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementary_unit"
    // LogoTurtle.g:85:1: elementary_unit : ( ( block ) | ( function_definition ) );
    public final LogoTurtleParser.elementary_unit_return elementary_unit() throws RecognitionException {
        LogoTurtleParser.elementary_unit_return retval = new LogoTurtleParser.elementary_unit_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoTurtleParser.block_return block2 = null;

        LogoTurtleParser.function_definition_return function_definition3 = null;



        try {
            // LogoTurtle.g:86:2: ( ( block ) | ( function_definition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=ID && LA2_0<=SH)||LA2_0==37||(LA2_0>=43 && LA2_0<=54)) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // LogoTurtle.g:86:4: ( block )
                    {
                    root_0 = (Object)adaptor.nil();

                    // LogoTurtle.g:86:4: ( block )
                    // LogoTurtle.g:86:5: block
                    {
                    pushFollow(FOLLOW_block_in_elementary_unit182);
                    block2=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block2.getTree());

                    }


                    }
                    break;
                case 2 :
                    // LogoTurtle.g:87:4: ( function_definition )
                    {
                    root_0 = (Object)adaptor.nil();

                    // LogoTurtle.g:87:4: ( function_definition )
                    // LogoTurtle.g:87:5: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_elementary_unit189);
                    function_definition3=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_definition3.getTree());

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elementary_unit"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // LogoTurtle.g:89:1: block : ( options {greedy=true; } : statement )+ -> ^( BLOCK ( statement )+ ) ;
    public final LogoTurtleParser.block_return block() throws RecognitionException {
        LogoTurtleParser.block_return retval = new LogoTurtleParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoTurtleParser.statement_return statement4 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // LogoTurtle.g:89:6: ( ( options {greedy=true; } : statement )+ -> ^( BLOCK ( statement )+ ) )
            // LogoTurtle.g:90:8: ( options {greedy=true; } : statement )+
            {
            // LogoTurtle.g:90:8: ( options {greedy=true; } : statement )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // LogoTurtle.g:90:33: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block213);
            	    statement4=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement4.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:45: -> ^( BLOCK ( statement )+ )
            {
                // LogoTurtle.g:90:48: ^( BLOCK ( statement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class function_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_definition"
    // LogoTurtle.g:92:1: function_definition : 'to' ID '(' ( argument )* ')' block 'end' -> ^( FUNCDEF ID ^( ARGLIST ( argument )* ) block ) ;
    public final LogoTurtleParser.function_definition_return function_definition() throws RecognitionException {
        LogoTurtleParser.function_definition_return retval = new LogoTurtleParser.function_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token ID6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token string_literal11=null;
        LogoTurtleParser.argument_return argument8 = null;

        LogoTurtleParser.block_return block10 = null;


        Object string_literal5_tree=null;
        Object ID6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        Object string_literal11_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // LogoTurtle.g:93:2: ( 'to' ID '(' ( argument )* ')' block 'end' -> ^( FUNCDEF ID ^( ARGLIST ( argument )* ) block ) )
            // LogoTurtle.g:93:4: 'to' ID '(' ( argument )* ')' block 'end'
            {
            string_literal5=(Token)match(input,36,FOLLOW_36_in_function_definition233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_36.add(string_literal5);

            ID6=(Token)match(input,ID,FOLLOW_ID_in_function_definition235); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID6);

            char_literal7=(Token)match(input,37,FOLLOW_37_in_function_definition237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_37.add(char_literal7);

            // LogoTurtle.g:93:16: ( argument )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // LogoTurtle.g:93:17: argument
            	    {
            	    pushFollow(FOLLOW_argument_in_function_definition240);
            	    argument8=argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argument.add(argument8.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal9=(Token)match(input,38,FOLLOW_38_in_function_definition244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_38.add(char_literal9);

            pushFollow(FOLLOW_block_in_function_definition246);
            block10=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block10.getTree());
            string_literal11=(Token)match(input,39,FOLLOW_39_in_function_definition248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(string_literal11);



            // AST REWRITE
            // elements: block, argument, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:44: -> ^( FUNCDEF ID ^( ARGLIST ( argument )* ) block )
            {
                // LogoTurtle.g:93:47: ^( FUNCDEF ID ^( ARGLIST ( argument )* ) block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // LogoTurtle.g:93:60: ^( ARGLIST ( argument )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGLIST, "ARGLIST"), root_2);

                // LogoTurtle.g:93:70: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_2, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_definition"

    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // LogoTurtle.g:95:1: argument : ':' ID ;
    public final LogoTurtleParser.argument_return argument() throws RecognitionException {
        LogoTurtleParser.argument_return retval = new LogoTurtleParser.argument_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal12=null;
        Token ID13=null;

        Object char_literal12_tree=null;
        Object ID13_tree=null;

        try {
            // LogoTurtle.g:96:2: ( ':' ID )
            // LogoTurtle.g:97:2: ':' ID
            {
            root_0 = (Object)adaptor.nil();

            char_literal12=(Token)match(input,40,FOLLOW_40_in_argument276); if (state.failed) return retval;
            ID13=(Token)match(input,ID,FOLLOW_ID_in_argument279); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID13_tree = (Object)adaptor.create(ID13);
            adaptor.addChild(root_0, ID13_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // LogoTurtle.g:99:1: statement : ( WHILE '[' funcallexpr ']' '[' ( statement )+ ']' -> ^( WHILE funcallexpr ^( BLOCK ( statement )+ ) ) | IF funcallexpr '[' ( statement )+ ']' -> ^( IF funcallexpr ^( BLOCK ( statement )+ ) ) | IFELSE funcallexpr '[' ifblock= block ']' '[' elseblock= block ']' -> ^( IF funcallexpr $ifblock $elseblock) | 'output' funcallexpr -> ^( FUNCALL 'output' funcallexpr ) | ID '(' ( simpleexpr )* ')' -> ^( EXPRSTMT ^( FUNCALL ID ( simpleexpr )* ) ) | '(' 'print' ( options {backtrack=true; } : funcallexpr )+ ')' -> ^( EXPRSTMT ^( FUNCALL 'print' ( funcallexpr )+ ) ) | 'print' funcallexpr -> ^( FUNCALL 'print' funcallexpr ) | 'pendown' -> ^( FUNCALL 'pendown' ) | 'pd' -> ^( FUNCALL 'pendown' ) | 'penup' -> ^( FUNCALL 'penup' ) | 'pu' -> ^( FUNCALL 'penup' ) | FD funcallexpr -> ^( FUNCALL FD funcallexpr ) | BK funcallexpr -> ^( FUNCALL BK funcallexpr ) | LT funcallexpr -> ^( FUNCALL LT funcallexpr ) | RT funcallexpr -> ^( FUNCALL RT funcallexpr ) | SH funcallexpr -> ^( FUNCALL SH funcallexpr ) | 'make' a= funcallexpr b= funcallexpr -> ^( FUNCALL 'make' $a $b) | 'setpos' '[' (int1= funcallexpr ) (int2= funcallexpr ) ']' -> ^( FUNCALL 'setpos' $int1 $int2) | 'circle' (int1= funcallexpr ) (int2= funcallexpr ) -> ^( FUNCALL 'circle' $int1 $int2) | 'setpencolor' '[' (int1= funcallexpr ) (int2= funcallexpr ) (int3= funcallexpr ) ']' -> ^( FUNCALL 'setpencolor' $int1 $int2 $int3) | 'beginfill' -> ^( FUNCALL 'beginfill' ) | 'endfill' -> ^( FUNCALL 'endfill' ) );
    public final LogoTurtleParser.statement_return statement() throws RecognitionException {
        LogoTurtleParser.statement_return retval = new LogoTurtleParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token IF21=null;
        Token char_literal23=null;
        Token char_literal25=null;
        Token IFELSE26=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token string_literal32=null;
        Token ID34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Token string_literal39=null;
        Token char_literal41=null;
        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token FD48=null;
        Token BK50=null;
        Token LT52=null;
        Token RT54=null;
        Token SH56=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token string_literal62=null;
        Token string_literal63=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token string_literal67=null;
        LogoTurtleParser.block_return ifblock = null;

        LogoTurtleParser.block_return elseblock = null;

        LogoTurtleParser.funcallexpr_return a = null;

        LogoTurtleParser.funcallexpr_return b = null;

        LogoTurtleParser.funcallexpr_return int1 = null;

        LogoTurtleParser.funcallexpr_return int2 = null;

        LogoTurtleParser.funcallexpr_return int3 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr16 = null;

        LogoTurtleParser.statement_return statement19 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr22 = null;

        LogoTurtleParser.statement_return statement24 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr27 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr33 = null;

        LogoTurtleParser.simpleexpr_return simpleexpr36 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr40 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr43 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr49 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr51 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr53 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr55 = null;

        LogoTurtleParser.funcallexpr_return funcallexpr57 = null;


        Object WHILE14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        Object IF21_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;
        Object IFELSE26_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;
        Object string_literal32_tree=null;
        Object ID34_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        Object string_literal39_tree=null;
        Object char_literal41_tree=null;
        Object string_literal42_tree=null;
        Object string_literal44_tree=null;
        Object string_literal45_tree=null;
        Object string_literal46_tree=null;
        Object string_literal47_tree=null;
        Object FD48_tree=null;
        Object BK50_tree=null;
        Object LT52_tree=null;
        Object RT54_tree=null;
        Object SH56_tree=null;
        Object string_literal58_tree=null;
        Object string_literal59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object string_literal62_tree=null;
        Object string_literal63_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object string_literal67_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_IFELSE=new RewriteRuleTokenStream(adaptor,"token IFELSE");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_BK=new RewriteRuleTokenStream(adaptor,"token BK");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_FD=new RewriteRuleTokenStream(adaptor,"token FD");
        RewriteRuleTokenStream stream_SH=new RewriteRuleTokenStream(adaptor,"token SH");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_RT=new RewriteRuleTokenStream(adaptor,"token RT");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_simpleexpr=new RewriteRuleSubtreeStream(adaptor,"rule simpleexpr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_funcallexpr=new RewriteRuleSubtreeStream(adaptor,"rule funcallexpr");
        try {
            // LogoTurtle.g:99:10: ( WHILE '[' funcallexpr ']' '[' ( statement )+ ']' -> ^( WHILE funcallexpr ^( BLOCK ( statement )+ ) ) | IF funcallexpr '[' ( statement )+ ']' -> ^( IF funcallexpr ^( BLOCK ( statement )+ ) ) | IFELSE funcallexpr '[' ifblock= block ']' '[' elseblock= block ']' -> ^( IF funcallexpr $ifblock $elseblock) | 'output' funcallexpr -> ^( FUNCALL 'output' funcallexpr ) | ID '(' ( simpleexpr )* ')' -> ^( EXPRSTMT ^( FUNCALL ID ( simpleexpr )* ) ) | '(' 'print' ( options {backtrack=true; } : funcallexpr )+ ')' -> ^( EXPRSTMT ^( FUNCALL 'print' ( funcallexpr )+ ) ) | 'print' funcallexpr -> ^( FUNCALL 'print' funcallexpr ) | 'pendown' -> ^( FUNCALL 'pendown' ) | 'pd' -> ^( FUNCALL 'pendown' ) | 'penup' -> ^( FUNCALL 'penup' ) | 'pu' -> ^( FUNCALL 'penup' ) | FD funcallexpr -> ^( FUNCALL FD funcallexpr ) | BK funcallexpr -> ^( FUNCALL BK funcallexpr ) | LT funcallexpr -> ^( FUNCALL LT funcallexpr ) | RT funcallexpr -> ^( FUNCALL RT funcallexpr ) | SH funcallexpr -> ^( FUNCALL SH funcallexpr ) | 'make' a= funcallexpr b= funcallexpr -> ^( FUNCALL 'make' $a $b) | 'setpos' '[' (int1= funcallexpr ) (int2= funcallexpr ) ']' -> ^( FUNCALL 'setpos' $int1 $int2) | 'circle' (int1= funcallexpr ) (int2= funcallexpr ) -> ^( FUNCALL 'circle' $int1 $int2) | 'setpencolor' '[' (int1= funcallexpr ) (int2= funcallexpr ) (int3= funcallexpr ) ']' -> ^( FUNCALL 'setpencolor' $int1 $int2 $int3) | 'beginfill' -> ^( FUNCALL 'beginfill' ) | 'endfill' -> ^( FUNCALL 'endfill' ) )
            int alt9=22;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt9=1;
                }
                break;
            case IF:
                {
                alt9=2;
                }
                break;
            case IFELSE:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case ID:
                {
                alt9=5;
                }
                break;
            case 37:
                {
                alt9=6;
                }
                break;
            case 44:
                {
                alt9=7;
                }
                break;
            case 45:
                {
                alt9=8;
                }
                break;
            case 46:
                {
                alt9=9;
                }
                break;
            case 47:
                {
                alt9=10;
                }
                break;
            case 48:
                {
                alt9=11;
                }
                break;
            case FD:
                {
                alt9=12;
                }
                break;
            case BK:
                {
                alt9=13;
                }
                break;
            case LT:
                {
                alt9=14;
                }
                break;
            case RT:
                {
                alt9=15;
                }
                break;
            case SH:
                {
                alt9=16;
                }
                break;
            case 49:
                {
                alt9=17;
                }
                break;
            case 50:
                {
                alt9=18;
                }
                break;
            case 51:
                {
                alt9=19;
                }
                break;
            case 52:
                {
                alt9=20;
                }
                break;
            case 53:
                {
                alt9=21;
                }
                break;
            case 54:
                {
                alt9=22;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // LogoTurtle.g:100:9: WHILE '[' funcallexpr ']' '[' ( statement )+ ']'
                    {
                    WHILE14=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE14);

                    char_literal15=(Token)match(input,41,FOLLOW_41_in_statement297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal15);

                    pushFollow(FOLLOW_funcallexpr_in_statement300);
                    funcallexpr16=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr16.getTree());
                    char_literal17=(Token)match(input,42,FOLLOW_42_in_statement302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal17);

                    char_literal18=(Token)match(input,41,FOLLOW_41_in_statement305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal18);

                    // LogoTurtle.g:100:42: ( statement )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=ID && LA5_0<=SH)||LA5_0==37||(LA5_0>=43 && LA5_0<=54)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // LogoTurtle.g:100:42: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement307);
                    	    statement19=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    char_literal20=(Token)match(input,42,FOLLOW_42_in_statement310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal20);



                    // AST REWRITE
                    // elements: WHILE, funcallexpr, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:56: -> ^( WHILE funcallexpr ^( BLOCK ( statement )+ ) )
                    {
                        // LogoTurtle.g:100:59: ^( WHILE funcallexpr ^( BLOCK ( statement )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());
                        // LogoTurtle.g:100:79: ^( BLOCK ( statement )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                        if ( !(stream_statement.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_2, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // LogoTurtle.g:101:7: IF funcallexpr '[' ( statement )+ ']'
                    {
                    IF21=(Token)match(input,IF,FOLLOW_IF_in_statement332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF21);

                    pushFollow(FOLLOW_funcallexpr_in_statement334);
                    funcallexpr22=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr22.getTree());
                    char_literal23=(Token)match(input,41,FOLLOW_41_in_statement336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal23);

                    // LogoTurtle.g:101:27: ( statement )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=ID && LA6_0<=SH)||LA6_0==37||(LA6_0>=43 && LA6_0<=54)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // LogoTurtle.g:101:28: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement340);
                    	    statement24=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    char_literal25=(Token)match(input,42,FOLLOW_42_in_statement344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal25);



                    // AST REWRITE
                    // elements: funcallexpr, IF, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:43: -> ^( IF funcallexpr ^( BLOCK ( statement )+ ) )
                    {
                        // LogoTurtle.g:101:46: ^( IF funcallexpr ^( BLOCK ( statement )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());
                        // LogoTurtle.g:101:63: ^( BLOCK ( statement )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                        if ( !(stream_statement.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_2, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // LogoTurtle.g:102:9: IFELSE funcallexpr '[' ifblock= block ']' '[' elseblock= block ']'
                    {
                    IFELSE26=(Token)match(input,IFELSE,FOLLOW_IFELSE_in_statement368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IFELSE.add(IFELSE26);

                    pushFollow(FOLLOW_funcallexpr_in_statement370);
                    funcallexpr27=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr27.getTree());
                    char_literal28=(Token)match(input,41,FOLLOW_41_in_statement372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal28);

                    pushFollow(FOLLOW_block_in_statement376);
                    ifblock=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(ifblock.getTree());
                    char_literal29=(Token)match(input,42,FOLLOW_42_in_statement378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal29);

                    char_literal30=(Token)match(input,41,FOLLOW_41_in_statement381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal30);

                    pushFollow(FOLLOW_block_in_statement386);
                    elseblock=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(elseblock.getTree());
                    char_literal31=(Token)match(input,42,FOLLOW_42_in_statement388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal31);



                    // AST REWRITE
                    // elements: elseblock, funcallexpr, ifblock
                    // token labels: 
                    // rule labels: ifblock, retval, elseblock
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ifblock=new RewriteRuleSubtreeStream(adaptor,"rule ifblock",ifblock!=null?ifblock.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_elseblock=new RewriteRuleSubtreeStream(adaptor,"rule elseblock",elseblock!=null?elseblock.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:76: -> ^( IF funcallexpr $ifblock $elseblock)
                    {
                        // LogoTurtle.g:102:79: ^( IF funcallexpr $ifblock $elseblock)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());
                        adaptor.addChild(root_1, stream_ifblock.nextTree());
                        adaptor.addChild(root_1, stream_elseblock.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // LogoTurtle.g:103:7: 'output' funcallexpr
                    {
                    string_literal32=(Token)match(input,43,FOLLOW_43_in_statement410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(string_literal32);

                    pushFollow(FOLLOW_funcallexpr_in_statement412);
                    funcallexpr33=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr33.getTree());


                    // AST REWRITE
                    // elements: funcallexpr, 43
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:28: -> ^( FUNCALL 'output' funcallexpr )
                    {
                        // LogoTurtle.g:103:31: ^( FUNCALL 'output' funcallexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_43.nextNode());
                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // LogoTurtle.g:104:7: ID '(' ( simpleexpr )* ')'
                    {
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_statement430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID34);

                    char_literal35=(Token)match(input,37,FOLLOW_37_in_statement432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal35);

                    // LogoTurtle.g:104:14: ( simpleexpr )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==ID||(LA7_0>=FLOAT && LA7_0<=INTEGER)||LA7_0==37||LA7_0==40||LA7_0==55) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // LogoTurtle.g:104:14: simpleexpr
                    	    {
                    	    pushFollow(FOLLOW_simpleexpr_in_statement434);
                    	    simpleexpr36=simpleexpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_simpleexpr.add(simpleexpr36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    char_literal37=(Token)match(input,38,FOLLOW_38_in_statement437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal37);



                    // AST REWRITE
                    // elements: ID, simpleexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:30: -> ^( EXPRSTMT ^( FUNCALL ID ( simpleexpr )* ) )
                    {
                        // LogoTurtle.g:104:33: ^( EXPRSTMT ^( FUNCALL ID ( simpleexpr )* ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRSTMT, "EXPRSTMT"), root_1);

                        // LogoTurtle.g:104:44: ^( FUNCALL ID ( simpleexpr )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_2);

                        adaptor.addChild(root_2, stream_ID.nextNode());
                        // LogoTurtle.g:104:57: ( simpleexpr )*
                        while ( stream_simpleexpr.hasNext() ) {
                            adaptor.addChild(root_2, stream_simpleexpr.nextTree());

                        }
                        stream_simpleexpr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // LogoTurtle.g:105:7: '(' 'print' ( options {backtrack=true; } : funcallexpr )+ ')'
                    {
                    char_literal38=(Token)match(input,37,FOLLOW_37_in_statement460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal38);

                    string_literal39=(Token)match(input,44,FOLLOW_44_in_statement462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal39);

                    // LogoTurtle.g:105:19: ( options {backtrack=true; } : funcallexpr )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ID||(LA8_0>=FLOAT && LA8_0<=INTEGER)||LA8_0==37||LA8_0==40||LA8_0==55) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // LogoTurtle.g:105:47: funcallexpr
                    	    {
                    	    pushFollow(FOLLOW_funcallexpr_in_statement473);
                    	    funcallexpr40=funcallexpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    char_literal41=(Token)match(input,38,FOLLOW_38_in_statement477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal41);



                    // AST REWRITE
                    // elements: 44, funcallexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:65: -> ^( EXPRSTMT ^( FUNCALL 'print' ( funcallexpr )+ ) )
                    {
                        // LogoTurtle.g:105:68: ^( EXPRSTMT ^( FUNCALL 'print' ( funcallexpr )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRSTMT, "EXPRSTMT"), root_1);

                        // LogoTurtle.g:105:79: ^( FUNCALL 'print' ( funcallexpr )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_2);

                        adaptor.addChild(root_2, stream_44.nextNode());
                        if ( !(stream_funcallexpr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_funcallexpr.hasNext() ) {
                            adaptor.addChild(root_2, stream_funcallexpr.nextTree());

                        }
                        stream_funcallexpr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // LogoTurtle.g:106:9: 'print' funcallexpr
                    {
                    string_literal42=(Token)match(input,44,FOLLOW_44_in_statement502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal42);

                    pushFollow(FOLLOW_funcallexpr_in_statement504);
                    funcallexpr43=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr43.getTree());


                    // AST REWRITE
                    // elements: funcallexpr, 44
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:29: -> ^( FUNCALL 'print' funcallexpr )
                    {
                        // LogoTurtle.g:106:32: ^( FUNCALL 'print' funcallexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_44.nextNode());
                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // LogoTurtle.g:107:7: 'pendown'
                    {
                    string_literal44=(Token)match(input,45,FOLLOW_45_in_statement522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_45.add(string_literal44);



                    // AST REWRITE
                    // elements: 45
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:17: -> ^( FUNCALL 'pendown' )
                    {
                        // LogoTurtle.g:107:20: ^( FUNCALL 'pendown' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_45.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // LogoTurtle.g:108:7: 'pd'
                    {
                    string_literal45=(Token)match(input,46,FOLLOW_46_in_statement538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(string_literal45);



                    // AST REWRITE
                    // elements: 45
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:12: -> ^( FUNCALL 'pendown' )
                    {
                        // LogoTurtle.g:108:15: ^( FUNCALL 'pendown' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(45, "45"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // LogoTurtle.g:109:7: 'penup'
                    {
                    string_literal46=(Token)match(input,47,FOLLOW_47_in_statement554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal46);



                    // AST REWRITE
                    // elements: 47
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:15: -> ^( FUNCALL 'penup' )
                    {
                        // LogoTurtle.g:109:18: ^( FUNCALL 'penup' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_47.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // LogoTurtle.g:110:7: 'pu'
                    {
                    string_literal47=(Token)match(input,48,FOLLOW_48_in_statement570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_48.add(string_literal47);



                    // AST REWRITE
                    // elements: 47
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:12: -> ^( FUNCALL 'penup' )
                    {
                        // LogoTurtle.g:110:15: ^( FUNCALL 'penup' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(47, "47"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // LogoTurtle.g:111:7: FD funcallexpr
                    {
                    FD48=(Token)match(input,FD,FOLLOW_FD_in_statement586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FD.add(FD48);

                    pushFollow(FOLLOW_funcallexpr_in_statement588);
                    funcallexpr49=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr49.getTree());


                    // AST REWRITE
                    // elements: funcallexpr, FD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:22: -> ^( FUNCALL FD funcallexpr )
                    {
                        // LogoTurtle.g:111:25: ^( FUNCALL FD funcallexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_FD.nextNode());
                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // LogoTurtle.g:112:9: BK funcallexpr
                    {
                    BK50=(Token)match(input,BK,FOLLOW_BK_in_statement608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BK.add(BK50);

                    pushFollow(FOLLOW_funcallexpr_in_statement610);
                    funcallexpr51=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr51.getTree());


                    // AST REWRITE
                    // elements: BK, funcallexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:24: -> ^( FUNCALL BK funcallexpr )
                    {
                        // LogoTurtle.g:112:27: ^( FUNCALL BK funcallexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_BK.nextNode());
                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // LogoTurtle.g:113:7: LT funcallexpr
                    {
                    LT52=(Token)match(input,LT,FOLLOW_LT_in_statement628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT52);

                    pushFollow(FOLLOW_funcallexpr_in_statement630);
                    funcallexpr53=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr53.getTree());


                    // AST REWRITE
                    // elements: LT, funcallexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:22: -> ^( FUNCALL LT funcallexpr )
                    {
                        // LogoTurtle.g:113:25: ^( FUNCALL LT funcallexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_LT.nextNode());
                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // LogoTurtle.g:114:7: RT funcallexpr
                    {
                    RT54=(Token)match(input,RT,FOLLOW_RT_in_statement648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RT.add(RT54);

                    pushFollow(FOLLOW_funcallexpr_in_statement650);
                    funcallexpr55=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr55.getTree());


                    // AST REWRITE
                    // elements: funcallexpr, RT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:22: -> ^( FUNCALL RT funcallexpr )
                    {
                        // LogoTurtle.g:114:25: ^( FUNCALL RT funcallexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_RT.nextNode());
                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // LogoTurtle.g:115:7: SH funcallexpr
                    {
                    SH56=(Token)match(input,SH,FOLLOW_SH_in_statement668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SH.add(SH56);

                    pushFollow(FOLLOW_funcallexpr_in_statement670);
                    funcallexpr57=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(funcallexpr57.getTree());


                    // AST REWRITE
                    // elements: SH, funcallexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:22: -> ^( FUNCALL SH funcallexpr )
                    {
                        // LogoTurtle.g:115:25: ^( FUNCALL SH funcallexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_SH.nextNode());
                        adaptor.addChild(root_1, stream_funcallexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // LogoTurtle.g:116:7: 'make' a= funcallexpr b= funcallexpr
                    {
                    string_literal58=(Token)match(input,49,FOLLOW_49_in_statement688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(string_literal58);

                    pushFollow(FOLLOW_funcallexpr_in_statement692);
                    a=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(a.getTree());
                    pushFollow(FOLLOW_funcallexpr_in_statement696);
                    b=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(b.getTree());


                    // AST REWRITE
                    // elements: 49, b, a
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:42: -> ^( FUNCALL 'make' $a $b)
                    {
                        // LogoTurtle.g:116:45: ^( FUNCALL 'make' $a $b)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_49.nextNode());
                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // LogoTurtle.g:117:7: 'setpos' '[' (int1= funcallexpr ) (int2= funcallexpr ) ']'
                    {
                    string_literal59=(Token)match(input,50,FOLLOW_50_in_statement718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(string_literal59);

                    char_literal60=(Token)match(input,41,FOLLOW_41_in_statement720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal60);

                    // LogoTurtle.g:117:20: (int1= funcallexpr )
                    // LogoTurtle.g:117:21: int1= funcallexpr
                    {
                    pushFollow(FOLLOW_funcallexpr_in_statement725);
                    int1=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(int1.getTree());

                    }

                    // LogoTurtle.g:117:39: (int2= funcallexpr )
                    // LogoTurtle.g:117:40: int2= funcallexpr
                    {
                    pushFollow(FOLLOW_funcallexpr_in_statement731);
                    int2=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(int2.getTree());

                    }

                    char_literal61=(Token)match(input,42,FOLLOW_42_in_statement734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal61);



                    // AST REWRITE
                    // elements: int1, 50, int2
                    // token labels: 
                    // rule labels: retval, int1, int2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_int1=new RewriteRuleSubtreeStream(adaptor,"rule int1",int1!=null?int1.tree:null);
                    RewriteRuleSubtreeStream stream_int2=new RewriteRuleSubtreeStream(adaptor,"rule int2",int2!=null?int2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:61: -> ^( FUNCALL 'setpos' $int1 $int2)
                    {
                        // LogoTurtle.g:117:64: ^( FUNCALL 'setpos' $int1 $int2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_50.nextNode());
                        adaptor.addChild(root_1, stream_int1.nextTree());
                        adaptor.addChild(root_1, stream_int2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // LogoTurtle.g:118:7: 'circle' (int1= funcallexpr ) (int2= funcallexpr )
                    {
                    string_literal62=(Token)match(input,51,FOLLOW_51_in_statement755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(string_literal62);

                    // LogoTurtle.g:118:16: (int1= funcallexpr )
                    // LogoTurtle.g:118:17: int1= funcallexpr
                    {
                    pushFollow(FOLLOW_funcallexpr_in_statement760);
                    int1=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(int1.getTree());

                    }

                    // LogoTurtle.g:118:35: (int2= funcallexpr )
                    // LogoTurtle.g:118:36: int2= funcallexpr
                    {
                    pushFollow(FOLLOW_funcallexpr_in_statement766);
                    int2=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(int2.getTree());

                    }



                    // AST REWRITE
                    // elements: int1, int2, 51
                    // token labels: 
                    // rule labels: retval, int1, int2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_int1=new RewriteRuleSubtreeStream(adaptor,"rule int1",int1!=null?int1.tree:null);
                    RewriteRuleSubtreeStream stream_int2=new RewriteRuleSubtreeStream(adaptor,"rule int2",int2!=null?int2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:54: -> ^( FUNCALL 'circle' $int1 $int2)
                    {
                        // LogoTurtle.g:118:57: ^( FUNCALL 'circle' $int1 $int2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_51.nextNode());
                        adaptor.addChild(root_1, stream_int1.nextTree());
                        adaptor.addChild(root_1, stream_int2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // LogoTurtle.g:119:7: 'setpencolor' '[' (int1= funcallexpr ) (int2= funcallexpr ) (int3= funcallexpr ) ']'
                    {
                    string_literal63=(Token)match(input,52,FOLLOW_52_in_statement789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(string_literal63);

                    char_literal64=(Token)match(input,41,FOLLOW_41_in_statement791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal64);

                    // LogoTurtle.g:119:25: (int1= funcallexpr )
                    // LogoTurtle.g:119:26: int1= funcallexpr
                    {
                    pushFollow(FOLLOW_funcallexpr_in_statement796);
                    int1=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(int1.getTree());

                    }

                    // LogoTurtle.g:119:44: (int2= funcallexpr )
                    // LogoTurtle.g:119:45: int2= funcallexpr
                    {
                    pushFollow(FOLLOW_funcallexpr_in_statement802);
                    int2=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(int2.getTree());

                    }

                    // LogoTurtle.g:119:63: (int3= funcallexpr )
                    // LogoTurtle.g:119:64: int3= funcallexpr
                    {
                    pushFollow(FOLLOW_funcallexpr_in_statement808);
                    int3=funcallexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcallexpr.add(int3.getTree());

                    }

                    char_literal65=(Token)match(input,42,FOLLOW_42_in_statement811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(char_literal65);



                    // AST REWRITE
                    // elements: int2, 52, int1, int3
                    // token labels: 
                    // rule labels: retval, int3, int1, int2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_int3=new RewriteRuleSubtreeStream(adaptor,"rule int3",int3!=null?int3.tree:null);
                    RewriteRuleSubtreeStream stream_int1=new RewriteRuleSubtreeStream(adaptor,"rule int1",int1!=null?int1.tree:null);
                    RewriteRuleSubtreeStream stream_int2=new RewriteRuleSubtreeStream(adaptor,"rule int2",int2!=null?int2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:86: -> ^( FUNCALL 'setpencolor' $int1 $int2 $int3)
                    {
                        // LogoTurtle.g:119:89: ^( FUNCALL 'setpencolor' $int1 $int2 $int3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_52.nextNode());
                        adaptor.addChild(root_1, stream_int1.nextTree());
                        adaptor.addChild(root_1, stream_int2.nextTree());
                        adaptor.addChild(root_1, stream_int3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // LogoTurtle.g:120:7: 'beginfill'
                    {
                    string_literal66=(Token)match(input,53,FOLLOW_53_in_statement840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(string_literal66);



                    // AST REWRITE
                    // elements: 53
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:19: -> ^( FUNCALL 'beginfill' )
                    {
                        // LogoTurtle.g:120:22: ^( FUNCALL 'beginfill' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_53.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // LogoTurtle.g:121:7: 'endfill'
                    {
                    string_literal67=(Token)match(input,54,FOLLOW_54_in_statement856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(string_literal67);



                    // AST REWRITE
                    // elements: 54
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:17: -> ^( FUNCALL 'endfill' )
                    {
                        // LogoTurtle.g:121:20: ^( FUNCALL 'endfill' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_54.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class funcallexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcallexpr"
    // LogoTurtle.g:124:1: funcallexpr : simpleexpr ;
    public final LogoTurtleParser.funcallexpr_return funcallexpr() throws RecognitionException {
        LogoTurtleParser.funcallexpr_return retval = new LogoTurtleParser.funcallexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoTurtleParser.simpleexpr_return simpleexpr68 = null;



        try {
            // LogoTurtle.g:125:2: ( simpleexpr )
            // LogoTurtle.g:125:4: simpleexpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleexpr_in_funcallexpr877);
            simpleexpr68=simpleexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleexpr68.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcallexpr"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // LogoTurtle.g:133:1: expression : simpleexpr ;
    public final LogoTurtleParser.expression_return expression() throws RecognitionException {
        LogoTurtleParser.expression_return retval = new LogoTurtleParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoTurtleParser.simpleexpr_return simpleexpr69 = null;



        try {
            // LogoTurtle.g:134:2: ( simpleexpr )
            // LogoTurtle.g:135:5: simpleexpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleexpr_in_expression947);
            simpleexpr69=simpleexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleexpr69.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class simpleexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleexpr"
    // LogoTurtle.g:137:1: simpleexpr : term ( COMPAREOP term )* ;
    public final LogoTurtleParser.simpleexpr_return simpleexpr() throws RecognitionException {
        LogoTurtleParser.simpleexpr_return retval = new LogoTurtleParser.simpleexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP71=null;
        LogoTurtleParser.term_return term70 = null;

        LogoTurtleParser.term_return term72 = null;


        Object COMPAREOP71_tree=null;

        try {
            // LogoTurtle.g:138:2: ( term ( COMPAREOP term )* )
            // LogoTurtle.g:138:4: term ( COMPAREOP term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_simpleexpr957);
            term70=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term70.getTree());
            // LogoTurtle.g:138:9: ( COMPAREOP term )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMPAREOP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // LogoTurtle.g:138:10: COMPAREOP term
            	    {
            	    COMPAREOP71=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_simpleexpr960); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMPAREOP71_tree = (Object)adaptor.create(COMPAREOP71);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP71_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_term_in_simpleexpr963);
            	    term72=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term72.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleexpr"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // LogoTurtle.g:140:1: term : factor ( TERMOP factor )* ;
    public final LogoTurtleParser.term_return term() throws RecognitionException {
        LogoTurtleParser.term_return retval = new LogoTurtleParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TERMOP74=null;
        LogoTurtleParser.factor_return factor73 = null;

        LogoTurtleParser.factor_return factor75 = null;


        Object TERMOP74_tree=null;

        try {
            // LogoTurtle.g:140:6: ( factor ( TERMOP factor )* )
            // LogoTurtle.g:141:3: factor ( TERMOP factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term976);
            factor73=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor73.getTree());
            // LogoTurtle.g:141:10: ( TERMOP factor )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==TERMOP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // LogoTurtle.g:141:11: TERMOP factor
            	    {
            	    TERMOP74=(Token)match(input,TERMOP,FOLLOW_TERMOP_in_term979); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TERMOP74_tree = (Object)adaptor.create(TERMOP74);
            	    root_0 = (Object)adaptor.becomeRoot(TERMOP74_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_factor_in_term982);
            	    factor75=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor75.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // LogoTurtle.g:143:1: factor : unary ( FACTOROP unary )* ;
    public final LogoTurtleParser.factor_return factor() throws RecognitionException {
        LogoTurtleParser.factor_return retval = new LogoTurtleParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FACTOROP77=null;
        LogoTurtleParser.unary_return unary76 = null;

        LogoTurtleParser.unary_return unary78 = null;


        Object FACTOROP77_tree=null;

        try {
            // LogoTurtle.g:143:8: ( unary ( FACTOROP unary )* )
            // LogoTurtle.g:144:3: unary ( FACTOROP unary )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_in_factor995);
            unary76=unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unary76.getTree());
            // LogoTurtle.g:144:9: ( FACTOROP unary )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==FACTOROP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // LogoTurtle.g:144:10: FACTOROP unary
            	    {
            	    FACTOROP77=(Token)match(input,FACTOROP,FOLLOW_FACTOROP_in_factor998); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    FACTOROP77_tree = (Object)adaptor.create(FACTOROP77);
            	    root_0 = (Object)adaptor.becomeRoot(FACTOROP77_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unary_in_factor1001);
            	    unary78=unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary78.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary"
    // LogoTurtle.g:146:1: unary : ( '\"' ID -> ^( QUOTE ID ) | ':' ID -> ^( COLON ID ) | atom );
    public final LogoTurtleParser.unary_return unary() throws RecognitionException {
        LogoTurtleParser.unary_return retval = new LogoTurtleParser.unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal79=null;
        Token ID80=null;
        Token char_literal81=null;
        Token ID82=null;
        LogoTurtleParser.atom_return atom83 = null;


        Object char_literal79_tree=null;
        Object ID80_tree=null;
        Object char_literal81_tree=null;
        Object ID82_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // LogoTurtle.g:146:7: ( '\"' ID -> ^( QUOTE ID ) | ':' ID -> ^( COLON ID ) | atom )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt13=1;
                }
                break;
            case 40:
                {
                alt13=2;
                }
                break;
            case ID:
            case FLOAT:
            case INTEGER:
            case 37:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // LogoTurtle.g:147:3: '\"' ID
                    {
                    char_literal79=(Token)match(input,55,FOLLOW_55_in_unary1016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal79);

                    ID80=(Token)match(input,ID,FOLLOW_ID_in_unary1018); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID80);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:10: -> ^( QUOTE ID )
                    {
                        // LogoTurtle.g:147:13: ^( QUOTE ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUOTE, "QUOTE"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // LogoTurtle.g:148:4: ':' ID
                    {
                    char_literal81=(Token)match(input,40,FOLLOW_40_in_unary1031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal81);

                    ID82=(Token)match(input,ID,FOLLOW_ID_in_unary1033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID82);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:11: -> ^( COLON ID )
                    {
                        // LogoTurtle.g:148:14: ^( COLON ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLON, "COLON"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // LogoTurtle.g:149:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unary1046);
                    atom83=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom83.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // LogoTurtle.g:151:1: atom : ( ID '(' ( simpleexpr )* ')' -> ^( FUNCALL ID ( simpleexpr )* ) | '(' simpleexpr ')' | FLOAT -> ^( FLOATCONST FLOAT ) | INTEGER -> ^( INTCONST INTEGER ) );
    public final LogoTurtleParser.atom_return atom() throws RecognitionException {
        LogoTurtleParser.atom_return retval = new LogoTurtleParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Token FLOAT91=null;
        Token INTEGER92=null;
        LogoTurtleParser.simpleexpr_return simpleexpr86 = null;

        LogoTurtleParser.simpleexpr_return simpleexpr89 = null;


        Object ID84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal90_tree=null;
        Object FLOAT91_tree=null;
        Object INTEGER92_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_simpleexpr=new RewriteRuleSubtreeStream(adaptor,"rule simpleexpr");
        try {
            // LogoTurtle.g:151:6: ( ID '(' ( simpleexpr )* ')' -> ^( FUNCALL ID ( simpleexpr )* ) | '(' simpleexpr ')' | FLOAT -> ^( FLOATCONST FLOAT ) | INTEGER -> ^( INTCONST INTEGER ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case FLOAT:
                {
                alt15=3;
                }
                break;
            case INTEGER:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // LogoTurtle.g:152:3: ID '(' ( simpleexpr )* ')'
                    {
                    ID84=(Token)match(input,ID,FOLLOW_ID_in_atom1057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID84);

                    char_literal85=(Token)match(input,37,FOLLOW_37_in_atom1059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal85);

                    // LogoTurtle.g:152:10: ( simpleexpr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==ID||(LA14_0>=FLOAT && LA14_0<=INTEGER)||LA14_0==37||LA14_0==40||LA14_0==55) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // LogoTurtle.g:152:10: simpleexpr
                    	    {
                    	    pushFollow(FOLLOW_simpleexpr_in_atom1061);
                    	    simpleexpr86=simpleexpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_simpleexpr.add(simpleexpr86.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    char_literal87=(Token)match(input,38,FOLLOW_38_in_atom1064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal87);



                    // AST REWRITE
                    // elements: ID, simpleexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:26: -> ^( FUNCALL ID ( simpleexpr )* )
                    {
                        // LogoTurtle.g:152:29: ^( FUNCALL ID ( simpleexpr )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // LogoTurtle.g:152:42: ( simpleexpr )*
                        while ( stream_simpleexpr.hasNext() ) {
                            adaptor.addChild(root_1, stream_simpleexpr.nextTree());

                        }
                        stream_simpleexpr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // LogoTurtle.g:153:4: '(' simpleexpr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal88=(Token)match(input,37,FOLLOW_37_in_atom1080); if (state.failed) return retval;
                    pushFollow(FOLLOW_simpleexpr_in_atom1083);
                    simpleexpr89=simpleexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleexpr89.getTree());
                    char_literal90=(Token)match(input,38,FOLLOW_38_in_atom1085); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // LogoTurtle.g:154:4: FLOAT
                    {
                    FLOAT91=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom1091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT91);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:10: -> ^( FLOATCONST FLOAT )
                    {
                        // LogoTurtle.g:154:13: ^( FLOATCONST FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOATCONST, "FLOATCONST"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // LogoTurtle.g:155:4: INTEGER
                    {
                    INTEGER92=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom1104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTEGER.add(INTEGER92);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:12: -> ^( INTCONST INTEGER )
                    {
                        // LogoTurtle.g:155:15: ^( INTCONST INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INTCONST, "INTCONST"), root_1);

                        adaptor.addChild(root_1, stream_INTEGER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\30\uffff";
    static final String DFA3_eofS =
        "\1\1\27\uffff";
    static final String DFA3_minS =
        "\1\21\27\uffff";
    static final String DFA3_maxS =
        "\1\66\27\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\26\1";
    static final String DFA3_specialS =
        "\30\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\6\1\2\1\3\1\4\1\15\1\16\1\17\1\20\1\21\12\uffff\1\1\1\7\1"+
            "\uffff\1\1\2\uffff\1\1\1\5\1\10\1\11\1\12\1\13\1\14\1\22\1\23"+
            "\1\24\1\25\1\26\1\27",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()+ loopback of 90:8: ( options {greedy=true; } : statement )+";
        }
    }
 

    public static final BitSet FOLLOW_elementary_unit_in_translation_unit161 = new BitSet(new long[]{0x007FF83003FE0002L});
    public static final BitSet FOLLOW_block_in_elementary_unit182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_elementary_unit189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block213 = new BitSet(new long[]{0x007FF82003FE0002L});
    public static final BitSet FOLLOW_36_in_function_definition233 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_function_definition235 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_function_definition237 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_argument_in_function_definition240 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_38_in_function_definition244 = new BitSet(new long[]{0x007FF82003FE0000L});
    public static final BitSet FOLLOW_block_in_function_definition246 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_function_definition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_argument276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_argument279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement294 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement297 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement300 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement302 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement305 = new BitSet(new long[]{0x007FF82003FE0000L});
    public static final BitSet FOLLOW_statement_in_statement307 = new BitSet(new long[]{0x007FFC2003FE0000L});
    public static final BitSet FOLLOW_42_in_statement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement332 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement334 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement336 = new BitSet(new long[]{0x007FF82003FE0000L});
    public static final BitSet FOLLOW_statement_in_statement340 = new BitSet(new long[]{0x007FFC2003FE0000L});
    public static final BitSet FOLLOW_42_in_statement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFELSE_in_statement368 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement370 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement372 = new BitSet(new long[]{0x007FF82003FE0000L});
    public static final BitSet FOLLOW_block_in_statement376 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement378 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement381 = new BitSet(new long[]{0x007FF82003FE0000L});
    public static final BitSet FOLLOW_block_in_statement386 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_statement410 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement430 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_statement432 = new BitSet(new long[]{0x0080016060020000L});
    public static final BitSet FOLLOW_simpleexpr_in_statement434 = new BitSet(new long[]{0x0080016060020000L});
    public static final BitSet FOLLOW_38_in_statement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_statement460 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_statement462 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement473 = new BitSet(new long[]{0x0080016060020000L});
    public static final BitSet FOLLOW_38_in_statement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_statement502 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_statement522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_statement538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_statement554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_statement570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FD_in_statement586 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BK_in_statement608 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_statement628 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RT_in_statement648 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SH_in_statement668 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_statement688 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement692 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_statement718 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement720 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement725 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement731 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_statement755 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement760 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_statement789 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement791 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement796 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement802 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_funcallexpr_in_statement808 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_statement840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_statement856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpr_in_funcallexpr877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpr_in_expression947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleexpr957 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMPAREOP_in_simpleexpr960 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_term_in_simpleexpr963 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_factor_in_term976 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_TERMOP_in_term979 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_factor_in_term982 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_unary_in_factor995 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_FACTOROP_in_factor998 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_unary_in_factor1001 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_55_in_unary1016 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_unary1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_unary1031 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_unary1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unary1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1057 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_atom1059 = new BitSet(new long[]{0x0080016060020000L});
    public static final BitSet FOLLOW_simpleexpr_in_atom1061 = new BitSet(new long[]{0x0080016060020000L});
    public static final BitSet FOLLOW_38_in_atom1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_atom1080 = new BitSet(new long[]{0x0080012060020000L});
    public static final BitSet FOLLOW_simpleexpr_in_atom1083 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_atom1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom1104 = new BitSet(new long[]{0x0000000000000002L});

}