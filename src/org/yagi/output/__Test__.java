import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import de.fhac.ti.antlr.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        YAGILexer lex = new YAGILexer(new ANTLRFileStream("/home/thens/yagi/yagi-modified/src/org/yagi/output/__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        YAGIParser g = new YAGIParser(tokens, 49100, null);
        try {
            g.line();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}