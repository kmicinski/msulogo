package org.msu.logocompiler;

import java.util.HashMap;

/**
 * This data structure keeps track of locations with respect to some scope.  Each location is indexed by an 
 * integer.  Why don't we index variables by strings instead?  The problem is that in a Logo function, we 
 * might use a variable to refer to two different types.  To accommodate this, we change simply call the variable 
 * (let's say "x") x_1 when it's used as one type, and x_2 (for example) when it's used as another type.  
 * 
 * @author Kris Micinski
 *
 */
public class DeclarationLocationEnvironment<F,E extends Location> {
	private HashMap<F, E> locationMap;
	private DeclarationLocationEnvironment<F,E> parentEnvironment;
	private HashMap<F, Type> typeMap;
	
	public DeclarationLocationEnvironment(DeclarationLocationEnvironment<F,E> parent) {
		parentEnvironment = parent;
		locationMap = new HashMap<F,E>();
		return;
	}
	
	public void addLocation(F i, E l) {
		locationMap.put(i, l);
		return;
	}
	
	public E lookupVariable(F var)
	{
		return locationMap.get(var);
	}
	
}
