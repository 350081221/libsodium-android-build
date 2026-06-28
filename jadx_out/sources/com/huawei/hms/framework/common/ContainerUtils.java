package com.huawei.hms.framework.common;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class ContainerUtils {
    public static final String FIELD_DELIMITER = "&";
    public static final String KEY_VALUE_DELIMITER = "=";

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        boolean z4 = false;
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<K, V> next = it.next();
            if (map2.get(next.getKey()) != next.getValue()) {
                z4 = true;
                break;
            }
        }
        return !z4;
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        return toString(map).hashCode();
    }

    public static <K, V> String toString(Map<K, V> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int i6 = i5 + 1;
            if (i5 > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey().toString());
            sb.append(KEY_VALUE_DELIMITER);
            sb.append(entry.getValue().toString());
            i5 = i6;
        }
        return sb.toString();
    }

    public static <K> String toString(Set<K> set) {
        if (set == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (K k5 : set) {
            int i6 = i5 + 1;
            if (i5 > 0) {
                sb.append("&");
            }
            sb.append(k5.toString());
            i5 = i6;
        }
        return sb.toString();
    }

    public static <K> String toString(List<K> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (K k5 : list) {
            int i6 = i5 + 1;
            if (i5 > 0) {
                sb.append("&");
            }
            sb.append(k5.toString());
            i5 = i6;
        }
        return sb.toString();
    }
}
