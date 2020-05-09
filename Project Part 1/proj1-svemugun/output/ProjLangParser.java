// $ANTLR 3.5.1 C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g 2020-03-31 14:16:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class ProjLangParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "COLEQ", "COLON", "DIGIT", 
		"DO", "ELSE", "END", "EQ", "FALSE", "FUN", "ID", "IF", "IN", "LEFTFB", 
		"LEFTPAR", "LET", "LETTER", "MULOP", "NOT", "NUM", "READ", "RELOP", "RIGHTFB", 
		"RIGHTPAR", "SEMI", "THEN", "TRUE", "VAL", "WHILE", "WRITE", "WS"
	};
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int COLEQ=5;
	public static final int COLON=6;
	public static final int DIGIT=7;
	public static final int DO=8;
	public static final int ELSE=9;
	public static final int END=10;
	public static final int EQ=11;
	public static final int FALSE=12;
	public static final int FUN=13;
	public static final int ID=14;
	public static final int IF=15;
	public static final int IN=16;
	public static final int LEFTFB=17;
	public static final int LEFTPAR=18;
	public static final int LET=19;
	public static final int LETTER=20;
	public static final int MULOP=21;
	public static final int NOT=22;
	public static final int NUM=23;
	public static final int READ=24;
	public static final int RELOP=25;
	public static final int RIGHTFB=26;
	public static final int RIGHTPAR=27;
	public static final int SEMI=28;
	public static final int THEN=29;
	public static final int TRUE=30;
	public static final int VAL=31;
	public static final int WHILE=32;
	public static final int WRITE=33;
	public static final int WS=34;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "relexpr", "expr", "factor", "term", "arithexpr", "input"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ProjLangParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public ProjLangParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g"; }



	// $ANTLR start "input"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:41:1: input : expr SEMI ;
	public final void input() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:41:7: ( expr SEMI )
			dbg.enterAlt(1);

			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:41:9: expr SEMI
			{
			dbg.location(41,9);
			pushFollow(FOLLOW_expr_in_input287);
			expr();
			state._fsp--;
			dbg.location(41,14);
			match(input,SEMI,FOLLOW_SEMI_in_input289); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:43:1: expr : ( IF expr THEN expr ELSE expr | LET VAL ID EQ expr IN expr END | LET FUN ID LEFTPAR ID RIGHTPAR EQ expr IN expr END | WHILE expr DO expr | LEFTFB expr ( SEMI expr )* RIGHTFB | NOT expr | ID ( COLEQ ) expr | relexpr );
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:43:6: ( IF expr THEN expr ELSE expr | LET VAL ID EQ expr IN expr END | LET FUN ID LEFTPAR ID RIGHTPAR EQ expr IN expr END | WHILE expr DO expr | LEFTFB expr ( SEMI expr )* RIGHTFB | NOT expr | ID ( COLEQ ) expr | relexpr )
			int alt2=8;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUN) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LEFTFB:
				{
				alt2=5;
				}
				break;
			case NOT:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ADDOP||(LA2_6 >= DO && LA2_6 <= EQ)||LA2_6==IN||LA2_6==LEFTPAR||LA2_6==MULOP||(LA2_6 >= RELOP && LA2_6 <= THEN)) ) {
					alt2=8;
				}
				else if ( (LA2_6==COLEQ) ) {
					alt2=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LEFTPAR:
			case NUM:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:43:8: IF expr THEN expr ELSE expr
					{
					dbg.location(43,8);
					match(input,IF,FOLLOW_IF_in_expr298); dbg.location(43,11);
					pushFollow(FOLLOW_expr_in_expr300);
					expr();
					state._fsp--;
					dbg.location(43,16);
					match(input,THEN,FOLLOW_THEN_in_expr302); dbg.location(43,21);
					pushFollow(FOLLOW_expr_in_expr304);
					expr();
					state._fsp--;
					dbg.location(43,26);
					match(input,ELSE,FOLLOW_ELSE_in_expr306); dbg.location(43,31);
					pushFollow(FOLLOW_expr_in_expr308);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:44:4: LET VAL ID EQ expr IN expr END
					{
					dbg.location(44,4);
					match(input,LET,FOLLOW_LET_in_expr313); dbg.location(44,8);
					match(input,VAL,FOLLOW_VAL_in_expr315); dbg.location(44,12);
					match(input,ID,FOLLOW_ID_in_expr317); dbg.location(44,15);
					match(input,EQ,FOLLOW_EQ_in_expr319); dbg.location(44,18);
					pushFollow(FOLLOW_expr_in_expr321);
					expr();
					state._fsp--;
					dbg.location(44,23);
					match(input,IN,FOLLOW_IN_in_expr323); dbg.location(44,26);
					pushFollow(FOLLOW_expr_in_expr325);
					expr();
					state._fsp--;
					dbg.location(44,31);
					match(input,END,FOLLOW_END_in_expr327); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:45:4: LET FUN ID LEFTPAR ID RIGHTPAR EQ expr IN expr END
					{
					dbg.location(45,4);
					match(input,LET,FOLLOW_LET_in_expr332); dbg.location(45,8);
					match(input,FUN,FOLLOW_FUN_in_expr334); dbg.location(45,12);
					match(input,ID,FOLLOW_ID_in_expr336); dbg.location(45,15);
					match(input,LEFTPAR,FOLLOW_LEFTPAR_in_expr338); dbg.location(45,23);
					match(input,ID,FOLLOW_ID_in_expr340); dbg.location(45,26);
					match(input,RIGHTPAR,FOLLOW_RIGHTPAR_in_expr342); dbg.location(45,35);
					match(input,EQ,FOLLOW_EQ_in_expr344); dbg.location(45,38);
					pushFollow(FOLLOW_expr_in_expr346);
					expr();
					state._fsp--;
					dbg.location(45,43);
					match(input,IN,FOLLOW_IN_in_expr348); dbg.location(45,46);
					pushFollow(FOLLOW_expr_in_expr350);
					expr();
					state._fsp--;
					dbg.location(45,51);
					match(input,END,FOLLOW_END_in_expr352); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:46:4: WHILE expr DO expr
					{
					dbg.location(46,4);
					match(input,WHILE,FOLLOW_WHILE_in_expr357); dbg.location(46,10);
					pushFollow(FOLLOW_expr_in_expr359);
					expr();
					state._fsp--;
					dbg.location(46,15);
					match(input,DO,FOLLOW_DO_in_expr361); dbg.location(46,18);
					pushFollow(FOLLOW_expr_in_expr363);
					expr();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:47:4: LEFTFB expr ( SEMI expr )* RIGHTFB
					{
					dbg.location(47,4);
					match(input,LEFTFB,FOLLOW_LEFTFB_in_expr368); dbg.location(47,11);
					pushFollow(FOLLOW_expr_in_expr370);
					expr();
					state._fsp--;
					dbg.location(47,16);
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:47:16: ( SEMI expr )*
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:47:18: SEMI expr
							{
							dbg.location(47,18);
							match(input,SEMI,FOLLOW_SEMI_in_expr374); dbg.location(47,23);
							pushFollow(FOLLOW_expr_in_expr376);
							expr();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}
					} finally {dbg.exitSubRule(1);}
					dbg.location(47,31);
					match(input,RIGHTFB,FOLLOW_RIGHTFB_in_expr381); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:48:4: NOT expr
					{
					dbg.location(48,4);
					match(input,NOT,FOLLOW_NOT_in_expr386); dbg.location(48,8);
					pushFollow(FOLLOW_expr_in_expr388);
					expr();
					state._fsp--;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:49:4: ID ( COLEQ ) expr
					{
					dbg.location(49,4);
					match(input,ID,FOLLOW_ID_in_expr393); dbg.location(49,7);
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:49:7: ( COLEQ )
					dbg.enterAlt(1);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:49:8: COLEQ
					{
					dbg.location(49,8);
					match(input,COLEQ,FOLLOW_COLEQ_in_expr396); 
					}
					dbg.location(49,15);
					pushFollow(FOLLOW_expr_in_expr399);
					expr();
					state._fsp--;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:50:4: relexpr
					{
					dbg.location(50,4);
					pushFollow(FOLLOW_relexpr_in_expr404);
					relexpr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:52:1: relexpr : arithexpr ( ( EQ | RELOP ) arithexpr )? ;
	public final void relexpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "relexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:52:9: ( arithexpr ( ( EQ | RELOP ) arithexpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:52:11: arithexpr ( ( EQ | RELOP ) arithexpr )?
			{
			dbg.location(52,11);
			pushFollow(FOLLOW_arithexpr_in_relexpr413);
			arithexpr();
			state._fsp--;
			dbg.location(52,21);
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:52:21: ( ( EQ | RELOP ) arithexpr )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==EQ||LA3_0==RELOP) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:52:22: ( EQ | RELOP ) arithexpr
					{
					dbg.location(52,22);
					if ( input.LA(1)==EQ||input.LA(1)==RELOP ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(52,35);
					pushFollow(FOLLOW_arithexpr_in_relexpr424);
					arithexpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(53, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:54:1: arithexpr : term ( ADDOP term )* ;
	public final void arithexpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arithexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:55:2: ( term ( ADDOP term )* )
			dbg.enterAlt(1);

			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:55:4: term ( ADDOP term )*
			{
			dbg.location(55,4);
			pushFollow(FOLLOW_term_in_arithexpr437);
			term();
			state._fsp--;
			dbg.location(55,9);
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:55:9: ( ADDOP term )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:55:10: ADDOP term
					{
					dbg.location(55,10);
					match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr440); dbg.location(55,16);
					pushFollow(FOLLOW_term_in_arithexpr442);
					term();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arithexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:57:1: term : factor ( MULOP factor )* ;
	public final void term() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:57:6: ( factor ( MULOP factor )* )
			dbg.enterAlt(1);

			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:57:9: factor ( MULOP factor )*
			{
			dbg.location(57,9);
			pushFollow(FOLLOW_factor_in_term454);
			factor();
			state._fsp--;
			dbg.location(57,16);
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:57:16: ( MULOP factor )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:57:17: MULOP factor
					{
					dbg.location(57,17);
					match(input,MULOP,FOLLOW_MULOP_in_term457); dbg.location(57,23);
					pushFollow(FOLLOW_factor_in_term459);
					factor();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:59:1: factor : ( NUM | TRUE | FALSE | ID | ID LEFTPAR expr RIGHTPAR | LEFTPAR expr RIGHTPAR );
	public final void factor() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:59:8: ( NUM | TRUE | FALSE | ID | ID LEFTPAR expr RIGHTPAR | LEFTPAR expr RIGHTPAR )
			int alt6=6;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case NUM:
				{
				alt6=1;
				}
				break;
			case TRUE:
				{
				alt6=2;
				}
				break;
			case FALSE:
				{
				alt6=3;
				}
				break;
			case ID:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==LEFTPAR) ) {
					alt6=5;
				}
				else if ( (LA6_4==ADDOP||(LA6_4 >= DO && LA6_4 <= EQ)||LA6_4==IN||LA6_4==MULOP||(LA6_4 >= RELOP && LA6_4 <= THEN)) ) {
					alt6=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFTPAR:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:59:11: NUM
					{
					dbg.location(59,11);
					match(input,NUM,FOLLOW_NUM_in_factor471); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:60:4: TRUE
					{
					dbg.location(60,4);
					match(input,TRUE,FOLLOW_TRUE_in_factor476); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:61:4: FALSE
					{
					dbg.location(61,4);
					match(input,FALSE,FOLLOW_FALSE_in_factor481); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:62:4: ID
					{
					dbg.location(62,4);
					match(input,ID,FOLLOW_ID_in_factor486); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:63:4: ID LEFTPAR expr RIGHTPAR
					{
					dbg.location(63,4);
					match(input,ID,FOLLOW_ID_in_factor491); dbg.location(63,7);
					match(input,LEFTPAR,FOLLOW_LEFTPAR_in_factor493); dbg.location(63,15);
					pushFollow(FOLLOW_expr_in_factor495);
					expr();
					state._fsp--;
					dbg.location(63,20);
					match(input,RIGHTPAR,FOLLOW_RIGHTPAR_in_factor497); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:64:4: LEFTPAR expr RIGHTPAR
					{
					dbg.location(64,4);
					match(input,LEFTPAR,FOLLOW_LEFTPAR_in_factor502); dbg.location(64,12);
					pushFollow(FOLLOW_expr_in_factor504);
					expr();
					state._fsp--;
					dbg.location(64,17);
					match(input,RIGHTPAR,FOLLOW_RIGHTPAR_in_factor506); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input287 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_input289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr298 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr300 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_THEN_in_expr302 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr306 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr313 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VAL_in_expr315 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr317 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_expr319 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr321 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr323 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr325 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr332 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FUN_in_expr334 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr336 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LEFTPAR_in_expr338 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr340 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RIGHTPAR_in_expr342 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQ_in_expr344 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr346 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr348 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr350 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr357 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr359 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr361 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTFB_in_expr368 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x0000000014000000L});
	public static final BitSet FOLLOW_SEMI_in_expr374 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr376 = new BitSet(new long[]{0x0000000014000000L});
	public static final BitSet FOLLOW_RIGHTFB_in_expr381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr386 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr393 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLEQ_in_expr396 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_expr399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr413 = new BitSet(new long[]{0x0000000002000802L});
	public static final BitSet FOLLOW_set_in_relexpr416 = new BitSet(new long[]{0x0000000040845000L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr437 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr440 = new BitSet(new long[]{0x0000000040845000L});
	public static final BitSet FOLLOW_term_in_arithexpr442 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term454 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MULOP_in_term457 = new BitSet(new long[]{0x0000000040845000L});
	public static final BitSet FOLLOW_factor_in_term459 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUM_in_factor471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor491 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LEFTPAR_in_factor493 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_factor495 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RIGHTPAR_in_factor497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTPAR_in_factor502 = new BitSet(new long[]{0x0000000140CED000L});
	public static final BitSet FOLLOW_expr_in_factor504 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RIGHTPAR_in_factor506 = new BitSet(new long[]{0x0000000000000002L});
}
