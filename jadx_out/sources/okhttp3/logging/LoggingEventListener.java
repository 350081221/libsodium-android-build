package okhttp3.logging;

import android.net.http.Headers;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001FB\u0011\b\u0002\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J2\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010=\u001a\u000201H\u0016R\u0016\u0010?\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "", CrashHianalyticsData.MESSAGE, "Lkotlin/r2;", "logWithTime", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", Headers.CONN_DIRECTIVE, "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", SyncStorageEngine.MESG_CANCELED, "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "startNs", "J", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Factory", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    @i0(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "create", "Lokhttp3/EventListener;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        /* JADX WARN: Multi-variable type inference failed */
        @i
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @i
        public Factory(@l HttpLoggingInterceptor.Logger logger) {
            l0.p(logger, "logger");
            this.logger = logger;
        }

        @Override // okhttp3.EventListener.Factory
        @l
        public EventListener create(@l Call call) {
            l0.p(call, "call");
            return new LoggingEventListener(this.logger, null);
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i5, w wVar) {
            this((i5 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, w wVar) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@l Call call, @l Response cachedResponse) {
        l0.p(call, "call");
        l0.p(cachedResponse, "cachedResponse");
        logWithTime("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@l Call call, @l Response response) {
        l0.p(call, "call");
        l0.p(response, "response");
        logWithTime("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(@l Call call) {
        l0.p(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(@l Call call) {
        l0.p(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(@l Call call, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(ioe, "ioe");
        logWithTime("callFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void callStart(@l Call call) {
        l0.p(call, "call");
        this.startNs = System.nanoTime();
        logWithTime("callStart: " + call.request());
    }

    @Override // okhttp3.EventListener
    public void canceled(@l Call call) {
        l0.p(call, "call");
        logWithTime(SyncStorageEngine.MESG_CANCELED);
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy, @m Protocol protocol) {
        l0.p(call, "call");
        l0.p(inetSocketAddress, "inetSocketAddress");
        l0.p(proxy, "proxy");
        logWithTime("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy, @m Protocol protocol, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(inetSocketAddress, "inetSocketAddress");
        l0.p(proxy, "proxy");
        l0.p(ioe, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + ioe);
    }

    @Override // okhttp3.EventListener
    public void connectStart(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy) {
        l0.p(call, "call");
        l0.p(inetSocketAddress, "inetSocketAddress");
        l0.p(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@l Call call, @l Connection connection) {
        l0.p(call, "call");
        l0.p(connection, "connection");
        logWithTime("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@l Call call, @l Connection connection) {
        l0.p(call, "call");
        l0.p(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@l Call call, @l String domainName, @l List<? extends InetAddress> inetAddressList) {
        l0.p(call, "call");
        l0.p(domainName, "domainName");
        l0.p(inetAddressList, "inetAddressList");
        logWithTime("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@l Call call, @l String domainName) {
        l0.p(call, "call");
        l0.p(domainName, "domainName");
        logWithTime("dnsStart: " + domainName);
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(@l Call call, @l HttpUrl url, @l List<? extends Proxy> proxies) {
        l0.p(call, "call");
        l0.p(url, "url");
        l0.p(proxies, "proxies");
        logWithTime("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(@l Call call, @l HttpUrl url) {
        l0.p(call, "call");
        l0.p(url, "url");
        logWithTime("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@l Call call, long j5) {
        l0.p(call, "call");
        logWithTime("requestBodyEnd: byteCount=" + j5);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@l Call call) {
        l0.p(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@l Call call, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(ioe, "ioe");
        logWithTime("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@l Call call, @l Request request) {
        l0.p(call, "call");
        l0.p(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@l Call call) {
        l0.p(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@l Call call, long j5) {
        l0.p(call, "call");
        logWithTime("responseBodyEnd: byteCount=" + j5);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@l Call call) {
        l0.p(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@l Call call, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(ioe, "ioe");
        logWithTime("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@l Call call, @l Response response) {
        l0.p(call, "call");
        l0.p(response, "response");
        logWithTime("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@l Call call) {
        l0.p(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(@l Call call, @l Response response) {
        l0.p(call, "call");
        l0.p(response, "response");
        logWithTime("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@l Call call, @m Handshake handshake) {
        l0.p(call, "call");
        logWithTime("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@l Call call) {
        l0.p(call, "call");
        logWithTime("secureConnectStart");
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}
