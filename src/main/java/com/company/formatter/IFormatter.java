package com.company.formatter;

import com.company.Reader.IReader;
import com.company.Reader.ReaderException;
import com.company.Writer.IWriter;
import com.company.Writer.WriterException;

/**
 * Interface for Formatter.
 */
public interface IFormatter {
    /**
     * method for formatting code.
     * @param ir reader-interface
     * @param iw writer-interface
     * @throws FormatterException exception
     */
    void format(IReader ir, IWriter iw) throws FormatterException, ReaderException, WriterException;
}
