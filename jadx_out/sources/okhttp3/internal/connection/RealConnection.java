package okhttp3.internal.connection;

import android.net.http.Headers;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import kotlin.text.x;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSource;
import okio.p1;
import okio.y0;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u0002:\u0002\u008e\u0001B\u0019\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010@\u001a\u00020\u001b¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J\u000f\u0010)\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010$J>\u0010+\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b/\u00100J\u001f\u00109\u001a\u0002062\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010?\u001a\u00020<2\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b=\u0010>J\b\u0010@\u001a\u00020\u001bH\u0016J\u0006\u0010A\u001a\u00020\u000bJ\b\u0010C\u001a\u00020BH\u0016J\u000e\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001dJ\u0010\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020FH\u0016J\u0018\u0010M\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0016J\n\u0010!\u001a\u0004\u0018\u00010 H\u0016J'\u0010S\u001a\u00020\u000b2\u0006\u00103\u001a\u0002022\u0006\u0010N\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bQ\u0010RJ!\u0010X\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0004\bV\u0010WJ\b\u0010Z\u001a\u00020YH\u0016J\b\u0010\\\u001a\u00020[H\u0016R\u0017\u0010^\u001a\u00020]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010@\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010dR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010eR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010%\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010oR\"\u0010t\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010uR\u0016\u0010{\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010uR\u0016\u0010|\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010uR&\u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0~0}8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010q¨\u0006\u008f\u0001"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/EventListener;", "eventListener", "Lkotlin/r2;", "connectTunnel", "connectSocket", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectionSpecSelector", "pingIntervalMillis", "establishProtocol", "startHttp2", "connectTls", "Lokhttp3/Request;", "tunnelRequest", "Lokhttp3/HttpUrl;", "url", "createTunnel", "createTunnelRequest", "", "Lokhttp3/Route;", "candidates", "", "routeMatchesAny", "supportsUrl", "Lokhttp3/Handshake;", "handshake", "certificateSupportHost", "noNewExchanges$okhttp", "()V", "noNewExchanges", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "connectionRetryEnabled", "connect", "Lokhttp3/Address;", "address", "routes", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "route", "cancel", "Ljava/net/Socket;", "socket", "doExtensiveChecks", "isHealthy", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "Lokhttp3/internal/http2/Http2Connection;", Headers.CONN_DIRECTIVE, "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "e", "trackFailure$okhttp", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "trackFailure", "Lokhttp3/Protocol;", "protocol", "", "toString", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/Route;", "rawSocket", "Ljava/net/Socket;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "Lokio/m;", "sink", "Lokio/m;", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "routeFailureCount", "I", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "", "idleAtNs", "J", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "isMultiplexed$okhttp", "isMultiplexed", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@Instrumented
@r1({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1#2:766\n608#3,4:767\n608#3,4:774\n615#3,4:778\n1747#4,3:771\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection\n*L\n529#1:767,4\n582#1:774,4\n648#1:778,4\n574#1:771,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    @l
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;

    @l
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;

    @l
    private final List<Reference<RealCall>> calls;

    @l
    private final RealConnectionPool connectionPool;

    @m
    private Handshake handshake;

    @m
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;

    @m
    private Protocol protocol;

    @m
    private Socket rawSocket;
    private int refusedStreamCount;

    @l
    private final Route route;
    private int routeFailureCount;

    @m
    private okio.m sink;

    /* renamed from: socket, reason: collision with root package name */
    @m
    private Socket f20851socket;

    @m
    private BufferedSource source;
    private int successCount;

    @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "()V", "IDLE_CONNECTION_HEALTHY_NS", "", "MAX_TUNNEL_ATTEMPTS", "", "NPE_THROW_WITH_NULL", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNs", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final RealConnection newTestConnection(@l RealConnectionPool connectionPool, @l Route route, @l Socket socket2, long j5) {
            l0.p(connectionPool, "connectionPool");
            l0.p(route, "route");
            l0.p(socket2, "socket");
            RealConnection realConnection = new RealConnection(connectionPool, route);
            realConnection.f20851socket = socket2;
            realConnection.setIdleAtNs$okhttp(j5);
            return realConnection;
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealConnection(@l RealConnectionPool connectionPool, @l Route route) {
        l0.p(connectionPool, "connectionPool");
        l0.p(route, "route");
        this.connectionPool = connectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if (!peerCertificates.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String host = httpUrl.host();
            Certificate certificate = peerCertificates.get(0);
            l0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void connectSocket(int i5, int i6, Call call, EventListener eventListener) throws IOException {
        int i7;
        Socket createSocket;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null) {
            i7 = -1;
        } else {
            i7 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i7 != 1 && i7 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = address.socketFactory().createSocket();
            l0.m(createSocket);
        }
        this.rawSocket = createSocket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        createSocket.setSoTimeout(i6);
        try {
            Platform.Companion.get().connectSocket(createSocket, this.route.socketAddress(), i5);
            try {
                this.source = y0.e(y0.v(createSocket));
                this.sink = y0.d(y0.q(createSocket));
            } catch (NullPointerException e5) {
                if (!l0.g(e5.getMessage(), NPE_THROW_WITH_NULL)) {
                } else {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e6) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e6);
            throw connectException;
        }
    }

    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        Protocol protocol;
        String r5;
        Address address = this.route.address();
        SSLSocketFactory sslSocketFactory = address.sslSocketFactory();
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            l0.m(sslSocketFactory);
            Socket createSocket = sslSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            l0.n(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (configureSecureSocket.supportsTlsExtensions()) {
                    Platform.Companion.get().configureTlsExtensions(sSLSocket2, address.url().host(), address.protocols());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.Companion;
                l0.o(sslSocketSession, "sslSocketSession");
                Handshake handshake = companion.get(sslSocketSession);
                HostnameVerifier hostnameVerifier = address.hostnameVerifier();
                l0.m(hostnameVerifier);
                if (!hostnameVerifier.verify(address.url().host(), sslSocketSession)) {
                    List<Certificate> peerCertificates = handshake.peerCertificates();
                    if (!peerCertificates.isEmpty()) {
                        Certificate certificate = peerCertificates.get(0);
                        l0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) certificate;
                        r5 = x.r("\n              |Hostname " + address.url().host() + " not verified:\n              |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              ", null, 1, null);
                        throw new SSLPeerUnverifiedException(r5);
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
                }
                CertificatePinner certificatePinner = address.certificatePinner();
                l0.m(certificatePinner);
                this.handshake = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new RealConnection$connectTls$1(certificatePinner, handshake, address));
                certificatePinner.check$okhttp(address.url().host(), new RealConnection$connectTls$2(this));
                if (configureSecureSocket.supportsTlsExtensions()) {
                    str = Platform.Companion.get().getSelectedProtocol(sSLSocket2);
                }
                this.f20851socket = sSLSocket2;
                this.source = y0.e(y0.v(sSLSocket2));
                this.sink = y0.d(y0.q(sSLSocket2));
                if (str != null) {
                    protocol = Protocol.Companion.get(str);
                } else {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                Platform.Companion.get().afterHandshake(sSLSocket2);
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.Companion.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i5, int i6, int i7, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i8 = 0; i8 < 21; i8++) {
            connectSocket(i5, i6, call, eventListener);
            createTunnelRequest = createTunnel(i6, i7, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Socket socket2 = this.rawSocket;
                if (socket2 != null) {
                    Util.closeQuietly(socket2);
                }
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
            } else {
                return;
            }
        }
    }

    private final Request createTunnel(int i5, int i6, Request request, HttpUrl httpUrl) throws IOException {
        boolean K1;
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.source;
            l0.m(bufferedSource);
            okio.m mVar = this.sink;
            l0.m(mVar);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, mVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().timeout(i5, timeUnit);
            mVar.timeout().timeout(i6, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            l0.m(readResponseHeaders);
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (authenticate != null) {
                        K1 = e0.K1(ILivePush.ClickType.CLOSE, Response.header$default(build, HTTP.CONN_DIRECTIVE, null, 2, null), true);
                        if (K1) {
                            return authenticate;
                        }
                        request = authenticate;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + build.code());
                }
            } else {
                if (bufferedSource.g().e0() && mVar.g().e0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build;
        Response.Builder body;
        Request.Builder header = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header(HTTP.TARGET_HOST, Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", HTTP.CONN_KEEP_ALIVE).header(HTTP.USER_AGENT, Util.userAgent);
        if (!(header instanceof Request.Builder)) {
            build = header.build();
        } else {
            build = OkHttp3Instrumentation.build(header);
        }
        Response.Builder message = new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate");
        ResponseBody responseBody = Util.EMPTY_RESPONSE;
        if (!(message instanceof Response.Builder)) {
            body = message.body(responseBody);
        } else {
            body = OkHttp3Instrumentation.body(message, responseBody);
        }
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, body.sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header(AUTH.PROXY_AUTH, "OkHttp-Preemptive").build());
        if (authenticate != null) {
            return authenticate;
        }
        return build;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i5, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol)) {
                this.f20851socket = this.rawSocket;
                this.protocol = protocol;
                startHttp2(i5);
                return;
            } else {
                this.f20851socket = this.rawSocket;
                this.protocol = Protocol.HTTP_1_1;
                return;
            }
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i5);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z4;
        List<Route> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Route route : list2) {
            if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && l0.g(this.route.socketAddress(), route.socketAddress())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i5) throws IOException {
        Socket socket2 = this.f20851socket;
        l0.m(socket2);
        BufferedSource bufferedSource = this.source;
        l0.m(bufferedSource);
        okio.m mVar = this.sink;
        l0.m(mVar);
        socket2.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket2, this.route.address().url().host(), bufferedSource, mVar).listener(this).pingIntervalMillis(i5).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (l0.g(httpUrl.host(), url.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        l0.m(handshake);
        if (!certificateSupportHost(httpUrl, handshake)) {
            return false;
        }
        return true;
    }

    public final void cancel() {
        Socket socket2 = this.rawSocket;
        if (socket2 != null) {
            Util.closeQuietly(socket2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, @p4.l okhttp3.Call r22, @p4.l okhttp3.EventListener r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(@l OkHttpClient client, @l Route failedRoute, @l IOException failure) {
        l0.p(client, "client");
        l0.p(failedRoute, "failedRoute");
        l0.p(failure, "failure");
        if (failedRoute.proxy().type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.address();
            address.proxySelector().connectFailed(address.url().uri(), failedRoute.proxy().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    @l
    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    @l
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.Connection
    @m
    public Handshake handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(@l Address address, @m List<Route> list) {
        l0.p(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (l0.g(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            l0.m(certificatePinner);
            String host = address.url().host();
            Handshake handshake = handshake();
            l0.m(handshake);
            certificatePinner.check(host, handshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z4) {
        long j5;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket2 = this.rawSocket;
        l0.m(socket2);
        Socket socket3 = this.f20851socket;
        l0.m(socket3);
        BufferedSource bufferedSource = this.source;
        l0.m(bufferedSource);
        if (!socket2.isClosed() && !socket3.isClosed() && !socket3.isInputShutdown() && !socket3.isOutputShutdown()) {
            Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(nanoTime);
            }
            synchronized (this) {
                j5 = nanoTime - this.idleAtNs;
            }
            if (j5 >= IDLE_CONNECTION_HEALTHY_NS && z4) {
                return Util.isHealthy(socket3, bufferedSource);
            }
            return true;
        }
        return false;
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    @l
    public final ExchangeCodec newCodec$okhttp(@l OkHttpClient client, @l RealInterceptorChain chain) throws SocketException {
        l0.p(client, "client");
        l0.p(chain, "chain");
        Socket socket2 = this.f20851socket;
        l0.m(socket2);
        BufferedSource bufferedSource = this.source;
        l0.m(bufferedSource);
        okio.m mVar = this.sink;
        l0.m(mVar);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket2.setSoTimeout(chain.readTimeoutMillis());
        p1 timeout = bufferedSource.timeout();
        long readTimeoutMillis$okhttp = chain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        mVar.timeout().timeout(chain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(client, this, bufferedSource, mVar);
    }

    @l
    public final RealWebSocket.Streams newWebSocketStreams$okhttp(@l final Exchange exchange) throws SocketException {
        l0.p(exchange, "exchange");
        Socket socket2 = this.f20851socket;
        l0.m(socket2);
        final BufferedSource bufferedSource = this.source;
        l0.m(bufferedSource);
        final okio.m mVar = this.sink;
        l0.m(mVar);
        socket2.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new RealWebSocket.Streams(bufferedSource, mVar) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(@l Http2Connection connection, @l Settings settings) {
        l0.p(connection, "connection");
        l0.p(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(@l Http2Stream stream) throws IOException {
        l0.p(stream, "stream");
        stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    @l
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        l0.m(protocol);
        return protocol;
    }

    @Override // okhttp3.Connection
    @l
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j5) {
        this.idleAtNs = j5;
    }

    public final void setNoNewExchanges(boolean z4) {
        this.noNewExchanges = z4;
    }

    public final void setRouteFailureCount$okhttp(int i5) {
        this.routeFailureCount = i5;
    }

    @Override // okhttp3.Connection
    @l
    public Socket socket() {
        Socket socket2 = this.f20851socket;
        l0.m(socket2);
        return socket2;
    }

    @l
    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake == null || (obj = handshake.cipherSuite()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(@l RealCall call, @m IOException iOException) {
        l0.p(call, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                int i5 = this.refusedStreamCount + 1;
                this.refusedStreamCount = i5;
                if (i5 > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.isCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (iOException != null) {
                    connectFailed$okhttp(call.getClient(), this.route, iOException);
                }
                this.routeFailureCount++;
            }
        }
    }
}
