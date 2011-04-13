package org.msu.logocompiler;

/*
 * An explicit type cast.
 */
public class TypeCastAST extends ExpressionAST {
	public ExpressionAST clone() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Type 			fromType;
	private Type 			toType;
	private ExpressionAST 	argument;
	
	public Type getFromType() { return fromType; }
	public Type getToType() { return toType; }
	public ExpressionAST getArgument() { return argument; }
	
	public void setFromType(Type t)
	{
		fromType = t;
	}
	
	public void setToType(Type t)
	{
		toType = t;
	}
	
	public void setArgument(ExpressionAST a)
	{
		argument = a;
	}
}
