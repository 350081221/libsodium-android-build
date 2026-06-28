package org.jdeferred.multiple;

import org.jdeferred.p;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f21617a;

    /* renamed from: b, reason: collision with root package name */
    private final p f21618b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21619c;

    public e(int i5, p pVar, Object obj) {
        this.f21617a = i5;
        this.f21618b = pVar;
        this.f21619c = obj;
    }

    public int a() {
        return this.f21617a;
    }

    public p b() {
        return this.f21618b;
    }

    public Object c() {
        return this.f21619c;
    }

    public String toString() {
        return "OneReject [index=" + this.f21617a + ", promise=" + this.f21618b + ", reject=" + this.f21619c + "]";
    }
}
