package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9035b = "X509CertificateUtil";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9036c = "hmsrootcas.bks";

    /* renamed from: d, reason: collision with root package name */
    public static final String f9037d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final String f9038e = "bks";

    /* renamed from: f, reason: collision with root package name */
    public static final String f9039f = "052root";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9040g = "hmsincas.bks";

    /* renamed from: h, reason: collision with root package name */
    private static final String f9041h = "huawei cbg application integration ca";

    /* renamed from: a, reason: collision with root package name */
    private Context f9042a;

    public l(Context context) {
        this.f9042a = context;
    }

    public X509Certificate a() {
        return b(f9040g, f9041h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public X509Certificate b(String str, String str2) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        X509Certificate x509Certificate = null;
        try {
            try {
                KeyStore keyStore = KeyStore.getInstance(f9038e);
                inputStream = this.f9042a.getAssets().open(str);
                try {
                    inputStream.reset();
                    keyStore.load(inputStream, "".toCharArray());
                    x509Certificate = (X509Certificate) keyStore.getCertificate(str2);
                    str = inputStream;
                } catch (IOException e5) {
                    e = e5;
                    i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    h.g(str);
                    return x509Certificate;
                } catch (KeyStoreException e6) {
                    e = e6;
                    i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    h.g(str);
                    return x509Certificate;
                } catch (NoSuchAlgorithmException e7) {
                    e = e7;
                    i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    h.g(str);
                    return x509Certificate;
                } catch (CertificateException e8) {
                    e = e8;
                    i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
                    str = inputStream;
                    h.g(str);
                    return x509Certificate;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = str;
                h.g(inputStream2);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            inputStream = null;
            i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            h.g(str);
            return x509Certificate;
        } catch (KeyStoreException e10) {
            e = e10;
            inputStream = null;
            i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            h.g(str);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            inputStream = null;
            i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            h.g(str);
            return x509Certificate;
        } catch (CertificateException e12) {
            e = e12;
            inputStream = null;
            i.d(f9035b, "loadBksCA: exception : " + e.getMessage());
            str = inputStream;
            h.g(str);
            return x509Certificate;
        } catch (Throwable th2) {
            th = th2;
            h.g(inputStream2);
            throw th;
        }
        h.g(str);
        return x509Certificate;
    }

    public X509Certificate c() {
        return b("hmsrootcas.bks", f9039f);
    }
}
