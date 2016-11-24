package сommands;

import com.company.WriterException;

/**
 * Command for ';'.
 */
public class Semicolon implements ICommand {
    /**
     * Executing command.
     * @param context context
     */
    @Override
    public final void execute(final Context context) {
        try {


            if (context.getNextChar() == '/') {
                context.getIw().writeChar(context.getCurrChar());
                context.setCurrChar(context.getNextChar());
                return;
            }
            if (context.isComment || context.isString) {
                context.getIw().writeChar(context.getCurrChar());
                context.setCurrChar(context.getNextChar());
                return;
            }
            if (context.getNextChar() == '}') {
                context.getIw().writeChar(context.getCurrChar());
                context.setCurrChar(context.getNextChar());
                return;
            }
            context.getIw().writeChar(context.getCurrChar());
            context.getIw().writeChar('\n');
            for (int i = 0; i < context.getTab(); i++) {
                context.getIw().writeChar('\t');
            }
            context.setCurrChar(context.getNextChar());
        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}
