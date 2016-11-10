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

        Reader r = new Reader("output.txt");
        String str = "";

        while (r.hasChars()){
            char ch = r.readChar();
            str+=ch;
        }

        String strWait = "public void format(String fileIn, String fileOut) throws IOException {\n" +
                "\t/*Reader r = new Reader(fileIn);\n" +
                "\tif(test == 0) {\n" +
                "\t\ttest++;\n" +
                "\t\tswitch(n) {\n" +
                "\t\t\tchar n;\n" +
                "\t\t\tn+=s;\n" +
                "\t\t\t}\n" +
                "\t\t}*/\n" +
                "\tWriter w =new Writer(fileOut);//ыаодыв}лаодылола\n" +
                "\tString s =\"\";\n" +
                "\tString spaces = \" \";\n" +
                "\tObject obj = new Object;\n" +
                "\t}\n";

        assertEquals(strWait, str);
    }

}