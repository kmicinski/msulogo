package org.msu.logocompiler;

public class TurtleICodeReturnInstruction extends TurtleICodeNonbranchingInstruction {
	public String generateJVMCode() {
		return "";
	}
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}


}
