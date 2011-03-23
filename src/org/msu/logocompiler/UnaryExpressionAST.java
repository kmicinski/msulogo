package org.msu.logocompiler;

import java.util.Map;
import java.util.HashMap;

public class UnaryExpressionAST extends ExpressionAST
{
    public enum UnaryOps {
	Plus, Minus, Quote, Colon, Not
	    }
    
    public static Map<String,UnaryOps> stringUnaryOpMap;
    
    static {
	stringUnaryOpMap = new HashMap<String,UnaryOps>();
	stringUnaryOpMap.put("QUOTE", UnaryOps.Quote);
	stringUnaryOpMap.put("COLON", UnaryOps.Colon);
	stringUnaryOpMap.put("not", UnaryOps.Not);
	stringUnaryOpMap.put("NOT", UnaryOps.Not);
    }
    
    private ExpressionAST operandAST;
    private UnaryOps operator;
    
    public void setOperand(ExpressionAST o) { operandAST = o; }
    public ExpressionAST getOperand() { return operandAST; }
    
    public UnaryOps getOperator() { return operator; }
    public void setOperator(UnaryOps op) { operator = op; }
    
    public void accept(ASTVisitor v) {
	// There's a bit of trick here, to support the interpreter, 
	// we don't want to visit quoted expressions.
	//if (operator != UnaryOps.Quote) {
	    operandAST.accept(v);
	//}
	
	v.visit(this);
    }
    
    public UnaryExpressionAST clone()
    {
    	UnaryExpressionAST clone = new UnaryExpressionAST();
    	
    	//clone.setExpressionType()
    	clone.setOperand(operandAST.clone());
    	clone.setOperator(operator);
    	
    	return clone;
    }
}