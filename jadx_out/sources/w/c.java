package w;

import java.lang.reflect.Type;
import java.util.Date;

/* loaded from: classes2.dex */
public final class c implements i, j {
    @Override // w.j
    public final Object a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // w.i, w.j
    public final boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }

    @Override // w.i
    public final Object b(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }
}
