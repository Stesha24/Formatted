package com.company.formatter;

import org.junit.Test;

/**
 * Test for FormatterException.
 */
public class FormatterExceptionTest {
    @Test(expected = FormatterException.class)
    public void formatterException() throws FormatterException {
        throw new FormatterException("test");
    }
}