package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: o, reason: collision with root package name */
    private static final String f8463o = "d";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f8464a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f8465b;

    /* renamed from: c, reason: collision with root package name */
    private int f8466c;

    /* renamed from: d, reason: collision with root package name */
    private long f8467d;

    /* renamed from: e, reason: collision with root package name */
    private long f8468e;

    /* renamed from: f, reason: collision with root package name */
    private long f8469f;

    /* renamed from: g, reason: collision with root package name */
    private String f8470g;

    /* renamed from: h, reason: collision with root package name */
    private int f8471h;

    /* renamed from: i, reason: collision with root package name */
    private int f8472i;

    /* renamed from: j, reason: collision with root package name */
    private String f8473j;

    /* renamed from: k, reason: collision with root package name */
    private long f8474k;

    /* renamed from: l, reason: collision with root package name */
    private String f8475l;

    /* renamed from: m, reason: collision with root package name */
    private Exception f8476m;

    /* renamed from: n, reason: collision with root package name */
    private String f8477n;

    public d(int i5, Map<String, List<String>> map, byte[] bArr, long j5) {
        this.f8471h = 2;
        this.f8472i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f8473j = "";
        this.f8474k = 0L;
        this.f8475l = "";
        this.f8466c = i5;
        this.f8464a = map;
        this.f8465b = ByteBuffer.wrap(bArr).array();
        this.f8467d = j5;
        s();
    }

    public d(Exception exc, long j5) {
        this.f8466c = 0;
        this.f8471h = 2;
        this.f8472i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f8473j = "";
        this.f8474k = 0L;
        this.f8475l = "";
        this.f8476m = exc;
        this.f8467d = j5;
    }

    private void a(Map<String, String> map) {
        String str;
        String str2;
        if (map.containsKey("ETag")) {
            String str3 = map.get("ETag");
            if (!TextUtils.isEmpty(str3)) {
                Logger.i(f8463o, "success get Etag from server");
                a(str3);
                return;
            } else {
                str = f8463o;
                str2 = "The Response Heads Etag is Empty";
            }
        } else {
            str = f8463o;
            str2 = "Response Heads has not Etag";
        }
        Logger.i(str, str2);
    }

    private void b(int i5) {
        this.f8472i = i5;
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey(OpenStreetMapTileProviderConstants.HTTP_CACHECONTROL_HEADER)) {
            String str = map.get(OpenStreetMapTileProviderConstants.HTTP_CACHECONTROL_HEADER);
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(f8463o, "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e5) {
                        e = e5;
                        Logger.w(f8463o, "getExpireTime addHeadersToResult NumberFormatException", e);
                        if (time > 0) {
                        }
                        time = 86400;
                        long j5 = time * 1000;
                        Logger.i(f8463o, "convert expireTime{%s}", Long.valueOf(j5));
                        c(String.valueOf(j5 + System.currentTimeMillis()));
                    }
                } catch (NumberFormatException e6) {
                    e = e6;
                    time = 0;
                }
            }
            time = 0;
        } else {
            if (map.containsKey(OpenStreetMapTileProviderConstants.HTTP_EXPIRES_HEADER)) {
                String str2 = map.get(OpenStreetMapTileProviderConstants.HTTP_EXPIRES_HEADER);
                Logger.v(f8463o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey(HTTP.DATE_HEADER) ? map.get(HTTP.DATE_HEADER) : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e7) {
                    Logger.w(f8463o, "getExpireTime ParseException.", e7);
                }
            } else {
                Logger.i(f8463o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time > 0 || time > 2592000) {
            time = 86400;
        }
        long j52 = time * 1000;
        Logger.i(f8463o, "convert expireTime{%s}", Long.valueOf(j52));
        c(String.valueOf(j52 + System.currentTimeMillis()));
    }

    private void c(int i5) {
        this.f8471h = i5;
    }

    private void c(long j5) {
        this.f8474k = j5;
    }

    private void c(String str) {
        this.f8473j = str;
    }

    private void c(Map<String, String> map) {
        long j5;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j5 = Long.parseLong(str);
                } catch (NumberFormatException e5) {
                    Logger.w(f8463o, "getRetryAfter addHeadersToResult NumberFormatException", e5);
                }
                long j6 = j5 * 1000;
                Logger.v(f8463o, "convert retry-afterTime{%s}", Long.valueOf(j6));
                c(j6);
            }
        }
        j5 = 0;
        long j62 = j5 * 1000;
        Logger.v(f8463o, "convert retry-afterTime{%s}", Long.valueOf(j62));
        c(j62);
    }

    private void d(String str) {
    }

    private void e(String str) {
    }

    private void f(String str) {
        this.f8470g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0051, code lost:
    
        if (r9.getInt("resultCode") == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            r10 = this;
            java.lang.String r0 = "errorDesc"
            java.lang.String r1 = "errorList"
            java.lang.String r2 = "errorCode"
            java.lang.String r3 = "resultCode"
            java.lang.String r4 = "isSuccess"
            boolean r5 = r10.m()
            r6 = 1
            if (r5 == 0) goto L1c
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.f8463o
            java.lang.String r1 = "GRSSDK get httpcode{304} not any changed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r6)
            return
        L1c:
            boolean r5 = r10.o()
            r7 = 2
            if (r5 != 0) goto L2e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.f8463o
            java.lang.String r1 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.c(r7)
            return
        L2e:
            r5 = 0
            byte[] r8 = r10.f8465b     // Catch: org.json.JSONException -> Lb7
            java.lang.String r8 = com.huawei.hms.framework.common.StringUtils.byte2Str(r8)     // Catch: org.json.JSONException -> Lb7
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb7
            r9.<init>(r8)     // Catch: org.json.JSONException -> Lb7
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> Lb7
            if (r8 == 0) goto L47
            int r3 = r9.getInt(r4)     // Catch: org.json.JSONException -> Lb7
            if (r3 != r6) goto L55
            goto L53
        L47:
            boolean r4 = r9.has(r3)     // Catch: org.json.JSONException -> Lb7
            if (r4 == 0) goto L57
            int r3 = r9.getInt(r3)     // Catch: org.json.JSONException -> Lb7
            if (r3 != 0) goto L55
        L53:
            r3 = r6
            goto L5f
        L55:
            r3 = r7
            goto L5f
        L57:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.f8463o     // Catch: org.json.JSONException -> Lb7
            java.lang.String r4 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r3, r4)     // Catch: org.json.JSONException -> Lb7
            r3 = -1
        L5f:
            java.lang.String r4 = "services"
            if (r3 == r6) goto L6a
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> Lb7
            if (r8 == 0) goto L6a
            r3 = r5
        L6a:
            r10.c(r3)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r8 = ""
            if (r3 == r6) goto L92
            if (r3 != 0) goto L74
            goto L92
        L74:
            boolean r1 = r9.has(r2)     // Catch: org.json.JSONException -> Lb7
            if (r1 == 0) goto L7f
            int r1 = r9.getInt(r2)     // Catch: org.json.JSONException -> Lb7
            goto L81
        L7f:
            r1 = 9001(0x2329, float:1.2613E-41)
        L81:
            r10.b(r1)     // Catch: org.json.JSONException -> Lb7
            boolean r1 = r9.has(r0)     // Catch: org.json.JSONException -> Lb7
            if (r1 == 0) goto L8e
            java.lang.String r8 = r9.getString(r0)     // Catch: org.json.JSONException -> Lb7
        L8e:
            r10.d(r8)     // Catch: org.json.JSONException -> Lb7
            goto Lce
        L92:
            boolean r0 = r9.has(r4)     // Catch: org.json.JSONException -> Lb7
            if (r0 == 0) goto La1
            org.json.JSONObject r0 = r9.getJSONObject(r4)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> Lb7
            goto La2
        La1:
            r0 = r8
        La2:
            r10.f(r0)     // Catch: org.json.JSONException -> Lb7
            boolean r0 = r9.has(r1)     // Catch: org.json.JSONException -> Lb7
            if (r0 == 0) goto Lb3
            org.json.JSONObject r0 = r9.getJSONObject(r1)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r8 = r0.toString()     // Catch: org.json.JSONException -> Lb7
        Lb3:
            r10.e(r8)     // Catch: org.json.JSONException -> Lb7
            goto Lce
        Lb7:
            r0 = move-exception
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.f8463o
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2[r5] = r0
            java.lang.String r0 = "GrsResponse GrsResponse(String result) JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
            r10.c(r7)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.d.p():void");
    }

    private void q() {
        if (o() || n() || m()) {
            Map<String, String> r5 = r();
            if (r5.size() <= 0) {
                Logger.w(f8463o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (o() || m()) {
                    b(r5);
                    a(r5);
                }
                if (n()) {
                    c(r5);
                }
            } catch (JSONException e5) {
                Logger.w(f8463o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e5.getMessage()));
            }
        }
    }

    private Map<String, String> r() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.f8464a;
        if (map == null || map.size() <= 0) {
            Logger.v(f8463o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return hashMap;
        }
        for (Map.Entry<String, List<String>> entry : this.f8464a.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                hashMap.put(key, it.next());
            }
        }
        return hashMap;
    }

    private void s() {
        q();
        p();
    }

    public String a() {
        return this.f8473j;
    }

    public void a(int i5) {
    }

    public void a(long j5) {
        this.f8469f = j5;
    }

    public void a(String str) {
        this.f8475l = str;
    }

    public int b() {
        return this.f8466c;
    }

    public void b(long j5) {
        this.f8468e = j5;
    }

    public void b(String str) {
        this.f8477n = str;
    }

    public int c() {
        return this.f8472i;
    }

    public Exception d() {
        return this.f8476m;
    }

    public String e() {
        return this.f8475l;
    }

    public int f() {
        return this.f8471h;
    }

    public long g() {
        return this.f8469f;
    }

    public long h() {
        return this.f8468e;
    }

    public long i() {
        return this.f8467d;
    }

    public String j() {
        return this.f8470g;
    }

    public long k() {
        return this.f8474k;
    }

    public String l() {
        return this.f8477n;
    }

    public boolean m() {
        return this.f8466c == 304;
    }

    public boolean n() {
        return this.f8466c == 503;
    }

    public boolean o() {
        return this.f8466c == 200;
    }
}
