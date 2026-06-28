package w;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k implements i {
    @Override // w.i, w.j
    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }

    @Override // w.i
    public final Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        HashSet hashSet = new HashSet();
        Class cls = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i5 = 0; i5 < aVar.a(); i5++) {
            hashSet.add(e.a(aVar.a(i5), cls));
        }
        return hashSet;
    }
}
