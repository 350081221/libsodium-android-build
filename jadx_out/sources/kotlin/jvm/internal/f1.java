package kotlin.jvm.internal;

import kotlin.reflect.q;

/* loaded from: classes4.dex */
public abstract class f1 extends j1 implements kotlin.reflect.q {
    public f1() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.u(this);
    }

    @Override // kotlin.reflect.q
    @kotlin.g1(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.q) getReflected()).getDelegate(obj);
    }

    @Override // v3.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.g1(version = "1.1")
    public f1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public q.a getGetter() {
        return ((kotlin.reflect.q) getReflected()).getGetter();
    }

    @kotlin.g1(version = "1.4")
    public f1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
