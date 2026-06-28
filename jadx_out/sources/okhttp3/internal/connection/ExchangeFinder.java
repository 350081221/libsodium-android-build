package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.apache.http.client.methods.HttpGet;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b7\u00108J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J0\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/RealConnection;", "findHealthyConnection", "findConnection", "Lokhttp3/Route;", "retryRoute", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "find", "Ljava/io/IOException;", "e", "Lkotlin/r2;", "trackFailure", "retryAfterFailure", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Address;", "address", "Lokhttp3/Address;", "getAddress$okhttp", "()Lokhttp3/Address;", "Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/internal/connection/RouteSelector;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "refusedStreamCount", "I", "connectionShutdownCount", "otherFailureCount", "nextRouteToTry", "Lokhttp3/Route;", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ExchangeFinder {

    @l
    private final Address address;

    @l
    private final RealCall call;

    @l
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;

    @l
    private final EventListener eventListener;

    @m
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;

    @m
    private RouteSelector.Selection routeSelection;

    @m
    private RouteSelector routeSelector;

    public ExchangeFinder(@l RealConnectionPool connectionPool, @l Address address, @l RealCall call, @l EventListener eventListener) {
        l0.p(connectionPool, "connectionPool");
        l0.p(address, "address");
        l0.p(call, "call");
        l0.p(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.connection.RealConnection findConnection(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection findHealthyConnection(int i5, int i6, int i7, int i8, boolean z4, boolean z5) throws IOException {
        boolean z6;
        while (true) {
            RealConnection findConnection = findConnection(i5, i6, i7, i8, z4);
            if (findConnection.isHealthy(z5)) {
                return findConnection;
            }
            findConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                boolean z7 = true;
                if (selection != null) {
                    z6 = selection.hasNext();
                } else {
                    z6 = true;
                }
                if (z6) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (routeSelector != null) {
                        z7 = routeSelector.hasNext();
                    }
                    if (!z7) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (!Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return null;
            }
            return connection.route();
        }
    }

    @l
    public final ExchangeCodec find(@l OkHttpClient client, @l RealInterceptorChain chain) {
        boolean z4;
        l0.p(client, "client");
        l0.p(chain, "chain");
        try {
            int connectTimeoutMillis$okhttp = chain.getConnectTimeoutMillis$okhttp();
            int readTimeoutMillis$okhttp = chain.getReadTimeoutMillis$okhttp();
            int writeTimeoutMillis$okhttp = chain.getWriteTimeoutMillis$okhttp();
            int pingIntervalMillis = client.pingIntervalMillis();
            boolean retryOnConnectionFailure = client.retryOnConnectionFailure();
            if (!l0.g(chain.getRequest$okhttp().method(), HttpGet.METHOD_NAME)) {
                z4 = true;
            } else {
                z4 = false;
            }
            return findHealthyConnection(connectTimeoutMillis$okhttp, readTimeoutMillis$okhttp, writeTimeoutMillis$okhttp, pingIntervalMillis, retryOnConnectionFailure, z4).newCodec$okhttp(client, chain);
        } catch (IOException e5) {
            trackFailure(e5);
            throw new RouteException(e5);
        } catch (RouteException e6) {
            trackFailure(e6.getLastConnectException());
            throw e6;
        }
    }

    @l
    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        boolean z4 = false;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route retryRoute = retryRoute();
        if (retryRoute != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            z4 = true;
        }
        if (z4 || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    public final boolean sameHostAndPort(@l HttpUrl url) {
        l0.p(url, "url");
        HttpUrl url2 = this.address.url();
        if (url.port() == url2.port() && l0.g(url.host(), url2.host())) {
            return true;
        }
        return false;
    }

    public final void trackFailure(@l IOException e5) {
        l0.p(e5, "e");
        this.nextRouteToTry = null;
        if ((e5 instanceof StreamResetException) && ((StreamResetException) e5).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e5 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
