package com.company.reader;

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
     * @param str - file for reading
     * @throws ReaderException check file
     */
    public Reader(final String str) throws ReaderException {
        try {
            r = new FileReader(str);

        } catch (FileNotFoundException f) {
            throw new ReaderException("File isn't found");
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
     * @throws ReaderException have chars
     */
    @Override
    public final boolean hasChars() throws ReaderException {
        try {
            return r.ready();
        } catch (IOException e) {
            throw new ReaderException("File hasn't got chars");
        }
    }

    /**
     * reading chars from file.
     * @return char
     * @throws ReaderException check for reading file
     */
    @Override
    public final char readChar() throws ReaderException {
        try {
            char c = (char) r.read();
            return c;
        } catch (IOException e) {
            throw new ReaderException("File can't be read");
        }
    }

}
