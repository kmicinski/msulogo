package org.msu.logocompiler;

import org.msu.logocompiler.Type.BaseTypes;

public class TurtleICodePrint extends TurtleICodeNonbranchingInstruction {
	private BaseTypes type;
	
	public BaseTypes getType() { return type; }
	public void setType(BaseTypes t) { type = t; }
	
	public String generateJVMCode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void accept(TurtleICodeVisitor v) {
		v.visit(this);
	}
	
}
