package org.apache.http.util;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public final class ByteArrayBuffer {
    private byte[] buffer;
    private int len;

    public ByteArrayBuffer(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.buffer = new byte[capacity];
    }

    private void expand(int newlen) {
        byte[] newbuffer = new byte[Math.max(this.buffer.length << 1, newlen)];
        System.arraycopy(this.buffer, 0, newbuffer, 0, this.len);
        this.buffer = newbuffer;
    }

    public void append(byte[] b5, int off, int len) {
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

    public void append(int b5) {
        int newlen = this.len + 1;
        if (newlen > this.buffer.length) {
            expand(newlen);
        }
        this.buffer[this.len] = (byte) b5;
        this.len = newlen;
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
        int oldlen = this.len;
        int newlen = oldlen + len;
        if (newlen > this.buffer.length) {
            expand(newlen);
        }
        int i12 = off;
        for (int i13 = oldlen; i13 < newlen; i13++) {
            this.buffer[i13] = (byte) b5[i12];
            i12++;
        }
        this.len = newlen;
    }

    public void append(CharArrayBuffer b5, int off, int len) {
        if (b5 == null) {
            return;
        }
        append(b5.buffer(), off, len);
    }

    public void clear() {
        this.len = 0;
    }

    public byte[] toByteArray() {
        byte[] b5 = new byte[this.len];
        if (this.len > 0) {
            System.arraycopy(this.buffer, 0, b5, 0, this.len);
        }
        return b5;
    }

    public int byteAt(int i5) {
        return this.buffer[i5];
    }

    public int capacity() {
        return this.buffer.length;
    }

    public int length() {
        return this.len;
    }

    public byte[] buffer() {
        return this.buffer;
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
}
