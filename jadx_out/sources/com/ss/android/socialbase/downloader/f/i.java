package com.ss.android.socialbase.downloader.f;

import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    volatile m f10739a;

    /* renamed from: b, reason: collision with root package name */
    int f10740b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10741c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f10742d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f10743e;

    /* renamed from: f, reason: collision with root package name */
    private long f10744f;

    /* renamed from: g, reason: collision with root package name */
    private int f10745g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f10746h;

    public i(long j5, long j6) {
        AtomicLong atomicLong = new AtomicLong();
        this.f10742d = atomicLong;
        this.f10740b = 0;
        this.f10741c = j5;
        atomicLong.set(j5);
        this.f10743e = j5;
        if (j6 >= j5) {
            this.f10744f = j6;
        } else {
            this.f10744f = -1L;
        }
    }

    public long a() {
        return this.f10742d.get() - this.f10741c;
    }

    public long b() {
        long j5 = this.f10744f;
        if (j5 >= this.f10741c) {
            return (j5 - e()) + 1;
        }
        return -1L;
    }

    public long c() {
        return this.f10741c;
    }

    public long d() {
        long j5 = this.f10742d.get();
        long j6 = this.f10744f;
        if (j6 > 0) {
            long j7 = j6 + 1;
            if (j5 > j7) {
                return j7;
            }
        }
        return j5;
    }

    public long e() {
        m mVar = this.f10739a;
        if (mVar != null) {
            long d5 = mVar.d();
            if (d5 > this.f10743e) {
                return d5;
            }
        }
        return this.f10743e;
    }

    public long f() {
        return this.f10744f;
    }

    public int g() {
        return this.f10745g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f10740b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        this.f10740b--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f10740b;
    }

    public JSONObject k() throws JSONException {
        JSONObject jSONObject = this.f10746h;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.f10746h = jSONObject;
        }
        jSONObject.put("st", c());
        jSONObject.put("cu", d());
        jSONObject.put("en", f());
        return jSONObject;
    }

    public String toString() {
        return "Segment{startOffset=" + this.f10741c + ",\t currentOffset=" + this.f10742d + ",\t currentOffsetRead=" + e() + ",\t endOffset=" + this.f10744f + '}';
    }

    public void a(long j5) {
        long j6 = this.f10741c;
        if (j5 < j6) {
            j5 = j6;
        }
        long j7 = this.f10744f;
        if (j7 > 0) {
            long j8 = j7 + 1;
            if (j5 > j8) {
                j5 = j8;
            }
        }
        this.f10742d.set(j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j5) {
        if (j5 >= this.f10741c) {
            this.f10744f = j5;
            return;
        }
        Log.w("Segment", "setEndOffset: endOffset = " + j5 + ", segment = " + this);
        if (j5 == -1) {
            this.f10744f = j5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j5) {
        this.f10742d.addAndGet(j5);
    }

    public void d(long j5) {
        if (j5 >= this.f10742d.get()) {
            this.f10743e = j5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i5) {
        this.f10740b = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i5) {
        this.f10745g = i5;
    }

    public static String a(List<i> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Collections.sort(list, new Comparator<i>() { // from class: com.ss.android.socialbase.downloader.f.i.1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(i iVar, i iVar2) {
                return (int) (iVar.c() - iVar2.c());
            }
        });
        StringBuilder sb = new StringBuilder();
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public i(i iVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.f10742d = atomicLong;
        this.f10740b = 0;
        this.f10741c = iVar.f10741c;
        this.f10744f = iVar.f10744f;
        atomicLong.set(iVar.f10742d.get());
        this.f10743e = atomicLong.get();
        this.f10745g = iVar.f10745g;
    }

    public i(JSONObject jSONObject) {
        this.f10742d = new AtomicLong();
        this.f10740b = 0;
        this.f10741c = jSONObject.optLong("st");
        c(jSONObject.optLong("en"));
        a(jSONObject.optLong("cu"));
        d(d());
    }
}
