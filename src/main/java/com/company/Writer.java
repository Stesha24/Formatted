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
     * @param fileOut - name of file
     * @throws IOException exception
     */
    Writer(final String fileOut) throws IOException {
        w = new FileWriter(fileOut);
    }

    /**
     * write char in file.
     * @param c string for writing
     * @throws IOException exception
     */
    @Override
    public final void writeChar(final String c) throws IOException {
        w.write(c);
    }

    /**
     * close a file.
     * @throws IOException exception
     */
    @Override
    public final void close() throws IOException {
        w.close();
    }
}
