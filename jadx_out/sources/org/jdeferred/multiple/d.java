package org.jdeferred.multiple;

import org.jdeferred.p;

/* loaded from: classes4.dex */
public class d extends b {

    /* renamed from: d, reason: collision with root package name */
    private final int f21614d;

    /* renamed from: e, reason: collision with root package name */
    private final p f21615e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f21616f;

    public d(int i5, int i6, int i7, int i8, p pVar, Object obj) {
        super(i5, i6, i7);
        this.f21614d = i8;
        this.f21615e = pVar;
        this.f21616f = obj;
    }

    public int d() {
        return this.f21614d;
    }

    public Object e() {
        return this.f21616f;
    }

    public p f() {
        return this.f21615e;
    }

    @Override // org.jdeferred.multiple.b
    public String toString() {
        return "OneProgress [index=" + this.f21614d + ", promise=" + this.f21615e + ", progress=" + this.f21616f + ", getDone()=" + a() + ", getFail()=" + b() + ", getTotal()=" + c() + "]";
    }
}
