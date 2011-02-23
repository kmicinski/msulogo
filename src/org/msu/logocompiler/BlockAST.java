 package org.msu.logocompiler;
 
 import java.util.List;
 import java.util.LinkedList;
 
 public class BlockAST extends ToplevelAST
 {
     private DeclarationEnvironment scope;
     
     private List<StatementAST> statementList;
     
     public BlockAST()
     {
     scope = new DeclarationEnvironment(null);
     statementList = new LinkedList<StatementAST>();
     }
     
     public List<StatementAST> getStatementList() { return statementList; }
     
     public DeclarationEnvironment getScope() { return scope; }
     
     public void addStatementAST(StatementAST ast)
     {
     statementList.add(ast);
     }
     
	public void accept(ASTVisitor v) {
		v.visit(this);
		
		for (StatementAST i : statementList) {
			i.accept(v);
		}
	}	
 }