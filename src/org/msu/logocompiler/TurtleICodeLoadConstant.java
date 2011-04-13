package org.msu.logocompiler;

import java.util.Set;

public class TurtleICodeLoadConstant extends TurtleICodeNonbranchingInstruction {
	private BasicTypeData constantData;
	
	public void setData (BasicTypeData d) { constantData = d; }
	public BasicTypeData getData() { return constantData; }

	public String generateJVMCode() {
		return "loadconst";
	}
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}

}
