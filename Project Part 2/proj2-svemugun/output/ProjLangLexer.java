// $ANTLR 3.5.1 C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g 2020-04-28 21:50:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:3:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:4:16: ( '0' .. '9' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:5:5: ( 'if' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:5:7: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:6:7: ( 'then' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:6:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:7:7: ( 'else' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:7:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:8:6: ( 'let' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:8:8: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:9:6: ( 'val' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:9:8: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:10:5: ( 'in' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:10:7: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:11:6: ( 'end' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:11:8: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:12:6: ( 'fun' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:12:8: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:13:8: ( 'while' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:13:10: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:14:5: ( 'do' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:14:7: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:15:7: ( 'true' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:15:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:16:8: ( 'false' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:16:10: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:17:6: ( ( DIGIT )+ )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:17:8: ( DIGIT )+
			{
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:17:8: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:18:5: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:18:7: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:18:13: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:19:8: ( ( '*' | '/' | '&' ) )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULOP"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:20:8: ( ( '+' | '-' | '|' ) )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:21:8: ( ( '<' ) )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:21:11: ( '<' )
			{
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:21:11: ( '<' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:21:12: '<'
			{
			match('<'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELOP"

	// $ANTLR start "LEFTFB"
	public final void mLEFTFB() throws RecognitionException {
		try {
			int _type = LEFTFB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:22:9: ( '{' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:22:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFTFB"

	// $ANTLR start "RIGHTFB"
	public final void mRIGHTFB() throws RecognitionException {
		try {
			int _type = RIGHTFB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:23:10: ( '}' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:23:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHTFB"

	// $ANTLR start "LEFTPAR"
	public final void mLEFTPAR() throws RecognitionException {
		try {
			int _type = LEFTPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:24:10: ( '(' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:24:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFTPAR"

	// $ANTLR start "RIGHTPAR"
	public final void mRIGHTPAR() throws RecognitionException {
		try {
			int _type = RIGHTPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:25:10: ( ')' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:25:12: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHTPAR"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:26:7: ( ';' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:26:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:27:5: ( '=' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:27:7: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "COLEQ"
	public final void mCOLEQ() throws RecognitionException {
		try {
			int _type = COLEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:28:8: ( ':=' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:28:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLEQ"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:29:6: ( '!' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:29:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:30:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:30:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:30:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:8: ( IF | THEN | ELSE | LET | VAL | IN | END | FUN | WHILE | DO | TRUE | FALSE | NUM | ID | MULOP | ADDOP | RELOP | LEFTFB | RIGHTFB | LEFTPAR | RIGHTPAR | SEMI | EQ | COLEQ | NOT | WS )
		int alt4=26;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:13: THEN
				{
				mTHEN(); 

				}
				break;
			case 3 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:18: ELSE
				{
				mELSE(); 

				}
				break;
			case 4 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:23: LET
				{
				mLET(); 

				}
				break;
			case 5 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:27: VAL
				{
				mVAL(); 

				}
				break;
			case 6 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:31: IN
				{
				mIN(); 

				}
				break;
			case 7 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:34: END
				{
				mEND(); 

				}
				break;
			case 8 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:38: FUN
				{
				mFUN(); 

				}
				break;
			case 9 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:42: WHILE
				{
				mWHILE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:48: DO
				{
				mDO(); 

				}
				break;
			case 11 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:51: TRUE
				{
				mTRUE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:56: FALSE
				{
				mFALSE(); 

				}
				break;
			case 13 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:62: NUM
				{
				mNUM(); 

				}
				break;
			case 14 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:66: ID
				{
				mID(); 

				}
				break;
			case 15 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:69: MULOP
				{
				mMULOP(); 

				}
				break;
			case 16 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:75: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 17 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:81: RELOP
				{
				mRELOP(); 

				}
				break;
			case 18 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:87: LEFTFB
				{
				mLEFTFB(); 

				}
				break;
			case 19 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:94: RIGHTFB
				{
				mRIGHTFB(); 

				}
				break;
			case 20 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:102: LEFTPAR
				{
				mLEFTPAR(); 

				}
				break;
			case 21 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:110: RIGHTPAR
				{
				mRIGHTPAR(); 

				}
				break;
			case 22 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:119: SEMI
				{
				mSEMI(); 

				}
				break;
			case 23 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:124: EQ
				{
				mEQ(); 

				}
				break;
			case 24 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:127: COLEQ
				{
				mCOLEQ(); 

				}
				break;
			case 25 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:133: NOT
				{
				mNOT(); 

				}
				break;
			case 26 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj2-svemugun\\ProjLang.g:1:137: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\10\12\16\uffff\1\43\1\44\11\12\1\56\2\uffff\3\12\1\62\1\63\1"+
		"\64\1\65\2\12\1\uffff\1\70\1\71\1\72\4\uffff\2\12\3\uffff\1\75\1\76\2"+
		"\uffff";
	static final String DFA4_eofS =
		"\77\uffff";
	static final String DFA4_minS =
		"\1\11\1\146\1\150\1\154\1\145\2\141\1\150\1\157\16\uffff\2\60\1\145\1"+
		"\165\1\163\1\144\1\164\1\154\1\156\1\154\1\151\1\60\2\uffff\1\156\2\145"+
		"\4\60\1\163\1\154\1\uffff\3\60\4\uffff\2\145\3\uffff\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\156\1\162\1\156\1\145\1\141\1\165\1\150\1\157\16\uffff\2\172"+
		"\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\1\151\1\172\2\uffff\1"+
		"\156\2\145\4\172\1\163\1\154\1\uffff\3\172\4\uffff\2\145\3\uffff\2\172"+
		"\2\uffff";
	static final String DFA4_acceptS =
		"\11\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
		"\1\31\1\32\14\uffff\1\1\1\6\11\uffff\1\12\3\uffff\1\7\1\4\1\5\1\10\2\uffff"+
		"\1\2\1\13\1\3\2\uffff\1\14\1\11";
	static final String DFA4_specialS =
		"\77\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\25\4\uffff\1\13\1\uffff\1\20\1\21"+
			"\1\13\1\14\1\uffff\1\14\1\uffff\1\13\12\11\1\24\1\22\1\15\1\23\3\uffff"+
			"\32\12\6\uffff\3\12\1\10\1\3\1\6\2\12\1\1\2\12\1\4\7\12\1\2\1\12\1\5"+
			"\1\7\3\12\1\16\1\14\1\17",
			"\1\27\7\uffff\1\30",
			"\1\31\11\uffff\1\32",
			"\1\33\1\uffff\1\34",
			"\1\35",
			"\1\36",
			"\1\40\23\uffff\1\37",
			"\1\41",
			"\1\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\1\66",
			"\1\67",
			"",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"",
			"",
			"",
			"",
			"\1\73",
			"\1\74",
			"",
			"",
			"",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"\12\12\7\uffff\32\12\6\uffff\32\12",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( IF | THEN | ELSE | LET | VAL | IN | END | FUN | WHILE | DO | TRUE | FALSE | NUM | ID | MULOP | ADDOP | RELOP | LEFTFB | RIGHTFB | LEFTPAR | RIGHTPAR | SEMI | EQ | COLEQ | NOT | WS );";
		}
	}

}
