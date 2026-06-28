package com.ss.android.downloadlib.addownload;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.download.api.download.DownloadModel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f9895a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f9896b;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static f f9897a = new f();
    }

    public static f a() {
        return a.f9897a;
    }

    private String c(String str) {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String lastPathSegment = parse.getLastPathSegment();
            if (!TextUtils.equals("https", scheme) || !lastPathSegment.endsWith(".apk")) {
                return null;
            }
            this.f9895a.put(str, lastPathSegment);
            return lastPathSegment;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void b(String str) {
        Iterator<Map.Entry<String, String>> it = this.f9896b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            if (TextUtils.equals(next.getValue(), str)) {
                it.remove();
                this.f9895a.remove(next.getKey());
            }
        }
    }

    private f() {
        this.f9895a = new ConcurrentHashMap<>();
        this.f9896b = new ConcurrentHashMap<>();
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || this.f9896b.containsKey(str2)) {
            return;
        }
        this.f9896b.put(str2, str);
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str) || this.f9896b.isEmpty() || !this.f9896b.containsKey(str)) {
            return null;
        }
        String c5 = c(str);
        if (this.f9895a.containsValue(c5)) {
            for (Map.Entry<String, String> entry : this.f9895a.entrySet()) {
                if (TextUtils.equals(entry.getValue(), c5)) {
                    String str2 = this.f9896b.get(entry.getKey());
                    this.f9896b.put(str, str2);
                    if (!this.f9895a.containsKey(str)) {
                        this.f9895a.put(str, c5);
                    }
                    return str2;
                }
            }
        }
        return this.f9896b.get(str);
    }

    public String a(DownloadModel downloadModel) {
        String c5 = c(downloadModel.getDownloadUrl());
        if (c5 == null || TextUtils.isEmpty(c5)) {
            return null;
        }
        String e5 = com.ss.android.socialbase.downloader.i.f.e(c5 + downloadModel.getPackageName());
        this.f9896b.put(downloadModel.getDownloadUrl(), e5);
        return e5;
    }
}
