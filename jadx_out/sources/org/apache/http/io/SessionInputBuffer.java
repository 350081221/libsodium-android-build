package org.apache.http.io;

import java.io.IOException;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface SessionInputBuffer {
    HttpTransportMetrics getMetrics();

    boolean isDataAvailable(int i5) throws IOException;

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i5, int i6) throws IOException;

    int readLine(CharArrayBuffer charArrayBuffer) throws IOException;

    String readLine() throws IOException;
}
