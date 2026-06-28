package w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static List<j> f22600a;

    static {
        ArrayList arrayList = new ArrayList();
        f22600a = arrayList;
        arrayList.add(new l());
        f22600a.add(new d());
        f22600a.add(new c());
        f22600a.add(new h());
        f22600a.add(new b());
        f22600a.add(new a());
        f22600a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b5 = b(obj);
        if (y.a.b(b5.getClass())) {
            return org.json.alipay.b.c(b5.toString());
        }
        if (Collection.class.isAssignableFrom(b5.getClass())) {
            return new org.json.alipay.a((Collection) b5).toString();
        }
        if (Map.class.isAssignableFrom(b5.getClass())) {
            return new org.json.alipay.b((Map) b5).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + b5.getClass());
    }

    public static Object b(Object obj) {
        Object a5;
        if (obj == null) {
            return null;
        }
        for (j jVar : f22600a) {
            if (jVar.a(obj.getClass()) && (a5 = jVar.a(obj)) != null) {
                return a5;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
