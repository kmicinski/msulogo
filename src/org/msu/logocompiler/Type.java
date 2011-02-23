package org.msu.logocompiler;

/**
 * The toplevel type declaration.
 */
public abstract class Type 
{
    public enum BaseTypes {
	Integer,
	    Decimal,
	    Character,
	    String,
	    Function,
	    Boolean
    }
    
    private BaseTypes baseType;
    
    public BaseTypes getBaseType() { return baseType; }
    public void setBaseType(BaseTypes t) { baseType = t; }
    
    /**
     * Is this type identical to type t?
     */
    public abstract boolean identicalType(Type t);
}
