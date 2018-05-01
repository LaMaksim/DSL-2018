package org.xtext.example.fileEctl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.fileEctl.services.FilEctlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFilEctlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'path_variables'", "','", "'}'", "'selection_variables'", "'transformations'", "'PathVariable'", "'value'", "'SelectionVariable'", "'Transformation'", "'source'", "'Path'", "'absolute'", "'steps'", "'true'", "'false'", "'ConcreteStep'", "'VariableStep'", "'ParametrizedStep'", "'Selection'", "'where'", "'from'", "'FilterComponent'", "'FilterLeaf'", "'trueFalseSearch'", "'OnName'", "'OnExtension'", "'extensions'", "'OnMeasure'", "'operator'", "'treshold'", "'OnTime'", "'unit'", "'timeOf'", "'OnAttributes'", "'only'", "'OnTags'", "'tags'", "'OnSize'", "'OnBasic'", "'OnCustom'", "'FilterContainer'", "'compositionType'", "'segments'", "'IsEmpty'", "'OnType'", "'type'", "'-'", "'Creating'", "'strategy'", "'destination'", "'Copy'", "'Move'", "'Delete'", "'equal'", "'less'", "'more'", "'less_equal'", "'more_equal'", "'min'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'modification'", "'cretion'", "'KB'", "'MB'", "'GB'", "'TB'", "'and'", "'or'", "'none'", "'Document'", "'Folder'", "'forced'", "'append'", "'carefully'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalFilEctlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFilEctlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFilEctlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g"; }



     	private FilEctlGrammarAccess grammarAccess;
     	
        public InternalFilEctlParser(TokenStream input, FilEctlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FilEctlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'path_variables' otherlv_4= '{' ( (lv_path_variables_5_0= rulePathVariable ) ) (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )* otherlv_8= '}' )? (otherlv_9= 'selection_variables' otherlv_10= '{' ( (lv_selection_variables_11_0= ruleSelectionVariable ) ) (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )* otherlv_14= '}' )? (otherlv_15= 'transformations' otherlv_16= '{' ( (lv_transformations_17_0= ruleTransformation ) ) (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_path_variables_5_0 = null;

        EObject lv_path_variables_7_0 = null;

        EObject lv_selection_variables_11_0 = null;

        EObject lv_selection_variables_13_0 = null;

        EObject lv_transformations_17_0 = null;

        EObject lv_transformations_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:80:28: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'path_variables' otherlv_4= '{' ( (lv_path_variables_5_0= rulePathVariable ) ) (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )* otherlv_8= '}' )? (otherlv_9= 'selection_variables' otherlv_10= '{' ( (lv_selection_variables_11_0= ruleSelectionVariable ) ) (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )* otherlv_14= '}' )? (otherlv_15= 'transformations' otherlv_16= '{' ( (lv_transformations_17_0= ruleTransformation ) ) (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'path_variables' otherlv_4= '{' ( (lv_path_variables_5_0= rulePathVariable ) ) (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )* otherlv_8= '}' )? (otherlv_9= 'selection_variables' otherlv_10= '{' ( (lv_selection_variables_11_0= ruleSelectionVariable ) ) (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )* otherlv_14= '}' )? (otherlv_15= 'transformations' otherlv_16= '{' ( (lv_transformations_17_0= ruleTransformation ) ) (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'path_variables' otherlv_4= '{' ( (lv_path_variables_5_0= rulePathVariable ) ) (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )* otherlv_8= '}' )? (otherlv_9= 'selection_variables' otherlv_10= '{' ( (lv_selection_variables_11_0= ruleSelectionVariable ) ) (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )* otherlv_14= '}' )? (otherlv_15= 'transformations' otherlv_16= '{' ( (lv_transformations_17_0= ruleTransformation ) ) (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:81:2: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'path_variables' otherlv_4= '{' ( (lv_path_variables_5_0= rulePathVariable ) ) (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )* otherlv_8= '}' )? (otherlv_9= 'selection_variables' otherlv_10= '{' ( (lv_selection_variables_11_0= ruleSelectionVariable ) ) (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )* otherlv_14= '}' )? (otherlv_15= 'transformations' otherlv_16= '{' ( (lv_transformations_17_0= ruleTransformation ) ) (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:81:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:95:1: (otherlv_3= 'path_variables' otherlv_4= '{' ( (lv_path_variables_5_0= rulePathVariable ) ) (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:95:3: otherlv_3= 'path_variables' otherlv_4= '{' ( (lv_path_variables_5_0= rulePathVariable ) ) (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getPath_variablesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel168); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:103:1: ( (lv_path_variables_5_0= rulePathVariable ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:104:1: (lv_path_variables_5_0= rulePathVariable )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:104:1: (lv_path_variables_5_0= rulePathVariable )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:105:3: lv_path_variables_5_0= rulePathVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getPath_variablesPathVariableParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_ruleModel189);
                    lv_path_variables_5_0=rulePathVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"path_variables",
                            		lv_path_variables_5_0, 
                            		"PathVariable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:121:2: (otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:121:4: otherlv_6= ',' ( (lv_path_variables_7_0= rulePathVariable ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:125:1: ( (lv_path_variables_7_0= rulePathVariable ) )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:126:1: (lv_path_variables_7_0= rulePathVariable )
                    	    {
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:126:1: (lv_path_variables_7_0= rulePathVariable )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:127:3: lv_path_variables_7_0= rulePathVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getPath_variablesPathVariableParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_ruleModel223);
                    	    lv_path_variables_7_0=rulePathVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"path_variables",
                    	            		lv_path_variables_7_0, 
                    	            		"PathVariable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel237); 

                        	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:147:3: (otherlv_9= 'selection_variables' otherlv_10= '{' ( (lv_selection_variables_11_0= ruleSelectionVariable ) ) (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:147:5: otherlv_9= 'selection_variables' otherlv_10= '{' ( (lv_selection_variables_11_0= ruleSelectionVariable ) ) (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleModel252); 

                        	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getSelection_variablesKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel264); 

                        	newLeafNode(otherlv_10, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:155:1: ( (lv_selection_variables_11_0= ruleSelectionVariable ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:156:1: (lv_selection_variables_11_0= ruleSelectionVariable )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:156:1: (lv_selection_variables_11_0= ruleSelectionVariable )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:157:3: lv_selection_variables_11_0= ruleSelectionVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getSelection_variablesSelectionVariableParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_ruleModel285);
                    lv_selection_variables_11_0=ruleSelectionVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"selection_variables",
                            		lv_selection_variables_11_0, 
                            		"SelectionVariable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:173:2: (otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:173:4: otherlv_12= ',' ( (lv_selection_variables_13_0= ruleSelectionVariable ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel298); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:177:1: ( (lv_selection_variables_13_0= ruleSelectionVariable ) )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:178:1: (lv_selection_variables_13_0= ruleSelectionVariable )
                    	    {
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:178:1: (lv_selection_variables_13_0= ruleSelectionVariable )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:179:3: lv_selection_variables_13_0= ruleSelectionVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getSelection_variablesSelectionVariableParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_ruleModel319);
                    	    lv_selection_variables_13_0=ruleSelectionVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"selection_variables",
                    	            		lv_selection_variables_13_0, 
                    	            		"SelectionVariable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel333); 

                        	newLeafNode(otherlv_14, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:199:3: (otherlv_15= 'transformations' otherlv_16= '{' ( (lv_transformations_17_0= ruleTransformation ) ) (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:199:5: otherlv_15= 'transformations' otherlv_16= '{' ( (lv_transformations_17_0= ruleTransformation ) ) (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModel348); 

                        	newLeafNode(otherlv_15, grammarAccess.getModelAccess().getTransformationsKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel360); 

                        	newLeafNode(otherlv_16, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:207:1: ( (lv_transformations_17_0= ruleTransformation ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:208:1: (lv_transformations_17_0= ruleTransformation )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:208:1: (lv_transformations_17_0= ruleTransformation )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:209:3: lv_transformations_17_0= ruleTransformation
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getTransformationsTransformationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_ruleModel381);
                    lv_transformations_17_0=ruleTransformation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"transformations",
                            		lv_transformations_17_0, 
                            		"Transformation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:225:2: (otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:225:4: otherlv_18= ',' ( (lv_transformations_19_0= ruleTransformation ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel394); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:229:1: ( (lv_transformations_19_0= ruleTransformation ) )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:230:1: (lv_transformations_19_0= ruleTransformation )
                    	    {
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:230:1: (lv_transformations_19_0= ruleTransformation )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:231:3: lv_transformations_19_0= ruleTransformation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getTransformationsTransformationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_ruleModel415);
                    	    lv_transformations_19_0=ruleTransformation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transformations",
                    	            		lv_transformations_19_0, 
                    	            		"Transformation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel429); 

                        	newLeafNode(otherlv_20, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel443); 

                	newLeafNode(otherlv_21, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTransformation"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:263:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:264:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:265:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_in_entryRuleTransformation479);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformation489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:272:1: ruleTransformation returns [EObject current=null] : (this_Transformation_Impl_0= ruleTransformation_Impl | this_Creating_Impl_1= ruleCreating_Impl | this_Copy_2= ruleCopy | this_Move_3= ruleMove | this_Delete_4= ruleDelete ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_Transformation_Impl_0 = null;

        EObject this_Creating_Impl_1 = null;

        EObject this_Copy_2 = null;

        EObject this_Move_3 = null;

        EObject this_Delete_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:275:28: ( (this_Transformation_Impl_0= ruleTransformation_Impl | this_Creating_Impl_1= ruleCreating_Impl | this_Copy_2= ruleCopy | this_Move_3= ruleMove | this_Delete_4= ruleDelete ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:276:1: (this_Transformation_Impl_0= ruleTransformation_Impl | this_Creating_Impl_1= ruleCreating_Impl | this_Copy_2= ruleCopy | this_Move_3= ruleMove | this_Delete_4= ruleDelete )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:276:1: (this_Transformation_Impl_0= ruleTransformation_Impl | this_Creating_Impl_1= ruleCreating_Impl | this_Copy_2= ruleCopy | this_Move_3= ruleMove | this_Delete_4= ruleDelete )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 60:
                {
                alt7=2;
                }
                break;
            case 63:
                {
                alt7=3;
                }
                break;
            case 64:
                {
                alt7=4;
                }
                break;
            case 65:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:277:5: this_Transformation_Impl_0= ruleTransformation_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getTransformation_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTransformation_Impl_in_ruleTransformation536);
                    this_Transformation_Impl_0=ruleTransformation_Impl();

                    state._fsp--;

                     
                            current = this_Transformation_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:287:5: this_Creating_Impl_1= ruleCreating_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getCreating_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCreating_Impl_in_ruleTransformation563);
                    this_Creating_Impl_1=ruleCreating_Impl();

                    state._fsp--;

                     
                            current = this_Creating_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:297:5: this_Copy_2= ruleCopy
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getCopyParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCopy_in_ruleTransformation590);
                    this_Copy_2=ruleCopy();

                    state._fsp--;

                     
                            current = this_Copy_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:307:5: this_Move_3= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getMoveParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleTransformation617);
                    this_Move_3=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:317:5: this_Delete_4= ruleDelete
                    {
                     
                            newCompositeNode(grammarAccess.getTransformationAccess().getDeleteParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDelete_in_ruleTransformation644);
                    this_Delete_4=ruleDelete();

                    state._fsp--;

                     
                            current = this_Delete_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleGenericStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:333:1: entryRuleGenericStep returns [EObject current=null] : iv_ruleGenericStep= ruleGenericStep EOF ;
    public final EObject entryRuleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericStep = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:334:2: (iv_ruleGenericStep= ruleGenericStep EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:335:2: iv_ruleGenericStep= ruleGenericStep EOF
            {
             newCompositeNode(grammarAccess.getGenericStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_entryRuleGenericStep679);
            iv_ruleGenericStep=ruleGenericStep();

            state._fsp--;

             current =iv_ruleGenericStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericStep689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericStep"


    // $ANTLR start "ruleGenericStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:342:1: ruleGenericStep returns [EObject current=null] : (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) ;
    public final EObject ruleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteStep_0 = null;

        EObject this_VariableStep_1 = null;

        EObject this_ParametrizedStep_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:345:28: ( (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:346:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:346:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:347:5: this_ConcreteStep_0= ruleConcreteStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_ruleGenericStep736);
                    this_ConcreteStep_0=ruleConcreteStep();

                    state._fsp--;

                     
                            current = this_ConcreteStep_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:357:5: this_VariableStep_1= ruleVariableStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_ruleGenericStep763);
                    this_VariableStep_1=ruleVariableStep();

                    state._fsp--;

                     
                            current = this_VariableStep_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:367:5: this_ParametrizedStep_2= ruleParametrizedStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_ruleGenericStep790);
                    this_ParametrizedStep_2=ruleParametrizedStep();

                    state._fsp--;

                     
                            current = this_ParametrizedStep_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericStep"


    // $ANTLR start "entryRuleFilterComponent"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:383:1: entryRuleFilterComponent returns [EObject current=null] : iv_ruleFilterComponent= ruleFilterComponent EOF ;
    public final EObject entryRuleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterComponent = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:384:2: (iv_ruleFilterComponent= ruleFilterComponent EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:385:2: iv_ruleFilterComponent= ruleFilterComponent EOF
            {
             newCompositeNode(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent825);
            iv_ruleFilterComponent=ruleFilterComponent();

            state._fsp--;

             current =iv_ruleFilterComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterComponent"


    // $ANTLR start "ruleFilterComponent"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:392:1: ruleFilterComponent returns [EObject current=null] : (this_FilterComponent_Impl_0= ruleFilterComponent_Impl | this_FilterLeaf_Impl_1= ruleFilterLeaf_Impl | this_OnName_2= ruleOnName | this_OnExtension_3= ruleOnExtension | this_OnMeasure_Impl_4= ruleOnMeasure_Impl | this_OnTime_5= ruleOnTime | this_OnAttributes_6= ruleOnAttributes | this_OnTags_7= ruleOnTags | this_OnSize_8= ruleOnSize | this_OnBasic_Impl_9= ruleOnBasic_Impl | this_OnCustom_Impl_10= ruleOnCustom_Impl | this_FilterContainer_11= ruleFilterContainer | this_IsEmpty_12= ruleIsEmpty | this_OnType_13= ruleOnType ) ;
    public final EObject ruleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject this_FilterComponent_Impl_0 = null;

        EObject this_FilterLeaf_Impl_1 = null;

        EObject this_OnName_2 = null;

        EObject this_OnExtension_3 = null;

        EObject this_OnMeasure_Impl_4 = null;

        EObject this_OnTime_5 = null;

        EObject this_OnAttributes_6 = null;

        EObject this_OnTags_7 = null;

        EObject this_OnSize_8 = null;

        EObject this_OnBasic_Impl_9 = null;

        EObject this_OnCustom_Impl_10 = null;

        EObject this_FilterContainer_11 = null;

        EObject this_IsEmpty_12 = null;

        EObject this_OnType_13 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:395:28: ( (this_FilterComponent_Impl_0= ruleFilterComponent_Impl | this_FilterLeaf_Impl_1= ruleFilterLeaf_Impl | this_OnName_2= ruleOnName | this_OnExtension_3= ruleOnExtension | this_OnMeasure_Impl_4= ruleOnMeasure_Impl | this_OnTime_5= ruleOnTime | this_OnAttributes_6= ruleOnAttributes | this_OnTags_7= ruleOnTags | this_OnSize_8= ruleOnSize | this_OnBasic_Impl_9= ruleOnBasic_Impl | this_OnCustom_Impl_10= ruleOnCustom_Impl | this_FilterContainer_11= ruleFilterContainer | this_IsEmpty_12= ruleIsEmpty | this_OnType_13= ruleOnType ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:396:1: (this_FilterComponent_Impl_0= ruleFilterComponent_Impl | this_FilterLeaf_Impl_1= ruleFilterLeaf_Impl | this_OnName_2= ruleOnName | this_OnExtension_3= ruleOnExtension | this_OnMeasure_Impl_4= ruleOnMeasure_Impl | this_OnTime_5= ruleOnTime | this_OnAttributes_6= ruleOnAttributes | this_OnTags_7= ruleOnTags | this_OnSize_8= ruleOnSize | this_OnBasic_Impl_9= ruleOnBasic_Impl | this_OnCustom_Impl_10= ruleOnCustom_Impl | this_FilterContainer_11= ruleFilterContainer | this_IsEmpty_12= ruleIsEmpty | this_OnType_13= ruleOnType )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:396:1: (this_FilterComponent_Impl_0= ruleFilterComponent_Impl | this_FilterLeaf_Impl_1= ruleFilterLeaf_Impl | this_OnName_2= ruleOnName | this_OnExtension_3= ruleOnExtension | this_OnMeasure_Impl_4= ruleOnMeasure_Impl | this_OnTime_5= ruleOnTime | this_OnAttributes_6= ruleOnAttributes | this_OnTags_7= ruleOnTags | this_OnSize_8= ruleOnSize | this_OnBasic_Impl_9= ruleOnBasic_Impl | this_OnCustom_Impl_10= ruleOnCustom_Impl | this_FilterContainer_11= ruleFilterContainer | this_IsEmpty_12= ruleIsEmpty | this_OnType_13= ruleOnType )
            int alt9=14;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            case 38:
                {
                alt9=4;
                }
                break;
            case 40:
                {
                alt9=5;
                }
                break;
            case 43:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            case 47:
            case 48:
                {
                alt9=8;
                }
                break;
            case 50:
                {
                alt9=9;
                }
                break;
            case 51:
                {
                alt9=10;
                }
                break;
            case 52:
                {
                alt9=11;
                }
                break;
            case 53:
                {
                alt9=12;
                }
                break;
            case 56:
                {
                alt9=13;
                }
                break;
            case 57:
                {
                alt9=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:397:5: this_FilterComponent_Impl_0= ruleFilterComponent_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterComponent_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_Impl_in_ruleFilterComponent882);
                    this_FilterComponent_Impl_0=ruleFilterComponent_Impl();

                    state._fsp--;

                     
                            current = this_FilterComponent_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:407:5: this_FilterLeaf_Impl_1= ruleFilterLeaf_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterLeaf_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterLeaf_Impl_in_ruleFilterComponent909);
                    this_FilterLeaf_Impl_1=ruleFilterLeaf_Impl();

                    state._fsp--;

                     
                            current = this_FilterLeaf_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:417:5: this_OnName_2= ruleOnName
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_ruleFilterComponent936);
                    this_OnName_2=ruleOnName();

                    state._fsp--;

                     
                            current = this_OnName_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:427:5: this_OnExtension_3= ruleOnExtension
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_ruleFilterComponent963);
                    this_OnExtension_3=ruleOnExtension();

                    state._fsp--;

                     
                            current = this_OnExtension_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:437:5: this_OnMeasure_Impl_4= ruleOnMeasure_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnMeasure_ImplParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnMeasure_Impl_in_ruleFilterComponent990);
                    this_OnMeasure_Impl_4=ruleOnMeasure_Impl();

                    state._fsp--;

                     
                            current = this_OnMeasure_Impl_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:447:5: this_OnTime_5= ruleOnTime
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_ruleFilterComponent1017);
                    this_OnTime_5=ruleOnTime();

                    state._fsp--;

                     
                            current = this_OnTime_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:457:5: this_OnAttributes_6= ruleOnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_ruleFilterComponent1044);
                    this_OnAttributes_6=ruleOnAttributes();

                    state._fsp--;

                     
                            current = this_OnAttributes_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:467:5: this_OnTags_7= ruleOnTags
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_ruleFilterComponent1071);
                    this_OnTags_7=ruleOnTags();

                    state._fsp--;

                     
                            current = this_OnTags_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:477:5: this_OnSize_8= ruleOnSize
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_ruleFilterComponent1098);
                    this_OnSize_8=ruleOnSize();

                    state._fsp--;

                     
                            current = this_OnSize_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:487:5: this_OnBasic_Impl_9= ruleOnBasic_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnBasic_ImplParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnBasic_Impl_in_ruleFilterComponent1125);
                    this_OnBasic_Impl_9=ruleOnBasic_Impl();

                    state._fsp--;

                     
                            current = this_OnBasic_Impl_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:497:5: this_OnCustom_Impl_10= ruleOnCustom_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnCustom_ImplParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnCustom_Impl_in_ruleFilterComponent1152);
                    this_OnCustom_Impl_10=ruleOnCustom_Impl();

                    state._fsp--;

                     
                            current = this_OnCustom_Impl_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:507:5: this_FilterContainer_11= ruleFilterContainer
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_ruleFilterComponent1179);
                    this_FilterContainer_11=ruleFilterContainer();

                    state._fsp--;

                     
                            current = this_FilterContainer_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:517:5: this_IsEmpty_12= ruleIsEmpty
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_ruleFilterComponent1206);
                    this_IsEmpty_12=ruleIsEmpty();

                    state._fsp--;

                     
                            current = this_IsEmpty_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:527:5: this_OnType_13= ruleOnType
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_13()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_ruleFilterComponent1233);
                    this_OnType_13=ruleOnType();

                    state._fsp--;

                     
                            current = this_OnType_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterComponent"


    // $ANTLR start "entryRulePathVariable"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:543:1: entryRulePathVariable returns [EObject current=null] : iv_rulePathVariable= rulePathVariable EOF ;
    public final EObject entryRulePathVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathVariable = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:544:2: (iv_rulePathVariable= rulePathVariable EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:545:2: iv_rulePathVariable= rulePathVariable EOF
            {
             newCompositeNode(grammarAccess.getPathVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_entryRulePathVariable1268);
            iv_rulePathVariable=rulePathVariable();

            state._fsp--;

             current =iv_rulePathVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathVariable1278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathVariable"


    // $ANTLR start "rulePathVariable"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:552:1: rulePathVariable returns [EObject current=null] : (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' ) ;
    public final EObject rulePathVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:555:28: ( (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:556:1: (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:556:1: (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:556:3: otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePathVariable1315); 

                	newLeafNode(otherlv_0, grammarAccess.getPathVariableAccess().getPathVariableKeyword_0());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:560:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:561:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:561:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:562:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePathVariable1336);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePathVariable1348); 

                	newLeafNode(otherlv_2, grammarAccess.getPathVariableAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePathVariable1360); 

                	newLeafNode(otherlv_3, grammarAccess.getPathVariableAccess().getValueKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:586:1: ( (lv_value_4_0= rulePath ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:587:1: (lv_value_4_0= rulePath )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:587:1: (lv_value_4_0= rulePath )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:588:3: lv_value_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rulePathVariable1381);
            lv_value_4_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathVariableRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePathVariable1393); 

                	newLeafNode(otherlv_5, grammarAccess.getPathVariableAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathVariable"


    // $ANTLR start "entryRuleSelectionVariable"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:616:1: entryRuleSelectionVariable returns [EObject current=null] : iv_ruleSelectionVariable= ruleSelectionVariable EOF ;
    public final EObject entryRuleSelectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionVariable = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:617:2: (iv_ruleSelectionVariable= ruleSelectionVariable EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:618:2: iv_ruleSelectionVariable= ruleSelectionVariable EOF
            {
             newCompositeNode(grammarAccess.getSelectionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable1429);
            iv_ruleSelectionVariable=ruleSelectionVariable();

            state._fsp--;

             current =iv_ruleSelectionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionVariable1439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionVariable"


    // $ANTLR start "ruleSelectionVariable"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:625:1: ruleSelectionVariable returns [EObject current=null] : (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' ) ;
    public final EObject ruleSelectionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:628:28: ( (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:629:1: (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:629:1: (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:629:3: otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSelectionVariable1476); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionVariableAccess().getSelectionVariableKeyword_0());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:633:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:634:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:634:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:635:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSelectionVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectionVariable1497);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSelectionVariable1509); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionVariableAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSelectionVariable1521); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectionVariableAccess().getValueKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:659:1: ( (lv_value_4_0= ruleSelection ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:660:1: (lv_value_4_0= ruleSelection )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:660:1: (lv_value_4_0= ruleSelection )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:661:3: lv_value_4_0= ruleSelection
            {
             
            	        newCompositeNode(grammarAccess.getSelectionVariableAccess().getValueSelectionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_ruleSelectionVariable1542);
            lv_value_4_0=ruleSelection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionVariableRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"Selection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelectionVariable1554); 

                	newLeafNode(otherlv_5, grammarAccess.getSelectionVariableAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionVariable"


    // $ANTLR start "entryRuleTransformation_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:689:1: entryRuleTransformation_Impl returns [EObject current=null] : iv_ruleTransformation_Impl= ruleTransformation_Impl EOF ;
    public final EObject entryRuleTransformation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation_Impl = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:690:2: (iv_ruleTransformation_Impl= ruleTransformation_Impl EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:691:2: iv_ruleTransformation_Impl= ruleTransformation_Impl EOF
            {
             newCompositeNode(grammarAccess.getTransformation_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransformation_Impl_in_entryRuleTransformation_Impl1590);
            iv_ruleTransformation_Impl=ruleTransformation_Impl();

            state._fsp--;

             current =iv_ruleTransformation_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransformation_Impl1600); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation_Impl"


    // $ANTLR start "ruleTransformation_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:698:1: ruleTransformation_Impl returns [EObject current=null] : (otherlv_0= 'Transformation' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleTransformation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:701:28: ( (otherlv_0= 'Transformation' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:702:1: (otherlv_0= 'Transformation' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:702:1: (otherlv_0= 'Transformation' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:702:3: otherlv_0= 'Transformation' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTransformation_Impl1637); 

                	newLeafNode(otherlv_0, grammarAccess.getTransformation_ImplAccess().getTransformationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransformation_Impl1649); 

                	newLeafNode(otherlv_1, grammarAccess.getTransformation_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTransformation_Impl1661); 

                	newLeafNode(otherlv_2, grammarAccess.getTransformation_ImplAccess().getSourceKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:714:1: ( ( ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:715:1: ( ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:715:1: ( ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:716:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformation_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransformation_ImplAccess().getSourceSelectionVariableCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransformation_Impl1684);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTransformation_Impl1696); 

                	newLeafNode(otherlv_4, grammarAccess.getTransformation_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformation_Impl"


    // $ANTLR start "entryRulePath"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:741:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:742:2: (iv_rulePath= rulePath EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:743:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_entryRulePath1732);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePath1742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:750:1: rulePath returns [EObject current=null] : (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_absolute_3_0 = null;

        EObject lv_steps_6_0 = null;

        EObject lv_steps_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:753:28: ( (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:754:1: (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:754:1: (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:754:3: otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePath1779); 

                	newLeafNode(otherlv_0, grammarAccess.getPathAccess().getPathKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePath1791); 

                	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:762:1: (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:762:3: otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePath1804); 

                        	newLeafNode(otherlv_2, grammarAccess.getPathAccess().getAbsoluteKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:766:1: ( (lv_absolute_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:767:1: (lv_absolute_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:767:1: (lv_absolute_3_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:768:3: lv_absolute_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathAccess().getAbsoluteEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rulePath1825);
                    lv_absolute_3_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathRule());
                    	        }
                           		set(
                           			current, 
                           			"absolute",
                            		lv_absolute_3_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePath1839); 

                	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getStepsKeyword_3());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePath1851); 

                	newLeafNode(otherlv_5, grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:792:1: ( (lv_steps_6_0= ruleGenericStep ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:793:1: (lv_steps_6_0= ruleGenericStep )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:793:1: (lv_steps_6_0= ruleGenericStep )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:794:3: lv_steps_6_0= ruleGenericStep
            {
             
            	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath1872);
            lv_steps_6_0=ruleGenericStep();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathRule());
            	        }
                   		add(
                   			current, 
                   			"steps",
                    		lv_steps_6_0, 
                    		"GenericStep");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:810:2: (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:810:4: otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePath1885); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPathAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:814:1: ( (lv_steps_8_0= ruleGenericStep ) )
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:815:1: (lv_steps_8_0= ruleGenericStep )
            	    {
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:815:1: (lv_steps_8_0= ruleGenericStep )
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:816:3: lv_steps_8_0= ruleGenericStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath1906);
            	    lv_steps_8_0=ruleGenericStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_8_0, 
            	            		"GenericStep");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePath1920); 

                	newLeafNode(otherlv_9, grammarAccess.getPathAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePath1932); 

                	newLeafNode(otherlv_10, grammarAccess.getPathAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:848:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:849:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:850:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1969);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1980); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:857:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:860:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:861:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:861:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:861:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2020); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:869:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2046); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:884:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:885:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:886:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2092);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2103); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:893:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:896:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:897:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:897:1: (kw= 'true' | kw= 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:898:2: kw= 'true'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEBoolean2141); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:905:2: kw= 'false'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEBoolean2160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleConcreteStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:918:1: entryRuleConcreteStep returns [EObject current=null] : iv_ruleConcreteStep= ruleConcreteStep EOF ;
    public final EObject entryRuleConcreteStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteStep = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:919:2: (iv_ruleConcreteStep= ruleConcreteStep EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:920:2: iv_ruleConcreteStep= ruleConcreteStep EOF
            {
             newCompositeNode(grammarAccess.getConcreteStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep2200);
            iv_ruleConcreteStep=ruleConcreteStep();

            state._fsp--;

             current =iv_ruleConcreteStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteStep2210); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteStep"


    // $ANTLR start "ruleConcreteStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:927:1: ruleConcreteStep returns [EObject current=null] : (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleConcreteStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:930:28: ( (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:931:1: (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:931:1: (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:931:3: otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleConcreteStep2247); 

                	newLeafNode(otherlv_0, grammarAccess.getConcreteStepAccess().getConcreteStepKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConcreteStep2259); 

                	newLeafNode(otherlv_1, grammarAccess.getConcreteStepAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConcreteStep2271); 

                	newLeafNode(otherlv_2, grammarAccess.getConcreteStepAccess().getValueKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:943:1: ( (lv_value_3_0= ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:944:1: (lv_value_3_0= ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:944:1: (lv_value_3_0= ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:945:3: lv_value_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConcreteStep2292);
            lv_value_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcreteStepRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConcreteStep2304); 

                	newLeafNode(otherlv_4, grammarAccess.getConcreteStepAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcreteStep"


    // $ANTLR start "entryRuleVariableStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:973:1: entryRuleVariableStep returns [EObject current=null] : iv_ruleVariableStep= ruleVariableStep EOF ;
    public final EObject entryRuleVariableStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStep = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:974:2: (iv_ruleVariableStep= ruleVariableStep EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:975:2: iv_ruleVariableStep= ruleVariableStep EOF
            {
             newCompositeNode(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep2340);
            iv_ruleVariableStep=ruleVariableStep();

            state._fsp--;

             current =iv_ruleVariableStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep2350); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableStep"


    // $ANTLR start "ruleVariableStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:982:1: ruleVariableStep returns [EObject current=null] : (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariableStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:985:28: ( (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:986:1: (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:986:1: (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:986:3: otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleVariableStep2387); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableStepAccess().getVariableStepKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariableStep2399); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableStepAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleVariableStep2411); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableStepAccess().getValueKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:998:1: ( ( ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:999:1: ( ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:999:1: ( ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1000:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableStepRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableStep2434);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVariableStep2446); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableStepAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableStep"


    // $ANTLR start "entryRuleParametrizedStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1025:1: entryRuleParametrizedStep returns [EObject current=null] : iv_ruleParametrizedStep= ruleParametrizedStep EOF ;
    public final EObject entryRuleParametrizedStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametrizedStep = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1026:2: (iv_ruleParametrizedStep= ruleParametrizedStep EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1027:2: iv_ruleParametrizedStep= ruleParametrizedStep EOF
            {
             newCompositeNode(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep2482);
            iv_ruleParametrizedStep=ruleParametrizedStep();

            state._fsp--;

             current =iv_ruleParametrizedStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep2492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametrizedStep"


    // $ANTLR start "ruleParametrizedStep"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1034:1: ruleParametrizedStep returns [EObject current=null] : ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParametrizedStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1037:28: ( ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1038:1: ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1038:1: ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1038:2: () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1038:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1039:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleParametrizedStep2538); 

                	newLeafNode(otherlv_1, grammarAccess.getParametrizedStepAccess().getParametrizedStepKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1048:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1049:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1049:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1050:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParametrizedStep2559);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametrizedStepRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametrizedStep"


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1074:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1075:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1076:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection2595);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection2605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1083:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_where_4_0 = null;

        EObject lv_where_6_0 = null;

        EObject lv_from_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1086:28: ( (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1087:1: (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1087:1: (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1087:3: otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSelection2642); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSelection2654); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1095:1: (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1095:3: otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSelection2667); 

                        	newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getWhereKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSelection2679); 

                        	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1103:1: ( (lv_where_4_0= ruleFilterComponent ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1104:1: (lv_where_4_0= ruleFilterComponent )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1104:1: (lv_where_4_0= ruleFilterComponent )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1105:3: lv_where_4_0= ruleFilterComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection2700);
                    lv_where_4_0=ruleFilterComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	        }
                           		add(
                           			current, 
                           			"where",
                            		lv_where_4_0, 
                            		"FilterComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1121:2: (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1121:4: otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSelection2713); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1125:1: ( (lv_where_6_0= ruleFilterComponent ) )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1126:1: (lv_where_6_0= ruleFilterComponent )
                    	    {
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1126:1: (lv_where_6_0= ruleFilterComponent )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1127:3: lv_where_6_0= ruleFilterComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection2734);
                    	    lv_where_6_0=ruleFilterComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"where",
                    	            		lv_where_6_0, 
                    	            		"FilterComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelection2748); 

                        	newLeafNode(otherlv_7, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSelection2762); 

                	newLeafNode(otherlv_8, grammarAccess.getSelectionAccess().getFromKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1151:1: ( (lv_from_9_0= rulePath ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1152:1: (lv_from_9_0= rulePath )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1152:1: (lv_from_9_0= rulePath )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1153:3: lv_from_9_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleSelection2783);
            lv_from_9_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_9_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelection2795); 

                	newLeafNode(otherlv_10, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleFilterComponent_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1181:1: entryRuleFilterComponent_Impl returns [EObject current=null] : iv_ruleFilterComponent_Impl= ruleFilterComponent_Impl EOF ;
    public final EObject entryRuleFilterComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterComponent_Impl = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1182:2: (iv_ruleFilterComponent_Impl= ruleFilterComponent_Impl EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1183:2: iv_ruleFilterComponent_Impl= ruleFilterComponent_Impl EOF
            {
             newCompositeNode(grammarAccess.getFilterComponent_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_Impl_in_entryRuleFilterComponent_Impl2831);
            iv_ruleFilterComponent_Impl=ruleFilterComponent_Impl();

            state._fsp--;

             current =iv_ruleFilterComponent_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent_Impl2841); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterComponent_Impl"


    // $ANTLR start "ruleFilterComponent_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1190:1: ruleFilterComponent_Impl returns [EObject current=null] : ( () otherlv_1= 'FilterComponent' ) ;
    public final EObject ruleFilterComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1193:28: ( ( () otherlv_1= 'FilterComponent' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1194:1: ( () otherlv_1= 'FilterComponent' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1194:1: ( () otherlv_1= 'FilterComponent' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1194:2: () otherlv_1= 'FilterComponent'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1194:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1195:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFilterComponent_ImplAccess().getFilterComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFilterComponent_Impl2887); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterComponent_ImplAccess().getFilterComponentKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterComponent_Impl"


    // $ANTLR start "entryRuleFilterLeaf_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1212:1: entryRuleFilterLeaf_Impl returns [EObject current=null] : iv_ruleFilterLeaf_Impl= ruleFilterLeaf_Impl EOF ;
    public final EObject entryRuleFilterLeaf_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterLeaf_Impl = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1213:2: (iv_ruleFilterLeaf_Impl= ruleFilterLeaf_Impl EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1214:2: iv_ruleFilterLeaf_Impl= ruleFilterLeaf_Impl EOF
            {
             newCompositeNode(grammarAccess.getFilterLeaf_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterLeaf_Impl_in_entryRuleFilterLeaf_Impl2923);
            iv_ruleFilterLeaf_Impl=ruleFilterLeaf_Impl();

            state._fsp--;

             current =iv_ruleFilterLeaf_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterLeaf_Impl2933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterLeaf_Impl"


    // $ANTLR start "ruleFilterLeaf_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1221:1: ruleFilterLeaf_Impl returns [EObject current=null] : ( () otherlv_1= 'FilterLeaf' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFilterLeaf_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1224:28: ( ( () otherlv_1= 'FilterLeaf' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1225:1: ( () otherlv_1= 'FilterLeaf' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1225:1: ( () otherlv_1= 'FilterLeaf' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1225:2: () otherlv_1= 'FilterLeaf' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1225:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFilterLeaf_ImplAccess().getFilterLeafAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFilterLeaf_Impl2979); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterLeaf_ImplAccess().getFilterLeafKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFilterLeaf_Impl2991); 

                	newLeafNode(otherlv_2, grammarAccess.getFilterLeaf_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1239:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1239:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFilterLeaf_Impl3004); 

                        	newLeafNode(otherlv_3, grammarAccess.getFilterLeaf_ImplAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1243:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1244:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1244:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1245:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterLeaf_ImplAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleFilterLeaf_Impl3025);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterLeaf_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFilterLeaf_Impl3039); 

                	newLeafNode(otherlv_5, grammarAccess.getFilterLeaf_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterLeaf_Impl"


    // $ANTLR start "entryRuleOnName"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1273:1: entryRuleOnName returns [EObject current=null] : iv_ruleOnName= ruleOnName EOF ;
    public final EObject entryRuleOnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnName = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1274:2: (iv_ruleOnName= ruleOnName EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1275:2: iv_ruleOnName= ruleOnName EOF
            {
             newCompositeNode(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName3075);
            iv_ruleOnName=ruleOnName();

            state._fsp--;

             current =iv_ruleOnName; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName3085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnName"


    // $ANTLR start "ruleOnName"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1282:1: ruleOnName returns [EObject current=null] : ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleOnName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1285:28: ( ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1286:1: ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1286:1: ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1286:2: () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1286:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1287:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnNameAccess().getOnNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnName3131); 

                	newLeafNode(otherlv_1, grammarAccess.getOnNameAccess().getOnNameKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1296:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1297:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1297:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1298:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnName3152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnNameRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnName3164); 

                	newLeafNode(otherlv_3, grammarAccess.getOnNameAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1318:1: (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1318:3: otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnName3177); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnNameAccess().getTrueFalseSearchKeyword_4_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1322:1: ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1323:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1323:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1324:3: lv_trueFalseSearch_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnNameAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnName3198);
                    lv_trueFalseSearch_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnNameRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_5_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnName3212); 

                	newLeafNode(otherlv_6, grammarAccess.getOnNameAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnName"


    // $ANTLR start "entryRuleOnExtension"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1352:1: entryRuleOnExtension returns [EObject current=null] : iv_ruleOnExtension= ruleOnExtension EOF ;
    public final EObject entryRuleOnExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnExtension = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1353:2: (iv_ruleOnExtension= ruleOnExtension EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1354:2: iv_ruleOnExtension= ruleOnExtension EOF
            {
             newCompositeNode(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension3248);
            iv_ruleOnExtension=ruleOnExtension();

            state._fsp--;

             current =iv_ruleOnExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension3258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnExtension"


    // $ANTLR start "ruleOnExtension"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1361:1: ruleOnExtension returns [EObject current=null] : ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleOnExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;

        AntlrDatatypeRuleToken lv_extensions_7_0 = null;

        AntlrDatatypeRuleToken lv_extensions_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1364:28: ( ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1365:1: ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1365:1: ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1365:2: () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1365:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1366:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnExtensionAccess().getOnExtensionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOnExtension3304); 

                	newLeafNode(otherlv_1, grammarAccess.getOnExtensionAccess().getOnExtensionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnExtension3316); 

                	newLeafNode(otherlv_2, grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1379:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1379:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnExtension3329); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnExtensionAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1383:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1384:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1384:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1385:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnExtension3350);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1401:4: (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1401:6: otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOnExtension3365); 

                        	newLeafNode(otherlv_5, grammarAccess.getOnExtensionAccess().getExtensionsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnExtension3377); 

                        	newLeafNode(otherlv_6, grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1409:1: ( (lv_extensions_7_0= ruleEString ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1410:1: (lv_extensions_7_0= ruleEString )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1410:1: (lv_extensions_7_0= ruleEString )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1411:3: lv_extensions_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3398);
                    lv_extensions_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1427:2: (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1427:4: otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOnExtension3411); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getOnExtensionAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1431:1: ( (lv_extensions_9_0= ruleEString ) )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1432:1: (lv_extensions_9_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1432:1: (lv_extensions_9_0= ruleEString )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1433:3: lv_extensions_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3432);
                    	    lv_extensions_9_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_9_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnExtension3446); 

                        	newLeafNode(otherlv_10, grammarAccess.getOnExtensionAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnExtension3460); 

                	newLeafNode(otherlv_11, grammarAccess.getOnExtensionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnExtension"


    // $ANTLR start "entryRuleOnMeasure_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1465:1: entryRuleOnMeasure_Impl returns [EObject current=null] : iv_ruleOnMeasure_Impl= ruleOnMeasure_Impl EOF ;
    public final EObject entryRuleOnMeasure_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnMeasure_Impl = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1466:2: (iv_ruleOnMeasure_Impl= ruleOnMeasure_Impl EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1467:2: iv_ruleOnMeasure_Impl= ruleOnMeasure_Impl EOF
            {
             newCompositeNode(grammarAccess.getOnMeasure_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnMeasure_Impl_in_entryRuleOnMeasure_Impl3496);
            iv_ruleOnMeasure_Impl=ruleOnMeasure_Impl();

            state._fsp--;

             current =iv_ruleOnMeasure_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnMeasure_Impl3506); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnMeasure_Impl"


    // $ANTLR start "ruleOnMeasure_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1474:1: ruleOnMeasure_Impl returns [EObject current=null] : (otherlv_0= 'OnMeasure' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= '}' ) ;
    public final EObject ruleOnMeasure_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_treshold_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1477:28: ( (otherlv_0= 'OnMeasure' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1478:1: (otherlv_0= 'OnMeasure' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1478:1: (otherlv_0= 'OnMeasure' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1478:3: otherlv_0= 'OnMeasure' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOnMeasure_Impl3543); 

                	newLeafNode(otherlv_0, grammarAccess.getOnMeasure_ImplAccess().getOnMeasureKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnMeasure_Impl3555); 

                	newLeafNode(otherlv_1, grammarAccess.getOnMeasure_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1486:1: (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1486:3: otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnMeasure_Impl3568); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnMeasure_ImplAccess().getTrueFalseSearchKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1490:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1491:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1491:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1492:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnMeasure_ImplAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnMeasure_Impl3589);
                    lv_trueFalseSearch_3_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnMeasure_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_3_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnMeasure_Impl3603); 

                	newLeafNode(otherlv_4, grammarAccess.getOnMeasure_ImplAccess().getOperatorKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1512:1: ( (lv_operator_5_0= ruleOperator ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1513:1: (lv_operator_5_0= ruleOperator )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1513:1: (lv_operator_5_0= ruleOperator )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1514:3: lv_operator_5_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnMeasure_ImplAccess().getOperatorOperatorEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnMeasure_Impl3624);
            lv_operator_5_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnMeasure_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_5_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnMeasure_Impl3636); 

                	newLeafNode(otherlv_6, grammarAccess.getOnMeasure_ImplAccess().getTresholdKeyword_5());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1534:1: ( (lv_treshold_7_0= ruleEInt ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1535:1: (lv_treshold_7_0= ruleEInt )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1535:1: (lv_treshold_7_0= ruleEInt )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1536:3: lv_treshold_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnMeasure_ImplAccess().getTresholdEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnMeasure_Impl3657);
            lv_treshold_7_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnMeasure_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_7_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnMeasure_Impl3669); 

                	newLeafNode(otherlv_8, grammarAccess.getOnMeasure_ImplAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnMeasure_Impl"


    // $ANTLR start "entryRuleOnTime"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1564:1: entryRuleOnTime returns [EObject current=null] : iv_ruleOnTime= ruleOnTime EOF ;
    public final EObject entryRuleOnTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTime = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1565:2: (iv_ruleOnTime= ruleOnTime EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1566:2: iv_ruleOnTime= ruleOnTime EOF
            {
             newCompositeNode(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime3705);
            iv_ruleOnTime=ruleOnTime();

            state._fsp--;

             current =iv_ruleOnTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime3715); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnTime"


    // $ANTLR start "ruleOnTime"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1573:1: ruleOnTime returns [EObject current=null] : (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' ) ;
    public final EObject ruleOnTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_treshold_7_0 = null;

        Enumerator lv_unit_9_0 = null;

        Enumerator lv_timeOf_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1576:28: ( (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1577:1: (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1577:1: (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1577:3: otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOnTime3752); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTimeAccess().getOnTimeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnTime3764); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTimeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1585:1: (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1585:3: otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnTime3777); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnTimeAccess().getTrueFalseSearchKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1589:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1590:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1590:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1591:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTimeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnTime3798);
                    lv_trueFalseSearch_3_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_3_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnTime3812); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTimeAccess().getOperatorKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1611:1: ( (lv_operator_5_0= ruleOperator ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1612:1: (lv_operator_5_0= ruleOperator )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1612:1: (lv_operator_5_0= ruleOperator )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1613:3: lv_operator_5_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnTime3833);
            lv_operator_5_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_5_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnTime3845); 

                	newLeafNode(otherlv_6, grammarAccess.getOnTimeAccess().getTresholdKeyword_5());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1633:1: ( (lv_treshold_7_0= ruleEInt ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1634:1: (lv_treshold_7_0= ruleEInt )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1634:1: (lv_treshold_7_0= ruleEInt )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1635:3: lv_treshold_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTime3866);
            lv_treshold_7_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_7_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOnTime3878); 

                	newLeafNode(otherlv_8, grammarAccess.getOnTimeAccess().getUnitKeyword_7());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1655:1: ( (lv_unit_9_0= ruleTimeUnit ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1656:1: (lv_unit_9_0= ruleTimeUnit )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1656:1: (lv_unit_9_0= ruleTimeUnit )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1657:3: lv_unit_9_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_ruleOnTime3899);
            lv_unit_9_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_9_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOnTime3911); 

                	newLeafNode(otherlv_10, grammarAccess.getOnTimeAccess().getTimeOfKeyword_9());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1677:1: ( (lv_timeOf_11_0= ruleTimeType ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1678:1: (lv_timeOf_11_0= ruleTimeType )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1678:1: (lv_timeOf_11_0= ruleTimeType )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1679:3: lv_timeOf_11_0= ruleTimeType
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_ruleOnTime3932);
            lv_timeOf_11_0=ruleTimeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"timeOf",
                    		lv_timeOf_11_0, 
                    		"TimeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnTime3944); 

                	newLeafNode(otherlv_12, grammarAccess.getOnTimeAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnTime"


    // $ANTLR start "entryRuleOnAttributes"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1707:1: entryRuleOnAttributes returns [EObject current=null] : iv_ruleOnAttributes= ruleOnAttributes EOF ;
    public final EObject entryRuleOnAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnAttributes = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1708:2: (iv_ruleOnAttributes= ruleOnAttributes EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1709:2: iv_ruleOnAttributes= ruleOnAttributes EOF
            {
             newCompositeNode(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes3980);
            iv_ruleOnAttributes=ruleOnAttributes();

            state._fsp--;

             current =iv_ruleOnAttributes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes3990); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnAttributes"


    // $ANTLR start "ruleOnAttributes"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1716:1: ruleOnAttributes returns [EObject current=null] : (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleOnAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1719:28: ( (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1720:1: (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1720:1: (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1720:3: otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleOnAttributes4027); 

                	newLeafNode(otherlv_0, grammarAccess.getOnAttributesAccess().getOnAttributesKeyword_0());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1724:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1725:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1725:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1726:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes4048);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnAttributesRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnAttributes4060); 

                	newLeafNode(otherlv_2, grammarAccess.getOnAttributesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1746:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1746:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnAttributes4073); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnAttributesAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1750:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1751:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1751:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1752:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnAttributesAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnAttributes4094);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnAttributesRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOnAttributes4108); 

                	newLeafNode(otherlv_5, grammarAccess.getOnAttributesAccess().getValueKeyword_4());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1772:1: ( (lv_value_6_0= ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1773:1: (lv_value_6_0= ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1773:1: (lv_value_6_0= ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1774:3: lv_value_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes4129);
            lv_value_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnAttributesRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnAttributes4141); 

                	newLeafNode(otherlv_7, grammarAccess.getOnAttributesAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnAttributes"


    // $ANTLR start "entryRuleOnTags"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1802:1: entryRuleOnTags returns [EObject current=null] : iv_ruleOnTags= ruleOnTags EOF ;
    public final EObject entryRuleOnTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTags = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1803:2: (iv_ruleOnTags= ruleOnTags EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1804:2: iv_ruleOnTags= ruleOnTags EOF
            {
             newCompositeNode(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags4177);
            iv_ruleOnTags=ruleOnTags();

            state._fsp--;

             current =iv_ruleOnTags; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags4187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnTags"


    // $ANTLR start "ruleOnTags"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1811:1: ruleOnTags returns [EObject current=null] : ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' ) ;
    public final EObject ruleOnTags() throws RecognitionException {
        EObject current = null;

        Token lv_only_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;

        AntlrDatatypeRuleToken lv_tags_7_0 = null;

        AntlrDatatypeRuleToken lv_tags_9_0 = null;

        AntlrDatatypeRuleToken lv_treshold_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1814:28: ( ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1815:1: ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1815:1: ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1815:2: ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1815:2: ( (lv_only_0_0= 'only' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1816:1: (lv_only_0_0= 'only' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1816:1: (lv_only_0_0= 'only' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1817:3: lv_only_0_0= 'only'
                    {
                    lv_only_0_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOnTags4230); 

                            newLeafNode(lv_only_0_0, grammarAccess.getOnTagsAccess().getOnlyOnlyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTagsRule());
                    	        }
                           		setWithLastConsumed(current, "only", true, "only");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOnTags4256); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTagsAccess().getOnTagsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnTags4268); 

                	newLeafNode(otherlv_2, grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1838:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1838:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnTags4281); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnTagsAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1842:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1843:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1843:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1844:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnTags4302);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1860:4: (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1860:6: otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOnTags4317); 

                        	newLeafNode(otherlv_5, grammarAccess.getOnTagsAccess().getTagsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnTags4329); 

                        	newLeafNode(otherlv_6, grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1868:1: ( (lv_tags_7_0= ruleEString ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1869:1: (lv_tags_7_0= ruleEString )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1869:1: (lv_tags_7_0= ruleEString )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1870:3: lv_tags_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags4350);
                    lv_tags_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	        }
                           		add(
                           			current, 
                           			"tags",
                            		lv_tags_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1886:2: (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1886:4: otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOnTags4363); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getOnTagsAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1890:1: ( (lv_tags_9_0= ruleEString ) )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1891:1: (lv_tags_9_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1891:1: (lv_tags_9_0= ruleEString )
                    	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1892:3: lv_tags_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags4384);
                    	    lv_tags_9_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tags",
                    	            		lv_tags_9_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnTags4398); 

                        	newLeafNode(otherlv_10, grammarAccess.getOnTagsAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnTags4412); 

                	newLeafNode(otherlv_11, grammarAccess.getOnTagsAccess().getTresholdKeyword_5());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1916:1: ( (lv_treshold_12_0= ruleEInt ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1917:1: (lv_treshold_12_0= ruleEInt )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1917:1: (lv_treshold_12_0= ruleEInt )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1918:3: lv_treshold_12_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTags4433);
            lv_treshold_12_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_12_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnTags4445); 

                	newLeafNode(otherlv_13, grammarAccess.getOnTagsAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnTags"


    // $ANTLR start "entryRuleOnSize"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1946:1: entryRuleOnSize returns [EObject current=null] : iv_ruleOnSize= ruleOnSize EOF ;
    public final EObject entryRuleOnSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSize = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1947:2: (iv_ruleOnSize= ruleOnSize EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1948:2: iv_ruleOnSize= ruleOnSize EOF
            {
             newCompositeNode(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize4481);
            iv_ruleOnSize=ruleOnSize();

            state._fsp--;

             current =iv_ruleOnSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize4491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnSize"


    // $ANTLR start "ruleOnSize"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1955:1: ruleOnSize returns [EObject current=null] : (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' ) ;
    public final EObject ruleOnSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_treshold_7_0 = null;

        Enumerator lv_unit_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1958:28: ( (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1959:1: (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1959:1: (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1959:3: otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOnSize4528); 

                	newLeafNode(otherlv_0, grammarAccess.getOnSizeAccess().getOnSizeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnSize4540); 

                	newLeafNode(otherlv_1, grammarAccess.getOnSizeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1967:1: (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1967:3: otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnSize4553); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnSizeAccess().getTrueFalseSearchKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1971:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1972:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1972:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1973:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnSizeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnSize4574);
                    lv_trueFalseSearch_3_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_3_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnSize4588); 

                	newLeafNode(otherlv_4, grammarAccess.getOnSizeAccess().getOperatorKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1993:1: ( (lv_operator_5_0= ruleOperator ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1994:1: (lv_operator_5_0= ruleOperator )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1994:1: (lv_operator_5_0= ruleOperator )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:1995:3: lv_operator_5_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnSize4609);
            lv_operator_5_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_5_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnSize4621); 

                	newLeafNode(otherlv_6, grammarAccess.getOnSizeAccess().getTresholdKeyword_5());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2015:1: ( (lv_treshold_7_0= ruleEInt ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2016:1: (lv_treshold_7_0= ruleEInt )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2016:1: (lv_treshold_7_0= ruleEInt )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2017:3: lv_treshold_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnSize4642);
            lv_treshold_7_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_7_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOnSize4654); 

                	newLeafNode(otherlv_8, grammarAccess.getOnSizeAccess().getUnitKeyword_7());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2037:1: ( (lv_unit_9_0= ruleMemoryUnit ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2038:1: (lv_unit_9_0= ruleMemoryUnit )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2038:1: (lv_unit_9_0= ruleMemoryUnit )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2039:3: lv_unit_9_0= ruleMemoryUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_ruleOnSize4675);
            lv_unit_9_0=ruleMemoryUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_9_0, 
                    		"MemoryUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnSize4687); 

                	newLeafNode(otherlv_10, grammarAccess.getOnSizeAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnSize"


    // $ANTLR start "entryRuleOnBasic_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2067:1: entryRuleOnBasic_Impl returns [EObject current=null] : iv_ruleOnBasic_Impl= ruleOnBasic_Impl EOF ;
    public final EObject entryRuleOnBasic_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnBasic_Impl = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2068:2: (iv_ruleOnBasic_Impl= ruleOnBasic_Impl EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2069:2: iv_ruleOnBasic_Impl= ruleOnBasic_Impl EOF
            {
             newCompositeNode(grammarAccess.getOnBasic_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnBasic_Impl_in_entryRuleOnBasic_Impl4723);
            iv_ruleOnBasic_Impl=ruleOnBasic_Impl();

            state._fsp--;

             current =iv_ruleOnBasic_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnBasic_Impl4733); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnBasic_Impl"


    // $ANTLR start "ruleOnBasic_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2076:1: ruleOnBasic_Impl returns [EObject current=null] : ( () otherlv_1= 'OnBasic' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleOnBasic_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2079:28: ( ( () otherlv_1= 'OnBasic' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2080:1: ( () otherlv_1= 'OnBasic' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2080:1: ( () otherlv_1= 'OnBasic' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2080:2: () otherlv_1= 'OnBasic' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2080:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2081:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnBasic_ImplAccess().getOnBasicAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOnBasic_Impl4779); 

                	newLeafNode(otherlv_1, grammarAccess.getOnBasic_ImplAccess().getOnBasicKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnBasic_Impl4791); 

                	newLeafNode(otherlv_2, grammarAccess.getOnBasic_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2094:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2094:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnBasic_Impl4804); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnBasic_ImplAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2098:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2099:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2099:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2100:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnBasic_ImplAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnBasic_Impl4825);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnBasic_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnBasic_Impl4839); 

                	newLeafNode(otherlv_5, grammarAccess.getOnBasic_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnBasic_Impl"


    // $ANTLR start "entryRuleOnCustom_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2128:1: entryRuleOnCustom_Impl returns [EObject current=null] : iv_ruleOnCustom_Impl= ruleOnCustom_Impl EOF ;
    public final EObject entryRuleOnCustom_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnCustom_Impl = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2129:2: (iv_ruleOnCustom_Impl= ruleOnCustom_Impl EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2130:2: iv_ruleOnCustom_Impl= ruleOnCustom_Impl EOF
            {
             newCompositeNode(grammarAccess.getOnCustom_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnCustom_Impl_in_entryRuleOnCustom_Impl4875);
            iv_ruleOnCustom_Impl=ruleOnCustom_Impl();

            state._fsp--;

             current =iv_ruleOnCustom_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnCustom_Impl4885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnCustom_Impl"


    // $ANTLR start "ruleOnCustom_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2137:1: ruleOnCustom_Impl returns [EObject current=null] : ( () otherlv_1= 'OnCustom' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleOnCustom_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2140:28: ( ( () otherlv_1= 'OnCustom' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2141:1: ( () otherlv_1= 'OnCustom' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2141:1: ( () otherlv_1= 'OnCustom' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2141:2: () otherlv_1= 'OnCustom' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2141:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2142:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnCustom_ImplAccess().getOnCustomAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleOnCustom_Impl4931); 

                	newLeafNode(otherlv_1, grammarAccess.getOnCustom_ImplAccess().getOnCustomKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnCustom_Impl4943); 

                	newLeafNode(otherlv_2, grammarAccess.getOnCustom_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2155:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2155:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnCustom_Impl4956); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnCustom_ImplAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2159:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2160:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2160:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2161:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnCustom_ImplAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnCustom_Impl4977);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnCustom_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnCustom_Impl4991); 

                	newLeafNode(otherlv_5, grammarAccess.getOnCustom_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnCustom_Impl"


    // $ANTLR start "entryRuleFilterContainer"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2189:1: entryRuleFilterContainer returns [EObject current=null] : iv_ruleFilterContainer= ruleFilterContainer EOF ;
    public final EObject entryRuleFilterContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterContainer = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2190:2: (iv_ruleFilterContainer= ruleFilterContainer EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2191:2: iv_ruleFilterContainer= ruleFilterContainer EOF
            {
             newCompositeNode(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer5027);
            iv_ruleFilterContainer=ruleFilterContainer();

            state._fsp--;

             current =iv_ruleFilterContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer5037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterContainer"


    // $ANTLR start "ruleFilterContainer"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2198:1: ruleFilterContainer returns [EObject current=null] : (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleFilterContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_compositionType_3_0 = null;

        EObject lv_segments_6_0 = null;

        EObject lv_segments_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2201:28: ( (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2202:1: (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2202:1: (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2202:3: otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleFilterContainer5074); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterContainerAccess().getFilterContainerKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFilterContainer5086); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2210:1: (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2210:3: otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) )
                    {
                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleFilterContainer5099); 

                        	newLeafNode(otherlv_2, grammarAccess.getFilterContainerAccess().getCompositionTypeKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2214:1: ( (lv_compositionType_3_0= ruleCompositionType ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2215:1: (lv_compositionType_3_0= ruleCompositionType )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2215:1: (lv_compositionType_3_0= ruleCompositionType )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2216:3: lv_compositionType_3_0= ruleCompositionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getCompositionTypeCompositionTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_ruleFilterContainer5120);
                    lv_compositionType_3_0=ruleCompositionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"compositionType",
                            		lv_compositionType_3_0, 
                            		"CompositionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleFilterContainer5134); 

                	newLeafNode(otherlv_4, grammarAccess.getFilterContainerAccess().getSegmentsKeyword_3());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFilterContainer5146); 

                	newLeafNode(otherlv_5, grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2240:1: ( (lv_segments_6_0= ruleFilterComponent ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2241:1: (lv_segments_6_0= ruleFilterComponent )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2241:1: (lv_segments_6_0= ruleFilterComponent )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2242:3: lv_segments_6_0= ruleFilterComponent
            {
             
            	        newCompositeNode(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleFilterContainer5167);
            lv_segments_6_0=ruleFilterComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
            	        }
                   		add(
                   			current, 
                   			"segments",
                    		lv_segments_6_0, 
                    		"FilterComponent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2258:2: (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2258:4: otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFilterContainer5180); 

            	        	newLeafNode(otherlv_7, grammarAccess.getFilterContainerAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2262:1: ( (lv_segments_8_0= ruleFilterComponent ) )
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2263:1: (lv_segments_8_0= ruleFilterComponent )
            	    {
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2263:1: (lv_segments_8_0= ruleFilterComponent )
            	    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2264:3: lv_segments_8_0= ruleFilterComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleFilterContainer5201);
            	    lv_segments_8_0=ruleFilterComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"segments",
            	            		lv_segments_8_0, 
            	            		"FilterComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFilterContainer5215); 

                	newLeafNode(otherlv_9, grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFilterContainer5227); 

                	newLeafNode(otherlv_10, grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterContainer"


    // $ANTLR start "entryRuleIsEmpty"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2296:1: entryRuleIsEmpty returns [EObject current=null] : iv_ruleIsEmpty= ruleIsEmpty EOF ;
    public final EObject entryRuleIsEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEmpty = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2297:2: (iv_ruleIsEmpty= ruleIsEmpty EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2298:2: iv_ruleIsEmpty= ruleIsEmpty EOF
            {
             newCompositeNode(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty5263);
            iv_ruleIsEmpty=ruleIsEmpty();

            state._fsp--;

             current =iv_ruleIsEmpty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty5273); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsEmpty"


    // $ANTLR start "ruleIsEmpty"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2305:1: ruleIsEmpty returns [EObject current=null] : ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIsEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2308:28: ( ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2309:1: ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2309:1: ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2309:2: () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2309:2: ()
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEmptyAccess().getIsEmptyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleIsEmpty5319); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEmptyAccess().getIsEmptyKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIsEmpty5331); 

                	newLeafNode(otherlv_2, grammarAccess.getIsEmptyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2323:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2323:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleIsEmpty5344); 

                        	newLeafNode(otherlv_3, grammarAccess.getIsEmptyAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2327:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2328:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2328:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2329:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getIsEmptyAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleIsEmpty5365);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIsEmptyRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_4_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIsEmpty5379); 

                	newLeafNode(otherlv_5, grammarAccess.getIsEmptyAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsEmpty"


    // $ANTLR start "entryRuleOnType"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2357:1: entryRuleOnType returns [EObject current=null] : iv_ruleOnType= ruleOnType EOF ;
    public final EObject entryRuleOnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnType = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2358:2: (iv_ruleOnType= ruleOnType EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2359:2: iv_ruleOnType= ruleOnType EOF
            {
             newCompositeNode(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType5415);
            iv_ruleOnType=ruleOnType();

            state._fsp--;

             current =iv_ruleOnType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType5425); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnType"


    // $ANTLR start "ruleOnType"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2366:1: ruleOnType returns [EObject current=null] : (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' ) ;
    public final EObject ruleOnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_3_0 = null;

        Enumerator lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2369:28: ( (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2370:1: (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2370:1: (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2370:3: otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleOnType5462); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTypeAccess().getOnTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnType5474); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2378:1: (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2378:3: otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnType5487); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnTypeAccess().getTrueFalseSearchKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2382:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2383:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2383:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2384:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTypeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnType5508);
                    lv_trueFalseSearch_3_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_3_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleOnType5522); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTypeAccess().getTypeKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2404:1: ( (lv_type_5_0= ruleFileType ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2405:1: (lv_type_5_0= ruleFileType )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2405:1: (lv_type_5_0= ruleFileType )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2406:3: lv_type_5_0= ruleFileType
            {
             
            	        newCompositeNode(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_ruleOnType5543);
            lv_type_5_0=ruleFileType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"FileType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnType5555); 

                	newLeafNode(otherlv_6, grammarAccess.getOnTypeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnType"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2434:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2435:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2436:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5592);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2443:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2446:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2447:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2447:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2447:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2447:2: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==59) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2448:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEInt5642); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5659); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCreating_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2468:1: entryRuleCreating_Impl returns [EObject current=null] : iv_ruleCreating_Impl= ruleCreating_Impl EOF ;
    public final EObject entryRuleCreating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreating_Impl = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2469:2: (iv_ruleCreating_Impl= ruleCreating_Impl EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2470:2: iv_ruleCreating_Impl= ruleCreating_Impl EOF
            {
             newCompositeNode(grammarAccess.getCreating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCreating_Impl_in_entryRuleCreating_Impl5704);
            iv_ruleCreating_Impl=ruleCreating_Impl();

            state._fsp--;

             current =iv_ruleCreating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCreating_Impl5714); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreating_Impl"


    // $ANTLR start "ruleCreating_Impl"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2477:1: ruleCreating_Impl returns [EObject current=null] : (otherlv_0= 'Creating' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) ;
    public final EObject ruleCreating_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_strategy_3_0 = null;

        EObject lv_destination_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2480:28: ( (otherlv_0= 'Creating' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2481:1: (otherlv_0= 'Creating' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2481:1: (otherlv_0= 'Creating' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2481:3: otherlv_0= 'Creating' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleCreating_Impl5751); 

                	newLeafNode(otherlv_0, grammarAccess.getCreating_ImplAccess().getCreatingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCreating_Impl5763); 

                	newLeafNode(otherlv_1, grammarAccess.getCreating_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2489:1: (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==61) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2489:3: otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) )
                    {
                    otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCreating_Impl5776); 

                        	newLeafNode(otherlv_2, grammarAccess.getCreating_ImplAccess().getStrategyKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2493:1: ( (lv_strategy_3_0= ruleStrategies ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2494:1: (lv_strategy_3_0= ruleStrategies )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2494:1: (lv_strategy_3_0= ruleStrategies )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2495:3: lv_strategy_3_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getCreating_ImplAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleCreating_Impl5797);
                    lv_strategy_3_0=ruleStrategies();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCreating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"strategy",
                            		lv_strategy_3_0, 
                            		"Strategies");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCreating_Impl5811); 

                	newLeafNode(otherlv_4, grammarAccess.getCreating_ImplAccess().getSourceKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2515:1: ( ( ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2516:1: ( ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2516:1: ( ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2517:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreating_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCreating_ImplAccess().getSourceSelectionVariableCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCreating_Impl5834);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCreating_Impl5846); 

                	newLeafNode(otherlv_6, grammarAccess.getCreating_ImplAccess().getDestinationKeyword_5());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2534:1: ( (lv_destination_7_0= rulePath ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2535:1: (lv_destination_7_0= rulePath )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2535:1: (lv_destination_7_0= rulePath )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2536:3: lv_destination_7_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getCreating_ImplAccess().getDestinationPathParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleCreating_Impl5867);
            lv_destination_7_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCreating_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_7_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCreating_Impl5879); 

                	newLeafNode(otherlv_8, grammarAccess.getCreating_ImplAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreating_Impl"


    // $ANTLR start "entryRuleCopy"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2564:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2565:2: (iv_ruleCopy= ruleCopy EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2566:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy5915);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy5925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2573:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_strategy_3_0 = null;

        EObject lv_destination_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2576:28: ( (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2577:1: (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2577:1: (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2577:3: otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCopy5962); 

                	newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCopy5974); 

                	newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2585:1: (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2585:3: otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) )
                    {
                    otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCopy5987); 

                        	newLeafNode(otherlv_2, grammarAccess.getCopyAccess().getStrategyKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2589:1: ( (lv_strategy_3_0= ruleStrategies ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2590:1: (lv_strategy_3_0= ruleStrategies )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2590:1: (lv_strategy_3_0= ruleStrategies )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2591:3: lv_strategy_3_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleCopy6008);
                    lv_strategy_3_0=ruleStrategies();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCopyRule());
                    	        }
                           		set(
                           			current, 
                           			"strategy",
                            		lv_strategy_3_0, 
                            		"Strategies");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCopy6022); 

                	newLeafNode(otherlv_4, grammarAccess.getCopyAccess().getSourceKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2611:1: ( ( ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2612:1: ( ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2612:1: ( ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2613:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getSourceSelectionVariableCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCopy6045);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCopy6057); 

                	newLeafNode(otherlv_6, grammarAccess.getCopyAccess().getDestinationKeyword_5());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2630:1: ( (lv_destination_7_0= rulePath ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2631:1: (lv_destination_7_0= rulePath )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2631:1: (lv_destination_7_0= rulePath )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2632:3: lv_destination_7_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleCopy6078);
            lv_destination_7_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCopyRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_7_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCopy6090); 

                	newLeafNode(otherlv_8, grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleMove"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2660:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2661:2: (iv_ruleMove= ruleMove EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2662:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove6126);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove6136); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2669:1: ruleMove returns [EObject current=null] : (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_strategy_3_0 = null;

        EObject lv_destination_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2672:28: ( (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2673:1: (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2673:1: (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2673:3: otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleMove6173); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMove6185); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2681:1: (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2681:3: otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) )
                    {
                    otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleMove6198); 

                        	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getStrategyKeyword_2_0());
                        
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2685:1: ( (lv_strategy_3_0= ruleStrategies ) )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2686:1: (lv_strategy_3_0= ruleStrategies )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2686:1: (lv_strategy_3_0= ruleStrategies )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2687:3: lv_strategy_3_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleMove6219);
                    lv_strategy_3_0=ruleStrategies();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMoveRule());
                    	        }
                           		set(
                           			current, 
                           			"strategy",
                            		lv_strategy_3_0, 
                            		"Strategies");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMove6233); 

                	newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getSourceKeyword_3());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2707:1: ( ( ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2708:1: ( ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2708:1: ( ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2709:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSourceSelectionVariableCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove6256);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleMove6268); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getDestinationKeyword_5());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2726:1: ( (lv_destination_7_0= rulePath ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2727:1: (lv_destination_7_0= rulePath )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2727:1: (lv_destination_7_0= rulePath )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2728:3: lv_destination_7_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleMove6289);
            lv_destination_7_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_7_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMove6301); 

                	newLeafNode(otherlv_8, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleDelete"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2756:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2757:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2758:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete6337);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete6347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2765:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2768:28: ( (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2769:1: (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2769:1: (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2769:3: otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleDelete6384); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDelete6396); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDelete6408); 

                	newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getSourceKeyword_2());
                
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2781:1: ( ( ruleEString ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2782:1: ( ruleEString )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2782:1: ( ruleEString )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2783:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeleteAccess().getSourceSelectionVariableCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelete6431);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDelete6443); 

                	newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "ruleOperator"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2808:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2810:28: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2811:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2811:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt39=1;
                }
                break;
            case 67:
                {
                alt39=2;
                }
                break;
            case 68:
                {
                alt39=3;
                }
                break;
            case 69:
                {
                alt39=4;
                }
                break;
            case 70:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2811:2: (enumLiteral_0= 'equal' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2811:2: (enumLiteral_0= 'equal' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2811:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleOperator6493); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2817:6: (enumLiteral_1= 'less' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2817:6: (enumLiteral_1= 'less' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2817:8: enumLiteral_1= 'less'
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleOperator6510); 

                            current = grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2823:6: (enumLiteral_2= 'more' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2823:6: (enumLiteral_2= 'more' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2823:8: enumLiteral_2= 'more'
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleOperator6527); 

                            current = grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2829:6: (enumLiteral_3= 'less_equal' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2829:6: (enumLiteral_3= 'less_equal' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2829:8: enumLiteral_3= 'less_equal'
                    {
                    enumLiteral_3=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleOperator6544); 

                            current = grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2835:6: (enumLiteral_4= 'more_equal' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2835:6: (enumLiteral_4= 'more_equal' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2835:8: enumLiteral_4= 'more_equal'
                    {
                    enumLiteral_4=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleOperator6561); 

                            current = grammarAccess.getOperatorAccess().getMore_equalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getMore_equalEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleTimeUnit"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2845:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2847:28: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2848:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2848:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt40=1;
                }
                break;
            case 72:
                {
                alt40=2;
                }
                break;
            case 73:
                {
                alt40=3;
                }
                break;
            case 74:
                {
                alt40=4;
                }
                break;
            case 75:
                {
                alt40=5;
                }
                break;
            case 76:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2848:2: (enumLiteral_0= 'min' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2848:2: (enumLiteral_0= 'min' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2848:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleTimeUnit6606); 

                            current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2854:6: (enumLiteral_1= 'hour' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2854:6: (enumLiteral_1= 'hour' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2854:8: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleTimeUnit6623); 

                            current = grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2860:6: (enumLiteral_2= 'day' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2860:6: (enumLiteral_2= 'day' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2860:8: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleTimeUnit6640); 

                            current = grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2866:6: (enumLiteral_3= 'week' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2866:6: (enumLiteral_3= 'week' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2866:8: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleTimeUnit6657); 

                            current = grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2872:6: (enumLiteral_4= 'month' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2872:6: (enumLiteral_4= 'month' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2872:8: enumLiteral_4= 'month'
                    {
                    enumLiteral_4=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleTimeUnit6674); 

                            current = grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2878:6: (enumLiteral_5= 'year' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2878:6: (enumLiteral_5= 'year' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2878:8: enumLiteral_5= 'year'
                    {
                    enumLiteral_5=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleTimeUnit6691); 

                            current = grammarAccess.getTimeUnitAccess().getYearEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getYearEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleTimeType"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2888:1: ruleTimeType returns [Enumerator current=null] : ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) ) ;
    public final Enumerator ruleTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2890:28: ( ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2891:1: ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2891:1: ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==77) ) {
                alt41=1;
            }
            else if ( (LA41_0==78) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2891:2: (enumLiteral_0= 'modification' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2891:2: (enumLiteral_0= 'modification' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2891:4: enumLiteral_0= 'modification'
                    {
                    enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleTimeType6736); 

                            current = grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2897:6: (enumLiteral_1= 'cretion' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2897:6: (enumLiteral_1= 'cretion' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2897:8: enumLiteral_1= 'cretion'
                    {
                    enumLiteral_1=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleTimeType6753); 

                            current = grammarAccess.getTimeTypeAccess().getCretionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeTypeAccess().getCretionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeType"


    // $ANTLR start "ruleMemoryUnit"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2907:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) ;
    public final Enumerator ruleMemoryUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2909:28: ( ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2910:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2910:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt42=1;
                }
                break;
            case 80:
                {
                alt42=2;
                }
                break;
            case 81:
                {
                alt42=3;
                }
                break;
            case 82:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2910:2: (enumLiteral_0= 'KB' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2910:2: (enumLiteral_0= 'KB' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2910:4: enumLiteral_0= 'KB'
                    {
                    enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleMemoryUnit6798); 

                            current = grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2916:6: (enumLiteral_1= 'MB' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2916:6: (enumLiteral_1= 'MB' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2916:8: enumLiteral_1= 'MB'
                    {
                    enumLiteral_1=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleMemoryUnit6815); 

                            current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2922:6: (enumLiteral_2= 'GB' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2922:6: (enumLiteral_2= 'GB' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2922:8: enumLiteral_2= 'GB'
                    {
                    enumLiteral_2=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleMemoryUnit6832); 

                            current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2928:6: (enumLiteral_3= 'TB' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2928:6: (enumLiteral_3= 'TB' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2928:8: enumLiteral_3= 'TB'
                    {
                    enumLiteral_3=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleMemoryUnit6849); 

                            current = grammarAccess.getMemoryUnitAccess().getTBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMemoryUnitAccess().getTBEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemoryUnit"


    // $ANTLR start "ruleCompositionType"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2938:1: ruleCompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) ) ;
    public final Enumerator ruleCompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2940:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2941:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2941:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt43=1;
                }
                break;
            case 84:
                {
                alt43=2;
                }
                break;
            case 85:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2941:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2941:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2941:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleCompositionType6894); 

                            current = grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2947:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2947:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2947:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleCompositionType6911); 

                            current = grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2953:6: (enumLiteral_2= 'none' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2953:6: (enumLiteral_2= 'none' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2953:8: enumLiteral_2= 'none'
                    {
                    enumLiteral_2=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleCompositionType6928); 

                            current = grammarAccess.getCompositionTypeAccess().getNoneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompositionTypeAccess().getNoneEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositionType"


    // $ANTLR start "ruleFileType"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2963:1: ruleFileType returns [Enumerator current=null] : ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) ) ;
    public final Enumerator ruleFileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2965:28: ( ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2966:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2966:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==86) ) {
                alt44=1;
            }
            else if ( (LA44_0==87) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2966:2: (enumLiteral_0= 'Document' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2966:2: (enumLiteral_0= 'Document' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2966:4: enumLiteral_0= 'Document'
                    {
                    enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleFileType6973); 

                            current = grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2972:6: (enumLiteral_1= 'Folder' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2972:6: (enumLiteral_1= 'Folder' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2972:8: enumLiteral_1= 'Folder'
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleFileType6990); 

                            current = grammarAccess.getFileTypeAccess().getFolderEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFileTypeAccess().getFolderEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileType"


    // $ANTLR start "ruleStrategies"
    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2982:1: ruleStrategies returns [Enumerator current=null] : ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) ;
    public final Enumerator ruleStrategies() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2984:28: ( ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) )
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2985:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            {
            // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2985:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt45=1;
                }
                break;
            case 89:
                {
                alt45=2;
                }
                break;
            case 90:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2985:2: (enumLiteral_0= 'forced' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2985:2: (enumLiteral_0= 'forced' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2985:4: enumLiteral_0= 'forced'
                    {
                    enumLiteral_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleStrategies7035); 

                            current = grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2991:6: (enumLiteral_1= 'append' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2991:6: (enumLiteral_1= 'append' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2991:8: enumLiteral_1= 'append'
                    {
                    enumLiteral_1=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleStrategies7052); 

                            current = grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2997:6: (enumLiteral_2= 'carefully' )
                    {
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2997:6: (enumLiteral_2= 'carefully' )
                    // ../org.xtext.example.fileEctl/src-gen/org/xtext/example/fileEctl/parser/antlr/internal/InternalFilEctl.g:2997:8: enumLiteral_2= 'carefully'
                    {
                    enumLiteral_2=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleStrategies7069); 

                            current = grammarAccess.getStrategiesAccess().getCarefullyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getStrategiesAccess().getCarefullyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategies"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel168 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rulePathVariable_in_ruleModel189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel202 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rulePathVariable_in_ruleModel223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel237 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_ruleModel252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel264 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_ruleModel285 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel298 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_ruleModel319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel333 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleModel348 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel360 = new BitSet(new long[]{0x9000000000200000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleTransformation_in_ruleModel381 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel394 = new BitSet(new long[]{0x9000000000200000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleTransformation_in_ruleModel415 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel429 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModel443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformation489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_Impl_in_ruleTransformation536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreating_Impl_in_ruleTransformation563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_ruleTransformation590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleTransformation617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_ruleTransformation644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_ruleGenericStep736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_ruleGenericStep763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_ruleGenericStep790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_Impl_in_ruleFilterComponent882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterLeaf_Impl_in_ruleFilterComponent909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_ruleFilterComponent936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_ruleFilterComponent963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnMeasure_Impl_in_ruleFilterComponent990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_ruleFilterComponent1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_ruleFilterComponent1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_ruleFilterComponent1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_ruleFilterComponent1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnBasic_Impl_in_ruleFilterComponent1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnCustom_Impl_in_ruleFilterComponent1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_ruleFilterComponent1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_ruleFilterComponent1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_ruleFilterComponent1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_entryRulePathVariable1268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathVariable1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rulePathVariable1315 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePathVariable1336 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePathVariable1348 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePathVariable1360 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rulePath_in_rulePathVariable1381 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePathVariable1393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable1429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionVariable1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleSelectionVariable1476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectionVariable1497 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSelectionVariable1509 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSelectionVariable1521 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleSelection_in_ruleSelectionVariable1542 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSelectionVariable1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransformation_Impl_in_entryRuleTransformation_Impl1590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransformation_Impl1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTransformation_Impl1637 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransformation_Impl1649 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTransformation_Impl1661 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransformation_Impl1684 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTransformation_Impl1696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath1732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath1742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePath1779 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePath1791 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_rulePath1804 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rulePath1825 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePath1839 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePath1851 = new BitSet(new long[]{0x0000000070000000L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath1872 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePath1885 = new BitSet(new long[]{0x0000000070000000L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath1906 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePath1920 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePath1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEBoolean2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEBoolean2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep2200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleConcreteStep2247 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConcreteStep2259 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleConcreteStep2271 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConcreteStep2292 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConcreteStep2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep2340 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleVariableStep2387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleVariableStep2399 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleVariableStep2411 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableStep2434 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleVariableStep2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep2482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep2492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleParametrizedStep2538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParametrizedStep2559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection2595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSelection2642 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSelection2654 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleSelection2667 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSelection2679 = new BitSet(new long[]{0x033DC96C00000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection2700 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSelection2713 = new BitSet(new long[]{0x033DC96C00000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection2734 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSelection2748 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSelection2762 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rulePath_in_ruleSelection2783 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSelection2795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_Impl_in_entryRuleFilterComponent_Impl2831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent_Impl2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFilterComponent_Impl2887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterLeaf_Impl_in_entryRuleFilterLeaf_Impl2923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterLeaf_Impl2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFilterLeaf_Impl2979 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFilterLeaf_Impl2991 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleFilterLeaf_Impl3004 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleFilterLeaf_Impl3025 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFilterLeaf_Impl3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName3075 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleOnName3131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnName3152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnName3164 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleOnName3177 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnName3198 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnName3212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension3248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOnExtension3304 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnExtension3316 = new BitSet(new long[]{0x0000009000008000L});
        public static final BitSet FOLLOW_36_in_ruleOnExtension3329 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnExtension3350 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleOnExtension3365 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnExtension3377 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3398 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOnExtension3411 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3432 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOnExtension3446 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnExtension3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnMeasure_Impl_in_entryRuleOnMeasure_Impl3496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnMeasure_Impl3506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleOnMeasure_Impl3543 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnMeasure_Impl3555 = new BitSet(new long[]{0x0000021000000000L});
        public static final BitSet FOLLOW_36_in_ruleOnMeasure_Impl3568 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnMeasure_Impl3589 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleOnMeasure_Impl3603 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnMeasure_Impl3624 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOnMeasure_Impl3636 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnMeasure_Impl3657 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnMeasure_Impl3669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime3705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime3715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOnTime3752 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnTime3764 = new BitSet(new long[]{0x0000021000000000L});
        public static final BitSet FOLLOW_36_in_ruleOnTime3777 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnTime3798 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleOnTime3812 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnTime3833 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOnTime3845 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTime3866 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleOnTime3878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001F80L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_ruleOnTime3899 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleOnTime3911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
        public static final BitSet FOLLOW_ruleTimeType_in_ruleOnTime3932 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnTime3944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes3980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleOnAttributes4027 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes4048 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnAttributes4060 = new BitSet(new long[]{0x0000001000080000L});
        public static final BitSet FOLLOW_36_in_ruleOnAttributes4073 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnAttributes4094 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleOnAttributes4108 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes4129 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnAttributes4141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags4177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags4187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleOnTags4230 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleOnTags4256 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnTags4268 = new BitSet(new long[]{0x0002041000000000L});
        public static final BitSet FOLLOW_36_in_ruleOnTags4281 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnTags4302 = new BitSet(new long[]{0x0002040000000000L});
        public static final BitSet FOLLOW_49_in_ruleOnTags4317 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnTags4329 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags4350 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOnTags4363 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags4384 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOnTags4398 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOnTags4412 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTags4433 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnTags4445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize4481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleOnSize4528 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnSize4540 = new BitSet(new long[]{0x0000021000000000L});
        public static final BitSet FOLLOW_36_in_ruleOnSize4553 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnSize4574 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleOnSize4588 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnSize4609 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOnSize4621 = new BitSet(new long[]{0x0800000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnSize4642 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleOnSize4654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_ruleOnSize4675 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnSize4687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnBasic_Impl_in_entryRuleOnBasic_Impl4723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnBasic_Impl4733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOnBasic_Impl4779 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnBasic_Impl4791 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleOnBasic_Impl4804 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnBasic_Impl4825 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnBasic_Impl4839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnCustom_Impl_in_entryRuleOnCustom_Impl4875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnCustom_Impl4885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleOnCustom_Impl4931 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnCustom_Impl4943 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleOnCustom_Impl4956 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnCustom_Impl4977 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnCustom_Impl4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer5027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer5037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleFilterContainer5074 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFilterContainer5086 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_54_in_ruleFilterContainer5099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380000L});
        public static final BitSet FOLLOW_ruleCompositionType_in_ruleFilterContainer5120 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleFilterContainer5134 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFilterContainer5146 = new BitSet(new long[]{0x033DC96C00000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleFilterContainer5167 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleFilterContainer5180 = new BitSet(new long[]{0x033DC96C00000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleFilterContainer5201 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleFilterContainer5215 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFilterContainer5227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty5263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty5273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleIsEmpty5319 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIsEmpty5331 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleIsEmpty5344 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleIsEmpty5365 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIsEmpty5379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType5415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType5425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleOnType5462 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnType5474 = new BitSet(new long[]{0x0400001000000000L});
        public static final BitSet FOLLOW_36_in_ruleOnType5487 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnType5508 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleOnType5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
        public static final BitSet FOLLOW_ruleFileType_in_ruleOnType5543 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnType5555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEInt5642 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreating_Impl_in_entryRuleCreating_Impl5704 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCreating_Impl5714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleCreating_Impl5751 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCreating_Impl5763 = new BitSet(new long[]{0x2000000000400000L});
        public static final BitSet FOLLOW_61_in_ruleCreating_Impl5776 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleCreating_Impl5797 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCreating_Impl5811 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCreating_Impl5834 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleCreating_Impl5846 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rulePath_in_ruleCreating_Impl5867 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCreating_Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy5915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy5925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCopy5962 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCopy5974 = new BitSet(new long[]{0x2000000000400000L});
        public static final BitSet FOLLOW_61_in_ruleCopy5987 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleCopy6008 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCopy6022 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCopy6045 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleCopy6057 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rulePath_in_ruleCopy6078 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCopy6090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove6126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove6136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleMove6173 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMove6185 = new BitSet(new long[]{0x2000000000400000L});
        public static final BitSet FOLLOW_61_in_ruleMove6198 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleMove6219 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMove6233 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove6256 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleMove6268 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rulePath_in_ruleMove6289 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMove6301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete6337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete6347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleDelete6384 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDelete6396 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDelete6408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelete6431 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDelete6443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleOperator6493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleOperator6510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleOperator6527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleOperator6544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleOperator6561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTimeUnit6606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleTimeUnit6623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleTimeUnit6640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleTimeUnit6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleTimeUnit6674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleTimeUnit6691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleTimeType6736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleTimeType6753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleMemoryUnit6798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleMemoryUnit6815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleMemoryUnit6832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleMemoryUnit6849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleCompositionType6894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleCompositionType6911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleCompositionType6928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleFileType6973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleFileType6990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleStrategies7035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleStrategies7052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleStrategies7069 = new BitSet(new long[]{0x0000000000000002L});
    }


}