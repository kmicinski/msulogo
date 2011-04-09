package org.msu.logocompiler;

public class ExpressionStatementAST extends StatementAST
{
    private ExpressionAST expression;
    
    public void setExpression(ExpressionAST ast) { expression = ast; }
    public ExpressionAST getExpression() { return expression; }
	public void accept(ASTVisitor v) throws ReturnException {
		expression.accept(v);
	}
	
	public ExpressionStatementAST clone()
	{
		ExpressionStatementAST clone = new ExpressionStatementAST();
		clone.setExpression(expression.clone());
		return clone;
	}
}