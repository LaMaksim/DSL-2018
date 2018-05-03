package org.xtext.example.myFetl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class FETLHighlightingConfiguration extends DefaultHighlightingConfiguration{

	public final static String VAL_CLASS="ValidationClass";
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.configure(acceptor);
		addType(acceptor,"variable",138,43,226,SWT.ITALIC);
		addType(acceptor,"parametrizacija",220,42,42,SWT.BOLD);
		addType(acceptor,"akcije",0,100,0,SWT.BOLD);

		addType(acceptor,"opisni-filteri",255,127,0,SWT.NO);
		addType(acceptor, "logicki", 255,62,150, SWT.BOLD);
		addType(acceptor, "aritmeticki", 30,144,255, SWT.SHADOW_ETCHED_IN);
		addType(acceptor, "jedinice-mere", 35,35,142, SWT.NO);
//		addType(acceptor, "identifikatori", 100, 255, 0, SWT.UNDERLINE_SINGLE);
		addType(acceptor, "custom-filteri", 85,26,139, SWT.ITALIC);
		addType(acceptor, "strategije", 255,127,0, SWT.NO);
		addType(acceptor, "kvantifikatori", 35,35,142, SWT.NO);
		
		addType(acceptor, "RULE_ID", 0,0,255, SWT.NO);
		addType(acceptor, "komentar", 95,158,160, SWT.ITALIC);
		
		
		
		
	}
	
	public void addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style )
	 {
		 TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }
}
