package com.company.commands;

import com.company.reader.ReaderException;
import com.company.writer.WriterException;

/**
 * Command for string.
 */
public class Str implements ICommand {
    @Override
    public final void execute(final Context context)
            throws WriterException, ReaderException {
        context.getIw().writeChar(context.getCurrChar());
        context.setIsString(!context.isString());
    }
}

