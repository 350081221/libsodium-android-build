package w;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class b implements i, j {
    public static Collection<Object> c(Class<?> cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException("create instane error, class " + cls.getName());
        }
    }

    @Override // w.j
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(f.b(it.next()));
        }
        return arrayList;
    }

    @Override // w.i, w.j
    public final boolean a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }

    @Override // w.i
    public final Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.a.class)) {
            return null;
        }
        org.json.alipay.a aVar = (org.json.alipay.a) obj;
        Collection<Object> c5 = c(y.a.a(type), type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Does not support the implement for generics.");
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i5 = 0; i5 < aVar.a(); i5++) {
            c5.add(e.a(aVar.a(i5), type2));
        }
        return c5;
    }
}
