package org.apache.http.io;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface HttpTransportMetrics {
    long getBytesTransferred();

    void reset();
}
