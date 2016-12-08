package com.company.formatter;

import com.company.Reader.IReader;
import com.company.Reader.StringReader;
import com.company.Writer.IWriter;
import com.company.Writer.StringWriter;
import com.company.formatter.Format;
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
