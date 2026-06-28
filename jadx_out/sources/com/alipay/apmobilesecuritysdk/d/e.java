package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f2789a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2790b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    public static String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            String str = (String) arrayList.get(i5);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder();
            if (i5 != 0) {
                str3 = "&";
            }
            sb.append(str3);
            sb.append(str);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(str2);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        Map<String, String> map2;
        synchronized (e.class) {
            if (f2789a == null) {
                c(context, map);
            }
            f2789a.putAll(d.a());
            map2 = f2789a;
        }
        return map2;
    }

    public static synchronized void a() {
        synchronized (e.class) {
            f2789a = null;
        }
    }

    public static synchronized String b(Context context, Map<String, String> map) {
        String a5;
        synchronized (e.class) {
            a(context, map);
            TreeMap treeMap = new TreeMap();
            for (String str : f2790b) {
                if (f2789a.containsKey(str)) {
                    treeMap.put(str, f2789a.get(str));
                }
            }
            a5 = e1.b.a(a(treeMap));
        }
        return a5;
    }

    public static synchronized void c(Context context, Map<String, String> map) {
        synchronized (e.class) {
            TreeMap treeMap = new TreeMap();
            f2789a = treeMap;
            treeMap.putAll(b.a(context, map));
            f2789a.putAll(d.a(context));
            f2789a.putAll(c.a(context));
            f2789a.putAll(a.a(context, map));
        }
    }
}
