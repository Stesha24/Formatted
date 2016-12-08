package com.company.reader;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Reader for strings.
 */
public class StringReader implements IReader {
    /**
     * buffered reader.
     */
    private BufferedReader br;
    /**
     * string.
     */
    private String string;
    /**
     * char.
     */
    private char ch;

    /**
     * string reader.
     * @param str string
     * @throws ReaderException exception
     */
    public StringReader(final String str) throws ReaderException {
        string = str;
        br = new BufferedReader(new java.io.StringReader(string));
    }

    /**
     * Checking on chars.
     * @return has chars or not
     * @throws ReaderException exception
     */
    @Override
    public final boolean hasChars() throws ReaderException {
        if (ch == (char) -1) {
            return false;
        }
        return true;
    }

    /**
     * Reading chars.
     * @return char
     * @throws ReaderException exception
     */
    @Override
    public final char readChar() throws ReaderException {
        try {
            ch = (char) br.read();
            return ch;
        } catch (IOException e) {
            throw new ReaderException("Reader Exception");
        }
    }
}
