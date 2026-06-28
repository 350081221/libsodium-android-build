package okhttp3.internal.connection;

import android.net.http.Headers;
import androidx.core.app.NotificationCompat;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import okhttp3.ConnectionPool;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import p4.l;

@i0(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001 \u0018\u0000 -2\u00020\u0001:\u0001-B'\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J.\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006."}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Lokhttp3/internal/connection/RealConnection;", Headers.CONN_DIRECTIVE, "", "now", "", "pruneAndGetAllocationCount", "idleConnectionCount", "connectionCount", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "", "Lokhttp3/Route;", "routes", "", "requireMultiplexed", "callAcquirePooledConnection", "Lkotlin/r2;", "put", "connectionBecameIdle", "evictAll", "cleanup", "maxIdleConnections", "I", "keepAliveDurationNs", "J", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/connection/RealConnectionPool$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/connection/RealConnectionPool$cleanupTask$1;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;IJLjava/util/concurrent/TimeUnit;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
/* loaded from: classes4.dex */
public final class RealConnectionPool {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final TaskQueue cleanupQueue;

    @l
    private final RealConnectionPool$cleanupTask$1 cleanupTask;

    @l
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final RealConnectionPool get(@l ConnectionPool connectionPool) {
            l0.p(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(@l TaskRunner taskRunner, int i5, long j5, @l TimeUnit timeUnit) {
        boolean z4;
        l0.p(taskRunner, "taskRunner");
        l0.p(timeUnit, "timeUnit");
        this.maxIdleConnections = i5;
        this.keepAliveDurationNs = timeUnit.toNanos(j5);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " ConnectionPool";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return RealConnectionPool.this.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j5).toString());
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j5) {
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        int i5 = 0;
        while (i5 < calls.size()) {
            Reference<RealCall> reference = calls.get(i5);
            if (reference.get() != null) {
                i5++;
            } else {
                l0.n(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Platform.Companion.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i5);
                realConnection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs$okhttp(j5 - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r1.isMultiplexed$okhttp() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean callAcquirePooledConnection(@p4.l okhttp3.Address r4, @p4.l okhttp3.internal.connection.RealCall r5, @p4.m java.util.List<okhttp3.Route> r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.l0.p(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.l0.o(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2a
            boolean r2 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L36
        L2a:
            boolean r2 = r1.isEligible$okhttp(r4, r6)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L36
            r5.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)
            r4 = 1
            return r4
        L36:
            kotlin.r2 r2 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)
            goto L10
        L3a:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L3d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.callAcquirePooledConnection(okhttp3.Address, okhttp3.internal.connection.RealCall, java.util.List, boolean):boolean");
    }

    public final long cleanup(long j5) {
        Iterator<RealConnection> it = this.connections.iterator();
        int i5 = 0;
        long j6 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i6 = 0;
        while (it.hasNext()) {
            RealConnection connection = it.next();
            l0.o(connection, "connection");
            synchronized (connection) {
                if (pruneAndGetAllocationCount(connection, j5) > 0) {
                    i6++;
                } else {
                    i5++;
                    long idleAtNs$okhttp = j5 - connection.getIdleAtNs$okhttp();
                    if (idleAtNs$okhttp > j6) {
                        realConnection = connection;
                        j6 = idleAtNs$okhttp;
                    }
                    r2 r2Var = r2.f19517a;
                }
            }
        }
        long j7 = this.keepAliveDurationNs;
        if (j6 < j7 && i5 <= this.maxIdleConnections) {
            if (i5 > 0) {
                return j7 - j6;
            }
            if (i6 > 0) {
                return j7;
            }
            return -1L;
        }
        l0.m(realConnection);
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs$okhttp() + j6 != j5) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(@l RealConnection connection) {
        l0.p(connection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        connection.setNoNewExchanges(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket2;
        Iterator<RealConnection> it = this.connections.iterator();
        l0.o(it, "connections.iterator()");
        while (it.hasNext()) {
            RealConnection connection = it.next();
            l0.o(connection, "connection");
            synchronized (connection) {
                if (connection.getCalls().isEmpty()) {
                    it.remove();
                    connection.setNoNewExchanges(true);
                    socket2 = connection.socket();
                } else {
                    socket2 = null;
                }
            }
            if (socket2 != null) {
                Util.closeQuietly(socket2);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean isEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i5 = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (RealConnection it : concurrentLinkedQueue) {
                l0.o(it, "it");
                synchronized (it) {
                    isEmpty = it.getCalls().isEmpty();
                }
                if (isEmpty && (i5 = i5 + 1) < 0) {
                    kotlin.collections.w.V();
                }
            }
        }
        return i5;
    }

    public final void put(@l RealConnection connection) {
        l0.p(connection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        this.connections.add(connection);
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }
}
