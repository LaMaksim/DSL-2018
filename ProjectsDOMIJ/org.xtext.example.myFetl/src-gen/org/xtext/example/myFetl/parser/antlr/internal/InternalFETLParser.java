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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'/'", "'?'", "'{$'", "'}'", "'select'", "'from'", "'where'", "','", "'copy'", "'to'", "'strategy:'", "'move'", "'delete'", "'('", "')'", "'attribute'", "'not'", "'exist'", "'is'", "'in ['", "']'", "'are'", "'in tags'", "'and no more tags'", "'before'", "'size of file'", "'name is'", "'extension is'", "'empty'", "'file'", "'-'", "'forced'", "'append'", "'carefully'", "'=='", "'<'", "'>'", "'<='", "'>='", "'mins'", "'hours'", "'days'", "'weeks'", "'months'", "'years'", "'modified'", "'created'", "'any are'", "'all are'", "'KB'", "'MB'", "'GB'", "'TB'", "'and'", "'or'", "'Document'", "'Directory'"
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
            case 17:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
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
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:386:1: ruleConcreteStep returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleConcreteStep() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:389:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:1: ( (lv_value_0_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:391:1: (lv_value_0_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:391:1: (lv_value_0_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:392:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConcreteStep866);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:416:1: entryRuleVariableStep returns [EObject current=null] : iv_ruleVariableStep= ruleVariableStep EOF ;
    public final EObject entryRuleVariableStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:417:2: (iv_ruleVariableStep= ruleVariableStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:418:2: iv_ruleVariableStep= ruleVariableStep EOF
            {
             newCompositeNode(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep901);
            iv_ruleVariableStep=ruleVariableStep();

            state._fsp--;

             current =iv_ruleVariableStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep911); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:425:1: ruleVariableStep returns [EObject current=null] : (otherlv_0= '?' ( ( ruleEString ) ) ) ;
    public final EObject ruleVariableStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:428:28: ( (otherlv_0= '?' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:429:1: (otherlv_0= '?' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:429:1: (otherlv_0= '?' ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:429:3: otherlv_0= '?' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleVariableStep948); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableStepAccess().getQuestionMarkKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:433:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:434:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:434:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:435:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableStepRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableStep971);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:456:1: entryRuleParametrizedStep returns [EObject current=null] : iv_ruleParametrizedStep= ruleParametrizedStep EOF ;
    public final EObject entryRuleParametrizedStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametrizedStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:457:2: (iv_ruleParametrizedStep= ruleParametrizedStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:458:2: iv_ruleParametrizedStep= ruleParametrizedStep EOF
            {
             newCompositeNode(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep1007);
            iv_ruleParametrizedStep=ruleParametrizedStep();

            state._fsp--;

             current =iv_ruleParametrizedStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep1017); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:465:1: ruleParametrizedStep returns [EObject current=null] : ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) ;
    public final EObject ruleParametrizedStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:468:28: ( ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:469:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:469:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:469:2: () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:469:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:470:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParametrizedStep1063); 

                	newLeafNode(otherlv_1, grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:479:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:480:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:480:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:481:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParametrizedStep1084);
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

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParametrizedStep1096); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:509:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:510:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:511:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection1132);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection1142); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:518:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:521:28: ( (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:522:1: (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:522:1: (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:522:3: otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )?
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSelection1179); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:526:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:527:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:527:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:528:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelection1200);
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSelection1212); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getFromKeyword_2());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:548:1: ( (lv_from_3_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:549:1: (lv_from_3_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:549:1: (lv_from_3_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:550:3: lv_from_3_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleSelection1233);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:566:2: (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:566:4: otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )*
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSelection1246); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getWhereKeyword_4_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:570:1: ( (lv_where_5_0= ruleFilterComponent ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:571:1: (lv_where_5_0= ruleFilterComponent )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:571:1: (lv_where_5_0= ruleFilterComponent )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:572:3: lv_where_5_0= ruleFilterComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection1267);
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

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:588:2: (otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:588:4: otherlv_6= ',' ( (lv_where_7_0= ruleFilterComponent ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSelection1280); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSelectionAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:592:1: ( (lv_where_7_0= ruleFilterComponent ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:593:1: (lv_where_7_0= ruleFilterComponent )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:593:1: (lv_where_7_0= ruleFilterComponent )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:594:3: lv_where_7_0= ruleFilterComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection1301);
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
                    	    break loop5;
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:618:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:619:2: (iv_ruleCopy= ruleCopy EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:620:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy1341);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy1351); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:627:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:630:28: ( (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:631:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:631:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:631:3: otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCopy1388); 

                	newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCopy1400); 

                	newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:639:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:640:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:640:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:641:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCopy1423);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCopy1435); 

                	newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getToKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:658:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:659:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:659:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:660:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleCopy1456);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:676:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:676:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCopy1469); 

                        	newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:680:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:681:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:681:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:682:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleCopy1490);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:706:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:707:2: (iv_ruleMove= ruleMove EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:708:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove1528);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove1538); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:715:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:718:28: ( (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:719:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:719:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:719:3: otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMove1575); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMove1587); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:727:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:728:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:728:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:729:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove1610);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMove1622); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getToKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:746:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:747:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:747:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:748:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleMove1643);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:764:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:764:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMove1656); 

                        	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:768:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:769:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:769:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:770:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleMove1677);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:794:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:795:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:796:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete1715);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete1725); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:803:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:806:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:807:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:807:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:807:3: otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDelete1762); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDelete1774); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:815:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:816:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:816:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:817:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeleteAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelete1797);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:838:1: entryRuleFilterContainer returns [EObject current=null] : iv_ruleFilterContainer= ruleFilterContainer EOF ;
    public final EObject entryRuleFilterContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterContainer = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:839:2: (iv_ruleFilterContainer= ruleFilterContainer EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:840:2: iv_ruleFilterContainer= ruleFilterContainer EOF
            {
             newCompositeNode(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1833);
            iv_ruleFilterContainer=ruleFilterContainer();

            state._fsp--;

             current =iv_ruleFilterContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer1843); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:847:1: ruleFilterContainer returns [EObject current=null] : (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' ) ;
    public final EObject ruleFilterContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_links_1_0 = null;

        EObject lv_links_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:850:28: ( (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:851:1: (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:851:1: (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:851:3: otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFilterContainer1880); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:855:1: ( (lv_links_1_0= ruleLink ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:856:1: (lv_links_1_0= ruleLink )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:856:1: (lv_links_1_0= ruleLink )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:857:3: lv_links_1_0= ruleLink
            {
             
            	        newCompositeNode(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleFilterContainer1901);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:873:2: ( (lv_links_2_0= ruleLink ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26||LA9_0==28||(LA9_0>=31 && LA9_0<=32)||(LA9_0>=38 && LA9_0<=40)||LA9_0==42||(LA9_0>=58 && LA9_0<=59)||(LA9_0>=66 && LA9_0<=67)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:874:1: (lv_links_2_0= ruleLink )
            	    {
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:874:1: (lv_links_2_0= ruleLink )
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:875:3: lv_links_2_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleFilterContainer1922);
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
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFilterContainer1935); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:903:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:904:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:905:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink1971);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink1981); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:912:1: ruleLink returns [EObject current=null] : ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_compositonType_0_0 = null;

        EObject lv_element_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:915:28: ( ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:916:1: ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:916:1: ( ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:916:2: ( (lv_compositonType_0_0= ruleCompositionType ) )? ( (lv_element_1_0= ruleFilterComponent ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:916:2: ( (lv_compositonType_0_0= ruleCompositionType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=66 && LA10_0<=67)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:917:1: (lv_compositonType_0_0= ruleCompositionType )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:917:1: (lv_compositonType_0_0= ruleCompositionType )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:918:3: lv_compositonType_0_0= ruleCompositionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getCompositonTypeCompositionTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_ruleLink2027);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:934:3: ( (lv_element_1_0= ruleFilterComponent ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:935:1: (lv_element_1_0= ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:935:1: (lv_element_1_0= ruleFilterComponent )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:936:3: lv_element_1_0= ruleFilterComponent
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getElementFilterComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleLink2049);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:960:1: entryRuleFilterComponent returns [EObject current=null] : iv_ruleFilterComponent= ruleFilterComponent EOF ;
    public final EObject entryRuleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterComponent = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:961:2: (iv_ruleFilterComponent= ruleFilterComponent EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:962:2: iv_ruleFilterComponent= ruleFilterComponent EOF
            {
             newCompositeNode(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent2085);
            iv_ruleFilterComponent=ruleFilterComponent();

            state._fsp--;

             current =iv_ruleFilterComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent2095); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:969:1: ruleFilterComponent returns [EObject current=null] : (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:972:28: ( (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:973:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:973:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt11=1;
                }
                break;
            case 40:
                {
                alt11=2;
                }
                break;
            case 58:
            case 59:
                {
                alt11=3;
                }
                break;
            case 28:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            case 38:
                {
                alt11=6;
                }
                break;
            case 26:
                {
                alt11=7;
                }
                break;
            case 31:
                {
                alt11=8;
                }
                break;
            case 42:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:974:5: this_OnName_0= ruleOnName
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_ruleFilterComponent2142);
                    this_OnName_0=ruleOnName();

                    state._fsp--;

                     
                            current = this_OnName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:984:5: this_OnExtension_1= ruleOnExtension
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_ruleFilterComponent2169);
                    this_OnExtension_1=ruleOnExtension();

                    state._fsp--;

                     
                            current = this_OnExtension_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:994:5: this_OnTime_2= ruleOnTime
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_ruleFilterComponent2196);
                    this_OnTime_2=ruleOnTime();

                    state._fsp--;

                     
                            current = this_OnTime_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1004:5: this_OnAttributes_3= ruleOnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_ruleFilterComponent2223);
                    this_OnAttributes_3=ruleOnAttributes();

                    state._fsp--;

                     
                            current = this_OnAttributes_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1014:5: this_OnTags_4= ruleOnTags
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_ruleFilterComponent2250);
                    this_OnTags_4=ruleOnTags();

                    state._fsp--;

                     
                            current = this_OnTags_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1024:5: this_OnSize_5= ruleOnSize
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_ruleFilterComponent2277);
                    this_OnSize_5=ruleOnSize();

                    state._fsp--;

                     
                            current = this_OnSize_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1034:5: this_FilterContainer_6= ruleFilterContainer
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_ruleFilterComponent2304);
                    this_FilterContainer_6=ruleFilterContainer();

                    state._fsp--;

                     
                            current = this_FilterContainer_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1044:5: this_IsEmpty_7= ruleIsEmpty
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_ruleFilterComponent2331);
                    this_IsEmpty_7=ruleIsEmpty();

                    state._fsp--;

                     
                            current = this_IsEmpty_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1054:5: this_OnType_8= ruleOnType
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_ruleFilterComponent2358);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1070:1: entryRuleOnAttributes returns [EObject current=null] : iv_ruleOnAttributes= ruleOnAttributes EOF ;
    public final EObject entryRuleOnAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnAttributes = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1071:2: (iv_ruleOnAttributes= ruleOnAttributes EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1072:2: iv_ruleOnAttributes= ruleOnAttributes EOF
            {
             newCompositeNode(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes2393);
            iv_ruleOnAttributes=ruleOnAttributes();

            state._fsp--;

             current =iv_ruleOnAttributes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes2403); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1079:1: ruleOnAttributes returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1082:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1083:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1083:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1083:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleOnAttributes2440); 

                	newLeafNode(otherlv_0, grammarAccess.getOnAttributesAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1087:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1088:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1088:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1089:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes2461);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1105:2: ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=29 && LA14_0<=30)) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1105:3: ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1105:3: ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1105:4: ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist'
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1105:4: ( (lv_inverse_2_0= 'not' ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==29) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1106:1: (lv_inverse_2_0= 'not' )
                            {
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1106:1: (lv_inverse_2_0= 'not' )
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1107:3: lv_inverse_2_0= 'not'
                            {
                            lv_inverse_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnAttributes2481); 

                                    newLeafNode(lv_inverse_2_0, grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOnAttributesRule());
                            	        }
                                   		setWithLastConsumed(current, "inverse", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnAttributes2507); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnAttributesAccess().getExistKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1125:6: (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1125:6: (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1125:8: otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnAttributes2527); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnAttributesAccess().getIsKeyword_2_1_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1129:1: ( (lv_inverse_5_0= 'not' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==29) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1130:1: (lv_inverse_5_0= 'not' )
                            {
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1130:1: (lv_inverse_5_0= 'not' )
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1131:3: lv_inverse_5_0= 'not'
                            {
                            lv_inverse_5_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnAttributes2545); 

                                    newLeafNode(lv_inverse_5_0, grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOnAttributesRule());
                            	        }
                                   		setWithLastConsumed(current, "inverse", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1144:3: ( (lv_value_6_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1145:1: (lv_value_6_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1145:1: (lv_value_6_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1146:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes2580);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1170:1: entryRuleOnTags returns [EObject current=null] : iv_ruleOnTags= ruleOnTags EOF ;
    public final EObject entryRuleOnTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTags = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1171:2: (iv_ruleOnTags= ruleOnTags EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1172:2: iv_ruleOnTags= ruleOnTags EOF
            {
             newCompositeNode(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags2618);
            iv_ruleOnTags=ruleOnTags();

            state._fsp--;

             current =iv_ruleOnTags; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags2628); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1179:1: ruleOnTags returns [EObject current=null] : (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1182:28: ( (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1183:1: (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1183:1: (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1183:3: otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )?
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOnTags2665); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTagsAccess().getInKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1187:1: ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1187:2: ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1187:2: ( (lv_tags_1_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1188:1: (lv_tags_1_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1188:1: (lv_tags_1_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1189:3: lv_tags_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags2687);
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

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1205:2: (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1205:4: otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOnTags2700); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1209:1: ( (lv_tags_3_0= ruleEString ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1210:1: (lv_tags_3_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1210:1: (lv_tags_3_0= ruleEString )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1211:3: lv_tags_3_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags2721);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnTags2737); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1231:1: ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=60 && LA17_0<=61)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT||LA17_0==43) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1231:2: ( (lv_quantificator_5_0= ruleQuantificators ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1231:2: ( (lv_quantificator_5_0= ruleQuantificators ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1232:1: (lv_quantificator_5_0= ruleQuantificators )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1232:1: (lv_quantificator_5_0= ruleQuantificators )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1233:3: lv_quantificator_5_0= ruleQuantificators
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getQuantificatorQuantificatorsEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuantificators_in_ruleOnTags2759);
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1250:6: ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1250:6: ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1250:7: ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are'
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1250:7: ( (lv_treshold_6_0= ruleEInt ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1251:1: (lv_treshold_6_0= ruleEInt )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1251:1: (lv_treshold_6_0= ruleEInt )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1252:3: lv_treshold_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTags2787);
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

                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOnTags2799); 

                        	newLeafNode(otherlv_7, grammarAccess.getOnTagsAccess().getAreKeyword_3_1_1());
                        

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1272:3: ( (lv_inverse_8_0= 'not' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1273:1: (lv_inverse_8_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1273:1: (lv_inverse_8_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1274:3: lv_inverse_8_0= 'not'
                    {
                    lv_inverse_8_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnTags2819); 

                            newLeafNode(lv_inverse_8_0, grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTagsRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOnTags2845); 

                	newLeafNode(otherlv_9, grammarAccess.getOnTagsAccess().getInTagsKeyword_5());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1291:1: ( (lv_only_10_0= 'and no more tags' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1292:1: (lv_only_10_0= 'and no more tags' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1292:1: (lv_only_10_0= 'and no more tags' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1293:3: lv_only_10_0= 'and no more tags'
                    {
                    lv_only_10_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnTags2863); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1314:1: entryRuleOnTime returns [EObject current=null] : iv_ruleOnTime= ruleOnTime EOF ;
    public final EObject entryRuleOnTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTime = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1315:2: (iv_ruleOnTime= ruleOnTime EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1316:2: iv_ruleOnTime= ruleOnTime EOF
            {
             newCompositeNode(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime2913);
            iv_ruleOnTime=ruleOnTime();

            state._fsp--;

             current =iv_ruleOnTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime2923); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1323:1: ruleOnTime returns [EObject current=null] : ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleOnTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_timeOf_0_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_treshold_3_0 = null;

        Enumerator lv_unit_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1326:28: ( ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1327:1: ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1327:1: ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1327:2: ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1327:2: ( (lv_timeOf_0_0= ruleTimeType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1328:1: (lv_timeOf_0_0= ruleTimeType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1328:1: (lv_timeOf_0_0= ruleTimeType )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1329:3: lv_timeOf_0_0= ruleTimeType
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_ruleOnTime2969);
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnTime2981); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTimeAccess().getBeforeKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1349:1: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1350:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1350:1: (lv_operator_2_0= ruleOperator )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1351:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnTime3002);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1367:2: ( (lv_treshold_3_0= ruleEInt ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1368:1: (lv_treshold_3_0= ruleEInt )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1368:1: (lv_treshold_3_0= ruleEInt )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1369:3: lv_treshold_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTime3023);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1385:2: ( (lv_unit_4_0= ruleTimeUnit ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1386:1: (lv_unit_4_0= ruleTimeUnit )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1386:1: (lv_unit_4_0= ruleTimeUnit )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1387:3: lv_unit_4_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_ruleOnTime3044);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1411:1: entryRuleOnSize returns [EObject current=null] : iv_ruleOnSize= ruleOnSize EOF ;
    public final EObject entryRuleOnSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSize = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1412:2: (iv_ruleOnSize= ruleOnSize EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1413:2: iv_ruleOnSize= ruleOnSize EOF
            {
             newCompositeNode(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize3080);
            iv_ruleOnSize=ruleOnSize();

            state._fsp--;

             current =iv_ruleOnSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize3090); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1420:1: ruleOnSize returns [EObject current=null] : (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) ) ;
    public final EObject ruleOnSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inverse_1_0=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_treshold_3_0 = null;

        Enumerator lv_unit_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1423:28: ( (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1424:1: (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1424:1: (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1424:3: otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) )
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOnSize3127); 

                	newLeafNode(otherlv_0, grammarAccess.getOnSizeAccess().getSizeOfFileKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1428:1: ( (lv_inverse_1_0= 'not' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1429:1: (lv_inverse_1_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1429:1: (lv_inverse_1_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1430:3: lv_inverse_1_0= 'not'
                    {
                    lv_inverse_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnSize3145); 

                            newLeafNode(lv_inverse_1_0, grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnSizeRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1443:3: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1444:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1444:1: (lv_operator_2_0= ruleOperator )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1445:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnSize3180);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1461:2: ( (lv_treshold_3_0= ruleEInt ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1462:1: (lv_treshold_3_0= ruleEInt )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1462:1: (lv_treshold_3_0= ruleEInt )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1463:3: lv_treshold_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnSize3201);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1479:2: ( (lv_unit_4_0= ruleMemoryUnit ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1480:1: (lv_unit_4_0= ruleMemoryUnit )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1480:1: (lv_unit_4_0= ruleMemoryUnit )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1481:3: lv_unit_4_0= ruleMemoryUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_ruleOnSize3222);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1505:1: entryRuleOnName returns [EObject current=null] : iv_ruleOnName= ruleOnName EOF ;
    public final EObject entryRuleOnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnName = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1506:2: (iv_ruleOnName= ruleOnName EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1507:2: iv_ruleOnName= ruleOnName EOF
            {
             newCompositeNode(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName3258);
            iv_ruleOnName=ruleOnName();

            state._fsp--;

             current =iv_ruleOnName; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName3268); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1514:1: ruleOnName returns [EObject current=null] : ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleOnName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1517:28: ( ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1518:1: ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1518:1: ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1518:2: () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1518:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1519:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnNameAccess().getOnNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOnName3314); 

                	newLeafNode(otherlv_1, grammarAccess.getOnNameAccess().getNameIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1528:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1529:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1529:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1530:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnName3332); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnNameRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1543:3: ( (lv_name_3_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1544:1: (lv_name_3_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1544:1: (lv_name_3_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1545:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnName3367);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1569:1: entryRuleOnExtension returns [EObject current=null] : iv_ruleOnExtension= ruleOnExtension EOF ;
    public final EObject entryRuleOnExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnExtension = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1570:2: (iv_ruleOnExtension= ruleOnExtension EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1571:2: iv_ruleOnExtension= ruleOnExtension EOF
            {
             newCompositeNode(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension3403);
            iv_ruleOnExtension=ruleOnExtension();

            state._fsp--;

             current =iv_ruleOnExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension3413); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1578:1: ruleOnExtension returns [EObject current=null] : ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1581:28: ( ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1582:1: ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1582:1: ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1582:2: () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1582:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1583:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnExtensionAccess().getOnExtensionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOnExtension3459); 

                	newLeafNode(otherlv_1, grammarAccess.getOnExtensionAccess().getExtensionIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1592:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1593:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1593:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1594:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnExtension3477); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnExtensionRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOnExtension3503); 

                	newLeafNode(otherlv_3, grammarAccess.getOnExtensionAccess().getInKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1611:1: ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1611:2: ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1611:2: ( (lv_extensions_4_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1612:1: (lv_extensions_4_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1612:1: (lv_extensions_4_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1613:3: lv_extensions_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3525);
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

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1629:2: (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==20) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1629:4: otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOnExtension3538); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getOnExtensionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1633:1: ( (lv_extensions_6_0= ruleEString ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1634:1: (lv_extensions_6_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1634:1: (lv_extensions_6_0= ruleEString )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1635:3: lv_extensions_6_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3559);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnExtension3575); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1663:1: entryRuleIsEmpty returns [EObject current=null] : iv_ruleIsEmpty= ruleIsEmpty EOF ;
    public final EObject entryRuleIsEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEmpty = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1664:2: (iv_ruleIsEmpty= ruleIsEmpty EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1665:2: iv_ruleIsEmpty= ruleIsEmpty EOF
            {
             newCompositeNode(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3611);
            iv_ruleIsEmpty=ruleIsEmpty();

            state._fsp--;

             current =iv_ruleIsEmpty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty3621); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1672:1: ruleIsEmpty returns [EObject current=null] : ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' ) ;
    public final EObject ruleIsEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1675:28: ( ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1676:1: ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1676:1: ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1676:2: () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1676:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1677:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEmptyAccess().getIsEmptyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleIsEmpty3667); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEmptyAccess().getIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1686:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1687:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1687:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1688:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleIsEmpty3685); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIsEmptyRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleIsEmpty3711); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1713:1: entryRuleOnType returns [EObject current=null] : iv_ruleOnType= ruleOnType EOF ;
    public final EObject entryRuleOnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnType = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1714:2: (iv_ruleOnType= ruleOnType EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1715:2: iv_ruleOnType= ruleOnType EOF
            {
             newCompositeNode(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType3747);
            iv_ruleOnType=ruleOnType();

            state._fsp--;

             current =iv_ruleOnType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType3757); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1722:1: ruleOnType returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) ) ;
    public final EObject ruleOnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1725:28: ( (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1726:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1726:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1726:3: otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) )
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnType3794); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTypeAccess().getFileKeyword_0());
                
            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnType3806); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTypeAccess().getIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1734:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1735:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1735:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1736:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOnType3824); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTypeRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1749:3: ( (lv_type_3_0= ruleFileType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1750:1: (lv_type_3_0= ruleFileType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1750:1: (lv_type_3_0= ruleFileType )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1751:3: lv_type_3_0= ruleFileType
            {
             
            	        newCompositeNode(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_ruleOnType3859);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1775:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1776:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1777:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3896);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3907); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1784:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1787:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1788:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1788:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1788:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1788:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1789:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEInt3946); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3963); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1811:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1812:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1813:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4011);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4022); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1820:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1823:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1824:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1824:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1824:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4062); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1832:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4088); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1847:1: ruleStrategies returns [Enumerator current=null] : ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) ;
    public final Enumerator ruleStrategies() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1849:28: ( ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1850:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1850:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt29=1;
                }
                break;
            case 45:
                {
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1850:2: (enumLiteral_0= 'forced' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1850:2: (enumLiteral_0= 'forced' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1850:4: enumLiteral_0= 'forced'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleStrategies4147); 

                            current = grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:6: (enumLiteral_1= 'append' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:6: (enumLiteral_1= 'append' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:8: enumLiteral_1= 'append'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleStrategies4164); 

                            current = grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1862:6: (enumLiteral_2= 'carefully' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1862:6: (enumLiteral_2= 'carefully' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1862:8: enumLiteral_2= 'carefully'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleStrategies4181); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1872:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1874:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1875:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1875:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt30=1;
                }
                break;
            case 48:
                {
                alt30=2;
                }
                break;
            case 49:
                {
                alt30=3;
                }
                break;
            case 50:
                {
                alt30=4;
                }
                break;
            case 51:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1875:2: (enumLiteral_0= '==' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1875:2: (enumLiteral_0= '==' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1875:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOperator4226); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:6: (enumLiteral_1= '<' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:6: (enumLiteral_1= '<' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOperator4243); 

                            current = grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1887:6: (enumLiteral_2= '>' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1887:6: (enumLiteral_2= '>' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1887:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOperator4260); 

                            current = grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1893:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1893:6: (enumLiteral_3= '<=' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1893:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOperator4277); 

                            current = grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1899:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1899:6: (enumLiteral_4= '>=' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1899:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOperator4294); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1909:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1911:28: ( ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1912:1: ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1912:1: ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt31=1;
                }
                break;
            case 53:
                {
                alt31=2;
                }
                break;
            case 54:
                {
                alt31=3;
                }
                break;
            case 55:
                {
                alt31=4;
                }
                break;
            case 56:
                {
                alt31=5;
                }
                break;
            case 57:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1912:2: (enumLiteral_0= 'mins' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1912:2: (enumLiteral_0= 'mins' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1912:4: enumLiteral_0= 'mins'
                    {
                    enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTimeUnit4339); 

                            current = grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:6: (enumLiteral_1= 'hours' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:6: (enumLiteral_1= 'hours' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:8: enumLiteral_1= 'hours'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTimeUnit4356); 

                            current = grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1924:6: (enumLiteral_2= 'days' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1924:6: (enumLiteral_2= 'days' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1924:8: enumLiteral_2= 'days'
                    {
                    enumLiteral_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTimeUnit4373); 

                            current = grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1930:6: (enumLiteral_3= 'weeks' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1930:6: (enumLiteral_3= 'weeks' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1930:8: enumLiteral_3= 'weeks'
                    {
                    enumLiteral_3=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTimeUnit4390); 

                            current = grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1936:6: (enumLiteral_4= 'months' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1936:6: (enumLiteral_4= 'months' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1936:8: enumLiteral_4= 'months'
                    {
                    enumLiteral_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTimeUnit4407); 

                            current = grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1942:6: (enumLiteral_5= 'years' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1942:6: (enumLiteral_5= 'years' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1942:8: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTimeUnit4424); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1952:1: ruleTimeType returns [Enumerator current=null] : ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) ) ;
    public final Enumerator ruleTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1954:28: ( ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1955:1: ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1955:1: ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            else if ( (LA32_0==59) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1955:2: (enumLiteral_0= 'modified' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1955:2: (enumLiteral_0= 'modified' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1955:4: enumLiteral_0= 'modified'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTimeType4469); 

                            current = grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:6: (enumLiteral_1= 'created' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:6: (enumLiteral_1= 'created' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:8: enumLiteral_1= 'created'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTimeType4486); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1971:1: ruleQuantificators returns [Enumerator current=null] : ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) ) ;
    public final Enumerator ruleQuantificators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1973:28: ( ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1974:1: ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1974:1: ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==60) ) {
                alt33=1;
            }
            else if ( (LA33_0==61) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1974:2: (enumLiteral_0= 'any are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1974:2: (enumLiteral_0= 'any are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1974:4: enumLiteral_0= 'any are'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleQuantificators4531); 

                            current = grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:6: (enumLiteral_1= 'all are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:6: (enumLiteral_1= 'all are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:8: enumLiteral_1= 'all are'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleQuantificators4548); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1990:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) ;
    public final Enumerator ruleMemoryUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1992:28: ( ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1993:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1993:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt34=1;
                }
                break;
            case 63:
                {
                alt34=2;
                }
                break;
            case 64:
                {
                alt34=3;
                }
                break;
            case 65:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1993:2: (enumLiteral_0= 'KB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1993:2: (enumLiteral_0= 'KB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1993:4: enumLiteral_0= 'KB'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleMemoryUnit4593); 

                            current = grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:6: (enumLiteral_1= 'MB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:6: (enumLiteral_1= 'MB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:8: enumLiteral_1= 'MB'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleMemoryUnit4610); 

                            current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2005:6: (enumLiteral_2= 'GB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2005:6: (enumLiteral_2= 'GB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2005:8: enumLiteral_2= 'GB'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleMemoryUnit4627); 

                            current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2011:6: (enumLiteral_3= 'TB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2011:6: (enumLiteral_3= 'TB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2011:8: enumLiteral_3= 'TB'
                    {
                    enumLiteral_3=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMemoryUnit4644); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2021:1: ruleCompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleCompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2023:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2024:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2024:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==66) ) {
                alt35=1;
            }
            else if ( (LA35_0==67) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2024:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2024:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2024:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleCompositionType4689); 

                            current = grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCompositionType4706); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2040:1: ruleFileType returns [Enumerator current=null] : ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) ) ;
    public final Enumerator ruleFileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2042:28: ( ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2043:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2043:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==68) ) {
                alt36=1;
            }
            else if ( (LA36_0==69) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2043:2: (enumLiteral_0= 'Document' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2043:2: (enumLiteral_0= 'Document' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2043:4: enumLiteral_0= 'Document'
                    {
                    enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleFileType4751); 

                            current = grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2049:6: (enumLiteral_1= 'Directory' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2049:6: (enumLiteral_1= 'Directory' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2049:8: enumLiteral_1= 'Directory'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleFileType4768); 

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
        public static final BitSet FOLLOW_11_in_ruleModel153 = new BitSet(new long[]{0x0000000003220060L});
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
        public static final BitSet FOLLOW_12_in_rulePathVariable480 = new BitSet(new long[]{0x000000000322C060L});
        public static final BitSet FOLLOW_rulePath_in_rulePathVariable501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath593 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_rulePath606 = new BitSet(new long[]{0x000000000322C060L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath627 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_ruleGenericStep722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_ruleGenericStep749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_ruleGenericStep776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep811 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConcreteStep866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleVariableStep948 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableStep971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep1007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep1017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParametrizedStep1063 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParametrizedStep1084 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParametrizedStep1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection1132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSelection1179 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelection1200 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSelection1212 = new BitSet(new long[]{0x000000000322C060L});
        public static final BitSet FOLLOW_rulePath_in_ruleSelection1233 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleSelection1246 = new BitSet(new long[]{0x0C0005C194000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection1267 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleSelection1280 = new BitSet(new long[]{0x0C0005C194000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection1301 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy1341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCopy1388 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCopy1400 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCopy1423 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCopy1435 = new BitSet(new long[]{0x000000000322C060L});
        public static final BitSet FOLLOW_rulePath_in_ruleCopy1456 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleCopy1469 = new BitSet(new long[]{0x0000700000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleCopy1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMove1575 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMove1587 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove1610 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMove1622 = new BitSet(new long[]{0x000000000322C060L});
        public static final BitSet FOLLOW_rulePath_in_ruleMove1643 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleMove1656 = new BitSet(new long[]{0x0000700000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleMove1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete1715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleDelete1762 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDelete1774 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelete1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer1843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFilterContainer1880 = new BitSet(new long[]{0x0C0005C194000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_ruleLink_in_ruleFilterContainer1901 = new BitSet(new long[]{0x0C0005C19C000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_ruleLink_in_ruleFilterContainer1922 = new BitSet(new long[]{0x0C0005C19C000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_27_in_ruleFilterContainer1935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositionType_in_ruleLink2027 = new BitSet(new long[]{0x0C0005C194000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleLink2049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent2085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent2095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_ruleFilterComponent2142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_ruleFilterComponent2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_ruleFilterComponent2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_ruleFilterComponent2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_ruleFilterComponent2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_ruleFilterComponent2277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_ruleFilterComponent2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_ruleFilterComponent2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_ruleFilterComponent2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes2393 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes2403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleOnAttributes2440 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes2461 = new BitSet(new long[]{0x00000000E0000000L});
        public static final BitSet FOLLOW_29_in_ruleOnAttributes2481 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleOnAttributes2507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOnAttributes2527 = new BitSet(new long[]{0x0000000023220060L});
        public static final BitSet FOLLOW_29_in_ruleOnAttributes2545 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags2618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags2628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleOnTags2665 = new BitSet(new long[]{0x0000000203220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags2687 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_20_in_ruleOnTags2700 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags2721 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleOnTags2737 = new BitSet(new long[]{0x3000080000000010L});
        public static final BitSet FOLLOW_ruleQuantificators_in_ruleOnTags2759 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTags2787 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleOnTags2799 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_29_in_ruleOnTags2819 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleOnTags2845 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleOnTags2863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime2913 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime2923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeType_in_ruleOnTime2969 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleOnTime2981 = new BitSet(new long[]{0x000F800000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnTime3002 = new BitSet(new long[]{0x3000080000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTime3023 = new BitSet(new long[]{0x03F0000000000000L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_ruleOnTime3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize3080 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize3090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOnSize3127 = new BitSet(new long[]{0x000F800020000000L});
        public static final BitSet FOLLOW_29_in_ruleOnSize3145 = new BitSet(new long[]{0x000F800000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnSize3180 = new BitSet(new long[]{0x3000080000000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnSize3201 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_ruleOnSize3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName3258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName3268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleOnName3314 = new BitSet(new long[]{0x0000000023220060L});
        public static final BitSet FOLLOW_29_in_ruleOnName3332 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnName3367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension3403 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension3413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleOnExtension3459 = new BitSet(new long[]{0x0000000120000000L});
        public static final BitSet FOLLOW_29_in_ruleOnExtension3477 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOnExtension3503 = new BitSet(new long[]{0x0000000203220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3525 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_20_in_ruleOnExtension3538 = new BitSet(new long[]{0x0000000003220060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3559 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleOnExtension3575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleIsEmpty3667 = new BitSet(new long[]{0x0000020020000000L});
        public static final BitSet FOLLOW_29_in_ruleIsEmpty3685 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleIsEmpty3711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType3747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType3757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleOnType3794 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleOnType3806 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000030L});
        public static final BitSet FOLLOW_29_in_ruleOnType3824 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000030L});
        public static final BitSet FOLLOW_ruleFileType_in_ruleOnType3859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEInt3946 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleStrategies4147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleStrategies4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleStrategies4181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleOperator4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleOperator4243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleOperator4260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleOperator4277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOperator4294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTimeUnit4339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTimeUnit4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTimeUnit4373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTimeUnit4390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTimeUnit4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTimeUnit4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTimeType4469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTimeType4486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleQuantificators4531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleQuantificators4548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleMemoryUnit4593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleMemoryUnit4610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleMemoryUnit4627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleMemoryUnit4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCompositionType4689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleCompositionType4706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleFileType4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleFileType4768 = new BitSet(new long[]{0x0000000000000002L});
    }


}