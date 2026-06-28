package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
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
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: classes3.dex */
public class g extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    public static final X509HostnameVerifier f8936i = new BrowserCompatHostnameVerifier();

    /* renamed from: j, reason: collision with root package name */
    public static final X509HostnameVerifier f8937j = new StrictHostnameVerifier();

    /* renamed from: k, reason: collision with root package name */
    private static final String f8938k = g.class.getSimpleName();

    /* renamed from: l, reason: collision with root package name */
    private static volatile g f8939l = null;

    /* renamed from: a, reason: collision with root package name */
    private SSLContext f8940a;

    /* renamed from: b, reason: collision with root package name */
    private SSLSocket f8941b;

    /* renamed from: c, reason: collision with root package name */
    private Context f8942c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f8943d;

    /* renamed from: e, reason: collision with root package name */
    private X509TrustManager f8944e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f8945f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f8946g;

    /* renamed from: h, reason: collision with root package name */
    private String[] f8947h;

    private g(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        this.f8941b = null;
    }

    private void a(Socket socket2) {
        boolean z4;
        boolean z5 = true;
        if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8947h)) {
            com.huawei.secure.android.common.ssl.util.i.e(f8938k, "set protocols");
            f.h((SSLSocket) socket2, this.f8947h);
            z4 = true;
        } else {
            z4 = false;
        }
        if (com.huawei.secure.android.common.ssl.util.c.a(this.f8946g) && com.huawei.secure.android.common.ssl.util.c.a(this.f8945f)) {
            z5 = false;
        } else {
            com.huawei.secure.android.common.ssl.util.i.e(f8938k, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket2;
            f.g(sSLSocket);
            if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8946g)) {
                f.l(sSLSocket, this.f8946g);
            } else {
                f.e(sSLSocket, this.f8945f);
            }
        }
        if (!z4) {
            com.huawei.secure.android.common.ssl.util.i.e(f8938k, "set default protocols");
            f.g((SSLSocket) socket2);
        }
        if (!z5) {
            com.huawei.secure.android.common.ssl.util.i.e(f8938k, "set default cipher suites");
            f.f((SSLSocket) socket2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(X509TrustManager x509TrustManager) {
        com.huawei.secure.android.common.ssl.util.i.e(f8938k, "sasf update socket factory trust manager");
        try {
            f8939l = new g((KeyStore) null, x509TrustManager);
        } catch (IOException unused) {
            com.huawei.secure.android.common.ssl.util.i.d(f8938k, "IOException");
        } catch (KeyManagementException unused2) {
            com.huawei.secure.android.common.ssl.util.i.d(f8938k, "KeyManagementException");
        } catch (KeyStoreException unused3) {
            com.huawei.secure.android.common.ssl.util.i.d(f8938k, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused4) {
            com.huawei.secure.android.common.ssl.util.i.d(f8938k, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused5) {
            com.huawei.secure.android.common.ssl.util.i.d(f8938k, "UnrecoverableKeyException");
        } catch (CertificateException unused6) {
            com.huawei.secure.android.common.ssl.util.i.d(f8938k, "CertificateException");
        }
    }

    public static g f(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        com.huawei.secure.android.common.ssl.util.e.b(context);
        if (f8939l == null) {
            synchronized (g.class) {
                if (f8939l == null) {
                    f8939l = new g(keyStore, context);
                }
            }
        }
        return f8939l;
    }

    public String[] c() {
        return this.f8945f;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket2, String str, int i5, boolean z4) throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8938k, "createSocket: socket host port autoClose");
        Socket createSocket = this.f8940a.getSocketFactory().createSocket(socket2, str, i5, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8941b = sSLSocket;
            this.f8943d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public X509Certificate[] d() {
        X509TrustManager x509TrustManager = this.f8944e;
        if (x509TrustManager instanceof k) {
            return ((k) x509TrustManager).e();
        }
        return new X509Certificate[0];
    }

    public Context e() {
        return this.f8942c;
    }

    public String[] g() {
        return this.f8947h;
    }

    public SSLContext h() {
        return this.f8940a;
    }

    public SSLSocket i() {
        return this.f8941b;
    }

    public String[] j() {
        String[] strArr = this.f8943d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] k() {
        return this.f8946g;
    }

    public X509TrustManager l() {
        return this.f8944e;
    }

    public void m(String[] strArr) {
        this.f8945f = strArr;
    }

    public void n(Context context) {
        this.f8942c = context.getApplicationContext();
    }

    public void o(String[] strArr) {
        this.f8947h = strArr;
    }

    public void p(SSLContext sSLContext) {
        this.f8940a = sSLContext;
    }

    public void q(SSLSocket sSLSocket) {
        this.f8941b = sSLSocket;
    }

    public void r(String[] strArr) {
        this.f8946g = strArr;
    }

    public void s(X509TrustManager x509TrustManager) {
        this.f8944e = x509TrustManager;
    }

    private g(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f8941b = null;
        if (context == null) {
            com.huawei.secure.android.common.ssl.util.i.d(f8938k, "SecureSSLSocketFactory: context is null");
            return;
        }
        n(context);
        p(f.i());
        k a5 = j.a(context);
        this.f8944e = a5;
        this.f8940a.init(null, new X509TrustManager[]{a5}, null);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8938k, "createSocket: ");
        Socket createSocket = this.f8940a.getSocketFactory().createSocket();
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8941b = sSLSocket;
            this.f8943d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public g(KeyStore keyStore, InputStream inputStream, String str) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f8941b = null;
        this.f8940a = f.i();
        a aVar = new a(inputStream, str);
        s(aVar);
        this.f8940a.init(null, new X509TrustManager[]{aVar}, null);
    }

    public g(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        this.f8941b = null;
        this.f8940a = f.i();
        s(x509TrustManager);
        this.f8940a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }
}
