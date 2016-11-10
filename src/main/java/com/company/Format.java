package com.company;

import java.io.IOException;

/**
 * class for Formatting code.
 */
public class Format implements IFormatter {
    /**
     * Formatting code.
     *
     * @param ir - reader-interface
     * @param iw - writer-interface
     * @throws IOException exception
     */
    @Override
    public final void format(final IReader ir, final IWriter iw)
            throws IOException {
        StringBuilder result = new StringBuilder();
        String tab = "";
        boolean isComment = false, isBlock = false;
        while (ir.hasChars()) {
            String str = readString(ir);
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                switch (ch) {
                    case '{':
                        if (isComment) {
                            result.append(ch);
                            break;
                        }
                        tab += "\t";
                        result.append(ch + "\n" + tab);
                        break;
                    case '}':
                        if (isComment) {
                            result.append(ch);
                            break;
                        }
                        tab = tab.replaceFirst("\t", "");
                        if (isBlock && str.charAt(i + 1) == '*'
                                && str.charAt(i + 2) == '/') {
                            result.append(ch);
                            break;
                        }
                        result.append(ch + "\n" + tab);
                        break;
                    case ';':
                        if (isComment) {
                            result.append(ch);
                            break;
                        }
                        if (isBlock) {
                            result.append(ch + "\n" + tab);
                            break;
                        }
                        result.append(ch);
                        if (!str.contains("/")) {
                            result.append("\n" + tab);
                        }
                        break;
                    case '/':
                        if (str.charAt(i + 1) == '*') {
                            result.append("/*");
                            isBlock = true;
                            i++;
                            break;
                        } else if (str.charAt(i + 1) == '/') {
                            isComment = true;
                            result.append(ch);
                            break;
                        }
                        result.append(ch);
                        break;
                    case '*':

                        if (str.charAt(i + 1) == '/') {
                            isBlock = false;
                            result.append("*/" + "\n" + tab);
                            i++;
                            break;
                        }
                        result.append(ch);
                        break;
                    case '"':
                        result.append(ch);
                        break;
                    case '\n':
                        if (isComment) {
                            isComment = false;
                            result.append(ch);
                        }
                        result.append(tab);
                        break;
                    default:
                        result.append(ch);
                        break;
                }

                iw.writeChar(result.toString());
                result.setLength(0);
            }
        }
        iw.close();

    }

    /**
     * Method for reading string.
     * @param r file for reading
     * @return read string
     * @throws IOException - exception
     */

    public final String readString(final IReader r) throws IOException {
        StringBuilder result = new StringBuilder();
        while (r.hasChars()) {
            char ch = r.readChar();
            if (ch != '{' && ch != ';' && ch != '}' && ch != '"'
                    && ch != '/' && ch != '\n' && ch != '\\'
                    && ch != ' ' && ch != '\t' && ch != ')' && ch != '*') {
                result.append(ch);
                break;
            }
            result.append(ch);
        }
        return result.toString();
    }


}

