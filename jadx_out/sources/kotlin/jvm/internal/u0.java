package kotlin.jvm.internal;

import kotlin.reflect.k;
import kotlin.reflect.p;

/* loaded from: classes4.dex */
public abstract class u0 extends a1 implements kotlin.reflect.k {
    public u0() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.j(this);
    }

    @Override // kotlin.reflect.p
    @kotlin.g1(version = "1.1")
    public Object getDelegate() {
        return ((kotlin.reflect.k) getReflected()).getDelegate();
    }

    @Override // v3.a
    public Object invoke() {
        return get();
    }

    @kotlin.g1(version = "1.1")
    public u0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public p.a getGetter() {
        return ((kotlin.reflect.k) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.j
    public k.a getSetter() {
        return ((kotlin.reflect.k) getReflected()).getSetter();
    }

    @kotlin.g1(version = "1.4")
    public u0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
