package org.msu.logocompiler;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * The representation of a turtle function.
 * 
 * @author kmicinski
 */
public class TurtleICodeTurtleFunction extends TurtleICodeNonbranchingInstruction {
	private String functionName;
	
	private List<Location> arguments;
	
	public TurtleICodeTurtleFunction() {
		arguments = new LinkedList<Location>();
	}
	
	public void setName(String name) { functionName = name; }
	public String getName() { return functionName; }
	
	public void addArgument(Location l) {
		arguments.add(l);
	}
	
	public List<Location> getArguments() { return arguments; }

	public String generateJVMCode() {
		return "turtle...";
	}
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}

}
