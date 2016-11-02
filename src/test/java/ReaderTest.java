import com.company.Reader;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ReaderTest {
    private Reader reader;
    @Before
    public void setUp() throws FileNotFoundException {
        this.reader = new Reader("format.txt");
    }
    @Test
    public void testHasChars() throws IOException {
        boolean s = true;
        assertEquals(s, reader.hasChars());
    }
    @Test
    public void testReadChar() throws IOException {
        char str = 'p';
        assertEquals(str, reader.readChar());
    }
}

