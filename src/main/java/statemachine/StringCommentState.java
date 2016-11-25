package statemachine;

/**
 * State for string comment.
 */
public class StringCommentState implements IState {
    /**
     * getting next state.
     * @param provide provide
     * @return next state
     */
    @Override
    public IState getNext(final IProvide provide) {

        char currChar = provide.getCurrChar();
        char nextChar = provide.getNextChar();

        if (currChar == '/' && nextChar == '/') {
            return new StringCommentState();
        }
        return this;
    }
}
