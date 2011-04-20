package org.msu.logocompiler;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

import javax.swing.JFrame;

import msu.cse.turtlegraphics.Turtle;
import msu.cse.turtlegraphics.TurtleDisplayFrame;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/*
 * The test class for the ANTLR lexer / parser.
 */

public class InterpLogoTurtle {    
    public static void main(String[] args) throws Exception {
	//System.out.println("Welcome to the Logo REPL.");
	//	System.out.println("Type help for help, exit to exit, and anything else to execute those commands");
	//	System.out.println("Two newline s terminate input");
	int nlcount = 0;
	BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
	CommonTreeTranslator translator = new CommonTreeTranslator();
	Turtle turtle = new Turtle();
	/*TurtleDisplayFrame frame = new TurtleDisplayFrame();
	frame.setVisible(true);
	turtle.setCurrentTurtleDisplayCanvas(frame.getCurrentCanvas());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	*/
	EvaluatorVisitor evaluator = new EvaluatorVisitor(turtle);
	
	turtle.setReanimateImmediate(false);
	turtle.setPenDown();
	/*
	while (true) {
	    String input = "";
	    nlcount = 0;
	    while (nlcount < 1) {
		System.out.print(">>");
				
		String line = inputReader.readLine();
		if (line.equals(""))
		    nlcount++;
				
		input += line + "\n";
	    }
			
	    System.out.println(input);
		*/
		int count = 0;
		String input = "";
		while (true) {
			String str = inputReader.readLine();
			if (str == null)
				break;
			input += str + "\n";
		}
		
		// System.in
	    InputStream is = new ByteArrayInputStream(input.getBytes(Charset.defaultCharset()) );
			
	    LogoTurtleLexer lex = 
		new LogoTurtleLexer(new ANTLRInputStream(is));
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	    LogoTurtleParser parser = new LogoTurtleParser(tokens);
	    TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
	    ICodeGenerator generator = new ICodeGenerator();
	    
	    try {
		LogoTurtleParser.translation_unit_return r =
		    parser.translation_unit();
		CommonTree tree = (CommonTree)r.getTree();	// 
		//System.out.println(tree.toStringTree());
		List<ToplevelAST> bast = translator.translateProgram(tree);
		
		// Do the type checking and declaration elaboration
		try {
		    for (ToplevelAST ast : bast)
		    	ast.accept(generator);
		    
		    for (TurtleICodeInstruction i : generator.getInstructionList())
		    {
		  //  	System.out.println(i.generateJVMCode());
		    }
		} catch (Exception e) {
		    System.err.println("Something... ... went wrong... ...");
		}
		
		JasminEmitter jemitter = new JasminEmitter();
		
		jemitter.emitBeginning();
		
		for (TurtleICodeNonbranchingInstruction i : generator.getInstructionList())
		{
			i.accept(jemitter);
		}
		
		jemitter.emitEnd();
		
		jemitter.dumpBuffer();
		
		// Evaluate the AST
	    } catch (RecognitionException e)  {
		e.printStackTrace();
		return;
	    }
	   // turtle.clearAndRenderScene(true);
	//}
	
	
	while(true)
	{
		// Sit and wait around...
		;
	}
	
    }
}

