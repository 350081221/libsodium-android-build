package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class LoggingSessionInputBuffer implements SessionInputBuffer {
    private final SessionInputBuffer in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer in, Wire wire) {
        this.in = in;
        this.wire = wire;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int timeout) throws IOException {
        return this.in.isDataAvailable(timeout);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] b5, int off, int len) throws IOException {
        int l5 = this.in.read(b5, off, len);
        if (this.wire.enabled() && l5 > 0) {
            this.wire.input(b5, off, l5);
        }
        return l5;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read() throws IOException {
        int l5 = this.in.read();
        if (this.wire.enabled() && l5 > 0) {
            this.wire.input(l5);
        }
        return l5;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] b5) throws IOException {
        int l5 = this.in.read(b5);
        if (this.wire.enabled() && l5 > 0) {
            this.wire.input(b5, 0, l5);
        }
        return l5;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public String readLine() throws IOException {
        String s5 = this.in.readLine();
        if (this.wire.enabled() && s5 != null) {
            this.wire.input(s5 + "[EOL]");
        }
        return s5;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int readLine(CharArrayBuffer buffer) throws IOException {
        int l5 = this.in.readLine(buffer);
        if (this.wire.enabled() && l5 > 0) {
            int pos = buffer.length() - l5;
            String s5 = new String(buffer.buffer(), pos, l5);
            this.wire.input(s5 + "[EOL]");
        }
        return l5;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.in.getMetrics();
    }
}
