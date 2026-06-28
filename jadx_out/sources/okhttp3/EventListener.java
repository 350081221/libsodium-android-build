package okhttp3;

import androidx.core.app.NotificationCompat;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000b0\tH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u000200H\u0016¨\u0006B"}, d2 = {"Lokhttp3/EventListener;", "", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lkotlin/r2;", "callStart", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "Lu3/n;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/Connection;", android.net.http.Headers.CONN_DIRECTIVE, "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", SyncStorageEngine.MESG_CANCELED, "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "<init>", "()V", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class EventListener {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/EventListener$Companion;", "", "()V", "NONE", "Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "create", "Lokhttp3/EventListener;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Factory {
        @l
        EventListener create(@l Call call);
    }

    public void cacheConditionalHit(@l Call call, @l Response cachedResponse) {
        l0.p(call, "call");
        l0.p(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@l Call call, @l Response response) {
        l0.p(call, "call");
        l0.p(response, "response");
    }

    public void cacheMiss(@l Call call) {
        l0.p(call, "call");
    }

    public void callEnd(@l Call call) {
        l0.p(call, "call");
    }

    public void callFailed(@l Call call, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(ioe, "ioe");
    }

    public void callStart(@l Call call) {
        l0.p(call, "call");
    }

    public void canceled(@l Call call) {
        l0.p(call, "call");
    }

    public void connectEnd(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy, @m Protocol protocol) {
        l0.p(call, "call");
        l0.p(inetSocketAddress, "inetSocketAddress");
        l0.p(proxy, "proxy");
    }

    public void connectFailed(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy, @m Protocol protocol, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(inetSocketAddress, "inetSocketAddress");
        l0.p(proxy, "proxy");
        l0.p(ioe, "ioe");
    }

    public void connectStart(@l Call call, @l InetSocketAddress inetSocketAddress, @l Proxy proxy) {
        l0.p(call, "call");
        l0.p(inetSocketAddress, "inetSocketAddress");
        l0.p(proxy, "proxy");
    }

    public void connectionAcquired(@l Call call, @l Connection connection) {
        l0.p(call, "call");
        l0.p(connection, "connection");
    }

    public void connectionReleased(@l Call call, @l Connection connection) {
        l0.p(call, "call");
        l0.p(connection, "connection");
    }

    public void dnsEnd(@l Call call, @l String domainName, @l List<InetAddress> inetAddressList) {
        l0.p(call, "call");
        l0.p(domainName, "domainName");
        l0.p(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@l Call call, @l String domainName) {
        l0.p(call, "call");
        l0.p(domainName, "domainName");
    }

    public void proxySelectEnd(@l Call call, @l HttpUrl url, @l List<Proxy> proxies) {
        l0.p(call, "call");
        l0.p(url, "url");
        l0.p(proxies, "proxies");
    }

    public void proxySelectStart(@l Call call, @l HttpUrl url) {
        l0.p(call, "call");
        l0.p(url, "url");
    }

    public void requestBodyEnd(@l Call call, long j5) {
        l0.p(call, "call");
    }

    public void requestBodyStart(@l Call call) {
        l0.p(call, "call");
    }

    public void requestFailed(@l Call call, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(ioe, "ioe");
    }

    public void requestHeadersEnd(@l Call call, @l Request request) {
        l0.p(call, "call");
        l0.p(request, "request");
    }

    public void requestHeadersStart(@l Call call) {
        l0.p(call, "call");
    }

    public void responseBodyEnd(@l Call call, long j5) {
        l0.p(call, "call");
    }

    public void responseBodyStart(@l Call call) {
        l0.p(call, "call");
    }

    public void responseFailed(@l Call call, @l IOException ioe) {
        l0.p(call, "call");
        l0.p(ioe, "ioe");
    }

    public void responseHeadersEnd(@l Call call, @l Response response) {
        l0.p(call, "call");
        l0.p(response, "response");
    }

    public void responseHeadersStart(@l Call call) {
        l0.p(call, "call");
    }

    public void satisfactionFailure(@l Call call, @l Response response) {
        l0.p(call, "call");
        l0.p(response, "response");
    }

    public void secureConnectEnd(@l Call call, @m Handshake handshake) {
        l0.p(call, "call");
    }

    public void secureConnectStart(@l Call call) {
        l0.p(call, "call");
    }
}
