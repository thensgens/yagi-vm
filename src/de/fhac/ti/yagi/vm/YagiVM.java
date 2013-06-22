package de.fhac.ti.yagi.vm;

import de.fhac.ti.yagi.gen.YAGI_GrammarLexer;
import de.fhac.ti.yagi.gen.YAGI_GrammarParser;
import de.fhac.ti.yagi.vm.memory.MemoryManagement;
import org.antlr.runtime.*;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * An instance of this class represents a virtual machine implementation for the yagi language
 * specification. (see http://code.google.com/p/yagi/)
 */
public class YagiVM {

    private static final String DEFAULT_INPUT_FILE = "/home/thens/yagi/yagi-vm/sample_input.y";
    private final static Logger LOGGER = Logger.getLogger(YagiVM.class.getName());

    private InputStream mInputStream = System.in;
    private OutputStream mOutputStream = System.out;
    private boolean mInteractiveMode = true;
    private MemoryManagement mMemory;

    /**
     * Default constructor will initialize all necessary data structures used within the vm instance.
     */
    public YagiVM() {
        /* initialize the vm's memory model */
        mMemory = new MemoryManagement();
        /* initialize further relevant context for the vm */
        // ...
    }

    /**
     * Constructor which accepts an input stream (for reading and parsing of yagi code).
     * @param input The Yagi vm will read its input from the specified input stream.
     */
    public YagiVM(InputStream input) {
        this();
        mInputStream = input;
        mInteractiveMode = false;
    }

    /**
     * Constructor which accepts an output stream.
     * @param output The Yagi vm will output all messages/notifications to this output stream.
     */
    public YagiVM(OutputStream output) {
        this();
        mOutputStream = output;
    }

    /**
     * Constructor which accepts an input and output stream. (see 1-parameter constructors)
     * @param input The Yagi vm will read its input from the specified input stream.
     * @param output The Yagi vm will output all messages/notifications to this output stream.
     */
    public YagiVM(InputStream input, OutputStream output) {
        this();
        mInputStream = input;
        mOutputStream = output;
    }

    /**
     * This method will start the specified VM instance.
     * @throws Exception (Generic) Exception occured during vm's runtime.
     */
    public void start() throws Exception {
        LOGGER.setLevel(Level.FINER);
        Boolean multipleLines = false;
        String multipleLinesInput = "";
        Scanner scanner = new Scanner(mInputStream);

        while (true) {
            if (!multipleLines && mInteractiveMode) {
                System.out.print("YAGI>> ");
            }
            if (!scanner.hasNext()) {
                break;
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
            YAGI_GrammarLexer lexer = new YAGI_GrammarLexer(stream);
            TokenStream tokenStream = new CommonTokenStream(lexer);

            YAGI_GrammarParser parser = new YAGI_GrammarParser(this, tokenStream);
            parser.line();
            System.out.println();
        }
    }

    /**
     * This method will stop the VM after all resources are freed (and callbacks etc.)
     * @return mExitCode The actual exit code (e.g. "OK", "FAILURE", ...)
     */
    public ExitCode stop() {
        try {
            mInputStream.close();
            mOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ExitCode.OK;
    }

    public MemoryManagement getMemoryModel() {
        return mMemory;
    }

    public void output(String message) {
        try {
            if (message != null) {
                mOutputStream.write(message.getBytes());
                mOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* Main method for testing purposes... */
    public static void main(String[] args) {
        YagiVM instance = null;
        try {
            instance = new YagiVM(new FileInputStream(new File
                    (DEFAULT_INPUT_FILE)));
            //instance = new YagiVM();
            instance.start();
            ExitCode exitCode = instance.stop();
            if (exitCode == ExitCode.OK) {
                // handle success..
            } else if (exitCode == ExitCode.FAILURE) {
                // not handled yet
            } else if (exitCode == ExitCode.INTERNAL_FAILURE) {
                // not handled yet
            }
        } catch (FileNotFoundException e) {
            /* for now, no error handling yet */
            e.printStackTrace();
        } catch (Exception e) {
            /* for now, no error handling yet */
            e.printStackTrace();
        }
    }

    /**
     * This enum represents all possible exit codes of the yagi virtual machine.
     */
    public static enum ExitCode {
        OK,
        FAILURE,
        INTERNAL_FAILURE
    }
}