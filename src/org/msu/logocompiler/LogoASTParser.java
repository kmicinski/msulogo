// $ANTLR 3.3 Nov 30, 2010 12:45:30 LogoAST.g 2011-02-23 18:33:07

package org.msu.logocompiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LogoASTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCALL", "FUNCALLSTMT", "BLOCK", "SEXPR", "WHILE", "IF", "IFELSE", "COMMAND", "COMPAREOP", "TERMOP", "FACTOROP", "REFOP", "ID", "NUMBER", "UNARYOP", "FUNC", "LETTER", "NEWLINE", "COMMENT", "WHITESPACE", "DIGIT", "'['", "']'", "'('", "')'", "'not'"
    };
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
    // LogoAST.g:69:1: block : ( statement )+ -> ^( BLOCK ( statement )+ ) ;
    public final LogoASTParser.block_return block() throws RecognitionException {
        LogoASTParser.block_return retval = new LogoASTParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LogoASTParser.statement_return statement1 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // LogoAST.g:69:6: ( ( statement )+ -> ^( BLOCK ( statement )+ ) )
            // LogoAST.g:70:9: ( statement )+
            {
            // LogoAST.g:70:9: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=WHILE && LA1_0<=COMMAND)||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // LogoAST.g:70:9: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block98);
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
            // 70:20: -> ^( BLOCK ( statement )+ )
            {
                // LogoAST.g:70:23: ^( BLOCK ( statement )+ )
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
    // LogoAST.g:72:1: statement : ( WHILE '[' expression ']' '[' ( statement )+ ']' -> ^( WHILE expression ^( BLOCK ( statement )+ ) ) | IF expression '[' ( statement )+ ']' -> ^( IF expression ^( BLOCK ( statement )+ ) ) | IFELSE expression '[' (ifblock= statement )+ ']' '[' (elseblock= statement )+ ']' -> ^( IF expression ^( BLOCK $ifblock) ^( BLOCK $elseblock) ) | COMMAND ( expression )+ -> ^( FUNCALLSTMT ^( FUNCALL COMMAND ( expression )+ ) ) | '(' COMMAND ( expression )+ ')' -> ^( SEXPR COMMAND ( expression )+ ) );
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
        Token IFELSE14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token COMMAND20=null;
        Token char_literal22=null;
        Token COMMAND23=null;
        Token char_literal25=null;
        LogoASTParser.statement_return ifblock = null;

        LogoASTParser.statement_return elseblock = null;

        LogoASTParser.expression_return expression4 = null;

        LogoASTParser.statement_return statement7 = null;

        LogoASTParser.expression_return expression10 = null;

        LogoASTParser.statement_return statement12 = null;

        LogoASTParser.expression_return expression15 = null;

        LogoASTParser.expression_return expression21 = null;

        LogoASTParser.expression_return expression24 = null;


        Object WHILE2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        Object IF9_tree=null;
        Object char_literal11_tree=null;
        Object char_literal13_tree=null;
        Object IFELSE14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal17_tree=null;
        Object char_literal18_tree=null;
        Object char_literal19_tree=null;
        Object COMMAND20_tree=null;
        Object char_literal22_tree=null;
        Object COMMAND23_tree=null;
        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_IFELSE=new RewriteRuleTokenStream(adaptor,"token IFELSE");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_COMMAND=new RewriteRuleTokenStream(adaptor,"token COMMAND");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // LogoAST.g:72:10: ( WHILE '[' expression ']' '[' ( statement )+ ']' -> ^( WHILE expression ^( BLOCK ( statement )+ ) ) | IF expression '[' ( statement )+ ']' -> ^( IF expression ^( BLOCK ( statement )+ ) ) | IFELSE expression '[' (ifblock= statement )+ ']' '[' (elseblock= statement )+ ']' -> ^( IF expression ^( BLOCK $ifblock) ^( BLOCK $elseblock) ) | COMMAND ( expression )+ -> ^( FUNCALLSTMT ^( FUNCALL COMMAND ( expression )+ ) ) | '(' COMMAND ( expression )+ ')' -> ^( SEXPR COMMAND ( expression )+ ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt8=1;
                }
                break;
            case IF:
                {
                alt8=2;
                }
                break;
            case IFELSE:
                {
                alt8=3;
                }
                break;
            case COMMAND:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // LogoAST.g:73:9: WHILE '[' expression ']' '[' ( statement )+ ']'
                    {
                    WHILE2=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement123);  
                    stream_WHILE.add(WHILE2);

                    char_literal3=(Token)match(input,25,FOLLOW_25_in_statement125);  
                    stream_25.add(char_literal3);

                    pushFollow(FOLLOW_expression_in_statement127);
                    expression4=expression();

                    state._fsp--;

                    stream_expression.add(expression4.getTree());
                    char_literal5=(Token)match(input,26,FOLLOW_26_in_statement129);  
                    stream_26.add(char_literal5);

                    char_literal6=(Token)match(input,25,FOLLOW_25_in_statement131);  
                    stream_25.add(char_literal6);

                    // LogoAST.g:73:38: ( statement )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=WHILE && LA2_0<=COMMAND)||LA2_0==27) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // LogoAST.g:73:38: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement133);
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

                    char_literal8=(Token)match(input,26,FOLLOW_26_in_statement136);  
                    stream_26.add(char_literal8);



                    // AST REWRITE
                    // elements: statement, WHILE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:53: -> ^( WHILE expression ^( BLOCK ( statement )+ ) )
                    {
                        // LogoAST.g:73:56: ^( WHILE expression ^( BLOCK ( statement )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // LogoAST.g:73:75: ^( BLOCK ( statement )+ )
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
                    // LogoAST.g:74:7: IF expression '[' ( statement )+ ']'
                    {
                    IF9=(Token)match(input,IF,FOLLOW_IF_in_statement159);  
                    stream_IF.add(IF9);

                    pushFollow(FOLLOW_expression_in_statement161);
                    expression10=expression();

                    state._fsp--;

                    stream_expression.add(expression10.getTree());
                    char_literal11=(Token)match(input,25,FOLLOW_25_in_statement163);  
                    stream_25.add(char_literal11);

                    // LogoAST.g:74:25: ( statement )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=WHILE && LA3_0<=COMMAND)||LA3_0==27) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // LogoAST.g:74:25: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement165);
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

                    char_literal13=(Token)match(input,26,FOLLOW_26_in_statement168);  
                    stream_26.add(char_literal13);



                    // AST REWRITE
                    // elements: IF, expression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:40: -> ^( IF expression ^( BLOCK ( statement )+ ) )
                    {
                        // LogoAST.g:74:43: ^( IF expression ^( BLOCK ( statement )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // LogoAST.g:74:59: ^( BLOCK ( statement )+ )
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
                    // LogoAST.g:75:9: IFELSE expression '[' (ifblock= statement )+ ']' '[' (elseblock= statement )+ ']'
                    {
                    IFELSE14=(Token)match(input,IFELSE,FOLLOW_IFELSE_in_statement193);  
                    stream_IFELSE.add(IFELSE14);

                    pushFollow(FOLLOW_expression_in_statement195);
                    expression15=expression();

                    state._fsp--;

                    stream_expression.add(expression15.getTree());
                    char_literal16=(Token)match(input,25,FOLLOW_25_in_statement197);  
                    stream_25.add(char_literal16);

                    // LogoAST.g:75:38: (ifblock= statement )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=WHILE && LA4_0<=COMMAND)||LA4_0==27) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // LogoAST.g:75:38: ifblock= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement201);
                    	    ifblock=statement();

                    	    state._fsp--;

                    	    stream_statement.add(ifblock.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    char_literal17=(Token)match(input,26,FOLLOW_26_in_statement204);  
                    stream_26.add(char_literal17);

                    char_literal18=(Token)match(input,25,FOLLOW_25_in_statement206);  
                    stream_25.add(char_literal18);

                    // LogoAST.g:75:67: (elseblock= statement )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=WHILE && LA5_0<=COMMAND)||LA5_0==27) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // LogoAST.g:75:67: elseblock= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement210);
                    	    elseblock=statement();

                    	    state._fsp--;

                    	    stream_statement.add(elseblock.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    char_literal19=(Token)match(input,26,FOLLOW_26_in_statement213);  
                    stream_26.add(char_literal19);



                    // AST REWRITE
                    // elements: expression, ifblock, elseblock
                    // token labels: 
                    // rule labels: ifblock, retval, elseblock
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ifblock=new RewriteRuleSubtreeStream(adaptor,"rule ifblock",ifblock!=null?ifblock.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_elseblock=new RewriteRuleSubtreeStream(adaptor,"rule elseblock",elseblock!=null?elseblock.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:83: -> ^( IF expression ^( BLOCK $ifblock) ^( BLOCK $elseblock) )
                    {
                        // LogoAST.g:75:86: ^( IF expression ^( BLOCK $ifblock) ^( BLOCK $elseblock) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // LogoAST.g:75:102: ^( BLOCK $ifblock)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                        adaptor.addChild(root_2, stream_ifblock.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // LogoAST.g:75:120: ^( BLOCK $elseblock)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                        adaptor.addChild(root_2, stream_elseblock.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // LogoAST.g:76:7: COMMAND ( expression )+
                    {
                    COMMAND20=(Token)match(input,COMMAND,FOLLOW_COMMAND_in_statement243);  
                    stream_COMMAND.add(COMMAND20);

                    // LogoAST.g:76:15: ( expression )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            int LA6_2 = input.LA(2);

                            if ( ((LA6_2>=REFOP && LA6_2<=NUMBER)||LA6_2==FUNC||LA6_2==27||LA6_2==29) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0>=REFOP && LA6_0<=NUMBER)||LA6_0==FUNC||LA6_0==29) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // LogoAST.g:76:15: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_statement245);
                    	    expression21=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression21.getTree());

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
                    // 76:27: -> ^( FUNCALLSTMT ^( FUNCALL COMMAND ( expression )+ ) )
                    {
                        // LogoAST.g:76:30: ^( FUNCALLSTMT ^( FUNCALL COMMAND ( expression )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALLSTMT, "FUNCALLSTMT"), root_1);

                        // LogoAST.g:76:44: ^( FUNCALL COMMAND ( expression )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_2);

                        adaptor.addChild(root_2, stream_COMMAND.nextNode());
                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_2, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // LogoAST.g:77:9: '(' COMMAND ( expression )+ ')'
                    {
                    char_literal22=(Token)match(input,27,FOLLOW_27_in_statement271);  
                    stream_27.add(char_literal22);

                    COMMAND23=(Token)match(input,COMMAND,FOLLOW_COMMAND_in_statement273);  
                    stream_COMMAND.add(COMMAND23);

                    // LogoAST.g:77:21: ( expression )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=REFOP && LA7_0<=NUMBER)||LA7_0==FUNC||LA7_0==27||LA7_0==29) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // LogoAST.g:77:21: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_statement275);
                    	    expression24=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression24.getTree());

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

                    char_literal25=(Token)match(input,28,FOLLOW_28_in_statement278);  
                    stream_28.add(char_literal25);



                    // AST REWRITE
                    // elements: expression, COMMAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:37: -> ^( SEXPR COMMAND ( expression )+ )
                    {
                        // LogoAST.g:77:40: ^( SEXPR COMMAND ( expression )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEXPR, "SEXPR"), root_1);

                        adaptor.addChild(root_1, stream_COMMAND.nextNode());
                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
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
    // LogoAST.g:79:1: expression : ( simpleexpr | 'not' expression -> ^( FUNCALL 'not' expression ) | 'modulo' expr1= expression expr2= expression -> ^( FUNCALL 'modulo' $expr1 $expr2) );
    public final LogoASTParser.expression_return expression() throws RecognitionException {
        LogoASTParser.expression_return retval = new LogoASTParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal27=null;
        Token string_literal29=null;
        LogoASTParser.expression_return expr1 = null;

        LogoASTParser.expression_return expr2 = null;

        LogoASTParser.simpleexpr_return simpleexpr26 = null;

        LogoASTParser.expression_return expression28 = null;


        Object string_literal27_tree=null;
        Object string_literal29_tree=null;
        RewriteRuleTokenStream stream_FUNC=new RewriteRuleTokenStream(adaptor,"token FUNC");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // LogoAST.g:80:2: ( simpleexpr | 'not' expression -> ^( FUNCALL 'not' expression ) | 'modulo' expr1= expression expr2= expression -> ^( FUNCALL 'modulo' $expr1 $expr2) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case REFOP:
            case ID:
            case NUMBER:
            case 27:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case FUNC:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // LogoAST.g:80:4: simpleexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleexpr_in_expression298);
                    simpleexpr26=simpleexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleexpr26.getTree());

                    }
                    break;
                case 2 :
                    // LogoAST.g:81:9: 'not' expression
                    {
                    string_literal27=(Token)match(input,29,FOLLOW_29_in_expression308);  
                    stream_29.add(string_literal27);

                    pushFollow(FOLLOW_expression_in_expression310);
                    expression28=expression();

                    state._fsp--;

                    stream_expression.add(expression28.getTree());


                    // AST REWRITE
                    // elements: expression, 29
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:26: -> ^( FUNCALL 'not' expression )
                    {
                        // LogoAST.g:81:29: ^( FUNCALL 'not' expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_29.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // LogoAST.g:82:7: 'modulo' expr1= expression expr2= expression
                    {
                    string_literal29=(Token)match(input,FUNC,FOLLOW_FUNC_in_expression328);  
                    stream_FUNC.add(string_literal29);

                    pushFollow(FOLLOW_expression_in_expression332);
                    expr1=expression();

                    state._fsp--;

                    stream_expression.add(expr1.getTree());
                    pushFollow(FOLLOW_expression_in_expression336);
                    expr2=expression();

                    state._fsp--;

                    stream_expression.add(expr2.getTree());


                    // AST REWRITE
                    // elements: expr2, expr1, FUNC
                    // token labels: 
                    // rule labels: retval, expr1, expr2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1",expr1!=null?expr1.tree:null);
                    RewriteRuleSubtreeStream stream_expr2=new RewriteRuleSubtreeStream(adaptor,"rule expr2",expr2!=null?expr2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:50: -> ^( FUNCALL 'modulo' $expr1 $expr2)
                    {
                        // LogoAST.g:82:53: ^( FUNCALL 'modulo' $expr1 $expr2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCALL, "FUNCALL"), root_1);

                        adaptor.addChild(root_1, stream_FUNC.nextNode());
                        adaptor.addChild(root_1, stream_expr1.nextTree());
                        adaptor.addChild(root_1, stream_expr2.nextTree());

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
    // $ANTLR end "expression"

    public static class simpleexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleexpr"
    // LogoAST.g:84:1: simpleexpr : term ( COMPAREOP term )* ;
    public final LogoASTParser.simpleexpr_return simpleexpr() throws RecognitionException {
        LogoASTParser.simpleexpr_return retval = new LogoASTParser.simpleexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMPAREOP31=null;
        LogoASTParser.term_return term30 = null;

        LogoASTParser.term_return term32 = null;


        Object COMPAREOP31_tree=null;

        try {
            // LogoAST.g:85:2: ( term ( COMPAREOP term )* )
            // LogoAST.g:85:4: term ( COMPAREOP term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_simpleexpr360);
            term30=term();

            state._fsp--;

            adaptor.addChild(root_0, term30.getTree());
            // LogoAST.g:85:9: ( COMPAREOP term )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMPAREOP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // LogoAST.g:85:10: COMPAREOP term
            	    {
            	    COMPAREOP31=(Token)match(input,COMPAREOP,FOLLOW_COMPAREOP_in_simpleexpr363); 
            	    COMPAREOP31_tree = (Object)adaptor.create(COMPAREOP31);
            	    root_0 = (Object)adaptor.becomeRoot(COMPAREOP31_tree, root_0);

            	    pushFollow(FOLLOW_term_in_simpleexpr366);
            	    term32=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term32.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "simpleexpr"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // LogoAST.g:87:1: term : factor ( TERMOP factor )* ;
    public final LogoASTParser.term_return term() throws RecognitionException {
        LogoASTParser.term_return retval = new LogoASTParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TERMOP34=null;
        LogoASTParser.factor_return factor33 = null;

        LogoASTParser.factor_return factor35 = null;


        Object TERMOP34_tree=null;

        try {
            // LogoAST.g:87:6: ( factor ( TERMOP factor )* )
            // LogoAST.g:88:3: factor ( TERMOP factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term379);
            factor33=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor33.getTree());
            // LogoAST.g:88:10: ( TERMOP factor )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==TERMOP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // LogoAST.g:88:11: TERMOP factor
            	    {
            	    TERMOP34=(Token)match(input,TERMOP,FOLLOW_TERMOP_in_term382); 
            	    TERMOP34_tree = (Object)adaptor.create(TERMOP34);
            	    root_0 = (Object)adaptor.becomeRoot(TERMOP34_tree, root_0);

            	    pushFollow(FOLLOW_factor_in_term385);
            	    factor35=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor35.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // LogoAST.g:90:1: factor : unary ( FACTOROP unary )* ;
    public final LogoASTParser.factor_return factor() throws RecognitionException {
        LogoASTParser.factor_return retval = new LogoASTParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FACTOROP37=null;
        LogoASTParser.unary_return unary36 = null;

        LogoASTParser.unary_return unary38 = null;


        Object FACTOROP37_tree=null;

        try {
            // LogoAST.g:90:8: ( unary ( FACTOROP unary )* )
            // LogoAST.g:91:3: unary ( FACTOROP unary )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unary_in_factor398);
            unary36=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary36.getTree());
            // LogoAST.g:91:9: ( FACTOROP unary )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==FACTOROP) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // LogoAST.g:91:10: FACTOROP unary
            	    {
            	    FACTOROP37=(Token)match(input,FACTOROP,FOLLOW_FACTOROP_in_factor401); 
            	    FACTOROP37_tree = (Object)adaptor.create(FACTOROP37);
            	    root_0 = (Object)adaptor.becomeRoot(FACTOROP37_tree, root_0);

            	    pushFollow(FOLLOW_unary_in_factor404);
            	    unary38=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary38.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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

    public static class unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary"
    // LogoAST.g:93:1: unary : ( REFOP atom -> ^( REFOP atom ) | atom );
    public final LogoASTParser.unary_return unary() throws RecognitionException {
        LogoASTParser.unary_return retval = new LogoASTParser.unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFOP39=null;
        LogoASTParser.atom_return atom40 = null;

        LogoASTParser.atom_return atom41 = null;


        Object REFOP39_tree=null;
        RewriteRuleTokenStream stream_REFOP=new RewriteRuleTokenStream(adaptor,"token REFOP");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // LogoAST.g:93:7: ( REFOP atom -> ^( REFOP atom ) | atom )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==REFOP) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=ID && LA13_0<=NUMBER)||LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // LogoAST.g:94:3: REFOP atom
                    {
                    REFOP39=(Token)match(input,REFOP,FOLLOW_REFOP_in_unary419);  
                    stream_REFOP.add(REFOP39);

                    pushFollow(FOLLOW_atom_in_unary421);
                    atom40=atom();

                    state._fsp--;

                    stream_atom.add(atom40.getTree());


                    // AST REWRITE
                    // elements: REFOP, atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:15: -> ^( REFOP atom )
                    {
                        // LogoAST.g:94:18: ^( REFOP atom )
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
                    // LogoAST.g:95:4: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unary435);
                    atom41=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom41.getTree());

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
    // $ANTLR end "unary"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // LogoAST.g:97:1: atom : ( '(' expression ')' | ID | NUMBER );
    public final LogoASTParser.atom_return atom() throws RecognitionException {
        LogoASTParser.atom_return retval = new LogoASTParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal42=null;
        Token char_literal44=null;
        Token ID45=null;
        Token NUMBER46=null;
        LogoASTParser.expression_return expression43 = null;


        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object ID45_tree=null;
        Object NUMBER46_tree=null;

        try {
            // LogoAST.g:97:6: ( '(' expression ')' | ID | NUMBER )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case ID:
                {
                alt14=2;
                }
                break;
            case NUMBER:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // LogoAST.g:98:3: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal42=(Token)match(input,27,FOLLOW_27_in_atom446); 
                    pushFollow(FOLLOW_expression_in_atom449);
                    expression43=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression43.getTree());
                    char_literal44=(Token)match(input,28,FOLLOW_28_in_atom451); 

                    }
                    break;
                case 2 :
                    // LogoAST.g:99:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID45=(Token)match(input,ID,FOLLOW_ID_in_atom457); 
                    ID45_tree = (Object)adaptor.create(ID45);
                    adaptor.addChild(root_0, ID45_tree);


                    }
                    break;
                case 3 :
                    // LogoAST.g:100:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER46=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom462); 
                    NUMBER46_tree = (Object)adaptor.create(NUMBER46);
                    adaptor.addChild(root_0, NUMBER46_tree);


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


 

    public static final BitSet FOLLOW_statement_in_block98 = new BitSet(new long[]{0x0000000008000F02L});
    public static final BitSet FOLLOW_WHILE_in_statement123 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement125 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_statement127 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement129 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement131 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_statement_in_statement133 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_26_in_statement136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement159 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_statement161 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement163 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_statement_in_statement165 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_26_in_statement168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IFELSE_in_statement193 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_statement195 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement197 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_statement_in_statement201 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_26_in_statement204 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement206 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_statement_in_statement210 = new BitSet(new long[]{0x000000000C000F00L});
    public static final BitSet FOLLOW_26_in_statement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_in_statement243 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_statement245 = new BitSet(new long[]{0x00000000280B8002L});
    public static final BitSet FOLLOW_27_in_statement271 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMMAND_in_statement273 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_statement275 = new BitSet(new long[]{0x00000000380B8000L});
    public static final BitSet FOLLOW_28_in_statement278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpr_in_expression298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_expression308 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_expression310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_expression328 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_expression332 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_expression336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleexpr360 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMPAREOP_in_simpleexpr363 = new BitSet(new long[]{0x0000000008038000L});
    public static final BitSet FOLLOW_term_in_simpleexpr366 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_factor_in_term379 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_TERMOP_in_term382 = new BitSet(new long[]{0x0000000008038000L});
    public static final BitSet FOLLOW_factor_in_term385 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_unary_in_factor398 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_FACTOROP_in_factor401 = new BitSet(new long[]{0x0000000008038000L});
    public static final BitSet FOLLOW_unary_in_factor404 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_REFOP_in_unary419 = new BitSet(new long[]{0x0000000008038000L});
    public static final BitSet FOLLOW_atom_in_unary421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unary435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_atom446 = new BitSet(new long[]{0x00000000280B8000L});
    public static final BitSet FOLLOW_expression_in_atom449 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_atom451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom462 = new BitSet(new long[]{0x0000000000000002L});

}