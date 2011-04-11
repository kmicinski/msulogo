package org.msu.logocompiler;

import java.util.List;

public class ExpressionStatementAST extends StatementAST
{
    private ExpressionAST expression;
    
    public void setExpression(ExpressionAST ast) { expression = ast; }
    public ExpressionAST getExpression() { return expression; }
	public void accept(ASTVisitor v) throws ReturnException {
		expression.accept(v);
		super.accept(v);
	}
	
	public ExpressionStatementAST clone()
	{
		ExpressionStatementAST clone = new ExpressionStatementAST();
		clone.setExpression(expression.clone());
		return clone;
	}
	
	public List<TurtleICodeNonbranchingInstruction> getGeneratedInstructionList()
	{
		return expression.getGeneratedInstructionList();
	}
}