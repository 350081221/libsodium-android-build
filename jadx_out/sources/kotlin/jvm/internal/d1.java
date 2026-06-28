package kotlin.jvm.internal;

import kotlin.reflect.p;

/* loaded from: classes4.dex */
public abstract class d1 extends j1 implements kotlin.reflect.p {
    public d1() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.t(this);
    }

    @Override // kotlin.reflect.p
    @kotlin.g1(version = "1.1")
    public Object getDelegate() {
        return ((kotlin.reflect.p) getReflected()).getDelegate();
    }

    @Override // v3.a
    public Object invoke() {
        return get();
    }

    @kotlin.g1(version = "1.1")
    public d1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public p.a getGetter() {
        return ((kotlin.reflect.p) getReflected()).getGetter();
    }

    @kotlin.g1(version = "1.4")
    public d1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
