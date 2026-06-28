package org.apache.http.util;

import org.apache.http.protocol.HTTP;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public final class CharArrayBuffer {
    private char[] buffer;
    private int len;

    public CharArrayBuffer(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.buffer = new char[capacity];
    }

    private void expand(int newlen) {
        char[] newbuffer = new char[Math.max(this.buffer.length << 1, newlen)];
        System.arraycopy(this.buffer, 0, newbuffer, 0, this.len);
        this.buffer = newbuffer;
    }

    public void append(char[] b5, int off, int len) {
        if (b5 == null) {
            return;
        }
        if (off < 0 || off > b5.length || len < 0 || off + len < 0 || off + len > b5.length) {
            throw new IndexOutOfBoundsException();
        }
        if (len == 0) {
            return;
        }
        int newlen = this.len + len;
        if (newlen > this.buffer.length) {
            expand(newlen);
        }
        System.arraycopy(b5, off, this.buffer, this.len, len);
        this.len = newlen;
    }

    public void append(String str) {
        if (str == null) {
            str = "null";
        }
        int strlen = str.length();
        int newlen = this.len + strlen;
        if (newlen > this.buffer.length) {
            expand(newlen);
        }
        str.getChars(0, strlen, this.buffer, this.len);
        this.len = newlen;
    }

    public void append(CharArrayBuffer b5, int off, int len) {
        if (b5 == null) {
            return;
        }
        append(b5.buffer, off, len);
    }

    public void append(CharArrayBuffer b5) {
        if (b5 == null) {
            return;
        }
        append(b5.buffer, 0, b5.len);
    }

    public void append(char ch) {
        int newlen = this.len + 1;
        if (newlen > this.buffer.length) {
            expand(newlen);
        }
        this.buffer[this.len] = ch;
        this.len = newlen;
    }

    public void append(byte[] bArr, int off, int len) {
        if (bArr == 0) {
            return;
        }
        if (off < 0 || off > bArr.length || len < 0 || off + len < 0 || off + len > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (len == 0) {
            return;
        }
        int oldlen = this.len;
        int newlen = oldlen + len;
        if (newlen > this.buffer.length) {
            expand(newlen);
        }
        int i12 = off;
        for (int i13 = oldlen; i13 < newlen; i13++) {
            int i5 = bArr[i12];
            if (i5 < 0) {
                i5 += 256;
            }
            this.buffer[i13] = (char) i5;
            i12++;
        }
        this.len = newlen;
    }

    public void append(ByteArrayBuffer b5, int off, int len) {
        if (b5 == null) {
            return;
        }
        append(b5.buffer(), off, len);
    }

    public void append(Object obj) {
        append(String.valueOf(obj));
    }

    public void clear() {
        this.len = 0;
    }

    public char[] toCharArray() {
        char[] b5 = new char[this.len];
        if (this.len > 0) {
            System.arraycopy(this.buffer, 0, b5, 0, this.len);
        }
        return b5;
    }

    public char charAt(int i5) {
        return this.buffer[i5];
    }

    public char[] buffer() {
        return this.buffer;
    }

    public int capacity() {
        return this.buffer.length;
    }

    public int length() {
        return this.len;
    }

    public void ensureCapacity(int required) {
        int available = this.buffer.length - this.len;
        if (required > available) {
            expand(this.len + required);
        }
    }

    public void setLength(int len) {
        if (len < 0 || len > this.buffer.length) {
            throw new IndexOutOfBoundsException();
        }
        this.len = len;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    public boolean isFull() {
        return this.len == this.buffer.length;
    }

    public int indexOf(int ch, int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            beginIndex = 0;
        }
        if (endIndex > this.len) {
            endIndex = this.len;
        }
        if (beginIndex > endIndex) {
            return -1;
        }
        for (int i5 = beginIndex; i5 < endIndex; i5++) {
            if (this.buffer[i5] == ch) {
                return i5;
            }
        }
        return -1;
    }

    public int indexOf(int ch) {
        return indexOf(ch, 0, this.len);
    }

    public String substring(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (endIndex > this.len) {
            throw new IndexOutOfBoundsException();
        }
        if (beginIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.buffer, beginIndex, endIndex - beginIndex);
    }

    public String substringTrimmed(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (endIndex > this.len) {
            throw new IndexOutOfBoundsException();
        }
        if (beginIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }
        while (beginIndex < endIndex && HTTP.isWhitespace(this.buffer[beginIndex])) {
            beginIndex++;
        }
        while (endIndex > beginIndex && HTTP.isWhitespace(this.buffer[endIndex - 1])) {
            endIndex--;
        }
        return new String(this.buffer, beginIndex, endIndex - beginIndex);
    }

    public String toString() {
        return new String(this.buffer, 0, this.len);
    }
}
