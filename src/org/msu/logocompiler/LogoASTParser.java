// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogoAST.g 2011-02-16 02:47:16

package org.msu.logocompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LogoASTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCALL", "BLOCK", "WHILE", "IF", "COMMAND", "COMPAREOP", "TERMOP", "FACTOROP", "REFOP", "ID", "NUMBER", "LETTER", "NEWLINE", "COMMENT", "WHITESPACE", "DIGIT", "'['", "']'", "'('", "')'"
    };
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


        public LogoASTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoASTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LogoASTParser.tokenNames; }
    public String getGrammarFileName() { return "LogoAST.g"; }


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
        


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // LogoAST.g:63:1: block : ( statement )+ -> ^( BLOCK ( statement )+ ) ;
    public final LogoASTParser.block_return block() throws RecognitionException {
        LogoASTParser.block_return retval = new LogoASTParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoASTParser.statement_return statement1 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // LogoAST.g:63:6: ( ( statement )+ -> ^( BLOCK ( statement )+ ) )
            // LogoAST.g:64:9: ( statement )+
            {
            // LogoAST.g:64:9: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=WHILE && LA1_0<=COMMAND)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // LogoAST.g:64:9: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block76);
            	    statement1=statement();

            	    state._fsp--;

            	    stream_statement.add(statement1.getTree());

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



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:20: -> ^( BLOCK ( statement )+ )
            {
                // LogoAST.g:64:23: ^( BLOCK ( statement )+ )
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

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // LogoAST.g:66:1: statement : ( WHILE '[' expression ']' '[' ( statement )+ ']' -> ^( WHILE expression ^( BLOCK ( statement )+ ) ) | IF expression '[' ( statement )+ ']' -> ^( IF expression ^( BLOCK ( statement )+ ) ) | COMMAND ( expression )* -> ^( FUNCALL COMMAND ( expression )* ) );
    public final LogoASTParser.statement_return statement() throws RecognitionException {
        LogoASTParser.statement_return retval = new LogoASTParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        Token IF9=null;
        Token char_literal11=null;
        Token char_literal13=null;
        Token COMMAND14=null;
        LogoASTParser.expression_return expression4 = null;

        LogoASTParser.statement_return statement7 = null;

        LogoASTParser.expression_return expression10 = null;

        LogoASTParser.statement_return statement12 = null;

        LogoASTParser.expression_return expression15 = null;


        Object WHILE2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        Object IF9_tree=null;
        Object char_literal11_tree=null;
        Object char_literal13_tree=null;
        Object COMMAND14_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_COMMAND=new RewriteRuleTokenStream(adaptor,"token COMMAND");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // LogoAST.g:66:10: ( WHILE '[' expression ']' '[' ( statement )+ ']' -> ^( WHILE expression ^( BLOCK ( statement )+ ) ) | IF expression '[' ( statement )+ ']' -> ^( IF expression ^( BLOCK ( statement )+ ) ) | COMMAND ( expression )* -> ^( FUNCALL COMMAND ( expression )* ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt5=1;
                }
                break;
            case IF:
                {
                alt5=2;
                }
                break;
            case COMMAND:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // LogoAST.g:67:13: WHILE '[' expression ']' '[' ( statement )+ ']'
                    {
                    WHILE2=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement105);  
                    stream_WHILE.add(WHILE2);

                    char_literal3=(Token)match(input,20,FOLLOW_20_in_statement107);  
                    stream_20.add(char_literal3);

                    pushFollow(FOLLOW_expression_in_statement109);
                    expression4=expression();

                    state._fsp--;

                    stream_expression.add(expression4.getTree());
                    char_literal5=(Token)match(input,21,FOLLOW_21_in_statement111);  
                    stream_21.add(char_literal5);

                    char_literal6=(Token)match(input,20,FOLLOW_20_in_statement113);  
                    stream_20.add(char_literal6);

                    // LogoAST.g:67:42: ( statement )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=WHILE && LA2_0<=COMMAND)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // LogoAST.g:67:42: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement115);
                    	    statement7=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement7.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    char_literal8=(Token)match(input,21,FOLLOW_21_in_statement118);  
                    stream_21.add(char_literal8);



                    // AST REWRITE
                    // elements: expression, statement, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:57: -> ^( WHILE expression ^( BLOCK ( statement )+ ) )
                    {
                        // LogoAST.g:67:60: ^( WHILE expression ^( BLOCK ( statement )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // LogoAST.g:67:79: ^( BLOCK ( statement )+ )
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

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // LogoAST.g:68:11: IF expression '[' ( statement )+ ']'
                    {
                    IF9=(Token)match(input,IF,FOLLOW_IF_in_statement145);  
                    stream_IF.add(IF9);

                    pushFollow(FOLLOW_expression_in_statement147);
                    expression10=expression();

                    state._fsp--;

                    stream_expression.add(expression10.getTree());
                    char_literal11=(Token)match(input,20,FOLLOW_20_in_statement149);  
                    stream_20.add(char_literal11);

                    // LogoAST.g:68:29: ( statement )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=WHILE && LA3_0<=COMMAND)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // LogoAST.g:68:29: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement151);
                    	    statement12=statement();

                    	    state._fsp--;

                    	    stream_statement.add(statement12.getTree());

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

                    char_literal13=(Token)match(input,21,FOLLOW_21_in_statement154);  
                    stream_21.add(char_literal13);



                    // AST REWRITE
                    // elements: expression, statement, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:44: -> ^( IF expression ^( BLOCK ( statement )+ ) )
                    {
                        // LogoAST.g:68:47: ^( IF expression ^( BLOCK ( statement )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // LogoAST.g:68:63: ^( BLOCK ( statement )+ )
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

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // LogoAST.g:69:11: COMMAND ( expression )*
                    {
                    COMMAND14=(Token)match(input,COMMAND,FOLLOW_COMMAND_in_statement181);  
                    stream_COMMAND.add(COMMAND14);

                    // LogoAST.g:69:19: ( expression )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=REFOP && LA4_0<=NUMBER)||LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // LogoAST.g:69:19: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_statement183);
                    	    expression15=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression15.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: COMMAND, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:31: -> ^( FUNCALL COMMAND ( expression )* )
                    {
                        // LogoAST.g:69:34: ^( FUNCALL COMMAND ( expression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_COMMAND.nextNode());
                        // LogoAST.g:69:52: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // LogoAST.g:72:1: expression : term ( COMPAREOP term )* ;
    public final LogoASTParser.expression_return expression() throws RecognitionException {
        LogoASTParser.expression_return retval = new LogoASTParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP17=null;
        LogoASTParser.term_return term16 = null;

        LogoASTParser.term_return term18 = null;


        Object COMPAREOP17_tree=null;

        try {
            // LogoAST.g:73:2: ( term ( COMPAREOP term )* )
            // LogoAST.g:73:4: term ( COMPAREOP term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_expression205);
            term16=term();

            state._fsp--;

            adaptor.addChild(root_0, term16.getTree());
            // LogoAST.g:73:9: ( COMPAREOP term )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMPAREOP) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // LogoAST.g:73:10: COMPAREOP term
            	    {
            	    COMPAREOP17=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_expression208); 
            	    COMPAREOP17_tree = (Object)adaptor.create(COMPAREOP17);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP17_tree, root_0);

            	    pushFollow(FOLLOW_term_in_expression211);
            	    term18=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // LogoAST.g:75:1: term : factor ( TERMOP factor )* ;
    public final LogoASTParser.term_return term() throws RecognitionException {
        LogoASTParser.term_return retval = new LogoASTParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TERMOP20=null;
        LogoASTParser.factor_return factor19 = null;

        LogoASTParser.factor_return factor21 = null;


        Object TERMOP20_tree=null;

        try {
            // LogoAST.g:75:6: ( factor ( TERMOP factor )* )
            // LogoAST.g:76:3: factor ( TERMOP factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term224);
            factor19=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor19.getTree());
            // LogoAST.g:76:10: ( TERMOP factor )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==TERMOP) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // LogoAST.g:76:11: TERMOP factor
            	    {
            	    TERMOP20=(Token)match(input,TERMOP,FOLLOW_TERMOP_in_term227); 
            	    TERMOP20_tree = (Object)adaptor.create(TERMOP20);
            	    root_0 = (Object)adaptor.becomeRoot(TERMOP20_tree, root_0);

            	    pushFollow(FOLLOW_factor_in_term230);
            	    factor21=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor21.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // LogoAST.g:78:1: factor : ref ( FACTOROP ref )* ;
    public final LogoASTParser.factor_return factor() throws RecognitionException {
        LogoASTParser.factor_return retval = new LogoASTParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FACTOROP23=null;
        LogoASTParser.ref_return ref22 = null;

        LogoASTParser.ref_return ref24 = null;


        Object FACTOROP23_tree=null;

        try {
            // LogoAST.g:78:8: ( ref ( FACTOROP ref )* )
            // LogoAST.g:79:3: ref ( FACTOROP ref )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ref_in_factor243);
            ref22=ref();

            state._fsp--;

            adaptor.addChild(root_0, ref22.getTree());
            // LogoAST.g:79:7: ( FACTOROP ref )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==FACTOROP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // LogoAST.g:79:8: FACTOROP ref
            	    {
            	    FACTOROP23=(Token)match(input,FACTOROP,FOLLOW_FACTOROP_in_factor246); 
            	    FACTOROP23_tree = (Object)adaptor.create(FACTOROP23);
            	    root_0 = (Object)adaptor.becomeRoot(FACTOROP23_tree, root_0);

            	    pushFollow(FOLLOW_ref_in_factor249);
            	    ref24=ref();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ref24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class ref_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ref"
    // LogoAST.g:81:1: ref : ( REFOP atom -> ^( REFOP atom ) | atom );
    public final LogoASTParser.ref_return ref() throws RecognitionException {
        LogoASTParser.ref_return retval = new LogoASTParser.ref_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFOP25=null;
        LogoASTParser.atom_return atom26 = null;

        LogoASTParser.atom_return atom27 = null;


        Object REFOP25_tree=null;
        RewriteRuleTokenStream stream_REFOP=new RewriteRuleTokenStream(adaptor,"token REFOP");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // LogoAST.g:81:5: ( REFOP atom -> ^( REFOP atom ) | atom )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==REFOP) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=ID && LA9_0<=NUMBER)||LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // LogoAST.g:82:3: REFOP atom
                    {
                    REFOP25=(Token)match(input,REFOP,FOLLOW_REFOP_in_ref264);  
                    stream_REFOP.add(REFOP25);

                    pushFollow(FOLLOW_atom_in_ref266);
                    atom26=atom();

                    state._fsp--;

                    stream_atom.add(atom26.getTree());


                    // AST REWRITE
                    // elements: atom, REFOP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:15: -> ^( REFOP atom )
                    {
                        // LogoAST.g:82:18: ^( REFOP atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_REFOP.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // LogoAST.g:83:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_ref280);
                    atom27=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "ref"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // LogoAST.g:85:1: atom : ( '(' expression ')' | ID | NUMBER );
    public final LogoASTParser.atom_return atom() throws RecognitionException {
        LogoASTParser.atom_return retval = new LogoASTParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        Token ID31=null;
        Token NUMBER32=null;
        LogoASTParser.expression_return expression29 = null;


        Object char_literal28_tree=null;
        Object char_literal30_tree=null;
        Object ID31_tree=null;
        Object NUMBER32_tree=null;

        try {
            // LogoAST.g:85:6: ( '(' expression ')' | ID | NUMBER )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case ID:
                {
                alt10=2;
                }
                break;
            case NUMBER:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // LogoAST.g:86:3: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal28=(Token)match(input,22,FOLLOW_22_in_atom291); 
                    pushFollow(FOLLOW_expression_in_atom294);
                    expression29=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression29.getTree());
                    char_literal30=(Token)match(input,23,FOLLOW_23_in_atom296); 

                    }
                    break;
                case 2 :
                    // LogoAST.g:87:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID31=(Token)match(input,ID,FOLLOW_ID_in_atom302); 
                    ID31_tree = (Object)adaptor.create(ID31);
                    adaptor.addChild(root_0, ID31_tree);


                    }
                    break;
                case 3 :
                    // LogoAST.g:88:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER32=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom307); 
                    NUMBER32_tree = (Object)adaptor.create(NUMBER32);
                    adaptor.addChild(root_0, NUMBER32_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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


 

    public static final BitSet FOLLOW_statement_in_block76 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_WHILE_in_statement105 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement107 = new BitSet(new long[]{0x0000000000407000L});
    public static final BitSet FOLLOW_expression_in_statement109 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_statement111 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement113 = new BitSet(new long[]{0x00000000002001C0L});
    public static final BitSet FOLLOW_statement_in_statement115 = new BitSet(new long[]{0x00000000002001C0L});
    public static final BitSet FOLLOW_21_in_statement118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement145 = new BitSet(new long[]{0x0000000000407000L});
    public static final BitSet FOLLOW_expression_in_statement147 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement149 = new BitSet(new long[]{0x00000000002001C0L});
    public static final BitSet FOLLOW_statement_in_statement151 = new BitSet(new long[]{0x00000000002001C0L});
    public static final BitSet FOLLOW_21_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_in_statement181 = new BitSet(new long[]{0x0000000000407002L});
    public static final BitSet FOLLOW_expression_in_statement183 = new BitSet(new long[]{0x0000000000407002L});
    public static final BitSet FOLLOW_term_in_expression205 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMPAREOP_in_expression208 = new BitSet(new long[]{0x0000000000407000L});
    public static final BitSet FOLLOW_term_in_expression211 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_factor_in_term224 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_TERMOP_in_term227 = new BitSet(new long[]{0x0000000000407000L});
    public static final BitSet FOLLOW_factor_in_term230 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ref_in_factor243 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_FACTOROP_in_factor246 = new BitSet(new long[]{0x0000000000407000L});
    public static final BitSet FOLLOW_ref_in_factor249 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_REFOP_in_ref264 = new BitSet(new long[]{0x0000000000407000L});
    public static final BitSet FOLLOW_atom_in_ref266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_ref280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_atom291 = new BitSet(new long[]{0x0000000000407000L});
    public static final BitSet FOLLOW_expression_in_atom294 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_atom296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom307 = new BitSet(new long[]{0x0000000000000002L});

}