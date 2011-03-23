package org.msu.logocompiler;

import java.util.Map;
import java.util.HashMap;

public class BinaryExpressionAST extends ExpressionAST
{
	public enum BinOps {
		Plus,
		Minus, 
		Equals, 
		Divide,
		Multiply, 
		Lt,
		Lte,
		Gt,
		Gte,
		And, 
		Or
	}

	public static Map<String,BinOps> stringBinOpMap;
	public static Map<String,EvaluatorFunctionHandler> handlingFunctionsMap;
	
	static {
		stringBinOpMap = new HashMap<String,BinOps>();

		stringBinOpMap.put("+",BinOps.Plus);
		stringBinOpMap.put("-",BinOps.Minus);
		stringBinOpMap.put("=",BinOps.Equals);
		stringBinOpMap.put("*",BinOps.Multiply);
		stringBinOpMap.put("/",BinOps.Divide);
		stringBinOpMap.put("<",BinOps.Lt);
		stringBinOpMap.put("<=",BinOps.Lte); 
		stringBinOpMap.put(">",BinOps.Gt);
		stringBinOpMap.put(">=",BinOps.Gte);
		stringBinOpMap.put("&&", BinOps.And);
		stringBinOpMap.put("||", BinOps.Or);
		
		//handlingFunctionsMap = new HashMap<String,EvaluatorFunctionHandler>();
			
	}
	
	private ExpressionAST leftExpressionAST;
	private ExpressionAST rightExpressionAST;
	private BinOps operator;

	public void setLeftAST(ExpressionAST l) { leftExpressionAST = l; }
	public void setRightAST(ExpressionAST r) { rightExpressionAST = r; }
	public void setOperator(BinOps o) { operator = o; }

	public ExpressionAST getLeftExpression() { return leftExpressionAST; }
	public ExpressionAST getRightExpresssion() { return rightExpressionAST; }
	public BinOps getOperator() { return operator; }
	
	public void accept(ASTVisitor v) {
		leftExpressionAST.accept(v);
		rightExpressionAST.accept(v);
		
		v.visit(this);
	}
	
	public BinaryExpressionAST clone()
	{
		BinaryExpressionAST clone = new BinaryExpressionAST();
		
		clone.setStartToken(getStartToken());
		//clone.setEvaluationResult(data.clone());
		clone.setOperator(operator);
		clone.setLeftAST(leftExpressionAST.clone());
		clone.setRightAST(rightExpressionAST.clone());
		clone.setExpressionType(getExpressionType());
		
		return clone;
	}
}
