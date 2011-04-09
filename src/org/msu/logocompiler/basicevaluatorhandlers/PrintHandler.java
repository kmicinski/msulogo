package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.DeclarationDataEnvironment;
import org.msu.logocompiler.EvaluatorFunctionHandler;
import org.msu.logocompiler.ExpressionAST;
import org.msu.logocompiler.FunCallExpressionAST;

/**
 * Implement the ``print'' command.
 * 
 * @author Kristopher Micinski
 */
public class PrintHandler implements EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function,
			DeclarationDataEnvironment environment) {
	    for (ExpressionAST argument : function.getArguments()) {
		switch (argument.getExpressionType().getBaseType())
		    {
		case Decimal:
			System.out.print(argument.getEvaluationResult().getDoubleData());
			break;
		    case Integer:
			System.out.print(argument.getEvaluationResult().getIntData());
			break;
		    case String:
			System.out.print(argument.getEvaluationResult().getStringData());
			break;
		    case Boolean:
			System.out.println(argument.getEvaluationResult().getBoolData());
		    }
		System.out.print(" ");
	    }
	    
	    System.out.println();
	}
}
