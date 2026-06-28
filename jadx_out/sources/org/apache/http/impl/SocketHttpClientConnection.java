package org.apache.http.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.HttpInetConnection;
import org.apache.http.impl.io.SocketInputBuffer;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class SocketHttpClientConnection extends AbstractHttpClientConnection implements HttpInetConnection {
    private volatile boolean open;

    /* renamed from: socket, reason: collision with root package name */
    private Socket f21090socket = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public void assertNotOpen() {
        if (this.open) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.AbstractHttpClientConnection
    public void assertOpen() {
        if (!this.open) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SessionInputBuffer createSessionInputBuffer(Socket socket2, int buffersize, HttpParams params) throws IOException {
        return new SocketInputBuffer(socket2, buffersize, params);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SessionOutputBuffer createSessionOutputBuffer(Socket socket2, int buffersize, HttpParams params) throws IOException {
        return new SocketOutputBuffer(socket2, buffersize, params);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bind(Socket socket2, HttpParams params) throws IOException {
        if (socket2 == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.f21090socket = socket2;
        int buffersize = HttpConnectionParams.getSocketBufferSize(params);
        init(createSessionInputBuffer(socket2, buffersize, params), createSessionOutputBuffer(socket2, buffersize, params), params);
        this.open = true;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.open;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Socket getSocket() {
        return this.f21090socket;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        if (this.f21090socket != null) {
            return this.f21090socket.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        if (this.f21090socket != null) {
            return this.f21090socket.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        if (this.f21090socket != null) {
            return this.f21090socket.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        if (this.f21090socket != null) {
            return this.f21090socket.getPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int timeout) {
        assertOpen();
        if (this.f21090socket != null) {
            try {
                this.f21090socket.setSoTimeout(timeout);
            } catch (SocketException e5) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        if (this.f21090socket == null) {
            return -1;
        }
        try {
            return this.f21090socket.getSoTimeout();
        } catch (SocketException e5) {
            return -1;
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        this.open = false;
        Socket tmpsocket = this.f21090socket;
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
                this.f21090socket.shutdownOutput();
            } catch (IOException e5) {
            }
            try {
                this.f21090socket.shutdownInput();
            } catch (IOException e6) {
            }
        } catch (UnsupportedOperationException e7) {
        }
        this.f21090socket.close();
    }
}
