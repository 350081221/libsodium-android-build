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

/* loaded from: classes3.dex */
public class i extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    private static final String f8960i = "i";

    /* renamed from: j, reason: collision with root package name */
    private static volatile i f8961j;

    /* renamed from: a, reason: collision with root package name */
    protected SSLContext f8962a;

    /* renamed from: b, reason: collision with root package name */
    protected SSLSocket f8963b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f8964c;

    /* renamed from: d, reason: collision with root package name */
    protected String[] f8965d;

    /* renamed from: e, reason: collision with root package name */
    protected X509TrustManager f8966e;

    /* renamed from: f, reason: collision with root package name */
    protected String[] f8967f;

    /* renamed from: g, reason: collision with root package name */
    protected String[] f8968g;

    /* renamed from: h, reason: collision with root package name */
    protected String[] f8969h;

    public i(InputStream inputStream, String str) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f8962a = null;
        this.f8963b = null;
        this.f8962a = f.i();
        a aVar = new a(inputStream, str);
        p(aVar);
        this.f8962a.init(null, new X509TrustManager[]{aVar}, null);
    }

    private void a(Socket socket2) {
        boolean z4;
        boolean z5 = true;
        if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8969h)) {
            com.huawei.secure.android.common.ssl.util.i.e(f8960i, "set protocols");
            f.h((SSLSocket) socket2, this.f8969h);
            z4 = true;
        } else {
            z4 = false;
        }
        if (com.huawei.secure.android.common.ssl.util.c.a(this.f8968g) && com.huawei.secure.android.common.ssl.util.c.a(this.f8967f)) {
            z5 = false;
        } else {
            com.huawei.secure.android.common.ssl.util.i.e(f8960i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket2;
            f.g(sSLSocket);
            if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8968g)) {
                f.l(sSLSocket, this.f8968g);
            } else {
                f.e(sSLSocket, this.f8967f);
            }
        }
        if (!z4) {
            com.huawei.secure.android.common.ssl.util.i.e(f8960i, "set default protocols");
            f.g((SSLSocket) socket2);
        }
        if (!z5) {
            com.huawei.secure.android.common.ssl.util.i.e(f8960i, "set default cipher suites");
            f.f((SSLSocket) socket2);
        }
    }

    public static i e(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        com.huawei.secure.android.common.ssl.util.e.b(context);
        if (f8961j == null) {
            synchronized (i.class) {
                if (f8961j == null) {
                    f8961j = new i(context);
                }
            }
        }
        if (f8961j.f8964c == null && context != null) {
            f8961j.l(context);
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8960i, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return f8961j;
    }

    public String[] b() {
        return this.f8967f;
    }

    public X509Certificate[] c() {
        X509TrustManager x509TrustManager = this.f8966e;
        if (x509TrustManager instanceof k) {
            return ((k) x509TrustManager).e();
        }
        return new X509Certificate[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i5) throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8960i, "createSocket: host , port");
        Socket createSocket = this.f8962a.getSocketFactory().createSocket(str, i5);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8963b = sSLSocket;
            this.f8965d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public Context d() {
        return this.f8964c;
    }

    public String[] f() {
        return this.f8969h;
    }

    public SSLContext g() {
        return this.f8962a;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f8965d;
        return strArr != null ? strArr : new String[0];
    }

    public SSLSocket h() {
        return this.f8963b;
    }

    public String[] i() {
        return this.f8968g;
    }

    public X509TrustManager j() {
        return this.f8966e;
    }

    public void k(String[] strArr) {
        this.f8967f = strArr;
    }

    public void l(Context context) {
        this.f8964c = context.getApplicationContext();
    }

    public void m(String[] strArr) {
        this.f8969h = strArr;
    }

    public void n(SSLContext sSLContext) {
        this.f8962a = sSLContext;
    }

    public void o(String[] strArr) {
        this.f8968g = strArr;
    }

    public void p(X509TrustManager x509TrustManager) {
        this.f8966e = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i5) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i5);
    }

    private i(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.f8962a = null;
        this.f8963b = null;
        if (context == null) {
            com.huawei.secure.android.common.ssl.util.i.d(f8960i, "SecureSSLSocketFactory: context is null");
            return;
        }
        l(context);
        n(f.i());
        k a5 = j.a(context);
        this.f8966e = a5;
        this.f8962a.init(null, new X509TrustManager[]{a5}, null);
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
        com.huawei.secure.android.common.ssl.util.i.e(f8960i, "createSocket s host port autoClose");
        Socket createSocket = this.f8962a.getSocketFactory().createSocket(socket2, str, i5, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8963b = sSLSocket;
            this.f8965d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public i(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f8962a = null;
        this.f8963b = null;
        this.f8962a = f.i();
        p(x509TrustManager);
        this.f8962a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }
}
