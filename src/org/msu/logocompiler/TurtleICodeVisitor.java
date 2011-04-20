package org.msu.logocompiler;

public interface TurtleICodeVisitor {
	public void visit(TurtleICodeInstruction turtleICodeInstruction);
	public void visit(TurtleICodeUnaryInstruction i);
	public void visit(TurtleICodeTurtleFunction i);
	public void visit(TurtleICodeReturnInstruction i);
	public void visit(TurtleICodeNonbranchingInstruction i);
	public void visit(TurtleICodeLoadConstant i);
	public void visit(TurtleICodeI2D i);
	public void visit(TurtleICodeBinaryInstruction i);
	public void visit(TurtleICodeAssignInstruction i);
	public void visit(TurtleICodeJVMHack i);
	public void visit(TurtleICodePrint i);
}
