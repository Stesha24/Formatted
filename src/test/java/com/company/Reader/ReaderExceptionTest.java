package com.company.Reader;

import com.company.reader.ReaderException;
import org.junit.Test;


/**
 * Test for ReaderException.
 */
public class ReaderExceptionTest {
    @Test(expected = ReaderException.class)
    public void readerException() throws ReaderException {
        throw new ReaderException("test");
    }

}