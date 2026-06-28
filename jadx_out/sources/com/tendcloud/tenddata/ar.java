package com.tendcloud.tenddata;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes3.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11418a = 600;

    /* renamed from: b, reason: collision with root package name */
    private int f11419b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f11420c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f11421d;

    private ar(int i5, String str) {
        this(i5, str.getBytes(), null);
    }

    public static int a() {
        return 600;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r9 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r9 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tendcloud.tenddata.ar a(java.lang.String r11, java.net.HttpURLConnection r12, long r13, com.tendcloud.tenddata.an r15) {
        /*
            r0 = 0
            int r8 = r12.getResponseCode()     // Catch: java.lang.Throwable -> L2e
            r1 = 400(0x190, float:5.6E-43)
            if (r8 <= r1) goto Le
            java.io.InputStream r1 = r12.getErrorStream()     // Catch: java.lang.Throwable -> L30
            goto L12
        Le:
            java.io.InputStream r1 = r12.getInputStream()     // Catch: java.lang.Throwable -> L30
        L12:
            r9 = r1
            java.util.Map r1 = r12.getHeaderFields()     // Catch: java.lang.Throwable -> L31
            int r2 = r12.getContentLength()     // Catch: java.lang.Throwable -> L31
            com.tendcloud.tenddata.ar r10 = a(r8, r2, r9, r1)     // Catch: java.lang.Throwable -> L31
            r1 = r11
            r2 = r12
            r3 = r8
            r4 = r13
            r6 = r10
            r7 = r15
            a(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L39
        L2a:
            r9.close()     // Catch: java.lang.Throwable -> L39
            goto L39
        L2e:
            r8 = 600(0x258, float:8.41E-43)
        L30:
            r9 = r0
        L31:
            com.tendcloud.tenddata.ar r10 = new com.tendcloud.tenddata.ar     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r8, r0, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L39
            goto L2a
        L39:
            return r10
        L3a:
            r11 = move-exception
            if (r9 == 0) goto L40
            r9.close()     // Catch: java.lang.Throwable -> L40
        L40:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.ar.a(java.lang.String, java.net.HttpURLConnection, long, com.tendcloud.tenddata.an):com.tendcloud.tenddata.ar");
    }

    public int b() {
        return this.f11419b;
    }

    public byte[] c() {
        return this.f11420c;
    }

    public Map<String, List<String>> d() {
        return this.f11421d;
    }

    private ar(int i5, byte[] bArr, Map<String, List<String>> map) {
        this.f11419b = i5;
        this.f11420c = bArr;
        this.f11421d = map;
    }

    public static ar a(String str) {
        return new ar(600, str);
    }

    private static ar a(int i5, int i6, InputStream inputStream, Map<String, List<String>> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = i6 != -1 ? new ByteArrayOutputStream(i6) : new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read();
                if (read != -1) {
                    byteArrayOutputStream.write(read);
                } else {
                    inputStream.close();
                    return new ar(i5, byteArrayOutputStream.toByteArray(), map);
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    private static void a(String str, HttpURLConnection httpURLConnection, int i5, long j5, ar arVar, an anVar) {
        boolean z4;
        if (httpURLConnection != null) {
            try {
                if (httpURLConnection.getRequestMethod().equalsIgnoreCase(HttpPost.METHOD_NAME)) {
                    TreeMap treeMap = new TreeMap();
                    URL url = httpURLConnection.getURL();
                    treeMap.put("targetUrl", url.toString());
                    try {
                        treeMap.put("targetIP", InetAddress.getByName(url.getHost()).getHostAddress());
                    } catch (Throwable unused) {
                        treeMap.put("targetIP", "0.0.0.0");
                    }
                    if (i5 == 200) {
                        if (anVar != null && anVar.a() != null) {
                            treeMap.put("reqSize", Integer.valueOf(anVar.a().length));
                        }
                        treeMap.put("respTime", Long.valueOf(SystemClock.elapsedRealtime() - j5));
                        z4 = true;
                    } else {
                        treeMap.put(MediationConstant.KEY_ERROR_MSG, a(arVar));
                        treeMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i5));
                        z4 = false;
                    }
                    bo.a(str, z4, treeMap);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private static String a(ar arVar) {
        byte[] c5;
        if (arVar == null) {
            return "";
        }
        if (arVar.c() != null) {
            try {
                c5 = arVar.c();
                if (c5.length > 104857600) {
                    return "Input stream more than 100 MB size limit";
                }
            } catch (Throwable unused) {
                return "";
            }
        }
        return new String(c5);
    }
}
