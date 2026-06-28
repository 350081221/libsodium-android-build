package com.lody.virtual.client.env;

import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.VLog;
import java.util.HashMap;
import java.util.Map;
import mirror.android.ddm.DdmHandleAppNameJBMR1;
import mirror.dalvik.system.VMRuntime;

/* loaded from: classes3.dex */
public class VirtualRuntime {
    private static final Map<String, String> ABI_TO_INSTRUCTION_SET_MAP;
    private static String sInitialPackageName;
    private static String sProcessName;
    private static final Handler sUIHandler = new Handler(Looper.getMainLooper());

    static {
        HashMap hashMap = new HashMap(16);
        ABI_TO_INSTRUCTION_SET_MAP = hashMap;
        hashMap.put("armeabi", "arm");
        hashMap.put("armeabi-v7a", "arm");
        hashMap.put("mips", "mips");
        hashMap.put("mips64", "mips64");
        hashMap.put("x86", "x86");
        hashMap.put("x86_64", "x86_64");
        hashMap.put("arm64-v8a", "arm64");
    }

    public static String adjustLibName(String str) {
        if (!VirtualCore.get().isMainPackage()) {
            return str + "_ext";
        }
        return str;
    }

    public static <T> T crash(Throwable th) throws RuntimeException {
        th.printStackTrace();
        throw new RuntimeException("transact remote server failed", th);
    }

    public static void exit() {
        VLog.d(VirtualRuntime.class.getSimpleName(), "Exit process : %s (%s).", getProcessName(), VirtualCore.get().getProcessName());
        Process.killProcess(Process.myPid());
    }

    public static String getCurrentInstructionSet() {
        return VMRuntime.getCurrentInstructionSet.call(new Object[0]);
    }

    public static String getInitialPackageName() {
        return sInitialPackageName;
    }

    public static String getInstructionSet(String str) {
        String str2 = ABI_TO_INSTRUCTION_SET_MAP.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException("Unsupported ABI: " + str);
    }

    public static String getProcessName() {
        return sProcessName;
    }

    public static Handler getUIHandler() {
        return sUIHandler;
    }

    public static boolean is64bit() {
        return Process.is64Bit();
    }

    public static boolean isArt() {
        return System.getProperty("java.vm.version").startsWith("2");
    }

    public static void setupRuntime(String str, ApplicationInfo applicationInfo) {
        if (sProcessName != null) {
            return;
        }
        sInitialPackageName = applicationInfo.packageName;
        sProcessName = str;
        mirror.android.os.Process.setArgV0.call(str);
        DdmHandleAppNameJBMR1.setAppName.call(str, 0);
    }
}
