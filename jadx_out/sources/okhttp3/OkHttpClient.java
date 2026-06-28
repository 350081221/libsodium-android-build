package okhttp3;

import com.umeng.analytics.pro.bi;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.b1;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u008d\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008e\u0001\u008d\u0001B\u0014\b\u0000\u0012\u0007\u0010\u0089\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001B\u000b\b\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000f\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010&\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010*\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010%J\u000f\u0010.\u001a\u00020#H\u0007¢\u0006\u0004\b-\u0010%J\u000f\u00102\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u0011\u00106\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b4\u00105J\u000f\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109J\u0011\u0010>\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010B\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020'H\u0007¢\u0006\u0004\bC\u0010)J\u000f\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010L\u001a\u00020IH\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u0018H\u0007¢\u0006\u0004\bN\u0010\u001bJ\u0015\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u0018H\u0007¢\u0006\u0004\bQ\u0010\u001bJ\u000f\u0010V\u001a\u00020SH\u0007¢\u0006\u0004\bT\u0010UJ\u000f\u0010Z\u001a\u00020WH\u0007¢\u0006\u0004\bX\u0010YJ\u000f\u0010^\u001a\u00020[H\u0007¢\u0006\u0004\b\\\u0010]J\u000f\u0010`\u001a\u00020[H\u0007¢\u0006\u0004\b_\u0010]J\u000f\u0010b\u001a\u00020[H\u0007¢\u0006\u0004\ba\u0010]J\u000f\u0010d\u001a\u00020[H\u0007¢\u0006\u0004\bc\u0010]J\u000f\u0010f\u001a\u00020[H\u0007¢\u0006\u0004\be\u0010]R\u0017\u0010\u0013\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u0013\u0010g\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148G¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b\u001c\u0010i\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b\u001e\u0010i\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001f8G¢\u0006\f\n\u0004\b\"\u0010j\u001a\u0004\b\"\u0010!R\u0017\u0010&\u001a\u00020#8G¢\u0006\f\n\u0004\b&\u0010k\u001a\u0004\b&\u0010%R\u0017\u0010*\u001a\u00020'8G¢\u0006\f\n\u0004\b*\u0010l\u001a\u0004\b*\u0010)R\u0017\u0010,\u001a\u00020#8G¢\u0006\f\n\u0004\b,\u0010k\u001a\u0004\b,\u0010%R\u0017\u0010.\u001a\u00020#8G¢\u0006\f\n\u0004\b.\u0010k\u001a\u0004\b.\u0010%R\u0017\u00102\u001a\u00020/8G¢\u0006\f\n\u0004\b2\u0010m\u001a\u0004\b2\u00101R\u0019\u00106\u001a\u0004\u0018\u0001038G¢\u0006\f\n\u0004\b6\u0010n\u001a\u0004\b6\u00105R\u0017\u0010:\u001a\u0002078G¢\u0006\f\n\u0004\b:\u0010o\u001a\u0004\b:\u00109R\u0019\u0010>\u001a\u0004\u0018\u00010;8G¢\u0006\f\n\u0004\b>\u0010p\u001a\u0004\b>\u0010=R\u0017\u0010B\u001a\u00020?8G¢\u0006\f\n\u0004\bB\u0010q\u001a\u0004\bB\u0010AR\u0017\u0010D\u001a\u00020'8G¢\u0006\f\n\u0004\bD\u0010l\u001a\u0004\bD\u0010)R\u0017\u0010H\u001a\u00020E8G¢\u0006\f\n\u0004\bH\u0010r\u001a\u0004\bH\u0010GR\u0016\u0010s\u001a\u0004\u0018\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0019\u0010v\u001a\u0004\u0018\u00010u8G¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bv\u0010xR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u00188G¢\u0006\f\n\u0004\bO\u0010i\u001a\u0004\bO\u0010\u001bR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u00188G¢\u0006\f\n\u0004\bR\u0010i\u001a\u0004\bR\u0010\u001bR\u0017\u0010V\u001a\u00020S8G¢\u0006\f\n\u0004\bV\u0010y\u001a\u0004\bV\u0010UR\u0017\u0010Z\u001a\u00020W8G¢\u0006\f\n\u0004\bZ\u0010z\u001a\u0004\bZ\u0010YR\u0019\u0010|\u001a\u0004\u0018\u00010{8G¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b|\u0010~R\u0017\u0010^\u001a\u00020[8G¢\u0006\f\n\u0004\b^\u0010\u007f\u001a\u0004\b^\u0010]R\u0017\u0010`\u001a\u00020[8G¢\u0006\f\n\u0004\b`\u0010\u007f\u001a\u0004\b`\u0010]R\u0017\u0010b\u001a\u00020[8G¢\u0006\f\n\u0004\bb\u0010\u007f\u001a\u0004\bb\u0010]R\u0017\u0010d\u001a\u00020[8G¢\u0006\f\n\u0004\bd\u0010\u007f\u001a\u0004\bd\u0010]R\u0017\u0010f\u001a\u00020[8G¢\u0006\f\n\u0004\bf\u0010\u007f\u001a\u0004\bf\u0010]R\u001d\u0010\u0081\u0001\u001a\u00030\u0080\u00018G¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0081\u0001\u0010\u0083\u0001R\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0011\u0010L\u001a\u00020I8G¢\u0006\u0006\u001a\u0004\bL\u0010K¨\u0006\u008f\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lkotlin/r2;", "verifyClientState", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "newWebSocket", "Lokhttp3/OkHttpClient$Builder;", "newBuilder", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "Lokhttp3/Dispatcher;", "Lokhttp3/ConnectionPool;", "Ljava/util/List;", "Lokhttp3/EventListener$Factory;", "Z", "Lokhttp3/Authenticator;", "Lokhttp3/CookieJar;", "Lokhttp3/Cache;", "Lokhttp3/Dns;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "I", "", "minWebSocketMessageToCompress", "J", "()J", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
/* loaded from: classes4.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    @l
    private final Authenticator authenticator;

    @m
    private final Cache cache;
    private final int callTimeoutMillis;

    @m
    private final CertificateChainCleaner certificateChainCleaner;

    @l
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;

    @l
    private final ConnectionPool connectionPool;

    @l
    private final List<ConnectionSpec> connectionSpecs;

    @l
    private final CookieJar cookieJar;

    @l
    private final Dispatcher dispatcher;

    @l
    private final Dns dns;

    @l
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;

    @l
    private final HostnameVerifier hostnameVerifier;

    @l
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;

    @l
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;

    @l
    private final List<Protocol> protocols;

    @m
    private final Proxy proxy;

    @l
    private final Authenticator proxyAuthenticator;

    @l
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @l
    private final RouteDatabase routeDatabase;

    @l
    private final SocketFactory socketFactory;

    @m
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;

    @m
    private final X509TrustManager x509TrustManager;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);

    @l
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    @i0(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001B\u0014\b\u0010\u0012\u0007\u0010Ë\u0001\u001a\u00020J¢\u0006\u0006\bÉ\u0001\u0010Ì\u0001J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J8\u0010\n\u001a\u00020\u00002#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007J8\u0010\u0015\u001a\u00020\u00002#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010$J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/H\u0007J\u0016\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201J\u0014\u00105\u001a\u00020\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00020403J\u0014\u00107\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020603J\u000e\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u000208J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:J\u0016\u0010@\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010C\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010D\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010E\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u0016\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020<2\u0006\u0010?\u001a\u00020>J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0007J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010H\u001a\u00020<J\u0006\u0010K\u001a\u00020JR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010XR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bY\u0010XR\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010_\u001a\u0004\bi\u0010a\"\u0004\bj\u0010cR\"\u0010!\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010_\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b)\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010+\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b+\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R$\u0010,\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b,\u0010d\u001a\u0005\b\u0086\u0001\u0010f\"\u0005\b\u0087\u0001\u0010hR'\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b.\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u008d\u0001\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R+\u0010\u0093\u0001\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R+\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b5\u0010V\u001a\u0005\b\u0099\u0001\u0010X\"\u0006\b\u009a\u0001\u0010\u009b\u0001R+\u00107\u001a\b\u0012\u0004\u0012\u000206038\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b7\u0010V\u001a\u0005\b\u009c\u0001\u0010X\"\u0006\b\u009d\u0001\u0010\u009b\u0001R'\u00109\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b9\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R'\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b;\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R,\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R(\u0010@\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b@\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R(\u0010C\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bC\u0010°\u0001\u001a\u0006\bµ\u0001\u0010²\u0001\"\u0006\b¶\u0001\u0010´\u0001R(\u0010D\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bD\u0010°\u0001\u001a\u0006\b·\u0001\u0010²\u0001\"\u0006\b¸\u0001\u0010´\u0001R(\u0010E\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bE\u0010°\u0001\u001a\u0006\b¹\u0001\u0010²\u0001\"\u0006\bº\u0001\u0010´\u0001R(\u0010G\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bG\u0010°\u0001\u001a\u0006\b»\u0001\u0010²\u0001\"\u0006\b¼\u0001\u0010´\u0001R'\u0010I\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bI\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R,\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Í\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "interceptors", "interceptor", "addInterceptor", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/v0;", "name", "chain", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lv3/l;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "authenticator", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "proxySelector", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "certificatePinner", "", m0.a.Z, "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "Ljava/time/Duration;", "duration", "connectTimeout", "readTimeout", "writeTimeout", bi.aX, "pingInterval", "bytes", "minWebSocketMessageToCompress", "Lokhttp3/OkHttpClient;", "build", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "()Ljava/util/List;", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "<init>", "()V", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {

        @l
        private Authenticator authenticator;

        @m
        private Cache cache;
        private int callTimeout;

        @m
        private CertificateChainCleaner certificateChainCleaner;

        @l
        private CertificatePinner certificatePinner;
        private int connectTimeout;

        @l
        private ConnectionPool connectionPool;

        @l
        private List<ConnectionSpec> connectionSpecs;

        @l
        private CookieJar cookieJar;

        @l
        private Dispatcher dispatcher;

        @l
        private Dns dns;

        @l
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;

        @l
        private HostnameVerifier hostnameVerifier;

        @l
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;

        @l
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;

        @l
        private List<? extends Protocol> protocols;

        @m
        private Proxy proxy;

        @l
        private Authenticator proxyAuthenticator;

        @m
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;

        @m
        private RouteDatabase routeDatabase;

        @l
        private SocketFactory socketFactory;

        @m
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;

        @m
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            l0.o(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        @l
        @h(name = "-addInterceptor")
        /* renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m6567addInterceptor(@l final v3.l<? super Interceptor.Chain, Response> block) {
            l0.p(block, "block");
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                @l
                public final Response intercept(@l Interceptor.Chain chain) {
                    l0.p(chain, "chain");
                    return block.invoke(chain);
                }
            });
        }

        @l
        @h(name = "-addNetworkInterceptor")
        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m6568addNetworkInterceptor(@l final v3.l<? super Interceptor.Chain, Response> block) {
            l0.p(block, "block");
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                @l
                public final Response intercept(@l Interceptor.Chain chain) {
                    l0.p(chain, "chain");
                    return block.invoke(chain);
                }
            });
        }

        @l
        public final Builder addInterceptor(@l Interceptor interceptor) {
            l0.p(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @l
        public final Builder addNetworkInterceptor(@l Interceptor interceptor) {
            l0.p(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @l
        public final Builder authenticator(@l Authenticator authenticator) {
            l0.p(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        @l
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @l
        public final Builder cache(@m Cache cache) {
            this.cache = cache;
            return this;
        }

        @l
        public final Builder callTimeout(long j5, @l TimeUnit unit) {
            l0.p(unit, "unit");
            this.callTimeout = Util.checkDuration(m0.a.Z, j5, unit);
            return this;
        }

        @l
        public final Builder certificatePinner(@l CertificatePinner certificatePinner) {
            l0.p(certificatePinner, "certificatePinner");
            if (!l0.g(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @l
        public final Builder connectTimeout(long j5, @l TimeUnit unit) {
            l0.p(unit, "unit");
            this.connectTimeout = Util.checkDuration(m0.a.Z, j5, unit);
            return this;
        }

        @l
        public final Builder connectionPool(@l ConnectionPool connectionPool) {
            l0.p(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        @l
        public final Builder connectionSpecs(@l List<ConnectionSpec> connectionSpecs) {
            l0.p(connectionSpecs, "connectionSpecs");
            if (!l0.g(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(connectionSpecs);
            return this;
        }

        @l
        public final Builder cookieJar(@l CookieJar cookieJar) {
            l0.p(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        @l
        public final Builder dispatcher(@l Dispatcher dispatcher) {
            l0.p(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        @l
        public final Builder dns(@l Dns dns) {
            l0.p(dns, "dns");
            if (!l0.g(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        @l
        public final Builder eventListener(@l EventListener eventListener) {
            l0.p(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        @l
        public final Builder eventListenerFactory(@l EventListener.Factory eventListenerFactory) {
            l0.p(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        @l
        public final Builder followRedirects(boolean z4) {
            this.followRedirects = z4;
            return this;
        }

        @l
        public final Builder followSslRedirects(boolean z4) {
            this.followSslRedirects = z4;
            return this;
        }

        @l
        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        @m
        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        @m
        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        @l
        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        @l
        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        @l
        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        @l
        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        @l
        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        @l
        public final Dns getDns$okhttp() {
            return this.dns;
        }

        @l
        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        @l
        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        @l
        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        @l
        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        @l
        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        @m
        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        @l
        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        @m
        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        @m
        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        @l
        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        @m
        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        @m
        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        @l
        public final Builder hostnameVerifier(@l HostnameVerifier hostnameVerifier) {
            l0.p(hostnameVerifier, "hostnameVerifier");
            if (!l0.g(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @l
        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        @l
        public final Builder minWebSocketMessageToCompress(long j5) {
            boolean z4;
            if (j5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.minWebSocketMessageToCompress = j5;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j5).toString());
        }

        @l
        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @l
        public final Builder pingInterval(long j5, @l TimeUnit unit) {
            l0.p(unit, "unit");
            this.pingInterval = Util.checkDuration(bi.aX, j5, unit);
            return this;
        }

        @l
        public final Builder protocols(@l List<? extends Protocol> protocols) {
            List V5;
            boolean z4;
            l0.p(protocols, "protocols");
            V5 = e0.V5(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean z5 = false;
            if (!V5.contains(protocol) && !V5.contains(Protocol.HTTP_1_1)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                if (!V5.contains(protocol) || V5.size() <= 1) {
                    z5 = true;
                }
                if (z5) {
                    if (!V5.contains(Protocol.HTTP_1_0)) {
                        l0.n(V5, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                        if (!V5.contains(null)) {
                            V5.remove(Protocol.SPDY_3);
                            if (!l0.g(V5, this.protocols)) {
                                this.routeDatabase = null;
                            }
                            List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(V5);
                            l0.o(unmodifiableList, "unmodifiableList(protocolsCopy)");
                            this.protocols = unmodifiableList;
                            return this;
                        }
                        throw new IllegalArgumentException("protocols must not contain null".toString());
                    }
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + V5).toString());
                }
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + V5).toString());
            }
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + V5).toString());
        }

        @l
        public final Builder proxy(@m Proxy proxy) {
            if (!l0.g(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @l
        public final Builder proxyAuthenticator(@l Authenticator proxyAuthenticator) {
            l0.p(proxyAuthenticator, "proxyAuthenticator");
            if (!l0.g(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        @l
        public final Builder proxySelector(@l ProxySelector proxySelector) {
            l0.p(proxySelector, "proxySelector");
            if (!l0.g(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @l
        public final Builder readTimeout(long j5, @l TimeUnit unit) {
            l0.p(unit, "unit");
            this.readTimeout = Util.checkDuration(m0.a.Z, j5, unit);
            return this;
        }

        @l
        public final Builder retryOnConnectionFailure(boolean z4) {
            this.retryOnConnectionFailure = z4;
            return this;
        }

        public final void setAuthenticator$okhttp(@l Authenticator authenticator) {
            l0.p(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(@m Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i5) {
            this.callTimeout = i5;
        }

        public final void setCertificateChainCleaner$okhttp(@m CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(@l CertificatePinner certificatePinner) {
            l0.p(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i5) {
            this.connectTimeout = i5;
        }

        public final void setConnectionPool$okhttp(@l ConnectionPool connectionPool) {
            l0.p(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(@l List<ConnectionSpec> list) {
            l0.p(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(@l CookieJar cookieJar) {
            l0.p(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(@l Dispatcher dispatcher) {
            l0.p(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(@l Dns dns) {
            l0.p(dns, "<set-?>");
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(@l EventListener.Factory factory) {
            l0.p(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z4) {
            this.followRedirects = z4;
        }

        public final void setFollowSslRedirects$okhttp(boolean z4) {
            this.followSslRedirects = z4;
        }

        public final void setHostnameVerifier$okhttp(@l HostnameVerifier hostnameVerifier) {
            l0.p(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j5) {
            this.minWebSocketMessageToCompress = j5;
        }

        public final void setPingInterval$okhttp(int i5) {
            this.pingInterval = i5;
        }

        public final void setProtocols$okhttp(@l List<? extends Protocol> list) {
            l0.p(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(@m Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(@l Authenticator authenticator) {
            l0.p(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(@m ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i5) {
            this.readTimeout = i5;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z4) {
            this.retryOnConnectionFailure = z4;
        }

        public final void setRouteDatabase$okhttp(@m RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(@l SocketFactory socketFactory) {
            l0.p(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@m SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i5) {
            this.writeTimeout = i5;
        }

        public final void setX509TrustManagerOrNull$okhttp(@m X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @l
        public final Builder socketFactory(@l SocketFactory socketFactory) {
            l0.p(socketFactory, "socketFactory");
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!l0.g(socketFactory, this.socketFactory)) {
                    this.routeDatabase = null;
                }
                this.socketFactory = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        @l
        @k(level = kotlin.m.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final Builder sslSocketFactory(@l SSLSocketFactory sslSocketFactory) {
            l0.p(sslSocketFactory, "sslSocketFactory");
            if (!l0.g(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.Companion;
            X509TrustManager trustManager = companion.get().trustManager(sslSocketFactory);
            if (trustManager != null) {
                this.x509TrustManagerOrNull = trustManager;
                Platform platform = companion.get();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                l0.m(x509TrustManager);
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        @l
        public final Builder writeTimeout(long j5, @l TimeUnit unit) {
            l0.p(unit, "unit");
            this.writeTimeout = Util.checkDuration(m0.a.Z, j5, unit);
            return this;
        }

        @l
        @IgnoreJRERequirement
        public final Builder callTimeout(@l Duration duration) {
            long millis;
            l0.p(duration, "duration");
            millis = duration.toMillis();
            callTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        @IgnoreJRERequirement
        public final Builder connectTimeout(@l Duration duration) {
            long millis;
            l0.p(duration, "duration");
            millis = duration.toMillis();
            connectTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        @IgnoreJRERequirement
        public final Builder pingInterval(@l Duration duration) {
            long millis;
            l0.p(duration, "duration");
            millis = duration.toMillis();
            pingInterval(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        @IgnoreJRERequirement
        public final Builder readTimeout(@l Duration duration) {
            long millis;
            l0.p(duration, "duration");
            millis = duration.toMillis();
            readTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        @IgnoreJRERequirement
        public final Builder writeTimeout(@l Duration duration) {
            long millis;
            l0.p(duration, "duration");
            millis = duration.toMillis();
            writeTimeout(millis, TimeUnit.MILLISECONDS);
            return this;
        }

        @l
        public final Builder sslSocketFactory(@l SSLSocketFactory sslSocketFactory, @l X509TrustManager trustManager) {
            l0.p(sslSocketFactory, "sslSocketFactory");
            l0.p(trustManager, "trustManager");
            if (!l0.g(sslSocketFactory, this.sslSocketFactoryOrNull) || !l0.g(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@l OkHttpClient okHttpClient) {
            this();
            l0.p(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            b0.n0(this.interceptors, okHttpClient.interceptors());
            b0.n0(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        @l
        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }
    }

    public OkHttpClient(@l Builder builder) {
        ProxySelector proxySelector$okhttp;
        l0.p(builder, "builder");
        this.dispatcher = builder.getDispatcher$okhttp();
        this.connectionPool = builder.getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = NullProxySelector.INSTANCE;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            proxySelector$okhttp = proxySelector$okhttp == null ? ProxySelector.getDefault() : proxySelector$okhttp;
            if (proxySelector$okhttp == null) {
                proxySelector$okhttp = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        boolean z4 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ConnectionSpec) it.next()).isTls()) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
            this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
            CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
            l0.m(certificateChainCleaner$okhttp);
            this.certificateChainCleaner = certificateChainCleaner$okhttp;
            X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
            l0.m(x509TrustManagerOrNull$okhttp);
            this.x509TrustManager = x509TrustManagerOrNull$okhttp;
            CertificatePinner certificatePinner$okhttp = builder.getCertificatePinner$okhttp();
            l0.m(certificateChainCleaner$okhttp);
            this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
        } else {
            Platform.Companion companion = Platform.Companion;
            X509TrustManager platformTrustManager = companion.get().platformTrustManager();
            this.x509TrustManager = platformTrustManager;
            Platform platform = companion.get();
            l0.m(platformTrustManager);
            this.sslSocketFactoryOrNull = platform.newSslSocketFactory(platformTrustManager);
            CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.Companion;
            l0.m(platformTrustManager);
            CertificateChainCleaner certificateChainCleaner = companion2.get(platformTrustManager);
            this.certificateChainCleaner = certificateChainCleaner;
            CertificatePinner certificatePinner$okhttp2 = builder.getCertificatePinner$okhttp();
            l0.m(certificateChainCleaner);
            this.certificatePinner = certificatePinner$okhttp2.withCertificateChainCleaner$okhttp(certificateChainCleaner);
        }
        verifyClientState();
    }

    private final void verifyClientState() {
        boolean z4;
        boolean z5;
        boolean z6;
        l0.n(this.interceptors, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        boolean z7 = true;
        if (!r0.contains(null)) {
            l0.n(this.networkInterceptors, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!r0.contains(null)) {
                List<ConnectionSpec> list = this.connectionSpecs;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((ConnectionSpec) it.next()).isTls()) {
                            z4 = false;
                            break;
                        }
                    }
                }
                z4 = true;
                if (z4) {
                    if (this.sslSocketFactoryOrNull == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (this.certificateChainCleaner == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            if (this.x509TrustManager != null) {
                                z7 = false;
                            }
                            if (z7) {
                                if (!l0.g(this.certificatePinner, CertificatePinner.DEFAULT)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (this.sslSocketFactoryOrNull != null) {
                    if (this.certificateChainCleaner != null) {
                        if (this.x509TrustManager != null) {
                            return;
                        } else {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                        }
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                }
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
    }

    @l
    @h(name = "-deprecated_authenticator")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "authenticator", imports = {}))
    /* renamed from: -deprecated_authenticator, reason: not valid java name */
    public final Authenticator m6541deprecated_authenticator() {
        return this.authenticator;
    }

    @h(name = "-deprecated_cache")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cache", imports = {}))
    @m
    /* renamed from: -deprecated_cache, reason: not valid java name */
    public final Cache m6542deprecated_cache() {
        return this.cache;
    }

    @h(name = "-deprecated_callTimeoutMillis")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "callTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m6543deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @l
    @h(name = "-deprecated_certificatePinner")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "certificatePinner", imports = {}))
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m6544deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @h(name = "-deprecated_connectTimeoutMillis")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m6545deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @l
    @h(name = "-deprecated_connectionPool")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionPool", imports = {}))
    /* renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final ConnectionPool m6546deprecated_connectionPool() {
        return this.connectionPool;
    }

    @l
    @h(name = "-deprecated_connectionSpecs")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionSpecs", imports = {}))
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m6547deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @l
    @h(name = "-deprecated_cookieJar")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cookieJar", imports = {}))
    /* renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final CookieJar m6548deprecated_cookieJar() {
        return this.cookieJar;
    }

    @l
    @h(name = "-deprecated_dispatcher")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "dispatcher", imports = {}))
    /* renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final Dispatcher m6549deprecated_dispatcher() {
        return this.dispatcher;
    }

    @l
    @h(name = "-deprecated_dns")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "dns", imports = {}))
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m6550deprecated_dns() {
        return this.dns;
    }

    @l
    @h(name = "-deprecated_eventListenerFactory")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "eventListenerFactory", imports = {}))
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final EventListener.Factory m6551deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @h(name = "-deprecated_followRedirects")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "followRedirects", imports = {}))
    /* renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m6552deprecated_followRedirects() {
        return this.followRedirects;
    }

    @h(name = "-deprecated_followSslRedirects")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "followSslRedirects", imports = {}))
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m6553deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @l
    @h(name = "-deprecated_hostnameVerifier")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostnameVerifier", imports = {}))
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m6554deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @l
    @h(name = "-deprecated_interceptors")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "interceptors", imports = {}))
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m6555deprecated_interceptors() {
        return this.interceptors;
    }

    @l
    @h(name = "-deprecated_networkInterceptors")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "networkInterceptors", imports = {}))
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m6556deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @h(name = "-deprecated_pingIntervalMillis")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "pingIntervalMillis", imports = {}))
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m6557deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @l
    @h(name = "-deprecated_protocols")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocols", imports = {}))
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m6558deprecated_protocols() {
        return this.protocols;
    }

    @h(name = "-deprecated_proxy")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    @m
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m6559deprecated_proxy() {
        return this.proxy;
    }

    @l
    @h(name = "-deprecated_proxyAuthenticator")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxyAuthenticator", imports = {}))
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m6560deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @l
    @h(name = "-deprecated_proxySelector")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxySelector", imports = {}))
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m6561deprecated_proxySelector() {
        return this.proxySelector;
    }

    @h(name = "-deprecated_readTimeoutMillis")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "readTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m6562deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @h(name = "-deprecated_retryOnConnectionFailure")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "retryOnConnectionFailure", imports = {}))
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m6563deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @l
    @h(name = "-deprecated_socketFactory")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketFactory", imports = {}))
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m6564deprecated_socketFactory() {
        return this.socketFactory;
    }

    @l
    @h(name = "-deprecated_sslSocketFactory")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sslSocketFactory", imports = {}))
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m6565deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @h(name = "-deprecated_writeTimeoutMillis")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "writeTimeoutMillis", imports = {}))
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m6566deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @l
    @h(name = "authenticator")
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    @h(name = "cache")
    @m
    public final Cache cache() {
        return this.cache;
    }

    @h(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @h(name = "certificateChainCleaner")
    @m
    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @l
    @h(name = "certificatePinner")
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @l
    public Object clone() {
        return super.clone();
    }

    @h(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @l
    @h(name = "connectionPool")
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @l
    @h(name = "connectionSpecs")
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @l
    @h(name = "cookieJar")
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @l
    @h(name = "dispatcher")
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @l
    @h(name = "dns")
    public final Dns dns() {
        return this.dns;
    }

    @l
    @h(name = "eventListenerFactory")
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @h(name = "followRedirects")
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    @h(name = "followSslRedirects")
    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @l
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @l
    @h(name = "hostnameVerifier")
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @l
    @h(name = "interceptors")
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    @h(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @l
    @h(name = "networkInterceptors")
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @l
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    @l
    public Call newCall(@l Request request) {
        l0.p(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    @l
    public WebSocket newWebSocket(@l Request request, @l WebSocketListener listener) {
        l0.p(request, "request");
        l0.p(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    @h(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @l
    @h(name = "protocols")
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @h(name = "proxy")
    @m
    public final Proxy proxy() {
        return this.proxy;
    }

    @l
    @h(name = "proxyAuthenticator")
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @l
    @h(name = "proxySelector")
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @h(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @h(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @l
    @h(name = "socketFactory")
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @l
    @h(name = "sslSocketFactory")
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @h(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @h(name = "x509TrustManager")
    @m
    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
