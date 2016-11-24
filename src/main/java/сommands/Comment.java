package сommands;

import com.company.WriterException;


/**
 * Command for comment.
 */
public class Comment implements ICommand {
    /**
     * Executing command.
     * @param context context
     */
    @Override
    public final void execute(final Context context) {
        try {
            if (context.getNextChar() == '/' || context.getNextChar() == '*') {
                context.getIw().writeChar(context.getCurrChar());
                context.isComment = true;
                context.setCurrChar(context.getNextChar());
                return;
            }
            context.getIw().writeChar(context.getCurrChar());
            context.setCurrChar(context.getNextChar());
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}
