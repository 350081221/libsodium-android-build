package com.ss.android.socialbase.downloader.f;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    final String f10808a;

    /* renamed from: b, reason: collision with root package name */
    final String f10809b;

    /* renamed from: c, reason: collision with root package name */
    final String f10810c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f10811d;

    /* renamed from: e, reason: collision with root package name */
    private final List<m> f10812e;

    /* renamed from: f, reason: collision with root package name */
    private int f10813f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10814g;

    /* renamed from: h, reason: collision with root package name */
    private int f10815h;

    /* renamed from: i, reason: collision with root package name */
    private String f10816i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicLong f10817j;

    public q(String str, boolean z4) {
        this.f10812e = new ArrayList();
        this.f10817j = new AtomicLong();
        this.f10808a = str;
        this.f10811d = z4;
        this.f10809b = null;
        this.f10810c = null;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int lastIndexOf = str.lastIndexOf(".");
            if (lastIndexOf <= 0 || lastIndexOf >= str.length()) {
                return null;
            }
            return str.substring(0, lastIndexOf);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private String e() {
        if (this.f10816i == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10808a);
            sb.append("_");
            String str = this.f10809b;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("_");
            sb.append(this.f10811d);
            this.f10816i = sb.toString();
        }
        return this.f10816i;
    }

    public synchronized void b(m mVar) {
        try {
            this.f10812e.remove(mVar);
        } catch (Throwable unused) {
        }
    }

    public synchronized void c() {
        this.f10814g = false;
    }

    public synchronized boolean d() {
        return this.f10814g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return e().equals(((q) obj).e());
    }

    public int hashCode() {
        if (this.f10815h == 0) {
            this.f10815h = e().hashCode();
        }
        return this.f10815h;
    }

    public String toString() {
        return "UrlRecord{url='" + this.f10808a + "', ip='" + this.f10809b + "', ipFamily='" + this.f10810c + "', isMainUrl=" + this.f10811d + ", failedTimes=" + this.f10813f + ", isCurrentFailed=" + this.f10814g + '}';
    }

    public synchronized void b() {
        this.f10813f++;
        this.f10814g = true;
    }

    public synchronized void a(m mVar) {
        this.f10812e.add(mVar);
    }

    public q(String str, String str2) {
        this.f10812e = new ArrayList();
        this.f10817j = new AtomicLong();
        this.f10808a = str;
        this.f10811d = false;
        this.f10809b = str2;
        this.f10810c = a(str2);
    }

    public synchronized int a() {
        return this.f10812e.size();
    }

    public void a(long j5) {
        this.f10817j.addAndGet(j5);
    }
}
