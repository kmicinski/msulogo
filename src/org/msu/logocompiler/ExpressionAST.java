/**
 *
 */

package org.msu.logocompiler;

/**
 *
 */
public abstract class ExpressionAST extends ToplevelAST {
    private Type expressionType;
    private BasicTypeData evaluationResult;
    
    public Type getExpressionType() { return expressionType; }
    public void setExpressionType(Type t) { expressionType = t; }
    
    public void setEvaluationResult(BasicTypeData data) { evaluationResult = data; }
    public BasicTypeData getEvaluationResult() { return evaluationResult; }
    
    public abstract ExpressionAST clone();
}