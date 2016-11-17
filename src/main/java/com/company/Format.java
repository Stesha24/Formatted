package com.company;

import java.io.IOException;

/**
 * class for Formatting code.
 */
public class Format implements IFormatter {


    @Override
    public final void format(final IReader ir, final IWriter iw)
            throws IOException {
        String str;

        while (ir.hasChars()) {
            Invoker inv = new Invoker(new getCharCommand(ir.readChar()));
            str = inv.getChar();
            iw.writeChar(str);
        }
        iw.close();
    }

}



