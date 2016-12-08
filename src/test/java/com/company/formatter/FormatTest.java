package com.company.formatter;

import com.company.reader.IReader;
import com.company.reader.StringReader;
import com.company.writer.IWriter;
import com.company.writer.StringWriter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for format class.
 */
public class FormatTest {
    private Format testFormat = new Format();
    private IReader ir;
    private IWriter iw = null;
    @Test
    public void opBrace() throws Exception {
        ir = new StringReader("qwe {");
        iw = new StringWriter();
        testFormat.format(ir, iw);
        assertEquals("qwe {\n\t", iw.getString());
    }

    @Test
    public void clBrace() throws Exception {
        ir = new StringReader("\tasd}asd");
        iw = new StringWriter();
        testFormat.format(ir, iw);
        assertEquals("\tasd\n}\nasd", iw.getString());
    }

    @Test
    public void strCom() throws Exception {
        ir = new StringReader("//qwe{asd};*ms");
        iw = new StringWriter();
        testFormat.format(ir, iw);
        assertEquals("//qwe{asd};*ms", iw.getString());
    }

    @Test
    public void blockCom() throws Exception {
        ir = new StringReader("/*qwe;{}\n\t*/");
        iw = new StringWriter();
        testFormat.format(ir, iw);
        assertEquals("/*qwe;{}\n\t*/\n", iw.getString());
    }

    @Test
    public void semicolon() throws Exception {
        ir = new StringReader("qwe;");
        iw = new StringWriter();
        testFormat.format(ir, iw);
        assertEquals("qwe;\n", iw.getString());
    }

}
