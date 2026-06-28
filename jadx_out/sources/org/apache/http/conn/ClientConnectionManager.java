package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public interface ClientConnectionManager {
    void closeExpiredConnections();

    void closeIdleConnections(long j5, TimeUnit timeUnit);

    SchemeRegistry getSchemeRegistry();

    void releaseConnection(ManagedClientConnection managedClientConnection, long j5, TimeUnit timeUnit);

    ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj);

    void shutdown();
}
