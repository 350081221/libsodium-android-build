package com.huawei.agconnect.https;

import com.huawei.agconnect.https.Adapter;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes3.dex */
public abstract class Method<HttpsRequest> {
    HttpsRequest httpsRequest;

    /* loaded from: classes3.dex */
    public static class Get<HttpsRequest> extends Method {
        public Get(HttpsRequest httpsrequest) {
            this.httpsRequest = httpsrequest;
        }

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            return f.a(this.httpsRequest).a();
        }
    }

    /* loaded from: classes3.dex */
    public static class Post<HttpsRequest> extends Method {
        Adapter.Factory factory;

        public Post(HttpsRequest httpsrequest, Adapter.Factory factory) {
            init(httpsrequest, factory);
        }

        private void init(HttpsRequest httpsrequest, Adapter.Factory factory) {
            this.httpsRequest = httpsrequest;
            this.factory = factory;
        }

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            Request.Builder a5 = f.a(this.httpsRequest).a();
            try {
                if (this.factory.requestBodyAdapter() != null) {
                    return createBody(a5, (RequestBody) this.factory.requestBodyAdapter().adapter(this.httpsRequest));
                }
                throw new IllegalArgumentException("RequestBodyAdapter should not be null.");
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        public Request.Builder createBody(Request.Builder builder, RequestBody requestBody) {
            builder.post(requestBody);
            return builder;
        }
    }

    /* loaded from: classes3.dex */
    public static class Put<HttpsRequest> extends Post {
        public Put(HttpsRequest httpsrequest, Adapter.Factory factory) {
            super(httpsrequest, factory);
        }

        @Override // com.huawei.agconnect.https.Method.Post
        public Request.Builder createBody(Request.Builder builder, RequestBody requestBody) {
            builder.put(requestBody);
            return builder;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a<HttpsRequest> extends Method {

        /* renamed from: a, reason: collision with root package name */
        Adapter.Factory f7969a;

        public a(HttpsRequest httpsrequest) {
            this.httpsRequest = httpsrequest;
        }

        public a(HttpsRequest httpsrequest, Adapter.Factory factory) {
            this.httpsRequest = httpsrequest;
            this.f7969a = factory;
        }

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            Request.Builder a5 = f.a(this.httpsRequest).a();
            Adapter.Factory factory = this.f7969a;
            if (factory == null || factory.requestBodyAdapter() == null) {
                a5.delete();
            } else {
                try {
                    a5.delete((RequestBody) this.f7969a.requestBodyAdapter().adapter(this.httpsRequest));
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            }
            return a5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Request.Builder create();
}
