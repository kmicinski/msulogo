package org.msu.logocompiler;

import java.util.HashMap;

public class DeclarationEnvironment 
{
    private DeclarationEnvironment parentEnvironment;

    private HashMap<String,Type> environment;
    
    private BasicTypeData returnValue;
    
    public DeclarationEnvironment(DeclarationEnvironment parent)
    {
	parentEnvironment = parent;
	environment = new HashMap<String,Type>();
	returnValue = null;
    }
    
    public DeclarationEnvironment getParentEnvironment()
    {
	return parentEnvironment;
    }
    
    public void setParentEnvironment(DeclarationEnvironment d)
    {
	parentEnvironment = d;
    }
    
    public BasicTypeData getReturnValue()
    {
	return returnValue;
    }
    
    public void setReturnValue(BasicTypeData d)
    {
	returnValue = d;
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
		DeclarationEnvironment environment = this;
		Type data = environment.environment.get(key);
		 
		// Search down the scope links to lookup the data.
		while (data == null && environment.parentEnvironment != null)
		{
			environment = environment.getParentEnvironment();
			data = environment.environment.get(key);
		}
		
		return data;
    }
}

