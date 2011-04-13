package org.msu.logocompiler;

public class TurtleICodeI2D extends TurtleICodeNonbranchingInstruction {
	private Location fromLocation;
	
	public void setFromLocation(Location l) { fromLocation = l; }
	public Location getFromLocation() { return fromLocation; }

	public String generateJVMCode() {
		return "i2d";
	}
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}
}
