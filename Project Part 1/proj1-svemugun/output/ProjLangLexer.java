// $ANTLR 3.5.1 C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g 2020-03-31 14:16:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:4:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:7:2: ( '0' .. '9' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:
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

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:9:6: ( 'read' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:9:8: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:10:7: ( 'write' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:10:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:11:4: ( 'if' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:11:6: 'if'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:12:6: ( 'then' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:12:8: 'then'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:13:6: ( 'else' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:13:8: 'else'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:14:5: ( 'let' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:14:7: 'let'
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

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:15:4: ( 'in' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:15:6: 'in'
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

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:16:5: ( 'val' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:16:7: 'val'
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

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:17:5: ( 'end' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:17:7: 'end'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:18:5: ( 'fun' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:18:7: 'fun'
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

	// $ANTLR start "LEFTFB"
	public final void mLEFTFB() throws RecognitionException {
		try {
			int _type = LEFTFB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:19:8: ( '{' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:19:10: '{'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:20:9: ( '}' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:20:11: '}'
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

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:21:7: ( ':' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:21:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:22:7: ( 'while' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:22:9: 'while'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:23:4: ( 'do' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:23:6: 'do'
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

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:24:6: ( ';' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:24:8: ';'
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

	// $ANTLR start "COLEQ"
	public final void mCOLEQ() throws RecognitionException {
		try {
			int _type = COLEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:25:7: ( ':=' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:25:9: ':='
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:26:5: ( '!' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:26:7: '!'
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

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:27:7: ( ( '+' | '-' | '|' ) )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:
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

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:28:7: ( ( '*' | '/' | '&' ) )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:
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

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:29:6: ( 'true' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:29:8: 'true'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:30:7: ( 'false' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:30:9: 'false'
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:31:5: ( ( DIGIT )* )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:31:7: ( DIGIT )*
			{
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:31:7: ( DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:
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
					break loop1;
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
	// $ANTLR end "NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:32:4: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:32:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:32:12: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:
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

	// $ANTLR start "LEFTPAR"
	public final void mLEFTPAR() throws RecognitionException {
		try {
			int _type = LEFTPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:33:9: ( '(' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:33:11: '('
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
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:34:9: ( ')' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:34:11: ')'
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

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:35:4: ( '=' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:35:6: '='
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

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:36:7: ( ( '<' ) )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:36:10: ( '<' )
			{
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:36:10: ( '<' )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:36:11: '<'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:38:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:38:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:38:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
					// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:
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
		// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:8: ( READ | WRITE | IF | THEN | ELSE | LET | IN | VAL | END | FUN | LEFTFB | RIGHTFB | COLON | WHILE | DO | SEMI | COLEQ | NOT | ADDOP | MULOP | TRUE | FALSE | NUM | ID | LEFTPAR | RIGHTPAR | EQ | RELOP | WS )
		int alt4=29;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:10: READ
				{
				mREAD(); 

				}
				break;
			case 2 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:15: WRITE
				{
				mWRITE(); 

				}
				break;
			case 3 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:21: IF
				{
				mIF(); 

				}
				break;
			case 4 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:24: THEN
				{
				mTHEN(); 

				}
				break;
			case 5 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:29: ELSE
				{
				mELSE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:34: LET
				{
				mLET(); 

				}
				break;
			case 7 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:38: IN
				{
				mIN(); 

				}
				break;
			case 8 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:41: VAL
				{
				mVAL(); 

				}
				break;
			case 9 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:45: END
				{
				mEND(); 

				}
				break;
			case 10 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:49: FUN
				{
				mFUN(); 

				}
				break;
			case 11 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:53: LEFTFB
				{
				mLEFTFB(); 

				}
				break;
			case 12 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:60: RIGHTFB
				{
				mRIGHTFB(); 

				}
				break;
			case 13 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:68: COLON
				{
				mCOLON(); 

				}
				break;
			case 14 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:74: WHILE
				{
				mWHILE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:80: DO
				{
				mDO(); 

				}
				break;
			case 16 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:83: SEMI
				{
				mSEMI(); 

				}
				break;
			case 17 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:88: COLEQ
				{
				mCOLEQ(); 

				}
				break;
			case 18 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:94: NOT
				{
				mNOT(); 

				}
				break;
			case 19 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:98: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 20 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:104: MULOP
				{
				mMULOP(); 

				}
				break;
			case 21 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:110: TRUE
				{
				mTRUE(); 

				}
				break;
			case 22 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:115: FALSE
				{
				mFALSE(); 

				}
				break;
			case 23 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:121: NUM
				{
				mNUM(); 

				}
				break;
			case 24 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:125: ID
				{
				mID(); 

				}
				break;
			case 25 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:128: LEFTPAR
				{
				mLEFTPAR(); 

				}
				break;
			case 26 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:136: RIGHTPAR
				{
				mRIGHTPAR(); 

				}
				break;
			case 27 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:145: EQ
				{
				mEQ(); 

				}
				break;
			case 28 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:148: RELOP
				{
				mRELOP(); 

				}
				break;
			case 29 :
				// C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\ProjLang.g:1:154: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\21\10\22\2\uffff\1\46\1\22\13\uffff\3\22\1\53\1\54\10\22\2\uffff\1"+
		"\65\3\22\2\uffff\3\22\1\74\1\75\1\76\1\77\1\22\1\uffff\1\101\2\22\1\104"+
		"\1\105\1\106\4\uffff\1\22\1\uffff\1\110\1\111\3\uffff\1\112\3\uffff";
	static final String DFA4_eofS =
		"\113\uffff";
	static final String DFA4_minS =
		"\1\11\1\145\1\150\1\146\1\150\1\154\1\145\2\141\2\uffff\1\75\1\157\13"+
		"\uffff\1\141\2\151\2\60\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154"+
		"\2\uffff\1\60\1\144\1\164\1\154\2\uffff\1\156\2\145\4\60\1\163\1\uffff"+
		"\1\60\2\145\3\60\4\uffff\1\145\1\uffff\2\60\3\uffff\1\60\3\uffff";
	static final String DFA4_maxS =
		"\1\175\1\145\1\162\1\156\1\162\1\156\1\145\1\141\1\165\2\uffff\1\75\1"+
		"\157\13\uffff\1\141\2\151\2\172\1\145\1\165\1\163\1\144\1\164\1\154\1"+
		"\156\1\154\2\uffff\1\172\1\144\1\164\1\154\2\uffff\1\156\2\145\4\172\1"+
		"\163\1\uffff\1\172\2\145\3\172\4\uffff\1\145\1\uffff\2\172\3\uffff\1\172"+
		"\3\uffff";
	static final String DFA4_acceptS =
		"\11\uffff\1\13\1\14\2\uffff\1\20\1\22\1\23\1\24\1\27\1\30\1\31\1\32\1"+
		"\33\1\34\1\35\15\uffff\1\21\1\15\4\uffff\1\3\1\7\10\uffff\1\17\6\uffff"+
		"\1\11\1\6\1\10\1\12\1\uffff\1\1\2\uffff\1\4\1\25\1\5\1\uffff\1\2\1\16"+
		"\1\26";
	static final String DFA4_specialS =
		"\113\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\27\2\uffff\1\27\22\uffff\1\27\1\16\4\uffff\1\20\1\uffff\1\23\1\24"+
			"\1\20\1\17\1\uffff\1\17\1\uffff\1\20\12\uffff\1\13\1\15\1\26\1\25\3\uffff"+
			"\32\22\6\uffff\3\22\1\14\1\5\1\10\2\22\1\3\2\22\1\6\5\22\1\1\1\22\1\4"+
			"\1\22\1\7\1\2\3\22\1\11\1\17\1\12",
			"\1\30",
			"\1\32\11\uffff\1\31",
			"\1\33\7\uffff\1\34",
			"\1\35\11\uffff\1\36",
			"\1\37\1\uffff\1\40",
			"\1\41",
			"\1\42",
			"\1\44\23\uffff\1\43",
			"",
			"",
			"\1\45",
			"\1\47",
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
			"\1\50",
			"\1\51",
			"\1\52",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\1\66",
			"\1\67",
			"\1\70",
			"",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\1\100",
			"",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\1\102",
			"\1\103",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"",
			"",
			"",
			"",
			"\1\107",
			"",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"",
			"",
			"",
			"\12\22\7\uffff\32\22\6\uffff\32\22",
			"",
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
			return "1:1: Tokens : ( READ | WRITE | IF | THEN | ELSE | LET | IN | VAL | END | FUN | LEFTFB | RIGHTFB | COLON | WHILE | DO | SEMI | COLEQ | NOT | ADDOP | MULOP | TRUE | FALSE | NUM | ID | LEFTPAR | RIGHTPAR | EQ | RELOP | WS );";
		}
	}

}
