package com.lody.virtual.client.fixer;

import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.text.TextUtils;
import com.lody.virtual.os.VEnvironment;

/* loaded from: classes3.dex */
public class ComponentFixer {
    public static String fixComponentClassName(String str, String str2) {
        if (str2 != null) {
            if (str2.charAt(0) == '.') {
                return str + str2;
            }
            return str2;
        }
        return null;
    }

    public static void fixComponentInfo(ComponentInfo componentInfo) {
        if (componentInfo != null) {
            if (TextUtils.isEmpty(componentInfo.processName)) {
                componentInfo.processName = componentInfo.packageName;
            }
            componentInfo.name = fixComponentClassName(componentInfo.packageName, componentInfo.name);
            if (componentInfo.processName == null) {
                componentInfo.processName = componentInfo.applicationInfo.processName;
            }
        }
    }

    public static void fixOutsideApplicationInfo(ApplicationInfo applicationInfo) {
        if (applicationInfo != null) {
            applicationInfo.uid = VEnvironment.OUTSIDE_APP_UID;
        }
    }

    public static void fixOutsideComponentInfo(ComponentInfo componentInfo) {
        if (componentInfo != null) {
            fixOutsideApplicationInfo(componentInfo.applicationInfo);
        }
    }
}
