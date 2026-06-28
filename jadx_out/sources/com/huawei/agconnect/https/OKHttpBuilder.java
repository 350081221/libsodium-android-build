package com.huawei.agconnect.https;

import android.util.Log;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public class OKHttpBuilder {
    private OkHttpClient.Builder builder = new OkHttpClient.Builder();

    public OKHttpBuilder addInterceptor(Interceptor interceptor) {
        if (interceptor == null) {
            throw new IllegalArgumentException("interceptor == null");
        }
        this.builder.addInterceptor(interceptor);
        return this;
    }

    public OKHttpBuilder authenticator(Authenticator authenticator) {
        this.builder.authenticator(authenticator);
        return this;
    }

    public OkHttpClient build() {
        return this.builder.build();
    }

    public OkHttpClient buildWithTimeOut(long j5, TimeUnit timeUnit) {
        return this.builder.connectTimeout(j5, timeUnit).readTimeout(j5, timeUnit).writeTimeout(j5, timeUnit).build();
    }

    public OKHttpBuilder connectTimeout(long j5) {
        this.builder.connectTimeout(j5, TimeUnit.MILLISECONDS);
        return this;
    }

    public OKHttpBuilder enableGzip() {
        this.builder.addInterceptor(new c());
        return this;
    }

    public OKHttpBuilder readTimeout(long j5) {
        this.builder.readTimeout(j5, TimeUnit.MILLISECONDS);
        return this;
    }

    public OKHttpBuilder setRetryTimes(int i5) {
        this.builder.addInterceptor(new g(i5));
        return this;
    }

    public OKHttpBuilder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        try {
            this.builder.sslSocketFactory(sSLSocketFactory, x509TrustManager);
        } catch (NoSuchMethodError unused) {
            Log.d("OKHttpBuilder", "use default ssl");
        }
        return this;
    }

    public OKHttpBuilder writeTimeout(long j5) {
        this.builder.writeTimeout(j5, TimeUnit.MILLISECONDS);
        return this;
    }
}
