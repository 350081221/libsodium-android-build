package org.apache.http.impl.conn;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected boolean alwaysShutDown;
    protected ClientConnectionOperator connOperator;
    protected long connectionExpiresTime;
    protected volatile boolean isShutDown;
    protected long lastReleaseTime;
    private final Log log = LogFactory.getLog(getClass());
    protected ConnAdapter managedConn;
    protected SchemeRegistry schemeRegistry;
    protected PoolEntry uniquePoolEntry;

    public SingleClientConnManager(HttpParams params, SchemeRegistry schreg) {
        if (schreg == null) {
            throw new IllegalArgumentException("Scheme registry must not be null.");
        }
        this.schemeRegistry = schreg;
        this.connOperator = createConnectionOperator(schreg);
        this.uniquePoolEntry = new PoolEntry();
        this.managedConn = null;
        this.lastReleaseTime = -1L;
        this.alwaysShutDown = false;
        this.isShutDown = false;
    }

    protected void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schreg) {
        return new DefaultClientConnectionOperator(schreg);
    }

    protected final void assertStillUp() throws IllegalStateException {
        if (this.isShutDown) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute route, final Object state) {
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.SingleClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long timeout, TimeUnit tunit) {
                return SingleClientConnManager.this.getConnection(route, state);
            }
        };
    }

    public ManagedClientConnection getConnection(HttpRoute route, Object state) {
        if (route == null) {
            throw new IllegalArgumentException("Route may not be null.");
        }
        assertStillUp();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Get connection for route " + route);
        }
        if (this.managedConn != null) {
            revokeConnection();
        }
        boolean recreate = false;
        boolean shutdown = false;
        closeExpiredConnections();
        if (this.uniquePoolEntry.connection.isOpen()) {
            RouteTracker tracker = this.uniquePoolEntry.tracker;
            shutdown = tracker == null || !tracker.toRoute().equals(route);
        } else {
            recreate = true;
        }
        if (shutdown) {
            recreate = true;
            try {
                this.uniquePoolEntry.shutdown();
            } catch (IOException iox) {
                this.log.debug("Problem shutting down connection.", iox);
            }
        }
        if (recreate) {
            this.uniquePoolEntry = new PoolEntry();
        }
        try {
            Socket socket2 = this.uniquePoolEntry.connection.getSocket();
            if (socket2 != null) {
                TrafficStats.tagSocket(socket2);
            }
        } catch (IOException iox2) {
            this.log.debug("Problem tagging socket.", iox2);
        }
        this.managedConn = new ConnAdapter(this.uniquePoolEntry, route);
        return this.managedConn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r12 > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r10.connectionExpiresTime = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        r10.connectionExpiresTime = r14.toMillis(r12) + r10.lastReleaseTime;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r12 <= 0) goto L42;
     */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void releaseConnection(org.apache.http.conn.ManagedClientConnection r11, long r12, java.util.concurrent.TimeUnit r14) {
        /*
            r10 = this;
            r10.assertStillUp()
            boolean r0 = r11 instanceof org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter
            if (r0 == 0) goto Ld0
            org.apache.commons.logging.Log r0 = r10.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L25
            org.apache.commons.logging.Log r0 = r10.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Releasing connection "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L25:
            r0 = r11
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r0 = (org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter) r0
            org.apache.http.impl.conn.AbstractPoolEntry r1 = r0.poolEntry
            if (r1 != 0) goto L2d
            return
        L2d:
            org.apache.http.conn.ClientConnectionManager r1 = r0.getManager()
            if (r1 == 0) goto L3e
            if (r1 != r10) goto L36
            goto L3e
        L36:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Connection not obtained from this manager."
            r2.<init>(r3)
            throw r2
        L3e:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r6 = 0
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r7 = r10.uniquePoolEntry     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            org.apache.http.conn.OperatedClientConnection r7 = r7.connection     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            java.net.Socket r7 = r7.getSocket()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            if (r7 == 0) goto L53
            android.net.TrafficStats.untagSocket(r7)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
        L53:
            boolean r8 = r0.isOpen()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            if (r8 == 0) goto L75
            boolean r8 = r10.alwaysShutDown     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            if (r8 != 0) goto L63
            boolean r8 = r0.isMarkedReusable()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            if (r8 != 0) goto L75
        L63:
            org.apache.commons.logging.Log r8 = r10.log     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            boolean r8 = r8.isDebugEnabled()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            if (r8 == 0) goto L72
            org.apache.commons.logging.Log r8 = r10.log     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
            java.lang.String r9 = "Released connection open but not reusable."
            r8.debug(r9)     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
        L72:
            r0.shutdown()     // Catch: java.lang.Throwable -> L85 java.io.IOException -> L87
        L75:
            r0.detach()
            r10.managedConn = r6
            long r6 = java.lang.System.currentTimeMillis()
            r10.lastReleaseTime = r6
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lb0
            goto La6
        L85:
            r7 = move-exception
            goto Lb4
        L87:
            r7 = move-exception
            org.apache.commons.logging.Log r8 = r10.log     // Catch: java.lang.Throwable -> L85
            boolean r8 = r8.isDebugEnabled()     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L97
            org.apache.commons.logging.Log r8 = r10.log     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = "Exception shutting down released connection."
            r8.debug(r9, r7)     // Catch: java.lang.Throwable -> L85
        L97:
            r0.detach()
            r10.managedConn = r6
            long r6 = java.lang.System.currentTimeMillis()
            r10.lastReleaseTime = r6
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lb0
        La6:
            long r2 = r14.toMillis(r12)
            long r4 = r10.lastReleaseTime
            long r2 = r2 + r4
            r10.connectionExpiresTime = r2
            goto Lb3
        Lb0:
            r10.connectionExpiresTime = r2
        Lb3:
            return
        Lb4:
            r0.detach()
            r10.managedConn = r6
            long r8 = java.lang.System.currentTimeMillis()
            r10.lastReleaseTime = r8
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lcd
            long r2 = r14.toMillis(r12)
            long r4 = r10.lastReleaseTime
            long r2 = r2 + r4
            r10.connectionExpiresTime = r2
            goto Lcf
        Lcd:
            r10.connectionExpiresTime = r2
        Lcf:
            throw r7
        Ld0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Connection class mismatch, connection not obtained from this manager."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SingleClientConnManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        if (System.currentTimeMillis() >= this.connectionExpiresTime) {
            closeIdleConnections(0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long idletime, TimeUnit tunit) {
        assertStillUp();
        if (tunit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        if (this.managedConn == null && this.uniquePoolEntry.connection.isOpen()) {
            long cutoff = System.currentTimeMillis() - tunit.toMillis(idletime);
            if (this.lastReleaseTime <= cutoff) {
                try {
                    this.uniquePoolEntry.close();
                } catch (IOException iox) {
                    this.log.debug("Problem closing idle connection.", iox);
                }
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.isShutDown = true;
        if (this.managedConn != null) {
            this.managedConn.detach();
        }
        try {
            try {
                if (this.uniquePoolEntry != null) {
                    this.uniquePoolEntry.shutdown();
                }
            } catch (IOException iox) {
                this.log.debug("Problem while shutting down manager.", iox);
            }
        } finally {
            this.uniquePoolEntry = null;
        }
    }

    protected void revokeConnection() {
        if (this.managedConn == null) {
            return;
        }
        this.log.warn(MISUSE_MESSAGE);
        this.managedConn.detach();
        try {
            this.uniquePoolEntry.shutdown();
        } catch (IOException iox) {
            this.log.debug("Problem while shutting down connection.", iox);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: assets/org.apache.http.legacy.boot */
    public class PoolEntry extends AbstractPoolEntry {
        protected PoolEntry() {
            super(SingleClientConnManager.this.connOperator, null);
        }

        protected void close() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        protected void shutdown() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: assets/org.apache.http.legacy.boot */
    public class ConnAdapter extends AbstractPooledConnAdapter {
        protected ConnAdapter(PoolEntry entry, HttpRoute route) {
            super(SingleClientConnManager.this, entry);
            markReusable();
            entry.route = route;
        }
    }
}
