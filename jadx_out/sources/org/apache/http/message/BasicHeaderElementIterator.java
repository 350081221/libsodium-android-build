package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class BasicHeaderElementIterator implements HeaderElementIterator {
    private CharArrayBuffer buffer;
    private HeaderElement currentElement;
    private ParserCursor cursor;
    private final HeaderIterator headerIt;
    private final HeaderValueParser parser;

    public BasicHeaderElementIterator(HeaderIterator headerIterator, HeaderValueParser parser) {
        this.currentElement = null;
        this.buffer = null;
        this.cursor = null;
        if (headerIterator == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        }
        if (parser == null) {
            throw new IllegalArgumentException("Parser may not be null");
        }
        this.headerIt = headerIterator;
        this.parser = parser;
    }

    public BasicHeaderElementIterator(HeaderIterator headerIterator) {
        this(headerIterator, BasicHeaderValueParser.DEFAULT);
    }

    private void bufferHeaderValue() {
        this.cursor = null;
        this.buffer = null;
        while (this.headerIt.hasNext()) {
            Header h5 = this.headerIt.nextHeader();
            if (h5 instanceof FormattedHeader) {
                this.buffer = ((FormattedHeader) h5).getBuffer();
                this.cursor = new ParserCursor(0, this.buffer.length());
                this.cursor.updatePos(((FormattedHeader) h5).getValuePos());
                return;
            } else {
                String value = h5.getValue();
                if (value != null) {
                    this.buffer = new CharArrayBuffer(value.length());
                    this.buffer.append(value);
                    this.cursor = new ParserCursor(0, this.buffer.length());
                    return;
                }
            }
        }
    }

    private void parseNextElement() {
        HeaderElement e5;
        loop0: while (true) {
            if (this.headerIt.hasNext() || this.cursor != null) {
                if (this.cursor == null || this.cursor.atEnd()) {
                    bufferHeaderValue();
                }
                if (this.cursor != null) {
                    while (!this.cursor.atEnd()) {
                        e5 = this.parser.parseHeaderElement(this.buffer, this.cursor);
                        if (e5.getName().length() != 0 || e5.getValue() != null) {
                            break loop0;
                        }
                    }
                    if (this.cursor.atEnd()) {
                        this.cursor = null;
                        this.buffer = null;
                    }
                }
            } else {
                return;
            }
        }
        this.currentElement = e5;
    }

    @Override // org.apache.http.HeaderElementIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.currentElement == null) {
            parseNextElement();
        }
        return this.currentElement != null;
    }

    @Override // org.apache.http.HeaderElementIterator
    public HeaderElement nextElement() throws NoSuchElementException {
        if (this.currentElement == null) {
            parseNextElement();
        }
        if (this.currentElement == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        HeaderElement element = this.currentElement;
        this.currentElement = null;
        return element;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return nextElement();
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
