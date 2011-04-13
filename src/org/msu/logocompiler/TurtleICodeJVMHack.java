package org.msu.logocompiler;

import java.util.Set;

public class TurtleICodeJVMHack extends TurtleICodeNonbranchingInstruction {
	public enum Hacks {
		Print,
		TurtleFunction,
	}

	public String generateJVMCode() {
		return null;
	}
	
	private Hacks hack;
	
	public void setHack(Hacks hack) {
		this.hack = hack;
	}
	
	public Hacks getHack() { return hack; } 
}
