package com.huawei.secure.android.common.ssl;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.apacheclient.ApacheClientInstrumentation;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

@Instrumented
/* loaded from: classes3.dex */
public class m extends Thread {

    /* renamed from: i, reason: collision with root package name */
    private static final String f8981i = "m";

    /* renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f8982a;

    /* renamed from: b, reason: collision with root package name */
    private HostnameVerifier f8983b;

    /* renamed from: c, reason: collision with root package name */
    private org.apache.http.conn.ssl.SSLSocketFactory f8984c;

    /* renamed from: d, reason: collision with root package name */
    private X509HostnameVerifier f8985d;

    /* renamed from: e, reason: collision with root package name */
    private SslErrorHandler f8986e;

    /* renamed from: f, reason: collision with root package name */
    private String f8987f;

    /* renamed from: g, reason: collision with root package name */
    private a f8988g;

    /* renamed from: h, reason: collision with root package name */
    private Context f8989h;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Context context, String str);

        void b(Context context, String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b implements Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f8990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f8991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8992c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SslErrorHandler f8993d;

        b(a aVar, Context context, String str, SslErrorHandler sslErrorHandler) {
            this.f8990a = aVar;
            this.f8991b = context;
            this.f8992c = str;
            this.f8993d = sslErrorHandler;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            com.huawei.secure.android.common.ssl.util.i.d(m.f8981i, "onFailure , IO Exception : " + iOException.getMessage());
            a aVar = this.f8990a;
            if (aVar != null) {
                aVar.b(this.f8991b, this.f8992c);
            } else {
                this.f8993d.cancel();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            com.huawei.secure.android.common.ssl.util.i.d(m.f8981i, "onResponse . proceed");
            a aVar = this.f8990a;
            if (aVar != null) {
                aVar.a(this.f8991b, this.f8992c);
            } else {
                this.f8993d.proceed();
            }
        }
    }

    public m() {
    }

    private void b() {
        String str = f8981i;
        com.huawei.secure.android.common.ssl.util.i.e(str, "callbackCancel: ");
        a aVar = this.f8988g;
        if (aVar != null) {
            aVar.b(this.f8989h, this.f8987f);
        } else if (this.f8986e != null) {
            com.huawei.secure.android.common.ssl.util.i.e(str, "callbackCancel 2: ");
            this.f8986e.cancel();
        }
    }

    private void c() {
        com.huawei.secure.android.common.ssl.util.i.e(f8981i, "callbackProceed: ");
        a aVar = this.f8988g;
        if (aVar != null) {
            aVar.a(this.f8989h, this.f8987f);
            return;
        }
        SslErrorHandler sslErrorHandler = this.f8986e;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    public static void d(SslErrorHandler sslErrorHandler, String str, Context context) {
        e(sslErrorHandler, str, context, null);
    }

    public static void e(SslErrorHandler sslErrorHandler, String str, Context context, a aVar) {
        Request build;
        Call newCall;
        if (sslErrorHandler != null && !TextUtils.isEmpty(str) && context != null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            try {
                i iVar = new i(new p(context));
                iVar.l(context);
                builder.sslSocketFactory(iVar, new p(context));
                builder.hostnameVerifier(new i2.b());
                Request.Builder url = new Request.Builder().url(str);
                if (!(url instanceof Request.Builder)) {
                    build = url.build();
                } else {
                    build = OkHttp3Instrumentation.build(url);
                }
                OkHttpClient build2 = OkHttp3Instrumentation.build(builder);
                if (!(build2 instanceof OkHttpClient)) {
                    newCall = build2.newCall(build);
                } else {
                    newCall = OkHttp3Instrumentation.newCall(build2, build);
                }
                newCall.enqueue(new b(aVar, context, str, sslErrorHandler));
                return;
            } catch (Exception e5) {
                com.huawei.secure.android.common.ssl.util.i.d(f8981i, "checkServerCertificateWithOK: exception : " + e5.getMessage());
                sslErrorHandler.cancel();
                return;
            }
        }
        com.huawei.secure.android.common.ssl.util.i.d(f8981i, "checkServerCertificateWithOK: handler or url or context is null");
    }

    public X509HostnameVerifier f() {
        return this.f8985d;
    }

    public org.apache.http.conn.ssl.SSLSocketFactory g() {
        return this.f8984c;
    }

    public a h() {
        return this.f8988g;
    }

    public Context i() {
        return this.f8989h;
    }

    public HostnameVerifier j() {
        return this.f8983b;
    }

    public SslErrorHandler k() {
        return this.f8986e;
    }

    public SSLSocketFactory l() {
        return this.f8982a;
    }

    public String m() {
        return this.f8987f;
    }

    public void n(X509HostnameVerifier x509HostnameVerifier) {
        this.f8985d = x509HostnameVerifier;
    }

    public void o(org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory) {
        this.f8984c = sSLSocketFactory;
    }

    public void p(a aVar) {
        this.f8988g = aVar;
    }

    public void q(Context context) {
        this.f8989h = context;
    }

    public void r(HostnameVerifier hostnameVerifier) {
        this.f8983b = hostnameVerifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Exception e5;
        HttpsURLConnection httpsURLConnection;
        super.run();
        HttpsURLConnection httpsURLConnection2 = null;
        if (this.f8984c != null && this.f8985d != null) {
            if (this.f8986e != null) {
                try {
                    if (!TextUtils.isEmpty(this.f8987f)) {
                        try {
                            this.f8984c.setHostnameVerifier(this.f8985d);
                            org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory = this.f8984c;
                            if (sSLSocketFactory instanceof g) {
                                ((g) sSLSocketFactory).n(this.f8989h);
                            }
                            BasicHttpParams basicHttpParams = new BasicHttpParams();
                            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
                            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                            SchemeRegistry schemeRegistry = new SchemeRegistry();
                            schemeRegistry.register(new Scheme("https", this.f8984c, 443));
                            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                            DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
                            HttpGet httpGet = new HttpGet();
                            httpGet.setURI(new URI(this.f8987f));
                            HttpResponse execute = ApacheClientInstrumentation.execute(defaultHttpClient, httpGet);
                            com.huawei.secure.android.common.ssl.util.i.e(f8981i, "status code is : " + execute.getStatusLine().getStatusCode());
                            com.huawei.secure.android.common.ssl.util.h.i(null);
                            c();
                            return;
                        } catch (Exception e6) {
                            com.huawei.secure.android.common.ssl.util.i.d(f8981i, "run: exception : " + e6.getMessage());
                            b();
                            com.huawei.secure.android.common.ssl.util.h.i(null);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    com.huawei.secure.android.common.ssl.util.h.i(null);
                    throw th;
                }
            }
            com.huawei.secure.android.common.ssl.util.i.d(f8981i, "sslErrorHandler or url is null");
            b();
            return;
        }
        if (this.f8982a != null) {
            ?? r02 = this.f8983b;
            try {
                if (r02 != 0) {
                    try {
                        URLConnection openConnection = new URL(this.f8987f).openConnection();
                        if (openConnection instanceof HttpsURLConnection) {
                            httpsURLConnection = (HttpsURLConnection) openConnection;
                            try {
                                httpsURLConnection.setSSLSocketFactory(this.f8982a);
                                httpsURLConnection.setHostnameVerifier(this.f8983b);
                                httpsURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
                                httpsURLConnection.setConnectTimeout(10000);
                                httpsURLConnection.setReadTimeout(20000);
                                httpsURLConnection.connect();
                                httpsURLConnection2 = httpsURLConnection;
                            } catch (Exception e7) {
                                e5 = e7;
                                com.huawei.secure.android.common.ssl.util.i.d(f8981i, "exception : " + e5.getMessage());
                                b();
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                    return;
                                }
                                return;
                            }
                        }
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        c();
                        return;
                    } catch (Exception e8) {
                        e5 = e8;
                        httpsURLConnection = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r02 = 0;
                        if (r02 != 0) {
                            r02.disconnect();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        b();
    }

    public void s(SslErrorHandler sslErrorHandler) {
        this.f8986e = sslErrorHandler;
    }

    public void t(SSLSocketFactory sSLSocketFactory) {
        this.f8982a = sSLSocketFactory;
    }

    public void u(String str) {
        this.f8987f = str;
    }

    public m(SslErrorHandler sslErrorHandler, String str, Context context) throws CertificateException, NoSuchAlgorithmException, IOException, KeyManagementException, KeyStoreException, IllegalAccessException {
        s(sslErrorHandler);
        u(str);
        q(context);
        t(new i(new p(context)));
        r(new i2.b());
        try {
            o(new g((KeyStore) null, new p(context)));
        } catch (UnrecoverableKeyException e5) {
            com.huawei.secure.android.common.ssl.util.i.d(f8981i, "WebViewSSLCheckThread: UnrecoverableKeyException : " + e5.getMessage());
        }
        n(g.f8937j);
    }

    @Deprecated
    public m(SslErrorHandler sslErrorHandler, String str, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        s(sslErrorHandler);
        u(str);
        t(sSLSocketFactory);
        r(hostnameVerifier);
    }

    @Deprecated
    public m(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        s(sslErrorHandler);
        u(str);
        o(sSLSocketFactory);
        n(x509HostnameVerifier);
    }

    @Deprecated
    public m(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier, a aVar, Context context) {
        this.f8986e = sslErrorHandler;
        this.f8987f = str;
        this.f8984c = sSLSocketFactory;
        this.f8985d = x509HostnameVerifier;
        this.f8988g = aVar;
        this.f8989h = context;
    }
}
