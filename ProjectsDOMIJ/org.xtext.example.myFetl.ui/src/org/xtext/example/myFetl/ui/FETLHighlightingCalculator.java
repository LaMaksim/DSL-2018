package org.xtext.example.myFetl.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



import java.util.List;

import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class FETLHighlightingCalculator implements ISemanticHighlightingCalculator {

	protected ArrayList<INode> elements = new ArrayList<INode>();
	protected String before= null;
	protected String after = null;
	
	
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		// TODO Auto-generated method stub
		if(resource == null  || resource.getParseResult()==null)
			return;
		INode root = resource.getParseResult().getRootNode();
		
		
		Iterator<ILeafNode> it=root.getLeafNodes().iterator();
		String context = "Model";
		
		while( it.hasNext() ) {
			INode leaf = it.next();
			elements.add(leaf);	
		}
		
		
		for (int i = 0; i<elements.size(); i++){
			INode leaf = elements.get(i);
			if(isVariableDefinition(i) || isVariableCall(i) || isParamDefinition(i) || isSelectionDefinition(i) || isSelectionCall(i))
				acceptor.addPosition(leaf.getOffset(), leaf.getLength(), "variable");
			
		}
			
			
		
	}// provide
	
	protected boolean isVariableDefinition(int poz){
		List<String> before = Arrays.asList(";");
		List<String> after = Arrays.asList("=");
		boolean b1 = areSibilings(poz, before, false, true); 
		boolean b2 = areSibilings(poz, after, true, false);
		return b1 & b2;
	}
	
	protected boolean isVariableCall(int poz){
		List<String> before = Arrays.asList("?");
		List<String> after = Arrays.asList("/",";");
		boolean b1 = areSibilings(poz, before, false, false); 
		boolean b2 = areSibilings(poz, after, true, true);
		return b1 & b2;
	}
	
	protected boolean isParamDefinition(int poz){
		List<String> before = Arrays.asList("{$");
		List<String> after = Arrays.asList("}");
		boolean b1 = areSibilings(poz, before, false, false); 
		boolean b2 = areSibilings(poz, after, true, false);
		return b1 & b2;
	}
	protected boolean isSelectionDefinition(int poz){
		List<String> before = Arrays.asList("select");
		List<String> after = Arrays.asList("from");
		boolean b1 = areSibilings(poz, before, false, false); 
		boolean b2 = areSibilings(poz, after, true, false);
		return b1 & b2;
	}
	protected boolean isSelectionCall(int poz){
		List<String> before = Arrays.asList("from");
		List<String> after = Arrays.asList("to");
		boolean b1 = areSibilings(poz, before, false, false); 
		boolean b2 = areSibilings(poz, after, true, false);
		return b1 & b2;
	}
	
	
	
	protected boolean areSibilings(int poz, List<String> lista, boolean forward, boolean nullable){
		
		while(true){
			poz = forward?++poz:--poz;
			if(poz<0 || poz>=elements.size())
				return nullable;
			INode elem = elements.get(poz);
			if (elem == null)
				return nullable;
//			else
//				System.out.println("Sadrzaj elementa: " + elem.getText());
			
			
			if (!elem.getText().trim().equals(" ".trim()))
				return lista.contains(elem.getText());
					
		}//while true
	}//areSibilings
	



}
