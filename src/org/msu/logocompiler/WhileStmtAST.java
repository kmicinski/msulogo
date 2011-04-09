package org.msu.logocompiler;

public class WhileStmtAST extends StatementAST
{
    private ExpressionAST conditionalExpression;
    
    private BlockAST executionBlock;
    
    public void setConditional(ExpressionAST c) { conditionalExpression = c; }
    
    public void setExecutionBlock(BlockAST b) {executionBlock = b; }
    
    public ExpressionAST getConditional() { return conditionalExpression; }
    public BlockAST getExecutionBlock() { return executionBlock; }
    
    public void accept(ASTVisitor visitor) throws ReturnException 
    {
    	visitor.visit(this);
    }
    
    public WhileStmtAST clone()
    {
    	WhileStmtAST clone = new WhileStmtAST();
    	
    	clone.setConditional(conditionalExpression.clone());
    	clone.setExecutionBlock(executionBlock.clone());
    	
    	return clone; 
    }
}