package com.zzhoujay.richtext.ig;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15814a = "com.zzhoujay.richtext.ig.f";

    /* renamed from: b, reason: collision with root package name */
    private static SSLContext f15815b;

    /* renamed from: c, reason: collision with root package name */
    private static HostnameVerifier f15816c = new a();

    /* loaded from: classes3.dex */
    static class a implements HostnameVerifier {
        a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        @SuppressLint({"BadHostnameVerifier"})
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    static class b implements X509TrustManager {
        b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* loaded from: classes3.dex */
    private static class c implements e3.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f15817a;

        /* renamed from: b, reason: collision with root package name */
        private HttpURLConnection f15818b;

        /* renamed from: c, reason: collision with root package name */
        private InputStream f15819c;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        @Override // e3.a
        public InputStream a() throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f15817a).openConnection();
            this.f15818b = httpURLConnection;
            httpURLConnection.setConnectTimeout(10000);
            this.f15818b.setDoInput(true);
            this.f15818b.addRequestProperty(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
            HttpURLConnection httpURLConnection2 = this.f15818b;
            if (httpURLConnection2 instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection2;
                httpsURLConnection.setHostnameVerifier(f.f15816c);
                httpsURLConnection.setSSLSocketFactory(f.f15815b.getSocketFactory());
            }
            this.f15818b.connect();
            int responseCode = this.f15818b.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = this.f15818b.getInputStream();
                this.f15819c = inputStream;
                return inputStream;
            }
            throw new f3.e(responseCode);
        }

        @Override // e3.c
        public void close() throws IOException {
            InputStream inputStream = this.f15819c;
            if (inputStream != null) {
                inputStream.close();
            }
            HttpURLConnection httpURLConnection = this.f15818b;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

        private c(String str) {
            this.f15817a = str;
        }
    }

    static {
        b bVar = new b();
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            f15815b = sSLContext;
            sSLContext.init(null, new TrustManager[]{bVar}, new SecureRandom());
        } catch (KeyManagementException | NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.zzhoujay.richtext.ig.i
    public e3.a a(String str) throws IOException {
        return new c(str, null);
    }
}
