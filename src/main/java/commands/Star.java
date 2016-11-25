package commands;

import com.company.ReaderException;
import com.company.WriterException;

/**
 * Command for star.
 */
public class Star implements ICommand {
    /**
     * Executing command.
     * @param context context
     */
    @Override
    public final void execute(final Context context) {
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
            e.printStackTrace();
        } catch (ReaderException e) {
            e.printStackTrace();
        }
    }
}
