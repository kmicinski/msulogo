package org.msu.logocompiler;

import java.util.List;
import java.util.LinkedList;

public abstract class SExprAST extends StatementAST
{
    private String carIdentifier;
    private List<ExpressionAST> expressionList;
    
    public SExprAST()
    {
	expressionList = new LinkedList<ExpressionAST>();
    }
    
    public String getCarIdentifier() { return carIdentifier; }
    public void setCarIdentifier(String cid) { carIdentifier = cid; }
    
    public List<ExpressionAST> getExpressionList() 
    { 
	return expressionList;
    }
    
    public void addExpression(ExpressionAST expr)
    {
	expressionList.add(expr);
    }
    
    public void accept(ASTVisitor visitor)
    {
	// Will need to implement this ASAP...
	//visitor.visit(this);
    }
}
