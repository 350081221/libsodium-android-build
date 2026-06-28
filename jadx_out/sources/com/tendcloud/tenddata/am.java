package com.tendcloud.tenddata;

import android.os.SystemClock;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.http.protocol.HTTP;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11400a = 15000;

    /* renamed from: b, reason: collision with root package name */
    private static final int f11401b = 15000;

    /* renamed from: c, reason: collision with root package name */
    private URL f11402c;

    /* renamed from: d, reason: collision with root package name */
    private aq f11403d;

    /* renamed from: e, reason: collision with root package name */
    private ap f11404e;

    /* renamed from: f, reason: collision with root package name */
    private an f11405f;

    /* renamed from: g, reason: collision with root package name */
    private String f11406g;

    /* renamed from: h, reason: collision with root package name */
    private String f11407h;

    /* renamed from: i, reason: collision with root package name */
    private String f11408i;

    /* renamed from: j, reason: collision with root package name */
    private int f11409j;

    /* renamed from: k, reason: collision with root package name */
    private int f11410k;

    /* loaded from: classes3.dex */
    public static final class a {
        private an body;
        private String cert;
        private ap headers;
        private String host;
        private String ip;
        private aq method;
        private URL url;
        private int connectionTimeout = 15000;
        private int readTimeout = 15000;

        public a body(an anVar) {
            this.body = anVar;
            return this;
        }

        public am build() {
            return new am(this.url, this.method, this.headers, this.body, this.connectionTimeout, this.readTimeout, this.cert, this.host, this.ip);
        }

        public a cert(String str) {
            this.cert = str;
            return this;
        }

        public a connectionTimeout(int i5) {
            this.connectionTimeout = i5;
            return this;
        }

        public a header(ap apVar) {
            this.headers = apVar;
            return this;
        }

        public a host(String str) {
            this.host = str;
            return this;
        }

        public a ip(String str) {
            this.ip = str;
            return this;
        }

        public a method(aq aqVar) {
            this.method = aqVar;
            return this;
        }

        public a readTimeout(int i5) {
            this.readTimeout = i5;
            return this;
        }

        public a url(String str) {
            try {
                this.url = new URL(str);
                return this;
            } catch (MalformedURLException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }

    public aq a() {
        return this.f11403d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar b() {
        ar a5 = ar.a("");
        try {
            ar a6 = a(false);
            if (a6.b() == ar.a()) {
                String a7 = aj.a(this.f11407h);
                if (!y.b(a7)) {
                    this.f11402c = ak.a(this.f11402c, a7);
                    return a(true);
                }
                return a6;
            }
            return a6;
        } catch (Throwable unused) {
            return a5;
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("\n url: ");
        sb.append(this.f11402c);
        sb.append("\n method: ");
        sb.append(this.f11403d);
        sb.append("\n headers: ");
        sb.append(this.f11404e);
        sb.append("\n content length: ");
        an anVar = this.f11405f;
        Object obj2 = "";
        if (anVar == null) {
            obj = "";
        } else {
            obj = Integer.valueOf(anVar.a().length);
        }
        sb.append(obj);
        sb.append("\n content Type: ");
        an anVar2 = this.f11405f;
        if (anVar2 != null) {
            obj2 = anVar2.b();
        }
        sb.append(obj2);
        sb.append("\n host: ");
        sb.append(this.f11407h);
        sb.append("\n ip: ");
        sb.append(this.f11408i);
        sb.append("\n connectionTimeout: ");
        sb.append(this.f11409j);
        sb.append("\n readTimeout: ");
        sb.append(this.f11410k);
        sb.append("\n cert:  ");
        sb.append(this.f11406g);
        sb.append("\n");
        return sb.toString();
    }

    private am(URL url, aq aqVar, ap apVar, an anVar, int i5, int i6, String str, String str2, String str3) {
        this.f11402c = url;
        this.f11403d = aqVar;
        this.f11404e = apVar;
        this.f11405f = anVar;
        this.f11409j = i5;
        this.f11410k = i6;
        this.f11406g = str;
        this.f11407h = str2;
        this.f11408i = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar a(com.tendcloud.tenddata.a aVar) {
        ar a5 = ar.a("");
        try {
            a5 = a(false);
            URL url = this.f11402c;
            String str = this.f11407h;
            if (aVar.name().equals("SDK") && a5.b() == ar.a()) {
                ai.a(str);
                int i5 = 0;
                while (true) {
                    if (i5 > ai.f11383a.size()) {
                        break;
                    }
                    String a6 = ai.a();
                    this.f11407h = a6;
                    URL a7 = ai.a(url, a6);
                    this.f11402c = a7;
                    if (url.equals(a7) && str.equals(this.f11407h)) {
                        break;
                    }
                    a5 = a(false);
                    ai.a(this.f11407h);
                    if (a5.b() != ar.a()) {
                        s.a(ab.f11351g, ab.f11367w, ab.C, this.f11402c.toString());
                        s.a(ab.f11351g, ab.f11367w, ab.D, this.f11407h);
                        break;
                    }
                    i5++;
                }
            }
            ak.b(this.f11407h, this.f11408i);
        } catch (Throwable unused) {
        }
        if (a5.b() != ar.a()) {
            String str2 = this.f11407h;
            ak.a(str2, ak.b(str2), 2);
            ak.a(this.f11407h);
            return a5;
        }
        if (ak.a(this.f11407h, 2) != null) {
            this.f11402c = ak.a(this.f11402c, ak.a(this.f11407h, 2));
            a5 = a(true);
            if (a5.b() == ar.a()) {
                ak.a(this.f11407h, null, 2);
            }
        } else {
            if (ak.a(this.f11407h, 1) != null) {
                this.f11402c = ak.a(this.f11402c, ak.a(this.f11407h, 1));
                a5 = a(true);
                if (a5.b() != ar.a()) {
                    String str3 = this.f11407h;
                    ak.a(str3, ak.a(str3, 1), 2);
                    ak.a(this.f11407h);
                }
            }
            if (a5.b() == ar.a() && ak.a(this.f11407h, 3) != null) {
                this.f11402c = ak.a(this.f11402c, ak.a(this.f11407h, 3));
                a5 = a(true);
                if (a5.b() != ar.a()) {
                    String str4 = this.f11407h;
                    ak.a(str4, ak.a(str4, 3), 2);
                }
            }
            if (a5.b() == ar.a() && ak.a(this.f11407h, 4) != null) {
                this.f11402c = ak.a(this.f11402c, ak.a(this.f11407h, 4));
                a5 = a(true);
                if (a5.b() != ar.a()) {
                    String str5 = this.f11407h;
                    ak.a(str5, ak.a(str5, 4), 2);
                }
            }
            if (a5.b() == ar.a() && aj.b(this.f11407h) == 3 && !aj.c(this.f11407h)) {
                String a8 = aj.a(this.f11407h);
                if (!y.b(a8)) {
                    this.f11402c = ak.a(this.f11402c, a8);
                    aj.updateTimeStamp(this.f11407h);
                    a5 = a(true);
                    if (a5.b() != ar.a()) {
                        ak.a(this.f11407h, a8);
                    }
                }
            }
        }
        if (a5.b() == ar.a() && aj.b(this.f11407h) < 3) {
            aj.updateFailureCountWithHost(this.f11407h);
        }
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar a(boolean z4) {
        ar a5;
        HttpURLConnection httpURLConnection = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f11402c.openConnection();
            try {
                httpURLConnection2.setConnectTimeout(15000);
                httpURLConnection2.setReadTimeout(15000);
                URL url = this.f11402c;
                if (url != null && url.toString().startsWith("https://")) {
                    ah.f11379a.put(Long.valueOf(Thread.currentThread().getId()), this.f11407h);
                    if (z4) {
                        ah.setHostNameVerifyAllowAll(httpURLConnection2);
                    }
                }
                if (!y.b(this.f11406g)) {
                    ah.a(httpURLConnection2, this.f11406g);
                }
                if (!y.b(this.f11407h)) {
                    httpURLConnection2.setRequestProperty(HTTP.TARGET_HOST, y.b(this.f11402c.getHost()) ? this.f11407h : this.f11402c.getHost());
                    httpURLConnection2.setRequestProperty(HTTP.TARGET_HOST, this.f11407h);
                }
                aq aqVar = this.f11403d;
                if (aqVar != null) {
                    aqVar.a(httpURLConnection2);
                }
                ap apVar = this.f11404e;
                if (apVar != null) {
                    apVar.a(httpURLConnection2);
                }
                an anVar = this.f11405f;
                if (anVar != null) {
                    anVar.a(httpURLConnection2);
                }
                httpURLConnection2.connect();
                a5 = ar.a(this.f11407h, httpURLConnection2, elapsedRealtime, this.f11405f);
                httpURLConnection2.disconnect();
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    a5 = ar.a(th.getMessage());
                    return a5;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return a5;
    }
}
