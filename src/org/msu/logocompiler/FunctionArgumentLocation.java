package org.msu.logocompiler;

public class FunctionArgumentLocation extends LocalVariableLocation {
	private int variableArgumentNumber;
	
	public void setVariableArgumentNumber(int argumentNumber) 
	{
		variableArgumentNumber = argumentNumber;
	}
	
	public int getVariableArgumentNumber()
	{
		return variableArgumentNumber;
	}
}
