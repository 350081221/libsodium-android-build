package okhttp3.internal.cache;

import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import okhttp3.Cache;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSource;
import okio.l1;
import okio.n1;
import okio.p1;
import okio.y0;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "cache", "Lokhttp3/Cache;", "(Lokhttp3/Cache;)V", "getCache$okhttp", "()Lokhttp3/Cache;", "cacheWritingResponse", "Lokhttp3/Response;", "cacheRequest", "Lokhttp3/internal/cache/CacheRequest;", "response", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Instrumented
/* loaded from: classes4.dex */
public final class CacheInterceptor implements Interceptor {

    @l
    public static final Companion Companion = new Companion(null);

    @m
    private final Cache cache;

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "()V", "combine", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isContentSpecificHeader", "", "fieldName", "", "isEndToEnd", "stripBody", "Lokhttp3/Response;", "response", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Instrumented
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            boolean K1;
            boolean s22;
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                String name = headers.name(i5);
                String value = headers.value(i5);
                K1 = e0.K1("Warning", name, true);
                if (K1) {
                    s22 = e0.s2(value, "1", false, 2, null);
                    if (s22) {
                    }
                }
                if (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null) {
                    builder.addLenient$okhttp(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String name2 = headers2.name(i6);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i6));
                }
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String str) {
            boolean K1;
            boolean K12;
            boolean K13;
            K1 = e0.K1(HTTP.CONTENT_LEN, str, true);
            if (K1) {
                return true;
            }
            K12 = e0.K1(HTTP.CONTENT_ENCODING, str, true);
            if (K12) {
                return true;
            }
            K13 = e0.K1(HTTP.CONTENT_TYPE, str, true);
            if (K13) {
                return true;
            }
            return false;
        }

        private final boolean isEndToEnd(String str) {
            boolean K1;
            boolean K12;
            boolean K13;
            boolean K14;
            boolean K15;
            boolean K16;
            boolean K17;
            boolean K18;
            K1 = e0.K1(HTTP.CONN_DIRECTIVE, str, true);
            if (!K1) {
                K12 = e0.K1(HTTP.CONN_KEEP_ALIVE, str, true);
                if (!K12) {
                    K13 = e0.K1(AUTH.PROXY_AUTH, str, true);
                    if (!K13) {
                        K14 = e0.K1(AUTH.PROXY_AUTH_RESP, str, true);
                        if (!K14) {
                            K15 = e0.K1("TE", str, true);
                            if (!K15) {
                                K16 = e0.K1("Trailers", str, true);
                                if (!K16) {
                                    K17 = e0.K1(HTTP.TRANSFER_ENCODING, str, true);
                                    if (!K17) {
                                        K18 = e0.K1("Upgrade", str, true);
                                        if (!K18) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final Response stripBody(Response response) {
            ResponseBody responseBody;
            Response.Builder newBuilder;
            Response.Builder body;
            if (response != 0) {
                responseBody = response.body();
            } else {
                responseBody = null;
            }
            if (responseBody != null) {
                if (!(response instanceof Response.Builder)) {
                    newBuilder = response.newBuilder();
                } else {
                    newBuilder = OkHttp3Instrumentation.newBuilder((Response.Builder) response);
                }
                if (!(newBuilder instanceof Response.Builder)) {
                    body = newBuilder.body(null);
                } else {
                    body = OkHttp3Instrumentation.body(newBuilder, null);
                }
                return body.build();
            }
            return response;
        }
    }

    public CacheInterceptor(@m Cache cache) {
        this.cache = cache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        Response.Builder newBuilder;
        Response.Builder body;
        if (cacheRequest == null) {
            return response;
        }
        l1 body2 = cacheRequest.body();
        ResponseBody body3 = response.body();
        l0.m(body3);
        final BufferedSource source = body3.source();
        final okio.m d5 = y0.d(body2);
        n1 n1Var = new n1() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                BufferedSource.this.close();
            }

            @Override // okio.n1
            public long read(@l okio.l sink, long j5) throws IOException {
                l0.p(sink, "sink");
                try {
                    long read = BufferedSource.this.read(sink, j5);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            d5.close();
                        }
                        return -1L;
                    }
                    sink.y(d5.g(), sink.M0() - read, read);
                    d5.x();
                    return read;
                } catch (IOException e5) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e5;
                }
            }

            @Override // okio.n1
            @l
            public p1 timeout() {
                return BufferedSource.this.timeout();
            }
        };
        String header$default = Response.header$default(response, HTTP.CONTENT_TYPE, null, 2, null);
        long contentLength = response.body().contentLength();
        if (!(response instanceof Response.Builder)) {
            newBuilder = response.newBuilder();
        } else {
            newBuilder = OkHttp3Instrumentation.newBuilder((Response.Builder) response);
        }
        RealResponseBody realResponseBody = new RealResponseBody(header$default, contentLength, y0.e(n1Var));
        if (!(newBuilder instanceof Response.Builder)) {
            body = newBuilder.body(realResponseBody);
        } else {
            body = OkHttp3Instrumentation.body(newBuilder, realResponseBody);
        }
        return body.build();
    }

    @m
    public final Cache getCache$okhttp() {
        return this.cache;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(@p4.l okhttp3.Interceptor.Chain r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
