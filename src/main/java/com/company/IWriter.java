package com.company;

import java.io.IOException;

/**
 * Interface for Writer.
 */
public interface IWriter {
    /**
     * write char in file.
     * @param c string for writing
     * @throws IOException exception
     */
    void writeChar(char c) throws IOException;
    /**
     * close a file.
     * @throws IOException exception
     */
    void close() throws IOException;
}
