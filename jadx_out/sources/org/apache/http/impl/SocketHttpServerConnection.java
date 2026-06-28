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
public class SocketHttpServerConnection extends AbstractHttpServerConnection implements HttpInetConnection {
    private volatile boolean open;

    /* renamed from: socket, reason: collision with root package name */
    private Socket f21091socket = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public void assertNotOpen() {
        if (this.open) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    @Override // org.apache.http.impl.AbstractHttpServerConnection
    protected void assertOpen() {
        if (!this.open) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    protected SessionInputBuffer createHttpDataReceiver(Socket socket2, int buffersize, HttpParams params) throws IOException {
        return new SocketInputBuffer(socket2, buffersize, params);
    }

    protected SessionOutputBuffer createHttpDataTransmitter(Socket socket2, int buffersize, HttpParams params) throws IOException {
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
        this.f21091socket = socket2;
        int buffersize = HttpConnectionParams.getSocketBufferSize(params);
        init(createHttpDataReceiver(socket2, buffersize, params), createHttpDataTransmitter(socket2, buffersize, params), params);
        this.open = true;
    }

    protected Socket getSocket() {
        return this.f21091socket;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isOpen() {
        return this.open;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getLocalAddress() {
        if (this.f21091socket != null) {
            return this.f21091socket.getLocalAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getLocalPort() {
        if (this.f21091socket != null) {
            return this.f21091socket.getLocalPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpInetConnection
    public InetAddress getRemoteAddress() {
        if (this.f21091socket != null) {
            return this.f21091socket.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.http.HttpInetConnection
    public int getRemotePort() {
        if (this.f21091socket != null) {
            return this.f21091socket.getPort();
        }
        return -1;
    }

    @Override // org.apache.http.HttpConnection
    public void setSocketTimeout(int timeout) {
        assertOpen();
        if (this.f21091socket != null) {
            try {
                this.f21091socket.setSoTimeout(timeout);
            } catch (SocketException e5) {
            }
        }
    }

    @Override // org.apache.http.HttpConnection
    public int getSocketTimeout() {
        if (this.f21091socket == null) {
            return -1;
        }
        try {
            return this.f21091socket.getSoTimeout();
        } catch (SocketException e5) {
            return -1;
        }
    }

    @Override // org.apache.http.HttpConnection
    public void shutdown() throws IOException {
        this.open = false;
        Socket tmpsocket = this.f21091socket;
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
            this.f21091socket.shutdownOutput();
        } catch (IOException e5) {
        }
        try {
            this.f21091socket.shutdownInput();
        } catch (IOException e6) {
        }
        this.f21091socket.close();
    }
}
