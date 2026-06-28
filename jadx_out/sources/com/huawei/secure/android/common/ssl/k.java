package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class k implements X509TrustManager {

    /* renamed from: c, reason: collision with root package name */
    private static final String f8972c = "k";

    /* renamed from: d, reason: collision with root package name */
    public static final String f8973d = "hmsrootcas.bks";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8974e = "";

    /* renamed from: f, reason: collision with root package name */
    private static final String f8975f = "X509";

    /* renamed from: g, reason: collision with root package name */
    private static final String f8976g = "bks";

    /* renamed from: h, reason: collision with root package name */
    private static final String f8977h = "AndroidCAStore";

    /* renamed from: a, reason: collision with root package name */
    protected List<X509TrustManager> f8978a;

    /* renamed from: b, reason: collision with root package name */
    private X509Certificate[] f8979b;

    public k(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        this(context, false);
    }

    private void a() {
        com.huawei.secure.android.common.ssl.util.i.e(f8972c, "loadSystemCA");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance(f8977h);
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f8975f);
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f8978a.add((X509TrustManager) trustManager);
                }
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
            com.huawei.secure.android.common.ssl.util.i.d(f8972c, "loadSystemCA: exception : " + e5.getMessage());
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8972c, "loadSystemCA: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    private void b(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        boolean z4;
        String str = f8972c;
        com.huawei.secure.android.common.ssl.util.i.e(str, "loadBksCA");
        long currentTimeMillis = System.currentTimeMillis();
        InputStream o5 = com.huawei.secure.android.common.ssl.util.a.o(context);
        if (o5 != null) {
            try {
                com.huawei.secure.android.common.ssl.util.i.e(str, "get bks not from assets");
                c(o5);
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
                com.huawei.secure.android.common.ssl.util.i.d(f8972c, "loadBksCA: exception : " + e5.getMessage());
                z4 = false;
            }
        }
        z4 = true;
        if (!z4 || o5 == null) {
            com.huawei.secure.android.common.ssl.util.i.e(f8972c, " get bks from assets ");
            c(context.getAssets().open("hmsrootcas.bks"));
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8972c, "loadBksCA: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    private void c(InputStream inputStream) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f8975f);
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f8978a.add((X509TrustManager) trustManager);
                }
            }
        } finally {
            com.huawei.secure.android.common.ssl.util.h.g(inputStream);
        }
    }

    private void d(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f8975f);
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, str.toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (TrustManager trustManager : trustManagers) {
                        if (trustManager instanceof X509TrustManager) {
                            this.f8978a.add((X509TrustManager) trustManager);
                        }
                    }
                    com.huawei.secure.android.common.ssl.util.h.g(inputStream);
                } finally {
                    com.huawei.secure.android.common.ssl.util.h.g(inputStream);
                }
            } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e5) {
                com.huawei.secure.android.common.ssl.util.i.d(f8972c, "loadInputStream: exception : " + e5.getMessage());
            }
            com.huawei.secure.android.common.ssl.util.i.b(f8972c, "loadInputStream: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return;
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        com.huawei.secure.android.common.ssl.util.i.e(f8972c, "checkClientTrusted: ");
        Iterator<X509TrustManager> it = this.f8978a.iterator();
        while (it.hasNext()) {
            try {
                it.next().checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e5) {
                com.huawei.secure.android.common.ssl.util.i.d(f8972c, "checkServerTrusted CertificateException" + e5.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        g(x509CertificateArr);
        com.huawei.secure.android.common.ssl.util.i.e(f8972c, "checkServerTrusted begin ,server ca chain size is : " + x509CertificateArr.length + " ,auth type is : " + str);
        long currentTimeMillis = System.currentTimeMillis();
        int length = x509CertificateArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            X509Certificate x509Certificate = x509CertificateArr[i5];
            String str2 = f8972c;
            com.huawei.secure.android.common.ssl.util.i.b(str2, "server ca chain: getSubjectDN is :" + x509Certificate.getSubjectDN());
            com.huawei.secure.android.common.ssl.util.i.b(str2, "IssuerDN :" + x509Certificate.getIssuerDN());
            com.huawei.secure.android.common.ssl.util.i.b(str2, "SerialNumber : " + x509Certificate.getSerialNumber());
        }
        int size = this.f8978a.size();
        for (int i6 = 0; i6 < size; i6++) {
            try {
                String str3 = f8972c;
                com.huawei.secure.android.common.ssl.util.i.e(str3, "check server i : " + i6);
                X509TrustManager x509TrustManager = this.f8978a.get(i6);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    com.huawei.secure.android.common.ssl.util.i.e(str3, "client root ca size is : " + acceptedIssuers.length);
                    for (int i7 = 0; i7 < acceptedIssuers.length; i7++) {
                        com.huawei.secure.android.common.ssl.util.i.b(f8972c, "client root ca getIssuerDN :" + acceptedIssuers[i7].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                com.huawei.secure.android.common.ssl.util.i.e(f8972c, "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e5) {
                String str4 = f8972c;
                com.huawei.secure.android.common.ssl.util.i.d(str4, "checkServerTrusted error :" + e5.getMessage() + " , time : " + i6);
                if (i6 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        com.huawei.secure.android.common.ssl.util.i.d(str4, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e5;
                }
            }
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8972c, "checkServerTrusted: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public X509Certificate[] e() {
        return this.f8979b;
    }

    public List<X509TrustManager> f() {
        return this.f8978a;
    }

    public void g(X509Certificate[] x509CertificateArr) {
        this.f8979b = x509CertificateArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f8978a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e5) {
            com.huawei.secure.android.common.ssl.util.i.d(f8972c, "getAcceptedIssuers exception : " + e5.getMessage());
            return new X509Certificate[0];
        }
    }

    public void h(List<X509TrustManager> list) {
        this.f8978a = list;
    }

    public k(Context context, boolean z4) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f8978a = new ArrayList();
        if (context != null) {
            com.huawei.secure.android.common.ssl.util.e.b(context);
            if (z4) {
                a();
            }
            b(context);
            if (this.f8978a.isEmpty()) {
                throw new CertificateException("X509TrustManager is empty");
            }
            return;
        }
        throw new IllegalArgumentException("context is null");
    }

    public k(InputStream inputStream, String str) throws IllegalArgumentException {
        this.f8978a = new ArrayList();
        d(inputStream, str);
    }

    public k(String str) throws IllegalArgumentException, FileNotFoundException {
        this(str, false);
    }

    public k(String str, boolean z4) throws IllegalArgumentException, FileNotFoundException {
        FileInputStream fileInputStream;
        this.f8978a = new ArrayList();
        try {
            fileInputStream = new FileInputStream(str);
            try {
                d(fileInputStream, "");
                com.huawei.secure.android.common.ssl.util.h.g(fileInputStream);
                if (z4) {
                    a();
                }
            } catch (Throwable th) {
                th = th;
                com.huawei.secure.android.common.ssl.util.h.g(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public k(InputStream inputStream, String str, boolean z4) throws IllegalArgumentException {
        this.f8978a = new ArrayList();
        if (z4) {
            a();
        }
        d(inputStream, str);
    }
}
