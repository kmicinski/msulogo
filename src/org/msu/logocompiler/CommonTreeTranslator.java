package org.msu.logocompiler;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.util.List;
import java.util.LinkedList; 

/**
 * A class to translate a CommonTree from ANTLR to our
 * Logo compiler's AST representation.
 */

public class CommonTreeTranslator {
    public List<ToplevelAST> translateProgram(CommonTree t)
    {
	List<ToplevelAST> programContents = new
	    LinkedList<ToplevelAST>();
	
	for (Object unit : t.getChildren()) {
	    if (((CommonTree)unit).getType() == LogoAST2Parser.FUNCDEF) {
		programContents.add(translateFunctionDefinition((CommonTree)unit));
	    }
	    else if (((CommonTree)unit).getType() == LogoAST2Parser.BLOCK) {
		programContents.add(translateBlock((CommonTree)unit));
	    }
	}
	
	return programContents;
    }
    
    public FunctionDefinitionAST translateFunctionDefinition(CommonTree t)
    {
	FunctionDefinitionAST func = new FunctionDefinitionAST();
	String funcName = ((CommonTree)((CommonTree)t).getChild(0)).getToken().getText();
	func.setFunctionName(funcName);
	
	CommonTree argList = (CommonTree)t.getChild(1);
	
	for (Object x : argList.getChildren()) {
	    func.getFunctionParameters().add(((CommonTree)x).getToken().getText());
	}
	
	CommonTree executionBlock = (CommonTree)t.getChild(2);
	func.setFunctionBody(translateBlock(executionBlock));
	
	return func;
    }
    
    public BlockAST translateBlock(CommonTree t)
    {
	BlockAST block = new BlockAST();

	block.setStartToken(t.getToken());

	if (t.getType() != LogoAST2Parser.BLOCK) {
	    System.err.println("Bad node, could not enter block");
	    return null;
	}

	List<CommonTree> statements = t.getChildren();

	for (CommonTree x : statements) {
	    StatementAST statement = translateStatement(x);
	    block.addStatementAST(statement);
	}

	return block;
    }

    public StatementAST translateStatement(CommonTree t)
    {
	switch(t.getType())
	    {
	    case LogoAST2Parser.IF:
		return translateIfStatement(t);
	    case LogoAST2Parser.WHILE:
		return translateWhileStatement(t);
	    case LogoAST2Parser.EXPRSTMT:
		{
		    ExpressionAST funcall = translateExpression((CommonTree)t.getChild(0));
		    ExpressionStatementAST funcallstmt = 
			new ExpressionStatementAST();
		    funcallstmt.setExpression(funcall);
		    return funcallstmt;
		}
	    case LogoAST2Parser.FUNCALL:
		{
		    CommonTree needed = (CommonTree)t.getChild(0);
		    ExpressionAST funcall = translateExpression(t);
		    ExpressionStatementAST funcallstmt = 
			new ExpressionStatementAST();
		    funcallstmt.setExpression(funcall);
		    return funcallstmt;
		}
	    default:
		System.err.println("Bad node, could not translate statement");
		return null;
	    }
    }
        
    public IfStmtAST translateIfStatement(CommonTree t)
    {
	boolean hasElse = false;
	    
	IfStmtAST ifstmt = new IfStmtAST();
	ifstmt.setStartToken(t.getToken());

	CommonTree conditionalExpression = (CommonTree)t.getChild(0);
	CommonTree execBlock = (CommonTree)t.getChild(1);
	
	BlockAST elseAST = null;
	
	if (t.getChildCount() > 2) {
	    // There's also an ``else'' clause here.
	    CommonTree elseBlock = (CommonTree)t.getChild(2);
	    elseAST = translateBlock(elseBlock);
	}
		
	ExpressionAST conditional = translateExpression(conditionalExpression);
	BlockAST block = translateBlock(execBlock);
		
	if (conditional != null && block != null 
	    && (!hasElse || elseAST != null)) {
	    ifstmt.setConditional(conditional);
	    ifstmt.setExecutionBlock(block);
	    ifstmt.setElseBlock(elseAST);
	    return ifstmt;
	} else {
	    return null;
	}
    }
    
    public WhileStmtAST translateWhileStatement(CommonTree t)
    {
	WhileStmtAST whilestmt = new WhileStmtAST();
	whilestmt.setStartToken(t.getToken());

	CommonTree conditionalExpression = (CommonTree)t.getChild(0);
	CommonTree execBlock = (CommonTree)t.getChild(1);

	ExpressionAST conditionalast = 
	    translateExpression(conditionalExpression);
	BlockAST block =
	    translateBlock(execBlock);

	if (conditionalast != null && block != null) {
	    whilestmt.setConditional(conditionalast);
	    whilestmt.setExecutionBlock(block);
	    return whilestmt;
	} else {
	    return null;
	}
    }

    public ExpressionAST translateExpression(CommonTree t)
    {
	switch (t.getType())
	    {
	    case LogoAST2Parser.FUNCALL:
		return translateFunCall(t);
	    case LogoAST2Parser.TERMOP:
	    case LogoAST2Parser.FACTOROP:
	    case LogoAST2Parser.COMPAREOP:
		return translateBinaryExpression(t);
	    case LogoAST2Parser.QUOTE:
	    case LogoAST2Parser.COLON:
		return translateUnaryExpression(t);
	    case LogoAST2Parser.ID:
		IdentifierAtomExpressionAST identifier = 
		    new IdentifierAtomExpressionAST(t.getToken().getText());
		identifier.setStartToken(t.getToken());
		return identifier;
	    case LogoAST2Parser.INTCONST:
		IntegerAtomExpressionAST integer =
		    new IntegerAtomExpressionAST(Integer.parseInt(((CommonTree)t.getChild(0)).getToken().getText()));
		integer.setStartToken(t.getToken());
		return integer;
	    case LogoAST2Parser.FLOATCONST:
		DecimalAtomExpressionAST decimal =
		    new DecimalAtomExpressionAST(Double.parseDouble(((CommonTree)t.getChild(0)).getToken().getText()));
		decimal.setStartToken(t.getToken());
		return decimal;
	    default:
		return null;
	    }
    }

    public FunCallExpressionAST translateFunCall(CommonTree t)
    {
	List<ExpressionAST> arguments = new LinkedList<ExpressionAST>();

	String funName = ((CommonTree)t.getChild(0)).getToken().getText();

	for (int i = 1; i < t.getChildCount(); i++) {
	    ExpressionAST curarg = translateExpression((CommonTree)t.getChild(i));

	    if (curarg != null) {
		arguments.add(curarg);
	    } else {
		return null;
	    }
	}

	FunCallExpressionAST exprast = new FunCallExpressionAST(funName,arguments);
	exprast.setStartToken(t.getToken());
	return exprast;
    }

    public UnaryExpressionAST translateUnaryExpression(CommonTree t)
    {
	UnaryExpressionAST unaryexpr = new UnaryExpressionAST();
	unaryexpr.setStartToken(t.getToken());

	UnaryExpressionAST.UnaryOps operator =
	    UnaryExpressionAST.stringUnaryOpMap.get(t.getToken().getText());
	
	if (operator == null) {
	    System.out.println("Error! Could not interpret unary operator "
			       + t.getToken());
	}
	
	unaryexpr.setOperator(operator);

	ExpressionAST operand = translateExpression((CommonTree)t.getChild(0));

	if (operand != null) {
	    unaryexpr.setOperand(operand);
	    return unaryexpr;
	} else {
	    return null;
	}
    }

    public BinaryExpressionAST translateBinaryExpression(CommonTree t)
    {
	BinaryExpressionAST binexpr = new BinaryExpressionAST();
	binexpr.setStartToken(t.getToken());

	BinaryExpressionAST.BinOps operator = 
	    BinaryExpressionAST.stringBinOpMap.get(t.getToken().getText());

	if (operator == null) {
	    System.out.println("Error! Could not interpret unary operator "
			       + t.getToken());
	    return null;
	}

	ExpressionAST left = translateExpression((CommonTree)t.getChild(0));
	ExpressionAST right = translateExpression((CommonTree)t.getChild(1));

	if (left == null || right == null) {
	    return null;
	} else {
	    binexpr.setLeftAST(left);
	    binexpr.setRightAST(right);
	    binexpr.setOperator(operator);
	    return binexpr;
	}
    }
}
