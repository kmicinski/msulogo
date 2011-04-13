package org.msu.logocompiler;

/*
 * A temporary location in memory.  Whenever executed code produces results, it is typically 
 * stored in some temporary location, and then used in other calculations or operations.  
 * For example, addition produces a temporary variable which may be consequently be used 
 * as the operand to a multiply or store operation.
 */
public class TemporaryVariableLocation extends Location {
	// Each location is assigned a unique number in its scope.
	private int variableNumber;	
	
	public TemporaryVariableLocation(int number)
	{
		variableNumber = number;
	}
	
	public void setVariableNumber(int number) { variableNumber = number; }
	
	public int getVariableNumber() { return variableNumber; }
	
	public boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}
}
