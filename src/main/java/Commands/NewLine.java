package Commands;

import java.io.IOException;

/**
 * Created by anastasia on 22.11.16.
 */
public class NewLine implements ICommand {
    @Override
    public void execute(Context context) {
        try {

            if (context.isComment) {
                context.isComment = false;
            }
            context.getIw().writeChar(context.getCurrChar());
            for (int i = 0; i < context.getTab(); i++) {
                context.getIw().writeChar('\t');
            }
            context.setCurrChar(context.getNextChar());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
