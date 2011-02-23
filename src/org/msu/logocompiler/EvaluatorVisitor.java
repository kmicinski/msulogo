package org.msu.logocompiler;

import java.util.Iterator;

import msu.cse.turtlegraphics.Turtle;

import org.msu.logocompiler.BinaryExpressionAST.BinOps;
import org.msu.logocompiler.Type.BaseTypes;
import org.msu.logocompiler.basicevaluatorhandlers.BackwardHandler;
import org.msu.logocompiler.basicevaluatorhandlers.BeginFill;
import org.msu.logocompiler.basicevaluatorhandlers.EndFill;
import org.msu.logocompiler.basicevaluatorhandlers.CircleHandler;
import org.msu.logocompiler.basicevaluatorhandlers.ColorHandler;
import org.msu.logocompiler.basicevaluatorhandlers.ForwardHandler;
import org.msu.logocompiler.basicevaluatorhandlers.LeftHandler;
import org.msu.logocompiler.basicevaluatorhandlers.MakeHandler;
import org.msu.logocompiler.basicevaluatorhandlers.PenDownHandler;
import org.msu.logocompiler.basicevaluatorhandlers.PenUpHandler;
import org.msu.logocompiler.basicevaluatorhandlers.PrintHandler;
import org.msu.logocompiler.basicevaluatorhandlers.RightHandler;

public class EvaluatorVisitor implements ASTVisitor {
    private DeclarationDataEnvironment toplevelEnvironment;
    private Turtle currentTurtle;
	
    public EvaluatorVisitor(Turtle turtle)
    {
	currentTurtle = turtle;
	toplevelEnvironment = new DeclarationDataEnvironment(null);
	BasicType bt = new BasicType();
	bt.setBaseType(BaseTypes.Function);
	BasicTypeData printHandler = new BasicTypeData();
	printHandler.setFunctionHandler(new PrintHandler());
	printHandler.setDataType(bt);
	
	BasicTypeData makeHandler = new BasicTypeData();
	makeHandler.setFunctionHandler(new MakeHandler());
	makeHandler.setDataType(bt);
	
	BasicTypeData forwardHandler = new BasicTypeData();
	forwardHandler.setFunctionHandler(new ForwardHandler());
	forwardHandler.setDataType(bt);
	BasicTypeData backHandler = new BasicTypeData();
	backHandler.setFunctionHandler(new BackwardHandler());
	backHandler.setDataType(bt);
	BasicTypeData leftHandler = new BasicTypeData();
	leftHandler.setFunctionHandler(new LeftHandler());
	leftHandler.setDataType(bt);
	BasicTypeData rightHandler = new BasicTypeData();
	rightHandler.setFunctionHandler(new RightHandler());
	rightHandler.setDataType(bt);
	BasicTypeData beginFillHandler = new BasicTypeData();
	beginFillHandler.setFunctionHandler(new BeginFill());
	beginFillHandler.setDataType(bt);
	BasicTypeData endFillHandler = new BasicTypeData();
	endFillHandler.setFunctionHandler(new EndFill());
	endFillHandler.setDataType(bt);
	BasicTypeData circleHandler = new BasicTypeData();
	circleHandler.setFunctionHandler(new CircleHandler());
	circleHandler.setDataType(bt);
	BasicTypeData colorHandler = new BasicTypeData();
	colorHandler.setFunctionHandler(new ColorHandler());
	colorHandler.setDataType(bt);
	BasicTypeData penUpHandler = new BasicTypeData();
	penUpHandler.setFunctionHandler(new PenUpHandler());
	penUpHandler.setDataType(bt);
	BasicTypeData penDownHandler = new BasicTypeData();
	penDownHandler.setFunctionHandler(new PenDownHandler());
	penDownHandler.setDataType(bt);

	toplevelEnvironment.insertData("print", printHandler);
	toplevelEnvironment.insertData("make", makeHandler);
	toplevelEnvironment.insertData("forward", forwardHandler);
	toplevelEnvironment.insertData("back", backHandler);
	toplevelEnvironment.insertData("left", leftHandler);
	toplevelEnvironment.insertData("right", rightHandler);
	toplevelEnvironment.insertData("beginfill", beginFillHandler);
	toplevelEnvironment.insertData("endfill", endFillHandler);
	toplevelEnvironment.insertData("circle", circleHandler);
	toplevelEnvironment.insertData("color", colorHandler);
	toplevelEnvironment.insertData("penup", penUpHandler);
	toplevelEnvironment.insertData("pendown", penDownHandler);
	toplevelEnvironment.insertDeclaration("print", bt);
	toplevelEnvironment.insertDeclaration("make", bt);
	toplevelEnvironment.insertDeclaration("forward", bt);
	toplevelEnvironment.insertDeclaration("back", bt);
	toplevelEnvironment.insertDeclaration("left", bt);
	toplevelEnvironment.insertDeclaration("right", bt);
	toplevelEnvironment.insertDeclaration("beginfill", bt);
	toplevelEnvironment.insertDeclaration("endfill", bt);
	toplevelEnvironment.insertDeclaration("circle", bt);
	toplevelEnvironment.insertDeclaration("color", bt);
	toplevelEnvironment.insertDeclaration("penup", bt);
	toplevelEnvironment.insertDeclaration("pendown", bt);
						
	toplevelEnvironment.setActiveTurtle(currentTurtle);
    }

    public void visit(AtomExpressionAST ast) {
	// unimportant
    }

    public void visit(BinaryExpressionAST ast) {
	if (!ast.getLeftExpression().getExpressionType().
	    identicalType(ast.getRightExpresssion().getExpressionType()))				
	    {
		System.err.println("Types do not unify for binary expression at token: "
				   + ast.getStartToken());
	    }
		
	// Take the type of the left subtree, equally well right
	Type t = ast.getLeftExpression().getExpressionType();
		
	ast.setExpressionType(t);
		
	if (!(ast.getExpressionType() instanceof BasicType)) {
	    System.err.println("Attempting to apply a simple operator to a complex type! "
			       + "At token " + ast.getStartToken());
	}
		
	switch (ast.getOperator()) {
	case Plus:
	    handlePlus(ast);
	    return;
	case Minus:
	    handleMinus(ast);
	    return;
	case Equals:
	    handleEquals(ast);
	    return;
	case Divide:
	    handleDivide(ast);
	    return;
	case Multiply:
	    handleMultiply(ast);
	    return;
	case Lt:
	    handleLt(ast);
	    return;
	case Lte:
	    handleLte(ast);
	    return;
	case Gt:
	    handleGt(ast);
	    return;
	case Gte:
	    handleGte(ast);
	    return;
	case And:
	    handleAnd(ast);
	    return;
	case Or:
	    handleOr(ast);
	    return;
	}
    }

    private void handlePlus(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		int answer = a.getIntData() + b.getIntData();
		BasicTypeData c = new BasicTypeData();
		c.setDataType(a.getDataType());
		c.setIntData(answer);
		ast.setEvaluationResult(c);
		break;
	    }
	case String:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		String answer = a.getStringData() + b.getStringData();
		BasicTypeData c = new BasicTypeData();
		c.setDataType(a.getDataType());
		c.setStringData(answer);
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply + operator to item of type" + type);
	}
		
	return;
    }

    private void handleEquals(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getIntData() == b.getIntData());
		ast.setEvaluationResult(c);
		break;
	    }
	case String:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getStringData().equals(b.getStringData()));
		ast.setEvaluationResult(c);
		break;
	    }
	case Boolean:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getBoolData() == b.getBoolData());
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply = operator to item of type" + type);
	}
	return;
    }

    private void handleLt(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getIntData() < b.getIntData());
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply < operator to item of type" + type);
	}
	return;
    }

    private void handleLte(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getIntData() <= b.getIntData());
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply <= operator to item of type" + type);
	}
	return;
    }

    private void handleGt(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getIntData() > b.getIntData());
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply <= operator to item of type" + type);
	}
	return;
    }

    private void handleGte(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getIntData() >= b.getIntData());
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply >= operator to item of type" + type);
	}
	return;
    }
	
    private void handleMinus(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		int answer = a.getIntData() - b.getIntData();
		BasicTypeData c = new BasicTypeData();
		c.setDataType(a.getDataType());
		c.setIntData(answer);
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply - operator to item of type" + type);
	}
		
	return;
    }

    private void handleDivide(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		if (b.getIntData() == 0) {
		    System.err.println("Divide by zero at token " + ast.getStartToken());
		}
			
		int answer = a.getIntData() / b.getIntData();
		BasicTypeData c = new BasicTypeData();
		c.setDataType(a.getDataType());
		c.setIntData(answer);
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply / operator to item of type" + type);
	}
		
	return;
    }

    private void handleMultiply(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Integer:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		int answer = a.getIntData() * b.getIntData();
		BasicTypeData c = new BasicTypeData();
		c.setDataType(a.getDataType());
		c.setIntData(answer);
		ast.setEvaluationResult(c);
		break;
	    }
	default:
	    System.err.println("Cannot apply * operator to item of type" + type);
	}
		
	return;
    }

    private void handleOr(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Boolean:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getBoolData() || b.getBoolData());
		ast.setEvaluationResult(c);			
		break;
	    }
	default:
	    System.err.println("Cannot apply || operator to item of type" + type);
	}
	return;
    }

    private void handleAnd(BinaryExpressionAST ast) {
	BasicType type = (BasicType)ast.getExpressionType();
		
	switch (type.getBaseType()) {
	case Boolean:
	    {
		BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
		BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();
			
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);
						
		BasicTypeData c = new BasicTypeData();
		c.setDataType(t);
		c.setBoolData(a.getBoolData() && b.getBoolData());
		ast.setEvaluationResult(c);			
		break;
	    }
	default:
	    System.err.println("Cannot apply && operator to item of type" + type);
	}
	return;
    }

    public void visit(BlockAST ast) {
	/*		for (StatementAST stmt : ast.getStatementList()) {
	// Evaluate each statement
	stmt.accept(this);
	}
	*/
    }

    public void visit(ExpressionAST ast) {
	// Non important...
    }

    public void visit(ExpressionStatementAST ast) {
		
    }
	
    public void visit(FunCallExpressionAST ast) {
	Type t = toplevelEnvironment.lookupDeclaration(ast.getFunName());
	BasicTypeData data = toplevelEnvironment.lookupData(ast.getFunName());

	if (t == null || data == null
	    || t.getBaseType() != BaseTypes.Function) {
	    System.err.println("Function " + ast.getFunName() + " is undefined!");
	    return;
	}
		
	//FunctionType function = (FunctionType)t;
	/*
	  if (ast.getArguments().size() != ((FunctionType)t).getNumArguments()) {
	  System.err.println("Function " + ast.getFunName() + " given wrong number of arguments");
	  return;
	  }
		
	  Iterator<ExpressionAST> arga = ast.getArguments().iterator();
	  Iterator<Type> argb = function.getArgumentTypes().iterator();
		
	  while (argb.hasNext()) {
	  Type a = (arga.next().getExpressionType());
	  Type b = argb.next();
			
	  if (!a.identicalType(b)) {
	  System.err.println("Types of arguments for function " + ast.getFunName() + " do not agree.");
	  return;
	  }
	  }
		
	  ast.setExpressionType(function.getReturnType());
	*/
		
	EvaluatorFunctionHandler handler = data.getFunctionHandlerData();
		
	handler.evaluateFunction(ast, toplevelEnvironment);
    }
	
	
    // Evaluate an identifier
    public void visit(IdentifierAtomExpressionAST ast) {
	// Calculate the type and evaluate
	BasicType t = new BasicType();
	t.setBaseType(BaseTypes.String);
	BasicTypeData data = new BasicTypeData();
	data.setStringData(ast.getIdentifier());
		
	ast.setExpressionType(t);
	ast.setEvaluationResult(data);
    }
	
    // Evaluate an if statement
    public void visit(IfStmtAST ast) {
	// Evaluate the conditional
	ast.getConditional().accept(this);
		
	ExpressionAST conditional = ast.getConditional();
		
	BasicTypeData result = conditional.getEvaluationResult();
		
	BasicType bt = result.getDataType();
		
	if (bt.getBaseType() != BaseTypes.Boolean)
	    {
		System.err.println("need a boolean expression for an if statement");
	    }
		
	boolean isTrue = result.getBoolData();
	boolean hasElse = (ast.getElseBlock() != null);
	
	if (isTrue) {
	    // Execute the conditional
	    ast.getExecutionBlock().accept(this);
	} else {
	    if (hasElse) {
		ast.getElseBlock().accept(this);
	    }
	}
    }
	
    // Evalaute a unary expression
    public void visit(UnaryExpressionAST ast) {
	switch (ast.getOperator()) {
	case Quote:
	    {
		ast.setEvaluationResult(ast.getOperand().getEvaluationResult());
		ast.setExpressionType(ast.getOperand().getExpressionType());
		return;
	    }
	case Colon:
	    {
		ExpressionAST operand = ast.getOperand();
		if (!(operand.getExpressionType() instanceof BasicType)) {
		    System.err.println(
				       "Need a basic type, cannot : a complex value at token "
				       + ast.getStartToken());
		}
		BasicType t = (BasicType)operand.getExpressionType();
		if (t.getBaseType() != BaseTypes.String) {
		    System.err.println("Need a string, cannot : anything other than a string, "
				       + ast.getStartToken());
		}
			
		String name = operand.getEvaluationResult().getStringData();
		BasicTypeData data = toplevelEnvironment.lookupData(name);
		Type anstype = toplevelEnvironment.lookupDeclaration(name);
			
		ast.setEvaluationResult(data);
		ast.setExpressionType(anstype);
	    }
	}
    }
	
    public void visit(WhileStmtAST ast) {
	// Evaluate the conditional
	boolean isTrue;
		
	ast.getConditional().accept(this);
		
	ExpressionAST conditional = ast.getConditional();
		
	BasicTypeData result = conditional.getEvaluationResult();
		
	BasicType bt = result.getDataType();
		
	if (bt.getBaseType() != BaseTypes.Boolean)
	    {
		System.err.println("need a boolean expression for an if statement");
	    }
		
	isTrue = result.getBoolData();
		
	while (isTrue) {
	    // Execute the block
	    ast.getExecutionBlock().accept(this);
			
	    // reevaluate the conditional
	    ast.getConditional().accept(this);
		
	    conditional = ast.getConditional();
	    result = conditional.getEvaluationResult();
	    bt = result.getDataType();
		
	    if (bt.getBaseType() != BaseTypes.Boolean)
		{
		    System.err.println("need a boolean expression for an if statement");
		}
		
	    isTrue = result.getBoolData();
	}
		
	return;
    }
	
    // A basic integer node
    public void visit(NumberAtomExpressionAST ast) {
	BasicType t = new BasicType();
	t.setBaseType(BaseTypes.Integer);
	ast.setExpressionType(t);
	BasicTypeData basicData = new BasicTypeData();
	basicData.setDataType(t);
	basicData.setIntData(ast.number);
	ast.setEvaluationResult(basicData);
    }	
}
