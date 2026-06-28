package com.lody.virtual.client.seccomp;

import android.content.pm.ApplicationInfo;
import com.lody.virtual.client.ipc.VPackageManager;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class SeccompWhitelist {
    public static HashSet<String> sSeccompPkg;

    static {
        HashSet<String> hashSet = new HashSet<>();
        sSeccompPkg = hashSet;
        hashSet.add("com.taobao.taobao");
        sSeccompPkg.add("com.taobao.idlefish");
    }

    public static boolean isEnableSeccomp(String str) {
        return sSeccompPkg.contains(str);
    }

    public static boolean isProtectApp(String str) {
        try {
            ApplicationInfo applicationInfo = VPackageManager.get().getApplicationInfo(str, 0, 0);
            if (applicationInfo != null) {
                if (applicationInfo.name.equals("com.stub.StubApp")) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }
}
