package org.xtext.example.myFetl.parser.antlr.internal; 

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
import org.xtext.example.myFetl.services.FETLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFETLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'/'", "':'", "'?'", "'{$'", "'}'", "'select'", "'from'", "'where'", "','", "'copy'", "'to'", "'strategy:'", "'move'", "'delete'", "'('", "')'", "'attribute'", "'not'", "'exist'", "'is'", "'in ['", "']'", "'are'", "'in tags'", "'and no more tags'", "'before'", "'size of file'", "'name is'", "'extension is'", "'empty'", "'file'", "'-'", "'forced'", "'append'", "'carefully'", "'=='", "'<'", "'>'", "'<='", "'>='", "'mins'", "'hours'", "'days'", "'weeks'", "'months'", "'years'", "'modified'", "'created'", "'any are'", "'all are'", "'KB'", "'MB'", "'GB'", "'TB'", "'and'", "'or'", "'Document'", "'Directory'"
    };
    public static final int T__50=50;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFETLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFETLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFETLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g"; }



     	private FETLGrammarAccess grammarAccess;
     	
        public InternalFETLParser(TokenStream input, FETLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FETLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:77:1: ruleModel returns [EObject current=null] : ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_executions_1_0 = null;

        EObject lv_executions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:80:28: ( ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:81:1: ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:81:1: ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:81:2: () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )*
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:81:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:87:2: ( (lv_executions_1_0= ruleExecution ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:88:1: (lv_executions_1_0= ruleExecution )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:88:1: (lv_executions_1_0= ruleExecution )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:89:3: lv_executions_1_0= ruleExecution
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_ruleModel140);
            lv_executions_1_0=ruleExecution();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"executions",
                    		lv_executions_1_0, 
                    		"Execution");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:105:2: (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:105:4: otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel153); 

            	        	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2_0());
            	        
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:109:1: ( (lv_executions_3_0= ruleExecution ) )
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:110:1: (lv_executions_3_0= ruleExecution )
            	    {
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:110:1: (lv_executions_3_0= ruleExecution )
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:111:3: lv_executions_3_0= ruleExecution
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExecution_in_ruleModel174);
            	    lv_executions_3_0=ruleExecution();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"executions",
            	            		lv_executions_3_0, 
            	            		"Execution");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleExecution"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:135:1: entryRuleExecution returns [EObject current=null] : iv_ruleExecution= ruleExecution EOF ;
    public final EObject entryRuleExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecution = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:136:2: (iv_ruleExecution= ruleExecution EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:137:2: iv_ruleExecution= ruleExecution EOF
            {
             newCompositeNode(grammarAccess.getExecutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_entryRuleExecution212);
            iv_ruleExecution=ruleExecution();

            state._fsp--;

             current =iv_ruleExecution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExecution222); 

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
    // $ANTLR end "entryRuleExecution"


    // $ANTLR start "ruleExecution"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:144:1: ruleExecution returns [EObject current=null] : (this_Selection_0= ruleSelection | this_Copy_1= ruleCopy | this_Move_2= ruleMove | this_Delete_3= ruleDelete | this_PathVariable_4= rulePathVariable ) ;
    public final EObject ruleExecution() throws RecognitionException {
        EObject current = null;

        EObject this_Selection_0 = null;

        EObject this_Copy_1 = null;

        EObject this_Move_2 = null;

        EObject this_Delete_3 = null;

        EObject this_PathVariable_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:147:28: ( (this_Selection_0= ruleSelection | this_Copy_1= ruleCopy | this_Move_2= ruleMove | this_Delete_3= ruleDelete | this_PathVariable_4= rulePathVariable ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:148:1: (this_Selection_0= ruleSelection | this_Copy_1= ruleCopy | this_Move_2= ruleMove | this_Delete_3= ruleDelete | this_PathVariable_4= rulePathVariable )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:148:1: (this_Selection_0= ruleSelection | this_Copy_1= ruleCopy | this_Move_2= ruleMove | this_Delete_3= ruleDelete | this_PathVariable_4= rulePathVariable )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:149:5: this_Selection_0= ruleSelection
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getSelectionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSelection_in_ruleExecution269);
                    this_Selection_0=ruleSelection();

                    state._fsp--;

                     
                            current = this_Selection_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:159:5: this_Copy_1= ruleCopy
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getCopyParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCopy_in_ruleExecution296);
                    this_Copy_1=ruleCopy();

                    state._fsp--;

                     
                            current = this_Copy_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:169:5: this_Move_2= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getMoveParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleExecution323);
                    this_Move_2=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:179:5: this_Delete_3= ruleDelete
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDelete_in_ruleExecution350);
                    this_Delete_3=ruleDelete();

                    state._fsp--;

                     
                            current = this_Delete_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:189:5: this_PathVariable_4= rulePathVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_ruleExecution377);
                    this_PathVariable_4=rulePathVariable();

                    state._fsp--;

                     
                            current = this_PathVariable_4; 
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
    // $ANTLR end "ruleExecution"


    // $ANTLR start "entryRulePathVariable"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:205:1: entryRulePathVariable returns [EObject current=null] : iv_rulePathVariable= rulePathVariable EOF ;
    public final EObject entryRulePathVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathVariable = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:206:2: (iv_rulePathVariable= rulePathVariable EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:207:2: iv_rulePathVariable= rulePathVariable EOF
            {
             newCompositeNode(grammarAccess.getPathVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_entryRulePathVariable412);
            iv_rulePathVariable=rulePathVariable();

            state._fsp--;

             current =iv_rulePathVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathVariable422); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:214:1: rulePathVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) ) ;
    public final EObject rulePathVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:217:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:218:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:218:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:218:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:218:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:219:1: (lv_name_0_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:219:1: (lv_name_0_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:220:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePathVariable468);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathVariableRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePathVariable480); 

                	newLeafNode(otherlv_1, grammarAccess.getPathVariableAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:240:1: ( (lv_value_2_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:241:1: (lv_value_2_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:241:1: (lv_value_2_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:242:3: lv_value_2_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rulePathVariable501);
            lv_value_2_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathVariableRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Path");
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
    // $ANTLR end "rulePathVariable"


    // $ANTLR start "entryRulePath"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:266:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:267:2: (iv_rulePath= rulePath EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:268:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_entryRulePath537);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePath547); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:275:1: rulePath returns [EObject current=null] : ( ( (lv_steps_0_0= ruleGenericStep ) ) (otherlv_1= '/' ( (lv_steps_2_0= ruleGenericStep ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_steps_0_0 = null;

        EObject lv_steps_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:278:28: ( ( ( (lv_steps_0_0= ruleGenericStep ) ) (otherlv_1= '/' ( (lv_steps_2_0= ruleGenericStep ) ) )* ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:279:1: ( ( (lv_steps_0_0= ruleGenericStep ) ) (otherlv_1= '/' ( (lv_steps_2_0= ruleGenericStep ) ) )* )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:279:1: ( ( (lv_steps_0_0= ruleGenericStep ) ) (otherlv_1= '/' ( (lv_steps_2_0= ruleGenericStep ) ) )* )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:279:2: ( (lv_steps_0_0= ruleGenericStep ) ) (otherlv_1= '/' ( (lv_steps_2_0= ruleGenericStep ) ) )*
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:279:2: ( (lv_steps_0_0= ruleGenericStep ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:280:1: (lv_steps_0_0= ruleGenericStep )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:280:1: (lv_steps_0_0= ruleGenericStep )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:281:3: lv_steps_0_0= ruleGenericStep
            {
             
            	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath593);
            lv_steps_0_0=ruleGenericStep();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathRule());
            	        }
                   		add(
                   			current, 
                   			"steps",
                    		lv_steps_0_0, 
                    		"GenericStep");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:297:2: (otherlv_1= '/' ( (lv_steps_2_0= ruleGenericStep ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:297:4: otherlv_1= '/' ( (lv_steps_2_0= ruleGenericStep ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePath606); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getSolidusKeyword_1_0());
            	        
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:301:1: ( (lv_steps_2_0= ruleGenericStep ) )
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:302:1: (lv_steps_2_0= ruleGenericStep )
            	    {
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:302:1: (lv_steps_2_0= ruleGenericStep )
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:303:3: lv_steps_2_0= ruleGenericStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath627);
            	    lv_steps_2_0=ruleGenericStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_2_0, 
            	            		"GenericStep");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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


    // $ANTLR start "entryRuleGenericStep"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:327:1: entryRuleGenericStep returns [EObject current=null] : iv_ruleGenericStep= ruleGenericStep EOF ;
    public final EObject entryRuleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:328:2: (iv_ruleGenericStep= ruleGenericStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:329:2: iv_ruleGenericStep= ruleGenericStep EOF
            {
             newCompositeNode(grammarAccess.getGenericStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_entryRuleGenericStep665);
            iv_ruleGenericStep=ruleGenericStep();

            state._fsp--;

             current =iv_ruleGenericStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericStep675); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:336:1: ruleGenericStep returns [EObject current=null] : (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) ;
    public final EObject ruleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteStep_0 = null;

        EObject this_VariableStep_1 = null;

        EObject this_ParametrizedStep_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:339:28: ( (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:340:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:340:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:341:5: this_ConcreteStep_0= ruleConcreteStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_ruleGenericStep722);
                    this_ConcreteStep_0=ruleConcreteStep();

                    state._fsp--;

                     
                            current = this_ConcreteStep_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:351:5: this_VariableStep_1= ruleVariableStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_ruleGenericStep749);
                    this_VariableStep_1=ruleVariableStep();

                    state._fsp--;

                     
                            current = this_VariableStep_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:361:5: this_ParametrizedStep_2= ruleParametrizedStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_ruleGenericStep776);
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


    // $ANTLR start "entryRuleConcreteStep"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:377:1: entryRuleConcreteStep returns [EObject current=null] : iv_ruleConcreteStep= ruleConcreteStep EOF ;
    public final EObject entryRuleConcreteStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:378:2: (iv_ruleConcreteStep= ruleConcreteStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:379:2: iv_ruleConcreteStep= ruleConcreteStep EOF
            {
             newCompositeNode(grammarAccess.getConcreteStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep811);
            iv_ruleConcreteStep=ruleConcreteStep();

            state._fsp--;

             current =iv_ruleConcreteStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteStep821); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:386:1: ruleConcreteStep returns [EObject current=null] : ( ( (lv_value_0_0= ruleEString ) ) (otherlv_1= ':' )? ) ;
    public final EObject ruleConcreteStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:389:28: ( ( ( (lv_value_0_0= ruleEString ) ) (otherlv_1= ':' )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:1: ( ( (lv_value_0_0= ruleEString ) ) (otherlv_1= ':' )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:1: ( ( (lv_value_0_0= ruleEString ) ) (otherlv_1= ':' )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:2: ( (lv_value_0_0= ruleEString ) ) (otherlv_1= ':' )?
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:2: ( (lv_value_0_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:391:1: (lv_value_0_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:391:1: (lv_value_0_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:392:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConcreteStep867);
            lv_value_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConcreteStepRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:408:2: (otherlv_1= ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:408:4: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConcreteStep880); 

                        	newLeafNode(otherlv_1, grammarAccess.getConcreteStepAccess().getColonKeyword_1());
                        

                    }
                    break;

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
    // $ANTLR end "ruleConcreteStep"


    // $ANTLR start "entryRuleVariableStep"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:420:1: entryRuleVariableStep returns [EObject current=null] : iv_ruleVariableStep= ruleVariableStep EOF ;
    public final EObject entryRuleVariableStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:421:2: (iv_ruleVariableStep= ruleVariableStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:422:2: iv_ruleVariableStep= ruleVariableStep EOF
            {
             newCompositeNode(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep918);
            iv_ruleVariableStep=ruleVariableStep();

            state._fsp--;

             current =iv_ruleVariableStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep928); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:429:1: ruleVariableStep returns [EObject current=null] : (otherlv_0= '?' ( ( ruleEString ) ) ) ;
    public final EObject ruleVariableStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:432:28: ( (otherlv_0= '?' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:433:1: (otherlv_0= '?' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:433:1: (otherlv_0= '?' ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:433:3: otherlv_0= '?' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVariableStep965); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableStepAccess().getQuestionMarkKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:437:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:438:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:438:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:439:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableStepRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableStep988);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleVariableStep"


    // $ANTLR start "entryRuleParametrizedStep"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:460:1: entryRuleParametrizedStep returns [EObject current=null] : iv_ruleParametrizedStep= ruleParametrizedStep EOF ;
    public final EObject entryRuleParametrizedStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametrizedStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:461:2: (iv_ruleParametrizedStep= ruleParametrizedStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:462:2: iv_ruleParametrizedStep= ruleParametrizedStep EOF
            {
             newCompositeNode(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep1024);
            iv_ruleParametrizedStep=ruleParametrizedStep();

            state._fsp--;

             current =iv_ruleParametrizedStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep1034); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:469:1: ruleParametrizedStep returns [EObject current=null] : ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) ;
    public final EObject ruleParametrizedStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:472:28: ( ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:473:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:473:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:473:2: () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:473:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:474:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParametrizedStep1080); 

                	newLeafNode(otherlv_1, grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:483:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:484:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:484:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:485:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParametrizedStep1101);
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParametrizedStep1113); 

                	newLeafNode(otherlv_3, grammarAccess.getParametrizedStepAccess().getRightCurlyBracketKeyword_3());
                

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:513:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:514:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:515:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection1149);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection1159); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:522:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_from_3_0 = null;

        EObject lv_where_5_0 = null;

        EObject lv_where_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:525:28: ( (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:526:1: (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:526:1: (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:526:3: otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSelection1196); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:530:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:531:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:531:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:532:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelection1217);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSelection1229); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getFromKeyword_2());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:552:1: ( (lv_from_3_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:553:1: (lv_from_3_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:553:1: (lv_from_3_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:554:3: lv_from_3_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleSelection1250);
            lv_from_3_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_3_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:570:2: (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:570:4: otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSelection1263); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getWhereKeyword_4_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:574:1: ( (lv_where_5_0= ruleFilterComponent ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:575:1: (lv_where_5_0= ruleFilterComponent )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:575:1: (lv_where_5_0= ruleFilterComponent )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:576:3: lv_where_5_0= ruleFilterComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection1284);
                    lv_where_5_0=ruleFilterComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	        }
                           		add(
                           			current, 
                           			"where",
                            		lv_where_5_0, 
                            		"FilterComponent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:592:2: (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:592:4: otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSelection1297); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSelectionAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:596:1: ( (lv_where_7_0= ruleFilterComponent ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:597:1: (lv_where_7_0= ruleFilterComponent )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:597:1: (lv_where_7_0= ruleFilterComponent )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:598:3: lv_where_7_0= ruleFilterComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection1318);
                    	    lv_where_7_0=ruleFilterComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"where",
                    	            		lv_where_7_0, 
                    	            		"FilterComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleCopy"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:622:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:623:2: (iv_ruleCopy= ruleCopy EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:624:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy1358);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy1368); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:631:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_destination_4_0 = null;

        Enumerator lv_strategy_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:634:28: ( (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:635:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:635:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:635:3: otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCopy1405); 

                	newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCopy1417); 

                	newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:643:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:644:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:644:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:645:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCopy1440);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCopy1452); 

                	newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getToKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:662:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:663:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:663:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:664:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleCopy1473);
            lv_destination_4_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCopyRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_4_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:680:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:680:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCopy1486); 

                        	newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:684:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:685:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:685:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:686:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleCopy1507);
                    lv_strategy_6_0=ruleStrategies();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCopyRule());
                    	        }
                           		set(
                           			current, 
                           			"strategy",
                            		lv_strategy_6_0, 
                            		"Strategies");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleMove"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:710:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:711:2: (iv_ruleMove= ruleMove EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:712:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove1545);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove1555); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:719:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_destination_4_0 = null;

        Enumerator lv_strategy_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:722:28: ( (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:723:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:723:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:723:3: otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMove1592); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMove1604); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:731:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:732:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:732:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:733:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove1627);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMove1639); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getToKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:750:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:751:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:751:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:752:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleMove1660);
            lv_destination_4_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_4_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:768:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:768:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMove1673); 

                        	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:772:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:773:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:773:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:774:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleMove1694);
                    lv_strategy_6_0=ruleStrategies();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMoveRule());
                    	        }
                           		set(
                           			current, 
                           			"strategy",
                            		lv_strategy_6_0, 
                            		"Strategies");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleDelete"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:798:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:799:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:800:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete1732);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete1742); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:807:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:810:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:811:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:811:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:811:3: otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDelete1779); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDelete1791); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:819:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:820:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:820:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:821:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeleteAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelete1814);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleFilterContainer"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:842:1: entryRuleFilterContainer returns [EObject current=null] : iv_ruleFilterContainer= ruleFilterContainer EOF ;
    public final EObject entryRuleFilterContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterContainer = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:843:2: (iv_ruleFilterContainer= ruleFilterContainer EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:844:2: iv_ruleFilterContainer= ruleFilterContainer EOF
            {
             newCompositeNode(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1850);
            iv_ruleFilterContainer=ruleFilterContainer();

            state._fsp--;

             current =iv_ruleFilterContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer1860); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:851:1: ruleFilterContainer returns [EObject current=null] : (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' ) ;
    public final EObject ruleFilterContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_links_1_0 = null;

        EObject lv_links_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:854:28: ( (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:855:1: (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:855:1: (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:855:3: otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFilterContainer1897); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:859:1: ( (lv_links_1_0= ruleLink ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:860:1: (lv_links_1_0= ruleLink )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:860:1: (lv_links_1_0= ruleLink )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:861:3: lv_links_1_0= ruleLink
            {
             
            	        newCompositeNode(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleFilterContainer1918);
            lv_links_1_0=ruleLink();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
            	        }
                   		add(
                   			current, 
                   			"links",
                    		lv_links_1_0, 
                    		"Link");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:877:2: ( (lv_links_2_0= ruleLink ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27||LA10_0==29||(LA10_0>=32 && LA10_0<=33)||(LA10_0>=39 && LA10_0<=41)||LA10_0==43||(LA10_0>=59 && LA10_0<=60)||(LA10_0>=67 && LA10_0<=68)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:878:1: (lv_links_2_0= ruleLink )
            	    {
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:878:1: (lv_links_2_0= ruleLink )
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:879:3: lv_links_2_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleFilterContainer1939);
            	    lv_links_2_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_2_0, 
            	            		"Link");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFilterContainer1952); 

                	newLeafNode(otherlv_3, grammarAccess.getFilterContainerAccess().getRightParenthesisKeyword_3());
                

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


    // $ANTLR start "entryRuleLink"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:907:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:908:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:909:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink1988);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink1998); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:916:1: ruleLink returns [EObject current=null] : ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_compositonType_0_0 = null;

        EObject lv_element_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:919:28: ( ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:920:1: ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:920:1: ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:920:2: ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:920:2: ( (lv_compositonType_0_0= ruleCompositionType ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=67 && LA11_0<=68)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:921:1: (lv_compositonType_0_0= ruleCompositionType )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:921:1: (lv_compositonType_0_0= ruleCompositionType )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:922:3: lv_compositonType_0_0= ruleCompositionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getCompositonTypeCompositionTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_ruleLink2044);
                    lv_compositonType_0_0=ruleCompositionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"compositonType",
                            		lv_compositonType_0_0, 
                            		"CompositionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:938:3: ( (lv_element_1_0= ruleFilterComponent ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:939:1: (lv_element_1_0= ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:939:1: (lv_element_1_0= ruleFilterComponent )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:940:3: lv_element_1_0= ruleFilterComponent
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getElementFilterComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleLink2066);
            lv_element_1_0=ruleFilterComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_1_0, 
                    		"FilterComponent");
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleFilterComponent"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:964:1: entryRuleFilterComponent returns [EObject current=null] : iv_ruleFilterComponent= ruleFilterComponent EOF ;
    public final EObject entryRuleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterComponent = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:965:2: (iv_ruleFilterComponent= ruleFilterComponent EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:966:2: iv_ruleFilterComponent= ruleFilterComponent EOF
            {
             newCompositeNode(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent2102);
            iv_ruleFilterComponent=ruleFilterComponent();

            state._fsp--;

             current =iv_ruleFilterComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent2112); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:973:1: ruleFilterComponent returns [EObject current=null] : (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) ;
    public final EObject ruleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject this_OnName_0 = null;

        EObject this_OnExtension_1 = null;

        EObject this_OnTime_2 = null;

        EObject this_OnAttributes_3 = null;

        EObject this_OnTags_4 = null;

        EObject this_OnSize_5 = null;

        EObject this_FilterContainer_6 = null;

        EObject this_IsEmpty_7 = null;

        EObject this_OnType_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:976:28: ( (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:977:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:977:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 59:
            case 60:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 39:
                {
                alt12=6;
                }
                break;
            case 27:
                {
                alt12=7;
                }
                break;
            case 32:
                {
                alt12=8;
                }
                break;
            case 43:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:978:5: this_OnName_0= ruleOnName
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_ruleFilterComponent2159);
                    this_OnName_0=ruleOnName();

                    state._fsp--;

                     
                            current = this_OnName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:988:5: this_OnExtension_1= ruleOnExtension
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_ruleFilterComponent2186);
                    this_OnExtension_1=ruleOnExtension();

                    state._fsp--;

                     
                            current = this_OnExtension_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:998:5: this_OnTime_2= ruleOnTime
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_ruleFilterComponent2213);
                    this_OnTime_2=ruleOnTime();

                    state._fsp--;

                     
                            current = this_OnTime_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1008:5: this_OnAttributes_3= ruleOnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_ruleFilterComponent2240);
                    this_OnAttributes_3=ruleOnAttributes();

                    state._fsp--;

                     
                            current = this_OnAttributes_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1018:5: this_OnTags_4= ruleOnTags
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_ruleFilterComponent2267);
                    this_OnTags_4=ruleOnTags();

                    state._fsp--;

                     
                            current = this_OnTags_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1028:5: this_OnSize_5= ruleOnSize
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_ruleFilterComponent2294);
                    this_OnSize_5=ruleOnSize();

                    state._fsp--;

                     
                            current = this_OnSize_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1038:5: this_FilterContainer_6= ruleFilterContainer
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_ruleFilterComponent2321);
                    this_FilterContainer_6=ruleFilterContainer();

                    state._fsp--;

                     
                            current = this_FilterContainer_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1048:5: this_IsEmpty_7= ruleIsEmpty
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_ruleFilterComponent2348);
                    this_IsEmpty_7=ruleIsEmpty();

                    state._fsp--;

                     
                            current = this_IsEmpty_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1058:5: this_OnType_8= ruleOnType
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_ruleFilterComponent2375);
                    this_OnType_8=ruleOnType();

                    state._fsp--;

                     
                            current = this_OnType_8; 
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


    // $ANTLR start "entryRuleOnAttributes"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1074:1: entryRuleOnAttributes returns [EObject current=null] : iv_ruleOnAttributes= ruleOnAttributes EOF ;
    public final EObject entryRuleOnAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnAttributes = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1075:2: (iv_ruleOnAttributes= ruleOnAttributes EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1076:2: iv_ruleOnAttributes= ruleOnAttributes EOF
            {
             newCompositeNode(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes2410);
            iv_ruleOnAttributes=ruleOnAttributes();

            state._fsp--;

             current =iv_ruleOnAttributes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes2420); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1083:1: ruleOnAttributes returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) ) ;
    public final EObject ruleOnAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inverse_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inverse_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1086:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1087:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1087:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1087:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnAttributes2457); 

                	newLeafNode(otherlv_0, grammarAccess.getOnAttributesAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1091:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1092:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1092:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1093:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes2478);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1109:2: ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=30 && LA15_0<=31)) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1109:3: ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1109:3: ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1109:4: ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist'
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1109:4: ( (lv_inverse_2_0= 'not' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1110:1: (lv_inverse_2_0= 'not' )
                            {
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1110:1: (lv_inverse_2_0= 'not' )
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1111:3: lv_inverse_2_0= 'not'
                            {
                            lv_inverse_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnAttributes2498); 

                                    newLeafNode(lv_inverse_2_0, grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOnAttributesRule());
                            	        }
                                   		setWithLastConsumed(current, "inverse", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnAttributes2524); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnAttributesAccess().getExistKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1129:6: (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1129:6: (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1129:8: otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOnAttributes2544); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnAttributesAccess().getIsKeyword_2_1_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1133:1: ( (lv_inverse_5_0= 'not' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==30) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1134:1: (lv_inverse_5_0= 'not' )
                            {
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1134:1: (lv_inverse_5_0= 'not' )
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1135:3: lv_inverse_5_0= 'not'
                            {
                            lv_inverse_5_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnAttributes2562); 

                                    newLeafNode(lv_inverse_5_0, grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOnAttributesRule());
                            	        }
                                   		setWithLastConsumed(current, "inverse", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1148:3: ( (lv_value_6_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1149:1: (lv_value_6_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1149:1: (lv_value_6_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1150:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes2597);
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


                    }


                    }
                    break;

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
    // $ANTLR end "ruleOnAttributes"


    // $ANTLR start "entryRuleOnTags"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1174:1: entryRuleOnTags returns [EObject current=null] : iv_ruleOnTags= ruleOnTags EOF ;
    public final EObject entryRuleOnTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTags = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1175:2: (iv_ruleOnTags= ruleOnTags EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1176:2: iv_ruleOnTags= ruleOnTags EOF
            {
             newCompositeNode(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags2635);
            iv_ruleOnTags=ruleOnTags();

            state._fsp--;

             current =iv_ruleOnTags; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags2645); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1183:1: ruleOnTags returns [EObject current=null] : (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? ) ;
    public final EObject ruleOnTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_inverse_8_0=null;
        Token otherlv_9=null;
        Token lv_only_10_0=null;
        AntlrDatatypeRuleToken lv_tags_1_0 = null;

        AntlrDatatypeRuleToken lv_tags_3_0 = null;

        Enumerator lv_quantificator_5_0 = null;

        AntlrDatatypeRuleToken lv_treshold_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1186:28: ( (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1187:1: (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1187:1: (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1187:3: otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )?
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnTags2682); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTagsAccess().getInKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1191:1: ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1191:2: ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1191:2: ( (lv_tags_1_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1192:1: (lv_tags_1_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1192:1: (lv_tags_1_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1193:3: lv_tags_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags2704);
                    lv_tags_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	        }
                           		add(
                           			current, 
                           			"tags",
                            		lv_tags_1_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1209:2: (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1209:4: otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOnTags2717); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1213:1: ( (lv_tags_3_0= ruleEString ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1214:1: (lv_tags_3_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1214:1: (lv_tags_3_0= ruleEString )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1215:3: lv_tags_3_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags2738);
                    	    lv_tags_3_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tags",
                    	            		lv_tags_3_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOnTags2754); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1235:1: ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=61 && LA18_0<=62)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT||LA18_0==44) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1235:2: ( (lv_quantificator_5_0= ruleQuantificators ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1235:2: ( (lv_quantificator_5_0= ruleQuantificators ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1236:1: (lv_quantificator_5_0= ruleQuantificators )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1236:1: (lv_quantificator_5_0= ruleQuantificators )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1237:3: lv_quantificator_5_0= ruleQuantificators
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getQuantificatorQuantificatorsEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuantificators_in_ruleOnTags2776);
                    lv_quantificator_5_0=ruleQuantificators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	        }
                           		set(
                           			current, 
                           			"quantificator",
                            		lv_quantificator_5_0, 
                            		"Quantificators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1254:6: ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1254:6: ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1254:7: ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are'
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1254:7: ( (lv_treshold_6_0= ruleEInt ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1255:1: (lv_treshold_6_0= ruleEInt )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1255:1: (lv_treshold_6_0= ruleEInt )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1256:3: lv_treshold_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTags2804);
                    lv_treshold_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	        }
                           		set(
                           			current, 
                           			"treshold",
                            		lv_treshold_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOnTags2816); 

                        	newLeafNode(otherlv_7, grammarAccess.getOnTagsAccess().getAreKeyword_3_1_1());
                        

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1276:3: ( (lv_inverse_8_0= 'not' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1277:1: (lv_inverse_8_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1277:1: (lv_inverse_8_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1278:3: lv_inverse_8_0= 'not'
                    {
                    lv_inverse_8_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnTags2836); 

                            newLeafNode(lv_inverse_8_0, grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTagsRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnTags2862); 

                	newLeafNode(otherlv_9, grammarAccess.getOnTagsAccess().getInTagsKeyword_5());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1295:1: ( (lv_only_10_0= 'and no more tags' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1296:1: (lv_only_10_0= 'and no more tags' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1296:1: (lv_only_10_0= 'and no more tags' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1297:3: lv_only_10_0= 'and no more tags'
                    {
                    lv_only_10_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnTags2880); 

                            newLeafNode(lv_only_10_0, grammarAccess.getOnTagsAccess().getOnlyAndNoMoreTagsKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTagsRule());
                    	        }
                           		setWithLastConsumed(current, "only", true, "and no more tags");
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOnTags"


    // $ANTLR start "entryRuleOnTime"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1318:1: entryRuleOnTime returns [EObject current=null] : iv_ruleOnTime= ruleOnTime EOF ;
    public final EObject entryRuleOnTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTime = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1319:2: (iv_ruleOnTime= ruleOnTime EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1320:2: iv_ruleOnTime= ruleOnTime EOF
            {
             newCompositeNode(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime2930);
            iv_ruleOnTime=ruleOnTime();

            state._fsp--;

             current =iv_ruleOnTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime2940); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1327:1: ruleOnTime returns [EObject current=null] : ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleOnTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_timeOf_0_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_treshold_3_0 = null;

        Enumerator lv_unit_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1330:28: ( ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1331:1: ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1331:1: ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1331:2: ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1331:2: ( (lv_timeOf_0_0= ruleTimeType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1332:1: (lv_timeOf_0_0= ruleTimeType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1332:1: (lv_timeOf_0_0= ruleTimeType )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1333:3: lv_timeOf_0_0= ruleTimeType
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_ruleOnTime2986);
            lv_timeOf_0_0=ruleTimeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"timeOf",
                    		lv_timeOf_0_0, 
                    		"TimeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOnTime2998); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTimeAccess().getBeforeKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1353:1: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1354:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1354:1: (lv_operator_2_0= ruleOperator )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1355:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnTime3019);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1371:2: ( (lv_treshold_3_0= ruleEInt ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1372:1: (lv_treshold_3_0= ruleEInt )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1372:1: (lv_treshold_3_0= ruleEInt )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1373:3: lv_treshold_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTime3040);
            lv_treshold_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1389:2: ( (lv_unit_4_0= ruleTimeUnit ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1390:1: (lv_unit_4_0= ruleTimeUnit )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1390:1: (lv_unit_4_0= ruleTimeUnit )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1391:3: lv_unit_4_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_ruleOnTime3061);
            lv_unit_4_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"TimeUnit");
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
    // $ANTLR end "ruleOnTime"


    // $ANTLR start "entryRuleOnSize"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1415:1: entryRuleOnSize returns [EObject current=null] : iv_ruleOnSize= ruleOnSize EOF ;
    public final EObject entryRuleOnSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSize = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1416:2: (iv_ruleOnSize= ruleOnSize EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1417:2: iv_ruleOnSize= ruleOnSize EOF
            {
             newCompositeNode(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize3097);
            iv_ruleOnSize=ruleOnSize();

            state._fsp--;

             current =iv_ruleOnSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize3107); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1424:1: ruleOnSize returns [EObject current=null] : (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) ) ;
    public final EObject ruleOnSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inverse_1_0=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_treshold_3_0 = null;

        Enumerator lv_unit_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1427:28: ( (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1428:1: (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1428:1: (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1428:3: otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOnSize3144); 

                	newLeafNode(otherlv_0, grammarAccess.getOnSizeAccess().getSizeOfFileKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1432:1: ( (lv_inverse_1_0= 'not' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1433:1: (lv_inverse_1_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1433:1: (lv_inverse_1_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1434:3: lv_inverse_1_0= 'not'
                    {
                    lv_inverse_1_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnSize3162); 

                            newLeafNode(lv_inverse_1_0, grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnSizeRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1447:3: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1448:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1448:1: (lv_operator_2_0= ruleOperator )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1449:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnSize3197);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1465:2: ( (lv_treshold_3_0= ruleEInt ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1466:1: (lv_treshold_3_0= ruleEInt )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1466:1: (lv_treshold_3_0= ruleEInt )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1467:3: lv_treshold_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnSize3218);
            lv_treshold_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1483:2: ( (lv_unit_4_0= ruleMemoryUnit ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1484:1: (lv_unit_4_0= ruleMemoryUnit )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1484:1: (lv_unit_4_0= ruleMemoryUnit )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1485:3: lv_unit_4_0= ruleMemoryUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_ruleOnSize3239);
            lv_unit_4_0=ruleMemoryUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_4_0, 
                    		"MemoryUnit");
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
    // $ANTLR end "ruleOnSize"


    // $ANTLR start "entryRuleOnName"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1509:1: entryRuleOnName returns [EObject current=null] : iv_ruleOnName= ruleOnName EOF ;
    public final EObject entryRuleOnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnName = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1510:2: (iv_ruleOnName= ruleOnName EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1511:2: iv_ruleOnName= ruleOnName EOF
            {
             newCompositeNode(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName3275);
            iv_ruleOnName=ruleOnName();

            state._fsp--;

             current =iv_ruleOnName; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName3285); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1518:1: ruleOnName returns [EObject current=null] : ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleOnName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1521:28: ( ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1522:1: ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1522:1: ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1522:2: () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1522:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1523:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnNameAccess().getOnNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOnName3331); 

                	newLeafNode(otherlv_1, grammarAccess.getOnNameAccess().getNameIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1532:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1533:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1533:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1534:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnName3349); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnNameRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1547:3: ( (lv_name_3_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1548:1: (lv_name_3_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1548:1: (lv_name_3_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1549:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnName3384);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnNameRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
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
    // $ANTLR end "ruleOnName"


    // $ANTLR start "entryRuleOnExtension"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1573:1: entryRuleOnExtension returns [EObject current=null] : iv_ruleOnExtension= ruleOnExtension EOF ;
    public final EObject entryRuleOnExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnExtension = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1574:2: (iv_ruleOnExtension= ruleOnExtension EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1575:2: iv_ruleOnExtension= ruleOnExtension EOF
            {
             newCompositeNode(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension3420);
            iv_ruleOnExtension=ruleOnExtension();

            state._fsp--;

             current =iv_ruleOnExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension3430); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1582:1: ruleOnExtension returns [EObject current=null] : ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleOnExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_extensions_4_0 = null;

        AntlrDatatypeRuleToken lv_extensions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1585:28: ( ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1586:1: ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1586:1: ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1586:2: () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1586:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1587:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnExtensionAccess().getOnExtensionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnExtension3476); 

                	newLeafNode(otherlv_1, grammarAccess.getOnExtensionAccess().getExtensionIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1596:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1597:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1597:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1598:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnExtension3494); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnExtensionRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnExtension3520); 

                	newLeafNode(otherlv_3, grammarAccess.getOnExtensionAccess().getInKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1615:1: ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1615:2: ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1615:2: ( (lv_extensions_4_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1616:1: (lv_extensions_4_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1616:1: (lv_extensions_4_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1617:3: lv_extensions_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3542);
                    lv_extensions_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1633:2: (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==21) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1633:4: otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOnExtension3555); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getOnExtensionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1637:1: ( (lv_extensions_6_0= ruleEString ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1638:1: (lv_extensions_6_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1638:1: (lv_extensions_6_0= ruleEString )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1639:3: lv_extensions_6_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3576);
                    	    lv_extensions_6_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_6_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOnExtension3592); 

                	newLeafNode(otherlv_7, grammarAccess.getOnExtensionAccess().getRightSquareBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleIsEmpty"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1667:1: entryRuleIsEmpty returns [EObject current=null] : iv_ruleIsEmpty= ruleIsEmpty EOF ;
    public final EObject entryRuleIsEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEmpty = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1668:2: (iv_ruleIsEmpty= ruleIsEmpty EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1669:2: iv_ruleIsEmpty= ruleIsEmpty EOF
            {
             newCompositeNode(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3628);
            iv_ruleIsEmpty=ruleIsEmpty();

            state._fsp--;

             current =iv_ruleIsEmpty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty3638); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1676:1: ruleIsEmpty returns [EObject current=null] : ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' ) ;
    public final EObject ruleIsEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1679:28: ( ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1680:1: ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1680:1: ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1680:2: () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1680:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1681:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEmptyAccess().getIsEmptyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIsEmpty3684); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEmptyAccess().getIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1690:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1691:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1691:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1692:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleIsEmpty3702); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIsEmptyRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleIsEmpty3728); 

                	newLeafNode(otherlv_3, grammarAccess.getIsEmptyAccess().getEmptyKeyword_3());
                

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1717:1: entryRuleOnType returns [EObject current=null] : iv_ruleOnType= ruleOnType EOF ;
    public final EObject entryRuleOnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnType = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1718:2: (iv_ruleOnType= ruleOnType EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1719:2: iv_ruleOnType= ruleOnType EOF
            {
             newCompositeNode(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType3764);
            iv_ruleOnType=ruleOnType();

            state._fsp--;

             current =iv_ruleOnType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType3774); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1726:1: ruleOnType returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) ) ;
    public final EObject ruleOnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1729:28: ( (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1730:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1730:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1730:3: otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) )
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOnType3811); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTypeAccess().getFileKeyword_0());
                
            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOnType3823); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTypeAccess().getIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1738:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1739:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1739:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1740:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnType3841); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTypeRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1753:3: ( (lv_type_3_0= ruleFileType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1754:1: (lv_type_3_0= ruleFileType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1754:1: (lv_type_3_0= ruleFileType )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1755:3: lv_type_3_0= ruleFileType
            {
             
            	        newCompositeNode(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_ruleOnType3876);
            lv_type_3_0=ruleFileType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"FileType");
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
    // $ANTLR end "ruleOnType"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1779:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1780:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1781:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3913);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3924); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1788:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1791:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1792:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1792:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1792:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1792:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1793:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEInt3963); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3980); 

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1815:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1816:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1817:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4028);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4039); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1824:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1827:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1828:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1828:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1828:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4079); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1836:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4105); 

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


    // $ANTLR start "ruleStrategies"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1851:1: ruleStrategies returns [Enumerator current=null] : ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) ;
    public final Enumerator ruleStrategies() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1853:28: ( ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1854:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1854:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1854:2: (enumLiteral_0= 'forced' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1854:2: (enumLiteral_0= 'forced' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1854:4: enumLiteral_0= 'forced'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleStrategies4164); 

                            current = grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1860:6: (enumLiteral_1= 'append' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1860:6: (enumLiteral_1= 'append' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1860:8: enumLiteral_1= 'append'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleStrategies4181); 

                            current = grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1866:6: (enumLiteral_2= 'carefully' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1866:6: (enumLiteral_2= 'carefully' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1866:8: enumLiteral_2= 'carefully'
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleStrategies4198); 

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


    // $ANTLR start "ruleOperator"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1876:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1878:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1879:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1879:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt31=1;
                }
                break;
            case 49:
                {
                alt31=2;
                }
                break;
            case 50:
                {
                alt31=3;
                }
                break;
            case 51:
                {
                alt31=4;
                }
                break;
            case 52:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1879:2: (enumLiteral_0= '==' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1879:2: (enumLiteral_0= '==' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1879:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOperator4243); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1885:6: (enumLiteral_1= '<' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1885:6: (enumLiteral_1= '<' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1885:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOperator4260); 

                            current = grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1891:6: (enumLiteral_2= '>' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1891:6: (enumLiteral_2= '>' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1891:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOperator4277); 

                            current = grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1897:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1897:6: (enumLiteral_3= '<=' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1897:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOperator4294); 

                            current = grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1903:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1903:6: (enumLiteral_4= '>=' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1903:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleOperator4311); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1913:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1915:28: ( ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1916:1: ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1916:1: ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt32=1;
                }
                break;
            case 54:
                {
                alt32=2;
                }
                break;
            case 55:
                {
                alt32=3;
                }
                break;
            case 56:
                {
                alt32=4;
                }
                break;
            case 57:
                {
                alt32=5;
                }
                break;
            case 58:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1916:2: (enumLiteral_0= 'mins' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1916:2: (enumLiteral_0= 'mins' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1916:4: enumLiteral_0= 'mins'
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTimeUnit4356); 

                            current = grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1922:6: (enumLiteral_1= 'hours' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1922:6: (enumLiteral_1= 'hours' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1922:8: enumLiteral_1= 'hours'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTimeUnit4373); 

                            current = grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1928:6: (enumLiteral_2= 'days' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1928:6: (enumLiteral_2= 'days' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1928:8: enumLiteral_2= 'days'
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTimeUnit4390); 

                            current = grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1934:6: (enumLiteral_3= 'weeks' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1934:6: (enumLiteral_3= 'weeks' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1934:8: enumLiteral_3= 'weeks'
                    {
                    enumLiteral_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTimeUnit4407); 

                            current = grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1940:6: (enumLiteral_4= 'months' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1940:6: (enumLiteral_4= 'months' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1940:8: enumLiteral_4= 'months'
                    {
                    enumLiteral_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTimeUnit4424); 

                            current = grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1946:6: (enumLiteral_5= 'years' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1946:6: (enumLiteral_5= 'years' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1946:8: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTimeUnit4441); 

                            current = grammarAccess.getTimeUnitAccess().getYearsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getYearsEnumLiteralDeclaration_5()); 
                        

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1956:1: ruleTimeType returns [Enumerator current=null] : ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) ) ;
    public final Enumerator ruleTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1958:28: ( ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1959:1: ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1959:1: ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            else if ( (LA33_0==60) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1959:2: (enumLiteral_0= 'modified' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1959:2: (enumLiteral_0= 'modified' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1959:4: enumLiteral_0= 'modified'
                    {
                    enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTimeType4486); 

                            current = grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1965:6: (enumLiteral_1= 'created' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1965:6: (enumLiteral_1= 'created' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1965:8: enumLiteral_1= 'created'
                    {
                    enumLiteral_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTimeType4503); 

                            current = grammarAccess.getTimeTypeAccess().getCreatedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeTypeAccess().getCreatedEnumLiteralDeclaration_1()); 
                        

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


    // $ANTLR start "ruleQuantificators"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1975:1: ruleQuantificators returns [Enumerator current=null] : ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) ) ;
    public final Enumerator ruleQuantificators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1977:28: ( ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1978:1: ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1978:1: ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            else if ( (LA34_0==62) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1978:2: (enumLiteral_0= 'any are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1978:2: (enumLiteral_0= 'any are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1978:4: enumLiteral_0= 'any are'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleQuantificators4548); 

                            current = grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1984:6: (enumLiteral_1= 'all are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1984:6: (enumLiteral_1= 'all are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1984:8: enumLiteral_1= 'all are'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleQuantificators4565); 

                            current = grammarAccess.getQuantificatorsAccess().getAllEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQuantificatorsAccess().getAllEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleQuantificators"


    // $ANTLR start "ruleMemoryUnit"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1994:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) ;
    public final Enumerator ruleMemoryUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1996:28: ( ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1997:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1997:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt35=1;
                }
                break;
            case 64:
                {
                alt35=2;
                }
                break;
            case 65:
                {
                alt35=3;
                }
                break;
            case 66:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1997:2: (enumLiteral_0= 'KB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1997:2: (enumLiteral_0= 'KB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1997:4: enumLiteral_0= 'KB'
                    {
                    enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleMemoryUnit4610); 

                            current = grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2003:6: (enumLiteral_1= 'MB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2003:6: (enumLiteral_1= 'MB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2003:8: enumLiteral_1= 'MB'
                    {
                    enumLiteral_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleMemoryUnit4627); 

                            current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2009:6: (enumLiteral_2= 'GB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2009:6: (enumLiteral_2= 'GB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2009:8: enumLiteral_2= 'GB'
                    {
                    enumLiteral_2=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMemoryUnit4644); 

                            current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2015:6: (enumLiteral_3= 'TB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2015:6: (enumLiteral_3= 'TB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2015:8: enumLiteral_3= 'TB'
                    {
                    enumLiteral_3=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMemoryUnit4661); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2025:1: ruleCompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleCompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2027:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2028:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2028:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==67) ) {
                alt36=1;
            }
            else if ( (LA36_0==68) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2028:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2028:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2028:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCompositionType4706); 

                            current = grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2034:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2034:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2034:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCompositionType4723); 

                            current = grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2044:1: ruleFileType returns [Enumerator current=null] : ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) ) ;
    public final Enumerator ruleFileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2046:28: ( ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2047:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2047:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            else if ( (LA37_0==70) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2047:2: (enumLiteral_0= 'Document' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2047:2: (enumLiteral_0= 'Document' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2047:4: enumLiteral_0= 'Document'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleFileType4768); 

                            current = grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2053:6: (enumLiteral_1= 'Directory' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2053:6: (enumLiteral_1= 'Directory' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2053:8: enumLiteral_1= 'Directory'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleFileType4785); 

                            current = grammarAccess.getFileTypeAccess().getDirectoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFileTypeAccess().getDirectoryEnumLiteralDeclaration_1()); 
                        

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_ruleModel140 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleModel153 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleExecution_in_ruleModel174 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleExecution_in_entryRuleExecution212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExecution222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_ruleExecution269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_ruleExecution296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleExecution323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_ruleExecution350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_ruleExecution377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_entryRulePathVariable412 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathVariable422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePathVariable468 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePathVariable480 = new BitSet(new long[]{0x0000000006458060L});
        public static final BitSet FOLLOW_rulePath_in_rulePathVariable501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath593 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_rulePath606 = new BitSet(new long[]{0x0000000006458060L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath627 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_ruleGenericStep722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_ruleGenericStep749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_ruleGenericStep776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep811 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConcreteStep867 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleConcreteStep880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleVariableStep965 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableStep988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleParametrizedStep1080 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParametrizedStep1101 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleParametrizedStep1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection1149 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection1159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSelection1196 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelection1217 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSelection1229 = new BitSet(new long[]{0x0000000006458060L});
        public static final BitSet FOLLOW_rulePath_in_ruleSelection1250 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleSelection1263 = new BitSet(new long[]{0x18000B8328000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection1284 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleSelection1297 = new BitSet(new long[]{0x18000B8328000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection1318 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy1358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy1368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleCopy1405 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCopy1417 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCopy1440 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCopy1452 = new BitSet(new long[]{0x0000000006458060L});
        public static final BitSet FOLLOW_rulePath_in_ruleCopy1473 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleCopy1486 = new BitSet(new long[]{0x0000E00000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleCopy1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleMove1592 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMove1604 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove1627 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMove1639 = new BitSet(new long[]{0x0000000006458060L});
        public static final BitSet FOLLOW_rulePath_in_ruleMove1660 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleMove1673 = new BitSet(new long[]{0x0000E00000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleMove1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete1732 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete1742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleDelete1779 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDelete1791 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelete1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1850 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleFilterContainer1897 = new BitSet(new long[]{0x18000B8328000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleLink_in_ruleFilterContainer1918 = new BitSet(new long[]{0x18000B8338000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_ruleLink_in_ruleFilterContainer1939 = new BitSet(new long[]{0x18000B8338000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_28_in_ruleFilterContainer1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1988 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink1998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositionType_in_ruleLink2044 = new BitSet(new long[]{0x18000B8328000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleLink2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent2102 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_ruleFilterComponent2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_ruleFilterComponent2186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_ruleFilterComponent2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_ruleFilterComponent2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_ruleFilterComponent2267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_ruleFilterComponent2294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_ruleFilterComponent2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_ruleFilterComponent2348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_ruleFilterComponent2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes2410 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleOnAttributes2457 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes2478 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_30_in_ruleOnAttributes2498 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleOnAttributes2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleOnAttributes2544 = new BitSet(new long[]{0x0000000046440060L});
        public static final BitSet FOLLOW_30_in_ruleOnAttributes2562 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes2597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags2635 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags2645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleOnTags2682 = new BitSet(new long[]{0x0000000406440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags2704 = new BitSet(new long[]{0x0000000400200000L});
        public static final BitSet FOLLOW_21_in_ruleOnTags2717 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags2738 = new BitSet(new long[]{0x0000000400200000L});
        public static final BitSet FOLLOW_34_in_ruleOnTags2754 = new BitSet(new long[]{0x6000100000000010L});
        public static final BitSet FOLLOW_ruleQuantificators_in_ruleOnTags2776 = new BitSet(new long[]{0x0000001040000000L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTags2804 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleOnTags2816 = new BitSet(new long[]{0x0000001040000000L});
        public static final BitSet FOLLOW_30_in_ruleOnTags2836 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleOnTags2862 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleOnTags2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime2930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeType_in_ruleOnTime2986 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleOnTime2998 = new BitSet(new long[]{0x001F000000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnTime3019 = new BitSet(new long[]{0x6000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTime3040 = new BitSet(new long[]{0x07E0000000000000L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_ruleOnTime3061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize3097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize3107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleOnSize3144 = new BitSet(new long[]{0x001F000040000000L});
        public static final BitSet FOLLOW_30_in_ruleOnSize3162 = new BitSet(new long[]{0x001F000000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnSize3197 = new BitSet(new long[]{0x6000100000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnSize3218 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_ruleOnSize3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName3275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName3285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleOnName3331 = new BitSet(new long[]{0x0000000046440060L});
        public static final BitSet FOLLOW_30_in_ruleOnName3349 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnName3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension3420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension3430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleOnExtension3476 = new BitSet(new long[]{0x0000000240000000L});
        public static final BitSet FOLLOW_30_in_ruleOnExtension3494 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleOnExtension3520 = new BitSet(new long[]{0x0000000406440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3542 = new BitSet(new long[]{0x0000000400200000L});
        public static final BitSet FOLLOW_21_in_ruleOnExtension3555 = new BitSet(new long[]{0x0000000006440060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3576 = new BitSet(new long[]{0x0000000400200000L});
        public static final BitSet FOLLOW_34_in_ruleOnExtension3592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty3638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleIsEmpty3684 = new BitSet(new long[]{0x0000040040000000L});
        public static final BitSet FOLLOW_30_in_ruleIsEmpty3702 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleIsEmpty3728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType3764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType3774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOnType3811 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOnType3823 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_30_in_ruleOnType3841 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_ruleFileType_in_ruleOnType3876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEInt3963 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleStrategies4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleStrategies4181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleStrategies4198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleOperator4243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleOperator4260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleOperator4277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOperator4294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleOperator4311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTimeUnit4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTimeUnit4373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTimeUnit4390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTimeUnit4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTimeUnit4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTimeUnit4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTimeType4486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTimeType4503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleQuantificators4548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleQuantificators4565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleMemoryUnit4610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleMemoryUnit4627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleMemoryUnit4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMemoryUnit4661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleCompositionType4706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleCompositionType4723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleFileType4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleFileType4785 = new BitSet(new long[]{0x0000000000000002L});
    }


}