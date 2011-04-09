package org.msu.logocompiler;

/**
 * An instance of a basic type.
 */	
public class BasicType extends Type
{
	// A few primitive types that can be used throughout the code.
	public static final BasicType BasicInteger;
	public static final BasicType BasicDecimal;
	public static final BasicType BasicString;
	public static final BasicType BasicBoolean;
	
	static {
		BasicInteger = new BasicType();
		BasicInteger.setBaseType(BaseTypes.Integer);
		BasicDecimal = new BasicType();
		BasicDecimal.setBaseType(BaseTypes.Decimal);
		BasicString = new BasicType();
		BasicString.setBaseType(BaseTypes.String);
		BasicBoolean = new BasicType();
		BasicBoolean.setBaseType(BaseTypes.Boolean);
	}
	
	public boolean identicalType(Type t)
	{
		if (!(t instanceof BasicType)) {
			return false;
		}
		else {
			BasicType tprime = (BasicType)t;
			if (tprime.getBaseType() == getBaseType())
				return true;
			else
				return false;
		}
	}
}
