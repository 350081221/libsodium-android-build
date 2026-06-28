package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
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
public class d extends SSLSocketFactory {

    /* renamed from: i, reason: collision with root package name */
    private static final String f8916i = "d";

    /* renamed from: j, reason: collision with root package name */
    private static volatile d f8917j;

    /* renamed from: a, reason: collision with root package name */
    private SSLContext f8918a;

    /* renamed from: b, reason: collision with root package name */
    private SSLSocket f8919b;

    /* renamed from: c, reason: collision with root package name */
    private Context f8920c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f8921d;

    /* renamed from: e, reason: collision with root package name */
    private X509TrustManager f8922e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f8923f;

    /* renamed from: g, reason: collision with root package name */
    private String[] f8924g;

    /* renamed from: h, reason: collision with root package name */
    private String[] f8925h;

    private d(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.f8918a = null;
        this.f8919b = null;
        if (context == null) {
            com.huawei.secure.android.common.ssl.util.i.d(f8916i, "SecureSSLSocketFactory: context is null");
            return;
        }
        m(context);
        o(f.i());
        k a5 = e.a(context);
        this.f8922e = a5;
        this.f8918a.init(null, new X509TrustManager[]{a5}, null);
    }

    private void a(Socket socket2) {
        boolean z4;
        boolean z5 = true;
        if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8925h)) {
            com.huawei.secure.android.common.ssl.util.i.e(f8916i, "set protocols");
            f.h((SSLSocket) socket2, this.f8925h);
            z4 = true;
        } else {
            z4 = false;
        }
        if (com.huawei.secure.android.common.ssl.util.c.a(this.f8924g) && com.huawei.secure.android.common.ssl.util.c.a(this.f8923f)) {
            z5 = false;
        } else {
            com.huawei.secure.android.common.ssl.util.i.e(f8916i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket2;
            f.g(sSLSocket);
            if (!com.huawei.secure.android.common.ssl.util.c.a(this.f8924g)) {
                f.l(sSLSocket, this.f8924g);
            } else {
                f.e(sSLSocket, this.f8923f);
            }
        }
        if (!z4) {
            com.huawei.secure.android.common.ssl.util.i.e(f8916i, "set default protocols");
            f.g((SSLSocket) socket2);
        }
        if (!z5) {
            com.huawei.secure.android.common.ssl.util.i.e(f8916i, "set default cipher suites");
            f.f((SSLSocket) socket2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(X509TrustManager x509TrustManager) {
        com.huawei.secure.android.common.ssl.util.i.e(f8916i, "ssfc update socket factory trust manager");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f8917j = new d(x509TrustManager);
        } catch (KeyManagementException unused) {
            com.huawei.secure.android.common.ssl.util.i.d(f8916i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            com.huawei.secure.android.common.ssl.util.i.d(f8916i, "NoSuchAlgorithmException");
        }
        com.huawei.secure.android.common.ssl.util.i.b(f8916i, "SSF system ca update: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public static d f(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        com.huawei.secure.android.common.ssl.util.e.b(context);
        if (f8917j == null) {
            synchronized (d.class) {
                if (f8917j == null) {
                    f8917j = new d(context);
                }
            }
        }
        if (f8917j.f8920c == null && context != null) {
            f8917j.m(context);
        }
        return f8917j;
    }

    public String[] c() {
        return this.f8923f;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i5) throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8916i, "createSocket: host , port");
        Socket createSocket = this.f8918a.getSocketFactory().createSocket(str, i5);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8919b = sSLSocket;
            this.f8921d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public X509Certificate[] d() {
        X509TrustManager x509TrustManager = this.f8922e;
        if (x509TrustManager instanceof k) {
            return ((k) x509TrustManager).e();
        }
        return new X509Certificate[0];
    }

    public Context e() {
        return this.f8920c;
    }

    public String[] g() {
        return this.f8925h;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f8921d;
        return strArr != null ? strArr : new String[0];
    }

    public SSLContext h() {
        return this.f8918a;
    }

    public SSLSocket i() {
        return this.f8919b;
    }

    public String[] j() {
        return this.f8924g;
    }

    public X509TrustManager k() {
        return this.f8922e;
    }

    public void l(String[] strArr) {
        this.f8923f = strArr;
    }

    public void m(Context context) {
        this.f8920c = context.getApplicationContext();
    }

    public void n(String[] strArr) {
        this.f8925h = strArr;
    }

    public void o(SSLContext sSLContext) {
        this.f8918a = sSLContext;
    }

    public void p(String[] strArr) {
        this.f8924g = strArr;
    }

    public void q(X509TrustManager x509TrustManager) {
        this.f8922e = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i5) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i5);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i5, InetAddress inetAddress, int i6) throws IOException, UnknownHostException {
        return createSocket(str, i5);
    }

    public d(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f8918a = null;
        this.f8919b = null;
        this.f8918a = f.i();
        q(x509TrustManager);
        this.f8918a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i5, InetAddress inetAddress2, int i6) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i5);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket2, String str, int i5, boolean z4) throws IOException {
        com.huawei.secure.android.common.ssl.util.i.e(f8916i, "createSocket: s , host , port , autoClose");
        Socket createSocket = this.f8918a.getSocketFactory().createSocket(socket2, str, i5, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.f8919b = sSLSocket;
            this.f8921d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
