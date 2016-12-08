package com.company.formatter;

import com.company.Reader.Reader;
import com.company.Reader.ReaderException;
import com.company.Writer.Writer;
import com.company.Writer.WriterException;

/**
 * Program for formatting code.
 */

public final class Formatter {

    /**
     * Formatter.
     */
    public Formatter() {
        //not called

    }

    /**
     * Formatter.
     *
     * @param args args
     * @throws ReaderException exception
     * @throws WriterException exception
     * @throws FormatterException exception
     */
    public static void main(final String[] args)
            throws ReaderException, WriterException, FormatterException {

        Format format = new Format();
        Reader ir = new Reader(args[0]);
        Writer iw = new Writer(args[1]);
        format.format(ir, iw);

    }

}

