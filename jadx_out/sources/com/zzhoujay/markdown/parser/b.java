package com.zzhoujay.markdown.parser;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private a f15388a;

    /* renamed from: b, reason: collision with root package name */
    private a f15389b;

    /* renamed from: c, reason: collision with root package name */
    private a f15390c;

    public b(a aVar) {
        this.f15388a = aVar;
        this.f15389b = aVar;
        this.f15390c = aVar;
        while (this.f15390c.u() != null) {
            this.f15390c = this.f15390c.u();
        }
    }

    public void a(a aVar) {
        this.f15390c.a(aVar);
        this.f15390c = aVar;
    }

    public b b() {
        return new b(this, this.f15389b);
    }

    public b c() {
        if (f()) {
            return null;
        }
        return new b(this, this.f15389b.u());
    }

    public a d() {
        return this.f15389b;
    }

    public boolean e() {
        return this.f15389b == null || this.f15388a == null || this.f15390c == null;
    }

    public boolean f() {
        return this.f15389b.u() == null;
    }

    public void g(a aVar) {
        a aVar2 = this.f15389b;
        if (aVar2 == this.f15390c) {
            a(aVar);
        } else {
            aVar2.c(aVar);
        }
    }

    public boolean h() {
        if (this.f15389b.u() == null) {
            return false;
        }
        this.f15389b = this.f15389b.u();
        return true;
    }

    public a i() {
        return this.f15389b.u();
    }

    public boolean j() {
        if (this.f15389b.w() == null) {
            return false;
        }
        this.f15389b = d().w();
        return true;
    }

    public a k() {
        return this.f15389b.w();
    }

    public a l() {
        a u4;
        a aVar = this.f15389b;
        a aVar2 = this.f15390c;
        if (aVar == aVar2) {
            u4 = aVar2.w();
        } else {
            u4 = aVar.u();
            if (this.f15389b == this.f15388a) {
                this.f15388a = u4;
            }
        }
        this.f15389b.y();
        a aVar3 = this.f15389b;
        this.f15389b = u4;
        return aVar3;
    }

    public void m() {
        this.f15389b.z();
    }

    public void n() {
        if (this.f15388a == this.f15389b.w()) {
            this.f15388a = this.f15389b;
        }
        this.f15389b.A();
    }

    public void o() {
        this.f15389b = this.f15388a;
    }

    public boolean p() {
        return this.f15389b == this.f15388a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (a aVar = this.f15388a; aVar != null; aVar = aVar.u()) {
            sb.append(aVar.toString());
            sb.append(",");
        }
        return "{" + sb.toString() + a1.i.f138d;
    }

    private b(b bVar, a aVar) {
        this.f15388a = bVar.f15388a;
        this.f15390c = bVar.f15390c;
        this.f15389b = aVar;
    }
}
