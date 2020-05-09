import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ProjLangLexer lex = new ProjLangLexer(new ANTLRFileStream("C:\\Users\\Sriharsha\\Documents\\PL\\proj1-svemugun\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ProjLangParser g = new ProjLangParser(tokens, 49100, null);
        try {
            g.input();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}