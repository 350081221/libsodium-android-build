package com.lody.virtual.helper.compat;

import android.text.TextUtils;
import com.lody.virtual.helper.utils.Reflect;

/* loaded from: classes3.dex */
public class SystemPropertiesCompat {
    public static String get(String str, String str2) {
        try {
            return (String) Reflect.on("android.os.SystemProperties").call("get", str, str2).get();
        } catch (Exception e5) {
            e5.printStackTrace();
            return str2;
        }
    }

    public static int getInt(String str, int i5) {
        try {
            return ((Integer) Reflect.on("android.os.SystemProperties").call("getInt", str, Integer.valueOf(i5)).get()).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return i5;
        }
    }

    public static boolean isExist(String str) {
        return !TextUtils.isEmpty(get(str));
    }

    public static String get(String str) {
        try {
            return (String) Reflect.on("android.os.SystemProperties").call("get", str).get();
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
