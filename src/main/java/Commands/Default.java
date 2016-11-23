package Commands;

import java.io.IOException;

/**
 * Created by anastasia on 22.11.16.
 */
public class Default implements ICommand {

    @Override
    public void execute(Context context) {
        try {
            context.getIw().writeChar(context.getCurrChar());
        } catch (IOException e) {
            e.printStackTrace();
        }
        context.setCurrChar(context.getNextChar());
    }
}
