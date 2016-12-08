package com.company.commands;

import com.company.Reader.ReaderException;
import com.company.Writer.WriterException;

/**
 * Interface for commands.
 */
public interface ICommand {
    /**
     * execute formatting char.
     * @param context context
     * @throws WriterException exception
     * @throws ReaderException exception
     */
     void execute(Context context) throws WriterException, ReaderException;
}
