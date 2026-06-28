package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.a1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.text.e0;
import kotlin.u0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import p4.l;
import p4.m;
import t0.b;
import u3.h;
import u3.i;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001*BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010\u001e\u001a\u00020\u0005J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u0004\u0018\u00010\u0001J#\u0010$\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\f¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b)R\u0015\u0010\b\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0017R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001a¨\u0006+"}, d2 = {"Lokhttp3/Request;", "", "url", "Lokhttp3/HttpUrl;", "method", "", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "tags", "", "Ljava/lang/Class;", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "()Lokhttp3/RequestBody;", "cacheControl", "Lokhttp3/CacheControl;", "()Lokhttp3/CacheControl;", "()Lokhttp3/Headers;", "isHttps", "", "()Z", "lazyCacheControl", "()Ljava/lang/String;", "getTags$okhttp", "()Ljava/util/Map;", "()Lokhttp3/HttpUrl;", "-deprecated_body", "-deprecated_cacheControl", "header", "name", "-deprecated_headers", "", "-deprecated_method", "newBuilder", "Lokhttp3/Request$Builder;", TTDownloadField.TT_TAG, "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "toString", "-deprecated_url", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Request {

    @m
    private final RequestBody body;

    @l
    private final Headers headers;

    @m
    private CacheControl lazyCacheControl;

    @l
    private final String method;

    @l
    private final Map<Class<?>, Object> tags;

    @l
    private final HttpUrl url;

    @i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*H\u0016J\u0014\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017J\b\u0010,\u001a\u00020\u0000H\u0016J\b\u0010-\u001a\u00020\u0000H\u0016J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020/H\u0016J\u001a\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0013H\u0016J-\u00104\u001a\u00020\u0000\"\u0004\b\u0000\u001052\u000e\u00106\u001a\n\u0012\u0006\b\u0000\u0012\u0002H50\u001a2\b\u00104\u001a\u0004\u0018\u0001H5H\u0016¢\u0006\u0002\u00107J\u0012\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u000208H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u00010\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00069"}, d2 = {"Lokhttp3/Request$Builder;", "", "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "tags", "", "Ljava/lang/Class;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "addHeader", "name", b.f22420d, "build", "cacheControl", "Lokhttp3/CacheControl;", "delete", "get", "head", "header", "Lokhttp3/Headers;", "patch", "post", "put", "removeHeader", TTDownloadField.TT_TAG, "T", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    /* loaded from: classes4.dex */
    public static class Builder {

        @m
        private RequestBody body;

        @l
        private Headers.Builder headers;

        @l
        private String method;

        @l
        private Map<Class<?>, Object> tags;

        @m
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = HttpGet.METHOD_NAME;
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i5 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        @l
        public Builder addHeader(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @l
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @l
        public Builder cacheControl(@l CacheControl cacheControl) {
            boolean z4;
            l0.p(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return removeHeader(OpenStreetMapTileProviderConstants.HTTP_CACHECONTROL_HEADER);
            }
            return header(OpenStreetMapTileProviderConstants.HTTP_CACHECONTROL_HEADER, cacheControl2);
        }

        @l
        @i
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @l
        @i
        public Builder delete(@m RequestBody requestBody) {
            return method(HttpDelete.METHOD_NAME, requestBody);
        }

        @l
        public Builder get() {
            return method(HttpGet.METHOD_NAME, null);
        }

        @m
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @l
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @l
        public final String getMethod$okhttp() {
            return this.method;
        }

        @l
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @m
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @l
        public Builder head() {
            return method(HttpHead.METHOD_NAME, null);
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

        @l
        public Builder method(@l String method, @m RequestBody requestBody) {
            boolean z4;
            l0.p(method, "method");
            if (method.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(method))) {
                        throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(method)) {
                    throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
                }
                this.method = method;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @l
        public Builder patch(@l RequestBody body) {
            l0.p(body, "body");
            return method("PATCH", body);
        }

        @l
        public Builder post(@l RequestBody body) {
            l0.p(body, "body");
            return method(HttpPost.METHOD_NAME, body);
        }

        @l
        public Builder put(@l RequestBody body) {
            l0.p(body, "body");
            return method(HttpPut.METHOD_NAME, body);
        }

        @l
        public Builder removeHeader(@l String name) {
            l0.p(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(@m RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@l Headers.Builder builder) {
            l0.p(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@l String str) {
            l0.p(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@l Map<Class<?>, Object> map) {
            l0.p(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@m HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @l
        public Builder tag(@m Object obj) {
            return tag(Object.class, obj);
        }

        @l
        public Builder url(@l HttpUrl url) {
            l0.p(url, "url");
            this.url = url;
            return this;
        }

        @l
        public <T> Builder tag(@l Class<? super T> type, @m T t5) {
            l0.p(type, "type");
            if (t5 == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T cast = type.cast(t5);
                l0.m(cast);
                map.put(type, cast);
            }
            return this;
        }

        @l
        public Builder url(@l String url) {
            boolean q22;
            boolean q23;
            l0.p(url, "url");
            q22 = e0.q2(url, "ws:", true);
            if (q22) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = url.substring(3);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                url = sb.toString();
            } else {
                q23 = e0.q2(url, "wss:", true);
                if (q23) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https:");
                    String substring2 = url.substring(4);
                    l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring2);
                    url = sb2.toString();
                }
            }
            return url(HttpUrl.Companion.get(url));
        }

        public Builder(@l Request request) {
            Map<Class<?>, Object> J0;
            l0.p(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                J0 = new LinkedHashMap<>();
            } else {
                J0 = a1.J0(request.getTags$okhttp());
            }
            this.tags = J0;
            this.headers = request.headers().newBuilder();
        }

        @l
        public Builder url(@l URL url) {
            l0.p(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            l0.o(url2, "url.toString()");
            return url(companion.get(url2));
        }
    }

    public Request(@l HttpUrl url, @l String method, @l Headers headers, @m RequestBody requestBody, @l Map<Class<?>, ? extends Object> tags) {
        l0.p(url, "url");
        l0.p(method, "method");
        l0.p(headers, "headers");
        l0.p(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    @h(name = "-deprecated_body")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "body", imports = {}))
    @m
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m6569deprecated_body() {
        return this.body;
    }

    @l
    @h(name = "-deprecated_cacheControl")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cacheControl", imports = {}))
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m6570deprecated_cacheControl() {
        return cacheControl();
    }

    @l
    @h(name = "-deprecated_headers")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = TTDownloadField.TT_HEADERS, imports = {}))
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m6571deprecated_headers() {
        return this.headers;
    }

    @l
    @h(name = "-deprecated_method")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "method", imports = {}))
    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m6572deprecated_method() {
        return this.method;
    }

    @l
    @h(name = "-deprecated_url")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "url", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m6573deprecated_url() {
        return this.url;
    }

    @h(name = "body")
    @m
    public final RequestBody body() {
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

    @l
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @m
    public final String header(@l String name) {
        l0.p(name, "name");
        return this.headers.get(name);
    }

    @l
    @h(name = TTDownloadField.TT_HEADERS)
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @l
    @h(name = "method")
    public final String method() {
        return this.method;
    }

    @l
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @m
    public final Object tag() {
        return tag(Object.class);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i5 = 0;
            for (u0<? extends String, ? extends String> u0Var : this.headers) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    w.W();
                }
                u0<? extends String, ? extends String> u0Var2 = u0Var;
                String component1 = u0Var2.component1();
                String component2 = u0Var2.component2();
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(component1);
                sb.append(':');
                sb.append(component2);
                i5 = i6;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    @h(name = "url")
    public final HttpUrl url() {
        return this.url;
    }

    @l
    public final List<String> headers(@l String name) {
        l0.p(name, "name");
        return this.headers.values(name);
    }

    @m
    public final <T> T tag(@l Class<? extends T> type) {
        l0.p(type, "type");
        return type.cast(this.tags.get(type));
    }
}
