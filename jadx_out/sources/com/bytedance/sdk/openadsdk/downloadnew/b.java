package com.bytedance.sdk.openadsdk.downloadnew;

import android.net.http.Headers;
import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public class b {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public InputStream f4936a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f4937b;

        /* renamed from: c, reason: collision with root package name */
        public int f4938c;

        /* renamed from: d, reason: collision with root package name */
        public HttpURLConnection f4939d;

        public a(InputStream inputStream, Map<String, String> map, int i5, HttpURLConnection httpURLConnection) {
            this.f4936a = inputStream;
            this.f4937b = map;
            this.f4938c = i5;
            this.f4939d = httpURLConnection;
        }
    }

    public static HttpURLConnection a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception unused) {
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty(Headers.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            return ((responseCode < 200 || responseCode >= 300) && responseCode >= 300 && responseCode < 400) ? a(httpURLConnection.getHeaderField("Location"), map) : httpURLConnection;
        } catch (Exception unused2) {
            httpURLConnection2 = httpURLConnection;
            return httpURLConnection2;
        }
    }

    public static Map<String, String> a(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        int size = httpURLConnection.getHeaderFields().size();
        for (int i5 = 0; i5 < size; i5++) {
            hashMap.put(httpURLConnection.getHeaderFieldKey(i5), httpURLConnection.getHeaderField(i5));
        }
        return hashMap;
    }

    public static a a(String str, List<com.ss.android.socialbase.downloader.model.c> list) throws IOException {
        int responseCode;
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (com.ss.android.socialbase.downloader.model.c cVar : list) {
                hashMap.put(cVar.a(), cVar.b());
            }
        }
        HttpURLConnection a5 = a(str, hashMap);
        if (a5 == null || (responseCode = a5.getResponseCode()) < 200 || responseCode >= 300) {
            return null;
        }
        Map<String, String> a6 = a(a5);
        InputStream inputStream = a5.getInputStream();
        String contentEncoding = a5.getContentEncoding();
        if (!TextUtils.isEmpty(contentEncoding) && contentEncoding.contains(Constants.CP_GZIP)) {
            inputStream = new GZIPInputStream(inputStream);
        }
        return new a(inputStream, a6, responseCode, a5);
    }
}
