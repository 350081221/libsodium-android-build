package org.jdeferred.multiple;

import org.jdeferred.p;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f21620a;

    /* renamed from: b, reason: collision with root package name */
    private final p f21621b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21622c;

    public f(int i5, p pVar, Object obj) {
        this.f21620a = i5;
        this.f21621b = pVar;
        this.f21622c = obj;
    }

    public int a() {
        return this.f21620a;
    }

    public p b() {
        return this.f21621b;
    }

    public Object c() {
        return this.f21622c;
    }

    public String toString() {
        return "OneResult [index=" + this.f21620a + ", promise=" + this.f21621b + ", result=" + this.f21622c + "]";
    }
}
