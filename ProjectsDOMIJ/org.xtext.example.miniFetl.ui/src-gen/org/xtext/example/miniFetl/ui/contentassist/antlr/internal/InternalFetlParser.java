package org.xtext.example.miniFetl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.miniFetl.services.FetlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFetlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'forced'", "'append'", "'carefully'", "'equal'", "'less'", "'more'", "'less_equal'", "'more_equal'", "'min'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'modification'", "'cretion'", "'KB'", "'MB'", "'GB'", "'TB'", "'and'", "'or'", "'none'", "'Document'", "'Folder'", "'Model'", "'{'", "'}'", "'executions'", "','", "'Copy'", "'source'", "'destination'", "'strategy'", "'Move'", "'Delete'", "'PathVariable'", "'value'", "'SelectionVariable'", "'Path'", "'steps'", "'absolute'", "'ConcreteStep'", "'VariableStep'", "'ParametrizedStep'", "'Selection'", "'from'", "'where'", "'OnName'", "'trueFalseSearch'", "'OnExtension'", "'extensions'", "'OnTime'", "'operator'", "'treshold'", "'unit'", "'timeOf'", "'OnAttributes'", "'OnTags'", "'tags'", "'OnSize'", "'FilterContainer'", "'segments'", "'compositionType'", "'IsEmpty'", "'OnType'", "'type'", "'-'", "'only'"
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
    public String getGrammarFileName() { return "../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g"; }


     
     	private FetlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FetlGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExecution"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:88:1: entryRuleExecution : ruleExecution EOF ;
    public final void entryRuleExecution() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:89:1: ( ruleExecution EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:90:1: ruleExecution EOF
            {
             before(grammarAccess.getExecutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_entryRuleExecution121);
            ruleExecution();

            state._fsp--;

             after(grammarAccess.getExecutionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExecution128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExecution"


    // $ANTLR start "ruleExecution"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:97:1: ruleExecution : ( ( rule__Execution__Alternatives ) ) ;
    public final void ruleExecution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:101:2: ( ( ( rule__Execution__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:102:1: ( ( rule__Execution__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:102:1: ( ( rule__Execution__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:103:1: ( rule__Execution__Alternatives )
            {
             before(grammarAccess.getExecutionAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:104:1: ( rule__Execution__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:104:2: rule__Execution__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Execution__Alternatives_in_ruleExecution154);
            rule__Execution__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExecutionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecution"


    // $ANTLR start "entryRuleGenericStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:116:1: entryRuleGenericStep : ruleGenericStep EOF ;
    public final void entryRuleGenericStep() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:117:1: ( ruleGenericStep EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:118:1: ruleGenericStep EOF
            {
             before(grammarAccess.getGenericStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_entryRuleGenericStep181);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getGenericStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericStep188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericStep"


    // $ANTLR start "ruleGenericStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:125:1: ruleGenericStep : ( ( rule__GenericStep__Alternatives ) ) ;
    public final void ruleGenericStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:129:2: ( ( ( rule__GenericStep__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:130:1: ( ( rule__GenericStep__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:130:1: ( ( rule__GenericStep__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:131:1: ( rule__GenericStep__Alternatives )
            {
             before(grammarAccess.getGenericStepAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:132:1: ( rule__GenericStep__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:132:2: rule__GenericStep__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericStep__Alternatives_in_ruleGenericStep214);
            rule__GenericStep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericStep"


    // $ANTLR start "entryRuleFilterComponent"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:144:1: entryRuleFilterComponent : ruleFilterComponent EOF ;
    public final void entryRuleFilterComponent() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:145:1: ( ruleFilterComponent EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:146:1: ruleFilterComponent EOF
            {
             before(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent241);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getFilterComponentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterComponent"


    // $ANTLR start "ruleFilterComponent"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:153:1: ruleFilterComponent : ( ( rule__FilterComponent__Alternatives ) ) ;
    public final void ruleFilterComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:157:2: ( ( ( rule__FilterComponent__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:158:1: ( ( rule__FilterComponent__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:158:1: ( ( rule__FilterComponent__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:159:1: ( rule__FilterComponent__Alternatives )
            {
             before(grammarAccess.getFilterComponentAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:160:1: ( rule__FilterComponent__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:160:2: rule__FilterComponent__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterComponent__Alternatives_in_ruleFilterComponent274);
            rule__FilterComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterComponent"


    // $ANTLR start "entryRuleCopy"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:172:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:173:1: ( ruleCopy EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:174:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy301);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:181:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:185:2: ( ( ( rule__Copy__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:186:1: ( ( rule__Copy__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:186:1: ( ( rule__Copy__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:187:1: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:188:1: ( rule__Copy__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:188:2: rule__Copy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__0_in_ruleCopy334);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleMove"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:200:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:201:1: ( ruleMove EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:202:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove361);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:209:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:213:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:214:1: ( ( rule__Move__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:214:1: ( ( rule__Move__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:215:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:216:1: ( rule__Move__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:216:2: rule__Move__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0_in_ruleMove394);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleDelete"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:228:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:229:1: ( ruleDelete EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:230:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete421);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:237:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:241:2: ( ( ( rule__Delete__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:242:1: ( ( rule__Delete__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:242:1: ( ( rule__Delete__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:243:1: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:244:1: ( rule__Delete__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:244:2: rule__Delete__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__0_in_ruleDelete454);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRulePathVariable"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:256:1: entryRulePathVariable : rulePathVariable EOF ;
    public final void entryRulePathVariable() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:257:1: ( rulePathVariable EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:258:1: rulePathVariable EOF
            {
             before(grammarAccess.getPathVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_entryRulePathVariable481);
            rulePathVariable();

            state._fsp--;

             after(grammarAccess.getPathVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathVariable488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathVariable"


    // $ANTLR start "rulePathVariable"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:265:1: rulePathVariable : ( ( rule__PathVariable__Group__0 ) ) ;
    public final void rulePathVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:269:2: ( ( ( rule__PathVariable__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:270:1: ( ( rule__PathVariable__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:270:1: ( ( rule__PathVariable__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:271:1: ( rule__PathVariable__Group__0 )
            {
             before(grammarAccess.getPathVariableAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:272:1: ( rule__PathVariable__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:272:2: rule__PathVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__0_in_rulePathVariable514);
            rule__PathVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathVariable"


    // $ANTLR start "entryRuleSelectionVariable"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:284:1: entryRuleSelectionVariable : ruleSelectionVariable EOF ;
    public final void entryRuleSelectionVariable() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:285:1: ( ruleSelectionVariable EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:286:1: ruleSelectionVariable EOF
            {
             before(grammarAccess.getSelectionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable541);
            ruleSelectionVariable();

            state._fsp--;

             after(grammarAccess.getSelectionVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionVariable548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionVariable"


    // $ANTLR start "ruleSelectionVariable"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:293:1: ruleSelectionVariable : ( ( rule__SelectionVariable__Group__0 ) ) ;
    public final void ruleSelectionVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:297:2: ( ( ( rule__SelectionVariable__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:298:1: ( ( rule__SelectionVariable__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:298:1: ( ( rule__SelectionVariable__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:299:1: ( rule__SelectionVariable__Group__0 )
            {
             before(grammarAccess.getSelectionVariableAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:300:1: ( rule__SelectionVariable__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:300:2: rule__SelectionVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__0_in_ruleSelectionVariable574);
            rule__SelectionVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionVariable"


    // $ANTLR start "entryRulePath"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:312:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:313:1: ( rulePath EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:314:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_entryRulePath601);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePath608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:321:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:325:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:326:1: ( ( rule__Path__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:326:1: ( ( rule__Path__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:327:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:328:1: ( rule__Path__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:328:2: rule__Path__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__0_in_rulePath634);
            rule__Path__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:340:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:341:1: ( ruleEBoolean EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:342:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean661);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:349:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:353:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:354:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:354:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:355:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:356:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:356:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean694);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleConcreteStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:368:1: entryRuleConcreteStep : ruleConcreteStep EOF ;
    public final void entryRuleConcreteStep() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:369:1: ( ruleConcreteStep EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:370:1: ruleConcreteStep EOF
            {
             before(grammarAccess.getConcreteStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep721);
            ruleConcreteStep();

            state._fsp--;

             after(grammarAccess.getConcreteStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteStep728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcreteStep"


    // $ANTLR start "ruleConcreteStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:377:1: ruleConcreteStep : ( ( rule__ConcreteStep__Group__0 ) ) ;
    public final void ruleConcreteStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:381:2: ( ( ( rule__ConcreteStep__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:382:1: ( ( rule__ConcreteStep__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:382:1: ( ( rule__ConcreteStep__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:383:1: ( rule__ConcreteStep__Group__0 )
            {
             before(grammarAccess.getConcreteStepAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:384:1: ( rule__ConcreteStep__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:384:2: rule__ConcreteStep__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__0_in_ruleConcreteStep754);
            rule__ConcreteStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcreteStep"


    // $ANTLR start "entryRuleVariableStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:396:1: entryRuleVariableStep : ruleVariableStep EOF ;
    public final void entryRuleVariableStep() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:397:1: ( ruleVariableStep EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:398:1: ruleVariableStep EOF
            {
             before(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep781);
            ruleVariableStep();

            state._fsp--;

             after(grammarAccess.getVariableStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableStep"


    // $ANTLR start "ruleVariableStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:405:1: ruleVariableStep : ( ( rule__VariableStep__Group__0 ) ) ;
    public final void ruleVariableStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:409:2: ( ( ( rule__VariableStep__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:410:1: ( ( rule__VariableStep__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:410:1: ( ( rule__VariableStep__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:411:1: ( rule__VariableStep__Group__0 )
            {
             before(grammarAccess.getVariableStepAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:412:1: ( rule__VariableStep__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:412:2: rule__VariableStep__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__0_in_ruleVariableStep814);
            rule__VariableStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableStep"


    // $ANTLR start "entryRuleParametrizedStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:424:1: entryRuleParametrizedStep : ruleParametrizedStep EOF ;
    public final void entryRuleParametrizedStep() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:425:1: ( ruleParametrizedStep EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:426:1: ruleParametrizedStep EOF
            {
             before(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep841);
            ruleParametrizedStep();

            state._fsp--;

             after(grammarAccess.getParametrizedStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametrizedStep"


    // $ANTLR start "ruleParametrizedStep"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:433:1: ruleParametrizedStep : ( ( rule__ParametrizedStep__Group__0 ) ) ;
    public final void ruleParametrizedStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:437:2: ( ( ( rule__ParametrizedStep__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:438:1: ( ( rule__ParametrizedStep__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:438:1: ( ( rule__ParametrizedStep__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:439:1: ( rule__ParametrizedStep__Group__0 )
            {
             before(grammarAccess.getParametrizedStepAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:440:1: ( rule__ParametrizedStep__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:440:2: rule__ParametrizedStep__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__0_in_ruleParametrizedStep874);
            rule__ParametrizedStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametrizedStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametrizedStep"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:452:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:453:1: ( ruleEString EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:454:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString901);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:461:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:465:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:466:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:466:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:467:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:468:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:468:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString934);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:480:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:481:1: ( ruleSelection EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:482:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection961);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:489:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:493:2: ( ( ( rule__Selection__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:494:1: ( ( rule__Selection__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:494:1: ( ( rule__Selection__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:495:1: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:496:1: ( rule__Selection__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:496:2: rule__Selection__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__0_in_ruleSelection994);
            rule__Selection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleOnName"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:508:1: entryRuleOnName : ruleOnName EOF ;
    public final void entryRuleOnName() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:509:1: ( ruleOnName EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:510:1: ruleOnName EOF
            {
             before(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName1021);
            ruleOnName();

            state._fsp--;

             after(grammarAccess.getOnNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnName"


    // $ANTLR start "ruleOnName"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:517:1: ruleOnName : ( ( rule__OnName__Group__0 ) ) ;
    public final void ruleOnName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:521:2: ( ( ( rule__OnName__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:522:1: ( ( rule__OnName__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:522:1: ( ( rule__OnName__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:523:1: ( rule__OnName__Group__0 )
            {
             before(grammarAccess.getOnNameAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:524:1: ( rule__OnName__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:524:2: rule__OnName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__0_in_ruleOnName1054);
            rule__OnName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnName"


    // $ANTLR start "entryRuleOnExtension"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:536:1: entryRuleOnExtension : ruleOnExtension EOF ;
    public final void entryRuleOnExtension() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:537:1: ( ruleOnExtension EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:538:1: ruleOnExtension EOF
            {
             before(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension1081);
            ruleOnExtension();

            state._fsp--;

             after(grammarAccess.getOnExtensionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnExtension"


    // $ANTLR start "ruleOnExtension"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:545:1: ruleOnExtension : ( ( rule__OnExtension__Group__0 ) ) ;
    public final void ruleOnExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:549:2: ( ( ( rule__OnExtension__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:550:1: ( ( rule__OnExtension__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:550:1: ( ( rule__OnExtension__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:551:1: ( rule__OnExtension__Group__0 )
            {
             before(grammarAccess.getOnExtensionAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:552:1: ( rule__OnExtension__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:552:2: rule__OnExtension__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__0_in_ruleOnExtension1114);
            rule__OnExtension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnExtension"


    // $ANTLR start "entryRuleOnTime"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:564:1: entryRuleOnTime : ruleOnTime EOF ;
    public final void entryRuleOnTime() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:565:1: ( ruleOnTime EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:566:1: ruleOnTime EOF
            {
             before(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime1141);
            ruleOnTime();

            state._fsp--;

             after(grammarAccess.getOnTimeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnTime"


    // $ANTLR start "ruleOnTime"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:573:1: ruleOnTime : ( ( rule__OnTime__Group__0 ) ) ;
    public final void ruleOnTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:577:2: ( ( ( rule__OnTime__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:578:1: ( ( rule__OnTime__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:578:1: ( ( rule__OnTime__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:579:1: ( rule__OnTime__Group__0 )
            {
             before(grammarAccess.getOnTimeAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:580:1: ( rule__OnTime__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:580:2: rule__OnTime__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__0_in_ruleOnTime1174);
            rule__OnTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnTime"


    // $ANTLR start "entryRuleOnAttributes"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:592:1: entryRuleOnAttributes : ruleOnAttributes EOF ;
    public final void entryRuleOnAttributes() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:593:1: ( ruleOnAttributes EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:594:1: ruleOnAttributes EOF
            {
             before(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes1201);
            ruleOnAttributes();

            state._fsp--;

             after(grammarAccess.getOnAttributesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnAttributes"


    // $ANTLR start "ruleOnAttributes"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:601:1: ruleOnAttributes : ( ( rule__OnAttributes__Group__0 ) ) ;
    public final void ruleOnAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:605:2: ( ( ( rule__OnAttributes__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:606:1: ( ( rule__OnAttributes__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:606:1: ( ( rule__OnAttributes__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:607:1: ( rule__OnAttributes__Group__0 )
            {
             before(grammarAccess.getOnAttributesAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:608:1: ( rule__OnAttributes__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:608:2: rule__OnAttributes__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__0_in_ruleOnAttributes1234);
            rule__OnAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnAttributes"


    // $ANTLR start "entryRuleOnTags"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:620:1: entryRuleOnTags : ruleOnTags EOF ;
    public final void entryRuleOnTags() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:621:1: ( ruleOnTags EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:622:1: ruleOnTags EOF
            {
             before(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags1261);
            ruleOnTags();

            state._fsp--;

             after(grammarAccess.getOnTagsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnTags"


    // $ANTLR start "ruleOnTags"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:629:1: ruleOnTags : ( ( rule__OnTags__Group__0 ) ) ;
    public final void ruleOnTags() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:633:2: ( ( ( rule__OnTags__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:634:1: ( ( rule__OnTags__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:634:1: ( ( rule__OnTags__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:635:1: ( rule__OnTags__Group__0 )
            {
             before(grammarAccess.getOnTagsAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:636:1: ( rule__OnTags__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:636:2: rule__OnTags__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__0_in_ruleOnTags1294);
            rule__OnTags__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnTags"


    // $ANTLR start "entryRuleOnSize"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:648:1: entryRuleOnSize : ruleOnSize EOF ;
    public final void entryRuleOnSize() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:649:1: ( ruleOnSize EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:650:1: ruleOnSize EOF
            {
             before(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize1321);
            ruleOnSize();

            state._fsp--;

             after(grammarAccess.getOnSizeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnSize"


    // $ANTLR start "ruleOnSize"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:657:1: ruleOnSize : ( ( rule__OnSize__Group__0 ) ) ;
    public final void ruleOnSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:661:2: ( ( ( rule__OnSize__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:662:1: ( ( rule__OnSize__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:662:1: ( ( rule__OnSize__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:663:1: ( rule__OnSize__Group__0 )
            {
             before(grammarAccess.getOnSizeAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:664:1: ( rule__OnSize__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:664:2: rule__OnSize__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__0_in_ruleOnSize1354);
            rule__OnSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnSize"


    // $ANTLR start "entryRuleFilterContainer"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:676:1: entryRuleFilterContainer : ruleFilterContainer EOF ;
    public final void entryRuleFilterContainer() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:677:1: ( ruleFilterContainer EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:678:1: ruleFilterContainer EOF
            {
             before(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1381);
            ruleFilterContainer();

            state._fsp--;

             after(grammarAccess.getFilterContainerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterContainer"


    // $ANTLR start "ruleFilterContainer"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:685:1: ruleFilterContainer : ( ( rule__FilterContainer__Group__0 ) ) ;
    public final void ruleFilterContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:689:2: ( ( ( rule__FilterContainer__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:690:1: ( ( rule__FilterContainer__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:690:1: ( ( rule__FilterContainer__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:691:1: ( rule__FilterContainer__Group__0 )
            {
             before(grammarAccess.getFilterContainerAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:692:1: ( rule__FilterContainer__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:692:2: rule__FilterContainer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__0_in_ruleFilterContainer1414);
            rule__FilterContainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterContainer"


    // $ANTLR start "entryRuleIsEmpty"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:704:1: entryRuleIsEmpty : ruleIsEmpty EOF ;
    public final void entryRuleIsEmpty() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:705:1: ( ruleIsEmpty EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:706:1: ruleIsEmpty EOF
            {
             before(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty1441);
            ruleIsEmpty();

            state._fsp--;

             after(grammarAccess.getIsEmptyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsEmpty"


    // $ANTLR start "ruleIsEmpty"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:713:1: ruleIsEmpty : ( ( rule__IsEmpty__Group__0 ) ) ;
    public final void ruleIsEmpty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:717:2: ( ( ( rule__IsEmpty__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:718:1: ( ( rule__IsEmpty__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:718:1: ( ( rule__IsEmpty__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:719:1: ( rule__IsEmpty__Group__0 )
            {
             before(grammarAccess.getIsEmptyAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:720:1: ( rule__IsEmpty__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:720:2: rule__IsEmpty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__0_in_ruleIsEmpty1474);
            rule__IsEmpty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsEmptyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsEmpty"


    // $ANTLR start "entryRuleOnType"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:732:1: entryRuleOnType : ruleOnType EOF ;
    public final void entryRuleOnType() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:733:1: ( ruleOnType EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:734:1: ruleOnType EOF
            {
             before(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType1501);
            ruleOnType();

            state._fsp--;

             after(grammarAccess.getOnTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnType"


    // $ANTLR start "ruleOnType"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:741:1: ruleOnType : ( ( rule__OnType__Group__0 ) ) ;
    public final void ruleOnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:745:2: ( ( ( rule__OnType__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:746:1: ( ( rule__OnType__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:746:1: ( ( rule__OnType__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:747:1: ( rule__OnType__Group__0 )
            {
             before(grammarAccess.getOnTypeAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:748:1: ( rule__OnType__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:748:2: rule__OnType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__0_in_ruleOnType1534);
            rule__OnType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnType"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:760:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:761:1: ( ruleEInt EOF )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:762:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1561);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:769:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:773:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:774:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:774:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:775:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:776:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:776:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1594);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleStrategies"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:789:1: ruleStrategies : ( ( rule__Strategies__Alternatives ) ) ;
    public final void ruleStrategies() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:793:1: ( ( ( rule__Strategies__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:794:1: ( ( rule__Strategies__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:794:1: ( ( rule__Strategies__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:795:1: ( rule__Strategies__Alternatives )
            {
             before(grammarAccess.getStrategiesAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:796:1: ( rule__Strategies__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:796:2: rule__Strategies__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Strategies__Alternatives_in_ruleStrategies1631);
            rule__Strategies__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategies"


    // $ANTLR start "ruleOperator"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:808:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:812:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:813:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:813:1: ( ( rule__Operator__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:814:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:815:1: ( rule__Operator__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:815:2: rule__Operator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operator__Alternatives_in_ruleOperator1667);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleTimeUnit"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:827:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:831:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:832:1: ( ( rule__TimeUnit__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:832:1: ( ( rule__TimeUnit__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:833:1: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:834:1: ( rule__TimeUnit__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:834:2: rule__TimeUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit1703);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleTimeType"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:846:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:850:1: ( ( ( rule__TimeType__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:851:1: ( ( rule__TimeType__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:851:1: ( ( rule__TimeType__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:852:1: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:853:1: ( rule__TimeType__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:853:2: rule__TimeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeType__Alternatives_in_ruleTimeType1739);
            rule__TimeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeType"


    // $ANTLR start "ruleMemoryUnit"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:865:1: ruleMemoryUnit : ( ( rule__MemoryUnit__Alternatives ) ) ;
    public final void ruleMemoryUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:869:1: ( ( ( rule__MemoryUnit__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:870:1: ( ( rule__MemoryUnit__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:870:1: ( ( rule__MemoryUnit__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:871:1: ( rule__MemoryUnit__Alternatives )
            {
             before(grammarAccess.getMemoryUnitAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:872:1: ( rule__MemoryUnit__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:872:2: rule__MemoryUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MemoryUnit__Alternatives_in_ruleMemoryUnit1775);
            rule__MemoryUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemoryUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemoryUnit"


    // $ANTLR start "ruleCompositionType"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:884:1: ruleCompositionType : ( ( rule__CompositionType__Alternatives ) ) ;
    public final void ruleCompositionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:888:1: ( ( ( rule__CompositionType__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:889:1: ( ( rule__CompositionType__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:889:1: ( ( rule__CompositionType__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:890:1: ( rule__CompositionType__Alternatives )
            {
             before(grammarAccess.getCompositionTypeAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:891:1: ( rule__CompositionType__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:891:2: rule__CompositionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositionType__Alternatives_in_ruleCompositionType1811);
            rule__CompositionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionType"


    // $ANTLR start "ruleFileType"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:903:1: ruleFileType : ( ( rule__FileType__Alternatives ) ) ;
    public final void ruleFileType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:907:1: ( ( ( rule__FileType__Alternatives ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:908:1: ( ( rule__FileType__Alternatives ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:908:1: ( ( rule__FileType__Alternatives ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:909:1: ( rule__FileType__Alternatives )
            {
             before(grammarAccess.getFileTypeAccess().getAlternatives()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:910:1: ( rule__FileType__Alternatives )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:910:2: rule__FileType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FileType__Alternatives_in_ruleFileType1847);
            rule__FileType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileType"


    // $ANTLR start "rule__Execution__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:921:1: rule__Execution__Alternatives : ( ( ruleCopy ) | ( ruleMove ) | ( ruleDelete ) | ( rulePathVariable ) | ( ruleSelectionVariable ) );
    public final void rule__Execution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:925:1: ( ( ruleCopy ) | ( ruleMove ) | ( ruleDelete ) | ( rulePathVariable ) | ( ruleSelectionVariable ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 47:
                {
                alt1=2;
                }
                break;
            case 48:
                {
                alt1=3;
                }
                break;
            case 49:
                {
                alt1=4;
                }
                break;
            case 51:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:926:1: ( ruleCopy )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:926:1: ( ruleCopy )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:927:1: ruleCopy
                    {
                     before(grammarAccess.getExecutionAccess().getCopyParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCopy_in_rule__Execution__Alternatives1882);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getCopyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:932:6: ( ruleMove )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:932:6: ( ruleMove )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:933:1: ruleMove
                    {
                     before(grammarAccess.getExecutionAccess().getMoveParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Execution__Alternatives1899);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getMoveParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:938:6: ( ruleDelete )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:938:6: ( ruleDelete )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:939:1: ruleDelete
                    {
                     before(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDelete_in_rule__Execution__Alternatives1916);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:944:6: ( rulePathVariable )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:944:6: ( rulePathVariable )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:945:1: rulePathVariable
                    {
                     before(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_rule__Execution__Alternatives1933);
                    rulePathVariable();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:950:6: ( ruleSelectionVariable )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:950:6: ( ruleSelectionVariable )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:951:1: ruleSelectionVariable
                    {
                     before(grammarAccess.getExecutionAccess().getSelectionVariableParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionVariable_in_rule__Execution__Alternatives1950);
                    ruleSelectionVariable();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getSelectionVariableParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Execution__Alternatives"


    // $ANTLR start "rule__GenericStep__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:961:1: rule__GenericStep__Alternatives : ( ( ruleConcreteStep ) | ( ruleVariableStep ) | ( ruleParametrizedStep ) );
    public final void rule__GenericStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:965:1: ( ( ruleConcreteStep ) | ( ruleVariableStep ) | ( ruleParametrizedStep ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt2=1;
                }
                break;
            case 56:
                {
                alt2=2;
                }
                break;
            case 57:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:966:1: ( ruleConcreteStep )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:966:1: ( ruleConcreteStep )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:967:1: ruleConcreteStep
                    {
                     before(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_rule__GenericStep__Alternatives1982);
                    ruleConcreteStep();

                    state._fsp--;

                     after(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:972:6: ( ruleVariableStep )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:972:6: ( ruleVariableStep )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:973:1: ruleVariableStep
                    {
                     before(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_rule__GenericStep__Alternatives1999);
                    ruleVariableStep();

                    state._fsp--;

                     after(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:978:6: ( ruleParametrizedStep )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:978:6: ( ruleParametrizedStep )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:979:1: ruleParametrizedStep
                    {
                     before(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_rule__GenericStep__Alternatives2016);
                    ruleParametrizedStep();

                    state._fsp--;

                     after(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericStep__Alternatives"


    // $ANTLR start "rule__FilterComponent__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:989:1: rule__FilterComponent__Alternatives : ( ( ruleOnName ) | ( ruleOnExtension ) | ( ruleOnTime ) | ( ruleOnAttributes ) | ( ruleOnTags ) | ( ruleOnSize ) | ( ruleFilterContainer ) | ( ruleIsEmpty ) | ( ruleOnType ) );
    public final void rule__FilterComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:993:1: ( ( ruleOnName ) | ( ruleOnExtension ) | ( ruleOnTime ) | ( ruleOnAttributes ) | ( ruleOnTags ) | ( ruleOnSize ) | ( ruleFilterContainer ) | ( ruleIsEmpty ) | ( ruleOnType ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt3=1;
                }
                break;
            case 63:
                {
                alt3=2;
                }
                break;
            case 65:
                {
                alt3=3;
                }
                break;
            case 70:
                {
                alt3=4;
                }
                break;
            case 71:
            case 81:
                {
                alt3=5;
                }
                break;
            case 73:
                {
                alt3=6;
                }
                break;
            case 74:
                {
                alt3=7;
                }
                break;
            case 77:
                {
                alt3=8;
                }
                break;
            case 78:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:994:1: ( ruleOnName )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:994:1: ( ruleOnName )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:995:1: ruleOnName
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_rule__FilterComponent__Alternatives2048);
                    ruleOnName();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1000:6: ( ruleOnExtension )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1000:6: ( ruleOnExtension )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1001:1: ruleOnExtension
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_rule__FilterComponent__Alternatives2065);
                    ruleOnExtension();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1006:6: ( ruleOnTime )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1006:6: ( ruleOnTime )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1007:1: ruleOnTime
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_rule__FilterComponent__Alternatives2082);
                    ruleOnTime();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1012:6: ( ruleOnAttributes )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1012:6: ( ruleOnAttributes )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1013:1: ruleOnAttributes
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_rule__FilterComponent__Alternatives2099);
                    ruleOnAttributes();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1018:6: ( ruleOnTags )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1018:6: ( ruleOnTags )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1019:1: ruleOnTags
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_rule__FilterComponent__Alternatives2116);
                    ruleOnTags();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1024:6: ( ruleOnSize )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1024:6: ( ruleOnSize )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1025:1: ruleOnSize
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_rule__FilterComponent__Alternatives2133);
                    ruleOnSize();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1030:6: ( ruleFilterContainer )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1030:6: ( ruleFilterContainer )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1031:1: ruleFilterContainer
                    {
                     before(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_rule__FilterComponent__Alternatives2150);
                    ruleFilterContainer();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1036:6: ( ruleIsEmpty )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1036:6: ( ruleIsEmpty )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1037:1: ruleIsEmpty
                    {
                     before(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_rule__FilterComponent__Alternatives2167);
                    ruleIsEmpty();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1042:6: ( ruleOnType )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1042:6: ( ruleOnType )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1043:1: ruleOnType
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_rule__FilterComponent__Alternatives2184);
                    ruleOnType();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterComponent__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1053:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1057:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1058:1: ( 'true' )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1058:1: ( 'true' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1059:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives2217); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1066:6: ( 'false' )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1066:6: ( 'false' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1067:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives2237); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1079:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1083:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1084:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1084:1: ( RULE_STRING )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1085:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2271); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1090:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1090:6: ( RULE_ID )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1091:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2288); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Strategies__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1101:1: rule__Strategies__Alternatives : ( ( ( 'forced' ) ) | ( ( 'append' ) ) | ( ( 'carefully' ) ) );
    public final void rule__Strategies__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1105:1: ( ( ( 'forced' ) ) | ( ( 'append' ) ) | ( ( 'carefully' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1106:1: ( ( 'forced' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1106:1: ( ( 'forced' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1107:1: ( 'forced' )
                    {
                     before(grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1108:1: ( 'forced' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1108:3: 'forced'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Strategies__Alternatives2321); 

                    }

                     after(grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1113:6: ( ( 'append' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1113:6: ( ( 'append' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1114:1: ( 'append' )
                    {
                     before(grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1115:1: ( 'append' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1115:3: 'append'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Strategies__Alternatives2342); 

                    }

                     after(grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1120:6: ( ( 'carefully' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1120:6: ( ( 'carefully' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1121:1: ( 'carefully' )
                    {
                     before(grammarAccess.getStrategiesAccess().getCarefullyEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1122:1: ( 'carefully' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1122:3: 'carefully'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Strategies__Alternatives2363); 

                    }

                     after(grammarAccess.getStrategiesAccess().getCarefullyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategies__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1132:1: rule__Operator__Alternatives : ( ( ( 'equal' ) ) | ( ( 'less' ) ) | ( ( 'more' ) ) | ( ( 'less_equal' ) ) | ( ( 'more_equal' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1136:1: ( ( ( 'equal' ) ) | ( ( 'less' ) ) | ( ( 'more' ) ) | ( ( 'less_equal' ) ) | ( ( 'more_equal' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
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
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1137:1: ( ( 'equal' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1137:1: ( ( 'equal' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1138:1: ( 'equal' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1139:1: ( 'equal' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1139:3: 'equal'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Operator__Alternatives2399); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1144:6: ( ( 'less' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1144:6: ( ( 'less' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1145:1: ( 'less' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1146:1: ( 'less' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1146:3: 'less'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Operator__Alternatives2420); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1151:6: ( ( 'more' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1151:6: ( ( 'more' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1152:1: ( 'more' )
                    {
                     before(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1153:1: ( 'more' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1153:3: 'more'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Operator__Alternatives2441); 

                    }

                     after(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1158:6: ( ( 'less_equal' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1158:6: ( ( 'less_equal' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1159:1: ( 'less_equal' )
                    {
                     before(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1160:1: ( 'less_equal' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1160:3: 'less_equal'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Operator__Alternatives2462); 

                    }

                     after(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1165:6: ( ( 'more_equal' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1165:6: ( ( 'more_equal' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1166:1: ( 'more_equal' )
                    {
                     before(grammarAccess.getOperatorAccess().getMore_equalEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1167:1: ( 'more_equal' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1167:3: 'more_equal'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Operator__Alternatives2483); 

                    }

                     after(grammarAccess.getOperatorAccess().getMore_equalEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1177:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) | ( ( 'month' ) ) | ( ( 'year' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1181:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) | ( ( 'month' ) ) | ( ( 'year' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1182:1: ( ( 'min' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1182:1: ( ( 'min' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1183:1: ( 'min' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1184:1: ( 'min' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1184:3: 'min'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__TimeUnit__Alternatives2519); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1189:6: ( ( 'hour' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1189:6: ( ( 'hour' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1190:1: ( 'hour' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1191:1: ( 'hour' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1191:3: 'hour'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__TimeUnit__Alternatives2540); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHourEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1196:6: ( ( 'day' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1196:6: ( ( 'day' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1197:1: ( 'day' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1198:1: ( 'day' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1198:3: 'day'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__TimeUnit__Alternatives2561); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDayEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1203:6: ( ( 'week' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1203:6: ( ( 'week' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1204:1: ( 'week' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1205:1: ( 'week' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1205:3: 'week'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__TimeUnit__Alternatives2582); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getWeekEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1210:6: ( ( 'month' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1210:6: ( ( 'month' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1211:1: ( 'month' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1212:1: ( 'month' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1212:3: 'month'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__TimeUnit__Alternatives2603); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMonthEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1217:6: ( ( 'year' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1217:6: ( ( 'year' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1218:1: ( 'year' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getYearEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1219:1: ( 'year' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1219:3: 'year'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__TimeUnit__Alternatives2624); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getYearEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__TimeType__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1229:1: rule__TimeType__Alternatives : ( ( ( 'modification' ) ) | ( ( 'cretion' ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1233:1: ( ( ( 'modification' ) ) | ( ( 'cretion' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1234:1: ( ( 'modification' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1234:1: ( ( 'modification' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1235:1: ( 'modification' )
                    {
                     before(grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1236:1: ( 'modification' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1236:3: 'modification'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__TimeType__Alternatives2660); 

                    }

                     after(grammarAccess.getTimeTypeAccess().getModificationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1241:6: ( ( 'cretion' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1241:6: ( ( 'cretion' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1242:1: ( 'cretion' )
                    {
                     before(grammarAccess.getTimeTypeAccess().getCretionEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1243:1: ( 'cretion' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1243:3: 'cretion'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__TimeType__Alternatives2681); 

                    }

                     after(grammarAccess.getTimeTypeAccess().getCretionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeType__Alternatives"


    // $ANTLR start "rule__MemoryUnit__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1253:1: rule__MemoryUnit__Alternatives : ( ( ( 'KB' ) ) | ( ( 'MB' ) ) | ( ( 'GB' ) ) | ( ( 'TB' ) ) );
    public final void rule__MemoryUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1257:1: ( ( ( 'KB' ) ) | ( ( 'MB' ) ) | ( ( 'GB' ) ) | ( ( 'TB' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1258:1: ( ( 'KB' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1258:1: ( ( 'KB' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1259:1: ( 'KB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1260:1: ( 'KB' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1260:3: 'KB'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__MemoryUnit__Alternatives2717); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1265:6: ( ( 'MB' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1265:6: ( ( 'MB' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1266:1: ( 'MB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1267:1: ( 'MB' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1267:3: 'MB'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__MemoryUnit__Alternatives2738); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1272:6: ( ( 'GB' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1272:6: ( ( 'GB' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1273:1: ( 'GB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1274:1: ( 'GB' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1274:3: 'GB'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__MemoryUnit__Alternatives2759); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1279:6: ( ( 'TB' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1279:6: ( ( 'TB' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1280:1: ( 'TB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getTBEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1281:1: ( 'TB' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1281:3: 'TB'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__MemoryUnit__Alternatives2780); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getTBEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryUnit__Alternatives"


    // $ANTLR start "rule__CompositionType__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1291:1: rule__CompositionType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'none' ) ) );
    public final void rule__CompositionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1295:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'none' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1296:1: ( ( 'and' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1296:1: ( ( 'and' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1297:1: ( 'and' )
                    {
                     before(grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1298:1: ( 'and' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1298:3: 'and'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__CompositionType__Alternatives2816); 

                    }

                     after(grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1303:6: ( ( 'or' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1303:6: ( ( 'or' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1304:1: ( 'or' )
                    {
                     before(grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1305:1: ( 'or' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1305:3: 'or'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__CompositionType__Alternatives2837); 

                    }

                     after(grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1310:6: ( ( 'none' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1310:6: ( ( 'none' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1311:1: ( 'none' )
                    {
                     before(grammarAccess.getCompositionTypeAccess().getNoneEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1312:1: ( 'none' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1312:3: 'none'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__CompositionType__Alternatives2858); 

                    }

                     after(grammarAccess.getCompositionTypeAccess().getNoneEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionType__Alternatives"


    // $ANTLR start "rule__FileType__Alternatives"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1322:1: rule__FileType__Alternatives : ( ( ( 'Document' ) ) | ( ( 'Folder' ) ) );
    public final void rule__FileType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1326:1: ( ( ( 'Document' ) ) | ( ( 'Folder' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            else if ( (LA12_0==37) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1327:1: ( ( 'Document' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1327:1: ( ( 'Document' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1328:1: ( 'Document' )
                    {
                     before(grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1329:1: ( 'Document' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1329:3: 'Document'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__FileType__Alternatives2894); 

                    }

                     after(grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1334:6: ( ( 'Folder' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1334:6: ( ( 'Folder' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1335:1: ( 'Folder' )
                    {
                     before(grammarAccess.getFileTypeAccess().getFolderEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1336:1: ( 'Folder' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1336:3: 'Folder'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__FileType__Alternatives2915); 

                    }

                     after(grammarAccess.getFileTypeAccess().getFolderEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1348:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1352:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1353:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02948);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02951);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1360:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1364:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1365:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1365:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1366:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1367:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1369:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1379:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1383:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1384:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13009);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13012);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1391:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1395:1: ( ( 'Model' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1396:1: ( 'Model' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1396:1: ( 'Model' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1397:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Model__Group__1__Impl3040); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1410:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1414:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1415:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23071);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23074);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1422:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1426:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1427:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1427:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1428:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Model__Group__2__Impl3102); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1441:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1445:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1446:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33133);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33136);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1453:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1457:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1458:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1458:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1459:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1460:1: ( rule__Model__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1460:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl3163);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1470:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1474:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1475:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43194);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1481:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1485:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1486:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1486:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1487:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Model__Group__4__Impl3222); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1510:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1514:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1515:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__03263);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__03266);
            rule__Model__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1522:1: rule__Model__Group_3__0__Impl : ( 'executions' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1526:1: ( ( 'executions' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1527:1: ( 'executions' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1527:1: ( 'executions' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1528:1: 'executions'
            {
             before(grammarAccess.getModelAccess().getExecutionsKeyword_3_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Model__Group_3__0__Impl3294); 
             after(grammarAccess.getModelAccess().getExecutionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1541:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1545:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1546:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__13325);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__13328);
            rule__Model__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1553:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1557:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1558:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1558:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1559:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Model__Group_3__1__Impl3356); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1572:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1576:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1577:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__23387);
            rule__Model__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__3_in_rule__Model__Group_3__23390);
            rule__Model__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1584:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__ExecutionsAssignment_3_2 ) ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1588:1: ( ( ( rule__Model__ExecutionsAssignment_3_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1589:1: ( ( rule__Model__ExecutionsAssignment_3_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1589:1: ( ( rule__Model__ExecutionsAssignment_3_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1590:1: ( rule__Model__ExecutionsAssignment_3_2 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_3_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1591:1: ( rule__Model__ExecutionsAssignment_3_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1591:2: rule__Model__ExecutionsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_3_2_in_rule__Model__Group_3__2__Impl3417);
            rule__Model__ExecutionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExecutionsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__Model__Group_3__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1601:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl rule__Model__Group_3__4 ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1605:1: ( rule__Model__Group_3__3__Impl rule__Model__Group_3__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1606:2: rule__Model__Group_3__3__Impl rule__Model__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__3__Impl_in_rule__Model__Group_3__33447);
            rule__Model__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__4_in_rule__Model__Group_3__33450);
            rule__Model__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__3"


    // $ANTLR start "rule__Model__Group_3__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1613:1: rule__Model__Group_3__3__Impl : ( ( rule__Model__Group_3_3__0 )* ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1617:1: ( ( ( rule__Model__Group_3_3__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1618:1: ( ( rule__Model__Group_3_3__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1618:1: ( ( rule__Model__Group_3_3__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1619:1: ( rule__Model__Group_3_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1620:1: ( rule__Model__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1620:2: rule__Model__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__0_in_rule__Model__Group_3__3__Impl3477);
            	    rule__Model__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__3__Impl"


    // $ANTLR start "rule__Model__Group_3__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1630:1: rule__Model__Group_3__4 : rule__Model__Group_3__4__Impl ;
    public final void rule__Model__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1634:1: ( rule__Model__Group_3__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1635:2: rule__Model__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__4__Impl_in_rule__Model__Group_3__43508);
            rule__Model__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__4"


    // $ANTLR start "rule__Model__Group_3__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1641:1: rule__Model__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1645:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1646:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1646:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1647:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Model__Group_3__4__Impl3536); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__4__Impl"


    // $ANTLR start "rule__Model__Group_3_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1670:1: rule__Model__Group_3_3__0 : rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 ;
    public final void rule__Model__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1674:1: ( rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1675:2: rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__0__Impl_in_rule__Model__Group_3_3__03577);
            rule__Model__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__1_in_rule__Model__Group_3_3__03580);
            rule__Model__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__0"


    // $ANTLR start "rule__Model__Group_3_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1682:1: rule__Model__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1686:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1687:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1687:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1688:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Model__Group_3_3__0__Impl3608); 
             after(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1701:1: rule__Model__Group_3_3__1 : rule__Model__Group_3_3__1__Impl ;
    public final void rule__Model__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1705:1: ( rule__Model__Group_3_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1706:2: rule__Model__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__1__Impl_in_rule__Model__Group_3_3__13639);
            rule__Model__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__1"


    // $ANTLR start "rule__Model__Group_3_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1712:1: rule__Model__Group_3_3__1__Impl : ( ( rule__Model__ExecutionsAssignment_3_3_1 ) ) ;
    public final void rule__Model__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1716:1: ( ( ( rule__Model__ExecutionsAssignment_3_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1717:1: ( ( rule__Model__ExecutionsAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1717:1: ( ( rule__Model__ExecutionsAssignment_3_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1718:1: ( rule__Model__ExecutionsAssignment_3_3_1 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_3_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1719:1: ( rule__Model__ExecutionsAssignment_3_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1719:2: rule__Model__ExecutionsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_3_3_1_in_rule__Model__Group_3_3__1__Impl3666);
            rule__Model__ExecutionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExecutionsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_3__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1733:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1737:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1738:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__03700);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__03703);
            rule__Copy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1745:1: rule__Copy__Group__0__Impl : ( 'Copy' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1749:1: ( ( 'Copy' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1750:1: ( 'Copy' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1750:1: ( 'Copy' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1751:1: 'Copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Copy__Group__0__Impl3731); 
             after(grammarAccess.getCopyAccess().getCopyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1764:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1768:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1769:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__13762);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__13765);
            rule__Copy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1776:1: rule__Copy__Group__1__Impl : ( '{' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1780:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1781:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1781:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1782:1: '{'
            {
             before(grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Copy__Group__1__Impl3793); 
             after(grammarAccess.getCopyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1795:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1799:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1800:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__23824);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__23827);
            rule__Copy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__2"


    // $ANTLR start "rule__Copy__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1807:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__Group_2__0 )? ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1811:1: ( ( ( rule__Copy__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1812:1: ( ( rule__Copy__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1812:1: ( ( rule__Copy__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1813:1: ( rule__Copy__Group_2__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1814:1: ( rule__Copy__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1814:2: rule__Copy__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_2__0_in_rule__Copy__Group__2__Impl3854);
                    rule__Copy__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCopyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1824:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1828:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1829:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__33885);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__33888);
            rule__Copy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__3"


    // $ANTLR start "rule__Copy__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1836:1: rule__Copy__Group__3__Impl : ( 'source' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1840:1: ( ( 'source' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1841:1: ( 'source' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1841:1: ( 'source' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1842:1: 'source'
            {
             before(grammarAccess.getCopyAccess().getSourceKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Copy__Group__3__Impl3916); 
             after(grammarAccess.getCopyAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__3__Impl"


    // $ANTLR start "rule__Copy__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1855:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1859:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1860:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__43947);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__43950);
            rule__Copy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__4"


    // $ANTLR start "rule__Copy__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1867:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__SourceAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1871:1: ( ( ( rule__Copy__SourceAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1872:1: ( ( rule__Copy__SourceAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1872:1: ( ( rule__Copy__SourceAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1873:1: ( rule__Copy__SourceAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getSourceAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1874:1: ( rule__Copy__SourceAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1874:2: rule__Copy__SourceAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__SourceAssignment_4_in_rule__Copy__Group__4__Impl3977);
            rule__Copy__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__4__Impl"


    // $ANTLR start "rule__Copy__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1884:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl rule__Copy__Group__6 ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1888:1: ( rule__Copy__Group__5__Impl rule__Copy__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1889:2: rule__Copy__Group__5__Impl rule__Copy__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__54007);
            rule__Copy__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__6_in_rule__Copy__Group__54010);
            rule__Copy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__5"


    // $ANTLR start "rule__Copy__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1896:1: rule__Copy__Group__5__Impl : ( 'destination' ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1900:1: ( ( 'destination' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1901:1: ( 'destination' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1901:1: ( 'destination' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1902:1: 'destination'
            {
             before(grammarAccess.getCopyAccess().getDestinationKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Copy__Group__5__Impl4038); 
             after(grammarAccess.getCopyAccess().getDestinationKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__5__Impl"


    // $ANTLR start "rule__Copy__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1915:1: rule__Copy__Group__6 : rule__Copy__Group__6__Impl rule__Copy__Group__7 ;
    public final void rule__Copy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1919:1: ( rule__Copy__Group__6__Impl rule__Copy__Group__7 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1920:2: rule__Copy__Group__6__Impl rule__Copy__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__6__Impl_in_rule__Copy__Group__64069);
            rule__Copy__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__7_in_rule__Copy__Group__64072);
            rule__Copy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__6"


    // $ANTLR start "rule__Copy__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1927:1: rule__Copy__Group__6__Impl : ( ( rule__Copy__DestinationAssignment_6 ) ) ;
    public final void rule__Copy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1931:1: ( ( ( rule__Copy__DestinationAssignment_6 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1932:1: ( ( rule__Copy__DestinationAssignment_6 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1932:1: ( ( rule__Copy__DestinationAssignment_6 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1933:1: ( rule__Copy__DestinationAssignment_6 )
            {
             before(grammarAccess.getCopyAccess().getDestinationAssignment_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1934:1: ( rule__Copy__DestinationAssignment_6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1934:2: rule__Copy__DestinationAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__DestinationAssignment_6_in_rule__Copy__Group__6__Impl4099);
            rule__Copy__DestinationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getDestinationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__6__Impl"


    // $ANTLR start "rule__Copy__Group__7"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1944:1: rule__Copy__Group__7 : rule__Copy__Group__7__Impl ;
    public final void rule__Copy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1948:1: ( rule__Copy__Group__7__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1949:2: rule__Copy__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__7__Impl_in_rule__Copy__Group__74129);
            rule__Copy__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__7"


    // $ANTLR start "rule__Copy__Group__7__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1955:1: rule__Copy__Group__7__Impl : ( '}' ) ;
    public final void rule__Copy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1959:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1960:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1960:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1961:1: '}'
            {
             before(grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Copy__Group__7__Impl4157); 
             after(grammarAccess.getCopyAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__7__Impl"


    // $ANTLR start "rule__Copy__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1990:1: rule__Copy__Group_2__0 : rule__Copy__Group_2__0__Impl rule__Copy__Group_2__1 ;
    public final void rule__Copy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1994:1: ( rule__Copy__Group_2__0__Impl rule__Copy__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1995:2: rule__Copy__Group_2__0__Impl rule__Copy__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_2__0__Impl_in_rule__Copy__Group_2__04204);
            rule__Copy__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_2__1_in_rule__Copy__Group_2__04207);
            rule__Copy__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_2__0"


    // $ANTLR start "rule__Copy__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2002:1: rule__Copy__Group_2__0__Impl : ( 'strategy' ) ;
    public final void rule__Copy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2006:1: ( ( 'strategy' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2007:1: ( 'strategy' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2007:1: ( 'strategy' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2008:1: 'strategy'
            {
             before(grammarAccess.getCopyAccess().getStrategyKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Copy__Group_2__0__Impl4235); 
             after(grammarAccess.getCopyAccess().getStrategyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_2__0__Impl"


    // $ANTLR start "rule__Copy__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2021:1: rule__Copy__Group_2__1 : rule__Copy__Group_2__1__Impl ;
    public final void rule__Copy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2025:1: ( rule__Copy__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2026:2: rule__Copy__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_2__1__Impl_in_rule__Copy__Group_2__14266);
            rule__Copy__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_2__1"


    // $ANTLR start "rule__Copy__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2032:1: rule__Copy__Group_2__1__Impl : ( ( rule__Copy__StrategyAssignment_2_1 ) ) ;
    public final void rule__Copy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2036:1: ( ( ( rule__Copy__StrategyAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2037:1: ( ( rule__Copy__StrategyAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2037:1: ( ( rule__Copy__StrategyAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2038:1: ( rule__Copy__StrategyAssignment_2_1 )
            {
             before(grammarAccess.getCopyAccess().getStrategyAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2039:1: ( rule__Copy__StrategyAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2039:2: rule__Copy__StrategyAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__StrategyAssignment_2_1_in_rule__Copy__Group_2__1__Impl4293);
            rule__Copy__StrategyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getStrategyAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_2__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2053:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2057:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2058:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__04327);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__04330);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2065:1: rule__Move__Group__0__Impl : ( 'Move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2069:1: ( ( 'Move' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2070:1: ( 'Move' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2070:1: ( 'Move' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2071:1: 'Move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Move__Group__0__Impl4358); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2084:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2088:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2089:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__14389);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__14392);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2096:1: rule__Move__Group__1__Impl : ( '{' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2100:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2101:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2101:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2102:1: '{'
            {
             before(grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Move__Group__1__Impl4420); 
             after(grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2115:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2119:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2120:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__24451);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__24454);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2127:1: rule__Move__Group__2__Impl : ( ( rule__Move__Group_2__0 )? ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2131:1: ( ( ( rule__Move__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2132:1: ( ( rule__Move__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2132:1: ( ( rule__Move__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2133:1: ( rule__Move__Group_2__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2134:1: ( rule__Move__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2134:2: rule__Move__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Move__Group_2__0_in_rule__Move__Group__2__Impl4481);
                    rule__Move__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2144:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2148:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2149:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__34512);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__34515);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2156:1: rule__Move__Group__3__Impl : ( 'source' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2160:1: ( ( 'source' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2161:1: ( 'source' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2161:1: ( 'source' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2162:1: 'source'
            {
             before(grammarAccess.getMoveAccess().getSourceKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Move__Group__3__Impl4543); 
             after(grammarAccess.getMoveAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2175:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2179:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2180:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__44574);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5_in_rule__Move__Group__44577);
            rule__Move__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2187:1: rule__Move__Group__4__Impl : ( ( rule__Move__SourceAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2191:1: ( ( ( rule__Move__SourceAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2192:1: ( ( rule__Move__SourceAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2192:1: ( ( rule__Move__SourceAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2193:1: ( rule__Move__SourceAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getSourceAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2194:1: ( rule__Move__SourceAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2194:2: rule__Move__SourceAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SourceAssignment_4_in_rule__Move__Group__4__Impl4604);
            rule__Move__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Move__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2204:1: rule__Move__Group__5 : rule__Move__Group__5__Impl rule__Move__Group__6 ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2208:1: ( rule__Move__Group__5__Impl rule__Move__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2209:2: rule__Move__Group__5__Impl rule__Move__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__54634);
            rule__Move__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__6_in_rule__Move__Group__54637);
            rule__Move__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2216:1: rule__Move__Group__5__Impl : ( 'destination' ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2220:1: ( ( 'destination' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2221:1: ( 'destination' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2221:1: ( 'destination' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2222:1: 'destination'
            {
             before(grammarAccess.getMoveAccess().getDestinationKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Move__Group__5__Impl4665); 
             after(grammarAccess.getMoveAccess().getDestinationKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__Move__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2235:1: rule__Move__Group__6 : rule__Move__Group__6__Impl rule__Move__Group__7 ;
    public final void rule__Move__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2239:1: ( rule__Move__Group__6__Impl rule__Move__Group__7 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2240:2: rule__Move__Group__6__Impl rule__Move__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__6__Impl_in_rule__Move__Group__64696);
            rule__Move__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__7_in_rule__Move__Group__64699);
            rule__Move__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__6"


    // $ANTLR start "rule__Move__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2247:1: rule__Move__Group__6__Impl : ( ( rule__Move__DestinationAssignment_6 ) ) ;
    public final void rule__Move__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2251:1: ( ( ( rule__Move__DestinationAssignment_6 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2252:1: ( ( rule__Move__DestinationAssignment_6 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2252:1: ( ( rule__Move__DestinationAssignment_6 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2253:1: ( rule__Move__DestinationAssignment_6 )
            {
             before(grammarAccess.getMoveAccess().getDestinationAssignment_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2254:1: ( rule__Move__DestinationAssignment_6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2254:2: rule__Move__DestinationAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__DestinationAssignment_6_in_rule__Move__Group__6__Impl4726);
            rule__Move__DestinationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDestinationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__6__Impl"


    // $ANTLR start "rule__Move__Group__7"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2264:1: rule__Move__Group__7 : rule__Move__Group__7__Impl ;
    public final void rule__Move__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2268:1: ( rule__Move__Group__7__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2269:2: rule__Move__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__7__Impl_in_rule__Move__Group__74756);
            rule__Move__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__7"


    // $ANTLR start "rule__Move__Group__7__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2275:1: rule__Move__Group__7__Impl : ( '}' ) ;
    public final void rule__Move__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2279:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2280:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2280:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2281:1: '}'
            {
             before(grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_7()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Move__Group__7__Impl4784); 
             after(grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__7__Impl"


    // $ANTLR start "rule__Move__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2310:1: rule__Move__Group_2__0 : rule__Move__Group_2__0__Impl rule__Move__Group_2__1 ;
    public final void rule__Move__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2314:1: ( rule__Move__Group_2__0__Impl rule__Move__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2315:2: rule__Move__Group_2__0__Impl rule__Move__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_2__0__Impl_in_rule__Move__Group_2__04831);
            rule__Move__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_2__1_in_rule__Move__Group_2__04834);
            rule__Move__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2__0"


    // $ANTLR start "rule__Move__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2322:1: rule__Move__Group_2__0__Impl : ( 'strategy' ) ;
    public final void rule__Move__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2326:1: ( ( 'strategy' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2327:1: ( 'strategy' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2327:1: ( 'strategy' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2328:1: 'strategy'
            {
             before(grammarAccess.getMoveAccess().getStrategyKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Move__Group_2__0__Impl4862); 
             after(grammarAccess.getMoveAccess().getStrategyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2__0__Impl"


    // $ANTLR start "rule__Move__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2341:1: rule__Move__Group_2__1 : rule__Move__Group_2__1__Impl ;
    public final void rule__Move__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2345:1: ( rule__Move__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2346:2: rule__Move__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_2__1__Impl_in_rule__Move__Group_2__14893);
            rule__Move__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2__1"


    // $ANTLR start "rule__Move__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2352:1: rule__Move__Group_2__1__Impl : ( ( rule__Move__StrategyAssignment_2_1 ) ) ;
    public final void rule__Move__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2356:1: ( ( ( rule__Move__StrategyAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2357:1: ( ( rule__Move__StrategyAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2357:1: ( ( rule__Move__StrategyAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2358:1: ( rule__Move__StrategyAssignment_2_1 )
            {
             before(grammarAccess.getMoveAccess().getStrategyAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2359:1: ( rule__Move__StrategyAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2359:2: rule__Move__StrategyAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__StrategyAssignment_2_1_in_rule__Move__Group_2__1__Impl4920);
            rule__Move__StrategyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getStrategyAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_2__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2373:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2377:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2378:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__04954);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__04957);
            rule__Delete__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2385:1: rule__Delete__Group__0__Impl : ( 'Delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2389:1: ( ( 'Delete' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2390:1: ( 'Delete' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2390:1: ( 'Delete' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2391:1: 'Delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Delete__Group__0__Impl4985); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2404:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2408:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2409:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__15016);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__15019);
            rule__Delete__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2416:1: rule__Delete__Group__1__Impl : ( '{' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2420:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2421:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2421:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2422:1: '{'
            {
             before(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Delete__Group__1__Impl5047); 
             after(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2435:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2439:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2440:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__25078);
            rule__Delete__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__3_in_rule__Delete__Group__25081);
            rule__Delete__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__2"


    // $ANTLR start "rule__Delete__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2447:1: rule__Delete__Group__2__Impl : ( 'source' ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2451:1: ( ( 'source' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2452:1: ( 'source' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2452:1: ( 'source' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2453:1: 'source'
            {
             before(grammarAccess.getDeleteAccess().getSourceKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Delete__Group__2__Impl5109); 
             after(grammarAccess.getDeleteAccess().getSourceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__2__Impl"


    // $ANTLR start "rule__Delete__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2466:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2470:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2471:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__3__Impl_in_rule__Delete__Group__35140);
            rule__Delete__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__4_in_rule__Delete__Group__35143);
            rule__Delete__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__3"


    // $ANTLR start "rule__Delete__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2478:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__SourceAssignment_3 ) ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2482:1: ( ( ( rule__Delete__SourceAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2483:1: ( ( rule__Delete__SourceAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2483:1: ( ( rule__Delete__SourceAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2484:1: ( rule__Delete__SourceAssignment_3 )
            {
             before(grammarAccess.getDeleteAccess().getSourceAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2485:1: ( rule__Delete__SourceAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2485:2: rule__Delete__SourceAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__SourceAssignment_3_in_rule__Delete__Group__3__Impl5170);
            rule__Delete__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__3__Impl"


    // $ANTLR start "rule__Delete__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2495:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2499:1: ( rule__Delete__Group__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2500:2: rule__Delete__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__4__Impl_in_rule__Delete__Group__45200);
            rule__Delete__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__4"


    // $ANTLR start "rule__Delete__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2506:1: rule__Delete__Group__4__Impl : ( '}' ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2510:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2511:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2511:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2512:1: '}'
            {
             before(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Delete__Group__4__Impl5228); 
             after(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__4__Impl"


    // $ANTLR start "rule__PathVariable__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2535:1: rule__PathVariable__Group__0 : rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 ;
    public final void rule__PathVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2539:1: ( rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2540:2: rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__05269);
            rule__PathVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__05272);
            rule__PathVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__0"


    // $ANTLR start "rule__PathVariable__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2547:1: rule__PathVariable__Group__0__Impl : ( 'PathVariable' ) ;
    public final void rule__PathVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2551:1: ( ( 'PathVariable' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2552:1: ( 'PathVariable' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2552:1: ( 'PathVariable' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2553:1: 'PathVariable'
            {
             before(grammarAccess.getPathVariableAccess().getPathVariableKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__PathVariable__Group__0__Impl5300); 
             after(grammarAccess.getPathVariableAccess().getPathVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__0__Impl"


    // $ANTLR start "rule__PathVariable__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2566:1: rule__PathVariable__Group__1 : rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 ;
    public final void rule__PathVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2570:1: ( rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2571:2: rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__15331);
            rule__PathVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__15334);
            rule__PathVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__1"


    // $ANTLR start "rule__PathVariable__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2578:1: rule__PathVariable__Group__1__Impl : ( ( rule__PathVariable__NameAssignment_1 ) ) ;
    public final void rule__PathVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2582:1: ( ( ( rule__PathVariable__NameAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2583:1: ( ( rule__PathVariable__NameAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2583:1: ( ( rule__PathVariable__NameAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2584:1: ( rule__PathVariable__NameAssignment_1 )
            {
             before(grammarAccess.getPathVariableAccess().getNameAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2585:1: ( rule__PathVariable__NameAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2585:2: rule__PathVariable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__NameAssignment_1_in_rule__PathVariable__Group__1__Impl5361);
            rule__PathVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__1__Impl"


    // $ANTLR start "rule__PathVariable__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2595:1: rule__PathVariable__Group__2 : rule__PathVariable__Group__2__Impl rule__PathVariable__Group__3 ;
    public final void rule__PathVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2599:1: ( rule__PathVariable__Group__2__Impl rule__PathVariable__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2600:2: rule__PathVariable__Group__2__Impl rule__PathVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__25391);
            rule__PathVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__3_in_rule__PathVariable__Group__25394);
            rule__PathVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__2"


    // $ANTLR start "rule__PathVariable__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2607:1: rule__PathVariable__Group__2__Impl : ( '{' ) ;
    public final void rule__PathVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2611:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2612:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2612:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2613:1: '{'
            {
             before(grammarAccess.getPathVariableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__PathVariable__Group__2__Impl5422); 
             after(grammarAccess.getPathVariableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__2__Impl"


    // $ANTLR start "rule__PathVariable__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2626:1: rule__PathVariable__Group__3 : rule__PathVariable__Group__3__Impl rule__PathVariable__Group__4 ;
    public final void rule__PathVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2630:1: ( rule__PathVariable__Group__3__Impl rule__PathVariable__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2631:2: rule__PathVariable__Group__3__Impl rule__PathVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__3__Impl_in_rule__PathVariable__Group__35453);
            rule__PathVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__4_in_rule__PathVariable__Group__35456);
            rule__PathVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__3"


    // $ANTLR start "rule__PathVariable__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2638:1: rule__PathVariable__Group__3__Impl : ( 'value' ) ;
    public final void rule__PathVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2642:1: ( ( 'value' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2643:1: ( 'value' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2643:1: ( 'value' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2644:1: 'value'
            {
             before(grammarAccess.getPathVariableAccess().getValueKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__PathVariable__Group__3__Impl5484); 
             after(grammarAccess.getPathVariableAccess().getValueKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__3__Impl"


    // $ANTLR start "rule__PathVariable__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2657:1: rule__PathVariable__Group__4 : rule__PathVariable__Group__4__Impl rule__PathVariable__Group__5 ;
    public final void rule__PathVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2661:1: ( rule__PathVariable__Group__4__Impl rule__PathVariable__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2662:2: rule__PathVariable__Group__4__Impl rule__PathVariable__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__4__Impl_in_rule__PathVariable__Group__45515);
            rule__PathVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__5_in_rule__PathVariable__Group__45518);
            rule__PathVariable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__4"


    // $ANTLR start "rule__PathVariable__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2669:1: rule__PathVariable__Group__4__Impl : ( ( rule__PathVariable__ValueAssignment_4 ) ) ;
    public final void rule__PathVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2673:1: ( ( ( rule__PathVariable__ValueAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2674:1: ( ( rule__PathVariable__ValueAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2674:1: ( ( rule__PathVariable__ValueAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2675:1: ( rule__PathVariable__ValueAssignment_4 )
            {
             before(grammarAccess.getPathVariableAccess().getValueAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2676:1: ( rule__PathVariable__ValueAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2676:2: rule__PathVariable__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__ValueAssignment_4_in_rule__PathVariable__Group__4__Impl5545);
            rule__PathVariable__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPathVariableAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__4__Impl"


    // $ANTLR start "rule__PathVariable__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2686:1: rule__PathVariable__Group__5 : rule__PathVariable__Group__5__Impl ;
    public final void rule__PathVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2690:1: ( rule__PathVariable__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2691:2: rule__PathVariable__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__5__Impl_in_rule__PathVariable__Group__55575);
            rule__PathVariable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__5"


    // $ANTLR start "rule__PathVariable__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2697:1: rule__PathVariable__Group__5__Impl : ( '}' ) ;
    public final void rule__PathVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2701:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2702:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2702:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2703:1: '}'
            {
             before(grammarAccess.getPathVariableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__PathVariable__Group__5__Impl5603); 
             after(grammarAccess.getPathVariableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__Group__5__Impl"


    // $ANTLR start "rule__SelectionVariable__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2728:1: rule__SelectionVariable__Group__0 : rule__SelectionVariable__Group__0__Impl rule__SelectionVariable__Group__1 ;
    public final void rule__SelectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2732:1: ( rule__SelectionVariable__Group__0__Impl rule__SelectionVariable__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2733:2: rule__SelectionVariable__Group__0__Impl rule__SelectionVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__0__Impl_in_rule__SelectionVariable__Group__05646);
            rule__SelectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__1_in_rule__SelectionVariable__Group__05649);
            rule__SelectionVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__0"


    // $ANTLR start "rule__SelectionVariable__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2740:1: rule__SelectionVariable__Group__0__Impl : ( 'SelectionVariable' ) ;
    public final void rule__SelectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2744:1: ( ( 'SelectionVariable' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2745:1: ( 'SelectionVariable' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2745:1: ( 'SelectionVariable' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2746:1: 'SelectionVariable'
            {
             before(grammarAccess.getSelectionVariableAccess().getSelectionVariableKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__SelectionVariable__Group__0__Impl5677); 
             after(grammarAccess.getSelectionVariableAccess().getSelectionVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__0__Impl"


    // $ANTLR start "rule__SelectionVariable__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2759:1: rule__SelectionVariable__Group__1 : rule__SelectionVariable__Group__1__Impl rule__SelectionVariable__Group__2 ;
    public final void rule__SelectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2763:1: ( rule__SelectionVariable__Group__1__Impl rule__SelectionVariable__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2764:2: rule__SelectionVariable__Group__1__Impl rule__SelectionVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__1__Impl_in_rule__SelectionVariable__Group__15708);
            rule__SelectionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__2_in_rule__SelectionVariable__Group__15711);
            rule__SelectionVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__1"


    // $ANTLR start "rule__SelectionVariable__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2771:1: rule__SelectionVariable__Group__1__Impl : ( ( rule__SelectionVariable__NameAssignment_1 ) ) ;
    public final void rule__SelectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2775:1: ( ( ( rule__SelectionVariable__NameAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2776:1: ( ( rule__SelectionVariable__NameAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2776:1: ( ( rule__SelectionVariable__NameAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2777:1: ( rule__SelectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionVariableAccess().getNameAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2778:1: ( rule__SelectionVariable__NameAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2778:2: rule__SelectionVariable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__NameAssignment_1_in_rule__SelectionVariable__Group__1__Impl5738);
            rule__SelectionVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__1__Impl"


    // $ANTLR start "rule__SelectionVariable__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2788:1: rule__SelectionVariable__Group__2 : rule__SelectionVariable__Group__2__Impl rule__SelectionVariable__Group__3 ;
    public final void rule__SelectionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2792:1: ( rule__SelectionVariable__Group__2__Impl rule__SelectionVariable__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2793:2: rule__SelectionVariable__Group__2__Impl rule__SelectionVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__2__Impl_in_rule__SelectionVariable__Group__25768);
            rule__SelectionVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__3_in_rule__SelectionVariable__Group__25771);
            rule__SelectionVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__2"


    // $ANTLR start "rule__SelectionVariable__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2800:1: rule__SelectionVariable__Group__2__Impl : ( '{' ) ;
    public final void rule__SelectionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2804:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2805:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2805:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2806:1: '{'
            {
             before(grammarAccess.getSelectionVariableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__SelectionVariable__Group__2__Impl5799); 
             after(grammarAccess.getSelectionVariableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__2__Impl"


    // $ANTLR start "rule__SelectionVariable__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2819:1: rule__SelectionVariable__Group__3 : rule__SelectionVariable__Group__3__Impl rule__SelectionVariable__Group__4 ;
    public final void rule__SelectionVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2823:1: ( rule__SelectionVariable__Group__3__Impl rule__SelectionVariable__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2824:2: rule__SelectionVariable__Group__3__Impl rule__SelectionVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__3__Impl_in_rule__SelectionVariable__Group__35830);
            rule__SelectionVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__4_in_rule__SelectionVariable__Group__35833);
            rule__SelectionVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__3"


    // $ANTLR start "rule__SelectionVariable__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2831:1: rule__SelectionVariable__Group__3__Impl : ( 'value' ) ;
    public final void rule__SelectionVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2835:1: ( ( 'value' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2836:1: ( 'value' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2836:1: ( 'value' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2837:1: 'value'
            {
             before(grammarAccess.getSelectionVariableAccess().getValueKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__SelectionVariable__Group__3__Impl5861); 
             after(grammarAccess.getSelectionVariableAccess().getValueKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__3__Impl"


    // $ANTLR start "rule__SelectionVariable__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2850:1: rule__SelectionVariable__Group__4 : rule__SelectionVariable__Group__4__Impl rule__SelectionVariable__Group__5 ;
    public final void rule__SelectionVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2854:1: ( rule__SelectionVariable__Group__4__Impl rule__SelectionVariable__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2855:2: rule__SelectionVariable__Group__4__Impl rule__SelectionVariable__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__4__Impl_in_rule__SelectionVariable__Group__45892);
            rule__SelectionVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__5_in_rule__SelectionVariable__Group__45895);
            rule__SelectionVariable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__4"


    // $ANTLR start "rule__SelectionVariable__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2862:1: rule__SelectionVariable__Group__4__Impl : ( ( rule__SelectionVariable__ValueAssignment_4 ) ) ;
    public final void rule__SelectionVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2866:1: ( ( ( rule__SelectionVariable__ValueAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2867:1: ( ( rule__SelectionVariable__ValueAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2867:1: ( ( rule__SelectionVariable__ValueAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2868:1: ( rule__SelectionVariable__ValueAssignment_4 )
            {
             before(grammarAccess.getSelectionVariableAccess().getValueAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2869:1: ( rule__SelectionVariable__ValueAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2869:2: rule__SelectionVariable__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__ValueAssignment_4_in_rule__SelectionVariable__Group__4__Impl5922);
            rule__SelectionVariable__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSelectionVariableAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__4__Impl"


    // $ANTLR start "rule__SelectionVariable__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2879:1: rule__SelectionVariable__Group__5 : rule__SelectionVariable__Group__5__Impl ;
    public final void rule__SelectionVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2883:1: ( rule__SelectionVariable__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2884:2: rule__SelectionVariable__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__5__Impl_in_rule__SelectionVariable__Group__55952);
            rule__SelectionVariable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__5"


    // $ANTLR start "rule__SelectionVariable__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2890:1: rule__SelectionVariable__Group__5__Impl : ( '}' ) ;
    public final void rule__SelectionVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2894:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2895:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2895:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2896:1: '}'
            {
             before(grammarAccess.getSelectionVariableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__SelectionVariable__Group__5__Impl5980); 
             after(grammarAccess.getSelectionVariableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__Group__5__Impl"


    // $ANTLR start "rule__Path__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2921:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2925:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2926:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__06023);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1_in_rule__Path__Group__06026);
            rule__Path__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2933:1: rule__Path__Group__0__Impl : ( 'Path' ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2937:1: ( ( 'Path' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2938:1: ( 'Path' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2938:1: ( 'Path' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2939:1: 'Path'
            {
             before(grammarAccess.getPathAccess().getPathKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Path__Group__0__Impl6054); 
             after(grammarAccess.getPathAccess().getPathKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2952:1: rule__Path__Group__1 : rule__Path__Group__1__Impl rule__Path__Group__2 ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2956:1: ( rule__Path__Group__1__Impl rule__Path__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2957:2: rule__Path__Group__1__Impl rule__Path__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__16085);
            rule__Path__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__2_in_rule__Path__Group__16088);
            rule__Path__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2964:1: rule__Path__Group__1__Impl : ( '{' ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2968:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2969:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2969:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2970:1: '{'
            {
             before(grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Path__Group__1__Impl6116); 
             after(grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__Path__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2983:1: rule__Path__Group__2 : rule__Path__Group__2__Impl rule__Path__Group__3 ;
    public final void rule__Path__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2987:1: ( rule__Path__Group__2__Impl rule__Path__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2988:2: rule__Path__Group__2__Impl rule__Path__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__26147);
            rule__Path__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__3_in_rule__Path__Group__26150);
            rule__Path__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2"


    // $ANTLR start "rule__Path__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2995:1: rule__Path__Group__2__Impl : ( ( rule__Path__Group_2__0 )? ) ;
    public final void rule__Path__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2999:1: ( ( ( rule__Path__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3000:1: ( ( rule__Path__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3000:1: ( ( rule__Path__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3001:1: ( rule__Path__Group_2__0 )?
            {
             before(grammarAccess.getPathAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3002:1: ( rule__Path__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3002:2: rule__Path__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__0_in_rule__Path__Group__2__Impl6177);
                    rule__Path__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2__Impl"


    // $ANTLR start "rule__Path__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3012:1: rule__Path__Group__3 : rule__Path__Group__3__Impl rule__Path__Group__4 ;
    public final void rule__Path__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3016:1: ( rule__Path__Group__3__Impl rule__Path__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3017:2: rule__Path__Group__3__Impl rule__Path__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__36208);
            rule__Path__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__4_in_rule__Path__Group__36211);
            rule__Path__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__3"


    // $ANTLR start "rule__Path__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3024:1: rule__Path__Group__3__Impl : ( 'steps' ) ;
    public final void rule__Path__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3028:1: ( ( 'steps' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3029:1: ( 'steps' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3029:1: ( 'steps' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3030:1: 'steps'
            {
             before(grammarAccess.getPathAccess().getStepsKeyword_3()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Path__Group__3__Impl6239); 
             after(grammarAccess.getPathAccess().getStepsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__3__Impl"


    // $ANTLR start "rule__Path__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3043:1: rule__Path__Group__4 : rule__Path__Group__4__Impl rule__Path__Group__5 ;
    public final void rule__Path__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3047:1: ( rule__Path__Group__4__Impl rule__Path__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3048:2: rule__Path__Group__4__Impl rule__Path__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__4__Impl_in_rule__Path__Group__46270);
            rule__Path__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__5_in_rule__Path__Group__46273);
            rule__Path__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__4"


    // $ANTLR start "rule__Path__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3055:1: rule__Path__Group__4__Impl : ( '{' ) ;
    public final void rule__Path__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3059:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3060:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3060:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3061:1: '{'
            {
             before(grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Path__Group__4__Impl6301); 
             after(grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__4__Impl"


    // $ANTLR start "rule__Path__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3074:1: rule__Path__Group__5 : rule__Path__Group__5__Impl rule__Path__Group__6 ;
    public final void rule__Path__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3078:1: ( rule__Path__Group__5__Impl rule__Path__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3079:2: rule__Path__Group__5__Impl rule__Path__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__5__Impl_in_rule__Path__Group__56332);
            rule__Path__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__6_in_rule__Path__Group__56335);
            rule__Path__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__5"


    // $ANTLR start "rule__Path__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3086:1: rule__Path__Group__5__Impl : ( ( rule__Path__StepsAssignment_5 ) ) ;
    public final void rule__Path__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3090:1: ( ( ( rule__Path__StepsAssignment_5 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3091:1: ( ( rule__Path__StepsAssignment_5 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3091:1: ( ( rule__Path__StepsAssignment_5 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3092:1: ( rule__Path__StepsAssignment_5 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3093:1: ( rule__Path__StepsAssignment_5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3093:2: rule__Path__StepsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_5_in_rule__Path__Group__5__Impl6362);
            rule__Path__StepsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getStepsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__5__Impl"


    // $ANTLR start "rule__Path__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3103:1: rule__Path__Group__6 : rule__Path__Group__6__Impl rule__Path__Group__7 ;
    public final void rule__Path__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3107:1: ( rule__Path__Group__6__Impl rule__Path__Group__7 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3108:2: rule__Path__Group__6__Impl rule__Path__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__6__Impl_in_rule__Path__Group__66392);
            rule__Path__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__7_in_rule__Path__Group__66395);
            rule__Path__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__6"


    // $ANTLR start "rule__Path__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3115:1: rule__Path__Group__6__Impl : ( ( rule__Path__Group_6__0 )* ) ;
    public final void rule__Path__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3119:1: ( ( ( rule__Path__Group_6__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3120:1: ( ( rule__Path__Group_6__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3120:1: ( ( rule__Path__Group_6__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3121:1: ( rule__Path__Group_6__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3122:1: ( rule__Path__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3122:2: rule__Path__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Path__Group_6__0_in_rule__Path__Group__6__Impl6422);
            	    rule__Path__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__6__Impl"


    // $ANTLR start "rule__Path__Group__7"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3132:1: rule__Path__Group__7 : rule__Path__Group__7__Impl rule__Path__Group__8 ;
    public final void rule__Path__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3136:1: ( rule__Path__Group__7__Impl rule__Path__Group__8 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3137:2: rule__Path__Group__7__Impl rule__Path__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__7__Impl_in_rule__Path__Group__76453);
            rule__Path__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__8_in_rule__Path__Group__76456);
            rule__Path__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__7"


    // $ANTLR start "rule__Path__Group__7__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3144:1: rule__Path__Group__7__Impl : ( '}' ) ;
    public final void rule__Path__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3148:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3149:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3149:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3150:1: '}'
            {
             before(grammarAccess.getPathAccess().getRightCurlyBracketKeyword_7()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Path__Group__7__Impl6484); 
             after(grammarAccess.getPathAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__7__Impl"


    // $ANTLR start "rule__Path__Group__8"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3163:1: rule__Path__Group__8 : rule__Path__Group__8__Impl ;
    public final void rule__Path__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3167:1: ( rule__Path__Group__8__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3168:2: rule__Path__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__8__Impl_in_rule__Path__Group__86515);
            rule__Path__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__8"


    // $ANTLR start "rule__Path__Group__8__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3174:1: rule__Path__Group__8__Impl : ( '}' ) ;
    public final void rule__Path__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3178:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3179:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3179:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3180:1: '}'
            {
             before(grammarAccess.getPathAccess().getRightCurlyBracketKeyword_8()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Path__Group__8__Impl6543); 
             after(grammarAccess.getPathAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__8__Impl"


    // $ANTLR start "rule__Path__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3211:1: rule__Path__Group_2__0 : rule__Path__Group_2__0__Impl rule__Path__Group_2__1 ;
    public final void rule__Path__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3215:1: ( rule__Path__Group_2__0__Impl rule__Path__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3216:2: rule__Path__Group_2__0__Impl rule__Path__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__0__Impl_in_rule__Path__Group_2__06592);
            rule__Path__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__1_in_rule__Path__Group_2__06595);
            rule__Path__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__0"


    // $ANTLR start "rule__Path__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3223:1: rule__Path__Group_2__0__Impl : ( 'absolute' ) ;
    public final void rule__Path__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3227:1: ( ( 'absolute' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3228:1: ( 'absolute' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3228:1: ( 'absolute' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3229:1: 'absolute'
            {
             before(grammarAccess.getPathAccess().getAbsoluteKeyword_2_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Path__Group_2__0__Impl6623); 
             after(grammarAccess.getPathAccess().getAbsoluteKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__0__Impl"


    // $ANTLR start "rule__Path__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3242:1: rule__Path__Group_2__1 : rule__Path__Group_2__1__Impl ;
    public final void rule__Path__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3246:1: ( rule__Path__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3247:2: rule__Path__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__1__Impl_in_rule__Path__Group_2__16654);
            rule__Path__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__1"


    // $ANTLR start "rule__Path__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3253:1: rule__Path__Group_2__1__Impl : ( ( rule__Path__AbsoluteAssignment_2_1 ) ) ;
    public final void rule__Path__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3257:1: ( ( ( rule__Path__AbsoluteAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3258:1: ( ( rule__Path__AbsoluteAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3258:1: ( ( rule__Path__AbsoluteAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3259:1: ( rule__Path__AbsoluteAssignment_2_1 )
            {
             before(grammarAccess.getPathAccess().getAbsoluteAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3260:1: ( rule__Path__AbsoluteAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3260:2: rule__Path__AbsoluteAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__AbsoluteAssignment_2_1_in_rule__Path__Group_2__1__Impl6681);
            rule__Path__AbsoluteAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAbsoluteAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__1__Impl"


    // $ANTLR start "rule__Path__Group_6__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3274:1: rule__Path__Group_6__0 : rule__Path__Group_6__0__Impl rule__Path__Group_6__1 ;
    public final void rule__Path__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3278:1: ( rule__Path__Group_6__0__Impl rule__Path__Group_6__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3279:2: rule__Path__Group_6__0__Impl rule__Path__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_6__0__Impl_in_rule__Path__Group_6__06715);
            rule__Path__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_6__1_in_rule__Path__Group_6__06718);
            rule__Path__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_6__0"


    // $ANTLR start "rule__Path__Group_6__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3286:1: rule__Path__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Path__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3290:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3291:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3291:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3292:1: ','
            {
             before(grammarAccess.getPathAccess().getCommaKeyword_6_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Path__Group_6__0__Impl6746); 
             after(grammarAccess.getPathAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_6__0__Impl"


    // $ANTLR start "rule__Path__Group_6__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3305:1: rule__Path__Group_6__1 : rule__Path__Group_6__1__Impl ;
    public final void rule__Path__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3309:1: ( rule__Path__Group_6__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3310:2: rule__Path__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_6__1__Impl_in_rule__Path__Group_6__16777);
            rule__Path__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_6__1"


    // $ANTLR start "rule__Path__Group_6__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3316:1: rule__Path__Group_6__1__Impl : ( ( rule__Path__StepsAssignment_6_1 ) ) ;
    public final void rule__Path__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3320:1: ( ( ( rule__Path__StepsAssignment_6_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3321:1: ( ( rule__Path__StepsAssignment_6_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3321:1: ( ( rule__Path__StepsAssignment_6_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3322:1: ( rule__Path__StepsAssignment_6_1 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_6_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3323:1: ( rule__Path__StepsAssignment_6_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3323:2: rule__Path__StepsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_6_1_in_rule__Path__Group_6__1__Impl6804);
            rule__Path__StepsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getStepsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_6__1__Impl"


    // $ANTLR start "rule__ConcreteStep__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3337:1: rule__ConcreteStep__Group__0 : rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1 ;
    public final void rule__ConcreteStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3341:1: ( rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3342:2: rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__0__Impl_in_rule__ConcreteStep__Group__06838);
            rule__ConcreteStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__1_in_rule__ConcreteStep__Group__06841);
            rule__ConcreteStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__0"


    // $ANTLR start "rule__ConcreteStep__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3349:1: rule__ConcreteStep__Group__0__Impl : ( 'ConcreteStep' ) ;
    public final void rule__ConcreteStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3353:1: ( ( 'ConcreteStep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3354:1: ( 'ConcreteStep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3354:1: ( 'ConcreteStep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3355:1: 'ConcreteStep'
            {
             before(grammarAccess.getConcreteStepAccess().getConcreteStepKeyword_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__ConcreteStep__Group__0__Impl6869); 
             after(grammarAccess.getConcreteStepAccess().getConcreteStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__0__Impl"


    // $ANTLR start "rule__ConcreteStep__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3368:1: rule__ConcreteStep__Group__1 : rule__ConcreteStep__Group__1__Impl rule__ConcreteStep__Group__2 ;
    public final void rule__ConcreteStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3372:1: ( rule__ConcreteStep__Group__1__Impl rule__ConcreteStep__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3373:2: rule__ConcreteStep__Group__1__Impl rule__ConcreteStep__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__1__Impl_in_rule__ConcreteStep__Group__16900);
            rule__ConcreteStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__2_in_rule__ConcreteStep__Group__16903);
            rule__ConcreteStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__1"


    // $ANTLR start "rule__ConcreteStep__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3380:1: rule__ConcreteStep__Group__1__Impl : ( '{' ) ;
    public final void rule__ConcreteStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3384:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3385:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3385:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3386:1: '{'
            {
             before(grammarAccess.getConcreteStepAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ConcreteStep__Group__1__Impl6931); 
             after(grammarAccess.getConcreteStepAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__1__Impl"


    // $ANTLR start "rule__ConcreteStep__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3399:1: rule__ConcreteStep__Group__2 : rule__ConcreteStep__Group__2__Impl rule__ConcreteStep__Group__3 ;
    public final void rule__ConcreteStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3403:1: ( rule__ConcreteStep__Group__2__Impl rule__ConcreteStep__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3404:2: rule__ConcreteStep__Group__2__Impl rule__ConcreteStep__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__2__Impl_in_rule__ConcreteStep__Group__26962);
            rule__ConcreteStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__3_in_rule__ConcreteStep__Group__26965);
            rule__ConcreteStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__2"


    // $ANTLR start "rule__ConcreteStep__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3411:1: rule__ConcreteStep__Group__2__Impl : ( 'value' ) ;
    public final void rule__ConcreteStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3415:1: ( ( 'value' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3416:1: ( 'value' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3416:1: ( 'value' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3417:1: 'value'
            {
             before(grammarAccess.getConcreteStepAccess().getValueKeyword_2()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__ConcreteStep__Group__2__Impl6993); 
             after(grammarAccess.getConcreteStepAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__2__Impl"


    // $ANTLR start "rule__ConcreteStep__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3430:1: rule__ConcreteStep__Group__3 : rule__ConcreteStep__Group__3__Impl rule__ConcreteStep__Group__4 ;
    public final void rule__ConcreteStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3434:1: ( rule__ConcreteStep__Group__3__Impl rule__ConcreteStep__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3435:2: rule__ConcreteStep__Group__3__Impl rule__ConcreteStep__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__3__Impl_in_rule__ConcreteStep__Group__37024);
            rule__ConcreteStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__4_in_rule__ConcreteStep__Group__37027);
            rule__ConcreteStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__3"


    // $ANTLR start "rule__ConcreteStep__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3442:1: rule__ConcreteStep__Group__3__Impl : ( ( rule__ConcreteStep__ValueAssignment_3 ) ) ;
    public final void rule__ConcreteStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3446:1: ( ( ( rule__ConcreteStep__ValueAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3447:1: ( ( rule__ConcreteStep__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3447:1: ( ( rule__ConcreteStep__ValueAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3448:1: ( rule__ConcreteStep__ValueAssignment_3 )
            {
             before(grammarAccess.getConcreteStepAccess().getValueAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3449:1: ( rule__ConcreteStep__ValueAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3449:2: rule__ConcreteStep__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__ValueAssignment_3_in_rule__ConcreteStep__Group__3__Impl7054);
            rule__ConcreteStep__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConcreteStepAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__3__Impl"


    // $ANTLR start "rule__ConcreteStep__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3459:1: rule__ConcreteStep__Group__4 : rule__ConcreteStep__Group__4__Impl ;
    public final void rule__ConcreteStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3463:1: ( rule__ConcreteStep__Group__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3464:2: rule__ConcreteStep__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__4__Impl_in_rule__ConcreteStep__Group__47084);
            rule__ConcreteStep__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__4"


    // $ANTLR start "rule__ConcreteStep__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3470:1: rule__ConcreteStep__Group__4__Impl : ( '}' ) ;
    public final void rule__ConcreteStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3474:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3475:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3475:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3476:1: '}'
            {
             before(grammarAccess.getConcreteStepAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ConcreteStep__Group__4__Impl7112); 
             after(grammarAccess.getConcreteStepAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__Group__4__Impl"


    // $ANTLR start "rule__VariableStep__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3499:1: rule__VariableStep__Group__0 : rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 ;
    public final void rule__VariableStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3503:1: ( rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3504:2: rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__07153);
            rule__VariableStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__07156);
            rule__VariableStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__0"


    // $ANTLR start "rule__VariableStep__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3511:1: rule__VariableStep__Group__0__Impl : ( 'VariableStep' ) ;
    public final void rule__VariableStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3515:1: ( ( 'VariableStep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3516:1: ( 'VariableStep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3516:1: ( 'VariableStep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3517:1: 'VariableStep'
            {
             before(grammarAccess.getVariableStepAccess().getVariableStepKeyword_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__VariableStep__Group__0__Impl7184); 
             after(grammarAccess.getVariableStepAccess().getVariableStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__0__Impl"


    // $ANTLR start "rule__VariableStep__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3530:1: rule__VariableStep__Group__1 : rule__VariableStep__Group__1__Impl rule__VariableStep__Group__2 ;
    public final void rule__VariableStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3534:1: ( rule__VariableStep__Group__1__Impl rule__VariableStep__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3535:2: rule__VariableStep__Group__1__Impl rule__VariableStep__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__17215);
            rule__VariableStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__2_in_rule__VariableStep__Group__17218);
            rule__VariableStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__1"


    // $ANTLR start "rule__VariableStep__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3542:1: rule__VariableStep__Group__1__Impl : ( '{' ) ;
    public final void rule__VariableStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3546:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3547:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3547:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3548:1: '{'
            {
             before(grammarAccess.getVariableStepAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__VariableStep__Group__1__Impl7246); 
             after(grammarAccess.getVariableStepAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__1__Impl"


    // $ANTLR start "rule__VariableStep__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3561:1: rule__VariableStep__Group__2 : rule__VariableStep__Group__2__Impl rule__VariableStep__Group__3 ;
    public final void rule__VariableStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3565:1: ( rule__VariableStep__Group__2__Impl rule__VariableStep__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3566:2: rule__VariableStep__Group__2__Impl rule__VariableStep__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__2__Impl_in_rule__VariableStep__Group__27277);
            rule__VariableStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__3_in_rule__VariableStep__Group__27280);
            rule__VariableStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__2"


    // $ANTLR start "rule__VariableStep__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3573:1: rule__VariableStep__Group__2__Impl : ( 'value' ) ;
    public final void rule__VariableStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3577:1: ( ( 'value' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3578:1: ( 'value' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3578:1: ( 'value' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3579:1: 'value'
            {
             before(grammarAccess.getVariableStepAccess().getValueKeyword_2()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__VariableStep__Group__2__Impl7308); 
             after(grammarAccess.getVariableStepAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__2__Impl"


    // $ANTLR start "rule__VariableStep__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3592:1: rule__VariableStep__Group__3 : rule__VariableStep__Group__3__Impl rule__VariableStep__Group__4 ;
    public final void rule__VariableStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3596:1: ( rule__VariableStep__Group__3__Impl rule__VariableStep__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3597:2: rule__VariableStep__Group__3__Impl rule__VariableStep__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__3__Impl_in_rule__VariableStep__Group__37339);
            rule__VariableStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__4_in_rule__VariableStep__Group__37342);
            rule__VariableStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__3"


    // $ANTLR start "rule__VariableStep__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3604:1: rule__VariableStep__Group__3__Impl : ( ( rule__VariableStep__ValueAssignment_3 ) ) ;
    public final void rule__VariableStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3608:1: ( ( ( rule__VariableStep__ValueAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3609:1: ( ( rule__VariableStep__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3609:1: ( ( rule__VariableStep__ValueAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3610:1: ( rule__VariableStep__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableStepAccess().getValueAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3611:1: ( rule__VariableStep__ValueAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3611:2: rule__VariableStep__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__ValueAssignment_3_in_rule__VariableStep__Group__3__Impl7369);
            rule__VariableStep__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableStepAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__3__Impl"


    // $ANTLR start "rule__VariableStep__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3621:1: rule__VariableStep__Group__4 : rule__VariableStep__Group__4__Impl ;
    public final void rule__VariableStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3625:1: ( rule__VariableStep__Group__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3626:2: rule__VariableStep__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__4__Impl_in_rule__VariableStep__Group__47399);
            rule__VariableStep__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__4"


    // $ANTLR start "rule__VariableStep__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3632:1: rule__VariableStep__Group__4__Impl : ( '}' ) ;
    public final void rule__VariableStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3636:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3637:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3637:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3638:1: '}'
            {
             before(grammarAccess.getVariableStepAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__VariableStep__Group__4__Impl7427); 
             after(grammarAccess.getVariableStepAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__Group__4__Impl"


    // $ANTLR start "rule__ParametrizedStep__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3661:1: rule__ParametrizedStep__Group__0 : rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 ;
    public final void rule__ParametrizedStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3665:1: ( rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3666:2: rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__07468);
            rule__ParametrizedStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__07471);
            rule__ParametrizedStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__Group__0"


    // $ANTLR start "rule__ParametrizedStep__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3673:1: rule__ParametrizedStep__Group__0__Impl : ( () ) ;
    public final void rule__ParametrizedStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3677:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3678:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3678:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3679:1: ()
            {
             before(grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3680:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3682:1: 
            {
            }

             after(grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__Group__0__Impl"


    // $ANTLR start "rule__ParametrizedStep__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3692:1: rule__ParametrizedStep__Group__1 : rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 ;
    public final void rule__ParametrizedStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3696:1: ( rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3697:2: rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__17529);
            rule__ParametrizedStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__17532);
            rule__ParametrizedStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__Group__1"


    // $ANTLR start "rule__ParametrizedStep__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3704:1: rule__ParametrizedStep__Group__1__Impl : ( 'ParametrizedStep' ) ;
    public final void rule__ParametrizedStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3708:1: ( ( 'ParametrizedStep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3709:1: ( 'ParametrizedStep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3709:1: ( 'ParametrizedStep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3710:1: 'ParametrizedStep'
            {
             before(grammarAccess.getParametrizedStepAccess().getParametrizedStepKeyword_1()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__ParametrizedStep__Group__1__Impl7560); 
             after(grammarAccess.getParametrizedStepAccess().getParametrizedStepKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__Group__1__Impl"


    // $ANTLR start "rule__ParametrizedStep__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3723:1: rule__ParametrizedStep__Group__2 : rule__ParametrizedStep__Group__2__Impl ;
    public final void rule__ParametrizedStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3727:1: ( rule__ParametrizedStep__Group__2__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3728:2: rule__ParametrizedStep__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__27591);
            rule__ParametrizedStep__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__Group__2"


    // $ANTLR start "rule__ParametrizedStep__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3734:1: rule__ParametrizedStep__Group__2__Impl : ( ( rule__ParametrizedStep__NameAssignment_2 ) ) ;
    public final void rule__ParametrizedStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3738:1: ( ( ( rule__ParametrizedStep__NameAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3739:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3739:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3740:1: ( rule__ParametrizedStep__NameAssignment_2 )
            {
             before(grammarAccess.getParametrizedStepAccess().getNameAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3741:1: ( rule__ParametrizedStep__NameAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3741:2: rule__ParametrizedStep__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl7618);
            rule__ParametrizedStep__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParametrizedStepAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3757:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3761:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3762:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__07654);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__07657);
            rule__Selection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0"


    // $ANTLR start "rule__Selection__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3769:1: rule__Selection__Group__0__Impl : ( 'Selection' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3773:1: ( ( 'Selection' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3774:1: ( 'Selection' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3774:1: ( 'Selection' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3775:1: 'Selection'
            {
             before(grammarAccess.getSelectionAccess().getSelectionKeyword_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Selection__Group__0__Impl7685); 
             after(grammarAccess.getSelectionAccess().getSelectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0__Impl"


    // $ANTLR start "rule__Selection__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3788:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3792:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3793:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__17716);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__17719);
            rule__Selection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1"


    // $ANTLR start "rule__Selection__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3800:1: rule__Selection__Group__1__Impl : ( '{' ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3804:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3805:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3805:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3806:1: '{'
            {
             before(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Selection__Group__1__Impl7747); 
             after(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3819:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3823:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3824:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__27778);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__27781);
            rule__Selection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2"


    // $ANTLR start "rule__Selection__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3831:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__Group_2__0 )? ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3835:1: ( ( ( rule__Selection__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3836:1: ( ( rule__Selection__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3836:1: ( ( rule__Selection__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3837:1: ( rule__Selection__Group_2__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3838:1: ( rule__Selection__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3838:2: rule__Selection__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__0_in_rule__Selection__Group__2__Impl7808);
                    rule__Selection__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3848:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3852:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3853:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__37839);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__37842);
            rule__Selection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__3"


    // $ANTLR start "rule__Selection__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3860:1: rule__Selection__Group__3__Impl : ( 'from' ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3864:1: ( ( 'from' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3865:1: ( 'from' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3865:1: ( 'from' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3866:1: 'from'
            {
             before(grammarAccess.getSelectionAccess().getFromKeyword_3()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Selection__Group__3__Impl7870); 
             after(grammarAccess.getSelectionAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__3__Impl"


    // $ANTLR start "rule__Selection__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3879:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3883:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3884:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__47901);
            rule__Selection__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__47904);
            rule__Selection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__4"


    // $ANTLR start "rule__Selection__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3891:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__FromAssignment_4 ) ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3895:1: ( ( ( rule__Selection__FromAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3896:1: ( ( rule__Selection__FromAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3896:1: ( ( rule__Selection__FromAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3897:1: ( rule__Selection__FromAssignment_4 )
            {
             before(grammarAccess.getSelectionAccess().getFromAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3898:1: ( rule__Selection__FromAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3898:2: rule__Selection__FromAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__FromAssignment_4_in_rule__Selection__Group__4__Impl7931);
            rule__Selection__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getFromAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__4__Impl"


    // $ANTLR start "rule__Selection__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3908:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3912:1: ( rule__Selection__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3913:2: rule__Selection__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__57961);
            rule__Selection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__5"


    // $ANTLR start "rule__Selection__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3919:1: rule__Selection__Group__5__Impl : ( '}' ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3923:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3924:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3924:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3925:1: '}'
            {
             before(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Selection__Group__5__Impl7989); 
             after(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__5__Impl"


    // $ANTLR start "rule__Selection__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3950:1: rule__Selection__Group_2__0 : rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1 ;
    public final void rule__Selection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3954:1: ( rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3955:2: rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__0__Impl_in_rule__Selection__Group_2__08032);
            rule__Selection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__1_in_rule__Selection__Group_2__08035);
            rule__Selection__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__0"


    // $ANTLR start "rule__Selection__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3962:1: rule__Selection__Group_2__0__Impl : ( 'where' ) ;
    public final void rule__Selection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3966:1: ( ( 'where' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3967:1: ( 'where' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3967:1: ( 'where' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3968:1: 'where'
            {
             before(grammarAccess.getSelectionAccess().getWhereKeyword_2_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__Selection__Group_2__0__Impl8063); 
             after(grammarAccess.getSelectionAccess().getWhereKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__0__Impl"


    // $ANTLR start "rule__Selection__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3981:1: rule__Selection__Group_2__1 : rule__Selection__Group_2__1__Impl rule__Selection__Group_2__2 ;
    public final void rule__Selection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3985:1: ( rule__Selection__Group_2__1__Impl rule__Selection__Group_2__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3986:2: rule__Selection__Group_2__1__Impl rule__Selection__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__1__Impl_in_rule__Selection__Group_2__18094);
            rule__Selection__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__2_in_rule__Selection__Group_2__18097);
            rule__Selection__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__1"


    // $ANTLR start "rule__Selection__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3993:1: rule__Selection__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Selection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3997:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3998:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3998:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3999:1: '{'
            {
             before(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Selection__Group_2__1__Impl8125); 
             after(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__1__Impl"


    // $ANTLR start "rule__Selection__Group_2__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4012:1: rule__Selection__Group_2__2 : rule__Selection__Group_2__2__Impl rule__Selection__Group_2__3 ;
    public final void rule__Selection__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4016:1: ( rule__Selection__Group_2__2__Impl rule__Selection__Group_2__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4017:2: rule__Selection__Group_2__2__Impl rule__Selection__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__2__Impl_in_rule__Selection__Group_2__28156);
            rule__Selection__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__3_in_rule__Selection__Group_2__28159);
            rule__Selection__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__2"


    // $ANTLR start "rule__Selection__Group_2__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4024:1: rule__Selection__Group_2__2__Impl : ( ( rule__Selection__WhereAssignment_2_2 ) ) ;
    public final void rule__Selection__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4028:1: ( ( ( rule__Selection__WhereAssignment_2_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4029:1: ( ( rule__Selection__WhereAssignment_2_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4029:1: ( ( rule__Selection__WhereAssignment_2_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4030:1: ( rule__Selection__WhereAssignment_2_2 )
            {
             before(grammarAccess.getSelectionAccess().getWhereAssignment_2_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4031:1: ( rule__Selection__WhereAssignment_2_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4031:2: rule__Selection__WhereAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__WhereAssignment_2_2_in_rule__Selection__Group_2__2__Impl8186);
            rule__Selection__WhereAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getWhereAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__2__Impl"


    // $ANTLR start "rule__Selection__Group_2__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4041:1: rule__Selection__Group_2__3 : rule__Selection__Group_2__3__Impl rule__Selection__Group_2__4 ;
    public final void rule__Selection__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4045:1: ( rule__Selection__Group_2__3__Impl rule__Selection__Group_2__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4046:2: rule__Selection__Group_2__3__Impl rule__Selection__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__3__Impl_in_rule__Selection__Group_2__38216);
            rule__Selection__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__4_in_rule__Selection__Group_2__38219);
            rule__Selection__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__3"


    // $ANTLR start "rule__Selection__Group_2__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4053:1: rule__Selection__Group_2__3__Impl : ( ( rule__Selection__Group_2_3__0 )* ) ;
    public final void rule__Selection__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4057:1: ( ( ( rule__Selection__Group_2_3__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4058:1: ( ( rule__Selection__Group_2_3__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4058:1: ( ( rule__Selection__Group_2_3__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4059:1: ( rule__Selection__Group_2_3__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_2_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4060:1: ( rule__Selection__Group_2_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4060:2: rule__Selection__Group_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2_3__0_in_rule__Selection__Group_2__3__Impl8246);
            	    rule__Selection__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__3__Impl"


    // $ANTLR start "rule__Selection__Group_2__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4070:1: rule__Selection__Group_2__4 : rule__Selection__Group_2__4__Impl ;
    public final void rule__Selection__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4074:1: ( rule__Selection__Group_2__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4075:2: rule__Selection__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2__4__Impl_in_rule__Selection__Group_2__48277);
            rule__Selection__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__4"


    // $ANTLR start "rule__Selection__Group_2__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4081:1: rule__Selection__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Selection__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4085:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4086:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4086:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4087:1: '}'
            {
             before(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Selection__Group_2__4__Impl8305); 
             after(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__4__Impl"


    // $ANTLR start "rule__Selection__Group_2_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4110:1: rule__Selection__Group_2_3__0 : rule__Selection__Group_2_3__0__Impl rule__Selection__Group_2_3__1 ;
    public final void rule__Selection__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4114:1: ( rule__Selection__Group_2_3__0__Impl rule__Selection__Group_2_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4115:2: rule__Selection__Group_2_3__0__Impl rule__Selection__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2_3__0__Impl_in_rule__Selection__Group_2_3__08346);
            rule__Selection__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2_3__1_in_rule__Selection__Group_2_3__08349);
            rule__Selection__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2_3__0"


    // $ANTLR start "rule__Selection__Group_2_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4122:1: rule__Selection__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4126:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4127:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4127:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4128:1: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_2_3_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Selection__Group_2_3__0__Impl8377); 
             after(grammarAccess.getSelectionAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2_3__0__Impl"


    // $ANTLR start "rule__Selection__Group_2_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4141:1: rule__Selection__Group_2_3__1 : rule__Selection__Group_2_3__1__Impl ;
    public final void rule__Selection__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4145:1: ( rule__Selection__Group_2_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4146:2: rule__Selection__Group_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_2_3__1__Impl_in_rule__Selection__Group_2_3__18408);
            rule__Selection__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2_3__1"


    // $ANTLR start "rule__Selection__Group_2_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4152:1: rule__Selection__Group_2_3__1__Impl : ( ( rule__Selection__WhereAssignment_2_3_1 ) ) ;
    public final void rule__Selection__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4156:1: ( ( ( rule__Selection__WhereAssignment_2_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4157:1: ( ( rule__Selection__WhereAssignment_2_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4157:1: ( ( rule__Selection__WhereAssignment_2_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4158:1: ( rule__Selection__WhereAssignment_2_3_1 )
            {
             before(grammarAccess.getSelectionAccess().getWhereAssignment_2_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4159:1: ( rule__Selection__WhereAssignment_2_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4159:2: rule__Selection__WhereAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__WhereAssignment_2_3_1_in_rule__Selection__Group_2_3__1__Impl8435);
            rule__Selection__WhereAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getWhereAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2_3__1__Impl"


    // $ANTLR start "rule__OnName__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4173:1: rule__OnName__Group__0 : rule__OnName__Group__0__Impl rule__OnName__Group__1 ;
    public final void rule__OnName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4177:1: ( rule__OnName__Group__0__Impl rule__OnName__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4178:2: rule__OnName__Group__0__Impl rule__OnName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__08469);
            rule__OnName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__08472);
            rule__OnName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__0"


    // $ANTLR start "rule__OnName__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4185:1: rule__OnName__Group__0__Impl : ( () ) ;
    public final void rule__OnName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4189:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4190:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4190:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4191:1: ()
            {
             before(grammarAccess.getOnNameAccess().getOnNameAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4192:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4194:1: 
            {
            }

             after(grammarAccess.getOnNameAccess().getOnNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__0__Impl"


    // $ANTLR start "rule__OnName__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4204:1: rule__OnName__Group__1 : rule__OnName__Group__1__Impl rule__OnName__Group__2 ;
    public final void rule__OnName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4208:1: ( rule__OnName__Group__1__Impl rule__OnName__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4209:2: rule__OnName__Group__1__Impl rule__OnName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__18530);
            rule__OnName__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__18533);
            rule__OnName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__1"


    // $ANTLR start "rule__OnName__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4216:1: rule__OnName__Group__1__Impl : ( 'OnName' ) ;
    public final void rule__OnName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4220:1: ( ( 'OnName' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4221:1: ( 'OnName' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4221:1: ( 'OnName' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4222:1: 'OnName'
            {
             before(grammarAccess.getOnNameAccess().getOnNameKeyword_1()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__OnName__Group__1__Impl8561); 
             after(grammarAccess.getOnNameAccess().getOnNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__1__Impl"


    // $ANTLR start "rule__OnName__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4235:1: rule__OnName__Group__2 : rule__OnName__Group__2__Impl rule__OnName__Group__3 ;
    public final void rule__OnName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4239:1: ( rule__OnName__Group__2__Impl rule__OnName__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4240:2: rule__OnName__Group__2__Impl rule__OnName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__28592);
            rule__OnName__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__28595);
            rule__OnName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__2"


    // $ANTLR start "rule__OnName__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4247:1: rule__OnName__Group__2__Impl : ( ( rule__OnName__NameAssignment_2 ) ) ;
    public final void rule__OnName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4251:1: ( ( ( rule__OnName__NameAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4252:1: ( ( rule__OnName__NameAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4252:1: ( ( rule__OnName__NameAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4253:1: ( rule__OnName__NameAssignment_2 )
            {
             before(grammarAccess.getOnNameAccess().getNameAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4254:1: ( rule__OnName__NameAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4254:2: rule__OnName__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__NameAssignment_2_in_rule__OnName__Group__2__Impl8622);
            rule__OnName__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__2__Impl"


    // $ANTLR start "rule__OnName__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4264:1: rule__OnName__Group__3 : rule__OnName__Group__3__Impl rule__OnName__Group__4 ;
    public final void rule__OnName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4268:1: ( rule__OnName__Group__3__Impl rule__OnName__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4269:2: rule__OnName__Group__3__Impl rule__OnName__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__38652);
            rule__OnName__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__4_in_rule__OnName__Group__38655);
            rule__OnName__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__3"


    // $ANTLR start "rule__OnName__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4276:1: rule__OnName__Group__3__Impl : ( '{' ) ;
    public final void rule__OnName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4280:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4281:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4281:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4282:1: '{'
            {
             before(grammarAccess.getOnNameAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnName__Group__3__Impl8683); 
             after(grammarAccess.getOnNameAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__3__Impl"


    // $ANTLR start "rule__OnName__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4295:1: rule__OnName__Group__4 : rule__OnName__Group__4__Impl rule__OnName__Group__5 ;
    public final void rule__OnName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4299:1: ( rule__OnName__Group__4__Impl rule__OnName__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4300:2: rule__OnName__Group__4__Impl rule__OnName__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__4__Impl_in_rule__OnName__Group__48714);
            rule__OnName__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__5_in_rule__OnName__Group__48717);
            rule__OnName__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__4"


    // $ANTLR start "rule__OnName__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4307:1: rule__OnName__Group__4__Impl : ( ( rule__OnName__Group_4__0 )? ) ;
    public final void rule__OnName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4311:1: ( ( ( rule__OnName__Group_4__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4312:1: ( ( rule__OnName__Group_4__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4312:1: ( ( rule__OnName__Group_4__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4313:1: ( rule__OnName__Group_4__0 )?
            {
             before(grammarAccess.getOnNameAccess().getGroup_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4314:1: ( rule__OnName__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4314:2: rule__OnName__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__0_in_rule__OnName__Group__4__Impl8744);
                    rule__OnName__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnNameAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__4__Impl"


    // $ANTLR start "rule__OnName__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4324:1: rule__OnName__Group__5 : rule__OnName__Group__5__Impl ;
    public final void rule__OnName__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4328:1: ( rule__OnName__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4329:2: rule__OnName__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__5__Impl_in_rule__OnName__Group__58775);
            rule__OnName__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__5"


    // $ANTLR start "rule__OnName__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4335:1: rule__OnName__Group__5__Impl : ( '}' ) ;
    public final void rule__OnName__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4339:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4340:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4340:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4341:1: '}'
            {
             before(grammarAccess.getOnNameAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnName__Group__5__Impl8803); 
             after(grammarAccess.getOnNameAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group__5__Impl"


    // $ANTLR start "rule__OnName__Group_4__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4366:1: rule__OnName__Group_4__0 : rule__OnName__Group_4__0__Impl rule__OnName__Group_4__1 ;
    public final void rule__OnName__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4370:1: ( rule__OnName__Group_4__0__Impl rule__OnName__Group_4__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4371:2: rule__OnName__Group_4__0__Impl rule__OnName__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__0__Impl_in_rule__OnName__Group_4__08846);
            rule__OnName__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__1_in_rule__OnName__Group_4__08849);
            rule__OnName__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group_4__0"


    // $ANTLR start "rule__OnName__Group_4__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4378:1: rule__OnName__Group_4__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__OnName__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4382:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4383:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4383:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4384:1: 'trueFalseSearch'
            {
             before(grammarAccess.getOnNameAccess().getTrueFalseSearchKeyword_4_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnName__Group_4__0__Impl8877); 
             after(grammarAccess.getOnNameAccess().getTrueFalseSearchKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group_4__0__Impl"


    // $ANTLR start "rule__OnName__Group_4__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4397:1: rule__OnName__Group_4__1 : rule__OnName__Group_4__1__Impl ;
    public final void rule__OnName__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4401:1: ( rule__OnName__Group_4__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4402:2: rule__OnName__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__1__Impl_in_rule__OnName__Group_4__18908);
            rule__OnName__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group_4__1"


    // $ANTLR start "rule__OnName__Group_4__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4408:1: rule__OnName__Group_4__1__Impl : ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) ) ;
    public final void rule__OnName__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4412:1: ( ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4413:1: ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4413:1: ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4414:1: ( rule__OnName__TrueFalseSearchAssignment_4_1 )
            {
             before(grammarAccess.getOnNameAccess().getTrueFalseSearchAssignment_4_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4415:1: ( rule__OnName__TrueFalseSearchAssignment_4_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4415:2: rule__OnName__TrueFalseSearchAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__TrueFalseSearchAssignment_4_1_in_rule__OnName__Group_4__1__Impl8935);
            rule__OnName__TrueFalseSearchAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOnNameAccess().getTrueFalseSearchAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__Group_4__1__Impl"


    // $ANTLR start "rule__OnExtension__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4429:1: rule__OnExtension__Group__0 : rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 ;
    public final void rule__OnExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4433:1: ( rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4434:2: rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__08969);
            rule__OnExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__08972);
            rule__OnExtension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__0"


    // $ANTLR start "rule__OnExtension__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4441:1: rule__OnExtension__Group__0__Impl : ( () ) ;
    public final void rule__OnExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4445:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4446:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4446:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4447:1: ()
            {
             before(grammarAccess.getOnExtensionAccess().getOnExtensionAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4448:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4450:1: 
            {
            }

             after(grammarAccess.getOnExtensionAccess().getOnExtensionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__0__Impl"


    // $ANTLR start "rule__OnExtension__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4460:1: rule__OnExtension__Group__1 : rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 ;
    public final void rule__OnExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4464:1: ( rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4465:2: rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__19030);
            rule__OnExtension__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__19033);
            rule__OnExtension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__1"


    // $ANTLR start "rule__OnExtension__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4472:1: rule__OnExtension__Group__1__Impl : ( 'OnExtension' ) ;
    public final void rule__OnExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4476:1: ( ( 'OnExtension' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4477:1: ( 'OnExtension' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4477:1: ( 'OnExtension' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4478:1: 'OnExtension'
            {
             before(grammarAccess.getOnExtensionAccess().getOnExtensionKeyword_1()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__OnExtension__Group__1__Impl9061); 
             after(grammarAccess.getOnExtensionAccess().getOnExtensionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__1__Impl"


    // $ANTLR start "rule__OnExtension__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4491:1: rule__OnExtension__Group__2 : rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 ;
    public final void rule__OnExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4495:1: ( rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4496:2: rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__29092);
            rule__OnExtension__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__29095);
            rule__OnExtension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__2"


    // $ANTLR start "rule__OnExtension__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4503:1: rule__OnExtension__Group__2__Impl : ( '{' ) ;
    public final void rule__OnExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4507:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4508:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4508:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4509:1: '{'
            {
             before(grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnExtension__Group__2__Impl9123); 
             after(grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__2__Impl"


    // $ANTLR start "rule__OnExtension__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4522:1: rule__OnExtension__Group__3 : rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 ;
    public final void rule__OnExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4526:1: ( rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4527:2: rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__39154);
            rule__OnExtension__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__39157);
            rule__OnExtension__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__3"


    // $ANTLR start "rule__OnExtension__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4534:1: rule__OnExtension__Group__3__Impl : ( ( rule__OnExtension__Group_3__0 )? ) ;
    public final void rule__OnExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4538:1: ( ( ( rule__OnExtension__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4539:1: ( ( rule__OnExtension__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4539:1: ( ( rule__OnExtension__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4540:1: ( rule__OnExtension__Group_3__0 )?
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4541:1: ( rule__OnExtension__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4541:2: rule__OnExtension__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__0_in_rule__OnExtension__Group__3__Impl9184);
                    rule__OnExtension__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnExtensionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__3__Impl"


    // $ANTLR start "rule__OnExtension__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4551:1: rule__OnExtension__Group__4 : rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 ;
    public final void rule__OnExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4555:1: ( rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4556:2: rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__49215);
            rule__OnExtension__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__49218);
            rule__OnExtension__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__4"


    // $ANTLR start "rule__OnExtension__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4563:1: rule__OnExtension__Group__4__Impl : ( ( rule__OnExtension__Group_4__0 )? ) ;
    public final void rule__OnExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4567:1: ( ( ( rule__OnExtension__Group_4__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4568:1: ( ( rule__OnExtension__Group_4__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4568:1: ( ( rule__OnExtension__Group_4__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4569:1: ( rule__OnExtension__Group_4__0 )?
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4570:1: ( rule__OnExtension__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==64) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4570:2: rule__OnExtension__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__0_in_rule__OnExtension__Group__4__Impl9245);
                    rule__OnExtension__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnExtensionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__4__Impl"


    // $ANTLR start "rule__OnExtension__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4580:1: rule__OnExtension__Group__5 : rule__OnExtension__Group__5__Impl ;
    public final void rule__OnExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4584:1: ( rule__OnExtension__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4585:2: rule__OnExtension__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__59276);
            rule__OnExtension__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__5"


    // $ANTLR start "rule__OnExtension__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4591:1: rule__OnExtension__Group__5__Impl : ( '}' ) ;
    public final void rule__OnExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4595:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4596:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4596:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4597:1: '}'
            {
             before(grammarAccess.getOnExtensionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnExtension__Group__5__Impl9304); 
             after(grammarAccess.getOnExtensionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group__5__Impl"


    // $ANTLR start "rule__OnExtension__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4622:1: rule__OnExtension__Group_3__0 : rule__OnExtension__Group_3__0__Impl rule__OnExtension__Group_3__1 ;
    public final void rule__OnExtension__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4626:1: ( rule__OnExtension__Group_3__0__Impl rule__OnExtension__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4627:2: rule__OnExtension__Group_3__0__Impl rule__OnExtension__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__0__Impl_in_rule__OnExtension__Group_3__09347);
            rule__OnExtension__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__1_in_rule__OnExtension__Group_3__09350);
            rule__OnExtension__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_3__0"


    // $ANTLR start "rule__OnExtension__Group_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4634:1: rule__OnExtension__Group_3__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__OnExtension__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4638:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4639:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4639:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4640:1: 'trueFalseSearch'
            {
             before(grammarAccess.getOnExtensionAccess().getTrueFalseSearchKeyword_3_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnExtension__Group_3__0__Impl9378); 
             after(grammarAccess.getOnExtensionAccess().getTrueFalseSearchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_3__0__Impl"


    // $ANTLR start "rule__OnExtension__Group_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4653:1: rule__OnExtension__Group_3__1 : rule__OnExtension__Group_3__1__Impl ;
    public final void rule__OnExtension__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4657:1: ( rule__OnExtension__Group_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4658:2: rule__OnExtension__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__1__Impl_in_rule__OnExtension__Group_3__19409);
            rule__OnExtension__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_3__1"


    // $ANTLR start "rule__OnExtension__Group_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4664:1: rule__OnExtension__Group_3__1__Impl : ( ( rule__OnExtension__TrueFalseSearchAssignment_3_1 ) ) ;
    public final void rule__OnExtension__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4668:1: ( ( ( rule__OnExtension__TrueFalseSearchAssignment_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4669:1: ( ( rule__OnExtension__TrueFalseSearchAssignment_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4669:1: ( ( rule__OnExtension__TrueFalseSearchAssignment_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4670:1: ( rule__OnExtension__TrueFalseSearchAssignment_3_1 )
            {
             before(grammarAccess.getOnExtensionAccess().getTrueFalseSearchAssignment_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4671:1: ( rule__OnExtension__TrueFalseSearchAssignment_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4671:2: rule__OnExtension__TrueFalseSearchAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__TrueFalseSearchAssignment_3_1_in_rule__OnExtension__Group_3__1__Impl9436);
            rule__OnExtension__TrueFalseSearchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getTrueFalseSearchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_3__1__Impl"


    // $ANTLR start "rule__OnExtension__Group_4__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4685:1: rule__OnExtension__Group_4__0 : rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1 ;
    public final void rule__OnExtension__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4689:1: ( rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4690:2: rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__0__Impl_in_rule__OnExtension__Group_4__09470);
            rule__OnExtension__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__1_in_rule__OnExtension__Group_4__09473);
            rule__OnExtension__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__0"


    // $ANTLR start "rule__OnExtension__Group_4__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4697:1: rule__OnExtension__Group_4__0__Impl : ( 'extensions' ) ;
    public final void rule__OnExtension__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4701:1: ( ( 'extensions' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4702:1: ( 'extensions' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4702:1: ( 'extensions' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4703:1: 'extensions'
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsKeyword_4_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__OnExtension__Group_4__0__Impl9501); 
             after(grammarAccess.getOnExtensionAccess().getExtensionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__0__Impl"


    // $ANTLR start "rule__OnExtension__Group_4__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4716:1: rule__OnExtension__Group_4__1 : rule__OnExtension__Group_4__1__Impl rule__OnExtension__Group_4__2 ;
    public final void rule__OnExtension__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4720:1: ( rule__OnExtension__Group_4__1__Impl rule__OnExtension__Group_4__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4721:2: rule__OnExtension__Group_4__1__Impl rule__OnExtension__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__1__Impl_in_rule__OnExtension__Group_4__19532);
            rule__OnExtension__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__2_in_rule__OnExtension__Group_4__19535);
            rule__OnExtension__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__1"


    // $ANTLR start "rule__OnExtension__Group_4__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4728:1: rule__OnExtension__Group_4__1__Impl : ( '{' ) ;
    public final void rule__OnExtension__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4732:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4733:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4733:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4734:1: '{'
            {
             before(grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnExtension__Group_4__1__Impl9563); 
             after(grammarAccess.getOnExtensionAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__1__Impl"


    // $ANTLR start "rule__OnExtension__Group_4__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4747:1: rule__OnExtension__Group_4__2 : rule__OnExtension__Group_4__2__Impl rule__OnExtension__Group_4__3 ;
    public final void rule__OnExtension__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4751:1: ( rule__OnExtension__Group_4__2__Impl rule__OnExtension__Group_4__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4752:2: rule__OnExtension__Group_4__2__Impl rule__OnExtension__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__2__Impl_in_rule__OnExtension__Group_4__29594);
            rule__OnExtension__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__3_in_rule__OnExtension__Group_4__29597);
            rule__OnExtension__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__2"


    // $ANTLR start "rule__OnExtension__Group_4__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4759:1: rule__OnExtension__Group_4__2__Impl : ( ( rule__OnExtension__ExtensionsAssignment_4_2 ) ) ;
    public final void rule__OnExtension__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4763:1: ( ( ( rule__OnExtension__ExtensionsAssignment_4_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4764:1: ( ( rule__OnExtension__ExtensionsAssignment_4_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4764:1: ( ( rule__OnExtension__ExtensionsAssignment_4_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4765:1: ( rule__OnExtension__ExtensionsAssignment_4_2 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4766:1: ( rule__OnExtension__ExtensionsAssignment_4_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4766:2: rule__OnExtension__ExtensionsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_4_2_in_rule__OnExtension__Group_4__2__Impl9624);
            rule__OnExtension__ExtensionsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__2__Impl"


    // $ANTLR start "rule__OnExtension__Group_4__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4776:1: rule__OnExtension__Group_4__3 : rule__OnExtension__Group_4__3__Impl rule__OnExtension__Group_4__4 ;
    public final void rule__OnExtension__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4780:1: ( rule__OnExtension__Group_4__3__Impl rule__OnExtension__Group_4__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4781:2: rule__OnExtension__Group_4__3__Impl rule__OnExtension__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__3__Impl_in_rule__OnExtension__Group_4__39654);
            rule__OnExtension__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__4_in_rule__OnExtension__Group_4__39657);
            rule__OnExtension__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__3"


    // $ANTLR start "rule__OnExtension__Group_4__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4788:1: rule__OnExtension__Group_4__3__Impl : ( ( rule__OnExtension__Group_4_3__0 )* ) ;
    public final void rule__OnExtension__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4792:1: ( ( ( rule__OnExtension__Group_4_3__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4793:1: ( ( rule__OnExtension__Group_4_3__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4793:1: ( ( rule__OnExtension__Group_4_3__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4794:1: ( rule__OnExtension__Group_4_3__0 )*
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_4_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4795:1: ( rule__OnExtension__Group_4_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4795:2: rule__OnExtension__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_3__0_in_rule__OnExtension__Group_4__3__Impl9684);
            	    rule__OnExtension__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getOnExtensionAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__3__Impl"


    // $ANTLR start "rule__OnExtension__Group_4__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4805:1: rule__OnExtension__Group_4__4 : rule__OnExtension__Group_4__4__Impl ;
    public final void rule__OnExtension__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4809:1: ( rule__OnExtension__Group_4__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4810:2: rule__OnExtension__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__4__Impl_in_rule__OnExtension__Group_4__49715);
            rule__OnExtension__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__4"


    // $ANTLR start "rule__OnExtension__Group_4__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4816:1: rule__OnExtension__Group_4__4__Impl : ( '}' ) ;
    public final void rule__OnExtension__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4820:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4821:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4821:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4822:1: '}'
            {
             before(grammarAccess.getOnExtensionAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnExtension__Group_4__4__Impl9743); 
             after(grammarAccess.getOnExtensionAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4__4__Impl"


    // $ANTLR start "rule__OnExtension__Group_4_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4845:1: rule__OnExtension__Group_4_3__0 : rule__OnExtension__Group_4_3__0__Impl rule__OnExtension__Group_4_3__1 ;
    public final void rule__OnExtension__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4849:1: ( rule__OnExtension__Group_4_3__0__Impl rule__OnExtension__Group_4_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4850:2: rule__OnExtension__Group_4_3__0__Impl rule__OnExtension__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_3__0__Impl_in_rule__OnExtension__Group_4_3__09784);
            rule__OnExtension__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_3__1_in_rule__OnExtension__Group_4_3__09787);
            rule__OnExtension__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_3__0"


    // $ANTLR start "rule__OnExtension__Group_4_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4857:1: rule__OnExtension__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__OnExtension__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4861:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4862:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4862:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4863:1: ','
            {
             before(grammarAccess.getOnExtensionAccess().getCommaKeyword_4_3_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__OnExtension__Group_4_3__0__Impl9815); 
             after(grammarAccess.getOnExtensionAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_3__0__Impl"


    // $ANTLR start "rule__OnExtension__Group_4_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4876:1: rule__OnExtension__Group_4_3__1 : rule__OnExtension__Group_4_3__1__Impl ;
    public final void rule__OnExtension__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4880:1: ( rule__OnExtension__Group_4_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4881:2: rule__OnExtension__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_3__1__Impl_in_rule__OnExtension__Group_4_3__19846);
            rule__OnExtension__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_3__1"


    // $ANTLR start "rule__OnExtension__Group_4_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4887:1: rule__OnExtension__Group_4_3__1__Impl : ( ( rule__OnExtension__ExtensionsAssignment_4_3_1 ) ) ;
    public final void rule__OnExtension__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4891:1: ( ( ( rule__OnExtension__ExtensionsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4892:1: ( ( rule__OnExtension__ExtensionsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4892:1: ( ( rule__OnExtension__ExtensionsAssignment_4_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4893:1: ( rule__OnExtension__ExtensionsAssignment_4_3_1 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4894:1: ( rule__OnExtension__ExtensionsAssignment_4_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4894:2: rule__OnExtension__ExtensionsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_4_3_1_in_rule__OnExtension__Group_4_3__1__Impl9873);
            rule__OnExtension__ExtensionsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_3__1__Impl"


    // $ANTLR start "rule__OnTime__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4908:1: rule__OnTime__Group__0 : rule__OnTime__Group__0__Impl rule__OnTime__Group__1 ;
    public final void rule__OnTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4912:1: ( rule__OnTime__Group__0__Impl rule__OnTime__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4913:2: rule__OnTime__Group__0__Impl rule__OnTime__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__09907);
            rule__OnTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__09910);
            rule__OnTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__0"


    // $ANTLR start "rule__OnTime__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4920:1: rule__OnTime__Group__0__Impl : ( 'OnTime' ) ;
    public final void rule__OnTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4924:1: ( ( 'OnTime' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4925:1: ( 'OnTime' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4925:1: ( 'OnTime' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4926:1: 'OnTime'
            {
             before(grammarAccess.getOnTimeAccess().getOnTimeKeyword_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__OnTime__Group__0__Impl9938); 
             after(grammarAccess.getOnTimeAccess().getOnTimeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__0__Impl"


    // $ANTLR start "rule__OnTime__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4939:1: rule__OnTime__Group__1 : rule__OnTime__Group__1__Impl rule__OnTime__Group__2 ;
    public final void rule__OnTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4943:1: ( rule__OnTime__Group__1__Impl rule__OnTime__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4944:2: rule__OnTime__Group__1__Impl rule__OnTime__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__19969);
            rule__OnTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__19972);
            rule__OnTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__1"


    // $ANTLR start "rule__OnTime__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4951:1: rule__OnTime__Group__1__Impl : ( '{' ) ;
    public final void rule__OnTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4955:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4956:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4956:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4957:1: '{'
            {
             before(grammarAccess.getOnTimeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnTime__Group__1__Impl10000); 
             after(grammarAccess.getOnTimeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__1__Impl"


    // $ANTLR start "rule__OnTime__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4970:1: rule__OnTime__Group__2 : rule__OnTime__Group__2__Impl rule__OnTime__Group__3 ;
    public final void rule__OnTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4974:1: ( rule__OnTime__Group__2__Impl rule__OnTime__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4975:2: rule__OnTime__Group__2__Impl rule__OnTime__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__210031);
            rule__OnTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__210034);
            rule__OnTime__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__2"


    // $ANTLR start "rule__OnTime__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4982:1: rule__OnTime__Group__2__Impl : ( ( rule__OnTime__Group_2__0 )? ) ;
    public final void rule__OnTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4986:1: ( ( ( rule__OnTime__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4987:1: ( ( rule__OnTime__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4987:1: ( ( rule__OnTime__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4988:1: ( rule__OnTime__Group_2__0 )?
            {
             before(grammarAccess.getOnTimeAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4989:1: ( rule__OnTime__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4989:2: rule__OnTime__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_2__0_in_rule__OnTime__Group__2__Impl10061);
                    rule__OnTime__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTimeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__2__Impl"


    // $ANTLR start "rule__OnTime__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4999:1: rule__OnTime__Group__3 : rule__OnTime__Group__3__Impl rule__OnTime__Group__4 ;
    public final void rule__OnTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5003:1: ( rule__OnTime__Group__3__Impl rule__OnTime__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5004:2: rule__OnTime__Group__3__Impl rule__OnTime__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__310092);
            rule__OnTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__310095);
            rule__OnTime__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__3"


    // $ANTLR start "rule__OnTime__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5011:1: rule__OnTime__Group__3__Impl : ( 'operator' ) ;
    public final void rule__OnTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5015:1: ( ( 'operator' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5016:1: ( 'operator' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5016:1: ( 'operator' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5017:1: 'operator'
            {
             before(grammarAccess.getOnTimeAccess().getOperatorKeyword_3()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__OnTime__Group__3__Impl10123); 
             after(grammarAccess.getOnTimeAccess().getOperatorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__3__Impl"


    // $ANTLR start "rule__OnTime__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5030:1: rule__OnTime__Group__4 : rule__OnTime__Group__4__Impl rule__OnTime__Group__5 ;
    public final void rule__OnTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5034:1: ( rule__OnTime__Group__4__Impl rule__OnTime__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5035:2: rule__OnTime__Group__4__Impl rule__OnTime__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__410154);
            rule__OnTime__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__5_in_rule__OnTime__Group__410157);
            rule__OnTime__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__4"


    // $ANTLR start "rule__OnTime__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5042:1: rule__OnTime__Group__4__Impl : ( ( rule__OnTime__OperatorAssignment_4 ) ) ;
    public final void rule__OnTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5046:1: ( ( ( rule__OnTime__OperatorAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5047:1: ( ( rule__OnTime__OperatorAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5047:1: ( ( rule__OnTime__OperatorAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5048:1: ( rule__OnTime__OperatorAssignment_4 )
            {
             before(grammarAccess.getOnTimeAccess().getOperatorAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5049:1: ( rule__OnTime__OperatorAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5049:2: rule__OnTime__OperatorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__OperatorAssignment_4_in_rule__OnTime__Group__4__Impl10184);
            rule__OnTime__OperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getOperatorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__4__Impl"


    // $ANTLR start "rule__OnTime__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5059:1: rule__OnTime__Group__5 : rule__OnTime__Group__5__Impl rule__OnTime__Group__6 ;
    public final void rule__OnTime__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5063:1: ( rule__OnTime__Group__5__Impl rule__OnTime__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5064:2: rule__OnTime__Group__5__Impl rule__OnTime__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__5__Impl_in_rule__OnTime__Group__510214);
            rule__OnTime__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__6_in_rule__OnTime__Group__510217);
            rule__OnTime__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__5"


    // $ANTLR start "rule__OnTime__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5071:1: rule__OnTime__Group__5__Impl : ( 'treshold' ) ;
    public final void rule__OnTime__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5075:1: ( ( 'treshold' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5076:1: ( 'treshold' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5076:1: ( 'treshold' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5077:1: 'treshold'
            {
             before(grammarAccess.getOnTimeAccess().getTresholdKeyword_5()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__OnTime__Group__5__Impl10245); 
             after(grammarAccess.getOnTimeAccess().getTresholdKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__5__Impl"


    // $ANTLR start "rule__OnTime__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5090:1: rule__OnTime__Group__6 : rule__OnTime__Group__6__Impl rule__OnTime__Group__7 ;
    public final void rule__OnTime__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5094:1: ( rule__OnTime__Group__6__Impl rule__OnTime__Group__7 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5095:2: rule__OnTime__Group__6__Impl rule__OnTime__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__6__Impl_in_rule__OnTime__Group__610276);
            rule__OnTime__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__7_in_rule__OnTime__Group__610279);
            rule__OnTime__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__6"


    // $ANTLR start "rule__OnTime__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5102:1: rule__OnTime__Group__6__Impl : ( ( rule__OnTime__TresholdAssignment_6 ) ) ;
    public final void rule__OnTime__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5106:1: ( ( ( rule__OnTime__TresholdAssignment_6 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5107:1: ( ( rule__OnTime__TresholdAssignment_6 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5107:1: ( ( rule__OnTime__TresholdAssignment_6 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5108:1: ( rule__OnTime__TresholdAssignment_6 )
            {
             before(grammarAccess.getOnTimeAccess().getTresholdAssignment_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5109:1: ( rule__OnTime__TresholdAssignment_6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5109:2: rule__OnTime__TresholdAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TresholdAssignment_6_in_rule__OnTime__Group__6__Impl10306);
            rule__OnTime__TresholdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTresholdAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__6__Impl"


    // $ANTLR start "rule__OnTime__Group__7"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5119:1: rule__OnTime__Group__7 : rule__OnTime__Group__7__Impl rule__OnTime__Group__8 ;
    public final void rule__OnTime__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5123:1: ( rule__OnTime__Group__7__Impl rule__OnTime__Group__8 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5124:2: rule__OnTime__Group__7__Impl rule__OnTime__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__7__Impl_in_rule__OnTime__Group__710336);
            rule__OnTime__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__8_in_rule__OnTime__Group__710339);
            rule__OnTime__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__7"


    // $ANTLR start "rule__OnTime__Group__7__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5131:1: rule__OnTime__Group__7__Impl : ( 'unit' ) ;
    public final void rule__OnTime__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5135:1: ( ( 'unit' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5136:1: ( 'unit' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5136:1: ( 'unit' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5137:1: 'unit'
            {
             before(grammarAccess.getOnTimeAccess().getUnitKeyword_7()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__OnTime__Group__7__Impl10367); 
             after(grammarAccess.getOnTimeAccess().getUnitKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__7__Impl"


    // $ANTLR start "rule__OnTime__Group__8"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5150:1: rule__OnTime__Group__8 : rule__OnTime__Group__8__Impl rule__OnTime__Group__9 ;
    public final void rule__OnTime__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5154:1: ( rule__OnTime__Group__8__Impl rule__OnTime__Group__9 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5155:2: rule__OnTime__Group__8__Impl rule__OnTime__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__8__Impl_in_rule__OnTime__Group__810398);
            rule__OnTime__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__9_in_rule__OnTime__Group__810401);
            rule__OnTime__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__8"


    // $ANTLR start "rule__OnTime__Group__8__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5162:1: rule__OnTime__Group__8__Impl : ( ( rule__OnTime__UnitAssignment_8 ) ) ;
    public final void rule__OnTime__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5166:1: ( ( ( rule__OnTime__UnitAssignment_8 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5167:1: ( ( rule__OnTime__UnitAssignment_8 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5167:1: ( ( rule__OnTime__UnitAssignment_8 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5168:1: ( rule__OnTime__UnitAssignment_8 )
            {
             before(grammarAccess.getOnTimeAccess().getUnitAssignment_8()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5169:1: ( rule__OnTime__UnitAssignment_8 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5169:2: rule__OnTime__UnitAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__UnitAssignment_8_in_rule__OnTime__Group__8__Impl10428);
            rule__OnTime__UnitAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getUnitAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__8__Impl"


    // $ANTLR start "rule__OnTime__Group__9"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5179:1: rule__OnTime__Group__9 : rule__OnTime__Group__9__Impl rule__OnTime__Group__10 ;
    public final void rule__OnTime__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5183:1: ( rule__OnTime__Group__9__Impl rule__OnTime__Group__10 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5184:2: rule__OnTime__Group__9__Impl rule__OnTime__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__9__Impl_in_rule__OnTime__Group__910458);
            rule__OnTime__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__10_in_rule__OnTime__Group__910461);
            rule__OnTime__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__9"


    // $ANTLR start "rule__OnTime__Group__9__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5191:1: rule__OnTime__Group__9__Impl : ( 'timeOf' ) ;
    public final void rule__OnTime__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5195:1: ( ( 'timeOf' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5196:1: ( 'timeOf' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5196:1: ( 'timeOf' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5197:1: 'timeOf'
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfKeyword_9()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnTime__Group__9__Impl10489); 
             after(grammarAccess.getOnTimeAccess().getTimeOfKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__9__Impl"


    // $ANTLR start "rule__OnTime__Group__10"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5210:1: rule__OnTime__Group__10 : rule__OnTime__Group__10__Impl rule__OnTime__Group__11 ;
    public final void rule__OnTime__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5214:1: ( rule__OnTime__Group__10__Impl rule__OnTime__Group__11 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5215:2: rule__OnTime__Group__10__Impl rule__OnTime__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__10__Impl_in_rule__OnTime__Group__1010520);
            rule__OnTime__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__11_in_rule__OnTime__Group__1010523);
            rule__OnTime__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__10"


    // $ANTLR start "rule__OnTime__Group__10__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5222:1: rule__OnTime__Group__10__Impl : ( ( rule__OnTime__TimeOfAssignment_10 ) ) ;
    public final void rule__OnTime__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5226:1: ( ( ( rule__OnTime__TimeOfAssignment_10 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5227:1: ( ( rule__OnTime__TimeOfAssignment_10 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5227:1: ( ( rule__OnTime__TimeOfAssignment_10 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5228:1: ( rule__OnTime__TimeOfAssignment_10 )
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfAssignment_10()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5229:1: ( rule__OnTime__TimeOfAssignment_10 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5229:2: rule__OnTime__TimeOfAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TimeOfAssignment_10_in_rule__OnTime__Group__10__Impl10550);
            rule__OnTime__TimeOfAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTimeOfAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__10__Impl"


    // $ANTLR start "rule__OnTime__Group__11"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5239:1: rule__OnTime__Group__11 : rule__OnTime__Group__11__Impl ;
    public final void rule__OnTime__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5243:1: ( rule__OnTime__Group__11__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5244:2: rule__OnTime__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__11__Impl_in_rule__OnTime__Group__1110580);
            rule__OnTime__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__11"


    // $ANTLR start "rule__OnTime__Group__11__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5250:1: rule__OnTime__Group__11__Impl : ( '}' ) ;
    public final void rule__OnTime__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5254:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5255:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5255:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5256:1: '}'
            {
             before(grammarAccess.getOnTimeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnTime__Group__11__Impl10608); 
             after(grammarAccess.getOnTimeAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group__11__Impl"


    // $ANTLR start "rule__OnTime__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5293:1: rule__OnTime__Group_2__0 : rule__OnTime__Group_2__0__Impl rule__OnTime__Group_2__1 ;
    public final void rule__OnTime__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5297:1: ( rule__OnTime__Group_2__0__Impl rule__OnTime__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5298:2: rule__OnTime__Group_2__0__Impl rule__OnTime__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_2__0__Impl_in_rule__OnTime__Group_2__010663);
            rule__OnTime__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_2__1_in_rule__OnTime__Group_2__010666);
            rule__OnTime__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group_2__0"


    // $ANTLR start "rule__OnTime__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5305:1: rule__OnTime__Group_2__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__OnTime__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5309:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5310:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5310:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5311:1: 'trueFalseSearch'
            {
             before(grammarAccess.getOnTimeAccess().getTrueFalseSearchKeyword_2_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnTime__Group_2__0__Impl10694); 
             after(grammarAccess.getOnTimeAccess().getTrueFalseSearchKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group_2__0__Impl"


    // $ANTLR start "rule__OnTime__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5324:1: rule__OnTime__Group_2__1 : rule__OnTime__Group_2__1__Impl ;
    public final void rule__OnTime__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5328:1: ( rule__OnTime__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5329:2: rule__OnTime__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_2__1__Impl_in_rule__OnTime__Group_2__110725);
            rule__OnTime__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group_2__1"


    // $ANTLR start "rule__OnTime__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5335:1: rule__OnTime__Group_2__1__Impl : ( ( rule__OnTime__TrueFalseSearchAssignment_2_1 ) ) ;
    public final void rule__OnTime__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5339:1: ( ( ( rule__OnTime__TrueFalseSearchAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5340:1: ( ( rule__OnTime__TrueFalseSearchAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5340:1: ( ( rule__OnTime__TrueFalseSearchAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5341:1: ( rule__OnTime__TrueFalseSearchAssignment_2_1 )
            {
             before(grammarAccess.getOnTimeAccess().getTrueFalseSearchAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5342:1: ( rule__OnTime__TrueFalseSearchAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5342:2: rule__OnTime__TrueFalseSearchAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TrueFalseSearchAssignment_2_1_in_rule__OnTime__Group_2__1__Impl10752);
            rule__OnTime__TrueFalseSearchAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTrueFalseSearchAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group_2__1__Impl"


    // $ANTLR start "rule__OnAttributes__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5356:1: rule__OnAttributes__Group__0 : rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 ;
    public final void rule__OnAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5360:1: ( rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5361:2: rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__010786);
            rule__OnAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__010789);
            rule__OnAttributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__0"


    // $ANTLR start "rule__OnAttributes__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5368:1: rule__OnAttributes__Group__0__Impl : ( 'OnAttributes' ) ;
    public final void rule__OnAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5372:1: ( ( 'OnAttributes' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5373:1: ( 'OnAttributes' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5373:1: ( 'OnAttributes' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5374:1: 'OnAttributes'
            {
             before(grammarAccess.getOnAttributesAccess().getOnAttributesKeyword_0()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__OnAttributes__Group__0__Impl10817); 
             after(grammarAccess.getOnAttributesAccess().getOnAttributesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__0__Impl"


    // $ANTLR start "rule__OnAttributes__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5387:1: rule__OnAttributes__Group__1 : rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 ;
    public final void rule__OnAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5391:1: ( rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5392:2: rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__110848);
            rule__OnAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__110851);
            rule__OnAttributes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__1"


    // $ANTLR start "rule__OnAttributes__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5399:1: rule__OnAttributes__Group__1__Impl : ( ( rule__OnAttributes__NameAssignment_1 ) ) ;
    public final void rule__OnAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5403:1: ( ( ( rule__OnAttributes__NameAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5404:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5404:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5405:1: ( rule__OnAttributes__NameAssignment_1 )
            {
             before(grammarAccess.getOnAttributesAccess().getNameAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5406:1: ( rule__OnAttributes__NameAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5406:2: rule__OnAttributes__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl10878);
            rule__OnAttributes__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnAttributesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__1__Impl"


    // $ANTLR start "rule__OnAttributes__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5416:1: rule__OnAttributes__Group__2 : rule__OnAttributes__Group__2__Impl rule__OnAttributes__Group__3 ;
    public final void rule__OnAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5420:1: ( rule__OnAttributes__Group__2__Impl rule__OnAttributes__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5421:2: rule__OnAttributes__Group__2__Impl rule__OnAttributes__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__210908);
            rule__OnAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__3_in_rule__OnAttributes__Group__210911);
            rule__OnAttributes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__2"


    // $ANTLR start "rule__OnAttributes__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5428:1: rule__OnAttributes__Group__2__Impl : ( '{' ) ;
    public final void rule__OnAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5432:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5433:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5433:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5434:1: '{'
            {
             before(grammarAccess.getOnAttributesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnAttributes__Group__2__Impl10939); 
             after(grammarAccess.getOnAttributesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__2__Impl"


    // $ANTLR start "rule__OnAttributes__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5447:1: rule__OnAttributes__Group__3 : rule__OnAttributes__Group__3__Impl rule__OnAttributes__Group__4 ;
    public final void rule__OnAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5451:1: ( rule__OnAttributes__Group__3__Impl rule__OnAttributes__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5452:2: rule__OnAttributes__Group__3__Impl rule__OnAttributes__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__3__Impl_in_rule__OnAttributes__Group__310970);
            rule__OnAttributes__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__4_in_rule__OnAttributes__Group__310973);
            rule__OnAttributes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__3"


    // $ANTLR start "rule__OnAttributes__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5459:1: rule__OnAttributes__Group__3__Impl : ( ( rule__OnAttributes__Group_3__0 )? ) ;
    public final void rule__OnAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5463:1: ( ( ( rule__OnAttributes__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5464:1: ( ( rule__OnAttributes__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5464:1: ( ( rule__OnAttributes__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5465:1: ( rule__OnAttributes__Group_3__0 )?
            {
             before(grammarAccess.getOnAttributesAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5466:1: ( rule__OnAttributes__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==62) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5466:2: rule__OnAttributes__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__0_in_rule__OnAttributes__Group__3__Impl11000);
                    rule__OnAttributes__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnAttributesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__3__Impl"


    // $ANTLR start "rule__OnAttributes__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5476:1: rule__OnAttributes__Group__4 : rule__OnAttributes__Group__4__Impl rule__OnAttributes__Group__5 ;
    public final void rule__OnAttributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5480:1: ( rule__OnAttributes__Group__4__Impl rule__OnAttributes__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5481:2: rule__OnAttributes__Group__4__Impl rule__OnAttributes__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__4__Impl_in_rule__OnAttributes__Group__411031);
            rule__OnAttributes__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__5_in_rule__OnAttributes__Group__411034);
            rule__OnAttributes__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__4"


    // $ANTLR start "rule__OnAttributes__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5488:1: rule__OnAttributes__Group__4__Impl : ( 'value' ) ;
    public final void rule__OnAttributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5492:1: ( ( 'value' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5493:1: ( 'value' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5493:1: ( 'value' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5494:1: 'value'
            {
             before(grammarAccess.getOnAttributesAccess().getValueKeyword_4()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__OnAttributes__Group__4__Impl11062); 
             after(grammarAccess.getOnAttributesAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__4__Impl"


    // $ANTLR start "rule__OnAttributes__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5507:1: rule__OnAttributes__Group__5 : rule__OnAttributes__Group__5__Impl rule__OnAttributes__Group__6 ;
    public final void rule__OnAttributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5511:1: ( rule__OnAttributes__Group__5__Impl rule__OnAttributes__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5512:2: rule__OnAttributes__Group__5__Impl rule__OnAttributes__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__5__Impl_in_rule__OnAttributes__Group__511093);
            rule__OnAttributes__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__6_in_rule__OnAttributes__Group__511096);
            rule__OnAttributes__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__5"


    // $ANTLR start "rule__OnAttributes__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5519:1: rule__OnAttributes__Group__5__Impl : ( ( rule__OnAttributes__ValueAssignment_5 ) ) ;
    public final void rule__OnAttributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5523:1: ( ( ( rule__OnAttributes__ValueAssignment_5 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5524:1: ( ( rule__OnAttributes__ValueAssignment_5 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5524:1: ( ( rule__OnAttributes__ValueAssignment_5 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5525:1: ( rule__OnAttributes__ValueAssignment_5 )
            {
             before(grammarAccess.getOnAttributesAccess().getValueAssignment_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5526:1: ( rule__OnAttributes__ValueAssignment_5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5526:2: rule__OnAttributes__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__ValueAssignment_5_in_rule__OnAttributes__Group__5__Impl11123);
            rule__OnAttributes__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnAttributesAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__5__Impl"


    // $ANTLR start "rule__OnAttributes__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5536:1: rule__OnAttributes__Group__6 : rule__OnAttributes__Group__6__Impl ;
    public final void rule__OnAttributes__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5540:1: ( rule__OnAttributes__Group__6__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5541:2: rule__OnAttributes__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__6__Impl_in_rule__OnAttributes__Group__611153);
            rule__OnAttributes__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__6"


    // $ANTLR start "rule__OnAttributes__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5547:1: rule__OnAttributes__Group__6__Impl : ( '}' ) ;
    public final void rule__OnAttributes__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5551:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5552:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5552:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5553:1: '}'
            {
             before(grammarAccess.getOnAttributesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnAttributes__Group__6__Impl11181); 
             after(grammarAccess.getOnAttributesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group__6__Impl"


    // $ANTLR start "rule__OnAttributes__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5580:1: rule__OnAttributes__Group_3__0 : rule__OnAttributes__Group_3__0__Impl rule__OnAttributes__Group_3__1 ;
    public final void rule__OnAttributes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5584:1: ( rule__OnAttributes__Group_3__0__Impl rule__OnAttributes__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5585:2: rule__OnAttributes__Group_3__0__Impl rule__OnAttributes__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__0__Impl_in_rule__OnAttributes__Group_3__011226);
            rule__OnAttributes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__1_in_rule__OnAttributes__Group_3__011229);
            rule__OnAttributes__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_3__0"


    // $ANTLR start "rule__OnAttributes__Group_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5592:1: rule__OnAttributes__Group_3__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__OnAttributes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5596:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5597:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5597:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5598:1: 'trueFalseSearch'
            {
             before(grammarAccess.getOnAttributesAccess().getTrueFalseSearchKeyword_3_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnAttributes__Group_3__0__Impl11257); 
             after(grammarAccess.getOnAttributesAccess().getTrueFalseSearchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_3__0__Impl"


    // $ANTLR start "rule__OnAttributes__Group_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5611:1: rule__OnAttributes__Group_3__1 : rule__OnAttributes__Group_3__1__Impl ;
    public final void rule__OnAttributes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5615:1: ( rule__OnAttributes__Group_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5616:2: rule__OnAttributes__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__1__Impl_in_rule__OnAttributes__Group_3__111288);
            rule__OnAttributes__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_3__1"


    // $ANTLR start "rule__OnAttributes__Group_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5622:1: rule__OnAttributes__Group_3__1__Impl : ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) ) ;
    public final void rule__OnAttributes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5626:1: ( ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5627:1: ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5627:1: ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5628:1: ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 )
            {
             before(grammarAccess.getOnAttributesAccess().getTrueFalseSearchAssignment_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5629:1: ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5629:2: rule__OnAttributes__TrueFalseSearchAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__TrueFalseSearchAssignment_3_1_in_rule__OnAttributes__Group_3__1__Impl11315);
            rule__OnAttributes__TrueFalseSearchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOnAttributesAccess().getTrueFalseSearchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_3__1__Impl"


    // $ANTLR start "rule__OnTags__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5643:1: rule__OnTags__Group__0 : rule__OnTags__Group__0__Impl rule__OnTags__Group__1 ;
    public final void rule__OnTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5647:1: ( rule__OnTags__Group__0__Impl rule__OnTags__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5648:2: rule__OnTags__Group__0__Impl rule__OnTags__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__011349);
            rule__OnTags__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__011352);
            rule__OnTags__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__0"


    // $ANTLR start "rule__OnTags__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5655:1: rule__OnTags__Group__0__Impl : ( ( rule__OnTags__OnlyAssignment_0 )? ) ;
    public final void rule__OnTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5659:1: ( ( ( rule__OnTags__OnlyAssignment_0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5660:1: ( ( rule__OnTags__OnlyAssignment_0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5660:1: ( ( rule__OnTags__OnlyAssignment_0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5661:1: ( rule__OnTags__OnlyAssignment_0 )?
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAssignment_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5662:1: ( rule__OnTags__OnlyAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==81) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5662:2: rule__OnTags__OnlyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__OnlyAssignment_0_in_rule__OnTags__Group__0__Impl11379);
                    rule__OnTags__OnlyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getOnlyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__0__Impl"


    // $ANTLR start "rule__OnTags__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5672:1: rule__OnTags__Group__1 : rule__OnTags__Group__1__Impl rule__OnTags__Group__2 ;
    public final void rule__OnTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5676:1: ( rule__OnTags__Group__1__Impl rule__OnTags__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5677:2: rule__OnTags__Group__1__Impl rule__OnTags__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__111410);
            rule__OnTags__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__111413);
            rule__OnTags__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__1"


    // $ANTLR start "rule__OnTags__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5684:1: rule__OnTags__Group__1__Impl : ( 'OnTags' ) ;
    public final void rule__OnTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5688:1: ( ( 'OnTags' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5689:1: ( 'OnTags' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5689:1: ( 'OnTags' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5690:1: 'OnTags'
            {
             before(grammarAccess.getOnTagsAccess().getOnTagsKeyword_1()); 
            match(input,71,FollowSets000.FOLLOW_71_in_rule__OnTags__Group__1__Impl11441); 
             after(grammarAccess.getOnTagsAccess().getOnTagsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__1__Impl"


    // $ANTLR start "rule__OnTags__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5703:1: rule__OnTags__Group__2 : rule__OnTags__Group__2__Impl rule__OnTags__Group__3 ;
    public final void rule__OnTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5707:1: ( rule__OnTags__Group__2__Impl rule__OnTags__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5708:2: rule__OnTags__Group__2__Impl rule__OnTags__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__211472);
            rule__OnTags__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__211475);
            rule__OnTags__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__2"


    // $ANTLR start "rule__OnTags__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5715:1: rule__OnTags__Group__2__Impl : ( '{' ) ;
    public final void rule__OnTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5719:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5720:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5720:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5721:1: '{'
            {
             before(grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnTags__Group__2__Impl11503); 
             after(grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__2__Impl"


    // $ANTLR start "rule__OnTags__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5734:1: rule__OnTags__Group__3 : rule__OnTags__Group__3__Impl rule__OnTags__Group__4 ;
    public final void rule__OnTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5738:1: ( rule__OnTags__Group__3__Impl rule__OnTags__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5739:2: rule__OnTags__Group__3__Impl rule__OnTags__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__311534);
            rule__OnTags__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__311537);
            rule__OnTags__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__3"


    // $ANTLR start "rule__OnTags__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5746:1: rule__OnTags__Group__3__Impl : ( ( rule__OnTags__Group_3__0 )? ) ;
    public final void rule__OnTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5750:1: ( ( ( rule__OnTags__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5751:1: ( ( rule__OnTags__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5751:1: ( ( rule__OnTags__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5752:1: ( rule__OnTags__Group_3__0 )?
            {
             before(grammarAccess.getOnTagsAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5753:1: ( rule__OnTags__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==62) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5753:2: rule__OnTags__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3__0_in_rule__OnTags__Group__3__Impl11564);
                    rule__OnTags__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__3__Impl"


    // $ANTLR start "rule__OnTags__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5763:1: rule__OnTags__Group__4 : rule__OnTags__Group__4__Impl rule__OnTags__Group__5 ;
    public final void rule__OnTags__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5767:1: ( rule__OnTags__Group__4__Impl rule__OnTags__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5768:2: rule__OnTags__Group__4__Impl rule__OnTags__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__411595);
            rule__OnTags__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__411598);
            rule__OnTags__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__4"


    // $ANTLR start "rule__OnTags__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5775:1: rule__OnTags__Group__4__Impl : ( ( rule__OnTags__Group_4__0 )? ) ;
    public final void rule__OnTags__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5779:1: ( ( ( rule__OnTags__Group_4__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5780:1: ( ( rule__OnTags__Group_4__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5780:1: ( ( rule__OnTags__Group_4__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5781:1: ( rule__OnTags__Group_4__0 )?
            {
             before(grammarAccess.getOnTagsAccess().getGroup_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5782:1: ( rule__OnTags__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==72) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5782:2: rule__OnTags__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__0_in_rule__OnTags__Group__4__Impl11625);
                    rule__OnTags__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__4__Impl"


    // $ANTLR start "rule__OnTags__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5792:1: rule__OnTags__Group__5 : rule__OnTags__Group__5__Impl rule__OnTags__Group__6 ;
    public final void rule__OnTags__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5796:1: ( rule__OnTags__Group__5__Impl rule__OnTags__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5797:2: rule__OnTags__Group__5__Impl rule__OnTags__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__511656);
            rule__OnTags__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__511659);
            rule__OnTags__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__5"


    // $ANTLR start "rule__OnTags__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5804:1: rule__OnTags__Group__5__Impl : ( 'treshold' ) ;
    public final void rule__OnTags__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5808:1: ( ( 'treshold' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5809:1: ( 'treshold' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5809:1: ( 'treshold' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5810:1: 'treshold'
            {
             before(grammarAccess.getOnTagsAccess().getTresholdKeyword_5()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__OnTags__Group__5__Impl11687); 
             after(grammarAccess.getOnTagsAccess().getTresholdKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__5__Impl"


    // $ANTLR start "rule__OnTags__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5823:1: rule__OnTags__Group__6 : rule__OnTags__Group__6__Impl rule__OnTags__Group__7 ;
    public final void rule__OnTags__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5827:1: ( rule__OnTags__Group__6__Impl rule__OnTags__Group__7 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5828:2: rule__OnTags__Group__6__Impl rule__OnTags__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__611718);
            rule__OnTags__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__7_in_rule__OnTags__Group__611721);
            rule__OnTags__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__6"


    // $ANTLR start "rule__OnTags__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5835:1: rule__OnTags__Group__6__Impl : ( ( rule__OnTags__TresholdAssignment_6 ) ) ;
    public final void rule__OnTags__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5839:1: ( ( ( rule__OnTags__TresholdAssignment_6 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5840:1: ( ( rule__OnTags__TresholdAssignment_6 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5840:1: ( ( rule__OnTags__TresholdAssignment_6 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5841:1: ( rule__OnTags__TresholdAssignment_6 )
            {
             before(grammarAccess.getOnTagsAccess().getTresholdAssignment_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5842:1: ( rule__OnTags__TresholdAssignment_6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5842:2: rule__OnTags__TresholdAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TresholdAssignment_6_in_rule__OnTags__Group__6__Impl11748);
            rule__OnTags__TresholdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTresholdAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__6__Impl"


    // $ANTLR start "rule__OnTags__Group__7"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5852:1: rule__OnTags__Group__7 : rule__OnTags__Group__7__Impl ;
    public final void rule__OnTags__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5856:1: ( rule__OnTags__Group__7__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5857:2: rule__OnTags__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__7__Impl_in_rule__OnTags__Group__711778);
            rule__OnTags__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__7"


    // $ANTLR start "rule__OnTags__Group__7__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5863:1: rule__OnTags__Group__7__Impl : ( '}' ) ;
    public final void rule__OnTags__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5867:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5868:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5868:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5869:1: '}'
            {
             before(grammarAccess.getOnTagsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnTags__Group__7__Impl11806); 
             after(grammarAccess.getOnTagsAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group__7__Impl"


    // $ANTLR start "rule__OnTags__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5898:1: rule__OnTags__Group_3__0 : rule__OnTags__Group_3__0__Impl rule__OnTags__Group_3__1 ;
    public final void rule__OnTags__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5902:1: ( rule__OnTags__Group_3__0__Impl rule__OnTags__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5903:2: rule__OnTags__Group_3__0__Impl rule__OnTags__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3__0__Impl_in_rule__OnTags__Group_3__011853);
            rule__OnTags__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3__1_in_rule__OnTags__Group_3__011856);
            rule__OnTags__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3__0"


    // $ANTLR start "rule__OnTags__Group_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5910:1: rule__OnTags__Group_3__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__OnTags__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5914:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5915:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5915:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5916:1: 'trueFalseSearch'
            {
             before(grammarAccess.getOnTagsAccess().getTrueFalseSearchKeyword_3_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnTags__Group_3__0__Impl11884); 
             after(grammarAccess.getOnTagsAccess().getTrueFalseSearchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3__0__Impl"


    // $ANTLR start "rule__OnTags__Group_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5929:1: rule__OnTags__Group_3__1 : rule__OnTags__Group_3__1__Impl ;
    public final void rule__OnTags__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5933:1: ( rule__OnTags__Group_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5934:2: rule__OnTags__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3__1__Impl_in_rule__OnTags__Group_3__111915);
            rule__OnTags__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3__1"


    // $ANTLR start "rule__OnTags__Group_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5940:1: rule__OnTags__Group_3__1__Impl : ( ( rule__OnTags__TrueFalseSearchAssignment_3_1 ) ) ;
    public final void rule__OnTags__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5944:1: ( ( ( rule__OnTags__TrueFalseSearchAssignment_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5945:1: ( ( rule__OnTags__TrueFalseSearchAssignment_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5945:1: ( ( rule__OnTags__TrueFalseSearchAssignment_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5946:1: ( rule__OnTags__TrueFalseSearchAssignment_3_1 )
            {
             before(grammarAccess.getOnTagsAccess().getTrueFalseSearchAssignment_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5947:1: ( rule__OnTags__TrueFalseSearchAssignment_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5947:2: rule__OnTags__TrueFalseSearchAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TrueFalseSearchAssignment_3_1_in_rule__OnTags__Group_3__1__Impl11942);
            rule__OnTags__TrueFalseSearchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTrueFalseSearchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3__1__Impl"


    // $ANTLR start "rule__OnTags__Group_4__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5961:1: rule__OnTags__Group_4__0 : rule__OnTags__Group_4__0__Impl rule__OnTags__Group_4__1 ;
    public final void rule__OnTags__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5965:1: ( rule__OnTags__Group_4__0__Impl rule__OnTags__Group_4__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5966:2: rule__OnTags__Group_4__0__Impl rule__OnTags__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__0__Impl_in_rule__OnTags__Group_4__011976);
            rule__OnTags__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__1_in_rule__OnTags__Group_4__011979);
            rule__OnTags__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__0"


    // $ANTLR start "rule__OnTags__Group_4__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5973:1: rule__OnTags__Group_4__0__Impl : ( 'tags' ) ;
    public final void rule__OnTags__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5977:1: ( ( 'tags' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5978:1: ( 'tags' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5978:1: ( 'tags' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5979:1: 'tags'
            {
             before(grammarAccess.getOnTagsAccess().getTagsKeyword_4_0()); 
            match(input,72,FollowSets000.FOLLOW_72_in_rule__OnTags__Group_4__0__Impl12007); 
             after(grammarAccess.getOnTagsAccess().getTagsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__0__Impl"


    // $ANTLR start "rule__OnTags__Group_4__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5992:1: rule__OnTags__Group_4__1 : rule__OnTags__Group_4__1__Impl rule__OnTags__Group_4__2 ;
    public final void rule__OnTags__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5996:1: ( rule__OnTags__Group_4__1__Impl rule__OnTags__Group_4__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5997:2: rule__OnTags__Group_4__1__Impl rule__OnTags__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__1__Impl_in_rule__OnTags__Group_4__112038);
            rule__OnTags__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__2_in_rule__OnTags__Group_4__112041);
            rule__OnTags__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__1"


    // $ANTLR start "rule__OnTags__Group_4__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6004:1: rule__OnTags__Group_4__1__Impl : ( '{' ) ;
    public final void rule__OnTags__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6008:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6009:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6009:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6010:1: '{'
            {
             before(grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnTags__Group_4__1__Impl12069); 
             after(grammarAccess.getOnTagsAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__1__Impl"


    // $ANTLR start "rule__OnTags__Group_4__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6023:1: rule__OnTags__Group_4__2 : rule__OnTags__Group_4__2__Impl rule__OnTags__Group_4__3 ;
    public final void rule__OnTags__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6027:1: ( rule__OnTags__Group_4__2__Impl rule__OnTags__Group_4__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6028:2: rule__OnTags__Group_4__2__Impl rule__OnTags__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__2__Impl_in_rule__OnTags__Group_4__212100);
            rule__OnTags__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__3_in_rule__OnTags__Group_4__212103);
            rule__OnTags__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__2"


    // $ANTLR start "rule__OnTags__Group_4__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6035:1: rule__OnTags__Group_4__2__Impl : ( ( rule__OnTags__TagsAssignment_4_2 ) ) ;
    public final void rule__OnTags__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6039:1: ( ( ( rule__OnTags__TagsAssignment_4_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6040:1: ( ( rule__OnTags__TagsAssignment_4_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6040:1: ( ( rule__OnTags__TagsAssignment_4_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6041:1: ( rule__OnTags__TagsAssignment_4_2 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_4_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6042:1: ( rule__OnTags__TagsAssignment_4_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6042:2: rule__OnTags__TagsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_4_2_in_rule__OnTags__Group_4__2__Impl12130);
            rule__OnTags__TagsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTagsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__2__Impl"


    // $ANTLR start "rule__OnTags__Group_4__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6052:1: rule__OnTags__Group_4__3 : rule__OnTags__Group_4__3__Impl rule__OnTags__Group_4__4 ;
    public final void rule__OnTags__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6056:1: ( rule__OnTags__Group_4__3__Impl rule__OnTags__Group_4__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6057:2: rule__OnTags__Group_4__3__Impl rule__OnTags__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__3__Impl_in_rule__OnTags__Group_4__312160);
            rule__OnTags__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__4_in_rule__OnTags__Group_4__312163);
            rule__OnTags__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__3"


    // $ANTLR start "rule__OnTags__Group_4__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6064:1: rule__OnTags__Group_4__3__Impl : ( ( rule__OnTags__Group_4_3__0 )* ) ;
    public final void rule__OnTags__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6068:1: ( ( ( rule__OnTags__Group_4_3__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6069:1: ( ( rule__OnTags__Group_4_3__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6069:1: ( ( rule__OnTags__Group_4_3__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6070:1: ( rule__OnTags__Group_4_3__0 )*
            {
             before(grammarAccess.getOnTagsAccess().getGroup_4_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6071:1: ( rule__OnTags__Group_4_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6071:2: rule__OnTags__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4_3__0_in_rule__OnTags__Group_4__3__Impl12190);
            	    rule__OnTags__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getOnTagsAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__3__Impl"


    // $ANTLR start "rule__OnTags__Group_4__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6081:1: rule__OnTags__Group_4__4 : rule__OnTags__Group_4__4__Impl ;
    public final void rule__OnTags__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6085:1: ( rule__OnTags__Group_4__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6086:2: rule__OnTags__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4__4__Impl_in_rule__OnTags__Group_4__412221);
            rule__OnTags__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__4"


    // $ANTLR start "rule__OnTags__Group_4__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6092:1: rule__OnTags__Group_4__4__Impl : ( '}' ) ;
    public final void rule__OnTags__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6096:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6097:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6097:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6098:1: '}'
            {
             before(grammarAccess.getOnTagsAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnTags__Group_4__4__Impl12249); 
             after(grammarAccess.getOnTagsAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4__4__Impl"


    // $ANTLR start "rule__OnTags__Group_4_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6121:1: rule__OnTags__Group_4_3__0 : rule__OnTags__Group_4_3__0__Impl rule__OnTags__Group_4_3__1 ;
    public final void rule__OnTags__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6125:1: ( rule__OnTags__Group_4_3__0__Impl rule__OnTags__Group_4_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6126:2: rule__OnTags__Group_4_3__0__Impl rule__OnTags__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4_3__0__Impl_in_rule__OnTags__Group_4_3__012290);
            rule__OnTags__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4_3__1_in_rule__OnTags__Group_4_3__012293);
            rule__OnTags__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4_3__0"


    // $ANTLR start "rule__OnTags__Group_4_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6133:1: rule__OnTags__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__OnTags__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6137:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6138:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6138:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6139:1: ','
            {
             before(grammarAccess.getOnTagsAccess().getCommaKeyword_4_3_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__OnTags__Group_4_3__0__Impl12321); 
             after(grammarAccess.getOnTagsAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4_3__0__Impl"


    // $ANTLR start "rule__OnTags__Group_4_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6152:1: rule__OnTags__Group_4_3__1 : rule__OnTags__Group_4_3__1__Impl ;
    public final void rule__OnTags__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6156:1: ( rule__OnTags__Group_4_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6157:2: rule__OnTags__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_4_3__1__Impl_in_rule__OnTags__Group_4_3__112352);
            rule__OnTags__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4_3__1"


    // $ANTLR start "rule__OnTags__Group_4_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6163:1: rule__OnTags__Group_4_3__1__Impl : ( ( rule__OnTags__TagsAssignment_4_3_1 ) ) ;
    public final void rule__OnTags__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6167:1: ( ( ( rule__OnTags__TagsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6168:1: ( ( rule__OnTags__TagsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6168:1: ( ( rule__OnTags__TagsAssignment_4_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6169:1: ( rule__OnTags__TagsAssignment_4_3_1 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_4_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6170:1: ( rule__OnTags__TagsAssignment_4_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6170:2: rule__OnTags__TagsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_4_3_1_in_rule__OnTags__Group_4_3__1__Impl12379);
            rule__OnTags__TagsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTagsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_4_3__1__Impl"


    // $ANTLR start "rule__OnSize__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6184:1: rule__OnSize__Group__0 : rule__OnSize__Group__0__Impl rule__OnSize__Group__1 ;
    public final void rule__OnSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6188:1: ( rule__OnSize__Group__0__Impl rule__OnSize__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6189:2: rule__OnSize__Group__0__Impl rule__OnSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__012413);
            rule__OnSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__012416);
            rule__OnSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__0"


    // $ANTLR start "rule__OnSize__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6196:1: rule__OnSize__Group__0__Impl : ( 'OnSize' ) ;
    public final void rule__OnSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6200:1: ( ( 'OnSize' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6201:1: ( 'OnSize' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6201:1: ( 'OnSize' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6202:1: 'OnSize'
            {
             before(grammarAccess.getOnSizeAccess().getOnSizeKeyword_0()); 
            match(input,73,FollowSets000.FOLLOW_73_in_rule__OnSize__Group__0__Impl12444); 
             after(grammarAccess.getOnSizeAccess().getOnSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__0__Impl"


    // $ANTLR start "rule__OnSize__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6215:1: rule__OnSize__Group__1 : rule__OnSize__Group__1__Impl rule__OnSize__Group__2 ;
    public final void rule__OnSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6219:1: ( rule__OnSize__Group__1__Impl rule__OnSize__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6220:2: rule__OnSize__Group__1__Impl rule__OnSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__112475);
            rule__OnSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__112478);
            rule__OnSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__1"


    // $ANTLR start "rule__OnSize__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6227:1: rule__OnSize__Group__1__Impl : ( '{' ) ;
    public final void rule__OnSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6231:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6232:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6232:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6233:1: '{'
            {
             before(grammarAccess.getOnSizeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnSize__Group__1__Impl12506); 
             after(grammarAccess.getOnSizeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__1__Impl"


    // $ANTLR start "rule__OnSize__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6246:1: rule__OnSize__Group__2 : rule__OnSize__Group__2__Impl rule__OnSize__Group__3 ;
    public final void rule__OnSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6250:1: ( rule__OnSize__Group__2__Impl rule__OnSize__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6251:2: rule__OnSize__Group__2__Impl rule__OnSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__212537);
            rule__OnSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__212540);
            rule__OnSize__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__2"


    // $ANTLR start "rule__OnSize__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6258:1: rule__OnSize__Group__2__Impl : ( ( rule__OnSize__Group_2__0 )? ) ;
    public final void rule__OnSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6262:1: ( ( ( rule__OnSize__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6263:1: ( ( rule__OnSize__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6263:1: ( ( rule__OnSize__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6264:1: ( rule__OnSize__Group_2__0 )?
            {
             before(grammarAccess.getOnSizeAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6265:1: ( rule__OnSize__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==62) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6265:2: rule__OnSize__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_2__0_in_rule__OnSize__Group__2__Impl12567);
                    rule__OnSize__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnSizeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__2__Impl"


    // $ANTLR start "rule__OnSize__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6275:1: rule__OnSize__Group__3 : rule__OnSize__Group__3__Impl rule__OnSize__Group__4 ;
    public final void rule__OnSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6279:1: ( rule__OnSize__Group__3__Impl rule__OnSize__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6280:2: rule__OnSize__Group__3__Impl rule__OnSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__312598);
            rule__OnSize__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__312601);
            rule__OnSize__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__3"


    // $ANTLR start "rule__OnSize__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6287:1: rule__OnSize__Group__3__Impl : ( 'operator' ) ;
    public final void rule__OnSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6291:1: ( ( 'operator' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6292:1: ( 'operator' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6292:1: ( 'operator' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6293:1: 'operator'
            {
             before(grammarAccess.getOnSizeAccess().getOperatorKeyword_3()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__OnSize__Group__3__Impl12629); 
             after(grammarAccess.getOnSizeAccess().getOperatorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__3__Impl"


    // $ANTLR start "rule__OnSize__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6306:1: rule__OnSize__Group__4 : rule__OnSize__Group__4__Impl rule__OnSize__Group__5 ;
    public final void rule__OnSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6310:1: ( rule__OnSize__Group__4__Impl rule__OnSize__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6311:2: rule__OnSize__Group__4__Impl rule__OnSize__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__412660);
            rule__OnSize__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__5_in_rule__OnSize__Group__412663);
            rule__OnSize__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__4"


    // $ANTLR start "rule__OnSize__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6318:1: rule__OnSize__Group__4__Impl : ( ( rule__OnSize__OperatorAssignment_4 ) ) ;
    public final void rule__OnSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6322:1: ( ( ( rule__OnSize__OperatorAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6323:1: ( ( rule__OnSize__OperatorAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6323:1: ( ( rule__OnSize__OperatorAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6324:1: ( rule__OnSize__OperatorAssignment_4 )
            {
             before(grammarAccess.getOnSizeAccess().getOperatorAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6325:1: ( rule__OnSize__OperatorAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6325:2: rule__OnSize__OperatorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__OperatorAssignment_4_in_rule__OnSize__Group__4__Impl12690);
            rule__OnSize__OperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getOperatorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__4__Impl"


    // $ANTLR start "rule__OnSize__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6335:1: rule__OnSize__Group__5 : rule__OnSize__Group__5__Impl rule__OnSize__Group__6 ;
    public final void rule__OnSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6339:1: ( rule__OnSize__Group__5__Impl rule__OnSize__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6340:2: rule__OnSize__Group__5__Impl rule__OnSize__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__5__Impl_in_rule__OnSize__Group__512720);
            rule__OnSize__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__6_in_rule__OnSize__Group__512723);
            rule__OnSize__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__5"


    // $ANTLR start "rule__OnSize__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6347:1: rule__OnSize__Group__5__Impl : ( 'treshold' ) ;
    public final void rule__OnSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6351:1: ( ( 'treshold' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6352:1: ( 'treshold' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6352:1: ( 'treshold' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6353:1: 'treshold'
            {
             before(grammarAccess.getOnSizeAccess().getTresholdKeyword_5()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__OnSize__Group__5__Impl12751); 
             after(grammarAccess.getOnSizeAccess().getTresholdKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__5__Impl"


    // $ANTLR start "rule__OnSize__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6366:1: rule__OnSize__Group__6 : rule__OnSize__Group__6__Impl rule__OnSize__Group__7 ;
    public final void rule__OnSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6370:1: ( rule__OnSize__Group__6__Impl rule__OnSize__Group__7 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6371:2: rule__OnSize__Group__6__Impl rule__OnSize__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__6__Impl_in_rule__OnSize__Group__612782);
            rule__OnSize__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__7_in_rule__OnSize__Group__612785);
            rule__OnSize__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__6"


    // $ANTLR start "rule__OnSize__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6378:1: rule__OnSize__Group__6__Impl : ( ( rule__OnSize__TresholdAssignment_6 ) ) ;
    public final void rule__OnSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6382:1: ( ( ( rule__OnSize__TresholdAssignment_6 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6383:1: ( ( rule__OnSize__TresholdAssignment_6 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6383:1: ( ( rule__OnSize__TresholdAssignment_6 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6384:1: ( rule__OnSize__TresholdAssignment_6 )
            {
             before(grammarAccess.getOnSizeAccess().getTresholdAssignment_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6385:1: ( rule__OnSize__TresholdAssignment_6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6385:2: rule__OnSize__TresholdAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__TresholdAssignment_6_in_rule__OnSize__Group__6__Impl12812);
            rule__OnSize__TresholdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getTresholdAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__6__Impl"


    // $ANTLR start "rule__OnSize__Group__7"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6395:1: rule__OnSize__Group__7 : rule__OnSize__Group__7__Impl rule__OnSize__Group__8 ;
    public final void rule__OnSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6399:1: ( rule__OnSize__Group__7__Impl rule__OnSize__Group__8 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6400:2: rule__OnSize__Group__7__Impl rule__OnSize__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__7__Impl_in_rule__OnSize__Group__712842);
            rule__OnSize__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__8_in_rule__OnSize__Group__712845);
            rule__OnSize__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__7"


    // $ANTLR start "rule__OnSize__Group__7__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6407:1: rule__OnSize__Group__7__Impl : ( 'unit' ) ;
    public final void rule__OnSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6411:1: ( ( 'unit' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6412:1: ( 'unit' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6412:1: ( 'unit' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6413:1: 'unit'
            {
             before(grammarAccess.getOnSizeAccess().getUnitKeyword_7()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__OnSize__Group__7__Impl12873); 
             after(grammarAccess.getOnSizeAccess().getUnitKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__7__Impl"


    // $ANTLR start "rule__OnSize__Group__8"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6426:1: rule__OnSize__Group__8 : rule__OnSize__Group__8__Impl rule__OnSize__Group__9 ;
    public final void rule__OnSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6430:1: ( rule__OnSize__Group__8__Impl rule__OnSize__Group__9 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6431:2: rule__OnSize__Group__8__Impl rule__OnSize__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__8__Impl_in_rule__OnSize__Group__812904);
            rule__OnSize__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__9_in_rule__OnSize__Group__812907);
            rule__OnSize__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__8"


    // $ANTLR start "rule__OnSize__Group__8__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6438:1: rule__OnSize__Group__8__Impl : ( ( rule__OnSize__UnitAssignment_8 ) ) ;
    public final void rule__OnSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6442:1: ( ( ( rule__OnSize__UnitAssignment_8 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6443:1: ( ( rule__OnSize__UnitAssignment_8 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6443:1: ( ( rule__OnSize__UnitAssignment_8 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6444:1: ( rule__OnSize__UnitAssignment_8 )
            {
             before(grammarAccess.getOnSizeAccess().getUnitAssignment_8()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6445:1: ( rule__OnSize__UnitAssignment_8 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6445:2: rule__OnSize__UnitAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__UnitAssignment_8_in_rule__OnSize__Group__8__Impl12934);
            rule__OnSize__UnitAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getUnitAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__8__Impl"


    // $ANTLR start "rule__OnSize__Group__9"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6455:1: rule__OnSize__Group__9 : rule__OnSize__Group__9__Impl ;
    public final void rule__OnSize__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6459:1: ( rule__OnSize__Group__9__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6460:2: rule__OnSize__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__9__Impl_in_rule__OnSize__Group__912964);
            rule__OnSize__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__9"


    // $ANTLR start "rule__OnSize__Group__9__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6466:1: rule__OnSize__Group__9__Impl : ( '}' ) ;
    public final void rule__OnSize__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6470:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6471:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6471:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6472:1: '}'
            {
             before(grammarAccess.getOnSizeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnSize__Group__9__Impl12992); 
             after(grammarAccess.getOnSizeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group__9__Impl"


    // $ANTLR start "rule__OnSize__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6505:1: rule__OnSize__Group_2__0 : rule__OnSize__Group_2__0__Impl rule__OnSize__Group_2__1 ;
    public final void rule__OnSize__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6509:1: ( rule__OnSize__Group_2__0__Impl rule__OnSize__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6510:2: rule__OnSize__Group_2__0__Impl rule__OnSize__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_2__0__Impl_in_rule__OnSize__Group_2__013043);
            rule__OnSize__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_2__1_in_rule__OnSize__Group_2__013046);
            rule__OnSize__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group_2__0"


    // $ANTLR start "rule__OnSize__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6517:1: rule__OnSize__Group_2__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__OnSize__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6521:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6522:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6522:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6523:1: 'trueFalseSearch'
            {
             before(grammarAccess.getOnSizeAccess().getTrueFalseSearchKeyword_2_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnSize__Group_2__0__Impl13074); 
             after(grammarAccess.getOnSizeAccess().getTrueFalseSearchKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group_2__0__Impl"


    // $ANTLR start "rule__OnSize__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6536:1: rule__OnSize__Group_2__1 : rule__OnSize__Group_2__1__Impl ;
    public final void rule__OnSize__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6540:1: ( rule__OnSize__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6541:2: rule__OnSize__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_2__1__Impl_in_rule__OnSize__Group_2__113105);
            rule__OnSize__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group_2__1"


    // $ANTLR start "rule__OnSize__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6547:1: rule__OnSize__Group_2__1__Impl : ( ( rule__OnSize__TrueFalseSearchAssignment_2_1 ) ) ;
    public final void rule__OnSize__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6551:1: ( ( ( rule__OnSize__TrueFalseSearchAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6552:1: ( ( rule__OnSize__TrueFalseSearchAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6552:1: ( ( rule__OnSize__TrueFalseSearchAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6553:1: ( rule__OnSize__TrueFalseSearchAssignment_2_1 )
            {
             before(grammarAccess.getOnSizeAccess().getTrueFalseSearchAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6554:1: ( rule__OnSize__TrueFalseSearchAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6554:2: rule__OnSize__TrueFalseSearchAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__TrueFalseSearchAssignment_2_1_in_rule__OnSize__Group_2__1__Impl13132);
            rule__OnSize__TrueFalseSearchAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getTrueFalseSearchAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group_2__1__Impl"


    // $ANTLR start "rule__FilterContainer__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6568:1: rule__FilterContainer__Group__0 : rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 ;
    public final void rule__FilterContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6572:1: ( rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6573:2: rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__013166);
            rule__FilterContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__013169);
            rule__FilterContainer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__0"


    // $ANTLR start "rule__FilterContainer__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6580:1: rule__FilterContainer__Group__0__Impl : ( 'FilterContainer' ) ;
    public final void rule__FilterContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6584:1: ( ( 'FilterContainer' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6585:1: ( 'FilterContainer' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6585:1: ( 'FilterContainer' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6586:1: 'FilterContainer'
            {
             before(grammarAccess.getFilterContainerAccess().getFilterContainerKeyword_0()); 
            match(input,74,FollowSets000.FOLLOW_74_in_rule__FilterContainer__Group__0__Impl13197); 
             after(grammarAccess.getFilterContainerAccess().getFilterContainerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__0__Impl"


    // $ANTLR start "rule__FilterContainer__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6599:1: rule__FilterContainer__Group__1 : rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 ;
    public final void rule__FilterContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6603:1: ( rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6604:2: rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__113228);
            rule__FilterContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__113231);
            rule__FilterContainer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__1"


    // $ANTLR start "rule__FilterContainer__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6611:1: rule__FilterContainer__Group__1__Impl : ( '{' ) ;
    public final void rule__FilterContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6615:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6616:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6616:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6617:1: '{'
            {
             before(grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__FilterContainer__Group__1__Impl13259); 
             after(grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__1__Impl"


    // $ANTLR start "rule__FilterContainer__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6630:1: rule__FilterContainer__Group__2 : rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 ;
    public final void rule__FilterContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6634:1: ( rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6635:2: rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__213290);
            rule__FilterContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__213293);
            rule__FilterContainer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__2"


    // $ANTLR start "rule__FilterContainer__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6642:1: rule__FilterContainer__Group__2__Impl : ( ( rule__FilterContainer__Group_2__0 )? ) ;
    public final void rule__FilterContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6646:1: ( ( ( rule__FilterContainer__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6647:1: ( ( rule__FilterContainer__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6647:1: ( ( rule__FilterContainer__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6648:1: ( rule__FilterContainer__Group_2__0 )?
            {
             before(grammarAccess.getFilterContainerAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6649:1: ( rule__FilterContainer__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==76) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6649:2: rule__FilterContainer__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_2__0_in_rule__FilterContainer__Group__2__Impl13320);
                    rule__FilterContainer__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterContainerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__2__Impl"


    // $ANTLR start "rule__FilterContainer__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6659:1: rule__FilterContainer__Group__3 : rule__FilterContainer__Group__3__Impl rule__FilterContainer__Group__4 ;
    public final void rule__FilterContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6663:1: ( rule__FilterContainer__Group__3__Impl rule__FilterContainer__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6664:2: rule__FilterContainer__Group__3__Impl rule__FilterContainer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__313351);
            rule__FilterContainer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__4_in_rule__FilterContainer__Group__313354);
            rule__FilterContainer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__3"


    // $ANTLR start "rule__FilterContainer__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6671:1: rule__FilterContainer__Group__3__Impl : ( 'segments' ) ;
    public final void rule__FilterContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6675:1: ( ( 'segments' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6676:1: ( 'segments' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6676:1: ( 'segments' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6677:1: 'segments'
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsKeyword_3()); 
            match(input,75,FollowSets000.FOLLOW_75_in_rule__FilterContainer__Group__3__Impl13382); 
             after(grammarAccess.getFilterContainerAccess().getSegmentsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__3__Impl"


    // $ANTLR start "rule__FilterContainer__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6690:1: rule__FilterContainer__Group__4 : rule__FilterContainer__Group__4__Impl rule__FilterContainer__Group__5 ;
    public final void rule__FilterContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6694:1: ( rule__FilterContainer__Group__4__Impl rule__FilterContainer__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6695:2: rule__FilterContainer__Group__4__Impl rule__FilterContainer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__4__Impl_in_rule__FilterContainer__Group__413413);
            rule__FilterContainer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__5_in_rule__FilterContainer__Group__413416);
            rule__FilterContainer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__4"


    // $ANTLR start "rule__FilterContainer__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6702:1: rule__FilterContainer__Group__4__Impl : ( '{' ) ;
    public final void rule__FilterContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6706:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6707:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6707:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6708:1: '{'
            {
             before(grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__FilterContainer__Group__4__Impl13444); 
             after(grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__4__Impl"


    // $ANTLR start "rule__FilterContainer__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6721:1: rule__FilterContainer__Group__5 : rule__FilterContainer__Group__5__Impl rule__FilterContainer__Group__6 ;
    public final void rule__FilterContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6725:1: ( rule__FilterContainer__Group__5__Impl rule__FilterContainer__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6726:2: rule__FilterContainer__Group__5__Impl rule__FilterContainer__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__5__Impl_in_rule__FilterContainer__Group__513475);
            rule__FilterContainer__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__6_in_rule__FilterContainer__Group__513478);
            rule__FilterContainer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__5"


    // $ANTLR start "rule__FilterContainer__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6733:1: rule__FilterContainer__Group__5__Impl : ( ( rule__FilterContainer__SegmentsAssignment_5 ) ) ;
    public final void rule__FilterContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6737:1: ( ( ( rule__FilterContainer__SegmentsAssignment_5 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6738:1: ( ( rule__FilterContainer__SegmentsAssignment_5 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6738:1: ( ( rule__FilterContainer__SegmentsAssignment_5 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6739:1: ( rule__FilterContainer__SegmentsAssignment_5 )
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6740:1: ( rule__FilterContainer__SegmentsAssignment_5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6740:2: rule__FilterContainer__SegmentsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__SegmentsAssignment_5_in_rule__FilterContainer__Group__5__Impl13505);
            rule__FilterContainer__SegmentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__5__Impl"


    // $ANTLR start "rule__FilterContainer__Group__6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6750:1: rule__FilterContainer__Group__6 : rule__FilterContainer__Group__6__Impl rule__FilterContainer__Group__7 ;
    public final void rule__FilterContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6754:1: ( rule__FilterContainer__Group__6__Impl rule__FilterContainer__Group__7 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6755:2: rule__FilterContainer__Group__6__Impl rule__FilterContainer__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__6__Impl_in_rule__FilterContainer__Group__613535);
            rule__FilterContainer__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__7_in_rule__FilterContainer__Group__613538);
            rule__FilterContainer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__6"


    // $ANTLR start "rule__FilterContainer__Group__6__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6762:1: rule__FilterContainer__Group__6__Impl : ( ( rule__FilterContainer__Group_6__0 )* ) ;
    public final void rule__FilterContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6766:1: ( ( ( rule__FilterContainer__Group_6__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6767:1: ( ( rule__FilterContainer__Group_6__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6767:1: ( ( rule__FilterContainer__Group_6__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6768:1: ( rule__FilterContainer__Group_6__0 )*
            {
             before(grammarAccess.getFilterContainerAccess().getGroup_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6769:1: ( rule__FilterContainer__Group_6__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==42) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6769:2: rule__FilterContainer__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_6__0_in_rule__FilterContainer__Group__6__Impl13565);
            	    rule__FilterContainer__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getFilterContainerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__6__Impl"


    // $ANTLR start "rule__FilterContainer__Group__7"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6779:1: rule__FilterContainer__Group__7 : rule__FilterContainer__Group__7__Impl rule__FilterContainer__Group__8 ;
    public final void rule__FilterContainer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6783:1: ( rule__FilterContainer__Group__7__Impl rule__FilterContainer__Group__8 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6784:2: rule__FilterContainer__Group__7__Impl rule__FilterContainer__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__7__Impl_in_rule__FilterContainer__Group__713596);
            rule__FilterContainer__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__8_in_rule__FilterContainer__Group__713599);
            rule__FilterContainer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__7"


    // $ANTLR start "rule__FilterContainer__Group__7__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6791:1: rule__FilterContainer__Group__7__Impl : ( '}' ) ;
    public final void rule__FilterContainer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6795:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6796:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6796:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6797:1: '}'
            {
             before(grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__FilterContainer__Group__7__Impl13627); 
             after(grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__7__Impl"


    // $ANTLR start "rule__FilterContainer__Group__8"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6810:1: rule__FilterContainer__Group__8 : rule__FilterContainer__Group__8__Impl ;
    public final void rule__FilterContainer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6814:1: ( rule__FilterContainer__Group__8__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6815:2: rule__FilterContainer__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__8__Impl_in_rule__FilterContainer__Group__813658);
            rule__FilterContainer__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__8"


    // $ANTLR start "rule__FilterContainer__Group__8__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6821:1: rule__FilterContainer__Group__8__Impl : ( '}' ) ;
    public final void rule__FilterContainer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6825:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6826:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6826:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6827:1: '}'
            {
             before(grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__FilterContainer__Group__8__Impl13686); 
             after(grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group__8__Impl"


    // $ANTLR start "rule__FilterContainer__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6858:1: rule__FilterContainer__Group_2__0 : rule__FilterContainer__Group_2__0__Impl rule__FilterContainer__Group_2__1 ;
    public final void rule__FilterContainer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6862:1: ( rule__FilterContainer__Group_2__0__Impl rule__FilterContainer__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6863:2: rule__FilterContainer__Group_2__0__Impl rule__FilterContainer__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_2__0__Impl_in_rule__FilterContainer__Group_2__013735);
            rule__FilterContainer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_2__1_in_rule__FilterContainer__Group_2__013738);
            rule__FilterContainer__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_2__0"


    // $ANTLR start "rule__FilterContainer__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6870:1: rule__FilterContainer__Group_2__0__Impl : ( 'compositionType' ) ;
    public final void rule__FilterContainer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6874:1: ( ( 'compositionType' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6875:1: ( 'compositionType' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6875:1: ( 'compositionType' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6876:1: 'compositionType'
            {
             before(grammarAccess.getFilterContainerAccess().getCompositionTypeKeyword_2_0()); 
            match(input,76,FollowSets000.FOLLOW_76_in_rule__FilterContainer__Group_2__0__Impl13766); 
             after(grammarAccess.getFilterContainerAccess().getCompositionTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_2__0__Impl"


    // $ANTLR start "rule__FilterContainer__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6889:1: rule__FilterContainer__Group_2__1 : rule__FilterContainer__Group_2__1__Impl ;
    public final void rule__FilterContainer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6893:1: ( rule__FilterContainer__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6894:2: rule__FilterContainer__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_2__1__Impl_in_rule__FilterContainer__Group_2__113797);
            rule__FilterContainer__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_2__1"


    // $ANTLR start "rule__FilterContainer__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6900:1: rule__FilterContainer__Group_2__1__Impl : ( ( rule__FilterContainer__CompositionTypeAssignment_2_1 ) ) ;
    public final void rule__FilterContainer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6904:1: ( ( ( rule__FilterContainer__CompositionTypeAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6905:1: ( ( rule__FilterContainer__CompositionTypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6905:1: ( ( rule__FilterContainer__CompositionTypeAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6906:1: ( rule__FilterContainer__CompositionTypeAssignment_2_1 )
            {
             before(grammarAccess.getFilterContainerAccess().getCompositionTypeAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6907:1: ( rule__FilterContainer__CompositionTypeAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6907:2: rule__FilterContainer__CompositionTypeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__CompositionTypeAssignment_2_1_in_rule__FilterContainer__Group_2__1__Impl13824);
            rule__FilterContainer__CompositionTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getCompositionTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_2__1__Impl"


    // $ANTLR start "rule__FilterContainer__Group_6__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6921:1: rule__FilterContainer__Group_6__0 : rule__FilterContainer__Group_6__0__Impl rule__FilterContainer__Group_6__1 ;
    public final void rule__FilterContainer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6925:1: ( rule__FilterContainer__Group_6__0__Impl rule__FilterContainer__Group_6__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6926:2: rule__FilterContainer__Group_6__0__Impl rule__FilterContainer__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_6__0__Impl_in_rule__FilterContainer__Group_6__013858);
            rule__FilterContainer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_6__1_in_rule__FilterContainer__Group_6__013861);
            rule__FilterContainer__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_6__0"


    // $ANTLR start "rule__FilterContainer__Group_6__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6933:1: rule__FilterContainer__Group_6__0__Impl : ( ',' ) ;
    public final void rule__FilterContainer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6937:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6938:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6938:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6939:1: ','
            {
             before(grammarAccess.getFilterContainerAccess().getCommaKeyword_6_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__FilterContainer__Group_6__0__Impl13889); 
             after(grammarAccess.getFilterContainerAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_6__0__Impl"


    // $ANTLR start "rule__FilterContainer__Group_6__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6952:1: rule__FilterContainer__Group_6__1 : rule__FilterContainer__Group_6__1__Impl ;
    public final void rule__FilterContainer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6956:1: ( rule__FilterContainer__Group_6__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6957:2: rule__FilterContainer__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_6__1__Impl_in_rule__FilterContainer__Group_6__113920);
            rule__FilterContainer__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_6__1"


    // $ANTLR start "rule__FilterContainer__Group_6__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6963:1: rule__FilterContainer__Group_6__1__Impl : ( ( rule__FilterContainer__SegmentsAssignment_6_1 ) ) ;
    public final void rule__FilterContainer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6967:1: ( ( ( rule__FilterContainer__SegmentsAssignment_6_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6968:1: ( ( rule__FilterContainer__SegmentsAssignment_6_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6968:1: ( ( rule__FilterContainer__SegmentsAssignment_6_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6969:1: ( rule__FilterContainer__SegmentsAssignment_6_1 )
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_6_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6970:1: ( rule__FilterContainer__SegmentsAssignment_6_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6970:2: rule__FilterContainer__SegmentsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__SegmentsAssignment_6_1_in_rule__FilterContainer__Group_6__1__Impl13947);
            rule__FilterContainer__SegmentsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_6__1__Impl"


    // $ANTLR start "rule__IsEmpty__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6984:1: rule__IsEmpty__Group__0 : rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 ;
    public final void rule__IsEmpty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6988:1: ( rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6989:2: rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__013981);
            rule__IsEmpty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__013984);
            rule__IsEmpty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__0"


    // $ANTLR start "rule__IsEmpty__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6996:1: rule__IsEmpty__Group__0__Impl : ( () ) ;
    public final void rule__IsEmpty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7000:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7001:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7001:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7002:1: ()
            {
             before(grammarAccess.getIsEmptyAccess().getIsEmptyAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7003:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7005:1: 
            {
            }

             after(grammarAccess.getIsEmptyAccess().getIsEmptyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__0__Impl"


    // $ANTLR start "rule__IsEmpty__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7015:1: rule__IsEmpty__Group__1 : rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 ;
    public final void rule__IsEmpty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7019:1: ( rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7020:2: rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__114042);
            rule__IsEmpty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__114045);
            rule__IsEmpty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__1"


    // $ANTLR start "rule__IsEmpty__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7027:1: rule__IsEmpty__Group__1__Impl : ( 'IsEmpty' ) ;
    public final void rule__IsEmpty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7031:1: ( ( 'IsEmpty' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7032:1: ( 'IsEmpty' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7032:1: ( 'IsEmpty' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7033:1: 'IsEmpty'
            {
             before(grammarAccess.getIsEmptyAccess().getIsEmptyKeyword_1()); 
            match(input,77,FollowSets000.FOLLOW_77_in_rule__IsEmpty__Group__1__Impl14073); 
             after(grammarAccess.getIsEmptyAccess().getIsEmptyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__1__Impl"


    // $ANTLR start "rule__IsEmpty__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7046:1: rule__IsEmpty__Group__2 : rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 ;
    public final void rule__IsEmpty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7050:1: ( rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7051:2: rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__214104);
            rule__IsEmpty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__214107);
            rule__IsEmpty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__2"


    // $ANTLR start "rule__IsEmpty__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7058:1: rule__IsEmpty__Group__2__Impl : ( '{' ) ;
    public final void rule__IsEmpty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7062:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7063:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7063:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7064:1: '{'
            {
             before(grammarAccess.getIsEmptyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__IsEmpty__Group__2__Impl14135); 
             after(grammarAccess.getIsEmptyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__2__Impl"


    // $ANTLR start "rule__IsEmpty__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7077:1: rule__IsEmpty__Group__3 : rule__IsEmpty__Group__3__Impl rule__IsEmpty__Group__4 ;
    public final void rule__IsEmpty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7081:1: ( rule__IsEmpty__Group__3__Impl rule__IsEmpty__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7082:2: rule__IsEmpty__Group__3__Impl rule__IsEmpty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__314166);
            rule__IsEmpty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__4_in_rule__IsEmpty__Group__314169);
            rule__IsEmpty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__3"


    // $ANTLR start "rule__IsEmpty__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7089:1: rule__IsEmpty__Group__3__Impl : ( ( rule__IsEmpty__Group_3__0 )? ) ;
    public final void rule__IsEmpty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7093:1: ( ( ( rule__IsEmpty__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7094:1: ( ( rule__IsEmpty__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7094:1: ( ( rule__IsEmpty__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7095:1: ( rule__IsEmpty__Group_3__0 )?
            {
             before(grammarAccess.getIsEmptyAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7096:1: ( rule__IsEmpty__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==62) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7096:2: rule__IsEmpty__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group_3__0_in_rule__IsEmpty__Group__3__Impl14196);
                    rule__IsEmpty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIsEmptyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__3__Impl"


    // $ANTLR start "rule__IsEmpty__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7106:1: rule__IsEmpty__Group__4 : rule__IsEmpty__Group__4__Impl ;
    public final void rule__IsEmpty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7110:1: ( rule__IsEmpty__Group__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7111:2: rule__IsEmpty__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__4__Impl_in_rule__IsEmpty__Group__414227);
            rule__IsEmpty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__4"


    // $ANTLR start "rule__IsEmpty__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7117:1: rule__IsEmpty__Group__4__Impl : ( '}' ) ;
    public final void rule__IsEmpty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7121:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7122:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7122:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7123:1: '}'
            {
             before(grammarAccess.getIsEmptyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__IsEmpty__Group__4__Impl14255); 
             after(grammarAccess.getIsEmptyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group__4__Impl"


    // $ANTLR start "rule__IsEmpty__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7146:1: rule__IsEmpty__Group_3__0 : rule__IsEmpty__Group_3__0__Impl rule__IsEmpty__Group_3__1 ;
    public final void rule__IsEmpty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7150:1: ( rule__IsEmpty__Group_3__0__Impl rule__IsEmpty__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7151:2: rule__IsEmpty__Group_3__0__Impl rule__IsEmpty__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group_3__0__Impl_in_rule__IsEmpty__Group_3__014296);
            rule__IsEmpty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group_3__1_in_rule__IsEmpty__Group_3__014299);
            rule__IsEmpty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group_3__0"


    // $ANTLR start "rule__IsEmpty__Group_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7158:1: rule__IsEmpty__Group_3__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__IsEmpty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7162:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7163:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7163:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7164:1: 'trueFalseSearch'
            {
             before(grammarAccess.getIsEmptyAccess().getTrueFalseSearchKeyword_3_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__IsEmpty__Group_3__0__Impl14327); 
             after(grammarAccess.getIsEmptyAccess().getTrueFalseSearchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group_3__0__Impl"


    // $ANTLR start "rule__IsEmpty__Group_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7177:1: rule__IsEmpty__Group_3__1 : rule__IsEmpty__Group_3__1__Impl ;
    public final void rule__IsEmpty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7181:1: ( rule__IsEmpty__Group_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7182:2: rule__IsEmpty__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group_3__1__Impl_in_rule__IsEmpty__Group_3__114358);
            rule__IsEmpty__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group_3__1"


    // $ANTLR start "rule__IsEmpty__Group_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7188:1: rule__IsEmpty__Group_3__1__Impl : ( ( rule__IsEmpty__TrueFalseSearchAssignment_3_1 ) ) ;
    public final void rule__IsEmpty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7192:1: ( ( ( rule__IsEmpty__TrueFalseSearchAssignment_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7193:1: ( ( rule__IsEmpty__TrueFalseSearchAssignment_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7193:1: ( ( rule__IsEmpty__TrueFalseSearchAssignment_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7194:1: ( rule__IsEmpty__TrueFalseSearchAssignment_3_1 )
            {
             before(grammarAccess.getIsEmptyAccess().getTrueFalseSearchAssignment_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7195:1: ( rule__IsEmpty__TrueFalseSearchAssignment_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7195:2: rule__IsEmpty__TrueFalseSearchAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__TrueFalseSearchAssignment_3_1_in_rule__IsEmpty__Group_3__1__Impl14385);
            rule__IsEmpty__TrueFalseSearchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIsEmptyAccess().getTrueFalseSearchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__Group_3__1__Impl"


    // $ANTLR start "rule__OnType__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7209:1: rule__OnType__Group__0 : rule__OnType__Group__0__Impl rule__OnType__Group__1 ;
    public final void rule__OnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7213:1: ( rule__OnType__Group__0__Impl rule__OnType__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7214:2: rule__OnType__Group__0__Impl rule__OnType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__014419);
            rule__OnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__014422);
            rule__OnType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__0"


    // $ANTLR start "rule__OnType__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7221:1: rule__OnType__Group__0__Impl : ( 'OnType' ) ;
    public final void rule__OnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7225:1: ( ( 'OnType' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7226:1: ( 'OnType' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7226:1: ( 'OnType' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7227:1: 'OnType'
            {
             before(grammarAccess.getOnTypeAccess().getOnTypeKeyword_0()); 
            match(input,78,FollowSets000.FOLLOW_78_in_rule__OnType__Group__0__Impl14450); 
             after(grammarAccess.getOnTypeAccess().getOnTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__0__Impl"


    // $ANTLR start "rule__OnType__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7240:1: rule__OnType__Group__1 : rule__OnType__Group__1__Impl rule__OnType__Group__2 ;
    public final void rule__OnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7244:1: ( rule__OnType__Group__1__Impl rule__OnType__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7245:2: rule__OnType__Group__1__Impl rule__OnType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__114481);
            rule__OnType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__114484);
            rule__OnType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__1"


    // $ANTLR start "rule__OnType__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7252:1: rule__OnType__Group__1__Impl : ( '{' ) ;
    public final void rule__OnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7256:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7257:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7257:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7258:1: '{'
            {
             before(grammarAccess.getOnTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnType__Group__1__Impl14512); 
             after(grammarAccess.getOnTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__1__Impl"


    // $ANTLR start "rule__OnType__Group__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7271:1: rule__OnType__Group__2 : rule__OnType__Group__2__Impl rule__OnType__Group__3 ;
    public final void rule__OnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7275:1: ( rule__OnType__Group__2__Impl rule__OnType__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7276:2: rule__OnType__Group__2__Impl rule__OnType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__214543);
            rule__OnType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__214546);
            rule__OnType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__2"


    // $ANTLR start "rule__OnType__Group__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7283:1: rule__OnType__Group__2__Impl : ( ( rule__OnType__Group_2__0 )? ) ;
    public final void rule__OnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7287:1: ( ( ( rule__OnType__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7288:1: ( ( rule__OnType__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7288:1: ( ( rule__OnType__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7289:1: ( rule__OnType__Group_2__0 )?
            {
             before(grammarAccess.getOnTypeAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7290:1: ( rule__OnType__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==62) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7290:2: rule__OnType__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_2__0_in_rule__OnType__Group__2__Impl14573);
                    rule__OnType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__2__Impl"


    // $ANTLR start "rule__OnType__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7300:1: rule__OnType__Group__3 : rule__OnType__Group__3__Impl rule__OnType__Group__4 ;
    public final void rule__OnType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7304:1: ( rule__OnType__Group__3__Impl rule__OnType__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7305:2: rule__OnType__Group__3__Impl rule__OnType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__314604);
            rule__OnType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__4_in_rule__OnType__Group__314607);
            rule__OnType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__3"


    // $ANTLR start "rule__OnType__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7312:1: rule__OnType__Group__3__Impl : ( 'type' ) ;
    public final void rule__OnType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7316:1: ( ( 'type' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7317:1: ( 'type' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7317:1: ( 'type' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7318:1: 'type'
            {
             before(grammarAccess.getOnTypeAccess().getTypeKeyword_3()); 
            match(input,79,FollowSets000.FOLLOW_79_in_rule__OnType__Group__3__Impl14635); 
             after(grammarAccess.getOnTypeAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__3__Impl"


    // $ANTLR start "rule__OnType__Group__4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7331:1: rule__OnType__Group__4 : rule__OnType__Group__4__Impl rule__OnType__Group__5 ;
    public final void rule__OnType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7335:1: ( rule__OnType__Group__4__Impl rule__OnType__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7336:2: rule__OnType__Group__4__Impl rule__OnType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__4__Impl_in_rule__OnType__Group__414666);
            rule__OnType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__5_in_rule__OnType__Group__414669);
            rule__OnType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__4"


    // $ANTLR start "rule__OnType__Group__4__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7343:1: rule__OnType__Group__4__Impl : ( ( rule__OnType__TypeAssignment_4 ) ) ;
    public final void rule__OnType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7347:1: ( ( ( rule__OnType__TypeAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7348:1: ( ( rule__OnType__TypeAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7348:1: ( ( rule__OnType__TypeAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7349:1: ( rule__OnType__TypeAssignment_4 )
            {
             before(grammarAccess.getOnTypeAccess().getTypeAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7350:1: ( rule__OnType__TypeAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7350:2: rule__OnType__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__TypeAssignment_4_in_rule__OnType__Group__4__Impl14696);
            rule__OnType__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOnTypeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__4__Impl"


    // $ANTLR start "rule__OnType__Group__5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7360:1: rule__OnType__Group__5 : rule__OnType__Group__5__Impl ;
    public final void rule__OnType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7364:1: ( rule__OnType__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7365:2: rule__OnType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__5__Impl_in_rule__OnType__Group__514726);
            rule__OnType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__5"


    // $ANTLR start "rule__OnType__Group__5__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7371:1: rule__OnType__Group__5__Impl : ( '}' ) ;
    public final void rule__OnType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7375:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7376:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7376:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7377:1: '}'
            {
             before(grammarAccess.getOnTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__OnType__Group__5__Impl14754); 
             after(grammarAccess.getOnTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group__5__Impl"


    // $ANTLR start "rule__OnType__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7402:1: rule__OnType__Group_2__0 : rule__OnType__Group_2__0__Impl rule__OnType__Group_2__1 ;
    public final void rule__OnType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7406:1: ( rule__OnType__Group_2__0__Impl rule__OnType__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7407:2: rule__OnType__Group_2__0__Impl rule__OnType__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_2__0__Impl_in_rule__OnType__Group_2__014797);
            rule__OnType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_2__1_in_rule__OnType__Group_2__014800);
            rule__OnType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group_2__0"


    // $ANTLR start "rule__OnType__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7414:1: rule__OnType__Group_2__0__Impl : ( 'trueFalseSearch' ) ;
    public final void rule__OnType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7418:1: ( ( 'trueFalseSearch' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7419:1: ( 'trueFalseSearch' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7419:1: ( 'trueFalseSearch' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7420:1: 'trueFalseSearch'
            {
             before(grammarAccess.getOnTypeAccess().getTrueFalseSearchKeyword_2_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnType__Group_2__0__Impl14828); 
             after(grammarAccess.getOnTypeAccess().getTrueFalseSearchKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group_2__0__Impl"


    // $ANTLR start "rule__OnType__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7433:1: rule__OnType__Group_2__1 : rule__OnType__Group_2__1__Impl ;
    public final void rule__OnType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7437:1: ( rule__OnType__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7438:2: rule__OnType__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_2__1__Impl_in_rule__OnType__Group_2__114859);
            rule__OnType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group_2__1"


    // $ANTLR start "rule__OnType__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7444:1: rule__OnType__Group_2__1__Impl : ( ( rule__OnType__TrueFalseSearchAssignment_2_1 ) ) ;
    public final void rule__OnType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7448:1: ( ( ( rule__OnType__TrueFalseSearchAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7449:1: ( ( rule__OnType__TrueFalseSearchAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7449:1: ( ( rule__OnType__TrueFalseSearchAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7450:1: ( rule__OnType__TrueFalseSearchAssignment_2_1 )
            {
             before(grammarAccess.getOnTypeAccess().getTrueFalseSearchAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7451:1: ( rule__OnType__TrueFalseSearchAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7451:2: rule__OnType__TrueFalseSearchAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__TrueFalseSearchAssignment_2_1_in_rule__OnType__Group_2__1__Impl14886);
            rule__OnType__TrueFalseSearchAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTypeAccess().getTrueFalseSearchAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7465:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7469:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7470:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__014920);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__014923);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7477:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7481:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7482:1: ( ( '-' )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7482:1: ( ( '-' )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7483:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7484:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==80) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7485:2: '-'
                    {
                    match(input,80,FollowSets000.FOLLOW_80_in_rule__EInt__Group__0__Impl14952); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7496:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7500:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7501:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__114985);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7507:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7511:1: ( ( RULE_INT ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7512:1: ( RULE_INT )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7512:1: ( RULE_INT )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7513:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl15012); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Model__ExecutionsAssignment_3_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7529:1: rule__Model__ExecutionsAssignment_3_2 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7533:1: ( ( ruleExecution ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7534:1: ( ruleExecution )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7534:1: ( ruleExecution )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7535:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_3_215050);
            ruleExecution();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExecutionsAssignment_3_2"


    // $ANTLR start "rule__Model__ExecutionsAssignment_3_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7544:1: rule__Model__ExecutionsAssignment_3_3_1 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7548:1: ( ( ruleExecution ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7549:1: ( ruleExecution )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7549:1: ( ruleExecution )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7550:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_3_3_115081);
            ruleExecution();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExecutionsAssignment_3_3_1"


    // $ANTLR start "rule__Copy__StrategyAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7559:1: rule__Copy__StrategyAssignment_2_1 : ( ruleStrategies ) ;
    public final void rule__Copy__StrategyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7563:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7564:1: ( ruleStrategies )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7564:1: ( ruleStrategies )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7565:1: ruleStrategies
            {
             before(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_2_115112);
            ruleStrategies();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__StrategyAssignment_2_1"


    // $ANTLR start "rule__Copy__SourceAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7574:1: rule__Copy__SourceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Copy__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7578:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7579:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7579:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7580:1: ( ruleEString )
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionVariableCrossReference_4_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7581:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7582:1: ruleEString
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_415147);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getSourceSelectionVariableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getSourceSelectionVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__SourceAssignment_4"


    // $ANTLR start "rule__Copy__DestinationAssignment_6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7593:1: rule__Copy__DestinationAssignment_6 : ( rulePath ) ;
    public final void rule__Copy__DestinationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7597:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7598:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7598:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7599:1: rulePath
            {
             before(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_615182);
            rulePath();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__DestinationAssignment_6"


    // $ANTLR start "rule__Move__StrategyAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7608:1: rule__Move__StrategyAssignment_2_1 : ( ruleStrategies ) ;
    public final void rule__Move__StrategyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7612:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7613:1: ( ruleStrategies )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7613:1: ( ruleStrategies )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7614:1: ruleStrategies
            {
             before(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_2_115213);
            ruleStrategies();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__StrategyAssignment_2_1"


    // $ANTLR start "rule__Move__SourceAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7623:1: rule__Move__SourceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Move__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7627:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7628:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7628:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7629:1: ( ruleEString )
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionVariableCrossReference_4_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7630:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7631:1: ruleEString
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionVariableEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Move__SourceAssignment_415248);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSourceSelectionVariableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMoveAccess().getSourceSelectionVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__SourceAssignment_4"


    // $ANTLR start "rule__Move__DestinationAssignment_6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7642:1: rule__Move__DestinationAssignment_6 : ( rulePath ) ;
    public final void rule__Move__DestinationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7646:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7647:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7647:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7648:1: rulePath
            {
             before(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Move__DestinationAssignment_615283);
            rulePath();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__DestinationAssignment_6"


    // $ANTLR start "rule__Delete__SourceAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7657:1: rule__Delete__SourceAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Delete__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7661:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7662:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7662:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7663:1: ( ruleEString )
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionVariableCrossReference_3_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7664:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7665:1: ruleEString
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionVariableEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_315318);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getSourceSelectionVariableEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDeleteAccess().getSourceSelectionVariableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__SourceAssignment_3"


    // $ANTLR start "rule__PathVariable__NameAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7676:1: rule__PathVariable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PathVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7680:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7681:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7681:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7682:1: ruleEString
            {
             before(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_115353);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__NameAssignment_1"


    // $ANTLR start "rule__PathVariable__ValueAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7691:1: rule__PathVariable__ValueAssignment_4 : ( rulePath ) ;
    public final void rule__PathVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7695:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7696:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7696:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7697:1: rulePath
            {
             before(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_415384);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__ValueAssignment_4"


    // $ANTLR start "rule__SelectionVariable__NameAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7706:1: rule__SelectionVariable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SelectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7710:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7711:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7711:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7712:1: ruleEString
            {
             before(grammarAccess.getSelectionVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SelectionVariable__NameAssignment_115415);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSelectionVariableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__NameAssignment_1"


    // $ANTLR start "rule__SelectionVariable__ValueAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7721:1: rule__SelectionVariable__ValueAssignment_4 : ( ruleSelection ) ;
    public final void rule__SelectionVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7725:1: ( ( ruleSelection ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7726:1: ( ruleSelection )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7726:1: ( ruleSelection )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7727:1: ruleSelection
            {
             before(grammarAccess.getSelectionVariableAccess().getValueSelectionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_rule__SelectionVariable__ValueAssignment_415446);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionVariableAccess().getValueSelectionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__ValueAssignment_4"


    // $ANTLR start "rule__Path__AbsoluteAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7736:1: rule__Path__AbsoluteAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Path__AbsoluteAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7740:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7741:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7741:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7742:1: ruleEBoolean
            {
             before(grammarAccess.getPathAccess().getAbsoluteEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Path__AbsoluteAssignment_2_115477);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getPathAccess().getAbsoluteEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__AbsoluteAssignment_2_1"


    // $ANTLR start "rule__Path__StepsAssignment_5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7751:1: rule__Path__StepsAssignment_5 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7755:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7756:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7756:1: ( ruleGenericStep )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7757:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_515508);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__StepsAssignment_5"


    // $ANTLR start "rule__Path__StepsAssignment_6_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7766:1: rule__Path__StepsAssignment_6_1 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7770:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7771:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7771:1: ( ruleGenericStep )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7772:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_6_115539);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__StepsAssignment_6_1"


    // $ANTLR start "rule__ConcreteStep__ValueAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7781:1: rule__ConcreteStep__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__ConcreteStep__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7785:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7786:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7786:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7787:1: ruleEString
            {
             before(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment_315570);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__ValueAssignment_3"


    // $ANTLR start "rule__VariableStep__ValueAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7796:1: rule__VariableStep__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__VariableStep__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7800:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7801:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7801:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7802:1: ( ruleEString )
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_3_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7803:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7804:1: ruleEString
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_315605);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableStepAccess().getValuePathVariableEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__ValueAssignment_3"


    // $ANTLR start "rule__ParametrizedStep__NameAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7815:1: rule__ParametrizedStep__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParametrizedStep__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7819:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7820:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7820:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7821:1: ruleEString
            {
             before(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_215640);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__NameAssignment_2"


    // $ANTLR start "rule__Selection__WhereAssignment_2_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7830:1: rule__Selection__WhereAssignment_2_2 : ( ruleFilterComponent ) ;
    public final void rule__Selection__WhereAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7834:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7835:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7835:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7836:1: ruleFilterComponent
            {
             before(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_2_215671);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__WhereAssignment_2_2"


    // $ANTLR start "rule__Selection__WhereAssignment_2_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7845:1: rule__Selection__WhereAssignment_2_3_1 : ( ruleFilterComponent ) ;
    public final void rule__Selection__WhereAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7849:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7850:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7850:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7851:1: ruleFilterComponent
            {
             before(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_2_3_115702);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__WhereAssignment_2_3_1"


    // $ANTLR start "rule__Selection__FromAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7860:1: rule__Selection__FromAssignment_4 : ( rulePath ) ;
    public final void rule__Selection__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7864:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7865:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7865:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7866:1: rulePath
            {
             before(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Selection__FromAssignment_415733);
            rulePath();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__FromAssignment_4"


    // $ANTLR start "rule__OnName__NameAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7875:1: rule__OnName__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OnName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7879:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7880:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7880:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7881:1: ruleEString
            {
             before(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnName__NameAssignment_215764);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__NameAssignment_2"


    // $ANTLR start "rule__OnName__TrueFalseSearchAssignment_4_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7890:1: rule__OnName__TrueFalseSearchAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__OnName__TrueFalseSearchAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7894:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7895:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7895:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7896:1: ruleEBoolean
            {
             before(grammarAccess.getOnNameAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnName__TrueFalseSearchAssignment_4_115795);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnNameAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__TrueFalseSearchAssignment_4_1"


    // $ANTLR start "rule__OnExtension__TrueFalseSearchAssignment_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7905:1: rule__OnExtension__TrueFalseSearchAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__OnExtension__TrueFalseSearchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7909:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7910:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7910:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7911:1: ruleEBoolean
            {
             before(grammarAccess.getOnExtensionAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnExtension__TrueFalseSearchAssignment_3_115826);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__TrueFalseSearchAssignment_3_1"


    // $ANTLR start "rule__OnExtension__ExtensionsAssignment_4_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7920:1: rule__OnExtension__ExtensionsAssignment_4_2 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7924:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7925:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7925:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7926:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_215857);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__ExtensionsAssignment_4_2"


    // $ANTLR start "rule__OnExtension__ExtensionsAssignment_4_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7935:1: rule__OnExtension__ExtensionsAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7939:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7940:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7940:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7941:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_3_115888);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__ExtensionsAssignment_4_3_1"


    // $ANTLR start "rule__OnTime__TrueFalseSearchAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7950:1: rule__OnTime__TrueFalseSearchAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__OnTime__TrueFalseSearchAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7954:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7955:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7955:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7956:1: ruleEBoolean
            {
             before(grammarAccess.getOnTimeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnTime__TrueFalseSearchAssignment_2_115919);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TrueFalseSearchAssignment_2_1"


    // $ANTLR start "rule__OnTime__OperatorAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7965:1: rule__OnTime__OperatorAssignment_4 : ( ruleOperator ) ;
    public final void rule__OnTime__OperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7969:1: ( ( ruleOperator ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7970:1: ( ruleOperator )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7970:1: ( ruleOperator )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7971:1: ruleOperator
            {
             before(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_415950);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__OperatorAssignment_4"


    // $ANTLR start "rule__OnTime__TresholdAssignment_6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7980:1: rule__OnTime__TresholdAssignment_6 : ( ruleEInt ) ;
    public final void rule__OnTime__TresholdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7984:1: ( ( ruleEInt ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7985:1: ( ruleEInt )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7985:1: ( ruleEInt )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7986:1: ruleEInt
            {
             before(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_615981);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TresholdAssignment_6"


    // $ANTLR start "rule__OnTime__UnitAssignment_8"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7995:1: rule__OnTime__UnitAssignment_8 : ( ruleTimeUnit ) ;
    public final void rule__OnTime__UnitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:7999:1: ( ( ruleTimeUnit ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8000:1: ( ruleTimeUnit )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8000:1: ( ruleTimeUnit )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8001:1: ruleTimeUnit
            {
             before(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_816012);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__UnitAssignment_8"


    // $ANTLR start "rule__OnTime__TimeOfAssignment_10"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8010:1: rule__OnTime__TimeOfAssignment_10 : ( ruleTimeType ) ;
    public final void rule__OnTime__TimeOfAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8014:1: ( ( ruleTimeType ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8015:1: ( ruleTimeType )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8015:1: ( ruleTimeType )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8016:1: ruleTimeType
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_1016043);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TimeOfAssignment_10"


    // $ANTLR start "rule__OnAttributes__NameAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8025:1: rule__OnAttributes__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OnAttributes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8029:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8030:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8030:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8031:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_116074);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__NameAssignment_1"


    // $ANTLR start "rule__OnAttributes__TrueFalseSearchAssignment_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8040:1: rule__OnAttributes__TrueFalseSearchAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__OnAttributes__TrueFalseSearchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8044:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8045:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8045:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8046:1: ruleEBoolean
            {
             before(grammarAccess.getOnAttributesAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnAttributes__TrueFalseSearchAssignment_3_116105);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnAttributesAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__TrueFalseSearchAssignment_3_1"


    // $ANTLR start "rule__OnAttributes__ValueAssignment_5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8055:1: rule__OnAttributes__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__OnAttributes__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8059:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8060:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8060:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8061:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_516136);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__ValueAssignment_5"


    // $ANTLR start "rule__OnTags__OnlyAssignment_0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8070:1: rule__OnTags__OnlyAssignment_0 : ( ( 'only' ) ) ;
    public final void rule__OnTags__OnlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8074:1: ( ( ( 'only' ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8075:1: ( ( 'only' ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8075:1: ( ( 'only' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8076:1: ( 'only' )
            {
             before(grammarAccess.getOnTagsAccess().getOnlyOnlyKeyword_0_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8077:1: ( 'only' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8078:1: 'only'
            {
             before(grammarAccess.getOnTagsAccess().getOnlyOnlyKeyword_0_0()); 
            match(input,81,FollowSets000.FOLLOW_81_in_rule__OnTags__OnlyAssignment_016172); 
             after(grammarAccess.getOnTagsAccess().getOnlyOnlyKeyword_0_0()); 

            }

             after(grammarAccess.getOnTagsAccess().getOnlyOnlyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__OnlyAssignment_0"


    // $ANTLR start "rule__OnTags__TrueFalseSearchAssignment_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8093:1: rule__OnTags__TrueFalseSearchAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__OnTags__TrueFalseSearchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8097:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8098:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8098:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8099:1: ruleEBoolean
            {
             before(grammarAccess.getOnTagsAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnTags__TrueFalseSearchAssignment_3_116211);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TrueFalseSearchAssignment_3_1"


    // $ANTLR start "rule__OnTags__TagsAssignment_4_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8108:1: rule__OnTags__TagsAssignment_4_2 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8112:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8113:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8113:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8114:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_4_216242);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TagsAssignment_4_2"


    // $ANTLR start "rule__OnTags__TagsAssignment_4_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8123:1: rule__OnTags__TagsAssignment_4_3_1 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8127:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8128:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8128:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8129:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_4_3_116273);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TagsAssignment_4_3_1"


    // $ANTLR start "rule__OnTags__TresholdAssignment_6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8138:1: rule__OnTags__TresholdAssignment_6 : ( ruleEInt ) ;
    public final void rule__OnTags__TresholdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8142:1: ( ( ruleEInt ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8143:1: ( ruleEInt )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8143:1: ( ruleEInt )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8144:1: ruleEInt
            {
             before(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_616304);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TresholdAssignment_6"


    // $ANTLR start "rule__OnSize__TrueFalseSearchAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8153:1: rule__OnSize__TrueFalseSearchAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__OnSize__TrueFalseSearchAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8157:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8158:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8158:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8159:1: ruleEBoolean
            {
             before(grammarAccess.getOnSizeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnSize__TrueFalseSearchAssignment_2_116335);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__TrueFalseSearchAssignment_2_1"


    // $ANTLR start "rule__OnSize__OperatorAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8168:1: rule__OnSize__OperatorAssignment_4 : ( ruleOperator ) ;
    public final void rule__OnSize__OperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8172:1: ( ( ruleOperator ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8173:1: ( ruleOperator )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8173:1: ( ruleOperator )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8174:1: ruleOperator
            {
             before(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_416366);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__OperatorAssignment_4"


    // $ANTLR start "rule__OnSize__TresholdAssignment_6"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8183:1: rule__OnSize__TresholdAssignment_6 : ( ruleEInt ) ;
    public final void rule__OnSize__TresholdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8187:1: ( ( ruleEInt ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8188:1: ( ruleEInt )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8188:1: ( ruleEInt )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8189:1: ruleEInt
            {
             before(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_616397);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__TresholdAssignment_6"


    // $ANTLR start "rule__OnSize__UnitAssignment_8"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8198:1: rule__OnSize__UnitAssignment_8 : ( ruleMemoryUnit ) ;
    public final void rule__OnSize__UnitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8202:1: ( ( ruleMemoryUnit ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8203:1: ( ruleMemoryUnit )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8203:1: ( ruleMemoryUnit )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8204:1: ruleMemoryUnit
            {
             before(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_816428);
            ruleMemoryUnit();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__UnitAssignment_8"


    // $ANTLR start "rule__FilterContainer__CompositionTypeAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8213:1: rule__FilterContainer__CompositionTypeAssignment_2_1 : ( ruleCompositionType ) ;
    public final void rule__FilterContainer__CompositionTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8217:1: ( ( ruleCompositionType ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8218:1: ( ruleCompositionType )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8218:1: ( ruleCompositionType )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8219:1: ruleCompositionType
            {
             before(grammarAccess.getFilterContainerAccess().getCompositionTypeCompositionTypeEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_rule__FilterContainer__CompositionTypeAssignment_2_116459);
            ruleCompositionType();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getCompositionTypeCompositionTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__CompositionTypeAssignment_2_1"


    // $ANTLR start "rule__FilterContainer__SegmentsAssignment_5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8228:1: rule__FilterContainer__SegmentsAssignment_5 : ( ruleFilterComponent ) ;
    public final void rule__FilterContainer__SegmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8232:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8233:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8233:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8234:1: ruleFilterComponent
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_516490);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__SegmentsAssignment_5"


    // $ANTLR start "rule__FilterContainer__SegmentsAssignment_6_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8243:1: rule__FilterContainer__SegmentsAssignment_6_1 : ( ruleFilterComponent ) ;
    public final void rule__FilterContainer__SegmentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8247:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8248:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8248:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8249:1: ruleFilterComponent
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_6_116521);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__SegmentsAssignment_6_1"


    // $ANTLR start "rule__IsEmpty__TrueFalseSearchAssignment_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8258:1: rule__IsEmpty__TrueFalseSearchAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__IsEmpty__TrueFalseSearchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8262:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8263:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8263:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8264:1: ruleEBoolean
            {
             before(grammarAccess.getIsEmptyAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__IsEmpty__TrueFalseSearchAssignment_3_116552);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getIsEmptyAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__TrueFalseSearchAssignment_3_1"


    // $ANTLR start "rule__OnType__TrueFalseSearchAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8273:1: rule__OnType__TrueFalseSearchAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__OnType__TrueFalseSearchAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8277:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8278:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8278:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8279:1: ruleEBoolean
            {
             before(grammarAccess.getOnTypeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnType__TrueFalseSearchAssignment_2_116583);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnTypeAccess().getTrueFalseSearchEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__TrueFalseSearchAssignment_2_1"


    // $ANTLR start "rule__OnType__TypeAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8288:1: rule__OnType__TypeAssignment_4 : ( ruleFileType ) ;
    public final void rule__OnType__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8292:1: ( ( ruleFileType ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8293:1: ( ruleFileType )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8293:1: ( ruleFileType )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:8294:1: ruleFileType
            {
             before(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_416614);
            ruleFileType();

            state._fsp--;

             after(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__TypeAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_entryRuleExecution121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExecution128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Execution__Alternatives_in_ruleExecution154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericStep__Alternatives_in_ruleGenericStep214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterComponent__Alternatives_in_ruleFilterComponent274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__0_in_ruleCopy334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0_in_ruleMove394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__0_in_ruleDelete454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_entryRulePathVariable481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathVariable488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__0_in_rulePathVariable514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_entryRuleSelectionVariable541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionVariable548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__0_in_ruleSelectionVariable574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__0_in_ruleConcreteStep754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__0_in_ruleVariableStep814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__0_in_ruleParametrizedStep874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__0_in_ruleSelection994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__0_in_ruleOnName1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__0_in_ruleOnExtension1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__0_in_ruleOnTime1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes1201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__0_in_ruleOnAttributes1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__0_in_ruleOnTags1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__0_in_ruleOnSize1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__0_in_ruleFilterContainer1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty1441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__0_in_ruleIsEmpty1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType1501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__0_in_ruleOnType1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Strategies__Alternatives_in_ruleStrategies1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeType__Alternatives_in_ruleTimeType1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MemoryUnit__Alternatives_in_ruleMemoryUnit1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositionType__Alternatives_in_ruleCompositionType1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FileType__Alternatives_in_ruleFileType1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_rule__Execution__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Execution__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_rule__Execution__Alternatives1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_rule__Execution__Alternatives1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionVariable_in_rule__Execution__Alternatives1950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_rule__GenericStep__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_rule__GenericStep__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_rule__GenericStep__Alternatives2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_rule__FilterComponent__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_rule__FilterComponent__Alternatives2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_rule__FilterComponent__Alternatives2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_rule__FilterComponent__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_rule__FilterComponent__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_rule__FilterComponent__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_rule__FilterComponent__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_rule__FilterComponent__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_rule__FilterComponent__Alternatives2184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Strategies__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Strategies__Alternatives2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Strategies__Alternatives2363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TimeUnit__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TimeUnit__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TimeUnit__Alternatives2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TimeUnit__Alternatives2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TimeUnit__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TimeUnit__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__TimeType__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__TimeType__Alternatives2681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MemoryUnit__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MemoryUnit__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MemoryUnit__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MemoryUnit__Alternatives2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__CompositionType__Alternatives2816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__CompositionType__Alternatives2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__CompositionType__Alternatives2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__FileType__Alternatives2894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__FileType__Alternatives2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02948 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13009 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Model__Group__1__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23071 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Model__Group__2__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33133 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Model__Group__4__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__03263 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__03266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Model__Group_3__0__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__13325 = new BitSet(new long[]{0x000B880000000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__13328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Model__Group_3__1__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__23387 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__3_in_rule__Model__Group_3__23390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_3_2_in_rule__Model__Group_3__2__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__3__Impl_in_rule__Model__Group_3__33447 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__4_in_rule__Model__Group_3__33450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__0_in_rule__Model__Group_3__3__Impl3477 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__4__Impl_in_rule__Model__Group_3__43508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Model__Group_3__4__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__0__Impl_in_rule__Model__Group_3_3__03577 = new BitSet(new long[]{0x000B880000000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__1_in_rule__Model__Group_3_3__03580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Model__Group_3_3__0__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__1__Impl_in_rule__Model__Group_3_3__13639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_3_3_1_in_rule__Model__Group_3_3__1__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__03700 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__03703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Copy__Group__0__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__13762 = new BitSet(new long[]{0x0000500000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__13765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Copy__Group__1__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__23824 = new BitSet(new long[]{0x0000500000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__23827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_2__0_in_rule__Copy__Group__2__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__33885 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__33888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Copy__Group__3__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__43947 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__43950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__SourceAssignment_4_in_rule__Copy__Group__4__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__54007 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__6_in_rule__Copy__Group__54010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Copy__Group__5__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__6__Impl_in_rule__Copy__Group__64069 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__7_in_rule__Copy__Group__64072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__DestinationAssignment_6_in_rule__Copy__Group__6__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__7__Impl_in_rule__Copy__Group__74129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Copy__Group__7__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_2__0__Impl_in_rule__Copy__Group_2__04204 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Copy__Group_2__1_in_rule__Copy__Group_2__04207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Copy__Group_2__0__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_2__1__Impl_in_rule__Copy__Group_2__14266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__StrategyAssignment_2_1_in_rule__Copy__Group_2__1__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__04327 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__04330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Move__Group__0__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__14389 = new BitSet(new long[]{0x0000500000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__14392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Move__Group__1__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__24451 = new BitSet(new long[]{0x0000500000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__24454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_2__0_in_rule__Move__Group__2__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__34512 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__34515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Move__Group__3__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__44574 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__5_in_rule__Move__Group__44577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SourceAssignment_4_in_rule__Move__Group__4__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__54634 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__6_in_rule__Move__Group__54637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Move__Group__5__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__6__Impl_in_rule__Move__Group__64696 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__7_in_rule__Move__Group__64699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__DestinationAssignment_6_in_rule__Move__Group__6__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__7__Impl_in_rule__Move__Group__74756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Move__Group__7__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_2__0__Impl_in_rule__Move__Group_2__04831 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Move__Group_2__1_in_rule__Move__Group_2__04834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Move__Group_2__0__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_2__1__Impl_in_rule__Move__Group_2__14893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__StrategyAssignment_2_1_in_rule__Move__Group_2__1__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__04954 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__04957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Delete__Group__0__Impl4985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__15016 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__15019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Delete__Group__1__Impl5047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__25078 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Delete__Group__3_in_rule__Delete__Group__25081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Delete__Group__2__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__3__Impl_in_rule__Delete__Group__35140 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Delete__Group__4_in_rule__Delete__Group__35143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__SourceAssignment_3_in_rule__Delete__Group__3__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__4__Impl_in_rule__Delete__Group__45200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Delete__Group__4__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__05269 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__05272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__PathVariable__Group__0__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__15331 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__15334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__NameAssignment_1_in_rule__PathVariable__Group__1__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__25391 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__3_in_rule__PathVariable__Group__25394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__PathVariable__Group__2__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__3__Impl_in_rule__PathVariable__Group__35453 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__4_in_rule__PathVariable__Group__35456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__PathVariable__Group__3__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__4__Impl_in_rule__PathVariable__Group__45515 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__5_in_rule__PathVariable__Group__45518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__ValueAssignment_4_in_rule__PathVariable__Group__4__Impl5545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__5__Impl_in_rule__PathVariable__Group__55575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__PathVariable__Group__5__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__0__Impl_in_rule__SelectionVariable__Group__05646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__1_in_rule__SelectionVariable__Group__05649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__SelectionVariable__Group__0__Impl5677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__1__Impl_in_rule__SelectionVariable__Group__15708 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__2_in_rule__SelectionVariable__Group__15711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__NameAssignment_1_in_rule__SelectionVariable__Group__1__Impl5738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__2__Impl_in_rule__SelectionVariable__Group__25768 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__3_in_rule__SelectionVariable__Group__25771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__SelectionVariable__Group__2__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__3__Impl_in_rule__SelectionVariable__Group__35830 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__4_in_rule__SelectionVariable__Group__35833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__SelectionVariable__Group__3__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__4__Impl_in_rule__SelectionVariable__Group__45892 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__5_in_rule__SelectionVariable__Group__45895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__ValueAssignment_4_in_rule__SelectionVariable__Group__4__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__5__Impl_in_rule__SelectionVariable__Group__55952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__SelectionVariable__Group__5__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__06023 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__06026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Path__Group__0__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__16085 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__2_in_rule__Path__Group__16088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Path__Group__1__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__26147 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__3_in_rule__Path__Group__26150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_2__0_in_rule__Path__Group__2__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__36208 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__4_in_rule__Path__Group__36211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Path__Group__3__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__4__Impl_in_rule__Path__Group__46270 = new BitSet(new long[]{0x0380000000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__5_in_rule__Path__Group__46273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Path__Group__4__Impl6301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__5__Impl_in_rule__Path__Group__56332 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__6_in_rule__Path__Group__56335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_5_in_rule__Path__Group__5__Impl6362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__6__Impl_in_rule__Path__Group__66392 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__7_in_rule__Path__Group__66395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_6__0_in_rule__Path__Group__6__Impl6422 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__7__Impl_in_rule__Path__Group__76453 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__8_in_rule__Path__Group__76456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Path__Group__7__Impl6484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__8__Impl_in_rule__Path__Group__86515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Path__Group__8__Impl6543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_2__0__Impl_in_rule__Path__Group_2__06592 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Path__Group_2__1_in_rule__Path__Group_2__06595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Path__Group_2__0__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_2__1__Impl_in_rule__Path__Group_2__16654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__AbsoluteAssignment_2_1_in_rule__Path__Group_2__1__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_6__0__Impl_in_rule__Path__Group_6__06715 = new BitSet(new long[]{0x0380000000000000L});
        public static final BitSet FOLLOW_rule__Path__Group_6__1_in_rule__Path__Group_6__06718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Path__Group_6__0__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_6__1__Impl_in_rule__Path__Group_6__16777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_6_1_in_rule__Path__Group_6__1__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__0__Impl_in_rule__ConcreteStep__Group__06838 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__1_in_rule__ConcreteStep__Group__06841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__ConcreteStep__Group__0__Impl6869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__1__Impl_in_rule__ConcreteStep__Group__16900 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__2_in_rule__ConcreteStep__Group__16903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ConcreteStep__Group__1__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__2__Impl_in_rule__ConcreteStep__Group__26962 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__3_in_rule__ConcreteStep__Group__26965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__ConcreteStep__Group__2__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__3__Impl_in_rule__ConcreteStep__Group__37024 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__4_in_rule__ConcreteStep__Group__37027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__ValueAssignment_3_in_rule__ConcreteStep__Group__3__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__4__Impl_in_rule__ConcreteStep__Group__47084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ConcreteStep__Group__4__Impl7112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__07153 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__07156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__VariableStep__Group__0__Impl7184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__17215 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__2_in_rule__VariableStep__Group__17218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__VariableStep__Group__1__Impl7246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__2__Impl_in_rule__VariableStep__Group__27277 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__3_in_rule__VariableStep__Group__27280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__VariableStep__Group__2__Impl7308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__3__Impl_in_rule__VariableStep__Group__37339 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__4_in_rule__VariableStep__Group__37342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__ValueAssignment_3_in_rule__VariableStep__Group__3__Impl7369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__4__Impl_in_rule__VariableStep__Group__47399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__VariableStep__Group__4__Impl7427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__07468 = new BitSet(new long[]{0x0380000000000000L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__07471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__17529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__17532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__ParametrizedStep__Group__1__Impl7560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__27591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl7618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__07654 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__07657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Selection__Group__0__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__17716 = new BitSet(new long[]{0x1800000000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__17719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Selection__Group__1__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__27778 = new BitSet(new long[]{0x1800000000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__27781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__0_in_rule__Selection__Group__2__Impl7808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__37839 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__37842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Selection__Group__3__Impl7870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__47901 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__47904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__FromAssignment_4_in_rule__Selection__Group__4__Impl7931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__57961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Selection__Group__5__Impl7989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__0__Impl_in_rule__Selection__Group_2__08032 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__1_in_rule__Selection__Group_2__08035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__Selection__Group_2__0__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__1__Impl_in_rule__Selection__Group_2__18094 = new BitSet(new long[]{0xA000000000000000L,0x00000000000266C2L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__2_in_rule__Selection__Group_2__18097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Selection__Group_2__1__Impl8125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__2__Impl_in_rule__Selection__Group_2__28156 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__3_in_rule__Selection__Group_2__28159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__WhereAssignment_2_2_in_rule__Selection__Group_2__2__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__3__Impl_in_rule__Selection__Group_2__38216 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__4_in_rule__Selection__Group_2__38219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2_3__0_in_rule__Selection__Group_2__3__Impl8246 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2__4__Impl_in_rule__Selection__Group_2__48277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Selection__Group_2__4__Impl8305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2_3__0__Impl_in_rule__Selection__Group_2_3__08346 = new BitSet(new long[]{0xA000000000000000L,0x00000000000266C2L});
        public static final BitSet FOLLOW_rule__Selection__Group_2_3__1_in_rule__Selection__Group_2_3__08349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Selection__Group_2_3__0__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_2_3__1__Impl_in_rule__Selection__Group_2_3__18408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__WhereAssignment_2_3_1_in_rule__Selection__Group_2_3__1__Impl8435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__08469 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__08472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__18530 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__18533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__OnName__Group__1__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__28592 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__28595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__NameAssignment_2_in_rule__OnName__Group__2__Impl8622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__38652 = new BitSet(new long[]{0x4000010000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__4_in_rule__OnName__Group__38655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnName__Group__3__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__4__Impl_in_rule__OnName__Group__48714 = new BitSet(new long[]{0x4000010000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__5_in_rule__OnName__Group__48717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__0_in_rule__OnName__Group__4__Impl8744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__5__Impl_in_rule__OnName__Group__58775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnName__Group__5__Impl8803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__0__Impl_in_rule__OnName__Group_4__08846 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__1_in_rule__OnName__Group_4__08849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnName__Group_4__0__Impl8877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__1__Impl_in_rule__OnName__Group_4__18908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__TrueFalseSearchAssignment_4_1_in_rule__OnName__Group_4__1__Impl8935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__08969 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__08972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__19030 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__19033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__OnExtension__Group__1__Impl9061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__29092 = new BitSet(new long[]{0x4000010000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__29095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnExtension__Group__2__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__39154 = new BitSet(new long[]{0x4000010000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__39157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__0_in_rule__OnExtension__Group__3__Impl9184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__49215 = new BitSet(new long[]{0x4000010000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__49218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__0_in_rule__OnExtension__Group__4__Impl9245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__59276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnExtension__Group__5__Impl9304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__0__Impl_in_rule__OnExtension__Group_3__09347 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__1_in_rule__OnExtension__Group_3__09350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnExtension__Group_3__0__Impl9378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__1__Impl_in_rule__OnExtension__Group_3__19409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__TrueFalseSearchAssignment_3_1_in_rule__OnExtension__Group_3__1__Impl9436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__0__Impl_in_rule__OnExtension__Group_4__09470 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__1_in_rule__OnExtension__Group_4__09473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__OnExtension__Group_4__0__Impl9501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__1__Impl_in_rule__OnExtension__Group_4__19532 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__2_in_rule__OnExtension__Group_4__19535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnExtension__Group_4__1__Impl9563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__2__Impl_in_rule__OnExtension__Group_4__29594 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__3_in_rule__OnExtension__Group_4__29597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_4_2_in_rule__OnExtension__Group_4__2__Impl9624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__3__Impl_in_rule__OnExtension__Group_4__39654 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__4_in_rule__OnExtension__Group_4__39657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_3__0_in_rule__OnExtension__Group_4__3__Impl9684 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__4__Impl_in_rule__OnExtension__Group_4__49715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnExtension__Group_4__4__Impl9743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_3__0__Impl_in_rule__OnExtension__Group_4_3__09784 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_3__1_in_rule__OnExtension__Group_4_3__09787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__OnExtension__Group_4_3__0__Impl9815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_3__1__Impl_in_rule__OnExtension__Group_4_3__19846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_4_3_1_in_rule__OnExtension__Group_4_3__1__Impl9873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__09907 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__09910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__OnTime__Group__0__Impl9938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__19969 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__19972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnTime__Group__1__Impl10000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__210031 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__210034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group_2__0_in_rule__OnTime__Group__2__Impl10061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__310092 = new BitSet(new long[]{0x00000000001F0000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__310095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__OnTime__Group__3__Impl10123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__410154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__OnTime__Group__5_in_rule__OnTime__Group__410157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__OperatorAssignment_4_in_rule__OnTime__Group__4__Impl10184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__5__Impl_in_rule__OnTime__Group__510214 = new BitSet(new long[]{0x0000000000000040L,0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__6_in_rule__OnTime__Group__510217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__OnTime__Group__5__Impl10245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__6__Impl_in_rule__OnTime__Group__610276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OnTime__Group__7_in_rule__OnTime__Group__610279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TresholdAssignment_6_in_rule__OnTime__Group__6__Impl10306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__7__Impl_in_rule__OnTime__Group__710336 = new BitSet(new long[]{0x0000000007E00000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__8_in_rule__OnTime__Group__710339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__OnTime__Group__7__Impl10367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__8__Impl_in_rule__OnTime__Group__810398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnTime__Group__9_in_rule__OnTime__Group__810401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__UnitAssignment_8_in_rule__OnTime__Group__8__Impl10428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__9__Impl_in_rule__OnTime__Group__910458 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__10_in_rule__OnTime__Group__910461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnTime__Group__9__Impl10489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__10__Impl_in_rule__OnTime__Group__1010520 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__11_in_rule__OnTime__Group__1010523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TimeOfAssignment_10_in_rule__OnTime__Group__10__Impl10550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__11__Impl_in_rule__OnTime__Group__1110580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnTime__Group__11__Impl10608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group_2__0__Impl_in_rule__OnTime__Group_2__010663 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnTime__Group_2__1_in_rule__OnTime__Group_2__010666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnTime__Group_2__0__Impl10694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group_2__1__Impl_in_rule__OnTime__Group_2__110725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TrueFalseSearchAssignment_2_1_in_rule__OnTime__Group_2__1__Impl10752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__010786 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__010789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__OnAttributes__Group__0__Impl10817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__110848 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__110851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl10878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__210908 = new BitSet(new long[]{0x4004000000000000L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__3_in_rule__OnAttributes__Group__210911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnAttributes__Group__2__Impl10939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__3__Impl_in_rule__OnAttributes__Group__310970 = new BitSet(new long[]{0x4004000000000000L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__4_in_rule__OnAttributes__Group__310973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__0_in_rule__OnAttributes__Group__3__Impl11000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__4__Impl_in_rule__OnAttributes__Group__411031 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__5_in_rule__OnAttributes__Group__411034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__OnAttributes__Group__4__Impl11062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__5__Impl_in_rule__OnAttributes__Group__511093 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__6_in_rule__OnAttributes__Group__511096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__ValueAssignment_5_in_rule__OnAttributes__Group__5__Impl11123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__6__Impl_in_rule__OnAttributes__Group__611153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnAttributes__Group__6__Impl11181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__0__Impl_in_rule__OnAttributes__Group_3__011226 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__1_in_rule__OnAttributes__Group_3__011229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnAttributes__Group_3__0__Impl11257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__1__Impl_in_rule__OnAttributes__Group_3__111288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__TrueFalseSearchAssignment_3_1_in_rule__OnAttributes__Group_3__1__Impl11315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__011349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020080L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__011352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__OnlyAssignment_0_in_rule__OnTags__Group__0__Impl11379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__111410 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__111413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rule__OnTags__Group__1__Impl11441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__211472 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000108L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__211475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnTags__Group__2__Impl11503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__311534 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000108L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__311537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3__0_in_rule__OnTags__Group__3__Impl11564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__411595 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000108L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__411598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__0_in_rule__OnTags__Group__4__Impl11625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__511656 = new BitSet(new long[]{0x0000000000000040L,0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__511659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__OnTags__Group__5__Impl11687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__611718 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group__7_in_rule__OnTags__Group__611721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TresholdAssignment_6_in_rule__OnTags__Group__6__Impl11748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__7__Impl_in_rule__OnTags__Group__711778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnTags__Group__7__Impl11806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3__0__Impl_in_rule__OnTags__Group_3__011853 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3__1_in_rule__OnTags__Group_3__011856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnTags__Group_3__0__Impl11884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3__1__Impl_in_rule__OnTags__Group_3__111915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TrueFalseSearchAssignment_3_1_in_rule__OnTags__Group_3__1__Impl11942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__0__Impl_in_rule__OnTags__Group_4__011976 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__1_in_rule__OnTags__Group_4__011979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rule__OnTags__Group_4__0__Impl12007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__1__Impl_in_rule__OnTags__Group_4__112038 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__2_in_rule__OnTags__Group_4__112041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnTags__Group_4__1__Impl12069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__2__Impl_in_rule__OnTags__Group_4__212100 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__3_in_rule__OnTags__Group_4__212103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_4_2_in_rule__OnTags__Group_4__2__Impl12130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__3__Impl_in_rule__OnTags__Group_4__312160 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__4_in_rule__OnTags__Group_4__312163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4_3__0_in_rule__OnTags__Group_4__3__Impl12190 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4__4__Impl_in_rule__OnTags__Group_4__412221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnTags__Group_4__4__Impl12249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4_3__0__Impl_in_rule__OnTags__Group_4_3__012290 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4_3__1_in_rule__OnTags__Group_4_3__012293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__OnTags__Group_4_3__0__Impl12321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_4_3__1__Impl_in_rule__OnTags__Group_4_3__112352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_4_3_1_in_rule__OnTags__Group_4_3__1__Impl12379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__012413 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__012416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rule__OnSize__Group__0__Impl12444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__112475 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__112478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnSize__Group__1__Impl12506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__212537 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__212540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group_2__0_in_rule__OnSize__Group__2__Impl12567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__312598 = new BitSet(new long[]{0x00000000001F0000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__312601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__OnSize__Group__3__Impl12629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__412660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__OnSize__Group__5_in_rule__OnSize__Group__412663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__OperatorAssignment_4_in_rule__OnSize__Group__4__Impl12690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__5__Impl_in_rule__OnSize__Group__512720 = new BitSet(new long[]{0x0000000000000040L,0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__6_in_rule__OnSize__Group__512723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__OnSize__Group__5__Impl12751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__6__Impl_in_rule__OnSize__Group__612782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OnSize__Group__7_in_rule__OnSize__Group__612785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__TresholdAssignment_6_in_rule__OnSize__Group__6__Impl12812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__7__Impl_in_rule__OnSize__Group__712842 = new BitSet(new long[]{0x00000001E0000000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__8_in_rule__OnSize__Group__712845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__OnSize__Group__7__Impl12873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__8__Impl_in_rule__OnSize__Group__812904 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__9_in_rule__OnSize__Group__812907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__UnitAssignment_8_in_rule__OnSize__Group__8__Impl12934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__9__Impl_in_rule__OnSize__Group__912964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnSize__Group__9__Impl12992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group_2__0__Impl_in_rule__OnSize__Group_2__013043 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnSize__Group_2__1_in_rule__OnSize__Group_2__013046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnSize__Group_2__0__Impl13074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group_2__1__Impl_in_rule__OnSize__Group_2__113105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__TrueFalseSearchAssignment_2_1_in_rule__OnSize__Group_2__1__Impl13132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__013166 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__013169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rule__FilterContainer__Group__0__Impl13197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__113228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__113231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__FilterContainer__Group__1__Impl13259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__213290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__213293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_2__0_in_rule__FilterContainer__Group__2__Impl13320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__313351 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__4_in_rule__FilterContainer__Group__313354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rule__FilterContainer__Group__3__Impl13382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__4__Impl_in_rule__FilterContainer__Group__413413 = new BitSet(new long[]{0xA000000000000000L,0x00000000000266C2L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__5_in_rule__FilterContainer__Group__413416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__FilterContainer__Group__4__Impl13444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__5__Impl_in_rule__FilterContainer__Group__513475 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__6_in_rule__FilterContainer__Group__513478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__SegmentsAssignment_5_in_rule__FilterContainer__Group__5__Impl13505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__6__Impl_in_rule__FilterContainer__Group__613535 = new BitSet(new long[]{0x0000050000000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__7_in_rule__FilterContainer__Group__613538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_6__0_in_rule__FilterContainer__Group__6__Impl13565 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__7__Impl_in_rule__FilterContainer__Group__713596 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__8_in_rule__FilterContainer__Group__713599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__FilterContainer__Group__7__Impl13627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__8__Impl_in_rule__FilterContainer__Group__813658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__FilterContainer__Group__8__Impl13686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_2__0__Impl_in_rule__FilterContainer__Group_2__013735 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_2__1_in_rule__FilterContainer__Group_2__013738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rule__FilterContainer__Group_2__0__Impl13766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_2__1__Impl_in_rule__FilterContainer__Group_2__113797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__CompositionTypeAssignment_2_1_in_rule__FilterContainer__Group_2__1__Impl13824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_6__0__Impl_in_rule__FilterContainer__Group_6__013858 = new BitSet(new long[]{0xA000000000000000L,0x00000000000266C2L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_6__1_in_rule__FilterContainer__Group_6__013861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__FilterContainer__Group_6__0__Impl13889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_6__1__Impl_in_rule__FilterContainer__Group_6__113920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__SegmentsAssignment_6_1_in_rule__FilterContainer__Group_6__1__Impl13947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__013981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__013984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__114042 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__114045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rule__IsEmpty__Group__1__Impl14073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__214104 = new BitSet(new long[]{0x4000010000000000L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__214107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__IsEmpty__Group__2__Impl14135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__314166 = new BitSet(new long[]{0x4000010000000000L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__4_in_rule__IsEmpty__Group__314169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group_3__0_in_rule__IsEmpty__Group__3__Impl14196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__4__Impl_in_rule__IsEmpty__Group__414227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__IsEmpty__Group__4__Impl14255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group_3__0__Impl_in_rule__IsEmpty__Group_3__014296 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group_3__1_in_rule__IsEmpty__Group_3__014299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__IsEmpty__Group_3__0__Impl14327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group_3__1__Impl_in_rule__IsEmpty__Group_3__114358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__TrueFalseSearchAssignment_3_1_in_rule__IsEmpty__Group_3__1__Impl14385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__014419 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__014422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_rule__OnType__Group__0__Impl14450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__114481 = new BitSet(new long[]{0x4000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__114484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnType__Group__1__Impl14512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__214543 = new BitSet(new long[]{0x4000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__214546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group_2__0_in_rule__OnType__Group__2__Impl14573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__314604 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__OnType__Group__4_in_rule__OnType__Group__314607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rule__OnType__Group__3__Impl14635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__4__Impl_in_rule__OnType__Group__414666 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__OnType__Group__5_in_rule__OnType__Group__414669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__TypeAssignment_4_in_rule__OnType__Group__4__Impl14696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__5__Impl_in_rule__OnType__Group__514726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__OnType__Group__5__Impl14754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group_2__0__Impl_in_rule__OnType__Group_2__014797 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnType__Group_2__1_in_rule__OnType__Group_2__014800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnType__Group_2__0__Impl14828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group_2__1__Impl_in_rule__OnType__Group_2__114859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__TrueFalseSearchAssignment_2_1_in_rule__OnType__Group_2__1__Impl14886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__014920 = new BitSet(new long[]{0x0000000000000040L,0x0000000000010000L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__014923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rule__EInt__Group__0__Impl14952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__114985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl15012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_3_215050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_3_3_115081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_2_115112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_415147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_615182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_2_115213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Move__SourceAssignment_415248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Move__DestinationAssignment_615283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_315318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_115353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_415384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SelectionVariable__NameAssignment_115415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_rule__SelectionVariable__ValueAssignment_415446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Path__AbsoluteAssignment_2_115477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_515508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_6_115539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment_315570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_315605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_215640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_2_215671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_2_3_115702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Selection__FromAssignment_415733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnName__NameAssignment_215764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnName__TrueFalseSearchAssignment_4_115795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnExtension__TrueFalseSearchAssignment_3_115826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_215857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_3_115888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnTime__TrueFalseSearchAssignment_2_115919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_415950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_615981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_816012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_1016043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_116074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnAttributes__TrueFalseSearchAssignment_3_116105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_516136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rule__OnTags__OnlyAssignment_016172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnTags__TrueFalseSearchAssignment_3_116211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_4_216242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_4_3_116273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_616304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnSize__TrueFalseSearchAssignment_2_116335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_416366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_616397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_816428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositionType_in_rule__FilterContainer__CompositionTypeAssignment_2_116459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_516490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_6_116521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__IsEmpty__TrueFalseSearchAssignment_3_116552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnType__TrueFalseSearchAssignment_2_116583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_416614 = new BitSet(new long[]{0x0000000000000002L});
    }


}