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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'/'", "':'", "'?'", "'{$'", "'}'", "'select'", "'from'", "'where'", "'copy'", "'to'", "'strategy:'", "'move'", "'delete'", "'('", "')'", "'and'", "'or'", "'attribute'", "'not'", "'exist'", "'is'", "'in ['", "','", "']'", "'are'", "'in tags'", "'and no more tags'", "'before'", "'size of file'", "'name is'", "'extension is'", "'empty'", "'file'", "'-'", "'forced'", "'append'", "'carefully'", "'=='", "'<'", "'>'", "'<='", "'>='", "'mins'", "'hours'", "'days'", "'weeks'", "'months'", "'years'", "'modified'", "'created'", "'any are'", "'all are'", "'KB'", "'MB'", "'GB'", "'TB'", "'Document'", "'Directory'"
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:386:1: ruleConcreteStep returns [EObject current=null] : ( ( (lv_value_0_0= ruleEString ) ) ( (lv_absolute_1_0= ':' ) )? ) ;
    public final EObject ruleConcreteStep() throws RecognitionException {
        EObject current = null;

        Token lv_absolute_1_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:389:28: ( ( ( (lv_value_0_0= ruleEString ) ) ( (lv_absolute_1_0= ':' ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:1: ( ( (lv_value_0_0= ruleEString ) ) ( (lv_absolute_1_0= ':' ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:1: ( ( (lv_value_0_0= ruleEString ) ) ( (lv_absolute_1_0= ':' ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:390:2: ( (lv_value_0_0= ruleEString ) ) ( (lv_absolute_1_0= ':' ) )?
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:408:2: ( (lv_absolute_1_0= ':' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:409:1: (lv_absolute_1_0= ':' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:409:1: (lv_absolute_1_0= ':' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:410:3: lv_absolute_1_0= ':'
                    {
                    lv_absolute_1_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConcreteStep885); 

                            newLeafNode(lv_absolute_1_0, grammarAccess.getConcreteStepAccess().getAbsoluteColonKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConcreteStepRule());
                    	        }
                           		setWithLastConsumed(current, "absolute", true, ":");
                    	    

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
    // $ANTLR end "ruleConcreteStep"


    // $ANTLR start "entryRuleVariableStep"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:431:1: entryRuleVariableStep returns [EObject current=null] : iv_ruleVariableStep= ruleVariableStep EOF ;
    public final EObject entryRuleVariableStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:432:2: (iv_ruleVariableStep= ruleVariableStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:433:2: iv_ruleVariableStep= ruleVariableStep EOF
            {
             newCompositeNode(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep935);
            iv_ruleVariableStep=ruleVariableStep();

            state._fsp--;

             current =iv_ruleVariableStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep945); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:440:1: ruleVariableStep returns [EObject current=null] : (otherlv_0= '?' ( ( ruleEString ) ) ) ;
    public final EObject ruleVariableStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:443:28: ( (otherlv_0= '?' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:444:1: (otherlv_0= '?' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:444:1: (otherlv_0= '?' ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:444:3: otherlv_0= '?' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVariableStep982); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableStepAccess().getQuestionMarkKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:448:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:449:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:449:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:450:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableStepRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariableStep1005);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:471:1: entryRuleParametrizedStep returns [EObject current=null] : iv_ruleParametrizedStep= ruleParametrizedStep EOF ;
    public final EObject entryRuleParametrizedStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametrizedStep = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:472:2: (iv_ruleParametrizedStep= ruleParametrizedStep EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:473:2: iv_ruleParametrizedStep= ruleParametrizedStep EOF
            {
             newCompositeNode(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep1041);
            iv_ruleParametrizedStep=ruleParametrizedStep();

            state._fsp--;

             current =iv_ruleParametrizedStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep1051); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:480:1: ruleParametrizedStep returns [EObject current=null] : ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) ;
    public final EObject ruleParametrizedStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:483:28: ( ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:484:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:484:1: ( () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:484:2: () otherlv_1= '{$' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '}'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:484:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:485:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParametrizedStep1097); 

                	newLeafNode(otherlv_1, grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:494:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:495:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:495:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:496:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParametrizedStep1118);
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

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleParametrizedStep1130); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:524:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:525:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:526:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection1166);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection1176); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:533:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) )? ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_from_3_0 = null;

        EObject lv_where_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:536:28: ( (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:537:1: (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:537:1: (otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:537:3: otherlv_0= 'select' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (lv_from_3_0= rulePath ) ) (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSelection1213); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:541:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:542:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:542:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:543:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelection1234);
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

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSelection1246); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getFromKeyword_2());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:563:1: ( (lv_from_3_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:564:1: (lv_from_3_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:564:1: (lv_from_3_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:565:3: lv_from_3_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleSelection1267);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:581:2: (otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:581:4: otherlv_4= 'where' ( (lv_where_5_0= ruleFilterComponent ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSelection1280); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getWhereKeyword_4_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:585:1: ( (lv_where_5_0= ruleFilterComponent ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:586:1: (lv_where_5_0= ruleFilterComponent )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:586:1: (lv_where_5_0= ruleFilterComponent )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:587:3: lv_where_5_0= ruleFilterComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleSelection1301);
                    lv_where_5_0=ruleFilterComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	        }
                           		set(
                           			current, 
                           			"where",
                            		lv_where_5_0, 
                            		"FilterComponent");
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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleCopy"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:611:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:612:2: (iv_ruleCopy= ruleCopy EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:613:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy1339);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy1349); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:620:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:623:28: ( (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:624:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:624:1: (otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:624:3: otherlv_0= 'copy' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCopy1386); 

                	newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCopyKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCopy1398); 

                	newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:632:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:633:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:633:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:634:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCopy1421);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCopy1433); 

                	newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getToKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:651:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:652:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:652:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:653:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleCopy1454);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:669:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:669:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCopy1467); 

                        	newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:673:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:674:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:674:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:675:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleCopy1488);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:699:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:700:2: (iv_ruleMove= ruleMove EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:701:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove1526);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove1536); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:708:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:711:28: ( (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:712:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:712:1: (otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:712:3: otherlv_0= 'move' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( (lv_destination_4_0= rulePath ) ) (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMove1573); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMove1585); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:720:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:721:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:721:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:722:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove1608);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMove1620); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getToKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:739:1: ( (lv_destination_4_0= rulePath ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:740:1: (lv_destination_4_0= rulePath )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:740:1: (lv_destination_4_0= rulePath )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:741:3: lv_destination_4_0= rulePath
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePath_in_ruleMove1641);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:757:2: (otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:757:4: otherlv_5= 'strategy:' ( (lv_strategy_6_0= ruleStrategies ) )
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMove1654); 

                        	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getStrategyKeyword_5_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:761:1: ( (lv_strategy_6_0= ruleStrategies ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:762:1: (lv_strategy_6_0= ruleStrategies )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:762:1: (lv_strategy_6_0= ruleStrategies )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:763:3: lv_strategy_6_0= ruleStrategies
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_ruleMove1675);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:787:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:788:2: (iv_ruleDelete= ruleDelete EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:789:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete1713);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete1723); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:796:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:799:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:800:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:800:1: (otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:800:3: otherlv_0= 'delete' otherlv_1= 'from' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDelete1760); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDelete1772); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getFromKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:808:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:809:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:809:1: ( ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:810:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDeleteAccess().getSourceSelectionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDelete1795);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:831:1: entryRuleFilterContainer returns [EObject current=null] : iv_ruleFilterContainer= ruleFilterContainer EOF ;
    public final EObject entryRuleFilterContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterContainer = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:832:2: (iv_ruleFilterContainer= ruleFilterContainer EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:833:2: iv_ruleFilterContainer= ruleFilterContainer EOF
            {
             newCompositeNode(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1831);
            iv_ruleFilterContainer=ruleFilterContainer();

            state._fsp--;

             current =iv_ruleFilterContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer1841); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:840:1: ruleFilterContainer returns [EObject current=null] : (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' ) ;
    public final EObject ruleFilterContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_links_1_0 = null;

        EObject lv_links_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:843:28: ( (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:844:1: (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:844:1: (otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:844:3: otherlv_0= '(' ( (lv_links_1_0= ruleLink ) ) ( (lv_links_2_0= ruleLink ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFilterContainer1878); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:848:1: ( (lv_links_1_0= ruleLink ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:849:1: (lv_links_1_0= ruleLink )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:849:1: (lv_links_1_0= ruleLink )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:850:3: lv_links_1_0= ruleLink
            {
             
            	        newCompositeNode(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleFilterContainer1899);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:866:2: ( (lv_links_2_0= ruleLink ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26||(LA9_0>=28 && LA9_0<=30)||(LA9_0>=33 && LA9_0<=34)||(LA9_0>=41 && LA9_0<=43)||LA9_0==45||(LA9_0>=61 && LA9_0<=62)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:867:1: (lv_links_2_0= ruleLink )
            	    {
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:867:1: (lv_links_2_0= ruleLink )
            	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:868:3: lv_links_2_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleFilterContainer1920);
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

            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFilterContainer1933); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:896:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:897:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:898:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink1969);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink1979); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:905:1: ruleLink returns [EObject current=null] : ( ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )? ( (lv_element_2_0= ruleFilterComponent ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_and_0_0=null;
        Token lv_or_1_0=null;
        EObject lv_element_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:908:28: ( ( ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )? ( (lv_element_2_0= ruleFilterComponent ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:909:1: ( ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )? ( (lv_element_2_0= ruleFilterComponent ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:909:1: ( ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )? ( (lv_element_2_0= ruleFilterComponent ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:909:2: ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )? ( (lv_element_2_0= ruleFilterComponent ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:909:2: ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:909:3: ( (lv_and_0_0= 'and' ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:909:3: ( (lv_and_0_0= 'and' ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:910:1: (lv_and_0_0= 'and' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:910:1: (lv_and_0_0= 'and' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:911:3: lv_and_0_0= 'and'
                    {
                    lv_and_0_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLink2023); 

                            newLeafNode(lv_and_0_0, grammarAccess.getLinkAccess().getAndAndKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "and", true, "and");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:925:6: ( (lv_or_1_0= 'or' ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:925:6: ( (lv_or_1_0= 'or' ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:926:1: (lv_or_1_0= 'or' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:926:1: (lv_or_1_0= 'or' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:927:3: lv_or_1_0= 'or'
                    {
                    lv_or_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLink2060); 

                            newLeafNode(lv_or_1_0, grammarAccess.getLinkAccess().getOrOrKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(current, "or", true, "or");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:940:4: ( (lv_element_2_0= ruleFilterComponent ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:941:1: (lv_element_2_0= ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:941:1: (lv_element_2_0= ruleFilterComponent )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:942:3: lv_element_2_0= ruleFilterComponent
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getElementFilterComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_ruleLink2096);
            lv_element_2_0=ruleFilterComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_2_0, 
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:966:1: entryRuleFilterComponent returns [EObject current=null] : iv_ruleFilterComponent= ruleFilterComponent EOF ;
    public final EObject entryRuleFilterComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterComponent = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:967:2: (iv_ruleFilterComponent= ruleFilterComponent EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:968:2: iv_ruleFilterComponent= ruleFilterComponent EOF
            {
             newCompositeNode(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent2132);
            iv_ruleFilterComponent=ruleFilterComponent();

            state._fsp--;

             current =iv_ruleFilterComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent2142); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:975:1: ruleFilterComponent returns [EObject current=null] : (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:978:28: ( (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:979:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:979:1: (this_OnName_0= ruleOnName | this_OnExtension_1= ruleOnExtension | this_OnTime_2= ruleOnTime | this_OnAttributes_3= ruleOnAttributes | this_OnTags_4= ruleOnTags | this_OnSize_5= ruleOnSize | this_FilterContainer_6= ruleFilterContainer | this_IsEmpty_7= ruleIsEmpty | this_OnType_8= ruleOnType )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case 43:
                {
                alt11=2;
                }
                break;
            case 61:
            case 62:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            case 26:
                {
                alt11=7;
                }
                break;
            case 33:
                {
                alt11=8;
                }
                break;
            case 45:
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:980:5: this_OnName_0= ruleOnName
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_ruleFilterComponent2189);
                    this_OnName_0=ruleOnName();

                    state._fsp--;

                     
                            current = this_OnName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:990:5: this_OnExtension_1= ruleOnExtension
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_ruleFilterComponent2216);
                    this_OnExtension_1=ruleOnExtension();

                    state._fsp--;

                     
                            current = this_OnExtension_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1000:5: this_OnTime_2= ruleOnTime
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_ruleFilterComponent2243);
                    this_OnTime_2=ruleOnTime();

                    state._fsp--;

                     
                            current = this_OnTime_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1010:5: this_OnAttributes_3= ruleOnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_ruleFilterComponent2270);
                    this_OnAttributes_3=ruleOnAttributes();

                    state._fsp--;

                     
                            current = this_OnAttributes_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1020:5: this_OnTags_4= ruleOnTags
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_ruleFilterComponent2297);
                    this_OnTags_4=ruleOnTags();

                    state._fsp--;

                     
                            current = this_OnTags_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1030:5: this_OnSize_5= ruleOnSize
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_ruleFilterComponent2324);
                    this_OnSize_5=ruleOnSize();

                    state._fsp--;

                     
                            current = this_OnSize_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1040:5: this_FilterContainer_6= ruleFilterContainer
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_ruleFilterComponent2351);
                    this_FilterContainer_6=ruleFilterContainer();

                    state._fsp--;

                     
                            current = this_FilterContainer_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1050:5: this_IsEmpty_7= ruleIsEmpty
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_ruleFilterComponent2378);
                    this_IsEmpty_7=ruleIsEmpty();

                    state._fsp--;

                     
                            current = this_IsEmpty_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1060:5: this_OnType_8= ruleOnType
                    {
                     
                            newCompositeNode(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_ruleFilterComponent2405);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1076:1: entryRuleOnAttributes returns [EObject current=null] : iv_ruleOnAttributes= ruleOnAttributes EOF ;
    public final EObject entryRuleOnAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnAttributes = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1077:2: (iv_ruleOnAttributes= ruleOnAttributes EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1078:2: iv_ruleOnAttributes= ruleOnAttributes EOF
            {
             newCompositeNode(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes2440);
            iv_ruleOnAttributes=ruleOnAttributes();

            state._fsp--;

             current =iv_ruleOnAttributes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes2450); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1085:1: ruleOnAttributes returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1088:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1089:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1089:1: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1089:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOnAttributes2487); 

                	newLeafNode(otherlv_0, grammarAccess.getOnAttributesAccess().getAttributeKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1093:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1094:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1094:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1095:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes2508);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1111:2: ( ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' ) | (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=32)) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1111:3: ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1111:3: ( ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1111:4: ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'exist'
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1111:4: ( (lv_inverse_2_0= 'not' ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==31) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1112:1: (lv_inverse_2_0= 'not' )
                            {
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1112:1: (lv_inverse_2_0= 'not' )
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1113:3: lv_inverse_2_0= 'not'
                            {
                            lv_inverse_2_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnAttributes2528); 

                                    newLeafNode(lv_inverse_2_0, grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOnAttributesRule());
                            	        }
                                   		setWithLastConsumed(current, "inverse", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOnAttributes2554); 

                        	newLeafNode(otherlv_3, grammarAccess.getOnAttributesAccess().getExistKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1131:6: (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1131:6: (otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1131:8: otherlv_4= 'is' ( (lv_inverse_5_0= 'not' ) )? ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnAttributes2574); 

                        	newLeafNode(otherlv_4, grammarAccess.getOnAttributesAccess().getIsKeyword_2_1_0());
                        
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1135:1: ( (lv_inverse_5_0= 'not' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==31) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1136:1: (lv_inverse_5_0= 'not' )
                            {
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1136:1: (lv_inverse_5_0= 'not' )
                            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1137:3: lv_inverse_5_0= 'not'
                            {
                            lv_inverse_5_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnAttributes2592); 

                                    newLeafNode(lv_inverse_5_0, grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getOnAttributesRule());
                            	        }
                                   		setWithLastConsumed(current, "inverse", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1150:3: ( (lv_value_6_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1151:1: (lv_value_6_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1151:1: (lv_value_6_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1152:3: lv_value_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnAttributes2627);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1176:1: entryRuleOnTags returns [EObject current=null] : iv_ruleOnTags= ruleOnTags EOF ;
    public final EObject entryRuleOnTags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTags = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1177:2: (iv_ruleOnTags= ruleOnTags EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1178:2: iv_ruleOnTags= ruleOnTags EOF
            {
             newCompositeNode(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags2665);
            iv_ruleOnTags=ruleOnTags();

            state._fsp--;

             current =iv_ruleOnTags; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags2675); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1185:1: ruleOnTags returns [EObject current=null] : (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1188:28: ( (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1189:1: (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1189:1: (otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )? )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1189:3: otherlv_0= 'in [' ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )? otherlv_4= ']' ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) ) ( (lv_inverse_8_0= 'not' ) )? otherlv_9= 'in tags' ( (lv_only_10_0= 'and no more tags' ) )?
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOnTags2712); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTagsAccess().getInKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1193:1: ( ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1193:2: ( (lv_tags_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1193:2: ( (lv_tags_1_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1194:1: (lv_tags_1_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1194:1: (lv_tags_1_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1195:3: lv_tags_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags2734);
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

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1211:2: (otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==35) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1211:4: otherlv_2= ',' ( (lv_tags_3_0= ruleEString ) )
                    	    {
                    	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOnTags2747); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1215:1: ( (lv_tags_3_0= ruleEString ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1216:1: (lv_tags_3_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1216:1: (lv_tags_3_0= ruleEString )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1217:3: lv_tags_3_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnTags2768);
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

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnTags2784); 

                	newLeafNode(otherlv_4, grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1237:1: ( ( (lv_quantificator_5_0= ruleQuantificators ) ) | ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=63 && LA17_0<=64)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT||LA17_0==46) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1237:2: ( (lv_quantificator_5_0= ruleQuantificators ) )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1237:2: ( (lv_quantificator_5_0= ruleQuantificators ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1238:1: (lv_quantificator_5_0= ruleQuantificators )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1238:1: (lv_quantificator_5_0= ruleQuantificators )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1239:3: lv_quantificator_5_0= ruleQuantificators
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getQuantificatorQuantificatorsEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuantificators_in_ruleOnTags2806);
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1256:6: ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1256:6: ( ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1256:7: ( (lv_treshold_6_0= ruleEInt ) ) otherlv_7= 'are'
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1256:7: ( (lv_treshold_6_0= ruleEInt ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1257:1: (lv_treshold_6_0= ruleEInt )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1257:1: (lv_treshold_6_0= ruleEInt )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1258:3: lv_treshold_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTags2834);
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

                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOnTags2846); 

                        	newLeafNode(otherlv_7, grammarAccess.getOnTagsAccess().getAreKeyword_3_1_1());
                        

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1278:3: ( (lv_inverse_8_0= 'not' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1279:1: (lv_inverse_8_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1279:1: (lv_inverse_8_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1280:3: lv_inverse_8_0= 'not'
                    {
                    lv_inverse_8_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnTags2866); 

                            newLeafNode(lv_inverse_8_0, grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTagsRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOnTags2892); 

                	newLeafNode(otherlv_9, grammarAccess.getOnTagsAccess().getInTagsKeyword_5());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1297:1: ( (lv_only_10_0= 'and no more tags' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1298:1: (lv_only_10_0= 'and no more tags' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1298:1: (lv_only_10_0= 'and no more tags' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1299:3: lv_only_10_0= 'and no more tags'
                    {
                    lv_only_10_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOnTags2910); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1320:1: entryRuleOnTime returns [EObject current=null] : iv_ruleOnTime= ruleOnTime EOF ;
    public final EObject entryRuleOnTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnTime = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1321:2: (iv_ruleOnTime= ruleOnTime EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1322:2: iv_ruleOnTime= ruleOnTime EOF
            {
             newCompositeNode(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime2960);
            iv_ruleOnTime=ruleOnTime();

            state._fsp--;

             current =iv_ruleOnTime; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime2970); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1329:1: ruleOnTime returns [EObject current=null] : ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleOnTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_timeOf_0_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_treshold_3_0 = null;

        Enumerator lv_unit_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1332:28: ( ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1333:1: ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1333:1: ( ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1333:2: ( (lv_timeOf_0_0= ruleTimeType ) ) otherlv_1= 'before' ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleTimeUnit ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1333:2: ( (lv_timeOf_0_0= ruleTimeType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1334:1: (lv_timeOf_0_0= ruleTimeType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1334:1: (lv_timeOf_0_0= ruleTimeType )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1335:3: lv_timeOf_0_0= ruleTimeType
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_ruleOnTime3016);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOnTime3028); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTimeAccess().getBeforeKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1355:1: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1356:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1356:1: (lv_operator_2_0= ruleOperator )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1357:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnTime3049);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1373:2: ( (lv_treshold_3_0= ruleEInt ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1374:1: (lv_treshold_3_0= ruleEInt )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1374:1: (lv_treshold_3_0= ruleEInt )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1375:3: lv_treshold_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnTime3070);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1391:2: ( (lv_unit_4_0= ruleTimeUnit ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1392:1: (lv_unit_4_0= ruleTimeUnit )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1392:1: (lv_unit_4_0= ruleTimeUnit )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1393:3: lv_unit_4_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_ruleOnTime3091);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1417:1: entryRuleOnSize returns [EObject current=null] : iv_ruleOnSize= ruleOnSize EOF ;
    public final EObject entryRuleOnSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnSize = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1418:2: (iv_ruleOnSize= ruleOnSize EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1419:2: iv_ruleOnSize= ruleOnSize EOF
            {
             newCompositeNode(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize3127);
            iv_ruleOnSize=ruleOnSize();

            state._fsp--;

             current =iv_ruleOnSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize3137); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1426:1: ruleOnSize returns [EObject current=null] : (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) ) ;
    public final EObject ruleOnSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inverse_1_0=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_treshold_3_0 = null;

        Enumerator lv_unit_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1429:28: ( (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1430:1: (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1430:1: (otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1430:3: otherlv_0= 'size of file' ( (lv_inverse_1_0= 'not' ) )? ( (lv_operator_2_0= ruleOperator ) ) ( (lv_treshold_3_0= ruleEInt ) ) ( (lv_unit_4_0= ruleMemoryUnit ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOnSize3174); 

                	newLeafNode(otherlv_0, grammarAccess.getOnSizeAccess().getSizeOfFileKeyword_0());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1434:1: ( (lv_inverse_1_0= 'not' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1435:1: (lv_inverse_1_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1435:1: (lv_inverse_1_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1436:3: lv_inverse_1_0= 'not'
                    {
                    lv_inverse_1_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnSize3192); 

                            newLeafNode(lv_inverse_1_0, grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnSizeRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1449:3: ( (lv_operator_2_0= ruleOperator ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1450:1: (lv_operator_2_0= ruleOperator )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1450:1: (lv_operator_2_0= ruleOperator )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1451:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOnSize3227);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1467:2: ( (lv_treshold_3_0= ruleEInt ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1468:1: (lv_treshold_3_0= ruleEInt )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1468:1: (lv_treshold_3_0= ruleEInt )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1469:3: lv_treshold_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOnSize3248);
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

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1485:2: ( (lv_unit_4_0= ruleMemoryUnit ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1486:1: (lv_unit_4_0= ruleMemoryUnit )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1486:1: (lv_unit_4_0= ruleMemoryUnit )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1487:3: lv_unit_4_0= ruleMemoryUnit
            {
             
            	        newCompositeNode(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_ruleOnSize3269);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1511:1: entryRuleOnName returns [EObject current=null] : iv_ruleOnName= ruleOnName EOF ;
    public final EObject entryRuleOnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnName = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1512:2: (iv_ruleOnName= ruleOnName EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1513:2: iv_ruleOnName= ruleOnName EOF
            {
             newCompositeNode(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName3305);
            iv_ruleOnName=ruleOnName();

            state._fsp--;

             current =iv_ruleOnName; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName3315); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1520:1: ruleOnName returns [EObject current=null] : ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleOnName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1523:28: ( ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1524:1: ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1524:1: ( () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1524:2: () otherlv_1= 'name is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_name_3_0= ruleEString ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1524:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1525:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnNameAccess().getOnNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOnName3361); 

                	newLeafNode(otherlv_1, grammarAccess.getOnNameAccess().getNameIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1534:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1535:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1535:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1536:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnName3379); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnNameRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1549:3: ( (lv_name_3_0= ruleEString ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1550:1: (lv_name_3_0= ruleEString )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1550:1: (lv_name_3_0= ruleEString )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1551:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnName3414);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1575:1: entryRuleOnExtension returns [EObject current=null] : iv_ruleOnExtension= ruleOnExtension EOF ;
    public final EObject entryRuleOnExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnExtension = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1576:2: (iv_ruleOnExtension= ruleOnExtension EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1577:2: iv_ruleOnExtension= ruleOnExtension EOF
            {
             newCompositeNode(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension3450);
            iv_ruleOnExtension=ruleOnExtension();

            state._fsp--;

             current =iv_ruleOnExtension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension3460); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1584:1: ruleOnExtension returns [EObject current=null] : ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1587:28: ( ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1588:1: ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1588:1: ( () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1588:2: () otherlv_1= 'extension is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'in [' ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )? otherlv_7= ']'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1588:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1589:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOnExtensionAccess().getOnExtensionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOnExtension3506); 

                	newLeafNode(otherlv_1, grammarAccess.getOnExtensionAccess().getExtensionIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1598:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1599:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1599:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1600:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnExtension3524); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnExtensionRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOnExtension3550); 

                	newLeafNode(otherlv_3, grammarAccess.getOnExtensionAccess().getInKeyword_3());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1617:1: ( ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1617:2: ( (lv_extensions_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )*
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1617:2: ( (lv_extensions_4_0= ruleEString ) )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1618:1: (lv_extensions_4_0= ruleEString )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1618:1: (lv_extensions_4_0= ruleEString )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1619:3: lv_extensions_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3572);
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

                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1635:2: (otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==35) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1635:4: otherlv_5= ',' ( (lv_extensions_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOnExtension3585); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getOnExtensionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1639:1: ( (lv_extensions_6_0= ruleEString ) )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1640:1: (lv_extensions_6_0= ruleEString )
                    	    {
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1640:1: (lv_extensions_6_0= ruleEString )
                    	    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1641:3: lv_extensions_6_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnExtension3606);
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

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOnExtension3622); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1669:1: entryRuleIsEmpty returns [EObject current=null] : iv_ruleIsEmpty= ruleIsEmpty EOF ;
    public final EObject entryRuleIsEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsEmpty = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1670:2: (iv_ruleIsEmpty= ruleIsEmpty EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1671:2: iv_ruleIsEmpty= ruleIsEmpty EOF
            {
             newCompositeNode(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3658);
            iv_ruleIsEmpty=ruleIsEmpty();

            state._fsp--;

             current =iv_ruleIsEmpty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty3668); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1678:1: ruleIsEmpty returns [EObject current=null] : ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' ) ;
    public final EObject ruleIsEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1681:28: ( ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1682:1: ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1682:1: ( () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty' )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1682:2: () otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? otherlv_3= 'empty'
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1682:2: ()
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1683:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIsEmptyAccess().getIsEmptyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleIsEmpty3714); 

                	newLeafNode(otherlv_1, grammarAccess.getIsEmptyAccess().getIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1692:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1693:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1693:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1694:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleIsEmpty3732); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIsEmptyRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleIsEmpty3758); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1719:1: entryRuleOnType returns [EObject current=null] : iv_ruleOnType= ruleOnType EOF ;
    public final EObject entryRuleOnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnType = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1720:2: (iv_ruleOnType= ruleOnType EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1721:2: iv_ruleOnType= ruleOnType EOF
            {
             newCompositeNode(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType3794);
            iv_ruleOnType=ruleOnType();

            state._fsp--;

             current =iv_ruleOnType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType3804); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1728:1: ruleOnType returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) ) ;
    public final EObject ruleOnType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_inverse_2_0=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1731:28: ( (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1732:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1732:1: (otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1732:3: otherlv_0= 'file' otherlv_1= 'is' ( (lv_inverse_2_0= 'not' ) )? ( (lv_type_3_0= ruleFileType ) )
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOnType3841); 

                	newLeafNode(otherlv_0, grammarAccess.getOnTypeAccess().getFileKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOnType3853); 

                	newLeafNode(otherlv_1, grammarAccess.getOnTypeAccess().getIsKeyword_1());
                
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1740:1: ( (lv_inverse_2_0= 'not' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1741:1: (lv_inverse_2_0= 'not' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1741:1: (lv_inverse_2_0= 'not' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1742:3: lv_inverse_2_0= 'not'
                    {
                    lv_inverse_2_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOnType3871); 

                            newLeafNode(lv_inverse_2_0, grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOnTypeRule());
                    	        }
                           		setWithLastConsumed(current, "inverse", true, "not");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1755:3: ( (lv_type_3_0= ruleFileType ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1756:1: (lv_type_3_0= ruleFileType )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1756:1: (lv_type_3_0= ruleFileType )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1757:3: lv_type_3_0= ruleFileType
            {
             
            	        newCompositeNode(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_ruleOnType3906);
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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1781:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1782:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1783:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3943);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3954); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1790:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1793:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1794:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1794:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1794:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1794:2: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1795:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEInt3993); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4010); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1817:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1818:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1819:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4058);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4069); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1826:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1829:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1830:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1830:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1830:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4109); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1838:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4135); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1853:1: ruleStrategies returns [Enumerator current=null] : ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) ;
    public final Enumerator ruleStrategies() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1855:28: ( ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:1: ( (enumLiteral_0= 'forced' ) | (enumLiteral_1= 'append' ) | (enumLiteral_2= 'carefully' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            case 49:
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:2: (enumLiteral_0= 'forced' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:2: (enumLiteral_0= 'forced' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1856:4: enumLiteral_0= 'forced'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleStrategies4194); 

                            current = grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1862:6: (enumLiteral_1= 'append' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1862:6: (enumLiteral_1= 'append' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1862:8: enumLiteral_1= 'append'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleStrategies4211); 

                            current = grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1868:6: (enumLiteral_2= 'carefully' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1868:6: (enumLiteral_2= 'carefully' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1868:8: enumLiteral_2= 'carefully'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleStrategies4228); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1878:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1880:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt30=1;
                }
                break;
            case 51:
                {
                alt30=2;
                }
                break;
            case 52:
                {
                alt30=3;
                }
                break;
            case 53:
                {
                alt30=4;
                }
                break;
            case 54:
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:2: (enumLiteral_0= '==' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:2: (enumLiteral_0= '==' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1881:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOperator4273); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1887:6: (enumLiteral_1= '<' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1887:6: (enumLiteral_1= '<' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1887:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleOperator4290); 

                            current = grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1893:6: (enumLiteral_2= '>' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1893:6: (enumLiteral_2= '>' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1893:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleOperator4307); 

                            current = grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1899:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1899:6: (enumLiteral_3= '<=' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1899:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleOperator4324); 

                            current = grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1905:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1905:6: (enumLiteral_4= '>=' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1905:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleOperator4341); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1915:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) ) ;
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
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1917:28: ( ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:1: ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:1: ( (enumLiteral_0= 'mins' ) | (enumLiteral_1= 'hours' ) | (enumLiteral_2= 'days' ) | (enumLiteral_3= 'weeks' ) | (enumLiteral_4= 'months' ) | (enumLiteral_5= 'years' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt31=1;
                }
                break;
            case 56:
                {
                alt31=2;
                }
                break;
            case 57:
                {
                alt31=3;
                }
                break;
            case 58:
                {
                alt31=4;
                }
                break;
            case 59:
                {
                alt31=5;
                }
                break;
            case 60:
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:2: (enumLiteral_0= 'mins' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:2: (enumLiteral_0= 'mins' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1918:4: enumLiteral_0= 'mins'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTimeUnit4386); 

                            current = grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1924:6: (enumLiteral_1= 'hours' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1924:6: (enumLiteral_1= 'hours' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1924:8: enumLiteral_1= 'hours'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTimeUnit4403); 

                            current = grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1930:6: (enumLiteral_2= 'days' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1930:6: (enumLiteral_2= 'days' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1930:8: enumLiteral_2= 'days'
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTimeUnit4420); 

                            current = grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1936:6: (enumLiteral_3= 'weeks' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1936:6: (enumLiteral_3= 'weeks' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1936:8: enumLiteral_3= 'weeks'
                    {
                    enumLiteral_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTimeUnit4437); 

                            current = grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1942:6: (enumLiteral_4= 'months' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1942:6: (enumLiteral_4= 'months' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1942:8: enumLiteral_4= 'months'
                    {
                    enumLiteral_4=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTimeUnit4454); 

                            current = grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1948:6: (enumLiteral_5= 'years' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1948:6: (enumLiteral_5= 'years' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1948:8: enumLiteral_5= 'years'
                    {
                    enumLiteral_5=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTimeUnit4471); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1958:1: ruleTimeType returns [Enumerator current=null] : ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) ) ;
    public final Enumerator ruleTimeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1960:28: ( ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:1: ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:1: ( (enumLiteral_0= 'modified' ) | (enumLiteral_1= 'created' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==61) ) {
                alt32=1;
            }
            else if ( (LA32_0==62) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:2: (enumLiteral_0= 'modified' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:2: (enumLiteral_0= 'modified' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1961:4: enumLiteral_0= 'modified'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTimeType4516); 

                            current = grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1967:6: (enumLiteral_1= 'created' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1967:6: (enumLiteral_1= 'created' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1967:8: enumLiteral_1= 'created'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTimeType4533); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1977:1: ruleQuantificators returns [Enumerator current=null] : ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) ) ;
    public final Enumerator ruleQuantificators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1979:28: ( ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:1: ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:1: ( (enumLiteral_0= 'any are' ) | (enumLiteral_1= 'all are' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==63) ) {
                alt33=1;
            }
            else if ( (LA33_0==64) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:2: (enumLiteral_0= 'any are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:2: (enumLiteral_0= 'any are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1980:4: enumLiteral_0= 'any are'
                    {
                    enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleQuantificators4578); 

                            current = grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1986:6: (enumLiteral_1= 'all are' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1986:6: (enumLiteral_1= 'all are' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1986:8: enumLiteral_1= 'all are'
                    {
                    enumLiteral_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleQuantificators4595); 

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
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1996:1: ruleMemoryUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) ;
    public final Enumerator ruleMemoryUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1998:28: ( ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:1: ( (enumLiteral_0= 'KB' ) | (enumLiteral_1= 'MB' ) | (enumLiteral_2= 'GB' ) | (enumLiteral_3= 'TB' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt34=1;
                }
                break;
            case 66:
                {
                alt34=2;
                }
                break;
            case 67:
                {
                alt34=3;
                }
                break;
            case 68:
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
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:2: (enumLiteral_0= 'KB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:2: (enumLiteral_0= 'KB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:1999:4: enumLiteral_0= 'KB'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMemoryUnit4640); 

                            current = grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2005:6: (enumLiteral_1= 'MB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2005:6: (enumLiteral_1= 'MB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2005:8: enumLiteral_1= 'MB'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMemoryUnit4657); 

                            current = grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2011:6: (enumLiteral_2= 'GB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2011:6: (enumLiteral_2= 'GB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2011:8: enumLiteral_2= 'GB'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMemoryUnit4674); 

                            current = grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2017:6: (enumLiteral_3= 'TB' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2017:6: (enumLiteral_3= 'TB' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2017:8: enumLiteral_3= 'TB'
                    {
                    enumLiteral_3=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMemoryUnit4691); 

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


    // $ANTLR start "ruleFileType"
    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2027:1: ruleFileType returns [Enumerator current=null] : ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) ) ;
    public final Enumerator ruleFileType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2029:28: ( ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) ) )
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) )
            {
            // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:1: ( (enumLiteral_0= 'Document' ) | (enumLiteral_1= 'Directory' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            else if ( (LA35_0==70) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:2: (enumLiteral_0= 'Document' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:2: (enumLiteral_0= 'Document' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2030:4: enumLiteral_0= 'Document'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleFileType4736); 

                            current = grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2036:6: (enumLiteral_1= 'Directory' )
                    {
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2036:6: (enumLiteral_1= 'Directory' )
                    // ../org.xtext.example.myFetl/src-gen/org/xtext/example/myFetl/parser/antlr/internal/InternalFETL.g:2036:8: enumLiteral_1= 'Directory'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleFileType4753); 

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
        public static final BitSet FOLLOW_11_in_ruleModel153 = new BitSet(new long[]{0x0000000003240060L});
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
        public static final BitSet FOLLOW_12_in_rulePathVariable480 = new BitSet(new long[]{0x0000000003258060L});
        public static final BitSet FOLLOW_rulePath_in_rulePathVariable501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath593 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_rulePath606 = new BitSet(new long[]{0x0000000003258060L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rulePath627 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_ruleGenericStep722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_ruleGenericStep749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_ruleGenericStep776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep811 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConcreteStep867 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleConcreteStep885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep935 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleVariableStep982 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariableStep1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep1041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleParametrizedStep1097 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParametrizedStep1118 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleParametrizedStep1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection1166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSelection1213 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelection1234 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSelection1246 = new BitSet(new long[]{0x0000000003258060L});
        public static final BitSet FOLLOW_rulePath_in_ruleSelection1267 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleSelection1280 = new BitSet(new long[]{0x60002E0644000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleSelection1301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy1339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCopy1386 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCopy1398 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCopy1421 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCopy1433 = new BitSet(new long[]{0x0000000003258060L});
        public static final BitSet FOLLOW_rulePath_in_ruleCopy1454 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleCopy1467 = new BitSet(new long[]{0x0003800000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleCopy1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMove1573 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMove1585 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove1608 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMove1620 = new BitSet(new long[]{0x0000000003258060L});
        public static final BitSet FOLLOW_rulePath_in_ruleMove1641 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleMove1654 = new BitSet(new long[]{0x0003800000000000L});
        public static final BitSet FOLLOW_ruleStrategies_in_ruleMove1675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete1713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleDelete1760 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDelete1772 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDelete1795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFilterContainer1878 = new BitSet(new long[]{0x60002E0674000000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleFilterContainer1899 = new BitSet(new long[]{0x60002E067C000000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleFilterContainer1920 = new BitSet(new long[]{0x60002E067C000000L});
        public static final BitSet FOLLOW_27_in_ruleFilterContainer1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleLink2023 = new BitSet(new long[]{0x60002E0644000000L});
        public static final BitSet FOLLOW_29_in_ruleLink2060 = new BitSet(new long[]{0x60002E0644000000L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_ruleLink2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent2132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent2142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_ruleFilterComponent2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_ruleFilterComponent2216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_ruleFilterComponent2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_ruleFilterComponent2270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_ruleFilterComponent2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_ruleFilterComponent2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_ruleFilterComponent2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_ruleFilterComponent2378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_ruleFilterComponent2405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes2440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleOnAttributes2487 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes2508 = new BitSet(new long[]{0x0000000380000000L});
        public static final BitSet FOLLOW_31_in_ruleOnAttributes2528 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOnAttributes2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleOnAttributes2574 = new BitSet(new long[]{0x0000000083240060L});
        public static final BitSet FOLLOW_31_in_ruleOnAttributes2592 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnAttributes2627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags2665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleOnTags2712 = new BitSet(new long[]{0x0000001003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags2734 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleOnTags2747 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnTags2768 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleOnTags2784 = new BitSet(new long[]{0x8000400000000010L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleQuantificators_in_ruleOnTags2806 = new BitSet(new long[]{0x0000004080000000L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTags2834 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleOnTags2846 = new BitSet(new long[]{0x0000004080000000L});
        public static final BitSet FOLLOW_31_in_ruleOnTags2866 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleOnTags2892 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_39_in_ruleOnTags2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime2960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime2970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeType_in_ruleOnTime3016 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleOnTime3028 = new BitSet(new long[]{0x007C000000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnTime3049 = new BitSet(new long[]{0x8000400000000010L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnTime3070 = new BitSet(new long[]{0x1F80000000000000L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_ruleOnTime3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize3127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleOnSize3174 = new BitSet(new long[]{0x007C000080000000L});
        public static final BitSet FOLLOW_31_in_ruleOnSize3192 = new BitSet(new long[]{0x007C000000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOnSize3227 = new BitSet(new long[]{0x8000400000000010L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOnSize3248 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_ruleOnSize3269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName3305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName3315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleOnName3361 = new BitSet(new long[]{0x0000000083240060L});
        public static final BitSet FOLLOW_31_in_ruleOnName3379 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnName3414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension3450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleOnExtension3506 = new BitSet(new long[]{0x0000000480000000L});
        public static final BitSet FOLLOW_31_in_ruleOnExtension3524 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleOnExtension3550 = new BitSet(new long[]{0x0000001003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3572 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleOnExtension3585 = new BitSet(new long[]{0x0000000003240060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnExtension3606 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleOnExtension3622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty3658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty3668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleIsEmpty3714 = new BitSet(new long[]{0x0000100080000000L});
        public static final BitSet FOLLOW_31_in_ruleIsEmpty3732 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleIsEmpty3758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType3794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleOnType3841 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleOnType3853 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_31_in_ruleOnType3871 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_ruleFileType_in_ruleOnType3906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3943 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEInt3993 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleStrategies4194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleStrategies4211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleStrategies4228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleOperator4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleOperator4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleOperator4307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleOperator4324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleOperator4341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTimeUnit4386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTimeUnit4403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTimeUnit4420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTimeUnit4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTimeUnit4454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTimeUnit4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTimeType4516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTimeType4533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleQuantificators4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleQuantificators4595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleMemoryUnit4640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMemoryUnit4657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleMemoryUnit4674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleMemoryUnit4691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleFileType4736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleFileType4753 = new BitSet(new long[]{0x0000000000000002L});
    }


}