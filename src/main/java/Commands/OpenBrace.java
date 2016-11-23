package Commands;

import java.io.IOException;


/**
 * Created by anastasia on 22.11.16.
 */
public class OpenBrace implements ICommand {
    @Override
    public void execute(Context context) {
        try {
            if (context.isComment || context.isString) {
                context.getIw().writeChar(context.getCurrChar());

                context.setCurrChar(context.getNextChar());
                return;
            }

            context.getIw().writeChar(context.getCurrChar());
            context.getIw().writeChar('\n');
            context.incTab();
            for (int i = 0; i < context.getTab(); i++) {
                context.getIw().writeChar('\t');
            }
            context.setCurrChar(context.getNextChar());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
