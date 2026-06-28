package com.umeng.commonsdk.statistics.idtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f13305a = 10;

    /* renamed from: b, reason: collision with root package name */
    private final int f13306b = 100;

    /* renamed from: c, reason: collision with root package name */
    private final String f13307c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.umeng.commonsdk.statistics.proto.a> f13308d;

    /* renamed from: e, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.b f13309e;

    public a(String str) {
        this.f13307c = str;
    }

    private boolean g() {
        String b5;
        int h5;
        com.umeng.commonsdk.statistics.proto.b bVar = this.f13309e;
        if (bVar == null) {
            b5 = null;
        } else {
            b5 = bVar.b();
        }
        if (bVar == null) {
            h5 = 0;
        } else {
            h5 = bVar.h();
        }
        String a5 = a(f());
        if (a5 == null || a5.equals(b5)) {
            return false;
        }
        if (bVar == null) {
            bVar = new com.umeng.commonsdk.statistics.proto.b();
        }
        bVar.a(a5);
        bVar.a(System.currentTimeMillis());
        bVar.a(h5 + 1);
        com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
        aVar.a(this.f13307c);
        aVar.c(a5);
        aVar.b(b5);
        aVar.a(bVar.e());
        if (this.f13308d == null) {
            this.f13308d = new ArrayList(2);
        }
        this.f13308d.add(aVar);
        if (this.f13308d.size() > 10) {
            this.f13308d.remove(0);
        }
        this.f13309e = bVar;
        return true;
    }

    public boolean a() {
        return g();
    }

    public String b() {
        return this.f13307c;
    }

    public boolean c() {
        com.umeng.commonsdk.statistics.proto.b bVar = this.f13309e;
        return bVar == null || bVar.h() <= 100;
    }

    public com.umeng.commonsdk.statistics.proto.b d() {
        return this.f13309e;
    }

    public List<com.umeng.commonsdk.statistics.proto.a> e() {
        return this.f13308d;
    }

    public abstract String f();

    public void a(com.umeng.commonsdk.statistics.proto.b bVar) {
        this.f13309e = bVar;
    }

    public void a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f13308d = list;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || "0".equals(trim) || "unknown".equals(trim.toLowerCase(Locale.US))) {
            return null;
        }
        return trim;
    }

    public void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        this.f13309e = cVar.c().get(this.f13307c);
        List<com.umeng.commonsdk.statistics.proto.a> h5 = cVar.h();
        if (h5 == null || h5.size() <= 0) {
            return;
        }
        if (this.f13308d == null) {
            this.f13308d = new ArrayList();
        }
        for (com.umeng.commonsdk.statistics.proto.a aVar : h5) {
            if (this.f13307c.equals(aVar.f13371a)) {
                this.f13308d.add(aVar);
            }
        }
    }
}
