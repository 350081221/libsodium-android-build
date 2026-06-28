package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public class i1 extends h1 {
    public i1(kotlin.reflect.h hVar, String str, String str2) {
        super(((t) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.r
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @kotlin.g1(version = "1.4")
    public i1(Class cls, String str, String str2, int i5) {
        super(cls, str, str2, i5);
    }
}
