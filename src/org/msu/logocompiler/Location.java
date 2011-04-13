package org.msu.logocompiler;

/*
 * A location where information can be stored.
 * 
 * When we store variables 
 */
public abstract class Location {
	// The data type stored at this location;
	private Type locationType;
	private DeclarationLocationEnvironment declaredEnvironment;
	
	public void setDeclaredEnvironment(DeclarationLocationEnvironment e)
	{
		declaredEnvironment = e;
	}
	
	public DeclarationLocationEnvironment getDeclaredEnvironment()
	{
		return declaredEnvironment;
	}
	
	public boolean isLocalVariable() {
		return false;
	}
	
	public boolean isArgumentVariable() {
		return false;
	}
	
	public boolean isTemporaryVariable() {
		return false;
	}
	
	public void setLocationType(Type type) { locationType = type; }
	public Type getLocationType() { return locationType; }
	
	public abstract boolean equals();
}
