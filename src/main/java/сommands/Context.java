package сommands;

import com.company.IReader;
import com.company.IWriter;

/**
 * Context.
 */
public class Context {
    /**
     * Variable ir.
     */
    private IReader ir;
    /**
     * Variable iw.
     */
    private IWriter iw;
    /**
     * Variable current char.
     */
    private char currChar;
    /**
     * Variable next char.
     */
    private char nextChar;
    /**
     * Variable number of tabs.
     */
    private int tab;
    /**
     * Flags for comments and strings.
     */
    public boolean isComment, isString;

    /**
     * Setting interfaces.
     * @param r reader's interface
     * @param w writer's interface
     */
    public Context(final IReader r, final IWriter w) {
        this.setIr(r);
        this.setIw(w);
    }

    /**
     * For getting ir.
     * @return ir
     */
    public final IReader getIr() {
        return ir;
    }

    /**
     * For setting ir.
     * @param iReader iReader
     */
    public final void setIr(final IReader iReader) {
        this.ir = iReader;
    }

    /**
     * For getting iw.
     * @return iw
     */
    public final IWriter getIw() {
        return iw;
    }

    /**
     * For setting iw.
     * @param iWriter iw
     */
    public final void setIw(final IWriter iWriter) {
        this.iw = iWriter;
    }

    /**
     * For getting current char.
     * @return current char
     */
    public final char getCurrChar() {
        return currChar;
    }

    /**
     * For setting current char.
     * @param  currentChar current char
     */
    public final void setCurrChar(final char currentChar) {
        this.currChar = currentChar;
    }

    /**
     * For getting next char.
     * @return next char
     */
    public final char getNextChar() {
        return nextChar;
    }

    /**
     * For setting next char.
     * @param  charAfter next char
     */
    public final void setNextChar(final char charAfter) {
        this.nextChar = charAfter;
    }

    /**
     * For getting tabs.
     * @return tab
     */
    public final int getTab() {
        return tab;
    }

    /**
     * Increasing tab.
     */
    public final void incTab() {
        ++tab;
    }

    /**
     * Decreasing tab.
     */
    public final void decTab() {
        --tab;
    }

}
