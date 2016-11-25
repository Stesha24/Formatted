package com.company;

import commands.Context;
import commands.Map;

/**
 * class for Formatting code.
 */
public class Format implements IFormatter {


    @Override
    public final void format(final IReader ir, final IWriter iw)
            throws ReaderException, WriterException {
        String str;
        Context context = new Context(ir, iw);
        Map m = new Map();
        context.setCurrChar(ir.readChar());
        while (ir.hasChars()) {
            context.setNextChar(ir.readChar());
            m.get(context.getCurrChar()).execute(context);
            context.setCurrChar(context.getNextChar());
        }
        m.get(context.getCurrChar()).execute(context);
        iw.close();
    }

}



