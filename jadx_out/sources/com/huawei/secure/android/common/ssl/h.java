package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

@Deprecated
/* loaded from: classes3.dex */
public class h extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final X509HostnameVerifier f8948i = new BrowserCompatHostnameVerifier();

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final X509HostnameVerifier f8949j = new StrictHostnameVerifier();

    /* renamed from: k, reason: collision with root package name */
    private static final String f8950k = h.class.getSimpleName();

    /* renamed from: l, reason: collision with root package name */
    private static volatile h f8951l = null;

    /* renamed from: a, reason: collision with root package name */
    private SSLContext f8952a;

    /* renamed from: b, reason: collision with root package name */
    private SSLSocket f8953b;

    /* renamed from: c, reason: collision with root package name */
    private Context f8954c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f8955d;

    /* renamed from: e, reason: collision with root package name */
    private X509TrustManager f8956e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f8957f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f8958g;

    /* renamed from: h, reason: collision with root package name */
    private String[] f8959h;

    public h(InputStream inputStream, String str) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f8952a = null;
        this.f8953b = null;
        this.f8952a = f.i();
        a aVar = new a(inputStream, str);
        q(aVar);
        this.f8952a.init(null, new X509TrustManager[]{aVar}, null);
    }

    private void a(Socket socket2) {
        boolean z4;
        boolean z5 = true;
        if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8959h)) {
            com.huawei.secure.android.common.ssl.util.i.e(f8950k, "set protocols");
            f.h((SSLSocket) socket2, this.f8959h);
            z4 = true;
        } else {
            z4 = false;
        }
        if (com.huawei.secure.android.common.ssl.util.c.a(this.f8958g) && com.huawei.secure.android.common.ssl.util.c.a(this.f8957f)) {
            z5 = false;
        } else {
            com.huawei.secure.android.common.ssl.util.i.e(f8950k, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket2;
            f.g(sSLSocket);
            if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8958g)) {
                f.l(sSLSocket, this.f8958g);
            } else {
                f.e(sSLSocket, this.f8957f);
            }
        }
        if (!z4) {
            com.huawei.secure.android.common.ssl.util.i.e(f8950k, "set default protocols");
            f.g((SSLSocket) socket2);
        }
        if (!z5) {
            com.huawei.secure.android.common.ssl.util.i.e(f8950k, "set default cipher suites");
            f.f((SSLSocket) socket2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(X509TrustManager x509TrustManager) {
        com.huawei.secure.android.common.ssl.util.i.e(f8950k, "ssf update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f8951l = new h(x509TrustManager);
        } catch (KeyManagementException unused) {
            com.huawei.secure.android.common.ssl.util.i.d(f8950k, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            com.huawei.secure.android.common.ssl.util.i.d(f8950k, "NoSuchAlgorithmException");
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8950k, "update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static h f(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        com.huawei.secure.android.common.ssl.util.e.b(context);
        if (f8951l == null) {
            synchronized (h.class) {
                if (f8951l == null) {
                    f8951l = new h(context);
                }
            }
        }
        if (f8951l.f8954c == null && context != null) {
            f8951l.m(context);
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8950k, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f8951l;
    }

    public String[] c() {
        return this.f8957f;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i5) throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8950k, "createSocket: host , port");
        Socket createSocket = this.f8952a.getSocketFactory().createSocket(str, i5);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8953b = sSLSocket;
            this.f8955d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public X509Certificate[] d() {
        X509TrustManager x509TrustManager = this.f8956e;
        if (x509TrustManager instanceof k) {
            return ((k) x509TrustManager).e();
        }
        return new X509Certificate[0];
    }

    public Context e() {
        return this.f8954c;
    }

    public String[] g() {
        return this.f8959h;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f8955d;
        return strArr != null ? strArr : new String[0];
    }

    public SSLContext h() {
        return this.f8952a;
    }

    public SSLSocket i() {
        return this.f8953b;
    }

    public String[] j() {
        return this.f8958g;
    }

    public X509TrustManager k() {
        return this.f8956e;
    }

    public void l(String[] strArr) {
        this.f8957f = strArr;
    }

    public void m(Context context) {
        this.f8954c = context.getApplicationContext();
    }

    public void n(String[] strArr) {
        this.f8959h = strArr;
    }

    public void o(SSLContext sSLContext) {
        this.f8952a = sSLContext;
    }

    public void p(String[] strArr) {
        this.f8958g = strArr;
    }

    public void q(X509TrustManager x509TrustManager) {
        this.f8956e = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i5) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i5);
    }

    private h(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.f8952a = null;
        this.f8953b = null;
        if (context == null) {
            com.huawei.secure.android.common.ssl.util.i.d(f8950k, "SecureSSLSocketFactory: context is null");
            return;
        }
        m(context);
        o(f.i());
        k a5 = j.a(context);
        this.f8956e = a5;
        this.f8952a.init(null, new X509TrustManager[]{a5}, null);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i5, InetAddress inetAddress, int i6) throws IOException, UnknownHostException {
        return createSocket(str, i5);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i5, InetAddress inetAddress2, int i6) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i5);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket2, String str, int i5, boolean z4) throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8950k, "createSocket s host port autoClose");
        Socket createSocket = this.f8952a.getSocketFactory().createSocket(socket2, str, i5, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8953b = sSLSocket;
            this.f8955d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public h(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f8952a = null;
        this.f8953b = null;
        this.f8952a = f.i();
        q(x509TrustManager);
        this.f8952a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }
}
