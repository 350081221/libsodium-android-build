package org.apache.http.impl;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class DefaultHttpServerConnection extends SocketHttpServerConnection {
    @Override // org.apache.http.impl.SocketHttpServerConnection
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
        super.bind(socket2, params);
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        if (isOpen()) {
            buffer.append(getRemotePort());
        } else {
            buffer.append("closed");
        }
        buffer.append("]");
        return buffer.toString();
    }
}
