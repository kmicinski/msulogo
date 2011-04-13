package org.msu.logocompiler;

/*
 * A location which corresponds to a local variable in a function's stack 
 * frame.
 */
public class LocalVariableLocation extends Location {
	private String variableName;
	private int localVariableNumber;
	
	public void setVariableName(String s)
	{
		variableName = s;
	}

	public boolean equals() {
		
		return false;
	}
	
	public void setVariableNumber(int i)
	{
		localVariableNumber = i;
	}
	
	public int getVariableNumber()
	{
		return localVariableNumber;
	}
}
