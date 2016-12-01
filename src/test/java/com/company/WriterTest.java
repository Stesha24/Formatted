package com.company;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by anastasia on 01.12.16.
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