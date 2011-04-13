package org.msu.logocompiler;

import org.msu.logocompiler.BinaryExpressionAST.BinOps;

public class TurtleICodeBinaryInstruction extends TurtleICodeNonbranchingInstruction {
	private Location leftOperandLocation;
	private Location rightOperandLocation;
	
	public Location getLeftOperandLocation() { return leftOperandLocation; }
	public Location getRightOperandLocation() { return rightOperandLocation; }
	
	public void setLeftOperandLocation(Location l) { leftOperandLocation = l; }
	public void setRightOperandLocation(Location l) { rightOperandLocation = l; }
	
	private BinOps operation;
	
	public BinOps getOperation() { return operation; }
	public void setOperation(BinOps op) { operation = op; }

	public String generateJVMCode() {
		return "binop";
	}
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}
}
