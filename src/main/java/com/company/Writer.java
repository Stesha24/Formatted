package com.company;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for Writing symbols to file.
 */
public class Writer implements IWriter {
    /**
     * variable for writing.
     */
    private FileWriter w;

    /**
     * creating a variable for writing.
     * @param str - name of file
     * @throws WriterException exception
     */
    Writer(final String str) throws WriterException {
        try {
            w = new FileWriter(str);
        } catch (IOException e) {
            throw new WriterException("File can't be open");
        }
    }

    /**
     * write char in file.
     * @param c string for writing
     * @throws IOException exception
     */
    @Override
    public final void writeChar(final char c) throws WriterException {
       try {
           w.write(c);
       } catch (IOException e) {
           throw new WriterException("Char can't be write");
       }
    }

    @Override
    public final String getString() {
        return null;
    }

    /**
     * close a file.
     * @throws IOException exception
     */
    @Override
    public final void close() throws WriterException {
        try {
            w.close();
        } catch (IOException e) {
            throw new WriterException("File hasn't been close");
        }
    }
}
