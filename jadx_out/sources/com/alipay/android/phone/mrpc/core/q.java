package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.efs.sdk.base.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes2.dex */
public final class q implements Callable<u> {

    /* renamed from: e, reason: collision with root package name */
    public static final HttpRequestRetryHandler f2752e = new ad();

    /* renamed from: a, reason: collision with root package name */
    public l f2753a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2754b;

    /* renamed from: c, reason: collision with root package name */
    public o f2755c;

    /* renamed from: d, reason: collision with root package name */
    public String f2756d;

    /* renamed from: f, reason: collision with root package name */
    public HttpUriRequest f2757f;

    /* renamed from: i, reason: collision with root package name */
    public CookieManager f2760i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractHttpEntity f2761j;

    /* renamed from: k, reason: collision with root package name */
    public HttpHost f2762k;

    /* renamed from: l, reason: collision with root package name */
    public URL f2763l;

    /* renamed from: q, reason: collision with root package name */
    public String f2768q;

    /* renamed from: g, reason: collision with root package name */
    public HttpContext f2758g = new BasicHttpContext();

    /* renamed from: h, reason: collision with root package name */
    public CookieStore f2759h = new BasicCookieStore();

    /* renamed from: m, reason: collision with root package name */
    public int f2764m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2765n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2766o = false;

    /* renamed from: p, reason: collision with root package name */
    public String f2767p = null;

    public q(l lVar, o oVar) {
        this.f2753a = lVar;
        this.f2754b = lVar.f2730a;
        this.f2755c = oVar;
    }

    public static long a(String[] strArr) {
        String str;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (ClientCookie.MAX_AGE_ATTR.equalsIgnoreCase(strArr[i5]) && (str = strArr[i5 + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    public static HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private u a(HttpResponse httpResponse, int i5, String str) {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity != null) {
                return null;
            }
            httpResponse.getStatusLine().getStatusCode();
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.f2766o = false;
                this.f2753a.c(System.currentTimeMillis() - currentTimeMillis);
                this.f2753a.a(byteArray.length);
                p pVar = new p(a(httpResponse), i5, str, byteArray);
                long b5 = b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> a5 = a(contentType.getValue());
                    str3 = a5.get("charset");
                    str2 = a5.get(HTTP.CONTENT_TYPE);
                } else {
                    str2 = null;
                }
                pVar.b(str2);
                pVar.a(str3);
                pVar.a(System.currentTimeMillis());
                pVar.b(b5);
                try {
                    byteArrayOutputStream2.close();
                    return pVar;
                } catch (IOException e5) {
                    throw new RuntimeException("ArrayOutputStream close error!", e5.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        throw new RuntimeException("ArrayOutputStream close error!", e6.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static HashMap<String, String> a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(a1.i.f136b)) {
            String[] split = str2.indexOf(61) == -1 ? new String[]{HTTP.CONTENT_TYPE, str2} : str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream a5 = b.a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = a5.read(bArr);
                    if (read == -1 || this.f2755c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    this.f2755c.f();
                }
                outputStream.flush();
            } catch (Exception e5) {
                e5.getCause();
                throw new IOException("HttpWorker Request Error!" + e5.getLocalizedMessage());
            }
        } finally {
            r.a(a5);
        }
    }

    public static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader(OpenStreetMapTileProviderConstants.HTTP_CACHECONTROL_HEADER);
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader(OpenStreetMapTileProviderConstants.HTTP_EXPIRES_HEADER);
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private URI b() {
        String a5 = this.f2755c.a();
        String str = this.f2756d;
        if (str != null) {
            a5 = str;
        }
        if (a5 != null) {
            return new URI(a5);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f2757f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f2761j == null) {
            byte[] b5 = this.f2755c.b();
            String b6 = this.f2755c.b(Constants.CP_GZIP);
            if (b5 != null) {
                if (TextUtils.equals(b6, "true")) {
                    this.f2761j = b.a(b5);
                } else {
                    this.f2761j = new ByteArrayEntity(b5);
                }
                this.f2761j.setContentType(this.f2755c.c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f2761j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f2757f = httpPost;
        } else {
            this.f2757f = new HttpGet(b());
        }
        return this.f2757f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, URISyntaxException -> 0x03ba, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLPeerUnverifiedException -> 0x037a, SSLException -> 0x035a, NoHttpResponseException -> 0x02d8, ConnectionPoolTimeoutException -> 0x033a, ConnectTimeoutException -> 0x031a, HttpHostConnectException -> 0x02b9, IOException -> 0x0277, Exception -> 0x023b, blocks: (B:4:0x0006, B:8:0x0032, B:10:0x003a, B:12:0x0040, B:13:0x0044, B:15:0x004a, B:17:0x0058, B:19:0x006c, B:21:0x0081, B:23:0x00ad, B:25:0x00bc, B:27:0x00c2, B:29:0x00cc, B:31:0x00d5, B:33:0x00e1, B:36:0x00eb, B:39:0x010b, B:41:0x0113, B:42:0x0120, B:44:0x0146, B:45:0x014d, B:47:0x0153, B:48:0x0157, B:50:0x015d, B:53:0x0169, B:56:0x0198, B:62:0x01b4, B:69:0x01d1, B:70:0x01ea, B:73:0x01eb, B:75:0x01f3, B:77:0x01f9, B:80:0x0205, B:82:0x0209, B:87:0x0219, B:89:0x0221, B:91:0x022b, B:94:0x00f3, B:97:0x022f, B:98:0x023a, B:99:0x0017, B:101:0x001b, B:103:0x001f, B:105:0x0025, B:110:0x002d), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, URISyntaxException -> 0x03ba, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLPeerUnverifiedException -> 0x037a, SSLException -> 0x035a, NoHttpResponseException -> 0x02d8, ConnectionPoolTimeoutException -> 0x033a, ConnectTimeoutException -> 0x031a, HttpHostConnectException -> 0x02b9, IOException -> 0x0277, Exception -> 0x023b, blocks: (B:4:0x0006, B:8:0x0032, B:10:0x003a, B:12:0x0040, B:13:0x0044, B:15:0x004a, B:17:0x0058, B:19:0x006c, B:21:0x0081, B:23:0x00ad, B:25:0x00bc, B:27:0x00c2, B:29:0x00cc, B:31:0x00d5, B:33:0x00e1, B:36:0x00eb, B:39:0x010b, B:41:0x0113, B:42:0x0120, B:44:0x0146, B:45:0x014d, B:47:0x0153, B:48:0x0157, B:50:0x015d, B:53:0x0169, B:56:0x0198, B:62:0x01b4, B:69:0x01d1, B:70:0x01ea, B:73:0x01eb, B:75:0x01f3, B:77:0x01f9, B:80:0x0205, B:82:0x0209, B:87:0x0219, B:89:0x0221, B:91:0x022b, B:94:0x00f3, B:97:0x022f, B:98:0x023a, B:99:0x0017, B:101:0x001b, B:103:0x001f, B:105:0x0025, B:110:0x002d), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, URISyntaxException -> 0x03ba, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLPeerUnverifiedException -> 0x037a, SSLException -> 0x035a, NoHttpResponseException -> 0x02d8, ConnectionPoolTimeoutException -> 0x033a, ConnectTimeoutException -> 0x031a, HttpHostConnectException -> 0x02b9, IOException -> 0x0277, Exception -> 0x023b, blocks: (B:4:0x0006, B:8:0x0032, B:10:0x003a, B:12:0x0040, B:13:0x0044, B:15:0x004a, B:17:0x0058, B:19:0x006c, B:21:0x0081, B:23:0x00ad, B:25:0x00bc, B:27:0x00c2, B:29:0x00cc, B:31:0x00d5, B:33:0x00e1, B:36:0x00eb, B:39:0x010b, B:41:0x0113, B:42:0x0120, B:44:0x0146, B:45:0x014d, B:47:0x0153, B:48:0x0157, B:50:0x015d, B:53:0x0169, B:56:0x0198, B:62:0x01b4, B:69:0x01d1, B:70:0x01ea, B:73:0x01eb, B:75:0x01f3, B:77:0x01f9, B:80:0x0205, B:82:0x0209, B:87:0x0219, B:89:0x0221, B:91:0x022b, B:94:0x00f3, B:97:0x022f, B:98:0x023a, B:99:0x0017, B:101:0x001b, B:103:0x001f, B:105:0x0025, B:110:0x002d), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f3 A[Catch: Exception -> 0x023b, NullPointerException -> 0x0258, IOException -> 0x0277, UnknownHostException -> 0x0297, HttpHostConnectException -> 0x02b9, NoHttpResponseException -> 0x02d8, SocketTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x031a, ConnectionPoolTimeoutException -> 0x033a, SSLException -> 0x035a, SSLPeerUnverifiedException -> 0x037a, SSLHandshakeException -> 0x039a, URISyntaxException -> 0x03ba, HttpException -> 0x03c7, TryCatch #3 {HttpException -> 0x03c7, NullPointerException -> 0x0258, SocketTimeoutException -> 0x02f9, URISyntaxException -> 0x03ba, UnknownHostException -> 0x0297, SSLHandshakeException -> 0x039a, SSLPeerUnverifiedException -> 0x037a, SSLException -> 0x035a, NoHttpResponseException -> 0x02d8, ConnectionPoolTimeoutException -> 0x033a, ConnectTimeoutException -> 0x031a, HttpHostConnectException -> 0x02b9, IOException -> 0x0277, Exception -> 0x023b, blocks: (B:4:0x0006, B:8:0x0032, B:10:0x003a, B:12:0x0040, B:13:0x0044, B:15:0x004a, B:17:0x0058, B:19:0x006c, B:21:0x0081, B:23:0x00ad, B:25:0x00bc, B:27:0x00c2, B:29:0x00cc, B:31:0x00d5, B:33:0x00e1, B:36:0x00eb, B:39:0x010b, B:41:0x0113, B:42:0x0120, B:44:0x0146, B:45:0x014d, B:47:0x0153, B:48:0x0157, B:50:0x015d, B:53:0x0169, B:56:0x0198, B:62:0x01b4, B:69:0x01d1, B:70:0x01ea, B:73:0x01eb, B:75:0x01f3, B:77:0x01f9, B:80:0x0205, B:82:0x0209, B:87:0x0219, B:89:0x0221, B:91:0x022b, B:94:0x00f3, B:97:0x022f, B:98:0x023a, B:99:0x0017, B:101:0x001b, B:103:0x001f, B:105:0x0025, B:110:0x002d), top: B:3:0x0006 }] */
    @Override // java.util.concurrent.Callable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alipay.android.phone.mrpc.core.u call() {
        /*
            Method dump skipped, instructions count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.q.call():com.alipay.android.phone.mrpc.core.u");
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f2757f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.f2768q)) {
            return this.f2768q;
        }
        String b5 = this.f2755c.b("operationType");
        this.f2768q = b5;
        return b5;
    }

    private int g() {
        URL h5 = h();
        return h5.getPort() == -1 ? h5.getDefaultPort() : h5.getPort();
    }

    private URL h() {
        URL url = this.f2763l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f2755c.a());
        this.f2763l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.f2760i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f2760i = cookieManager2;
        return cookieManager2;
    }

    public final o a() {
        return this.f2755c;
    }
}
