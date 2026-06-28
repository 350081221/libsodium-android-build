package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class ContentLengthOutputStream extends OutputStream {
    private final long contentLength;
    private final SessionOutputBuffer out;
    private long total = 0;
    private boolean closed = false;

    public ContentLengthOutputStream(SessionOutputBuffer out, long contentLength) {
        if (out == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        }
        if (contentLength < 0) {
            throw new IllegalArgumentException("Content length may not be negative");
        }
        this.out = out;
        this.contentLength = contentLength;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.out.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] b5, int off, int len) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.total < this.contentLength) {
            long max = this.contentLength - this.total;
            if (len > max) {
                len = (int) max;
            }
            this.out.write(b5, off, len);
            this.total += len;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b5) throws IOException {
        write(b5, 0, b5.length);
    }

    @Override // java.io.OutputStream
    public void write(int b5) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.total < this.contentLength) {
            this.out.write(b5);
            this.total++;
        }
    }
}
