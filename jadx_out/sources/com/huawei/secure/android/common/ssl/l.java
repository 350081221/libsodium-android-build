package com.huawei.secure.android.common.ssl;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import com.huawei.secure.android.common.ssl.m;
import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8980a = "WebViewSSLCheck";

    public static void a(SslErrorHandler sslErrorHandler, SslError sslError, Context context) {
        b(sslErrorHandler, sslError, null, context, null);
    }

    public static void b(SslErrorHandler sslErrorHandler, SslError sslError, String str, Context context, m.a aVar) {
        String str2 = f8980a;
        com.huawei.secure.android.common.ssl.util.i.e(str2, " error type : " + sslError.getPrimaryError() + " , cn is : " + sslError.getCertificate().getIssuedTo().getCName());
        X509Certificate a5 = com.huawei.secure.android.common.ssl.util.d.a(sslError.getCertificate());
        X509Certificate a6 = new com.huawei.secure.android.common.ssl.util.l(context).a();
        com.huawei.secure.android.common.ssl.util.i.b(str2, "checkServerCertificateNew: error certificate is : " + a5);
        if (com.huawei.secure.android.common.ssl.util.d.e(a6, a5)) {
            com.huawei.secure.android.common.ssl.util.i.e(str2, "checkServerCertificateNew: proceed");
            if (aVar != null) {
                aVar.a(context, str);
                return;
            } else {
                sslErrorHandler.proceed();
                return;
            }
        }
        com.huawei.secure.android.common.ssl.util.i.d(str2, "checkServerCertificateNew: cancel");
        if (aVar != null) {
            aVar.b(context, str);
        } else {
            sslErrorHandler.cancel();
        }
    }

    public static boolean c(String str, SslError sslError) {
        return d(com.huawei.secure.android.common.ssl.util.d.b(str), sslError);
    }

    public static boolean d(X509Certificate x509Certificate, SslError sslError) {
        return com.huawei.secure.android.common.ssl.util.d.e(x509Certificate, com.huawei.secure.android.common.ssl.util.d.a(sslError.getCertificate()));
    }
}
