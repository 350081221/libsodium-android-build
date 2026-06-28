package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class SocketInputBuffer extends AbstractSessionInputBuffer {

    /* renamed from: socket, reason: collision with root package name */
    private final Socket f21093socket;

    public SocketInputBuffer(Socket socket2, int buffersize, HttpParams params) throws IOException {
        if (socket2 == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        this.f21093socket = socket2;
        init(socket2.getInputStream(), 8192, params);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int timeout) throws IOException {
        boolean result = hasBufferedData();
        if (!result) {
            int oldtimeout = this.f21093socket.getSoTimeout();
            try {
                try {
                    this.f21093socket.setSoTimeout(timeout);
                    fillBuffer();
                    result = hasBufferedData();
                } catch (InterruptedIOException e5) {
                    if (!(e5 instanceof SocketTimeoutException)) {
                        throw e5;
                    }
                }
            } finally {
                this.f21093socket.setSoTimeout(oldtimeout);
            }
        }
        return result;
    }

    public boolean isStale() throws IOException {
        if (hasBufferedData()) {
            return false;
        }
        int oldTimeout = this.f21093socket.getSoTimeout();
        try {
            this.f21093socket.setSoTimeout(1);
            return fillBuffer() == -1;
        } catch (SocketTimeoutException e5) {
            return false;
        } catch (IOException e6) {
            return true;
        } finally {
            this.f21093socket.setSoTimeout(oldTimeout);
        }
    }
}
