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
import org.msu.logocompiler.basicevaluatorhandlers.ModuloHandler;
import org.msu.logocompiler.basicevaluatorhandlers.NotHandler;

/*
 * Visitor class to generate 
 */
public class EvaluatorVisitor implements ASTVisitor {
	private DeclarationDataEnvironment toplevelEnvironment;
	private DeclarationDataEnvironment currentEnvironment;
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
		BasicTypeData moduloHandler = new BasicTypeData();
		moduloHandler.setFunctionHandler(new ModuloHandler());
		moduloHandler.setDataType(bt);
		BasicTypeData notHandler = new BasicTypeData();
		notHandler.setFunctionHandler(new NotHandler());
		notHandler.setDataType(bt);

		toplevelEnvironment.insertData("print", printHandler);
		toplevelEnvironment.insertData("make", makeHandler);
		toplevelEnvironment.insertData("forward", forwardHandler);
		toplevelEnvironment.insertData("fd", forwardHandler);
		toplevelEnvironment.insertData("back", backHandler);
		toplevelEnvironment.insertData("bk", backHandler);
		toplevelEnvironment.insertData("left", leftHandler);
		toplevelEnvironment.insertData("lt", leftHandler);
		toplevelEnvironment.insertData("right", rightHandler);
		toplevelEnvironment.insertData("rt", rightHandler);
		toplevelEnvironment.insertData("beginfill", beginFillHandler);
		toplevelEnvironment.insertData("endfill", endFillHandler);
		toplevelEnvironment.insertData("circle", circleHandler);
		toplevelEnvironment.insertData("setpencolor", colorHandler);
		toplevelEnvironment.insertData("penup", penUpHandler);
		toplevelEnvironment.insertData("pendown", penDownHandler);
		toplevelEnvironment.insertData("modulo", moduloHandler);
		toplevelEnvironment.insertData("not", notHandler);
		toplevelEnvironment.insertDeclaration("print", bt);
		toplevelEnvironment.insertDeclaration("make", bt);
		toplevelEnvironment.insertDeclaration("forward", bt);
		toplevelEnvironment.insertDeclaration("fd", bt);
		toplevelEnvironment.insertDeclaration("back", bt);
		toplevelEnvironment.insertDeclaration("bk", bt);
		toplevelEnvironment.insertDeclaration("left", bt);
		toplevelEnvironment.insertDeclaration("lt", bt);
		toplevelEnvironment.insertDeclaration("right", bt);
		toplevelEnvironment.insertDeclaration("rt", bt);
		toplevelEnvironment.insertDeclaration("beginfill", bt);
		toplevelEnvironment.insertDeclaration("endfill", bt);
		toplevelEnvironment.insertDeclaration("circle", bt);
		toplevelEnvironment.insertDeclaration("setpencolor", bt);
		toplevelEnvironment.insertDeclaration("penup", bt);
		toplevelEnvironment.insertDeclaration("pendown", bt);
		toplevelEnvironment.insertDeclaration("modulo",bt);
		toplevelEnvironment.insertDeclaration("not",bt);

		toplevelEnvironment.setActiveTurtle(currentTurtle);

		currentEnvironment = toplevelEnvironment;
	}

	public void visit(AtomExpressionAST ast) {
		// unimportant
	}

	/*
	 * This function is used to do type propagation for our Logo language. 
	 * 
	 * Right now we are only concerned about propagation from integers to decimals. 
	 * To accomplish this we check to see if we have a suitable arrangement of decimal 
	 * and integer nodes in our AST. If so, we create a new AST node, called the TypeCastAST
	 * which is used for creating the cast from integer to double.
	 * 
	 * Although having the extra node in the AST may seem extraneous, I think it might 
	 * eventually be useful for more analysis or intermediate code generation.
	 * 		-- Kris
	 */
	public boolean attemptPropagateTypes(BinaryExpressionAST ast)
	{
		ExpressionAST inttype = null;
		ExpressionAST floattype = null;
		boolean left = false;

		if (ast.getLeftExpression().getEvaluationResult().getDataType().getBaseType() == BaseTypes.Integer)
		{
			left = true;
			inttype = ast.getLeftExpression();
		} else if (ast.getRightExpresssion().getEvaluationResult().getDataType().getBaseType() == BaseTypes.Integer)
		{
			left = false;
			inttype = ast.getRightExpresssion();
		}

		if (ast.getLeftExpression().getEvaluationResult().getDataType().getBaseType() == BaseTypes.Decimal)
		{
			floattype = ast.getLeftExpression();
		} else if (ast.getRightExpresssion().getEvaluationResult().getDataType().getBaseType() == BaseTypes.Decimal)
		{
			floattype = ast.getRightExpresssion();
		}

		// We do type propagation from int to float
		if (inttype != null && floattype != null)
		{
			TypeCastAST typeCast = new TypeCastAST();

			typeCast.setArgument(inttype);
			typeCast.setFromType(inttype.getExpressionType());
			typeCast.setToType(BasicType.BasicInteger);

			BasicTypeData data = new BasicTypeData();
			data.setDoubleData(inttype.getEvaluationResult().getIntData());
			data.setDataType(BasicType.BasicDecimal);
			typeCast.setExpressionType(BasicType.BasicDecimal);
			typeCast.setEvaluationResult(data);

			if (left) {
				ast.setLeftAST(typeCast);
			}
			else {
				ast.setRightAST(typeCast);
			}
			return true;
		}

		return false;
	}

	public void visit(BinaryExpressionAST ast) {
		if (!ast.getLeftExpression().getExpressionType().
				identicalType(ast.getRightExpresssion().getExpressionType()))				
		{
			if (!attemptPropagateTypes(ast))
			{
				System.err.println("Types do not unify for binary expression at token: "
						+ ast.getStartToken());
				System.err.println("Dr. Punch said that I should stop working on the code now...");
				System.exit(1);
			}
			else
			{
				System.err.println("Warning: An integer has been propagated to a floating point value.");
			}
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
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			double answer = a.getDoubleData() + b.getDoubleData();
			BasicTypeData c = new BasicTypeData();
			c.setDataType(BasicType.BasicDecimal);
			c.setDoubleData(answer);
			ast.setEvaluationResult(c);
			break;
		}
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
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Boolean);

		switch (type.getBaseType()) {
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			BasicTypeData c = new BasicTypeData();
			c.setDataType(t);
			c.setBoolData(a.getDoubleData() == b.getDoubleData());
			ast.setEvaluationResult(c);
			break;
		}
		case Integer:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

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

			BasicTypeData c = new BasicTypeData();
			c.setDataType(t);
			c.setBoolData(a.getBoolData() == b.getBoolData());
			ast.setEvaluationResult(c);
			break;
		}
		default:
			System.err.println("Cannot apply = operator to item of type" + type);
		}

		ast.setExpressionType(t);
		return;
	}

	private void handleLt(BinaryExpressionAST ast) {
		BasicType type = (BasicType)ast.getExpressionType();

		switch (type.getBaseType()) {
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			BasicType t = new BasicType();
			t.setBaseType(BaseTypes.Boolean);

			BasicTypeData c = new BasicTypeData();
			c.setDataType(t);
			c.setBoolData(a.getDoubleData() < b.getDoubleData());
			ast.setEvaluationResult(c);
			break;
		}
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
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			BasicType t = new BasicType();
			t.setBaseType(BaseTypes.Boolean);

			BasicTypeData c = new BasicTypeData();
			c.setDataType(t);
			c.setBoolData(a.getDoubleData() <= b.getDoubleData());
			ast.setEvaluationResult(c);
			break;
		}
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
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			BasicType t = new BasicType();
			t.setBaseType(BaseTypes.Boolean);

			BasicTypeData c = new BasicTypeData();
			c.setDataType(t);
			c.setBoolData(a.getDoubleData() > b.getDoubleData());
			ast.setEvaluationResult(c);
			break;
		}
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
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			BasicType t = new BasicType();
			t.setBaseType(BaseTypes.Boolean);

			BasicTypeData c = new BasicTypeData();
			c.setDataType(t);
			c.setBoolData(a.getDoubleData() >= b.getDoubleData());
			ast.setEvaluationResult(c);
			break;
		}
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
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			double answer = a.getDoubleData() - b.getDoubleData();
			BasicTypeData c = new BasicTypeData();
			c.setDataType(BasicType.BasicDecimal);
			c.setDoubleData(answer);
			ast.setEvaluationResult(c);
		}
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
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			double answer = a.getDoubleData() / b.getDoubleData();
			BasicTypeData c = new BasicTypeData();
			c.setDataType(BasicType.BasicDecimal);
			c.setDoubleData(answer);
			ast.setEvaluationResult(c);
		}
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
		case Decimal:
		{
			BasicTypeData a = ast.getLeftExpression().getEvaluationResult();
			BasicTypeData b = ast.getRightExpresssion().getEvaluationResult();

			double answer = a.getDoubleData() * b.getDoubleData();
			BasicTypeData c = new BasicTypeData();
			c.setDataType(BasicType.BasicDecimal);
			c.setDoubleData(answer);
			ast.setEvaluationResult(c);
		}
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

	public void visit(FunCallExpressionAST ast) throws ReturnException {
		// Perhaps this should be currentEnvironment, other wise we allow only toplevel
		// function defintions.
		Type t = currentEnvironment.lookupDeclaration(ast.getFunName());	// 
		BasicTypeData data = currentEnvironment.lookupData(ast.getFunName());

		// Currently we hacked the AST and we just leave output as a simple function call...
		if (ast.getFunName().equals("output"))
		{
			if (ast.getArguments().size() != 1) {
				System.out.println("Error! output should only be given one thing to output!");
				return;
			}

			throw new ReturnException(ast.getArguments().get(0).getEvaluationResult());
		}

		if (t == null || data == null
				|| t.getBaseType() != BaseTypes.Function) {
			System.err.println("Function " + ast.getFunName() + " is undefined!");
			return;
		}

		//First we look for an evaluator handler, if we don't 
		// find one then we try to find a user defined function.
		EvaluatorFunctionHandler handler = data.getFunctionHandlerData();
		FunctionDefinitionAST definedFunction = null;

		if (handler == null) {
			definedFunction = (FunctionDefinitionAST)data.getDefinedFunction().clone();				
		}

		if (handler == null && definedFunction == null) {
			System.err.println("Function " + ast.getFunName() + " is undefined properly!");
			return;
		}

		if (handler != null) {
			handler.evaluateFunction(ast, currentEnvironment);	// 
		} else {	// 
			DeclarationDataEnvironment functionClosure	// 
			= new DeclarationDataEnvironment(currentEnvironment); //definedFunction.getCurrentClosure();
			functionClosure.setActiveTurtle(toplevelEnvironment.getActiveTurtle());

			currentEnvironment = functionClosure;


			Iterator<ExpressionAST> computedArgs = ast.getArguments().iterator();

			for (String var : definedFunction.getFunctionParameters())
			{
				if (!computedArgs.hasNext())
				{
					// Not enough parameters passed to the function
					System.out.println("Function " + ast.getFunName() 
							+ " does not have the proper number of parameters passed to it! (Expecting " 
							+ definedFunction.getFunctionParameters().size() + " parameters).");
				}
				ExpressionAST computedArg = computedArgs.next();
				functionClosure.insertData(var, computedArg.getEvaluationResult());
				functionClosure.insertDeclaration(var, computedArg.getExpressionType());
			}

			// Actually execute the body of the function, to do this
			// first make sure we have properly set up the scope properly
			try {
				definedFunction.getFunctionBody().accept(this);
				BasicType voidType = new BasicType();
				voidType.setBaseType(BaseTypes.Void);
				BasicTypeData voidReturn = new BasicTypeData();
				voidReturn.setDataType(voidType);
				ast.setEvaluationResult(voidReturn);
				ast.setExpressionType(voidType);
			}
			catch (ReturnException e) {
				ast.setEvaluationResult(e.getReturnValue());
				ast.setExpressionType(e.getReturnValue().getDataType());
			}

			currentEnvironment = functionClosure.getParentEnvironment();

		}
		return;
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
	public void visit(IfStmtAST ast) throws ReturnException {
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

	// To do this, we simply insert it into the current scope.
	public void visit(FunctionDefinitionAST ast) {
		// Get the function name, and just stick it in the current environment!
		BasicTypeData functionHolder = new BasicTypeData();
		functionHolder.setDefinedFunction(ast);
		BasicType type = new BasicType();
		type.setBaseType(BaseTypes.Function);

		functionHolder.setDataType(type);

		currentEnvironment.insertData(ast.getFunctionName(),functionHolder);
		currentEnvironment.insertDeclaration(ast.getFunctionName(), type);
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
			BasicTypeData data = currentEnvironment.lookupData(name);
			Type anstype = currentEnvironment.lookupDeclaration(name);	// 
			
			ast.setEvaluationResult(data);
			ast.setExpressionType(anstype);
		}
		}
	}

	public void visit(WhileStmtAST ast) throws ReturnException {
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
	public void visit(IntegerAtomExpressionAST ast) {
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Integer);
		ast.setExpressionType(t);
		BasicTypeData basicData = new BasicTypeData();
		basicData.setDataType(t);
		basicData.setIntData(ast.number);
		ast.setEvaluationResult(basicData);
	}	

	// A basic integer node
	public void visit(DecimalAtomExpressionAST ast) {
		BasicType t = new BasicType();
		t.setBaseType(BaseTypes.Decimal);
		ast.setExpressionType(t);
		BasicTypeData basicData = new BasicTypeData();
		basicData.setDataType(t);
		basicData.setDoubleData(ast.number);
		ast.setEvaluationResult(basicData);
	}

	@Override
	public void visit(ToplevelAST ast) {
		// TODO Auto-generated method stub

	}	

}
