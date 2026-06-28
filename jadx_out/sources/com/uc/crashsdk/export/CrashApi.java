package com.uc.crashsdk.export;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.ValueCallback;
import com.uc.crashsdk.JNIBridge;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.d;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.b;
import com.uc.crashsdk.e;
import com.uc.crashsdk.g;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class CrashApi {

    /* renamed from: a, reason: collision with root package name */
    private static CrashApi f12022a = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f12023c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f12024d = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12025b;

    private CrashApi(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z4, boolean z5, boolean z6) {
        this.f12025b = false;
        Context a5 = a(context);
        b(a5);
        b.f11955g = z5;
        b.f11956h = z6;
        if (b.L()) {
            b(a5);
            a(a5, customInfo, versionInfo, iCrashClient);
            if (z4) {
                a();
            }
            if (b.f11955g && e.e("libcrashsdk.so")) {
                b.f11954f = true;
                b();
                return;
            }
            return;
        }
        if (customInfo != null && versionInfo != null) {
            g.a(customInfo);
            try {
                a(a5, customInfo, versionInfo, iCrashClient);
            } catch (Throwable th) {
                a(th);
            }
            if (z4) {
                try {
                    a();
                } catch (Throwable th2) {
                    a(th2);
                }
            }
            try {
                b.M();
                h.a();
                d.a();
                com.uc.crashsdk.a.g.j();
            } catch (Throwable th3) {
                com.uc.crashsdk.a.g.a(th3);
            }
            try {
                if (!b.a(a5)) {
                    a.d("crashsdk", "registerLifecycleCallbacks failed!");
                }
            } catch (Throwable th4) {
                com.uc.crashsdk.a.g.a(th4);
            }
            try {
                com.uc.crashsdk.a.n();
                try {
                    e.A();
                } catch (Throwable th5) {
                    com.uc.crashsdk.a.g.b(th5);
                }
                e.B();
            } catch (Throwable th6) {
                com.uc.crashsdk.a.g.a(th6);
            }
            try {
                if (g.r() && b.F() && !this.f12025b) {
                    e.G();
                    this.f12025b = true;
                    return;
                }
                return;
            } catch (Throwable th7) {
                com.uc.crashsdk.a.g.b(th7);
                return;
            }
        }
        a.d("crashsdk", "VersionInfo and CustomInfo can not be null!");
        throw null;
    }

    private static void a() {
        if (b.f11949a) {
            a.b("Has enabled java log!");
            return;
        }
        e.s();
        e.o();
        b.f11949a = true;
    }

    private static void b() {
        synchronized (b.f11953e) {
            if (b.f11955g && b.f11954f) {
                if (b.f11950b) {
                    a.b("Has enabled native log!");
                    return;
                }
                c();
                e.D();
                b.f11950b = true;
                JNIBridge.cmd(6);
                g.d();
            }
        }
    }

    private static void c() {
        if (b.f11952d) {
            return;
        }
        g.b();
        JNIBridge.cmd(5);
        g.c();
        b.f11952d = true;
    }

    public static synchronized CrashApi createInstance(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient, boolean z4, boolean z5, boolean z6) {
        CrashApi crashApi;
        synchronized (CrashApi.class) {
            if (f12022a == null) {
                f12022a = new CrashApi(context, customInfo, versionInfo, iCrashClient, z4, z5, z6);
            }
            crashApi = f12022a;
        }
        return crashApi;
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z4) {
        return createInstanceEx(context, str, z4, null);
    }

    public static CrashApi getInstance() {
        return f12022a;
    }

    public int addCachedInfo(String str, String str2) {
        if (str != null && str2 != null) {
            return com.uc.crashsdk.a.b(str, str2);
        }
        throw null;
    }

    public int addDumpFile(DumpFileInfo dumpFileInfo) {
        String str;
        dumpFileInfo.getClass();
        String str2 = dumpFileInfo.mCategory;
        if (str2 != null && (str = dumpFileInfo.mFileTobeDump) != null) {
            int i5 = dumpFileInfo.mLogType;
            if ((1048849 & i5) == 0) {
                return 0;
            }
            return com.uc.crashsdk.a.a(str2, str, dumpFileInfo.mIsEncrypted, dumpFileInfo.mWriteCategory, i5, dumpFileInfo.mDeleteAfterDump);
        }
        throw null;
    }

    public void addHeaderInfo(String str, String str2) {
        str.getClass();
        com.uc.crashsdk.a.a(str, str2);
    }

    public boolean addStatInfo(String str, String str2) {
        if (a("addStatInfo")) {
            return false;
        }
        if (!com.uc.crashsdk.a.g.a(str)) {
            if (str.length() <= 24) {
                if (str2 != null && str2.length() > 512) {
                    str2 = str2.substring(0, 512);
                }
                return h.a(str, str2);
            }
            throw new IllegalArgumentException("key is too long!");
        }
        throw null;
    }

    public void crashSoLoaded() {
        if (a("crashSoLoaded")) {
            return;
        }
        b.f11954f = true;
        b();
        synchronized (b.f11953e) {
            if (b.f11956h && b.f11954f && !b.f11951c) {
                if (!b.f11952d) {
                    c();
                    g.d();
                }
                e.x();
                b.f11951c = true;
            }
        }
        com.uc.crashsdk.a.n();
        e.m();
    }

    public int createCachedInfo(String str, int i5, int i6) {
        str.getClass();
        if (i5 > 0) {
            if ((1048849 & i6) == 0) {
                return 0;
            }
            return com.uc.crashsdk.a.a(str, i5, i6);
        }
        throw new IllegalArgumentException("capacity must > 0!");
    }

    public void disableLog(int i5) {
        synchronized (b.f11953e) {
            b.b(i5);
            if (LogType.isForJava(i5) && b.f11949a) {
                e.t();
                b.f11949a = false;
            }
            if (LogType.isForNative(i5)) {
                if (b.f11950b) {
                    JNIBridge.cmd(9);
                    b.f11950b = false;
                } else {
                    b.f11955g = false;
                }
            }
            if (LogType.isForANR(i5)) {
                b.a(false);
            }
            if (LogType.isForUnexp(i5)) {
                if (b.f11951c) {
                    if (e.z()) {
                        b.f11951c = false;
                    }
                } else {
                    b.f11956h = false;
                }
            }
        }
    }

    public boolean generateCustomLog(CustomLogInfo customLogInfo) {
        String str;
        StringBuilder sb;
        customLogInfo.getClass();
        if (customLogInfo.mData != null && (str = customLogInfo.mLogType) != null) {
            if (!str.contains("_") && !customLogInfo.mLogType.contains(" ")) {
                ArrayList<Integer> arrayList = customLogInfo.mDumpTids;
                if (arrayList == null || arrayList.size() <= 0) {
                    sb = null;
                } else {
                    sb = new StringBuilder();
                    Iterator<Integer> it = customLogInfo.mDumpTids.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next().intValue());
                        sb.append(" ");
                    }
                }
                long j5 = customLogInfo.mAddHeader ? 1L : 0L;
                if (customLogInfo.mAddFooter) {
                    j5 |= 2;
                }
                if (customLogInfo.mAddLogcat) {
                    j5 |= 4;
                }
                if (customLogInfo.mAddThreadsDump) {
                    j5 |= 8;
                }
                if (customLogInfo.mAddBuildId) {
                    j5 |= 16;
                }
                if (customLogInfo.mUploadNow) {
                    j5 |= 32;
                }
                return e.a(customLogInfo.mData, customLogInfo.mLogType, j5, customLogInfo.mDumpFiles, customLogInfo.mCallbacks, customLogInfo.mCachedInfos, sb != null ? sb.toString() : null);
            }
            throw new IllegalArgumentException("mLogType can not contain char '_' and ' '");
        }
        throw new NullPointerException("mData or mLogType is null!");
    }

    public boolean generateTraces(String str, long j5) {
        if (a("generateTraces")) {
            return false;
        }
        if (!b.f11952d) {
            a.d("crashsdk", "Crash so is not loaded!");
            return false;
        }
        if (JNIBridge.nativeCmd(12, j5, str, null) != 1) {
            return false;
        }
        return true;
    }

    public String getCrashLogUploadUrl() {
        if (a("getCrashLogUploadUrl")) {
            return null;
        }
        return e.k();
    }

    public ParcelFileDescriptor getHostFd() {
        return e.E();
    }

    public ParcelFileDescriptor getIsolatedHostFd() {
        return e.E();
    }

    public int getLastExitType() {
        if (a("getLastExitType")) {
            return 1;
        }
        return b.I();
    }

    public int getLastExitTypeEx() {
        if (a("getLastExitTypeEx")) {
            return 1;
        }
        return b.J();
    }

    public Throwable getUncaughtException() {
        return e.v();
    }

    public int getUnexpReason() {
        if (a("getUnexpReason")) {
            return 100;
        }
        return e.w();
    }

    public void onExit() {
        b.w();
    }

    public boolean registerCallback(int i5, ValueCallback<Bundle> valueCallback) {
        valueCallback.getClass();
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        return com.uc.crashsdk.d.b(valueCallback);
                    }
                    throw new IllegalArgumentException("Unknown event type: " + i5);
                }
                return com.uc.crashsdk.d.d(valueCallback);
            }
            return com.uc.crashsdk.d.c(valueCallback);
        }
        return com.uc.crashsdk.d.a(valueCallback);
    }

    public int registerInfoCallback(String str, int i5) {
        str.getClass();
        if ((1048849 & i5) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str, i5, null, 0L, 0);
    }

    public int registerThread(int i5, String str) {
        return com.uc.crashsdk.a.a(i5, str);
    }

    public int reportCrashStats(boolean z4) {
        if (a("reportCrashStats")) {
            return 0;
        }
        if (g.O()) {
            a.a("CrashApi::reportCrashStats. currentProcessOnly: " + z4);
        }
        e.d(z4);
        return e.e(z4);
    }

    public int resetCrashStats(boolean z4) {
        if (a("resetCrashStats")) {
            return 0;
        }
        if (g.O()) {
            a.a("CrashApi::resetCrashStats. currentProcessOnly: " + z4);
        }
        return e.f(z4);
    }

    public void setForeground(boolean z4) {
        b.b(z4);
    }

    public boolean setHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public boolean setIsolatedHostFd(ParcelFileDescriptor parcelFileDescriptor) {
        return e.a(parcelFileDescriptor);
    }

    public void setNewInstall() {
        if (a("setNewInstall")) {
            return;
        }
        b.v();
    }

    public int updateCustomInfo(CustomInfo customInfo) {
        customInfo.getClass();
        return g.b(customInfo);
    }

    public boolean updateUnexpInfo() {
        if (a("updateUnexpInfo")) {
            return false;
        }
        return com.uc.crashsdk.a.a(true);
    }

    public void updateVersionInfo(VersionInfo versionInfo) {
        versionInfo.getClass();
        g.a(versionInfo);
    }

    public void uploadCrashLogs() {
        if (a("uploadCrashLogs")) {
            return;
        }
        e.a(false, true);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z4, Bundle bundle) {
        return createInstanceEx(context, str, z4, bundle, null);
    }

    public static CrashApi createInstanceEx(Context context, String str, boolean z4, Bundle bundle, ICrashClient iCrashClient) {
        CrashApi crashApi = f12022a;
        if (crashApi != null) {
            return crashApi;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        f12023c = bundle.getBoolean("useApplicationContext", true);
        Context a5 = a(context);
        b(a5);
        CustomInfo customInfo = new CustomInfo(str);
        customInfo.mEnableStatReport = false;
        customInfo.mZipLog = true;
        customInfo.mPrintStackInfos = z4;
        bundle.putString("crver", "2.0");
        CustomInfo a6 = g.a(customInfo, bundle);
        VersionInfo a7 = g.a(bundle);
        boolean z5 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_JAVA, true);
        boolean z6 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_NATIVE, true);
        boolean z7 = bundle.getBoolean(UMCrash.KEY_ENABLE_CRASH_UNEXP, b.F());
        boolean z8 = bundle.getBoolean(UMCrash.KEY_ENABLE_ANR, true);
        CrashApi createInstance = createInstance(a5, a6, a7, iCrashClient, z5, z6, z7);
        createInstance.disableLog(805306368);
        b.a(z8);
        if (z6 || z7) {
            if (e.e("libcrashsdk.so")) {
                createInstance.crashSoLoaded();
            } else {
                a.d("crashsdk", "load libcrashsdk.so failed!");
            }
        }
        int i5 = bundle.getInt("uploadLogDelaySeconds", 15);
        if (i5 >= 0 && b.F()) {
            e.b(i5);
        }
        return createInstance;
    }

    public int registerInfoCallback(String str, int i5, Callable<String> callable) {
        if (str == null || callable == null) {
            throw null;
        }
        if ((1048849 & i5) == 0) {
            return 0;
        }
        return com.uc.crashsdk.a.a(str, i5, callable, 0L, 0);
    }

    public int updateCustomInfo(Bundle bundle) {
        bundle.getClass();
        return updateCustomInfo(g.a((CustomInfo) null, bundle));
    }

    public void updateVersionInfo(Bundle bundle) {
        bundle.getClass();
        updateVersionInfo(g.a(bundle));
    }

    private static void a(Context context, CustomInfo customInfo, VersionInfo versionInfo, ICrashClient iCrashClient) {
        com.uc.crashsdk.d.a(iCrashClient);
        g.a(customInfo, versionInfo);
        if (b.L()) {
            return;
        }
        e.p();
        e.a(context);
        e.b(context);
    }

    public int addDumpFile(String str, String str2, int i5, Bundle bundle) {
        DumpFileInfo dumpFileInfo = new DumpFileInfo(str, str2, i5);
        if (bundle != null) {
            dumpFileInfo.mIsEncrypted = bundle.getBoolean("mIsEncrypted", dumpFileInfo.mIsEncrypted);
            dumpFileInfo.mWriteCategory = bundle.getBoolean("mWriteCategory", dumpFileInfo.mWriteCategory);
            dumpFileInfo.mDeleteAfterDump = bundle.getBoolean("mDeleteAfterDump", dumpFileInfo.mDeleteAfterDump);
        }
        return addDumpFile(dumpFileInfo);
    }

    private static Context a(Context context) {
        if (context != null) {
            if (!f12023c || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            a.d("crashsdk", "Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }
        a.d("crashsdk", "context can not be null!");
        throw null;
    }

    private static void b(Context context) {
        try {
            if (f12024d) {
                return;
            }
            com.uc.crashsdk.a.g.a(context);
            com.uc.crashsdk.a.f11869a = context.getPackageName();
            f12024d = true;
        } catch (Throwable th) {
            a(th);
        }
    }

    private static void a(Throwable th) {
        new e().a(Thread.currentThread(), th, true);
    }

    public boolean generateCustomLog(StringBuffer stringBuffer, String str, Bundle bundle) {
        CustomLogInfo customLogInfo = new CustomLogInfo(stringBuffer, str);
        if (bundle != null) {
            customLogInfo.mAddHeader = bundle.getBoolean("mAddHeader", customLogInfo.mAddHeader);
            customLogInfo.mAddFooter = bundle.getBoolean("mAddFooter", customLogInfo.mAddFooter);
            customLogInfo.mAddLogcat = bundle.getBoolean("mAddLogcat", customLogInfo.mAddLogcat);
            customLogInfo.mUploadNow = bundle.getBoolean("mUploadNow", customLogInfo.mUploadNow);
            customLogInfo.mAddThreadsDump = bundle.getBoolean("mAddThreadsDump", customLogInfo.mAddThreadsDump);
            customLogInfo.mAddBuildId = bundle.getBoolean("mAddBuildId", customLogInfo.mAddBuildId);
            customLogInfo.mDumpFiles = bundle.getStringArrayList("mDumpFiles");
            customLogInfo.mCallbacks = bundle.getStringArrayList("mCallbacks");
            customLogInfo.mCachedInfos = bundle.getStringArrayList("mCachedInfos");
            customLogInfo.mDumpTids = bundle.getIntegerArrayList("mDumpTids");
        }
        return generateCustomLog(customLogInfo);
    }

    private static boolean a(String str) {
        if (!b.L()) {
            return false;
        }
        a.d("crashsdk", "Can not call '" + str + "' in isolated process!");
        return true;
    }
}
