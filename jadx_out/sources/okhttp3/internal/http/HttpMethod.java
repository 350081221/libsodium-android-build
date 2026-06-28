package okhttp3.internal.http;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpMethod {

    @l
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    @m
    public static final boolean permitsRequestBody(@l String method) {
        l0.p(method, "method");
        if (!l0.g(method, HttpGet.METHOD_NAME) && !l0.g(method, HttpHead.METHOD_NAME)) {
            return true;
        }
        return false;
    }

    @m
    public static final boolean requiresRequestBody(@l String method) {
        l0.p(method, "method");
        if (!l0.g(method, HttpPost.METHOD_NAME) && !l0.g(method, HttpPut.METHOD_NAME) && !l0.g(method, "PATCH") && !l0.g(method, "PROPPATCH") && !l0.g(method, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(@l String method) {
        l0.p(method, "method");
        if (!l0.g(method, HttpPost.METHOD_NAME) && !l0.g(method, "PATCH") && !l0.g(method, HttpPut.METHOD_NAME) && !l0.g(method, HttpDelete.METHOD_NAME) && !l0.g(method, "MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(@l String method) {
        l0.p(method, "method");
        return !l0.g(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(@l String method) {
        l0.p(method, "method");
        return l0.g(method, "PROPFIND");
    }
}
