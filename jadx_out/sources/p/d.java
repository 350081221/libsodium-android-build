package p;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, a> f22253a = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f22254a;

        /* renamed from: b, reason: collision with root package name */
        public long f22255b;

        /* renamed from: c, reason: collision with root package name */
        public long f22256c;
    }

    public static String a(String str) {
        a aVar;
        String str2;
        Map<String, a> map = f22253a;
        if (map == null || (aVar = map.get(str)) == null) {
            return null;
        }
        if ((System.currentTimeMillis() - aVar.f22255b < aVar.f22256c) && (str2 = aVar.f22254a) != null) {
            return str2;
        }
        map.remove(str);
        return null;
    }

    public static void b(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Map<String, a> map = f22253a;
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f22254a = str2;
        aVar.f22256c = 86400000L;
        aVar.f22255b = System.currentTimeMillis();
        map.put(str, aVar);
    }
}
