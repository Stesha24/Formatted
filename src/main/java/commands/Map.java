package commands;

import java.util.HashMap;

/**
 * Map with chars and commands.
 */
public class Map {
    /**
     * Creating HashMap.
     */
    private HashMap<Character, ICommand> conditions;

    /**
     * Getting char.
     * @param ch char
     * @return condition for char
     */
    public final ICommand get(final char ch) {
        if (conditions.containsKey(ch)) {
            return conditions.get(ch);
        } else {
            return conditions.get(null);
        }
    }

    /**
     * Map with conditions.
     */
    public Map() {
        conditions = new HashMap<>();
        conditions.put('{', new OpenBrace());
        conditions.put('}', new CloseBrace());
        conditions.put(';', new Semicolon());
        conditions.put('/', new Comment());
        conditions.put('*', new Star());
        conditions.put('\n', new NewLine());
        conditions.put(null, new Default());

    }
}
