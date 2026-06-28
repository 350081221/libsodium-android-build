package org.apache.http.impl.io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class IdentityOutputStream extends OutputStream {
    private boolean closed = false;
    private final SessionOutputBuffer out;

    public IdentityOutputStream(SessionOutputBuffer out) {
        if (out == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        }
        this.out = out;
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
        this.out.write(b5, off, len);
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
        this.out.write(b5);
    }
}
