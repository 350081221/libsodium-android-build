package okhttp3.internal.http;

import com.efs.sdk.base.Constants;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.e0;
import o0.a;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.a0;
import okio.y0;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import p4.l;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "cookieJar", "Lokhttp3/CookieJar;", "(Lokhttp3/CookieJar;)V", "cookieHeader", "", "cookies", "", "Lokhttp3/Cookie;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Instrumented
@r1({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
/* loaded from: classes4.dex */
public final class BridgeInterceptor implements Interceptor {

    @l
    private final CookieJar cookieJar;

    public BridgeInterceptor(@l CookieJar cookieJar) {
        l0.p(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String cookieHeader(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                w.W();
            }
            Cookie cookie = (Cookie) obj;
            if (i5 > 0) {
                sb.append("; ");
            }
            sb.append(cookie.name());
            sb.append(a.f20835h);
            sb.append(cookie.value());
            i5 = i6;
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    @l
    public Response intercept(@l Interceptor.Chain chain) throws IOException {
        Request build;
        Response.Builder newBuilder;
        boolean K1;
        ResponseBody body;
        l0.p(chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder2 = request.newBuilder();
        RequestBody body2 = request.body();
        if (body2 != null) {
            MediaType contentType = body2.contentType();
            if (contentType != null) {
                newBuilder2.header(HTTP.CONTENT_TYPE, contentType.toString());
            }
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                newBuilder2.header(HTTP.CONTENT_LEN, String.valueOf(contentLength));
                newBuilder2.removeHeader(HTTP.TRANSFER_ENCODING);
            } else {
                newBuilder2.header(HTTP.TRANSFER_ENCODING, HTTP.CHUNK_CODING);
                newBuilder2.removeHeader(HTTP.CONTENT_LEN);
            }
        }
        boolean z4 = false;
        if (request.header(HTTP.TARGET_HOST) == null) {
            newBuilder2.header(HTTP.TARGET_HOST, Util.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header(HTTP.CONN_DIRECTIVE) == null) {
            newBuilder2.header(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            newBuilder2.header("Accept-Encoding", Constants.CP_GZIP);
            z4 = true;
        }
        List<Cookie> loadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder2.header(SM.COOKIE, cookieHeader(loadForRequest));
        }
        if (request.header(HTTP.USER_AGENT) == null) {
            newBuilder2.header(HTTP.USER_AGENT, Util.userAgent);
        }
        if (!(newBuilder2 instanceof Request.Builder)) {
            build = newBuilder2.build();
        } else {
            build = OkHttp3Instrumentation.build(newBuilder2);
        }
        Response proceed = chain.proceed(build);
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), proceed.headers());
        if (!(proceed instanceof Response.Builder)) {
            newBuilder = proceed.newBuilder();
        } else {
            newBuilder = OkHttp3Instrumentation.newBuilder((Response.Builder) proceed);
        }
        Response.Builder request2 = newBuilder.request(request);
        if (z4) {
            K1 = e0.K1(Constants.CP_GZIP, Response.header$default(proceed, HTTP.CONTENT_ENCODING, null, 2, null), true);
            if (K1 && HttpHeaders.promisesBody(proceed) && (body = proceed.body()) != null) {
                a0 a0Var = new a0(body.source());
                request2.headers(proceed.headers().newBuilder().removeAll(HTTP.CONTENT_ENCODING).removeAll(HTTP.CONTENT_LEN).build());
                OkHttp3Instrumentation.body(request2, new RealResponseBody(Response.header$default(proceed, HTTP.CONTENT_TYPE, null, 2, null), -1L, y0.e(a0Var)));
            }
        }
        return request2.build();
    }
}
