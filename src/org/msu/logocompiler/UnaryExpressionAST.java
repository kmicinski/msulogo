package org.msu.logocompiler;

import java.util.Map;
import java.util.HashMap;

public class UnaryExpressionAST extends ExpressionAST
{
    public enum UnaryOps {
	Plus, Minus, Quote, Colon
    }
    
    public static Map<String,UnaryOps> stringUnaryOpMap;
    
    static {
	stringUnaryOpMap = new HashMap<String,UnaryOps>();
	stringUnaryOpMap.put("\"", UnaryOps.Quote);
	stringUnaryOpMap.put(":", UnaryOps.Colon);
    }
    
    private ExpressionAST operandAST;
    private UnaryOps operator;
    
    public void setOperand(ExpressionAST o) { operandAST = o; }
    public ExpressionAST getOperand() { return operandAST; }
    
    public UnaryOps getOperator() { return operator; }
    public void setOperator(UnaryOps op) { operator = op; }
    
	public void accept(ASTVisitor v) {
		operandAST.accept(v);
		v.visit(this);
	}
}