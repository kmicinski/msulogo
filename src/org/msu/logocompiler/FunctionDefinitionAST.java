package org.msu.logocompiler;

import java.util.List;
import java.util.LinkedList;

/* 
 * An abstract tree representation of function definitions.
 * 
 * There's a really nice way to handle function definitions. 
 * We simply leave the function definition as an unprocessed 
 * bit of language, then we can simply call the evaluator on the 
 * definition whenever we need to interpret the function, 
 * along with a corresponding closure.
 */
public class FunctionDefinitionAST extends ToplevelAST
{
    /*
     * During execution, where should we get the current 
     * closure from.
     */
    private DeclarationDataEnvironment currentClosure;
    
    private String functionName;
    
    public String getFunctionName() { return functionName; }
    
    public void setFunctionName(String str) { functionName = str; }
    
    /*
     * The uninterpreted function body.
     */
    private BlockAST functionBody;
    
    private List<String> functionParameters;
    
    public List<String> getFunctionParameters() { return functionParameters; }
    
    public FunctionDefinitionAST()
    {
	currentClosure = new DeclarationDataEnvironment(null);
	functionParameters = new LinkedList<String>();
    }
    
    public DeclarationDataEnvironment getCurrentClosure()
    {
	return currentClosure;
    }
    
    public void setFunctionBody(BlockAST fun)
    {
	functionBody = fun;
    }
    
    public BlockAST getFunctionBody() { return functionBody; }
    
    public void setCurrentClosure(DeclarationDataEnvironment currentClosure)
    {
	this.currentClosure = currentClosure;
    }
    
    public void accept(ASTVisitor v) {
	v.visit(this);
    }
    
    public FunctionDefinitionAST clone()
    {
    	FunctionDefinitionAST x = new FunctionDefinitionAST();
    	x.setFunctionName(functionName);
    	// Currently we don't copy the current closure, should we?
    	//x.setCurrentClosure(null);
    	x.setFunctionBody(functionBody.clone());
    	
    	List<String> params = x.getFunctionParameters();
    	
    	for (String str : functionParameters)
    	{
    		params.add(str);
    	}
    	return x;
    }
    
}
