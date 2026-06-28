package org.apache.http.message;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class BasicHeaderValueParser implements HeaderValueParser {
    public static final BasicHeaderValueParser DEFAULT = new BasicHeaderValueParser();
    private static final char PARAM_DELIMITER = ';';
    private static final char ELEM_DELIMITER = ',';
    private static final char[] ALL_DELIMITERS = {PARAM_DELIMITER, ELEM_DELIMITER};

    public static final HeaderElement[] parseElements(String value, HeaderValueParser parser) throws ParseException {
        if (value == null) {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        if (parser == null) {
            parser = DEFAULT;
        }
        CharArrayBuffer buffer = new CharArrayBuffer(value.length());
        buffer.append(value);
        ParserCursor cursor = new ParserCursor(0, value.length());
        return parser.parseElements(buffer, cursor);
    }

    @Override // org.apache.http.message.HeaderValueParser
    public HeaderElement[] parseElements(CharArrayBuffer buffer, ParserCursor cursor) {
        if (buffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (cursor == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        List elements = new ArrayList();
        while (!cursor.atEnd()) {
            HeaderElement element = parseHeaderElement(buffer, cursor);
            if (element.getName().length() != 0 || element.getValue() != null) {
                elements.add(element);
            }
        }
        return (HeaderElement[]) elements.toArray(new HeaderElement[elements.size()]);
    }

    public static final HeaderElement parseHeaderElement(String value, HeaderValueParser parser) throws ParseException {
        if (value == null) {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        if (parser == null) {
            parser = DEFAULT;
        }
        CharArrayBuffer buffer = new CharArrayBuffer(value.length());
        buffer.append(value);
        ParserCursor cursor = new ParserCursor(0, value.length());
        return parser.parseHeaderElement(buffer, cursor);
    }

    @Override // org.apache.http.message.HeaderValueParser
    public HeaderElement parseHeaderElement(CharArrayBuffer buffer, ParserCursor cursor) {
        if (buffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (cursor == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        NameValuePair nvp = parseNameValuePair(buffer, cursor);
        NameValuePair[] params = null;
        if (!cursor.atEnd()) {
            char ch = buffer.charAt(cursor.getPos() - 1);
            if (ch != ',') {
                params = parseParameters(buffer, cursor);
            }
        }
        return createHeaderElement(nvp.getName(), nvp.getValue(), params);
    }

    protected HeaderElement createHeaderElement(String name, String value, NameValuePair[] params) {
        return new BasicHeaderElement(name, value, params);
    }

    public static final NameValuePair[] parseParameters(String value, HeaderValueParser parser) throws ParseException {
        if (value == null) {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        if (parser == null) {
            parser = DEFAULT;
        }
        CharArrayBuffer buffer = new CharArrayBuffer(value.length());
        buffer.append(value);
        ParserCursor cursor = new ParserCursor(0, value.length());
        return parser.parseParameters(buffer, cursor);
    }

    @Override // org.apache.http.message.HeaderValueParser
    public NameValuePair[] parseParameters(CharArrayBuffer buffer, ParserCursor cursor) {
        if (buffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (cursor == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        int pos = cursor.getPos();
        int indexTo = cursor.getUpperBound();
        while (pos < indexTo) {
            char ch = buffer.charAt(pos);
            if (!HTTP.isWhitespace(ch)) {
                break;
            }
            pos++;
        }
        cursor.updatePos(pos);
        if (cursor.atEnd()) {
            return new NameValuePair[0];
        }
        List params = new ArrayList();
        while (!cursor.atEnd()) {
            NameValuePair param = parseNameValuePair(buffer, cursor);
            params.add(param);
            char ch2 = buffer.charAt(cursor.getPos() - 1);
            if (ch2 == ',') {
                break;
            }
        }
        return (NameValuePair[]) params.toArray(new NameValuePair[params.size()]);
    }

    public static final NameValuePair parseNameValuePair(String value, HeaderValueParser parser) throws ParseException {
        if (value == null) {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        if (parser == null) {
            parser = DEFAULT;
        }
        CharArrayBuffer buffer = new CharArrayBuffer(value.length());
        buffer.append(value);
        ParserCursor cursor = new ParserCursor(0, value.length());
        return parser.parseNameValuePair(buffer, cursor);
    }

    @Override // org.apache.http.message.HeaderValueParser
    public NameValuePair parseNameValuePair(CharArrayBuffer buffer, ParserCursor cursor) {
        return parseNameValuePair(buffer, cursor, ALL_DELIMITERS);
    }

    private static boolean isOneOf(char ch, char[] chs) {
        if (chs != null) {
            for (char c5 : chs) {
                if (ch == c5) {
                    return true;
                }
            }
        }
        return false;
    }

    public NameValuePair parseNameValuePair(CharArrayBuffer buffer, ParserCursor cursor, char[] delimiters) {
        String name;
        boolean z4;
        if (buffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (cursor == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        boolean terminated = false;
        int pos = cursor.getPos();
        int indexFrom = cursor.getPos();
        int indexTo = cursor.getUpperBound();
        int pos2 = pos;
        while (true) {
            if (pos2 < indexTo) {
                char ch = buffer.charAt(pos2);
                if (ch == '=') {
                    break;
                }
                if (isOneOf(ch, delimiters)) {
                    terminated = true;
                    break;
                }
                pos2++;
            } else {
                break;
            }
        }
        if (pos2 == indexTo) {
            terminated = true;
            name = buffer.substringTrimmed(indexFrom, indexTo);
        } else {
            name = buffer.substringTrimmed(indexFrom, pos2);
            pos2++;
        }
        if (terminated) {
            cursor.updatePos(pos2);
            return createNameValuePair(name, null);
        }
        int i12 = pos2;
        boolean qouted = false;
        int pos3 = pos2;
        int pos4 = 0;
        while (true) {
            if (pos3 >= indexTo) {
                break;
            }
            char ch2 = buffer.charAt(pos3);
            int i5 = 1;
            if (ch2 == '\"' && pos4 == 0) {
                if (qouted) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                qouted = z4;
            }
            if (!qouted && pos4 == 0 && isOneOf(ch2, delimiters)) {
                terminated = true;
                break;
            }
            if (pos4 != 0) {
                pos4 = 0;
            } else {
                if (!qouted || ch2 != '\\') {
                    i5 = 0;
                }
                pos4 = i5;
            }
            pos3++;
        }
        int i13 = i12;
        int i22 = pos3;
        while (i13 < i22 && HTTP.isWhitespace(buffer.charAt(i13))) {
            i13++;
        }
        while (i22 > i13 && HTTP.isWhitespace(buffer.charAt(i22 - 1))) {
            i22--;
        }
        if (i22 - i13 >= 2 && buffer.charAt(i13) == '\"' && buffer.charAt(i22 - 1) == '\"') {
            i13++;
            i22--;
        }
        String value = buffer.substring(i13, i22);
        if (terminated) {
            pos3++;
        }
        cursor.updatePos(pos3);
        return createNameValuePair(name, value);
    }

    protected NameValuePair createNameValuePair(String name, String value) {
        return new BasicNameValuePair(name, value);
    }
}
