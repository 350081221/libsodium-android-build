package com.huawei.agconnect.credential.obs;

import android.content.Context;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.https.OKHttpBuilder;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    static final long f7945a = 5000;

    /* renamed from: b, reason: collision with root package name */
    private static final String f7946b = "ClientImpl";

    /* renamed from: c, reason: collision with root package name */
    private OKHttpBuilder f7947c;

    public q(Context context, List<Interceptor> list, boolean z4) {
        this.f7947c = a(context);
        if (list != null && list.size() > 0) {
            Iterator<Interceptor> it = list.iterator();
            while (it.hasNext()) {
                this.f7947c.addInterceptor(it.next());
            }
        }
        if (z4) {
            this.f7947c.connectTimeout(5000L).readTimeout(5000L).writeTimeout(5000L);
        }
    }

    private OKHttpBuilder a(Context context) {
        OKHttpBuilder oKHttpBuilder;
        try {
            try {
                try {
                    try {
                        try {
                            this.f7947c = new OKHttpBuilder().sslSocketFactory(com.huawei.secure.android.common.ssl.i.e(context), new com.huawei.secure.android.common.ssl.k(context));
                        } catch (NoSuchAlgorithmException e5) {
                            Logger.e(f7946b, "NoSuchAlgorithmException", e5);
                            oKHttpBuilder = new OKHttpBuilder();
                            this.f7947c = oKHttpBuilder;
                            return this.f7947c;
                        }
                    } catch (KeyManagementException e6) {
                        Logger.e(f7946b, "KeyManagementException", e6);
                        oKHttpBuilder = new OKHttpBuilder();
                        this.f7947c = oKHttpBuilder;
                        return this.f7947c;
                    }
                } catch (IllegalAccessException e7) {
                    Logger.e(f7946b, "IllegalAccessException", e7);
                    oKHttpBuilder = new OKHttpBuilder();
                    this.f7947c = oKHttpBuilder;
                    return this.f7947c;
                } catch (KeyStoreException e8) {
                    Logger.e(f7946b, "KeyStoreException", e8);
                    oKHttpBuilder = new OKHttpBuilder();
                    this.f7947c = oKHttpBuilder;
                    return this.f7947c;
                }
            } catch (IOException e9) {
                Logger.e(f7946b, "IOException", e9);
                oKHttpBuilder = new OKHttpBuilder();
                this.f7947c = oKHttpBuilder;
                return this.f7947c;
            } catch (CertificateException e10) {
                Logger.e(f7946b, "CertificateException", e10);
                oKHttpBuilder = new OKHttpBuilder();
                this.f7947c = oKHttpBuilder;
                return this.f7947c;
            }
            return this.f7947c;
        } catch (Throwable th) {
            this.f7947c = new OKHttpBuilder();
            throw th;
        }
    }

    public q a(Authenticator authenticator) {
        if (authenticator != null) {
            this.f7947c.authenticator(authenticator);
        }
        return this;
    }

    public OkHttpClient a() {
        return this.f7947c.build();
    }

    public OkHttpClient a(long j5, TimeUnit timeUnit) {
        return this.f7947c.buildWithTimeOut(j5, timeUnit);
    }
}
