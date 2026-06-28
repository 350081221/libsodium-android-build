package org.apache.http.impl.conn.tsccm;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected ClientConnectionOperator connOperator;
    protected final AbstractConnPool connectionPool;
    private final Log log = LogFactory.getLog(getClass());
    protected SchemeRegistry schemeRegistry;

    public ThreadSafeClientConnManager(HttpParams params, SchemeRegistry schreg) {
        if (params == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.schemeRegistry = schreg;
        this.connOperator = createConnectionOperator(schreg);
        this.connectionPool = createConnectionPool(params);
    }

    protected void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    protected AbstractConnPool createConnectionPool(HttpParams params) {
        AbstractConnPool acp = new ConnPoolByRoute(this.connOperator, params);
        if (1 != 0) {
            acp.enableConnectionGC();
        }
        return acp;
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schreg) {
        return new DefaultClientConnectionOperator(schreg);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(final HttpRoute route, Object state) {
        final PoolEntryRequest poolRequest = this.connectionPool.requestPoolEntry(route, state);
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                poolRequest.abortRequest();
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long timeout, TimeUnit tunit) throws InterruptedException, ConnectionPoolTimeoutException {
                if (route != null) {
                    if (ThreadSafeClientConnManager.this.log.isDebugEnabled()) {
                        ThreadSafeClientConnManager.this.log.debug("ThreadSafeClientConnManager.getConnection: " + route + ", timeout = " + timeout);
                    }
                    BasicPoolEntry entry = poolRequest.getPoolEntry(timeout, tunit);
                    try {
                        Socket socket2 = entry.getConnection().getSocket();
                        if (socket2 != null) {
                            TrafficStats.tagSocket(socket2);
                        }
                    } catch (IOException iox) {
                        ThreadSafeClientConnManager.this.log.debug("Problem tagging socket.", iox);
                    }
                    return new BasicPooledConnAdapter(ThreadSafeClientConnManager.this, entry);
                }
                throw new IllegalArgumentException("Route may not be null.");
            }
        };
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection conn, long validDuration, TimeUnit timeUnit) {
        BasicPoolEntry entry;
        boolean reusable;
        if (!(conn instanceof BasicPooledConnAdapter)) {
            throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager.");
        }
        BasicPooledConnAdapter hca = (BasicPooledConnAdapter) conn;
        if (hca.getPoolEntry() != null && hca.getManager() != this) {
            throw new IllegalArgumentException("Connection not obtained from this manager.");
        }
        try {
            try {
                Socket socket2 = ((BasicPoolEntry) hca.getPoolEntry()).getConnection().getSocket();
                if (socket2 != null) {
                    TrafficStats.untagSocket(socket2);
                }
                if (hca.isOpen() && !hca.isMarkedReusable()) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Released connection open but not marked reusable.");
                    }
                    hca.shutdown();
                }
                entry = (BasicPoolEntry) hca.getPoolEntry();
                reusable = hca.isMarkedReusable();
                hca.detach();
                if (entry == null) {
                    return;
                }
            } catch (IOException iox) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Exception shutting down released connection.", iox);
                }
                entry = (BasicPoolEntry) hca.getPoolEntry();
                reusable = hca.isMarkedReusable();
                hca.detach();
                if (entry == null) {
                    return;
                }
            }
            this.connectionPool.freeEntry(entry, reusable, validDuration, timeUnit);
        } catch (Throwable th) {
            BasicPoolEntry entry2 = (BasicPoolEntry) hca.getPoolEntry();
            boolean reusable2 = hca.isMarkedReusable();
            hca.detach();
            if (entry2 != null) {
                this.connectionPool.freeEntry(entry2, reusable2, validDuration, timeUnit);
            }
            throw th;
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.connectionPool.shutdown();
    }

    public int getConnectionsInPool(HttpRoute route) {
        return ((ConnPoolByRoute) this.connectionPool).getConnectionsInPool(route);
    }

    public int getConnectionsInPool() {
        int i5;
        synchronized (this.connectionPool) {
            i5 = this.connectionPool.numConnections;
        }
        return i5;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long idleTimeout, TimeUnit tunit) {
        this.connectionPool.closeIdleConnections(idleTimeout, tunit);
        this.connectionPool.deleteClosedConnections();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.connectionPool.closeExpiredConnections();
        this.connectionPool.deleteClosedConnections();
    }
}
