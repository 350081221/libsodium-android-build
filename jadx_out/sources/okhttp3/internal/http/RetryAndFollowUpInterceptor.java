package okhttp3.internal.http;

import androidx.core.app.NotificationCompat;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import p4.l;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", "", "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Instrumented
/* loaded from: classes4.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;

    @l
    private final OkHttpClient client;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public RetryAndFollowUpInterceptor(@l OkHttpClient client) {
        l0.p(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        boolean z4;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, "Location", null, 2, null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!l0.g(resolve.scheme(), response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            int code = response.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (!httpMethod.redirectsWithBody(str) && code != 308 && code != 307) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (httpMethod.redirectsToGet(str) && code != 308 && code != 307) {
                newBuilder.method(HttpGet.METHOD_NAME, null);
            } else {
                if (z4) {
                    requestBody = response.request().body();
                }
                newBuilder.method(str, requestBody);
            }
            if (!z4) {
                newBuilder.removeHeader(HTTP.TRANSFER_ENCODING);
                newBuilder.removeHeader(HTTP.CONTENT_LEN);
                newBuilder.removeHeader(HTTP.CONTENT_TYPE);
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
            newBuilder.removeHeader(AUTH.WWW_AUTH_RESP);
        }
        Request.Builder url = newBuilder.url(resolve);
        if (!(url instanceof Request.Builder)) {
            return url.build();
        }
        return OkHttp3Instrumentation.build(url);
    }

    private final Request followUpRequest(Response response, Exchange exchange) throws IOException {
        Route route;
        RealConnection connection$okhttp;
        if (exchange != null && (connection$okhttp = exchange.getConnection$okhttp()) != null) {
            route = connection$okhttp.route();
        } else {
            route = null;
        }
        int code = response.code();
        String method = response.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code != 421) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure()) {
                                    return null;
                                }
                                RequestBody body = response.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                Response priorResponse = response.priorResponse();
                                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(response, 0) > 0) {
                                    return null;
                                }
                                return response.request();
                            }
                        } else {
                            l0.m(route);
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, response);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response priorResponse2 = response.priorResponse();
                        if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(response, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return response.request();
                    }
                } else {
                    RequestBody body2 = response.request().body();
                    if ((body2 != null && body2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                        return null;
                    }
                    exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return response.request();
                }
            } else {
                return this.client.authenticator().authenticate(route, response);
            }
        }
        return buildRedirectRequest(response, method);
    }

    private final boolean isRecoverable(IOException iOException, boolean z4) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z4) {
                return false;
            }
            return true;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean z4) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((z4 && requestIsOneShot(iOException, request)) || !isRecoverable(iOException, z4) || !realCall.retryAfterFailure()) {
            return false;
        }
        return true;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        if ((body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int retryAfter(Response response, int i5) {
        String header$default = Response.header$default(response, "Retry-After", null, 2, null);
        if (header$default == null) {
            return i5;
        }
        if (new r("\\d+").matches(header$default)) {
            Integer valueOf = Integer.valueOf(header$default);
            l0.o(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if ((r0 instanceof okhttp3.Response.Builder) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r0 = r0.newBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if ((r7 instanceof okhttp3.Response.Builder) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r6 = r7.newBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if ((r6 instanceof okhttp3.Response.Builder) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r6 = r6.body(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r0 = r0.priorResponse(r6.build()).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r6 = com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation.body(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r6 = com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r0 = com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation.newBuilder((okhttp3.Response.Builder) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r7 = r0;
        r0 = r1.getInterceptorScopedExchange$okhttp();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r6 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r0.isOneShot() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        r0 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        if (r8 > 20) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006a, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r0.isDuplex$okhttp() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0078, code lost:
    
        return r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r0v8, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // okhttp3.Interceptor
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(@p4.l okhttp3.Interceptor.Chain r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
