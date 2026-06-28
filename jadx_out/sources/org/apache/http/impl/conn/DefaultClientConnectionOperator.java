package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    public static final String SOCK_SEND_BUFF = "http.socket.send-buffer";
    private static final PlainSocketFactory staticPlainSocketFactory = new PlainSocketFactory();
    protected SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemes) {
        if (schemes == null) {
            throw new IllegalArgumentException("Scheme registry must not be null.");
        }
        this.schemeRegistry = schemes;
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[SYNTHETIC] */
    @Override // org.apache.http.conn.ClientConnectionOperator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void openConnection(org.apache.http.conn.OperatedClientConnection r21, org.apache.http.HttpHost r22, java.net.InetAddress r23, org.apache.http.protocol.HttpContext r24, org.apache.http.params.HttpParams r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams):void");
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public void updateSecureConnection(OperatedClientConnection conn, HttpHost target, HttpContext context, HttpParams params) throws IOException {
        if (conn == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        }
        if (target == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        }
        if (params == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (!conn.isOpen()) {
            throw new IllegalArgumentException("Connection must be open.");
        }
        Scheme schm = this.schemeRegistry.getScheme(target.getSchemeName());
        if (!(schm.getSocketFactory() instanceof LayeredSocketFactory)) {
            throw new IllegalArgumentException("Target scheme (" + schm.getName() + ") must have layered socket factory.");
        }
        LayeredSocketFactory lsf = (LayeredSocketFactory) schm.getSocketFactory();
        try {
            Socket sock = lsf.createSocket(conn.getSocket(), target.getHostName(), schm.resolvePort(target.getPort()), true);
            prepareSocket(sock, context, params);
            conn.update(sock, target, lsf.isSecure(sock), params);
        } catch (ConnectException ex) {
            throw new HttpHostConnectException(target, ex);
        }
    }

    protected void prepareSocket(Socket sock, HttpContext context, HttpParams params) throws IOException {
        sock.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(params));
        sock.setSoTimeout(HttpConnectionParams.getSoTimeout(params));
        int sendBufSize = params.getIntParameter(SOCK_SEND_BUFF, 0);
        if (sendBufSize > 0) {
            sock.setSendBufferSize(sendBufSize);
        }
        int linger = HttpConnectionParams.getLinger(params);
        if (linger >= 0) {
            sock.setSoLinger(linger > 0, linger);
        }
    }
}
