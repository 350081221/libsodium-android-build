package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {
    private EofSensorWatcher eofWatcher;
    private boolean selfClosed;
    protected InputStream wrappedStream;

    public EofSensorInputStream(InputStream in, EofSensorWatcher watcher) {
        if (in == null) {
            throw new IllegalArgumentException("Wrapped stream may not be null.");
        }
        this.wrappedStream = in;
        this.selfClosed = false;
        this.eofWatcher = watcher;
    }

    protected boolean isReadAllowed() throws IOException {
        if (this.selfClosed) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.wrappedStream != null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int l5 = this.wrappedStream.read();
            checkEOF(l5);
            return l5;
        } catch (IOException ex) {
            checkAbort();
            throw ex;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b5, int off, int len) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int l5 = this.wrappedStream.read(b5, off, len);
            checkEOF(l5);
            return l5;
        } catch (IOException ex) {
            checkAbort();
            throw ex;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b5) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int l5 = this.wrappedStream.read(b5);
            checkEOF(l5);
            return l5;
        } catch (IOException ex) {
            checkAbort();
            throw ex;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!isReadAllowed()) {
            return 0;
        }
        try {
            int a5 = this.wrappedStream.available();
            return a5;
        } catch (IOException ex) {
            checkAbort();
            throw ex;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.selfClosed = true;
        checkClose();
    }

    protected void checkEOF(int eof) throws IOException {
        if (this.wrappedStream != null && eof < 0) {
            boolean scws = true;
            try {
                if (this.eofWatcher != null) {
                    scws = this.eofWatcher.eofDetected(this.wrappedStream);
                }
                if (scws) {
                    this.wrappedStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    protected void checkClose() throws IOException {
        if (this.wrappedStream != null) {
            boolean scws = true;
            try {
                if (this.eofWatcher != null) {
                    scws = this.eofWatcher.streamClosed(this.wrappedStream);
                }
                if (scws) {
                    this.wrappedStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    protected void checkAbort() throws IOException {
        if (this.wrappedStream != null) {
            boolean scws = true;
            try {
                if (this.eofWatcher != null) {
                    scws = this.eofWatcher.streamAbort(this.wrappedStream);
                }
                if (scws) {
                    this.wrappedStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() throws IOException {
        close();
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() throws IOException {
        this.selfClosed = true;
        checkAbort();
    }
}
