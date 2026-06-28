package org.apache.http.impl.io;

import com.umeng.analytics.pro.cx;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public abstract class AbstractSessionOutputBuffer implements SessionOutputBuffer {
    private static final byte[] CRLF = {cx.f12475k, 10};
    private static final int MAX_CHUNK = 256;
    private ByteArrayBuffer buffer;
    private HttpTransportMetricsImpl metrics;
    private OutputStream outstream;
    private String charset = "US-ASCII";
    private boolean ascii = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(OutputStream outstream, int buffersize, HttpParams params) {
        if (outstream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (buffersize <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.outstream = outstream;
        this.buffer = new ByteArrayBuffer(buffersize);
        this.charset = HttpProtocolParams.getHttpElementCharset(params);
        this.ascii = this.charset.equalsIgnoreCase("US-ASCII") || this.charset.equalsIgnoreCase(HTTP.ASCII);
        this.metrics = new HttpTransportMetricsImpl();
    }

    protected void flushBuffer() throws IOException {
        int len = this.buffer.length();
        if (len > 0) {
            this.outstream.write(this.buffer.buffer(), 0, len);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred(len);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void flush() throws IOException {
        flushBuffer();
        this.outstream.flush();
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] b5, int off, int len) throws IOException {
        if (b5 == null) {
            return;
        }
        if (len > 256 || len > this.buffer.capacity()) {
            flushBuffer();
            this.outstream.write(b5, off, len);
            this.metrics.incrementBytesTransferred(len);
        } else {
            int freecapacity = this.buffer.capacity() - this.buffer.length();
            if (len > freecapacity) {
                flushBuffer();
            }
            this.buffer.append(b5, off, len);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] b5) throws IOException {
        if (b5 == null) {
            return;
        }
        write(b5, 0, b5.length);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(int b5) throws IOException {
        if (this.buffer.isFull()) {
            flushBuffer();
        }
        this.buffer.append(b5);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(String s5) throws IOException {
        if (s5 == null) {
            return;
        }
        if (s5.length() > 0) {
            write(s5.getBytes(this.charset));
        }
        write(CRLF);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer s5) throws IOException {
        if (s5 == null) {
            return;
        }
        if (this.ascii) {
            int off = 0;
            int remaining = s5.length();
            while (remaining > 0) {
                int chunk = Math.min(this.buffer.capacity() - this.buffer.length(), remaining);
                if (chunk > 0) {
                    this.buffer.append(s5, off, chunk);
                }
                if (this.buffer.isFull()) {
                    flushBuffer();
                }
                off += chunk;
                remaining -= chunk;
            }
        } else {
            byte[] tmp = s5.toString().getBytes(this.charset);
            write(tmp);
        }
        byte[] tmp2 = CRLF;
        write(tmp2);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }
}
