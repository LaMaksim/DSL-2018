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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'forced'", "'append'", "'carefully'", "'=='", "'<'", "'>'", "'<='", "'>='", "'mins'", "'hours'", "'days'", "'weeks'", "'months'", "'years'", "'modified'", "'created'", "'any are'", "'all are'", "'KB'", "'MB'", "'GB'", "'TB'", "'and'", "'or'", "'Document'", "'Directory'", "';'", "'='", "'/'", "'?'", "'{$'", "'}'", "'select'", "'from'", "'where'", "','", "'copy'", "'to'", "'strategy:'", "'move'", "'delete'", "'('", "')'", "'attribute'", "'exist'", "'is'", "'in ['", "']'", "'in tags'", "'are'", "'before'", "'size of file'", "'name is'", "'extension is'", "'empty'", "'file'", "'-'", "':'", "'not'", "'and no more tags'"
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


    // $ANTLR start "ruleCompositionType"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:877:1: ruleCompositionType : ( ( rule__CompositionType__Alternatives ) ) ;
    public final void ruleCompositionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:881:1: ( ( ( rule__CompositionType__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:882:1: ( ( rule__CompositionType__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:882:1: ( ( rule__CompositionType__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:883:1: ( rule__CompositionType__Alternatives )
            {
             before(grammarAccess.getCompositionTypeAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:884:1: ( rule__CompositionType__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:884:2: rule__CompositionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositionType__Alternatives_in_ruleCompositionType1789);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:896:1: ruleFileType : ( ( rule__FileType__Alternatives ) ) ;
    public final void ruleFileType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:900:1: ( ( ( rule__FileType__Alternatives ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:901:1: ( ( rule__FileType__Alternatives ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:901:1: ( ( rule__FileType__Alternatives ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:902:1: ( rule__FileType__Alternatives )
            {
             before(grammarAccess.getFileTypeAccess().getAlternatives()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:903:1: ( rule__FileType__Alternatives )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:903:2: rule__FileType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FileType__Alternatives_in_ruleFileType1825);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:914:1: rule__Execution__Alternatives : ( ( ruleSelection ) | ( ruleCopy ) | ( ruleMove ) | ( ruleDelete ) | ( rulePathVariable ) );
    public final void rule__Execution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:918:1: ( ( ruleSelection ) | ( ruleCopy ) | ( ruleMove ) | ( ruleDelete ) | ( rulePathVariable ) )
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
            case 50:
                {
                alt1=3;
                }
                break;
            case 51:
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
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:919:1: ( ruleSelection )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:919:1: ( ruleSelection )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:920:1: ruleSelection
                    {
                     before(grammarAccess.getExecutionAccess().getSelectionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSelection_in_rule__Execution__Alternatives1860);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getSelectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:925:6: ( ruleCopy )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:925:6: ( ruleCopy )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:926:1: ruleCopy
                    {
                     before(grammarAccess.getExecutionAccess().getCopyParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCopy_in_rule__Execution__Alternatives1877);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getCopyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:931:6: ( ruleMove )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:931:6: ( ruleMove )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:932:1: ruleMove
                    {
                     before(grammarAccess.getExecutionAccess().getMoveParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Execution__Alternatives1894);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getMoveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:937:6: ( ruleDelete )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:937:6: ( ruleDelete )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:938:1: ruleDelete
                    {
                     before(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDelete_in_rule__Execution__Alternatives1911);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getExecutionAccess().getDeleteParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:943:6: ( rulePathVariable )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:943:6: ( rulePathVariable )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:944:1: rulePathVariable
                    {
                     before(grammarAccess.getExecutionAccess().getPathVariableParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulePathVariable_in_rule__Execution__Alternatives1928);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:954:1: rule__GenericStep__Alternatives : ( ( ruleConcreteStep ) | ( ruleVariableStep ) | ( ruleParametrizedStep ) );
    public final void rule__GenericStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:958:1: ( ( ruleConcreteStep ) | ( ruleVariableStep ) | ( ruleParametrizedStep ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 41:
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
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:959:1: ( ruleConcreteStep )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:959:1: ( ruleConcreteStep )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:960:1: ruleConcreteStep
                    {
                     before(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConcreteStep_in_rule__GenericStep__Alternatives1960);
                    ruleConcreteStep();

                    state._fsp--;

                     after(grammarAccess.getGenericStepAccess().getConcreteStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:965:6: ( ruleVariableStep )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:965:6: ( ruleVariableStep )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:966:1: ruleVariableStep
                    {
                     before(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStep_in_rule__GenericStep__Alternatives1977);
                    ruleVariableStep();

                    state._fsp--;

                     after(grammarAccess.getGenericStepAccess().getVariableStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:971:6: ( ruleParametrizedStep )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:971:6: ( ruleParametrizedStep )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:972:1: ruleParametrizedStep
                    {
                     before(grammarAccess.getGenericStepAccess().getParametrizedStepParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParametrizedStep_in_rule__GenericStep__Alternatives1994);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:982:1: rule__FilterComponent__Alternatives : ( ( ruleOnName ) | ( ruleOnExtension ) | ( ruleOnTime ) | ( ruleOnAttributes ) | ( ruleOnTags ) | ( ruleOnSize ) | ( ruleFilterContainer ) | ( ruleIsEmpty ) | ( ruleOnType ) );
    public final void rule__FilterComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:986:1: ( ( ruleOnName ) | ( ruleOnExtension ) | ( ruleOnTime ) | ( ruleOnAttributes ) | ( ruleOnTags ) | ( ruleOnSize ) | ( ruleFilterContainer ) | ( ruleIsEmpty ) | ( ruleOnType ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt3=1;
                }
                break;
            case 64:
                {
                alt3=2;
                }
                break;
            case 25:
            case 26:
                {
                alt3=3;
                }
                break;
            case 54:
                {
                alt3=4;
                }
                break;
            case 57:
                {
                alt3=5;
                }
                break;
            case 62:
                {
                alt3=6;
                }
                break;
            case 52:
                {
                alt3=7;
                }
                break;
            case 56:
                {
                alt3=8;
                }
                break;
            case 66:
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
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:987:1: ( ruleOnName )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:987:1: ( ruleOnName )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:988:1: ruleOnName
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnName_in_rule__FilterComponent__Alternatives2026);
                    ruleOnName();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:993:6: ( ruleOnExtension )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:993:6: ( ruleOnExtension )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:994:1: ruleOnExtension
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnExtension_in_rule__FilterComponent__Alternatives2043);
                    ruleOnExtension();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnExtensionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:999:6: ( ruleOnTime )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:999:6: ( ruleOnTime )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1000:1: ruleOnTime
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnTime_in_rule__FilterComponent__Alternatives2060);
                    ruleOnTime();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnTimeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1005:6: ( ruleOnAttributes )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1005:6: ( ruleOnAttributes )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1006:1: ruleOnAttributes
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnAttributes_in_rule__FilterComponent__Alternatives2077);
                    ruleOnAttributes();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnAttributesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1011:6: ( ruleOnTags )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1011:6: ( ruleOnTags )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1012:1: ruleOnTags
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnTags_in_rule__FilterComponent__Alternatives2094);
                    ruleOnTags();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnTagsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1017:6: ( ruleOnSize )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1017:6: ( ruleOnSize )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1018:1: ruleOnSize
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnSize_in_rule__FilterComponent__Alternatives2111);
                    ruleOnSize();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getOnSizeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1023:6: ( ruleFilterContainer )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1023:6: ( ruleFilterContainer )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1024:1: ruleFilterContainer
                    {
                     before(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFilterContainer_in_rule__FilterComponent__Alternatives2128);
                    ruleFilterContainer();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getFilterContainerParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1029:6: ( ruleIsEmpty )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1029:6: ( ruleIsEmpty )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1030:1: ruleIsEmpty
                    {
                     before(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIsEmpty_in_rule__FilterComponent__Alternatives2145);
                    ruleIsEmpty();

                    state._fsp--;

                     after(grammarAccess.getFilterComponentAccess().getIsEmptyParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1035:6: ( ruleOnType )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1035:6: ( ruleOnType )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1036:1: ruleOnType
                    {
                     before(grammarAccess.getFilterComponentAccess().getOnTypeParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOnType_in_rule__FilterComponent__Alternatives2162);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1046:1: rule__OnAttributes__Alternatives_2 : ( ( ( rule__OnAttributes__Group_2_0__0 ) ) | ( ( rule__OnAttributes__Group_2_1__0 ) ) );
    public final void rule__OnAttributes__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1050:1: ( ( ( rule__OnAttributes__Group_2_0__0 ) ) | ( ( rule__OnAttributes__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==55||LA4_0==69) ) {
                alt4=1;
            }
            else if ( (LA4_0==56) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1051:1: ( ( rule__OnAttributes__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1051:1: ( ( rule__OnAttributes__Group_2_0__0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1052:1: ( rule__OnAttributes__Group_2_0__0 )
                    {
                     before(grammarAccess.getOnAttributesAccess().getGroup_2_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1053:1: ( rule__OnAttributes__Group_2_0__0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1053:2: rule__OnAttributes__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__0_in_rule__OnAttributes__Alternatives_22194);
                    rule__OnAttributes__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnAttributesAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1057:6: ( ( rule__OnAttributes__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1057:6: ( ( rule__OnAttributes__Group_2_1__0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1058:1: ( rule__OnAttributes__Group_2_1__0 )
                    {
                     before(grammarAccess.getOnAttributesAccess().getGroup_2_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1059:1: ( rule__OnAttributes__Group_2_1__0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1059:2: rule__OnAttributes__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__0_in_rule__OnAttributes__Alternatives_22212);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1068:1: rule__OnTags__Alternatives_3 : ( ( ( rule__OnTags__QuantificatorAssignment_3_0 ) ) | ( ( rule__OnTags__Group_3_1__0 ) ) );
    public final void rule__OnTags__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1072:1: ( ( ( rule__OnTags__QuantificatorAssignment_3_0 ) ) | ( ( rule__OnTags__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=27 && LA5_0<=28)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==67) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1073:1: ( ( rule__OnTags__QuantificatorAssignment_3_0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1073:1: ( ( rule__OnTags__QuantificatorAssignment_3_0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1074:1: ( rule__OnTags__QuantificatorAssignment_3_0 )
                    {
                     before(grammarAccess.getOnTagsAccess().getQuantificatorAssignment_3_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1075:1: ( rule__OnTags__QuantificatorAssignment_3_0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1075:2: rule__OnTags__QuantificatorAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__QuantificatorAssignment_3_0_in_rule__OnTags__Alternatives_32245);
                    rule__OnTags__QuantificatorAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnTagsAccess().getQuantificatorAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1079:6: ( ( rule__OnTags__Group_3_1__0 ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1079:6: ( ( rule__OnTags__Group_3_1__0 ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1080:1: ( rule__OnTags__Group_3_1__0 )
                    {
                     before(grammarAccess.getOnTagsAccess().getGroup_3_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1081:1: ( rule__OnTags__Group_3_1__0 )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1081:2: rule__OnTags__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__0_in_rule__OnTags__Alternatives_32263);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1091:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1095:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1096:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1096:1: ( RULE_STRING )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1097:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2297); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1102:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1102:6: ( RULE_ID )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1103:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2314); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1113:1: rule__Strategies__Alternatives : ( ( ( 'forced' ) ) | ( ( 'append' ) ) | ( ( 'carefully' ) ) );
    public final void rule__Strategies__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1117:1: ( ( ( 'forced' ) ) | ( ( 'append' ) ) | ( ( 'carefully' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1118:1: ( ( 'forced' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1118:1: ( ( 'forced' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1119:1: ( 'forced' )
                    {
                     before(grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1120:1: ( 'forced' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1120:3: 'forced'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Strategies__Alternatives2347); 

                    }

                     after(grammarAccess.getStrategiesAccess().getForcedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1125:6: ( ( 'append' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1125:6: ( ( 'append' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1126:1: ( 'append' )
                    {
                     before(grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1127:1: ( 'append' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1127:3: 'append'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Strategies__Alternatives2368); 

                    }

                     after(grammarAccess.getStrategiesAccess().getAppendEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1132:6: ( ( 'carefully' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1132:6: ( ( 'carefully' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1133:1: ( 'carefully' )
                    {
                     before(grammarAccess.getStrategiesAccess().getCarefullyEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1134:1: ( 'carefully' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1134:3: 'carefully'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Strategies__Alternatives2389); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1144:1: rule__Operator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1148:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1149:1: ( ( '==' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1149:1: ( ( '==' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1150:1: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1151:1: ( '==' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1151:3: '=='
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Operator__Alternatives2425); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1156:6: ( ( '<' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1156:6: ( ( '<' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1157:1: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1158:1: ( '<' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1158:3: '<'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Operator__Alternatives2446); 

                    }

                     after(grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1163:6: ( ( '>' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1163:6: ( ( '>' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1164:1: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1165:1: ( '>' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1165:3: '>'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Operator__Alternatives2467); 

                    }

                     after(grammarAccess.getOperatorAccess().getMoreEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1170:6: ( ( '<=' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1170:6: ( ( '<=' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1171:1: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1172:1: ( '<=' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1172:3: '<='
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Operator__Alternatives2488); 

                    }

                     after(grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1177:6: ( ( '>=' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1177:6: ( ( '>=' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1178:1: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getMore_equalEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1179:1: ( '>=' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1179:3: '>='
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Operator__Alternatives2509); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1189:1: rule__TimeUnit__Alternatives : ( ( ( 'mins' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'months' ) ) | ( ( 'years' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1193:1: ( ( ( 'mins' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'weeks' ) ) | ( ( 'months' ) ) | ( ( 'years' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1194:1: ( ( 'mins' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1194:1: ( ( 'mins' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1195:1: ( 'mins' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1196:1: ( 'mins' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1196:3: 'mins'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__TimeUnit__Alternatives2545); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMinsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1201:6: ( ( 'hours' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1201:6: ( ( 'hours' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1202:1: ( 'hours' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1203:1: ( 'hours' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1203:3: 'hours'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__TimeUnit__Alternatives2566); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1208:6: ( ( 'days' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1208:6: ( ( 'days' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1209:1: ( 'days' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1210:1: ( 'days' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1210:3: 'days'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__TimeUnit__Alternatives2587); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1215:6: ( ( 'weeks' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1215:6: ( ( 'weeks' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1216:1: ( 'weeks' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1217:1: ( 'weeks' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1217:3: 'weeks'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__TimeUnit__Alternatives2608); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getWeeksEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1222:6: ( ( 'months' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1222:6: ( ( 'months' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1223:1: ( 'months' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1224:1: ( 'months' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1224:3: 'months'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__TimeUnit__Alternatives2629); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMonthsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1229:6: ( ( 'years' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1229:6: ( ( 'years' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1230:1: ( 'years' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getYearsEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1231:1: ( 'years' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1231:3: 'years'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__TimeUnit__Alternatives2650); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1241:1: rule__TimeType__Alternatives : ( ( ( 'modified' ) ) | ( ( 'created' ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1245:1: ( ( ( 'modified' ) ) | ( ( 'created' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1246:1: ( ( 'modified' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1246:1: ( ( 'modified' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1247:1: ( 'modified' )
                    {
                     before(grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1248:1: ( 'modified' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1248:3: 'modified'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__TimeType__Alternatives2686); 

                    }

                     after(grammarAccess.getTimeTypeAccess().getModifiedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1253:6: ( ( 'created' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1253:6: ( ( 'created' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1254:1: ( 'created' )
                    {
                     before(grammarAccess.getTimeTypeAccess().getCreatedEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1255:1: ( 'created' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1255:3: 'created'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__TimeType__Alternatives2707); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1265:1: rule__Quantificators__Alternatives : ( ( ( 'any are' ) ) | ( ( 'all are' ) ) );
    public final void rule__Quantificators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1269:1: ( ( ( 'any are' ) ) | ( ( 'all are' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1270:1: ( ( 'any are' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1270:1: ( ( 'any are' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1271:1: ( 'any are' )
                    {
                     before(grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1272:1: ( 'any are' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1272:3: 'any are'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Quantificators__Alternatives2743); 

                    }

                     after(grammarAccess.getQuantificatorsAccess().getAnyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1277:6: ( ( 'all are' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1277:6: ( ( 'all are' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1278:1: ( 'all are' )
                    {
                     before(grammarAccess.getQuantificatorsAccess().getAllEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1279:1: ( 'all are' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1279:3: 'all are'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Quantificators__Alternatives2764); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1289:1: rule__MemoryUnit__Alternatives : ( ( ( 'KB' ) ) | ( ( 'MB' ) ) | ( ( 'GB' ) ) | ( ( 'TB' ) ) );
    public final void rule__MemoryUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1293:1: ( ( ( 'KB' ) ) | ( ( 'MB' ) ) | ( ( 'GB' ) ) | ( ( 'TB' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1294:1: ( ( 'KB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1294:1: ( ( 'KB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1295:1: ( 'KB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1296:1: ( 'KB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1296:3: 'KB'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__MemoryUnit__Alternatives2800); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getKBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1301:6: ( ( 'MB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1301:6: ( ( 'MB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1302:1: ( 'MB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1303:1: ( 'MB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1303:3: 'MB'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__MemoryUnit__Alternatives2821); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getMBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1308:6: ( ( 'GB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1308:6: ( ( 'GB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1309:1: ( 'GB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1310:1: ( 'GB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1310:3: 'GB'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__MemoryUnit__Alternatives2842); 

                    }

                     after(grammarAccess.getMemoryUnitAccess().getGBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1315:6: ( ( 'TB' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1315:6: ( ( 'TB' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1316:1: ( 'TB' )
                    {
                     before(grammarAccess.getMemoryUnitAccess().getTBEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1317:1: ( 'TB' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1317:3: 'TB'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__MemoryUnit__Alternatives2863); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1327:1: rule__CompositionType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__CompositionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1331:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1332:1: ( ( 'and' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1332:1: ( ( 'and' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1333:1: ( 'and' )
                    {
                     before(grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1334:1: ( 'and' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1334:3: 'and'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__CompositionType__Alternatives2899); 

                    }

                     after(grammarAccess.getCompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1339:6: ( ( 'or' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1339:6: ( ( 'or' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1340:1: ( 'or' )
                    {
                     before(grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1341:1: ( 'or' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1341:3: 'or'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__CompositionType__Alternatives2920); 

                    }

                     after(grammarAccess.getCompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1351:1: rule__FileType__Alternatives : ( ( ( 'Document' ) ) | ( ( 'Directory' ) ) );
    public final void rule__FileType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1355:1: ( ( ( 'Document' ) ) | ( ( 'Directory' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1356:1: ( ( 'Document' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1356:1: ( ( 'Document' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1357:1: ( 'Document' )
                    {
                     before(grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1358:1: ( 'Document' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1358:3: 'Document'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__FileType__Alternatives2956); 

                    }

                     after(grammarAccess.getFileTypeAccess().getDocumentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1363:6: ( ( 'Directory' ) )
                    {
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1363:6: ( ( 'Directory' ) )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1364:1: ( 'Directory' )
                    {
                     before(grammarAccess.getFileTypeAccess().getDirectoryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1365:1: ( 'Directory' )
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1365:3: 'Directory'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__FileType__Alternatives2977); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1377:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1381:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1382:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03010);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03013);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1389:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1393:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1394:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1394:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1395:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1396:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1398:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1408:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1412:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1413:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13071);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13074);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1420:1: rule__Model__Group__1__Impl : ( ( rule__Model__ExecutionsAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1424:1: ( ( ( rule__Model__ExecutionsAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1425:1: ( ( rule__Model__ExecutionsAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1425:1: ( ( rule__Model__ExecutionsAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1426:1: ( rule__Model__ExecutionsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1427:1: ( rule__Model__ExecutionsAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1427:2: rule__Model__ExecutionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_1_in_rule__Model__Group__1__Impl3101);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1437:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1441:1: ( rule__Model__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1442:2: rule__Model__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23131);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1448:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1452:1: ( ( ( rule__Model__Group_2__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1453:1: ( ( rule__Model__Group_2__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1453:1: ( ( rule__Model__Group_2__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1454:1: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1455:1: ( rule__Model__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1455:2: rule__Model__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl3158);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1471:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1475:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1476:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__03195);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__03198);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1483:1: rule__Model__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1487:1: ( ( ';' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1488:1: ( ';' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1488:1: ( ';' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1489:1: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Model__Group_2__0__Impl3226); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1502:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1506:1: ( rule__Model__Group_2__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1507:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__13257);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1513:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__ExecutionsAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1517:1: ( ( ( rule__Model__ExecutionsAssignment_2_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1518:1: ( ( rule__Model__ExecutionsAssignment_2_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1518:1: ( ( rule__Model__ExecutionsAssignment_2_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1519:1: ( rule__Model__ExecutionsAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getExecutionsAssignment_2_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1520:1: ( rule__Model__ExecutionsAssignment_2_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1520:2: rule__Model__ExecutionsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ExecutionsAssignment_2_1_in_rule__Model__Group_2__1__Impl3284);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1534:1: rule__PathVariable__Group__0 : rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 ;
    public final void rule__PathVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1538:1: ( rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1539:2: rule__PathVariable__Group__0__Impl rule__PathVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__03318);
            rule__PathVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__03321);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1546:1: rule__PathVariable__Group__0__Impl : ( ( rule__PathVariable__NameAssignment_0 ) ) ;
    public final void rule__PathVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1550:1: ( ( ( rule__PathVariable__NameAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1551:1: ( ( rule__PathVariable__NameAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1551:1: ( ( rule__PathVariable__NameAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1552:1: ( rule__PathVariable__NameAssignment_0 )
            {
             before(grammarAccess.getPathVariableAccess().getNameAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1553:1: ( rule__PathVariable__NameAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1553:2: rule__PathVariable__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__NameAssignment_0_in_rule__PathVariable__Group__0__Impl3348);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1563:1: rule__PathVariable__Group__1 : rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 ;
    public final void rule__PathVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1567:1: ( rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1568:2: rule__PathVariable__Group__1__Impl rule__PathVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__13378);
            rule__PathVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__13381);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1575:1: rule__PathVariable__Group__1__Impl : ( '=' ) ;
    public final void rule__PathVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1579:1: ( ( '=' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1580:1: ( '=' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1580:1: ( '=' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1581:1: '='
            {
             before(grammarAccess.getPathVariableAccess().getEqualsSignKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PathVariable__Group__1__Impl3409); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1594:1: rule__PathVariable__Group__2 : rule__PathVariable__Group__2__Impl ;
    public final void rule__PathVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1598:1: ( rule__PathVariable__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1599:2: rule__PathVariable__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__23440);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1605:1: rule__PathVariable__Group__2__Impl : ( ( rule__PathVariable__ValueAssignment_2 ) ) ;
    public final void rule__PathVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1609:1: ( ( ( rule__PathVariable__ValueAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1610:1: ( ( rule__PathVariable__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1610:1: ( ( rule__PathVariable__ValueAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1611:1: ( rule__PathVariable__ValueAssignment_2 )
            {
             before(grammarAccess.getPathVariableAccess().getValueAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1612:1: ( rule__PathVariable__ValueAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1612:2: rule__PathVariable__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PathVariable__ValueAssignment_2_in_rule__PathVariable__Group__2__Impl3467);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1628:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1632:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1633:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__03503);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1_in_rule__Path__Group__03506);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1640:1: rule__Path__Group__0__Impl : ( ( rule__Path__StepsAssignment_0 ) ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1644:1: ( ( ( rule__Path__StepsAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1645:1: ( ( rule__Path__StepsAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1645:1: ( ( rule__Path__StepsAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1646:1: ( rule__Path__StepsAssignment_0 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1647:1: ( rule__Path__StepsAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1647:2: rule__Path__StepsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_0_in_rule__Path__Group__0__Impl3533);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1657:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1661:1: ( rule__Path__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1662:2: rule__Path__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__13563);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1668:1: rule__Path__Group__1__Impl : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1672:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1673:1: ( ( rule__Path__Group_1__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1673:1: ( ( rule__Path__Group_1__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1674:1: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1675:1: ( rule__Path__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1675:2: rule__Path__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl3590);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1689:1: rule__Path__Group_1__0 : rule__Path__Group_1__0__Impl rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1693:1: ( rule__Path__Group_1__0__Impl rule__Path__Group_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1694:2: rule__Path__Group_1__0__Impl rule__Path__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__03625);
            rule__Path__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__03628);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1701:1: rule__Path__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1705:1: ( ( '/' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1706:1: ( '/' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1706:1: ( '/' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1707:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Path__Group_1__0__Impl3656); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1720:1: rule__Path__Group_1__1 : rule__Path__Group_1__1__Impl ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1724:1: ( rule__Path__Group_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1725:2: rule__Path__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__13687);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1731:1: rule__Path__Group_1__1__Impl : ( ( rule__Path__StepsAssignment_1_1 ) ) ;
    public final void rule__Path__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1735:1: ( ( ( rule__Path__StepsAssignment_1_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1736:1: ( ( rule__Path__StepsAssignment_1_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1736:1: ( ( rule__Path__StepsAssignment_1_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1737:1: ( rule__Path__StepsAssignment_1_1 )
            {
             before(grammarAccess.getPathAccess().getStepsAssignment_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1738:1: ( rule__Path__StepsAssignment_1_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1738:2: rule__Path__StepsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Path__StepsAssignment_1_1_in_rule__Path__Group_1__1__Impl3714);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1752:1: rule__ConcreteStep__Group__0 : rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1 ;
    public final void rule__ConcreteStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1756:1: ( rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1757:2: rule__ConcreteStep__Group__0__Impl rule__ConcreteStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__0__Impl_in_rule__ConcreteStep__Group__03748);
            rule__ConcreteStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__1_in_rule__ConcreteStep__Group__03751);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1764:1: rule__ConcreteStep__Group__0__Impl : ( ( rule__ConcreteStep__ValueAssignment_0 ) ) ;
    public final void rule__ConcreteStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1768:1: ( ( ( rule__ConcreteStep__ValueAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1769:1: ( ( rule__ConcreteStep__ValueAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1769:1: ( ( rule__ConcreteStep__ValueAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1770:1: ( rule__ConcreteStep__ValueAssignment_0 )
            {
             before(grammarAccess.getConcreteStepAccess().getValueAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1771:1: ( rule__ConcreteStep__ValueAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1771:2: rule__ConcreteStep__ValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__ValueAssignment_0_in_rule__ConcreteStep__Group__0__Impl3778);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1781:1: rule__ConcreteStep__Group__1 : rule__ConcreteStep__Group__1__Impl ;
    public final void rule__ConcreteStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1785:1: ( rule__ConcreteStep__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1786:2: rule__ConcreteStep__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__Group__1__Impl_in_rule__ConcreteStep__Group__13808);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1792:1: rule__ConcreteStep__Group__1__Impl : ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? ) ;
    public final void rule__ConcreteStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1796:1: ( ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1797:1: ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1797:1: ( ( rule__ConcreteStep__AbsoluteAssignment_1 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1798:1: ( rule__ConcreteStep__AbsoluteAssignment_1 )?
            {
             before(grammarAccess.getConcreteStepAccess().getAbsoluteAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1799:1: ( rule__ConcreteStep__AbsoluteAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==68) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1799:2: rule__ConcreteStep__AbsoluteAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ConcreteStep__AbsoluteAssignment_1_in_rule__ConcreteStep__Group__1__Impl3835);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1813:1: rule__VariableStep__Group__0 : rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 ;
    public final void rule__VariableStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1817:1: ( rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1818:2: rule__VariableStep__Group__0__Impl rule__VariableStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__03870);
            rule__VariableStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__03873);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1825:1: rule__VariableStep__Group__0__Impl : ( '?' ) ;
    public final void rule__VariableStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1829:1: ( ( '?' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1830:1: ( '?' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1830:1: ( '?' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1831:1: '?'
            {
             before(grammarAccess.getVariableStepAccess().getQuestionMarkKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__VariableStep__Group__0__Impl3901); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1844:1: rule__VariableStep__Group__1 : rule__VariableStep__Group__1__Impl ;
    public final void rule__VariableStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1848:1: ( rule__VariableStep__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1849:2: rule__VariableStep__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__13932);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1855:1: rule__VariableStep__Group__1__Impl : ( ( rule__VariableStep__ValueAssignment_1 ) ) ;
    public final void rule__VariableStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1859:1: ( ( ( rule__VariableStep__ValueAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1860:1: ( ( rule__VariableStep__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1860:1: ( ( rule__VariableStep__ValueAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1861:1: ( rule__VariableStep__ValueAssignment_1 )
            {
             before(grammarAccess.getVariableStepAccess().getValueAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1862:1: ( rule__VariableStep__ValueAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1862:2: rule__VariableStep__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStep__ValueAssignment_1_in_rule__VariableStep__Group__1__Impl3959);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1876:1: rule__ParametrizedStep__Group__0 : rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 ;
    public final void rule__ParametrizedStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1880:1: ( rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1881:2: rule__ParametrizedStep__Group__0__Impl rule__ParametrizedStep__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__03993);
            rule__ParametrizedStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__03996);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1888:1: rule__ParametrizedStep__Group__0__Impl : ( () ) ;
    public final void rule__ParametrizedStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1892:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1893:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1893:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1894:1: ()
            {
             before(grammarAccess.getParametrizedStepAccess().getParametrizedStepAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1895:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1897:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1907:1: rule__ParametrizedStep__Group__1 : rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 ;
    public final void rule__ParametrizedStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1911:1: ( rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1912:2: rule__ParametrizedStep__Group__1__Impl rule__ParametrizedStep__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__14054);
            rule__ParametrizedStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__14057);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1919:1: rule__ParametrizedStep__Group__1__Impl : ( '{$' ) ;
    public final void rule__ParametrizedStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1923:1: ( ( '{$' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1924:1: ( '{$' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1924:1: ( '{$' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1925:1: '{$'
            {
             before(grammarAccess.getParametrizedStepAccess().getLeftCurlyBracketDollarSignKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ParametrizedStep__Group__1__Impl4085); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1938:1: rule__ParametrizedStep__Group__2 : rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3 ;
    public final void rule__ParametrizedStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1942:1: ( rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1943:2: rule__ParametrizedStep__Group__2__Impl rule__ParametrizedStep__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__24116);
            rule__ParametrizedStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__3_in_rule__ParametrizedStep__Group__24119);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1950:1: rule__ParametrizedStep__Group__2__Impl : ( ( rule__ParametrizedStep__NameAssignment_2 ) ) ;
    public final void rule__ParametrizedStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1954:1: ( ( ( rule__ParametrizedStep__NameAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1955:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1955:1: ( ( rule__ParametrizedStep__NameAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1956:1: ( rule__ParametrizedStep__NameAssignment_2 )
            {
             before(grammarAccess.getParametrizedStepAccess().getNameAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1957:1: ( rule__ParametrizedStep__NameAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1957:2: rule__ParametrizedStep__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl4146);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1967:1: rule__ParametrizedStep__Group__3 : rule__ParametrizedStep__Group__3__Impl ;
    public final void rule__ParametrizedStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1971:1: ( rule__ParametrizedStep__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1972:2: rule__ParametrizedStep__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParametrizedStep__Group__3__Impl_in_rule__ParametrizedStep__Group__34176);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1978:1: rule__ParametrizedStep__Group__3__Impl : ( '}' ) ;
    public final void rule__ParametrizedStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1982:1: ( ( '}' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1983:1: ( '}' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1983:1: ( '}' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:1984:1: '}'
            {
             before(grammarAccess.getParametrizedStepAccess().getRightCurlyBracketKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ParametrizedStep__Group__3__Impl4204); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2005:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2009:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2010:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__04243);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__04246);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2017:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2021:1: ( ( 'select' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2022:1: ( 'select' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2022:1: ( 'select' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2023:1: 'select'
            {
             before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Selection__Group__0__Impl4274); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2036:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2040:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2041:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__14305);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__14308);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2048:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2052:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2053:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2053:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2054:1: ( rule__Selection__NameAssignment_1 )
            {
             before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2055:1: ( rule__Selection__NameAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2055:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl4335);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2065:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2069:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2070:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__24365);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__24368);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2077:1: rule__Selection__Group__2__Impl : ( 'from' ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2081:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2082:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2082:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2083:1: 'from'
            {
             before(grammarAccess.getSelectionAccess().getFromKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Selection__Group__2__Impl4396); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2096:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2100:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2101:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__34427);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__34430);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2108:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__FromAssignment_3 ) ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2112:1: ( ( ( rule__Selection__FromAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2113:1: ( ( rule__Selection__FromAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2113:1: ( ( rule__Selection__FromAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2114:1: ( rule__Selection__FromAssignment_3 )
            {
             before(grammarAccess.getSelectionAccess().getFromAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2115:1: ( rule__Selection__FromAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2115:2: rule__Selection__FromAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__FromAssignment_3_in_rule__Selection__Group__3__Impl4457);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2125:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2129:1: ( rule__Selection__Group__4__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2130:2: rule__Selection__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__44487);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2136:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__Group_4__0 )? ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2140:1: ( ( ( rule__Selection__Group_4__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2141:1: ( ( rule__Selection__Group_4__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2141:1: ( ( rule__Selection__Group_4__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2142:1: ( rule__Selection__Group_4__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2143:1: ( rule__Selection__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2143:2: rule__Selection__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__0_in_rule__Selection__Group__4__Impl4514);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2163:1: rule__Selection__Group_4__0 : rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 ;
    public final void rule__Selection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2167:1: ( rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2168:2: rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__0__Impl_in_rule__Selection__Group_4__04555);
            rule__Selection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__1_in_rule__Selection__Group_4__04558);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2175:1: rule__Selection__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Selection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2179:1: ( ( 'where' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2180:1: ( 'where' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2180:1: ( 'where' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2181:1: 'where'
            {
             before(grammarAccess.getSelectionAccess().getWhereKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Selection__Group_4__0__Impl4586); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2194:1: rule__Selection__Group_4__1 : rule__Selection__Group_4__1__Impl rule__Selection__Group_4__2 ;
    public final void rule__Selection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2198:1: ( rule__Selection__Group_4__1__Impl rule__Selection__Group_4__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2199:2: rule__Selection__Group_4__1__Impl rule__Selection__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__1__Impl_in_rule__Selection__Group_4__14617);
            rule__Selection__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__2_in_rule__Selection__Group_4__14620);
            rule__Selection__Group_4__2();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2206:1: rule__Selection__Group_4__1__Impl : ( ( rule__Selection__WhereAssignment_4_1 ) ) ;
    public final void rule__Selection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2210:1: ( ( ( rule__Selection__WhereAssignment_4_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2211:1: ( ( rule__Selection__WhereAssignment_4_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2211:1: ( ( rule__Selection__WhereAssignment_4_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2212:1: ( rule__Selection__WhereAssignment_4_1 )
            {
             before(grammarAccess.getSelectionAccess().getWhereAssignment_4_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2213:1: ( rule__Selection__WhereAssignment_4_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2213:2: rule__Selection__WhereAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__WhereAssignment_4_1_in_rule__Selection__Group_4__1__Impl4647);
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


    // $ANTLR start "rule__Selection__Group_4__2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2223:1: rule__Selection__Group_4__2 : rule__Selection__Group_4__2__Impl ;
    public final void rule__Selection__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2227:1: ( rule__Selection__Group_4__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2228:2: rule__Selection__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4__2__Impl_in_rule__Selection__Group_4__24677);
            rule__Selection__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__2"


    // $ANTLR start "rule__Selection__Group_4__2__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2234:1: rule__Selection__Group_4__2__Impl : ( ( rule__Selection__Group_4_2__0 )* ) ;
    public final void rule__Selection__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2238:1: ( ( ( rule__Selection__Group_4_2__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2239:1: ( ( rule__Selection__Group_4_2__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2239:1: ( ( rule__Selection__Group_4_2__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2240:1: ( rule__Selection__Group_4_2__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_4_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2241:1: ( rule__Selection__Group_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2241:2: rule__Selection__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4_2__0_in_rule__Selection__Group_4__2__Impl4704);
            	    rule__Selection__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__2__Impl"


    // $ANTLR start "rule__Selection__Group_4_2__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2257:1: rule__Selection__Group_4_2__0 : rule__Selection__Group_4_2__0__Impl rule__Selection__Group_4_2__1 ;
    public final void rule__Selection__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2261:1: ( rule__Selection__Group_4_2__0__Impl rule__Selection__Group_4_2__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2262:2: rule__Selection__Group_4_2__0__Impl rule__Selection__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4_2__0__Impl_in_rule__Selection__Group_4_2__04741);
            rule__Selection__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4_2__1_in_rule__Selection__Group_4_2__04744);
            rule__Selection__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4_2__0"


    // $ANTLR start "rule__Selection__Group_4_2__0__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2269:1: rule__Selection__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2273:1: ( ( ',' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2274:1: ( ',' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2274:1: ( ',' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2275:1: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_4_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Selection__Group_4_2__0__Impl4772); 
             after(grammarAccess.getSelectionAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4_2__0__Impl"


    // $ANTLR start "rule__Selection__Group_4_2__1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2288:1: rule__Selection__Group_4_2__1 : rule__Selection__Group_4_2__1__Impl ;
    public final void rule__Selection__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2292:1: ( rule__Selection__Group_4_2__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2293:2: rule__Selection__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__Group_4_2__1__Impl_in_rule__Selection__Group_4_2__14803);
            rule__Selection__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4_2__1"


    // $ANTLR start "rule__Selection__Group_4_2__1__Impl"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2299:1: rule__Selection__Group_4_2__1__Impl : ( ( rule__Selection__WhereAssignment_4_2_1 ) ) ;
    public final void rule__Selection__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2303:1: ( ( ( rule__Selection__WhereAssignment_4_2_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2304:1: ( ( rule__Selection__WhereAssignment_4_2_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2304:1: ( ( rule__Selection__WhereAssignment_4_2_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2305:1: ( rule__Selection__WhereAssignment_4_2_1 )
            {
             before(grammarAccess.getSelectionAccess().getWhereAssignment_4_2_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2306:1: ( rule__Selection__WhereAssignment_4_2_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2306:2: rule__Selection__WhereAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Selection__WhereAssignment_4_2_1_in_rule__Selection__Group_4_2__1__Impl4830);
            rule__Selection__WhereAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getWhereAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4_2__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2320:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2324:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2325:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__04864);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__04867);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2332:1: rule__Copy__Group__0__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2336:1: ( ( 'copy' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2337:1: ( 'copy' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2337:1: ( 'copy' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2338:1: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Copy__Group__0__Impl4895); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2351:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2355:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2356:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__14926);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__14929);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2363:1: rule__Copy__Group__1__Impl : ( 'from' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2367:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2368:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2368:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2369:1: 'from'
            {
             before(grammarAccess.getCopyAccess().getFromKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Copy__Group__1__Impl4957); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2382:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2386:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2387:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__24988);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__24991);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2394:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__SourceAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2398:1: ( ( ( rule__Copy__SourceAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2399:1: ( ( rule__Copy__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2399:1: ( ( rule__Copy__SourceAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2400:1: ( rule__Copy__SourceAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2401:1: ( rule__Copy__SourceAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2401:2: rule__Copy__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__SourceAssignment_2_in_rule__Copy__Group__2__Impl5018);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2411:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2415:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2416:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__35048);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__35051);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2423:1: rule__Copy__Group__3__Impl : ( 'to' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2427:1: ( ( 'to' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2428:1: ( 'to' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2428:1: ( 'to' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2429:1: 'to'
            {
             before(grammarAccess.getCopyAccess().getToKeyword_3()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Copy__Group__3__Impl5079); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2442:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2446:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2447:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__45110);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__45113);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2454:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__DestinationAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2458:1: ( ( ( rule__Copy__DestinationAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2459:1: ( ( rule__Copy__DestinationAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2459:1: ( ( rule__Copy__DestinationAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2460:1: ( rule__Copy__DestinationAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getDestinationAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2461:1: ( rule__Copy__DestinationAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2461:2: rule__Copy__DestinationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__DestinationAssignment_4_in_rule__Copy__Group__4__Impl5140);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2471:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2475:1: ( rule__Copy__Group__5__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2476:2: rule__Copy__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__55170);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2482:1: rule__Copy__Group__5__Impl : ( ( rule__Copy__Group_5__0 )? ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2486:1: ( ( ( rule__Copy__Group_5__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2487:1: ( ( rule__Copy__Group_5__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2487:1: ( ( rule__Copy__Group_5__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2488:1: ( rule__Copy__Group_5__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_5()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2489:1: ( rule__Copy__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2489:2: rule__Copy__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__0_in_rule__Copy__Group__5__Impl5197);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2511:1: rule__Copy__Group_5__0 : rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1 ;
    public final void rule__Copy__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2515:1: ( rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2516:2: rule__Copy__Group_5__0__Impl rule__Copy__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__0__Impl_in_rule__Copy__Group_5__05240);
            rule__Copy__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__1_in_rule__Copy__Group_5__05243);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2523:1: rule__Copy__Group_5__0__Impl : ( 'strategy:' ) ;
    public final void rule__Copy__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2527:1: ( ( 'strategy:' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2528:1: ( 'strategy:' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2528:1: ( 'strategy:' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2529:1: 'strategy:'
            {
             before(grammarAccess.getCopyAccess().getStrategyKeyword_5_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Copy__Group_5__0__Impl5271); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2542:1: rule__Copy__Group_5__1 : rule__Copy__Group_5__1__Impl ;
    public final void rule__Copy__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2546:1: ( rule__Copy__Group_5__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2547:2: rule__Copy__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__Group_5__1__Impl_in_rule__Copy__Group_5__15302);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2553:1: rule__Copy__Group_5__1__Impl : ( ( rule__Copy__StrategyAssignment_5_1 ) ) ;
    public final void rule__Copy__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2557:1: ( ( ( rule__Copy__StrategyAssignment_5_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2558:1: ( ( rule__Copy__StrategyAssignment_5_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2558:1: ( ( rule__Copy__StrategyAssignment_5_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2559:1: ( rule__Copy__StrategyAssignment_5_1 )
            {
             before(grammarAccess.getCopyAccess().getStrategyAssignment_5_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2560:1: ( rule__Copy__StrategyAssignment_5_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2560:2: rule__Copy__StrategyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Copy__StrategyAssignment_5_1_in_rule__Copy__Group_5__1__Impl5329);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2574:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2578:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2579:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__05363);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__05366);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2586:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2590:1: ( ( 'move' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2591:1: ( 'move' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2591:1: ( 'move' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2592:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Move__Group__0__Impl5394); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2605:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2609:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2610:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__15425);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__15428);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2617:1: rule__Move__Group__1__Impl : ( 'from' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2621:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2622:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2622:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2623:1: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Move__Group__1__Impl5456); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2636:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2640:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2641:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__25487);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__25490);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2648:1: rule__Move__Group__2__Impl : ( ( rule__Move__SourceAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2652:1: ( ( ( rule__Move__SourceAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2653:1: ( ( rule__Move__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2653:1: ( ( rule__Move__SourceAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2654:1: ( rule__Move__SourceAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2655:1: ( rule__Move__SourceAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2655:2: rule__Move__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SourceAssignment_2_in_rule__Move__Group__2__Impl5517);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2665:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2669:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2670:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__35547);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__35550);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2677:1: rule__Move__Group__3__Impl : ( 'to' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2681:1: ( ( 'to' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2682:1: ( 'to' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2682:1: ( 'to' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2683:1: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_3()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Move__Group__3__Impl5578); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2696:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2700:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2701:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__45609);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5_in_rule__Move__Group__45612);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2708:1: rule__Move__Group__4__Impl : ( ( rule__Move__DestinationAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2712:1: ( ( ( rule__Move__DestinationAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2713:1: ( ( rule__Move__DestinationAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2713:1: ( ( rule__Move__DestinationAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2714:1: ( rule__Move__DestinationAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getDestinationAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2715:1: ( rule__Move__DestinationAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2715:2: rule__Move__DestinationAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__DestinationAssignment_4_in_rule__Move__Group__4__Impl5639);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2725:1: rule__Move__Group__5 : rule__Move__Group__5__Impl ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2729:1: ( rule__Move__Group__5__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2730:2: rule__Move__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__55669);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2736:1: rule__Move__Group__5__Impl : ( ( rule__Move__Group_5__0 )? ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2740:1: ( ( ( rule__Move__Group_5__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2741:1: ( ( rule__Move__Group_5__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2741:1: ( ( rule__Move__Group_5__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2742:1: ( rule__Move__Group_5__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_5()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2743:1: ( rule__Move__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2743:2: rule__Move__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__0_in_rule__Move__Group__5__Impl5696);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2765:1: rule__Move__Group_5__0 : rule__Move__Group_5__0__Impl rule__Move__Group_5__1 ;
    public final void rule__Move__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2769:1: ( rule__Move__Group_5__0__Impl rule__Move__Group_5__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2770:2: rule__Move__Group_5__0__Impl rule__Move__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__0__Impl_in_rule__Move__Group_5__05739);
            rule__Move__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__1_in_rule__Move__Group_5__05742);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2777:1: rule__Move__Group_5__0__Impl : ( 'strategy:' ) ;
    public final void rule__Move__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2781:1: ( ( 'strategy:' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2782:1: ( 'strategy:' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2782:1: ( 'strategy:' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2783:1: 'strategy:'
            {
             before(grammarAccess.getMoveAccess().getStrategyKeyword_5_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Move__Group_5__0__Impl5770); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2796:1: rule__Move__Group_5__1 : rule__Move__Group_5__1__Impl ;
    public final void rule__Move__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2800:1: ( rule__Move__Group_5__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2801:2: rule__Move__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_5__1__Impl_in_rule__Move__Group_5__15801);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2807:1: rule__Move__Group_5__1__Impl : ( ( rule__Move__StrategyAssignment_5_1 ) ) ;
    public final void rule__Move__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2811:1: ( ( ( rule__Move__StrategyAssignment_5_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2812:1: ( ( rule__Move__StrategyAssignment_5_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2812:1: ( ( rule__Move__StrategyAssignment_5_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2813:1: ( rule__Move__StrategyAssignment_5_1 )
            {
             before(grammarAccess.getMoveAccess().getStrategyAssignment_5_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2814:1: ( rule__Move__StrategyAssignment_5_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2814:2: rule__Move__StrategyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__StrategyAssignment_5_1_in_rule__Move__Group_5__1__Impl5828);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2828:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2832:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2833:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__05862);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__05865);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2840:1: rule__Delete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2844:1: ( ( 'delete' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2845:1: ( 'delete' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2845:1: ( 'delete' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2846:1: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Delete__Group__0__Impl5893); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2859:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2863:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2864:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__15924);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__15927);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2871:1: rule__Delete__Group__1__Impl : ( 'from' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2875:1: ( ( 'from' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2876:1: ( 'from' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2876:1: ( 'from' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2877:1: 'from'
            {
             before(grammarAccess.getDeleteAccess().getFromKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Delete__Group__1__Impl5955); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2890:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2894:1: ( rule__Delete__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2895:2: rule__Delete__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__25986);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2901:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__SourceAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2905:1: ( ( ( rule__Delete__SourceAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2906:1: ( ( rule__Delete__SourceAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2906:1: ( ( rule__Delete__SourceAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2907:1: ( rule__Delete__SourceAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getSourceAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2908:1: ( rule__Delete__SourceAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2908:2: rule__Delete__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Delete__SourceAssignment_2_in_rule__Delete__Group__2__Impl6013);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2924:1: rule__FilterContainer__Group__0 : rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 ;
    public final void rule__FilterContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2928:1: ( rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2929:2: rule__FilterContainer__Group__0__Impl rule__FilterContainer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__06049);
            rule__FilterContainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__06052);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2936:1: rule__FilterContainer__Group__0__Impl : ( '(' ) ;
    public final void rule__FilterContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2940:1: ( ( '(' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2941:1: ( '(' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2941:1: ( '(' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2942:1: '('
            {
             before(grammarAccess.getFilterContainerAccess().getLeftParenthesisKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__FilterContainer__Group__0__Impl6080); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2955:1: rule__FilterContainer__Group__1 : rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 ;
    public final void rule__FilterContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2959:1: ( rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2960:2: rule__FilterContainer__Group__1__Impl rule__FilterContainer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__16111);
            rule__FilterContainer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__16114);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2967:1: rule__FilterContainer__Group__1__Impl : ( ( rule__FilterContainer__LinksAssignment_1 ) ) ;
    public final void rule__FilterContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2971:1: ( ( ( rule__FilterContainer__LinksAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2972:1: ( ( rule__FilterContainer__LinksAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2972:1: ( ( rule__FilterContainer__LinksAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2973:1: ( rule__FilterContainer__LinksAssignment_1 )
            {
             before(grammarAccess.getFilterContainerAccess().getLinksAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2974:1: ( rule__FilterContainer__LinksAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2974:2: rule__FilterContainer__LinksAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__LinksAssignment_1_in_rule__FilterContainer__Group__1__Impl6141);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2984:1: rule__FilterContainer__Group__2 : rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 ;
    public final void rule__FilterContainer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2988:1: ( rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2989:2: rule__FilterContainer__Group__2__Impl rule__FilterContainer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__26171);
            rule__FilterContainer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__26174);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:2996:1: rule__FilterContainer__Group__2__Impl : ( ( rule__FilterContainer__LinksAssignment_2 )* ) ;
    public final void rule__FilterContainer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3000:1: ( ( ( rule__FilterContainer__LinksAssignment_2 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3001:1: ( ( rule__FilterContainer__LinksAssignment_2 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3001:1: ( ( rule__FilterContainer__LinksAssignment_2 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3002:1: ( rule__FilterContainer__LinksAssignment_2 )*
            {
             before(grammarAccess.getFilterContainerAccess().getLinksAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3003:1: ( rule__FilterContainer__LinksAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=25 && LA22_0<=26)||(LA22_0>=33 && LA22_0<=34)||LA22_0==52||LA22_0==54||(LA22_0>=56 && LA22_0<=57)||(LA22_0>=62 && LA22_0<=64)||LA22_0==66) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3003:2: rule__FilterContainer__LinksAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__LinksAssignment_2_in_rule__FilterContainer__Group__2__Impl6201);
            	    rule__FilterContainer__LinksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3013:1: rule__FilterContainer__Group__3 : rule__FilterContainer__Group__3__Impl ;
    public final void rule__FilterContainer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3017:1: ( rule__FilterContainer__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3018:2: rule__FilterContainer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__36232);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3024:1: rule__FilterContainer__Group__3__Impl : ( ')' ) ;
    public final void rule__FilterContainer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3028:1: ( ( ')' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3029:1: ( ')' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3029:1: ( ')' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3030:1: ')'
            {
             before(grammarAccess.getFilterContainerAccess().getRightParenthesisKeyword_3()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__FilterContainer__Group__3__Impl6260); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3051:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3055:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3056:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__06299);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1_in_rule__Link__Group__06302);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3063:1: rule__Link__Group__0__Impl : ( ( rule__Link__CompositonTypeAssignment_0 )? ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3067:1: ( ( ( rule__Link__CompositonTypeAssignment_0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3068:1: ( ( rule__Link__CompositonTypeAssignment_0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3068:1: ( ( rule__Link__CompositonTypeAssignment_0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3069:1: ( rule__Link__CompositonTypeAssignment_0 )?
            {
             before(grammarAccess.getLinkAccess().getCompositonTypeAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3070:1: ( rule__Link__CompositonTypeAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=33 && LA23_0<=34)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3070:2: rule__Link__CompositonTypeAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Link__CompositonTypeAssignment_0_in_rule__Link__Group__0__Impl6329);
                    rule__Link__CompositonTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCompositonTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3080:1: rule__Link__Group__1 : rule__Link__Group__1__Impl ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3084:1: ( rule__Link__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3085:2: rule__Link__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__16360);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3091:1: rule__Link__Group__1__Impl : ( ( rule__Link__ElementAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3095:1: ( ( ( rule__Link__ElementAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3096:1: ( ( rule__Link__ElementAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3096:1: ( ( rule__Link__ElementAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3097:1: ( rule__Link__ElementAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getElementAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3098:1: ( rule__Link__ElementAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3098:2: rule__Link__ElementAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__ElementAssignment_1_in_rule__Link__Group__1__Impl6387);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3112:1: rule__OnAttributes__Group__0 : rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 ;
    public final void rule__OnAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3116:1: ( rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3117:2: rule__OnAttributes__Group__0__Impl rule__OnAttributes__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__06421);
            rule__OnAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__06424);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3124:1: rule__OnAttributes__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__OnAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3128:1: ( ( 'attribute' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3129:1: ( 'attribute' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3129:1: ( 'attribute' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3130:1: 'attribute'
            {
             before(grammarAccess.getOnAttributesAccess().getAttributeKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__OnAttributes__Group__0__Impl6452); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3143:1: rule__OnAttributes__Group__1 : rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 ;
    public final void rule__OnAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3147:1: ( rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3148:2: rule__OnAttributes__Group__1__Impl rule__OnAttributes__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__16483);
            rule__OnAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__16486);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3155:1: rule__OnAttributes__Group__1__Impl : ( ( rule__OnAttributes__NameAssignment_1 ) ) ;
    public final void rule__OnAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3159:1: ( ( ( rule__OnAttributes__NameAssignment_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3160:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3160:1: ( ( rule__OnAttributes__NameAssignment_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3161:1: ( rule__OnAttributes__NameAssignment_1 )
            {
             before(grammarAccess.getOnAttributesAccess().getNameAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3162:1: ( rule__OnAttributes__NameAssignment_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3162:2: rule__OnAttributes__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl6513);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3172:1: rule__OnAttributes__Group__2 : rule__OnAttributes__Group__2__Impl ;
    public final void rule__OnAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3176:1: ( rule__OnAttributes__Group__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3177:2: rule__OnAttributes__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__26543);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3183:1: rule__OnAttributes__Group__2__Impl : ( ( rule__OnAttributes__Alternatives_2 ) ) ;
    public final void rule__OnAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3187:1: ( ( ( rule__OnAttributes__Alternatives_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3188:1: ( ( rule__OnAttributes__Alternatives_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3188:1: ( ( rule__OnAttributes__Alternatives_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3189:1: ( rule__OnAttributes__Alternatives_2 )
            {
             before(grammarAccess.getOnAttributesAccess().getAlternatives_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3190:1: ( rule__OnAttributes__Alternatives_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3190:2: rule__OnAttributes__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Alternatives_2_in_rule__OnAttributes__Group__2__Impl6570);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3206:1: rule__OnAttributes__Group_2_0__0 : rule__OnAttributes__Group_2_0__0__Impl rule__OnAttributes__Group_2_0__1 ;
    public final void rule__OnAttributes__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3210:1: ( rule__OnAttributes__Group_2_0__0__Impl rule__OnAttributes__Group_2_0__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3211:2: rule__OnAttributes__Group_2_0__0__Impl rule__OnAttributes__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__0__Impl_in_rule__OnAttributes__Group_2_0__06606);
            rule__OnAttributes__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__1_in_rule__OnAttributes__Group_2_0__06609);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3218:1: rule__OnAttributes__Group_2_0__0__Impl : ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? ) ;
    public final void rule__OnAttributes__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3222:1: ( ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3223:1: ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3223:1: ( ( rule__OnAttributes__InverseAssignment_2_0_0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3224:1: ( rule__OnAttributes__InverseAssignment_2_0_0 )?
            {
             before(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_0_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3225:1: ( rule__OnAttributes__InverseAssignment_2_0_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==69) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3225:2: rule__OnAttributes__InverseAssignment_2_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__InverseAssignment_2_0_0_in_rule__OnAttributes__Group_2_0__0__Impl6636);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3235:1: rule__OnAttributes__Group_2_0__1 : rule__OnAttributes__Group_2_0__1__Impl ;
    public final void rule__OnAttributes__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3239:1: ( rule__OnAttributes__Group_2_0__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3240:2: rule__OnAttributes__Group_2_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_0__1__Impl_in_rule__OnAttributes__Group_2_0__16667);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3246:1: rule__OnAttributes__Group_2_0__1__Impl : ( 'exist' ) ;
    public final void rule__OnAttributes__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3250:1: ( ( 'exist' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3251:1: ( 'exist' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3251:1: ( 'exist' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3252:1: 'exist'
            {
             before(grammarAccess.getOnAttributesAccess().getExistKeyword_2_0_1()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__OnAttributes__Group_2_0__1__Impl6695); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3269:1: rule__OnAttributes__Group_2_1__0 : rule__OnAttributes__Group_2_1__0__Impl rule__OnAttributes__Group_2_1__1 ;
    public final void rule__OnAttributes__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3273:1: ( rule__OnAttributes__Group_2_1__0__Impl rule__OnAttributes__Group_2_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3274:2: rule__OnAttributes__Group_2_1__0__Impl rule__OnAttributes__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__0__Impl_in_rule__OnAttributes__Group_2_1__06730);
            rule__OnAttributes__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__1_in_rule__OnAttributes__Group_2_1__06733);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3281:1: rule__OnAttributes__Group_2_1__0__Impl : ( 'is' ) ;
    public final void rule__OnAttributes__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3285:1: ( ( 'is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3286:1: ( 'is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3286:1: ( 'is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3287:1: 'is'
            {
             before(grammarAccess.getOnAttributesAccess().getIsKeyword_2_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__OnAttributes__Group_2_1__0__Impl6761); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3300:1: rule__OnAttributes__Group_2_1__1 : rule__OnAttributes__Group_2_1__1__Impl rule__OnAttributes__Group_2_1__2 ;
    public final void rule__OnAttributes__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3304:1: ( rule__OnAttributes__Group_2_1__1__Impl rule__OnAttributes__Group_2_1__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3305:2: rule__OnAttributes__Group_2_1__1__Impl rule__OnAttributes__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__1__Impl_in_rule__OnAttributes__Group_2_1__16792);
            rule__OnAttributes__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__2_in_rule__OnAttributes__Group_2_1__16795);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3312:1: rule__OnAttributes__Group_2_1__1__Impl : ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? ) ;
    public final void rule__OnAttributes__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3316:1: ( ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3317:1: ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3317:1: ( ( rule__OnAttributes__InverseAssignment_2_1_1 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3318:1: ( rule__OnAttributes__InverseAssignment_2_1_1 )?
            {
             before(grammarAccess.getOnAttributesAccess().getInverseAssignment_2_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3319:1: ( rule__OnAttributes__InverseAssignment_2_1_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==69) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3319:2: rule__OnAttributes__InverseAssignment_2_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__InverseAssignment_2_1_1_in_rule__OnAttributes__Group_2_1__1__Impl6822);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3329:1: rule__OnAttributes__Group_2_1__2 : rule__OnAttributes__Group_2_1__2__Impl ;
    public final void rule__OnAttributes__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3333:1: ( rule__OnAttributes__Group_2_1__2__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3334:2: rule__OnAttributes__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__Group_2_1__2__Impl_in_rule__OnAttributes__Group_2_1__26853);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3340:1: rule__OnAttributes__Group_2_1__2__Impl : ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) ) ;
    public final void rule__OnAttributes__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3344:1: ( ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3345:1: ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3345:1: ( ( rule__OnAttributes__ValueAssignment_2_1_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3346:1: ( rule__OnAttributes__ValueAssignment_2_1_2 )
            {
             before(grammarAccess.getOnAttributesAccess().getValueAssignment_2_1_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3347:1: ( rule__OnAttributes__ValueAssignment_2_1_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3347:2: rule__OnAttributes__ValueAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnAttributes__ValueAssignment_2_1_2_in_rule__OnAttributes__Group_2_1__2__Impl6880);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3363:1: rule__OnTags__Group__0 : rule__OnTags__Group__0__Impl rule__OnTags__Group__1 ;
    public final void rule__OnTags__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3367:1: ( rule__OnTags__Group__0__Impl rule__OnTags__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3368:2: rule__OnTags__Group__0__Impl rule__OnTags__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__06916);
            rule__OnTags__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__06919);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3375:1: rule__OnTags__Group__0__Impl : ( 'in [' ) ;
    public final void rule__OnTags__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3379:1: ( ( 'in [' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3380:1: ( 'in [' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3380:1: ( 'in [' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3381:1: 'in ['
            {
             before(grammarAccess.getOnTagsAccess().getInKeyword_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__OnTags__Group__0__Impl6947); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3394:1: rule__OnTags__Group__1 : rule__OnTags__Group__1__Impl rule__OnTags__Group__2 ;
    public final void rule__OnTags__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3398:1: ( rule__OnTags__Group__1__Impl rule__OnTags__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3399:2: rule__OnTags__Group__1__Impl rule__OnTags__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__16978);
            rule__OnTags__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__16981);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3406:1: rule__OnTags__Group__1__Impl : ( ( rule__OnTags__Group_1__0 )? ) ;
    public final void rule__OnTags__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3410:1: ( ( ( rule__OnTags__Group_1__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3411:1: ( ( rule__OnTags__Group_1__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3411:1: ( ( rule__OnTags__Group_1__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3412:1: ( rule__OnTags__Group_1__0 )?
            {
             before(grammarAccess.getOnTagsAccess().getGroup_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3413:1: ( rule__OnTags__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3413:2: rule__OnTags__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__0_in_rule__OnTags__Group__1__Impl7008);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3423:1: rule__OnTags__Group__2 : rule__OnTags__Group__2__Impl rule__OnTags__Group__3 ;
    public final void rule__OnTags__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3427:1: ( rule__OnTags__Group__2__Impl rule__OnTags__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3428:2: rule__OnTags__Group__2__Impl rule__OnTags__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__27039);
            rule__OnTags__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__27042);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3435:1: rule__OnTags__Group__2__Impl : ( ']' ) ;
    public final void rule__OnTags__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3439:1: ( ( ']' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3440:1: ( ']' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3440:1: ( ']' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3441:1: ']'
            {
             before(grammarAccess.getOnTagsAccess().getRightSquareBracketKeyword_2()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnTags__Group__2__Impl7070); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3454:1: rule__OnTags__Group__3 : rule__OnTags__Group__3__Impl rule__OnTags__Group__4 ;
    public final void rule__OnTags__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3458:1: ( rule__OnTags__Group__3__Impl rule__OnTags__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3459:2: rule__OnTags__Group__3__Impl rule__OnTags__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__37101);
            rule__OnTags__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__37104);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3466:1: rule__OnTags__Group__3__Impl : ( ( rule__OnTags__Alternatives_3 ) ) ;
    public final void rule__OnTags__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3470:1: ( ( ( rule__OnTags__Alternatives_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3471:1: ( ( rule__OnTags__Alternatives_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3471:1: ( ( rule__OnTags__Alternatives_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3472:1: ( rule__OnTags__Alternatives_3 )
            {
             before(grammarAccess.getOnTagsAccess().getAlternatives_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3473:1: ( rule__OnTags__Alternatives_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3473:2: rule__OnTags__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Alternatives_3_in_rule__OnTags__Group__3__Impl7131);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3483:1: rule__OnTags__Group__4 : rule__OnTags__Group__4__Impl rule__OnTags__Group__5 ;
    public final void rule__OnTags__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3487:1: ( rule__OnTags__Group__4__Impl rule__OnTags__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3488:2: rule__OnTags__Group__4__Impl rule__OnTags__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__47161);
            rule__OnTags__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__47164);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3495:1: rule__OnTags__Group__4__Impl : ( ( rule__OnTags__InverseAssignment_4 )? ) ;
    public final void rule__OnTags__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3499:1: ( ( ( rule__OnTags__InverseAssignment_4 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3500:1: ( ( rule__OnTags__InverseAssignment_4 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3500:1: ( ( rule__OnTags__InverseAssignment_4 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3501:1: ( rule__OnTags__InverseAssignment_4 )?
            {
             before(grammarAccess.getOnTagsAccess().getInverseAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3502:1: ( rule__OnTags__InverseAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==69) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3502:2: rule__OnTags__InverseAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__InverseAssignment_4_in_rule__OnTags__Group__4__Impl7191);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3512:1: rule__OnTags__Group__5 : rule__OnTags__Group__5__Impl rule__OnTags__Group__6 ;
    public final void rule__OnTags__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3516:1: ( rule__OnTags__Group__5__Impl rule__OnTags__Group__6 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3517:2: rule__OnTags__Group__5__Impl rule__OnTags__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__57222);
            rule__OnTags__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__57225);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3524:1: rule__OnTags__Group__5__Impl : ( 'in tags' ) ;
    public final void rule__OnTags__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3528:1: ( ( 'in tags' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3529:1: ( 'in tags' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3529:1: ( 'in tags' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3530:1: 'in tags'
            {
             before(grammarAccess.getOnTagsAccess().getInTagsKeyword_5()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__OnTags__Group__5__Impl7253); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3543:1: rule__OnTags__Group__6 : rule__OnTags__Group__6__Impl ;
    public final void rule__OnTags__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3547:1: ( rule__OnTags__Group__6__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3548:2: rule__OnTags__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__67284);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3554:1: rule__OnTags__Group__6__Impl : ( ( rule__OnTags__OnlyAssignment_6 )? ) ;
    public final void rule__OnTags__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3558:1: ( ( ( rule__OnTags__OnlyAssignment_6 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3559:1: ( ( rule__OnTags__OnlyAssignment_6 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3559:1: ( ( rule__OnTags__OnlyAssignment_6 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3560:1: ( rule__OnTags__OnlyAssignment_6 )?
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAssignment_6()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3561:1: ( rule__OnTags__OnlyAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==70) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3561:2: rule__OnTags__OnlyAssignment_6
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnTags__OnlyAssignment_6_in_rule__OnTags__Group__6__Impl7311);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3585:1: rule__OnTags__Group_1__0 : rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1 ;
    public final void rule__OnTags__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3589:1: ( rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3590:2: rule__OnTags__Group_1__0__Impl rule__OnTags__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__0__Impl_in_rule__OnTags__Group_1__07356);
            rule__OnTags__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__1_in_rule__OnTags__Group_1__07359);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3597:1: rule__OnTags__Group_1__0__Impl : ( ( rule__OnTags__TagsAssignment_1_0 ) ) ;
    public final void rule__OnTags__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3601:1: ( ( ( rule__OnTags__TagsAssignment_1_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3602:1: ( ( rule__OnTags__TagsAssignment_1_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3602:1: ( ( rule__OnTags__TagsAssignment_1_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3603:1: ( rule__OnTags__TagsAssignment_1_0 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3604:1: ( rule__OnTags__TagsAssignment_1_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3604:2: rule__OnTags__TagsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_1_0_in_rule__OnTags__Group_1__0__Impl7386);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3614:1: rule__OnTags__Group_1__1 : rule__OnTags__Group_1__1__Impl ;
    public final void rule__OnTags__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3618:1: ( rule__OnTags__Group_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3619:2: rule__OnTags__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1__1__Impl_in_rule__OnTags__Group_1__17416);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3625:1: rule__OnTags__Group_1__1__Impl : ( ( rule__OnTags__Group_1_1__0 )* ) ;
    public final void rule__OnTags__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3629:1: ( ( ( rule__OnTags__Group_1_1__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3630:1: ( ( rule__OnTags__Group_1_1__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3630:1: ( ( rule__OnTags__Group_1_1__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3631:1: ( rule__OnTags__Group_1_1__0 )*
            {
             before(grammarAccess.getOnTagsAccess().getGroup_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3632:1: ( rule__OnTags__Group_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==46) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3632:2: rule__OnTags__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__0_in_rule__OnTags__Group_1__1__Impl7443);
            	    rule__OnTags__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3646:1: rule__OnTags__Group_1_1__0 : rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1 ;
    public final void rule__OnTags__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3650:1: ( rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3651:2: rule__OnTags__Group_1_1__0__Impl rule__OnTags__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__0__Impl_in_rule__OnTags__Group_1_1__07478);
            rule__OnTags__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__1_in_rule__OnTags__Group_1_1__07481);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3658:1: rule__OnTags__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__OnTags__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3662:1: ( ( ',' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3663:1: ( ',' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3663:1: ( ',' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3664:1: ','
            {
             before(grammarAccess.getOnTagsAccess().getCommaKeyword_1_1_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__OnTags__Group_1_1__0__Impl7509); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3677:1: rule__OnTags__Group_1_1__1 : rule__OnTags__Group_1_1__1__Impl ;
    public final void rule__OnTags__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3681:1: ( rule__OnTags__Group_1_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3682:2: rule__OnTags__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_1_1__1__Impl_in_rule__OnTags__Group_1_1__17540);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3688:1: rule__OnTags__Group_1_1__1__Impl : ( ( rule__OnTags__TagsAssignment_1_1_1 ) ) ;
    public final void rule__OnTags__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3692:1: ( ( ( rule__OnTags__TagsAssignment_1_1_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3693:1: ( ( rule__OnTags__TagsAssignment_1_1_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3693:1: ( ( rule__OnTags__TagsAssignment_1_1_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3694:1: ( rule__OnTags__TagsAssignment_1_1_1 )
            {
             before(grammarAccess.getOnTagsAccess().getTagsAssignment_1_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3695:1: ( rule__OnTags__TagsAssignment_1_1_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3695:2: rule__OnTags__TagsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TagsAssignment_1_1_1_in_rule__OnTags__Group_1_1__1__Impl7567);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3709:1: rule__OnTags__Group_3_1__0 : rule__OnTags__Group_3_1__0__Impl rule__OnTags__Group_3_1__1 ;
    public final void rule__OnTags__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3713:1: ( rule__OnTags__Group_3_1__0__Impl rule__OnTags__Group_3_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3714:2: rule__OnTags__Group_3_1__0__Impl rule__OnTags__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__0__Impl_in_rule__OnTags__Group_3_1__07601);
            rule__OnTags__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__1_in_rule__OnTags__Group_3_1__07604);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3721:1: rule__OnTags__Group_3_1__0__Impl : ( ( rule__OnTags__TresholdAssignment_3_1_0 ) ) ;
    public final void rule__OnTags__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3725:1: ( ( ( rule__OnTags__TresholdAssignment_3_1_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3726:1: ( ( rule__OnTags__TresholdAssignment_3_1_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3726:1: ( ( rule__OnTags__TresholdAssignment_3_1_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3727:1: ( rule__OnTags__TresholdAssignment_3_1_0 )
            {
             before(grammarAccess.getOnTagsAccess().getTresholdAssignment_3_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3728:1: ( rule__OnTags__TresholdAssignment_3_1_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3728:2: rule__OnTags__TresholdAssignment_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__TresholdAssignment_3_1_0_in_rule__OnTags__Group_3_1__0__Impl7631);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3738:1: rule__OnTags__Group_3_1__1 : rule__OnTags__Group_3_1__1__Impl ;
    public final void rule__OnTags__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3742:1: ( rule__OnTags__Group_3_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3743:2: rule__OnTags__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTags__Group_3_1__1__Impl_in_rule__OnTags__Group_3_1__17661);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3749:1: rule__OnTags__Group_3_1__1__Impl : ( 'are' ) ;
    public final void rule__OnTags__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3753:1: ( ( 'are' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3754:1: ( 'are' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3754:1: ( 'are' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3755:1: 'are'
            {
             before(grammarAccess.getOnTagsAccess().getAreKeyword_3_1_1()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__OnTags__Group_3_1__1__Impl7689); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3772:1: rule__OnTime__Group__0 : rule__OnTime__Group__0__Impl rule__OnTime__Group__1 ;
    public final void rule__OnTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3776:1: ( rule__OnTime__Group__0__Impl rule__OnTime__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3777:2: rule__OnTime__Group__0__Impl rule__OnTime__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__07724);
            rule__OnTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__07727);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3784:1: rule__OnTime__Group__0__Impl : ( ( rule__OnTime__TimeOfAssignment_0 ) ) ;
    public final void rule__OnTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3788:1: ( ( ( rule__OnTime__TimeOfAssignment_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3789:1: ( ( rule__OnTime__TimeOfAssignment_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3789:1: ( ( rule__OnTime__TimeOfAssignment_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3790:1: ( rule__OnTime__TimeOfAssignment_0 )
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfAssignment_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3791:1: ( rule__OnTime__TimeOfAssignment_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3791:2: rule__OnTime__TimeOfAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TimeOfAssignment_0_in_rule__OnTime__Group__0__Impl7754);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3801:1: rule__OnTime__Group__1 : rule__OnTime__Group__1__Impl rule__OnTime__Group__2 ;
    public final void rule__OnTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3805:1: ( rule__OnTime__Group__1__Impl rule__OnTime__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3806:2: rule__OnTime__Group__1__Impl rule__OnTime__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__17784);
            rule__OnTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__17787);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3813:1: rule__OnTime__Group__1__Impl : ( 'before' ) ;
    public final void rule__OnTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3817:1: ( ( 'before' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3818:1: ( 'before' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3818:1: ( 'before' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3819:1: 'before'
            {
             before(grammarAccess.getOnTimeAccess().getBeforeKeyword_1()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__OnTime__Group__1__Impl7815); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3832:1: rule__OnTime__Group__2 : rule__OnTime__Group__2__Impl rule__OnTime__Group__3 ;
    public final void rule__OnTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3836:1: ( rule__OnTime__Group__2__Impl rule__OnTime__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3837:2: rule__OnTime__Group__2__Impl rule__OnTime__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__27846);
            rule__OnTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__27849);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3844:1: rule__OnTime__Group__2__Impl : ( ( rule__OnTime__OperatorAssignment_2 ) ) ;
    public final void rule__OnTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3848:1: ( ( ( rule__OnTime__OperatorAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3849:1: ( ( rule__OnTime__OperatorAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3849:1: ( ( rule__OnTime__OperatorAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3850:1: ( rule__OnTime__OperatorAssignment_2 )
            {
             before(grammarAccess.getOnTimeAccess().getOperatorAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3851:1: ( rule__OnTime__OperatorAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3851:2: rule__OnTime__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__OperatorAssignment_2_in_rule__OnTime__Group__2__Impl7876);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3861:1: rule__OnTime__Group__3 : rule__OnTime__Group__3__Impl rule__OnTime__Group__4 ;
    public final void rule__OnTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3865:1: ( rule__OnTime__Group__3__Impl rule__OnTime__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3866:2: rule__OnTime__Group__3__Impl rule__OnTime__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__37906);
            rule__OnTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__37909);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3873:1: rule__OnTime__Group__3__Impl : ( ( rule__OnTime__TresholdAssignment_3 ) ) ;
    public final void rule__OnTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3877:1: ( ( ( rule__OnTime__TresholdAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3878:1: ( ( rule__OnTime__TresholdAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3878:1: ( ( rule__OnTime__TresholdAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3879:1: ( rule__OnTime__TresholdAssignment_3 )
            {
             before(grammarAccess.getOnTimeAccess().getTresholdAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3880:1: ( rule__OnTime__TresholdAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3880:2: rule__OnTime__TresholdAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__TresholdAssignment_3_in_rule__OnTime__Group__3__Impl7936);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3890:1: rule__OnTime__Group__4 : rule__OnTime__Group__4__Impl ;
    public final void rule__OnTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3894:1: ( rule__OnTime__Group__4__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3895:2: rule__OnTime__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__47966);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3901:1: rule__OnTime__Group__4__Impl : ( ( rule__OnTime__UnitAssignment_4 ) ) ;
    public final void rule__OnTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3905:1: ( ( ( rule__OnTime__UnitAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3906:1: ( ( rule__OnTime__UnitAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3906:1: ( ( rule__OnTime__UnitAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3907:1: ( rule__OnTime__UnitAssignment_4 )
            {
             before(grammarAccess.getOnTimeAccess().getUnitAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3908:1: ( rule__OnTime__UnitAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3908:2: rule__OnTime__UnitAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnTime__UnitAssignment_4_in_rule__OnTime__Group__4__Impl7993);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3928:1: rule__OnSize__Group__0 : rule__OnSize__Group__0__Impl rule__OnSize__Group__1 ;
    public final void rule__OnSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3932:1: ( rule__OnSize__Group__0__Impl rule__OnSize__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3933:2: rule__OnSize__Group__0__Impl rule__OnSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__08033);
            rule__OnSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__08036);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3940:1: rule__OnSize__Group__0__Impl : ( 'size of file' ) ;
    public final void rule__OnSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3944:1: ( ( 'size of file' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3945:1: ( 'size of file' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3945:1: ( 'size of file' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3946:1: 'size of file'
            {
             before(grammarAccess.getOnSizeAccess().getSizeOfFileKeyword_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__OnSize__Group__0__Impl8064); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3959:1: rule__OnSize__Group__1 : rule__OnSize__Group__1__Impl rule__OnSize__Group__2 ;
    public final void rule__OnSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3963:1: ( rule__OnSize__Group__1__Impl rule__OnSize__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3964:2: rule__OnSize__Group__1__Impl rule__OnSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__18095);
            rule__OnSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__18098);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3971:1: rule__OnSize__Group__1__Impl : ( ( rule__OnSize__InverseAssignment_1 )? ) ;
    public final void rule__OnSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3975:1: ( ( ( rule__OnSize__InverseAssignment_1 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3976:1: ( ( rule__OnSize__InverseAssignment_1 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3976:1: ( ( rule__OnSize__InverseAssignment_1 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3977:1: ( rule__OnSize__InverseAssignment_1 )?
            {
             before(grammarAccess.getOnSizeAccess().getInverseAssignment_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3978:1: ( rule__OnSize__InverseAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3978:2: rule__OnSize__InverseAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnSize__InverseAssignment_1_in_rule__OnSize__Group__1__Impl8125);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3988:1: rule__OnSize__Group__2 : rule__OnSize__Group__2__Impl rule__OnSize__Group__3 ;
    public final void rule__OnSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3992:1: ( rule__OnSize__Group__2__Impl rule__OnSize__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:3993:2: rule__OnSize__Group__2__Impl rule__OnSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__28156);
            rule__OnSize__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__28159);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4000:1: rule__OnSize__Group__2__Impl : ( ( rule__OnSize__OperatorAssignment_2 ) ) ;
    public final void rule__OnSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4004:1: ( ( ( rule__OnSize__OperatorAssignment_2 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4005:1: ( ( rule__OnSize__OperatorAssignment_2 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4005:1: ( ( rule__OnSize__OperatorAssignment_2 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4006:1: ( rule__OnSize__OperatorAssignment_2 )
            {
             before(grammarAccess.getOnSizeAccess().getOperatorAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4007:1: ( rule__OnSize__OperatorAssignment_2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4007:2: rule__OnSize__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__OperatorAssignment_2_in_rule__OnSize__Group__2__Impl8186);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4017:1: rule__OnSize__Group__3 : rule__OnSize__Group__3__Impl rule__OnSize__Group__4 ;
    public final void rule__OnSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4021:1: ( rule__OnSize__Group__3__Impl rule__OnSize__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4022:2: rule__OnSize__Group__3__Impl rule__OnSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__38216);
            rule__OnSize__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__38219);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4029:1: rule__OnSize__Group__3__Impl : ( ( rule__OnSize__TresholdAssignment_3 ) ) ;
    public final void rule__OnSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4033:1: ( ( ( rule__OnSize__TresholdAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4034:1: ( ( rule__OnSize__TresholdAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4034:1: ( ( rule__OnSize__TresholdAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4035:1: ( rule__OnSize__TresholdAssignment_3 )
            {
             before(grammarAccess.getOnSizeAccess().getTresholdAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4036:1: ( rule__OnSize__TresholdAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4036:2: rule__OnSize__TresholdAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__TresholdAssignment_3_in_rule__OnSize__Group__3__Impl8246);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4046:1: rule__OnSize__Group__4 : rule__OnSize__Group__4__Impl ;
    public final void rule__OnSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4050:1: ( rule__OnSize__Group__4__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4051:2: rule__OnSize__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__48276);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4057:1: rule__OnSize__Group__4__Impl : ( ( rule__OnSize__UnitAssignment_4 ) ) ;
    public final void rule__OnSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4061:1: ( ( ( rule__OnSize__UnitAssignment_4 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4062:1: ( ( rule__OnSize__UnitAssignment_4 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4062:1: ( ( rule__OnSize__UnitAssignment_4 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4063:1: ( rule__OnSize__UnitAssignment_4 )
            {
             before(grammarAccess.getOnSizeAccess().getUnitAssignment_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4064:1: ( rule__OnSize__UnitAssignment_4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4064:2: rule__OnSize__UnitAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnSize__UnitAssignment_4_in_rule__OnSize__Group__4__Impl8303);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4084:1: rule__OnName__Group__0 : rule__OnName__Group__0__Impl rule__OnName__Group__1 ;
    public final void rule__OnName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4088:1: ( rule__OnName__Group__0__Impl rule__OnName__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4089:2: rule__OnName__Group__0__Impl rule__OnName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__08343);
            rule__OnName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__08346);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4096:1: rule__OnName__Group__0__Impl : ( () ) ;
    public final void rule__OnName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4100:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4101:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4101:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4102:1: ()
            {
             before(grammarAccess.getOnNameAccess().getOnNameAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4103:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4105:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4115:1: rule__OnName__Group__1 : rule__OnName__Group__1__Impl rule__OnName__Group__2 ;
    public final void rule__OnName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4119:1: ( rule__OnName__Group__1__Impl rule__OnName__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4120:2: rule__OnName__Group__1__Impl rule__OnName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__18404);
            rule__OnName__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__18407);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4127:1: rule__OnName__Group__1__Impl : ( 'name is' ) ;
    public final void rule__OnName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4131:1: ( ( 'name is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4132:1: ( 'name is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4132:1: ( 'name is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4133:1: 'name is'
            {
             before(grammarAccess.getOnNameAccess().getNameIsKeyword_1()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__OnName__Group__1__Impl8435); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4146:1: rule__OnName__Group__2 : rule__OnName__Group__2__Impl rule__OnName__Group__3 ;
    public final void rule__OnName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4150:1: ( rule__OnName__Group__2__Impl rule__OnName__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4151:2: rule__OnName__Group__2__Impl rule__OnName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__28466);
            rule__OnName__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__28469);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4158:1: rule__OnName__Group__2__Impl : ( ( rule__OnName__InverseAssignment_2 )? ) ;
    public final void rule__OnName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4162:1: ( ( ( rule__OnName__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4163:1: ( ( rule__OnName__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4163:1: ( ( rule__OnName__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4164:1: ( rule__OnName__InverseAssignment_2 )?
            {
             before(grammarAccess.getOnNameAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4165:1: ( rule__OnName__InverseAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==69) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4165:2: rule__OnName__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnName__InverseAssignment_2_in_rule__OnName__Group__2__Impl8496);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4175:1: rule__OnName__Group__3 : rule__OnName__Group__3__Impl ;
    public final void rule__OnName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4179:1: ( rule__OnName__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4180:2: rule__OnName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__38527);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4186:1: rule__OnName__Group__3__Impl : ( ( rule__OnName__NameAssignment_3 ) ) ;
    public final void rule__OnName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4190:1: ( ( ( rule__OnName__NameAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4191:1: ( ( rule__OnName__NameAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4191:1: ( ( rule__OnName__NameAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4192:1: ( rule__OnName__NameAssignment_3 )
            {
             before(grammarAccess.getOnNameAccess().getNameAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4193:1: ( rule__OnName__NameAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4193:2: rule__OnName__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnName__NameAssignment_3_in_rule__OnName__Group__3__Impl8554);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4211:1: rule__OnExtension__Group__0 : rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 ;
    public final void rule__OnExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4215:1: ( rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4216:2: rule__OnExtension__Group__0__Impl rule__OnExtension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__08592);
            rule__OnExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__08595);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4223:1: rule__OnExtension__Group__0__Impl : ( () ) ;
    public final void rule__OnExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4227:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4228:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4228:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4229:1: ()
            {
             before(grammarAccess.getOnExtensionAccess().getOnExtensionAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4230:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4232:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4242:1: rule__OnExtension__Group__1 : rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 ;
    public final void rule__OnExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4246:1: ( rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4247:2: rule__OnExtension__Group__1__Impl rule__OnExtension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__18653);
            rule__OnExtension__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__18656);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4254:1: rule__OnExtension__Group__1__Impl : ( 'extension is' ) ;
    public final void rule__OnExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4258:1: ( ( 'extension is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4259:1: ( 'extension is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4259:1: ( 'extension is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4260:1: 'extension is'
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionIsKeyword_1()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__OnExtension__Group__1__Impl8684); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4273:1: rule__OnExtension__Group__2 : rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 ;
    public final void rule__OnExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4277:1: ( rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4278:2: rule__OnExtension__Group__2__Impl rule__OnExtension__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__28715);
            rule__OnExtension__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__28718);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4285:1: rule__OnExtension__Group__2__Impl : ( ( rule__OnExtension__InverseAssignment_2 )? ) ;
    public final void rule__OnExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4289:1: ( ( ( rule__OnExtension__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4290:1: ( ( rule__OnExtension__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4290:1: ( ( rule__OnExtension__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4291:1: ( rule__OnExtension__InverseAssignment_2 )?
            {
             before(grammarAccess.getOnExtensionAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4292:1: ( rule__OnExtension__InverseAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==69) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4292:2: rule__OnExtension__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__InverseAssignment_2_in_rule__OnExtension__Group__2__Impl8745);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4302:1: rule__OnExtension__Group__3 : rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 ;
    public final void rule__OnExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4306:1: ( rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4307:2: rule__OnExtension__Group__3__Impl rule__OnExtension__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__38776);
            rule__OnExtension__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__38779);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4314:1: rule__OnExtension__Group__3__Impl : ( 'in [' ) ;
    public final void rule__OnExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4318:1: ( ( 'in [' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4319:1: ( 'in [' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4319:1: ( 'in [' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4320:1: 'in ['
            {
             before(grammarAccess.getOnExtensionAccess().getInKeyword_3()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__OnExtension__Group__3__Impl8807); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4333:1: rule__OnExtension__Group__4 : rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 ;
    public final void rule__OnExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4337:1: ( rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4338:2: rule__OnExtension__Group__4__Impl rule__OnExtension__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__48838);
            rule__OnExtension__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__48841);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4345:1: rule__OnExtension__Group__4__Impl : ( ( rule__OnExtension__Group_4__0 )? ) ;
    public final void rule__OnExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4349:1: ( ( ( rule__OnExtension__Group_4__0 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4350:1: ( ( rule__OnExtension__Group_4__0 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4350:1: ( ( rule__OnExtension__Group_4__0 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4351:1: ( rule__OnExtension__Group_4__0 )?
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_4()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4352:1: ( rule__OnExtension__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4352:2: rule__OnExtension__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__0_in_rule__OnExtension__Group__4__Impl8868);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4362:1: rule__OnExtension__Group__5 : rule__OnExtension__Group__5__Impl ;
    public final void rule__OnExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4366:1: ( rule__OnExtension__Group__5__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4367:2: rule__OnExtension__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__58899);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4373:1: rule__OnExtension__Group__5__Impl : ( ']' ) ;
    public final void rule__OnExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4377:1: ( ( ']' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4378:1: ( ']' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4378:1: ( ']' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4379:1: ']'
            {
             before(grammarAccess.getOnExtensionAccess().getRightSquareBracketKeyword_5()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__OnExtension__Group__5__Impl8927); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4404:1: rule__OnExtension__Group_4__0 : rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1 ;
    public final void rule__OnExtension__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4408:1: ( rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4409:2: rule__OnExtension__Group_4__0__Impl rule__OnExtension__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__0__Impl_in_rule__OnExtension__Group_4__08970);
            rule__OnExtension__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__1_in_rule__OnExtension__Group_4__08973);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4416:1: rule__OnExtension__Group_4__0__Impl : ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) ) ;
    public final void rule__OnExtension__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4420:1: ( ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4421:1: ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4421:1: ( ( rule__OnExtension__ExtensionsAssignment_4_0 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4422:1: ( rule__OnExtension__ExtensionsAssignment_4_0 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4423:1: ( rule__OnExtension__ExtensionsAssignment_4_0 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4423:2: rule__OnExtension__ExtensionsAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_4_0_in_rule__OnExtension__Group_4__0__Impl9000);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4433:1: rule__OnExtension__Group_4__1 : rule__OnExtension__Group_4__1__Impl ;
    public final void rule__OnExtension__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4437:1: ( rule__OnExtension__Group_4__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4438:2: rule__OnExtension__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4__1__Impl_in_rule__OnExtension__Group_4__19030);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4444:1: rule__OnExtension__Group_4__1__Impl : ( ( rule__OnExtension__Group_4_1__0 )* ) ;
    public final void rule__OnExtension__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4448:1: ( ( ( rule__OnExtension__Group_4_1__0 )* ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4449:1: ( ( rule__OnExtension__Group_4_1__0 )* )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4449:1: ( ( rule__OnExtension__Group_4_1__0 )* )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4450:1: ( rule__OnExtension__Group_4_1__0 )*
            {
             before(grammarAccess.getOnExtensionAccess().getGroup_4_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4451:1: ( rule__OnExtension__Group_4_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==46) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4451:2: rule__OnExtension__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__0_in_rule__OnExtension__Group_4__1__Impl9057);
            	    rule__OnExtension__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4465:1: rule__OnExtension__Group_4_1__0 : rule__OnExtension__Group_4_1__0__Impl rule__OnExtension__Group_4_1__1 ;
    public final void rule__OnExtension__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4469:1: ( rule__OnExtension__Group_4_1__0__Impl rule__OnExtension__Group_4_1__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4470:2: rule__OnExtension__Group_4_1__0__Impl rule__OnExtension__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__0__Impl_in_rule__OnExtension__Group_4_1__09092);
            rule__OnExtension__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__1_in_rule__OnExtension__Group_4_1__09095);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4477:1: rule__OnExtension__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__OnExtension__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4481:1: ( ( ',' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4482:1: ( ',' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4482:1: ( ',' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4483:1: ','
            {
             before(grammarAccess.getOnExtensionAccess().getCommaKeyword_4_1_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__OnExtension__Group_4_1__0__Impl9123); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4496:1: rule__OnExtension__Group_4_1__1 : rule__OnExtension__Group_4_1__1__Impl ;
    public final void rule__OnExtension__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4500:1: ( rule__OnExtension__Group_4_1__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4501:2: rule__OnExtension__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__Group_4_1__1__Impl_in_rule__OnExtension__Group_4_1__19154);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4507:1: rule__OnExtension__Group_4_1__1__Impl : ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) ) ;
    public final void rule__OnExtension__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4511:1: ( ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4512:1: ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4512:1: ( ( rule__OnExtension__ExtensionsAssignment_4_1_1 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4513:1: ( rule__OnExtension__ExtensionsAssignment_4_1_1 )
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsAssignment_4_1_1()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4514:1: ( rule__OnExtension__ExtensionsAssignment_4_1_1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4514:2: rule__OnExtension__ExtensionsAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnExtension__ExtensionsAssignment_4_1_1_in_rule__OnExtension__Group_4_1__1__Impl9181);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4528:1: rule__IsEmpty__Group__0 : rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 ;
    public final void rule__IsEmpty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4532:1: ( rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4533:2: rule__IsEmpty__Group__0__Impl rule__IsEmpty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__09215);
            rule__IsEmpty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__09218);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4540:1: rule__IsEmpty__Group__0__Impl : ( () ) ;
    public final void rule__IsEmpty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4544:1: ( ( () ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4545:1: ( () )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4545:1: ( () )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4546:1: ()
            {
             before(grammarAccess.getIsEmptyAccess().getIsEmptyAction_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4547:1: ()
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4549:1: 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4559:1: rule__IsEmpty__Group__1 : rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 ;
    public final void rule__IsEmpty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4563:1: ( rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4564:2: rule__IsEmpty__Group__1__Impl rule__IsEmpty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__19276);
            rule__IsEmpty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__19279);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4571:1: rule__IsEmpty__Group__1__Impl : ( 'is' ) ;
    public final void rule__IsEmpty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4575:1: ( ( 'is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4576:1: ( 'is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4576:1: ( 'is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4577:1: 'is'
            {
             before(grammarAccess.getIsEmptyAccess().getIsKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__IsEmpty__Group__1__Impl9307); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4590:1: rule__IsEmpty__Group__2 : rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 ;
    public final void rule__IsEmpty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4594:1: ( rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4595:2: rule__IsEmpty__Group__2__Impl rule__IsEmpty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__29338);
            rule__IsEmpty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__29341);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4602:1: rule__IsEmpty__Group__2__Impl : ( ( rule__IsEmpty__InverseAssignment_2 )? ) ;
    public final void rule__IsEmpty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4606:1: ( ( ( rule__IsEmpty__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4607:1: ( ( rule__IsEmpty__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4607:1: ( ( rule__IsEmpty__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4608:1: ( rule__IsEmpty__InverseAssignment_2 )?
            {
             before(grammarAccess.getIsEmptyAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4609:1: ( rule__IsEmpty__InverseAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4609:2: rule__IsEmpty__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__InverseAssignment_2_in_rule__IsEmpty__Group__2__Impl9368);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4619:1: rule__IsEmpty__Group__3 : rule__IsEmpty__Group__3__Impl ;
    public final void rule__IsEmpty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4623:1: ( rule__IsEmpty__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4624:2: rule__IsEmpty__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__39399);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4630:1: rule__IsEmpty__Group__3__Impl : ( 'empty' ) ;
    public final void rule__IsEmpty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4634:1: ( ( 'empty' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4635:1: ( 'empty' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4635:1: ( 'empty' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4636:1: 'empty'
            {
             before(grammarAccess.getIsEmptyAccess().getEmptyKeyword_3()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__IsEmpty__Group__3__Impl9427); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4657:1: rule__OnType__Group__0 : rule__OnType__Group__0__Impl rule__OnType__Group__1 ;
    public final void rule__OnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4661:1: ( rule__OnType__Group__0__Impl rule__OnType__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4662:2: rule__OnType__Group__0__Impl rule__OnType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__09466);
            rule__OnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__09469);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4669:1: rule__OnType__Group__0__Impl : ( 'file' ) ;
    public final void rule__OnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4673:1: ( ( 'file' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4674:1: ( 'file' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4674:1: ( 'file' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4675:1: 'file'
            {
             before(grammarAccess.getOnTypeAccess().getFileKeyword_0()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__OnType__Group__0__Impl9497); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4688:1: rule__OnType__Group__1 : rule__OnType__Group__1__Impl rule__OnType__Group__2 ;
    public final void rule__OnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4692:1: ( rule__OnType__Group__1__Impl rule__OnType__Group__2 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4693:2: rule__OnType__Group__1__Impl rule__OnType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__19528);
            rule__OnType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__19531);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4700:1: rule__OnType__Group__1__Impl : ( 'is' ) ;
    public final void rule__OnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4704:1: ( ( 'is' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4705:1: ( 'is' )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4705:1: ( 'is' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4706:1: 'is'
            {
             before(grammarAccess.getOnTypeAccess().getIsKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__OnType__Group__1__Impl9559); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4719:1: rule__OnType__Group__2 : rule__OnType__Group__2__Impl rule__OnType__Group__3 ;
    public final void rule__OnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4723:1: ( rule__OnType__Group__2__Impl rule__OnType__Group__3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4724:2: rule__OnType__Group__2__Impl rule__OnType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__29590);
            rule__OnType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__29593);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4731:1: rule__OnType__Group__2__Impl : ( ( rule__OnType__InverseAssignment_2 )? ) ;
    public final void rule__OnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4735:1: ( ( ( rule__OnType__InverseAssignment_2 )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4736:1: ( ( rule__OnType__InverseAssignment_2 )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4736:1: ( ( rule__OnType__InverseAssignment_2 )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4737:1: ( rule__OnType__InverseAssignment_2 )?
            {
             before(grammarAccess.getOnTypeAccess().getInverseAssignment_2()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4738:1: ( rule__OnType__InverseAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==69) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4738:2: rule__OnType__InverseAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OnType__InverseAssignment_2_in_rule__OnType__Group__2__Impl9620);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4748:1: rule__OnType__Group__3 : rule__OnType__Group__3__Impl ;
    public final void rule__OnType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4752:1: ( rule__OnType__Group__3__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4753:2: rule__OnType__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__39651);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4759:1: rule__OnType__Group__3__Impl : ( ( rule__OnType__TypeAssignment_3 ) ) ;
    public final void rule__OnType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4763:1: ( ( ( rule__OnType__TypeAssignment_3 ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4764:1: ( ( rule__OnType__TypeAssignment_3 ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4764:1: ( ( rule__OnType__TypeAssignment_3 ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4765:1: ( rule__OnType__TypeAssignment_3 )
            {
             before(grammarAccess.getOnTypeAccess().getTypeAssignment_3()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4766:1: ( rule__OnType__TypeAssignment_3 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4766:2: rule__OnType__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnType__TypeAssignment_3_in_rule__OnType__Group__3__Impl9678);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4784:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4788:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4789:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09716);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09719);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4796:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4800:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4801:1: ( ( '-' )? )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4801:1: ( ( '-' )? )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4802:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4803:1: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==67) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4804:2: '-'
                    {
                    match(input,67,FollowSets000.FOLLOW_67_in_rule__EInt__Group__0__Impl9748); 

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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4815:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4819:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4820:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19781);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4826:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4830:1: ( ( RULE_INT ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4831:1: ( RULE_INT )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4831:1: ( RULE_INT )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4832:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9808); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4848:1: rule__Model__ExecutionsAssignment_1 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4852:1: ( ( ruleExecution ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4853:1: ( ruleExecution )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4853:1: ( ruleExecution )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4854:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_19846);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4863:1: rule__Model__ExecutionsAssignment_2_1 : ( ruleExecution ) ;
    public final void rule__Model__ExecutionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4867:1: ( ( ruleExecution ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4868:1: ( ruleExecution )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4868:1: ( ruleExecution )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4869:1: ruleExecution
            {
             before(grammarAccess.getModelAccess().getExecutionsExecutionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_2_19877);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4878:1: rule__PathVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__PathVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4882:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4883:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4883:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4884:1: ruleEString
            {
             before(grammarAccess.getPathVariableAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_09908);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4893:1: rule__PathVariable__ValueAssignment_2 : ( rulePath ) ;
    public final void rule__PathVariable__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4897:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4898:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4898:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4899:1: rulePath
            {
             before(grammarAccess.getPathVariableAccess().getValuePathParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_29939);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4908:1: rule__Path__StepsAssignment_0 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4912:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4913:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4913:1: ( ruleGenericStep )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4914:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_09970);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4923:1: rule__Path__StepsAssignment_1_1 : ( ruleGenericStep ) ;
    public final void rule__Path__StepsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4927:1: ( ( ruleGenericStep ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4928:1: ( ruleGenericStep )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4928:1: ( ruleGenericStep )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4929:1: ruleGenericStep
            {
             before(grammarAccess.getPathAccess().getStepsGenericStepParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_1_110001);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4938:1: rule__ConcreteStep__ValueAssignment_0 : ( ruleEString ) ;
    public final void rule__ConcreteStep__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4942:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4943:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4943:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4944:1: ruleEString
            {
             before(grammarAccess.getConcreteStepAccess().getValueEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment_010032);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4953:1: rule__ConcreteStep__AbsoluteAssignment_1 : ( ( ':' ) ) ;
    public final void rule__ConcreteStep__AbsoluteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4957:1: ( ( ( ':' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4958:1: ( ( ':' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4958:1: ( ( ':' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4959:1: ( ':' )
            {
             before(grammarAccess.getConcreteStepAccess().getAbsoluteColonKeyword_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4960:1: ( ':' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4961:1: ':'
            {
             before(grammarAccess.getConcreteStepAccess().getAbsoluteColonKeyword_1_0()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__ConcreteStep__AbsoluteAssignment_110068); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4976:1: rule__VariableStep__ValueAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__VariableStep__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4980:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4981:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4981:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4982:1: ( ruleEString )
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableCrossReference_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4983:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4984:1: ruleEString
            {
             before(grammarAccess.getVariableStepAccess().getValuePathVariableEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_110111);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4995:1: rule__ParametrizedStep__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ParametrizedStep__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:4999:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5000:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5000:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5001:1: ruleEString
            {
             before(grammarAccess.getParametrizedStepAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_210146);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5010:1: rule__Selection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5014:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5015:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5015:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5016:1: ruleEString
            {
             before(grammarAccess.getSelectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Selection__NameAssignment_110177);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5025:1: rule__Selection__FromAssignment_3 : ( rulePath ) ;
    public final void rule__Selection__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5029:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5030:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5030:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5031:1: rulePath
            {
             before(grammarAccess.getSelectionAccess().getFromPathParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Selection__FromAssignment_310208);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5040:1: rule__Selection__WhereAssignment_4_1 : ( ruleFilterComponent ) ;
    public final void rule__Selection__WhereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5044:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5045:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5045:1: ( ruleFilterComponent )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5046:1: ruleFilterComponent
            {
             before(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_4_110239);
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


    // $ANTLR start "rule__Selection__WhereAssignment_4_2_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5055:1: rule__Selection__WhereAssignment_4_2_1 : ( ruleFilterComponent ) ;
    public final void rule__Selection__WhereAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5059:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5060:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5060:1: ( ruleFilterComponent )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5061:1: ruleFilterComponent
            {
             before(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_4_2_110270);
            ruleFilterComponent();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getWhereFilterComponentParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__WhereAssignment_4_2_1"


    // $ANTLR start "rule__Copy__SourceAssignment_2"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5070:1: rule__Copy__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Copy__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5074:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5075:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5075:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5076:1: ( ruleEString )
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionCrossReference_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5077:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5078:1: ruleEString
            {
             before(grammarAccess.getCopyAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_210305);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5089:1: rule__Copy__DestinationAssignment_4 : ( rulePath ) ;
    public final void rule__Copy__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5093:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5094:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5094:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5095:1: rulePath
            {
             before(grammarAccess.getCopyAccess().getDestinationPathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_410340);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5104:1: rule__Copy__StrategyAssignment_5_1 : ( ruleStrategies ) ;
    public final void rule__Copy__StrategyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5108:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5109:1: ( ruleStrategies )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5109:1: ( ruleStrategies )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5110:1: ruleStrategies
            {
             before(grammarAccess.getCopyAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_5_110371);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5119:1: rule__Move__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Move__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5123:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5124:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5124:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5125:1: ( ruleEString )
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionCrossReference_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5126:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5127:1: ruleEString
            {
             before(grammarAccess.getMoveAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Move__SourceAssignment_210406);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5138:1: rule__Move__DestinationAssignment_4 : ( rulePath ) ;
    public final void rule__Move__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5142:1: ( ( rulePath ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5143:1: ( rulePath )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5143:1: ( rulePath )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5144:1: rulePath
            {
             before(grammarAccess.getMoveAccess().getDestinationPathParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePath_in_rule__Move__DestinationAssignment_410441);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5153:1: rule__Move__StrategyAssignment_5_1 : ( ruleStrategies ) ;
    public final void rule__Move__StrategyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5157:1: ( ( ruleStrategies ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5158:1: ( ruleStrategies )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5158:1: ( ruleStrategies )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5159:1: ruleStrategies
            {
             before(grammarAccess.getMoveAccess().getStrategyStrategiesEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_5_110472);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5168:1: rule__Delete__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Delete__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5172:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5173:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5173:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5174:1: ( ruleEString )
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionCrossReference_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5175:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5176:1: ruleEString
            {
             before(grammarAccess.getDeleteAccess().getSourceSelectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_210507);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5187:1: rule__FilterContainer__LinksAssignment_1 : ( ruleLink ) ;
    public final void rule__FilterContainer__LinksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5191:1: ( ( ruleLink ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5192:1: ( ruleLink )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5192:1: ( ruleLink )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5193:1: ruleLink
            {
             before(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_110542);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5202:1: rule__FilterContainer__LinksAssignment_2 : ( ruleLink ) ;
    public final void rule__FilterContainer__LinksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5206:1: ( ( ruleLink ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5207:1: ( ruleLink )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5207:1: ( ruleLink )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5208:1: ruleLink
            {
             before(grammarAccess.getFilterContainerAccess().getLinksLinkParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_210573);
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


    // $ANTLR start "rule__Link__CompositonTypeAssignment_0"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5217:1: rule__Link__CompositonTypeAssignment_0 : ( ruleCompositionType ) ;
    public final void rule__Link__CompositonTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5221:1: ( ( ruleCompositionType ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5222:1: ( ruleCompositionType )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5222:1: ( ruleCompositionType )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5223:1: ruleCompositionType
            {
             before(grammarAccess.getLinkAccess().getCompositonTypeCompositionTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositionType_in_rule__Link__CompositonTypeAssignment_010604);
            ruleCompositionType();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCompositonTypeCompositionTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CompositonTypeAssignment_0"


    // $ANTLR start "rule__Link__ElementAssignment_1"
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5232:1: rule__Link__ElementAssignment_1 : ( ruleFilterComponent ) ;
    public final void rule__Link__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5236:1: ( ( ruleFilterComponent ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5237:1: ( ruleFilterComponent )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5237:1: ( ruleFilterComponent )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5238:1: ruleFilterComponent
            {
             before(grammarAccess.getLinkAccess().getElementFilterComponentParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFilterComponent_in_rule__Link__ElementAssignment_110635);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5247:1: rule__OnAttributes__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__OnAttributes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5251:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5252:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5252:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5253:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_110666);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5262:1: rule__OnAttributes__InverseAssignment_2_0_0 : ( ( 'not' ) ) ;
    public final void rule__OnAttributes__InverseAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5266:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5267:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5267:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5268:1: ( 'not' )
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5269:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5270:1: 'not'
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_0_0_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_0_010702); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5285:1: rule__OnAttributes__InverseAssignment_2_1_1 : ( ( 'not' ) ) ;
    public final void rule__OnAttributes__InverseAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5289:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5290:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5290:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5291:1: ( 'not' )
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5292:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5293:1: 'not'
            {
             before(grammarAccess.getOnAttributesAccess().getInverseNotKeyword_2_1_1_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_1_110746); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5308:1: rule__OnAttributes__ValueAssignment_2_1_2 : ( ruleEString ) ;
    public final void rule__OnAttributes__ValueAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5312:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5313:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5313:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5314:1: ruleEString
            {
             before(grammarAccess.getOnAttributesAccess().getValueEStringParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_2_1_210785);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5323:1: rule__OnTags__TagsAssignment_1_0 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5327:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5328:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5328:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5329:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_010816);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5338:1: rule__OnTags__TagsAssignment_1_1_1 : ( ruleEString ) ;
    public final void rule__OnTags__TagsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5342:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5343:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5343:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5344:1: ruleEString
            {
             before(grammarAccess.getOnTagsAccess().getTagsEStringParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_1_110847);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5353:1: rule__OnTags__QuantificatorAssignment_3_0 : ( ruleQuantificators ) ;
    public final void rule__OnTags__QuantificatorAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5357:1: ( ( ruleQuantificators ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5358:1: ( ruleQuantificators )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5358:1: ( ruleQuantificators )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5359:1: ruleQuantificators
            {
             before(grammarAccess.getOnTagsAccess().getQuantificatorQuantificatorsEnumRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantificators_in_rule__OnTags__QuantificatorAssignment_3_010878);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5368:1: rule__OnTags__TresholdAssignment_3_1_0 : ( ruleEInt ) ;
    public final void rule__OnTags__TresholdAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5372:1: ( ( ruleEInt ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5373:1: ( ruleEInt )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5373:1: ( ruleEInt )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5374:1: ruleEInt
            {
             before(grammarAccess.getOnTagsAccess().getTresholdEIntParserRuleCall_3_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_3_1_010909);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5383:1: rule__OnTags__InverseAssignment_4 : ( ( 'not' ) ) ;
    public final void rule__OnTags__InverseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5387:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5388:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5388:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5389:1: ( 'not' )
            {
             before(grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5390:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5391:1: 'not'
            {
             before(grammarAccess.getOnTagsAccess().getInverseNotKeyword_4_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnTags__InverseAssignment_410945); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5406:1: rule__OnTags__OnlyAssignment_6 : ( ( 'and no more tags' ) ) ;
    public final void rule__OnTags__OnlyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5410:1: ( ( ( 'and no more tags' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5411:1: ( ( 'and no more tags' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5411:1: ( ( 'and no more tags' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5412:1: ( 'and no more tags' )
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAndNoMoreTagsKeyword_6_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5413:1: ( 'and no more tags' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5414:1: 'and no more tags'
            {
             before(grammarAccess.getOnTagsAccess().getOnlyAndNoMoreTagsKeyword_6_0()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__OnTags__OnlyAssignment_610989); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5429:1: rule__OnTime__TimeOfAssignment_0 : ( ruleTimeType ) ;
    public final void rule__OnTime__TimeOfAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5433:1: ( ( ruleTimeType ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5434:1: ( ruleTimeType )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5434:1: ( ruleTimeType )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5435:1: ruleTimeType
            {
             before(grammarAccess.getOnTimeAccess().getTimeOfTimeTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_011028);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5444:1: rule__OnTime__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__OnTime__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5448:1: ( ( ruleOperator ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5449:1: ( ruleOperator )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5449:1: ( ruleOperator )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5450:1: ruleOperator
            {
             before(grammarAccess.getOnTimeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_211059);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5459:1: rule__OnTime__TresholdAssignment_3 : ( ruleEInt ) ;
    public final void rule__OnTime__TresholdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5463:1: ( ( ruleEInt ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5464:1: ( ruleEInt )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5464:1: ( ruleEInt )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5465:1: ruleEInt
            {
             before(grammarAccess.getOnTimeAccess().getTresholdEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_311090);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5474:1: rule__OnTime__UnitAssignment_4 : ( ruleTimeUnit ) ;
    public final void rule__OnTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5478:1: ( ( ruleTimeUnit ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5479:1: ( ruleTimeUnit )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5479:1: ( ruleTimeUnit )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5480:1: ruleTimeUnit
            {
             before(grammarAccess.getOnTimeAccess().getUnitTimeUnitEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_411121);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5489:1: rule__OnSize__InverseAssignment_1 : ( ( 'not' ) ) ;
    public final void rule__OnSize__InverseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5493:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5494:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5494:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5495:1: ( 'not' )
            {
             before(grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5496:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5497:1: 'not'
            {
             before(grammarAccess.getOnSizeAccess().getInverseNotKeyword_1_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnSize__InverseAssignment_111157); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5512:1: rule__OnSize__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__OnSize__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5516:1: ( ( ruleOperator ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5517:1: ( ruleOperator )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5517:1: ( ruleOperator )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5518:1: ruleOperator
            {
             before(grammarAccess.getOnSizeAccess().getOperatorOperatorEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_211196);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5527:1: rule__OnSize__TresholdAssignment_3 : ( ruleEInt ) ;
    public final void rule__OnSize__TresholdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5531:1: ( ( ruleEInt ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5532:1: ( ruleEInt )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5532:1: ( ruleEInt )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5533:1: ruleEInt
            {
             before(grammarAccess.getOnSizeAccess().getTresholdEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_311227);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5542:1: rule__OnSize__UnitAssignment_4 : ( ruleMemoryUnit ) ;
    public final void rule__OnSize__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5546:1: ( ( ruleMemoryUnit ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5547:1: ( ruleMemoryUnit )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5547:1: ( ruleMemoryUnit )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5548:1: ruleMemoryUnit
            {
             before(grammarAccess.getOnSizeAccess().getUnitMemoryUnitEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_411258);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5557:1: rule__OnName__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__OnName__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5561:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5562:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5562:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5563:1: ( 'not' )
            {
             before(grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5564:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5565:1: 'not'
            {
             before(grammarAccess.getOnNameAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnName__InverseAssignment_211294); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5580:1: rule__OnName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OnName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5584:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5585:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5585:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5586:1: ruleEString
            {
             before(grammarAccess.getOnNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnName__NameAssignment_311333);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5595:1: rule__OnExtension__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__OnExtension__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5599:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5600:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5600:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5601:1: ( 'not' )
            {
             before(grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5602:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5603:1: 'not'
            {
             before(grammarAccess.getOnExtensionAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnExtension__InverseAssignment_211369); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5618:1: rule__OnExtension__ExtensionsAssignment_4_0 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5622:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5623:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5623:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5624:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_011408);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5633:1: rule__OnExtension__ExtensionsAssignment_4_1_1 : ( ruleEString ) ;
    public final void rule__OnExtension__ExtensionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5637:1: ( ( ruleEString ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5638:1: ( ruleEString )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5638:1: ( ruleEString )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5639:1: ruleEString
            {
             before(grammarAccess.getOnExtensionAccess().getExtensionsEStringParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_1_111439);
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5648:1: rule__IsEmpty__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__IsEmpty__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5652:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5653:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5653:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5654:1: ( 'not' )
            {
             before(grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5655:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5656:1: 'not'
            {
             before(grammarAccess.getIsEmptyAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__IsEmpty__InverseAssignment_211475); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5671:1: rule__OnType__InverseAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__OnType__InverseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5675:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5676:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5676:1: ( ( 'not' ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5677:1: ( 'not' )
            {
             before(grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0()); 
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5678:1: ( 'not' )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5679:1: 'not'
            {
             before(grammarAccess.getOnTypeAccess().getInverseNotKeyword_2_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__OnType__InverseAssignment_211519); 
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
    // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5694:1: rule__OnType__TypeAssignment_3 : ( ruleFileType ) ;
    public final void rule__OnType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5698:1: ( ( ruleFileType ) )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5699:1: ( ruleFileType )
            {
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5699:1: ( ruleFileType )
            // ../org.xtext.example.myFetl.ui/src-gen/org/xtext/example/myFetl/ui/contentassist/antlr/internal/InternalFETL.g:5700:1: ruleFileType
            {
             before(grammarAccess.getOnTypeAccess().getTypeFileTypeEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_311558);
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
        public static final BitSet FOLLOW_rule__CompositionType__Alternatives_in_ruleCompositionType1789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FileType__Alternatives_in_ruleFileType1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_rule__Execution__Alternatives1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopy_in_rule__Execution__Alternatives1877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Execution__Alternatives1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDelete_in_rule__Execution__Alternatives1911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathVariable_in_rule__Execution__Alternatives1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConcreteStep_in_rule__GenericStep__Alternatives1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStep_in_rule__GenericStep__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametrizedStep_in_rule__GenericStep__Alternatives1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnName_in_rule__FilterComponent__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnExtension_in_rule__FilterComponent__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTime_in_rule__FilterComponent__Alternatives2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnAttributes_in_rule__FilterComponent__Alternatives2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnTags_in_rule__FilterComponent__Alternatives2094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnSize_in_rule__FilterComponent__Alternatives2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterContainer_in_rule__FilterComponent__Alternatives2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsEmpty_in_rule__FilterComponent__Alternatives2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnType_in_rule__FilterComponent__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__0_in_rule__OnAttributes__Alternatives_22194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__0_in_rule__OnAttributes__Alternatives_22212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__QuantificatorAssignment_3_0_in_rule__OnTags__Alternatives_32245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__0_in_rule__OnTags__Alternatives_32263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Strategies__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Strategies__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Strategies__Alternatives2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Operator__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Operator__Alternatives2446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TimeUnit__Alternatives2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TimeUnit__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TimeUnit__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TimeUnit__Alternatives2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TimeUnit__Alternatives2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TimeUnit__Alternatives2650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TimeType__Alternatives2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TimeType__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Quantificators__Alternatives2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Quantificators__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MemoryUnit__Alternatives2800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MemoryUnit__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MemoryUnit__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MemoryUnit__Alternatives2863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__CompositionType__Alternatives2899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__CompositionType__Alternatives2920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__FileType__Alternatives2956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__FileType__Alternatives2977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03010 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13071 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_1_in_rule__Model__Group__1__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__0_in_rule__Model__Group__2__Impl3158 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__0__Impl_in_rule__Model__Group_2__03195 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__Model__Group_2__1_in_rule__Model__Group_2__03198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Model__Group_2__0__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_2__1__Impl_in_rule__Model__Group_2__13257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ExecutionsAssignment_2_1_in_rule__Model__Group_2__1__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__0__Impl_in_rule__PathVariable__Group__03318 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1_in_rule__PathVariable__Group__03321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__NameAssignment_0_in_rule__PathVariable__Group__0__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__1__Impl_in_rule__PathVariable__Group__13378 = new BitSet(new long[]{0x000C8B0000000030L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2_in_rule__PathVariable__Group__13381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PathVariable__Group__1__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__Group__2__Impl_in_rule__PathVariable__Group__23440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PathVariable__ValueAssignment_2_in_rule__PathVariable__Group__2__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__03503 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__03506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_0_in_rule__Path__Group__0__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__13563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl3590 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__03625 = new BitSet(new long[]{0x000C8B0000000030L});
        public static final BitSet FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__03628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Path__Group_1__0__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__13687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Path__StepsAssignment_1_1_in_rule__Path__Group_1__1__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__0__Impl_in_rule__ConcreteStep__Group__03748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__1_in_rule__ConcreteStep__Group__03751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__ValueAssignment_0_in_rule__ConcreteStep__Group__0__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__Group__1__Impl_in_rule__ConcreteStep__Group__13808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConcreteStep__AbsoluteAssignment_1_in_rule__ConcreteStep__Group__1__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__0__Impl_in_rule__VariableStep__Group__03870 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1_in_rule__VariableStep__Group__03873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__VariableStep__Group__0__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__Group__1__Impl_in_rule__VariableStep__Group__13932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStep__ValueAssignment_1_in_rule__VariableStep__Group__1__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__0__Impl_in_rule__ParametrizedStep__Group__03993 = new BitSet(new long[]{0x000C8B0000000030L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1_in_rule__ParametrizedStep__Group__03996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__1__Impl_in_rule__ParametrizedStep__Group__14054 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2_in_rule__ParametrizedStep__Group__14057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ParametrizedStep__Group__1__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__2__Impl_in_rule__ParametrizedStep__Group__24116 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__3_in_rule__ParametrizedStep__Group__24119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__NameAssignment_2_in_rule__ParametrizedStep__Group__2__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParametrizedStep__Group__3__Impl_in_rule__ParametrizedStep__Group__34176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ParametrizedStep__Group__3__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__04243 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__04246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Selection__Group__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__14305 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__14308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__24365 = new BitSet(new long[]{0x000C8B0000000030L});
        public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__24368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Selection__Group__2__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__34427 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__34430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__FromAssignment_3_in_rule__Selection__Group__3__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__44487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__0_in_rule__Selection__Group__4__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__0__Impl_in_rule__Selection__Group_4__04555 = new BitSet(new long[]{0xC350000006000000L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__1_in_rule__Selection__Group_4__04558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Selection__Group_4__0__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__1__Impl_in_rule__Selection__Group_4__14617 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__2_in_rule__Selection__Group_4__14620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__WhereAssignment_4_1_in_rule__Selection__Group_4__1__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4__2__Impl_in_rule__Selection__Group_4__24677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4_2__0_in_rule__Selection__Group_4__2__Impl4704 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4_2__0__Impl_in_rule__Selection__Group_4_2__04741 = new BitSet(new long[]{0xC350000006000000L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__Selection__Group_4_2__1_in_rule__Selection__Group_4_2__04744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Selection__Group_4_2__0__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__Group_4_2__1__Impl_in_rule__Selection__Group_4_2__14803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Selection__WhereAssignment_4_2_1_in_rule__Selection__Group_4_2__1__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__0__Impl_in_rule__Copy__Group__04864 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__1_in_rule__Copy__Group__04867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Copy__Group__0__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__1__Impl_in_rule__Copy__Group__14926 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__Copy__Group__2_in_rule__Copy__Group__14929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Copy__Group__1__Impl4957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__2__Impl_in_rule__Copy__Group__24988 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__3_in_rule__Copy__Group__24991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__SourceAssignment_2_in_rule__Copy__Group__2__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__3__Impl_in_rule__Copy__Group__35048 = new BitSet(new long[]{0x000C8B0000000030L});
        public static final BitSet FOLLOW_rule__Copy__Group__4_in_rule__Copy__Group__35051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Copy__Group__3__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__4__Impl_in_rule__Copy__Group__45110 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Copy__Group__5_in_rule__Copy__Group__45113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__DestinationAssignment_4_in_rule__Copy__Group__4__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group__5__Impl_in_rule__Copy__Group__55170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__0_in_rule__Copy__Group__5__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__0__Impl_in_rule__Copy__Group_5__05240 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__1_in_rule__Copy__Group_5__05243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Copy__Group_5__0__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__Group_5__1__Impl_in_rule__Copy__Group_5__15302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Copy__StrategyAssignment_5_1_in_rule__Copy__Group_5__1__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__05363 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__05366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Move__Group__0__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__15425 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__15428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Move__Group__1__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__25487 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__25490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SourceAssignment_2_in_rule__Move__Group__2__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__35547 = new BitSet(new long[]{0x000C8B0000000030L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__35550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Move__Group__3__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__45609 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Move__Group__5_in_rule__Move__Group__45612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__DestinationAssignment_4_in_rule__Move__Group__4__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__55669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__0_in_rule__Move__Group__5__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__0__Impl_in_rule__Move__Group_5__05739 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__Move__Group_5__1_in_rule__Move__Group_5__05742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Move__Group_5__0__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_5__1__Impl_in_rule__Move__Group_5__15801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__StrategyAssignment_5_1_in_rule__Move__Group_5__1__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__0__Impl_in_rule__Delete__Group__05862 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Delete__Group__1_in_rule__Delete__Group__05865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Delete__Group__0__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__1__Impl_in_rule__Delete__Group__15924 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__Delete__Group__2_in_rule__Delete__Group__15927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Delete__Group__1__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__Group__2__Impl_in_rule__Delete__Group__25986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Delete__SourceAssignment_2_in_rule__Delete__Group__2__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__0__Impl_in_rule__FilterContainer__Group__06049 = new BitSet(new long[]{0xC350000606000000L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1_in_rule__FilterContainer__Group__06052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__FilterContainer__Group__0__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__1__Impl_in_rule__FilterContainer__Group__16111 = new BitSet(new long[]{0xC370000606000000L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2_in_rule__FilterContainer__Group__16114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__LinksAssignment_1_in_rule__FilterContainer__Group__1__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__2__Impl_in_rule__FilterContainer__Group__26171 = new BitSet(new long[]{0xC370000606000000L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3_in_rule__FilterContainer__Group__26174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FilterContainer__LinksAssignment_2_in_rule__FilterContainer__Group__2__Impl6201 = new BitSet(new long[]{0xC350000606000002L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__FilterContainer__Group__3__Impl_in_rule__FilterContainer__Group__36232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__FilterContainer__Group__3__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__06299 = new BitSet(new long[]{0xC350000606000000L,0x0000000000000005L});
        public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__06302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__CompositonTypeAssignment_0_in_rule__Link__Group__0__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__16360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__ElementAssignment_1_in_rule__Link__Group__1__Impl6387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__0__Impl_in_rule__OnAttributes__Group__06421 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1_in_rule__OnAttributes__Group__06424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__OnAttributes__Group__0__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__1__Impl_in_rule__OnAttributes__Group__16483 = new BitSet(new long[]{0x0180000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2_in_rule__OnAttributes__Group__16486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__NameAssignment_1_in_rule__OnAttributes__Group__1__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group__2__Impl_in_rule__OnAttributes__Group__26543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Alternatives_2_in_rule__OnAttributes__Group__2__Impl6570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__0__Impl_in_rule__OnAttributes__Group_2_0__06606 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__1_in_rule__OnAttributes__Group_2_0__06609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__InverseAssignment_2_0_0_in_rule__OnAttributes__Group_2_0__0__Impl6636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_0__1__Impl_in_rule__OnAttributes__Group_2_0__16667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__OnAttributes__Group_2_0__1__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__0__Impl_in_rule__OnAttributes__Group_2_1__06730 = new BitSet(new long[]{0x000C880000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__1_in_rule__OnAttributes__Group_2_1__06733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__OnAttributes__Group_2_1__0__Impl6761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__1__Impl_in_rule__OnAttributes__Group_2_1__16792 = new BitSet(new long[]{0x000C880000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__2_in_rule__OnAttributes__Group_2_1__16795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__InverseAssignment_2_1_1_in_rule__OnAttributes__Group_2_1__1__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__Group_2_1__2__Impl_in_rule__OnAttributes__Group_2_1__26853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnAttributes__ValueAssignment_2_1_2_in_rule__OnAttributes__Group_2_1__2__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__0__Impl_in_rule__OnTags__Group__06916 = new BitSet(new long[]{0x040C880000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1_in_rule__OnTags__Group__06919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__OnTags__Group__0__Impl6947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__1__Impl_in_rule__OnTags__Group__16978 = new BitSet(new long[]{0x040C880000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2_in_rule__OnTags__Group__16981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__0_in_rule__OnTags__Group__1__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__2__Impl_in_rule__OnTags__Group__27039 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3_in_rule__OnTags__Group__27042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnTags__Group__2__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__3__Impl_in_rule__OnTags__Group__37101 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4_in_rule__OnTags__Group__37104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Alternatives_3_in_rule__OnTags__Group__3__Impl7131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__4__Impl_in_rule__OnTags__Group__47161 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5_in_rule__OnTags__Group__47164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__InverseAssignment_4_in_rule__OnTags__Group__4__Impl7191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__5__Impl_in_rule__OnTags__Group__57222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6_in_rule__OnTags__Group__57225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__OnTags__Group__5__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group__6__Impl_in_rule__OnTags__Group__67284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__OnlyAssignment_6_in_rule__OnTags__Group__6__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__0__Impl_in_rule__OnTags__Group_1__07356 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__1_in_rule__OnTags__Group_1__07359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_1_0_in_rule__OnTags__Group_1__0__Impl7386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1__1__Impl_in_rule__OnTags__Group_1__17416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__0_in_rule__OnTags__Group_1__1__Impl7443 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__0__Impl_in_rule__OnTags__Group_1_1__07478 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__1_in_rule__OnTags__Group_1_1__07481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__OnTags__Group_1_1__0__Impl7509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_1_1__1__Impl_in_rule__OnTags__Group_1_1__17540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TagsAssignment_1_1_1_in_rule__OnTags__Group_1_1__1__Impl7567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__0__Impl_in_rule__OnTags__Group_3_1__07601 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__1_in_rule__OnTags__Group_3_1__07604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__TresholdAssignment_3_1_0_in_rule__OnTags__Group_3_1__0__Impl7631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTags__Group_3_1__1__Impl_in_rule__OnTags__Group_3_1__17661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__OnTags__Group_3_1__1__Impl7689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__0__Impl_in_rule__OnTime__Group__07724 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1_in_rule__OnTime__Group__07727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TimeOfAssignment_0_in_rule__OnTime__Group__0__Impl7754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__1__Impl_in_rule__OnTime__Group__17784 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2_in_rule__OnTime__Group__17787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__OnTime__Group__1__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__2__Impl_in_rule__OnTime__Group__27846 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3_in_rule__OnTime__Group__27849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__OperatorAssignment_2_in_rule__OnTime__Group__2__Impl7876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__3__Impl_in_rule__OnTime__Group__37906 = new BitSet(new long[]{0x0000000001F80000L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4_in_rule__OnTime__Group__37909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__TresholdAssignment_3_in_rule__OnTime__Group__3__Impl7936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__Group__4__Impl_in_rule__OnTime__Group__47966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnTime__UnitAssignment_4_in_rule__OnTime__Group__4__Impl7993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__0__Impl_in_rule__OnSize__Group__08033 = new BitSet(new long[]{0x000000000007C000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1_in_rule__OnSize__Group__08036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__OnSize__Group__0__Impl8064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__1__Impl_in_rule__OnSize__Group__18095 = new BitSet(new long[]{0x000000000007C000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2_in_rule__OnSize__Group__18098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__InverseAssignment_1_in_rule__OnSize__Group__1__Impl8125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__2__Impl_in_rule__OnSize__Group__28156 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3_in_rule__OnSize__Group__28159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__OperatorAssignment_2_in_rule__OnSize__Group__2__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__3__Impl_in_rule__OnSize__Group__38216 = new BitSet(new long[]{0x00000001E0000000L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4_in_rule__OnSize__Group__38219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__TresholdAssignment_3_in_rule__OnSize__Group__3__Impl8246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__Group__4__Impl_in_rule__OnSize__Group__48276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnSize__UnitAssignment_4_in_rule__OnSize__Group__4__Impl8303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__0__Impl_in_rule__OnName__Group__08343 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_rule__OnName__Group__1_in_rule__OnName__Group__08346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__1__Impl_in_rule__OnName__Group__18404 = new BitSet(new long[]{0x000C880000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnName__Group__2_in_rule__OnName__Group__18407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__OnName__Group__1__Impl8435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__2__Impl_in_rule__OnName__Group__28466 = new BitSet(new long[]{0x000C880000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnName__Group__3_in_rule__OnName__Group__28469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__InverseAssignment_2_in_rule__OnName__Group__2__Impl8496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__Group__3__Impl_in_rule__OnName__Group__38527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnName__NameAssignment_3_in_rule__OnName__Group__3__Impl8554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__0__Impl_in_rule__OnExtension__Group__08592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1_in_rule__OnExtension__Group__08595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__1__Impl_in_rule__OnExtension__Group__18653 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2_in_rule__OnExtension__Group__18656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__OnExtension__Group__1__Impl8684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__2__Impl_in_rule__OnExtension__Group__28715 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3_in_rule__OnExtension__Group__28718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__InverseAssignment_2_in_rule__OnExtension__Group__2__Impl8745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__3__Impl_in_rule__OnExtension__Group__38776 = new BitSet(new long[]{0x040C880000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4_in_rule__OnExtension__Group__38779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__OnExtension__Group__3__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__4__Impl_in_rule__OnExtension__Group__48838 = new BitSet(new long[]{0x040C880000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5_in_rule__OnExtension__Group__48841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__0_in_rule__OnExtension__Group__4__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group__5__Impl_in_rule__OnExtension__Group__58899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__OnExtension__Group__5__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__0__Impl_in_rule__OnExtension__Group_4__08970 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__1_in_rule__OnExtension__Group_4__08973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_4_0_in_rule__OnExtension__Group_4__0__Impl9000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4__1__Impl_in_rule__OnExtension__Group_4__19030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__0_in_rule__OnExtension__Group_4__1__Impl9057 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__0__Impl_in_rule__OnExtension__Group_4_1__09092 = new BitSet(new long[]{0x000C880000000030L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__1_in_rule__OnExtension__Group_4_1__09095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__OnExtension__Group_4_1__0__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__Group_4_1__1__Impl_in_rule__OnExtension__Group_4_1__19154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnExtension__ExtensionsAssignment_4_1_1_in_rule__OnExtension__Group_4_1__1__Impl9181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__0__Impl_in_rule__IsEmpty__Group__09215 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1_in_rule__IsEmpty__Group__09218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__1__Impl_in_rule__IsEmpty__Group__19276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000022L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2_in_rule__IsEmpty__Group__19279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__IsEmpty__Group__1__Impl9307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__2__Impl_in_rule__IsEmpty__Group__29338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000022L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3_in_rule__IsEmpty__Group__29341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__InverseAssignment_2_in_rule__IsEmpty__Group__2__Impl9368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IsEmpty__Group__3__Impl_in_rule__IsEmpty__Group__39399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__IsEmpty__Group__3__Impl9427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__0__Impl_in_rule__OnType__Group__09466 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_rule__OnType__Group__1_in_rule__OnType__Group__09469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__OnType__Group__0__Impl9497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__1__Impl_in_rule__OnType__Group__19528 = new BitSet(new long[]{0x0000001800000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnType__Group__2_in_rule__OnType__Group__19531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__OnType__Group__1__Impl9559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__2__Impl_in_rule__OnType__Group__29590 = new BitSet(new long[]{0x0000001800000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OnType__Group__3_in_rule__OnType__Group__29593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__InverseAssignment_2_in_rule__OnType__Group__2__Impl9620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__Group__3__Impl_in_rule__OnType__Group__39651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnType__TypeAssignment_3_in_rule__OnType__Group__3__Impl9678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__09716 = new BitSet(new long[]{0x0000000018000040L,0x0000000000000008L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__09719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__EInt__Group__0__Impl9748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__19781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl9808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_19846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecution_in_rule__Model__ExecutionsAssignment_2_19877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PathVariable__NameAssignment_09908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__PathVariable__ValueAssignment_29939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_09970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGenericStep_in_rule__Path__StepsAssignment_1_110001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ConcreteStep__ValueAssignment_010032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__ConcreteStep__AbsoluteAssignment_110068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableStep__ValueAssignment_110111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParametrizedStep__NameAssignment_210146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Selection__NameAssignment_110177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Selection__FromAssignment_310208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_4_110239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Selection__WhereAssignment_4_2_110270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Copy__SourceAssignment_210305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Copy__DestinationAssignment_410340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Copy__StrategyAssignment_5_110371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Move__SourceAssignment_210406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePath_in_rule__Move__DestinationAssignment_410441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategies_in_rule__Move__StrategyAssignment_5_110472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Delete__SourceAssignment_210507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_110542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__FilterContainer__LinksAssignment_210573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositionType_in_rule__Link__CompositonTypeAssignment_010604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFilterComponent_in_rule__Link__ElementAssignment_110635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__NameAssignment_110666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_0_010702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnAttributes__InverseAssignment_2_1_110746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnAttributes__ValueAssignment_2_1_210785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_010816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnTags__TagsAssignment_1_1_110847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantificators_in_rule__OnTags__QuantificatorAssignment_3_010878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTags__TresholdAssignment_3_1_010909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnTags__InverseAssignment_410945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__OnTags__OnlyAssignment_610989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeType_in_rule__OnTime__TimeOfAssignment_011028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnTime__OperatorAssignment_211059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnTime__TresholdAssignment_311090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeUnit_in_rule__OnTime__UnitAssignment_411121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnSize__InverseAssignment_111157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_rule__OnSize__OperatorAssignment_211196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OnSize__TresholdAssignment_311227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMemoryUnit_in_rule__OnSize__UnitAssignment_411258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnName__InverseAssignment_211294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnName__NameAssignment_311333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnExtension__InverseAssignment_211369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_011408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnExtension__ExtensionsAssignment_4_1_111439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__IsEmpty__InverseAssignment_211475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__OnType__InverseAssignment_211519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFileType_in_rule__OnType__TypeAssignment_311558 = new BitSet(new long[]{0x0000000000000002L});
    }


}