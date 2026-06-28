package com.lody.virtual.oem.apps;

import android.app.Application;
import android.content.pm.ActivityInfo;
import android.text.TextUtils;
import com.lody.virtual.client.VClient;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class WeChat {
    private static final String PKG_MM = "com.tencent.mm";
    private static HashSet<String> sBinderMapClsNameSet;

    static {
        HashSet<String> hashSet = new HashSet<>();
        sBinderMapClsNameSet = hashSet;
        hashSet.add("com.tencent.mm.sensitive.l");
        sBinderMapClsNameSet.add("com.tencent.mm.sensitive.m");
        sBinderMapClsNameSet.add("d3z.x");
    }

    private static void cleanMap(String str, Application application) {
        try {
            for (Field field : Class.forName(str, true, application.getClassLoader()).getDeclaredFields()) {
                field.setAccessible(true);
                if (HashMap.class.isAssignableFrom(field.getType())) {
                    HashMap hashMap = (HashMap) field.get(null);
                    if (hashMap.get("package") != null && hashMap.get("device_identifiers") != null && hashMap.get("iphonesubinfo") != null) {
                        hashMap.clear();
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void disableBinderHook(String str, Application application) {
        if ("com.tencent.mm".equals(str)) {
            Iterator<String> it = sBinderMapClsNameSet.iterator();
            while (it.hasNext()) {
                cleanMap(it.next(), application);
            }
        }
    }

    public static boolean preventStartActivity(ActivityInfo activityInfo) {
        if (VClient.get().getCurrentPackage().equals("com.tencent.mm") && activityInfo != null && !TextUtils.isEmpty(activityInfo.name) && activityInfo.name.equals("com.tencent.mm.ui.EmptyActivity")) {
            return true;
        }
        return false;
    }
}
