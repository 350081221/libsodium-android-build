package com.huawei.agconnect.https;

import com.efs.sdk.base.Constants;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.l;
import okio.m;
import okio.y0;
import okio.z;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
class c implements Interceptor {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends RequestBody {

        /* renamed from: a, reason: collision with root package name */
        private final RequestBody f7991a;

        public a(RequestBody requestBody) {
            this.f7991a = requestBody;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.parse("application/x-gzip");
        }

        @Override // okhttp3.RequestBody
        public void writeTo(m mVar) throws IOException {
            m d5 = y0.d(new z(mVar));
            this.f7991a.writeTo(d5);
            d5.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends RequestBody {

        /* renamed from: a, reason: collision with root package name */
        RequestBody f7992a;

        /* renamed from: b, reason: collision with root package name */
        l f7993b;

        b(RequestBody requestBody) throws IOException {
            this.f7993b = null;
            this.f7992a = requestBody;
            l lVar = new l();
            this.f7993b = lVar;
            requestBody.writeTo(lVar);
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f7993b.M0();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f7992a.contentType();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(m mVar) throws IOException {
            mVar.v0(this.f7993b.N0());
        }
    }

    private RequestBody a(RequestBody requestBody) throws IOException {
        return new b(requestBody);
    }

    private RequestBody b(RequestBody requestBody) {
        return new a(requestBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return (request.body() == null || request.header(HTTP.CONTENT_ENCODING) != null) ? chain.proceed(request) : chain.proceed(request.newBuilder().header(HTTP.CONTENT_ENCODING, Constants.CP_GZIP).method(request.method(), a(b(request.body()))).build());
    }
}
