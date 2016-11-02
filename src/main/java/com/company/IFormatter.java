package com.company;

import java.io.IOException;

/**
 * Interface for Formatter.
 */
public interface IFormatter {
    /**
     * method for formatting code.
     * @param fileIn - name of file for reading
     * @param fileOut - name of file for writing
     * @throws IOException exception
     */
    void format(final String fileIn, final String fileOut) throws IOException;
}
