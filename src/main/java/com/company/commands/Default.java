package com.company.commands;

import com.company.Writer.WriterException;


/**
 * Command for default char.
 */
public class Default implements ICommand {
    /**
     * Executing command.
     * @param context context
     */

    @Override
    public final void execute(final Context context) throws WriterException {
        try {
            context.getIw().writeChar(context.getCurrChar());
        } catch (WriterException e) {
            throw new WriterException("Something went wrong");
        }
        context.setCurrChar(context.getNextChar());
    }
}
