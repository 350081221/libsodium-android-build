package kotlin.jvm.internal;

import kotlin.reflect.m;
import kotlin.reflect.r;

/* loaded from: classes4.dex */
public abstract class y0 extends a1 implements kotlin.reflect.m {
    public y0() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.l(this);
    }

    @Override // kotlin.reflect.r
    @kotlin.g1(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((kotlin.reflect.m) getReflected()).getDelegate(obj, obj2);
    }

    @Override // v3.p
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @kotlin.g1(version = "1.4")
    public y0(Class cls, String str, String str2, int i5) {
        super(q.NO_RECEIVER, cls, str, str2, i5);
    }

    @Override // kotlin.reflect.o
    public r.a getGetter() {
        return ((kotlin.reflect.m) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.j
    public m.a getSetter() {
        return ((kotlin.reflect.m) getReflected()).getSetter();
    }
}
