package com.company.Reader;

/**
 * Interface for Reader.
 */
public interface IReader {
    /**
     * check for presence of chars.
     * @throws ReaderException exception
     * @return true or false
     */
    boolean hasChars() throws ReaderException;

    /**
     * reading chars from file.
     * @throws ReaderException exception
     * @return char
     */
    char readChar() throws ReaderException;
}
