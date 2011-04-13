package org.msu.logocompiler;

import java.util.LinkedList;
import java.util.List;

import org.msu.logocompiler.TurtleICodeBlock.BlockContainsTerminatingInstructionException;
import org.msu.logocompiler.TurtleICodeJVMHack.Hacks;
import org.msu.logocompiler.Type.BaseTypes;

import sun.reflect.generics.tree.BaseType;

/*
 * A class to generate intermediate code from an AST.
 */
public class ICodeGenerator implements ASTVisitor {
	private TurtleICodeProgram toplevelProgram;
	private TurtleICodeFunction currentFunction;
	private TurtleICodeBlock currentBlock;
	
	private int localVariableCounter = 0;
	
	private List<TurtleICodeNonbranchingInstruction> instructionList;
	
	public List<TurtleICodeNonbranchingInstruction> getInstructionList()
	{
		return instructionList;
	}
	
	public ICodeGenerator()
	{
		toplevelProgram = new TurtleICodeProgram();
		currentFunction = new TurtleICodeFunction();
		instructionList = new LinkedList<TurtleICodeNonbranchingInstruction>();
	}
	
	public void visit(AtomExpressionAST ast) {
		; // Do nothing...
	}

	/*
	 * This function is used to do type propagation for our Logo language. 
	 * 
	 * We do a similar thing as in the interpreted form from EvaluatorVisitor.java.
	 * To handle this, we create a new AST node 
	 */
	public boolean attemptPropagateTypes(BinaryExpressionAST ast)
	{
		ExpressionAST inttype = null;
		ExpressionAST floattype = null;
		boolean left = false;
		
		if (ast.getLeftExpression().getExpressionType().getBaseType() == BaseTypes.Integer)
		{
			left = true;
			inttype = ast.getLeftExpression();
		} else if (ast.getRightExpresssion().getExpressionType().getBaseType() == BaseTypes.Integer)
		{
			left = false;
			inttype = ast.getRightExpresssion();
		}
		
		if (ast.getLeftExpression().getExpressionType().getBaseType() == BaseTypes.Decimal)
		{
			floattype = ast.getLeftExpression();
		} else if (ast.getRightExpresssion().getExpressionType().getBaseType() == BaseTypes.Decimal)
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
			TurtleICodeI2D instr = new TurtleICodeI2D();
			TemporaryVariableLocation loc = currentFunction.newTemporaryVariable();
			loc.setLocationType(BasicType.BasicDecimal);
			instr.setFromLocation(inttype.getResultLocation());
			instr.setResult(loc);
			inttype.getGeneratedInstructionList().add(instr);
			typeCast.setResultLocation(loc);
			typeCast.setInstructionList(inttype.getGeneratedInstructionList());
			typeCast.setExpressionType(BasicType.BasicDecimal);
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
		
		Type exprType = ast.getLeftExpression().getExpressionType();
		
		// Do type checking to make sure we are applying operations only to 
		if (!(exprType instanceof BasicType)) {
			System.err.println("Attempting to apply a simple operator to a complex type! "
					+ "At token " + ast.getStartToken());
		}

		TurtleICodeBinaryInstruction instr = new TurtleICodeBinaryInstruction();
		instr.setLeftOperandLocation(ast.getLeftExpression().getResultLocation());
		instr.setRightOperandLocation(ast.getLeftExpression().getResultLocation());
		TemporaryVariableLocation loc = currentFunction.newTemporaryVariable();
		
		switch (ast.getOperator()) {
		case Plus:
		case Minus:
		case Divide:
		case Multiply:
			/*
			 * Binary operators which produce something of the same type.
			 */
			loc.setLocationType(ast.getLeftExpression().getExpressionType());
			ast.setExpressionType(exprType);
			break;
		case Equals:
		case Lt:
		case Lte:
		case Gt:
		case Gte:
		case And:
		case Or:
			loc.setLocationType(BasicType.BasicBoolean);
			ast.setExpressionType(BasicType.BasicBoolean);
			break;
		}
		
		ast.setResultLocation(loc);
		instr.setOperation(ast.getOperator());
		instr.setResult(loc);
		List<TurtleICodeNonbranchingInstruction> instrList;
		instrList = ast.getLeftExpression().getGeneratedInstructionList();
		instrList.addAll(ast.getRightExpresssion().getGeneratedInstructionList());
		instrList.add(instr);
		
		ast.setInstructionList(instrList);
		return;
	}

	public void visit(StatementAST stmt)
	{
		// Just for now...
	}
	
	public void visit(BlockAST ast) {
		for (StatementAST x : ast.getStatementList())
		{
			// Add all instructions from the expression to the current block.
			for (TurtleICodeNonbranchingInstruction i: x.getGeneratedInstructionList()) {
				/********try {
					try {
						//currentBlock.addInstruction(i);
					} catch (BlockContainsTerminatingInstructionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				instructionList.add(i);
			}
		}
	}

	public void visit(ExpressionAST ast) {
		
	}

	public void visit(ExpressionStatementAST ast) {
		// Add all instructions from the expression to the current block.
		for (TurtleICodeNonbranchingInstruction i: ast.getExpression().
				getGeneratedInstructionList()) {
			try {
				currentBlock.addInstruction(i);
			} catch (BlockContainsTerminatingInstructionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instructionList.add(i);
		}
		return;
	}
	
	public void visit(FunCallExpressionAST ast) throws ReturnException {
		if (ast.getFunName().equals("make")) {
			if (ast.getArguments().size() != 2)
			{
				System.err.println("Error! ``make'' is called with two arguments. " 
						+ ast.getStartToken());
				return;
			}
			
			String variableName = ast.getArguments().get(0).
				getEvaluationResult().getStringData();
			
			if (variableName != null)
			{
				Type t = ast.getArguments().get(1).getExpressionType();
				LocalVariableLocation loc; 
				
				// Calculate where the result should be stored.
				if (currentFunction.getLocalVariable(variableName) != null)
				{
					if (currentFunction.getLocalVariable(variableName).
							getLocationType().identicalType(t))
					{
						// This variable is already defined and we should simply use that 
						// definition instead.
						loc = currentFunction.getLocalVariable(variableName);
					}
					else
					{
						// This variable is already defined, but it's defined using a different type
						// to support a pseudo dynamic typing convention we simply create a new variable
						// and subsequently refer to that.
						// 
						// The call to addLocalVariable replaces the current definition of variableName
						// with a new reference number for this variable.
						loc = currentFunction.addLocalVariable(variableName, t);
					}
				}
				else
				{
					// This variable isn't defined yet
					loc = currentFunction.addLocalVariable(variableName, t);
				}
				
				loc.setLocationType(t);

				TurtleICodeAssignInstruction assign = new TurtleICodeAssignInstruction();
				assign.setFromLocation(ast.getArguments().get(1).getResultLocation());
				assign.setResult(null);
				assign.setStoreLocation(loc);
				List<TurtleICodeNonbranchingInstruction> code = 
					ast.getArguments().get(1).getGeneratedInstructionList();
				code.add(assign);
				ast.setInstructionList(code);
			} else {
				System.err.println("Error! Trying to ``make'' a non variable! " + ast.getStartToken());
				return;
			}
		} else if (ast.getFunName().equals("pendown")) {
			handleTurtleFunctionCall(ast, "pendown", 0);
		} else if (ast.getFunName().equals("pd")) {
			handleTurtleFunctionCall(ast, "pendown", 0);
		} else if (ast.getFunName().equals("forward")) {
			handleTurtleFunctionCall(ast, "forward", 1);
		} else if (ast.getFunName().equals("fd")) {
			handleTurtleFunctionCall(ast, "forward", 1);
		}
	}
	
	public void handleTurtleFunctionCall(FunCallExpressionAST ast, String expectedName, int expectedArguments)
	{
		// Check for the right number of arguments
		if (ast.getArguments().size() != expectedArguments)
		{
			System.err.println("Error! Trying to call ``" + expectedName 
					+ "'' with an innappropriate number of arguments: " + ast.getStartToken());
			return;
		}
		
		// Check that they are all of integral type
		if (!allArgumentsInts(ast))
		{
			System.err.println("Error! Trying to call ``" + expectedName
					+ "'' with a non integral argument: " + ast.getStartToken());
			return;
		}
		
		List<TurtleICodeNonbranchingInstruction> instrList = new LinkedList<TurtleICodeNonbranchingInstruction>();
		TurtleICodeTurtleFunction instr = new TurtleICodeTurtleFunction();
		TurtleICodeJVMHack hack = new TurtleICodeJVMHack();
		hack.setHack(Hacks.TurtleFunction);
		
		for (ExpressionAST i : ast.getArguments())
		{
			instrList.add(hack);
			instrList.addAll(i.getGeneratedInstructionList());
			instr.addArgument(i.getResultLocation());
		}
		
		instrList.add(instr);
		ast.setExpressionType(BasicType.BasicVoid);
		
		return;
	}
	
	public boolean allArgumentsInts(FunCallExpressionAST ast)
	{
		for (ExpressionAST i : ast.getArguments())
		{
			if (!i.getExpressionType().identicalType(BasicType.BasicInteger))
				return false;
		}
		return true;
	}

	/**
	 * Evaluate an identifier, what should we do in this instance? 	
	 */
	public void visit(IdentifierAtomExpressionAST ast) {
		if (currentFunction.getLocalVariable(ast.getIdentifier()) == null)
		{
			if (ast.getAssignedVariable())
			{
				BasicTypeData ret = new BasicTypeData();
				ret.setStringData(ast.getIdentifier());
				ret.setDataType(BasicType.BasicString);
				ast.setEvaluationResult(ret);
				return;
			}
			else
			{
				System.err.println("Error, cannot lookup variable " + ast.getIdentifier() 
						+ " at " + ast.getStartToken());
			}
		}
		ast.setResultLocation(currentFunction.lookupLocation(ast.getIdentifier()));
		ast.setExpressionType(currentFunction.lookupLocation(ast.getIdentifier()).getLocationType());
	}

	public void visit(IntegerAtomExpressionAST ast) {
		BasicTypeData newData = new BasicTypeData();
		newData.setIntData(ast.number);
		newData.setDataType(BasicType.BasicInteger);
		TurtleICodeLoadConstant instr = new TurtleICodeLoadConstant();
		instr.setData(newData);
		TemporaryVariableLocation loc = currentFunction.newTemporaryVariable();
		loc.setLocationType(BasicType.BasicInteger);
		instr.setResult(loc);
		ast.setResultLocation(instr.getResult());
		ast.setExpressionType(BasicType.BasicInteger);
		ast.addGeneratedInstruction(instr);
		return;
	}
	
	public void visit(DecimalAtomExpressionAST ast) {
		BasicTypeData newData = new BasicTypeData();
		newData.setDoubleData(ast.number);
		newData.setDataType(BasicType.BasicDecimal);
		TurtleICodeLoadConstant instr = new TurtleICodeLoadConstant();
		instr.setData(newData);
		TemporaryVariableLocation loc = currentFunction.newTemporaryVariable();
		loc.setLocationType(BasicType.BasicDecimal);
		instr.setResult(loc);
		ast.setResultLocation(instr.getResult());
		ast.setExpressionType(BasicType.BasicDecimal);
		ast.addGeneratedInstruction(instr);
		return;
	}

	public void visit(IfStmtAST ast) throws ReturnException {
		// Do nothing...
	}

	public void visit(ToplevelAST ast) {
		
	}
	
	/*
	 * Handle a unary expression. 
	 */
	public void visit(UnaryExpressionAST ast) {
		TurtleICodeUnaryInstruction instr = new TurtleICodeUnaryInstruction();
		TemporaryVariableLocation newLoc = currentFunction.newTemporaryVariable();
		instr.setOperandLocation(ast.getOperand().getResultLocation());
		instr.setOperation(ast.getOperator());
		instr.setResult(newLoc);
		ast.setResultLocation(instr.getResult());
		ast.getOperand().getInstructionList().add(instr);
		ast.setInstructionList(ast.getOperand().getInstructionList());
		
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
			ast.setEvaluationResult(ast.getOperand().getEvaluationResult());
			ast.setExpressionType(ast.getOperand().getExpressionType());
		}
		}

		return;
	}

	public void visit(WhileStmtAST ast) throws ReturnException {
		// Do nothing...
	}

	public void visit(FunctionDefinitionAST ast) {
		// Do nothing...
	}
}
