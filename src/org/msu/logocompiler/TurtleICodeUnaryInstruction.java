package org.msu.logocompiler;

import org.msu.logocompiler.UnaryExpressionAST.UnaryOps;

public class TurtleICodeUnaryInstruction extends TurtleICodeNonbranchingInstruction {
	private Location operandLocation;
	
	public Location getOperandLocation() { return operandLocation; }
	public void setOperandLocation(Location op) { operandLocation = op; }
	
	private UnaryOps operation;
	
	public UnaryOps getOperation() { return operation; }
	public void setOperation(UnaryOps op) { operation = op; }

	public String generateJVMCode() {
		return "unaryop";
	}
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}

}
