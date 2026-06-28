package org.apache.http.impl.io;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public abstract class AbstractMessageParser implements HttpMessageParser {
    protected final LineParser lineParser;
    private final int maxHeaderCount;
    private final int maxLineLen;
    private final SessionInputBuffer sessionBuffer;

    protected abstract HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException;

    public AbstractMessageParser(SessionInputBuffer buffer, LineParser parser, HttpParams params) {
        if (buffer == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.sessionBuffer = buffer;
        this.maxHeaderCount = params.getIntParameter("http.connection.max-header-count", -1);
        this.maxLineLen = params.getIntParameter("http.connection.max-line-length", -1);
        this.lineParser = parser != null ? parser : BasicLineParser.DEFAULT;
    }

    public static Header[] parseHeaders(SessionInputBuffer inbuffer, int maxHeaderCount, int maxLineLen, LineParser parser) throws HttpException, IOException {
        int i5;
        int i6;
        char ch;
        if (inbuffer == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (parser == null) {
            parser = BasicLineParser.DEFAULT;
        }
        ArrayList headerLines = new ArrayList();
        CharArrayBuffer current = null;
        CharArrayBuffer previous = null;
        while (true) {
            if (current == null) {
                current = new CharArrayBuffer(64);
            } else {
                current.clear();
            }
            int l5 = inbuffer.readLine(current);
            i5 = 0;
            if (l5 == -1 || current.length() < 1) {
                break;
            }
            if ((current.charAt(0) == ' ' || current.charAt(0) == '\t') && previous != null) {
                while (true) {
                    i6 = i5;
                    if (i6 >= current.length() || !((ch = current.charAt(i6)) == ' ' || ch == '\t')) {
                        break;
                    }
                    i5 = i6 + 1;
                }
                if (maxLineLen > 0 && ((previous.length() + 1) + current.length()) - i6 > maxLineLen) {
                    throw new IOException("Maximum line length limit exceeded");
                }
                previous.append(' ');
                previous.append(current, i6, current.length() - i6);
            } else {
                headerLines.add(current);
                previous = current;
                current = null;
            }
            if (maxHeaderCount > 0 && headerLines.size() >= maxHeaderCount) {
                throw new IOException("Maximum header count exceeded");
            }
        }
        Header[] headers = new Header[headerLines.size()];
        while (true) {
            int i7 = i5;
            if (i7 < headerLines.size()) {
                CharArrayBuffer buffer = (CharArrayBuffer) headerLines.get(i7);
                try {
                    headers[i7] = parser.parseHeader(buffer);
                    i5 = i7 + 1;
                } catch (ParseException ex) {
                    throw new ProtocolException(ex.getMessage());
                }
            } else {
                return headers;
            }
        }
    }

    @Override // org.apache.http.io.HttpMessageParser
    public HttpMessage parse() throws IOException, HttpException {
        try {
            HttpMessage message = parseHead(this.sessionBuffer);
            Header[] headers = parseHeaders(this.sessionBuffer, this.maxHeaderCount, this.maxLineLen, this.lineParser);
            message.setHeaders(headers);
            return message;
        } catch (ParseException px) {
            throw new ProtocolException(px.getMessage(), px);
        }
    }
}
