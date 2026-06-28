package com.tendcloud.tenddata;

import com.tendcloud.tenddata.zz;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bf {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bf f11501a;

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private bf() {
    }

    public static bf a() {
        if (f11501a == null) {
            synchronized (bf.class) {
                if (f11501a == null) {
                    f11501a = new bf();
                }
            }
        }
        return f11501a;
    }

    public final void onTDEBEventAppEvent(zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> hashMap = aVar.paraMap;
                if (hashMap != null && Integer.parseInt(String.valueOf(hashMap.get("apiType"))) == 2) {
                    a aVar2 = (a) aVar.paraMap.get("service");
                    TreeMap treeMap = new TreeMap();
                    String valueOf = String.valueOf(aVar.paraMap.get("eventId"));
                    Object obj = aVar.paraMap.get(t0.b.f22420d);
                    Map<String, Object> map = ab.f11348d;
                    if (map.size() > 0) {
                        treeMap.putAll(map);
                    }
                    Object obj2 = aVar.paraMap.get("map");
                    if (obj2 != null && (obj2 instanceof Map)) {
                        treeMap.putAll((Map) obj2);
                    }
                    bv bvVar = new bv();
                    bvVar.f11569b = "appEvent";
                    bvVar.f11570c = valueOf;
                    bvVar.f11568a = aVar2;
                    TreeMap treeMap2 = new TreeMap();
                    Object obj3 = aVar.paraMap.get("eventLabel");
                    if (obj3 != null) {
                        treeMap2.put("eventLabel", String.valueOf(obj3));
                    }
                    treeMap2.put("eventParam", new JSONObject(a(treeMap)));
                    if (obj instanceof Double) {
                        treeMap2.put(t0.b.f22420d, obj);
                    }
                    Object obj4 = aVar.paraMap.get("eventValue");
                    if (obj4 != null) {
                        treeMap2.put("eventValue", obj4);
                    }
                    bvVar.f11571d = treeMap2;
                    z.a().post(bvVar);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    private Map<String, Object> a(Map<String, Object> map) {
        TreeMap treeMap = new TreeMap();
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return treeMap;
                }
                int i5 = 0;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getValue() instanceof Number) {
                        treeMap.put(entry.getKey(), entry.getValue());
                    } else {
                        treeMap.put(y.a(String.valueOf(entry.getKey())), y.a(String.valueOf(entry.getValue())));
                    }
                    i5++;
                    if (i5 == 50) {
                        break;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return treeMap;
    }
}
