package org.msu.logocompiler;

public class IfStmtAST extends StatementAST
{
    private ExpressionAST conditionalExpression;
    
    private BlockAST executionBlock;
    private BlockAST elseBlock;
    
    public void setConditional(ExpressionAST c) { conditionalExpression = c; }
    
    public void setExecutionBlock(BlockAST b) {executionBlock = b; }
    public void setElseBlock(BlockAST b) { elseBlock = b; }
    
    public ExpressionAST getConditional() { return conditionalExpression; }
    public BlockAST getExecutionBlock() { return executionBlock; }
    public BlockAST getElseBlock() { return elseBlock; }
    
    public void accept(ASTVisitor v)
    {
	v.visit(this);
    }
    
    public IfStmtAST clone()
    {
    	IfStmtAST clone = new IfStmtAST();
    	
    	clone.setConditional(conditionalExpression.clone());
    	clone.setElseBlock(elseBlock.clone());
    	clone.setExecutionBlock(executionBlock.clone());	// 
    	
    	return clone;
    }
}