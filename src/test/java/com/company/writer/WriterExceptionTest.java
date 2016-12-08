package com.company.writer;

import org.junit.Test;


/**
 * Test for WriterException.
 */
public class WriterExceptionTest {
    @Test(expected = WriterException.class)
    public void writerException() throws WriterException {
        throw new WriterException("test");
    }
}