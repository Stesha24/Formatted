package statemachine;

/**
 * Interface for state.
 */
public interface IState {
    /**
     * getting next state.
     * @param provide provide
     * @return next state
     */
    IState getNext(IProvide provide);
}
