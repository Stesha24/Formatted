package com.company.writer;

/**
 * Interface for Writer.
 */
public interface IWriter {
    /**
     * write char in file.
     * @throws WriterException exception
     * @param c string for writing
     */
    void writeChar(char c) throws WriterException;

    /**
     * Getting string.
     * @return string
     */
    String getString();

    /**
     * close a file.
     * @throws WriterException exception
     */
    void close() throws WriterException;
}
