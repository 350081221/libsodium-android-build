package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class LoggingSessionOutputBuffer implements SessionOutputBuffer {
    private final SessionOutputBuffer out;
    private final Wire wire;

    public LoggingSessionOutputBuffer(SessionOutputBuffer out, Wire wire) {
        this.out = out;
        this.wire = wire;
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] b5, int off, int len) throws IOException {
        this.out.write(b5, off, len);
        if (this.wire.enabled()) {
            this.wire.output(b5, off, len);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(int b5) throws IOException {
        this.out.write(b5);
        if (this.wire.enabled()) {
            this.wire.output(b5);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] b5) throws IOException {
        this.out.write(b5);
        if (this.wire.enabled()) {
            this.wire.output(b5);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer buffer) throws IOException {
        this.out.writeLine(buffer);
        if (this.wire.enabled()) {
            String s5 = new String(buffer.buffer(), 0, buffer.length());
            this.wire.output(s5 + "[EOL]");
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(String s5) throws IOException {
        this.out.writeLine(s5);
        if (this.wire.enabled()) {
            this.wire.output(s5 + "[EOL]");
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.out.getMetrics();
    }
}
