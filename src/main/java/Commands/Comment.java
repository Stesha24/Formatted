package Commands;

import java.io.IOException;

/**
 * Created by anastasia on 22.11.16.
 */
public class Comment implements ICommand {
    @Override
    public void execute(Context context) {
        try {
            if (context.getNextChar() == '/' || context.getNextChar() == '*') {
                context.getIw().writeChar(context.getCurrChar());
                context.isComment = true;
                context.setCurrChar(context.getNextChar());
                return;
            }
            context.getIw().writeChar(context.getCurrChar());
            context.setCurrChar(context.getNextChar());
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
