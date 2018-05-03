/*
* generated by Xtext
*/
package org.xtext.example.myFetl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.myFetl.services.FETLGrammarAccess;

public class FETLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FETLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.myFetl.parser.antlr.internal.InternalFETLParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.myFetl.parser.antlr.internal.InternalFETLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public FETLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FETLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}