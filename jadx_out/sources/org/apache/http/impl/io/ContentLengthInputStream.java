package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.io.SessionInputBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class ContentLengthInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private long contentLength;
    private SessionInputBuffer in;
    private long pos = 0;
    private boolean closed = false;

    public ContentLengthInputStream(SessionInputBuffer in, long contentLength) {
        this.in = null;
        if (in == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (contentLength < 0) {
            throw new IllegalArgumentException("Content length may not be negative");
        }
        this.in = in;
        this.contentLength = contentLength;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            try {
                byte[] buffer = new byte[2048];
                do {
                } while (read(buffer) >= 0);
            } finally {
                this.closed = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.pos >= this.contentLength) {
            return -1;
        }
        this.pos++;
        return this.in.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] b5, int off, int len) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.pos >= this.contentLength) {
            return -1;
        }
        if (this.pos + len > this.contentLength) {
            len = (int) (this.contentLength - this.pos);
        }
        int count = this.in.read(b5, off, len);
        this.pos += count;
        return count;
    }

    @Override // java.io.InputStream
    public int read(byte[] b5) throws IOException {
        return read(b5, 0, b5.length);
    }

    @Override // java.io.InputStream
    public long skip(long n5) throws IOException {
        int l5;
        if (n5 <= 0) {
            return 0L;
        }
        byte[] buffer = new byte[2048];
        long remaining = Math.min(n5, this.contentLength - this.pos);
        long remaining2 = remaining;
        long remaining3 = 0;
        while (remaining2 > 0 && (l5 = read(buffer, 0, (int) Math.min(2048L, remaining2))) != -1) {
            remaining3 += l5;
            remaining2 -= l5;
        }
        this.pos += remaining3;
        return remaining3;
    }
}
