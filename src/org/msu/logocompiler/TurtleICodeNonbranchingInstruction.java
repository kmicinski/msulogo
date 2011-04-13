package org.msu.logocompiler;

import java.util.Set;
import java.util.TreeSet;

public abstract class TurtleICodeNonbranchingInstruction extends TurtleICodeInstruction {
	private TurtleICodeInstruction nextInstruction = null;
	
	public TurtleICodeInstruction getNextInstruction() { return nextInstruction; }
	public void setNextInstruction(TurtleICodeInstruction instr) { nextInstruction = instr; }

	public Set<TurtleICodeInstruction> getFollowingInstructions() {
		TreeSet<TurtleICodeInstruction> set = new TreeSet<TurtleICodeInstruction>();
		set.add(nextInstruction);
		return set;
	}
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}

}
