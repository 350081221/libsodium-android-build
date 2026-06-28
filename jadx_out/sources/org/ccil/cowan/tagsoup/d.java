package org.ccil.cowan.tagsoup;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private e f21140a;

    /* renamed from: b, reason: collision with root package name */
    private a f21141b;

    /* renamed from: c, reason: collision with root package name */
    private d f21142c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21143d;

    public d(e eVar, boolean z4) {
        this.f21140a = eVar;
        if (z4) {
            this.f21141b = new a(eVar.a());
        } else {
            this.f21141b = new a();
        }
        this.f21142c = null;
        this.f21143d = false;
    }

    public void a() {
        for (int length = this.f21141b.getLength() - 1; length >= 0; length--) {
            if (this.f21141b.getType(length).equals("ID") || this.f21141b.getQName(length).equals("name")) {
                this.f21141b.e(length);
            }
        }
    }

    public a b() {
        return this.f21141b;
    }

    public boolean c(d dVar) {
        return this.f21140a.b(dVar.f21140a);
    }

    public void d() {
        for (int length = this.f21141b.getLength() - 1; length >= 0; length--) {
            String localName = this.f21141b.getLocalName(length);
            if (this.f21141b.getValue(length) == null || localName == null || localName.length() == 0) {
                this.f21141b.e(length);
            }
        }
    }

    public int e() {
        return this.f21140a.c();
    }

    public boolean f() {
        return this.f21143d;
    }

    public String g() {
        return this.f21140a.d();
    }

    public int h() {
        return this.f21140a.f();
    }

    public int i() {
        return this.f21140a.g();
    }

    public String j() {
        return this.f21140a.h();
    }

    public String k() {
        return this.f21140a.i();
    }

    public d l() {
        return this.f21142c;
    }

    public e m() {
        return this.f21140a.l();
    }

    public void n() {
        this.f21143d = true;
    }

    public void o(String str, String str2, String str3) {
        this.f21140a.o(this.f21141b, str, str2, str3);
    }

    public void p(d dVar) {
        this.f21142c = dVar;
    }

    public e q() {
        return this.f21140a;
    }
}
