package de.fhac.ti;

import org.antlr.runtime.*;
import de.fhac.ti.antlr.YAGI_NewLexer;
import de.fhac.ti.antlr.YAGI_NewParser;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YAGICommandLine {

	private final static Logger LOGGER = Logger.getLogger(YAGICommandLine.class.getName());
	
	public static void main(String[] args) throws Exception, IOException,
			RecognitionException {

		LOGGER.setLevel(Level.FINER);
		
		// Initializing HashMaps for fluents and actions
		Map<String, Integer> fluents = new HashMap<String,Integer>();
		Map<String, Integer> actions = new HashMap<String,Integer>();
		
	    //InputStream input  = YAGICommandLine.class.getClassLoader().getResourceAsStream("sample_input.y");

	    // YAGI Interpreter loop
		Boolean multipleLines = false;
		String multipleLinesInput = "";
	    //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(new FileInputStream(new File
                ("/home/thens/yagi/yagi-vm/src/de/fhac/ti/sample_input.y")));
        while (true) {
			if (!multipleLines){
				System.out.print("YAGI>> ");
			}
			String line = scanner.nextLine().trim();
			if ("quit".equals(line) || "exit".equals(line)){
				break;
			}
			if (line.length()==0)
				continue;
			
			if (line.charAt(line.length()-1) == '\\'){
				multipleLines = true;
				line = line.substring(0, line.length()-1);
				multipleLinesInput += line;
				continue;
			} else {
				multipleLines = false;
				line = multipleLinesInput + line;
				multipleLinesInput = "";				
			}
			LOGGER.log(Level.FINER, "Input scanned to be passed to the YAGI interpreter: " + line);
			CharStream stream = new ANTLRStringStream(line);
            YAGI_NewLexer lexer = new YAGI_NewLexer(stream);
			TokenStream tokenStream = new CommonTokenStream(lexer);

            YAGI_NewParser parser = new YAGI_NewParser(fluents, actions, tokenStream, LOGGER);
            parser.line();


            /*
		    YAGIParser.line_return l = parser.line();
		    String output = l.ret;
		    if ((output != null) && (output.charAt(0)=='[')){
		    	output = output.substring(1,l.ret.length()-1);
		    	List<String> signals = Arrays.asList(output.split("\\s*,\\s*"));
		    	for (int i=0; i<signals.size(); i++)
		    		System.out.println(signals.get(i));
		    }
		    else{
				System.out.println(output);
            }
            */
		}
		scanner.close();
	}
}