package org.xtext.example.myFetl.ui;

import java.util.Iterator;



import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class FETLHighlightingCalculator implements ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		// TODO Auto-generated method stub
		if(resource == null  || resource.getParseResult()==null)
			return;
		INode root = resource.getParseResult().getRootNode();
		
		Iterator<ILeafNode> it=root.getLeafNodes().iterator();
		INode leaf;
		String context = "Model";
		
		while( it.hasNext() ) {
			leaf = it.next();
			
			if(context.equals("Model") && leaf.getText().trim().matches("[a-zA-Z][a-zA-Z0-9]* ( )*= ![><=]$") )
				return;
//				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "Model");
				
		}
	}// provide
	
	



}
