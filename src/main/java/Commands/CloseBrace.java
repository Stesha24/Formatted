package Commands;

import java.io.IOException;

/**
 * Created by anastasia on 22.11.16.
 */
public class CloseBrace implements ICommand {
    @Override
    public void execute(Context context) {
        try {
            if (context.isComment || context.isString) {
                context.getIw().writeChar(context.getCurrChar());

                context.setCurrChar(context.getNextChar());
                return;
            }
            if (context.getNextChar() == '}') {
                context.getIw().writeChar('\n');
                context.decTab();
                for (int i = 0; i < context.getTab(); i++) {
                    context.getIw().writeChar('\t');
                }
                context.getIw().writeChar(context.getCurrChar());
                context.setCurrChar(context.getNextChar());
                return;
            }
            context.decTab();
            context.getIw().writeChar('\n');
            for (int i = 0; i < context.getTab(); i++) {
                context.getIw().writeChar('\t');
            }
            context.getIw().writeChar(context.getCurrChar());
            context.getIw().writeChar('\n');
            for (int i = 0; i < context.getTab(); i++) {
                context.getIw().writeChar('\t');
            }
            context.setCurrChar(context.getNextChar());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
