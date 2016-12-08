package com.company.writer;

/**
 * Writer for strings.
 */
public class StringWriter implements IWriter {
    /**
     * new String Builder.
     */
    private StringBuilder res = new StringBuilder();

    /**
     * write char.
     * @param c string for writing
     * @throws WriterException exception
     */
    @Override
    public final void writeChar(final char c) throws WriterException {
        res.append(c);
    }

    /**
     * close.
     * @throws WriterException exception
     */
    @Override
    public void close() throws WriterException {

    }

    /**
     * Get string.
     * @return string
     */
    public final String getString() {
        res = res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
