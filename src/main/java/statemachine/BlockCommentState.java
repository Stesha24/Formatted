package statemachine;

/**
 * State for block comment.
 */
public class BlockCommentState implements IState {
    /**
     * Block Comment State.
     * @param provide provide
     * @return
     */
    @Override
    public IState getNext(IProvide provide) {
        char currChar = provide.getCurrChar();
        char nextChar = provide.getNextChar();

        if (currChar == '*' && nextChar == '/') {
            return new DefaultState();
        }
        return this;
    }
}
