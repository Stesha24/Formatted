package com.company;

import org.junit.Test;

import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Created by anastasia on 03.11.16.
 */
public class FormatTest {
    @Test
    public void format() throws Exception {

        FileReader fr = new FileReader("output.txt");
        Format format = new Format();
        format.format("format.txt", "output.txt");
        char c;
        String str = "";
        while ((c = (char)fr.read()) !=(char) -1) {
            str += c;
        }
        fr.close();

        String strWait = "public void format(String fileIn, String fileOut) throws IOException  {\n" +
                "  Reader r = new Reader(fileIn);\n" +
                "  Writer w = new Writer(fileOut);\n" +
                "  String s = \"\";\n" +
                "  String spaces = \" \";\n" +
                "  }\n ";

        assertEquals(strWait, str );
    }

}