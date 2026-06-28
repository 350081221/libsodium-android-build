package w;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class d implements i, j {
    @Override // w.j
    public final Object a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // w.i, w.j
    public final boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    @Override // w.i
    public final Object b(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }
}
