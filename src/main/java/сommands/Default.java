package сommands;

import com.company.WriterException;


/**
 * Command for default char.
 */
public class Default implements ICommand {
    /**
     * Executing command.
     * @param context context
     */

    @Override
    public final void execute(final Context context) {
        try {
            context.getIw().writeChar(context.getCurrChar());
        } catch (WriterException e) {
            e.printStackTrace();
        }
        context.setCurrChar(context.getNextChar());
    }
}
