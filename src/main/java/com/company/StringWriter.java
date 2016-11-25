package com.company;

/**
 * Created by anastasia on 24.11.16.
 */
public class StringWriter implements IWriter {
    private StringBuilder res = new StringBuilder();
    @Override
    public void writeChar(char c) throws WriterException {
        res.append(c);
    }

    @Override
    public void close() throws WriterException {

    }
}
