package org.xtext.workout.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.workout.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'do'", "'as'", "'beginner'", "'practiced'", "'professional'", "'push-ups'", "'knee-bends'", "'sit-ups'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_workout_0_0= ruleWorkout ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_workout_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_workout_0_0= ruleWorkout ) )* )
            // InternalMyDsl.g:78:2: ( (lv_workout_0_0= ruleWorkout ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_workout_0_0= ruleWorkout ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_workout_0_0= ruleWorkout )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_workout_0_0= ruleWorkout )
            	    // InternalMyDsl.g:80:4: lv_workout_0_0= ruleWorkout
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getWorkoutWorkoutParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_workout_0_0=ruleWorkout();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"workout",
            	    					lv_workout_0_0,
            	    					"org.xtext.workout.mydsl.MyDsl.Workout");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleWorkout"
    // InternalMyDsl.g:100:1: entryRuleWorkout returns [String current=null] : iv_ruleWorkout= ruleWorkout EOF ;
    public final String entryRuleWorkout() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWorkout = null;


        try {
            // InternalMyDsl.g:100:47: (iv_ruleWorkout= ruleWorkout EOF )
            // InternalMyDsl.g:101:2: iv_ruleWorkout= ruleWorkout EOF
            {
             newCompositeNode(grammarAccess.getWorkoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkout=ruleWorkout();

            state._fsp--;

             current =iv_ruleWorkout.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkout"


    // $ANTLR start "ruleWorkout"
    // InternalMyDsl.g:107:1: ruleWorkout returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_performExercise_0= ruleperformExercise ;
    public final AntlrDatatypeRuleToken ruleWorkout() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_performExercise_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: (this_performExercise_0= ruleperformExercise )
            // InternalMyDsl.g:114:2: this_performExercise_0= ruleperformExercise
            {

            		newCompositeNode(grammarAccess.getWorkoutAccess().getPerformExerciseParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_performExercise_0=ruleperformExercise();

            state._fsp--;


            		current.merge(this_performExercise_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleWorkout"


    // $ANTLR start "entryRuleperformExercise"
    // InternalMyDsl.g:127:1: entryRuleperformExercise returns [String current=null] : iv_ruleperformExercise= ruleperformExercise EOF ;
    public final String entryRuleperformExercise() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleperformExercise = null;


        try {
            // InternalMyDsl.g:127:55: (iv_ruleperformExercise= ruleperformExercise EOF )
            // InternalMyDsl.g:128:2: iv_ruleperformExercise= ruleperformExercise EOF
            {
             newCompositeNode(grammarAccess.getPerformExerciseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleperformExercise=ruleperformExercise();

            state._fsp--;

             current =iv_ruleperformExercise.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleperformExercise"


    // $ANTLR start "ruleperformExercise"
    // InternalMyDsl.g:134:1: ruleperformExercise returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'do' this_INT_1= RULE_INT this_practice_2= rulepractice kw= 'as' this_level_4= rulelevel ) ;
    public final AntlrDatatypeRuleToken ruleperformExercise() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_practice_2 = null;

        AntlrDatatypeRuleToken this_level_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:140:2: ( (kw= 'do' this_INT_1= RULE_INT this_practice_2= rulepractice kw= 'as' this_level_4= rulelevel ) )
            // InternalMyDsl.g:141:2: (kw= 'do' this_INT_1= RULE_INT this_practice_2= rulepractice kw= 'as' this_level_4= rulelevel )
            {
            // InternalMyDsl.g:141:2: (kw= 'do' this_INT_1= RULE_INT this_practice_2= rulepractice kw= 'as' this_level_4= rulelevel )
            // InternalMyDsl.g:142:3: kw= 'do' this_INT_1= RULE_INT this_practice_2= rulepractice kw= 'as' this_level_4= rulelevel
            {
            kw=(Token)match(input,11,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPerformExerciseAccess().getDoKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_5); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getPerformExerciseAccess().getINTTerminalRuleCall_1());
            		

            			newCompositeNode(grammarAccess.getPerformExerciseAccess().getPracticeParserRuleCall_2());
            		
            pushFollow(FOLLOW_6);
            this_practice_2=rulepractice();

            state._fsp--;


            			current.merge(this_practice_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,12,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPerformExerciseAccess().getAsKeyword_3());
            		

            			newCompositeNode(grammarAccess.getPerformExerciseAccess().getLevelParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            this_level_4=rulelevel();

            state._fsp--;


            			current.merge(this_level_4);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleperformExercise"


    // $ANTLR start "entryRulelevel"
    // InternalMyDsl.g:183:1: entryRulelevel returns [String current=null] : iv_rulelevel= rulelevel EOF ;
    public final String entryRulelevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelevel = null;


        try {
            // InternalMyDsl.g:183:45: (iv_rulelevel= rulelevel EOF )
            // InternalMyDsl.g:184:2: iv_rulelevel= rulelevel EOF
            {
             newCompositeNode(grammarAccess.getLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelevel=rulelevel();

            state._fsp--;

             current =iv_rulelevel.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelevel"


    // $ANTLR start "rulelevel"
    // InternalMyDsl.g:190:1: rulelevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'beginner' | kw= 'practiced' | kw= 'professional' ) ;
    public final AntlrDatatypeRuleToken rulelevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:196:2: ( (kw= 'beginner' | kw= 'practiced' | kw= 'professional' ) )
            // InternalMyDsl.g:197:2: (kw= 'beginner' | kw= 'practiced' | kw= 'professional' )
            {
            // InternalMyDsl.g:197:2: (kw= 'beginner' | kw= 'practiced' | kw= 'professional' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:198:3: kw= 'beginner'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLevelAccess().getBeginnerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:204:3: kw= 'practiced'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLevelAccess().getPracticedKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:210:3: kw= 'professional'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLevelAccess().getProfessionalKeyword_2());
                    		

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
    // $ANTLR end "rulelevel"


    // $ANTLR start "entryRulepractice"
    // InternalMyDsl.g:219:1: entryRulepractice returns [String current=null] : iv_rulepractice= rulepractice EOF ;
    public final String entryRulepractice() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepractice = null;


        try {
            // InternalMyDsl.g:219:48: (iv_rulepractice= rulepractice EOF )
            // InternalMyDsl.g:220:2: iv_rulepractice= rulepractice EOF
            {
             newCompositeNode(grammarAccess.getPracticeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepractice=rulepractice();

            state._fsp--;

             current =iv_rulepractice.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepractice"


    // $ANTLR start "rulepractice"
    // InternalMyDsl.g:226:1: rulepractice returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'push-ups' | kw= 'knee-bends' | kw= 'sit-ups' ) ;
    public final AntlrDatatypeRuleToken rulepractice() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( (kw= 'push-ups' | kw= 'knee-bends' | kw= 'sit-ups' ) )
            // InternalMyDsl.g:233:2: (kw= 'push-ups' | kw= 'knee-bends' | kw= 'sit-ups' )
            {
            // InternalMyDsl.g:233:2: (kw= 'push-ups' | kw= 'knee-bends' | kw= 'sit-ups' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
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
                    // InternalMyDsl.g:234:3: kw= 'push-ups'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPracticeAccess().getPushUpsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:240:3: kw= 'knee-bends'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPracticeAccess().getKneeBendsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:246:3: kw= 'sit-ups'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPracticeAccess().getSitUpsKeyword_2());
                    		

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
    // $ANTLR end "rulepractice"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});

}