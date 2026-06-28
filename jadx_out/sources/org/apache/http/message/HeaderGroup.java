package org.apache.http.message;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class HeaderGroup implements Cloneable {
    private List headers = new ArrayList(16);

    public void clear() {
        this.headers.clear();
    }

    public void addHeader(Header header) {
        if (header == null) {
            return;
        }
        this.headers.add(header);
    }

    public void removeHeader(Header header) {
        if (header == null) {
            return;
        }
        this.headers.remove(header);
    }

    public void updateHeader(Header header) {
        if (header == null) {
            return;
        }
        for (int i5 = 0; i5 < this.headers.size(); i5++) {
            Header current = (Header) this.headers.get(i5);
            if (current.getName().equalsIgnoreCase(header.getName())) {
                this.headers.set(i5, header);
                return;
            }
        }
        this.headers.add(header);
    }

    public void setHeaders(Header[] headers) {
        clear();
        if (headers == null) {
            return;
        }
        for (Header header : headers) {
            this.headers.add(header);
        }
    }

    public Header getCondensedHeader(String name) {
        Header[] headers = getHeaders(name);
        if (headers.length == 0) {
            return null;
        }
        int i5 = 1;
        if (headers.length == 1) {
            return headers[0];
        }
        CharArrayBuffer valueBuffer = new CharArrayBuffer(128);
        valueBuffer.append(headers[0].getValue());
        while (true) {
            int i6 = i5;
            int i7 = headers.length;
            if (i6 < i7) {
                valueBuffer.append(", ");
                valueBuffer.append(headers[i6].getValue());
                i5 = i6 + 1;
            } else {
                return new BasicHeader(name.toLowerCase(Locale.ENGLISH), valueBuffer.toString());
            }
        }
    }

    public Header[] getHeaders(String name) {
        ArrayList headersFound = new ArrayList();
        for (int i5 = 0; i5 < this.headers.size(); i5++) {
            Header header = (Header) this.headers.get(i5);
            if (header.getName().equalsIgnoreCase(name)) {
                headersFound.add(header);
            }
        }
        int i6 = headersFound.size();
        return (Header[]) headersFound.toArray(new Header[i6]);
    }

    public Header getFirstHeader(String name) {
        for (int i5 = 0; i5 < this.headers.size(); i5++) {
            Header header = (Header) this.headers.get(i5);
            if (header.getName().equalsIgnoreCase(name)) {
                return header;
            }
        }
        return null;
    }

    public Header getLastHeader(String name) {
        for (int i5 = this.headers.size() - 1; i5 >= 0; i5--) {
            Header header = (Header) this.headers.get(i5);
            if (header.getName().equalsIgnoreCase(name)) {
                return header;
            }
        }
        return null;
    }

    public Header[] getAllHeaders() {
        return (Header[]) this.headers.toArray(new Header[this.headers.size()]);
    }

    public boolean containsHeader(String name) {
        for (int i5 = 0; i5 < this.headers.size(); i5++) {
            Header header = (Header) this.headers.get(i5);
            if (header.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public HeaderIterator iterator() {
        return new BasicListHeaderIterator(this.headers, null);
    }

    public HeaderIterator iterator(String name) {
        return new BasicListHeaderIterator(this.headers, name);
    }

    public HeaderGroup copy() {
        HeaderGroup clone = new HeaderGroup();
        clone.headers.addAll(this.headers);
        return clone;
    }

    public Object clone() throws CloneNotSupportedException {
        HeaderGroup clone = (HeaderGroup) super.clone();
        clone.headers = new ArrayList(this.headers);
        return clone;
    }
}
