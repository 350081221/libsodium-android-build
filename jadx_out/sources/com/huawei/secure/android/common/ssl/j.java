package com.huawei.secure.android.common.ssl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8970a = "SecureX509SingleInstance";

    /* renamed from: b, reason: collision with root package name */
    private static volatile k f8971b;

    private j() {
    }

    @SuppressLint({"NewApi"})
    public static k a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            com.huawei.secure.android.common.ssl.util.e.b(context);
            if (f8971b == null) {
                synchronized (j.class) {
                    if (f8971b == null) {
                        InputStream o5 = com.huawei.secure.android.common.ssl.util.a.o(context);
                        if (o5 == null) {
                            com.huawei.secure.android.common.ssl.util.i.e(f8970a, "get assets bks");
                            o5 = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            com.huawei.secure.android.common.ssl.util.i.e(f8970a, "get files bks");
                        }
                        f8971b = new k(o5, "");
                        new com.huawei.secure.android.common.ssl.util.f().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                }
            }
            com.huawei.secure.android.common.ssl.util.i.b(f8970a, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return f8971b;
        }
        throw new NullPointerException("context is null");
    }

    public static void b(InputStream inputStream) {
        String str = f8970a;
        com.huawei.secure.android.common.ssl.util.i.e(str, "update bks");
        long currentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f8971b != null) {
            f8971b = new k(inputStream, "");
            h.b(f8971b);
            g.b(f8971b);
        }
        com.huawei.secure.android.common.ssl.util.i.e(str, "SecureX509TrustManager update bks cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }
}
