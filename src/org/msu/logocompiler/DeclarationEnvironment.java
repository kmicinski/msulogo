package org.msu.logocompiler;

import java.util.HashMap;

public class DeclarationEnvironment 
{
	private DeclarationEnvironment parentEnvironment;

	private HashMap<String,Type> environment;

	public DeclarationEnvironment(DeclarationEnvironment parent)
	{
		parentEnvironment = parent;
		environment = new HashMap<String,Type>();
	}

	/**
	 * Insert a declaration into the environment.
	 *
	 * @param name The name of the object to be placed in the 
	 * environment.
	 * @param type The type of the object being placed in the 
	 * environment.
	 *
	 */
	public void insertDeclaration(String key, Type type)
	{
		environment.put(key,type);
	}

	public Type lookupDeclaration(String key)
	{
		return environment.get(key);
	}
}

