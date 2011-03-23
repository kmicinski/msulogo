package org.msu.logocompiler;

/**
 * A class that carries a ``basic packet'' of data for use in the evaluator.
 * 
 * @author Kristopher Micinski
 *
 */
public class BasicTypeData {
    private BasicType dataType;
	
    private int intData;
    private String stringData;
    private char charData;
    private double doubleData;
    private boolean boolData;
    private EvaluatorFunctionHandler functionHandler;
    private FunctionDefinitionAST definedFunction;
    public void setDataType(BasicType dataType) { this.dataType = dataType;	}
    public BasicType getDataType() { return dataType; }
    
    public void setIntData(int intData) { this.intData = intData; }
    public int getIntData() { return intData; }
    public void setStringData(String stringData) { this.stringData = stringData; }
    public String getStringData() {	return stringData; }
    public void setCharData(char charData) { this.charData = charData; }
    public char getCharData() {	return charData; }
    public void setDoubleData(double doubleData) { this.doubleData = doubleData; }
    public double getDoubleData() {	return doubleData; }
    public void setBoolData(boolean b) { boolData = b; }
    public boolean getBoolData() { return boolData; }
    public EvaluatorFunctionHandler getFunctionHandlerData() { return functionHandler; }
    public void setFunctionHandler(EvaluatorFunctionHandler h) { functionHandler = h; }
    public void setDefinedFunction(FunctionDefinitionAST h) { definedFunction = h; }
    public FunctionDefinitionAST getDefinedFunction() { return definedFunction; }
}
