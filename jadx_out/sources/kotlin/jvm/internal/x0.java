package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public class x0 extends w0 {
    public x0(kotlin.reflect.h hVar, String str, String str2) {
        super(q.NO_RECEIVER, ((t) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    @kotlin.g1(version = "1.4")
    public x0(Class cls, String str, String str2, int i5) {
        super(q.NO_RECEIVER, cls, str, str2, i5);
    }

    @kotlin.g1(version = "1.4")
    public x0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
