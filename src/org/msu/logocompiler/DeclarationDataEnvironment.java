package org.msu.logocompiler;

import java.util.HashMap;

import msu.cse.turtlegraphics.Turtle;

public class DeclarationDataEnvironment extends DeclarationEnvironment {
	private HashMap<String, BasicTypeData> environmentData;
	private Turtle activeTurtle;
	private DeclarationDataEnvironment parentDataEnvironment;
	
	public DeclarationDataEnvironment(DeclarationDataEnvironment parent) {
		super(parent);
		parentDataEnvironment = parent;
		environmentData = new HashMap<String, BasicTypeData>();
	}
	
	public void setParentEnvironment(DeclarationDataEnvironment e)
	{
		parentDataEnvironment = e;
	}
	
	public DeclarationDataEnvironment getParentEnvironment()
	{
		return parentDataEnvironment;
	}
	
	public void insertData(String key, BasicTypeData data) {
		environmentData.put(key, data);
	}
	
	public BasicTypeData lookupData(String key)
	{
		DeclarationDataEnvironment environment = this;
		BasicTypeData data = environment.environmentData.get(key);
		 
		// Search down the scope links to lookup the data.
		while (data == null && environment.parentDataEnvironment != null)
		{
			environment = environment.getParentEnvironment();
			data = environment.environmentData.get(key);
		}
		
		return data;
	}

	public void setActiveTurtle(Turtle activeTurtle) {
		this.activeTurtle = activeTurtle;
	}

	public Turtle getActiveTurtle() {
		return activeTurtle;
	}
}
