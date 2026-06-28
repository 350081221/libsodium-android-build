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
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9023a = "CertificateUtil";

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.InputStream] */
    public static X509Certificate a(Context context) {
        InputStream inputStream;
        KeyStore keyStore;
        InputStream inputStream2 = null;
        X509Certificate x509Certificate = null;
        try {
            try {
                keyStore = KeyStore.getInstance(l.f9038e);
                inputStream = context.getAssets().open("hmsrootcas.bks");
            } catch (Throwable th) {
                inputStream2 = context;
                th = th;
                h.g(inputStream2);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            inputStream = null;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (RuntimeException e6) {
            e = e6;
            inputStream = null;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (KeyStoreException e7) {
            e = e7;
            inputStream = null;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            inputStream = null;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (CertificateException e9) {
            e = e9;
            inputStream = null;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (Throwable th2) {
            th = th2;
            h.g(inputStream2);
            throw th;
        }
        try {
            inputStream.reset();
            keyStore.load(inputStream, "".toCharArray());
            x509Certificate = (X509Certificate) keyStore.getCertificate(l.f9039f);
            context = inputStream;
        } catch (IOException e10) {
            e = e10;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (RuntimeException e11) {
            e = e11;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (KeyStoreException e12) {
            e = e12;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        } catch (CertificateException e14) {
            e = e14;
            i.d(f9023a, "loadBksCA: exception : " + e.getMessage());
            context = inputStream;
            h.g(context);
            return x509Certificate;
        }
        h.g(context);
        return x509Certificate;
    }
}
