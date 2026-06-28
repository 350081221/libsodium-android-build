package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class p implements X509TrustManager {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9002c = "WebViewX509TrustManger";

    /* renamed from: a, reason: collision with root package name */
    private X509Certificate f9003a;

    /* renamed from: b, reason: collision with root package name */
    private List<X509TrustManager> f9004b = new ArrayList();

    public p(Context context) {
        if (context != null) {
            com.huawei.secure.android.common.ssl.util.e.b(context);
            X509Certificate c5 = new com.huawei.secure.android.common.ssl.util.l(context).c();
            this.f9003a = c5;
            if (c5 != null) {
                return;
            } else {
                throw new NullPointerException("WebViewX509TrustManger cannot get cbg root ca");
            }
        }
        throw new NullPointerException("WebViewX509TrustManger context is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        com.huawei.secure.android.common.ssl.util.i.e(f9002c, "checkClientTrusted");
        if (!this.f9004b.isEmpty()) {
            this.f9004b.get(0).checkClientTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkClientTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        com.huawei.secure.android.common.ssl.util.i.e(f9002c, "checkServerTrusted");
        boolean z4 = false;
        for (int i5 = 0; i5 < x509CertificateArr.length; i5++) {
            com.huawei.secure.android.common.ssl.util.i.b(f9002c, "checkServerTrusted " + i5 + " : " + x509CertificateArr[i5].getIssuerDN().getName());
        }
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i6 = 0; i6 < x509CertificateArr.length; i6++) {
            x509CertificateArr2[i6] = x509CertificateArr[(x509CertificateArr.length - 1) - i6];
        }
        CertificateException e5 = new CertificateException("CBG root CA CertificateException");
        try {
            z4 = com.huawei.secure.android.common.ssl.util.d.f(this.f9003a, x509CertificateArr2);
        } catch (InvalidKeyException e6) {
            com.huawei.secure.android.common.ssl.util.i.d(f9002c, "checkServerTrusted InvalidKeyException: " + e6.getMessage());
        } catch (NoSuchAlgorithmException e7) {
            com.huawei.secure.android.common.ssl.util.i.d(f9002c, "checkServerTrusted NoSuchAlgorithmException: " + e7.getMessage());
        } catch (NoSuchProviderException e8) {
            com.huawei.secure.android.common.ssl.util.i.d(f9002c, "checkServerTrusted NoSuchProviderException: " + e8.getMessage());
        } catch (SignatureException e9) {
            com.huawei.secure.android.common.ssl.util.i.d(f9002c, "checkServerTrusted SignatureException: " + e9.getMessage());
        } catch (CertificateException e10) {
            e5 = e10;
            com.huawei.secure.android.common.ssl.util.i.d(f9002c, "checkServerTrusted CertificateException: " + e5.getMessage());
        }
        if (!z4) {
            throw e5;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f9004b.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e5) {
            com.huawei.secure.android.common.ssl.util.i.d(f9002c, "getAcceptedIssuers exception : " + e5.getMessage());
            return new X509Certificate[0];
        }
    }
}
