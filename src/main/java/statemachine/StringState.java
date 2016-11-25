package statemachine;

/**
 * State for string.
 */
public class StringState implements IState {
    @Override
    public IState getNext(final IProvide provide) {
        char currChar = provide.getCurrChar();
        char nextChar = provide.getNextChar();

        if (currChar == '\"') {
            return new DefaultState();
        }
        return this;
    }
}
