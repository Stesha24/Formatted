package com.company.reader;

import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * test for ReaderException.
 */
public class ReaderTest {
    private IReader ir;
    private FileReader r;
    @Before
    public void setUp() throws ReaderException {
        ir = new Reader("format.txt");
    }
    @Test
    public void hasChars() throws Exception {
        assertEquals(true, ir.hasChars());
    }

    @Test
    public void readChar() throws Exception {
        assertEquals('p', ir.readChar());
    }

}