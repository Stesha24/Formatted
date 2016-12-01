package com.company;

/**
 * Interface for Formatter.
 */
public interface IFormatter {
    /**
     * method for formatting code.
     * @param ir reader-interface
     * @param iw writer-interface
     * @throws ReaderException exception
     * @throws WriterException exception
     * @throws FormatterException exception
     */
    void format(IReader ir, IWriter iw) throws FormatterException,
            ReaderException, WriterException;
}
