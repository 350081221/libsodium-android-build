package com.ss.android.socialbase.downloader.network.a;

import com.ss.android.socialbase.downloader.network.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class c implements g {

    /* renamed from: e, reason: collision with root package name */
    private static final ArrayList<String> f11147e;

    /* renamed from: a, reason: collision with root package name */
    protected final String f11148a;

    /* renamed from: b, reason: collision with root package name */
    protected final long f11149b;

    /* renamed from: c, reason: collision with root package name */
    protected List<com.ss.android.socialbase.downloader.model.c> f11150c;

    /* renamed from: g, reason: collision with root package name */
    private int f11153g;

    /* renamed from: h, reason: collision with root package name */
    private long f11154h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11155i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11156j;

    /* renamed from: k, reason: collision with root package name */
    private g f11157k;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f11152f = null;

    /* renamed from: d, reason: collision with root package name */
    protected final Object f11151d = new Object();

    static {
        ArrayList<String> arrayList = new ArrayList<>(6);
        f11147e = arrayList;
        arrayList.add(HTTP.CONTENT_LEN);
        arrayList.add("Content-Range");
        arrayList.add(HTTP.TRANSFER_ENCODING);
        arrayList.add("Accept-Ranges");
        arrayList.add("Etag");
        arrayList.add("Content-Disposition");
    }

    public c(String str, List<com.ss.android.socialbase.downloader.model.c> list, long j5) {
        this.f11148a = str;
        this.f11150c = list;
        this.f11149b = j5;
    }

    public void a() throws Exception {
        if (this.f11152f != null) {
            return;
        }
        try {
            this.f11156j = true;
            this.f11157k = com.ss.android.socialbase.downloader.downloader.c.a(this.f11148a, this.f11150c);
            synchronized (this.f11151d) {
                if (this.f11157k != null) {
                    HashMap hashMap = new HashMap();
                    this.f11152f = hashMap;
                    a(this.f11157k, hashMap);
                    this.f11153g = this.f11157k.b();
                    this.f11154h = System.currentTimeMillis();
                    this.f11155i = a(this.f11153g);
                }
                this.f11156j = false;
                this.f11151d.notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this.f11151d) {
                if (this.f11157k != null) {
                    HashMap hashMap2 = new HashMap();
                    this.f11152f = hashMap2;
                    a(this.f11157k, hashMap2);
                    this.f11153g = this.f11157k.b();
                    this.f11154h = System.currentTimeMillis();
                    this.f11155i = a(this.f11153g);
                }
                this.f11156j = false;
                this.f11151d.notifyAll();
                throw th;
            }
        }
    }

    public boolean a(int i5) {
        return i5 >= 200 && i5 < 300;
    }

    @Override // com.ss.android.socialbase.downloader.network.g
    public int b() throws IOException {
        return this.f11153g;
    }

    @Override // com.ss.android.socialbase.downloader.network.g
    public void c() {
        g gVar = this.f11157k;
        if (gVar != null) {
            gVar.c();
        }
    }

    public void d() throws InterruptedException {
        synchronized (this.f11151d) {
            if (this.f11156j && this.f11152f == null) {
                this.f11151d.wait();
            }
        }
    }

    public boolean e() {
        return this.f11155i;
    }

    public boolean f() {
        return System.currentTimeMillis() - this.f11154h < b.f11142b;
    }

    public boolean g() {
        return this.f11156j;
    }

    public List<com.ss.android.socialbase.downloader.model.c> h() {
        return this.f11150c;
    }

    public Map<String, String> i() {
        return this.f11152f;
    }

    private void a(g gVar, Map<String, String> map) {
        if (gVar == null || map == null) {
            return;
        }
        Iterator<String> it = f11147e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            map.put(next, gVar.a(next));
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.g
    public String a(String str) {
        Map<String, String> map = this.f11152f;
        if (map != null) {
            return map.get(str);
        }
        g gVar = this.f11157k;
        if (gVar != null) {
            return gVar.a(str);
        }
        return null;
    }
}
