package com.company;

/**
 * Command for formatting char.
 */
public class getCharCommand implements ICommand {
    /**
     * Variable for current char.
     */
    private char currChar;
    /**
     * Command for formatting char.
     * @param currChar char for formatting
     */
    public getCharCommand(final char currChar) {
        this.currChar = currChar;
    }

    /**
     * Global variable for tabs.
     */
    public static int tab = 0;

    /**
     * Execute the command.
     * @return string with formatted char.
     */
    @Override
    public final String execute() {
        String str = "";

       /* boolean isComment = false;
        boolean isString = false;
*/
        switch (currChar) {
            case '{':
                str += (currChar + "\n");
                tab++;
                for (int i = 0; i < tab; i++) {
                    str += "\t";
                }
                return str;
            case '}':
                tab--;
                str += "\n";
                for (int i = 0; i < tab; i++) {
                    str += "\t";
                }
                str += (currChar + "\n");
                for (int i = 0; i < tab; i++) {
                    str += "\t";
                }

                return str;
            case ';':
                str += (currChar + "\n");
                for (int i = 0; i < tab; i++) {
                    str += "\t";
                }
                return str;

            case '\n':

                str += currChar;
                for (int i = 0; i < tab; i++) {
                    str += "\t";
                }
                return str;
            default:
                str += currChar;
                return str;
        }
    }
}
