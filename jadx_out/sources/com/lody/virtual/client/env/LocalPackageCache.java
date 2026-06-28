package com.lody.virtual.client.env;

import android.content.pm.PackageManager;
import com.lody.virtual.client.core.SettingConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.oem.apps.VAppFix;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class LocalPackageCache {
    private static final Map<String, Boolean> sSystemPackages = new HashMap();

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    public static void init() {
        /*
            com.lody.virtual.client.core.VirtualCore r0 = com.lody.virtual.client.core.VirtualCore.get()
            com.lody.virtual.client.env.HostPackageManager r0 = r0.getHostPackageManager()
            int r1 = com.lody.virtual.os.VEnvironment.SYSTEM_UID
            java.lang.String[] r0 = r0.getPackagesForUid(r1)
            if (r0 == 0) goto L2c
            int r1 = r0.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L2c
            r3 = r0[r2]
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = com.lody.virtual.client.env.LocalPackageCache.sSystemPackages
            com.lody.virtual.client.core.VirtualCore r5 = com.lody.virtual.client.core.VirtualCore.get()
            boolean r5 = r5.isAppInstalled(r3)
            r5 = r5 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.put(r3, r5)
            int r2 = r2 + 1
            goto L12
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.env.LocalPackageCache.init():void");
    }

    public static boolean isOutsideVisiblePackage(String str) {
        if (str == null || VAppFix.isForceInVisiblePackageForVApp(str)) {
            return false;
        }
        SettingConfig config = VirtualCore.getConfig();
        if (!str.equals(config.getMainPackageName()) && !str.equals(config.getExtPackageName()) && !config.isOutsidePackage(str) && !isSystemPackage(str)) {
            return false;
        }
        return true;
    }

    public static boolean isSystemPackage(String str) {
        boolean booleanValue;
        Map<String, Boolean> map = sSystemPackages;
        synchronized (map) {
            Boolean bool = map.get(str);
            if (bool == null) {
                try {
                    if (VirtualCore.get().isAppInstalled(str)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.valueOf(ComponentUtils.isSystemApp(VirtualCore.get().getHostPackageManager().getApplicationInfo(str, 0L)));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                sSystemPackages.put(str, bool);
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }
}
