package statemachine;

/**
 * Interface for provide.
 */
public interface IProvide {
    /**
     * getting next char.
     * @return next char
     */
    char getNextChar();

    /**
     * getting current char.
     * @return current char
     */
    char getCurrChar();

    /**
     * getting state.
     * @return state
     */
    IState getState();

    /**
     * setting state.
     * @param state state
     */
    void setState(IState state);
}
