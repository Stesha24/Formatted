package Commands;

import com.company.IReader;
import com.company.IWriter;

/**
 * Created by anastasia on 22.11.16.
 */
public class Context {
    private IReader ir;
    private IWriter iw;
    private char currChar;
    private char nextChar;
    private int tab;
    public boolean isComment, isString;

    public Context (IReader ir, IWriter iw) {
        this.setIr(ir);
        this.setIw(iw);
    }

    public IReader getIr() {
        return ir;
    }

    public void setIr(IReader ir) {
        this.ir = ir;
    }

    public IWriter getIw() {
        return iw;
    }

    public void setIw(IWriter iw) {
        this.iw = iw;
    }

    public char getCurrChar() {
        return currChar;
    }

    public void setCurrChar(char currChar) {
        this.currChar = currChar;
    }

    public char getNextChar() {
        return nextChar;
    }

    public void setNextChar(char nextChar) {
        this.nextChar = nextChar;
    }

    public int getTab() {
        return tab;
    }

    public void incTab() {
        ++tab;
    }
    public void decTab() {
        --tab;
    }

}
