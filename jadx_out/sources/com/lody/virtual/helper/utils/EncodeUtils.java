package com.lody.virtual.helper.utils;

import android.util.Base64;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class EncodeUtils {
    private static final Map<String, String> sStringPool = new HashMap();

    public static String decodeBase64(String str) {
        String str2;
        Map<String, String> map = sStringPool;
        synchronized (map) {
            if (!map.containsKey(str)) {
                str2 = new String(Base64.decode(str, 0));
                map.put(str, str2);
            } else {
                str2 = map.get(str);
            }
        }
        return str2;
    }
}
