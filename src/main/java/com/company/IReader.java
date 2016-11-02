package com.company;

import java.io.IOException;

/**
 * Interface for Reader.
 */
public interface IReader {
    /**
     * check for presence of chars.
     * @return true or false
     * @throws IOException exception
     */
    boolean hasChars() throws IOException;

    /**
     * reading chars from file.
     * @return char
     * @throws IOException exception
     */
    char readChar() throws IOException;
}
