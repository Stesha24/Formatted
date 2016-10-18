import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by anastasia on 18.10.16.
 */
public class Formatter {
    public static void main(String[] args) throws IOException {
        String fileIn = args[0];
        String fileOut = args[1];

        FileReader reader = new FileReader(fileIn);
        FileWriter writer = new FileWriter(fileOut, false);

        String s = "";
        int c;
        String spaces = " ";

        while ((c = reader.read()) != -1) {
            s += (char) c;

            if (c == ';') {
                writer.write(s + "\n" + spaces);
                s = "";
            } else if (c == '{') {
                spaces += spaces;
                s = "{";
                writer.write(" " + s + "\n" + spaces);
                s = "";

            } else if (c == '}') {
                spaces = spaces.substring(0, spaces.length() - 1);
                s = "}";
                writer.write(s + "\n" + spaces);
                s = "";

            } else {
                writer.write(s);
                s = "";
            }
        }
        writer.flush();
    }
}
