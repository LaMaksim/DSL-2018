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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'forced'", "'append'", "'carefully'", "'=='", "'<'", "'>'", "'<='", "'>='", "'min'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'modification'", "'cretion'", "'KB'", "'MB'", "'GB'", "'TB'", "'all of'", "'any of'", "'none'", "'Document'", "'Folder'", "';'", "'copy'", "'from'", "'to'", "'strategy:'", "'move'", "'delete'", "'='", "'view'", "'as'", "'[absolute:'", "']'", "'+'", "'path'", "'{$'", "'}'", "'select'", "'where'", "','", "'name'", "'keep'", "'extension'", "'in ['", "'time'", "'of'", "'attribute'", "'is'", "'['", "'in tags'", "'size'", "'{'", "'('", "')'", "'empty'", "'file'", "'-'", "'exclusively'"
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:377:1: ruleConcreteStep : ( ( rule__ConcreteStep__ValueAssignment ) ) ;
    public final void ruleConcreteStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:381:2: ( ( ( rule__ConcreteStep__ValueAssignment ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:382:1: ( ( rule__ConcreteStep__ValueAssignment ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:382:1: ( ( rule__ConcreteStep__ValueAssignment ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:383:1: ( rule__ConcreteStep__ValueAssignment )
            {
             before(grammarAccess.getConcreteStepAccess().getValueAssignment()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:384:1: ( rule__ConcreteStep__ValueAssignment )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:384:2: rule__ConcreteStep__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__ValueAssignment_in_ruleConcreteStep754);
            rule__ConcreteStep__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConcreteStepAccess().getValueAssignment()); 

            }


            }

        }
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
            case 39:
                {
                alt1=1;
                }
                break;
            case 43:
                {
                alt1=2;
                }
                break;
            case 44:
                {
                alt1=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            case 46:
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
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 51:
                {
                alt2=2;
                }
                break;
            case 52:
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
            case 57:
                {
                alt3=1;
                }
                break;
            case 59:
                {
                alt3=2;
                }
                break;
            case 61:
                {
                alt3=3;
                }
                break;
            case 63:
                {
                alt3=4;
                }
                break;
            case 65:
                {
                alt3=5;
                }
                break;
            case 67:
                {
                alt3=6;
                }
                break;
            case 68:
                {
                alt3=7;
                }
                break;
            case 71:
                {
                alt3=8;
                }
                break;
            case 72:
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1132:1: rule__Operator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1136:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
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
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1137:1: ( ( '==' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1137:1: ( ( '==' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1138:1: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1139:1: ( '==' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1139:3: '=='
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Operator__Alternatives2399); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1144:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1144:6: ( ( '<' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1145:1: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1146:1: ( '<' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1146:3: '<'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Operator__Alternatives2420); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1151:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1151:6: ( ( '>' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1152:1: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1153:1: ( '>' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1153:3: '>'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Operator__Alternatives2441); 

                    }

                     after(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1158:6: ( ( '<=' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1158:6: ( ( '<=' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1159:1: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1160:1: ( '<=' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1160:3: '<='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Operator__Alternatives2462); 

                    }

                     after(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1165:6: ( ( '>=' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1165:6: ( ( '>=' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1166:1: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getMore_equalEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1167:1: ( '>=' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1167:3: '>='
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1291:1: rule__CompositionType__Alternatives : ( ( ( 'all of' ) ) | ( ( 'any of' ) ) | ( ( 'none' ) ) );
    public final void rule__CompositionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1295:1: ( ( ( 'all of' ) ) | ( ( 'any of' ) ) | ( ( 'none' ) ) )
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
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1296:1: ( ( 'all of' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1296:1: ( ( 'all of' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1297:1: ( 'all of' )
                    {
                     before(grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1298:1: ( 'all of' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1298:3: 'all of'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__CompositionType__Alternatives2816); 

                    }

                     after(grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1303:6: ( ( 'any of' ) )
                    {
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1303:6: ( ( 'any of' ) )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1304:1: ( 'any of' )
                    {
                     before(grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1305:1: ( 'any of' )
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1305:3: 'any of'
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1391:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExecutionsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1395:1: ( ( ( rule__Model__ExecutionsAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1396:1: ( ( rule__Model__ExecutionsAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1396:1: ( ( rule__Model__ExecutionsAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1397:1: ( rule__Model__ExecutionsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1398:1: ( rule__Model__ExecutionsAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1398:2: rule__Model__ExecutionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_1_in_rule__Model__Group__1__Impl3039);
            rule__Model__ExecutionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExecutionsAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1408:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1412:1: ( rule__Model__Group__2__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1413:2: rule__Model__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23069);
            rule__Model__Group__2__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1419:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1423:1: ( ( ( rule__Model__Group_2__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1424:1: ( ( rule__Model__Group_2__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1424:1: ( ( rule__Model__Group_2__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1425:1: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1426:1: ( rule__Model__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1426:2: rule__Model__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl3096);
            	    rule__Model__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1442:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1446:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1447:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__03133);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__03136);
            rule__Model__Group_2__1();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1454:1: rule__Model__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1458:1: ( ( ';' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1459:1: ( ';' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1459:1: ( ';' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1460:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_2_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Model__Group_2__0__Impl3164); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1473:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1477:1: ( rule__Model__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1478:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__13195);
            rule__Model__Group_2__1__Impl();

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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1484:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__ExecutionsAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1488:1: ( ( ( rule__Model__ExecutionsAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1489:1: ( ( rule__Model__ExecutionsAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1489:1: ( ( rule__Model__ExecutionsAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1490:1: ( rule__Model__ExecutionsAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1491:1: ( rule__Model__ExecutionsAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1491:2: rule__Model__ExecutionsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_2_1_in_rule__Model__Group_2__1__Impl3222);
            rule__Model__ExecutionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExecutionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1505:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1509:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1510:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__03256);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__03259);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1517:1: rule__Copy__Group__0__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1521:1: ( ( 'copy' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1522:1: ( 'copy' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1522:1: ( 'copy' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1523:1: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Copy__Group__0__Impl3287); 
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1536:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1540:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1541:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__13318);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__13321);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1548:1: rule__Copy__Group__1__Impl : ( 'from' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1552:1: ( ( 'from' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1553:1: ( 'from' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1553:1: ( 'from' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1554:1: 'from'
            {
             before(grammarAccess.getCopyAccess().getFromKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Copy__Group__1__Impl3349); 
             after(grammarAccess.getCopyAccess().getFromKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1567:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1571:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1572:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__23380);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__23383);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1579:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__SourceAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1583:1: ( ( ( rule__Copy__SourceAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1584:1: ( ( rule__Copy__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1584:1: ( ( rule__Copy__SourceAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1585:1: ( rule__Copy__SourceAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1586:1: ( rule__Copy__SourceAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1586:2: rule__Copy__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__SourceAssignment_2_in_rule__Copy__Group__2__Impl3410);
            rule__Copy__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1596:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1600:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1601:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__33440);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__33443);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1608:1: rule__Copy__Group__3__Impl : ( 'to' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1612:1: ( ( 'to' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1613:1: ( 'to' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1613:1: ( 'to' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1614:1: 'to'
            {
             before(grammarAccess.getCopyAccess().getToKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Copy__Group__3__Impl3471); 
             after(grammarAccess.getCopyAccess().getToKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1627:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1631:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1632:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__43502);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__43505);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1639:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__DestinationAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1643:1: ( ( ( rule__Copy__DestinationAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1644:1: ( ( rule__Copy__DestinationAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1644:1: ( ( rule__Copy__DestinationAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1645:1: ( rule__Copy__DestinationAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getDestinationAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1646:1: ( rule__Copy__DestinationAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1646:2: rule__Copy__DestinationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__DestinationAssignment_4_in_rule__Copy__Group__4__Impl3532);
            rule__Copy__DestinationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getDestinationAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1656:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1660:1: ( rule__Copy__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1661:2: rule__Copy__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__53562);
            rule__Copy__Group__5__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1667:1: rule__Copy__Group__5__Impl : ( ( rule__Copy__Group_5__0 )? ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1671:1: ( ( ( rule__Copy__Group_5__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1672:1: ( ( rule__Copy__Group_5__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1672:1: ( ( rule__Copy__Group_5__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1673:1: ( rule__Copy__Group_5__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1674:1: ( rule__Copy__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1674:2: rule__Copy__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__0_in_rule__Copy__Group__5__Impl3589);
                    rule__Copy__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCopyAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Copy__Group_5__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1696:1: rule__Copy__Group_5__0 : rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1 ;
    public final void rule__Copy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1700:1: ( rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1701:2: rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__0__Impl_in_rule__Copy__Group_5__03632);
            rule__Copy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__1_in_rule__Copy__Group_5__03635);
            rule__Copy__Group_5__1();

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
    // $ANTLR end "rule__Copy__Group_5__0"


    // $ANTLR start "rule__Copy__Group_5__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1708:1: rule__Copy__Group_5__0__Impl : ( 'strategy:' ) ;
    public final void rule__Copy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1712:1: ( ( 'strategy:' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1713:1: ( 'strategy:' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1713:1: ( 'strategy:' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1714:1: 'strategy:'
            {
             before(grammarAccess.getCopyAccess().getStrategyKeyword_5_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Copy__Group_5__0__Impl3663); 
             after(grammarAccess.getCopyAccess().getStrategyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_5__0__Impl"


    // $ANTLR start "rule__Copy__Group_5__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1727:1: rule__Copy__Group_5__1 : rule__Copy__Group_5__1__Impl ;
    public final void rule__Copy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1731:1: ( rule__Copy__Group_5__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1732:2: rule__Copy__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__1__Impl_in_rule__Copy__Group_5__13694);
            rule__Copy__Group_5__1__Impl();

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
    // $ANTLR end "rule__Copy__Group_5__1"


    // $ANTLR start "rule__Copy__Group_5__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1738:1: rule__Copy__Group_5__1__Impl : ( ( rule__Copy__StrategyAssignment_5_1 ) ) ;
    public final void rule__Copy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1742:1: ( ( ( rule__Copy__StrategyAssignment_5_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1743:1: ( ( rule__Copy__StrategyAssignment_5_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1743:1: ( ( rule__Copy__StrategyAssignment_5_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1744:1: ( rule__Copy__StrategyAssignment_5_1 )
            {
             before(grammarAccess.getCopyAccess().getStrategyAssignment_5_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1745:1: ( rule__Copy__StrategyAssignment_5_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1745:2: rule__Copy__StrategyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__StrategyAssignment_5_1_in_rule__Copy__Group_5__1__Impl3721);
            rule__Copy__StrategyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getStrategyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group_5__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1759:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1763:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1764:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__03755);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__03758);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1771:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1775:1: ( ( 'move' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1776:1: ( 'move' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1776:1: ( 'move' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1777:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Move__Group__0__Impl3786); 
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1790:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1794:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1795:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__13817);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__13820);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1802:1: rule__Move__Group__1__Impl : ( 'from' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1806:1: ( ( 'from' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1807:1: ( 'from' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1807:1: ( 'from' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1808:1: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Move__Group__1__Impl3848); 
             after(grammarAccess.getMoveAccess().getFromKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1821:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1825:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1826:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__23879);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__23882);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1833:1: rule__Move__Group__2__Impl : ( ( rule__Move__SourceAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1837:1: ( ( ( rule__Move__SourceAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1838:1: ( ( rule__Move__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1838:1: ( ( rule__Move__SourceAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1839:1: ( rule__Move__SourceAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1840:1: ( rule__Move__SourceAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1840:2: rule__Move__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SourceAssignment_2_in_rule__Move__Group__2__Impl3909);
            rule__Move__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1850:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1854:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1855:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__33939);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__33942);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1862:1: rule__Move__Group__3__Impl : ( 'to' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1866:1: ( ( 'to' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1867:1: ( 'to' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1867:1: ( 'to' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1868:1: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Move__Group__3__Impl3970); 
             after(grammarAccess.getMoveAccess().getToKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1881:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1885:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1886:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__44001);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5_in_rule__Move__Group__44004);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1893:1: rule__Move__Group__4__Impl : ( ( rule__Move__DestinationAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1897:1: ( ( ( rule__Move__DestinationAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1898:1: ( ( rule__Move__DestinationAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1898:1: ( ( rule__Move__DestinationAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1899:1: ( rule__Move__DestinationAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getDestinationAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1900:1: ( rule__Move__DestinationAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1900:2: rule__Move__DestinationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__DestinationAssignment_4_in_rule__Move__Group__4__Impl4031);
            rule__Move__DestinationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDestinationAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1910:1: rule__Move__Group__5 : rule__Move__Group__5__Impl ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1914:1: ( rule__Move__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1915:2: rule__Move__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__54061);
            rule__Move__Group__5__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1921:1: rule__Move__Group__5__Impl : ( ( rule__Move__Group_5__0 )? ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1925:1: ( ( ( rule__Move__Group_5__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1926:1: ( ( rule__Move__Group_5__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1926:1: ( ( rule__Move__Group_5__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1927:1: ( rule__Move__Group_5__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1928:1: ( rule__Move__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1928:2: rule__Move__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__0_in_rule__Move__Group__5__Impl4088);
                    rule__Move__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Move__Group_5__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1950:1: rule__Move__Group_5__0 : rule__Move__Group_5__0__Impl rule__Move__Group_5__1 ;
    public final void rule__Move__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1954:1: ( rule__Move__Group_5__0__Impl rule__Move__Group_5__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1955:2: rule__Move__Group_5__0__Impl rule__Move__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__0__Impl_in_rule__Move__Group_5__04131);
            rule__Move__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__1_in_rule__Move__Group_5__04134);
            rule__Move__Group_5__1();

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
    // $ANTLR end "rule__Move__Group_5__0"


    // $ANTLR start "rule__Move__Group_5__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1962:1: rule__Move__Group_5__0__Impl : ( 'strategy:' ) ;
    public final void rule__Move__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1966:1: ( ( 'strategy:' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1967:1: ( 'strategy:' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1967:1: ( 'strategy:' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1968:1: 'strategy:'
            {
             before(grammarAccess.getMoveAccess().getStrategyKeyword_5_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Move__Group_5__0__Impl4162); 
             after(grammarAccess.getMoveAccess().getStrategyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_5__0__Impl"


    // $ANTLR start "rule__Move__Group_5__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1981:1: rule__Move__Group_5__1 : rule__Move__Group_5__1__Impl ;
    public final void rule__Move__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1985:1: ( rule__Move__Group_5__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1986:2: rule__Move__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__1__Impl_in_rule__Move__Group_5__14193);
            rule__Move__Group_5__1__Impl();

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
    // $ANTLR end "rule__Move__Group_5__1"


    // $ANTLR start "rule__Move__Group_5__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1992:1: rule__Move__Group_5__1__Impl : ( ( rule__Move__StrategyAssignment_5_1 ) ) ;
    public final void rule__Move__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1996:1: ( ( ( rule__Move__StrategyAssignment_5_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1997:1: ( ( rule__Move__StrategyAssignment_5_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1997:1: ( ( rule__Move__StrategyAssignment_5_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1998:1: ( rule__Move__StrategyAssignment_5_1 )
            {
             before(grammarAccess.getMoveAccess().getStrategyAssignment_5_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1999:1: ( rule__Move__StrategyAssignment_5_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:1999:2: rule__Move__StrategyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__StrategyAssignment_5_1_in_rule__Move__Group_5__1__Impl4220);
            rule__Move__StrategyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getStrategyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_5__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2013:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2017:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2018:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__04254);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__04257);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2025:1: rule__Delete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2029:1: ( ( 'delete' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2030:1: ( 'delete' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2030:1: ( 'delete' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2031:1: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Delete__Group__0__Impl4285); 
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2044:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2048:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2049:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__14316);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__14319);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2056:1: rule__Delete__Group__1__Impl : ( 'from' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2060:1: ( ( 'from' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2061:1: ( 'from' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2061:1: ( 'from' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2062:1: 'from'
            {
             before(grammarAccess.getDeleteAccess().getFromKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Delete__Group__1__Impl4347); 
             after(grammarAccess.getDeleteAccess().getFromKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2075:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2079:1: ( rule__Delete__Group__2__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2080:2: rule__Delete__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__24378);
            rule__Delete__Group__2__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2086:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__SourceAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2090:1: ( ( ( rule__Delete__SourceAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2091:1: ( ( rule__Delete__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2091:1: ( ( rule__Delete__SourceAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2092:1: ( rule__Delete__SourceAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2093:1: ( rule__Delete__SourceAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2093:2: rule__Delete__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__SourceAssignment_2_in_rule__Delete__Group__2__Impl4405);
            rule__Delete__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getSourceAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PathVariable__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2109:1: rule__PathVariable__Group__0 : rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 ;
    public final void rule__PathVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2113:1: ( rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2114:2: rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__04441);
            rule__PathVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__04444);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2121:1: rule__PathVariable__Group__0__Impl : ( ( rule__PathVariable__NameAssignment_0 ) ) ;
    public final void rule__PathVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2125:1: ( ( ( rule__PathVariable__NameAssignment_0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2126:1: ( ( rule__PathVariable__NameAssignment_0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2126:1: ( ( rule__PathVariable__NameAssignment_0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2127:1: ( rule__PathVariable__NameAssignment_0 )
            {
             before(grammarAccess.getPathVariableAccess().getNameAssignment_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2128:1: ( rule__PathVariable__NameAssignment_0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2128:2: rule__PathVariable__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__NameAssignment_0_in_rule__PathVariable__Group__0__Impl4471);
            rule__PathVariable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathVariableAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2138:1: rule__PathVariable__Group__1 : rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 ;
    public final void rule__PathVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2142:1: ( rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2143:2: rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__14501);
            rule__PathVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__14504);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2150:1: rule__PathVariable__Group__1__Impl : ( '=' ) ;
    public final void rule__PathVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2154:1: ( ( '=' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2155:1: ( '=' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2155:1: ( '=' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2156:1: '='
            {
             before(grammarAccess.getPathVariableAccess().getEqualsSignKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__PathVariable__Group__1__Impl4532); 
             after(grammarAccess.getPathVariableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2169:1: rule__PathVariable__Group__2 : rule__PathVariable__Group__2__Impl ;
    public final void rule__PathVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2173:1: ( rule__PathVariable__Group__2__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2174:2: rule__PathVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__24563);
            rule__PathVariable__Group__2__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2180:1: rule__PathVariable__Group__2__Impl : ( ( rule__PathVariable__ValueAssignment_2 ) ) ;
    public final void rule__PathVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2184:1: ( ( ( rule__PathVariable__ValueAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2185:1: ( ( rule__PathVariable__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2185:1: ( ( rule__PathVariable__ValueAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2186:1: ( rule__PathVariable__ValueAssignment_2 )
            {
             before(grammarAccess.getPathVariableAccess().getValueAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2187:1: ( rule__PathVariable__ValueAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2187:2: rule__PathVariable__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__ValueAssignment_2_in_rule__PathVariable__Group__2__Impl4590);
            rule__PathVariable__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPathVariableAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SelectionVariable__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2203:1: rule__SelectionVariable__Group__0 : rule__SelectionVariable__Group__0__Impl rule__SelectionVariable__Group__1 ;
    public final void rule__SelectionVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2207:1: ( rule__SelectionVariable__Group__0__Impl rule__SelectionVariable__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2208:2: rule__SelectionVariable__Group__0__Impl rule__SelectionVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__0__Impl_in_rule__SelectionVariable__Group__04626);
            rule__SelectionVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__1_in_rule__SelectionVariable__Group__04629);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2215:1: rule__SelectionVariable__Group__0__Impl : ( 'view' ) ;
    public final void rule__SelectionVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2219:1: ( ( 'view' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2220:1: ( 'view' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2220:1: ( 'view' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2221:1: 'view'
            {
             before(grammarAccess.getSelectionVariableAccess().getViewKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__SelectionVariable__Group__0__Impl4657); 
             after(grammarAccess.getSelectionVariableAccess().getViewKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2234:1: rule__SelectionVariable__Group__1 : rule__SelectionVariable__Group__1__Impl rule__SelectionVariable__Group__2 ;
    public final void rule__SelectionVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2238:1: ( rule__SelectionVariable__Group__1__Impl rule__SelectionVariable__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2239:2: rule__SelectionVariable__Group__1__Impl rule__SelectionVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__1__Impl_in_rule__SelectionVariable__Group__14688);
            rule__SelectionVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__2_in_rule__SelectionVariable__Group__14691);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2246:1: rule__SelectionVariable__Group__1__Impl : ( ( rule__SelectionVariable__NameAssignment_1 ) ) ;
    public final void rule__SelectionVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2250:1: ( ( ( rule__SelectionVariable__NameAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2251:1: ( ( rule__SelectionVariable__NameAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2251:1: ( ( rule__SelectionVariable__NameAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2252:1: ( rule__SelectionVariable__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionVariableAccess().getNameAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2253:1: ( rule__SelectionVariable__NameAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2253:2: rule__SelectionVariable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__NameAssignment_1_in_rule__SelectionVariable__Group__1__Impl4718);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2263:1: rule__SelectionVariable__Group__2 : rule__SelectionVariable__Group__2__Impl rule__SelectionVariable__Group__3 ;
    public final void rule__SelectionVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2267:1: ( rule__SelectionVariable__Group__2__Impl rule__SelectionVariable__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2268:2: rule__SelectionVariable__Group__2__Impl rule__SelectionVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__2__Impl_in_rule__SelectionVariable__Group__24748);
            rule__SelectionVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__3_in_rule__SelectionVariable__Group__24751);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2275:1: rule__SelectionVariable__Group__2__Impl : ( 'as' ) ;
    public final void rule__SelectionVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2279:1: ( ( 'as' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2280:1: ( 'as' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2280:1: ( 'as' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2281:1: 'as'
            {
             before(grammarAccess.getSelectionVariableAccess().getAsKeyword_2()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__SelectionVariable__Group__2__Impl4779); 
             after(grammarAccess.getSelectionVariableAccess().getAsKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2294:1: rule__SelectionVariable__Group__3 : rule__SelectionVariable__Group__3__Impl ;
    public final void rule__SelectionVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2298:1: ( rule__SelectionVariable__Group__3__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2299:2: rule__SelectionVariable__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__Group__3__Impl_in_rule__SelectionVariable__Group__34810);
            rule__SelectionVariable__Group__3__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2305:1: rule__SelectionVariable__Group__3__Impl : ( ( rule__SelectionVariable__ValueAssignment_3 ) ) ;
    public final void rule__SelectionVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2309:1: ( ( ( rule__SelectionVariable__ValueAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2310:1: ( ( rule__SelectionVariable__ValueAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2310:1: ( ( rule__SelectionVariable__ValueAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2311:1: ( rule__SelectionVariable__ValueAssignment_3 )
            {
             before(grammarAccess.getSelectionVariableAccess().getValueAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2312:1: ( rule__SelectionVariable__ValueAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2312:2: rule__SelectionVariable__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionVariable__ValueAssignment_3_in_rule__SelectionVariable__Group__3__Impl4837);
            rule__SelectionVariable__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectionVariableAccess().getValueAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Path__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2330:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2334:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2335:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04875);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04878);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2342:1: rule__Path__Group__0__Impl : ( ( rule__Path__Group_0__0 )? ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2346:1: ( ( ( rule__Path__Group_0__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2347:1: ( ( rule__Path__Group_0__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2347:1: ( ( rule__Path__Group_0__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2348:1: ( rule__Path__Group_0__0 )?
            {
             before(grammarAccess.getPathAccess().getGroup_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2349:1: ( rule__Path__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2349:2: rule__Path__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Path__Group_0__0_in_rule__Path__Group__0__Impl4905);
                    rule__Path__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathAccess().getGroup_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2359:1: rule__Path__Group__1 : rule__Path__Group__1__Impl rule__Path__Group__2 ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2363:1: ( rule__Path__Group__1__Impl rule__Path__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2364:2: rule__Path__Group__1__Impl rule__Path__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14936);
            rule__Path__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14939);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2371:1: rule__Path__Group__1__Impl : ( ( rule__Path__StepsAssignment_1 ) ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2375:1: ( ( ( rule__Path__StepsAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2376:1: ( ( rule__Path__StepsAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2376:1: ( ( rule__Path__StepsAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2377:1: ( rule__Path__StepsAssignment_1 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2378:1: ( rule__Path__StepsAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2378:2: rule__Path__StepsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_1_in_rule__Path__Group__1__Impl4966);
            rule__Path__StepsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getStepsAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2388:1: rule__Path__Group__2 : rule__Path__Group__2__Impl ;
    public final void rule__Path__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2392:1: ( rule__Path__Group__2__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2393:2: rule__Path__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__24996);
            rule__Path__Group__2__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2399:1: rule__Path__Group__2__Impl : ( ( rule__Path__Group_2__0 )* ) ;
    public final void rule__Path__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2403:1: ( ( ( rule__Path__Group_2__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2404:1: ( ( rule__Path__Group_2__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2404:1: ( ( rule__Path__Group_2__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2405:1: ( rule__Path__Group_2__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2406:1: ( rule__Path__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==50) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2406:2: rule__Path__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__0_in_rule__Path__Group__2__Impl5023);
            	    rule__Path__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

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


    // $ANTLR start "rule__Path__Group_0__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2422:1: rule__Path__Group_0__0 : rule__Path__Group_0__0__Impl rule__Path__Group_0__1 ;
    public final void rule__Path__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2426:1: ( rule__Path__Group_0__0__Impl rule__Path__Group_0__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2427:2: rule__Path__Group_0__0__Impl rule__Path__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_0__0__Impl_in_rule__Path__Group_0__05060);
            rule__Path__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_0__1_in_rule__Path__Group_0__05063);
            rule__Path__Group_0__1();

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
    // $ANTLR end "rule__Path__Group_0__0"


    // $ANTLR start "rule__Path__Group_0__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2434:1: rule__Path__Group_0__0__Impl : ( '[absolute:' ) ;
    public final void rule__Path__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2438:1: ( ( '[absolute:' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2439:1: ( '[absolute:' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2439:1: ( '[absolute:' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2440:1: '[absolute:'
            {
             before(grammarAccess.getPathAccess().getAbsoluteKeyword_0_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Path__Group_0__0__Impl5091); 
             after(grammarAccess.getPathAccess().getAbsoluteKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_0__0__Impl"


    // $ANTLR start "rule__Path__Group_0__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2453:1: rule__Path__Group_0__1 : rule__Path__Group_0__1__Impl rule__Path__Group_0__2 ;
    public final void rule__Path__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2457:1: ( rule__Path__Group_0__1__Impl rule__Path__Group_0__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2458:2: rule__Path__Group_0__1__Impl rule__Path__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_0__1__Impl_in_rule__Path__Group_0__15122);
            rule__Path__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_0__2_in_rule__Path__Group_0__15125);
            rule__Path__Group_0__2();

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
    // $ANTLR end "rule__Path__Group_0__1"


    // $ANTLR start "rule__Path__Group_0__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2465:1: rule__Path__Group_0__1__Impl : ( ( rule__Path__AbsoluteAssignment_0_1 ) ) ;
    public final void rule__Path__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2469:1: ( ( ( rule__Path__AbsoluteAssignment_0_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2470:1: ( ( rule__Path__AbsoluteAssignment_0_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2470:1: ( ( rule__Path__AbsoluteAssignment_0_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2471:1: ( rule__Path__AbsoluteAssignment_0_1 )
            {
             before(grammarAccess.getPathAccess().getAbsoluteAssignment_0_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2472:1: ( rule__Path__AbsoluteAssignment_0_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2472:2: rule__Path__AbsoluteAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__AbsoluteAssignment_0_1_in_rule__Path__Group_0__1__Impl5152);
            rule__Path__AbsoluteAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAbsoluteAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_0__1__Impl"


    // $ANTLR start "rule__Path__Group_0__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2482:1: rule__Path__Group_0__2 : rule__Path__Group_0__2__Impl ;
    public final void rule__Path__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2486:1: ( rule__Path__Group_0__2__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2487:2: rule__Path__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_0__2__Impl_in_rule__Path__Group_0__25182);
            rule__Path__Group_0__2__Impl();

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
    // $ANTLR end "rule__Path__Group_0__2"


    // $ANTLR start "rule__Path__Group_0__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2493:1: rule__Path__Group_0__2__Impl : ( ']' ) ;
    public final void rule__Path__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2497:1: ( ( ']' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2498:1: ( ']' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2498:1: ( ']' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2499:1: ']'
            {
             before(grammarAccess.getPathAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Path__Group_0__2__Impl5210); 
             after(grammarAccess.getPathAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_0__2__Impl"


    // $ANTLR start "rule__Path__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2518:1: rule__Path__Group_2__0 : rule__Path__Group_2__0__Impl rule__Path__Group_2__1 ;
    public final void rule__Path__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2522:1: ( rule__Path__Group_2__0__Impl rule__Path__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2523:2: rule__Path__Group_2__0__Impl rule__Path__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__0__Impl_in_rule__Path__Group_2__05247);
            rule__Path__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__1_in_rule__Path__Group_2__05250);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2530:1: rule__Path__Group_2__0__Impl : ( '+' ) ;
    public final void rule__Path__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2534:1: ( ( '+' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2535:1: ( '+' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2535:1: ( '+' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2536:1: '+'
            {
             before(grammarAccess.getPathAccess().getPlusSignKeyword_2_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Path__Group_2__0__Impl5278); 
             after(grammarAccess.getPathAccess().getPlusSignKeyword_2_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2549:1: rule__Path__Group_2__1 : rule__Path__Group_2__1__Impl ;
    public final void rule__Path__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2553:1: ( rule__Path__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2554:2: rule__Path__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_2__1__Impl_in_rule__Path__Group_2__15309);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2560:1: rule__Path__Group_2__1__Impl : ( ( rule__Path__StepsAssignment_2_1 ) ) ;
    public final void rule__Path__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2564:1: ( ( ( rule__Path__StepsAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2565:1: ( ( rule__Path__StepsAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2565:1: ( ( rule__Path__StepsAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2566:1: ( rule__Path__StepsAssignment_2_1 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2567:1: ( rule__Path__StepsAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2567:2: rule__Path__StepsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_2_1_in_rule__Path__Group_2__1__Impl5336);
            rule__Path__StepsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getStepsAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__VariableStep__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2581:1: rule__VariableStep__Group__0 : rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 ;
    public final void rule__VariableStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2585:1: ( rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2586:2: rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__05370);
            rule__VariableStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__05373);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2593:1: rule__VariableStep__Group__0__Impl : ( 'path' ) ;
    public final void rule__VariableStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2597:1: ( ( 'path' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2598:1: ( 'path' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2598:1: ( 'path' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2599:1: 'path'
            {
             before(grammarAccess.getVariableStepAccess().getPathKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__VariableStep__Group__0__Impl5401); 
             after(grammarAccess.getVariableStepAccess().getPathKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2612:1: rule__VariableStep__Group__1 : rule__VariableStep__Group__1__Impl ;
    public final void rule__VariableStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2616:1: ( rule__VariableStep__Group__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2617:2: rule__VariableStep__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__15432);
            rule__VariableStep__Group__1__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2623:1: rule__VariableStep__Group__1__Impl : ( ( rule__VariableStep__ValueAssignment_1 ) ) ;
    public final void rule__VariableStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2627:1: ( ( ( rule__VariableStep__ValueAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2628:1: ( ( rule__VariableStep__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2628:1: ( ( rule__VariableStep__ValueAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2629:1: ( rule__VariableStep__ValueAssignment_1 )
            {
             before(grammarAccess.getVariableStepAccess().getValueAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2630:1: ( rule__VariableStep__ValueAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2630:2: rule__VariableStep__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__ValueAssignment_1_in_rule__VariableStep__Group__1__Impl5459);
            rule__VariableStep__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableStepAccess().getValueAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParametrizedStep__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2644:1: rule__ParametrizedStep__Group__0 : rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 ;
    public final void rule__ParametrizedStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2648:1: ( rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2649:2: rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__05493);
            rule__ParametrizedStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__05496);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2656:1: rule__ParametrizedStep__Group__0__Impl : ( () ) ;
    public final void rule__ParametrizedStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2660:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2661:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2661:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2662:1: ()
            {
             before(grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2663:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2665:1: 
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2675:1: rule__ParametrizedStep__Group__1 : rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 ;
    public final void rule__ParametrizedStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2679:1: ( rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2680:2: rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__15554);
            rule__ParametrizedStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__15557);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2687:1: rule__ParametrizedStep__Group__1__Impl : ( '{$' ) ;
    public final void rule__ParametrizedStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2691:1: ( ( '{$' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2692:1: ( '{$' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2692:1: ( '{$' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2693:1: '{$'
            {
             before(grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__ParametrizedStep__Group__1__Impl5585); 
             after(grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2706:1: rule__ParametrizedStep__Group__2 : rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3 ;
    public final void rule__ParametrizedStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2710:1: ( rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2711:2: rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__25616);
            rule__ParametrizedStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__3_in_rule__ParametrizedStep__Group__25619);
            rule__ParametrizedStep__Group__3();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2718:1: rule__ParametrizedStep__Group__2__Impl : ( ( rule__ParametrizedStep__NameAssignment_2 ) ) ;
    public final void rule__ParametrizedStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2722:1: ( ( ( rule__ParametrizedStep__NameAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2723:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2723:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2724:1: ( rule__ParametrizedStep__NameAssignment_2 )
            {
             before(grammarAccess.getParametrizedStepAccess().getNameAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2725:1: ( rule__ParametrizedStep__NameAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2725:2: rule__ParametrizedStep__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl5646);
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


    // $ANTLR start "rule__ParametrizedStep__Group__3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2735:1: rule__ParametrizedStep__Group__3 : rule__ParametrizedStep__Group__3__Impl ;
    public final void rule__ParametrizedStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2739:1: ( rule__ParametrizedStep__Group__3__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2740:2: rule__ParametrizedStep__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__3__Impl_in_rule__ParametrizedStep__Group__35676);
            rule__ParametrizedStep__Group__3__Impl();

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
    // $ANTLR end "rule__ParametrizedStep__Group__3"


    // $ANTLR start "rule__ParametrizedStep__Group__3__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2746:1: rule__ParametrizedStep__Group__3__Impl : ( '}' ) ;
    public final void rule__ParametrizedStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2750:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2751:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2751:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2752:1: '}'
            {
             before(grammarAccess.getParametrizedStepAccess().getRightCurlyBracketKeyword_3()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__ParametrizedStep__Group__3__Impl5704); 
             after(grammarAccess.getParametrizedStepAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedStep__Group__3__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2773:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2777:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2778:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__05743);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__05746);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2785:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2789:1: ( ( 'select' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2790:1: ( 'select' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2790:1: ( 'select' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2791:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Selection__Group__0__Impl5774); 
             after(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2804:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2808:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2809:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__15805);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__15808);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2816:1: rule__Selection__Group__1__Impl : ( 'from' ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2820:1: ( ( 'from' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2821:1: ( 'from' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2821:1: ( 'from' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2822:1: 'from'
            {
             before(grammarAccess.getSelectionAccess().getFromKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Selection__Group__1__Impl5836); 
             after(grammarAccess.getSelectionAccess().getFromKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2835:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2839:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2840:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__25867);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__25870);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2847:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__FromAssignment_2 ) ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2851:1: ( ( ( rule__Selection__FromAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2852:1: ( ( rule__Selection__FromAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2852:1: ( ( rule__Selection__FromAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2853:1: ( rule__Selection__FromAssignment_2 )
            {
             before(grammarAccess.getSelectionAccess().getFromAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2854:1: ( rule__Selection__FromAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2854:2: rule__Selection__FromAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__FromAssignment_2_in_rule__Selection__Group__2__Impl5897);
            rule__Selection__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getFromAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2864:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2868:1: ( rule__Selection__Group__3__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2869:2: rule__Selection__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__35927);
            rule__Selection__Group__3__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2875:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__Group_3__0 )? ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2879:1: ( ( ( rule__Selection__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2880:1: ( ( rule__Selection__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2880:1: ( ( rule__Selection__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2881:1: ( rule__Selection__Group_3__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2882:1: ( rule__Selection__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==55) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2882:2: rule__Selection__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3__0_in_rule__Selection__Group__3__Impl5954);
                    rule__Selection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Selection__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2900:1: rule__Selection__Group_3__0 : rule__Selection__Group_3__0__Impl rule__Selection__Group_3__1 ;
    public final void rule__Selection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2904:1: ( rule__Selection__Group_3__0__Impl rule__Selection__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2905:2: rule__Selection__Group_3__0__Impl rule__Selection__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3__0__Impl_in_rule__Selection__Group_3__05993);
            rule__Selection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3__1_in_rule__Selection__Group_3__05996);
            rule__Selection__Group_3__1();

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
    // $ANTLR end "rule__Selection__Group_3__0"


    // $ANTLR start "rule__Selection__Group_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2912:1: rule__Selection__Group_3__0__Impl : ( 'where' ) ;
    public final void rule__Selection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2916:1: ( ( 'where' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2917:1: ( 'where' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2917:1: ( 'where' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2918:1: 'where'
            {
             before(grammarAccess.getSelectionAccess().getWhereKeyword_3_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Selection__Group_3__0__Impl6024); 
             after(grammarAccess.getSelectionAccess().getWhereKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_3__0__Impl"


    // $ANTLR start "rule__Selection__Group_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2931:1: rule__Selection__Group_3__1 : rule__Selection__Group_3__1__Impl rule__Selection__Group_3__2 ;
    public final void rule__Selection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2935:1: ( rule__Selection__Group_3__1__Impl rule__Selection__Group_3__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2936:2: rule__Selection__Group_3__1__Impl rule__Selection__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3__1__Impl_in_rule__Selection__Group_3__16055);
            rule__Selection__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3__2_in_rule__Selection__Group_3__16058);
            rule__Selection__Group_3__2();

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
    // $ANTLR end "rule__Selection__Group_3__1"


    // $ANTLR start "rule__Selection__Group_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2943:1: rule__Selection__Group_3__1__Impl : ( ( rule__Selection__WhereAssignment_3_1 ) ) ;
    public final void rule__Selection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2947:1: ( ( ( rule__Selection__WhereAssignment_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2948:1: ( ( rule__Selection__WhereAssignment_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2948:1: ( ( rule__Selection__WhereAssignment_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2949:1: ( rule__Selection__WhereAssignment_3_1 )
            {
             before(grammarAccess.getSelectionAccess().getWhereAssignment_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2950:1: ( rule__Selection__WhereAssignment_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2950:2: rule__Selection__WhereAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__WhereAssignment_3_1_in_rule__Selection__Group_3__1__Impl6085);
            rule__Selection__WhereAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getWhereAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_3__1__Impl"


    // $ANTLR start "rule__Selection__Group_3__2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2960:1: rule__Selection__Group_3__2 : rule__Selection__Group_3__2__Impl ;
    public final void rule__Selection__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2964:1: ( rule__Selection__Group_3__2__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2965:2: rule__Selection__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3__2__Impl_in_rule__Selection__Group_3__26115);
            rule__Selection__Group_3__2__Impl();

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
    // $ANTLR end "rule__Selection__Group_3__2"


    // $ANTLR start "rule__Selection__Group_3__2__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2971:1: rule__Selection__Group_3__2__Impl : ( ( rule__Selection__Group_3_2__0 )* ) ;
    public final void rule__Selection__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2975:1: ( ( ( rule__Selection__Group_3_2__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2976:1: ( ( rule__Selection__Group_3_2__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2976:1: ( ( rule__Selection__Group_3_2__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2977:1: ( rule__Selection__Group_3_2__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_3_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2978:1: ( rule__Selection__Group_3_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==56) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2978:2: rule__Selection__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3_2__0_in_rule__Selection__Group_3__2__Impl6142);
            	    rule__Selection__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_3__2__Impl"


    // $ANTLR start "rule__Selection__Group_3_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2994:1: rule__Selection__Group_3_2__0 : rule__Selection__Group_3_2__0__Impl rule__Selection__Group_3_2__1 ;
    public final void rule__Selection__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2998:1: ( rule__Selection__Group_3_2__0__Impl rule__Selection__Group_3_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:2999:2: rule__Selection__Group_3_2__0__Impl rule__Selection__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3_2__0__Impl_in_rule__Selection__Group_3_2__06179);
            rule__Selection__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3_2__1_in_rule__Selection__Group_3_2__06182);
            rule__Selection__Group_3_2__1();

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
    // $ANTLR end "rule__Selection__Group_3_2__0"


    // $ANTLR start "rule__Selection__Group_3_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3006:1: rule__Selection__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3010:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3011:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3011:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3012:1: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_3_2_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Selection__Group_3_2__0__Impl6210); 
             after(grammarAccess.getSelectionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_3_2__0__Impl"


    // $ANTLR start "rule__Selection__Group_3_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3025:1: rule__Selection__Group_3_2__1 : rule__Selection__Group_3_2__1__Impl ;
    public final void rule__Selection__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3029:1: ( rule__Selection__Group_3_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3030:2: rule__Selection__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_3_2__1__Impl_in_rule__Selection__Group_3_2__16241);
            rule__Selection__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Selection__Group_3_2__1"


    // $ANTLR start "rule__Selection__Group_3_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3036:1: rule__Selection__Group_3_2__1__Impl : ( ( rule__Selection__WhereAssignment_3_2_1 ) ) ;
    public final void rule__Selection__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3040:1: ( ( ( rule__Selection__WhereAssignment_3_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3041:1: ( ( rule__Selection__WhereAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3041:1: ( ( rule__Selection__WhereAssignment_3_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3042:1: ( rule__Selection__WhereAssignment_3_2_1 )
            {
             before(grammarAccess.getSelectionAccess().getWhereAssignment_3_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3043:1: ( rule__Selection__WhereAssignment_3_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3043:2: rule__Selection__WhereAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__WhereAssignment_3_2_1_in_rule__Selection__Group_3_2__1__Impl6268);
            rule__Selection__WhereAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getWhereAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_3_2__1__Impl"


    // $ANTLR start "rule__OnName__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3057:1: rule__OnName__Group__0 : rule__OnName__Group__0__Impl rule__OnName__Group__1 ;
    public final void rule__OnName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3061:1: ( rule__OnName__Group__0__Impl rule__OnName__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3062:2: rule__OnName__Group__0__Impl rule__OnName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__06302);
            rule__OnName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__06305);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3069:1: rule__OnName__Group__0__Impl : ( () ) ;
    public final void rule__OnName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3073:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3074:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3074:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3075:1: ()
            {
             before(grammarAccess.getOnNameAccess().getOnNameAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3076:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3078:1: 
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3088:1: rule__OnName__Group__1 : rule__OnName__Group__1__Impl rule__OnName__Group__2 ;
    public final void rule__OnName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3092:1: ( rule__OnName__Group__1__Impl rule__OnName__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3093:2: rule__OnName__Group__1__Impl rule__OnName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__16363);
            rule__OnName__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__16366);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3100:1: rule__OnName__Group__1__Impl : ( 'name' ) ;
    public final void rule__OnName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3104:1: ( ( 'name' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3105:1: ( 'name' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3105:1: ( 'name' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3106:1: 'name'
            {
             before(grammarAccess.getOnNameAccess().getNameKeyword_1()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__OnName__Group__1__Impl6394); 
             after(grammarAccess.getOnNameAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3119:1: rule__OnName__Group__2 : rule__OnName__Group__2__Impl rule__OnName__Group__3 ;
    public final void rule__OnName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3123:1: ( rule__OnName__Group__2__Impl rule__OnName__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3124:2: rule__OnName__Group__2__Impl rule__OnName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__26425);
            rule__OnName__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__26428);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3131:1: rule__OnName__Group__2__Impl : ( '=' ) ;
    public final void rule__OnName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3135:1: ( ( '=' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3136:1: ( '=' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3136:1: ( '=' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3137:1: '='
            {
             before(grammarAccess.getOnNameAccess().getEqualsSignKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__OnName__Group__2__Impl6456); 
             after(grammarAccess.getOnNameAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3150:1: rule__OnName__Group__3 : rule__OnName__Group__3__Impl rule__OnName__Group__4 ;
    public final void rule__OnName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3154:1: ( rule__OnName__Group__3__Impl rule__OnName__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3155:2: rule__OnName__Group__3__Impl rule__OnName__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__36487);
            rule__OnName__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__4_in_rule__OnName__Group__36490);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3162:1: rule__OnName__Group__3__Impl : ( ( rule__OnName__NameAssignment_3 ) ) ;
    public final void rule__OnName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3166:1: ( ( ( rule__OnName__NameAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3167:1: ( ( rule__OnName__NameAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3167:1: ( ( rule__OnName__NameAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3168:1: ( rule__OnName__NameAssignment_3 )
            {
             before(grammarAccess.getOnNameAccess().getNameAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3169:1: ( rule__OnName__NameAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3169:2: rule__OnName__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__NameAssignment_3_in_rule__OnName__Group__3__Impl6517);
            rule__OnName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnNameAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3179:1: rule__OnName__Group__4 : rule__OnName__Group__4__Impl ;
    public final void rule__OnName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3183:1: ( rule__OnName__Group__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3184:2: rule__OnName__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__4__Impl_in_rule__OnName__Group__46547);
            rule__OnName__Group__4__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3190:1: rule__OnName__Group__4__Impl : ( ( rule__OnName__Group_4__0 )? ) ;
    public final void rule__OnName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3194:1: ( ( ( rule__OnName__Group_4__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3195:1: ( ( rule__OnName__Group_4__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3195:1: ( ( rule__OnName__Group_4__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3196:1: ( rule__OnName__Group_4__0 )?
            {
             before(grammarAccess.getOnNameAccess().getGroup_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3197:1: ( rule__OnName__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3197:2: rule__OnName__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__0_in_rule__OnName__Group__4__Impl6574);
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


    // $ANTLR start "rule__OnName__Group_4__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3217:1: rule__OnName__Group_4__0 : rule__OnName__Group_4__0__Impl rule__OnName__Group_4__1 ;
    public final void rule__OnName__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3221:1: ( rule__OnName__Group_4__0__Impl rule__OnName__Group_4__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3222:2: rule__OnName__Group_4__0__Impl rule__OnName__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__0__Impl_in_rule__OnName__Group_4__06615);
            rule__OnName__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__1_in_rule__OnName__Group_4__06618);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3229:1: rule__OnName__Group_4__0__Impl : ( 'keep' ) ;
    public final void rule__OnName__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3233:1: ( ( 'keep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3234:1: ( 'keep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3234:1: ( 'keep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3235:1: 'keep'
            {
             before(grammarAccess.getOnNameAccess().getKeepKeyword_4_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnName__Group_4__0__Impl6646); 
             after(grammarAccess.getOnNameAccess().getKeepKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3248:1: rule__OnName__Group_4__1 : rule__OnName__Group_4__1__Impl ;
    public final void rule__OnName__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3252:1: ( rule__OnName__Group_4__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3253:2: rule__OnName__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group_4__1__Impl_in_rule__OnName__Group_4__16677);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3259:1: rule__OnName__Group_4__1__Impl : ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) ) ;
    public final void rule__OnName__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3263:1: ( ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3264:1: ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3264:1: ( ( rule__OnName__TrueFalseSearchAssignment_4_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3265:1: ( rule__OnName__TrueFalseSearchAssignment_4_1 )
            {
             before(grammarAccess.getOnNameAccess().getTrueFalseSearchAssignment_4_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3266:1: ( rule__OnName__TrueFalseSearchAssignment_4_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3266:2: rule__OnName__TrueFalseSearchAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__TrueFalseSearchAssignment_4_1_in_rule__OnName__Group_4__1__Impl6704);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3280:1: rule__OnExtension__Group__0 : rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 ;
    public final void rule__OnExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3284:1: ( rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3285:2: rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__06738);
            rule__OnExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__06741);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3292:1: rule__OnExtension__Group__0__Impl : ( () ) ;
    public final void rule__OnExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3296:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3297:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3297:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3298:1: ()
            {
             before(grammarAccess.getOnExtensionAccess().getOnExtensionAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3299:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3301:1: 
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3311:1: rule__OnExtension__Group__1 : rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 ;
    public final void rule__OnExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3315:1: ( rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3316:2: rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__16799);
            rule__OnExtension__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__16802);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3323:1: rule__OnExtension__Group__1__Impl : ( 'extension' ) ;
    public final void rule__OnExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3327:1: ( ( 'extension' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3328:1: ( 'extension' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3328:1: ( 'extension' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3329:1: 'extension'
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionKeyword_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__OnExtension__Group__1__Impl6830); 
             after(grammarAccess.getOnExtensionAccess().getExtensionKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3342:1: rule__OnExtension__Group__2 : rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 ;
    public final void rule__OnExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3346:1: ( rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3347:2: rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__26861);
            rule__OnExtension__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__26864);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3354:1: rule__OnExtension__Group__2__Impl : ( 'in [' ) ;
    public final void rule__OnExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3358:1: ( ( 'in [' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3359:1: ( 'in [' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3359:1: ( 'in [' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3360:1: 'in ['
            {
             before(grammarAccess.getOnExtensionAccess().getInKeyword_2()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__OnExtension__Group__2__Impl6892); 
             after(grammarAccess.getOnExtensionAccess().getInKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3373:1: rule__OnExtension__Group__3 : rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 ;
    public final void rule__OnExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3377:1: ( rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3378:2: rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__36923);
            rule__OnExtension__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__36926);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3385:1: rule__OnExtension__Group__3__Impl : ( ( rule__OnExtension__Group_3__0 )? ) ;
    public final void rule__OnExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3389:1: ( ( ( rule__OnExtension__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3390:1: ( ( rule__OnExtension__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3390:1: ( ( rule__OnExtension__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3391:1: ( rule__OnExtension__Group_3__0 )?
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3392:1: ( rule__OnExtension__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3392:2: rule__OnExtension__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__0_in_rule__OnExtension__Group__3__Impl6953);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3402:1: rule__OnExtension__Group__4 : rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 ;
    public final void rule__OnExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3406:1: ( rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3407:2: rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__46984);
            rule__OnExtension__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__46987);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3414:1: rule__OnExtension__Group__4__Impl : ( ']' ) ;
    public final void rule__OnExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3418:1: ( ( ']' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3419:1: ( ']' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3419:1: ( ']' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3420:1: ']'
            {
             before(grammarAccess.getOnExtensionAccess().getRightSquareBracketKeyword_4()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__OnExtension__Group__4__Impl7015); 
             after(grammarAccess.getOnExtensionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3433:1: rule__OnExtension__Group__5 : rule__OnExtension__Group__5__Impl ;
    public final void rule__OnExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3437:1: ( rule__OnExtension__Group__5__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3438:2: rule__OnExtension__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__57046);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3444:1: rule__OnExtension__Group__5__Impl : ( ( rule__OnExtension__Group_5__0 )? ) ;
    public final void rule__OnExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3448:1: ( ( ( rule__OnExtension__Group_5__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3449:1: ( ( rule__OnExtension__Group_5__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3449:1: ( ( rule__OnExtension__Group_5__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3450:1: ( rule__OnExtension__Group_5__0 )?
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3451:1: ( rule__OnExtension__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3451:2: rule__OnExtension__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_5__0_in_rule__OnExtension__Group__5__Impl7073);
                    rule__OnExtension__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnExtensionAccess().getGroup_5()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3473:1: rule__OnExtension__Group_3__0 : rule__OnExtension__Group_3__0__Impl rule__OnExtension__Group_3__1 ;
    public final void rule__OnExtension__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3477:1: ( rule__OnExtension__Group_3__0__Impl rule__OnExtension__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3478:2: rule__OnExtension__Group_3__0__Impl rule__OnExtension__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__0__Impl_in_rule__OnExtension__Group_3__07116);
            rule__OnExtension__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__1_in_rule__OnExtension__Group_3__07119);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3485:1: rule__OnExtension__Group_3__0__Impl : ( ( rule__OnExtension__ExtensionsAssignment_3_0 ) ) ;
    public final void rule__OnExtension__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3489:1: ( ( ( rule__OnExtension__ExtensionsAssignment_3_0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3490:1: ( ( rule__OnExtension__ExtensionsAssignment_3_0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3490:1: ( ( rule__OnExtension__ExtensionsAssignment_3_0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3491:1: ( rule__OnExtension__ExtensionsAssignment_3_0 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_3_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3492:1: ( rule__OnExtension__ExtensionsAssignment_3_0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3492:2: rule__OnExtension__ExtensionsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_3_0_in_rule__OnExtension__Group_3__0__Impl7146);
            rule__OnExtension__ExtensionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_3_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3502:1: rule__OnExtension__Group_3__1 : rule__OnExtension__Group_3__1__Impl ;
    public final void rule__OnExtension__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3506:1: ( rule__OnExtension__Group_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3507:2: rule__OnExtension__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3__1__Impl_in_rule__OnExtension__Group_3__17176);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3513:1: rule__OnExtension__Group_3__1__Impl : ( ( rule__OnExtension__Group_3_1__0 )* ) ;
    public final void rule__OnExtension__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3517:1: ( ( ( rule__OnExtension__Group_3_1__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3518:1: ( ( rule__OnExtension__Group_3_1__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3518:1: ( ( rule__OnExtension__Group_3_1__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3519:1: ( rule__OnExtension__Group_3_1__0 )*
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3520:1: ( rule__OnExtension__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==56) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3520:2: rule__OnExtension__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3_1__0_in_rule__OnExtension__Group_3__1__Impl7203);
            	    rule__OnExtension__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getOnExtensionAccess().getGroup_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnExtension__Group_3_1__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3534:1: rule__OnExtension__Group_3_1__0 : rule__OnExtension__Group_3_1__0__Impl rule__OnExtension__Group_3_1__1 ;
    public final void rule__OnExtension__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3538:1: ( rule__OnExtension__Group_3_1__0__Impl rule__OnExtension__Group_3_1__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3539:2: rule__OnExtension__Group_3_1__0__Impl rule__OnExtension__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3_1__0__Impl_in_rule__OnExtension__Group_3_1__07238);
            rule__OnExtension__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3_1__1_in_rule__OnExtension__Group_3_1__07241);
            rule__OnExtension__Group_3_1__1();

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
    // $ANTLR end "rule__OnExtension__Group_3_1__0"


    // $ANTLR start "rule__OnExtension__Group_3_1__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3546:1: rule__OnExtension__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__OnExtension__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3550:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3551:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3551:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3552:1: ','
            {
             before(grammarAccess.getOnExtensionAccess().getCommaKeyword_3_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__OnExtension__Group_3_1__0__Impl7269); 
             after(grammarAccess.getOnExtensionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_3_1__0__Impl"


    // $ANTLR start "rule__OnExtension__Group_3_1__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3565:1: rule__OnExtension__Group_3_1__1 : rule__OnExtension__Group_3_1__1__Impl ;
    public final void rule__OnExtension__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3569:1: ( rule__OnExtension__Group_3_1__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3570:2: rule__OnExtension__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_3_1__1__Impl_in_rule__OnExtension__Group_3_1__17300);
            rule__OnExtension__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__OnExtension__Group_3_1__1"


    // $ANTLR start "rule__OnExtension__Group_3_1__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3576:1: rule__OnExtension__Group_3_1__1__Impl : ( ( rule__OnExtension__ExtensionsAssignment_3_1_1 ) ) ;
    public final void rule__OnExtension__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3580:1: ( ( ( rule__OnExtension__ExtensionsAssignment_3_1_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3581:1: ( ( rule__OnExtension__ExtensionsAssignment_3_1_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3581:1: ( ( rule__OnExtension__ExtensionsAssignment_3_1_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3582:1: ( rule__OnExtension__ExtensionsAssignment_3_1_1 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_3_1_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3583:1: ( rule__OnExtension__ExtensionsAssignment_3_1_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3583:2: rule__OnExtension__ExtensionsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_3_1_1_in_rule__OnExtension__Group_3_1__1__Impl7327);
            rule__OnExtension__ExtensionsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_3_1__1__Impl"


    // $ANTLR start "rule__OnExtension__Group_5__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3597:1: rule__OnExtension__Group_5__0 : rule__OnExtension__Group_5__0__Impl rule__OnExtension__Group_5__1 ;
    public final void rule__OnExtension__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3601:1: ( rule__OnExtension__Group_5__0__Impl rule__OnExtension__Group_5__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3602:2: rule__OnExtension__Group_5__0__Impl rule__OnExtension__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_5__0__Impl_in_rule__OnExtension__Group_5__07361);
            rule__OnExtension__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_5__1_in_rule__OnExtension__Group_5__07364);
            rule__OnExtension__Group_5__1();

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
    // $ANTLR end "rule__OnExtension__Group_5__0"


    // $ANTLR start "rule__OnExtension__Group_5__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3609:1: rule__OnExtension__Group_5__0__Impl : ( 'keep' ) ;
    public final void rule__OnExtension__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3613:1: ( ( 'keep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3614:1: ( 'keep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3614:1: ( 'keep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3615:1: 'keep'
            {
             before(grammarAccess.getOnExtensionAccess().getKeepKeyword_5_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnExtension__Group_5__0__Impl7392); 
             after(grammarAccess.getOnExtensionAccess().getKeepKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_5__0__Impl"


    // $ANTLR start "rule__OnExtension__Group_5__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3628:1: rule__OnExtension__Group_5__1 : rule__OnExtension__Group_5__1__Impl ;
    public final void rule__OnExtension__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3632:1: ( rule__OnExtension__Group_5__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3633:2: rule__OnExtension__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_5__1__Impl_in_rule__OnExtension__Group_5__17423);
            rule__OnExtension__Group_5__1__Impl();

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
    // $ANTLR end "rule__OnExtension__Group_5__1"


    // $ANTLR start "rule__OnExtension__Group_5__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3639:1: rule__OnExtension__Group_5__1__Impl : ( ( rule__OnExtension__TrueFalseSearchAssignment_5_1 ) ) ;
    public final void rule__OnExtension__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3643:1: ( ( ( rule__OnExtension__TrueFalseSearchAssignment_5_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3644:1: ( ( rule__OnExtension__TrueFalseSearchAssignment_5_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3644:1: ( ( rule__OnExtension__TrueFalseSearchAssignment_5_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3645:1: ( rule__OnExtension__TrueFalseSearchAssignment_5_1 )
            {
             before(grammarAccess.getOnExtensionAccess().getTrueFalseSearchAssignment_5_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3646:1: ( rule__OnExtension__TrueFalseSearchAssignment_5_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3646:2: rule__OnExtension__TrueFalseSearchAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__TrueFalseSearchAssignment_5_1_in_rule__OnExtension__Group_5__1__Impl7450);
            rule__OnExtension__TrueFalseSearchAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getTrueFalseSearchAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_5__1__Impl"


    // $ANTLR start "rule__OnTime__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3660:1: rule__OnTime__Group__0 : rule__OnTime__Group__0__Impl rule__OnTime__Group__1 ;
    public final void rule__OnTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3664:1: ( rule__OnTime__Group__0__Impl rule__OnTime__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3665:2: rule__OnTime__Group__0__Impl rule__OnTime__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__07484);
            rule__OnTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__07487);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3672:1: rule__OnTime__Group__0__Impl : ( 'time' ) ;
    public final void rule__OnTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3676:1: ( ( 'time' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3677:1: ( 'time' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3677:1: ( 'time' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3678:1: 'time'
            {
             before(grammarAccess.getOnTimeAccess().getTimeKeyword_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__OnTime__Group__0__Impl7515); 
             after(grammarAccess.getOnTimeAccess().getTimeKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3691:1: rule__OnTime__Group__1 : rule__OnTime__Group__1__Impl rule__OnTime__Group__2 ;
    public final void rule__OnTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3695:1: ( rule__OnTime__Group__1__Impl rule__OnTime__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3696:2: rule__OnTime__Group__1__Impl rule__OnTime__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__17546);
            rule__OnTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__17549);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3703:1: rule__OnTime__Group__1__Impl : ( 'of' ) ;
    public final void rule__OnTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3707:1: ( ( 'of' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3708:1: ( 'of' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3708:1: ( 'of' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3709:1: 'of'
            {
             before(grammarAccess.getOnTimeAccess().getOfKeyword_1()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnTime__Group__1__Impl7577); 
             after(grammarAccess.getOnTimeAccess().getOfKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3722:1: rule__OnTime__Group__2 : rule__OnTime__Group__2__Impl rule__OnTime__Group__3 ;
    public final void rule__OnTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3726:1: ( rule__OnTime__Group__2__Impl rule__OnTime__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3727:2: rule__OnTime__Group__2__Impl rule__OnTime__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__27608);
            rule__OnTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__27611);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3734:1: rule__OnTime__Group__2__Impl : ( ( rule__OnTime__TimeOfAssignment_2 ) ) ;
    public final void rule__OnTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3738:1: ( ( ( rule__OnTime__TimeOfAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3739:1: ( ( rule__OnTime__TimeOfAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3739:1: ( ( rule__OnTime__TimeOfAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3740:1: ( rule__OnTime__TimeOfAssignment_2 )
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3741:1: ( rule__OnTime__TimeOfAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3741:2: rule__OnTime__TimeOfAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TimeOfAssignment_2_in_rule__OnTime__Group__2__Impl7638);
            rule__OnTime__TimeOfAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTimeOfAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3751:1: rule__OnTime__Group__3 : rule__OnTime__Group__3__Impl rule__OnTime__Group__4 ;
    public final void rule__OnTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3755:1: ( rule__OnTime__Group__3__Impl rule__OnTime__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3756:2: rule__OnTime__Group__3__Impl rule__OnTime__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__37668);
            rule__OnTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__37671);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3763:1: rule__OnTime__Group__3__Impl : ( ( rule__OnTime__OperatorAssignment_3 ) ) ;
    public final void rule__OnTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3767:1: ( ( ( rule__OnTime__OperatorAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3768:1: ( ( rule__OnTime__OperatorAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3768:1: ( ( rule__OnTime__OperatorAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3769:1: ( rule__OnTime__OperatorAssignment_3 )
            {
             before(grammarAccess.getOnTimeAccess().getOperatorAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3770:1: ( rule__OnTime__OperatorAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3770:2: rule__OnTime__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__OperatorAssignment_3_in_rule__OnTime__Group__3__Impl7698);
            rule__OnTime__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getOperatorAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3780:1: rule__OnTime__Group__4 : rule__OnTime__Group__4__Impl rule__OnTime__Group__5 ;
    public final void rule__OnTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3784:1: ( rule__OnTime__Group__4__Impl rule__OnTime__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3785:2: rule__OnTime__Group__4__Impl rule__OnTime__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__47728);
            rule__OnTime__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__5_in_rule__OnTime__Group__47731);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3792:1: rule__OnTime__Group__4__Impl : ( ( rule__OnTime__TresholdAssignment_4 ) ) ;
    public final void rule__OnTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3796:1: ( ( ( rule__OnTime__TresholdAssignment_4 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3797:1: ( ( rule__OnTime__TresholdAssignment_4 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3797:1: ( ( rule__OnTime__TresholdAssignment_4 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3798:1: ( rule__OnTime__TresholdAssignment_4 )
            {
             before(grammarAccess.getOnTimeAccess().getTresholdAssignment_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3799:1: ( rule__OnTime__TresholdAssignment_4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3799:2: rule__OnTime__TresholdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TresholdAssignment_4_in_rule__OnTime__Group__4__Impl7758);
            rule__OnTime__TresholdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTresholdAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3809:1: rule__OnTime__Group__5 : rule__OnTime__Group__5__Impl rule__OnTime__Group__6 ;
    public final void rule__OnTime__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3813:1: ( rule__OnTime__Group__5__Impl rule__OnTime__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3814:2: rule__OnTime__Group__5__Impl rule__OnTime__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__5__Impl_in_rule__OnTime__Group__57788);
            rule__OnTime__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__6_in_rule__OnTime__Group__57791);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3821:1: rule__OnTime__Group__5__Impl : ( ( rule__OnTime__UnitAssignment_5 ) ) ;
    public final void rule__OnTime__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3825:1: ( ( ( rule__OnTime__UnitAssignment_5 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3826:1: ( ( rule__OnTime__UnitAssignment_5 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3826:1: ( ( rule__OnTime__UnitAssignment_5 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3827:1: ( rule__OnTime__UnitAssignment_5 )
            {
             before(grammarAccess.getOnTimeAccess().getUnitAssignment_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3828:1: ( rule__OnTime__UnitAssignment_5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3828:2: rule__OnTime__UnitAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__UnitAssignment_5_in_rule__OnTime__Group__5__Impl7818);
            rule__OnTime__UnitAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getUnitAssignment_5()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3838:1: rule__OnTime__Group__6 : rule__OnTime__Group__6__Impl ;
    public final void rule__OnTime__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3842:1: ( rule__OnTime__Group__6__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3843:2: rule__OnTime__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__6__Impl_in_rule__OnTime__Group__67848);
            rule__OnTime__Group__6__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3849:1: rule__OnTime__Group__6__Impl : ( ( rule__OnTime__Group_6__0 )? ) ;
    public final void rule__OnTime__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3853:1: ( ( ( rule__OnTime__Group_6__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3854:1: ( ( rule__OnTime__Group_6__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3854:1: ( ( rule__OnTime__Group_6__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3855:1: ( rule__OnTime__Group_6__0 )?
            {
             before(grammarAccess.getOnTimeAccess().getGroup_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3856:1: ( rule__OnTime__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==58) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3856:2: rule__OnTime__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_6__0_in_rule__OnTime__Group__6__Impl7875);
                    rule__OnTime__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTimeAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnTime__Group_6__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3880:1: rule__OnTime__Group_6__0 : rule__OnTime__Group_6__0__Impl rule__OnTime__Group_6__1 ;
    public final void rule__OnTime__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3884:1: ( rule__OnTime__Group_6__0__Impl rule__OnTime__Group_6__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3885:2: rule__OnTime__Group_6__0__Impl rule__OnTime__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_6__0__Impl_in_rule__OnTime__Group_6__07920);
            rule__OnTime__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_6__1_in_rule__OnTime__Group_6__07923);
            rule__OnTime__Group_6__1();

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
    // $ANTLR end "rule__OnTime__Group_6__0"


    // $ANTLR start "rule__OnTime__Group_6__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3892:1: rule__OnTime__Group_6__0__Impl : ( 'keep' ) ;
    public final void rule__OnTime__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3896:1: ( ( 'keep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3897:1: ( 'keep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3897:1: ( 'keep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3898:1: 'keep'
            {
             before(grammarAccess.getOnTimeAccess().getKeepKeyword_6_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnTime__Group_6__0__Impl7951); 
             after(grammarAccess.getOnTimeAccess().getKeepKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group_6__0__Impl"


    // $ANTLR start "rule__OnTime__Group_6__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3911:1: rule__OnTime__Group_6__1 : rule__OnTime__Group_6__1__Impl ;
    public final void rule__OnTime__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3915:1: ( rule__OnTime__Group_6__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3916:2: rule__OnTime__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group_6__1__Impl_in_rule__OnTime__Group_6__17982);
            rule__OnTime__Group_6__1__Impl();

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
    // $ANTLR end "rule__OnTime__Group_6__1"


    // $ANTLR start "rule__OnTime__Group_6__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3922:1: rule__OnTime__Group_6__1__Impl : ( ( rule__OnTime__TrueFalseSearchAssignment_6_1 ) ) ;
    public final void rule__OnTime__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3926:1: ( ( ( rule__OnTime__TrueFalseSearchAssignment_6_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3927:1: ( ( rule__OnTime__TrueFalseSearchAssignment_6_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3927:1: ( ( rule__OnTime__TrueFalseSearchAssignment_6_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3928:1: ( rule__OnTime__TrueFalseSearchAssignment_6_1 )
            {
             before(grammarAccess.getOnTimeAccess().getTrueFalseSearchAssignment_6_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3929:1: ( rule__OnTime__TrueFalseSearchAssignment_6_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3929:2: rule__OnTime__TrueFalseSearchAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TrueFalseSearchAssignment_6_1_in_rule__OnTime__Group_6__1__Impl8009);
            rule__OnTime__TrueFalseSearchAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTrueFalseSearchAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__Group_6__1__Impl"


    // $ANTLR start "rule__OnAttributes__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3943:1: rule__OnAttributes__Group__0 : rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 ;
    public final void rule__OnAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3947:1: ( rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3948:2: rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__08043);
            rule__OnAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__08046);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3955:1: rule__OnAttributes__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__OnAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3959:1: ( ( 'attribute' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3960:1: ( 'attribute' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3960:1: ( 'attribute' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3961:1: 'attribute'
            {
             before(grammarAccess.getOnAttributesAccess().getAttributeKeyword_0()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__OnAttributes__Group__0__Impl8074); 
             after(grammarAccess.getOnAttributesAccess().getAttributeKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3974:1: rule__OnAttributes__Group__1 : rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 ;
    public final void rule__OnAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3978:1: ( rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3979:2: rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__18105);
            rule__OnAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__18108);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3986:1: rule__OnAttributes__Group__1__Impl : ( ( rule__OnAttributes__NameAssignment_1 ) ) ;
    public final void rule__OnAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3990:1: ( ( ( rule__OnAttributes__NameAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3991:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3991:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3992:1: ( rule__OnAttributes__NameAssignment_1 )
            {
             before(grammarAccess.getOnAttributesAccess().getNameAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3993:1: ( rule__OnAttributes__NameAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:3993:2: rule__OnAttributes__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl8135);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4003:1: rule__OnAttributes__Group__2 : rule__OnAttributes__Group__2__Impl rule__OnAttributes__Group__3 ;
    public final void rule__OnAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4007:1: ( rule__OnAttributes__Group__2__Impl rule__OnAttributes__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4008:2: rule__OnAttributes__Group__2__Impl rule__OnAttributes__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__28165);
            rule__OnAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__3_in_rule__OnAttributes__Group__28168);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4015:1: rule__OnAttributes__Group__2__Impl : ( ( rule__OnAttributes__Group_2__0 )? ) ;
    public final void rule__OnAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4019:1: ( ( ( rule__OnAttributes__Group_2__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4020:1: ( ( rule__OnAttributes__Group_2__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4020:1: ( ( rule__OnAttributes__Group_2__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4021:1: ( rule__OnAttributes__Group_2__0 )?
            {
             before(grammarAccess.getOnAttributesAccess().getGroup_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4022:1: ( rule__OnAttributes__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==64) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4022:2: rule__OnAttributes__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2__0_in_rule__OnAttributes__Group__2__Impl8195);
                    rule__OnAttributes__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnAttributesAccess().getGroup_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4032:1: rule__OnAttributes__Group__3 : rule__OnAttributes__Group__3__Impl ;
    public final void rule__OnAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4036:1: ( rule__OnAttributes__Group__3__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4037:2: rule__OnAttributes__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__3__Impl_in_rule__OnAttributes__Group__38226);
            rule__OnAttributes__Group__3__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4043:1: rule__OnAttributes__Group__3__Impl : ( ( rule__OnAttributes__Group_3__0 )? ) ;
    public final void rule__OnAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4047:1: ( ( ( rule__OnAttributes__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4048:1: ( ( rule__OnAttributes__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4048:1: ( ( rule__OnAttributes__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4049:1: ( rule__OnAttributes__Group_3__0 )?
            {
             before(grammarAccess.getOnAttributesAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4050:1: ( rule__OnAttributes__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==58) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4050:2: rule__OnAttributes__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__0_in_rule__OnAttributes__Group__3__Impl8253);
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


    // $ANTLR start "rule__OnAttributes__Group_2__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4068:1: rule__OnAttributes__Group_2__0 : rule__OnAttributes__Group_2__0__Impl rule__OnAttributes__Group_2__1 ;
    public final void rule__OnAttributes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4072:1: ( rule__OnAttributes__Group_2__0__Impl rule__OnAttributes__Group_2__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4073:2: rule__OnAttributes__Group_2__0__Impl rule__OnAttributes__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2__0__Impl_in_rule__OnAttributes__Group_2__08292);
            rule__OnAttributes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2__1_in_rule__OnAttributes__Group_2__08295);
            rule__OnAttributes__Group_2__1();

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
    // $ANTLR end "rule__OnAttributes__Group_2__0"


    // $ANTLR start "rule__OnAttributes__Group_2__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4080:1: rule__OnAttributes__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__OnAttributes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4084:1: ( ( 'is' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4085:1: ( 'is' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4085:1: ( 'is' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4086:1: 'is'
            {
             before(grammarAccess.getOnAttributesAccess().getIsKeyword_2_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__OnAttributes__Group_2__0__Impl8323); 
             after(grammarAccess.getOnAttributesAccess().getIsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2__0__Impl"


    // $ANTLR start "rule__OnAttributes__Group_2__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4099:1: rule__OnAttributes__Group_2__1 : rule__OnAttributes__Group_2__1__Impl ;
    public final void rule__OnAttributes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4103:1: ( rule__OnAttributes__Group_2__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4104:2: rule__OnAttributes__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2__1__Impl_in_rule__OnAttributes__Group_2__18354);
            rule__OnAttributes__Group_2__1__Impl();

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
    // $ANTLR end "rule__OnAttributes__Group_2__1"


    // $ANTLR start "rule__OnAttributes__Group_2__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4110:1: rule__OnAttributes__Group_2__1__Impl : ( ( rule__OnAttributes__ValueAssignment_2_1 ) ) ;
    public final void rule__OnAttributes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4114:1: ( ( ( rule__OnAttributes__ValueAssignment_2_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4115:1: ( ( rule__OnAttributes__ValueAssignment_2_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4115:1: ( ( rule__OnAttributes__ValueAssignment_2_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4116:1: ( rule__OnAttributes__ValueAssignment_2_1 )
            {
             before(grammarAccess.getOnAttributesAccess().getValueAssignment_2_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4117:1: ( rule__OnAttributes__ValueAssignment_2_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4117:2: rule__OnAttributes__ValueAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__ValueAssignment_2_1_in_rule__OnAttributes__Group_2__1__Impl8381);
            rule__OnAttributes__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOnAttributesAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2__1__Impl"


    // $ANTLR start "rule__OnAttributes__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4131:1: rule__OnAttributes__Group_3__0 : rule__OnAttributes__Group_3__0__Impl rule__OnAttributes__Group_3__1 ;
    public final void rule__OnAttributes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4135:1: ( rule__OnAttributes__Group_3__0__Impl rule__OnAttributes__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4136:2: rule__OnAttributes__Group_3__0__Impl rule__OnAttributes__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__0__Impl_in_rule__OnAttributes__Group_3__08415);
            rule__OnAttributes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__1_in_rule__OnAttributes__Group_3__08418);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4143:1: rule__OnAttributes__Group_3__0__Impl : ( 'keep' ) ;
    public final void rule__OnAttributes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4147:1: ( ( 'keep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4148:1: ( 'keep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4148:1: ( 'keep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4149:1: 'keep'
            {
             before(grammarAccess.getOnAttributesAccess().getKeepKeyword_3_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnAttributes__Group_3__0__Impl8446); 
             after(grammarAccess.getOnAttributesAccess().getKeepKeyword_3_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4162:1: rule__OnAttributes__Group_3__1 : rule__OnAttributes__Group_3__1__Impl ;
    public final void rule__OnAttributes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4166:1: ( rule__OnAttributes__Group_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4167:2: rule__OnAttributes__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_3__1__Impl_in_rule__OnAttributes__Group_3__18477);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4173:1: rule__OnAttributes__Group_3__1__Impl : ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) ) ;
    public final void rule__OnAttributes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4177:1: ( ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4178:1: ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4178:1: ( ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4179:1: ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 )
            {
             before(grammarAccess.getOnAttributesAccess().getTrueFalseSearchAssignment_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4180:1: ( rule__OnAttributes__TrueFalseSearchAssignment_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4180:2: rule__OnAttributes__TrueFalseSearchAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__TrueFalseSearchAssignment_3_1_in_rule__OnAttributes__Group_3__1__Impl8504);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4194:1: rule__OnTags__Group__0 : rule__OnTags__Group__0__Impl rule__OnTags__Group__1 ;
    public final void rule__OnTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4198:1: ( rule__OnTags__Group__0__Impl rule__OnTags__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4199:2: rule__OnTags__Group__0__Impl rule__OnTags__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__08538);
            rule__OnTags__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__08541);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4206:1: rule__OnTags__Group__0__Impl : ( '[' ) ;
    public final void rule__OnTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4210:1: ( ( '[' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4211:1: ( '[' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4211:1: ( '[' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4212:1: '['
            {
             before(grammarAccess.getOnTagsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__OnTags__Group__0__Impl8569); 
             after(grammarAccess.getOnTagsAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4225:1: rule__OnTags__Group__1 : rule__OnTags__Group__1__Impl rule__OnTags__Group__2 ;
    public final void rule__OnTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4229:1: ( rule__OnTags__Group__1__Impl rule__OnTags__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4230:2: rule__OnTags__Group__1__Impl rule__OnTags__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__18600);
            rule__OnTags__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__18603);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4237:1: rule__OnTags__Group__1__Impl : ( ( rule__OnTags__Group_1__0 )? ) ;
    public final void rule__OnTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4241:1: ( ( ( rule__OnTags__Group_1__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4242:1: ( ( rule__OnTags__Group_1__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4242:1: ( ( rule__OnTags__Group_1__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4243:1: ( rule__OnTags__Group_1__0 )?
            {
             before(grammarAccess.getOnTagsAccess().getGroup_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4244:1: ( rule__OnTags__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4244:2: rule__OnTags__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__0_in_rule__OnTags__Group__1__Impl8630);
                    rule__OnTags__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4254:1: rule__OnTags__Group__2 : rule__OnTags__Group__2__Impl rule__OnTags__Group__3 ;
    public final void rule__OnTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4258:1: ( rule__OnTags__Group__2__Impl rule__OnTags__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4259:2: rule__OnTags__Group__2__Impl rule__OnTags__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__28661);
            rule__OnTags__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__28664);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4266:1: rule__OnTags__Group__2__Impl : ( ']' ) ;
    public final void rule__OnTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4270:1: ( ( ']' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4271:1: ( ']' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4271:1: ( ']' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4272:1: ']'
            {
             before(grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__OnTags__Group__2__Impl8692); 
             after(grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4285:1: rule__OnTags__Group__3 : rule__OnTags__Group__3__Impl rule__OnTags__Group__4 ;
    public final void rule__OnTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4289:1: ( rule__OnTags__Group__3__Impl rule__OnTags__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4290:2: rule__OnTags__Group__3__Impl rule__OnTags__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__38723);
            rule__OnTags__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__38726);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4297:1: rule__OnTags__Group__3__Impl : ( ( rule__OnTags__TresholdAssignment_3 ) ) ;
    public final void rule__OnTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4301:1: ( ( ( rule__OnTags__TresholdAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4302:1: ( ( rule__OnTags__TresholdAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4302:1: ( ( rule__OnTags__TresholdAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4303:1: ( rule__OnTags__TresholdAssignment_3 )
            {
             before(grammarAccess.getOnTagsAccess().getTresholdAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4304:1: ( rule__OnTags__TresholdAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4304:2: rule__OnTags__TresholdAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TresholdAssignment_3_in_rule__OnTags__Group__3__Impl8753);
            rule__OnTags__TresholdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTresholdAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4314:1: rule__OnTags__Group__4 : rule__OnTags__Group__4__Impl rule__OnTags__Group__5 ;
    public final void rule__OnTags__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4318:1: ( rule__OnTags__Group__4__Impl rule__OnTags__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4319:2: rule__OnTags__Group__4__Impl rule__OnTags__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__48783);
            rule__OnTags__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__48786);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4326:1: rule__OnTags__Group__4__Impl : ( 'in tags' ) ;
    public final void rule__OnTags__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4330:1: ( ( 'in tags' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4331:1: ( 'in tags' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4331:1: ( 'in tags' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4332:1: 'in tags'
            {
             before(grammarAccess.getOnTagsAccess().getInTagsKeyword_4()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__OnTags__Group__4__Impl8814); 
             after(grammarAccess.getOnTagsAccess().getInTagsKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4345:1: rule__OnTags__Group__5 : rule__OnTags__Group__5__Impl rule__OnTags__Group__6 ;
    public final void rule__OnTags__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4349:1: ( rule__OnTags__Group__5__Impl rule__OnTags__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4350:2: rule__OnTags__Group__5__Impl rule__OnTags__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__58845);
            rule__OnTags__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__58848);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4357:1: rule__OnTags__Group__5__Impl : ( ( rule__OnTags__OnlyAssignment_5 )? ) ;
    public final void rule__OnTags__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4361:1: ( ( ( rule__OnTags__OnlyAssignment_5 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4362:1: ( ( rule__OnTags__OnlyAssignment_5 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4362:1: ( ( rule__OnTags__OnlyAssignment_5 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4363:1: ( rule__OnTags__OnlyAssignment_5 )?
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAssignment_5()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4364:1: ( rule__OnTags__OnlyAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==74) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4364:2: rule__OnTags__OnlyAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__OnlyAssignment_5_in_rule__OnTags__Group__5__Impl8875);
                    rule__OnTags__OnlyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getOnlyAssignment_5()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4374:1: rule__OnTags__Group__6 : rule__OnTags__Group__6__Impl ;
    public final void rule__OnTags__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4378:1: ( rule__OnTags__Group__6__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4379:2: rule__OnTags__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__68906);
            rule__OnTags__Group__6__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4385:1: rule__OnTags__Group__6__Impl : ( ( rule__OnTags__Group_6__0 )? ) ;
    public final void rule__OnTags__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4389:1: ( ( ( rule__OnTags__Group_6__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4390:1: ( ( rule__OnTags__Group_6__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4390:1: ( ( rule__OnTags__Group_6__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4391:1: ( rule__OnTags__Group_6__0 )?
            {
             before(grammarAccess.getOnTagsAccess().getGroup_6()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4392:1: ( rule__OnTags__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4392:2: rule__OnTags__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_6__0_in_rule__OnTags__Group__6__Impl8933);
                    rule__OnTags__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnTags__Group_1__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4416:1: rule__OnTags__Group_1__0 : rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1 ;
    public final void rule__OnTags__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4420:1: ( rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4421:2: rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__0__Impl_in_rule__OnTags__Group_1__08978);
            rule__OnTags__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__1_in_rule__OnTags__Group_1__08981);
            rule__OnTags__Group_1__1();

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
    // $ANTLR end "rule__OnTags__Group_1__0"


    // $ANTLR start "rule__OnTags__Group_1__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4428:1: rule__OnTags__Group_1__0__Impl : ( ( rule__OnTags__TagsAssignment_1_0 ) ) ;
    public final void rule__OnTags__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4432:1: ( ( ( rule__OnTags__TagsAssignment_1_0 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4433:1: ( ( rule__OnTags__TagsAssignment_1_0 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4433:1: ( ( rule__OnTags__TagsAssignment_1_0 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4434:1: ( rule__OnTags__TagsAssignment_1_0 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_1_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4435:1: ( rule__OnTags__TagsAssignment_1_0 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4435:2: rule__OnTags__TagsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_1_0_in_rule__OnTags__Group_1__0__Impl9008);
            rule__OnTags__TagsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTagsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_1__0__Impl"


    // $ANTLR start "rule__OnTags__Group_1__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4445:1: rule__OnTags__Group_1__1 : rule__OnTags__Group_1__1__Impl ;
    public final void rule__OnTags__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4449:1: ( rule__OnTags__Group_1__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4450:2: rule__OnTags__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__1__Impl_in_rule__OnTags__Group_1__19038);
            rule__OnTags__Group_1__1__Impl();

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
    // $ANTLR end "rule__OnTags__Group_1__1"


    // $ANTLR start "rule__OnTags__Group_1__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4456:1: rule__OnTags__Group_1__1__Impl : ( ( rule__OnTags__Group_1_1__0 )* ) ;
    public final void rule__OnTags__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4460:1: ( ( ( rule__OnTags__Group_1_1__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4461:1: ( ( rule__OnTags__Group_1_1__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4461:1: ( ( rule__OnTags__Group_1_1__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4462:1: ( rule__OnTags__Group_1_1__0 )*
            {
             before(grammarAccess.getOnTagsAccess().getGroup_1_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4463:1: ( rule__OnTags__Group_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==56) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4463:2: rule__OnTags__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__0_in_rule__OnTags__Group_1__1__Impl9065);
            	    rule__OnTags__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getOnTagsAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_1__1__Impl"


    // $ANTLR start "rule__OnTags__Group_1_1__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4477:1: rule__OnTags__Group_1_1__0 : rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1 ;
    public final void rule__OnTags__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4481:1: ( rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4482:2: rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__0__Impl_in_rule__OnTags__Group_1_1__09100);
            rule__OnTags__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__1_in_rule__OnTags__Group_1_1__09103);
            rule__OnTags__Group_1_1__1();

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
    // $ANTLR end "rule__OnTags__Group_1_1__0"


    // $ANTLR start "rule__OnTags__Group_1_1__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4489:1: rule__OnTags__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__OnTags__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4493:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4494:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4494:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4495:1: ','
            {
             before(grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__OnTags__Group_1_1__0__Impl9131); 
             after(grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_1_1__0__Impl"


    // $ANTLR start "rule__OnTags__Group_1_1__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4508:1: rule__OnTags__Group_1_1__1 : rule__OnTags__Group_1_1__1__Impl ;
    public final void rule__OnTags__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4512:1: ( rule__OnTags__Group_1_1__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4513:2: rule__OnTags__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__1__Impl_in_rule__OnTags__Group_1_1__19162);
            rule__OnTags__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__OnTags__Group_1_1__1"


    // $ANTLR start "rule__OnTags__Group_1_1__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4519:1: rule__OnTags__Group_1_1__1__Impl : ( ( rule__OnTags__TagsAssignment_1_1_1 ) ) ;
    public final void rule__OnTags__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4523:1: ( ( ( rule__OnTags__TagsAssignment_1_1_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4524:1: ( ( rule__OnTags__TagsAssignment_1_1_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4524:1: ( ( rule__OnTags__TagsAssignment_1_1_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4525:1: ( rule__OnTags__TagsAssignment_1_1_1 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_1_1_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4526:1: ( rule__OnTags__TagsAssignment_1_1_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4526:2: rule__OnTags__TagsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_1_1_1_in_rule__OnTags__Group_1_1__1__Impl9189);
            rule__OnTags__TagsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTagsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_1_1__1__Impl"


    // $ANTLR start "rule__OnTags__Group_6__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4540:1: rule__OnTags__Group_6__0 : rule__OnTags__Group_6__0__Impl rule__OnTags__Group_6__1 ;
    public final void rule__OnTags__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4544:1: ( rule__OnTags__Group_6__0__Impl rule__OnTags__Group_6__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4545:2: rule__OnTags__Group_6__0__Impl rule__OnTags__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_6__0__Impl_in_rule__OnTags__Group_6__09223);
            rule__OnTags__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_6__1_in_rule__OnTags__Group_6__09226);
            rule__OnTags__Group_6__1();

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
    // $ANTLR end "rule__OnTags__Group_6__0"


    // $ANTLR start "rule__OnTags__Group_6__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4552:1: rule__OnTags__Group_6__0__Impl : ( 'keep' ) ;
    public final void rule__OnTags__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4556:1: ( ( 'keep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4557:1: ( 'keep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4557:1: ( 'keep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4558:1: 'keep'
            {
             before(grammarAccess.getOnTagsAccess().getKeepKeyword_6_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnTags__Group_6__0__Impl9254); 
             after(grammarAccess.getOnTagsAccess().getKeepKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_6__0__Impl"


    // $ANTLR start "rule__OnTags__Group_6__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4571:1: rule__OnTags__Group_6__1 : rule__OnTags__Group_6__1__Impl ;
    public final void rule__OnTags__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4575:1: ( rule__OnTags__Group_6__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4576:2: rule__OnTags__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_6__1__Impl_in_rule__OnTags__Group_6__19285);
            rule__OnTags__Group_6__1__Impl();

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
    // $ANTLR end "rule__OnTags__Group_6__1"


    // $ANTLR start "rule__OnTags__Group_6__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4582:1: rule__OnTags__Group_6__1__Impl : ( ( rule__OnTags__TrueFalseSearchAssignment_6_1 ) ) ;
    public final void rule__OnTags__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4586:1: ( ( ( rule__OnTags__TrueFalseSearchAssignment_6_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4587:1: ( ( rule__OnTags__TrueFalseSearchAssignment_6_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4587:1: ( ( rule__OnTags__TrueFalseSearchAssignment_6_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4588:1: ( rule__OnTags__TrueFalseSearchAssignment_6_1 )
            {
             before(grammarAccess.getOnTagsAccess().getTrueFalseSearchAssignment_6_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4589:1: ( rule__OnTags__TrueFalseSearchAssignment_6_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4589:2: rule__OnTags__TrueFalseSearchAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TrueFalseSearchAssignment_6_1_in_rule__OnTags__Group_6__1__Impl9312);
            rule__OnTags__TrueFalseSearchAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTrueFalseSearchAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_6__1__Impl"


    // $ANTLR start "rule__OnSize__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4603:1: rule__OnSize__Group__0 : rule__OnSize__Group__0__Impl rule__OnSize__Group__1 ;
    public final void rule__OnSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4607:1: ( rule__OnSize__Group__0__Impl rule__OnSize__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4608:2: rule__OnSize__Group__0__Impl rule__OnSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__09346);
            rule__OnSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__09349);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4615:1: rule__OnSize__Group__0__Impl : ( 'size' ) ;
    public final void rule__OnSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4619:1: ( ( 'size' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4620:1: ( 'size' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4620:1: ( 'size' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4621:1: 'size'
            {
             before(grammarAccess.getOnSizeAccess().getSizeKeyword_0()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__OnSize__Group__0__Impl9377); 
             after(grammarAccess.getOnSizeAccess().getSizeKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4634:1: rule__OnSize__Group__1 : rule__OnSize__Group__1__Impl rule__OnSize__Group__2 ;
    public final void rule__OnSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4638:1: ( rule__OnSize__Group__1__Impl rule__OnSize__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4639:2: rule__OnSize__Group__1__Impl rule__OnSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__19408);
            rule__OnSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__19411);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4646:1: rule__OnSize__Group__1__Impl : ( ( rule__OnSize__OperatorAssignment_1 ) ) ;
    public final void rule__OnSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4650:1: ( ( ( rule__OnSize__OperatorAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4651:1: ( ( rule__OnSize__OperatorAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4651:1: ( ( rule__OnSize__OperatorAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4652:1: ( rule__OnSize__OperatorAssignment_1 )
            {
             before(grammarAccess.getOnSizeAccess().getOperatorAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4653:1: ( rule__OnSize__OperatorAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4653:2: rule__OnSize__OperatorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__OperatorAssignment_1_in_rule__OnSize__Group__1__Impl9438);
            rule__OnSize__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getOperatorAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4663:1: rule__OnSize__Group__2 : rule__OnSize__Group__2__Impl rule__OnSize__Group__3 ;
    public final void rule__OnSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4667:1: ( rule__OnSize__Group__2__Impl rule__OnSize__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4668:2: rule__OnSize__Group__2__Impl rule__OnSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__29468);
            rule__OnSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__29471);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4675:1: rule__OnSize__Group__2__Impl : ( ( rule__OnSize__TresholdAssignment_2 ) ) ;
    public final void rule__OnSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4679:1: ( ( ( rule__OnSize__TresholdAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4680:1: ( ( rule__OnSize__TresholdAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4680:1: ( ( rule__OnSize__TresholdAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4681:1: ( rule__OnSize__TresholdAssignment_2 )
            {
             before(grammarAccess.getOnSizeAccess().getTresholdAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4682:1: ( rule__OnSize__TresholdAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4682:2: rule__OnSize__TresholdAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__TresholdAssignment_2_in_rule__OnSize__Group__2__Impl9498);
            rule__OnSize__TresholdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getTresholdAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4692:1: rule__OnSize__Group__3 : rule__OnSize__Group__3__Impl rule__OnSize__Group__4 ;
    public final void rule__OnSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4696:1: ( rule__OnSize__Group__3__Impl rule__OnSize__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4697:2: rule__OnSize__Group__3__Impl rule__OnSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__39528);
            rule__OnSize__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__39531);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4704:1: rule__OnSize__Group__3__Impl : ( ( rule__OnSize__UnitAssignment_3 ) ) ;
    public final void rule__OnSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4708:1: ( ( ( rule__OnSize__UnitAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4709:1: ( ( rule__OnSize__UnitAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4709:1: ( ( rule__OnSize__UnitAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4710:1: ( rule__OnSize__UnitAssignment_3 )
            {
             before(grammarAccess.getOnSizeAccess().getUnitAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4711:1: ( rule__OnSize__UnitAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4711:2: rule__OnSize__UnitAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__UnitAssignment_3_in_rule__OnSize__Group__3__Impl9558);
            rule__OnSize__UnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getUnitAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4721:1: rule__OnSize__Group__4 : rule__OnSize__Group__4__Impl ;
    public final void rule__OnSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4725:1: ( rule__OnSize__Group__4__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4726:2: rule__OnSize__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__49588);
            rule__OnSize__Group__4__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4732:1: rule__OnSize__Group__4__Impl : ( ( rule__OnSize__Group_4__0 )? ) ;
    public final void rule__OnSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4736:1: ( ( ( rule__OnSize__Group_4__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4737:1: ( ( rule__OnSize__Group_4__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4737:1: ( ( rule__OnSize__Group_4__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4738:1: ( rule__OnSize__Group_4__0 )?
            {
             before(grammarAccess.getOnSizeAccess().getGroup_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4739:1: ( rule__OnSize__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4739:2: rule__OnSize__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_4__0_in_rule__OnSize__Group__4__Impl9615);
                    rule__OnSize__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnSizeAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnSize__Group_4__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4759:1: rule__OnSize__Group_4__0 : rule__OnSize__Group_4__0__Impl rule__OnSize__Group_4__1 ;
    public final void rule__OnSize__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4763:1: ( rule__OnSize__Group_4__0__Impl rule__OnSize__Group_4__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4764:2: rule__OnSize__Group_4__0__Impl rule__OnSize__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_4__0__Impl_in_rule__OnSize__Group_4__09656);
            rule__OnSize__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_4__1_in_rule__OnSize__Group_4__09659);
            rule__OnSize__Group_4__1();

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
    // $ANTLR end "rule__OnSize__Group_4__0"


    // $ANTLR start "rule__OnSize__Group_4__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4771:1: rule__OnSize__Group_4__0__Impl : ( 'keep' ) ;
    public final void rule__OnSize__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4775:1: ( ( 'keep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4776:1: ( 'keep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4776:1: ( 'keep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4777:1: 'keep'
            {
             before(grammarAccess.getOnSizeAccess().getKeepKeyword_4_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnSize__Group_4__0__Impl9687); 
             after(grammarAccess.getOnSizeAccess().getKeepKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group_4__0__Impl"


    // $ANTLR start "rule__OnSize__Group_4__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4790:1: rule__OnSize__Group_4__1 : rule__OnSize__Group_4__1__Impl ;
    public final void rule__OnSize__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4794:1: ( rule__OnSize__Group_4__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4795:2: rule__OnSize__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group_4__1__Impl_in_rule__OnSize__Group_4__19718);
            rule__OnSize__Group_4__1__Impl();

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
    // $ANTLR end "rule__OnSize__Group_4__1"


    // $ANTLR start "rule__OnSize__Group_4__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4801:1: rule__OnSize__Group_4__1__Impl : ( ( rule__OnSize__TrueFalseSearchAssignment_4_1 ) ) ;
    public final void rule__OnSize__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4805:1: ( ( ( rule__OnSize__TrueFalseSearchAssignment_4_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4806:1: ( ( rule__OnSize__TrueFalseSearchAssignment_4_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4806:1: ( ( rule__OnSize__TrueFalseSearchAssignment_4_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4807:1: ( rule__OnSize__TrueFalseSearchAssignment_4_1 )
            {
             before(grammarAccess.getOnSizeAccess().getTrueFalseSearchAssignment_4_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4808:1: ( rule__OnSize__TrueFalseSearchAssignment_4_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4808:2: rule__OnSize__TrueFalseSearchAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__TrueFalseSearchAssignment_4_1_in_rule__OnSize__Group_4__1__Impl9745);
            rule__OnSize__TrueFalseSearchAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getTrueFalseSearchAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__Group_4__1__Impl"


    // $ANTLR start "rule__FilterContainer__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4822:1: rule__FilterContainer__Group__0 : rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 ;
    public final void rule__FilterContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4826:1: ( rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4827:2: rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__09779);
            rule__FilterContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__09782);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4834:1: rule__FilterContainer__Group__0__Impl : ( '{' ) ;
    public final void rule__FilterContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4838:1: ( ( '{' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4839:1: ( '{' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4839:1: ( '{' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4840:1: '{'
            {
             before(grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__FilterContainer__Group__0__Impl9810); 
             after(grammarAccess.getFilterContainerAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4853:1: rule__FilterContainer__Group__1 : rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 ;
    public final void rule__FilterContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4857:1: ( rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4858:2: rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__19841);
            rule__FilterContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__19844);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4865:1: rule__FilterContainer__Group__1__Impl : ( ( rule__FilterContainer__CompositionTypeAssignment_1 ) ) ;
    public final void rule__FilterContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4869:1: ( ( ( rule__FilterContainer__CompositionTypeAssignment_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4870:1: ( ( rule__FilterContainer__CompositionTypeAssignment_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4870:1: ( ( rule__FilterContainer__CompositionTypeAssignment_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4871:1: ( rule__FilterContainer__CompositionTypeAssignment_1 )
            {
             before(grammarAccess.getFilterContainerAccess().getCompositionTypeAssignment_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4872:1: ( rule__FilterContainer__CompositionTypeAssignment_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4872:2: rule__FilterContainer__CompositionTypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__CompositionTypeAssignment_1_in_rule__FilterContainer__Group__1__Impl9871);
            rule__FilterContainer__CompositionTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getCompositionTypeAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4882:1: rule__FilterContainer__Group__2 : rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 ;
    public final void rule__FilterContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4886:1: ( rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4887:2: rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__29901);
            rule__FilterContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__29904);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4894:1: rule__FilterContainer__Group__2__Impl : ( '(' ) ;
    public final void rule__FilterContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4898:1: ( ( '(' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4899:1: ( '(' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4899:1: ( '(' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4900:1: '('
            {
             before(grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_2()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__FilterContainer__Group__2__Impl9932); 
             after(grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4913:1: rule__FilterContainer__Group__3 : rule__FilterContainer__Group__3__Impl rule__FilterContainer__Group__4 ;
    public final void rule__FilterContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4917:1: ( rule__FilterContainer__Group__3__Impl rule__FilterContainer__Group__4 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4918:2: rule__FilterContainer__Group__3__Impl rule__FilterContainer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__39963);
            rule__FilterContainer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__4_in_rule__FilterContainer__Group__39966);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4925:1: rule__FilterContainer__Group__3__Impl : ( ( rule__FilterContainer__SegmentsAssignment_3 ) ) ;
    public final void rule__FilterContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4929:1: ( ( ( rule__FilterContainer__SegmentsAssignment_3 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4930:1: ( ( rule__FilterContainer__SegmentsAssignment_3 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4930:1: ( ( rule__FilterContainer__SegmentsAssignment_3 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4931:1: ( rule__FilterContainer__SegmentsAssignment_3 )
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4932:1: ( rule__FilterContainer__SegmentsAssignment_3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4932:2: rule__FilterContainer__SegmentsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__SegmentsAssignment_3_in_rule__FilterContainer__Group__3__Impl9993);
            rule__FilterContainer__SegmentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4942:1: rule__FilterContainer__Group__4 : rule__FilterContainer__Group__4__Impl rule__FilterContainer__Group__5 ;
    public final void rule__FilterContainer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4946:1: ( rule__FilterContainer__Group__4__Impl rule__FilterContainer__Group__5 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4947:2: rule__FilterContainer__Group__4__Impl rule__FilterContainer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__4__Impl_in_rule__FilterContainer__Group__410023);
            rule__FilterContainer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__5_in_rule__FilterContainer__Group__410026);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4954:1: rule__FilterContainer__Group__4__Impl : ( ( rule__FilterContainer__Group_4__0 )* ) ;
    public final void rule__FilterContainer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4958:1: ( ( ( rule__FilterContainer__Group_4__0 )* ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4959:1: ( ( rule__FilterContainer__Group_4__0 )* )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4959:1: ( ( rule__FilterContainer__Group_4__0 )* )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4960:1: ( rule__FilterContainer__Group_4__0 )*
            {
             before(grammarAccess.getFilterContainerAccess().getGroup_4()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4961:1: ( rule__FilterContainer__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==56) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4961:2: rule__FilterContainer__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_4__0_in_rule__FilterContainer__Group__4__Impl10053);
            	    rule__FilterContainer__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getFilterContainerAccess().getGroup_4()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4971:1: rule__FilterContainer__Group__5 : rule__FilterContainer__Group__5__Impl rule__FilterContainer__Group__6 ;
    public final void rule__FilterContainer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4975:1: ( rule__FilterContainer__Group__5__Impl rule__FilterContainer__Group__6 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4976:2: rule__FilterContainer__Group__5__Impl rule__FilterContainer__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__5__Impl_in_rule__FilterContainer__Group__510084);
            rule__FilterContainer__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__6_in_rule__FilterContainer__Group__510087);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4983:1: rule__FilterContainer__Group__5__Impl : ( ')' ) ;
    public final void rule__FilterContainer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4987:1: ( ( ')' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4988:1: ( ')' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4988:1: ( ')' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:4989:1: ')'
            {
             before(grammarAccess.getFilterContainerAccess().getRightParenthesisKeyword_5()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__FilterContainer__Group__5__Impl10115); 
             after(grammarAccess.getFilterContainerAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5002:1: rule__FilterContainer__Group__6 : rule__FilterContainer__Group__6__Impl ;
    public final void rule__FilterContainer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5006:1: ( rule__FilterContainer__Group__6__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5007:2: rule__FilterContainer__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__6__Impl_in_rule__FilterContainer__Group__610146);
            rule__FilterContainer__Group__6__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5013:1: rule__FilterContainer__Group__6__Impl : ( '}' ) ;
    public final void rule__FilterContainer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5017:1: ( ( '}' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5018:1: ( '}' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5018:1: ( '}' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5019:1: '}'
            {
             before(grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__FilterContainer__Group__6__Impl10174); 
             after(grammarAccess.getFilterContainerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__FilterContainer__Group_4__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5046:1: rule__FilterContainer__Group_4__0 : rule__FilterContainer__Group_4__0__Impl rule__FilterContainer__Group_4__1 ;
    public final void rule__FilterContainer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5050:1: ( rule__FilterContainer__Group_4__0__Impl rule__FilterContainer__Group_4__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5051:2: rule__FilterContainer__Group_4__0__Impl rule__FilterContainer__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_4__0__Impl_in_rule__FilterContainer__Group_4__010219);
            rule__FilterContainer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_4__1_in_rule__FilterContainer__Group_4__010222);
            rule__FilterContainer__Group_4__1();

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
    // $ANTLR end "rule__FilterContainer__Group_4__0"


    // $ANTLR start "rule__FilterContainer__Group_4__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5058:1: rule__FilterContainer__Group_4__0__Impl : ( ',' ) ;
    public final void rule__FilterContainer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5062:1: ( ( ',' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5063:1: ( ',' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5063:1: ( ',' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5064:1: ','
            {
             before(grammarAccess.getFilterContainerAccess().getCommaKeyword_4_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__FilterContainer__Group_4__0__Impl10250); 
             after(grammarAccess.getFilterContainerAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_4__0__Impl"


    // $ANTLR start "rule__FilterContainer__Group_4__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5077:1: rule__FilterContainer__Group_4__1 : rule__FilterContainer__Group_4__1__Impl ;
    public final void rule__FilterContainer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5081:1: ( rule__FilterContainer__Group_4__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5082:2: rule__FilterContainer__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group_4__1__Impl_in_rule__FilterContainer__Group_4__110281);
            rule__FilterContainer__Group_4__1__Impl();

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
    // $ANTLR end "rule__FilterContainer__Group_4__1"


    // $ANTLR start "rule__FilterContainer__Group_4__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5088:1: rule__FilterContainer__Group_4__1__Impl : ( ( rule__FilterContainer__SegmentsAssignment_4_1 ) ) ;
    public final void rule__FilterContainer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5092:1: ( ( ( rule__FilterContainer__SegmentsAssignment_4_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5093:1: ( ( rule__FilterContainer__SegmentsAssignment_4_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5093:1: ( ( rule__FilterContainer__SegmentsAssignment_4_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5094:1: ( rule__FilterContainer__SegmentsAssignment_4_1 )
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_4_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5095:1: ( rule__FilterContainer__SegmentsAssignment_4_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5095:2: rule__FilterContainer__SegmentsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__SegmentsAssignment_4_1_in_rule__FilterContainer__Group_4__1__Impl10308);
            rule__FilterContainer__SegmentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getSegmentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__Group_4__1__Impl"


    // $ANTLR start "rule__IsEmpty__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5109:1: rule__IsEmpty__Group__0 : rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 ;
    public final void rule__IsEmpty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5113:1: ( rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5114:2: rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__010342);
            rule__IsEmpty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__010345);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5121:1: rule__IsEmpty__Group__0__Impl : ( () ) ;
    public final void rule__IsEmpty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5125:1: ( ( () ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5126:1: ( () )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5126:1: ( () )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5127:1: ()
            {
             before(grammarAccess.getIsEmptyAccess().getIsEmptyAction_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5128:1: ()
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5130:1: 
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5140:1: rule__IsEmpty__Group__1 : rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 ;
    public final void rule__IsEmpty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5144:1: ( rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5145:2: rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__110403);
            rule__IsEmpty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__110406);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5152:1: rule__IsEmpty__Group__1__Impl : ( 'empty' ) ;
    public final void rule__IsEmpty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5156:1: ( ( 'empty' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5157:1: ( 'empty' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5157:1: ( 'empty' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5158:1: 'empty'
            {
             before(grammarAccess.getIsEmptyAccess().getEmptyKeyword_1()); 
            match(input,71,FollowSets000.FOLLOW_71_in_rule__IsEmpty__Group__1__Impl10434); 
             after(grammarAccess.getIsEmptyAccess().getEmptyKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5171:1: rule__IsEmpty__Group__2 : rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 ;
    public final void rule__IsEmpty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5175:1: ( rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5176:2: rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__210465);
            rule__IsEmpty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__210468);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5183:1: rule__IsEmpty__Group__2__Impl : ( '=' ) ;
    public final void rule__IsEmpty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5187:1: ( ( '=' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5188:1: ( '=' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5188:1: ( '=' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5189:1: '='
            {
             before(grammarAccess.getIsEmptyAccess().getEqualsSignKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__IsEmpty__Group__2__Impl10496); 
             after(grammarAccess.getIsEmptyAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5202:1: rule__IsEmpty__Group__3 : rule__IsEmpty__Group__3__Impl ;
    public final void rule__IsEmpty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5206:1: ( rule__IsEmpty__Group__3__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5207:2: rule__IsEmpty__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__310527);
            rule__IsEmpty__Group__3__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5213:1: rule__IsEmpty__Group__3__Impl : ( ( rule__IsEmpty__TrueFalseSearchAssignment_3 )? ) ;
    public final void rule__IsEmpty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5217:1: ( ( ( rule__IsEmpty__TrueFalseSearchAssignment_3 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5218:1: ( ( rule__IsEmpty__TrueFalseSearchAssignment_3 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5218:1: ( ( rule__IsEmpty__TrueFalseSearchAssignment_3 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5219:1: ( rule__IsEmpty__TrueFalseSearchAssignment_3 )?
            {
             before(grammarAccess.getIsEmptyAccess().getTrueFalseSearchAssignment_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5220:1: ( rule__IsEmpty__TrueFalseSearchAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=11 && LA33_0<=12)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5220:2: rule__IsEmpty__TrueFalseSearchAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__TrueFalseSearchAssignment_3_in_rule__IsEmpty__Group__3__Impl10554);
                    rule__IsEmpty__TrueFalseSearchAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIsEmptyAccess().getTrueFalseSearchAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnType__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5238:1: rule__OnType__Group__0 : rule__OnType__Group__0__Impl rule__OnType__Group__1 ;
    public final void rule__OnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5242:1: ( rule__OnType__Group__0__Impl rule__OnType__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5243:2: rule__OnType__Group__0__Impl rule__OnType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__010593);
            rule__OnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__010596);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5250:1: rule__OnType__Group__0__Impl : ( 'file' ) ;
    public final void rule__OnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5254:1: ( ( 'file' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5255:1: ( 'file' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5255:1: ( 'file' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5256:1: 'file'
            {
             before(grammarAccess.getOnTypeAccess().getFileKeyword_0()); 
            match(input,72,FollowSets000.FOLLOW_72_in_rule__OnType__Group__0__Impl10624); 
             after(grammarAccess.getOnTypeAccess().getFileKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5269:1: rule__OnType__Group__1 : rule__OnType__Group__1__Impl rule__OnType__Group__2 ;
    public final void rule__OnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5273:1: ( rule__OnType__Group__1__Impl rule__OnType__Group__2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5274:2: rule__OnType__Group__1__Impl rule__OnType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__110655);
            rule__OnType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__110658);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5281:1: rule__OnType__Group__1__Impl : ( 'is' ) ;
    public final void rule__OnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5285:1: ( ( 'is' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5286:1: ( 'is' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5286:1: ( 'is' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5287:1: 'is'
            {
             before(grammarAccess.getOnTypeAccess().getIsKeyword_1()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__OnType__Group__1__Impl10686); 
             after(grammarAccess.getOnTypeAccess().getIsKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5300:1: rule__OnType__Group__2 : rule__OnType__Group__2__Impl rule__OnType__Group__3 ;
    public final void rule__OnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5304:1: ( rule__OnType__Group__2__Impl rule__OnType__Group__3 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5305:2: rule__OnType__Group__2__Impl rule__OnType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__210717);
            rule__OnType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__210720);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5312:1: rule__OnType__Group__2__Impl : ( ( rule__OnType__TypeAssignment_2 ) ) ;
    public final void rule__OnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5316:1: ( ( ( rule__OnType__TypeAssignment_2 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5317:1: ( ( rule__OnType__TypeAssignment_2 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5317:1: ( ( rule__OnType__TypeAssignment_2 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5318:1: ( rule__OnType__TypeAssignment_2 )
            {
             before(grammarAccess.getOnTypeAccess().getTypeAssignment_2()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5319:1: ( rule__OnType__TypeAssignment_2 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5319:2: rule__OnType__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__TypeAssignment_2_in_rule__OnType__Group__2__Impl10747);
            rule__OnType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5329:1: rule__OnType__Group__3 : rule__OnType__Group__3__Impl ;
    public final void rule__OnType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5333:1: ( rule__OnType__Group__3__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5334:2: rule__OnType__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__310777);
            rule__OnType__Group__3__Impl();

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5340:1: rule__OnType__Group__3__Impl : ( ( rule__OnType__Group_3__0 )? ) ;
    public final void rule__OnType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5344:1: ( ( ( rule__OnType__Group_3__0 )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5345:1: ( ( rule__OnType__Group_3__0 )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5345:1: ( ( rule__OnType__Group_3__0 )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5346:1: ( rule__OnType__Group_3__0 )?
            {
             before(grammarAccess.getOnTypeAccess().getGroup_3()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5347:1: ( rule__OnType__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5347:2: rule__OnType__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_3__0_in_rule__OnType__Group__3__Impl10804);
                    rule__OnType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTypeAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnType__Group_3__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5365:1: rule__OnType__Group_3__0 : rule__OnType__Group_3__0__Impl rule__OnType__Group_3__1 ;
    public final void rule__OnType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5369:1: ( rule__OnType__Group_3__0__Impl rule__OnType__Group_3__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5370:2: rule__OnType__Group_3__0__Impl rule__OnType__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_3__0__Impl_in_rule__OnType__Group_3__010843);
            rule__OnType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_3__1_in_rule__OnType__Group_3__010846);
            rule__OnType__Group_3__1();

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
    // $ANTLR end "rule__OnType__Group_3__0"


    // $ANTLR start "rule__OnType__Group_3__0__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5377:1: rule__OnType__Group_3__0__Impl : ( 'keep' ) ;
    public final void rule__OnType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5381:1: ( ( 'keep' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5382:1: ( 'keep' )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5382:1: ( 'keep' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5383:1: 'keep'
            {
             before(grammarAccess.getOnTypeAccess().getKeepKeyword_3_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnType__Group_3__0__Impl10874); 
             after(grammarAccess.getOnTypeAccess().getKeepKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group_3__0__Impl"


    // $ANTLR start "rule__OnType__Group_3__1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5396:1: rule__OnType__Group_3__1 : rule__OnType__Group_3__1__Impl ;
    public final void rule__OnType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5400:1: ( rule__OnType__Group_3__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5401:2: rule__OnType__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group_3__1__Impl_in_rule__OnType__Group_3__110905);
            rule__OnType__Group_3__1__Impl();

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
    // $ANTLR end "rule__OnType__Group_3__1"


    // $ANTLR start "rule__OnType__Group_3__1__Impl"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5407:1: rule__OnType__Group_3__1__Impl : ( ( rule__OnType__TrueFalseSearchAssignment_3_1 ) ) ;
    public final void rule__OnType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5411:1: ( ( ( rule__OnType__TrueFalseSearchAssignment_3_1 ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5412:1: ( ( rule__OnType__TrueFalseSearchAssignment_3_1 ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5412:1: ( ( rule__OnType__TrueFalseSearchAssignment_3_1 ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5413:1: ( rule__OnType__TrueFalseSearchAssignment_3_1 )
            {
             before(grammarAccess.getOnTypeAccess().getTrueFalseSearchAssignment_3_1()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5414:1: ( rule__OnType__TrueFalseSearchAssignment_3_1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5414:2: rule__OnType__TrueFalseSearchAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__TrueFalseSearchAssignment_3_1_in_rule__OnType__Group_3__1__Impl10932);
            rule__OnType__TrueFalseSearchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOnTypeAccess().getTrueFalseSearchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5428:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5432:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5433:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010966);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010969);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5440:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5444:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5445:1: ( ( '-' )? )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5445:1: ( ( '-' )? )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5446:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5447:1: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==73) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5448:2: '-'
                    {
                    match(input,73,FollowSets000.FOLLOW_73_in_rule__EInt__Group__0__Impl10998); 

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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5459:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5463:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5464:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111031);
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
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5470:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5474:1: ( ( RULE_INT ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5475:1: ( RULE_INT )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5475:1: ( RULE_INT )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5476:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl11058); 
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


    // $ANTLR start "rule__Model__ExecutionsAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5492:1: rule__Model__ExecutionsAssignment_1 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5496:1: ( ( ruleExecution ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5497:1: ( ruleExecution )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5497:1: ( ruleExecution )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5498:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_111096);
            ruleExecution();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExecutionsAssignment_1"


    // $ANTLR start "rule__Model__ExecutionsAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5507:1: rule__Model__ExecutionsAssignment_2_1 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5511:1: ( ( ruleExecution ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5512:1: ( ruleExecution )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5512:1: ( ruleExecution )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5513:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_2_111127);
            ruleExecution();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExecutionsAssignment_2_1"


    // $ANTLR start "rule__Copy__SourceAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5522:1: rule__Copy__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Copy__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5526:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5527:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5527:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5528:1: ( ruleEString )
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionVariableCrossReference_2_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5529:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5530:1: ruleEString
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionVariableEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_211162);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getSourceSelectionVariableEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getSourceSelectionVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__SourceAssignment_2"


    // $ANTLR start "rule__Copy__DestinationAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5541:1: rule__Copy__DestinationAssignment_4 : ( rulePath ) ;
    public final void rule__Copy__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5545:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5546:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5546:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5547:1: rulePath
            {
             before(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_411197);
            rulePath();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__DestinationAssignment_4"


    // $ANTLR start "rule__Copy__StrategyAssignment_5_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5556:1: rule__Copy__StrategyAssignment_5_1 : ( ruleStrategies ) ;
    public final void rule__Copy__StrategyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5560:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5561:1: ( ruleStrategies )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5561:1: ( ruleStrategies )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5562:1: ruleStrategies
            {
             before(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_5_111228);
            ruleStrategies();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__StrategyAssignment_5_1"


    // $ANTLR start "rule__Move__SourceAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5571:1: rule__Move__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Move__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5575:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5576:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5576:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5577:1: ( ruleEString )
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionVariableCrossReference_2_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5578:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5579:1: ruleEString
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionVariableEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Move__SourceAssignment_211263);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSourceSelectionVariableEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMoveAccess().getSourceSelectionVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__SourceAssignment_2"


    // $ANTLR start "rule__Move__DestinationAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5590:1: rule__Move__DestinationAssignment_4 : ( rulePath ) ;
    public final void rule__Move__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5594:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5595:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5595:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5596:1: rulePath
            {
             before(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Move__DestinationAssignment_411298);
            rulePath();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__DestinationAssignment_4"


    // $ANTLR start "rule__Move__StrategyAssignment_5_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5605:1: rule__Move__StrategyAssignment_5_1 : ( ruleStrategies ) ;
    public final void rule__Move__StrategyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5609:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5610:1: ( ruleStrategies )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5610:1: ( ruleStrategies )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5611:1: ruleStrategies
            {
             before(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_5_111329);
            ruleStrategies();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__StrategyAssignment_5_1"


    // $ANTLR start "rule__Delete__SourceAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5620:1: rule__Delete__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Delete__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5624:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5625:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5625:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5626:1: ( ruleEString )
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionVariableCrossReference_2_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5627:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5628:1: ruleEString
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionVariableEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_211364);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getSourceSelectionVariableEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDeleteAccess().getSourceSelectionVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__SourceAssignment_2"


    // $ANTLR start "rule__PathVariable__NameAssignment_0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5639:1: rule__PathVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__PathVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5643:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5644:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5644:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5645:1: ruleEString
            {
             before(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_011399);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__NameAssignment_0"


    // $ANTLR start "rule__PathVariable__ValueAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5654:1: rule__PathVariable__ValueAssignment_2 : ( rulePath ) ;
    public final void rule__PathVariable__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5658:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5659:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5659:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5660:1: rulePath
            {
             before(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_211430);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathVariable__ValueAssignment_2"


    // $ANTLR start "rule__SelectionVariable__NameAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5669:1: rule__SelectionVariable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SelectionVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5673:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5674:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5674:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5675:1: ruleEString
            {
             before(grammarAccess.getSelectionVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SelectionVariable__NameAssignment_111461);
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


    // $ANTLR start "rule__SelectionVariable__ValueAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5684:1: rule__SelectionVariable__ValueAssignment_3 : ( ruleSelection ) ;
    public final void rule__SelectionVariable__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5688:1: ( ( ruleSelection ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5689:1: ( ruleSelection )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5689:1: ( ruleSelection )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5690:1: ruleSelection
            {
             before(grammarAccess.getSelectionVariableAccess().getValueSelectionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_rule__SelectionVariable__ValueAssignment_311492);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionVariableAccess().getValueSelectionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionVariable__ValueAssignment_3"


    // $ANTLR start "rule__Path__AbsoluteAssignment_0_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5699:1: rule__Path__AbsoluteAssignment_0_1 : ( ruleEBoolean ) ;
    public final void rule__Path__AbsoluteAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5703:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5704:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5704:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5705:1: ruleEBoolean
            {
             before(grammarAccess.getPathAccess().getAbsoluteEBooleanParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__Path__AbsoluteAssignment_0_111523);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getPathAccess().getAbsoluteEBooleanParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__AbsoluteAssignment_0_1"


    // $ANTLR start "rule__Path__StepsAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5714:1: rule__Path__StepsAssignment_1 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5718:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5719:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5719:1: ( ruleGenericStep )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5720:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_111554);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__StepsAssignment_1"


    // $ANTLR start "rule__Path__StepsAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5729:1: rule__Path__StepsAssignment_2_1 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5733:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5734:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5734:1: ( ruleGenericStep )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5735:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_2_111585);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__StepsAssignment_2_1"


    // $ANTLR start "rule__ConcreteStep__ValueAssignment"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5744:1: rule__ConcreteStep__ValueAssignment : ( ruleEString ) ;
    public final void rule__ConcreteStep__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5748:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5749:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5749:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5750:1: ruleEString
            {
             before(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment11616);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__ValueAssignment"


    // $ANTLR start "rule__VariableStep__ValueAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5759:1: rule__VariableStep__ValueAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__VariableStep__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5763:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5764:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5764:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5765:1: ( ruleEString )
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5766:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5767:1: ruleEString
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_111651);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableStepAccess().getValuePathVariableEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStep__ValueAssignment_1"


    // $ANTLR start "rule__ParametrizedStep__NameAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5778:1: rule__ParametrizedStep__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParametrizedStep__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5782:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5783:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5783:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5784:1: ruleEString
            {
             before(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_211686);
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


    // $ANTLR start "rule__Selection__FromAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5793:1: rule__Selection__FromAssignment_2 : ( rulePath ) ;
    public final void rule__Selection__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5797:1: ( ( rulePath ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5798:1: ( rulePath )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5798:1: ( rulePath )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5799:1: rulePath
            {
             before(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Selection__FromAssignment_211717);
            rulePath();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__FromAssignment_2"


    // $ANTLR start "rule__Selection__WhereAssignment_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5808:1: rule__Selection__WhereAssignment_3_1 : ( ruleFilterComponent ) ;
    public final void rule__Selection__WhereAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5812:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5813:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5813:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5814:1: ruleFilterComponent
            {
             before(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_3_111748);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__WhereAssignment_3_1"


    // $ANTLR start "rule__Selection__WhereAssignment_3_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5823:1: rule__Selection__WhereAssignment_3_2_1 : ( ruleFilterComponent ) ;
    public final void rule__Selection__WhereAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5827:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5828:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5828:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5829:1: ruleFilterComponent
            {
             before(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_3_2_111779);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__WhereAssignment_3_2_1"


    // $ANTLR start "rule__OnName__NameAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5838:1: rule__OnName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OnName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5842:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5843:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5843:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5844:1: ruleEString
            {
             before(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnName__NameAssignment_311810);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__NameAssignment_3"


    // $ANTLR start "rule__OnName__TrueFalseSearchAssignment_4_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5853:1: rule__OnName__TrueFalseSearchAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__OnName__TrueFalseSearchAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5857:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5858:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5858:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5859:1: ruleEBoolean
            {
             before(grammarAccess.getOnNameAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnName__TrueFalseSearchAssignment_4_111841);
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


    // $ANTLR start "rule__OnExtension__ExtensionsAssignment_3_0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5868:1: rule__OnExtension__ExtensionsAssignment_3_0 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5872:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5873:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5873:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5874:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_3_011872);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__ExtensionsAssignment_3_0"


    // $ANTLR start "rule__OnExtension__ExtensionsAssignment_3_1_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5883:1: rule__OnExtension__ExtensionsAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5887:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5888:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5888:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5889:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_3_1_111903);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__ExtensionsAssignment_3_1_1"


    // $ANTLR start "rule__OnExtension__TrueFalseSearchAssignment_5_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5898:1: rule__OnExtension__TrueFalseSearchAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__OnExtension__TrueFalseSearchAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5902:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5903:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5903:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5904:1: ruleEBoolean
            {
             before(grammarAccess.getOnExtensionAccess().getTrueFalseSearchEBooleanParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnExtension__TrueFalseSearchAssignment_5_111934);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getTrueFalseSearchEBooleanParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__TrueFalseSearchAssignment_5_1"


    // $ANTLR start "rule__OnTime__TimeOfAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5913:1: rule__OnTime__TimeOfAssignment_2 : ( ruleTimeType ) ;
    public final void rule__OnTime__TimeOfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5917:1: ( ( ruleTimeType ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5918:1: ( ruleTimeType )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5918:1: ( ruleTimeType )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5919:1: ruleTimeType
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_211965);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TimeOfAssignment_2"


    // $ANTLR start "rule__OnTime__OperatorAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5928:1: rule__OnTime__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__OnTime__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5932:1: ( ( ruleOperator ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5933:1: ( ruleOperator )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5933:1: ( ruleOperator )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5934:1: ruleOperator
            {
             before(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_311996);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__OperatorAssignment_3"


    // $ANTLR start "rule__OnTime__TresholdAssignment_4"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5943:1: rule__OnTime__TresholdAssignment_4 : ( ruleEInt ) ;
    public final void rule__OnTime__TresholdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5947:1: ( ( ruleEInt ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5948:1: ( ruleEInt )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5948:1: ( ruleEInt )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5949:1: ruleEInt
            {
             before(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_412027);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TresholdAssignment_4"


    // $ANTLR start "rule__OnTime__UnitAssignment_5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5958:1: rule__OnTime__UnitAssignment_5 : ( ruleTimeUnit ) ;
    public final void rule__OnTime__UnitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5962:1: ( ( ruleTimeUnit ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5963:1: ( ruleTimeUnit )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5963:1: ( ruleTimeUnit )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5964:1: ruleTimeUnit
            {
             before(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_512058);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__UnitAssignment_5"


    // $ANTLR start "rule__OnTime__TrueFalseSearchAssignment_6_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5973:1: rule__OnTime__TrueFalseSearchAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__OnTime__TrueFalseSearchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5977:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5978:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5978:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5979:1: ruleEBoolean
            {
             before(grammarAccess.getOnTimeAccess().getTrueFalseSearchEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnTime__TrueFalseSearchAssignment_6_112089);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTrueFalseSearchEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TrueFalseSearchAssignment_6_1"


    // $ANTLR start "rule__OnAttributes__NameAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5988:1: rule__OnAttributes__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OnAttributes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5992:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5993:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5993:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:5994:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_112120);
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


    // $ANTLR start "rule__OnAttributes__ValueAssignment_2_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6003:1: rule__OnAttributes__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OnAttributes__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6007:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6008:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6008:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6009:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_2_112151);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__ValueAssignment_2_1"


    // $ANTLR start "rule__OnAttributes__TrueFalseSearchAssignment_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6018:1: rule__OnAttributes__TrueFalseSearchAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__OnAttributes__TrueFalseSearchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6022:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6023:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6023:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6024:1: ruleEBoolean
            {
             before(grammarAccess.getOnAttributesAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnAttributes__TrueFalseSearchAssignment_3_112182);
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


    // $ANTLR start "rule__OnTags__TagsAssignment_1_0"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6033:1: rule__OnTags__TagsAssignment_1_0 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6037:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6038:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6038:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6039:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_012213);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TagsAssignment_1_0"


    // $ANTLR start "rule__OnTags__TagsAssignment_1_1_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6048:1: rule__OnTags__TagsAssignment_1_1_1 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6052:1: ( ( ruleEString ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6053:1: ( ruleEString )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6053:1: ( ruleEString )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6054:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_1_112244);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TagsAssignment_1_1_1"


    // $ANTLR start "rule__OnTags__TresholdAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6063:1: rule__OnTags__TresholdAssignment_3 : ( ruleEInt ) ;
    public final void rule__OnTags__TresholdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6067:1: ( ( ruleEInt ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6068:1: ( ruleEInt )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6068:1: ( ruleEInt )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6069:1: ruleEInt
            {
             before(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_312275);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TresholdAssignment_3"


    // $ANTLR start "rule__OnTags__OnlyAssignment_5"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6078:1: rule__OnTags__OnlyAssignment_5 : ( ( 'exclusively' ) ) ;
    public final void rule__OnTags__OnlyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6082:1: ( ( ( 'exclusively' ) ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6083:1: ( ( 'exclusively' ) )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6083:1: ( ( 'exclusively' ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6084:1: ( 'exclusively' )
            {
             before(grammarAccess.getOnTagsAccess().getOnlyExclusivelyKeyword_5_0()); 
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6085:1: ( 'exclusively' )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6086:1: 'exclusively'
            {
             before(grammarAccess.getOnTagsAccess().getOnlyExclusivelyKeyword_5_0()); 
            match(input,74,FollowSets000.FOLLOW_74_in_rule__OnTags__OnlyAssignment_512311); 
             after(grammarAccess.getOnTagsAccess().getOnlyExclusivelyKeyword_5_0()); 

            }

             after(grammarAccess.getOnTagsAccess().getOnlyExclusivelyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__OnlyAssignment_5"


    // $ANTLR start "rule__OnTags__TrueFalseSearchAssignment_6_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6101:1: rule__OnTags__TrueFalseSearchAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__OnTags__TrueFalseSearchAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6105:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6106:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6106:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6107:1: ruleEBoolean
            {
             before(grammarAccess.getOnTagsAccess().getTrueFalseSearchEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnTags__TrueFalseSearchAssignment_6_112350);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTrueFalseSearchEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TrueFalseSearchAssignment_6_1"


    // $ANTLR start "rule__OnSize__OperatorAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6116:1: rule__OnSize__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__OnSize__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6120:1: ( ( ruleOperator ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6121:1: ( ruleOperator )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6121:1: ( ruleOperator )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6122:1: ruleOperator
            {
             before(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_112381);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__OperatorAssignment_1"


    // $ANTLR start "rule__OnSize__TresholdAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6131:1: rule__OnSize__TresholdAssignment_2 : ( ruleEInt ) ;
    public final void rule__OnSize__TresholdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6135:1: ( ( ruleEInt ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6136:1: ( ruleEInt )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6136:1: ( ruleEInt )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6137:1: ruleEInt
            {
             before(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_212412);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__TresholdAssignment_2"


    // $ANTLR start "rule__OnSize__UnitAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6146:1: rule__OnSize__UnitAssignment_3 : ( ruleMemoryUnit ) ;
    public final void rule__OnSize__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6150:1: ( ( ruleMemoryUnit ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6151:1: ( ruleMemoryUnit )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6151:1: ( ruleMemoryUnit )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6152:1: ruleMemoryUnit
            {
             before(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_312443);
            ruleMemoryUnit();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__UnitAssignment_3"


    // $ANTLR start "rule__OnSize__TrueFalseSearchAssignment_4_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6161:1: rule__OnSize__TrueFalseSearchAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__OnSize__TrueFalseSearchAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6165:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6166:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6166:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6167:1: ruleEBoolean
            {
             before(grammarAccess.getOnSizeAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnSize__TrueFalseSearchAssignment_4_112474);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getTrueFalseSearchEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__TrueFalseSearchAssignment_4_1"


    // $ANTLR start "rule__FilterContainer__CompositionTypeAssignment_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6176:1: rule__FilterContainer__CompositionTypeAssignment_1 : ( ruleCompositionType ) ;
    public final void rule__FilterContainer__CompositionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6180:1: ( ( ruleCompositionType ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6181:1: ( ruleCompositionType )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6181:1: ( ruleCompositionType )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6182:1: ruleCompositionType
            {
             before(grammarAccess.getFilterContainerAccess().getCompositionTypeCompositionTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_rule__FilterContainer__CompositionTypeAssignment_112505);
            ruleCompositionType();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getCompositionTypeCompositionTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__CompositionTypeAssignment_1"


    // $ANTLR start "rule__FilterContainer__SegmentsAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6191:1: rule__FilterContainer__SegmentsAssignment_3 : ( ruleFilterComponent ) ;
    public final void rule__FilterContainer__SegmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6195:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6196:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6196:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6197:1: ruleFilterComponent
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_312536);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__SegmentsAssignment_3"


    // $ANTLR start "rule__FilterContainer__SegmentsAssignment_4_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6206:1: rule__FilterContainer__SegmentsAssignment_4_1 : ( ruleFilterComponent ) ;
    public final void rule__FilterContainer__SegmentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6210:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6211:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6211:1: ( ruleFilterComponent )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6212:1: ruleFilterComponent
            {
             before(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_4_112567);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getSegmentsFilterComponentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__SegmentsAssignment_4_1"


    // $ANTLR start "rule__IsEmpty__TrueFalseSearchAssignment_3"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6221:1: rule__IsEmpty__TrueFalseSearchAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__IsEmpty__TrueFalseSearchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6225:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6226:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6226:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6227:1: ruleEBoolean
            {
             before(grammarAccess.getIsEmptyAccess().getTrueFalseSearchEBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__IsEmpty__TrueFalseSearchAssignment_312598);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getIsEmptyAccess().getTrueFalseSearchEBooleanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__TrueFalseSearchAssignment_3"


    // $ANTLR start "rule__OnType__TypeAssignment_2"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6236:1: rule__OnType__TypeAssignment_2 : ( ruleFileType ) ;
    public final void rule__OnType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6240:1: ( ( ruleFileType ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6241:1: ( ruleFileType )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6241:1: ( ruleFileType )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6242:1: ruleFileType
            {
             before(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_212629);
            ruleFileType();

            state._fsp--;

             after(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__TypeAssignment_2"


    // $ANTLR start "rule__OnType__TrueFalseSearchAssignment_3_1"
    // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6251:1: rule__OnType__TrueFalseSearchAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__OnType__TrueFalseSearchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6255:1: ( ( ruleEBoolean ) )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6256:1: ( ruleEBoolean )
            {
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6256:1: ( ruleEBoolean )
            // ../org.xtext.example.miniFetl.ui/src-gen/org/xtext/example/miniFetl/ui/contentassist/antlr/internal/InternalFetl.g:6257:1: ruleEBoolean
            {
             before(grammarAccess.getOnTypeAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__OnType__TrueFalseSearchAssignment_3_112660);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOnTypeAccess().getTrueFalseSearchEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__TrueFalseSearchAssignment_3_1"

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
        public static final BitSet FOLLOW_rule__ConcreteStep__ValueAssignment_in_ruleConcreteStep754 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02948 = new BitSet(new long[]{0x0000588000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13009 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_1_in_rule__Model__Group__1__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl3096 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__03133 = new BitSet(new long[]{0x0000588000000030L});
        public static final BitSet FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__03136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Model__Group_2__0__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__13195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_2_1_in_rule__Model__Group_2__1__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__03256 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__03259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Copy__Group__0__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__13318 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__13321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Copy__Group__1__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__23380 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__23383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__SourceAssignment_2_in_rule__Copy__Group__2__Impl3410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__33440 = new BitSet(new long[]{0x0019000000000030L});
        public static final BitSet FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__33443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Copy__Group__3__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__43502 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__43505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__DestinationAssignment_4_in_rule__Copy__Group__4__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__53562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__0_in_rule__Copy__Group__5__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__0__Impl_in_rule__Copy__Group_5__03632 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__1_in_rule__Copy__Group_5__03635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Copy__Group_5__0__Impl3663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__1__Impl_in_rule__Copy__Group_5__13694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__StrategyAssignment_5_1_in_rule__Copy__Group_5__1__Impl3721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__03755 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__03758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Move__Group__0__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__13817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__13820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Move__Group__1__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__23879 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__23882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SourceAssignment_2_in_rule__Move__Group__2__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__33939 = new BitSet(new long[]{0x0019000000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__33942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Move__Group__3__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__44001 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__5_in_rule__Move__Group__44004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__DestinationAssignment_4_in_rule__Move__Group__4__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__54061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__0_in_rule__Move__Group__5__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__0__Impl_in_rule__Move__Group_5__04131 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Move__Group_5__1_in_rule__Move__Group_5__04134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Move__Group_5__0__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__1__Impl_in_rule__Move__Group_5__14193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__StrategyAssignment_5_1_in_rule__Move__Group_5__1__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__04254 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__04257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Delete__Group__0__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__14316 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__14319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Delete__Group__1__Impl4347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__24378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__SourceAssignment_2_in_rule__Delete__Group__2__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__04441 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__04444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__NameAssignment_0_in_rule__PathVariable__Group__0__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__14501 = new BitSet(new long[]{0x0019000000000030L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__14504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__PathVariable__Group__1__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__24563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__ValueAssignment_2_in_rule__PathVariable__Group__2__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__0__Impl_in_rule__SelectionVariable__Group__04626 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__1_in_rule__SelectionVariable__Group__04629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__SelectionVariable__Group__0__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__1__Impl_in_rule__SelectionVariable__Group__14688 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__2_in_rule__SelectionVariable__Group__14691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__NameAssignment_1_in_rule__SelectionVariable__Group__1__Impl4718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__2__Impl_in_rule__SelectionVariable__Group__24748 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__3_in_rule__SelectionVariable__Group__24751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__SelectionVariable__Group__2__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__Group__3__Impl_in_rule__SelectionVariable__Group__34810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionVariable__ValueAssignment_3_in_rule__SelectionVariable__Group__3__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04875 = new BitSet(new long[]{0x0019000000000030L});
        public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_0__0_in_rule__Path__Group__0__Impl4905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14936 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_1_in_rule__Path__Group__1__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__24996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_2__0_in_rule__Path__Group__2__Impl5023 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_0__0__Impl_in_rule__Path__Group_0__05060 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Path__Group_0__1_in_rule__Path__Group_0__05063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Path__Group_0__0__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_0__1__Impl_in_rule__Path__Group_0__15122 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Path__Group_0__2_in_rule__Path__Group_0__15125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__AbsoluteAssignment_0_1_in_rule__Path__Group_0__1__Impl5152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_0__2__Impl_in_rule__Path__Group_0__25182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Path__Group_0__2__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_2__0__Impl_in_rule__Path__Group_2__05247 = new BitSet(new long[]{0x0019000000000030L});
        public static final BitSet FOLLOW_rule__Path__Group_2__1_in_rule__Path__Group_2__05250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Path__Group_2__0__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_2__1__Impl_in_rule__Path__Group_2__15309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_2_1_in_rule__Path__Group_2__1__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__05370 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__05373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__VariableStep__Group__0__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__15432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__ValueAssignment_1_in_rule__VariableStep__Group__1__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__05493 = new BitSet(new long[]{0x0019000000000030L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__05496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__15554 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__15557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__ParametrizedStep__Group__1__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__25616 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__3_in_rule__ParametrizedStep__Group__25619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__3__Impl_in_rule__ParametrizedStep__Group__35676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__ParametrizedStep__Group__3__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__05743 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__05746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Selection__Group__0__Impl5774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__15805 = new BitSet(new long[]{0x0019000000000030L});
        public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__15808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Selection__Group__1__Impl5836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__25867 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__25870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__FromAssignment_2_in_rule__Selection__Group__2__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__35927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_3__0_in_rule__Selection__Group__3__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_3__0__Impl_in_rule__Selection__Group_3__05993 = new BitSet(new long[]{0xAA00000000000000L,0x000000000000019AL});
        public static final BitSet FOLLOW_rule__Selection__Group_3__1_in_rule__Selection__Group_3__05996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Selection__Group_3__0__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_3__1__Impl_in_rule__Selection__Group_3__16055 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group_3__2_in_rule__Selection__Group_3__16058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__WhereAssignment_3_1_in_rule__Selection__Group_3__1__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_3__2__Impl_in_rule__Selection__Group_3__26115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_3_2__0_in_rule__Selection__Group_3__2__Impl6142 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_3_2__0__Impl_in_rule__Selection__Group_3_2__06179 = new BitSet(new long[]{0xAA00000000000000L,0x000000000000019AL});
        public static final BitSet FOLLOW_rule__Selection__Group_3_2__1_in_rule__Selection__Group_3_2__06182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Selection__Group_3_2__0__Impl6210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_3_2__1__Impl_in_rule__Selection__Group_3_2__16241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__WhereAssignment_3_2_1_in_rule__Selection__Group_3_2__1__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__06302 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__06305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__16363 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__16366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__OnName__Group__1__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__26425 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__26428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__OnName__Group__2__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__36487 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__4_in_rule__OnName__Group__36490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__NameAssignment_3_in_rule__OnName__Group__3__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__4__Impl_in_rule__OnName__Group__46547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__0_in_rule__OnName__Group__4__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__0__Impl_in_rule__OnName__Group_4__06615 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__1_in_rule__OnName__Group_4__06618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnName__Group_4__0__Impl6646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group_4__1__Impl_in_rule__OnName__Group_4__16677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__TrueFalseSearchAssignment_4_1_in_rule__OnName__Group_4__1__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__06738 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__06741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__16799 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__16802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__OnExtension__Group__1__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__26861 = new BitSet(new long[]{0x0002000000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__26864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__OnExtension__Group__2__Impl6892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__36923 = new BitSet(new long[]{0x0002000000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__36926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__0_in_rule__OnExtension__Group__3__Impl6953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__46984 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__46987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__OnExtension__Group__4__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__57046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_5__0_in_rule__OnExtension__Group__5__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__0__Impl_in_rule__OnExtension__Group_3__07116 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__1_in_rule__OnExtension__Group_3__07119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_3_0_in_rule__OnExtension__Group_3__0__Impl7146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3__1__Impl_in_rule__OnExtension__Group_3__17176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3_1__0_in_rule__OnExtension__Group_3__1__Impl7203 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3_1__0__Impl_in_rule__OnExtension__Group_3_1__07238 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3_1__1_in_rule__OnExtension__Group_3_1__07241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__OnExtension__Group_3_1__0__Impl7269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_3_1__1__Impl_in_rule__OnExtension__Group_3_1__17300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_3_1_1_in_rule__OnExtension__Group_3_1__1__Impl7327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_5__0__Impl_in_rule__OnExtension__Group_5__07361 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_5__1_in_rule__OnExtension__Group_5__07364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnExtension__Group_5__0__Impl7392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_5__1__Impl_in_rule__OnExtension__Group_5__17423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__TrueFalseSearchAssignment_5_1_in_rule__OnExtension__Group_5__1__Impl7450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__07484 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__07487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__OnTime__Group__0__Impl7515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__17546 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__17549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnTime__Group__1__Impl7577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__27608 = new BitSet(new long[]{0x00000000001F0000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__27611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TimeOfAssignment_2_in_rule__OnTime__Group__2__Impl7638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__37668 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__37671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__OperatorAssignment_3_in_rule__OnTime__Group__3__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__47728 = new BitSet(new long[]{0x0000000007E00000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__5_in_rule__OnTime__Group__47731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TresholdAssignment_4_in_rule__OnTime__Group__4__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__5__Impl_in_rule__OnTime__Group__57788 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__6_in_rule__OnTime__Group__57791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__UnitAssignment_5_in_rule__OnTime__Group__5__Impl7818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__6__Impl_in_rule__OnTime__Group__67848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group_6__0_in_rule__OnTime__Group__6__Impl7875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group_6__0__Impl_in_rule__OnTime__Group_6__07920 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnTime__Group_6__1_in_rule__OnTime__Group_6__07923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnTime__Group_6__0__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group_6__1__Impl_in_rule__OnTime__Group_6__17982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TrueFalseSearchAssignment_6_1_in_rule__OnTime__Group_6__1__Impl8009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__08043 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__08046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__OnAttributes__Group__0__Impl8074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__18105 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__18108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl8135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__28165 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__3_in_rule__OnAttributes__Group__28168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2__0_in_rule__OnAttributes__Group__2__Impl8195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__3__Impl_in_rule__OnAttributes__Group__38226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__0_in_rule__OnAttributes__Group__3__Impl8253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2__0__Impl_in_rule__OnAttributes__Group_2__08292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2__1_in_rule__OnAttributes__Group_2__08295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__OnAttributes__Group_2__0__Impl8323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2__1__Impl_in_rule__OnAttributes__Group_2__18354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__ValueAssignment_2_1_in_rule__OnAttributes__Group_2__1__Impl8381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__0__Impl_in_rule__OnAttributes__Group_3__08415 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__1_in_rule__OnAttributes__Group_3__08418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnAttributes__Group_3__0__Impl8446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_3__1__Impl_in_rule__OnAttributes__Group_3__18477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__TrueFalseSearchAssignment_3_1_in_rule__OnAttributes__Group_3__1__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__08538 = new BitSet(new long[]{0x0002000000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__08541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__OnTags__Group__0__Impl8569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__18600 = new BitSet(new long[]{0x0002000000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__18603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__0_in_rule__OnTags__Group__1__Impl8630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__28661 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__28664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__OnTags__Group__2__Impl8692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__38723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__38726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TresholdAssignment_3_in_rule__OnTags__Group__3__Impl8753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__48783 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__48786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__OnTags__Group__4__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__58845 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__58848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__OnlyAssignment_5_in_rule__OnTags__Group__5__Impl8875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__68906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_6__0_in_rule__OnTags__Group__6__Impl8933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__0__Impl_in_rule__OnTags__Group_1__08978 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__1_in_rule__OnTags__Group_1__08981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_1_0_in_rule__OnTags__Group_1__0__Impl9008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__1__Impl_in_rule__OnTags__Group_1__19038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__0_in_rule__OnTags__Group_1__1__Impl9065 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__0__Impl_in_rule__OnTags__Group_1_1__09100 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__1_in_rule__OnTags__Group_1_1__09103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__OnTags__Group_1_1__0__Impl9131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__1__Impl_in_rule__OnTags__Group_1_1__19162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_1_1_1_in_rule__OnTags__Group_1_1__1__Impl9189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_6__0__Impl_in_rule__OnTags__Group_6__09223 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnTags__Group_6__1_in_rule__OnTags__Group_6__09226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnTags__Group_6__0__Impl9254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_6__1__Impl_in_rule__OnTags__Group_6__19285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TrueFalseSearchAssignment_6_1_in_rule__OnTags__Group_6__1__Impl9312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__09346 = new BitSet(new long[]{0x00000000001F0000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__09349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__OnSize__Group__0__Impl9377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__19408 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__19411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__OperatorAssignment_1_in_rule__OnSize__Group__1__Impl9438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__29468 = new BitSet(new long[]{0x00000001E0000000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__29471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__TresholdAssignment_2_in_rule__OnSize__Group__2__Impl9498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__39528 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__39531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__UnitAssignment_3_in_rule__OnSize__Group__3__Impl9558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__49588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group_4__0_in_rule__OnSize__Group__4__Impl9615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group_4__0__Impl_in_rule__OnSize__Group_4__09656 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnSize__Group_4__1_in_rule__OnSize__Group_4__09659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnSize__Group_4__0__Impl9687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group_4__1__Impl_in_rule__OnSize__Group_4__19718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__TrueFalseSearchAssignment_4_1_in_rule__OnSize__Group_4__1__Impl9745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__09779 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__09782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__FilterContainer__Group__0__Impl9810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__19841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__19844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__CompositionTypeAssignment_1_in_rule__FilterContainer__Group__1__Impl9871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__29901 = new BitSet(new long[]{0xAA00000000000000L,0x000000000000019AL});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__29904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__FilterContainer__Group__2__Impl9932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__39963 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__4_in_rule__FilterContainer__Group__39966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__SegmentsAssignment_3_in_rule__FilterContainer__Group__3__Impl9993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__4__Impl_in_rule__FilterContainer__Group__410023 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__5_in_rule__FilterContainer__Group__410026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_4__0_in_rule__FilterContainer__Group__4__Impl10053 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__5__Impl_in_rule__FilterContainer__Group__510084 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__6_in_rule__FilterContainer__Group__510087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__FilterContainer__Group__5__Impl10115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__6__Impl_in_rule__FilterContainer__Group__610146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__FilterContainer__Group__6__Impl10174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_4__0__Impl_in_rule__FilterContainer__Group_4__010219 = new BitSet(new long[]{0xAA00000000000000L,0x000000000000019AL});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_4__1_in_rule__FilterContainer__Group_4__010222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__FilterContainer__Group_4__0__Impl10250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group_4__1__Impl_in_rule__FilterContainer__Group_4__110281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__SegmentsAssignment_4_1_in_rule__FilterContainer__Group_4__1__Impl10308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__010342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__010345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__110403 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__110406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rule__IsEmpty__Group__1__Impl10434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__210465 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__210468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__IsEmpty__Group__2__Impl10496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__310527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__TrueFalseSearchAssignment_3_in_rule__IsEmpty__Group__3__Impl10554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__010593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__010596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rule__OnType__Group__0__Impl10624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__110655 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__110658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__OnType__Group__1__Impl10686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__210717 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__210720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__TypeAssignment_2_in_rule__OnType__Group__2__Impl10747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__310777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group_3__0_in_rule__OnType__Group__3__Impl10804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group_3__0__Impl_in_rule__OnType__Group_3__010843 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__OnType__Group_3__1_in_rule__OnType__Group_3__010846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnType__Group_3__0__Impl10874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group_3__1__Impl_in_rule__OnType__Group_3__110905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__TrueFalseSearchAssignment_3_1_in_rule__OnType__Group_3__1__Impl10932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__010966 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__010969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rule__EInt__Group__0__Impl10998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl11058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_111096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_2_111127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_211162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_411197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_5_111228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Move__SourceAssignment_211263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Move__DestinationAssignment_411298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_5_111329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_211364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_011399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_211430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SelectionVariable__NameAssignment_111461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_rule__SelectionVariable__ValueAssignment_311492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__Path__AbsoluteAssignment_0_111523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_111554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_2_111585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment11616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_111651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_211686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Selection__FromAssignment_211717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_3_111748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_3_2_111779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnName__NameAssignment_311810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnName__TrueFalseSearchAssignment_4_111841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_3_011872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_3_1_111903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnExtension__TrueFalseSearchAssignment_5_111934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_211965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_311996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_412027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_512058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnTime__TrueFalseSearchAssignment_6_112089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_112120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_2_112151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnAttributes__TrueFalseSearchAssignment_3_112182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_012213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_1_112244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_312275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rule__OnTags__OnlyAssignment_512311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnTags__TrueFalseSearchAssignment_6_112350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_112381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_212412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_312443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnSize__TrueFalseSearchAssignment_4_112474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositionType_in_rule__FilterContainer__CompositionTypeAssignment_112505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_312536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__FilterContainer__SegmentsAssignment_4_112567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__IsEmpty__TrueFalseSearchAssignment_312598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_212629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__OnType__TrueFalseSearchAssignment_3_112660 = new BitSet(new long[]{0x0000000000000002L});
    }


}