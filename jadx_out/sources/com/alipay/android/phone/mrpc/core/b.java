package com.alipay.android.phone.mrpc.core;

import android.net.SSLCertificateSocketFactory;
import android.net.http.Headers;
import android.util.Base64;
import android.util.Log;
import com.efs.sdk.base.Constants;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.apacheclient.ApacheClientInstrumentation;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AUTH;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.cookie.SM;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

@Instrumented
/* loaded from: classes2.dex */
public final class b implements HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public static long f2706a = 160;

    /* renamed from: b, reason: collision with root package name */
    public static String[] f2707b = {"text/", "application/xml", "application/json"};

    /* renamed from: c, reason: collision with root package name */
    public static final HttpRequestInterceptor f2708c = new c();

    /* renamed from: d, reason: collision with root package name */
    public final HttpClient f2709d;

    /* renamed from: e, reason: collision with root package name */
    public RuntimeException f2710e = new IllegalStateException("AndroidHttpClient created and never closed");

    /* renamed from: f, reason: collision with root package name */
    public volatile C0094b f2711f;

    /* loaded from: classes2.dex */
    public class a implements HttpRequestInterceptor {
        public a() {
        }

        public /* synthetic */ a(b bVar, byte b5) {
            this();
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            C0094b c0094b = b.this.f2711f;
            if (c0094b != null && C0094b.a(c0094b) && (httpRequest instanceof HttpUriRequest)) {
                C0094b.a(c0094b, b.a((HttpUriRequest) httpRequest));
            }
        }
    }

    /* renamed from: com.alipay.android.phone.mrpc.core.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0094b {

        /* renamed from: a, reason: collision with root package name */
        public final String f2713a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2714b;

        public static /* synthetic */ void a(C0094b c0094b, String str) {
            Log.println(c0094b.f2714b, c0094b.f2713a, str);
        }

        public static /* synthetic */ boolean a(C0094b c0094b) {
            return Log.isLoggable(c0094b.f2713a, c0094b.f2714b);
        }
    }

    public b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f2709d = new d(this, clientConnectionManager, httpParams);
    }

    public static b a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, null), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, OpenStreetMapTileProviderConstants.ONE_MINUTE);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new b(threadSafeClientConnManager, basicHttpParams);
    }

    public static InputStream a(HttpEntity httpEntity) {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains(Constants.CP_GZIP)) ? content : new GZIPInputStream(content);
    }

    public static /* synthetic */ String a(HttpUriRequest httpUriRequest) {
        HttpEntity entity;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (!header.getName().equals(AUTH.WWW_AUTH_RESP) && !header.getName().equals(SM.COOKIE)) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (b(httpUriRequest)) {
                    sb.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    str = " --data-binary @/tmp/$$.bin";
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    sb.append(" --data-ascii \"");
                    sb.append(byteArrayOutputStream2);
                    sb.append("\"");
                }
            } else {
                str = " [TOO MUCH DATA TO INCLUDE]";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static AbstractHttpEntity a(byte[] bArr) {
        if (bArr.length < f2706a) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding(Constants.CP_GZIP);
        byteArrayEntity.getContentLength();
        return byteArrayEntity;
    }

    public static void a(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", Constants.CP_GZIP);
    }

    public static long b(String str) {
        return k.a(str);
    }

    public static void b(HttpRequest httpRequest) {
        httpRequest.addHeader(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
    }

    public static boolean b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders(Headers.CONTENT_ENCODING);
        if (headers != null) {
            for (Header header : headers) {
                if (Constants.CP_GZIP.equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : f2707b) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void a(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.f2709d).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? (T) httpClient.execute(httpHost, httpRequest, responseHandler) : (T) ApacheClientInstrumentation.execute(httpClient, httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? (T) httpClient.execute(httpHost, httpRequest, responseHandler, httpContext) : (T) ApacheClientInstrumentation.execute(httpClient, httpHost, httpRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? (T) httpClient.execute(httpUriRequest, responseHandler) : (T) ApacheClientInstrumentation.execute(httpClient, httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? (T) httpClient.execute(httpUriRequest, responseHandler, httpContext) : (T) ApacheClientInstrumentation.execute(httpClient, httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? httpClient.execute(httpHost, httpRequest) : ApacheClientInstrumentation.execute(httpClient, httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? httpClient.execute(httpHost, httpRequest, httpContext) : ApacheClientInstrumentation.execute(httpClient, httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? httpClient.execute(httpUriRequest) : ApacheClientInstrumentation.execute(httpClient, httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        HttpClient httpClient = this.f2709d;
        return !(httpClient instanceof HttpClient) ? httpClient.execute(httpUriRequest, httpContext) : ApacheClientInstrumentation.execute(httpClient, httpUriRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        return this.f2709d.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        return this.f2709d.getParams();
    }
}
