package statemachine;

/**
 * State for default chars.
 */
public class DefaultState implements IState {
    /**
     * For default chars.
     * @param provide provide
     * @return string comment state
     */
    @Override
    public IState getNext(final IProvide provide) {
        char currChar = provide.getCurrChar();
        char nextChar = provide.getNextChar();

        if (currChar == '/' && nextChar == '/') {
            return new StringCommentState();
        }
        if (currChar == '/' && nextChar == '*') {
            return new BlockCommentState();
        }
        if (currChar == '\"') {
            return new StringState();
        }
        return this;
    }
}
