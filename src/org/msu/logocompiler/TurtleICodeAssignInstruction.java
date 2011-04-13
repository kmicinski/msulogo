package org.msu.logocompiler;

public class TurtleICodeAssignInstruction extends TurtleICodeNonbranchingInstruction {
	private Location storeLocation;
	private Location fromLocation;
	
	public void setStoreLocation(Location l)
	{
		storeLocation = l;
	}
	
	public void setFromLocation(Location l)
	{
		fromLocation = l;
	}
	
	public Location getStoreLocation() { return storeLocation; }
	public Location getFromLocation() { return fromLocation; }

	public String generateJVMCode() {
		switch(fromLocation.getLocationType().getBaseType())
		{
		case String:
			return "astore";
		case Integer:
			return "istore";
		case Decimal:
			return "dstore";
		}
		return null;
	}

	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}
}
