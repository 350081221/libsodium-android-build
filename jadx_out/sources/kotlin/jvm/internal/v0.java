package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public class v0 extends u0 {
    public v0(kotlin.reflect.h hVar, String str, String str2) {
        super(q.NO_RECEIVER, ((t) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.p
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @Override // kotlin.reflect.k
    public void set(Object obj) {
        getSetter().call(obj);
    }

    @kotlin.g1(version = "1.4")
    public v0(Class cls, String str, String str2, int i5) {
        super(q.NO_RECEIVER, cls, str, str2, i5);
    }

    @kotlin.g1(version = "1.4")
    public v0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
