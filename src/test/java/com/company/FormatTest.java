package com.company;

import org.junit.Test;

import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Test for format class.
 */
public class FormatTest {
    @Test
    public void format() throws Exception {
        String str1 = "test";
        Reader r = new Reader(str1);
        String str = "";
        char currChar = r.readChar();
        while (r.hasChars()) {

            Invoker inv = new Invoker(new getCharCommand(currChar));
            str += inv.getChar();
        }


        assertEquals("qwerty{\n\t", str);

    }


}