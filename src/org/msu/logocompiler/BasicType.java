package org.msu.logocompiler;

/**
 * An instance of a basic type.
 */	
public class BasicType extends Type
{
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
