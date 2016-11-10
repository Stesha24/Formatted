package com.company;

import java.io.IOException;

/**
 * Interface for Formatter.
 */
public interface IFormatter {
    /**
     * method for formatting code.
     * @param ir reader-interface
     * @param iw writer-interface
     * @throws IOException exception
     */
    void format(IReader ir, IWriter iw) throws IOException;
}
