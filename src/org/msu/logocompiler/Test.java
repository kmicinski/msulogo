package org.msu.logocompiler;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import msu.cse.turtlegraphics.Turtle;
import msu.cse.turtlegraphics.TurtleDisplayFrame;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/*
 * The test class for the ANTLR lexer / parser.
 */

public class Test {    
	
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to the Logo REPL.");
		System.out.println("Type help for help, exit to exit, and anything else to execute those commands");
		System.out.println("Two newline s terminate input");
		int nlcount = 0;
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		CommonTreeTranslator translator = new CommonTreeTranslator();
		Turtle turtle = new Turtle();
		TurtleDisplayFrame frame = new TurtleDisplayFrame();
		frame.setVisible(true);
		turtle.setCurrentTurtleDisplayCanvas(frame.getCurrentCanvas());
		
		EvaluatorVisitor evaluator = new EvaluatorVisitor(turtle);
		turtle.setPenDown();
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
			
			InputStream is = 
				new ByteArrayInputStream(input.getBytes(Charset.defaultCharset()) );
			
			LogoASTLexer lex = 
				new LogoASTLexer(new ANTLRInputStream(is));
			CommonTokenStream tokens = new CommonTokenStream(lex);
			LogoASTParser parser = new LogoASTParser(tokens);
			TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
			
			try {
				LogoASTParser.block_return r =
					parser.block();
				CommonTree tree = (CommonTree)r.getTree();	// 
				//System.out.println(tree.toStringTree());
				BlockAST bast = translator.translateBlock(tree);
				
				// Do the type checking and declaration elaboration
				try {
					bast.accept(evaluator);
				} catch (Exception e) {
					System.err.println("Something... ... went wrong... ...");
				}
				
				// Evaluate the AST
			} catch (RecognitionException e)  {
				e.printStackTrace();
				return;
			}
		}
	}
}
