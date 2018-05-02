package org.xtext.example.miniFetl.parser.antlr.internal; 

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
import org.xtext.example.miniFetl.services.FetlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFetlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'copy'", "'from'", "'to'", "'strategy:'", "'move'", "'delete'", "'='", "'view'", "'as'", "'[absolute:'", "']'", "'+'", "'true'", "'false'", "'path'", "'{$'", "'}'", "'select'", "'where'", "','", "'name'", "'keep'", "'extension'", "'in ['", "'time'", "'of'", "'attribute'", "'is'", "'['", "'in tags'", "'exclusively'", "'size'", "'{'", "'('", "')'", "'empty'", "'file'", "'-'", "'forced'", "'append'", "'carefully'", "'=='", "'<'", "'>'", "'<='", "'>='", "'min'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'modification'", "'cretion'", "'KB'", "'MB'", "'GB'", "'TB'", "'all of'", "'any of'", "'none'", "'Document'", "'Folder'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
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


        public InternalFetlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFetlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFetlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g"; }



     	private FetlGrammarAccess grammarAccess;
     	
        public InternalFetlParser(TokenStream input, FetlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FetlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:77:1: ruleModel returns [EObject current=null] : ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_executions_1_0 = null;

        EObject lv_executions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:80:28: ( ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:1: ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:1: ( () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )* )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:2: () ( (lv_executions_1_0= ruleExecution ) ) (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )*
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:87:2: ( (lv_executions_1_0= ruleExecution ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:88:1: (lv_executions_1_0= ruleExecution )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:88:1: (lv_executions_1_0= ruleExecution )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:89:3: lv_executions_1_0= ruleExecution
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:105:2: (otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:105:4: otherlv_2= ';' ( (lv_executions_3_0= ruleExecution ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel153); 

            	        	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2_0());
            	        
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:109:1: ( (lv_executions_3_0= ruleExecution ) )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:110:1: (lv_executions_3_0= ruleExecution )
            	    {
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:110:1: (lv_executions_3_0= ruleExecution )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:111:3: lv_executions_3_0= ruleExecution
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:135:1: entryRuleExecution returns [EObject current=null] : iv_ruleExecution= ruleExecution EOF ;
    public final EObject entryRuleExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecution = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:136:2: (iv_ruleExecution= ruleExecution EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:137:2: iv_ruleExecution= ruleExecution EOF
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:144:1: ruleExecution returns [EObject current=null] : (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable ) ;
    public final EObject ruleExecution() throws RecognitionException {
        EObject current = null;

        EObject this_Copy_0 = null;

        EObject this_Move_1 = null;

        EObject this_Delete_2 = null;

        EObject this_PathVariable_3 = null;

        EObject this_SelectionVariable_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:147:28: ( (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:148:1: (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:148:1: (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=4;
                }
                break;
            case 19:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:149:5: this_Copy_0= ruleCopy
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getCopyParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCopy_in_ruleExecution269);
                    this_Copy_0=ruleCopy();

                    state._fsp--;

                     
                            current = this_Copy_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:159:5: this_Move_1= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getMoveParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleExecution296);
                    this_Move_1=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:169:5: this_Delete_2= ruleDelete
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDelete_in_ruleExecution323);
                    this_Delete_2=ruleDelete();

                    state._fsp--;

                     
                            current = this_Delete_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:179:5: this_PathVariable_3= rulePathVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_ruleExecution350);
                    this_PathVariable_3=rulePathVariable();

                    state._fsp--;

                     
                            current = this_PathVariable_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:189:5: this_SelectionVariable_4= ruleSelectionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getSelectionVariableParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_ruleExecution377);
                    this_SelectionVariable_4=ruleSelectionVariable();

                    state._fsp--;

                     
                            current = this_SelectionVariable_4; 
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


    // $ANTLR start "entryRuleGenericStep"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:205:1: entryRuleGenericStep returns [EObject current=null] : iv_ruleGenericStep= ruleGenericStep EOF ;
    public final EObject entryRuleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:206:2: (iv_ruleGenericStep= ruleGenericStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:207:2: iv_ruleGenericStep= ruleGenericStep EOF
            {
             newCompositeNode(grammarAccess.getGenericStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_entryRuleGenericStep412);
            iv_ruleGenericStep=ruleGenericStep();

            state._fsp--;

             current =iv_ruleGenericStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericStep422); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:214:1: ruleGenericStep returns [EObject current=null] : (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) ;
    public final EObject ruleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteStep_0 = null;

        EObject this_VariableStep_1 = null;

        EObject this_ParametrizedStep_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:217:28: ( (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:218:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:218:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:219:5: this_ConcreteStep_0= ruleConcreteStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_ruleGenericStep469);
                    this_ConcreteStep_0=ruleConcreteStep();

                    state._fsp--;

                     
                            current = this_ConcreteStep_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:229:5: this_VariableStep_1= ruleVariableStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_ruleGenericStep496);
                    this_VariableStep_1=ruleVariableStep();

                    state._fsp--;

                     
                            current = this_VariableStep_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:239:5: this_ParametrizedStep_2= ruleParametrizedStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_ruleGenericStep523);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:255:1: entryRuleFilterComponent returns [EObject current=null] : iv_ruleFilterComponent= ruleFilterComponent EOF ;
    public final EObject entryRuleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterComponent = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:256:2: (iv_ruleFilterComponent= ruleFilterComponent EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:257:2: iv_ruleFilterComponent= ruleFilterComponent EOF
            {
             newCompositeNode(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent558);
            iv_ruleFilterComponent=ruleFilterComponent();

            state._fsp--;

             current =iv_ruleFilterComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent568); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:264:1: ruleFilterComponent returns [EObject current=null] : (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:267:28: ( (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:268:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:268:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 34:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            case 38:
                {
                alt4=4;
                }
                break;
            case 40:
                {
                alt4=5;
                }
                break;
            case 43:
                {
                alt4=6;
                }
                break;
            case 44:
                {
                alt4=7;
                }
                break;
            case 47:
                {
                alt4=8;
                }
                break;
            case 48:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:269:5: this_OnName_0= ruleOnName
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_ruleFilterComponent615);
                    this_OnName_0=ruleOnName();

                    state._fsp--;

                     
                            current = this_OnName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:279:5: this_OnExtension_1= ruleOnExtension
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_ruleFilterComponent642);
                    this_OnExtension_1=ruleOnExtension();

                    state._fsp--;

                     
                            current = this_OnExtension_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:289:5: this_OnTime_2= ruleOnTime
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_ruleFilterComponent669);
                    this_OnTime_2=ruleOnTime();

                    state._fsp--;

                     
                            current = this_OnTime_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:299:5: this_OnAttributes_3= ruleOnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_ruleFilterComponent696);
                    this_OnAttributes_3=ruleOnAttributes();

                    state._fsp--;

                     
                            current = this_OnAttributes_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:309:5: this_OnTags_4= ruleOnTags
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_ruleFilterComponent723);
                    this_OnTags_4=ruleOnTags();

                    state._fsp--;

                     
                            current = this_OnTags_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:319:5: this_OnSize_5= ruleOnSize
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_ruleFilterComponent750);
                    this_OnSize_5=ruleOnSize();

                    state._fsp--;

                     
                            current = this_OnSize_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:329:5: this_FilterContainer_6= ruleFilterContainer
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_ruleFilterComponent777);
                    this_FilterContainer_6=ruleFilterContainer();

                    state._fsp--;

                     
                            current = this_FilterContainer_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:339:5: this_IsEmpty_7= ruleIsEmpty
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_ruleFilterComponent804);
                    this_IsEmpty_7=ruleIsEmpty();

                    state._fsp--;

                     
                            current = this_IsEmpty_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:349:5: this_OnType_8= ruleOnType
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_ruleFilterComponent831);
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


    // $ANTLR start "entryRuleCopy"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:365:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:366:2: (iv_ruleCopy= ruleCopy EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:367:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy866);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy876); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:374:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:377:28: ( (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:378:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:378:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:378:3: otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCopy913); 

                	newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCopy925); 

                	newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getFromKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:386:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:387:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:387:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:388:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getSourceSelectionVariableCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCopy948);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCopy960); 

                	newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getToKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:405:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:406:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:406:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:407:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleCopy981);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:423:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:423:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCopy994); 

                        	newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:427:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:428:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:428:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:429:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleCopy1015);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:453:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:454:2: (iv_ruleMove= ruleMove EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:455:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove1053);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove1063); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:462:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:465:28: ( (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:466:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:466:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:466:3: otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMove1100); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMove1112); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getFromKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:474:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:475:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:475:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:476:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSourceSelectionVariableCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove1135);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMove1147); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getToKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:493:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:494:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:494:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:495:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleMove1168);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:511:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:511:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMove1181); 

                        	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:515:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:516:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:516:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:517:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleMove1202);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:541:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:542:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:543:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete1240);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete1250); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:550:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:553:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:554:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:554:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:554:3: otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDelete1287); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDelete1299); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getFromKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:562:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:563:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:563:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:564:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeleteAccess().getSourceSelectionVariableCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelete1322);
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


    // $ANTLR start "entryRulePathVariable"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:585:1: entryRulePathVariable returns [EObject current=null] : iv_rulePathVariable= rulePathVariable EOF ;
    public final EObject entryRulePathVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathVariable = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:586:2: (iv_rulePathVariable= rulePathVariable EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:587:2: iv_rulePathVariable= rulePathVariable EOF
            {
             newCompositeNode(grammarAccess.getPathVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_entryRulePathVariable1358);
            iv_rulePathVariable=rulePathVariable();

            state._fsp--;

             current =iv_rulePathVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathVariable1368); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:594:1: rulePathVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) ) ;
    public final EObject rulePathVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:597:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:598:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:598:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:598:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= rulePath ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:598:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:599:1: (lv_name_0_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:599:1: (lv_name_0_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:600:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePathVariable1414);
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

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePathVariable1426); 

                	newLeafNode(otherlv_1, grammarAccess.getPathVariableAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:620:1: ( (lv_value_2_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:621:1: (lv_value_2_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:621:1: (lv_value_2_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:622:3: lv_value_2_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rulePathVariable1447);
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


    // $ANTLR start "entryRuleSelectionVariable"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:646:1: entryRuleSelectionVariable returns [EObject current=null] : iv_ruleSelectionVariable= ruleSelectionVariable EOF ;
    public final EObject entryRuleSelectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionVariable = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:647:2: (iv_ruleSelectionVariable= ruleSelectionVariable EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:648:2: iv_ruleSelectionVariable= ruleSelectionVariable EOF
            {
             newCompositeNode(grammarAccess.getSelectionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable1483);
            iv_ruleSelectionVariable=ruleSelectionVariable();

            state._fsp--;

             current =iv_ruleSelectionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionVariable1493); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:655:1: ruleSelectionVariable returns [EObject current=null] : (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_value_3_0= ruleSelection ) ) ) ;
    public final EObject ruleSelectionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:658:28: ( (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_value_3_0= ruleSelection ) ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:659:1: (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_value_3_0= ruleSelection ) ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:659:1: (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_value_3_0= ruleSelection ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:659:3: otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'as' ( (lv_value_3_0= ruleSelection ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSelectionVariable1530); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionVariableAccess().getViewKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:663:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:664:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:664:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:665:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSelectionVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectionVariable1551);
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSelectionVariable1563); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionVariableAccess().getAsKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:685:1: ( (lv_value_3_0= ruleSelection ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:686:1: (lv_value_3_0= ruleSelection )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:686:1: (lv_value_3_0= ruleSelection )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:687:3: lv_value_3_0= ruleSelection
            {
             
            	        newCompositeNode(grammarAccess.getSelectionVariableAccess().getValueSelectionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_ruleSelectionVariable1584);
            lv_value_3_0=ruleSelection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionVariableRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Selection");
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
    // $ANTLR end "ruleSelectionVariable"


    // $ANTLR start "entryRulePath"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:711:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:712:2: (iv_rulePath= rulePath EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:713:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_entryRulePath1620);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePath1630); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:720:1: rulePath returns [EObject current=null] : ( (otherlv_0= '[absolute:' ( (lv_absolute_1_0= ruleEBoolean ) ) otherlv_2= ']' )? ( (lv_steps_3_0= ruleGenericStep ) ) (otherlv_4= '+' ( (lv_steps_5_0= ruleGenericStep ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_absolute_1_0 = null;

        EObject lv_steps_3_0 = null;

        EObject lv_steps_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:723:28: ( ( (otherlv_0= '[absolute:' ( (lv_absolute_1_0= ruleEBoolean ) ) otherlv_2= ']' )? ( (lv_steps_3_0= ruleGenericStep ) ) (otherlv_4= '+' ( (lv_steps_5_0= ruleGenericStep ) ) )* ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:724:1: ( (otherlv_0= '[absolute:' ( (lv_absolute_1_0= ruleEBoolean ) ) otherlv_2= ']' )? ( (lv_steps_3_0= ruleGenericStep ) ) (otherlv_4= '+' ( (lv_steps_5_0= ruleGenericStep ) ) )* )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:724:1: ( (otherlv_0= '[absolute:' ( (lv_absolute_1_0= ruleEBoolean ) ) otherlv_2= ']' )? ( (lv_steps_3_0= ruleGenericStep ) ) (otherlv_4= '+' ( (lv_steps_5_0= ruleGenericStep ) ) )* )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:724:2: (otherlv_0= '[absolute:' ( (lv_absolute_1_0= ruleEBoolean ) ) otherlv_2= ']' )? ( (lv_steps_3_0= ruleGenericStep ) ) (otherlv_4= '+' ( (lv_steps_5_0= ruleGenericStep ) ) )*
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:724:2: (otherlv_0= '[absolute:' ( (lv_absolute_1_0= ruleEBoolean ) ) otherlv_2= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:724:4: otherlv_0= '[absolute:' ( (lv_absolute_1_0= ruleEBoolean ) ) otherlv_2= ']'
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePath1668); 

                        	newLeafNode(otherlv_0, grammarAccess.getPathAccess().getAbsoluteKeyword_0_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:728:1: ( (lv_absolute_1_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:729:1: (lv_absolute_1_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:729:1: (lv_absolute_1_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:730:3: lv_absolute_1_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathAccess().getAbsoluteEBooleanParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rulePath1689);
                    lv_absolute_1_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathRule());
                    	        }
                           		set(
                           			current, 
                           			"absolute",
                            		lv_absolute_1_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePath1701); 

                        	newLeafNode(otherlv_2, grammarAccess.getPathAccess().getRightSquareBracketKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:750:3: ( (lv_steps_3_0= ruleGenericStep ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:751:1: (lv_steps_3_0= ruleGenericStep )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:751:1: (lv_steps_3_0= ruleGenericStep )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:752:3: lv_steps_3_0= ruleGenericStep
            {
             
            	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath1724);
            lv_steps_3_0=ruleGenericStep();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathRule());
            	        }
                   		add(
                   			current, 
                   			"steps",
                    		lv_steps_3_0, 
                    		"GenericStep");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:768:2: (otherlv_4= '+' ( (lv_steps_5_0= ruleGenericStep ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:768:4: otherlv_4= '+' ( (lv_steps_5_0= ruleGenericStep ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePath1737); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getPlusSignKeyword_2_0());
            	        
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:772:1: ( (lv_steps_5_0= ruleGenericStep ) )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:773:1: (lv_steps_5_0= ruleGenericStep )
            	    {
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:773:1: (lv_steps_5_0= ruleGenericStep )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:774:3: lv_steps_5_0= ruleGenericStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath1758);
            	    lv_steps_5_0=ruleGenericStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_5_0, 
            	            		"GenericStep");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:798:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:799:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:800:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1797);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1808); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:807:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:810:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:811:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:811:1: (kw= 'true' | kw= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:812:2: kw= 'true'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEBoolean1846); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:819:2: kw= 'false'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEBoolean1865); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:832:1: entryRuleConcreteStep returns [EObject current=null] : iv_ruleConcreteStep= ruleConcreteStep EOF ;
    public final EObject entryRuleConcreteStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:833:2: (iv_ruleConcreteStep= ruleConcreteStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:834:2: iv_ruleConcreteStep= ruleConcreteStep EOF
            {
             newCompositeNode(grammarAccess.getConcreteStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep1905);
            iv_ruleConcreteStep=ruleConcreteStep();

            state._fsp--;

             current =iv_ruleConcreteStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteStep1915); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:841:1: ruleConcreteStep returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleConcreteStep() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:844:28: ( ( (lv_value_0_0= ruleEString ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:845:1: ( (lv_value_0_0= ruleEString ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:845:1: ( (lv_value_0_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:846:1: (lv_value_0_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:846:1: (lv_value_0_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:847:3: lv_value_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConcreteStep1960);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:871:1: entryRuleVariableStep returns [EObject current=null] : iv_ruleVariableStep= ruleVariableStep EOF ;
    public final EObject entryRuleVariableStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:872:2: (iv_ruleVariableStep= ruleVariableStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:873:2: iv_ruleVariableStep= ruleVariableStep EOF
            {
             newCompositeNode(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep1995);
            iv_ruleVariableStep=ruleVariableStep();

            state._fsp--;

             current =iv_ruleVariableStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep2005); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:880:1: ruleVariableStep returns [EObject current=null] : (otherlv_0= 'path' ( ( ruleEString ) ) ) ;
    public final EObject ruleVariableStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:883:28: ( (otherlv_0= 'path' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:884:1: (otherlv_0= 'path' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:884:1: (otherlv_0= 'path' ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:884:3: otherlv_0= 'path' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleVariableStep2042); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableStepAccess().getPathKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:888:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:889:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:889:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:890:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableStepRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableStep2065);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:911:1: entryRuleParametrizedStep returns [EObject current=null] : iv_ruleParametrizedStep= ruleParametrizedStep EOF ;
    public final EObject entryRuleParametrizedStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametrizedStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:912:2: (iv_ruleParametrizedStep= ruleParametrizedStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:913:2: iv_ruleParametrizedStep= ruleParametrizedStep EOF
            {
             newCompositeNode(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep2101);
            iv_ruleParametrizedStep=ruleParametrizedStep();

            state._fsp--;

             current =iv_ruleParametrizedStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep2111); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:920:1: ruleParametrizedStep returns [EObject current=null] : ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) ;
    public final EObject ruleParametrizedStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:923:28: ( ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:924:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:924:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:924:2: () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}'
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:924:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:925:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleParametrizedStep2157); 

                	newLeafNode(otherlv_1, grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:934:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:935:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:935:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:936:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParametrizedStep2178);
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

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParametrizedStep2190); 

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:964:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:965:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:966:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2227);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2238); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:973:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:976:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:977:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:977:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:977:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2278); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:985:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2304); 

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


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1000:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1001:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1002:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection2349);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection2359); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1009:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= 'from' ( (lv_from_2_0= rulePath ) ) (otherlv_3= 'where' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* )? ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_from_2_0 = null;

        EObject lv_where_4_0 = null;

        EObject lv_where_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1012:28: ( (otherlv_0= 'select' otherlv_1= 'from' ( (lv_from_2_0= rulePath ) ) (otherlv_3= 'where' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1013:1: (otherlv_0= 'select' otherlv_1= 'from' ( (lv_from_2_0= rulePath ) ) (otherlv_3= 'where' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1013:1: (otherlv_0= 'select' otherlv_1= 'from' ( (lv_from_2_0= rulePath ) ) (otherlv_3= 'where' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1013:3: otherlv_0= 'select' otherlv_1= 'from' ( (lv_from_2_0= rulePath ) ) (otherlv_3= 'where' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* )?
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSelection2396); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSelection2408); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectionAccess().getFromKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1021:1: ( (lv_from_2_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1022:1: (lv_from_2_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1022:1: (lv_from_2_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1023:3: lv_from_2_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleSelection2429);
            lv_from_2_0=rulePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_2_0, 
                    		"Path");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1039:2: (otherlv_3= 'where' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1039:4: otherlv_3= 'where' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )*
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSelection2442); 

                        	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getWhereKeyword_3_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1043:1: ( (lv_where_4_0= ruleFilterComponent ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1044:1: (lv_where_4_0= ruleFilterComponent )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1044:1: (lv_where_4_0= ruleFilterComponent )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1045:3: lv_where_4_0= ruleFilterComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection2463);
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

                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1061:2: (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==31) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1061:4: otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSelection2476); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1065:1: ( (lv_where_6_0= ruleFilterComponent ) )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1066:1: (lv_where_6_0= ruleFilterComponent )
                    	    {
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1066:1: (lv_where_6_0= ruleFilterComponent )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1067:3: lv_where_6_0= ruleFilterComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection2497);
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
                    	    break loop11;
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


    // $ANTLR start "entryRuleOnName"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1091:1: entryRuleOnName returns [EObject current=null] : iv_ruleOnName= ruleOnName EOF ;
    public final EObject entryRuleOnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnName = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1092:2: (iv_ruleOnName= ruleOnName EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1093:2: iv_ruleOnName= ruleOnName EOF
            {
             newCompositeNode(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName2537);
            iv_ruleOnName=ruleOnName();

            state._fsp--;

             current =iv_ruleOnName; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName2547); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1100:1: ruleOnName returns [EObject current=null] : ( () otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleOnName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1103:28: ( ( () otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1104:1: ( () otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1104:1: ( () otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1104:2: () otherlv_1= 'name' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1104:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1105:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnNameAccess().getOnNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOnName2593); 

                	newLeafNode(otherlv_1, grammarAccess.getOnNameAccess().getNameKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOnName2605); 

                	newLeafNode(otherlv_2, grammarAccess.getOnNameAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1118:1: ( (lv_name_3_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1119:1: (lv_name_3_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1119:1: (lv_name_3_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1120:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnName2626);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1136:2: (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1136:4: otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnName2639); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnNameAccess().getKeepKeyword_4_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1140:1: ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1141:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1141:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1142:3: lv_trueFalseSearch_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnNameAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnName2660);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1166:1: entryRuleOnExtension returns [EObject current=null] : iv_ruleOnExtension= ruleOnExtension EOF ;
    public final EObject entryRuleOnExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnExtension = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1167:2: (iv_ruleOnExtension= ruleOnExtension EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1168:2: iv_ruleOnExtension= ruleOnExtension EOF
            {
             newCompositeNode(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension2698);
            iv_ruleOnExtension=ruleOnExtension();

            state._fsp--;

             current =iv_ruleOnExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension2708); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1175:1: ruleOnExtension returns [EObject current=null] : ( () otherlv_1= 'extension' otherlv_2= 'in [' ( ( (lv_extensions_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )* )? otherlv_6= ']' (otherlv_7= 'keep' ( (lv_trueFalseSearch_8_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleOnExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_extensions_3_0 = null;

        AntlrDatatypeRuleToken lv_extensions_5_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1178:28: ( ( () otherlv_1= 'extension' otherlv_2= 'in [' ( ( (lv_extensions_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )* )? otherlv_6= ']' (otherlv_7= 'keep' ( (lv_trueFalseSearch_8_0= ruleEBoolean ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1179:1: ( () otherlv_1= 'extension' otherlv_2= 'in [' ( ( (lv_extensions_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )* )? otherlv_6= ']' (otherlv_7= 'keep' ( (lv_trueFalseSearch_8_0= ruleEBoolean ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1179:1: ( () otherlv_1= 'extension' otherlv_2= 'in [' ( ( (lv_extensions_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )* )? otherlv_6= ']' (otherlv_7= 'keep' ( (lv_trueFalseSearch_8_0= ruleEBoolean ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1179:2: () otherlv_1= 'extension' otherlv_2= 'in [' ( ( (lv_extensions_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )* )? otherlv_6= ']' (otherlv_7= 'keep' ( (lv_trueFalseSearch_8_0= ruleEBoolean ) ) )?
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1179:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1180:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnExtensionAccess().getOnExtensionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOnExtension2754); 

                	newLeafNode(otherlv_1, grammarAccess.getOnExtensionAccess().getExtensionKeyword_1());
                
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOnExtension2766); 

                	newLeafNode(otherlv_2, grammarAccess.getOnExtensionAccess().getInKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1193:1: ( ( (lv_extensions_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1193:2: ( (lv_extensions_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1193:2: ( (lv_extensions_3_0= ruleEString ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1194:1: (lv_extensions_3_0= ruleEString )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1194:1: (lv_extensions_3_0= ruleEString )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1195:3: lv_extensions_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension2788);
                    lv_extensions_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	        }
                           		add(
                           			current, 
                           			"extensions",
                            		lv_extensions_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1211:2: (otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==31) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1211:4: otherlv_4= ',' ( (lv_extensions_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnExtension2801); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOnExtensionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1215:1: ( (lv_extensions_5_0= ruleEString ) )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1216:1: (lv_extensions_5_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1216:1: (lv_extensions_5_0= ruleEString )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1217:3: lv_extensions_5_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension2822);
                    	    lv_extensions_5_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extensions",
                    	            		lv_extensions_5_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOnExtension2838); 

                	newLeafNode(otherlv_6, grammarAccess.getOnExtensionAccess().getRightSquareBracketKeyword_4());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1237:1: (otherlv_7= 'keep' ( (lv_trueFalseSearch_8_0= ruleEBoolean ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1237:3: otherlv_7= 'keep' ( (lv_trueFalseSearch_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnExtension2851); 

                        	newLeafNode(otherlv_7, grammarAccess.getOnExtensionAccess().getKeepKeyword_5_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1241:1: ( (lv_trueFalseSearch_8_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1242:1: (lv_trueFalseSearch_8_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1242:1: (lv_trueFalseSearch_8_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1243:3: lv_trueFalseSearch_8_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getTrueFalseSearchEBooleanParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnExtension2872);
                    lv_trueFalseSearch_8_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnExtensionRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_8_0, 
                            		"EBoolean");
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
    // $ANTLR end "ruleOnExtension"


    // $ANTLR start "entryRuleOnTime"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1267:1: entryRuleOnTime returns [EObject current=null] : iv_ruleOnTime= ruleOnTime EOF ;
    public final EObject entryRuleOnTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTime = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1268:2: (iv_ruleOnTime= ruleOnTime EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1269:2: iv_ruleOnTime= ruleOnTime EOF
            {
             newCompositeNode(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime2910);
            iv_ruleOnTime=ruleOnTime();

            state._fsp--;

             current =iv_ruleOnTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime2920); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1276:1: ruleOnTime returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= 'of' ( (lv_timeOf_2_0= ruleTimeType ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_treshold_4_0= ruleEInt ) ) ( (lv_unit_5_0= ruleTimeUnit ) ) (otherlv_6= 'keep' ( (lv_trueFalseSearch_7_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleOnTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        Enumerator lv_timeOf_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_treshold_4_0 = null;

        Enumerator lv_unit_5_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1279:28: ( (otherlv_0= 'time' otherlv_1= 'of' ( (lv_timeOf_2_0= ruleTimeType ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_treshold_4_0= ruleEInt ) ) ( (lv_unit_5_0= ruleTimeUnit ) ) (otherlv_6= 'keep' ( (lv_trueFalseSearch_7_0= ruleEBoolean ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1280:1: (otherlv_0= 'time' otherlv_1= 'of' ( (lv_timeOf_2_0= ruleTimeType ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_treshold_4_0= ruleEInt ) ) ( (lv_unit_5_0= ruleTimeUnit ) ) (otherlv_6= 'keep' ( (lv_trueFalseSearch_7_0= ruleEBoolean ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1280:1: (otherlv_0= 'time' otherlv_1= 'of' ( (lv_timeOf_2_0= ruleTimeType ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_treshold_4_0= ruleEInt ) ) ( (lv_unit_5_0= ruleTimeUnit ) ) (otherlv_6= 'keep' ( (lv_trueFalseSearch_7_0= ruleEBoolean ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1280:3: otherlv_0= 'time' otherlv_1= 'of' ( (lv_timeOf_2_0= ruleTimeType ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_treshold_4_0= ruleEInt ) ) ( (lv_unit_5_0= ruleTimeUnit ) ) (otherlv_6= 'keep' ( (lv_trueFalseSearch_7_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnTime2957); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTimeAccess().getTimeKeyword_0());
                
            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnTime2969); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTimeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1288:1: ( (lv_timeOf_2_0= ruleTimeType ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1289:1: (lv_timeOf_2_0= ruleTimeType )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1289:1: (lv_timeOf_2_0= ruleTimeType )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1290:3: lv_timeOf_2_0= ruleTimeType
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_ruleOnTime2990);
            lv_timeOf_2_0=ruleTimeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"timeOf",
                    		lv_timeOf_2_0, 
                    		"TimeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1306:2: ( (lv_operator_3_0= ruleOperator ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1307:1: (lv_operator_3_0= ruleOperator )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1307:1: (lv_operator_3_0= ruleOperator )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1308:3: lv_operator_3_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnTime3011);
            lv_operator_3_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1324:2: ( (lv_treshold_4_0= ruleEInt ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1325:1: (lv_treshold_4_0= ruleEInt )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1325:1: (lv_treshold_4_0= ruleEInt )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1326:3: lv_treshold_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTime3032);
            lv_treshold_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1342:2: ( (lv_unit_5_0= ruleTimeUnit ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1343:1: (lv_unit_5_0= ruleTimeUnit )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1343:1: (lv_unit_5_0= ruleTimeUnit )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1344:3: lv_unit_5_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_ruleOnTime3053);
            lv_unit_5_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_5_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1360:2: (otherlv_6= 'keep' ( (lv_trueFalseSearch_7_0= ruleEBoolean ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1360:4: otherlv_6= 'keep' ( (lv_trueFalseSearch_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnTime3066); 

                        	newLeafNode(otherlv_6, grammarAccess.getOnTimeAccess().getKeepKeyword_6_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1364:1: ( (lv_trueFalseSearch_7_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1365:1: (lv_trueFalseSearch_7_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1365:1: (lv_trueFalseSearch_7_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1366:3: lv_trueFalseSearch_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTimeAccess().getTrueFalseSearchEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnTime3087);
                    lv_trueFalseSearch_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTimeRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_7_0, 
                            		"EBoolean");
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
    // $ANTLR end "ruleOnTime"


    // $ANTLR start "entryRuleOnAttributes"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1390:1: entryRuleOnAttributes returns [EObject current=null] : iv_ruleOnAttributes= ruleOnAttributes EOF ;
    public final EObject entryRuleOnAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnAttributes = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1391:2: (iv_ruleOnAttributes= ruleOnAttributes EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1392:2: iv_ruleOnAttributes= ruleOnAttributes EOF
            {
             newCompositeNode(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes3125);
            iv_ruleOnAttributes=ruleOnAttributes();

            state._fsp--;

             current =iv_ruleOnAttributes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes3135); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1399:1: ruleOnAttributes returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is' ( (lv_value_3_0= ruleEString ) ) )? (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleOnAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1402:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is' ( (lv_value_3_0= ruleEString ) ) )? (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1403:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is' ( (lv_value_3_0= ruleEString ) ) )? (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1403:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is' ( (lv_value_3_0= ruleEString ) ) )? (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1403:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'is' ( (lv_value_3_0= ruleEString ) ) )? (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOnAttributes3172); 

                	newLeafNode(otherlv_0, grammarAccess.getOnAttributesAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1407:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1408:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1408:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1409:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes3193);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1425:2: (otherlv_2= 'is' ( (lv_value_3_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1425:4: otherlv_2= 'is' ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOnAttributes3206); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnAttributesAccess().getIsKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1429:1: ( (lv_value_3_0= ruleEString ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1430:1: (lv_value_3_0= ruleEString )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1430:1: (lv_value_3_0= ruleEString )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1431:3: lv_value_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes3227);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnAttributesRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1447:4: (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1447:6: otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnAttributes3242); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnAttributesAccess().getKeepKeyword_3_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1451:1: ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1452:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1452:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1453:3: lv_trueFalseSearch_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnAttributesAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnAttributes3263);
                    lv_trueFalseSearch_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnAttributesRule());
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1477:1: entryRuleOnTags returns [EObject current=null] : iv_ruleOnTags= ruleOnTags EOF ;
    public final EObject entryRuleOnTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTags = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1478:2: (iv_ruleOnTags= ruleOnTags EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1479:2: iv_ruleOnTags= ruleOnTags EOF
            {
             newCompositeNode(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags3301);
            iv_ruleOnTags=ruleOnTags();

            state._fsp--;

             current =iv_ruleOnTags; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags3311); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1486:1: ruleOnTags returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( (lv_treshold_5_0= ruleEInt ) ) otherlv_6= 'in tags' ( (lv_only_7_0= 'exclusively' ) )? (otherlv_8= 'keep' ( (lv_trueFalseSearch_9_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleOnTags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_only_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_tags_1_0 = null;

        AntlrDatatypeRuleToken lv_tags_3_0 = null;

        AntlrDatatypeRuleToken lv_treshold_5_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1489:28: ( (otherlv_0= '[' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( (lv_treshold_5_0= ruleEInt ) ) otherlv_6= 'in tags' ( (lv_only_7_0= 'exclusively' ) )? (otherlv_8= 'keep' ( (lv_trueFalseSearch_9_0= ruleEBoolean ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1490:1: (otherlv_0= '[' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( (lv_treshold_5_0= ruleEInt ) ) otherlv_6= 'in tags' ( (lv_only_7_0= 'exclusively' ) )? (otherlv_8= 'keep' ( (lv_trueFalseSearch_9_0= ruleEBoolean ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1490:1: (otherlv_0= '[' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( (lv_treshold_5_0= ruleEInt ) ) otherlv_6= 'in tags' ( (lv_only_7_0= 'exclusively' ) )? (otherlv_8= 'keep' ( (lv_trueFalseSearch_9_0= ruleEBoolean ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1490:3: otherlv_0= '[' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( (lv_treshold_5_0= ruleEInt ) ) otherlv_6= 'in tags' ( (lv_only_7_0= 'exclusively' ) )? (otherlv_8= 'keep' ( (lv_trueFalseSearch_9_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOnTags3348); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTagsAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1494:1: ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1494:2: ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1494:2: ( (lv_tags_1_0= ruleEString ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1495:1: (lv_tags_1_0= ruleEString )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1495:1: (lv_tags_1_0= ruleEString )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1496:3: lv_tags_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags3370);
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

                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1512:2: (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==31) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1512:4: otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) )
                    	    {
                    	    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnTags3383); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1516:1: ( (lv_tags_3_0= ruleEString ) )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1517:1: (lv_tags_3_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1517:1: (lv_tags_3_0= ruleEString )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1518:3: lv_tags_3_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags3404);
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOnTags3420); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1538:1: ( (lv_treshold_5_0= ruleEInt ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1539:1: (lv_treshold_5_0= ruleEInt )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1539:1: (lv_treshold_5_0= ruleEInt )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1540:3: lv_treshold_5_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTags3441);
            lv_treshold_5_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_5_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnTags3453); 

                	newLeafNode(otherlv_6, grammarAccess.getOnTagsAccess().getInTagsKeyword_4());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1560:1: ( (lv_only_7_0= 'exclusively' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1561:1: (lv_only_7_0= 'exclusively' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1561:1: (lv_only_7_0= 'exclusively' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1562:3: lv_only_7_0= 'exclusively'
                    {
                    lv_only_7_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnTags3471); 

                            newLeafNode(lv_only_7_0, grammarAccess.getOnTagsAccess().getOnlyExclusivelyKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTagsRule());
                    	        }
                           		setWithLastConsumed(current, "only", true, "exclusively");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1575:3: (otherlv_8= 'keep' ( (lv_trueFalseSearch_9_0= ruleEBoolean ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1575:5: otherlv_8= 'keep' ( (lv_trueFalseSearch_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnTags3498); 

                        	newLeafNode(otherlv_8, grammarAccess.getOnTagsAccess().getKeepKeyword_6_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1579:1: ( (lv_trueFalseSearch_9_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1580:1: (lv_trueFalseSearch_9_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1580:1: (lv_trueFalseSearch_9_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1581:3: lv_trueFalseSearch_9_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTrueFalseSearchEBooleanParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnTags3519);
                    lv_trueFalseSearch_9_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTagsRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_9_0, 
                            		"EBoolean");
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
    // $ANTLR end "ruleOnTags"


    // $ANTLR start "entryRuleOnSize"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1605:1: entryRuleOnSize returns [EObject current=null] : iv_ruleOnSize= ruleOnSize EOF ;
    public final EObject entryRuleOnSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSize = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1606:2: (iv_ruleOnSize= ruleOnSize EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1607:2: iv_ruleOnSize= ruleOnSize EOF
            {
             newCompositeNode(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize3557);
            iv_ruleOnSize=ruleOnSize();

            state._fsp--;

             current =iv_ruleOnSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize3567); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1614:1: ruleOnSize returns [EObject current=null] : (otherlv_0= 'size' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_treshold_2_0= ruleEInt ) ) ( (lv_unit_3_0= ruleMemoryUnit ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleOnSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_treshold_2_0 = null;

        Enumerator lv_unit_3_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1617:28: ( (otherlv_0= 'size' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_treshold_2_0= ruleEInt ) ) ( (lv_unit_3_0= ruleMemoryUnit ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1618:1: (otherlv_0= 'size' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_treshold_2_0= ruleEInt ) ) ( (lv_unit_3_0= ruleMemoryUnit ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1618:1: (otherlv_0= 'size' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_treshold_2_0= ruleEInt ) ) ( (lv_unit_3_0= ruleMemoryUnit ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1618:3: otherlv_0= 'size' ( (lv_operator_1_0= ruleOperator ) ) ( (lv_treshold_2_0= ruleEInt ) ) ( (lv_unit_3_0= ruleMemoryUnit ) ) (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOnSize3604); 

                	newLeafNode(otherlv_0, grammarAccess.getOnSizeAccess().getSizeKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1622:1: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1623:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1623:1: (lv_operator_1_0= ruleOperator )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1624:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnSize3625);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1640:2: ( (lv_treshold_2_0= ruleEInt ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1641:1: (lv_treshold_2_0= ruleEInt )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1641:1: (lv_treshold_2_0= ruleEInt )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1642:3: lv_treshold_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnSize3646);
            lv_treshold_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"treshold",
                    		lv_treshold_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1658:2: ( (lv_unit_3_0= ruleMemoryUnit ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1659:1: (lv_unit_3_0= ruleMemoryUnit )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1659:1: (lv_unit_3_0= ruleMemoryUnit )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1660:3: lv_unit_3_0= ruleMemoryUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_ruleOnSize3667);
            lv_unit_3_0=ruleMemoryUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_3_0, 
                    		"MemoryUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1676:2: (otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1676:4: otherlv_4= 'keep' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnSize3680); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnSizeAccess().getKeepKeyword_4_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1680:1: ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1681:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1681:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1682:3: lv_trueFalseSearch_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnSizeAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnSize3701);
                    lv_trueFalseSearch_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnSizeRule());
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


    // $ANTLR start "entryRuleFilterContainer"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1706:1: entryRuleFilterContainer returns [EObject current=null] : iv_ruleFilterContainer= ruleFilterContainer EOF ;
    public final EObject entryRuleFilterContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterContainer = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1707:2: (iv_ruleFilterContainer= ruleFilterContainer EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1708:2: iv_ruleFilterContainer= ruleFilterContainer EOF
            {
             newCompositeNode(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer3739);
            iv_ruleFilterContainer=ruleFilterContainer();

            state._fsp--;

             current =iv_ruleFilterContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer3749); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1715:1: ruleFilterContainer returns [EObject current=null] : (otherlv_0= '{' ( (lv_compositionType_1_0= ruleCompositionType ) ) otherlv_2= '(' ( (lv_segments_3_0= ruleFilterComponent ) ) (otherlv_4= ',' ( (lv_segments_5_0= ruleFilterComponent ) ) )* otherlv_6= ')' otherlv_7= '}' ) ;
    public final EObject ruleFilterContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_compositionType_1_0 = null;

        EObject lv_segments_3_0 = null;

        EObject lv_segments_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1718:28: ( (otherlv_0= '{' ( (lv_compositionType_1_0= ruleCompositionType ) ) otherlv_2= '(' ( (lv_segments_3_0= ruleFilterComponent ) ) (otherlv_4= ',' ( (lv_segments_5_0= ruleFilterComponent ) ) )* otherlv_6= ')' otherlv_7= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1719:1: (otherlv_0= '{' ( (lv_compositionType_1_0= ruleCompositionType ) ) otherlv_2= '(' ( (lv_segments_3_0= ruleFilterComponent ) ) (otherlv_4= ',' ( (lv_segments_5_0= ruleFilterComponent ) ) )* otherlv_6= ')' otherlv_7= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1719:1: (otherlv_0= '{' ( (lv_compositionType_1_0= ruleCompositionType ) ) otherlv_2= '(' ( (lv_segments_3_0= ruleFilterComponent ) ) (otherlv_4= ',' ( (lv_segments_5_0= ruleFilterComponent ) ) )* otherlv_6= ')' otherlv_7= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1719:3: otherlv_0= '{' ( (lv_compositionType_1_0= ruleCompositionType ) ) otherlv_2= '(' ( (lv_segments_3_0= ruleFilterComponent ) ) (otherlv_4= ',' ( (lv_segments_5_0= ruleFilterComponent ) ) )* otherlv_6= ')' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleFilterContainer3786); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1723:1: ( (lv_compositionType_1_0= ruleCompositionType ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1724:1: (lv_compositionType_1_0= ruleCompositionType )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1724:1: (lv_compositionType_1_0= ruleCompositionType )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1725:3: lv_compositionType_1_0= ruleCompositionType
            {
             
            	        newCompositeNode(grammarAccess.getFilterContainerAccess().getCompositionTypeCompositionTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_ruleFilterContainer3807);
            lv_compositionType_1_0=ruleCompositionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
            	        }
                   		set(
                   			current, 
                   			"compositionType",
                    		lv_compositionType_1_0, 
                    		"CompositionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleFilterContainer3819); 

                	newLeafNode(otherlv_2, grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1745:1: ( (lv_segments_3_0= ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1746:1: (lv_segments_3_0= ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1746:1: (lv_segments_3_0= ruleFilterComponent )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1747:3: lv_segments_3_0= ruleFilterComponent
            {
             
            	        newCompositeNode(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleFilterContainer3840);
            lv_segments_3_0=ruleFilterComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
            	        }
                   		add(
                   			current, 
                   			"segments",
                    		lv_segments_3_0, 
                    		"FilterComponent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1763:2: (otherlv_4= ',' ( (lv_segments_5_0= ruleFilterComponent ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1763:4: otherlv_4= ',' ( (lv_segments_5_0= ruleFilterComponent ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFilterContainer3853); 

            	        	newLeafNode(otherlv_4, grammarAccess.getFilterContainerAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1767:1: ( (lv_segments_5_0= ruleFilterComponent ) )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1768:1: (lv_segments_5_0= ruleFilterComponent )
            	    {
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1768:1: (lv_segments_5_0= ruleFilterComponent )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1769:3: lv_segments_5_0= ruleFilterComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleFilterContainer3874);
            	    lv_segments_5_0=ruleFilterComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFilterContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"segments",
            	            		lv_segments_5_0, 
            	            		"FilterComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleFilterContainer3888); 

                	newLeafNode(otherlv_6, grammarAccess.getFilterContainerAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFilterContainer3900); 

                	newLeafNode(otherlv_7, grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1801:1: entryRuleIsEmpty returns [EObject current=null] : iv_ruleIsEmpty= ruleIsEmpty EOF ;
    public final EObject entryRuleIsEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEmpty = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1802:2: (iv_ruleIsEmpty= ruleIsEmpty EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1803:2: iv_ruleIsEmpty= ruleIsEmpty EOF
            {
             newCompositeNode(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3936);
            iv_ruleIsEmpty=ruleIsEmpty();

            state._fsp--;

             current =iv_ruleIsEmpty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty3946); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1810:1: ruleIsEmpty returns [EObject current=null] : ( () otherlv_1= 'empty' otherlv_2= '=' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )? ) ;
    public final EObject ruleIsEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1813:28: ( ( () otherlv_1= 'empty' otherlv_2= '=' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1814:1: ( () otherlv_1= 'empty' otherlv_2= '=' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1814:1: ( () otherlv_1= 'empty' otherlv_2= '=' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1814:2: () otherlv_1= 'empty' otherlv_2= '=' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )?
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1814:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1815:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEmptyAccess().getIsEmptyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleIsEmpty3992); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEmptyAccess().getEmptyKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIsEmpty4004); 

                	newLeafNode(otherlv_2, grammarAccess.getIsEmptyAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1828:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=24 && LA26_0<=25)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1829:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1829:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1830:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getIsEmptyAccess().getTrueFalseSearchEBooleanParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleIsEmpty4025);
                    lv_trueFalseSearch_3_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIsEmptyRule());
                    	        }
                           		set(
                           			current, 
                           			"trueFalseSearch",
                            		lv_trueFalseSearch_3_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleIsEmpty"


    // $ANTLR start "entryRuleOnType"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1854:1: entryRuleOnType returns [EObject current=null] : iv_ruleOnType= ruleOnType EOF ;
    public final EObject entryRuleOnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnType = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1855:2: (iv_ruleOnType= ruleOnType EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1856:2: iv_ruleOnType= ruleOnType EOF
            {
             newCompositeNode(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType4062);
            iv_ruleOnType=ruleOnType();

            state._fsp--;

             current =iv_ruleOnType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType4072); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1863:1: ruleOnType returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'is' ( (lv_type_2_0= ruleFileType ) ) (otherlv_3= 'keep' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleOnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1866:28: ( (otherlv_0= 'file' otherlv_1= 'is' ( (lv_type_2_0= ruleFileType ) ) (otherlv_3= 'keep' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1867:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_type_2_0= ruleFileType ) ) (otherlv_3= 'keep' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1867:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_type_2_0= ruleFileType ) ) (otherlv_3= 'keep' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1867:3: otherlv_0= 'file' otherlv_1= 'is' ( (lv_type_2_0= ruleFileType ) ) (otherlv_3= 'keep' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOnType4109); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTypeAccess().getFileKeyword_0());
                
            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOnType4121); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTypeAccess().getIsKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1875:1: ( (lv_type_2_0= ruleFileType ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1876:1: (lv_type_2_0= ruleFileType )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1876:1: (lv_type_2_0= ruleFileType )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1877:3: lv_type_2_0= ruleFileType
            {
             
            	        newCompositeNode(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_ruleOnType4142);
            lv_type_2_0=ruleFileType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"FileType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1893:2: (otherlv_3= 'keep' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1893:4: otherlv_3= 'keep' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnType4155); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnTypeAccess().getKeepKeyword_3_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1897:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1898:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1898:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1899:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTypeAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnType4176);
                    lv_trueFalseSearch_4_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOnTypeRule());
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1923:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1924:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1925:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4215);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4226); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1932:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1935:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1936:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1936:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1936:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1936:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1937:2: kw= '-'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEInt4265); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4282); 

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


    // $ANTLR start "ruleStrategies"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1957:1: ruleStrategies returns [Enumerator current=null] : ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) ;
    public final Enumerator ruleStrategies() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1959:28: ( ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1960:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1960:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt29=1;
                }
                break;
            case 51:
                {
                alt29=2;
                }
                break;
            case 52:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1960:2: (enumLiteral_0= 'forced' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1960:2: (enumLiteral_0= 'forced' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1960:4: enumLiteral_0= 'forced'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleStrategies4341); 

                            current = grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1966:6: (enumLiteral_1= 'append' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1966:6: (enumLiteral_1= 'append' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1966:8: enumLiteral_1= 'append'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleStrategies4358); 

                            current = grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1972:6: (enumLiteral_2= 'carefully' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1972:6: (enumLiteral_2= 'carefully' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1972:8: enumLiteral_2= 'carefully'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleStrategies4375); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1982:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1984:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1985:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1985:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt30=1;
                }
                break;
            case 54:
                {
                alt30=2;
                }
                break;
            case 55:
                {
                alt30=3;
                }
                break;
            case 56:
                {
                alt30=4;
                }
                break;
            case 57:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1985:2: (enumLiteral_0= '==' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1985:2: (enumLiteral_0= '==' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1985:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleOperator4420); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1991:6: (enumLiteral_1= '<' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1991:6: (enumLiteral_1= '<' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1991:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleOperator4437); 

                            current = grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1997:6: (enumLiteral_2= '>' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1997:6: (enumLiteral_2= '>' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1997:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleOperator4454); 

                            current = grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2003:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2003:6: (enumLiteral_3= '<=' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2003:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleOperator4471); 

                            current = grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2009:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2009:6: (enumLiteral_4= '>=' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2009:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleOperator4488); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2019:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2021:28: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2022:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2022:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt31=1;
                }
                break;
            case 59:
                {
                alt31=2;
                }
                break;
            case 60:
                {
                alt31=3;
                }
                break;
            case 61:
                {
                alt31=4;
                }
                break;
            case 62:
                {
                alt31=5;
                }
                break;
            case 63:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2022:2: (enumLiteral_0= 'min' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2022:2: (enumLiteral_0= 'min' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2022:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTimeUnit4533); 

                            current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2028:6: (enumLiteral_1= 'hour' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2028:6: (enumLiteral_1= 'hour' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2028:8: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTimeUnit4550); 

                            current = grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2034:6: (enumLiteral_2= 'day' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2034:6: (enumLiteral_2= 'day' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2034:8: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTimeUnit4567); 

                            current = grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2040:6: (enumLiteral_3= 'week' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2040:6: (enumLiteral_3= 'week' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2040:8: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTimeUnit4584); 

                            current = grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2046:6: (enumLiteral_4= 'month' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2046:6: (enumLiteral_4= 'month' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2046:8: enumLiteral_4= 'month'
                    {
                    enumLiteral_4=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTimeUnit4601); 

                            current = grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2052:6: (enumLiteral_5= 'year' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2052:6: (enumLiteral_5= 'year' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2052:8: enumLiteral_5= 'year'
                    {
                    enumLiteral_5=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTimeUnit4618); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2062:1: ruleTimeType returns [Enumerator current=null] : ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) ) ;
    public final Enumerator ruleTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2064:28: ( ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2065:1: ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2065:1: ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==64) ) {
                alt32=1;
            }
            else if ( (LA32_0==65) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2065:2: (enumLiteral_0= 'modification' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2065:2: (enumLiteral_0= 'modification' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2065:4: enumLiteral_0= 'modification'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTimeType4663); 

                            current = grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2071:6: (enumLiteral_1= 'cretion' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2071:6: (enumLiteral_1= 'cretion' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2071:8: enumLiteral_1= 'cretion'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleTimeType4680); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2081:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) ;
    public final Enumerator ruleMemoryUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2083:28: ( ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2084:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2084:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt33=1;
                }
                break;
            case 67:
                {
                alt33=2;
                }
                break;
            case 68:
                {
                alt33=3;
                }
                break;
            case 69:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2084:2: (enumLiteral_0= 'KB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2084:2: (enumLiteral_0= 'KB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2084:4: enumLiteral_0= 'KB'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMemoryUnit4725); 

                            current = grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2090:6: (enumLiteral_1= 'MB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2090:6: (enumLiteral_1= 'MB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2090:8: enumLiteral_1= 'MB'
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMemoryUnit4742); 

                            current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2096:6: (enumLiteral_2= 'GB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2096:6: (enumLiteral_2= 'GB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2096:8: enumLiteral_2= 'GB'
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMemoryUnit4759); 

                            current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2102:6: (enumLiteral_3= 'TB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2102:6: (enumLiteral_3= 'TB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2102:8: enumLiteral_3= 'TB'
                    {
                    enumLiteral_3=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleMemoryUnit4776); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2112:1: ruleCompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'all of' ) | (enumLiteral_1= 'any of' ) | (enumLiteral_2= 'none' ) ) ;
    public final Enumerator ruleCompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2114:28: ( ( (enumLiteral_0= 'all of' ) | (enumLiteral_1= 'any of' ) | (enumLiteral_2= 'none' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2115:1: ( (enumLiteral_0= 'all of' ) | (enumLiteral_1= 'any of' ) | (enumLiteral_2= 'none' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2115:1: ( (enumLiteral_0= 'all of' ) | (enumLiteral_1= 'any of' ) | (enumLiteral_2= 'none' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt34=1;
                }
                break;
            case 71:
                {
                alt34=2;
                }
                break;
            case 72:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2115:2: (enumLiteral_0= 'all of' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2115:2: (enumLiteral_0= 'all of' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2115:4: enumLiteral_0= 'all of'
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleCompositionType4821); 

                            current = grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2121:6: (enumLiteral_1= 'any of' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2121:6: (enumLiteral_1= 'any of' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2121:8: enumLiteral_1= 'any of'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleCompositionType4838); 

                            current = grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2127:6: (enumLiteral_2= 'none' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2127:6: (enumLiteral_2= 'none' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2127:8: enumLiteral_2= 'none'
                    {
                    enumLiteral_2=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleCompositionType4855); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2137:1: ruleFileType returns [Enumerator current=null] : ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) ) ;
    public final Enumerator ruleFileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2139:28: ( ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2140:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2140:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==73) ) {
                alt35=1;
            }
            else if ( (LA35_0==74) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2140:2: (enumLiteral_0= 'Document' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2140:2: (enumLiteral_0= 'Document' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2140:4: enumLiteral_0= 'Document'
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleFileType4900); 

                            current = grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2146:6: (enumLiteral_1= 'Folder' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2146:6: (enumLiteral_1= 'Folder' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2146:8: enumLiteral_1= 'Folder'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleFileType4917); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_ruleModel140 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleModel153 = new BitSet(new long[]{0x00000000000B1030L});
        public static final BitSet FOLLOW_ruleExecution_in_ruleModel174 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleExecution_in_entryRuleExecution212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExecution222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_ruleExecution269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleExecution296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_ruleExecution323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_ruleExecution350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_ruleExecution377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep412 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_ruleGenericStep469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_ruleGenericStep496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_ruleGenericStep523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_ruleFilterComponent615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_ruleFilterComponent642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_ruleFilterComponent669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_ruleFilterComponent696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_ruleFilterComponent723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_ruleFilterComponent750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_ruleFilterComponent777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_ruleFilterComponent804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_ruleFilterComponent831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleCopy913 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCopy925 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCopy948 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleCopy960 = new BitSet(new long[]{0x000000000C200030L});
        public static final BitSet FOLLOW_rulePath_in_ruleCopy981 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleCopy994 = new BitSet(new long[]{0x001C000000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleCopy1015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1053 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMove1100 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMove1112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove1135 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMove1147 = new BitSet(new long[]{0x000000000C200030L});
        public static final BitSet FOLLOW_rulePath_in_ruleMove1168 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleMove1181 = new BitSet(new long[]{0x001C000000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleMove1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete1240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleDelete1287 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDelete1299 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelete1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_entryRulePathVariable1358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathVariable1368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePathVariable1414 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePathVariable1426 = new BitSet(new long[]{0x000000000C200030L});
        public static final BitSet FOLLOW_rulePath_in_rulePathVariable1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable1483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionVariable1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSelectionVariable1530 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectionVariable1551 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSelectionVariable1563 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleSelection_in_ruleSelectionVariable1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath1620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rulePath1668 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rulePath1689 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePath1701 = new BitSet(new long[]{0x000000000C200030L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath1724 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_rulePath1737 = new BitSet(new long[]{0x000000000C200030L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath1758 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEBoolean1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEBoolean1865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep1905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConcreteStep1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep1995 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleVariableStep2042 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableStep2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep2101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleParametrizedStep2157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParametrizedStep2178 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleParametrizedStep2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection2349 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection2359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSelection2396 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSelection2408 = new BitSet(new long[]{0x000000000C200030L});
        public static final BitSet FOLLOW_rulePath_in_ruleSelection2429 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleSelection2442 = new BitSet(new long[]{0x0001995500000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection2463 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleSelection2476 = new BitSet(new long[]{0x0001995500000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection2497 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName2537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleOnName2593 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOnName2605 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnName2626 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleOnName2639 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnName2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension2698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension2708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleOnExtension2754 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleOnExtension2766 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension2788 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_31_in_ruleOnExtension2801 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension2822 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_22_in_ruleOnExtension2838 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleOnExtension2851 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnExtension2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime2910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime2920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleOnTime2957 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleOnTime2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleTimeType_in_ruleOnTime2990 = new BitSet(new long[]{0x03E0000000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnTime3011 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTime3032 = new BitSet(new long[]{0xFC00000000000000L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_ruleOnTime3053 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleOnTime3066 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnTime3087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes3125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOnAttributes3172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes3193 = new BitSet(new long[]{0x0000008200000002L});
        public static final BitSet FOLLOW_39_in_ruleOnAttributes3206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes3227 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleOnAttributes3242 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnAttributes3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags3301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags3311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleOnTags3348 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags3370 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_31_in_ruleOnTags3383 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags3404 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_22_in_ruleOnTags3420 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTags3441 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleOnTags3453 = new BitSet(new long[]{0x0000040200000002L});
        public static final BitSet FOLLOW_42_in_ruleOnTags3471 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleOnTags3498 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnTags3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize3557 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize3567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOnSize3604 = new BitSet(new long[]{0x03E0000000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnSize3625 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnSize3646 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003CL});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_ruleOnSize3667 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleOnSize3680 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnSize3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer3739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleFilterContainer3786 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_ruleCompositionType_in_ruleFilterContainer3807 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleFilterContainer3819 = new BitSet(new long[]{0x0001995500000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleFilterContainer3840 = new BitSet(new long[]{0x0000400080000000L});
        public static final BitSet FOLLOW_31_in_ruleFilterContainer3853 = new BitSet(new long[]{0x0001995500000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleFilterContainer3874 = new BitSet(new long[]{0x0000400080000000L});
        public static final BitSet FOLLOW_46_in_ruleFilterContainer3888 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFilterContainer3900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty3946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleIsEmpty3992 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIsEmpty4004 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleIsEmpty4025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType4062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType4072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleOnType4109 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleOnType4121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_ruleFileType_in_ruleOnType4142 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleOnType4155 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnType4176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEInt4265 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleStrategies4341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleStrategies4358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleStrategies4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleOperator4420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleOperator4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleOperator4454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleOperator4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleOperator4488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTimeUnit4533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTimeUnit4550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTimeUnit4567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTimeUnit4584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTimeUnit4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTimeUnit4618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTimeType4663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTimeType4680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMemoryUnit4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleMemoryUnit4742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleMemoryUnit4759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleMemoryUnit4776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCompositionType4821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleCompositionType4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleCompositionType4855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleFileType4900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleFileType4917 = new BitSet(new long[]{0x0000000000000002L});
    }


}