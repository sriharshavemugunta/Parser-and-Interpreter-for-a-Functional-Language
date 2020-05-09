import java.io.*;
import org.antlr.runtime.*;

public class ScanMain {
    public static void main(String args[]) throws Exception {
        //ExprLexer lex = new ExprLexer(new ANTLRFileStream(args[0]));
	ProjLangLexer lex = new ProjLangLexer(new ANTLRInputStream(System.in));
	Token tok = lex.nextToken();
	while (tok.getType() != Token.EOF) {
	    System.out.println("Lexeme = " + tok.getText() + " Token = " + tok.getType());
	    tok = lex.nextToken();
	}
    }
}
