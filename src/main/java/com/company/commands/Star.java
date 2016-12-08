package com.company.commands;

import com.company.reader.ReaderException;
import com.company.writer.WriterException;

/**
 * Command for star.
 */
public class Star implements ICommand {
    /**
     * Executing command.
     * @param context context
     */
    @Override
    public final void execute(final Context context)
            throws WriterException, ReaderException {
        try {
            if (context.getNextChar() == '/') {
                context.getIw().writeChar(context.getCurrChar());
                context.getIw().writeChar(context.getNextChar());
                context.getIw().writeChar('\n');
                for (int i = 0; i < context.getTab(); i++) {
                    context.getIw().writeChar('\t');
                }
                context.isComment = false;
                context.setNextChar(context.getIr().readChar());
                context.setCurrChar(context.getNextChar());
                return;
            }
            context.getIw().writeChar(context.getCurrChar());
            context.setCurrChar(context.getNextChar());
        } catch (WriterException e) {
            throw new WriterException("Something went wrong");
        } catch (ReaderException e) {
            throw new ReaderException("Something went wrong");
        }
    }
}
