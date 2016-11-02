package com.company;

import java.io.IOException;

/**
 * class for Formatting code.
 */
public class Format implements IFormatter {
    /**
     * formatting code.
     * @param fileIn - name of file for reading
     * @param fileOut - name of file for writing
     * @throws IOException exception
     */
    @Override
    public final void format(final String fileIn, final String fileOut)
            throws IOException {
        Reader r = new Reader(fileIn);
        Writer w = new Writer(fileOut);
        String s = "";

        String spaces = " ";

        while (r.hasChars()) {
            char c = r.readChar();
            s += c;

            if (c == ';') {
                w.writeChar(s + "\n" + spaces);
                s = "";
            } else if (c == '{') {
                spaces += spaces;
                s = "{";
                w.writeChar(" " + s + "\n" + spaces);
                s = "";

            } else if (c == '}') {
                spaces = spaces.substring(0, spaces.length() - 1);
                s = "}";
                w.writeChar(s + "\n" + spaces);
                s = "";

            } else {
                w.writeChar(s);
                s = "";
            }
        }
        w.close();

        }
    }

