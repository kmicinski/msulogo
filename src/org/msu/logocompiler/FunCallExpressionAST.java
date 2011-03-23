/**
 *
 */

package org.msu.logocompiler;

import java.util.List;
import java.util.LinkedList;

/**
 * 
 */
public class FunCallExpressionAST extends ExpressionAST
{
    private String funName;
    private List<ExpressionAST> arguments;
    
    public String getFunName() { return funName; }
    public void setFunName(String name) { funName = name; }
    
    public List<ExpressionAST> getArguments() { return arguments; }
    public void setArguments(List<ExpressionAST> args) { arguments = args; }
    
    public FunCallExpressionAST(String name, List<ExpressionAST> arguments)
    {
	this.arguments = arguments;
	funName = name;
    }
    
    public void accept(ASTVisitor v) {
	for (ExpressionAST argument : arguments) {
	    argument.accept(v);
	}
		
	v.visit(this);
    }
    
    public FunCallExpressionAST clone()
    {
    	List<ExpressionAST> argList = new LinkedList<ExpressionAST>();
    	
    	for (ExpressionAST arg : arguments)
    	{
    		argList.add(arg.clone());
    	}
    	
    	FunCallExpressionAST clone = new FunCallExpressionAST(funName, argList);
    	return clone;
    }
}