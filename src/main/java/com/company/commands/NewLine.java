package com.company.commands;

import com.company.Writer.WriterException;

/**
 * Command for Enter.
 */
public class NewLine implements ICommand {
    /**
     * Executing command.
     * @param context context
     */
    @Override
    public final void execute(final Context context) throws WriterException {
        try {

            if (context.isComment) {
                context.isComment = false;
            }
            context.getIw().writeChar(context.getCurrChar());
            for (int i = 0; i < context.getTab(); i++) {
                context.getIw().writeChar('\t');
            }
            context.setCurrChar(context.getNextChar());
        } catch (WriterException e) {
            throw new WriterException("Something went wrong");
        }
    }
}
