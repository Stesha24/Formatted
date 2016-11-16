package com.company;

import java.io.IOException;


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
     * @throws IOException exception
     * @throws com.company.Reader.InputExcetion check for emptiness
     */
    public static void main(final String[] args) throws IOException,
            Reader.InputExcetion {

        Format format = new Format();

        Reader ir = new Reader("format.txt");
        Writer iw = new Writer("output.txt");
        format.format(ir, iw);
    }


}
