package okhttp3.internal.connection;

import android.net.http.Headers;
import androidx.core.app.NotificationCompat;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k0.c;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.p;
import kotlin.r2;
import m0.a;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import okio.j;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017*\u0001W\u0018\u00002\u00020\u0001:\u0002tuB\u001f\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010G\u001a\u00020\u0014\u0012\u0006\u0010K\u001a\u00020\u0017¢\u0006\u0004\br\u0010sJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u000f\u0010!\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0017J\u0017\u0010)\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*J;\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b3\u0010\bJ\u0011\u00108\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b6\u00107J\u0006\u00109\u001a\u00020\u0002J\u0017\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0017H\u0000¢\u0006\u0004\b;\u0010<J\u0006\u0010>\u001a\u00020\u0017J\u000f\u0010A\u001a\u00020\u000fH\u0000¢\u0006\u0004\b?\u0010@R\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010G\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010K\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010\u0012\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR(\u0010+\u001a\u0004\u0018\u00010*2\b\u0010b\u001a\u0004\u0018\u00010*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010c\u001a\u0004\bd\u0010eR\u0016\u00109\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010LR(\u0010f\u001a\u0004\u0018\u00010&2\b\u0010b\u001a\u0004\u0018\u00010&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010LR\u0016\u0010k\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010LR\u0016\u0010l\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010LR\u0016\u0010m\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010LR\u0018\u0010-\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010gR$\u0010n\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010c\u001a\u0004\bo\u0010e\"\u0004\bp\u0010q¨\u0006v"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "Lkotlin/r2;", "callStart", "Ljava/io/IOException;", "E", "e", "callDone", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "timeoutExit", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "createAddress", "", "toLoggableString", "Lokio/j;", a.Z, "clone", "Lokhttp3/Request;", "request", "cancel", "", "isCanceled", "Lokhttp3/Response;", "execute", "Lokhttp3/Callback;", "responseCallback", "enqueue", "isExecuted", "getResponseWithInterceptorChain$okhttp", "()Lokhttp3/Response;", "getResponseWithInterceptorChain", "newExchangeFinder", "enterNetworkInterceptorExchange", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", Headers.CONN_DIRECTIVE, "acquireConnectionNoEvents", "exchange", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "getOriginalRequest", "()Lokhttp3/Request;", "forWebSocket", "Z", "getForWebSocket", "()Z", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "callStackTrace", "Ljava/lang/Object;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "interceptorScopedExchange", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", SyncStorageEngine.MESG_CANCELED, "connectionToCancel", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
/* loaded from: classes4.dex */
public final class RealCall implements Call {

    @m
    private Object callStackTrace;
    private volatile boolean canceled;

    @l
    private final OkHttpClient client;

    @m
    private RealConnection connection;

    @l
    private final RealConnectionPool connectionPool;

    @m
    private volatile RealConnection connectionToCancel;

    @l
    private final EventListener eventListener;

    @m
    private volatile Exchange exchange;

    @m
    private ExchangeFinder exchangeFinder;

    @l
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;

    @m
    private Exchange interceptorScopedExchange;

    @l
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;

    @l
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/RealCall;", "other", "Lkotlin/r2;", "reuseCallsPerHostFrom", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "run", "Lokhttp3/Callback;", "responseCallback", "Lokhttp3/Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "", "getHost", "()Ljava/lang/String;", c.f19042f, "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    /* loaded from: classes4.dex */
    public final class AsyncCall implements Runnable {

        @l
        private volatile AtomicInteger callsPerHost;

        @l
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(@l RealCall realCall, Callback responseCallback) {
            l0.p(responseCallback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(@l ExecutorService executorService) {
            l0.p(executorService, "executorService");
            Dispatcher dispatcher = this.this$0.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e5) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e5);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        @l
        public final RealCall getCall() {
            return this.this$0;
        }

        @l
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @l
        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        @l
        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@l AsyncCall other) {
            l0.p(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            Throwable th;
            IOException e5;
            Dispatcher dispatcher;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                realCall.timeout.enter();
                try {
                    try {
                        z4 = true;
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            dispatcher = realCall.getClient().dispatcher();
                        } catch (IOException e6) {
                            e5 = e6;
                            if (z4) {
                                Platform.Companion.get().log("Callback failure for " + realCall.toLoggableString(), 4, e5);
                            } else {
                                this.responseCallback.onFailure(realCall, e5);
                            }
                            dispatcher = realCall.getClient().dispatcher();
                            dispatcher.finished$okhttp(this);
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z4) {
                                IOException iOException = new IOException("canceled due to " + th);
                                p.a(iOException, th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th3;
                    }
                } catch (IOException e7) {
                    z4 = false;
                    e5 = e7;
                } catch (Throwable th4) {
                    z4 = false;
                    th = th4;
                }
                dispatcher.finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CallReference extends WeakReference<RealCall> {

        @m
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(@l RealCall referent, @m Object obj) {
            super(referent);
            l0.p(referent, "referent");
            this.callStackTrace = obj;
        }

        @m
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [okio.p1, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(@l OkHttpClient client, @l Request originalRequest, boolean z4) {
        l0.p(client, "client");
        l0.p(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z4;
        this.connectionPool = client.connectionPool().getDelegate$okhttp();
        this.eventListener = client.eventListenerFactory().create(this);
        ?? r42 = new j() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // okio.j
            protected void timedOut() {
                RealCall.this.cancel();
            }
        };
        r42.timeout(client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r42;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final <E extends IOException> E callDone(E e5) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z4;
        boolean z5 = Util.assertionsEnabled;
        if (z5 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z5 && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
            } else {
                if (releaseConnectionNoEvents$okhttp == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e6 = (E) timeoutExit(e5);
        if (e5 != null) {
            EventListener eventListener = this.eventListener;
            l0.m(e6);
            eventListener.callFailed(this, e6);
        } else {
            this.eventListener.callEnd(this);
        }
        return e6;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final <E extends IOException> E timeoutExit(E e5) {
        if (this.timeoutEarlyExit) {
            return e5;
        }
        if (!exit()) {
            return e5;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(a.Z);
        if (e5 != null) {
            interruptedIOException.initCause(e5);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.forWebSocket) {
            str2 = "web socket";
        } else {
            str2 = NotificationCompat.CATEGORY_CALL;
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(@l RealConnection connection) {
        boolean z4;
        l0.p(connection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (this.connection == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public void enqueue(@l Callback responseCallback) {
        l0.p(responseCallback, "responseCallback");
        if (this.executed.compareAndSet(false, true)) {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void enterNetworkInterceptorExchange(@l Request request, boolean z4) {
        boolean z5;
        l0.p(request, "request");
        if (this.interceptorScopedExchange == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            synchronized (this) {
                if (!this.responseBodyOpen) {
                    if (!this.requestBodyOpen) {
                        r2 r2Var = r2.f19517a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z4) {
                this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    @l
    public Response execute() {
        if (this.executed.compareAndSet(false, true)) {
            enter();
            callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                return getResponseWithInterceptorChain$okhttp();
            } finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z4) {
        Exchange exchange;
        synchronized (this) {
            if (this.expectMoreExchanges) {
                r2 r2Var = r2.f19517a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z4 && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    @l
    public final OkHttpClient getClient() {
        return this.client;
    }

    @m
    public final RealConnection getConnection() {
        return this.connection;
    }

    @m
    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    @l
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @m
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    @l
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.interceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.u.n0(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L4a
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.networkInterceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.u.n0(r2, r0)
        L4a:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.originalRequest
            okhttp3.OkHttpClient r0 = r11.client
            int r6 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r7 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r8 = r0.writeTimeoutMillis()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.originalRequest     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            okhttp3.Response r2 = r9.proceed(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r3 = r11.isCanceled()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r3 != 0) goto L83
            r11.noMoreExchanges$okhttp(r0)
            return r2
        L83:
            okhttp3.internal.Util.closeQuietly(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            throw r2     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
        L8e:
            r2 = move-exception
            goto La0
        L90:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.noMoreExchanges$okhttp(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.l0.n(r1, r3)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        L9c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        La0:
            if (r1 != 0) goto La5
            r11.noMoreExchanges$okhttp(r0)
        La5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.getResponseWithInterceptorChain$okhttp():okhttp3.Response");
    }

    @l
    public final Exchange initExchange$okhttp(@l RealInterceptorChain chain) {
        l0.p(chain, "chain");
        synchronized (this) {
            if (this.expectMoreExchanges) {
                if (!this.responseBodyOpen) {
                    if (!this.requestBodyOpen) {
                        r2 r2Var = r2.f19517a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        l0.m(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (!this.canceled) {
            return exchange;
        }
        throw new IOException("Canceled");
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:44:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:27:0x0042, B:9:0x001b), top: B:43:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E messageDone$okhttp(@p4.l okhttp3.internal.connection.Exchange r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.l0.p(r2, r0)
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            boolean r2 = kotlin.jvm.internal.l0.g(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L59
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.requestBodyOpen = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.responseBodyOpen = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.expectMoreExchanges     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            kotlin.r2 r4 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.exchange = r2
            okhttp3.internal.connection.RealConnection r2 = r1.connection
            if (r2 == 0) goto L51
            r2.incrementSuccessCount$okhttp()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.callDone(r5)
            return r2
        L58:
            return r5
        L59:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.messageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @m
    public final IOException noMoreExchanges$okhttp(@m IOException iOException) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z4 = true;
                }
            }
            r2 r2Var = r2.f19517a;
        }
        if (z4) {
            return callDone(iOException);
        }
        return iOException;
    }

    @l
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    @m
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        l0.m(realConnection);
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (it.hasNext()) {
                if (l0.g(it.next().get(), this)) {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 != -1) {
            z4 = true;
        }
        if (z4) {
            calls.remove(i5);
            this.connection = null;
            if (calls.isEmpty()) {
                realConnection.setIdleAtNs$okhttp(System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.socket();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    @l
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        l0.m(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(@m RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    @l
    public j timeout() {
        return this.timeout;
    }

    @Override // okhttp3.Call
    @l
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
