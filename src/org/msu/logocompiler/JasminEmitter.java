package org.msu.logocompiler;

import java.util.HashMap;

import org.msu.logocompiler.BinaryExpressionAST.BinOps;
import org.msu.logocompiler.TurtleICodeJVMHack.Hacks;
import org.msu.logocompiler.Type.BaseTypes;

import sun.rmi.runtime.Log;

/**
 * A code generator for the Jasmin assembly language.
 * 
 * This code generator simply emits code for lists of instructions. 
 * 
 * 
 * @author Kristopher Micinski
 */
public class JasminEmitter implements TurtleICodeVisitor {
	private HashMap<Integer,Integer> varNumToPositionMap;
	private int currentLocalsCounter = 0;
	private static final HashMap<BinOps,HashMap<BaseTypes,String>> binOpMap;
	private String buffer;
	
	public JasminEmitter()
	{
		varNumToPositionMap = new HashMap<Integer,Integer>();
		currentLocalsCounter = 1;
	}
	
	static {
		binOpMap = new HashMap<BinOps,HashMap<BaseTypes,String>>();
		
		HashMap<BaseTypes,String> addMap = new HashMap<BaseTypes,String>();
		addMap.put(BaseTypes.Integer, "iadd");
		addMap.put(BaseTypes.Decimal, "dadd");
		HashMap<BaseTypes,String> subMap = new HashMap<BaseTypes,String>();
		subMap.put(BaseTypes.Integer, "isub");
		subMap.put(BaseTypes.Decimal, "dsub");
		HashMap<BaseTypes,String> divMap = new HashMap<BaseTypes,String>();
		divMap.put(BaseTypes.Integer, "idiv");
		divMap.put(BaseTypes.Decimal, "ddiv");
		HashMap<BaseTypes,String> mulMap = new HashMap<BaseTypes,String>();
		mulMap.put(BaseTypes.Integer, "imul");
		mulMap.put(BaseTypes.Decimal, "dmul");
		/*HashMap<BaseTypes,String> Map = new HashMap<BaseTypes,String>();
		subMap.put(BaseTypes.Integer, "imul");
		subMap.put(BaseTypes.Decimal, "dmul");
		*/
		
		binOpMap.put(BinOps.Plus, addMap);
		binOpMap.put(BinOps.Minus, subMap);
		binOpMap.put(BinOps.Divide, divMap);
		binOpMap.put(BinOps.Multiply, mulMap);
	}
	
	public void emitBeginning()
	{
		String beginning = 
		".class public TurtleTestJasmin\n"
		+ ".super java/lang/Object\n"
		+ "\n"
		+ ".method public <init>()V\n"
		+ "\taload_0\n"
		+ "\tinvokespecial java/lang/Object/<init>()V\n"
		+ "\treturn\n"
		+ ".end method\n"
		+ "\n"
		+ ".method public static main([Ljava/lang/String;)V\n"
		+ "\t.limit locals 10\n"
		+ "\t.limit stack 10\n"
		+ "\n"
		+ "\tnew	msu/cse/turtlegraphics/Turtle\n"
		+ "\tdup\n"
		+ "\tinvokespecial msu/cse/turtlegraphics/Turtle/<init>()V\n"
		+ "\tastore_1\n"
		+ "\tnew	msu/cse/turtlegraphics/TurtleDisplayFrame\n"
		+ "\tdup\n"
		+ "\tinvokespecial	msu/cse/turtlegraphics/TurtleDisplayFrame/<init>()V\n"
		+ "\tastore_2\n"
		+ "\taload_2\n"
		+ "\ticonst_1\n"
		+ "\tinvokevirtual	msu/cse/turtlegraphics/TurtleDisplayFrame/setVisible(Z)V\n"
		+ "\taload_1\n"
		+ "\taload_2\n"
		+ "\tinvokevirtual	msu/cse/turtlegraphics/TurtleDisplayFrame/getCurrentCanvas()Lmsu/cse/turtlegraphics/TurtleDisplayCanvas;\n"
		+ "\tinvokevirtual	msu/cse/turtlegraphics/Turtle/setCurrentTurtleDisplayCanvas(Lmsu/cse/turtlegraphics/TurtleDisplayCanvas;)V\n";
		
		buffer += beginning;
	}
	
	public void emitEnd()
	{
		String end =
			"\treturn\n"
		+ ".end method\n";
		
		buffer += end;
	}
	
	public void dumpBuffer()
	{
		System.out.println(buffer);
	}
	
	public void visit(TurtleICodeInstruction turtleICodeInstruction) {
		return;
	}
	
	public void emit(String s)
	{
		buffer += "\t" + s + "\n";
	}
	
	public void visit(TurtleICodeUnaryInstruction i) {
		switch (i.getOperation())
		{
		case Colon:
			int varNum = ((LocalVariableLocation)i.getOperandLocation()).getVariableNumber();
			if (i.getOperandLocation().getLocationType().identicalType(BasicType.BasicInteger))
			{
				emit("iload " + varNumToPositionMap.get(varNum));
			}
			else if (i.getOperandLocation().getLocationType().identicalType(BasicType.BasicDecimal))
			{
				emit("dload " + varNumToPositionMap.get(varNum));
			}
			else if (i.getOperandLocation().getLocationType().identicalType(BasicType.BasicString))
			{
				emit("aload " + varNumToPositionMap.get(varNum));
			}
			break;
		}
	}

	public void visit(TurtleICodeTurtleFunction i) {
		return;
	}

	public void visit(TurtleICodeReturnInstruction i) {
		return;
	}

	public void visit(TurtleICodeNonbranchingInstruction i) {
		return;
	}
	
	public void visit(TurtleICodeJVMHack hack) {
		if (hack.getHack() == Hacks.Print) {
			System.out.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
		} else if (hack.getHack() == Hacks.TurtleFunction) {
			System.out.println("\taload_1");
		}
	}
	
	public void visit(TurtleICodeLoadConstant i) {
		if (i.getData().getDataType().identicalType(BasicType.BasicInteger))
		{
			emit("ldc " + i.getData().getIntData());
		}
		else if (i.getData().getDataType().identicalType(BasicType.BasicDecimal))
		{
			emit("ldc2_w " + i.getData().getDoubleData());
		}
		else if (i.getData().getDataType().identicalType(BasicType.BasicString))
		{
			emit("ldc \"" + i.getData().getStringData() + "\"");
		}
	}

	public void visit(TurtleICodeI2D i) {
		emit ("i2d");
	}

	public void visit(TurtleICodeBinaryInstruction i) {
		BinOps op = i.getOperation();
		BaseTypes tp = i.getLeftOperandLocation().getLocationType().getBaseType();
		
		emit(binOpMap.get(op).get(tp));
	}

	public void visit(TurtleICodeAssignInstruction i) {
		int storeLoc = 0;
		LocalVariableLocation loc = (LocalVariableLocation)i.getStoreLocation();
		if (varNumToPositionMap.get(loc.getVariableNumber()) != null) {
			// This variable has already appeared somewhere before and we should 
			// simply store into that.
			storeLoc = 	loc.getVariableNumber();
		}
		else
		{
			varNumToPositionMap.put(loc.getVariableNumber(), currentLocalsCounter);
			storeLoc = currentLocalsCounter;
			switch (i.getStoreLocation().getLocationType().getBaseType())
			{
			case String:
			case Integer:
				currentLocalsCounter++;
				break;
			case Decimal:
				currentLocalsCounter += 2;
				break;
			}
		}
		
		switch (i.getStoreLocation().getLocationType().getBaseType())
		{
		case String:
			emit("astore " + storeLoc);
			break;
		case Integer:
			emit("istore " + storeLoc);
			break;
		case Decimal:
			emit("dstore " + storeLoc);
			break;
		}
		
		return;
	}
}
