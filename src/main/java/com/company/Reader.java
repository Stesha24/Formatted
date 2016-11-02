package com.company;

import java.io.FileNotFoundException;
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
     * @param fileIn - name of file
     * @throws FileNotFoundException exception
     */
    public Reader(final String fileIn) throws FileNotFoundException {
        r = new FileReader(fileIn);
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
        return (char) r.read();
    }
}
