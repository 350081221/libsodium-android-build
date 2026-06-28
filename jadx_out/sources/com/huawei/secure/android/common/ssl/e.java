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
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8926a = "SSFSecureX509SingleInstance";

    /* renamed from: b, reason: collision with root package name */
    private static volatile k f8927b;

    private e() {
    }

    @SuppressLint({"NewApi"})
    public static k a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        if (context != null) {
            com.huawei.secure.android.common.ssl.util.e.b(context);
            if (f8927b == null) {
                synchronized (e.class) {
                    if (f8927b == null) {
                        InputStream o5 = com.huawei.secure.android.common.ssl.util.a.o(context);
                        if (o5 == null) {
                            com.huawei.secure.android.common.ssl.util.i.e(f8926a, "get assets bks");
                            o5 = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            com.huawei.secure.android.common.ssl.util.i.e(f8926a, "get files bks");
                        }
                        f8927b = new k(o5, "", true);
                        new com.huawei.secure.android.common.ssl.util.g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                }
            }
            return f8927b;
        }
        throw new NullPointerException("context is null");
    }

    public static void b(InputStream inputStream) {
        String str = f8926a;
        com.huawei.secure.android.common.ssl.util.i.e(str, "update bks");
        long currentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f8927b != null) {
            f8927b = new k(inputStream, "", true);
            com.huawei.secure.android.common.ssl.util.i.b(str, "updateBks: new SecureX509TrustManager cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            d.b(f8927b);
            c.b(f8927b);
        }
        com.huawei.secure.android.common.ssl.util.i.b(str, "update bks cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }
}
