package org.xtext.example.myFetl.ui.contentassist.antlr.internal; 

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
import org.xtext.example.myFetl.services.FETLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFETLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forced'", "'append'", "'carefully'", "'=='", "'<'", "'>'", "'<='", "'>='", "'mins'", "'hours'", "'days'", "'weeks'", "'months'", "'years'", "'modified'", "'created'", "'any are'", "'all are'", "'KB'", "'MB'", "'GB'", "'TB'", "'Document'", "'Directory'", "';'", "'='", "'/'", "'?'", "'{$'", "'}'", "'select'", "'from'", "'where'", "'copy'", "'to'", "'strategy:'", "'move'", "'delete'", "'('", "')'", "'attribute'", "'exist'", "'is'", "'in ['", "']'", "'in tags'", "','", "'are'", "'before'", "'size of file'", "'name is'", "'extension is'", "'empty'", "'file'", "'-'", "':'", "'and'", "'or'", "'not'", "'and no more tags'"
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g"; }


     
     	private FETLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FETLGrammarAccess grammarAccess) {
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:62:1: ruleModel EOF
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:76:2: rule__Model__Group__0
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:88:1: entryRuleExecution : ruleExecution EOF ;
    public final void entryRuleExecution() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:89:1: ( ruleExecution EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:90:1: ruleExecution EOF
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:97:1: ruleExecution : ( ( rule__Execution__Alternatives ) ) ;
    public final void ruleExecution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:101:2: ( ( ( rule__Execution__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:102:1: ( ( rule__Execution__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:102:1: ( ( rule__Execution__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:103:1: ( rule__Execution__Alternatives )
            {
             before(grammarAccess.getExecutionAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:104:1: ( rule__Execution__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:104:2: rule__Execution__Alternatives
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


    // $ANTLR start "entryRulePathVariable"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:116:1: entryRulePathVariable : rulePathVariable EOF ;
    public final void entryRulePathVariable() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:117:1: ( rulePathVariable EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:118:1: rulePathVariable EOF
            {
             before(grammarAccess.getPathVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_entryRulePathVariable181);
            rulePathVariable();

            state._fsp--;

             after(grammarAccess.getPathVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathVariable188); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:125:1: rulePathVariable : ( ( rule__PathVariable__Group__0 ) ) ;
    public final void rulePathVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:129:2: ( ( ( rule__PathVariable__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:130:1: ( ( rule__PathVariable__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:130:1: ( ( rule__PathVariable__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:131:1: ( rule__PathVariable__Group__0 )
            {
             before(grammarAccess.getPathVariableAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:132:1: ( rule__PathVariable__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:132:2: rule__PathVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__0_in_rulePathVariable214);
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


    // $ANTLR start "entryRulePath"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:144:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:145:1: ( rulePath EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:146:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_entryRulePath241);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePath248); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:153:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:157:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:158:1: ( ( rule__Path__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:158:1: ( ( rule__Path__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:159:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:160:1: ( rule__Path__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:160:2: rule__Path__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__0_in_rulePath274);
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


    // $ANTLR start "entryRuleGenericStep"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:172:1: entryRuleGenericStep : ruleGenericStep EOF ;
    public final void entryRuleGenericStep() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:173:1: ( ruleGenericStep EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:174:1: ruleGenericStep EOF
            {
             before(grammarAccess.getGenericStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_entryRuleGenericStep301);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getGenericStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGenericStep308); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:181:1: ruleGenericStep : ( ( rule__GenericStep__Alternatives ) ) ;
    public final void ruleGenericStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:185:2: ( ( ( rule__GenericStep__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:186:1: ( ( rule__GenericStep__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:186:1: ( ( rule__GenericStep__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:187:1: ( rule__GenericStep__Alternatives )
            {
             before(grammarAccess.getGenericStepAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:188:1: ( rule__GenericStep__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:188:2: rule__GenericStep__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GenericStep__Alternatives_in_ruleGenericStep334);
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


    // $ANTLR start "entryRuleConcreteStep"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:200:1: entryRuleConcreteStep : ruleConcreteStep EOF ;
    public final void entryRuleConcreteStep() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:201:1: ( ruleConcreteStep EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:202:1: ruleConcreteStep EOF
            {
             before(grammarAccess.getConcreteStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep361);
            ruleConcreteStep();

            state._fsp--;

             after(grammarAccess.getConcreteStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConcreteStep368); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:209:1: ruleConcreteStep : ( ( rule__ConcreteStep__Group__0 ) ) ;
    public final void ruleConcreteStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:213:2: ( ( ( rule__ConcreteStep__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:214:1: ( ( rule__ConcreteStep__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:214:1: ( ( rule__ConcreteStep__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:215:1: ( rule__ConcreteStep__Group__0 )
            {
             before(grammarAccess.getConcreteStepAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:216:1: ( rule__ConcreteStep__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:216:2: rule__ConcreteStep__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__0_in_ruleConcreteStep394);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:228:1: entryRuleVariableStep : ruleVariableStep EOF ;
    public final void entryRuleVariableStep() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:229:1: ( ruleVariableStep EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:230:1: ruleVariableStep EOF
            {
             before(grammarAccess.getVariableStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_entryRuleVariableStep421);
            ruleVariableStep();

            state._fsp--;

             after(grammarAccess.getVariableStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStep428); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:237:1: ruleVariableStep : ( ( rule__VariableStep__Group__0 ) ) ;
    public final void ruleVariableStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:241:2: ( ( ( rule__VariableStep__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:242:1: ( ( rule__VariableStep__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:242:1: ( ( rule__VariableStep__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:243:1: ( rule__VariableStep__Group__0 )
            {
             before(grammarAccess.getVariableStepAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:244:1: ( rule__VariableStep__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:244:2: rule__VariableStep__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__0_in_ruleVariableStep454);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:256:1: entryRuleParametrizedStep : ruleParametrizedStep EOF ;
    public final void entryRuleParametrizedStep() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:257:1: ( ruleParametrizedStep EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:258:1: ruleParametrizedStep EOF
            {
             before(grammarAccess.getParametrizedStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep481);
            ruleParametrizedStep();

            state._fsp--;

             after(grammarAccess.getParametrizedStepRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametrizedStep488); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:265:1: ruleParametrizedStep : ( ( rule__ParametrizedStep__Group__0 ) ) ;
    public final void ruleParametrizedStep() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:269:2: ( ( ( rule__ParametrizedStep__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:270:1: ( ( rule__ParametrizedStep__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:270:1: ( ( rule__ParametrizedStep__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:271:1: ( rule__ParametrizedStep__Group__0 )
            {
             before(grammarAccess.getParametrizedStepAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:272:1: ( rule__ParametrizedStep__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:272:2: rule__ParametrizedStep__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__0_in_ruleParametrizedStep514);
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


    // $ANTLR start "entryRuleSelection"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:284:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:285:1: ( ruleSelection EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:286:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection541);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection548); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:293:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:297:2: ( ( ( rule__Selection__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:298:1: ( ( rule__Selection__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:298:1: ( ( rule__Selection__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:299:1: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:300:1: ( rule__Selection__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:300:2: rule__Selection__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__0_in_ruleSelection574);
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


    // $ANTLR start "entryRuleCopy"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:312:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:313:1: ( ruleCopy EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:314:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopy_in_entryRuleCopy601);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopy608); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:321:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:325:2: ( ( ( rule__Copy__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:326:1: ( ( rule__Copy__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:326:1: ( ( rule__Copy__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:327:1: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:328:1: ( rule__Copy__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:328:2: rule__Copy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__0_in_ruleCopy634);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:340:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:341:1: ( ruleMove EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:342:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove661);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove668); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:349:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:353:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:354:1: ( ( rule__Move__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:354:1: ( ( rule__Move__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:355:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:356:1: ( rule__Move__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:356:2: rule__Move__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0_in_ruleMove694);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:368:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:369:1: ( ruleDelete EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:370:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDelete_in_entryRuleDelete721);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelete728); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:377:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:381:2: ( ( ( rule__Delete__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:382:1: ( ( rule__Delete__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:382:1: ( ( rule__Delete__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:383:1: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:384:1: ( rule__Delete__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:384:2: rule__Delete__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__0_in_ruleDelete754);
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


    // $ANTLR start "entryRuleFilterContainer"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:396:1: entryRuleFilterContainer : ruleFilterContainer EOF ;
    public final void entryRuleFilterContainer() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:397:1: ( ruleFilterContainer EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:398:1: ruleFilterContainer EOF
            {
             before(grammarAccess.getFilterContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer781);
            ruleFilterContainer();

            state._fsp--;

             after(grammarAccess.getFilterContainerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterContainer788); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:405:1: ruleFilterContainer : ( ( rule__FilterContainer__Group__0 ) ) ;
    public final void ruleFilterContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:409:2: ( ( ( rule__FilterContainer__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:410:1: ( ( rule__FilterContainer__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:410:1: ( ( rule__FilterContainer__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:411:1: ( rule__FilterContainer__Group__0 )
            {
             before(grammarAccess.getFilterContainerAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:412:1: ( rule__FilterContainer__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:412:2: rule__FilterContainer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__0_in_ruleFilterContainer814);
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


    // $ANTLR start "entryRuleLink"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:424:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:425:1: ( ruleLink EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:426:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink841);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink848); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:433:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:437:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:438:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:438:1: ( ( rule__Link__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:439:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:440:1: ( rule__Link__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:440:2: rule__Link__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0_in_ruleLink874);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleFilterComponent"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:452:1: entryRuleFilterComponent : ruleFilterComponent EOF ;
    public final void entryRuleFilterComponent() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:453:1: ( ruleFilterComponent EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:454:1: ruleFilterComponent EOF
            {
             before(grammarAccess.getFilterComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent901);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getFilterComponentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFilterComponent908); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:461:1: ruleFilterComponent : ( ( rule__FilterComponent__Alternatives ) ) ;
    public final void ruleFilterComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:465:2: ( ( ( rule__FilterComponent__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:466:1: ( ( rule__FilterComponent__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:466:1: ( ( rule__FilterComponent__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:467:1: ( rule__FilterComponent__Alternatives )
            {
             before(grammarAccess.getFilterComponentAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:468:1: ( rule__FilterComponent__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:468:2: rule__FilterComponent__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterComponent__Alternatives_in_ruleFilterComponent934);
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


    // $ANTLR start "entryRuleOnAttributes"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:480:1: entryRuleOnAttributes : ruleOnAttributes EOF ;
    public final void entryRuleOnAttributes() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:481:1: ( ruleOnAttributes EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:482:1: ruleOnAttributes EOF
            {
             before(grammarAccess.getOnAttributesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes961);
            ruleOnAttributes();

            state._fsp--;

             after(grammarAccess.getOnAttributesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnAttributes968); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:489:1: ruleOnAttributes : ( ( rule__OnAttributes__Group__0 ) ) ;
    public final void ruleOnAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:493:2: ( ( ( rule__OnAttributes__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:494:1: ( ( rule__OnAttributes__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:494:1: ( ( rule__OnAttributes__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:495:1: ( rule__OnAttributes__Group__0 )
            {
             before(grammarAccess.getOnAttributesAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:496:1: ( rule__OnAttributes__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:496:2: rule__OnAttributes__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__0_in_ruleOnAttributes994);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:508:1: entryRuleOnTags : ruleOnTags EOF ;
    public final void entryRuleOnTags() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:509:1: ( ruleOnTags EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:510:1: ruleOnTags EOF
            {
             before(grammarAccess.getOnTagsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_entryRuleOnTags1021);
            ruleOnTags();

            state._fsp--;

             after(grammarAccess.getOnTagsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTags1028); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:517:1: ruleOnTags : ( ( rule__OnTags__Group__0 ) ) ;
    public final void ruleOnTags() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:521:2: ( ( ( rule__OnTags__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:522:1: ( ( rule__OnTags__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:522:1: ( ( rule__OnTags__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:523:1: ( rule__OnTags__Group__0 )
            {
             before(grammarAccess.getOnTagsAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:524:1: ( rule__OnTags__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:524:2: rule__OnTags__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__0_in_ruleOnTags1054);
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


    // $ANTLR start "entryRuleOnTime"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:536:1: entryRuleOnTime : ruleOnTime EOF ;
    public final void entryRuleOnTime() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:537:1: ( ruleOnTime EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:538:1: ruleOnTime EOF
            {
             before(grammarAccess.getOnTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_entryRuleOnTime1081);
            ruleOnTime();

            state._fsp--;

             after(grammarAccess.getOnTimeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnTime1088); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:545:1: ruleOnTime : ( ( rule__OnTime__Group__0 ) ) ;
    public final void ruleOnTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:549:2: ( ( ( rule__OnTime__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:550:1: ( ( rule__OnTime__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:550:1: ( ( rule__OnTime__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:551:1: ( rule__OnTime__Group__0 )
            {
             before(grammarAccess.getOnTimeAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:552:1: ( rule__OnTime__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:552:2: rule__OnTime__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__0_in_ruleOnTime1114);
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


    // $ANTLR start "entryRuleOnSize"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:564:1: entryRuleOnSize : ruleOnSize EOF ;
    public final void entryRuleOnSize() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:565:1: ( ruleOnSize EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:566:1: ruleOnSize EOF
            {
             before(grammarAccess.getOnSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_entryRuleOnSize1141);
            ruleOnSize();

            state._fsp--;

             after(grammarAccess.getOnSizeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnSize1148); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:573:1: ruleOnSize : ( ( rule__OnSize__Group__0 ) ) ;
    public final void ruleOnSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:577:2: ( ( ( rule__OnSize__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:578:1: ( ( rule__OnSize__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:578:1: ( ( rule__OnSize__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:579:1: ( rule__OnSize__Group__0 )
            {
             before(grammarAccess.getOnSizeAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:580:1: ( rule__OnSize__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:580:2: rule__OnSize__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__0_in_ruleOnSize1174);
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


    // $ANTLR start "entryRuleOnName"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:592:1: entryRuleOnName : ruleOnName EOF ;
    public final void entryRuleOnName() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:593:1: ( ruleOnName EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:594:1: ruleOnName EOF
            {
             before(grammarAccess.getOnNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnName_in_entryRuleOnName1201);
            ruleOnName();

            state._fsp--;

             after(grammarAccess.getOnNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnName1208); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:601:1: ruleOnName : ( ( rule__OnName__Group__0 ) ) ;
    public final void ruleOnName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:605:2: ( ( ( rule__OnName__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:606:1: ( ( rule__OnName__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:606:1: ( ( rule__OnName__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:607:1: ( rule__OnName__Group__0 )
            {
             before(grammarAccess.getOnNameAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:608:1: ( rule__OnName__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:608:2: rule__OnName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__0_in_ruleOnName1234);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:620:1: entryRuleOnExtension : ruleOnExtension EOF ;
    public final void entryRuleOnExtension() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:621:1: ( ruleOnExtension EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:622:1: ruleOnExtension EOF
            {
             before(grammarAccess.getOnExtensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_entryRuleOnExtension1261);
            ruleOnExtension();

            state._fsp--;

             after(grammarAccess.getOnExtensionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnExtension1268); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:629:1: ruleOnExtension : ( ( rule__OnExtension__Group__0 ) ) ;
    public final void ruleOnExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:633:2: ( ( ( rule__OnExtension__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:634:1: ( ( rule__OnExtension__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:634:1: ( ( rule__OnExtension__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:635:1: ( rule__OnExtension__Group__0 )
            {
             before(grammarAccess.getOnExtensionAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:636:1: ( rule__OnExtension__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:636:2: rule__OnExtension__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__0_in_ruleOnExtension1294);
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


    // $ANTLR start "entryRuleIsEmpty"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:648:1: entryRuleIsEmpty : ruleIsEmpty EOF ;
    public final void entryRuleIsEmpty() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:649:1: ( ruleIsEmpty EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:650:1: ruleIsEmpty EOF
            {
             before(grammarAccess.getIsEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty1321);
            ruleIsEmpty();

            state._fsp--;

             after(grammarAccess.getIsEmptyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsEmpty1328); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:657:1: ruleIsEmpty : ( ( rule__IsEmpty__Group__0 ) ) ;
    public final void ruleIsEmpty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:661:2: ( ( ( rule__IsEmpty__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:662:1: ( ( rule__IsEmpty__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:662:1: ( ( rule__IsEmpty__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:663:1: ( rule__IsEmpty__Group__0 )
            {
             before(grammarAccess.getIsEmptyAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:664:1: ( rule__IsEmpty__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:664:2: rule__IsEmpty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__0_in_ruleIsEmpty1354);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:676:1: entryRuleOnType : ruleOnType EOF ;
    public final void entryRuleOnType() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:677:1: ( ruleOnType EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:678:1: ruleOnType EOF
            {
             before(grammarAccess.getOnTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnType_in_entryRuleOnType1381);
            ruleOnType();

            state._fsp--;

             after(grammarAccess.getOnTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnType1388); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:685:1: ruleOnType : ( ( rule__OnType__Group__0 ) ) ;
    public final void ruleOnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:689:2: ( ( ( rule__OnType__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:690:1: ( ( rule__OnType__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:690:1: ( ( rule__OnType__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:691:1: ( rule__OnType__Group__0 )
            {
             before(grammarAccess.getOnTypeAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:692:1: ( rule__OnType__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:692:2: rule__OnType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__0_in_ruleOnType1414);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:704:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:705:1: ( ruleEInt EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:706:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1441);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1448); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:713:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:717:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:718:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:718:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:719:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:720:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:720:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1474);
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:734:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:735:1: ( ruleEString EOF )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:736:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1503);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1510); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:743:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:747:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:748:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:748:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:749:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:750:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:750:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1536);
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


    // $ANTLR start "ruleStrategies"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:763:1: ruleStrategies : ( ( rule__Strategies__Alternatives ) ) ;
    public final void ruleStrategies() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:767:1: ( ( ( rule__Strategies__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:768:1: ( ( rule__Strategies__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:768:1: ( ( rule__Strategies__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:769:1: ( rule__Strategies__Alternatives )
            {
             before(grammarAccess.getStrategiesAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:770:1: ( rule__Strategies__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:770:2: rule__Strategies__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Strategies__Alternatives_in_ruleStrategies1573);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:782:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:786:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:787:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:787:1: ( ( rule__Operator__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:788:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:789:1: ( rule__Operator__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:789:2: rule__Operator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operator__Alternatives_in_ruleOperator1609);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:801:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:805:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:806:1: ( ( rule__TimeUnit__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:806:1: ( ( rule__TimeUnit__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:807:1: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:808:1: ( rule__TimeUnit__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:808:2: rule__TimeUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit1645);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:820:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:824:1: ( ( ( rule__TimeType__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:825:1: ( ( rule__TimeType__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:825:1: ( ( rule__TimeType__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:826:1: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:827:1: ( rule__TimeType__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:827:2: rule__TimeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeType__Alternatives_in_ruleTimeType1681);
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


    // $ANTLR start "ruleQuantificators"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:839:1: ruleQuantificators : ( ( rule__Quantificators__Alternatives ) ) ;
    public final void ruleQuantificators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:843:1: ( ( ( rule__Quantificators__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:844:1: ( ( rule__Quantificators__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:844:1: ( ( rule__Quantificators__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:845:1: ( rule__Quantificators__Alternatives )
            {
             before(grammarAccess.getQuantificatorsAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:846:1: ( rule__Quantificators__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:846:2: rule__Quantificators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quantificators__Alternatives_in_ruleQuantificators1717);
            rule__Quantificators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantificatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantificators"


    // $ANTLR start "ruleMemoryUnit"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:858:1: ruleMemoryUnit : ( ( rule__MemoryUnit__Alternatives ) ) ;
    public final void ruleMemoryUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:862:1: ( ( ( rule__MemoryUnit__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:863:1: ( ( rule__MemoryUnit__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:863:1: ( ( rule__MemoryUnit__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:864:1: ( rule__MemoryUnit__Alternatives )
            {
             before(grammarAccess.getMemoryUnitAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:865:1: ( rule__MemoryUnit__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:865:2: rule__MemoryUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MemoryUnit__Alternatives_in_ruleMemoryUnit1753);
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


    // $ANTLR start "ruleFileType"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:877:1: ruleFileType : ( ( rule__FileType__Alternatives ) ) ;
    public final void ruleFileType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:881:1: ( ( ( rule__FileType__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:882:1: ( ( rule__FileType__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:882:1: ( ( rule__FileType__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:883:1: ( rule__FileType__Alternatives )
            {
             before(grammarAccess.getFileTypeAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:884:1: ( rule__FileType__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:884:2: rule__FileType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FileType__Alternatives_in_ruleFileType1789);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:895:1: rule__Execution__Alternatives : ( ( ruleSelection ) | ( ruleCopy ) | ( ruleMove ) | ( ruleDelete ) | ( rulePathVariable ) );
    public final void rule__Execution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:899:1: ( ( ruleSelection ) | ( ruleCopy ) | ( ruleMove ) | ( ruleDelete ) | ( rulePathVariable ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case 44:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 48:
                {
                alt1=4;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
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
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:900:1: ( ruleSelection )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:900:1: ( ruleSelection )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:901:1: ruleSelection
                    {
                     before(grammarAccess.getExecutionAccess().getSelectionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSelection_in_rule__Execution__Alternatives1824);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getSelectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:906:6: ( ruleCopy )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:906:6: ( ruleCopy )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:907:1: ruleCopy
                    {
                     before(grammarAccess.getExecutionAccess().getCopyParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCopy_in_rule__Execution__Alternatives1841);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getCopyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:912:6: ( ruleMove )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:912:6: ( ruleMove )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:913:1: ruleMove
                    {
                     before(grammarAccess.getExecutionAccess().getMoveParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Execution__Alternatives1858);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getMoveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:918:6: ( ruleDelete )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:918:6: ( ruleDelete )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:919:1: ruleDelete
                    {
                     before(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDelete_in_rule__Execution__Alternatives1875);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:924:6: ( rulePathVariable )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:924:6: ( rulePathVariable )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:925:1: rulePathVariable
                    {
                     before(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_rule__Execution__Alternatives1892);
                    rulePathVariable();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_4()); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:935:1: rule__GenericStep__Alternatives : ( ( ruleConcreteStep ) | ( ruleVariableStep ) | ( ruleParametrizedStep ) );
    public final void rule__GenericStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:939:1: ( ( ruleConcreteStep ) | ( ruleVariableStep ) | ( ruleParametrizedStep ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                alt2=2;
                }
                break;
            case 39:
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
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:940:1: ( ruleConcreteStep )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:940:1: ( ruleConcreteStep )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:941:1: ruleConcreteStep
                    {
                     before(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_rule__GenericStep__Alternatives1924);
                    ruleConcreteStep();

                    state._fsp--;

                     after(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:946:6: ( ruleVariableStep )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:946:6: ( ruleVariableStep )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:947:1: ruleVariableStep
                    {
                     before(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_rule__GenericStep__Alternatives1941);
                    ruleVariableStep();

                    state._fsp--;

                     after(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:952:6: ( ruleParametrizedStep )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:952:6: ( ruleParametrizedStep )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:953:1: ruleParametrizedStep
                    {
                     before(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_rule__GenericStep__Alternatives1958);
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


    // $ANTLR start "rule__Link__Alternatives_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:963:1: rule__Link__Alternatives_0 : ( ( ( rule__Link__AndAssignment_0_0 ) ) | ( ( rule__Link__OrAssignment_0_1 ) ) );
    public final void rule__Link__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:967:1: ( ( ( rule__Link__AndAssignment_0_0 ) ) | ( ( rule__Link__OrAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==67) ) {
                alt3=1;
            }
            else if ( (LA3_0==68) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:968:1: ( ( rule__Link__AndAssignment_0_0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:968:1: ( ( rule__Link__AndAssignment_0_0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:969:1: ( rule__Link__AndAssignment_0_0 )
                    {
                     before(grammarAccess.getLinkAccess().getAndAssignment_0_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:970:1: ( rule__Link__AndAssignment_0_0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:970:2: rule__Link__AndAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Link__AndAssignment_0_0_in_rule__Link__Alternatives_01990);
                    rule__Link__AndAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getAndAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:974:6: ( ( rule__Link__OrAssignment_0_1 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:974:6: ( ( rule__Link__OrAssignment_0_1 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:975:1: ( rule__Link__OrAssignment_0_1 )
                    {
                     before(grammarAccess.getLinkAccess().getOrAssignment_0_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:976:1: ( rule__Link__OrAssignment_0_1 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:976:2: rule__Link__OrAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Link__OrAssignment_0_1_in_rule__Link__Alternatives_02008);
                    rule__Link__OrAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getOrAssignment_0_1()); 

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
    // $ANTLR end "rule__Link__Alternatives_0"


    // $ANTLR start "rule__FilterComponent__Alternatives"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:985:1: rule__FilterComponent__Alternatives : ( ( ruleOnName ) | ( ruleOnExtension ) | ( ruleOnTime ) | ( ruleOnAttributes ) | ( ruleOnTags ) | ( ruleOnSize ) | ( ruleFilterContainer ) | ( ruleIsEmpty ) | ( ruleOnType ) );
    public final void rule__FilterComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:989:1: ( ( ruleOnName ) | ( ruleOnExtension ) | ( ruleOnTime ) | ( ruleOnAttributes ) | ( ruleOnTags ) | ( ruleOnSize ) | ( ruleFilterContainer ) | ( ruleIsEmpty ) | ( ruleOnType ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt4=1;
                }
                break;
            case 62:
                {
                alt4=2;
                }
                break;
            case 25:
            case 26:
                {
                alt4=3;
                }
                break;
            case 51:
                {
                alt4=4;
                }
                break;
            case 54:
                {
                alt4=5;
                }
                break;
            case 60:
                {
                alt4=6;
                }
                break;
            case 49:
                {
                alt4=7;
                }
                break;
            case 53:
                {
                alt4=8;
                }
                break;
            case 64:
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
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:990:1: ( ruleOnName )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:990:1: ( ruleOnName )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:991:1: ruleOnName
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_rule__FilterComponent__Alternatives2041);
                    ruleOnName();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:996:6: ( ruleOnExtension )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:996:6: ( ruleOnExtension )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:997:1: ruleOnExtension
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_rule__FilterComponent__Alternatives2058);
                    ruleOnExtension();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1002:6: ( ruleOnTime )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1002:6: ( ruleOnTime )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1003:1: ruleOnTime
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_rule__FilterComponent__Alternatives2075);
                    ruleOnTime();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1008:6: ( ruleOnAttributes )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1008:6: ( ruleOnAttributes )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1009:1: ruleOnAttributes
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_rule__FilterComponent__Alternatives2092);
                    ruleOnAttributes();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1014:6: ( ruleOnTags )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1014:6: ( ruleOnTags )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1015:1: ruleOnTags
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_rule__FilterComponent__Alternatives2109);
                    ruleOnTags();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1020:6: ( ruleOnSize )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1020:6: ( ruleOnSize )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1021:1: ruleOnSize
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_rule__FilterComponent__Alternatives2126);
                    ruleOnSize();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1026:6: ( ruleFilterContainer )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1026:6: ( ruleFilterContainer )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1027:1: ruleFilterContainer
                    {
                     before(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_rule__FilterComponent__Alternatives2143);
                    ruleFilterContainer();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1032:6: ( ruleIsEmpty )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1032:6: ( ruleIsEmpty )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1033:1: ruleIsEmpty
                    {
                     before(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_rule__FilterComponent__Alternatives2160);
                    ruleIsEmpty();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1038:6: ( ruleOnType )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1038:6: ( ruleOnType )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1039:1: ruleOnType
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_rule__FilterComponent__Alternatives2177);
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


    // $ANTLR start "rule__OnAttributes__Alternatives_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1049:1: rule__OnAttributes__Alternatives_2 : ( ( ( rule__OnAttributes__Group_2_0__0 ) ) | ( ( rule__OnAttributes__Group_2_1__0 ) ) );
    public final void rule__OnAttributes__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1053:1: ( ( ( rule__OnAttributes__Group_2_0__0 ) ) | ( ( rule__OnAttributes__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52||LA5_0==69) ) {
                alt5=1;
            }
            else if ( (LA5_0==53) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1054:1: ( ( rule__OnAttributes__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1054:1: ( ( rule__OnAttributes__Group_2_0__0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1055:1: ( rule__OnAttributes__Group_2_0__0 )
                    {
                     before(grammarAccess.getOnAttributesAccess().getGroup_2_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1056:1: ( rule__OnAttributes__Group_2_0__0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1056:2: rule__OnAttributes__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__0_in_rule__OnAttributes__Alternatives_22209);
                    rule__OnAttributes__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnAttributesAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1060:6: ( ( rule__OnAttributes__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1060:6: ( ( rule__OnAttributes__Group_2_1__0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1061:1: ( rule__OnAttributes__Group_2_1__0 )
                    {
                     before(grammarAccess.getOnAttributesAccess().getGroup_2_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1062:1: ( rule__OnAttributes__Group_2_1__0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1062:2: rule__OnAttributes__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__0_in_rule__OnAttributes__Alternatives_22227);
                    rule__OnAttributes__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnAttributesAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__OnAttributes__Alternatives_2"


    // $ANTLR start "rule__OnTags__Alternatives_3"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1071:1: rule__OnTags__Alternatives_3 : ( ( ( rule__OnTags__QuantificatorAssignment_3_0 ) ) | ( ( rule__OnTags__Group_3_1__0 ) ) );
    public final void rule__OnTags__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1075:1: ( ( ( rule__OnTags__QuantificatorAssignment_3_0 ) ) | ( ( rule__OnTags__Group_3_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=27 && LA6_0<=28)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT||LA6_0==65) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1076:1: ( ( rule__OnTags__QuantificatorAssignment_3_0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1076:1: ( ( rule__OnTags__QuantificatorAssignment_3_0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1077:1: ( rule__OnTags__QuantificatorAssignment_3_0 )
                    {
                     before(grammarAccess.getOnTagsAccess().getQuantificatorAssignment_3_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1078:1: ( rule__OnTags__QuantificatorAssignment_3_0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1078:2: rule__OnTags__QuantificatorAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__QuantificatorAssignment_3_0_in_rule__OnTags__Alternatives_32260);
                    rule__OnTags__QuantificatorAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnTagsAccess().getQuantificatorAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1082:6: ( ( rule__OnTags__Group_3_1__0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1082:6: ( ( rule__OnTags__Group_3_1__0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1083:1: ( rule__OnTags__Group_3_1__0 )
                    {
                     before(grammarAccess.getOnTagsAccess().getGroup_3_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1084:1: ( rule__OnTags__Group_3_1__0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1084:2: rule__OnTags__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__0_in_rule__OnTags__Alternatives_32278);
                    rule__OnTags__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnTagsAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__OnTags__Alternatives_3"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1094:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1098:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1099:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1099:1: ( RULE_STRING )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1100:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2312); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1105:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1105:6: ( RULE_ID )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1106:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2329); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1116:1: rule__Strategies__Alternatives : ( ( ( 'forced' ) ) | ( ( 'append' ) ) | ( ( 'carefully' ) ) );
    public final void rule__Strategies__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1120:1: ( ( ( 'forced' ) ) | ( ( 'append' ) ) | ( ( 'carefully' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
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
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1121:1: ( ( 'forced' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1121:1: ( ( 'forced' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1122:1: ( 'forced' )
                    {
                     before(grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1123:1: ( 'forced' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1123:3: 'forced'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Strategies__Alternatives2362); 

                    }

                     after(grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1128:6: ( ( 'append' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1128:6: ( ( 'append' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1129:1: ( 'append' )
                    {
                     before(grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1130:1: ( 'append' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1130:3: 'append'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Strategies__Alternatives2383); 

                    }

                     after(grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1135:6: ( ( 'carefully' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1135:6: ( ( 'carefully' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1136:1: ( 'carefully' )
                    {
                     before(grammarAccess.getStrategiesAccess().getCarefullyEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1137:1: ( 'carefully' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1137:3: 'carefully'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Strategies__Alternatives2404); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1147:1: rule__Operator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1151:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            case 18:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1152:1: ( ( '==' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1152:1: ( ( '==' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1153:1: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1154:1: ( '==' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1154:3: '=='
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Operator__Alternatives2440); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1159:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1159:6: ( ( '<' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1160:1: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1161:1: ( '<' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1161:3: '<'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Operator__Alternatives2461); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1166:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1166:6: ( ( '>' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1167:1: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1168:1: ( '>' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1168:3: '>'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Operator__Alternatives2482); 

                    }

                     after(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1173:6: ( ( '<=' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1173:6: ( ( '<=' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1174:1: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1175:1: ( '<=' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1175:3: '<='
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Operator__Alternatives2503); 

                    }

                     after(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1180:6: ( ( '>=' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1180:6: ( ( '>=' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1181:1: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getMore_equalEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1182:1: ( '>=' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1182:3: '>='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Operator__Alternatives2524); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1192:1: rule__TimeUnit__Alternatives : ( ( ( 'mins' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'months' ) ) | ( ( 'years' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1196:1: ( ( ( 'mins' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'months' ) ) | ( ( 'years' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case 23:
                {
                alt10=5;
                }
                break;
            case 24:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1197:1: ( ( 'mins' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1197:1: ( ( 'mins' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1198:1: ( 'mins' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1199:1: ( 'mins' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1199:3: 'mins'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__TimeUnit__Alternatives2560); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1204:6: ( ( 'hours' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1204:6: ( ( 'hours' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1205:1: ( 'hours' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1206:1: ( 'hours' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1206:3: 'hours'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__TimeUnit__Alternatives2581); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1211:6: ( ( 'days' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1211:6: ( ( 'days' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1212:1: ( 'days' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1213:1: ( 'days' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1213:3: 'days'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__TimeUnit__Alternatives2602); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1218:6: ( ( 'weeks' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1218:6: ( ( 'weeks' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1219:1: ( 'weeks' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1220:1: ( 'weeks' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1220:3: 'weeks'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__TimeUnit__Alternatives2623); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1225:6: ( ( 'months' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1225:6: ( ( 'months' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1226:1: ( 'months' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1227:1: ( 'months' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1227:3: 'months'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__TimeUnit__Alternatives2644); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1232:6: ( ( 'years' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1232:6: ( ( 'years' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1233:1: ( 'years' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getYearsEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1234:1: ( 'years' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1234:3: 'years'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__TimeUnit__Alternatives2665); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getYearsEnumLiteralDeclaration_5()); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1244:1: rule__TimeType__Alternatives : ( ( ( 'modified' ) ) | ( ( 'created' ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1248:1: ( ( ( 'modified' ) ) | ( ( 'created' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1249:1: ( ( 'modified' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1249:1: ( ( 'modified' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1250:1: ( 'modified' )
                    {
                     before(grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1251:1: ( 'modified' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1251:3: 'modified'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__TimeType__Alternatives2701); 

                    }

                     after(grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1256:6: ( ( 'created' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1256:6: ( ( 'created' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1257:1: ( 'created' )
                    {
                     before(grammarAccess.getTimeTypeAccess().getCreatedEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1258:1: ( 'created' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1258:3: 'created'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__TimeType__Alternatives2722); 

                    }

                     after(grammarAccess.getTimeTypeAccess().getCreatedEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__Quantificators__Alternatives"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1268:1: rule__Quantificators__Alternatives : ( ( ( 'any are' ) ) | ( ( 'all are' ) ) );
    public final void rule__Quantificators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1272:1: ( ( ( 'any are' ) ) | ( ( 'all are' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1273:1: ( ( 'any are' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1273:1: ( ( 'any are' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1274:1: ( 'any are' )
                    {
                     before(grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1275:1: ( 'any are' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1275:3: 'any are'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Quantificators__Alternatives2758); 

                    }

                     after(grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1280:6: ( ( 'all are' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1280:6: ( ( 'all are' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1281:1: ( 'all are' )
                    {
                     before(grammarAccess.getQuantificatorsAccess().getAllEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1282:1: ( 'all are' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1282:3: 'all are'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Quantificators__Alternatives2779); 

                    }

                     after(grammarAccess.getQuantificatorsAccess().getAllEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Quantificators__Alternatives"


    // $ANTLR start "rule__MemoryUnit__Alternatives"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1292:1: rule__MemoryUnit__Alternatives : ( ( ( 'KB' ) ) | ( ( 'MB' ) ) | ( ( 'GB' ) ) | ( ( 'TB' ) ) );
    public final void rule__MemoryUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1296:1: ( ( ( 'KB' ) ) | ( ( 'MB' ) ) | ( ( 'GB' ) ) | ( ( 'TB' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1297:1: ( ( 'KB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1297:1: ( ( 'KB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1298:1: ( 'KB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1299:1: ( 'KB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1299:3: 'KB'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__MemoryUnit__Alternatives2815); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1304:6: ( ( 'MB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1304:6: ( ( 'MB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1305:1: ( 'MB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1306:1: ( 'MB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1306:3: 'MB'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__MemoryUnit__Alternatives2836); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1311:6: ( ( 'GB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1311:6: ( ( 'GB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1312:1: ( 'GB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1313:1: ( 'GB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1313:3: 'GB'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__MemoryUnit__Alternatives2857); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1318:6: ( ( 'TB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1318:6: ( ( 'TB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1319:1: ( 'TB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getTBEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1320:1: ( 'TB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1320:3: 'TB'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__MemoryUnit__Alternatives2878); 

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


    // $ANTLR start "rule__FileType__Alternatives"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1330:1: rule__FileType__Alternatives : ( ( ( 'Document' ) ) | ( ( 'Directory' ) ) );
    public final void rule__FileType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1334:1: ( ( ( 'Document' ) ) | ( ( 'Directory' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1335:1: ( ( 'Document' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1335:1: ( ( 'Document' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1336:1: ( 'Document' )
                    {
                     before(grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1337:1: ( 'Document' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1337:3: 'Document'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__FileType__Alternatives2914); 

                    }

                     after(grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1342:6: ( ( 'Directory' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1342:6: ( ( 'Directory' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1343:1: ( 'Directory' )
                    {
                     before(grammarAccess.getFileTypeAccess().getDirectoryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1344:1: ( 'Directory' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1344:3: 'Directory'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__FileType__Alternatives2935); 

                    }

                     after(grammarAccess.getFileTypeAccess().getDirectoryEnumLiteralDeclaration_1()); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1356:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1360:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1361:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02968);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02971);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1368:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1372:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1373:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1373:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1374:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1375:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1377:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1387:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1391:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1392:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13029);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13032);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1399:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExecutionsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1403:1: ( ( ( rule__Model__ExecutionsAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1404:1: ( ( rule__Model__ExecutionsAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1404:1: ( ( rule__Model__ExecutionsAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1405:1: ( rule__Model__ExecutionsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1406:1: ( rule__Model__ExecutionsAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1406:2: rule__Model__ExecutionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_1_in_rule__Model__Group__1__Impl3059);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1416:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1420:1: ( rule__Model__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1421:2: rule__Model__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23089);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1427:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1431:1: ( ( ( rule__Model__Group_2__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1432:1: ( ( rule__Model__Group_2__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1432:1: ( ( rule__Model__Group_2__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1433:1: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1434:1: ( rule__Model__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1434:2: rule__Model__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl3116);
            	    rule__Model__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1450:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1454:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1455:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__03153);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__03156);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1462:1: rule__Model__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1466:1: ( ( ';' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1467:1: ( ';' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1467:1: ( ';' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1468:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Model__Group_2__0__Impl3184); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1481:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1485:1: ( rule__Model__Group_2__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1486:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__13215);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1492:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__ExecutionsAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1496:1: ( ( ( rule__Model__ExecutionsAssignment_2_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1497:1: ( ( rule__Model__ExecutionsAssignment_2_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1497:1: ( ( rule__Model__ExecutionsAssignment_2_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1498:1: ( rule__Model__ExecutionsAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_2_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1499:1: ( rule__Model__ExecutionsAssignment_2_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1499:2: rule__Model__ExecutionsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_2_1_in_rule__Model__Group_2__1__Impl3242);
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


    // $ANTLR start "rule__PathVariable__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1513:1: rule__PathVariable__Group__0 : rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 ;
    public final void rule__PathVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1517:1: ( rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1518:2: rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__03276);
            rule__PathVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__03279);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1525:1: rule__PathVariable__Group__0__Impl : ( ( rule__PathVariable__NameAssignment_0 ) ) ;
    public final void rule__PathVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1529:1: ( ( ( rule__PathVariable__NameAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1530:1: ( ( rule__PathVariable__NameAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1530:1: ( ( rule__PathVariable__NameAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1531:1: ( rule__PathVariable__NameAssignment_0 )
            {
             before(grammarAccess.getPathVariableAccess().getNameAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1532:1: ( rule__PathVariable__NameAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1532:2: rule__PathVariable__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__NameAssignment_0_in_rule__PathVariable__Group__0__Impl3306);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1542:1: rule__PathVariable__Group__1 : rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 ;
    public final void rule__PathVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1546:1: ( rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1547:2: rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__13336);
            rule__PathVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__13339);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1554:1: rule__PathVariable__Group__1__Impl : ( '=' ) ;
    public final void rule__PathVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1558:1: ( ( '=' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1559:1: ( '=' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1559:1: ( '=' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1560:1: '='
            {
             before(grammarAccess.getPathVariableAccess().getEqualsSignKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__PathVariable__Group__1__Impl3367); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1573:1: rule__PathVariable__Group__2 : rule__PathVariable__Group__2__Impl ;
    public final void rule__PathVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1577:1: ( rule__PathVariable__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1578:2: rule__PathVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__23398);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1584:1: rule__PathVariable__Group__2__Impl : ( ( rule__PathVariable__ValueAssignment_2 ) ) ;
    public final void rule__PathVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1588:1: ( ( ( rule__PathVariable__ValueAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1589:1: ( ( rule__PathVariable__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1589:1: ( ( rule__PathVariable__ValueAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1590:1: ( rule__PathVariable__ValueAssignment_2 )
            {
             before(grammarAccess.getPathVariableAccess().getValueAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1591:1: ( rule__PathVariable__ValueAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1591:2: rule__PathVariable__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__ValueAssignment_2_in_rule__PathVariable__Group__2__Impl3425);
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


    // $ANTLR start "rule__Path__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1607:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1611:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1612:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__03461);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1_in_rule__Path__Group__03464);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1619:1: rule__Path__Group__0__Impl : ( ( rule__Path__StepsAssignment_0 ) ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1623:1: ( ( ( rule__Path__StepsAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1624:1: ( ( rule__Path__StepsAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1624:1: ( ( rule__Path__StepsAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1625:1: ( rule__Path__StepsAssignment_0 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1626:1: ( rule__Path__StepsAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1626:2: rule__Path__StepsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_0_in_rule__Path__Group__0__Impl3491);
            rule__Path__StepsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getStepsAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1636:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1640:1: ( rule__Path__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1641:2: rule__Path__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__13521);
            rule__Path__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1647:1: rule__Path__Group__1__Impl : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1651:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1652:1: ( ( rule__Path__Group_1__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1652:1: ( ( rule__Path__Group_1__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1653:1: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1654:1: ( rule__Path__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1654:2: rule__Path__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl3548);
            	    rule__Path__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Path__Group_1__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1668:1: rule__Path__Group_1__0 : rule__Path__Group_1__0__Impl rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1672:1: ( rule__Path__Group_1__0__Impl rule__Path__Group_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1673:2: rule__Path__Group_1__0__Impl rule__Path__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__03583);
            rule__Path__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__03586);
            rule__Path__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__0"


    // $ANTLR start "rule__Path__Group_1__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1680:1: rule__Path__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1684:1: ( ( '/' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1685:1: ( '/' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1685:1: ( '/' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1686:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Path__Group_1__0__Impl3614); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__0__Impl"


    // $ANTLR start "rule__Path__Group_1__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1699:1: rule__Path__Group_1__1 : rule__Path__Group_1__1__Impl ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1703:1: ( rule__Path__Group_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1704:2: rule__Path__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__13645);
            rule__Path__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__1"


    // $ANTLR start "rule__Path__Group_1__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1710:1: rule__Path__Group_1__1__Impl : ( ( rule__Path__StepsAssignment_1_1 ) ) ;
    public final void rule__Path__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1714:1: ( ( ( rule__Path__StepsAssignment_1_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1715:1: ( ( rule__Path__StepsAssignment_1_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1715:1: ( ( rule__Path__StepsAssignment_1_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1716:1: ( rule__Path__StepsAssignment_1_1 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1717:1: ( rule__Path__StepsAssignment_1_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1717:2: rule__Path__StepsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_1_1_in_rule__Path__Group_1__1__Impl3672);
            rule__Path__StepsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getStepsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__1__Impl"


    // $ANTLR start "rule__ConcreteStep__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1731:1: rule__ConcreteStep__Group__0 : rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1 ;
    public final void rule__ConcreteStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1735:1: ( rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1736:2: rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__0__Impl_in_rule__ConcreteStep__Group__03706);
            rule__ConcreteStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__1_in_rule__ConcreteStep__Group__03709);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1743:1: rule__ConcreteStep__Group__0__Impl : ( ( rule__ConcreteStep__ValueAssignment_0 ) ) ;
    public final void rule__ConcreteStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1747:1: ( ( ( rule__ConcreteStep__ValueAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1748:1: ( ( rule__ConcreteStep__ValueAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1748:1: ( ( rule__ConcreteStep__ValueAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1749:1: ( rule__ConcreteStep__ValueAssignment_0 )
            {
             before(grammarAccess.getConcreteStepAccess().getValueAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1750:1: ( rule__ConcreteStep__ValueAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1750:2: rule__ConcreteStep__ValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__ValueAssignment_0_in_rule__ConcreteStep__Group__0__Impl3736);
            rule__ConcreteStep__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteStepAccess().getValueAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1760:1: rule__ConcreteStep__Group__1 : rule__ConcreteStep__Group__1__Impl ;
    public final void rule__ConcreteStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1764:1: ( rule__ConcreteStep__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1765:2: rule__ConcreteStep__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__1__Impl_in_rule__ConcreteStep__Group__13766);
            rule__ConcreteStep__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1771:1: rule__ConcreteStep__Group__1__Impl : ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? ) ;
    public final void rule__ConcreteStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1775:1: ( ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1776:1: ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1776:1: ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1777:1: ( rule__ConcreteStep__AbsoluteAssignment_1 )?
            {
             before(grammarAccess.getConcreteStepAccess().getAbsoluteAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1778:1: ( rule__ConcreteStep__AbsoluteAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==66) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1778:2: rule__ConcreteStep__AbsoluteAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__AbsoluteAssignment_1_in_rule__ConcreteStep__Group__1__Impl3793);
                    rule__ConcreteStep__AbsoluteAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcreteStepAccess().getAbsoluteAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__VariableStep__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1792:1: rule__VariableStep__Group__0 : rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 ;
    public final void rule__VariableStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1796:1: ( rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1797:2: rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__03828);
            rule__VariableStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__03831);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1804:1: rule__VariableStep__Group__0__Impl : ( '?' ) ;
    public final void rule__VariableStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1808:1: ( ( '?' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1809:1: ( '?' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1809:1: ( '?' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1810:1: '?'
            {
             before(grammarAccess.getVariableStepAccess().getQuestionMarkKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__VariableStep__Group__0__Impl3859); 
             after(grammarAccess.getVariableStepAccess().getQuestionMarkKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1823:1: rule__VariableStep__Group__1 : rule__VariableStep__Group__1__Impl ;
    public final void rule__VariableStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1827:1: ( rule__VariableStep__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1828:2: rule__VariableStep__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__13890);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1834:1: rule__VariableStep__Group__1__Impl : ( ( rule__VariableStep__ValueAssignment_1 ) ) ;
    public final void rule__VariableStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1838:1: ( ( ( rule__VariableStep__ValueAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1839:1: ( ( rule__VariableStep__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1839:1: ( ( rule__VariableStep__ValueAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1840:1: ( rule__VariableStep__ValueAssignment_1 )
            {
             before(grammarAccess.getVariableStepAccess().getValueAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1841:1: ( rule__VariableStep__ValueAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1841:2: rule__VariableStep__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__ValueAssignment_1_in_rule__VariableStep__Group__1__Impl3917);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1855:1: rule__ParametrizedStep__Group__0 : rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 ;
    public final void rule__ParametrizedStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1859:1: ( rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1860:2: rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__03951);
            rule__ParametrizedStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__03954);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1867:1: rule__ParametrizedStep__Group__0__Impl : ( () ) ;
    public final void rule__ParametrizedStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1871:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1872:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1872:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1873:1: ()
            {
             before(grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1874:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1876:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1886:1: rule__ParametrizedStep__Group__1 : rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 ;
    public final void rule__ParametrizedStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1890:1: ( rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1891:2: rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__14012);
            rule__ParametrizedStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__14015);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1898:1: rule__ParametrizedStep__Group__1__Impl : ( '{$' ) ;
    public final void rule__ParametrizedStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1902:1: ( ( '{$' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1903:1: ( '{$' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1903:1: ( '{$' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1904:1: '{$'
            {
             before(grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__ParametrizedStep__Group__1__Impl4043); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1917:1: rule__ParametrizedStep__Group__2 : rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3 ;
    public final void rule__ParametrizedStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1921:1: ( rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1922:2: rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__24074);
            rule__ParametrizedStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__3_in_rule__ParametrizedStep__Group__24077);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1929:1: rule__ParametrizedStep__Group__2__Impl : ( ( rule__ParametrizedStep__NameAssignment_2 ) ) ;
    public final void rule__ParametrizedStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1933:1: ( ( ( rule__ParametrizedStep__NameAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1934:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1934:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1935:1: ( rule__ParametrizedStep__NameAssignment_2 )
            {
             before(grammarAccess.getParametrizedStepAccess().getNameAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1936:1: ( rule__ParametrizedStep__NameAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1936:2: rule__ParametrizedStep__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl4104);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1946:1: rule__ParametrizedStep__Group__3 : rule__ParametrizedStep__Group__3__Impl ;
    public final void rule__ParametrizedStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1950:1: ( rule__ParametrizedStep__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1951:2: rule__ParametrizedStep__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__3__Impl_in_rule__ParametrizedStep__Group__34134);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1957:1: rule__ParametrizedStep__Group__3__Impl : ( '}' ) ;
    public final void rule__ParametrizedStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1961:1: ( ( '}' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1962:1: ( '}' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1962:1: ( '}' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1963:1: '}'
            {
             before(grammarAccess.getParametrizedStepAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ParametrizedStep__Group__3__Impl4162); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1984:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1988:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1989:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__04201);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__04204);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1996:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2000:1: ( ( 'select' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2001:1: ( 'select' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2001:1: ( 'select' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2002:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Selection__Group__0__Impl4232); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2015:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2019:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2020:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__14263);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__14266);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2027:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2031:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2032:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2032:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2033:1: ( rule__Selection__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2034:1: ( rule__Selection__NameAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2034:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl4293);
            rule__Selection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2044:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2048:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2049:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__24323);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__24326);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2056:1: rule__Selection__Group__2__Impl : ( 'from' ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2060:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2061:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2061:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2062:1: 'from'
            {
             before(grammarAccess.getSelectionAccess().getFromKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Selection__Group__2__Impl4354); 
             after(grammarAccess.getSelectionAccess().getFromKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2075:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2079:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2080:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__34385);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__34388);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2087:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__FromAssignment_3 ) ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2091:1: ( ( ( rule__Selection__FromAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2092:1: ( ( rule__Selection__FromAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2092:1: ( ( rule__Selection__FromAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2093:1: ( rule__Selection__FromAssignment_3 )
            {
             before(grammarAccess.getSelectionAccess().getFromAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2094:1: ( rule__Selection__FromAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2094:2: rule__Selection__FromAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__FromAssignment_3_in_rule__Selection__Group__3__Impl4415);
            rule__Selection__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getFromAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2104:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2108:1: ( rule__Selection__Group__4__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2109:2: rule__Selection__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__44445);
            rule__Selection__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2115:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__Group_4__0 )? ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2119:1: ( ( ( rule__Selection__Group_4__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2120:1: ( ( rule__Selection__Group_4__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2120:1: ( ( rule__Selection__Group_4__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2121:1: ( rule__Selection__Group_4__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2122:1: ( rule__Selection__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2122:2: rule__Selection__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__0_in_rule__Selection__Group__4__Impl4472);
                    rule__Selection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Selection__Group_4__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2142:1: rule__Selection__Group_4__0 : rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 ;
    public final void rule__Selection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2146:1: ( rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2147:2: rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__0__Impl_in_rule__Selection__Group_4__04513);
            rule__Selection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__1_in_rule__Selection__Group_4__04516);
            rule__Selection__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__0"


    // $ANTLR start "rule__Selection__Group_4__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2154:1: rule__Selection__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Selection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2158:1: ( ( 'where' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2159:1: ( 'where' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2159:1: ( 'where' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2160:1: 'where'
            {
             before(grammarAccess.getSelectionAccess().getWhereKeyword_4_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Selection__Group_4__0__Impl4544); 
             after(grammarAccess.getSelectionAccess().getWhereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__0__Impl"


    // $ANTLR start "rule__Selection__Group_4__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2173:1: rule__Selection__Group_4__1 : rule__Selection__Group_4__1__Impl ;
    public final void rule__Selection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2177:1: ( rule__Selection__Group_4__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2178:2: rule__Selection__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__1__Impl_in_rule__Selection__Group_4__14575);
            rule__Selection__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__1"


    // $ANTLR start "rule__Selection__Group_4__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2184:1: rule__Selection__Group_4__1__Impl : ( ( rule__Selection__WhereAssignment_4_1 ) ) ;
    public final void rule__Selection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2188:1: ( ( ( rule__Selection__WhereAssignment_4_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2189:1: ( ( rule__Selection__WhereAssignment_4_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2189:1: ( ( rule__Selection__WhereAssignment_4_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2190:1: ( rule__Selection__WhereAssignment_4_1 )
            {
             before(grammarAccess.getSelectionAccess().getWhereAssignment_4_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2191:1: ( rule__Selection__WhereAssignment_4_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2191:2: rule__Selection__WhereAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__WhereAssignment_4_1_in_rule__Selection__Group_4__1__Impl4602);
            rule__Selection__WhereAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getWhereAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2205:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2209:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2210:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__04636);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__04639);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2217:1: rule__Copy__Group__0__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2221:1: ( ( 'copy' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2222:1: ( 'copy' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2222:1: ( 'copy' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2223:1: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Copy__Group__0__Impl4667); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2236:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2240:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2241:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__14698);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__14701);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2248:1: rule__Copy__Group__1__Impl : ( 'from' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2252:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2253:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2253:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2254:1: 'from'
            {
             before(grammarAccess.getCopyAccess().getFromKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Copy__Group__1__Impl4729); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2267:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2271:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2272:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__24760);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__24763);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2279:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__SourceAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2283:1: ( ( ( rule__Copy__SourceAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2284:1: ( ( rule__Copy__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2284:1: ( ( rule__Copy__SourceAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2285:1: ( rule__Copy__SourceAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2286:1: ( rule__Copy__SourceAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2286:2: rule__Copy__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__SourceAssignment_2_in_rule__Copy__Group__2__Impl4790);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2296:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2300:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2301:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__34820);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__34823);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2308:1: rule__Copy__Group__3__Impl : ( 'to' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2312:1: ( ( 'to' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2313:1: ( 'to' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2313:1: ( 'to' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2314:1: 'to'
            {
             before(grammarAccess.getCopyAccess().getToKeyword_3()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Copy__Group__3__Impl4851); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2327:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2331:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2332:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__44882);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__44885);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2339:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__DestinationAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2343:1: ( ( ( rule__Copy__DestinationAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2344:1: ( ( rule__Copy__DestinationAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2344:1: ( ( rule__Copy__DestinationAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2345:1: ( rule__Copy__DestinationAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getDestinationAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2346:1: ( rule__Copy__DestinationAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2346:2: rule__Copy__DestinationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__DestinationAssignment_4_in_rule__Copy__Group__4__Impl4912);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2356:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2360:1: ( rule__Copy__Group__5__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2361:2: rule__Copy__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__54942);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2367:1: rule__Copy__Group__5__Impl : ( ( rule__Copy__Group_5__0 )? ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2371:1: ( ( ( rule__Copy__Group_5__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2372:1: ( ( rule__Copy__Group_5__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2372:1: ( ( rule__Copy__Group_5__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2373:1: ( rule__Copy__Group_5__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_5()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2374:1: ( rule__Copy__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2374:2: rule__Copy__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__0_in_rule__Copy__Group__5__Impl4969);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2396:1: rule__Copy__Group_5__0 : rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1 ;
    public final void rule__Copy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2400:1: ( rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2401:2: rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__0__Impl_in_rule__Copy__Group_5__05012);
            rule__Copy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__1_in_rule__Copy__Group_5__05015);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2408:1: rule__Copy__Group_5__0__Impl : ( 'strategy:' ) ;
    public final void rule__Copy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2412:1: ( ( 'strategy:' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2413:1: ( 'strategy:' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2413:1: ( 'strategy:' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2414:1: 'strategy:'
            {
             before(grammarAccess.getCopyAccess().getStrategyKeyword_5_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Copy__Group_5__0__Impl5043); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2427:1: rule__Copy__Group_5__1 : rule__Copy__Group_5__1__Impl ;
    public final void rule__Copy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2431:1: ( rule__Copy__Group_5__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2432:2: rule__Copy__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__1__Impl_in_rule__Copy__Group_5__15074);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2438:1: rule__Copy__Group_5__1__Impl : ( ( rule__Copy__StrategyAssignment_5_1 ) ) ;
    public final void rule__Copy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2442:1: ( ( ( rule__Copy__StrategyAssignment_5_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2443:1: ( ( rule__Copy__StrategyAssignment_5_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2443:1: ( ( rule__Copy__StrategyAssignment_5_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2444:1: ( rule__Copy__StrategyAssignment_5_1 )
            {
             before(grammarAccess.getCopyAccess().getStrategyAssignment_5_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2445:1: ( rule__Copy__StrategyAssignment_5_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2445:2: rule__Copy__StrategyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__StrategyAssignment_5_1_in_rule__Copy__Group_5__1__Impl5101);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2459:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2463:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2464:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__05135);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__05138);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2471:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2475:1: ( ( 'move' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2476:1: ( 'move' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2476:1: ( 'move' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2477:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Move__Group__0__Impl5166); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2490:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2494:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2495:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__15197);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__15200);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2502:1: rule__Move__Group__1__Impl : ( 'from' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2506:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2507:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2507:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2508:1: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Move__Group__1__Impl5228); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2521:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2525:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2526:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__25259);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__25262);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2533:1: rule__Move__Group__2__Impl : ( ( rule__Move__SourceAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2537:1: ( ( ( rule__Move__SourceAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2538:1: ( ( rule__Move__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2538:1: ( ( rule__Move__SourceAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2539:1: ( rule__Move__SourceAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2540:1: ( rule__Move__SourceAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2540:2: rule__Move__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SourceAssignment_2_in_rule__Move__Group__2__Impl5289);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2550:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2554:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2555:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__35319);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__35322);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2562:1: rule__Move__Group__3__Impl : ( 'to' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2566:1: ( ( 'to' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2567:1: ( 'to' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2567:1: ( 'to' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2568:1: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_3()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Move__Group__3__Impl5350); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2581:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2585:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2586:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__45381);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5_in_rule__Move__Group__45384);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2593:1: rule__Move__Group__4__Impl : ( ( rule__Move__DestinationAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2597:1: ( ( ( rule__Move__DestinationAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2598:1: ( ( rule__Move__DestinationAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2598:1: ( ( rule__Move__DestinationAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2599:1: ( rule__Move__DestinationAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getDestinationAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2600:1: ( rule__Move__DestinationAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2600:2: rule__Move__DestinationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__DestinationAssignment_4_in_rule__Move__Group__4__Impl5411);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2610:1: rule__Move__Group__5 : rule__Move__Group__5__Impl ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2614:1: ( rule__Move__Group__5__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2615:2: rule__Move__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__55441);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2621:1: rule__Move__Group__5__Impl : ( ( rule__Move__Group_5__0 )? ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2625:1: ( ( ( rule__Move__Group_5__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2626:1: ( ( rule__Move__Group_5__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2626:1: ( ( rule__Move__Group_5__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2627:1: ( rule__Move__Group_5__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_5()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2628:1: ( rule__Move__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2628:2: rule__Move__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__0_in_rule__Move__Group__5__Impl5468);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2650:1: rule__Move__Group_5__0 : rule__Move__Group_5__0__Impl rule__Move__Group_5__1 ;
    public final void rule__Move__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2654:1: ( rule__Move__Group_5__0__Impl rule__Move__Group_5__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2655:2: rule__Move__Group_5__0__Impl rule__Move__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__0__Impl_in_rule__Move__Group_5__05511);
            rule__Move__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__1_in_rule__Move__Group_5__05514);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2662:1: rule__Move__Group_5__0__Impl : ( 'strategy:' ) ;
    public final void rule__Move__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2666:1: ( ( 'strategy:' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2667:1: ( 'strategy:' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2667:1: ( 'strategy:' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2668:1: 'strategy:'
            {
             before(grammarAccess.getMoveAccess().getStrategyKeyword_5_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Move__Group_5__0__Impl5542); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2681:1: rule__Move__Group_5__1 : rule__Move__Group_5__1__Impl ;
    public final void rule__Move__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2685:1: ( rule__Move__Group_5__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2686:2: rule__Move__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__1__Impl_in_rule__Move__Group_5__15573);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2692:1: rule__Move__Group_5__1__Impl : ( ( rule__Move__StrategyAssignment_5_1 ) ) ;
    public final void rule__Move__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2696:1: ( ( ( rule__Move__StrategyAssignment_5_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2697:1: ( ( rule__Move__StrategyAssignment_5_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2697:1: ( ( rule__Move__StrategyAssignment_5_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2698:1: ( rule__Move__StrategyAssignment_5_1 )
            {
             before(grammarAccess.getMoveAccess().getStrategyAssignment_5_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2699:1: ( rule__Move__StrategyAssignment_5_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2699:2: rule__Move__StrategyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__StrategyAssignment_5_1_in_rule__Move__Group_5__1__Impl5600);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2713:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2717:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2718:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__05634);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__05637);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2725:1: rule__Delete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2729:1: ( ( 'delete' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2730:1: ( 'delete' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2730:1: ( 'delete' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2731:1: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Delete__Group__0__Impl5665); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2744:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2748:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2749:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__15696);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__15699);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2756:1: rule__Delete__Group__1__Impl : ( 'from' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2760:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2761:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2761:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2762:1: 'from'
            {
             before(grammarAccess.getDeleteAccess().getFromKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Delete__Group__1__Impl5727); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2775:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2779:1: ( rule__Delete__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2780:2: rule__Delete__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__25758);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2786:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__SourceAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2790:1: ( ( ( rule__Delete__SourceAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2791:1: ( ( rule__Delete__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2791:1: ( ( rule__Delete__SourceAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2792:1: ( rule__Delete__SourceAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2793:1: ( rule__Delete__SourceAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2793:2: rule__Delete__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__SourceAssignment_2_in_rule__Delete__Group__2__Impl5785);
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


    // $ANTLR start "rule__FilterContainer__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2809:1: rule__FilterContainer__Group__0 : rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 ;
    public final void rule__FilterContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2813:1: ( rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2814:2: rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__05821);
            rule__FilterContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__05824);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2821:1: rule__FilterContainer__Group__0__Impl : ( '(' ) ;
    public final void rule__FilterContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2825:1: ( ( '(' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2826:1: ( '(' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2826:1: ( '(' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2827:1: '('
            {
             before(grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__FilterContainer__Group__0__Impl5852); 
             after(grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2840:1: rule__FilterContainer__Group__1 : rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 ;
    public final void rule__FilterContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2844:1: ( rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2845:2: rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__15883);
            rule__FilterContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__15886);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2852:1: rule__FilterContainer__Group__1__Impl : ( ( rule__FilterContainer__LinksAssignment_1 ) ) ;
    public final void rule__FilterContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2856:1: ( ( ( rule__FilterContainer__LinksAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2857:1: ( ( rule__FilterContainer__LinksAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2857:1: ( ( rule__FilterContainer__LinksAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2858:1: ( rule__FilterContainer__LinksAssignment_1 )
            {
             before(grammarAccess.getFilterContainerAccess().getLinksAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2859:1: ( rule__FilterContainer__LinksAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2859:2: rule__FilterContainer__LinksAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__LinksAssignment_1_in_rule__FilterContainer__Group__1__Impl5913);
            rule__FilterContainer__LinksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterContainerAccess().getLinksAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2869:1: rule__FilterContainer__Group__2 : rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 ;
    public final void rule__FilterContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2873:1: ( rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2874:2: rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__25943);
            rule__FilterContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__25946);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2881:1: rule__FilterContainer__Group__2__Impl : ( ( rule__FilterContainer__LinksAssignment_2 )* ) ;
    public final void rule__FilterContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2885:1: ( ( ( rule__FilterContainer__LinksAssignment_2 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2886:1: ( ( rule__FilterContainer__LinksAssignment_2 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2886:1: ( ( rule__FilterContainer__LinksAssignment_2 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2887:1: ( rule__FilterContainer__LinksAssignment_2 )*
            {
             before(grammarAccess.getFilterContainerAccess().getLinksAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2888:1: ( rule__FilterContainer__LinksAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=25 && LA21_0<=26)||LA21_0==49||LA21_0==51||(LA21_0>=53 && LA21_0<=54)||(LA21_0>=60 && LA21_0<=62)||LA21_0==64||(LA21_0>=67 && LA21_0<=68)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2888:2: rule__FilterContainer__LinksAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__LinksAssignment_2_in_rule__FilterContainer__Group__2__Impl5973);
            	    rule__FilterContainer__LinksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFilterContainerAccess().getLinksAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2898:1: rule__FilterContainer__Group__3 : rule__FilterContainer__Group__3__Impl ;
    public final void rule__FilterContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2902:1: ( rule__FilterContainer__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2903:2: rule__FilterContainer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__36004);
            rule__FilterContainer__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2909:1: rule__FilterContainer__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2913:1: ( ( ')' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2914:1: ( ')' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2914:1: ( ')' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2915:1: ')'
            {
             before(grammarAccess.getFilterContainerAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__FilterContainer__Group__3__Impl6032); 
             after(grammarAccess.getFilterContainerAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2936:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2940:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2941:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__06071);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1_in_rule__Link__Group__06074);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2948:1: rule__Link__Group__0__Impl : ( ( rule__Link__Alternatives_0 )? ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2952:1: ( ( ( rule__Link__Alternatives_0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2953:1: ( ( rule__Link__Alternatives_0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2953:1: ( ( rule__Link__Alternatives_0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2954:1: ( rule__Link__Alternatives_0 )?
            {
             before(grammarAccess.getLinkAccess().getAlternatives_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2955:1: ( rule__Link__Alternatives_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=67 && LA22_0<=68)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2955:2: rule__Link__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Link__Alternatives_0_in_rule__Link__Group__0__Impl6101);
                    rule__Link__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2965:1: rule__Link__Group__1 : rule__Link__Group__1__Impl ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2969:1: ( rule__Link__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2970:2: rule__Link__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__16132);
            rule__Link__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2976:1: rule__Link__Group__1__Impl : ( ( rule__Link__ElementAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2980:1: ( ( ( rule__Link__ElementAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2981:1: ( ( rule__Link__ElementAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2981:1: ( ( rule__Link__ElementAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2982:1: ( rule__Link__ElementAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getElementAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2983:1: ( rule__Link__ElementAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2983:2: rule__Link__ElementAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__ElementAssignment_1_in_rule__Link__Group__1__Impl6159);
            rule__Link__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__OnAttributes__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2997:1: rule__OnAttributes__Group__0 : rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 ;
    public final void rule__OnAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3001:1: ( rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3002:2: rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__06193);
            rule__OnAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__06196);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3009:1: rule__OnAttributes__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__OnAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3013:1: ( ( 'attribute' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3014:1: ( 'attribute' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3014:1: ( 'attribute' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3015:1: 'attribute'
            {
             before(grammarAccess.getOnAttributesAccess().getAttributeKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__OnAttributes__Group__0__Impl6224); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3028:1: rule__OnAttributes__Group__1 : rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 ;
    public final void rule__OnAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3032:1: ( rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3033:2: rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__16255);
            rule__OnAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__16258);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3040:1: rule__OnAttributes__Group__1__Impl : ( ( rule__OnAttributes__NameAssignment_1 ) ) ;
    public final void rule__OnAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3044:1: ( ( ( rule__OnAttributes__NameAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3045:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3045:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3046:1: ( rule__OnAttributes__NameAssignment_1 )
            {
             before(grammarAccess.getOnAttributesAccess().getNameAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3047:1: ( rule__OnAttributes__NameAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3047:2: rule__OnAttributes__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl6285);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3057:1: rule__OnAttributes__Group__2 : rule__OnAttributes__Group__2__Impl ;
    public final void rule__OnAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3061:1: ( rule__OnAttributes__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3062:2: rule__OnAttributes__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__26315);
            rule__OnAttributes__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3068:1: rule__OnAttributes__Group__2__Impl : ( ( rule__OnAttributes__Alternatives_2 ) ) ;
    public final void rule__OnAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3072:1: ( ( ( rule__OnAttributes__Alternatives_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3073:1: ( ( rule__OnAttributes__Alternatives_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3073:1: ( ( rule__OnAttributes__Alternatives_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3074:1: ( rule__OnAttributes__Alternatives_2 )
            {
             before(grammarAccess.getOnAttributesAccess().getAlternatives_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3075:1: ( rule__OnAttributes__Alternatives_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3075:2: rule__OnAttributes__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Alternatives_2_in_rule__OnAttributes__Group__2__Impl6342);
            rule__OnAttributes__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOnAttributesAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnAttributes__Group_2_0__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3091:1: rule__OnAttributes__Group_2_0__0 : rule__OnAttributes__Group_2_0__0__Impl rule__OnAttributes__Group_2_0__1 ;
    public final void rule__OnAttributes__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3095:1: ( rule__OnAttributes__Group_2_0__0__Impl rule__OnAttributes__Group_2_0__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3096:2: rule__OnAttributes__Group_2_0__0__Impl rule__OnAttributes__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__0__Impl_in_rule__OnAttributes__Group_2_0__06378);
            rule__OnAttributes__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__1_in_rule__OnAttributes__Group_2_0__06381);
            rule__OnAttributes__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_0__0"


    // $ANTLR start "rule__OnAttributes__Group_2_0__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3103:1: rule__OnAttributes__Group_2_0__0__Impl : ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? ) ;
    public final void rule__OnAttributes__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3107:1: ( ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3108:1: ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3108:1: ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3109:1: ( rule__OnAttributes__InverseAssignment_2_0_0 )?
            {
             before(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_0_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3110:1: ( rule__OnAttributes__InverseAssignment_2_0_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==69) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3110:2: rule__OnAttributes__InverseAssignment_2_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__InverseAssignment_2_0_0_in_rule__OnAttributes__Group_2_0__0__Impl6408);
                    rule__OnAttributes__InverseAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_0__0__Impl"


    // $ANTLR start "rule__OnAttributes__Group_2_0__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3120:1: rule__OnAttributes__Group_2_0__1 : rule__OnAttributes__Group_2_0__1__Impl ;
    public final void rule__OnAttributes__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3124:1: ( rule__OnAttributes__Group_2_0__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3125:2: rule__OnAttributes__Group_2_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__1__Impl_in_rule__OnAttributes__Group_2_0__16439);
            rule__OnAttributes__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_0__1"


    // $ANTLR start "rule__OnAttributes__Group_2_0__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3131:1: rule__OnAttributes__Group_2_0__1__Impl : ( 'exist' ) ;
    public final void rule__OnAttributes__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3135:1: ( ( 'exist' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3136:1: ( 'exist' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3136:1: ( 'exist' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3137:1: 'exist'
            {
             before(grammarAccess.getOnAttributesAccess().getExistKeyword_2_0_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__OnAttributes__Group_2_0__1__Impl6467); 
             after(grammarAccess.getOnAttributesAccess().getExistKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_0__1__Impl"


    // $ANTLR start "rule__OnAttributes__Group_2_1__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3154:1: rule__OnAttributes__Group_2_1__0 : rule__OnAttributes__Group_2_1__0__Impl rule__OnAttributes__Group_2_1__1 ;
    public final void rule__OnAttributes__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3158:1: ( rule__OnAttributes__Group_2_1__0__Impl rule__OnAttributes__Group_2_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3159:2: rule__OnAttributes__Group_2_1__0__Impl rule__OnAttributes__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__0__Impl_in_rule__OnAttributes__Group_2_1__06502);
            rule__OnAttributes__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__1_in_rule__OnAttributes__Group_2_1__06505);
            rule__OnAttributes__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_1__0"


    // $ANTLR start "rule__OnAttributes__Group_2_1__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3166:1: rule__OnAttributes__Group_2_1__0__Impl : ( 'is' ) ;
    public final void rule__OnAttributes__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3170:1: ( ( 'is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3171:1: ( 'is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3171:1: ( 'is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3172:1: 'is'
            {
             before(grammarAccess.getOnAttributesAccess().getIsKeyword_2_1_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__OnAttributes__Group_2_1__0__Impl6533); 
             after(grammarAccess.getOnAttributesAccess().getIsKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_1__0__Impl"


    // $ANTLR start "rule__OnAttributes__Group_2_1__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3185:1: rule__OnAttributes__Group_2_1__1 : rule__OnAttributes__Group_2_1__1__Impl rule__OnAttributes__Group_2_1__2 ;
    public final void rule__OnAttributes__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3189:1: ( rule__OnAttributes__Group_2_1__1__Impl rule__OnAttributes__Group_2_1__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3190:2: rule__OnAttributes__Group_2_1__1__Impl rule__OnAttributes__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__1__Impl_in_rule__OnAttributes__Group_2_1__16564);
            rule__OnAttributes__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__2_in_rule__OnAttributes__Group_2_1__16567);
            rule__OnAttributes__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_1__1"


    // $ANTLR start "rule__OnAttributes__Group_2_1__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3197:1: rule__OnAttributes__Group_2_1__1__Impl : ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? ) ;
    public final void rule__OnAttributes__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3201:1: ( ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3202:1: ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3202:1: ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3203:1: ( rule__OnAttributes__InverseAssignment_2_1_1 )?
            {
             before(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3204:1: ( rule__OnAttributes__InverseAssignment_2_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==69) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3204:2: rule__OnAttributes__InverseAssignment_2_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__InverseAssignment_2_1_1_in_rule__OnAttributes__Group_2_1__1__Impl6594);
                    rule__OnAttributes__InverseAssignment_2_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_1__1__Impl"


    // $ANTLR start "rule__OnAttributes__Group_2_1__2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3214:1: rule__OnAttributes__Group_2_1__2 : rule__OnAttributes__Group_2_1__2__Impl ;
    public final void rule__OnAttributes__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3218:1: ( rule__OnAttributes__Group_2_1__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3219:2: rule__OnAttributes__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__2__Impl_in_rule__OnAttributes__Group_2_1__26625);
            rule__OnAttributes__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_1__2"


    // $ANTLR start "rule__OnAttributes__Group_2_1__2__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3225:1: rule__OnAttributes__Group_2_1__2__Impl : ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) ) ;
    public final void rule__OnAttributes__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3229:1: ( ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3230:1: ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3230:1: ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3231:1: ( rule__OnAttributes__ValueAssignment_2_1_2 )
            {
             before(grammarAccess.getOnAttributesAccess().getValueAssignment_2_1_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3232:1: ( rule__OnAttributes__ValueAssignment_2_1_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3232:2: rule__OnAttributes__ValueAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__ValueAssignment_2_1_2_in_rule__OnAttributes__Group_2_1__2__Impl6652);
            rule__OnAttributes__ValueAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOnAttributesAccess().getValueAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__Group_2_1__2__Impl"


    // $ANTLR start "rule__OnTags__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3248:1: rule__OnTags__Group__0 : rule__OnTags__Group__0__Impl rule__OnTags__Group__1 ;
    public final void rule__OnTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3252:1: ( rule__OnTags__Group__0__Impl rule__OnTags__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3253:2: rule__OnTags__Group__0__Impl rule__OnTags__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__06688);
            rule__OnTags__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__06691);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3260:1: rule__OnTags__Group__0__Impl : ( 'in [' ) ;
    public final void rule__OnTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3264:1: ( ( 'in [' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3265:1: ( 'in [' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3265:1: ( 'in [' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3266:1: 'in ['
            {
             before(grammarAccess.getOnTagsAccess().getInKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__OnTags__Group__0__Impl6719); 
             after(grammarAccess.getOnTagsAccess().getInKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3279:1: rule__OnTags__Group__1 : rule__OnTags__Group__1__Impl rule__OnTags__Group__2 ;
    public final void rule__OnTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3283:1: ( rule__OnTags__Group__1__Impl rule__OnTags__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3284:2: rule__OnTags__Group__1__Impl rule__OnTags__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__16750);
            rule__OnTags__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__16753);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3291:1: rule__OnTags__Group__1__Impl : ( ( rule__OnTags__Group_1__0 )? ) ;
    public final void rule__OnTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3295:1: ( ( ( rule__OnTags__Group_1__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3296:1: ( ( rule__OnTags__Group_1__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3296:1: ( ( rule__OnTags__Group_1__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3297:1: ( rule__OnTags__Group_1__0 )?
            {
             before(grammarAccess.getOnTagsAccess().getGroup_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3298:1: ( rule__OnTags__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3298:2: rule__OnTags__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__0_in_rule__OnTags__Group__1__Impl6780);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3308:1: rule__OnTags__Group__2 : rule__OnTags__Group__2__Impl rule__OnTags__Group__3 ;
    public final void rule__OnTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3312:1: ( rule__OnTags__Group__2__Impl rule__OnTags__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3313:2: rule__OnTags__Group__2__Impl rule__OnTags__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__26811);
            rule__OnTags__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__26814);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3320:1: rule__OnTags__Group__2__Impl : ( ']' ) ;
    public final void rule__OnTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3324:1: ( ( ']' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3325:1: ( ']' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3325:1: ( ']' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3326:1: ']'
            {
             before(grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__OnTags__Group__2__Impl6842); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3339:1: rule__OnTags__Group__3 : rule__OnTags__Group__3__Impl rule__OnTags__Group__4 ;
    public final void rule__OnTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3343:1: ( rule__OnTags__Group__3__Impl rule__OnTags__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3344:2: rule__OnTags__Group__3__Impl rule__OnTags__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__36873);
            rule__OnTags__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__36876);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3351:1: rule__OnTags__Group__3__Impl : ( ( rule__OnTags__Alternatives_3 ) ) ;
    public final void rule__OnTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3355:1: ( ( ( rule__OnTags__Alternatives_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3356:1: ( ( rule__OnTags__Alternatives_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3356:1: ( ( rule__OnTags__Alternatives_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3357:1: ( rule__OnTags__Alternatives_3 )
            {
             before(grammarAccess.getOnTagsAccess().getAlternatives_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3358:1: ( rule__OnTags__Alternatives_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3358:2: rule__OnTags__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Alternatives_3_in_rule__OnTags__Group__3__Impl6903);
            rule__OnTags__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getAlternatives_3()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3368:1: rule__OnTags__Group__4 : rule__OnTags__Group__4__Impl rule__OnTags__Group__5 ;
    public final void rule__OnTags__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3372:1: ( rule__OnTags__Group__4__Impl rule__OnTags__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3373:2: rule__OnTags__Group__4__Impl rule__OnTags__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__46933);
            rule__OnTags__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__46936);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3380:1: rule__OnTags__Group__4__Impl : ( ( rule__OnTags__InverseAssignment_4 )? ) ;
    public final void rule__OnTags__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3384:1: ( ( ( rule__OnTags__InverseAssignment_4 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3385:1: ( ( rule__OnTags__InverseAssignment_4 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3385:1: ( ( rule__OnTags__InverseAssignment_4 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3386:1: ( rule__OnTags__InverseAssignment_4 )?
            {
             before(grammarAccess.getOnTagsAccess().getInverseAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3387:1: ( rule__OnTags__InverseAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3387:2: rule__OnTags__InverseAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__InverseAssignment_4_in_rule__OnTags__Group__4__Impl6963);
                    rule__OnTags__InverseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getInverseAssignment_4()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3397:1: rule__OnTags__Group__5 : rule__OnTags__Group__5__Impl rule__OnTags__Group__6 ;
    public final void rule__OnTags__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3401:1: ( rule__OnTags__Group__5__Impl rule__OnTags__Group__6 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3402:2: rule__OnTags__Group__5__Impl rule__OnTags__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__56994);
            rule__OnTags__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__56997);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3409:1: rule__OnTags__Group__5__Impl : ( 'in tags' ) ;
    public final void rule__OnTags__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3413:1: ( ( 'in tags' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3414:1: ( 'in tags' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3414:1: ( 'in tags' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3415:1: 'in tags'
            {
             before(grammarAccess.getOnTagsAccess().getInTagsKeyword_5()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__OnTags__Group__5__Impl7025); 
             after(grammarAccess.getOnTagsAccess().getInTagsKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3428:1: rule__OnTags__Group__6 : rule__OnTags__Group__6__Impl ;
    public final void rule__OnTags__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3432:1: ( rule__OnTags__Group__6__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3433:2: rule__OnTags__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__67056);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3439:1: rule__OnTags__Group__6__Impl : ( ( rule__OnTags__OnlyAssignment_6 )? ) ;
    public final void rule__OnTags__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3443:1: ( ( ( rule__OnTags__OnlyAssignment_6 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3444:1: ( ( rule__OnTags__OnlyAssignment_6 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3444:1: ( ( rule__OnTags__OnlyAssignment_6 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3445:1: ( rule__OnTags__OnlyAssignment_6 )?
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAssignment_6()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3446:1: ( rule__OnTags__OnlyAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==70) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3446:2: rule__OnTags__OnlyAssignment_6
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__OnlyAssignment_6_in_rule__OnTags__Group__6__Impl7083);
                    rule__OnTags__OnlyAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTagsAccess().getOnlyAssignment_6()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3470:1: rule__OnTags__Group_1__0 : rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1 ;
    public final void rule__OnTags__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3474:1: ( rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3475:2: rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__0__Impl_in_rule__OnTags__Group_1__07128);
            rule__OnTags__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__1_in_rule__OnTags__Group_1__07131);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3482:1: rule__OnTags__Group_1__0__Impl : ( ( rule__OnTags__TagsAssignment_1_0 ) ) ;
    public final void rule__OnTags__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3486:1: ( ( ( rule__OnTags__TagsAssignment_1_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3487:1: ( ( rule__OnTags__TagsAssignment_1_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3487:1: ( ( rule__OnTags__TagsAssignment_1_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3488:1: ( rule__OnTags__TagsAssignment_1_0 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3489:1: ( rule__OnTags__TagsAssignment_1_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3489:2: rule__OnTags__TagsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_1_0_in_rule__OnTags__Group_1__0__Impl7158);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3499:1: rule__OnTags__Group_1__1 : rule__OnTags__Group_1__1__Impl ;
    public final void rule__OnTags__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3503:1: ( rule__OnTags__Group_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3504:2: rule__OnTags__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__1__Impl_in_rule__OnTags__Group_1__17188);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3510:1: rule__OnTags__Group_1__1__Impl : ( ( rule__OnTags__Group_1_1__0 )* ) ;
    public final void rule__OnTags__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3514:1: ( ( ( rule__OnTags__Group_1_1__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3515:1: ( ( rule__OnTags__Group_1_1__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3515:1: ( ( rule__OnTags__Group_1_1__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3516:1: ( rule__OnTags__Group_1_1__0 )*
            {
             before(grammarAccess.getOnTagsAccess().getGroup_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3517:1: ( rule__OnTags__Group_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==57) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3517:2: rule__OnTags__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__0_in_rule__OnTags__Group_1__1__Impl7215);
            	    rule__OnTags__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3531:1: rule__OnTags__Group_1_1__0 : rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1 ;
    public final void rule__OnTags__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3535:1: ( rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3536:2: rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__0__Impl_in_rule__OnTags__Group_1_1__07250);
            rule__OnTags__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__1_in_rule__OnTags__Group_1_1__07253);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3543:1: rule__OnTags__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__OnTags__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3547:1: ( ( ',' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3548:1: ( ',' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3548:1: ( ',' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3549:1: ','
            {
             before(grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__OnTags__Group_1_1__0__Impl7281); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3562:1: rule__OnTags__Group_1_1__1 : rule__OnTags__Group_1_1__1__Impl ;
    public final void rule__OnTags__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3566:1: ( rule__OnTags__Group_1_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3567:2: rule__OnTags__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__1__Impl_in_rule__OnTags__Group_1_1__17312);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3573:1: rule__OnTags__Group_1_1__1__Impl : ( ( rule__OnTags__TagsAssignment_1_1_1 ) ) ;
    public final void rule__OnTags__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3577:1: ( ( ( rule__OnTags__TagsAssignment_1_1_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3578:1: ( ( rule__OnTags__TagsAssignment_1_1_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3578:1: ( ( rule__OnTags__TagsAssignment_1_1_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3579:1: ( rule__OnTags__TagsAssignment_1_1_1 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_1_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3580:1: ( rule__OnTags__TagsAssignment_1_1_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3580:2: rule__OnTags__TagsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_1_1_1_in_rule__OnTags__Group_1_1__1__Impl7339);
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


    // $ANTLR start "rule__OnTags__Group_3_1__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3594:1: rule__OnTags__Group_3_1__0 : rule__OnTags__Group_3_1__0__Impl rule__OnTags__Group_3_1__1 ;
    public final void rule__OnTags__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3598:1: ( rule__OnTags__Group_3_1__0__Impl rule__OnTags__Group_3_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3599:2: rule__OnTags__Group_3_1__0__Impl rule__OnTags__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__0__Impl_in_rule__OnTags__Group_3_1__07373);
            rule__OnTags__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__1_in_rule__OnTags__Group_3_1__07376);
            rule__OnTags__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3_1__0"


    // $ANTLR start "rule__OnTags__Group_3_1__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3606:1: rule__OnTags__Group_3_1__0__Impl : ( ( rule__OnTags__TresholdAssignment_3_1_0 ) ) ;
    public final void rule__OnTags__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3610:1: ( ( ( rule__OnTags__TresholdAssignment_3_1_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3611:1: ( ( rule__OnTags__TresholdAssignment_3_1_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3611:1: ( ( rule__OnTags__TresholdAssignment_3_1_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3612:1: ( rule__OnTags__TresholdAssignment_3_1_0 )
            {
             before(grammarAccess.getOnTagsAccess().getTresholdAssignment_3_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3613:1: ( rule__OnTags__TresholdAssignment_3_1_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3613:2: rule__OnTags__TresholdAssignment_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TresholdAssignment_3_1_0_in_rule__OnTags__Group_3_1__0__Impl7403);
            rule__OnTags__TresholdAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOnTagsAccess().getTresholdAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3_1__0__Impl"


    // $ANTLR start "rule__OnTags__Group_3_1__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3623:1: rule__OnTags__Group_3_1__1 : rule__OnTags__Group_3_1__1__Impl ;
    public final void rule__OnTags__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3627:1: ( rule__OnTags__Group_3_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3628:2: rule__OnTags__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__1__Impl_in_rule__OnTags__Group_3_1__17433);
            rule__OnTags__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3_1__1"


    // $ANTLR start "rule__OnTags__Group_3_1__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3634:1: rule__OnTags__Group_3_1__1__Impl : ( 'are' ) ;
    public final void rule__OnTags__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3638:1: ( ( 'are' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3639:1: ( 'are' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3639:1: ( 'are' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3640:1: 'are'
            {
             before(grammarAccess.getOnTagsAccess().getAreKeyword_3_1_1()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnTags__Group_3_1__1__Impl7461); 
             after(grammarAccess.getOnTagsAccess().getAreKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__Group_3_1__1__Impl"


    // $ANTLR start "rule__OnTime__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3657:1: rule__OnTime__Group__0 : rule__OnTime__Group__0__Impl rule__OnTime__Group__1 ;
    public final void rule__OnTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3661:1: ( rule__OnTime__Group__0__Impl rule__OnTime__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3662:2: rule__OnTime__Group__0__Impl rule__OnTime__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__07496);
            rule__OnTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__07499);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3669:1: rule__OnTime__Group__0__Impl : ( ( rule__OnTime__TimeOfAssignment_0 ) ) ;
    public final void rule__OnTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3673:1: ( ( ( rule__OnTime__TimeOfAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3674:1: ( ( rule__OnTime__TimeOfAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3674:1: ( ( rule__OnTime__TimeOfAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3675:1: ( rule__OnTime__TimeOfAssignment_0 )
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3676:1: ( rule__OnTime__TimeOfAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3676:2: rule__OnTime__TimeOfAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TimeOfAssignment_0_in_rule__OnTime__Group__0__Impl7526);
            rule__OnTime__TimeOfAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTimeOfAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3686:1: rule__OnTime__Group__1 : rule__OnTime__Group__1__Impl rule__OnTime__Group__2 ;
    public final void rule__OnTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3690:1: ( rule__OnTime__Group__1__Impl rule__OnTime__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3691:2: rule__OnTime__Group__1__Impl rule__OnTime__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__17556);
            rule__OnTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__17559);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3698:1: rule__OnTime__Group__1__Impl : ( 'before' ) ;
    public final void rule__OnTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3702:1: ( ( 'before' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3703:1: ( 'before' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3703:1: ( 'before' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3704:1: 'before'
            {
             before(grammarAccess.getOnTimeAccess().getBeforeKeyword_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__OnTime__Group__1__Impl7587); 
             after(grammarAccess.getOnTimeAccess().getBeforeKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3717:1: rule__OnTime__Group__2 : rule__OnTime__Group__2__Impl rule__OnTime__Group__3 ;
    public final void rule__OnTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3721:1: ( rule__OnTime__Group__2__Impl rule__OnTime__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3722:2: rule__OnTime__Group__2__Impl rule__OnTime__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__27618);
            rule__OnTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__27621);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3729:1: rule__OnTime__Group__2__Impl : ( ( rule__OnTime__OperatorAssignment_2 ) ) ;
    public final void rule__OnTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3733:1: ( ( ( rule__OnTime__OperatorAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3734:1: ( ( rule__OnTime__OperatorAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3734:1: ( ( rule__OnTime__OperatorAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3735:1: ( rule__OnTime__OperatorAssignment_2 )
            {
             before(grammarAccess.getOnTimeAccess().getOperatorAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3736:1: ( rule__OnTime__OperatorAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3736:2: rule__OnTime__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__OperatorAssignment_2_in_rule__OnTime__Group__2__Impl7648);
            rule__OnTime__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getOperatorAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3746:1: rule__OnTime__Group__3 : rule__OnTime__Group__3__Impl rule__OnTime__Group__4 ;
    public final void rule__OnTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3750:1: ( rule__OnTime__Group__3__Impl rule__OnTime__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3751:2: rule__OnTime__Group__3__Impl rule__OnTime__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__37678);
            rule__OnTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__37681);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3758:1: rule__OnTime__Group__3__Impl : ( ( rule__OnTime__TresholdAssignment_3 ) ) ;
    public final void rule__OnTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3762:1: ( ( ( rule__OnTime__TresholdAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3763:1: ( ( rule__OnTime__TresholdAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3763:1: ( ( rule__OnTime__TresholdAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3764:1: ( rule__OnTime__TresholdAssignment_3 )
            {
             before(grammarAccess.getOnTimeAccess().getTresholdAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3765:1: ( rule__OnTime__TresholdAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3765:2: rule__OnTime__TresholdAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TresholdAssignment_3_in_rule__OnTime__Group__3__Impl7708);
            rule__OnTime__TresholdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getTresholdAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3775:1: rule__OnTime__Group__4 : rule__OnTime__Group__4__Impl ;
    public final void rule__OnTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3779:1: ( rule__OnTime__Group__4__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3780:2: rule__OnTime__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__47738);
            rule__OnTime__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3786:1: rule__OnTime__Group__4__Impl : ( ( rule__OnTime__UnitAssignment_4 ) ) ;
    public final void rule__OnTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3790:1: ( ( ( rule__OnTime__UnitAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3791:1: ( ( rule__OnTime__UnitAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3791:1: ( ( rule__OnTime__UnitAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3792:1: ( rule__OnTime__UnitAssignment_4 )
            {
             before(grammarAccess.getOnTimeAccess().getUnitAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3793:1: ( rule__OnTime__UnitAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3793:2: rule__OnTime__UnitAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__UnitAssignment_4_in_rule__OnTime__Group__4__Impl7765);
            rule__OnTime__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOnTimeAccess().getUnitAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnSize__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3813:1: rule__OnSize__Group__0 : rule__OnSize__Group__0__Impl rule__OnSize__Group__1 ;
    public final void rule__OnSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3817:1: ( rule__OnSize__Group__0__Impl rule__OnSize__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3818:2: rule__OnSize__Group__0__Impl rule__OnSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__07805);
            rule__OnSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__07808);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3825:1: rule__OnSize__Group__0__Impl : ( 'size of file' ) ;
    public final void rule__OnSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3829:1: ( ( 'size of file' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3830:1: ( 'size of file' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3830:1: ( 'size of file' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3831:1: 'size of file'
            {
             before(grammarAccess.getOnSizeAccess().getSizeOfFileKeyword_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__OnSize__Group__0__Impl7836); 
             after(grammarAccess.getOnSizeAccess().getSizeOfFileKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3844:1: rule__OnSize__Group__1 : rule__OnSize__Group__1__Impl rule__OnSize__Group__2 ;
    public final void rule__OnSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3848:1: ( rule__OnSize__Group__1__Impl rule__OnSize__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3849:2: rule__OnSize__Group__1__Impl rule__OnSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__17867);
            rule__OnSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__17870);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3856:1: rule__OnSize__Group__1__Impl : ( ( rule__OnSize__InverseAssignment_1 )? ) ;
    public final void rule__OnSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3860:1: ( ( ( rule__OnSize__InverseAssignment_1 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3861:1: ( ( rule__OnSize__InverseAssignment_1 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3861:1: ( ( rule__OnSize__InverseAssignment_1 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3862:1: ( rule__OnSize__InverseAssignment_1 )?
            {
             before(grammarAccess.getOnSizeAccess().getInverseAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3863:1: ( rule__OnSize__InverseAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==69) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3863:2: rule__OnSize__InverseAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnSize__InverseAssignment_1_in_rule__OnSize__Group__1__Impl7897);
                    rule__OnSize__InverseAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnSizeAccess().getInverseAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3873:1: rule__OnSize__Group__2 : rule__OnSize__Group__2__Impl rule__OnSize__Group__3 ;
    public final void rule__OnSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3877:1: ( rule__OnSize__Group__2__Impl rule__OnSize__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3878:2: rule__OnSize__Group__2__Impl rule__OnSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__27928);
            rule__OnSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__27931);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3885:1: rule__OnSize__Group__2__Impl : ( ( rule__OnSize__OperatorAssignment_2 ) ) ;
    public final void rule__OnSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3889:1: ( ( ( rule__OnSize__OperatorAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3890:1: ( ( rule__OnSize__OperatorAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3890:1: ( ( rule__OnSize__OperatorAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3891:1: ( rule__OnSize__OperatorAssignment_2 )
            {
             before(grammarAccess.getOnSizeAccess().getOperatorAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3892:1: ( rule__OnSize__OperatorAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3892:2: rule__OnSize__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__OperatorAssignment_2_in_rule__OnSize__Group__2__Impl7958);
            rule__OnSize__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getOperatorAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3902:1: rule__OnSize__Group__3 : rule__OnSize__Group__3__Impl rule__OnSize__Group__4 ;
    public final void rule__OnSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3906:1: ( rule__OnSize__Group__3__Impl rule__OnSize__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3907:2: rule__OnSize__Group__3__Impl rule__OnSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__37988);
            rule__OnSize__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__37991);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3914:1: rule__OnSize__Group__3__Impl : ( ( rule__OnSize__TresholdAssignment_3 ) ) ;
    public final void rule__OnSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3918:1: ( ( ( rule__OnSize__TresholdAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3919:1: ( ( rule__OnSize__TresholdAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3919:1: ( ( rule__OnSize__TresholdAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3920:1: ( rule__OnSize__TresholdAssignment_3 )
            {
             before(grammarAccess.getOnSizeAccess().getTresholdAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3921:1: ( rule__OnSize__TresholdAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3921:2: rule__OnSize__TresholdAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__TresholdAssignment_3_in_rule__OnSize__Group__3__Impl8018);
            rule__OnSize__TresholdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getTresholdAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3931:1: rule__OnSize__Group__4 : rule__OnSize__Group__4__Impl ;
    public final void rule__OnSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3935:1: ( rule__OnSize__Group__4__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3936:2: rule__OnSize__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__48048);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3942:1: rule__OnSize__Group__4__Impl : ( ( rule__OnSize__UnitAssignment_4 ) ) ;
    public final void rule__OnSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3946:1: ( ( ( rule__OnSize__UnitAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3947:1: ( ( rule__OnSize__UnitAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3947:1: ( ( rule__OnSize__UnitAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3948:1: ( rule__OnSize__UnitAssignment_4 )
            {
             before(grammarAccess.getOnSizeAccess().getUnitAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3949:1: ( rule__OnSize__UnitAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3949:2: rule__OnSize__UnitAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__UnitAssignment_4_in_rule__OnSize__Group__4__Impl8075);
            rule__OnSize__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOnSizeAccess().getUnitAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnName__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3969:1: rule__OnName__Group__0 : rule__OnName__Group__0__Impl rule__OnName__Group__1 ;
    public final void rule__OnName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3973:1: ( rule__OnName__Group__0__Impl rule__OnName__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3974:2: rule__OnName__Group__0__Impl rule__OnName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__08115);
            rule__OnName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__08118);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3981:1: rule__OnName__Group__0__Impl : ( () ) ;
    public final void rule__OnName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3985:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3986:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3986:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3987:1: ()
            {
             before(grammarAccess.getOnNameAccess().getOnNameAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3988:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3990:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4000:1: rule__OnName__Group__1 : rule__OnName__Group__1__Impl rule__OnName__Group__2 ;
    public final void rule__OnName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4004:1: ( rule__OnName__Group__1__Impl rule__OnName__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4005:2: rule__OnName__Group__1__Impl rule__OnName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__18176);
            rule__OnName__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__18179);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4012:1: rule__OnName__Group__1__Impl : ( 'name is' ) ;
    public final void rule__OnName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4016:1: ( ( 'name is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4017:1: ( 'name is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4017:1: ( 'name is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4018:1: 'name is'
            {
             before(grammarAccess.getOnNameAccess().getNameIsKeyword_1()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__OnName__Group__1__Impl8207); 
             after(grammarAccess.getOnNameAccess().getNameIsKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4031:1: rule__OnName__Group__2 : rule__OnName__Group__2__Impl rule__OnName__Group__3 ;
    public final void rule__OnName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4035:1: ( rule__OnName__Group__2__Impl rule__OnName__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4036:2: rule__OnName__Group__2__Impl rule__OnName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__28238);
            rule__OnName__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__28241);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4043:1: rule__OnName__Group__2__Impl : ( ( rule__OnName__InverseAssignment_2 )? ) ;
    public final void rule__OnName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4047:1: ( ( ( rule__OnName__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4048:1: ( ( rule__OnName__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4048:1: ( ( rule__OnName__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4049:1: ( rule__OnName__InverseAssignment_2 )?
            {
             before(grammarAccess.getOnNameAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4050:1: ( rule__OnName__InverseAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4050:2: rule__OnName__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnName__InverseAssignment_2_in_rule__OnName__Group__2__Impl8268);
                    rule__OnName__InverseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnNameAccess().getInverseAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4060:1: rule__OnName__Group__3 : rule__OnName__Group__3__Impl ;
    public final void rule__OnName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4064:1: ( rule__OnName__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4065:2: rule__OnName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__38299);
            rule__OnName__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4071:1: rule__OnName__Group__3__Impl : ( ( rule__OnName__NameAssignment_3 ) ) ;
    public final void rule__OnName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4075:1: ( ( ( rule__OnName__NameAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4076:1: ( ( rule__OnName__NameAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4076:1: ( ( rule__OnName__NameAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4077:1: ( rule__OnName__NameAssignment_3 )
            {
             before(grammarAccess.getOnNameAccess().getNameAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4078:1: ( rule__OnName__NameAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4078:2: rule__OnName__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__NameAssignment_3_in_rule__OnName__Group__3__Impl8326);
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


    // $ANTLR start "rule__OnExtension__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4096:1: rule__OnExtension__Group__0 : rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 ;
    public final void rule__OnExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4100:1: ( rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4101:2: rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__08364);
            rule__OnExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__08367);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4108:1: rule__OnExtension__Group__0__Impl : ( () ) ;
    public final void rule__OnExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4112:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4113:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4113:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4114:1: ()
            {
             before(grammarAccess.getOnExtensionAccess().getOnExtensionAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4115:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4117:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4127:1: rule__OnExtension__Group__1 : rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 ;
    public final void rule__OnExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4131:1: ( rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4132:2: rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__18425);
            rule__OnExtension__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__18428);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4139:1: rule__OnExtension__Group__1__Impl : ( 'extension is' ) ;
    public final void rule__OnExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4143:1: ( ( 'extension is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4144:1: ( 'extension is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4144:1: ( 'extension is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4145:1: 'extension is'
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionIsKeyword_1()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnExtension__Group__1__Impl8456); 
             after(grammarAccess.getOnExtensionAccess().getExtensionIsKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4158:1: rule__OnExtension__Group__2 : rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 ;
    public final void rule__OnExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4162:1: ( rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4163:2: rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__28487);
            rule__OnExtension__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__28490);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4170:1: rule__OnExtension__Group__2__Impl : ( ( rule__OnExtension__InverseAssignment_2 )? ) ;
    public final void rule__OnExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4174:1: ( ( ( rule__OnExtension__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4175:1: ( ( rule__OnExtension__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4175:1: ( ( rule__OnExtension__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4176:1: ( rule__OnExtension__InverseAssignment_2 )?
            {
             before(grammarAccess.getOnExtensionAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4177:1: ( rule__OnExtension__InverseAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==69) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4177:2: rule__OnExtension__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__InverseAssignment_2_in_rule__OnExtension__Group__2__Impl8517);
                    rule__OnExtension__InverseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnExtensionAccess().getInverseAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4187:1: rule__OnExtension__Group__3 : rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 ;
    public final void rule__OnExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4191:1: ( rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4192:2: rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__38548);
            rule__OnExtension__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__38551);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4199:1: rule__OnExtension__Group__3__Impl : ( 'in [' ) ;
    public final void rule__OnExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4203:1: ( ( 'in [' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4204:1: ( 'in [' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4204:1: ( 'in [' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4205:1: 'in ['
            {
             before(grammarAccess.getOnExtensionAccess().getInKeyword_3()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__OnExtension__Group__3__Impl8579); 
             after(grammarAccess.getOnExtensionAccess().getInKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4218:1: rule__OnExtension__Group__4 : rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 ;
    public final void rule__OnExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4222:1: ( rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4223:2: rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__48610);
            rule__OnExtension__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__48613);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4230:1: rule__OnExtension__Group__4__Impl : ( ( rule__OnExtension__Group_4__0 )? ) ;
    public final void rule__OnExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4234:1: ( ( ( rule__OnExtension__Group_4__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4235:1: ( ( rule__OnExtension__Group_4__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4235:1: ( ( rule__OnExtension__Group_4__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4236:1: ( rule__OnExtension__Group_4__0 )?
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4237:1: ( rule__OnExtension__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4237:2: rule__OnExtension__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__0_in_rule__OnExtension__Group__4__Impl8640);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4247:1: rule__OnExtension__Group__5 : rule__OnExtension__Group__5__Impl ;
    public final void rule__OnExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4251:1: ( rule__OnExtension__Group__5__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4252:2: rule__OnExtension__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__58671);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4258:1: rule__OnExtension__Group__5__Impl : ( ']' ) ;
    public final void rule__OnExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4262:1: ( ( ']' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4263:1: ( ']' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4263:1: ( ']' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4264:1: ']'
            {
             before(grammarAccess.getOnExtensionAccess().getRightSquareBracketKeyword_5()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__OnExtension__Group__5__Impl8699); 
             after(grammarAccess.getOnExtensionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnExtension__Group_4__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4289:1: rule__OnExtension__Group_4__0 : rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1 ;
    public final void rule__OnExtension__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4293:1: ( rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4294:2: rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__0__Impl_in_rule__OnExtension__Group_4__08742);
            rule__OnExtension__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__1_in_rule__OnExtension__Group_4__08745);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4301:1: rule__OnExtension__Group_4__0__Impl : ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) ) ;
    public final void rule__OnExtension__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4305:1: ( ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4306:1: ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4306:1: ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4307:1: ( rule__OnExtension__ExtensionsAssignment_4_0 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4308:1: ( rule__OnExtension__ExtensionsAssignment_4_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4308:2: rule__OnExtension__ExtensionsAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_4_0_in_rule__OnExtension__Group_4__0__Impl8772);
            rule__OnExtension__ExtensionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4318:1: rule__OnExtension__Group_4__1 : rule__OnExtension__Group_4__1__Impl ;
    public final void rule__OnExtension__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4322:1: ( rule__OnExtension__Group_4__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4323:2: rule__OnExtension__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__1__Impl_in_rule__OnExtension__Group_4__18802);
            rule__OnExtension__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4329:1: rule__OnExtension__Group_4__1__Impl : ( ( rule__OnExtension__Group_4_1__0 )* ) ;
    public final void rule__OnExtension__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4333:1: ( ( ( rule__OnExtension__Group_4_1__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4334:1: ( ( rule__OnExtension__Group_4_1__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4334:1: ( ( rule__OnExtension__Group_4_1__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4335:1: ( rule__OnExtension__Group_4_1__0 )*
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_4_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4336:1: ( rule__OnExtension__Group_4_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==57) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4336:2: rule__OnExtension__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__0_in_rule__OnExtension__Group_4__1__Impl8829);
            	    rule__OnExtension__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getOnExtensionAccess().getGroup_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__OnExtension__Group_4_1__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4350:1: rule__OnExtension__Group_4_1__0 : rule__OnExtension__Group_4_1__0__Impl rule__OnExtension__Group_4_1__1 ;
    public final void rule__OnExtension__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4354:1: ( rule__OnExtension__Group_4_1__0__Impl rule__OnExtension__Group_4_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4355:2: rule__OnExtension__Group_4_1__0__Impl rule__OnExtension__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__0__Impl_in_rule__OnExtension__Group_4_1__08864);
            rule__OnExtension__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__1_in_rule__OnExtension__Group_4_1__08867);
            rule__OnExtension__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_1__0"


    // $ANTLR start "rule__OnExtension__Group_4_1__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4362:1: rule__OnExtension__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__OnExtension__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4366:1: ( ( ',' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4367:1: ( ',' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4367:1: ( ',' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4368:1: ','
            {
             before(grammarAccess.getOnExtensionAccess().getCommaKeyword_4_1_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__OnExtension__Group_4_1__0__Impl8895); 
             after(grammarAccess.getOnExtensionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_1__0__Impl"


    // $ANTLR start "rule__OnExtension__Group_4_1__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4381:1: rule__OnExtension__Group_4_1__1 : rule__OnExtension__Group_4_1__1__Impl ;
    public final void rule__OnExtension__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4385:1: ( rule__OnExtension__Group_4_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4386:2: rule__OnExtension__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__1__Impl_in_rule__OnExtension__Group_4_1__18926);
            rule__OnExtension__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_1__1"


    // $ANTLR start "rule__OnExtension__Group_4_1__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4392:1: rule__OnExtension__Group_4_1__1__Impl : ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) ) ;
    public final void rule__OnExtension__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4396:1: ( ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4397:1: ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4397:1: ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4398:1: ( rule__OnExtension__ExtensionsAssignment_4_1_1 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4399:1: ( rule__OnExtension__ExtensionsAssignment_4_1_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4399:2: rule__OnExtension__ExtensionsAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_4_1_1_in_rule__OnExtension__Group_4_1__1__Impl8953);
            rule__OnExtension__ExtensionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__Group_4_1__1__Impl"


    // $ANTLR start "rule__IsEmpty__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4413:1: rule__IsEmpty__Group__0 : rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 ;
    public final void rule__IsEmpty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4417:1: ( rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4418:2: rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__08987);
            rule__IsEmpty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__08990);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4425:1: rule__IsEmpty__Group__0__Impl : ( () ) ;
    public final void rule__IsEmpty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4429:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4430:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4430:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4431:1: ()
            {
             before(grammarAccess.getIsEmptyAccess().getIsEmptyAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4432:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4434:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4444:1: rule__IsEmpty__Group__1 : rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 ;
    public final void rule__IsEmpty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4448:1: ( rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4449:2: rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__19048);
            rule__IsEmpty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__19051);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4456:1: rule__IsEmpty__Group__1__Impl : ( 'is' ) ;
    public final void rule__IsEmpty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4460:1: ( ( 'is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4461:1: ( 'is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4461:1: ( 'is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4462:1: 'is'
            {
             before(grammarAccess.getIsEmptyAccess().getIsKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__IsEmpty__Group__1__Impl9079); 
             after(grammarAccess.getIsEmptyAccess().getIsKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4475:1: rule__IsEmpty__Group__2 : rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 ;
    public final void rule__IsEmpty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4479:1: ( rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4480:2: rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__29110);
            rule__IsEmpty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__29113);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4487:1: rule__IsEmpty__Group__2__Impl : ( ( rule__IsEmpty__InverseAssignment_2 )? ) ;
    public final void rule__IsEmpty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4491:1: ( ( ( rule__IsEmpty__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4492:1: ( ( rule__IsEmpty__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4492:1: ( ( rule__IsEmpty__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4493:1: ( rule__IsEmpty__InverseAssignment_2 )?
            {
             before(grammarAccess.getIsEmptyAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4494:1: ( rule__IsEmpty__InverseAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4494:2: rule__IsEmpty__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__InverseAssignment_2_in_rule__IsEmpty__Group__2__Impl9140);
                    rule__IsEmpty__InverseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIsEmptyAccess().getInverseAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4504:1: rule__IsEmpty__Group__3 : rule__IsEmpty__Group__3__Impl ;
    public final void rule__IsEmpty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4508:1: ( rule__IsEmpty__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4509:2: rule__IsEmpty__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__39171);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4515:1: rule__IsEmpty__Group__3__Impl : ( 'empty' ) ;
    public final void rule__IsEmpty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4519:1: ( ( 'empty' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4520:1: ( 'empty' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4520:1: ( 'empty' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4521:1: 'empty'
            {
             before(grammarAccess.getIsEmptyAccess().getEmptyKeyword_3()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__IsEmpty__Group__3__Impl9199); 
             after(grammarAccess.getIsEmptyAccess().getEmptyKeyword_3()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4542:1: rule__OnType__Group__0 : rule__OnType__Group__0__Impl rule__OnType__Group__1 ;
    public final void rule__OnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4546:1: ( rule__OnType__Group__0__Impl rule__OnType__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4547:2: rule__OnType__Group__0__Impl rule__OnType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__09238);
            rule__OnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__09241);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4554:1: rule__OnType__Group__0__Impl : ( 'file' ) ;
    public final void rule__OnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4558:1: ( ( 'file' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4559:1: ( 'file' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4559:1: ( 'file' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4560:1: 'file'
            {
             before(grammarAccess.getOnTypeAccess().getFileKeyword_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__OnType__Group__0__Impl9269); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4573:1: rule__OnType__Group__1 : rule__OnType__Group__1__Impl rule__OnType__Group__2 ;
    public final void rule__OnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4577:1: ( rule__OnType__Group__1__Impl rule__OnType__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4578:2: rule__OnType__Group__1__Impl rule__OnType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__19300);
            rule__OnType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__19303);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4585:1: rule__OnType__Group__1__Impl : ( 'is' ) ;
    public final void rule__OnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4589:1: ( ( 'is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4590:1: ( 'is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4590:1: ( 'is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4591:1: 'is'
            {
             before(grammarAccess.getOnTypeAccess().getIsKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__OnType__Group__1__Impl9331); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4604:1: rule__OnType__Group__2 : rule__OnType__Group__2__Impl rule__OnType__Group__3 ;
    public final void rule__OnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4608:1: ( rule__OnType__Group__2__Impl rule__OnType__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4609:2: rule__OnType__Group__2__Impl rule__OnType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__29362);
            rule__OnType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__29365);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4616:1: rule__OnType__Group__2__Impl : ( ( rule__OnType__InverseAssignment_2 )? ) ;
    public final void rule__OnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4620:1: ( ( ( rule__OnType__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4621:1: ( ( rule__OnType__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4621:1: ( ( rule__OnType__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4622:1: ( rule__OnType__InverseAssignment_2 )?
            {
             before(grammarAccess.getOnTypeAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4623:1: ( rule__OnType__InverseAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4623:2: rule__OnType__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnType__InverseAssignment_2_in_rule__OnType__Group__2__Impl9392);
                    rule__OnType__InverseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOnTypeAccess().getInverseAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4633:1: rule__OnType__Group__3 : rule__OnType__Group__3__Impl ;
    public final void rule__OnType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4637:1: ( rule__OnType__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4638:2: rule__OnType__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__39423);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4644:1: rule__OnType__Group__3__Impl : ( ( rule__OnType__TypeAssignment_3 ) ) ;
    public final void rule__OnType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4648:1: ( ( ( rule__OnType__TypeAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4649:1: ( ( rule__OnType__TypeAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4649:1: ( ( rule__OnType__TypeAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4650:1: ( rule__OnType__TypeAssignment_3 )
            {
             before(grammarAccess.getOnTypeAccess().getTypeAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4651:1: ( rule__OnType__TypeAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4651:2: rule__OnType__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__TypeAssignment_3_in_rule__OnType__Group__3__Impl9450);
            rule__OnType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4669:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4673:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4674:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09488);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09491);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4681:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4685:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4686:1: ( ( '-' )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4686:1: ( ( '-' )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4687:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4688:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==65) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4689:2: '-'
                    {
                    match(input,65,FollowSets000.FOLLOW_65_in_rule__EInt__Group__0__Impl9520); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4700:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4704:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4705:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19553);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4711:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4715:1: ( ( RULE_INT ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4716:1: ( RULE_INT )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4716:1: ( RULE_INT )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4717:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9580); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4733:1: rule__Model__ExecutionsAssignment_1 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4737:1: ( ( ruleExecution ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4738:1: ( ruleExecution )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4738:1: ( ruleExecution )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4739:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_19618);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4748:1: rule__Model__ExecutionsAssignment_2_1 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4752:1: ( ( ruleExecution ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4753:1: ( ruleExecution )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4753:1: ( ruleExecution )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4754:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_2_19649);
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


    // $ANTLR start "rule__PathVariable__NameAssignment_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4763:1: rule__PathVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__PathVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4767:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4768:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4768:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4769:1: ruleEString
            {
             before(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_09680);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4778:1: rule__PathVariable__ValueAssignment_2 : ( rulePath ) ;
    public final void rule__PathVariable__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4782:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4783:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4783:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4784:1: rulePath
            {
             before(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_29711);
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


    // $ANTLR start "rule__Path__StepsAssignment_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4793:1: rule__Path__StepsAssignment_0 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4797:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4798:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4798:1: ( ruleGenericStep )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4799:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_09742);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__StepsAssignment_0"


    // $ANTLR start "rule__Path__StepsAssignment_1_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4808:1: rule__Path__StepsAssignment_1_1 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4812:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4813:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4813:1: ( ruleGenericStep )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4814:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_1_19773);
            ruleGenericStep();

            state._fsp--;

             after(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__StepsAssignment_1_1"


    // $ANTLR start "rule__ConcreteStep__ValueAssignment_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4823:1: rule__ConcreteStep__ValueAssignment_0 : ( ruleEString ) ;
    public final void rule__ConcreteStep__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4827:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4828:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4828:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4829:1: ruleEString
            {
             before(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment_09804);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__ValueAssignment_0"


    // $ANTLR start "rule__ConcreteStep__AbsoluteAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4838:1: rule__ConcreteStep__AbsoluteAssignment_1 : ( ( ':' ) ) ;
    public final void rule__ConcreteStep__AbsoluteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4842:1: ( ( ( ':' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4843:1: ( ( ':' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4843:1: ( ( ':' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4844:1: ( ':' )
            {
             before(grammarAccess.getConcreteStepAccess().getAbsoluteColonKeyword_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4845:1: ( ':' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4846:1: ':'
            {
             before(grammarAccess.getConcreteStepAccess().getAbsoluteColonKeyword_1_0()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__ConcreteStep__AbsoluteAssignment_19840); 
             after(grammarAccess.getConcreteStepAccess().getAbsoluteColonKeyword_1_0()); 

            }

             after(grammarAccess.getConcreteStepAccess().getAbsoluteColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteStep__AbsoluteAssignment_1"


    // $ANTLR start "rule__VariableStep__ValueAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4861:1: rule__VariableStep__ValueAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__VariableStep__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4865:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4866:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4866:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4867:1: ( ruleEString )
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4868:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4869:1: ruleEString
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_19883);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4880:1: rule__ParametrizedStep__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParametrizedStep__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4884:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4885:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4885:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4886:1: ruleEString
            {
             before(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_29918);
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


    // $ANTLR start "rule__Selection__NameAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4895:1: rule__Selection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4899:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4900:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4900:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4901:1: ruleEString
            {
             before(grammarAccess.getSelectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Selection__NameAssignment_19949);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__NameAssignment_1"


    // $ANTLR start "rule__Selection__FromAssignment_3"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4910:1: rule__Selection__FromAssignment_3 : ( rulePath ) ;
    public final void rule__Selection__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4914:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4915:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4915:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4916:1: rulePath
            {
             before(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Selection__FromAssignment_39980);
            rulePath();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__FromAssignment_3"


    // $ANTLR start "rule__Selection__WhereAssignment_4_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4925:1: rule__Selection__WhereAssignment_4_1 : ( ruleFilterComponent ) ;
    public final void rule__Selection__WhereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4929:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4930:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4930:1: ( ruleFilterComponent )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4931:1: ruleFilterComponent
            {
             before(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_4_110011);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__WhereAssignment_4_1"


    // $ANTLR start "rule__Copy__SourceAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4940:1: rule__Copy__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Copy__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4944:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4945:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4945:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4946:1: ( ruleEString )
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionCrossReference_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4947:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4948:1: ruleEString
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_210046);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getSourceSelectionCrossReference_2_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4959:1: rule__Copy__DestinationAssignment_4 : ( rulePath ) ;
    public final void rule__Copy__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4963:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4964:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4964:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4965:1: rulePath
            {
             before(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_410081);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4974:1: rule__Copy__StrategyAssignment_5_1 : ( ruleStrategies ) ;
    public final void rule__Copy__StrategyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4978:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4979:1: ( ruleStrategies )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4979:1: ( ruleStrategies )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4980:1: ruleStrategies
            {
             before(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_5_110112);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4989:1: rule__Move__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Move__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4993:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4994:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4994:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4995:1: ( ruleEString )
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionCrossReference_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4996:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4997:1: ruleEString
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Move__SourceAssignment_210147);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMoveAccess().getSourceSelectionCrossReference_2_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5008:1: rule__Move__DestinationAssignment_4 : ( rulePath ) ;
    public final void rule__Move__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5012:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5013:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5013:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5014:1: rulePath
            {
             before(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Move__DestinationAssignment_410182);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5023:1: rule__Move__StrategyAssignment_5_1 : ( ruleStrategies ) ;
    public final void rule__Move__StrategyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5027:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5028:1: ( ruleStrategies )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5028:1: ( ruleStrategies )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5029:1: ruleStrategies
            {
             before(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_5_110213);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5038:1: rule__Delete__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Delete__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5042:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5043:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5043:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5044:1: ( ruleEString )
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionCrossReference_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5045:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5046:1: ruleEString
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_210248);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDeleteAccess().getSourceSelectionCrossReference_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__FilterContainer__LinksAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5057:1: rule__FilterContainer__LinksAssignment_1 : ( ruleLink ) ;
    public final void rule__FilterContainer__LinksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5061:1: ( ( ruleLink ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5062:1: ( ruleLink )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5062:1: ( ruleLink )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5063:1: ruleLink
            {
             before(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_110283);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__LinksAssignment_1"


    // $ANTLR start "rule__FilterContainer__LinksAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5072:1: rule__FilterContainer__LinksAssignment_2 : ( ruleLink ) ;
    public final void rule__FilterContainer__LinksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5076:1: ( ( ruleLink ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5077:1: ( ruleLink )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5077:1: ( ruleLink )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5078:1: ruleLink
            {
             before(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_210314);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterContainer__LinksAssignment_2"


    // $ANTLR start "rule__Link__AndAssignment_0_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5087:1: rule__Link__AndAssignment_0_0 : ( ( 'and' ) ) ;
    public final void rule__Link__AndAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5091:1: ( ( ( 'and' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5092:1: ( ( 'and' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5092:1: ( ( 'and' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5093:1: ( 'and' )
            {
             before(grammarAccess.getLinkAccess().getAndAndKeyword_0_0_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5094:1: ( 'and' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5095:1: 'and'
            {
             before(grammarAccess.getLinkAccess().getAndAndKeyword_0_0_0()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__Link__AndAssignment_0_010350); 
             after(grammarAccess.getLinkAccess().getAndAndKeyword_0_0_0()); 

            }

             after(grammarAccess.getLinkAccess().getAndAndKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__AndAssignment_0_0"


    // $ANTLR start "rule__Link__OrAssignment_0_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5110:1: rule__Link__OrAssignment_0_1 : ( ( 'or' ) ) ;
    public final void rule__Link__OrAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5114:1: ( ( ( 'or' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5115:1: ( ( 'or' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5115:1: ( ( 'or' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5116:1: ( 'or' )
            {
             before(grammarAccess.getLinkAccess().getOrOrKeyword_0_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5117:1: ( 'or' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5118:1: 'or'
            {
             before(grammarAccess.getLinkAccess().getOrOrKeyword_0_1_0()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__Link__OrAssignment_0_110394); 
             after(grammarAccess.getLinkAccess().getOrOrKeyword_0_1_0()); 

            }

             after(grammarAccess.getLinkAccess().getOrOrKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__OrAssignment_0_1"


    // $ANTLR start "rule__Link__ElementAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5133:1: rule__Link__ElementAssignment_1 : ( ruleFilterComponent ) ;
    public final void rule__Link__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5137:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5138:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5138:1: ( ruleFilterComponent )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5139:1: ruleFilterComponent
            {
             before(grammarAccess.getLinkAccess().getElementFilterComponentParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Link__ElementAssignment_110433);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getElementFilterComponentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__ElementAssignment_1"


    // $ANTLR start "rule__OnAttributes__NameAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5148:1: rule__OnAttributes__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OnAttributes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5152:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5153:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5153:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5154:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_110464);
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


    // $ANTLR start "rule__OnAttributes__InverseAssignment_2_0_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5163:1: rule__OnAttributes__InverseAssignment_2_0_0 : ( ( 'not' ) ) ;
    public final void rule__OnAttributes__InverseAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5167:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5168:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5168:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5169:1: ( 'not' )
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5170:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5171:1: 'not'
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_0_010500); 
             after(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__InverseAssignment_2_0_0"


    // $ANTLR start "rule__OnAttributes__InverseAssignment_2_1_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5186:1: rule__OnAttributes__InverseAssignment_2_1_1 : ( ( 'not' ) ) ;
    public final void rule__OnAttributes__InverseAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5190:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5191:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5191:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5192:1: ( 'not' )
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5193:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5194:1: 'not'
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_1_110544); 
             after(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0()); 

            }

             after(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__InverseAssignment_2_1_1"


    // $ANTLR start "rule__OnAttributes__ValueAssignment_2_1_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5209:1: rule__OnAttributes__ValueAssignment_2_1_2 : ( ruleEString ) ;
    public final void rule__OnAttributes__ValueAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5213:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5214:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5214:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5215:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_2_1_210583);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnAttributes__ValueAssignment_2_1_2"


    // $ANTLR start "rule__OnTags__TagsAssignment_1_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5224:1: rule__OnTags__TagsAssignment_1_0 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5228:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5229:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5229:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5230:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_010614);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5239:1: rule__OnTags__TagsAssignment_1_1_1 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5243:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5244:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5244:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5245:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_1_110645);
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


    // $ANTLR start "rule__OnTags__QuantificatorAssignment_3_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5254:1: rule__OnTags__QuantificatorAssignment_3_0 : ( ruleQuantificators ) ;
    public final void rule__OnTags__QuantificatorAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5258:1: ( ( ruleQuantificators ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5259:1: ( ruleQuantificators )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5259:1: ( ruleQuantificators )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5260:1: ruleQuantificators
            {
             before(grammarAccess.getOnTagsAccess().getQuantificatorQuantificatorsEnumRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantificators_in_rule__OnTags__QuantificatorAssignment_3_010676);
            ruleQuantificators();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getQuantificatorQuantificatorsEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__QuantificatorAssignment_3_0"


    // $ANTLR start "rule__OnTags__TresholdAssignment_3_1_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5269:1: rule__OnTags__TresholdAssignment_3_1_0 : ( ruleEInt ) ;
    public final void rule__OnTags__TresholdAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5273:1: ( ( ruleEInt ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5274:1: ( ruleEInt )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5274:1: ( ruleEInt )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5275:1: ruleEInt
            {
             before(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_3_1_010707);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__TresholdAssignment_3_1_0"


    // $ANTLR start "rule__OnTags__InverseAssignment_4"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5284:1: rule__OnTags__InverseAssignment_4 : ( ( 'not' ) ) ;
    public final void rule__OnTags__InverseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5288:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5289:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5289:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5290:1: ( 'not' )
            {
             before(grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5291:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5292:1: 'not'
            {
             before(grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnTags__InverseAssignment_410743); 
             after(grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0()); 

            }

             after(grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__InverseAssignment_4"


    // $ANTLR start "rule__OnTags__OnlyAssignment_6"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5307:1: rule__OnTags__OnlyAssignment_6 : ( ( 'and no more tags' ) ) ;
    public final void rule__OnTags__OnlyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5311:1: ( ( ( 'and no more tags' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5312:1: ( ( 'and no more tags' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5312:1: ( ( 'and no more tags' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5313:1: ( 'and no more tags' )
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAndNoMoreTagsKeyword_6_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5314:1: ( 'and no more tags' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5315:1: 'and no more tags'
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAndNoMoreTagsKeyword_6_0()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__OnTags__OnlyAssignment_610787); 
             after(grammarAccess.getOnTagsAccess().getOnlyAndNoMoreTagsKeyword_6_0()); 

            }

             after(grammarAccess.getOnTagsAccess().getOnlyAndNoMoreTagsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTags__OnlyAssignment_6"


    // $ANTLR start "rule__OnTime__TimeOfAssignment_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5330:1: rule__OnTime__TimeOfAssignment_0 : ( ruleTimeType ) ;
    public final void rule__OnTime__TimeOfAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5334:1: ( ( ruleTimeType ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5335:1: ( ruleTimeType )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5335:1: ( ruleTimeType )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5336:1: ruleTimeType
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_010826);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TimeOfAssignment_0"


    // $ANTLR start "rule__OnTime__OperatorAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5345:1: rule__OnTime__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__OnTime__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5349:1: ( ( ruleOperator ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5350:1: ( ruleOperator )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5350:1: ( ruleOperator )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5351:1: ruleOperator
            {
             before(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_210857);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__OperatorAssignment_2"


    // $ANTLR start "rule__OnTime__TresholdAssignment_3"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5360:1: rule__OnTime__TresholdAssignment_3 : ( ruleEInt ) ;
    public final void rule__OnTime__TresholdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5364:1: ( ( ruleEInt ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5365:1: ( ruleEInt )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5365:1: ( ruleEInt )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5366:1: ruleEInt
            {
             before(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_310888);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__TresholdAssignment_3"


    // $ANTLR start "rule__OnTime__UnitAssignment_4"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5375:1: rule__OnTime__UnitAssignment_4 : ( ruleTimeUnit ) ;
    public final void rule__OnTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5379:1: ( ( ruleTimeUnit ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5380:1: ( ruleTimeUnit )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5380:1: ( ruleTimeUnit )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5381:1: ruleTimeUnit
            {
             before(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_410919);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnTime__UnitAssignment_4"


    // $ANTLR start "rule__OnSize__InverseAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5390:1: rule__OnSize__InverseAssignment_1 : ( ( 'not' ) ) ;
    public final void rule__OnSize__InverseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5394:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5395:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5395:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5396:1: ( 'not' )
            {
             before(grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5397:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5398:1: 'not'
            {
             before(grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnSize__InverseAssignment_110955); 
             after(grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0()); 

            }

             after(grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__InverseAssignment_1"


    // $ANTLR start "rule__OnSize__OperatorAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5413:1: rule__OnSize__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__OnSize__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5417:1: ( ( ruleOperator ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5418:1: ( ruleOperator )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5418:1: ( ruleOperator )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5419:1: ruleOperator
            {
             before(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_210994);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__OperatorAssignment_2"


    // $ANTLR start "rule__OnSize__TresholdAssignment_3"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5428:1: rule__OnSize__TresholdAssignment_3 : ( ruleEInt ) ;
    public final void rule__OnSize__TresholdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5432:1: ( ( ruleEInt ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5433:1: ( ruleEInt )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5433:1: ( ruleEInt )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5434:1: ruleEInt
            {
             before(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_311025);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__TresholdAssignment_3"


    // $ANTLR start "rule__OnSize__UnitAssignment_4"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5443:1: rule__OnSize__UnitAssignment_4 : ( ruleMemoryUnit ) ;
    public final void rule__OnSize__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5447:1: ( ( ruleMemoryUnit ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5448:1: ( ruleMemoryUnit )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5448:1: ( ruleMemoryUnit )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5449:1: ruleMemoryUnit
            {
             before(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_411056);
            ruleMemoryUnit();

            state._fsp--;

             after(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnSize__UnitAssignment_4"


    // $ANTLR start "rule__OnName__InverseAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5458:1: rule__OnName__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__OnName__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5462:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5463:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5463:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5464:1: ( 'not' )
            {
             before(grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5465:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5466:1: 'not'
            {
             before(grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnName__InverseAssignment_211092); 
             after(grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0()); 

            }

             after(grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnName__InverseAssignment_2"


    // $ANTLR start "rule__OnName__NameAssignment_3"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5481:1: rule__OnName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OnName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5485:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5486:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5486:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5487:1: ruleEString
            {
             before(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnName__NameAssignment_311131);
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


    // $ANTLR start "rule__OnExtension__InverseAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5496:1: rule__OnExtension__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__OnExtension__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5500:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5501:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5501:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5502:1: ( 'not' )
            {
             before(grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5503:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5504:1: 'not'
            {
             before(grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnExtension__InverseAssignment_211167); 
             after(grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0()); 

            }

             after(grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__InverseAssignment_2"


    // $ANTLR start "rule__OnExtension__ExtensionsAssignment_4_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5519:1: rule__OnExtension__ExtensionsAssignment_4_0 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5523:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5524:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5524:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5525:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_011206);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__ExtensionsAssignment_4_0"


    // $ANTLR start "rule__OnExtension__ExtensionsAssignment_4_1_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5534:1: rule__OnExtension__ExtensionsAssignment_4_1_1 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5538:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5539:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5539:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5540:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_1_111237);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnExtension__ExtensionsAssignment_4_1_1"


    // $ANTLR start "rule__IsEmpty__InverseAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5549:1: rule__IsEmpty__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__IsEmpty__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5553:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5554:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5554:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5555:1: ( 'not' )
            {
             before(grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5556:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5557:1: 'not'
            {
             before(grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__IsEmpty__InverseAssignment_211273); 
             after(grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0()); 

            }

             after(grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsEmpty__InverseAssignment_2"


    // $ANTLR start "rule__OnType__InverseAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5572:1: rule__OnType__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__OnType__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5576:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5577:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5577:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5578:1: ( 'not' )
            {
             before(grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5579:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5580:1: 'not'
            {
             before(grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnType__InverseAssignment_211317); 
             after(grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0()); 

            }

             after(grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__InverseAssignment_2"


    // $ANTLR start "rule__OnType__TypeAssignment_3"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5595:1: rule__OnType__TypeAssignment_3 : ( ruleFileType ) ;
    public final void rule__OnType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5599:1: ( ( ruleFileType ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5600:1: ( ruleFileType )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5600:1: ( ruleFileType )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5601:1: ruleFileType
            {
             before(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_311356);
            ruleFileType();

            state._fsp--;

             after(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnType__TypeAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_entryRuleExecution121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExecution128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Execution__Alternatives_in_ruleExecution154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_entryRulePathVariable181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathVariable188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__0_in_rulePathVariable214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_entryRulePath241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePath248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_entryRuleGenericStep301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGenericStep308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GenericStep__Alternatives_in_ruleGenericStep334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_entryRuleConcreteStep361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConcreteStep368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__0_in_ruleConcreteStep394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_entryRuleVariableStep421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStep428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__0_in_ruleVariableStep454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_entryRuleParametrizedStep481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametrizedStep488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__0_in_ruleParametrizedStep514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__0_in_ruleSelection574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_entryRuleCopy601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopy608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__0_in_ruleCopy634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0_in_ruleMove694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_entryRuleDelete721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelete728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__0_in_ruleDelete754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_entryRuleFilterContainer781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterContainer788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__0_in_ruleFilterContainer814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_entryRuleFilterComponent901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFilterComponent908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterComponent__Alternatives_in_ruleFilterComponent934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_entryRuleOnAttributes961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnAttributes968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__0_in_ruleOnAttributes994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_entryRuleOnTags1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTags1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__0_in_ruleOnTags1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_entryRuleOnTime1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnTime1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__0_in_ruleOnTime1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_entryRuleOnSize1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnSize1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__0_in_ruleOnSize1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_entryRuleOnName1201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnName1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__0_in_ruleOnName1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_entryRuleOnExtension1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnExtension1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__0_in_ruleOnExtension1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_entryRuleIsEmpty1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsEmpty1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__0_in_ruleIsEmpty1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_entryRuleOnType1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnType1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__0_in_ruleOnType1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Strategies__Alternatives_in_ruleStrategies1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeType__Alternatives_in_ruleTimeType1681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quantificators__Alternatives_in_ruleQuantificators1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MemoryUnit__Alternatives_in_ruleMemoryUnit1753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FileType__Alternatives_in_ruleFileType1789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_rule__Execution__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_rule__Execution__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Execution__Alternatives1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_rule__Execution__Alternatives1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_rule__Execution__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_rule__GenericStep__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_rule__GenericStep__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_rule__GenericStep__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__AndAssignment_0_0_in_rule__Link__Alternatives_01990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__OrAssignment_0_1_in_rule__Link__Alternatives_02008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_rule__FilterComponent__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_rule__FilterComponent__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_rule__FilterComponent__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_rule__FilterComponent__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_rule__FilterComponent__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_rule__FilterComponent__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_rule__FilterComponent__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_rule__FilterComponent__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_rule__FilterComponent__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__0_in_rule__OnAttributes__Alternatives_22209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__0_in_rule__OnAttributes__Alternatives_22227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__QuantificatorAssignment_3_0_in_rule__OnTags__Alternatives_32260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__0_in_rule__OnTags__Alternatives_32278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Strategies__Alternatives2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Strategies__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Strategies__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Operator__Alternatives2440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Operator__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives2482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TimeUnit__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TimeUnit__Alternatives2581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TimeUnit__Alternatives2602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TimeUnit__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TimeUnit__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TimeUnit__Alternatives2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TimeType__Alternatives2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TimeType__Alternatives2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Quantificators__Alternatives2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Quantificators__Alternatives2779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MemoryUnit__Alternatives2815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MemoryUnit__Alternatives2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MemoryUnit__Alternatives2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MemoryUnit__Alternatives2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__FileType__Alternatives2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__FileType__Alternatives2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02968 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13029 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_1_in_rule__Model__Group__1__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl3116 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__03153 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__03156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Model__Group_2__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__13215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_2_1_in_rule__Model__Group_2__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__03276 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__03279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__NameAssignment_0_in_rule__PathVariable__Group__0__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__13336 = new BitSet(new long[]{0x000192C000000030L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__13339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__PathVariable__Group__1__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__23398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__ValueAssignment_2_in_rule__PathVariable__Group__2__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__03461 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__03464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_0_in_rule__Path__Group__0__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__13521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl3548 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__03583 = new BitSet(new long[]{0x000192C000000030L});
        public static final BitSet FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__03586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Path__Group_1__0__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__13645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_1_1_in_rule__Path__Group_1__1__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__0__Impl_in_rule__ConcreteStep__Group__03706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__1_in_rule__ConcreteStep__Group__03709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__ValueAssignment_0_in_rule__ConcreteStep__Group__0__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__1__Impl_in_rule__ConcreteStep__Group__13766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__AbsoluteAssignment_1_in_rule__ConcreteStep__Group__1__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__03828 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__03831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__VariableStep__Group__0__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__13890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__ValueAssignment_1_in_rule__VariableStep__Group__1__Impl3917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__03951 = new BitSet(new long[]{0x000192C000000030L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__03954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__14012 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__14015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__ParametrizedStep__Group__1__Impl4043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__24074 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__3_in_rule__ParametrizedStep__Group__24077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__3__Impl_in_rule__ParametrizedStep__Group__34134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ParametrizedStep__Group__3__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__04201 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__04204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Selection__Group__0__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__14263 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__14266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__24323 = new BitSet(new long[]{0x000192C000000030L});
        public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__24326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Selection__Group__2__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__34385 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__34388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__FromAssignment_3_in_rule__Selection__Group__3__Impl4415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__44445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__0_in_rule__Selection__Group__4__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__0__Impl_in_rule__Selection__Group_4__04513 = new BitSet(new long[]{0x706A000006000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__1_in_rule__Selection__Group_4__04516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Selection__Group_4__0__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__1__Impl_in_rule__Selection__Group_4__14575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__WhereAssignment_4_1_in_rule__Selection__Group_4__1__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__04636 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__04639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Copy__Group__0__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__14698 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__14701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Copy__Group__1__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__24760 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__24763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__SourceAssignment_2_in_rule__Copy__Group__2__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__34820 = new BitSet(new long[]{0x000192C000000030L});
        public static final BitSet FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__34823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Copy__Group__3__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__44882 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__44885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__DestinationAssignment_4_in_rule__Copy__Group__4__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__54942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__0_in_rule__Copy__Group__5__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__0__Impl_in_rule__Copy__Group_5__05012 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__1_in_rule__Copy__Group_5__05015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Copy__Group_5__0__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__1__Impl_in_rule__Copy__Group_5__15074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__StrategyAssignment_5_1_in_rule__Copy__Group_5__1__Impl5101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__05135 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__05138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Move__Group__0__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__15197 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__15200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Move__Group__1__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__25259 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__25262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SourceAssignment_2_in_rule__Move__Group__2__Impl5289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__35319 = new BitSet(new long[]{0x000192C000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__35322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Move__Group__3__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__45381 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__5_in_rule__Move__Group__45384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__DestinationAssignment_4_in_rule__Move__Group__4__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__55441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__0_in_rule__Move__Group__5__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__0__Impl_in_rule__Move__Group_5__05511 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Move__Group_5__1_in_rule__Move__Group_5__05514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Move__Group_5__0__Impl5542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__1__Impl_in_rule__Move__Group_5__15573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__StrategyAssignment_5_1_in_rule__Move__Group_5__1__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__05634 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__05637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Delete__Group__0__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__15696 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__15699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Delete__Group__1__Impl5727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__25758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__SourceAssignment_2_in_rule__Delete__Group__2__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__05821 = new BitSet(new long[]{0x706A000006000000L,0x0000000000000019L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__05824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__FilterContainer__Group__0__Impl5852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__15883 = new BitSet(new long[]{0x706E000006000000L,0x0000000000000019L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__15886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__LinksAssignment_1_in_rule__FilterContainer__Group__1__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__25943 = new BitSet(new long[]{0x706E000006000000L,0x0000000000000019L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__25946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__LinksAssignment_2_in_rule__FilterContainer__Group__2__Impl5973 = new BitSet(new long[]{0x706A000006000002L,0x0000000000000019L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__36004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__FilterContainer__Group__3__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__06071 = new BitSet(new long[]{0x706A000006000000L,0x0000000000000019L});
        public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__06074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Alternatives_0_in_rule__Link__Group__0__Impl6101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__16132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__ElementAssignment_1_in_rule__Link__Group__1__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__06193 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__06196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__OnAttributes__Group__0__Impl6224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__16255 = new BitSet(new long[]{0x0030000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__16258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl6285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__26315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Alternatives_2_in_rule__OnAttributes__Group__2__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__0__Impl_in_rule__OnAttributes__Group_2_0__06378 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__1_in_rule__OnAttributes__Group_2_0__06381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__InverseAssignment_2_0_0_in_rule__OnAttributes__Group_2_0__0__Impl6408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__1__Impl_in_rule__OnAttributes__Group_2_0__16439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__OnAttributes__Group_2_0__1__Impl6467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__0__Impl_in_rule__OnAttributes__Group_2_1__06502 = new BitSet(new long[]{0x0001920000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__1_in_rule__OnAttributes__Group_2_1__06505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__OnAttributes__Group_2_1__0__Impl6533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__1__Impl_in_rule__OnAttributes__Group_2_1__16564 = new BitSet(new long[]{0x0001920000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__2_in_rule__OnAttributes__Group_2_1__16567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__InverseAssignment_2_1_1_in_rule__OnAttributes__Group_2_1__1__Impl6594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__2__Impl_in_rule__OnAttributes__Group_2_1__26625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__ValueAssignment_2_1_2_in_rule__OnAttributes__Group_2_1__2__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__06688 = new BitSet(new long[]{0x0081920000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__06691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__OnTags__Group__0__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__16750 = new BitSet(new long[]{0x0081920000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__16753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__0_in_rule__OnTags__Group__1__Impl6780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__26811 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__26814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__OnTags__Group__2__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__36873 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__36876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Alternatives_3_in_rule__OnTags__Group__3__Impl6903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__46933 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__46936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__InverseAssignment_4_in_rule__OnTags__Group__4__Impl6963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__56994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__56997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__OnTags__Group__5__Impl7025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__67056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__OnlyAssignment_6_in_rule__OnTags__Group__6__Impl7083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__0__Impl_in_rule__OnTags__Group_1__07128 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__1_in_rule__OnTags__Group_1__07131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_1_0_in_rule__OnTags__Group_1__0__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__1__Impl_in_rule__OnTags__Group_1__17188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__0_in_rule__OnTags__Group_1__1__Impl7215 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__0__Impl_in_rule__OnTags__Group_1_1__07250 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__1_in_rule__OnTags__Group_1_1__07253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__OnTags__Group_1_1__0__Impl7281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__1__Impl_in_rule__OnTags__Group_1_1__17312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_1_1_1_in_rule__OnTags__Group_1_1__1__Impl7339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__0__Impl_in_rule__OnTags__Group_3_1__07373 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__1_in_rule__OnTags__Group_3_1__07376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TresholdAssignment_3_1_0_in_rule__OnTags__Group_3_1__0__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__1__Impl_in_rule__OnTags__Group_3_1__17433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnTags__Group_3_1__1__Impl7461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__07496 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__07499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TimeOfAssignment_0_in_rule__OnTime__Group__0__Impl7526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__17556 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__17559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__OnTime__Group__1__Impl7587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__27618 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__27621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__OperatorAssignment_2_in_rule__OnTime__Group__2__Impl7648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__37678 = new BitSet(new long[]{0x0000000001F80000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__37681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TresholdAssignment_3_in_rule__OnTime__Group__3__Impl7708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__47738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__UnitAssignment_4_in_rule__OnTime__Group__4__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__07805 = new BitSet(new long[]{0x000000000007C000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__07808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__OnSize__Group__0__Impl7836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__17867 = new BitSet(new long[]{0x000000000007C000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__17870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__InverseAssignment_1_in_rule__OnSize__Group__1__Impl7897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__27928 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__27931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__OperatorAssignment_2_in_rule__OnSize__Group__2__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__37988 = new BitSet(new long[]{0x00000001E0000000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__37991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__TresholdAssignment_3_in_rule__OnSize__Group__3__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__48048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__UnitAssignment_4_in_rule__OnSize__Group__4__Impl8075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__08115 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__08118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__18176 = new BitSet(new long[]{0x0001920000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__18179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__OnName__Group__1__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__28238 = new BitSet(new long[]{0x0001920000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__28241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__InverseAssignment_2_in_rule__OnName__Group__2__Impl8268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__38299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__NameAssignment_3_in_rule__OnName__Group__3__Impl8326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__08364 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__08367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__18425 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__18428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnExtension__Group__1__Impl8456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__28487 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__28490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__InverseAssignment_2_in_rule__OnExtension__Group__2__Impl8517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__38548 = new BitSet(new long[]{0x0081920000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__38551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__OnExtension__Group__3__Impl8579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__48610 = new BitSet(new long[]{0x0081920000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__48613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__0_in_rule__OnExtension__Group__4__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__58671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__OnExtension__Group__5__Impl8699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__0__Impl_in_rule__OnExtension__Group_4__08742 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__1_in_rule__OnExtension__Group_4__08745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_4_0_in_rule__OnExtension__Group_4__0__Impl8772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__1__Impl_in_rule__OnExtension__Group_4__18802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__0_in_rule__OnExtension__Group_4__1__Impl8829 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__0__Impl_in_rule__OnExtension__Group_4_1__08864 = new BitSet(new long[]{0x0001920000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__1_in_rule__OnExtension__Group_4_1__08867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__OnExtension__Group_4_1__0__Impl8895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__1__Impl_in_rule__OnExtension__Group_4_1__18926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_4_1_1_in_rule__OnExtension__Group_4_1__1__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__08987 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__08990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__19048 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__19051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__IsEmpty__Group__1__Impl9079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__29110 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__29113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__InverseAssignment_2_in_rule__IsEmpty__Group__2__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__39171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__IsEmpty__Group__3__Impl9199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__09238 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__09241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__OnType__Group__0__Impl9269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__19300 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__19303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__OnType__Group__1__Impl9331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__29362 = new BitSet(new long[]{0x0000000600000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__29365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__InverseAssignment_2_in_rule__OnType__Group__2__Impl9392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__39423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__TypeAssignment_3_in_rule__OnType__Group__3__Impl9450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09488 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__EInt__Group__0__Impl9520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_19618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_2_19649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_09680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_29711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_09742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_1_19773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment_09804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__ConcreteStep__AbsoluteAssignment_19840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_19883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_29918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Selection__NameAssignment_19949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Selection__FromAssignment_39980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_4_110011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_210046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_410081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_5_110112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Move__SourceAssignment_210147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Move__DestinationAssignment_410182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_5_110213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_210248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_110283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_210314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__Link__AndAssignment_0_010350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__Link__OrAssignment_0_110394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Link__ElementAssignment_110433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_110464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_0_010500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_1_110544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_2_1_210583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_010614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_1_110645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantificators_in_rule__OnTags__QuantificatorAssignment_3_010676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_3_1_010707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnTags__InverseAssignment_410743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__OnTags__OnlyAssignment_610787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_010826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_210857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_310888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_410919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnSize__InverseAssignment_110955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_210994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_311025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_411056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnName__InverseAssignment_211092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnName__NameAssignment_311131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnExtension__InverseAssignment_211167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_011206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_1_111237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__IsEmpty__InverseAssignment_211273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnType__InverseAssignment_211317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_311356 = new BitSet(new long[]{0x0000000000000002L});
    }


}