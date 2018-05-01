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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'executions'", "','", "'}'", "'Copy'", "'strategy'", "'source'", "'destination'", "'Move'", "'Delete'", "'PathVariable'", "'value'", "'SelectionVariable'", "'Path'", "'absolute'", "'steps'", "'true'", "'false'", "'ConcreteStep'", "'VariableStep'", "'ParametrizedStep'", "'Selection'", "'where'", "'from'", "'OnName'", "'trueFalseSearch'", "'OnExtension'", "'extensions'", "'OnTime'", "'operator'", "'treshold'", "'unit'", "'timeOf'", "'OnAttributes'", "'only'", "'OnTags'", "'tags'", "'OnSize'", "'FilterContainer'", "'compositionType'", "'segments'", "'IsEmpty'", "'OnType'", "'type'", "'-'", "'forced'", "'append'", "'carefully'", "'equal'", "'less'", "'more'", "'less_equal'", "'more_equal'", "'min'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'modification'", "'cretion'", "'KB'", "'MB'", "'GB'", "'TB'", "'and'", "'or'", "'none'", "'Document'", "'Folder'"
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'executions' otherlv_4= '{' ( (lv_executions_5_0= ruleExecution ) ) (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_executions_5_0 = null;

        EObject lv_executions_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:80:28: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'executions' otherlv_4= '{' ( (lv_executions_5_0= ruleExecution ) ) (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'executions' otherlv_4= '{' ( (lv_executions_5_0= ruleExecution ) ) (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'executions' otherlv_4= '{' ( (lv_executions_5_0= ruleExecution ) ) (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:2: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'executions' otherlv_4= '{' ( (lv_executions_5_0= ruleExecution ) ) (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:81:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:95:1: (otherlv_3= 'executions' otherlv_4= '{' ( (lv_executions_5_0= ruleExecution ) ) (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:95:3: otherlv_3= 'executions' otherlv_4= '{' ( (lv_executions_5_0= ruleExecution ) ) (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getExecutionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel168); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:103:1: ( (lv_executions_5_0= ruleExecution ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:104:1: (lv_executions_5_0= ruleExecution )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:104:1: (lv_executions_5_0= ruleExecution )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:105:3: lv_executions_5_0= ruleExecution
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExecution_in_ruleModel189);
                    lv_executions_5_0=ruleExecution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"executions",
                            		lv_executions_5_0, 
                            		"Execution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:121:2: (otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:121:4: otherlv_6= ',' ( (lv_executions_7_0= ruleExecution ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:125:1: ( (lv_executions_7_0= ruleExecution ) )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:126:1: (lv_executions_7_0= ruleExecution )
                    	    {
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:126:1: (lv_executions_7_0= ruleExecution )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:127:3: lv_executions_7_0= ruleExecution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExecution_in_ruleModel223);
                    	    lv_executions_7_0=ruleExecution();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"executions",
                    	            		lv_executions_7_0, 
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

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel237); 

                        	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel251); 

                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:159:1: entryRuleExecution returns [EObject current=null] : iv_ruleExecution= ruleExecution EOF ;
    public final EObject entryRuleExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecution = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:160:2: (iv_ruleExecution= ruleExecution EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:161:2: iv_ruleExecution= ruleExecution EOF
            {
             newCompositeNode(grammarAccess.getExecutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_entryRuleExecution287);
            iv_ruleExecution=ruleExecution();

            state._fsp--;

             current =iv_ruleExecution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExecution297); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:168:1: ruleExecution returns [EObject current=null] : (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable ) ;
    public final EObject ruleExecution() throws RecognitionException {
        EObject current = null;

        EObject this_Copy_0 = null;

        EObject this_Move_1 = null;

        EObject this_Delete_2 = null;

        EObject this_PathVariable_3 = null;

        EObject this_SelectionVariable_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:171:28: ( (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:172:1: (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:172:1: (this_Copy_0= ruleCopy | this_Move_1= ruleMove | this_Delete_2= ruleDelete | this_PathVariable_3= rulePathVariable | this_SelectionVariable_4= ruleSelectionVariable )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:173:5: this_Copy_0= ruleCopy
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getCopyParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCopy_in_ruleExecution344);
                    this_Copy_0=ruleCopy();

                    state._fsp--;

                     
                            current = this_Copy_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:183:5: this_Move_1= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getMoveParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleExecution371);
                    this_Move_1=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:193:5: this_Delete_2= ruleDelete
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDelete_in_ruleExecution398);
                    this_Delete_2=ruleDelete();

                    state._fsp--;

                     
                            current = this_Delete_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:203:5: this_PathVariable_3= rulePathVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_ruleExecution425);
                    this_PathVariable_3=rulePathVariable();

                    state._fsp--;

                     
                            current = this_PathVariable_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:213:5: this_SelectionVariable_4= ruleSelectionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExecutionAccess().getSelectionVariableParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_ruleExecution452);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:229:1: entryRuleGenericStep returns [EObject current=null] : iv_ruleGenericStep= ruleGenericStep EOF ;
    public final EObject entryRuleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:230:2: (iv_ruleGenericStep= ruleGenericStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:231:2: iv_ruleGenericStep= ruleGenericStep EOF
            {
             newCompositeNode(grammarAccess.getGenericStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_entryRuleGenericStep487);
            iv_ruleGenericStep=ruleGenericStep();

            state._fsp--;

             current =iv_ruleGenericStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericStep497); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:238:1: ruleGenericStep returns [EObject current=null] : (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) ;
    public final EObject ruleGenericStep() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteStep_0 = null;

        EObject this_VariableStep_1 = null;

        EObject this_ParametrizedStep_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:241:28: ( (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:242:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:242:1: (this_ConcreteStep_0= ruleConcreteStep | this_VariableStep_1= ruleVariableStep | this_ParametrizedStep_2= ruleParametrizedStep )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 32:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:243:5: this_ConcreteStep_0= ruleConcreteStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_ruleGenericStep544);
                    this_ConcreteStep_0=ruleConcreteStep();

                    state._fsp--;

                     
                            current = this_ConcreteStep_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:253:5: this_VariableStep_1= ruleVariableStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_ruleGenericStep571);
                    this_VariableStep_1=ruleVariableStep();

                    state._fsp--;

                     
                            current = this_VariableStep_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:263:5: this_ParametrizedStep_2= ruleParametrizedStep
                    {
                     
                            newCompositeNode(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_ruleGenericStep598);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:279:1: entryRuleFilterComponent returns [EObject current=null] : iv_ruleFilterComponent= ruleFilterComponent EOF ;
    public final EObject entryRuleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterComponent = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:280:2: (iv_ruleFilterComponent= ruleFilterComponent EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:281:2: iv_ruleFilterComponent= ruleFilterComponent EOF
            {
             newCompositeNode(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent633);
            iv_ruleFilterComponent=ruleFilterComponent();

            state._fsp--;

             current =iv_ruleFilterComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent643); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:288:1: ruleFilterComponent returns [EObject current=null] : (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:291:28: ( (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:292:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:292:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            case 45:
                {
                alt5=4;
                }
                break;
            case 46:
            case 47:
                {
                alt5=5;
                }
                break;
            case 49:
                {
                alt5=6;
                }
                break;
            case 50:
                {
                alt5=7;
                }
                break;
            case 53:
                {
                alt5=8;
                }
                break;
            case 54:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:293:5: this_OnName_0= ruleOnName
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_ruleFilterComponent690);
                    this_OnName_0=ruleOnName();

                    state._fsp--;

                     
                            current = this_OnName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:303:5: this_OnExtension_1= ruleOnExtension
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_ruleFilterComponent717);
                    this_OnExtension_1=ruleOnExtension();

                    state._fsp--;

                     
                            current = this_OnExtension_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:313:5: this_OnTime_2= ruleOnTime
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_ruleFilterComponent744);
                    this_OnTime_2=ruleOnTime();

                    state._fsp--;

                     
                            current = this_OnTime_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:323:5: this_OnAttributes_3= ruleOnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_ruleFilterComponent771);
                    this_OnAttributes_3=ruleOnAttributes();

                    state._fsp--;

                     
                            current = this_OnAttributes_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:333:5: this_OnTags_4= ruleOnTags
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_ruleFilterComponent798);
                    this_OnTags_4=ruleOnTags();

                    state._fsp--;

                     
                            current = this_OnTags_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:343:5: this_OnSize_5= ruleOnSize
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_ruleFilterComponent825);
                    this_OnSize_5=ruleOnSize();

                    state._fsp--;

                     
                            current = this_OnSize_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:353:5: this_FilterContainer_6= ruleFilterContainer
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_ruleFilterComponent852);
                    this_FilterContainer_6=ruleFilterContainer();

                    state._fsp--;

                     
                            current = this_FilterContainer_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:363:5: this_IsEmpty_7= ruleIsEmpty
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_ruleFilterComponent879);
                    this_IsEmpty_7=ruleIsEmpty();

                    state._fsp--;

                     
                            current = this_IsEmpty_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:373:5: this_OnType_8= ruleOnType
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_ruleFilterComponent906);
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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:389:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:390:2: (iv_ruleCopy= ruleCopy EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:391:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy941);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy951); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:398:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:401:28: ( (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:402:1: (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:402:1: (otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:402:3: otherlv_0= 'Copy' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCopy988); 

                	newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCopy1000); 

                	newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:410:1: (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:410:3: otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCopy1013); 

                        	newLeafNode(otherlv_2, grammarAccess.getCopyAccess().getStrategyKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:414:1: ( (lv_strategy_3_0= ruleStrategies ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:415:1: (lv_strategy_3_0= ruleStrategies )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:415:1: (lv_strategy_3_0= ruleStrategies )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:416:3: lv_strategy_3_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleCopy1034);
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCopy1048); 

                	newLeafNode(otherlv_4, grammarAccess.getCopyAccess().getSourceKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:436:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:437:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:437:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:438:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getSourceSelectionVariableCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCopy1071);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCopy1083); 

                	newLeafNode(otherlv_6, grammarAccess.getCopyAccess().getDestinationKeyword_5());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:455:1: ( (lv_destination_7_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:456:1: (lv_destination_7_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:456:1: (lv_destination_7_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:457:3: lv_destination_7_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleCopy1104);
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

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCopy1116); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:485:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:486:2: (iv_ruleMove= ruleMove EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:487:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove1152);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove1162); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:494:1: ruleMove returns [EObject current=null] : (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:497:28: ( (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:498:1: (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:498:1: (otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:498:3: otherlv_0= 'Move' otherlv_1= '{' (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'destination' ( (lv_destination_7_0= rulePath ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMove1199); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMove1211); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:506:1: (otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:506:3: otherlv_2= 'strategy' ( (lv_strategy_3_0= ruleStrategies ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMove1224); 

                        	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getStrategyKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:510:1: ( (lv_strategy_3_0= ruleStrategies ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:511:1: (lv_strategy_3_0= ruleStrategies )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:511:1: (lv_strategy_3_0= ruleStrategies )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:512:3: lv_strategy_3_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleMove1245);
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMove1259); 

                	newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getSourceKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:532:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:533:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:533:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:534:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSourceSelectionVariableCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove1282);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMove1294); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getDestinationKeyword_5());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:551:1: ( (lv_destination_7_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:552:1: (lv_destination_7_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:552:1: (lv_destination_7_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:553:3: lv_destination_7_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleMove1315);
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

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMove1327); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:581:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:582:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:583:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete1363);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete1373); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:590:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:593:28: ( (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:594:1: (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:594:1: (otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:594:3: otherlv_0= 'Delete' otherlv_1= '{' otherlv_2= 'source' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDelete1410); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDelete1422); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDelete1434); 

                	newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getSourceKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:606:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:607:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:607:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:608:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeleteAccess().getSourceSelectionVariableCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelete1457);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDelete1469); 

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


    // $ANTLR start "entryRulePathVariable"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:633:1: entryRulePathVariable returns [EObject current=null] : iv_rulePathVariable= rulePathVariable EOF ;
    public final EObject entryRulePathVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathVariable = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:634:2: (iv_rulePathVariable= rulePathVariable EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:635:2: iv_rulePathVariable= rulePathVariable EOF
            {
             newCompositeNode(grammarAccess.getPathVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_entryRulePathVariable1505);
            iv_rulePathVariable=rulePathVariable();

            state._fsp--;

             current =iv_rulePathVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathVariable1515); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:642:1: rulePathVariable returns [EObject current=null] : (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:645:28: ( (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:646:1: (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:646:1: (otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:646:3: otherlv_0= 'PathVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= rulePath ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePathVariable1552); 

                	newLeafNode(otherlv_0, grammarAccess.getPathVariableAccess().getPathVariableKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:650:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:651:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:651:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:652:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePathVariable1573);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePathVariable1585); 

                	newLeafNode(otherlv_2, grammarAccess.getPathVariableAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePathVariable1597); 

                	newLeafNode(otherlv_3, grammarAccess.getPathVariableAccess().getValueKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:676:1: ( (lv_value_4_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:677:1: (lv_value_4_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:677:1: (lv_value_4_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:678:3: lv_value_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rulePathVariable1618);
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

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePathVariable1630); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:706:1: entryRuleSelectionVariable returns [EObject current=null] : iv_ruleSelectionVariable= ruleSelectionVariable EOF ;
    public final EObject entryRuleSelectionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionVariable = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:707:2: (iv_ruleSelectionVariable= ruleSelectionVariable EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:708:2: iv_ruleSelectionVariable= ruleSelectionVariable EOF
            {
             newCompositeNode(grammarAccess.getSelectionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable1666);
            iv_ruleSelectionVariable=ruleSelectionVariable();

            state._fsp--;

             current =iv_ruleSelectionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionVariable1676); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:715:1: ruleSelectionVariable returns [EObject current=null] : (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:718:28: ( (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:719:1: (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:719:1: (otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:719:3: otherlv_0= 'SelectionVariable' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleSelection ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSelectionVariable1713); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionVariableAccess().getSelectionVariableKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:723:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:724:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:724:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:725:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSelectionVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectionVariable1734);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSelectionVariable1746); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionVariableAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSelectionVariable1758); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectionVariableAccess().getValueKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:749:1: ( (lv_value_4_0= ruleSelection ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:750:1: (lv_value_4_0= ruleSelection )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:750:1: (lv_value_4_0= ruleSelection )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:751:3: lv_value_4_0= ruleSelection
            {
             
            	        newCompositeNode(grammarAccess.getSelectionVariableAccess().getValueSelectionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_ruleSelectionVariable1779);
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

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelectionVariable1791); 

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


    // $ANTLR start "entryRulePath"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:779:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:780:2: (iv_rulePath= rulePath EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:781:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_entryRulePath1827);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePath1837); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:788:1: rulePath returns [EObject current=null] : (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:791:28: ( (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:792:1: (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:792:1: (otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:792:3: otherlv_0= 'Path' otherlv_1= '{' (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )? otherlv_4= 'steps' otherlv_5= '{' ( (lv_steps_6_0= ruleGenericStep ) ) (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePath1874); 

                	newLeafNode(otherlv_0, grammarAccess.getPathAccess().getPathKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePath1886); 

                	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:800:1: (otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:800:3: otherlv_2= 'absolute' ( (lv_absolute_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePath1899); 

                        	newLeafNode(otherlv_2, grammarAccess.getPathAccess().getAbsoluteKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:804:1: ( (lv_absolute_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:805:1: (lv_absolute_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:805:1: (lv_absolute_3_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:806:3: lv_absolute_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathAccess().getAbsoluteEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rulePath1920);
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

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePath1934); 

                	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getStepsKeyword_3());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePath1946); 

                	newLeafNode(otherlv_5, grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:830:1: ( (lv_steps_6_0= ruleGenericStep ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:831:1: (lv_steps_6_0= ruleGenericStep )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:831:1: (lv_steps_6_0= ruleGenericStep )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:832:3: lv_steps_6_0= ruleGenericStep
            {
             
            	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath1967);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:848:2: (otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:848:4: otherlv_7= ',' ( (lv_steps_8_0= ruleGenericStep ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePath1980); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPathAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:852:1: ( (lv_steps_8_0= ruleGenericStep ) )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:853:1: (lv_steps_8_0= ruleGenericStep )
            	    {
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:853:1: (lv_steps_8_0= ruleGenericStep )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:854:3: lv_steps_8_0= ruleGenericStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rulePath2001);
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
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePath2015); 

                	newLeafNode(otherlv_9, grammarAccess.getPathAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePath2027); 

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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:886:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:887:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:888:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2064);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2075); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:895:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:898:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:899:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:899:1: (kw= 'true' | kw= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:900:2: kw= 'true'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEBoolean2113); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:907:2: kw= 'false'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEBoolean2132); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:920:1: entryRuleConcreteStep returns [EObject current=null] : iv_ruleConcreteStep= ruleConcreteStep EOF ;
    public final EObject entryRuleConcreteStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:921:2: (iv_ruleConcreteStep= ruleConcreteStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:922:2: iv_ruleConcreteStep= ruleConcreteStep EOF
            {
             newCompositeNode(grammarAccess.getConcreteStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep2172);
            iv_ruleConcreteStep=ruleConcreteStep();

            state._fsp--;

             current =iv_ruleConcreteStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteStep2182); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:929:1: ruleConcreteStep returns [EObject current=null] : (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleConcreteStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:932:28: ( (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:933:1: (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:933:1: (otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:933:3: otherlv_0= 'ConcreteStep' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleConcreteStep2219); 

                	newLeafNode(otherlv_0, grammarAccess.getConcreteStepAccess().getConcreteStepKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConcreteStep2231); 

                	newLeafNode(otherlv_1, grammarAccess.getConcreteStepAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConcreteStep2243); 

                	newLeafNode(otherlv_2, grammarAccess.getConcreteStepAccess().getValueKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:945:1: ( (lv_value_3_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:946:1: (lv_value_3_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:946:1: (lv_value_3_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:947:3: lv_value_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConcreteStep2264);
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConcreteStep2276); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:975:1: entryRuleVariableStep returns [EObject current=null] : iv_ruleVariableStep= ruleVariableStep EOF ;
    public final EObject entryRuleVariableStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:976:2: (iv_ruleVariableStep= ruleVariableStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:977:2: iv_ruleVariableStep= ruleVariableStep EOF
            {
             newCompositeNode(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep2312);
            iv_ruleVariableStep=ruleVariableStep();

            state._fsp--;

             current =iv_ruleVariableStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep2322); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:984:1: ruleVariableStep returns [EObject current=null] : (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariableStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:987:28: ( (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:988:1: (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:988:1: (otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:988:3: otherlv_0= 'VariableStep' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleVariableStep2359); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableStepAccess().getVariableStepKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleVariableStep2371); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableStepAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleVariableStep2383); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableStepAccess().getValueKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1000:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1001:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1001:1: ( ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1002:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableStepRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableStep2406);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVariableStep2418); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1027:1: entryRuleParametrizedStep returns [EObject current=null] : iv_ruleParametrizedStep= ruleParametrizedStep EOF ;
    public final EObject entryRuleParametrizedStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametrizedStep = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1028:2: (iv_ruleParametrizedStep= ruleParametrizedStep EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1029:2: iv_ruleParametrizedStep= ruleParametrizedStep EOF
            {
             newCompositeNode(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep2454);
            iv_ruleParametrizedStep=ruleParametrizedStep();

            state._fsp--;

             current =iv_ruleParametrizedStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep2464); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1036:1: ruleParametrizedStep returns [EObject current=null] : ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParametrizedStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1039:28: ( ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1040:1: ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1040:1: ( () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1040:2: () otherlv_1= 'ParametrizedStep' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1040:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1041:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleParametrizedStep2510); 

                	newLeafNode(otherlv_1, grammarAccess.getParametrizedStepAccess().getParametrizedStepKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1050:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1051:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1051:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1052:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParametrizedStep2531);
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1076:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1077:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1078:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2568);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2579); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1085:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1088:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1089:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1089:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1089:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2619); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1097:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2645); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1112:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1113:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1114:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection2690);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection2700); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1121:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1124:28: ( (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1125:1: (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1125:1: (otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1125:3: otherlv_0= 'Selection' otherlv_1= '{' (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )? otherlv_8= 'from' ( (lv_from_9_0= rulePath ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSelection2737); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSelection2749); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1133:1: (otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1133:3: otherlv_2= 'where' otherlv_3= '{' ( (lv_where_4_0= ruleFilterComponent ) ) (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSelection2762); 

                        	newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getWhereKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSelection2774); 

                        	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1141:1: ( (lv_where_4_0= ruleFilterComponent ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1142:1: (lv_where_4_0= ruleFilterComponent )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1142:1: (lv_where_4_0= ruleFilterComponent )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1143:3: lv_where_4_0= ruleFilterComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection2795);
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

                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1159:2: (otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1159:4: otherlv_5= ',' ( (lv_where_6_0= ruleFilterComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSelection2808); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1163:1: ( (lv_where_6_0= ruleFilterComponent ) )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1164:1: (lv_where_6_0= ruleFilterComponent )
                    	    {
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1164:1: (lv_where_6_0= ruleFilterComponent )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1165:3: lv_where_6_0= ruleFilterComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection2829);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelection2843); 

                        	newLeafNode(otherlv_7, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSelection2857); 

                	newLeafNode(otherlv_8, grammarAccess.getSelectionAccess().getFromKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1189:1: ( (lv_from_9_0= rulePath ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1190:1: (lv_from_9_0= rulePath )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1190:1: (lv_from_9_0= rulePath )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1191:3: lv_from_9_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleSelection2878);
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

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelection2890); 

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


    // $ANTLR start "entryRuleOnName"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1219:1: entryRuleOnName returns [EObject current=null] : iv_ruleOnName= ruleOnName EOF ;
    public final EObject entryRuleOnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnName = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1220:2: (iv_ruleOnName= ruleOnName EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1221:2: iv_ruleOnName= ruleOnName EOF
            {
             newCompositeNode(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName2926);
            iv_ruleOnName=ruleOnName();

            state._fsp--;

             current =iv_ruleOnName; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName2936); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1228:1: ruleOnName returns [EObject current=null] : ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1231:28: ( ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1232:1: ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1232:1: ( () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1232:2: () otherlv_1= 'OnName' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1232:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1233:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnNameAccess().getOnNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnName2982); 

                	newLeafNode(otherlv_1, grammarAccess.getOnNameAccess().getOnNameKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1242:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1243:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1243:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1244:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnName3003);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnName3015); 

                	newLeafNode(otherlv_3, grammarAccess.getOnNameAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1264:1: (otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1264:3: otherlv_4= 'trueFalseSearch' ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnName3028); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnNameAccess().getTrueFalseSearchKeyword_4_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1268:1: ( (lv_trueFalseSearch_5_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1269:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1269:1: (lv_trueFalseSearch_5_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1270:3: lv_trueFalseSearch_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnNameAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnName3049);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnName3063); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1298:1: entryRuleOnExtension returns [EObject current=null] : iv_ruleOnExtension= ruleOnExtension EOF ;
    public final EObject entryRuleOnExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnExtension = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1299:2: (iv_ruleOnExtension= ruleOnExtension EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1300:2: iv_ruleOnExtension= ruleOnExtension EOF
            {
             newCompositeNode(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension3099);
            iv_ruleOnExtension=ruleOnExtension();

            state._fsp--;

             current =iv_ruleOnExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension3109); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1307:1: ruleOnExtension returns [EObject current=null] : ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1310:28: ( ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1311:1: ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1311:1: ( () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1311:2: () otherlv_1= 'OnExtension' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1311:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1312:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnExtensionAccess().getOnExtensionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOnExtension3155); 

                	newLeafNode(otherlv_1, grammarAccess.getOnExtensionAccess().getOnExtensionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnExtension3167); 

                	newLeafNode(otherlv_2, grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1325:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1325:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnExtension3180); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnExtensionAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1329:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1330:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1330:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1331:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnExtension3201);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1347:4: (otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1347:6: otherlv_5= 'extensions' otherlv_6= '{' ( (lv_extensions_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOnExtension3216); 

                        	newLeafNode(otherlv_5, grammarAccess.getOnExtensionAccess().getExtensionsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnExtension3228); 

                        	newLeafNode(otherlv_6, grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1355:1: ( (lv_extensions_7_0= ruleEString ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1356:1: (lv_extensions_7_0= ruleEString )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1356:1: (lv_extensions_7_0= ruleEString )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1357:3: lv_extensions_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3249);
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

                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1373:2: (otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1373:4: otherlv_8= ',' ( (lv_extensions_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOnExtension3262); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getOnExtensionAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1377:1: ( (lv_extensions_9_0= ruleEString ) )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1378:1: (lv_extensions_9_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1378:1: (lv_extensions_9_0= ruleEString )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1379:3: lv_extensions_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3283);
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
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnExtension3297); 

                        	newLeafNode(otherlv_10, grammarAccess.getOnExtensionAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnExtension3311); 

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


    // $ANTLR start "entryRuleOnTime"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1411:1: entryRuleOnTime returns [EObject current=null] : iv_ruleOnTime= ruleOnTime EOF ;
    public final EObject entryRuleOnTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTime = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1412:2: (iv_ruleOnTime= ruleOnTime EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1413:2: iv_ruleOnTime= ruleOnTime EOF
            {
             newCompositeNode(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime3347);
            iv_ruleOnTime=ruleOnTime();

            state._fsp--;

             current =iv_ruleOnTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime3357); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1420:1: ruleOnTime returns [EObject current=null] : (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1423:28: ( (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1424:1: (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1424:1: (otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1424:3: otherlv_0= 'OnTime' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleTimeUnit ) ) otherlv_10= 'timeOf' ( (lv_timeOf_11_0= ruleTimeType ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOnTime3394); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTimeAccess().getOnTimeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnTime3406); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTimeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1432:1: (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1432:3: otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnTime3419); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnTimeAccess().getTrueFalseSearchKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1436:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1437:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1437:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1438:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTimeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnTime3440);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnTime3454); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTimeAccess().getOperatorKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1458:1: ( (lv_operator_5_0= ruleOperator ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1459:1: (lv_operator_5_0= ruleOperator )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1459:1: (lv_operator_5_0= ruleOperator )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1460:3: lv_operator_5_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnTime3475);
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

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnTime3487); 

                	newLeafNode(otherlv_6, grammarAccess.getOnTimeAccess().getTresholdKeyword_5());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1480:1: ( (lv_treshold_7_0= ruleEInt ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1481:1: (lv_treshold_7_0= ruleEInt )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1481:1: (lv_treshold_7_0= ruleEInt )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1482:3: lv_treshold_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTime3508);
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

            otherlv_8=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOnTime3520); 

                	newLeafNode(otherlv_8, grammarAccess.getOnTimeAccess().getUnitKeyword_7());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1502:1: ( (lv_unit_9_0= ruleTimeUnit ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1503:1: (lv_unit_9_0= ruleTimeUnit )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1503:1: (lv_unit_9_0= ruleTimeUnit )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1504:3: lv_unit_9_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_ruleOnTime3541);
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

            otherlv_10=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOnTime3553); 

                	newLeafNode(otherlv_10, grammarAccess.getOnTimeAccess().getTimeOfKeyword_9());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1524:1: ( (lv_timeOf_11_0= ruleTimeType ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1525:1: (lv_timeOf_11_0= ruleTimeType )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1525:1: (lv_timeOf_11_0= ruleTimeType )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1526:3: lv_timeOf_11_0= ruleTimeType
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_ruleOnTime3574);
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

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnTime3586); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1554:1: entryRuleOnAttributes returns [EObject current=null] : iv_ruleOnAttributes= ruleOnAttributes EOF ;
    public final EObject entryRuleOnAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnAttributes = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1555:2: (iv_ruleOnAttributes= ruleOnAttributes EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1556:2: iv_ruleOnAttributes= ruleOnAttributes EOF
            {
             newCompositeNode(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes3622);
            iv_ruleOnAttributes=ruleOnAttributes();

            state._fsp--;

             current =iv_ruleOnAttributes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes3632); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1563:1: ruleOnAttributes returns [EObject current=null] : (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1566:28: ( (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1567:1: (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1567:1: (otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1567:3: otherlv_0= 'OnAttributes' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOnAttributes3669); 

                	newLeafNode(otherlv_0, grammarAccess.getOnAttributesAccess().getOnAttributesKeyword_0());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1571:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1572:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1572:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1573:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes3690);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnAttributes3702); 

                	newLeafNode(otherlv_2, grammarAccess.getOnAttributesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1593:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1593:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnAttributes3715); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnAttributesAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1597:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1598:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1598:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1599:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnAttributesAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnAttributes3736);
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

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOnAttributes3750); 

                	newLeafNode(otherlv_5, grammarAccess.getOnAttributesAccess().getValueKeyword_4());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1619:1: ( (lv_value_6_0= ruleEString ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1620:1: (lv_value_6_0= ruleEString )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1620:1: (lv_value_6_0= ruleEString )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1621:3: lv_value_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes3771);
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

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnAttributes3783); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1649:1: entryRuleOnTags returns [EObject current=null] : iv_ruleOnTags= ruleOnTags EOF ;
    public final EObject entryRuleOnTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTags = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1650:2: (iv_ruleOnTags= ruleOnTags EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1651:2: iv_ruleOnTags= ruleOnTags EOF
            {
             newCompositeNode(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags3819);
            iv_ruleOnTags=ruleOnTags();

            state._fsp--;

             current =iv_ruleOnTags; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags3829); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1658:1: ruleOnTags returns [EObject current=null] : ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1661:28: ( ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1662:1: ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1662:1: ( ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1662:2: ( (lv_only_0_0= 'only' ) )? otherlv_1= 'OnTags' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'treshold' ( (lv_treshold_12_0= ruleEInt ) ) otherlv_13= '}'
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1662:2: ( (lv_only_0_0= 'only' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1663:1: (lv_only_0_0= 'only' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1663:1: (lv_only_0_0= 'only' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1664:3: lv_only_0_0= 'only'
                    {
                    lv_only_0_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleOnTags3872); 

                            newLeafNode(lv_only_0_0, grammarAccess.getOnTagsAccess().getOnlyOnlyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTagsRule());
                    	        }
                           		setWithLastConsumed(current, "only", true, "only");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOnTags3898); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTagsAccess().getOnTagsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnTags3910); 

                	newLeafNode(otherlv_2, grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1685:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1685:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnTags3923); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnTagsAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1689:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1690:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1690:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1691:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnTags3944);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1707:4: (otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1707:6: otherlv_5= 'tags' otherlv_6= '{' ( (lv_tags_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOnTags3959); 

                        	newLeafNode(otherlv_5, grammarAccess.getOnTagsAccess().getTagsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnTags3971); 

                        	newLeafNode(otherlv_6, grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1715:1: ( (lv_tags_7_0= ruleEString ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1716:1: (lv_tags_7_0= ruleEString )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1716:1: (lv_tags_7_0= ruleEString )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1717:3: lv_tags_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags3992);
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

                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1733:2: (otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1733:4: otherlv_8= ',' ( (lv_tags_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOnTags4005); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getOnTagsAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1737:1: ( (lv_tags_9_0= ruleEString ) )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1738:1: (lv_tags_9_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1738:1: (lv_tags_9_0= ruleEString )
                    	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1739:3: lv_tags_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags4026);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnTags4040); 

                        	newLeafNode(otherlv_10, grammarAccess.getOnTagsAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnTags4054); 

                	newLeafNode(otherlv_11, grammarAccess.getOnTagsAccess().getTresholdKeyword_5());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1763:1: ( (lv_treshold_12_0= ruleEInt ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1764:1: (lv_treshold_12_0= ruleEInt )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1764:1: (lv_treshold_12_0= ruleEInt )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1765:3: lv_treshold_12_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTags4075);
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

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnTags4087); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1793:1: entryRuleOnSize returns [EObject current=null] : iv_ruleOnSize= ruleOnSize EOF ;
    public final EObject entryRuleOnSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSize = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1794:2: (iv_ruleOnSize= ruleOnSize EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1795:2: iv_ruleOnSize= ruleOnSize EOF
            {
             newCompositeNode(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize4123);
            iv_ruleOnSize=ruleOnSize();

            state._fsp--;

             current =iv_ruleOnSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize4133); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1802:1: ruleOnSize returns [EObject current=null] : (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1805:28: ( (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1806:1: (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1806:1: (otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1806:3: otherlv_0= 'OnSize' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'operator' ( (lv_operator_5_0= ruleOperator ) ) otherlv_6= 'treshold' ( (lv_treshold_7_0= ruleEInt ) ) otherlv_8= 'unit' ( (lv_unit_9_0= ruleMemoryUnit ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleOnSize4170); 

                	newLeafNode(otherlv_0, grammarAccess.getOnSizeAccess().getOnSizeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnSize4182); 

                	newLeafNode(otherlv_1, grammarAccess.getOnSizeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1814:1: (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1814:3: otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnSize4195); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnSizeAccess().getTrueFalseSearchKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1818:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1819:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1819:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1820:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnSizeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnSize4216);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnSize4230); 

                	newLeafNode(otherlv_4, grammarAccess.getOnSizeAccess().getOperatorKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1840:1: ( (lv_operator_5_0= ruleOperator ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1841:1: (lv_operator_5_0= ruleOperator )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1841:1: (lv_operator_5_0= ruleOperator )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1842:3: lv_operator_5_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnSize4251);
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

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnSize4263); 

                	newLeafNode(otherlv_6, grammarAccess.getOnSizeAccess().getTresholdKeyword_5());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1862:1: ( (lv_treshold_7_0= ruleEInt ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1863:1: (lv_treshold_7_0= ruleEInt )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1863:1: (lv_treshold_7_0= ruleEInt )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1864:3: lv_treshold_7_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnSize4284);
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

            otherlv_8=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOnSize4296); 

                	newLeafNode(otherlv_8, grammarAccess.getOnSizeAccess().getUnitKeyword_7());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1884:1: ( (lv_unit_9_0= ruleMemoryUnit ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1885:1: (lv_unit_9_0= ruleMemoryUnit )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1885:1: (lv_unit_9_0= ruleMemoryUnit )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1886:3: lv_unit_9_0= ruleMemoryUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_ruleOnSize4317);
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

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnSize4329); 

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


    // $ANTLR start "entryRuleFilterContainer"
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1914:1: entryRuleFilterContainer returns [EObject current=null] : iv_ruleFilterContainer= ruleFilterContainer EOF ;
    public final EObject entryRuleFilterContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterContainer = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1915:2: (iv_ruleFilterContainer= ruleFilterContainer EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1916:2: iv_ruleFilterContainer= ruleFilterContainer EOF
            {
             newCompositeNode(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer4365);
            iv_ruleFilterContainer=ruleFilterContainer();

            state._fsp--;

             current =iv_ruleFilterContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer4375); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1923:1: ruleFilterContainer returns [EObject current=null] : (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1926:28: ( (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1927:1: (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1927:1: (otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1927:3: otherlv_0= 'FilterContainer' otherlv_1= '{' (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )? otherlv_4= 'segments' otherlv_5= '{' ( (lv_segments_6_0= ruleFilterComponent ) ) (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFilterContainer4412); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterContainerAccess().getFilterContainerKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFilterContainer4424); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1935:1: (otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1935:3: otherlv_2= 'compositionType' ( (lv_compositionType_3_0= ruleCompositionType ) )
                    {
                    otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleFilterContainer4437); 

                        	newLeafNode(otherlv_2, grammarAccess.getFilterContainerAccess().getCompositionTypeKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1939:1: ( (lv_compositionType_3_0= ruleCompositionType ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1940:1: (lv_compositionType_3_0= ruleCompositionType )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1940:1: (lv_compositionType_3_0= ruleCompositionType )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1941:3: lv_compositionType_3_0= ruleCompositionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getCompositionTypeCompositionTypeEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_ruleFilterContainer4458);
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

            otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleFilterContainer4472); 

                	newLeafNode(otherlv_4, grammarAccess.getFilterContainerAccess().getSegmentsKeyword_3());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFilterContainer4484); 

                	newLeafNode(otherlv_5, grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1965:1: ( (lv_segments_6_0= ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1966:1: (lv_segments_6_0= ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1966:1: (lv_segments_6_0= ruleFilterComponent )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1967:3: lv_segments_6_0= ruleFilterComponent
            {
             
            	        newCompositeNode(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleFilterContainer4505);
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

            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1983:2: (otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1983:4: otherlv_7= ',' ( (lv_segments_8_0= ruleFilterComponent ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFilterContainer4518); 

            	        	newLeafNode(otherlv_7, grammarAccess.getFilterContainerAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1987:1: ( (lv_segments_8_0= ruleFilterComponent ) )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1988:1: (lv_segments_8_0= ruleFilterComponent )
            	    {
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1988:1: (lv_segments_8_0= ruleFilterComponent )
            	    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:1989:3: lv_segments_8_0= ruleFilterComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleFilterContainer4539);
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
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFilterContainer4553); 

                	newLeafNode(otherlv_9, grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFilterContainer4565); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2021:1: entryRuleIsEmpty returns [EObject current=null] : iv_ruleIsEmpty= ruleIsEmpty EOF ;
    public final EObject entryRuleIsEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEmpty = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2022:2: (iv_ruleIsEmpty= ruleIsEmpty EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2023:2: iv_ruleIsEmpty= ruleIsEmpty EOF
            {
             newCompositeNode(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty4601);
            iv_ruleIsEmpty=ruleIsEmpty();

            state._fsp--;

             current =iv_ruleIsEmpty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty4611); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2030:1: ruleIsEmpty returns [EObject current=null] : ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleIsEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_trueFalseSearch_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2033:28: ( ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2034:1: ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2034:1: ( () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2034:2: () otherlv_1= 'IsEmpty' otherlv_2= '{' (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2034:2: ()
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2035:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEmptyAccess().getIsEmptyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleIsEmpty4657); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEmptyAccess().getIsEmptyKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIsEmpty4669); 

                	newLeafNode(otherlv_2, grammarAccess.getIsEmptyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2048:1: (otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2048:3: otherlv_3= 'trueFalseSearch' ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleIsEmpty4682); 

                        	newLeafNode(otherlv_3, grammarAccess.getIsEmptyAccess().getTrueFalseSearchKeyword_3_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2052:1: ( (lv_trueFalseSearch_4_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2053:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2053:1: (lv_trueFalseSearch_4_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2054:3: lv_trueFalseSearch_4_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getIsEmptyAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleIsEmpty4703);
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

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIsEmpty4717); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2082:1: entryRuleOnType returns [EObject current=null] : iv_ruleOnType= ruleOnType EOF ;
    public final EObject entryRuleOnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnType = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2083:2: (iv_ruleOnType= ruleOnType EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2084:2: iv_ruleOnType= ruleOnType EOF
            {
             newCompositeNode(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType4753);
            iv_ruleOnType=ruleOnType();

            state._fsp--;

             current =iv_ruleOnType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType4763); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2091:1: ruleOnType returns [EObject current=null] : (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2094:28: ( (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2095:1: (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2095:1: (otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}' )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2095:3: otherlv_0= 'OnType' otherlv_1= '{' (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )? otherlv_4= 'type' ( (lv_type_5_0= ruleFileType ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleOnType4800); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTypeAccess().getOnTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnType4812); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTypeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2103:1: (otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2103:3: otherlv_2= 'trueFalseSearch' ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnType4825); 

                        	newLeafNode(otherlv_2, grammarAccess.getOnTypeAccess().getTrueFalseSearchKeyword_2_0());
                        
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2107:1: ( (lv_trueFalseSearch_3_0= ruleEBoolean ) )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2108:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2108:1: (lv_trueFalseSearch_3_0= ruleEBoolean )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2109:3: lv_trueFalseSearch_3_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTypeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOnType4846);
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

            otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleOnType4860); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTypeAccess().getTypeKeyword_3());
                
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2129:1: ( (lv_type_5_0= ruleFileType ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2130:1: (lv_type_5_0= ruleFileType )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2130:1: (lv_type_5_0= ruleFileType )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2131:3: lv_type_5_0= ruleFileType
            {
             
            	        newCompositeNode(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_ruleOnType4881);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOnType4893); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2159:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2160:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2161:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4930);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4941); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2168:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2171:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2172:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2172:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2172:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2172:2: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2173:2: kw= '-'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleEInt4980); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4997); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2193:1: ruleStrategies returns [Enumerator current=null] : ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) ;
    public final Enumerator ruleStrategies() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2195:28: ( ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2196:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2196:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt30=1;
                }
                break;
            case 58:
                {
                alt30=2;
                }
                break;
            case 59:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2196:2: (enumLiteral_0= 'forced' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2196:2: (enumLiteral_0= 'forced' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2196:4: enumLiteral_0= 'forced'
                    {
                    enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleStrategies5056); 

                            current = grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2202:6: (enumLiteral_1= 'append' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2202:6: (enumLiteral_1= 'append' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2202:8: enumLiteral_1= 'append'
                    {
                    enumLiteral_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleStrategies5073); 

                            current = grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2208:6: (enumLiteral_2= 'carefully' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2208:6: (enumLiteral_2= 'carefully' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2208:8: enumLiteral_2= 'carefully'
                    {
                    enumLiteral_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleStrategies5090); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2218:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2220:28: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2221:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2221:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'less' ) | (enumLiteral_2= 'more' ) | (enumLiteral_3= 'less_equal' ) | (enumLiteral_4= 'more_equal' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt31=1;
                }
                break;
            case 61:
                {
                alt31=2;
                }
                break;
            case 62:
                {
                alt31=3;
                }
                break;
            case 63:
                {
                alt31=4;
                }
                break;
            case 64:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2221:2: (enumLiteral_0= 'equal' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2221:2: (enumLiteral_0= 'equal' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2221:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleOperator5135); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2227:6: (enumLiteral_1= 'less' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2227:6: (enumLiteral_1= 'less' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2227:8: enumLiteral_1= 'less'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleOperator5152); 

                            current = grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2233:6: (enumLiteral_2= 'more' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2233:6: (enumLiteral_2= 'more' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2233:8: enumLiteral_2= 'more'
                    {
                    enumLiteral_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleOperator5169); 

                            current = grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2239:6: (enumLiteral_3= 'less_equal' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2239:6: (enumLiteral_3= 'less_equal' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2239:8: enumLiteral_3= 'less_equal'
                    {
                    enumLiteral_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleOperator5186); 

                            current = grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2245:6: (enumLiteral_4= 'more_equal' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2245:6: (enumLiteral_4= 'more_equal' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2245:8: enumLiteral_4= 'more_equal'
                    {
                    enumLiteral_4=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleOperator5203); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2255:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) ) ;
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
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2257:28: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2258:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2258:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) | (enumLiteral_4= 'month' ) | (enumLiteral_5= 'year' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt32=1;
                }
                break;
            case 66:
                {
                alt32=2;
                }
                break;
            case 67:
                {
                alt32=3;
                }
                break;
            case 68:
                {
                alt32=4;
                }
                break;
            case 69:
                {
                alt32=5;
                }
                break;
            case 70:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2258:2: (enumLiteral_0= 'min' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2258:2: (enumLiteral_0= 'min' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2258:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleTimeUnit5248); 

                            current = grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2264:6: (enumLiteral_1= 'hour' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2264:6: (enumLiteral_1= 'hour' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2264:8: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTimeUnit5265); 

                            current = grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2270:6: (enumLiteral_2= 'day' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2270:6: (enumLiteral_2= 'day' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2270:8: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTimeUnit5282); 

                            current = grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2276:6: (enumLiteral_3= 'week' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2276:6: (enumLiteral_3= 'week' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2276:8: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTimeUnit5299); 

                            current = grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2282:6: (enumLiteral_4= 'month' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2282:6: (enumLiteral_4= 'month' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2282:8: enumLiteral_4= 'month'
                    {
                    enumLiteral_4=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTimeUnit5316); 

                            current = grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2288:6: (enumLiteral_5= 'year' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2288:6: (enumLiteral_5= 'year' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2288:8: enumLiteral_5= 'year'
                    {
                    enumLiteral_5=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTimeUnit5333); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2298:1: ruleTimeType returns [Enumerator current=null] : ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) ) ;
    public final Enumerator ruleTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2300:28: ( ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2301:1: ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2301:1: ( (enumLiteral_0= 'modification' ) | (enumLiteral_1= 'cretion' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==71) ) {
                alt33=1;
            }
            else if ( (LA33_0==72) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2301:2: (enumLiteral_0= 'modification' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2301:2: (enumLiteral_0= 'modification' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2301:4: enumLiteral_0= 'modification'
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleTimeType5378); 

                            current = grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2307:6: (enumLiteral_1= 'cretion' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2307:6: (enumLiteral_1= 'cretion' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2307:8: enumLiteral_1= 'cretion'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleTimeType5395); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2317:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) ;
    public final Enumerator ruleMemoryUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2319:28: ( ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2320:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2320:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt34=1;
                }
                break;
            case 74:
                {
                alt34=2;
                }
                break;
            case 75:
                {
                alt34=3;
                }
                break;
            case 76:
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
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2320:2: (enumLiteral_0= 'KB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2320:2: (enumLiteral_0= 'KB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2320:4: enumLiteral_0= 'KB'
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleMemoryUnit5440); 

                            current = grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2326:6: (enumLiteral_1= 'MB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2326:6: (enumLiteral_1= 'MB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2326:8: enumLiteral_1= 'MB'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleMemoryUnit5457); 

                            current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2332:6: (enumLiteral_2= 'GB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2332:6: (enumLiteral_2= 'GB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2332:8: enumLiteral_2= 'GB'
                    {
                    enumLiteral_2=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleMemoryUnit5474); 

                            current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2338:6: (enumLiteral_3= 'TB' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2338:6: (enumLiteral_3= 'TB' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2338:8: enumLiteral_3= 'TB'
                    {
                    enumLiteral_3=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleMemoryUnit5491); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2348:1: ruleCompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) ) ;
    public final Enumerator ruleCompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2350:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2351:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2351:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'none' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt35=1;
                }
                break;
            case 78:
                {
                alt35=2;
                }
                break;
            case 79:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2351:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2351:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2351:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleCompositionType5536); 

                            current = grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2357:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2357:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2357:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleCompositionType5553); 

                            current = grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2363:6: (enumLiteral_2= 'none' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2363:6: (enumLiteral_2= 'none' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2363:8: enumLiteral_2= 'none'
                    {
                    enumLiteral_2=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleCompositionType5570); 

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
    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2373:1: ruleFileType returns [Enumerator current=null] : ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) ) ;
    public final Enumerator ruleFileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2375:28: ( ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) ) )
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2376:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) )
            {
            // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2376:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Folder' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==80) ) {
                alt36=1;
            }
            else if ( (LA36_0==81) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2376:2: (enumLiteral_0= 'Document' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2376:2: (enumLiteral_0= 'Document' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2376:4: enumLiteral_0= 'Document'
                    {
                    enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleFileType5615); 

                            current = grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2382:6: (enumLiteral_1= 'Folder' )
                    {
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2382:6: (enumLiteral_1= 'Folder' )
                    // ../org.xtext.example.miniFetl/src-gen/org/xtext/example/miniFetl/parser/antlr/internal/InternalFetl.g:2382:8: enumLiteral_1= 'Folder'
                    {
                    enumLiteral_1=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleFileType5632); 

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
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel168 = new BitSet(new long[]{0x0000000001710000L});
        public static final BitSet FOLLOW_ruleExecution_in_ruleModel189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel202 = new BitSet(new long[]{0x0000000001710000L});
        public static final BitSet FOLLOW_ruleExecution_in_ruleModel223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModel251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_entryRuleExecution287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExecution297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_ruleExecution344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleExecution371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_ruleExecution398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_ruleExecution425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_ruleExecution452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_ruleGenericStep544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_ruleGenericStep571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_ruleGenericStep598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_ruleFilterComponent690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_ruleFilterComponent717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_ruleFilterComponent744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_ruleFilterComponent771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_ruleFilterComponent798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_ruleFilterComponent825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_ruleFilterComponent852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_ruleFilterComponent879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_ruleFilterComponent906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleCopy988 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCopy1000 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleCopy1013 = new BitSet(new long[]{0x0E00000000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleCopy1034 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCopy1048 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCopy1071 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCopy1083 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rulePath_in_ruleCopy1104 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCopy1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1152 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleMove1199 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMove1211 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleMove1224 = new BitSet(new long[]{0x0E00000000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleMove1245 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMove1259 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove1282 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMove1294 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rulePath_in_ruleMove1315 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMove1327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete1363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete1373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleDelete1410 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDelete1422 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDelete1434 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelete1457 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDelete1469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_entryRulePathVariable1505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathVariable1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePathVariable1552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePathVariable1573 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePathVariable1585 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePathVariable1597 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rulePath_in_rulePathVariable1618 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePathVariable1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable1666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionVariable1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleSelectionVariable1713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectionVariable1734 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSelectionVariable1746 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSelectionVariable1758 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleSelection_in_ruleSelectionVariable1779 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSelectionVariable1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath1827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath1837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rulePath1874 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePath1886 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_rulePath1899 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rulePath1920 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePath1934 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePath1946 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath1967 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePath1980 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath2001 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePath2015 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePath2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEBoolean2113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEBoolean2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep2172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleConcreteStep2219 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConcreteStep2231 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleConcreteStep2243 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConcreteStep2264 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleConcreteStep2276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep2312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleVariableStep2359 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleVariableStep2371 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleVariableStep2383 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableStep2406 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleVariableStep2418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep2454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep2464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleParametrizedStep2510 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParametrizedStep2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection2690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSelection2737 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSelection2749 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_34_in_ruleSelection2762 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSelection2774 = new BitSet(new long[]{0x0066E15000000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection2795 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSelection2808 = new BitSet(new long[]{0x0066E15000000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection2829 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSelection2843 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleSelection2857 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rulePath_in_ruleSelection2878 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSelection2890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName2926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleOnName2982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnName3003 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnName3015 = new BitSet(new long[]{0x0000002000008000L});
        public static final BitSet FOLLOW_37_in_ruleOnName3028 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnName3049 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnName3063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension3099 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension3109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOnExtension3155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnExtension3167 = new BitSet(new long[]{0x000000A000008000L});
        public static final BitSet FOLLOW_37_in_ruleOnExtension3180 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnExtension3201 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleOnExtension3216 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnExtension3228 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3249 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOnExtension3262 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3283 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOnExtension3297 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnExtension3311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime3347 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime3357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleOnTime3394 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnTime3406 = new BitSet(new long[]{0x0000022000000000L});
        public static final BitSet FOLLOW_37_in_ruleOnTime3419 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnTime3440 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleOnTime3454 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnTime3475 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOnTime3487 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTime3508 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleOnTime3520 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007EL});
        public static final BitSet FOLLOW_ruleTimeUnit_in_ruleOnTime3541 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleOnTime3553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
        public static final BitSet FOLLOW_ruleTimeType_in_ruleOnTime3574 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnTime3586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes3622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes3632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleOnAttributes3669 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes3690 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnAttributes3702 = new BitSet(new long[]{0x0000002000800000L});
        public static final BitSet FOLLOW_37_in_ruleOnAttributes3715 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnAttributes3736 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleOnAttributes3750 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes3771 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnAttributes3783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags3819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags3829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleOnTags3872 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleOnTags3898 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnTags3910 = new BitSet(new long[]{0x0001042000000000L});
        public static final BitSet FOLLOW_37_in_ruleOnTags3923 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnTags3944 = new BitSet(new long[]{0x0001040000000000L});
        public static final BitSet FOLLOW_48_in_ruleOnTags3959 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnTags3971 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags3992 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOnTags4005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags4026 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOnTags4040 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOnTags4054 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTags4075 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnTags4087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize4123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize4133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleOnSize4170 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnSize4182 = new BitSet(new long[]{0x0000022000000000L});
        public static final BitSet FOLLOW_37_in_ruleOnSize4195 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnSize4216 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleOnSize4230 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnSize4251 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOnSize4263 = new BitSet(new long[]{0x0100000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnSize4284 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleOnSize4296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E00L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_ruleOnSize4317 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnSize4329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer4365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleFilterContainer4412 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFilterContainer4424 = new BitSet(new long[]{0x0018000000000000L});
        public static final BitSet FOLLOW_51_in_ruleFilterContainer4437 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
        public static final BitSet FOLLOW_ruleCompositionType_in_ruleFilterContainer4458 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleFilterContainer4472 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFilterContainer4484 = new BitSet(new long[]{0x0066E15000000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleFilterContainer4505 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleFilterContainer4518 = new BitSet(new long[]{0x0066E15000000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleFilterContainer4539 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleFilterContainer4553 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFilterContainer4565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty4601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty4611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleIsEmpty4657 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIsEmpty4669 = new BitSet(new long[]{0x0000002000008000L});
        public static final BitSet FOLLOW_37_in_ruleIsEmpty4682 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleIsEmpty4703 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIsEmpty4717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType4753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType4763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleOnType4800 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnType4812 = new BitSet(new long[]{0x0080002000000000L});
        public static final BitSet FOLLOW_37_in_ruleOnType4825 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOnType4846 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleOnType4860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_ruleFileType_in_ruleOnType4881 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOnType4893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleEInt4980 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleStrategies5056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleStrategies5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleStrategies5090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleOperator5135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleOperator5152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleOperator5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleOperator5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleOperator5203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTimeUnit5248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTimeUnit5265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTimeUnit5282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTimeUnit5299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTimeUnit5316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTimeUnit5333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTimeType5378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleTimeType5395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleMemoryUnit5440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleMemoryUnit5457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleMemoryUnit5474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleMemoryUnit5491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleCompositionType5536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleCompositionType5553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleCompositionType5570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleFileType5615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleFileType5632 = new BitSet(new long[]{0x0000000000000002L});
    }


}