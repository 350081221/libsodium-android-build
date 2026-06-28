package w;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a implements i, j {
    @Override // w.j
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(f.b(obj2));
        }
        return arrayList;
    }

    @Override // w.i, w.j
    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }

    @Override // w.i
    public final Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int a5 = aVar.a();
        Object newInstance = Array.newInstance(componentType, a5);
        for (int i5 = 0; i5 < a5; i5++) {
            Array.set(newInstance, i5, e.a(aVar.a(i5), componentType));
        }
        return newInstance;
    }
}
