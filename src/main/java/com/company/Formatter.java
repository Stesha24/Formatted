package com.company;

import java.io.IOException;


/**
 * Program for formatting code.
 */

public final class Formatter {
    /**
     *Formatter.
     */
    public Formatter() {
        //not called

    }
    /**
     * Formatter.
     * @param args args
     * @throws IOException exception
     */
    public static void main(final String[] args) throws IOException {

        Format format = new Format();
        format.format("format.txt", "output.txt");


    }
}
