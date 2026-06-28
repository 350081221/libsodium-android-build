package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import kotlin.y1;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public abstract class AbstractSessionInputBuffer implements SessionInputBuffer {
    private byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private InputStream instream;
    private HttpTransportMetricsImpl metrics;
    private ByteArrayBuffer linebuffer = null;
    private String charset = "US-ASCII";
    private boolean ascii = true;
    private int maxLineLen = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(InputStream instream, int buffersize, HttpParams params) {
        if (instream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (buffersize <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.instream = instream;
        this.buffer = new byte[buffersize];
        this.bufferpos = 0;
        this.bufferlen = 0;
        this.linebuffer = new ByteArrayBuffer(buffersize);
        this.charset = HttpProtocolParams.getHttpElementCharset(params);
        this.ascii = this.charset.equalsIgnoreCase("US-ASCII") || this.charset.equalsIgnoreCase(HTTP.ASCII);
        this.maxLineLen = params.getIntParameter("http.connection.max-line-length", -1);
        this.metrics = new HttpTransportMetricsImpl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int fillBuffer() throws IOException {
        if (this.bufferpos > 0) {
            int len = this.bufferlen - this.bufferpos;
            if (len > 0) {
                System.arraycopy(this.buffer, this.bufferpos, this.buffer, 0, len);
            }
            this.bufferpos = 0;
            this.bufferlen = len;
        }
        int len2 = this.bufferlen;
        int l5 = this.instream.read(this.buffer, len2, this.buffer.length - len2);
        if (l5 == -1) {
            return -1;
        }
        this.bufferlen = len2 + l5;
        this.metrics.incrementBytesTransferred(l5);
        return l5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hasBufferedData() {
        return this.bufferpos < this.bufferlen;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read() throws IOException {
        while (!hasBufferedData()) {
            int noRead = fillBuffer();
            if (noRead == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i5 = this.bufferpos;
        this.bufferpos = i5 + 1;
        return bArr[i5] & y1.f19838d;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] b5, int off, int len) throws IOException {
        if (b5 == null) {
            return 0;
        }
        while (!hasBufferedData()) {
            int noRead = fillBuffer();
            if (noRead == -1) {
                return -1;
            }
        }
        int chunk = this.bufferlen - this.bufferpos;
        if (chunk > len) {
            chunk = len;
        }
        System.arraycopy(this.buffer, this.bufferpos, b5, off, chunk);
        this.bufferpos += chunk;
        return chunk;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] b5) throws IOException {
        if (b5 == null) {
            return 0;
        }
        return read(b5, 0, b5.length);
    }

    private int locateLF() {
        for (int i5 = this.bufferpos; i5 < this.bufferlen; i5++) {
            if (this.buffer[i5] == 10) {
                return i5;
            }
        }
        return -1;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int readLine(CharArrayBuffer charbuffer) throws IOException {
        if (charbuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        this.linebuffer.clear();
        int noRead = 0;
        boolean retry = true;
        while (retry) {
            int i5 = locateLF();
            if (i5 != -1) {
                if (this.linebuffer.isEmpty()) {
                    return lineFromReadBuffer(charbuffer, i5);
                }
                retry = false;
                int len = (i5 + 1) - this.bufferpos;
                this.linebuffer.append(this.buffer, this.bufferpos, len);
                this.bufferpos = i5 + 1;
            } else {
                if (hasBufferedData()) {
                    int len2 = this.bufferlen - this.bufferpos;
                    this.linebuffer.append(this.buffer, this.bufferpos, len2);
                    this.bufferpos = this.bufferlen;
                }
                noRead = fillBuffer();
                if (noRead == -1) {
                    retry = false;
                }
            }
            if (this.maxLineLen > 0 && this.linebuffer.length() >= this.maxLineLen) {
                throw new IOException("Maximum line length limit exceeded");
            }
        }
        if (noRead == -1 && this.linebuffer.isEmpty()) {
            return -1;
        }
        return lineFromLineBuffer(charbuffer);
    }

    private int lineFromLineBuffer(CharArrayBuffer charbuffer) throws IOException {
        int l5 = this.linebuffer.length();
        if (l5 > 0) {
            if (this.linebuffer.byteAt(l5 - 1) == 10) {
                l5--;
                this.linebuffer.setLength(l5);
            }
            if (l5 > 0 && this.linebuffer.byteAt(l5 - 1) == 13) {
                this.linebuffer.setLength(l5 - 1);
            }
        }
        int l6 = this.linebuffer.length();
        if (this.ascii) {
            charbuffer.append(this.linebuffer, 0, l6);
        } else {
            String s5 = new String(this.linebuffer.buffer(), 0, l6, this.charset);
            charbuffer.append(s5);
        }
        return l6;
    }

    private int lineFromReadBuffer(CharArrayBuffer charbuffer, int pos) throws IOException {
        int off = this.bufferpos;
        this.bufferpos = pos + 1;
        if (pos > off && this.buffer[pos - 1] == 13) {
            pos--;
        }
        int len = pos - off;
        if (this.ascii) {
            charbuffer.append(this.buffer, off, len);
        } else {
            String s5 = new String(this.buffer, off, len, this.charset);
            charbuffer.append(s5);
        }
        return len;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public String readLine() throws IOException {
        CharArrayBuffer charbuffer = new CharArrayBuffer(64);
        int l5 = readLine(charbuffer);
        if (l5 != -1) {
            return charbuffer.toString();
        }
        return null;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }
}
