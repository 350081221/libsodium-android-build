package com.lody.virtual.server.pm;

import android.util.ArrayMap;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import com.lody.virtual.server.pm.parser.VPackage;

/* loaded from: classes3.dex */
public class PackageCacheManager {
    static final ArrayMap<String, VPackage> PACKAGE_CACHE = new ArrayMap<>();

    public static boolean contain(String str) {
        boolean containsKey;
        ArrayMap<String, VPackage> arrayMap = PACKAGE_CACHE;
        synchronized (arrayMap) {
            containsKey = arrayMap.containsKey(str);
        }
        return containsKey;
    }

    public static VPackage get(String str) {
        VPackage vPackage;
        ArrayMap<String, VPackage> arrayMap = PACKAGE_CACHE;
        synchronized (arrayMap) {
            vPackage = arrayMap.get(str);
        }
        return vPackage;
    }

    public static PackageSetting getSetting(String str) {
        ArrayMap<String, VPackage> arrayMap = PACKAGE_CACHE;
        synchronized (arrayMap) {
            VPackage vPackage = arrayMap.get(str);
            if (vPackage != null) {
                return (PackageSetting) vPackage.mExtras;
            }
            return null;
        }
    }

    public static PackageSetting getSettingLocked(String str) {
        VPackage vPackage = PACKAGE_CACHE.get(str);
        if (vPackage != null) {
            return (PackageSetting) vPackage.mExtras;
        }
        return null;
    }

    public static void put(VPackage vPackage, PackageSetting packageSetting) {
        ArrayMap<String, VPackage> arrayMap = PACKAGE_CACHE;
        synchronized (arrayMap) {
            VPackage remove = arrayMap.remove(vPackage.packageName);
            if (remove != null) {
                VPackageManagerService.get().deletePackageLocked(remove);
            }
            PackageParserEx.initApplicationInfoBase(packageSetting, vPackage);
            arrayMap.put(vPackage.packageName, vPackage);
            vPackage.mExtras = packageSetting;
            VPackageManagerService.get().analyzePackageLocked(vPackage);
        }
    }

    public static VPackage remove(String str) {
        VPackage remove;
        ArrayMap<String, VPackage> arrayMap = PACKAGE_CACHE;
        synchronized (arrayMap) {
            remove = arrayMap.remove(str);
            if (remove != null) {
                VPackageManagerService.get().deletePackageLocked(remove);
            }
        }
        return remove;
    }

    public static int size() {
        int size;
        ArrayMap<String, VPackage> arrayMap = PACKAGE_CACHE;
        synchronized (arrayMap) {
            size = arrayMap.size();
        }
        return size;
    }
}
