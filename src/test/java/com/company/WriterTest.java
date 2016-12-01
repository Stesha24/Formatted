package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for Writer.
 */
public class WriterTest {
    private Format testFormat = new Format();
    private IReader ir;
    private IWriter iw;
    @Test
    public void getString() throws Exception {
        iw = new Writer("qwe");
        assertEquals(null, iw.getString());
    }

}