package org.apache.http;

import java.io.IOException;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface HttpConnection {
    void close() throws IOException;

    HttpConnectionMetrics getMetrics();

    int getSocketTimeout();

    boolean isOpen();

    boolean isStale();

    void setSocketTimeout(int i5);

    void shutdown() throws IOException;
}
