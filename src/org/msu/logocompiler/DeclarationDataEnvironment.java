package org.msu.logocompiler;

import java.util.HashMap;

import msu.cse.turtlegraphics.Turtle;

public class DeclarationDataEnvironment extends DeclarationEnvironment {
	private HashMap<String, BasicTypeData> environmentData;
	private Turtle activeTurtle;
	
	public DeclarationDataEnvironment(DeclarationDataEnvironment parent) {
		super(parent);
		environmentData = new HashMap<String, BasicTypeData>();
	}
	
	public void insertData(String key, BasicTypeData data) {
		environmentData.put(key, data);
	}
	
	public BasicTypeData lookupData(String key)
	{
		return environmentData.get(key);
	}

	public void setActiveTurtle(Turtle activeTurtle) {
		this.activeTurtle = activeTurtle;
	}

	public Turtle getActiveTurtle() {
		return activeTurtle;
	}
}
