package org.xtext.workout.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.workout.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'beginner'", "'practiced'", "'professional'", "'push-ups'", "'knee-bends'", "'sit-ups'", "'do'", "'as'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__WorkoutAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__WorkoutAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__WorkoutAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__WorkoutAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__WorkoutAssignment )*
            {
             before(grammarAccess.getModelAccess().getWorkoutAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__WorkoutAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__WorkoutAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__WorkoutAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getWorkoutAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleWorkout"
    // InternalMyDsl.g:78:1: entryRuleWorkout : ruleWorkout EOF ;
    public final void entryRuleWorkout() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleWorkout EOF )
            // InternalMyDsl.g:80:1: ruleWorkout EOF
            {
             before(grammarAccess.getWorkoutRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkout();

            state._fsp--;

             after(grammarAccess.getWorkoutRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkout"


    // $ANTLR start "ruleWorkout"
    // InternalMyDsl.g:87:1: ruleWorkout : ( ruleperformExercise ) ;
    public final void ruleWorkout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ruleperformExercise ) )
            // InternalMyDsl.g:92:2: ( ruleperformExercise )
            {
            // InternalMyDsl.g:92:2: ( ruleperformExercise )
            // InternalMyDsl.g:93:3: ruleperformExercise
            {
             before(grammarAccess.getWorkoutAccess().getPerformExerciseParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleperformExercise();

            state._fsp--;

             after(grammarAccess.getWorkoutAccess().getPerformExerciseParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkout"


    // $ANTLR start "entryRuleperformExercise"
    // InternalMyDsl.g:103:1: entryRuleperformExercise : ruleperformExercise EOF ;
    public final void entryRuleperformExercise() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleperformExercise EOF )
            // InternalMyDsl.g:105:1: ruleperformExercise EOF
            {
             before(grammarAccess.getPerformExerciseRule()); 
            pushFollow(FOLLOW_1);
            ruleperformExercise();

            state._fsp--;

             after(grammarAccess.getPerformExerciseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleperformExercise"


    // $ANTLR start "ruleperformExercise"
    // InternalMyDsl.g:112:1: ruleperformExercise : ( ( rule__PerformExercise__Group__0 ) ) ;
    public final void ruleperformExercise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__PerformExercise__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__PerformExercise__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__PerformExercise__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__PerformExercise__Group__0 )
            {
             before(grammarAccess.getPerformExerciseAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__PerformExercise__Group__0 )
            // InternalMyDsl.g:119:4: rule__PerformExercise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PerformExercise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerformExerciseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleperformExercise"


    // $ANTLR start "entryRulelevel"
    // InternalMyDsl.g:128:1: entryRulelevel : rulelevel EOF ;
    public final void entryRulelevel() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulelevel EOF )
            // InternalMyDsl.g:130:1: rulelevel EOF
            {
             before(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            rulelevel();

            state._fsp--;

             after(grammarAccess.getLevelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelevel"


    // $ANTLR start "rulelevel"
    // InternalMyDsl.g:137:1: rulelevel : ( ( rule__Level__Alternatives ) ) ;
    public final void rulelevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Level__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Level__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Level__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Level__Alternatives )
            {
             before(grammarAccess.getLevelAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Level__Alternatives )
            // InternalMyDsl.g:144:4: rule__Level__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Level__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelevel"


    // $ANTLR start "entryRulepractice"
    // InternalMyDsl.g:153:1: entryRulepractice : rulepractice EOF ;
    public final void entryRulepractice() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulepractice EOF )
            // InternalMyDsl.g:155:1: rulepractice EOF
            {
             before(grammarAccess.getPracticeRule()); 
            pushFollow(FOLLOW_1);
            rulepractice();

            state._fsp--;

             after(grammarAccess.getPracticeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepractice"


    // $ANTLR start "rulepractice"
    // InternalMyDsl.g:162:1: rulepractice : ( ( rule__Practice__Alternatives ) ) ;
    public final void rulepractice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Practice__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Practice__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Practice__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Practice__Alternatives )
            {
             before(grammarAccess.getPracticeAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Practice__Alternatives )
            // InternalMyDsl.g:169:4: rule__Practice__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Practice__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPracticeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepractice"


    // $ANTLR start "rule__Level__Alternatives"
    // InternalMyDsl.g:177:1: rule__Level__Alternatives : ( ( 'beginner' ) | ( 'practiced' ) | ( 'professional' ) );
    public final void rule__Level__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( 'beginner' ) | ( 'practiced' ) | ( 'professional' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // InternalMyDsl.g:182:2: ( 'beginner' )
                    {
                    // InternalMyDsl.g:182:2: ( 'beginner' )
                    // InternalMyDsl.g:183:3: 'beginner'
                    {
                     before(grammarAccess.getLevelAccess().getBeginnerKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getBeginnerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( 'practiced' )
                    {
                    // InternalMyDsl.g:188:2: ( 'practiced' )
                    // InternalMyDsl.g:189:3: 'practiced'
                    {
                     before(grammarAccess.getLevelAccess().getPracticedKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getPracticedKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:194:2: ( 'professional' )
                    {
                    // InternalMyDsl.g:194:2: ( 'professional' )
                    // InternalMyDsl.g:195:3: 'professional'
                    {
                     before(grammarAccess.getLevelAccess().getProfessionalKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLevelAccess().getProfessionalKeyword_2()); 

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
    // $ANTLR end "rule__Level__Alternatives"


    // $ANTLR start "rule__Practice__Alternatives"
    // InternalMyDsl.g:204:1: rule__Practice__Alternatives : ( ( 'push-ups' ) | ( 'knee-bends' ) | ( 'sit-ups' ) );
    public final void rule__Practice__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:1: ( ( 'push-ups' ) | ( 'knee-bends' ) | ( 'sit-ups' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
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
                    // InternalMyDsl.g:209:2: ( 'push-ups' )
                    {
                    // InternalMyDsl.g:209:2: ( 'push-ups' )
                    // InternalMyDsl.g:210:3: 'push-ups'
                    {
                     before(grammarAccess.getPracticeAccess().getPushUpsKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPracticeAccess().getPushUpsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:215:2: ( 'knee-bends' )
                    {
                    // InternalMyDsl.g:215:2: ( 'knee-bends' )
                    // InternalMyDsl.g:216:3: 'knee-bends'
                    {
                     before(grammarAccess.getPracticeAccess().getKneeBendsKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPracticeAccess().getKneeBendsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:221:2: ( 'sit-ups' )
                    {
                    // InternalMyDsl.g:221:2: ( 'sit-ups' )
                    // InternalMyDsl.g:222:3: 'sit-ups'
                    {
                     before(grammarAccess.getPracticeAccess().getSitUpsKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPracticeAccess().getSitUpsKeyword_2()); 

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
    // $ANTLR end "rule__Practice__Alternatives"


    // $ANTLR start "rule__PerformExercise__Group__0"
    // InternalMyDsl.g:231:1: rule__PerformExercise__Group__0 : rule__PerformExercise__Group__0__Impl rule__PerformExercise__Group__1 ;
    public final void rule__PerformExercise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:235:1: ( rule__PerformExercise__Group__0__Impl rule__PerformExercise__Group__1 )
            // InternalMyDsl.g:236:2: rule__PerformExercise__Group__0__Impl rule__PerformExercise__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PerformExercise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformExercise__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__0"


    // $ANTLR start "rule__PerformExercise__Group__0__Impl"
    // InternalMyDsl.g:243:1: rule__PerformExercise__Group__0__Impl : ( 'do' ) ;
    public final void rule__PerformExercise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:247:1: ( ( 'do' ) )
            // InternalMyDsl.g:248:1: ( 'do' )
            {
            // InternalMyDsl.g:248:1: ( 'do' )
            // InternalMyDsl.g:249:2: 'do'
            {
             before(grammarAccess.getPerformExerciseAccess().getDoKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPerformExerciseAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__0__Impl"


    // $ANTLR start "rule__PerformExercise__Group__1"
    // InternalMyDsl.g:258:1: rule__PerformExercise__Group__1 : rule__PerformExercise__Group__1__Impl rule__PerformExercise__Group__2 ;
    public final void rule__PerformExercise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:262:1: ( rule__PerformExercise__Group__1__Impl rule__PerformExercise__Group__2 )
            // InternalMyDsl.g:263:2: rule__PerformExercise__Group__1__Impl rule__PerformExercise__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PerformExercise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformExercise__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__1"


    // $ANTLR start "rule__PerformExercise__Group__1__Impl"
    // InternalMyDsl.g:270:1: rule__PerformExercise__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__PerformExercise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:274:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:275:1: ( RULE_INT )
            {
            // InternalMyDsl.g:275:1: ( RULE_INT )
            // InternalMyDsl.g:276:2: RULE_INT
            {
             before(grammarAccess.getPerformExerciseAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPerformExerciseAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__1__Impl"


    // $ANTLR start "rule__PerformExercise__Group__2"
    // InternalMyDsl.g:285:1: rule__PerformExercise__Group__2 : rule__PerformExercise__Group__2__Impl rule__PerformExercise__Group__3 ;
    public final void rule__PerformExercise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( rule__PerformExercise__Group__2__Impl rule__PerformExercise__Group__3 )
            // InternalMyDsl.g:290:2: rule__PerformExercise__Group__2__Impl rule__PerformExercise__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PerformExercise__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformExercise__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__2"


    // $ANTLR start "rule__PerformExercise__Group__2__Impl"
    // InternalMyDsl.g:297:1: rule__PerformExercise__Group__2__Impl : ( rulepractice ) ;
    public final void rule__PerformExercise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:301:1: ( ( rulepractice ) )
            // InternalMyDsl.g:302:1: ( rulepractice )
            {
            // InternalMyDsl.g:302:1: ( rulepractice )
            // InternalMyDsl.g:303:2: rulepractice
            {
             before(grammarAccess.getPerformExerciseAccess().getPracticeParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulepractice();

            state._fsp--;

             after(grammarAccess.getPerformExerciseAccess().getPracticeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__2__Impl"


    // $ANTLR start "rule__PerformExercise__Group__3"
    // InternalMyDsl.g:312:1: rule__PerformExercise__Group__3 : rule__PerformExercise__Group__3__Impl rule__PerformExercise__Group__4 ;
    public final void rule__PerformExercise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:1: ( rule__PerformExercise__Group__3__Impl rule__PerformExercise__Group__4 )
            // InternalMyDsl.g:317:2: rule__PerformExercise__Group__3__Impl rule__PerformExercise__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PerformExercise__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerformExercise__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__3"


    // $ANTLR start "rule__PerformExercise__Group__3__Impl"
    // InternalMyDsl.g:324:1: rule__PerformExercise__Group__3__Impl : ( 'as' ) ;
    public final void rule__PerformExercise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:328:1: ( ( 'as' ) )
            // InternalMyDsl.g:329:1: ( 'as' )
            {
            // InternalMyDsl.g:329:1: ( 'as' )
            // InternalMyDsl.g:330:2: 'as'
            {
             before(grammarAccess.getPerformExerciseAccess().getAsKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPerformExerciseAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__3__Impl"


    // $ANTLR start "rule__PerformExercise__Group__4"
    // InternalMyDsl.g:339:1: rule__PerformExercise__Group__4 : rule__PerformExercise__Group__4__Impl ;
    public final void rule__PerformExercise__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( rule__PerformExercise__Group__4__Impl )
            // InternalMyDsl.g:344:2: rule__PerformExercise__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerformExercise__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__4"


    // $ANTLR start "rule__PerformExercise__Group__4__Impl"
    // InternalMyDsl.g:350:1: rule__PerformExercise__Group__4__Impl : ( rulelevel ) ;
    public final void rule__PerformExercise__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:354:1: ( ( rulelevel ) )
            // InternalMyDsl.g:355:1: ( rulelevel )
            {
            // InternalMyDsl.g:355:1: ( rulelevel )
            // InternalMyDsl.g:356:2: rulelevel
            {
             before(grammarAccess.getPerformExerciseAccess().getLevelParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            rulelevel();

            state._fsp--;

             after(grammarAccess.getPerformExerciseAccess().getLevelParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerformExercise__Group__4__Impl"


    // $ANTLR start "rule__Model__WorkoutAssignment"
    // InternalMyDsl.g:366:1: rule__Model__WorkoutAssignment : ( ruleWorkout ) ;
    public final void rule__Model__WorkoutAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( ( ruleWorkout ) )
            // InternalMyDsl.g:371:2: ( ruleWorkout )
            {
            // InternalMyDsl.g:371:2: ( ruleWorkout )
            // InternalMyDsl.g:372:3: ruleWorkout
            {
             before(grammarAccess.getModelAccess().getWorkoutWorkoutParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkout();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWorkoutWorkoutParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__WorkoutAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003800L});

}