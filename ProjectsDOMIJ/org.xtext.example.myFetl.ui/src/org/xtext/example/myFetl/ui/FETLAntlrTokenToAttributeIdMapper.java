package org.xtext.example.myFetl.ui;

import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class FETLAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	
	protected static List<String> RULE_WS = Arrays.asList("RULE_WS");
	protected static List<String> RULE_ID = Arrays.asList("RULE_ID");
	
	protected static List<String> parametrizacija = Arrays.asList("'?'","'{$'","'}'");
	protected static List<String> akcije = Arrays.asList("'move'","'copy'","'delete'","'select'","'from'","'where'","'to'");
	
	protected static List<String> strategije = Arrays.asList("'append'","'carefully'","'forced'","'strategy:'");
	protected static List<String> opisni_filteri = Arrays.asList("'file'","'is'","'are'","'exist'","'empty'","'Directory'",
			"'Document'","'and no more tags'","'attribute'","'name is'","'extension is'");
	
	protected static List<String> custom_filteri = Arrays.asList("'in ['","']'","'in tags'");
	
	protected static List<String> logicki = Arrays.asList("'and'","'or'","'not'");
	protected static List<String> aritmeticki = Arrays.asList("'=='","'>='","'<='","'<'","'>'","'='");
	
	protected static List<String> jedinice_mere = Arrays.asList("'mins'","'hours'","'days'","'weeks'","'months'",
			"'years'","'KB'","'MB'","'GB'","'TB'","RULE_INT","'size of file'","'created'","'modified'","'before'");
	
	protected static List<String> kvantifikatori = Arrays.asList("'any are'","'all are'");
	protected static List<String> komentar = Arrays.asList("RULE_SL_COMMENT","RULE_ML_COMMENT");
	
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {

		if(parametrizacija.contains(tokenName))
			return "parametrizacija";
		if(akcije.contains(tokenName))
			return "akcije";
		if(strategije.contains(tokenName))
			return "strategije";
		if(opisni_filteri.contains(tokenName))
			return "opisni-filteri";
		if(custom_filteri.contains(tokenName))
			return "custom-filteri";
		if(logicki.contains(tokenName))
			return "logicki";
		if(aritmeticki.contains(tokenName))
			return "aritmeticki";
		if(jedinice_mere.contains(tokenName))
			return "jedinice-mere";
		if(kvantifikatori.contains(tokenName))
			return "kvantifikatori";
		
		if (RULE_ID.contains(tokenName))
			return "RULE_ID";
		if (komentar.contains(tokenName))
			return "komentar";
		
		
		//System.out.println(tokenName + "-->" + tokenType);
		
		return super.calculateId(tokenName, tokenType);
	}
	 
	
	
	
	
	protected boolean checkNumeric (String s) {
			for (int i=0;i<s.length();i++) {
				if(s.charAt(i)<'0' || s.charAt(i)>'9')
					return false;
			}
			return true;
	}

}
