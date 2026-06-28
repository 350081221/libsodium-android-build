package com.lody.virtual.client;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.lody.virtual.client.core.SettingConfig;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.hiddenapibypass.HiddenApiBypass;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.natives.NativeMethods;
import com.lody.virtual.client.seccomp.NativeEngineSeccomp;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.InstalledAppInfo;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class NativeEngine {
    private static boolean EnablePidInfoCache = false;
    private static final String LIB_NAME = "v++";
    private static int MaxCachePidInfoTime = 0;
    private static int MaxCachePidInfoZise = 0;
    private static final List<Pair<String, String>> REDIRECT_LISTS;
    private static final String TAG = "NativeEngine";
    public static Field artMethodField;
    private static HashMap<Integer, PidCacheInfo> pidCache;
    private static final List<DexOverride> sDexOverrides = new ArrayList();
    private static boolean sFlag = false;
    private static boolean sEnabled = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class PidCacheInfo {
        long lastTime;
        int pid;
        int uid;

        public PidCacheInfo(int i5, int i6, long j5) {
            this.pid = i5;
            this.uid = i6;
            this.lastTime = j5;
        }

        public String toString() {
            return "PidCacheInfo{pid=" + this.pid + ", uid=" + this.uid + ", lastTime=" + this.lastTime + '}';
        }
    }

    static {
        try {
            System.loadLibrary(VirtualRuntime.adjustLibName(LIB_NAME));
        } catch (Throwable th) {
            VLog.e(VLog.TAG_DEFAULT, VLog.getStackTraceString(th));
        }
        REDIRECT_LISTS = new LinkedList();
        EnablePidInfoCache = true;
        pidCache = new HashMap<>();
        MaxCachePidInfoTime = 10000;
        MaxCachePidInfoZise = 64;
    }

    public static void addDexOverride(DexOverride dexOverride) {
        sDexOverrides.add(dexOverride);
    }

    public static void bypassHiddenAPIEnforcementPolicyIfNeeded() {
        if (BuildCompat.isR()) {
            HiddenApiBypass.setHiddenApiExemptions("L");
            return;
        }
        if (BuildCompat.isPie()) {
            try {
                Class cls = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                ((Method) declaredMethod.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(((Method) declaredMethod.invoke(cls, "getRuntime", new Class[0])).invoke(null, new Object[0]), new String[]{"L"});
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void enableIORedirect(InstalledAppInfo installedAppInfo) {
        if (sEnabled) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = VirtualCore.get().getHostPackageManager().getApplicationInfo(VirtualCore.getConfig().getMainPackageName(), 0L);
            List<Pair<String, String>> list = REDIRECT_LISTS;
            Collections.sort(list, new Comparator<Pair<String, String>>() { // from class: com.lody.virtual.client.NativeEngine.1
                @Override // java.util.Comparator
                public int compare(Pair<String, String> pair, Pair<String, String> pair2) {
                    return compare(((String) pair2.first).length(), ((String) pair.first).length());
                }

                private int compare(int i5, int i6) {
                    return Integer.compare(i5, i6);
                }
            });
            for (Pair<String, String> pair : list) {
                try {
                    nativeIORedirect((String) pair.first, (String) pair.second);
                } catch (Throwable th) {
                    VLog.e(TAG, VLog.getStackTraceString(th));
                }
            }
            try {
                nativeEnableIORedirect(new File(applicationInfo.nativeLibraryDir, "libv++_ext.so").getAbsolutePath(), new File(applicationInfo.nativeLibraryDir, "libv++.so").getAbsolutePath(), VEnvironment.getNativeCacheDir(VirtualCore.get().isExtPackage()).getPath(), Build.VERSION.SDK_INT, installedAppInfo.packageName, VirtualCore.get().getHostPkg());
            } catch (Throwable th2) {
                VLog.e(TAG, VLog.getStackTraceString(th2));
            }
            sEnabled = true;
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    private static DexOverride findDexOverride(String str) {
        for (DexOverride dexOverride : sDexOverrides) {
            if (dexOverride.originDexPath.equals(str)) {
                return dexOverride;
            }
        }
        return null;
    }

    public static void forbid(String str, boolean z4) {
        if (!z4 && !str.endsWith("/")) {
            str = str + "/";
        }
        try {
            nativeIOForbid(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
        }
    }

    public static long getArtMethod(Member member) {
        if (artMethodField == null) {
            try {
                artMethodField = getField(Method.class, "artMethod");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = artMethodField;
        if (field == null) {
            return 0L;
        }
        try {
            return ((Long) field.get(member)).longValue();
        } catch (IllegalAccessException unused2) {
            return 0L;
        }
    }

    private static String getCanonicalPath(String str) {
        File file = new File(str);
        try {
            return file.getCanonicalPath();
        } catch (IOException e5) {
            e5.printStackTrace();
            return file.getAbsolutePath();
        }
    }

    private static Field getField(Class cls, String str) throws NoSuchFieldException {
        while (cls != null && cls != Object.class) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException(str);
    }

    public static String getRedirectedPath(String str) {
        try {
            return nativeGetRedirectedPath(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
            return str;
        }
    }

    public static void launchEngine(String str) {
        int i5;
        if (sFlag) {
            return;
        }
        Object[] objArr = {NativeMethods.gNativeMask, NativeMethods.gOpenDexFileNative, NativeMethods.gCameraNativeSetup, NativeMethods.gAudioRecordNativeCheckPermission, NativeMethods.gMediaRecorderNativeSetup, NativeMethods.gAudioRecordNativeSetup, NativeMethods.gNativeLoad};
        try {
            String hostPkg = VirtualCore.get().getHostPkg();
            boolean isArt = VirtualRuntime.isArt();
            if (BuildCompat.isR()) {
                i5 = 30;
            } else {
                i5 = Build.VERSION.SDK_INT;
            }
            nativeLaunchEngine(objArr, hostPkg, str, isArt, i5, NativeMethods.gCameraMethodType, NativeMethods.gAudioRecordMethodType);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
        }
        sFlag = true;
    }

    private static native void nativeEnableIORedirect(String str, String str2, String str3, int i5, String str4, String str5);

    private static native String nativeGetRedirectedPath(String str);

    private static native void nativeIOForbid(String str);

    private static native void nativeIOReadOnly(String str);

    private static native void nativeIORedirect(String str, String str2);

    private static native void nativeIOWhitelist(String str);

    private static native void nativeLaunchEngine(Object[] objArr, String str, String str2, boolean z4, int i5, int i6, int i7);

    private static native void nativeMark();

    private static native String nativeReverseRedirectedPath(String str);

    public static int onGetCallingUid(int i5) {
        try {
            return onGetCallingUid0(i5);
        } catch (Throwable th) {
            VLog.e(VLog.TAG_DEFAULT, th);
            return i5;
        }
    }

    private static int onGetCallingUid0(int i5) {
        int callingPid = Binder.getCallingPid();
        if (VClient.get().getClientConfig() == null) {
            return i5;
        }
        if (i5 != VirtualCore.get().myUid() && i5 != VirtualCore.get().remoteUid()) {
            return i5;
        }
        if (callingPid == 0) {
            if (BuildCompat.isS()) {
                return VClient.get().getBaseVUid();
            }
            return VEnvironment.UNKNOWN_APP_UID;
        }
        if (callingPid == VirtualCore.get().myPid()) {
            return VClient.get().getBaseVUid();
        }
        if (callingPid == VClient.get().getCorePid()) {
            return VEnvironment.SYSTEM_UID;
        }
        if (EnablePidInfoCache) {
            long currentTimeMillis = System.currentTimeMillis();
            PidCacheInfo pidCacheInfo = pidCache.get(Integer.valueOf(callingPid));
            if (pidCacheInfo != null) {
                if (currentTimeMillis - pidCacheInfo.lastTime > MaxCachePidInfoTime) {
                    pidCache.remove(Integer.valueOf(callingPid));
                } else {
                    int i6 = pidCacheInfo.uid;
                    if (i6 == -1) {
                        return i5;
                    }
                    pidCacheInfo.lastTime = currentTimeMillis;
                    return i6;
                }
            }
            pidCache.put(Integer.valueOf(callingPid), new PidCacheInfo(callingPid, -1, currentTimeMillis));
        }
        int uidByPid = VActivityManager.get().getUidByPid(callingPid);
        if (uidByPid == VEnvironment.OUTSIDE_APP_UID) {
            uidByPid = VEnvironment.SYSTEM_UID;
        }
        if (EnablePidInfoCache) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (pidCache.size() >= MaxCachePidInfoZise) {
                Iterator<Map.Entry<Integer, PidCacheInfo>> it = pidCache.entrySet().iterator();
                while (it.hasNext()) {
                    if (currentTimeMillis2 - it.next().getValue().lastTime > MaxCachePidInfoTime) {
                        it.remove();
                    }
                }
            }
            pidCache.put(Integer.valueOf(callingPid), new PidCacheInfo(callingPid, uidByPid, currentTimeMillis2));
        }
        return uidByPid;
    }

    public static int onGetUid(int i5) {
        if (VClient.get().getClientConfig() == null) {
            return i5;
        }
        return VClient.get().getBaseVUid();
    }

    public static boolean onKillProcess(int i5, int i6) {
        String str = TAG;
        VLog.e(str, "killProcess: pid = %d, signal = %d.", Integer.valueOf(i5), Integer.valueOf(i6));
        if (i5 == VirtualCore.get().myPid()) {
            VLog.e(str, VLog.getStackTraceString(new Throwable()));
        }
        return true;
    }

    public static void onOpenDexFileNative(String[] strArr) {
        DexOverride findDexOverride;
        String str = strArr[0];
        if (str != null && (findDexOverride = findDexOverride(getCanonicalPath(str))) != null) {
            VLog.e(TAG, "override: " + findDexOverride.newOdexPath);
            String str2 = findDexOverride.newDexPath;
            if (str2 != null) {
                strArr[0] = str2;
            }
            if (findDexOverride.originOdexPath != null) {
                if (getCanonicalPath(str2).equals(findDexOverride.originOdexPath)) {
                    strArr[1] = findDexOverride.newOdexPath;
                }
            } else {
                strArr[1] = findDexOverride.newOdexPath;
            }
        }
        VLog.i(TAG, "OpenDexFileNative(\"%s\", \"%s\")", strArr[0], strArr[1]);
    }

    public static String pathCat(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !str.endsWith("/")) {
            str = str + "/";
        }
        return str + str2;
    }

    public static void readOnly(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        try {
            nativeIOReadOnly(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
        }
    }

    public static void readOnlyFile(String str) {
        try {
            nativeIOReadOnly(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
        }
    }

    public static void redirectDirectory(String str, String str2) {
        VirtualCore.getConfig();
        if (SettingConfig.isEnableSeccomp(VClient.get().getCurrentPackage())) {
            NativeEngineSeccomp.redirectDirectory(str, str2);
        }
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        REDIRECT_LISTS.add(new Pair<>(str, str2));
    }

    public static void redirectFile(String str, String str2) {
        VirtualCore.getConfig();
        if (SettingConfig.isEnableSeccomp(VClient.get().getCurrentPackage())) {
            NativeEngineSeccomp.redirectFile(str, str2);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        REDIRECT_LISTS.add(new Pair<>(str, str2));
    }

    public static String reverseRedirectedPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("/" + VirtualCore.get().getHostPkg() + "/")) {
            return str;
        }
        VirtualCore.getConfig();
        if (SettingConfig.isEnableSeccomp(VClient.get().getCurrentPackage())) {
            return NativeEngineSeccomp.reverseRedirectedPath(str);
        }
        try {
            return nativeReverseRedirectedPath(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
            return str;
        }
    }

    public static void startDexOverride() {
        for (InstalledAppInfo installedAppInfo : VirtualCore.get().getInstalledApps(0)) {
            if (!installedAppInfo.dynamic) {
                addDexOverride(new DexOverride(getCanonicalPath(installedAppInfo.getApkPath()), null, null, installedAppInfo.getOatPath()));
            }
        }
    }

    public static void whitelist(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        try {
            nativeIOWhitelist(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
        }
    }

    public static void whitelistFile(String str) {
        try {
            nativeIOWhitelist(str);
        } catch (Throwable th) {
            VLog.e(TAG, VLog.getStackTraceString(th));
        }
    }
}
