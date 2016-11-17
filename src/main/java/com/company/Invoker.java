package com.company;


/**
 * Class for call the commands.
 */
public class Invoker {
    /**
     * object of getCharCommand.
     */
    private getCharCommand charCommand;

    /**
     * Invoker.
     * @param charCommand object of getCharCommand
     */
    public Invoker(final getCharCommand charCommand) {
        this.charCommand = charCommand;
    }

    /**
     * call method from command.
     * @return string with formatted char
     */
    public final String getChar() {
        String str;
        str = charCommand.execute();
        return str;
    }
}
