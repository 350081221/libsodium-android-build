package w;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static List<i> f22599a;

    static {
        ArrayList arrayList = new ArrayList();
        f22599a = arrayList;
        arrayList.add(new l());
        f22599a.add(new d());
        f22599a.add(new c());
        f22599a.add(new h());
        f22599a.add(new k());
        f22599a.add(new b());
        f22599a.add(new a());
        f22599a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t5;
        for (i iVar : f22599a) {
            if (iVar.a(y.a.a(type)) && (t5 = (T) iVar.b(obj, type)) != null) {
                return t5;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            bVar = new org.json.alipay.a(trim);
        } else {
            if (!trim.startsWith("{") || !trim.endsWith(a1.i.f138d)) {
                return a(trim, type);
            }
            bVar = new org.json.alipay.b(trim);
        }
        return a(bVar, type);
    }
}
