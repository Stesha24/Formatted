package Commands;

import java.util.HashMap;

/**
 * Created by anastasia on 22.11.16.
 */
public class Map {
    private HashMap<Character, ICommand> conditions;

    public ICommand get (char ch) {
        if (conditions.containsKey(ch)) {
            return conditions.get(ch);
        } else
            return conditions.get(null);
    }
    public Map () {
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
