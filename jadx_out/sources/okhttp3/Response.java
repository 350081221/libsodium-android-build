package okhttp3;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.b1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.BufferedSource;
import org.apache.http.auth.AUTH;
import p4.l;
import p4.m;
import t0.b;
import u3.h;
import u3.i;

@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001RB}\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010!\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u00107\u001a\u00020\u001f\u0012\u0006\u00109\u001a\u00020\u001f\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bP\u0010QJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\u0006\u0010\u0016\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0007J\u000f\u0010\u0018\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fJ\u0011\u0010%\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u0006\u0010'\u001a\u00020&J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010,\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b+\u0010)J\u0011\u0010.\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b-\u0010)J\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0017J\u000f\u00104\u001a\u000201H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u001fH\u0007¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u00020\u001fH\u0007¢\u0006\u0004\b8\u00106J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b\t\u0010\bR\u0017\u0010\u0011\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u001b8\u0007¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010%\u001a\u0004\u0018\u00010!8\u0007¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\b%\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b*\u0010D\u001a\u0004\b*\u0010)R\u0019\u0010,\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b,\u0010D\u001a\u0004\b,\u0010)R\u0019\u0010.\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\b.\u0010)R\u0017\u00107\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b7\u0010E\u001a\u0004\b7\u00106R\u0017\u00109\u001a\u00020\u001f8\u0007¢\u0006\f\n\u0004\b9\u0010E\u001a\u0004\b9\u00106R\u001c\u0010G\u001a\u0004\u0018\u00010F8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u0018\u0010J\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b4\u00103¨\u0006S"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "-deprecated_request", "()Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "protocol", "", "-deprecated_code", "()I", PluginConstants.KEY_ERROR_CODE, "", "-deprecated_message", "()Ljava/lang/String;", CrashHianalyticsData.MESSAGE, "Lokhttp3/Handshake;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "handshake", "name", "", TTDownloadField.TT_HEADERS, "defaultValue", "header", "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", "", "byteCount", "Lokhttp3/ResponseBody;", "peekBody", "-deprecated_body", "()Lokhttp3/ResponseBody;", "body", "Lokhttp3/Response$Builder;", "newBuilder", "-deprecated_networkResponse", "()Lokhttp3/Response;", "networkResponse", "-deprecated_cacheResponse", "cacheResponse", "-deprecated_priorResponse", "priorResponse", "Lokhttp3/Challenge;", "challenges", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "sentRequestAtMillis", "-deprecated_receivedResponseAtMillis", "receivedResponseAtMillis", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "toString", "Lokhttp3/Request;", "Lokhttp3/Protocol;", "Ljava/lang/String;", "I", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "Lokhttp3/Response;", "J", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "lazyCacheControl", "Lokhttp3/CacheControl;", "", "isSuccessful", "()Z", "isRedirect", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
/* loaded from: classes4.dex */
public final class Response implements Closeable {

    @m
    private final ResponseBody body;

    @m
    private final Response cacheResponse;
    private final int code;

    @m
    private final Exchange exchange;

    @m
    private final Handshake handshake;

    @l
    private final Headers headers;

    @m
    private CacheControl lazyCacheControl;

    @l
    private final String message;

    @m
    private final Response networkResponse;

    @m
    private final Response priorResponse;

    @l
    private final Protocol protocol;
    private final long receivedResponseAtMillis;

    @l
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(@l Request request, @l Protocol protocol, @l String message, int i5, @m Handshake handshake, @l Headers headers, @m ResponseBody responseBody, @m Response response, @m Response response2, @m Response response3, long j5, long j6, @m Exchange exchange) {
        l0.p(request, "request");
        l0.p(protocol, "protocol");
        l0.p(message, "message");
        l0.p(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i5;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j5;
        this.receivedResponseAtMillis = j6;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @h(name = "-deprecated_body")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "body", imports = {}))
    @m
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m6574deprecated_body() {
        return this.body;
    }

    @l
    @h(name = "-deprecated_cacheControl")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheControl", imports = {}))
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m6575deprecated_cacheControl() {
        return cacheControl();
    }

    @h(name = "-deprecated_cacheResponse")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheResponse", imports = {}))
    @m
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m6576deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @h(name = "-deprecated_code")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = PluginConstants.KEY_ERROR_CODE, imports = {}))
    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m6577deprecated_code() {
        return this.code;
    }

    @h(name = "-deprecated_handshake")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "handshake", imports = {}))
    @m
    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m6578deprecated_handshake() {
        return this.handshake;
    }

    @l
    @h(name = "-deprecated_headers")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = TTDownloadField.TT_HEADERS, imports = {}))
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m6579deprecated_headers() {
        return this.headers;
    }

    @l
    @h(name = "-deprecated_message")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = CrashHianalyticsData.MESSAGE, imports = {}))
    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m6580deprecated_message() {
        return this.message;
    }

    @h(name = "-deprecated_networkResponse")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "networkResponse", imports = {}))
    @m
    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m6581deprecated_networkResponse() {
        return this.networkResponse;
    }

    @h(name = "-deprecated_priorResponse")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "priorResponse", imports = {}))
    @m
    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m6582deprecated_priorResponse() {
        return this.priorResponse;
    }

    @l
    @h(name = "-deprecated_protocol")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocol", imports = {}))
    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m6583deprecated_protocol() {
        return this.protocol;
    }

    @h(name = "-deprecated_receivedResponseAtMillis")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "receivedResponseAtMillis", imports = {}))
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m6584deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @l
    @h(name = "-deprecated_request")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "request", imports = {}))
    /* renamed from: -deprecated_request, reason: not valid java name */
    public final Request m6585deprecated_request() {
        return this.request;
    }

    @h(name = "-deprecated_sentRequestAtMillis")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sentRequestAtMillis", imports = {}))
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m6586deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @h(name = "body")
    @m
    public final ResponseBody body() {
        return this.body;
    }

    @l
    @h(name = "cacheControl")
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    @h(name = "cacheResponse")
    @m
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @l
    public final List<Challenge> challenges() {
        String str;
        List<Challenge> E;
        Headers headers = this.headers;
        int i5 = this.code;
        if (i5 != 401) {
            if (i5 != 407) {
                E = w.E();
                return E;
            }
            str = AUTH.PROXY_AUTH;
        } else {
            str = AUTH.WWW_AUTH;
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    @h(name = PluginConstants.KEY_ERROR_CODE)
    public final int code() {
        return this.code;
    }

    @h(name = "exchange")
    @m
    public final Exchange exchange() {
        return this.exchange;
    }

    @h(name = "handshake")
    @m
    public final Handshake handshake() {
        return this.handshake;
    }

    @m
    @i
    public final String header(@l String name) {
        l0.p(name, "name");
        return header$default(this, name, null, 2, null);
    }

    @m
    @i
    public final String header(@l String name, @m String str) {
        l0.p(name, "name");
        String str2 = this.headers.get(name);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    @l
    @h(name = TTDownloadField.TT_HEADERS)
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i5 = this.code;
        if (i5 != 307 && i5 != 308) {
            switch (i5) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i5 = this.code;
        return 200 <= i5 && i5 < 300;
    }

    @l
    @h(name = CrashHianalyticsData.MESSAGE)
    public final String message() {
        return this.message;
    }

    @h(name = "networkResponse")
    @m
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @l
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @l
    public final ResponseBody peekBody(long j5) throws IOException {
        ResponseBody responseBody = this.body;
        l0.m(responseBody);
        BufferedSource peek = responseBody.source().peek();
        okio.l lVar = new okio.l();
        peek.request(j5);
        lVar.o0(peek, Math.min(j5, peek.g().M0()));
        return ResponseBody.Companion.create(lVar, this.body.contentType(), lVar.M0());
    }

    @h(name = "priorResponse")
    @m
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @l
    @h(name = "protocol")
    public final Protocol protocol() {
        return this.protocol;
    }

    @h(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @l
    @h(name = "request")
    public final Request request() {
        return this.request;
    }

    @h(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @l
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @l
    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    @l
    public final List<String> headers(@l String name) {
        l0.p(name, "name");
        return this.headers.values(name);
    }

    @i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b_\u0010`B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b_\u0010NJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010%\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0017\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\u001f\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010S\u001a\u0004\bX\u0010U\"\u0004\bY\u0010WR$\u0010Z\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010#¨\u0006a"}, d2 = {"Lokhttp3/Response$Builder;", "", "", "name", "Lokhttp3/Response;", "response", "Lkotlin/r2;", "checkSupportResponse", "checkPriorResponse", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", PluginConstants.KEY_ERROR_CODE, CrashHianalyticsData.MESSAGE, "Lokhttp3/Handshake;", "handshake", b.f22420d, "header", "addHeader", "removeHeader", "Lokhttp3/Headers;", TTDownloadField.TT_HEADERS, "Lokhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "initExchange", "build", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "()Lokhttp3/Response;", "setNetworkResponse$okhttp", "(Lokhttp3/Response;)V", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    /* loaded from: classes4.dex */
    public static class Builder {

        @m
        private ResponseBody body;

        @m
        private Response cacheResponse;
        private int code;

        @m
        private Exchange exchange;

        @m
        private Handshake handshake;

        @l
        private Headers.Builder headers;

        @m
        private String message;

        @m
        private Response networkResponse;

        @m
        private Response priorResponse;

        @m
        private Protocol protocol;
        private long receivedResponseAtMillis;

        @m
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            boolean z4;
            boolean z5;
            boolean z6;
            if (response != null) {
                boolean z7 = true;
                if (response.body() == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (response.networkResponse() == null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (response.cacheResponse() == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            if (response.priorResponse() != null) {
                                z7 = false;
                            }
                            if (!z7) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        @l
        public Builder addHeader(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @l
        public Builder body(@m ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        @l
        public Response build() {
            boolean z4;
            int i5 = this.code;
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                Request request = this.request;
                if (request != null) {
                    Protocol protocol = this.protocol;
                    if (protocol != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request, protocol, str, i5, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.code).toString());
        }

        @l
        public Builder cacheResponse(@m Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        @l
        public Builder code(int i5) {
            this.code = i5;
            return this;
        }

        @m
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @m
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @m
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        @m
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @l
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @m
        public final String getMessage$okhttp() {
            return this.message;
        }

        @m
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @m
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @m
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @m
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @l
        public Builder handshake(@m Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @l
        public Builder header(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            this.headers.set(name, value);
            return this;
        }

        @l
        public Builder headers(@l Headers headers) {
            l0.p(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@l Exchange deferredTrailers) {
            l0.p(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        @l
        public Builder message(@l String message) {
            l0.p(message, "message");
            this.message = message;
            return this;
        }

        @l
        public Builder networkResponse(@m Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        @l
        public Builder priorResponse(@m Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        @l
        public Builder protocol(@l Protocol protocol) {
            l0.p(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @l
        public Builder receivedResponseAtMillis(long j5) {
            this.receivedResponseAtMillis = j5;
            return this;
        }

        @l
        public Builder removeHeader(@l String name) {
            l0.p(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        @l
        public Builder request(@l Request request) {
            l0.p(request, "request");
            this.request = request;
            return this;
        }

        @l
        public Builder sentRequestAtMillis(long j5) {
            this.sentRequestAtMillis = j5;
            return this;
        }

        public final void setBody$okhttp(@m ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@m Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i5) {
            this.code = i5;
        }

        public final void setExchange$okhttp(@m Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(@m Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(@l Headers.Builder builder) {
            l0.p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@m String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@m Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@m Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@m Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j5) {
            this.receivedResponseAtMillis = j5;
        }

        public final void setRequest$okhttp(@m Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j5) {
            this.sentRequestAtMillis = j5;
        }

        public Builder(@l Response response) {
            l0.p(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
