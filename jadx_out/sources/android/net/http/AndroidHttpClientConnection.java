package android.net.http;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.impl.HttpConnectionMetricsImpl;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.HttpRequestWriter;
import org.apache.http.impl.io.IdentityInputStream;
import org.apache.http.impl.io.SocketInputBuffer;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* loaded from: assets/org.apache.http.legacy.boot */
public class AndroidHttpClientConnection implements HttpInetConnection, org.apache.http.HttpConnection {
    private int maxHeaderCount;
    private int maxLineLength;
    private volatile boolean open;
    private SessionInputBuffer inbuffer = null;
    private SessionOutputBuffer outbuffer = null;
    private HttpMessageWriter requestWriter = null;
    private HttpConnectionMetricsImpl metrics = null;

    /* renamed from: socket, reason: collision with root package name */
    private Socket f180socket = null;
    private final EntitySerializer entityserializer = new EntitySerializer(new StrictContentLengthStrategy());

    public void bind(Socket socket2, HttpParams params) throws IOException {
        if (socket2 == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        assertNotOpen();
        socket2.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(params));
        socket2.setSoTimeout(HttpConnectionParams.getSoTimeout(params));
        int linger = HttpConnectionParams.getLinger(params);
        if (linger >= 0) {
            socket2.setSoLinger(linger > 0, linger);
        }
        this.f180socket = socket2;
        int buffersize = HttpConnectionParams.getSocketBufferSize(params);
        this.inbuffer = new SocketInputBuffer(socket2, buffersize, params);
        this.outbuffer = new SocketOutputBuffer(socket2, buffersize, params);
        this.maxHeaderCount = params.getIntParameter("http.connection.max-header-count", -1);
        this.maxLineLength = params.getIntParameter("http.connection.max-line-length", -1);
        this.requestWriter = new HttpRequestWriter(this.outbuffer, null, params);
        this.metrics = new HttpConnectionMetricsImpl(this.inbuffer.getMetrics(), this.outbuffer.getMetrics());
        this.open = true;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(getClass().getSimpleName());
        buffer.append("[");
        if (isOpen()) {
            buffer.append(getRemotePort());
        } else {
            buffer.append("closed");
        }
        buffer.append("]");
        return buffer.toString();
    }

    private void assertNotOpen() {
        if (this.open) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    private void assertOpen() {
        if (!this.open) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.open && this.f180socket != null && this.f180socket.isConnected();
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        if (this.f180socket != null) {
            return this.f180socket.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        if (this.f180socket != null) {
            return this.f180socket.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        if (this.f180socket != null) {
            return this.f180socket.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        if (this.f180socket != null) {
            return this.f180socket.getPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int timeout) {
        assertOpen();
        if (this.f180socket != null) {
            try {
                this.f180socket.setSoTimeout(timeout);
            } catch (SocketException e5) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        if (this.f180socket == null) {
            return -1;
        }
        try {
            return this.f180socket.getSoTimeout();
        } catch (SocketException e5) {
            return -1;
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        this.open = false;
        Socket tmpsocket = this.f180socket;
        if (tmpsocket != null) {
            tmpsocket.close();
        }
    }

    @Override // org.apache.http.HttpConnection
    public void close() throws IOException {
        if (!this.open) {
            return;
        }
        this.open = false;
        doFlush();
        try {
            try {
                this.f180socket.shutdownOutput();
            } catch (IOException e5) {
            }
            try {
                this.f180socket.shutdownInput();
            } catch (IOException e6) {
            }
        } catch (UnsupportedOperationException e7) {
        }
        this.f180socket.close();
    }

    public void sendRequestHeader(HttpRequest request) throws org.apache.http.HttpException, IOException {
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        assertOpen();
        this.requestWriter.write(request);
        this.metrics.incrementRequestCount();
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest request) throws org.apache.http.HttpException, IOException {
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        assertOpen();
        if (request.getEntity() == null) {
            return;
        }
        this.entityserializer.serialize(this.outbuffer, request, request.getEntity());
    }

    protected void doFlush() throws IOException {
        this.outbuffer.flush();
    }

    public void flush() throws IOException {
        assertOpen();
        doFlush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        if (r9 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        r20.parseHeader(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        if (r6 < 200) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r19.metrics.incrementResponseCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cf, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.http.StatusLine parseResponseHeader(android.net.http.Headers r20) throws java.io.IOException, org.apache.http.ParseException {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.net.http.AndroidHttpClientConnection.parseResponseHeader(android.net.http.Headers):org.apache.http.StatusLine");
    }

    public HttpEntity receiveResponseEntity(Headers headers) {
        assertOpen();
        BasicHttpEntity entity = new BasicHttpEntity();
        long len = determineLength(headers);
        if (len == -2) {
            entity.setChunked(true);
            entity.setContentLength(-1L);
            entity.setContent(new ChunkedInputStream(this.inbuffer));
        } else if (len == -1) {
            entity.setChunked(false);
            entity.setContentLength(-1L);
            entity.setContent(new IdentityInputStream(this.inbuffer));
        } else {
            entity.setChunked(false);
            entity.setContentLength(len);
            entity.setContent(new ContentLengthInputStream(this.inbuffer, len));
        }
        String contentTypeHeader = headers.getContentType();
        if (contentTypeHeader != null) {
            entity.setContentType(contentTypeHeader);
        }
        String contentEncodingHeader = headers.getContentEncoding();
        if (contentEncodingHeader != null) {
            entity.setContentEncoding(contentEncodingHeader);
        }
        return entity;
    }

    private long determineLength(Headers headers) {
        long transferEncoding = headers.getTransferEncoding();
        if (transferEncoding < 0) {
            return transferEncoding;
        }
        long contentlen = headers.getContentLength();
        if (contentlen <= -1) {
            return -1L;
        }
        return contentlen;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        assertOpen();
        try {
            this.inbuffer.isDataAvailable(1);
            return false;
        } catch (IOException e5) {
            return true;
        }
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return this.metrics;
    }
}
