package com.company;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by anastasia on 24.11.16.
 */
public class StringReader implements IReader {
    private BufferedReader br;
    private String string;
    private char ch;

    public StringReader(final String str) throws ReaderException {
        string = str;
        br = new BufferedReader(new java.io.StringReader(string));
    }
    @Override
    public boolean hasChars() throws ReaderException {
        if (ch == (char)-1) {
            return false;
        }
        return true;
    }

    @Override
    public char readChar() throws ReaderException {
        try {
            ch = (char)br.read();
            return ch;
        } catch (IOException e) {
            throw new ReaderException("Reader Exception");
        }
    }
}
