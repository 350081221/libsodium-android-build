package org.apache.http.io;

import java.io.IOException;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface SessionOutputBuffer {
    void flush() throws IOException;

    HttpTransportMetrics getMetrics();

    void write(int i5) throws IOException;

    void write(byte[] bArr) throws IOException;

    void write(byte[] bArr, int i5, int i6) throws IOException;

    void writeLine(String str) throws IOException;

    void writeLine(CharArrayBuffer charArrayBuffer) throws IOException;
}
