package com.company.formatter;

import com.company.reader.IReader;
import com.company.writer.IWriter;
import com.company.reader.ReaderException;
import com.company.writer.WriterException;
import com.company.commands.Context;
import com.company.commands.Map;

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



