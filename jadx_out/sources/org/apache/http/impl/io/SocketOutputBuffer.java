package org.apache.http.impl.io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket2, int buffersize, HttpParams params) throws IOException {
        if (socket2 == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        init(socket2.getOutputStream(), 8192, params);
    }
}
