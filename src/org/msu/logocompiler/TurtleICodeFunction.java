package org.msu.logocompiler;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/*
 * The turtle intermediate code that represents a function.  When we create 
 * functions, we must keep track of the instructions and also their scope. 
 * Along with that, we keep track of their parameters. 
 */
public class TurtleICodeFunction {
	// The map of local variables, each local variable will eventually 
	// be mapped to a place in the local variable space in the JVM
	// or on the stack, this is used to keep track of the environment.
	private DeclarationLocationEnvironment<Integer,LocalVariableLocation> localVariableMap;
	
	// Temporary variables are indexed by integers, this map allows lookup 
	// of variable info (type, and thus size) from variable number.
	private DeclarationLocationEnvironment<Integer,TemporaryVariableLocation> temporaryVariableMap;
	
	// A map of the function variables to their types and names
	private DeclarationLocationEnvironment<String,FunctionArgumentLocation> functionArgumentMap;
	
	private int temporaryCounter = 0;
	private int localCounter = 0;
	
	private HashMap<String,Integer> currentVariableMap;
	
	// The function's return type
	private Type returnType;
	
	public TurtleICodeFunction()
	{
		localVariableMap = new DeclarationLocationEnvironment<Integer,LocalVariableLocation>(null);
		functionArgumentMap = new DeclarationLocationEnvironment<String, FunctionArgumentLocation>(null);
		temporaryVariableMap = new DeclarationLocationEnvironment<Integer, TemporaryVariableLocation>(null);
		currentVariableMap = new HashMap<String,Integer>();
		return;
	}
		
	public DeclarationLocationEnvironment<Integer, LocalVariableLocation> getLocalVariableMap()
	{
		return localVariableMap;
	}
	
	public TemporaryVariableLocation newTemporaryVariable()
	{
		TemporaryVariableLocation loc = new TemporaryVariableLocation(temporaryCounter++);
		temporaryVariableMap.addLocation(loc.getVariableNumber(), loc);
		return loc;
	}
	
	public Location lookupLocation(String name)
	{
		if (functionArgumentMap.lookupVariable(name) != null)
		{
			return functionArgumentMap.lookupVariable(name);
		}
		return getLocalVariable(name);
	}
	
	// The entry to the function, the first block that should be executed.
	// This can be seen as the beginning of the control flow graph into the 
	// function.
	private TurtleICodeBlock entryBlock;
	
	public void setEntryBlock(TurtleICodeBlock block)
	{
		entryBlock = block;
	}
	
	public LocalVariableLocation getLocalVariable(String s)
	{
		Integer i = currentVariableMap.get(s);
		if (i != null)
		{
			return localVariableMap.lookupVariable(i);
		}
		return null;
	}
	
	public boolean localVariableExists(String s, Type t)
	{
		Integer i = currentVariableMap.get(s);
		if (i != null)
		{
			if (localVariableMap.lookupVariable(i) != null)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public LocalVariableLocation addLocalVariable(String s, Type t)
	{
		LocalVariableLocation loc = new LocalVariableLocation();
		loc.setLocationType(t);
		loc.setVariableName(s);
		loc.setDeclaredEnvironment(localVariableMap);
		currentVariableMap.put(s, localCounter);
		localVariableMap.addLocation(localCounter, loc);
		loc.setVariableNumber(localCounter++);
		return loc;
	}
	
	public TurtleICodeBlock getEntryBlock() { return entryBlock; }
}
