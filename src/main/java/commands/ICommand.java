package commands;

import com.company.ReaderException;
import com.company.WriterException;

/**
 * Interface for commands.
 */
public interface ICommand {
    /**
     * execute formatting char.
     * @param context context
     * @throws WriterException exception
     * @throws ReaderException exception
     */
     void execute(Context context) throws WriterException, ReaderException;
}
