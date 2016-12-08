package com.company.formatter;

import com.company.reader.Reader;
import com.company.reader.ReaderException;
import com.company.writer.Writer;
import com.company.writer.WriterException;

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

