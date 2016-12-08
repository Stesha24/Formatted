package com.company.Writer;

import com.company.Reader.IReader;
import com.company.Reader.Reader;
import com.company.Reader.ReaderException;
import com.company.formatter.Format;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for Writer.
 */
public class WriterTest {
    private Format testFormat = new Format();
    private IReader ir;
    private IWriter iw;
    @Before
    public void setUp() throws WriterException, ReaderException {
        iw = new Writer("output.txt");
        ir = new Reader("output.txt");
        iw.writeChar('p');
        iw.close();
    }

    @Test
    public void writeChar() throws ReaderException {
        assertEquals('p', ir.readChar());
    }

    @Test
    public void getString() throws Exception {
        iw = new Writer("qwe");
        assertEquals(null, iw.getString());
    }

}