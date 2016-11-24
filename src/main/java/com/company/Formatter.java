package com.company;

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

        Reader ir = new Reader("format.txt");
        Writer iw = new Writer("output.txt");
        format.format(ir, iw);

    }

}

