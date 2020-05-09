// $ANTLR 3.5.1 C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g 2020-04-28 21:50:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "COLEQ", "DIGIT", "DO", 
		"ELSE", "END", "EQ", "FALSE", "FUN", "ID", "IF", "IN", "LEFTFB", "LEFTPAR", 
		"LET", "LETTER", "MULOP", "NOT", "NUM", "RELOP", "RIGHTFB", "RIGHTPAR", 
		"SEMI", "THEN", "TRUE", "VAL", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int COLEQ=5;
	public static final int DIGIT=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int END=9;
	public static final int EQ=10;
	public static final int FALSE=11;
	public static final int FUN=12;
	public static final int ID=13;
	public static final int IF=14;
	public static final int IN=15;
	public static final int LEFTFB=16;
	public static final int LEFTPAR=17;
	public static final int LET=18;
	public static final int LETTER=19;
	public static final int MULOP=20;
	public static final int NOT=21;
	public static final int NUM=22;
	public static final int RELOP=23;
	public static final int RIGHTFB=24;
	public static final int RIGHTPAR=25;
	public static final int SEMI=26;
	public static final int THEN=27;
	public static final int TRUE=28;
	public static final int VAL=29;
	public static final int WHILE=30;
	public static final int WS=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g"; }



	// $ANTLR start "input"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:32:1: input returns [Expr exp] : expr SEMI ;
	public final Expr input() throws RecognitionException {
		Expr exp = null;


		Expr expr1 =null;

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:32:28: ( expr SEMI )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:32:31: expr SEMI
			{
			pushFollow(FOLLOW_expr_in_input288);
			expr1=expr();
			state._fsp--;

			exp =expr1;
			match(input,SEMI,FOLLOW_SEMI_in_input292); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:34:1: expr returns [Expr exp] : ( IF expr1= expr THEN expr2= expr ELSE expr3= expr | LET VAL strn1= ID EQ expr4= expr IN expr5= expr END | LET FUN strn2= ID LEFTPAR strn3= ID RIGHTPAR EQ expr6= expr IN expr7= expr END | WHILE expr8= expr DO expr9= expr | LEFTFB expr10= expr ( SEMI expr11= expr )* RIGHTFB | NOT expr12= expr |strn4= ID ( COLEQ ) expr13= expr |expr14= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr exp = null;


		Token strn1=null;
		Token strn2=null;
		Token strn3=null;
		Token strn4=null;
		Expr expr1 =null;
		Expr expr2 =null;
		Expr expr3 =null;
		Expr expr4 =null;
		Expr expr5 =null;
		Expr expr6 =null;
		Expr expr7 =null;
		Expr expr8 =null;
		Expr expr9 =null;
		Expr expr10 =null;
		Expr expr11 =null;
		Expr expr12 =null;
		Expr expr13 =null;
		Expr expr14 =null;

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:34:27: ( IF expr1= expr THEN expr2= expr ELSE expr3= expr | LET VAL strn1= ID EQ expr4= expr IN expr5= expr END | LET FUN strn2= ID LEFTPAR strn3= ID RIGHTPAR EQ expr6= expr IN expr7= expr END | WHILE expr8= expr DO expr9= expr | LEFTFB expr10= expr ( SEMI expr11= expr )* RIGHTFB | NOT expr12= expr |strn4= ID ( COLEQ ) expr13= expr |expr14= relexpr )
			int alt2=8;
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
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:34:30: IF expr1= expr THEN expr2= expr ELSE expr3= expr
					{
					match(input,IF,FOLLOW_IF_in_expr311); 
					pushFollow(FOLLOW_expr_in_expr315);
					expr1=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr317); 
					pushFollow(FOLLOW_expr_in_expr321);
					expr2=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr323); 
					pushFollow(FOLLOW_expr_in_expr327);
					expr3=expr();
					state._fsp--;

					exp =new IfExp(expr1,expr2,expr3);
					}
					break;
				case 2 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:36:7: LET VAL strn1= ID EQ expr4= expr IN expr5= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr343); 
					match(input,VAL,FOLLOW_VAL_in_expr345); 
					strn1=(Token)match(input,ID,FOLLOW_ID_in_expr349); 
					match(input,EQ,FOLLOW_EQ_in_expr351); 
					pushFollow(FOLLOW_expr_in_expr355);
					expr4=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr357); 
					pushFollow(FOLLOW_expr_in_expr361);
					expr5=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr363); 
					exp =new LetValExp((strn1!=null?strn1.getText():null),expr4,expr5);
					}
					break;
				case 3 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:38:7: LET FUN strn2= ID LEFTPAR strn3= ID RIGHTPAR EQ expr6= expr IN expr7= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr379); 
					match(input,FUN,FOLLOW_FUN_in_expr381); 
					strn2=(Token)match(input,ID,FOLLOW_ID_in_expr385); 
					match(input,LEFTPAR,FOLLOW_LEFTPAR_in_expr387); 
					strn3=(Token)match(input,ID,FOLLOW_ID_in_expr391); 
					match(input,RIGHTPAR,FOLLOW_RIGHTPAR_in_expr393); 
					match(input,EQ,FOLLOW_EQ_in_expr395); 
					pushFollow(FOLLOW_expr_in_expr399);
					expr6=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr401); 
					pushFollow(FOLLOW_expr_in_expr405);
					expr7=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr407); 
					exp =new LetFunExp((strn2!=null?strn2.getText():null),(strn3!=null?strn3.getText():null),expr6,expr7);
					}
					break;
				case 4 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:40:7: WHILE expr8= expr DO expr9= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr423); 
					pushFollow(FOLLOW_expr_in_expr427);
					expr8=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr429); 
					pushFollow(FOLLOW_expr_in_expr433);
					expr9=expr();
					state._fsp--;

					exp =new WhileExp(expr8,expr9);
					}
					break;
				case 5 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:42:7: LEFTFB expr10= expr ( SEMI expr11= expr )* RIGHTFB
					{
					match(input,LEFTFB,FOLLOW_LEFTFB_in_expr449); 
					pushFollow(FOLLOW_expr_in_expr453);
					expr10=expr();
					state._fsp--;

					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:42:26: ( SEMI expr11= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:42:28: SEMI expr11= expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr457); 
							pushFollow(FOLLOW_expr_in_expr461);
							expr11=expr();
							state._fsp--;

							exp =new SeqExp(expr10,expr11);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RIGHTFB,FOLLOW_RIGHTFB_in_expr473); 
					}
					break;
				case 6 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:44:7: NOT expr12= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr481); 
					pushFollow(FOLLOW_expr_in_expr485);
					expr12=expr();
					state._fsp--;

					exp =new NotExp(expr12);
					}
					break;
				case 7 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:46:7: strn4= ID ( COLEQ ) expr13= expr
					{
					strn4=(Token)match(input,ID,FOLLOW_ID_in_expr503); 
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:46:16: ( COLEQ )
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:46:17: COLEQ
					{
					match(input,COLEQ,FOLLOW_COLEQ_in_expr506); 
					}

					pushFollow(FOLLOW_expr_in_expr511);
					expr13=expr();
					state._fsp--;

					exp =new AssnExp((strn4!=null?strn4.getText():null),expr13);
					}
					break;
				case 8 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:48:7: expr14= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr529);
					expr14=relexpr();
					state._fsp--;

					exp =expr14;
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
		return exp;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:1: relexpr returns [Expr exp] : expr15= arithexpr ( (expr16= EQ |expr16= RELOP ) expr17= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr exp = null;


		Token expr16=null;
		Expr expr15 =null;
		Expr expr17 =null;

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:30: (expr15= arithexpr ( (expr16= EQ |expr16= RELOP ) expr17= arithexpr )? )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:32: expr15= arithexpr ( (expr16= EQ |expr16= RELOP ) expr17= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr557);
			expr15=arithexpr();
			state._fsp--;

			exp =expr15;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:69: ( (expr16= EQ |expr16= RELOP ) expr17= arithexpr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EQ||LA4_0==RELOP) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:70: (expr16= EQ |expr16= RELOP ) expr17= arithexpr
					{
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:70: (expr16= EQ |expr16= RELOP )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==EQ) ) {
						alt3=1;
					}
					else if ( (LA3_0==RELOP) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:71: expr16= EQ
							{
							expr16=(Token)match(input,EQ,FOLLOW_EQ_in_relexpr565); 
							}
							break;
						case 2 :
							// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:51:81: expr16= RELOP
							{
							expr16=(Token)match(input,RELOP,FOLLOW_RELOP_in_relexpr569); 
							}
							break;

					}

					pushFollow(FOLLOW_arithexpr_in_relexpr574);
					expr17=arithexpr();
					state._fsp--;

					if ((expr16!=null?expr16.getText():null).equals("=")) exp =new BinExp(BinOp.EQ,exp,expr17);
										else if ((expr16!=null?expr16.getText():null).equals("<")) exp =new BinExp(BinOp.LT,exp,expr17);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:55:1: arithexpr returns [Expr exp] : expr18= term ( ADDOP expr19= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr exp = null;


		Token ADDOP2=null;
		Expr expr18 =null;
		Expr expr19 =null;

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:55:30: (expr18= term ( ADDOP expr19= term )* )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:55:32: expr18= term ( ADDOP expr19= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr602);
			expr18=term();
			state._fsp--;

			exp =expr18;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:55:64: ( ADDOP expr19= term )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ADDOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:55:65: ADDOP expr19= term
					{
					ADDOP2=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr607); 
					pushFollow(FOLLOW_term_in_arithexpr611);
					expr19=term();
					state._fsp--;

					if ((ADDOP2!=null?ADDOP2.getText():null).equals("+")) exp =new BinExp(BinOp.PLUS,exp,expr19);
					                              		else if((ADDOP2!=null?ADDOP2.getText():null).equals("-")) exp =new BinExp(BinOp.MINUS,exp,expr19);
					                              		else if((ADDOP2!=null?ADDOP2.getText():null).equals("|")) exp =new BinExp(BinOp.OR,exp,expr19);
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:60:1: term returns [Expr exp] : expr20= factor ( MULOP expr21= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr exp = null;


		Token MULOP3=null;
		Expr expr20 =null;
		Expr expr21 =null;

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:60:27: (expr20= factor ( MULOP expr21= factor )* )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:60:30: expr20= factor ( MULOP expr21= factor )*
			{
			pushFollow(FOLLOW_factor_in_term642);
			expr20=factor();
			state._fsp--;

			exp =expr20;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:60:64: ( MULOP expr21= factor )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MULOP) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:60:65: MULOP expr21= factor
					{
					MULOP3=(Token)match(input,MULOP,FOLLOW_MULOP_in_term647); 
					pushFollow(FOLLOW_factor_in_term651);
					expr21=factor();
					state._fsp--;

					if ((MULOP3!=null?MULOP3.getText():null).equals("*")) exp =new BinExp(BinOp.TIMES,exp,expr21);
					                              		else if((MULOP3!=null?MULOP3.getText():null).equals("/")) exp =new BinExp(BinOp.DIV,exp,expr21);
					                              		else if((MULOP3!=null?MULOP3.getText():null).equals("&")) exp =new BinExp(BinOp.AND,exp,expr21);
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:65:1: factor returns [Expr exp] : ( NUM | TRUE | FALSE |strn5= ID |strn6= ID LEFTPAR expr22= expr RIGHTPAR | LEFTPAR expr23= expr RIGHTPAR );
	public final Expr factor() throws RecognitionException {
		Expr exp = null;


		Token strn5=null;
		Token strn6=null;
		Token NUM4=null;
		Expr expr22 =null;
		Expr expr23 =null;

		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:65:29: ( NUM | TRUE | FALSE |strn5= ID |strn6= ID LEFTPAR expr22= expr RIGHTPAR | LEFTPAR expr23= expr RIGHTPAR )
			int alt7=6;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt7=1;
				}
				break;
			case TRUE:
				{
				alt7=2;
				}
				break;
			case FALSE:
				{
				alt7=3;
				}
				break;
			case ID:
				{
				int LA7_4 = input.LA(2);
				if ( (LA7_4==LEFTPAR) ) {
					alt7=5;
				}
				else if ( (LA7_4==ADDOP||(LA7_4 >= DO && LA7_4 <= EQ)||LA7_4==IN||LA7_4==MULOP||(LA7_4 >= RELOP && LA7_4 <= THEN)) ) {
					alt7=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFTPAR:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:65:32: NUM
					{
					NUM4=(Token)match(input,NUM,FOLLOW_NUM_in_factor680); 
					exp =new IntConst(Integer.parseInt((NUM4!=null?NUM4.getText():null)));
					}
					break;
				case 2 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:66:7: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor690); 
					exp = new BoolConst(Boolean.parseBoolean("true"));
					}
					break;
				case 3 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:67:7: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor700); 
					exp = new BoolConst(Boolean.parseBoolean("false"));
					}
					break;
				case 4 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:68:7: strn5= ID
					{
					strn5=(Token)match(input,ID,FOLLOW_ID_in_factor712); 
					exp =new VarExp((strn5!=null?strn5.getText():null));
					}
					break;
				case 5 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:69:7: strn6= ID LEFTPAR expr22= expr RIGHTPAR
					{
					strn6=(Token)match(input,ID,FOLLOW_ID_in_factor725); 
					match(input,LEFTPAR,FOLLOW_LEFTPAR_in_factor727); 
					pushFollow(FOLLOW_expr_in_factor731);
					expr22=expr();
					state._fsp--;

					match(input,RIGHTPAR,FOLLOW_RIGHTPAR_in_factor733); 
					exp =new AppExp((strn6!=null?strn6.getText():null),expr22);
					}
					break;
				case 6 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:70:7: LEFTPAR expr23= expr RIGHTPAR
					{
					match(input,LEFTPAR,FOLLOW_LEFTPAR_in_factor743); 
					pushFollow(FOLLOW_expr_in_factor747);
					expr23=expr();
					state._fsp--;

					exp =expr23;
					match(input,RIGHTPAR,FOLLOW_RIGHTPAR_in_factor751); 
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
		return exp;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input288 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SEMI_in_input292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr311 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr315 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr317 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr321 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ELSE_in_expr323 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr343 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr345 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr349 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_expr351 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr355 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr357 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr361 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr379 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_FUN_in_expr381 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr385 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LEFTPAR_in_expr387 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr391 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTPAR_in_expr393 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_expr395 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr399 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr401 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr405 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr423 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr427 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_expr429 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTFB_in_expr449 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr453 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_SEMI_in_expr457 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr461 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_RIGHTFB_in_expr473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr481 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr503 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLEQ_in_expr506 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_expr511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr557 = new BitSet(new long[]{0x0000000000800402L});
	public static final BitSet FOLLOW_EQ_in_relexpr565 = new BitSet(new long[]{0x0000000010422800L});
	public static final BitSet FOLLOW_RELOP_in_relexpr569 = new BitSet(new long[]{0x0000000010422800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr602 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr607 = new BitSet(new long[]{0x0000000010422800L});
	public static final BitSet FOLLOW_term_in_arithexpr611 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term642 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_MULOP_in_term647 = new BitSet(new long[]{0x0000000010422800L});
	public static final BitSet FOLLOW_factor_in_term651 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_NUM_in_factor680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor725 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LEFTPAR_in_factor727 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_factor731 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTPAR_in_factor733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTPAR_in_factor743 = new BitSet(new long[]{0x0000000050676800L});
	public static final BitSet FOLLOW_expr_in_factor747 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTPAR_in_factor751 = new BitSet(new long[]{0x0000000000000002L});
}
