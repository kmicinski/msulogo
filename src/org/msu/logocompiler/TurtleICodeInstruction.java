package org.msu.logocompiler;

import java.util.Set;

public abstract class TurtleICodeInstruction {
	/*
	 * Many operations carry a result.  If this variable is non-null,
	 * it indicates the location of the result, which is stored in some 
	 * temporary location.
	 */
	private TemporaryVariableLocation result;
	
	/**
	 * Does this instruction terminate a block?
	 * 
	 * Certain instructions can be used to terminate a linear execution block.
	 * While many instructions simply proceed to the next after execution, 
	 * instructions such as "jumps" do not execute in a linear fashion.
	 */
	public boolean isTerminatingInstruction()
	{
		return false;
	}
	
	/**
	 * Does this instruction cause a branching of the tree.
	 *  
	 * @return true if the instruction causes the control flow graph to branch, false otherwise.
	 */
	public boolean isBranchingInstruction()
	{
		return false;
	}
	
	private String instructionLabel;
	
	public void setInstructionLabel(String label)
	{
		instructionLabel = label;
	}
	
	public String getInstructionLabel() {
		return instructionLabel;
	}
	
	public boolean hasLabel() { return instructionLabel != null; }
	
	public abstract Set<TurtleICodeInstruction> getFollowingInstructions();
	
	public boolean hasResult()
	{
		return result != null;
	}
	
	public TemporaryVariableLocation getResult() { return result; }
	public void setResult(TemporaryVariableLocation l) { result = l; }
	
	TurtleICodeInstruction()
	{
		result = null; 
	}
	
	public abstract String generateJVMCode();
	
	public void accept(TurtleICodeVisitor v)
	{
		v.visit(this);
	}
}

