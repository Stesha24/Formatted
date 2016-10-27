package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 */

public final class Formatter {
    /**
     *
     */
    private Formatter() {
        //not called
    }
    /**
     *
     * @param args args
     * @throws IOException exception
     */
    public static void main(final String[] args) throws IOException {
        String fileIn = "format.txt";
        String fileOut = "output.txt";

        FileReader reader = new FileReader(fileIn);
        FileWriter writer = new FileWriter(fileOut, false);

        String s = "";
        int c;
        String spaces = " ";

        while ((c = reader.read()) != -1) {
            s += (char) c;

            if (c == ';') {
                writer.write(s + "\n" + spaces);
                s = "";
            } else if (c == '{') {
                spaces += spaces;
                s = "{";
                writer.write(" " + s + "\n" + spaces);
                s = "";

            } else if (c == '}') {
                spaces = spaces.substring(0, spaces.length() - 1);
                s = "}";
                writer.write(s + "\n" + spaces);
                s = "";

            } else {
                writer.write(s);
                s = "";
            }
        }
        writer.flush();
    }
}
