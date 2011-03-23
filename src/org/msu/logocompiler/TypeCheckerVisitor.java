package org.msu.logocompiler;

/**
 * Class to do type annotation on a toplevel Abstract Syntax Tree for our 
 * Logo language.
 * 
 * @author Kristopher Micinski.
 *
 */
public class TypeCheckerVisitor implements ASTVisitor {
    private DeclarationDataEnvironment toplevelEnvironment;
    BlockAST currentBlock;
    
    public void visit(BlockAST bast) {
	currentBlock = bast;
	
	for (StatementAST statement : currentBlock.getStatementList()) {
	    statement.accept(this);
	}
    }
    
    public void visit(AtomExpressionAST ast) {
	// nothing...
    }

    public void visit(FunctionDefinitionAST ast) {
	// nothing...
    }

    public void visit(IntegerAtomExpressionAST ast) {
	// nothing...
    }
    
    public void visit(DecimalAtomExpressionAST ast) {
	// nothing...
    }


    public void visit(BinaryExpressionAST ast) {
	// Make sure types are the same.
	if (!ast.getLeftExpression().getExpressionType().
	    identicalType(ast.getRightExpresssion().getExpressionType())) {
	    System.err.println("Types do not unify for binary expression at token: "
			       + ast.getStartToken());
	}
	    
	if (!(ast.getExpressionType() instanceof BasicType)) {
	    System.err.println("Attempting to apply a simple operator to a complex type! "
			       + "At token " + ast.getStartToken());
	}
	    
	BasicType type = (BasicType)ast.getExpressionType();
	    
	switch (ast.getOperator()) {
	case Plus:
	case Minus:
	case Divide:
	case Multiply:
	    handleMathBin(ast);
	    return;
	case Equals:
	case Lt:
	case Lte:
	case Gt:
	case Gte:
	case And:
	case Or:
	    handleBoolean(ast);
	    return;
	}
    }
    
    public void handleMathBin(BinaryExpressionAST ast)
    {
	BasicType type = (BasicType)ast.getExpressionType();

	// Take the type of the left subtree, equally well right
	Type t = ast.getLeftExpression().getExpressionType();
	ast.setExpressionType(t);
    }
    
    public void handleBoolean(BinaryExpressionAST ast)
    {
	BasicType type = new BasicType();
	type.setBaseType(Type.BaseTypes.Boolean);
	ast.setExpressionType(type);
    }
    
    public void visit(ExpressionAST ast) {
	
    }

    public void visit(ExpressionStatementAST ast) {
	// Nothing...
    }

    public void visit(FunCallExpressionAST ast) {
	
	// For now we're going to live dangerously and not type 
	// check the basic functions... Bad deal, huh?
	// Jay kay, jay kay, they're actually just typed checked 
	// by the handlers...
	//   -- Kris
    }
    
    public void visit(IdentifierAtomExpressionAST ast) {
	// Calculate the type and evaluate
	BasicType t = new BasicType();
	t.setBaseType(Type.BaseTypes.String);
	ast.setExpressionType(t);		
    }

    public void visit(IfStmtAST ast) {
	ast.getConditional().accept(this);
	/*BasicType bt = ast.getConditional().getExpressionType();
	if (bt.getBaseType() != Type.BaseTypes.Boolean) {
	    System.err.println("need a boolean expression for an if statement");
	    }*/
    }
    
    /**
     * Type check a unary expression
     */
    public void visit(UnaryExpressionAST ast) {
	switch (ast.getOperator()) {
	case Quote:
	    {
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
		if (t.getBaseType() != Type.BaseTypes.String) {
		    System.err.println("Need a string, cannot : anything other than a string, "
				       + ast.getStartToken());
		}
		
		//ast.setExpressionType(anstype);
		return;
	    }
	}

    }
    
    // Type check ``while''
    public void visit(WhileStmtAST ast) {
	ast.getConditional().accept(this);
	
	if (!(ast.getConditional().getExpressionType() instanceof BasicType)) {
	    System.err.println("need a boolean expression for an if statement");
	}
	
	BasicType bt = (BasicType)ast.getConditional().getExpressionType();
	
	if (bt.getBaseType() != Type.BaseTypes.Boolean) {
	    System.err.println("need a boolean expression for an if statement");
	}
		
    }

	@Override
	public void visit(ToplevelAST ast) {
		// TODO Auto-generated method stub
		
	}
}
