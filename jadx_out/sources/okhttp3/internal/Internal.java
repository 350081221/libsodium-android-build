package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

@i0(d1 = {"\u0000R\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004\u001a\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014\u001a\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t¨\u0006\u001f"}, d2 = {"", "currentTimeMillis", "Lokhttp3/HttpUrl;", "url", "", "setCookie", "Lokhttp3/Cookie;", "parseCookie", "cookie", "", "forObsoleteRfc2965", "cookieToString", "Lokhttp3/Headers$Builder;", "builder", "line", "addHeaderLenient", "name", b.f22420d, "Lokhttp3/Cache;", "cache", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheGet", "Lokhttp3/ConnectionSpec;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lkotlin/r2;", "applyConnectionSpec", "okhttp"}, k = 2, mv = {1, 8, 0})
@h(name = "Internal")
/* loaded from: classes4.dex */
public final class Internal {
    @l
    public static final Headers.Builder addHeaderLenient(@l Headers.Builder builder, @l String line) {
        l0.p(builder, "builder");
        l0.p(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(@l ConnectionSpec connectionSpec, @l SSLSocket sslSocket, boolean z4) {
        l0.p(connectionSpec, "connectionSpec");
        l0.p(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z4);
    }

    @m
    public static final Response cacheGet(@l Cache cache, @l Request request) {
        l0.p(cache, "cache");
        l0.p(request, "request");
        return cache.get$okhttp(request);
    }

    @l
    public static final String cookieToString(@l Cookie cookie, boolean z4) {
        l0.p(cookie, "cookie");
        return cookie.toString$okhttp(z4);
    }

    @m
    public static final Cookie parseCookie(long j5, @l HttpUrl url, @l String setCookie) {
        l0.p(url, "url");
        l0.p(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j5, url, setCookie);
    }

    @l
    public static final Headers.Builder addHeaderLenient(@l Headers.Builder builder, @l String name, @l String value) {
        l0.p(builder, "builder");
        l0.p(name, "name");
        l0.p(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
