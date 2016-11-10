package com.company;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reading symbols from file.
 */
public class Reader implements IReader {
    /**
     * variable for reading.
     */
    private  FileReader r;

    /**
     * creating a variable for reading.
     * @param str - file for reading
     * @throws IOException exception
     * @throws  InputException check for emptiness
     */
    public Reader(final String str) throws IOException, InputException {
        r = new FileReader(str);
        if (!r.ready()) {
            throw new InputException("File is empty");
        }
    }

    /**
     * Exception for checking if file is empty.
     */

    static final class InputException extends Exception {
        /**
         * Method call message about error.
         * @param message message
         */
        private InputException(final String message) {
            super(message);
        }
    }
    /**
     * constructor.
     */
    public Reader() {

    }

    /**
     * check for presence of chars.
     * @return true or false
     * @throws IOException exception
     */
    @Override
    public final boolean hasChars() throws IOException {
        return r.ready();
    }

    /**
     * reading chars from file.
     * @return char
     * @throws IOException exception
     */
    @Override
    public final char readChar() throws IOException {
        char c = (char) r.read();
            return c;
    }

}
