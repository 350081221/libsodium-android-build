package kotlin.jvm.internal;

import kotlin.reflect.l;
import kotlin.reflect.q;

/* loaded from: classes4.dex */
public abstract class w0 extends a1 implements kotlin.reflect.l {
    public w0() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.k(this);
    }

    @Override // kotlin.reflect.q
    @kotlin.g1(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.l) getReflected()).getDelegate(obj);
    }

    @Override // v3.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.g1(version = "1.1")
    public w0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public q.a getGetter() {
        return ((kotlin.reflect.l) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.j
    public l.a getSetter() {
        return ((kotlin.reflect.l) getReflected()).getSetter();
    }

    @kotlin.g1(version = "1.4")
    public w0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
