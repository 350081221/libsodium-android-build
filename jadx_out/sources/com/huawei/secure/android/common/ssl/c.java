package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class c extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    private static final String f8906i = "c";

    /* renamed from: j, reason: collision with root package name */
    private static volatile c f8907j;

    /* renamed from: a, reason: collision with root package name */
    private SSLContext f8908a;

    /* renamed from: b, reason: collision with root package name */
    private SSLSocket f8909b;

    /* renamed from: c, reason: collision with root package name */
    private Context f8910c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f8911d;

    /* renamed from: e, reason: collision with root package name */
    private X509TrustManager f8912e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f8913f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f8914g;

    /* renamed from: h, reason: collision with root package name */
    private String[] f8915h;

    private c(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        this.f8909b = null;
    }

    private void a(Socket socket2) {
        boolean z4;
        boolean z5 = true;
        if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8915h)) {
            com.huawei.secure.android.common.ssl.util.i.e(f8906i, "set protocols");
            f.h((SSLSocket) socket2, this.f8915h);
            z4 = true;
        } else {
            z4 = false;
        }
        if (com.huawei.secure.android.common.ssl.util.c.a(this.f8914g) && com.huawei.secure.android.common.ssl.util.c.a(this.f8913f)) {
            z5 = false;
        } else {
            com.huawei.secure.android.common.ssl.util.i.e(f8906i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket2;
            f.g(sSLSocket);
            if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8914g)) {
                f.l(sSLSocket, this.f8914g);
            } else {
                f.e(sSLSocket, this.f8913f);
            }
        }
        if (!z4) {
            com.huawei.secure.android.common.ssl.util.i.e(f8906i, "set default protocols");
            f.g((SSLSocket) socket2);
        }
        if (!z5) {
            com.huawei.secure.android.common.ssl.util.i.e(f8906i, "set default cipher suites");
            f.f((SSLSocket) socket2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(X509TrustManager x509TrustManager) {
        com.huawei.secure.android.common.ssl.util.i.e(f8906i, "sasfc update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f8907j = new c((KeyStore) null, x509TrustManager);
        } catch (KeyManagementException unused) {
            com.huawei.secure.android.common.ssl.util.i.d(f8906i, "KeyManagementException");
        } catch (KeyStoreException unused2) {
            com.huawei.secure.android.common.ssl.util.i.d(f8906i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused3) {
            com.huawei.secure.android.common.ssl.util.i.d(f8906i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused4) {
            com.huawei.secure.android.common.ssl.util.i.d(f8906i, "UnrecoverableKeyException");
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8906i, "sasf system ca update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static c f(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        com.huawei.secure.android.common.ssl.util.e.b(context);
        if (f8907j == null) {
            synchronized (g.class) {
                if (f8907j == null) {
                    f8907j = new c(keyStore, context);
                }
            }
        }
        return f8907j;
    }

    public String[] c() {
        return this.f8913f;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket2, String str, int i5, boolean z4) throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8906i, "createSocket: socket host port autoClose");
        Socket createSocket = this.f8908a.getSocketFactory().createSocket(socket2, str, i5, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8909b = sSLSocket;
            this.f8911d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public X509Certificate[] d() {
        X509TrustManager x509TrustManager = this.f8912e;
        if (x509TrustManager instanceof k) {
            return ((k) x509TrustManager).e();
        }
        return new X509Certificate[0];
    }

    public Context e() {
        return this.f8910c;
    }

    public String[] g() {
        return this.f8915h;
    }

    public SSLContext h() {
        return this.f8908a;
    }

    public SSLSocket i() {
        return this.f8909b;
    }

    public String[] j() {
        String[] strArr = this.f8911d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] k() {
        return this.f8914g;
    }

    public X509TrustManager l() {
        return this.f8912e;
    }

    public void m(String[] strArr) {
        this.f8913f = strArr;
    }

    public void n(Context context) {
        this.f8910c = context.getApplicationContext();
    }

    public void o(String[] strArr) {
        this.f8915h = strArr;
    }

    public void p(SSLContext sSLContext) {
        this.f8908a = sSLContext;
    }

    public void q(SSLSocket sSLSocket) {
        this.f8909b = sSLSocket;
    }

    public void r(String[] strArr) {
        this.f8914g = strArr;
    }

    public void s(X509TrustManager x509TrustManager) {
        this.f8912e = x509TrustManager;
    }

    private c(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f8909b = null;
        if (context == null) {
            com.huawei.secure.android.common.ssl.util.i.d(f8906i, "SecureSSLSocketFactory: context is null");
            return;
        }
        n(context);
        p(f.i());
        k a5 = e.a(context);
        this.f8912e = a5;
        this.f8908a.init(null, new X509TrustManager[]{a5}, null);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8906i, "createSocket: ");
        Socket createSocket = this.f8908a.getSocketFactory().createSocket();
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8909b = sSLSocket;
            this.f8911d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public c(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException, UnrecoverableKeyException, KeyStoreException {
        super(keyStore);
        this.f8909b = null;
        this.f8908a = f.i();
        s(x509TrustManager);
        this.f8908a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }
}
