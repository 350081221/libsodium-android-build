package com.uc.crashsdk;

import android.os.Build;
import android.os.Bundle;
import com.android.dex.DexFormat;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.CustomInfo;
import com.uc.crashsdk.export.VersionInfo;
import java.io.File;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static RuntimeException f12031a = null;

    /* renamed from: b, reason: collision with root package name */
    public static RuntimeException f12032b = null;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f12033c = true;

    /* renamed from: d, reason: collision with root package name */
    private static CustomInfo f12034d;

    /* renamed from: e, reason: collision with root package name */
    private static VersionInfo f12035e;

    /* renamed from: g, reason: collision with root package name */
    private static String f12037g;

    /* renamed from: h, reason: collision with root package name */
    private static String f12038h;

    /* renamed from: i, reason: collision with root package name */
    private static String f12039i;

    /* renamed from: j, reason: collision with root package name */
    private static String f12040j;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f12036f = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static final Object f12041k = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A() {
        return f12034d.mLogMaxBytesLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B() {
        return f12034d.mLogMaxUploadBytesLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long C() {
        return f12034d.mMaxUploadBytesPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D() {
        return f12034d.mMaxUploadBuiltinLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E() {
        return f12034d.mMaxUploadCustomLogCountPerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F() {
        return f12034d.mMaxCustomLogCountPerTypePerDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G() {
        return f12034d.mInfoUpdateInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H() {
        return f12034d.mInfoSaveFrequency;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I() {
        return f12034d.mReservedJavaFileHandleCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J() {
        return f12034d.mFdDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K() {
        return f12034d.mThreadsDumpMinLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean L() {
        return f12034d.mAutoDetectLifeCycle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean M() {
        return f12034d.mMonitorBattery;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N() {
        return f12034d.mAnrTraceStrategy;
    }

    public static boolean O() {
        CustomInfo customInfo = f12034d;
        return customInfo == null || customInfo.mDebug;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean P() {
        CustomInfo customInfo = f12034d;
        return customInfo == null || customInfo.mPrintStackInfos;
    }

    public static boolean Q() {
        return f12034d.mEnableStatReport;
    }

    public static boolean R() {
        return f12034d.mIsInternational;
    }

    public static boolean S() {
        return f12034d.mAddPvForNewDay;
    }

    public static String T() {
        if (com.uc.crashsdk.a.g.a(f12035e.mVersion)) {
            return a.a();
        }
        return a(f12035e.mVersion);
    }

    public static String U() {
        if (com.uc.crashsdk.a.g.a(f12035e.mSubVersion)) {
            return "release";
        }
        return f12035e.mSubVersion;
    }

    public static String V() {
        if (com.uc.crashsdk.a.g.a(f12035e.mBuildId)) {
            return ad();
        }
        return a(f12035e.mBuildId);
    }

    public static String W() {
        if (f12038h == null) {
            f12038h = com.uc.crashsdk.a.g.b() + File.separatorChar + f12034d.mTagFilesFolderName + File.separatorChar;
        }
        return f12038h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String X() {
        if (f12039i == null) {
            f12039i = com.uc.crashsdk.a.g.b() + File.separatorChar + f12034d.mCrashLogsFolderName + File.separatorChar;
        }
        return f12039i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String Y() {
        if (f12040j == null) {
            if (!com.uc.crashsdk.a.g.a(f12034d.mLogsBackupPathName)) {
                String trim = f12034d.mLogsBackupPathName.trim();
                String str = File.separator;
                if (!trim.endsWith(str)) {
                    trim = trim + str;
                }
                f12040j = trim;
            } else {
                f12040j = (com.uc.crashsdk.a.g.b() + File.separatorChar + "msdb" + File.separatorChar) + File.separatorChar + f12034d.mCrashLogsFolderName + File.separatorChar;
            }
        }
        return f12040j;
    }

    public static boolean Z() {
        return f12034d.mEnableCrpStat;
    }

    public static void a(CustomInfo customInfo, VersionInfo versionInfo) {
        CustomInfo customInfo2 = new CustomInfo(customInfo);
        f12034d = customInfo2;
        c(customInfo2);
        if (!f12034d.mZipLog) {
            f12031a = new RuntimeException("initialize set mZipLog to false, info.mZipLog: " + customInfo.mZipLog);
        }
        if (f12034d.mEncryptLog) {
            f12032b = new RuntimeException("initialize set mEncryptLog to true, info.mEncryptLog: " + customInfo.mEncryptLog);
        }
        f12035e = new VersionInfo(versionInfo);
        if (b.L()) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static boolean aa() {
        return f12034d.mEnableStatToWPKDirect;
    }

    public static String ab() {
        return f12034d.mUserId;
    }

    public static String ac() {
        return f12034d.mChannel;
    }

    private static String ad() {
        ZipFile zipFile;
        Throwable th;
        String str = f12037g;
        if (str != null) {
            return str;
        }
        try {
            try {
                zipFile = new ZipFile(com.uc.crashsdk.a.g.c());
                try {
                    f12037g = Long.toHexString(zipFile.getEntry(DexFormat.DEX_IN_JAR_NAME).getCrc());
                    com.uc.crashsdk.a.a.a("crashsdk", "version unique build id: " + f12037g);
                    zipFile.close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        f12037g = "";
                        com.uc.crashsdk.a.g.a(th);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return f12037g;
                    } catch (Throwable th3) {
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th4) {
            zipFile = null;
            th = th4;
        }
        return f12037g;
    }

    private static void ae() {
        if (b.f11952d) {
            JNIBridge.nativeSet(24, 1L, a.f11870b, null);
        }
    }

    public static void b() {
        JNIBridge.set(103, com.uc.crashsdk.a.g.b());
        JNIBridge.set(104, f12034d.mTagFilesFolderName);
        JNIBridge.set(105, f12034d.mCrashLogsFolderName);
        JNIBridge.set(106, Y());
        JNIBridge.set(107, e.h());
        JNIBridge.set(108, b.a());
        JNIBridge.set(109, T());
        JNIBridge.set(110, U());
        JNIBridge.set(111, V());
        JNIBridge.set(112, "211215141717");
        JNIBridge.set(116, Build.MODEL);
        JNIBridge.set(117, Build.VERSION.RELEASE);
        JNIBridge.set(118, e.q());
        JNIBridge.set(5, f12034d.mCallNativeDefaultHandler);
        JNIBridge.set(6, f12034d.mDumpUserSolibBuildId);
        JNIBridge.set(7, f12034d.mReservedNativeMemoryBytes);
        JNIBridge.set(100, f12034d.mNativeCrashLogFileName);
        JNIBridge.set(101, f12034d.mUnexpCrashLogFileName);
        JNIBridge.set(35, f12034d.mEnableMemoryGroup);
        JNIBridge.set(36, f12034d.mEnableLibcMallocDetail);
        JNIBridge.set(131, f12034d.mLibcMallocDetailConfig);
        JNIBridge.set(102, f12034d.mAppId);
        JNIBridge.set(38, f12034d.mCrashRateUploadUrl);
        JNIBridge.set(39, f12034d.mCrashSDKAuthUrl);
    }

    private static void c(CustomInfo customInfo) {
        if (customInfo.mZippedLogExtension == null) {
            customInfo.mZippedLogExtension = "";
        }
        if (!customInfo.mZippedLogExtension.equals(".tmp")) {
            if (customInfo.mOmitJavaCrash) {
                customInfo.mCallJavaDefaultHandler = false;
            }
            if (customInfo.mOmitNativeCrash) {
                customInfo.mCallNativeDefaultHandler = false;
            }
            long b5 = e.b();
            if (b5 >= 1) {
                customInfo.mMaxBuiltinLogFilesCount = 200;
                customInfo.mMaxCustomLogFilesCount = 100;
                customInfo.mMaxUploadBytesPerDay = 268435456L;
                customInfo.mMaxUploadBuiltinLogCountPerDay = 2000;
                customInfo.mMaxUploadCustomLogCountPerDay = 2000;
                customInfo.mMaxCustomLogCountPerTypePerDay = 100;
                customInfo.mMaxAnrLogCountPerProcess = 100;
                customInfo.mAnrTraceStrategy = 2;
                if (b5 >= 2) {
                    customInfo.mSyncUploadSetupCrashLogs = true;
                    customInfo.mSyncUploadLogs = true;
                    if (b5 >= 3) {
                        customInfo.mBackupLogs = true;
                        customInfo.mPrintStackInfos = true;
                        customInfo.mDebug = true;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("mZippedLogExtension can not be '.tmp'!");
    }

    public static void d() {
        JNIBridge.set(23, f12034d.mIsInternational);
        if (b.H()) {
            JNIBridge.set(34, true);
        }
        if (e.i()) {
            JNIBridge.set(1, true);
        }
        JNIBridge.set(10, f12034d.mFdDumpMinLimit);
        JNIBridge.nativeCmd(3, f12034d.mReservedNativeFileHandleCount, null, null);
        JNIBridge.nativeSetForeground(b.B());
        JNIBridge.set(2, b.F());
        a.e();
        a.g();
        a.i();
        a.k();
        JNIBridge.set(113, a.f11869a);
        JNIBridge.cmd(1);
        JNIBridge.set(22, f12034d.mThreadsDumpMinLimit);
        JNIBridge.set(122, a.a());
        JNIBridge.set(33, a.c());
        ae();
        b.K();
        b.D();
        com.uc.crashsdk.a.g.k();
    }

    public static String e() {
        return f12034d.mAppId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        if (com.uc.crashsdk.a.g.b(f12034d.mJavaCrashLogFileName) || com.uc.crashsdk.a.g.b(f12034d.mNativeCrashLogFileName)) {
            return true;
        }
        return com.uc.crashsdk.a.g.b(f12034d.mUnexpCrashLogFileName);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        return f12034d.mJavaCrashLogFileName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h() {
        return f12034d.mCrashRestartInterval;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i() {
        return f12034d.mCallJavaDefaultHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j() {
        return f12034d.mDumpHprofDataForJavaOOM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k() {
        return f12034d.mRenameFileToDefaultName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l() {
        return f12034d.mMaxBuiltinLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m() {
        return f12034d.mMaxCustomLogFilesCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n() {
        return f12034d.mMaxJavaLogcatLineCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o() {
        return f12034d.mUnexpDelayMillSeconds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p() {
        return f12034d.mUnexpSubTypes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q() {
        return f12034d.mBackupLogs;
    }

    public static boolean r() {
        return f12034d.mSyncUploadSetupCrashLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s() {
        return f12034d.mSyncUploadLogs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        return f12034d.mOmitJavaCrash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        return f12034d.mAutoDeleteOldVersionStats;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v() {
        return f12034d.mZipLog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String w() {
        return f12034d.mZippedLogExtension;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x() {
        return f12034d.mEncryptLog;
    }

    public static String y() {
        return f12034d.mCrashLogUploadUrl;
    }

    public static String z() {
        return f12034d.mCrashRateUploadUrl;
    }

    public static void a(CustomInfo customInfo) {
        boolean z4 = f12033c;
        if (!z4 && customInfo.mTagFilesFolderName == null) {
            throw new AssertionError();
        }
        if (!z4 && customInfo.mCrashLogsFolderName == null) {
            throw new AssertionError();
        }
        if (customInfo.mTagFilesFolderName.equals(customInfo.mCrashLogsFolderName)) {
            throw new IllegalArgumentException("mTagFilesFolderName and mCrashLogsFolderName can not be set to the same!");
        }
    }

    public static void a(VersionInfo versionInfo) {
        synchronized (f12036f) {
            f12035e = new VersionInfo(versionInfo);
            e.c();
            if (b.f11952d) {
                JNIBridge.set(109, T());
                JNIBridge.set(110, U());
                JNIBridge.set(111, V());
                JNIBridge.set(112, "211215141717");
                JNIBridge.cmd(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        b.y();
        b.x();
        if (f12034d.mBackupLogs) {
            File file = new File(Y());
            if (file.exists()) {
                return;
            }
            file.mkdirs();
        }
    }

    public static void c() {
        JNIBridge.set(11, P());
        JNIBridge.set(12, f12034d.mBackupLogs);
        JNIBridge.set(13, f12034d.mCrashRestartInterval);
        JNIBridge.set(14, f12034d.mMaxBuiltinLogFilesCount);
        JNIBridge.set(15, f12034d.mMaxNativeLogcatLineCount);
        JNIBridge.set(16, f12034d.mMaxUnexpLogcatLineCount);
        JNIBridge.set(31, f12034d.mMaxAnrLogcatLineCount);
        JNIBridge.set(18, O());
        JNIBridge.set(20, Build.VERSION.SDK_INT);
        JNIBridge.set(21, f12034d.mOmitNativeCrash);
        JNIBridge.set(32, f12034d.mMaxAnrLogCountPerProcess);
        JNIBridge.set(8, f12034d.mDisableSignals);
        JNIBridge.set(9, f12034d.mDisableBackgroundSignals);
        CustomInfo customInfo = f12034d;
        JNIBridge.nativeSet(3, customInfo.mZipLog ? 1L : 0L, customInfo.mZippedLogExtension, null);
        JNIBridge.set(4, f12034d.mLogMaxBytesLimit);
        JNIBridge.set(119, Build.FINGERPRINT);
    }

    private static String a(String str) {
        return (str == null || !str.contains("_")) ? str : str.replaceAll("_", "-");
    }

    public static int b(CustomInfo customInfo) {
        int i5;
        int i6;
        boolean z4;
        synchronized (f12041k) {
            i5 = 0;
            if (customInfo != null) {
                c(customInfo);
                if (f12034d == null) {
                    f12034d = new CustomInfo();
                }
                CustomInfo customInfo2 = f12034d;
                boolean z5 = true;
                if (a(customInfo.mAppId, customInfo2.mAppId)) {
                    i6 = 0;
                } else {
                    String str = customInfo.mAppId;
                    customInfo2.mAppId = str;
                    if (b.f11952d) {
                        JNIBridge.set(102, str);
                    }
                    i6 = 1;
                }
                int i7 = i6;
                if (!a(customInfo.mJavaCrashLogFileName, customInfo2.mJavaCrashLogFileName)) {
                    customInfo2.mJavaCrashLogFileName = customInfo.mJavaCrashLogFileName;
                    i6++;
                }
                if (!a(customInfo.mNativeCrashLogFileName, customInfo2.mNativeCrashLogFileName)) {
                    String str2 = customInfo.mNativeCrashLogFileName;
                    customInfo2.mNativeCrashLogFileName = str2;
                    if (b.f11952d) {
                        JNIBridge.set(100, str2);
                    }
                    i6++;
                    i7 = 1;
                }
                if (!a(customInfo.mUnexpCrashLogFileName, customInfo2.mUnexpCrashLogFileName)) {
                    String str3 = customInfo.mUnexpCrashLogFileName;
                    customInfo2.mUnexpCrashLogFileName = str3;
                    if (b.f11952d) {
                        JNIBridge.set(101, str3);
                    }
                    i6++;
                    i7 = 1;
                }
                if (i7 != 0) {
                    e.c();
                    if (b.f11952d) {
                        JNIBridge.cmd(2);
                    }
                }
                boolean z6 = customInfo2.mPrintStackInfos;
                boolean z7 = customInfo.mPrintStackInfos;
                if (z6 != z7) {
                    customInfo2.mPrintStackInfos = z7;
                    if (b.f11952d) {
                        JNIBridge.set(11, z7);
                    }
                    i6++;
                }
                boolean z8 = customInfo2.mDebug;
                boolean z9 = customInfo.mDebug;
                if (z8 != z9) {
                    customInfo2.mDebug = z9;
                    if (b.f11952d) {
                        JNIBridge.set(18, z9);
                    }
                    i6++;
                }
                boolean z10 = customInfo2.mBackupLogs;
                boolean z11 = customInfo.mBackupLogs;
                if (z10 != z11) {
                    customInfo2.mBackupLogs = z11;
                    if (b.f11952d) {
                        JNIBridge.set(12, z11);
                    }
                    i6++;
                }
                boolean z12 = customInfo2.mOmitNativeCrash;
                boolean z13 = customInfo.mOmitNativeCrash;
                if (z12 != z13) {
                    customInfo2.mOmitNativeCrash = z13;
                    if (b.f11952d) {
                        JNIBridge.set(21, z13);
                    }
                    i6++;
                }
                int i8 = customInfo2.mCrashRestartInterval;
                int i9 = customInfo.mCrashRestartInterval;
                if (i8 != i9) {
                    customInfo2.mCrashRestartInterval = i9;
                    if (b.f11952d) {
                        JNIBridge.set(13, i9);
                    }
                    if (customInfo2.mCrashRestartInterval >= 0) {
                        b.M();
                    }
                    i6++;
                }
                int i10 = customInfo2.mMaxBuiltinLogFilesCount;
                int i11 = customInfo.mMaxBuiltinLogFilesCount;
                if (i10 != i11) {
                    customInfo2.mMaxBuiltinLogFilesCount = i11;
                    if (b.f11952d) {
                        JNIBridge.set(14, i11);
                    }
                    i6++;
                }
                int i12 = customInfo2.mMaxNativeLogcatLineCount;
                int i13 = customInfo.mMaxNativeLogcatLineCount;
                if (i12 != i13) {
                    customInfo2.mMaxNativeLogcatLineCount = i13;
                    if (b.f11952d) {
                        JNIBridge.set(15, i13);
                    }
                    i6++;
                }
                int i14 = customInfo2.mMaxJavaLogcatLineCount;
                int i15 = customInfo.mMaxJavaLogcatLineCount;
                if (i14 != i15) {
                    customInfo2.mMaxJavaLogcatLineCount = i15;
                    i6++;
                }
                int i16 = customInfo2.mMaxUnexpLogcatLineCount;
                int i17 = customInfo.mMaxUnexpLogcatLineCount;
                if (i16 != i17) {
                    customInfo2.mMaxUnexpLogcatLineCount = i17;
                    if (b.f11952d) {
                        JNIBridge.set(16, i17);
                    }
                    i6++;
                }
                int i18 = customInfo2.mMaxAnrLogcatLineCount;
                int i19 = customInfo.mMaxAnrLogcatLineCount;
                if (i18 != i19) {
                    customInfo2.mMaxAnrLogcatLineCount = i19;
                    if (b.f11952d) {
                        JNIBridge.set(31, i19);
                    }
                    i6++;
                }
                boolean z14 = customInfo2.mZipLog;
                boolean z15 = customInfo.mZipLog;
                if (z14 != z15) {
                    customInfo2.mZipLog = z15;
                    if (!z15) {
                        com.uc.crashsdk.a.a.d("DEBUG", "updateCustomInfoImpl set mZipLog to false");
                        f12031a = new RuntimeException("updateCustomInfoImpl set mZipLog to false");
                    }
                    i6++;
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (a(customInfo.mZippedLogExtension, customInfo2.mZippedLogExtension)) {
                    z5 = z4;
                } else {
                    customInfo2.mZippedLogExtension = customInfo.mZippedLogExtension;
                    i6++;
                }
                if (z5 && b.f11952d) {
                    JNIBridge.nativeSet(3, customInfo2.mZipLog ? 1L : 0L, customInfo2.mZippedLogExtension, null);
                }
                int i20 = customInfo2.mLogMaxBytesLimit;
                int i21 = customInfo.mLogMaxBytesLimit;
                if (i20 != i21) {
                    customInfo2.mLogMaxBytesLimit = i21;
                    if (b.f11952d) {
                        JNIBridge.set(4, i21);
                    }
                    i6++;
                }
                boolean z16 = customInfo2.mEncryptLog;
                boolean z17 = customInfo.mEncryptLog;
                if (z16 != z17) {
                    customInfo2.mEncryptLog = z17;
                    if (z17) {
                        com.uc.crashsdk.a.a.d("DEBUG", "updateCustomInfoImpl set mEncryptLog to true");
                        f12032b = new RuntimeException("updateCustomInfoImpl set mEncryptLog to true");
                    }
                    i6++;
                }
                boolean z18 = customInfo2.mSyncUploadSetupCrashLogs;
                boolean z19 = customInfo.mSyncUploadSetupCrashLogs;
                if (z18 != z19) {
                    customInfo2.mSyncUploadSetupCrashLogs = z19;
                    i6++;
                }
                boolean z20 = customInfo2.mSyncUploadLogs;
                boolean z21 = customInfo.mSyncUploadLogs;
                if (z20 != z21) {
                    customInfo2.mSyncUploadLogs = z21;
                    i6++;
                }
                int i22 = customInfo2.mMaxCustomLogFilesCount;
                int i23 = customInfo.mMaxCustomLogFilesCount;
                if (i22 != i23) {
                    customInfo2.mMaxCustomLogFilesCount = i23;
                    i6++;
                }
                boolean z22 = customInfo2.mOmitJavaCrash;
                boolean z23 = customInfo.mOmitJavaCrash;
                if (z22 != z23) {
                    customInfo2.mOmitJavaCrash = z23;
                    i6++;
                }
                int i24 = customInfo2.mLogMaxUploadBytesLimit;
                int i25 = customInfo.mLogMaxUploadBytesLimit;
                if (i24 != i25) {
                    customInfo2.mLogMaxUploadBytesLimit = i25;
                    i6++;
                }
                long j5 = customInfo2.mMaxUploadBytesPerDay;
                long j6 = customInfo.mMaxUploadBytesPerDay;
                if (j5 != j6) {
                    customInfo2.mMaxUploadBytesPerDay = j6;
                    i6++;
                }
                int i26 = customInfo2.mMaxUploadBuiltinLogCountPerDay;
                int i27 = customInfo.mMaxUploadBuiltinLogCountPerDay;
                if (i26 != i27) {
                    customInfo2.mMaxUploadBuiltinLogCountPerDay = i27;
                    i6++;
                }
                int i28 = customInfo2.mMaxUploadCustomLogCountPerDay;
                int i29 = customInfo.mMaxUploadCustomLogCountPerDay;
                if (i28 != i29) {
                    customInfo2.mMaxUploadCustomLogCountPerDay = i29;
                    i6++;
                }
                int i30 = customInfo2.mMaxCustomLogCountPerTypePerDay;
                int i31 = customInfo.mMaxCustomLogCountPerTypePerDay;
                if (i30 != i31) {
                    customInfo2.mMaxCustomLogCountPerTypePerDay = i31;
                    i6++;
                }
                int i32 = customInfo2.mMaxAnrLogCountPerProcess;
                int i33 = customInfo.mMaxAnrLogCountPerProcess;
                if (i32 != i33) {
                    customInfo2.mMaxAnrLogCountPerProcess = i33;
                    if (b.f11952d) {
                        JNIBridge.set(32, f12034d.mMaxAnrLogCountPerProcess);
                    }
                    i6++;
                }
                boolean z24 = customInfo2.mCallJavaDefaultHandler;
                boolean z25 = customInfo.mCallJavaDefaultHandler;
                if (z24 != z25) {
                    customInfo2.mCallJavaDefaultHandler = z25;
                    i6++;
                }
                boolean z26 = customInfo2.mCallNativeDefaultHandler;
                boolean z27 = customInfo.mCallNativeDefaultHandler;
                if (z26 != z27) {
                    customInfo2.mCallNativeDefaultHandler = z27;
                    i6++;
                    if (b.f11952d) {
                        JNIBridge.set(5, f12034d.mCallNativeDefaultHandler);
                    }
                }
                boolean z28 = customInfo2.mDumpUserSolibBuildId;
                boolean z29 = customInfo.mDumpUserSolibBuildId;
                if (z28 != z29) {
                    customInfo2.mDumpUserSolibBuildId = z29;
                    i6++;
                    if (b.f11952d) {
                        JNIBridge.set(6, f12034d.mDumpUserSolibBuildId);
                    }
                }
                boolean z30 = customInfo2.mDumpHprofDataForJavaOOM;
                boolean z31 = customInfo.mDumpHprofDataForJavaOOM;
                if (z30 != z31) {
                    customInfo2.mDumpHprofDataForJavaOOM = z31;
                    i6++;
                }
                boolean z32 = customInfo2.mRenameFileToDefaultName;
                boolean z33 = customInfo.mRenameFileToDefaultName;
                if (z32 != z33) {
                    customInfo2.mRenameFileToDefaultName = z33;
                    i6++;
                }
                boolean z34 = customInfo2.mAutoDeleteOldVersionStats;
                boolean z35 = customInfo.mAutoDeleteOldVersionStats;
                if (z34 != z35) {
                    customInfo2.mAutoDeleteOldVersionStats = z35;
                    i6++;
                }
                int i34 = customInfo2.mFdDumpMinLimit;
                int i35 = customInfo.mFdDumpMinLimit;
                if (i34 != i35) {
                    customInfo2.mFdDumpMinLimit = i35;
                    if (b.f11952d) {
                        JNIBridge.set(10, i35);
                    }
                    i6++;
                }
                int i36 = customInfo2.mThreadsDumpMinLimit;
                int i37 = customInfo.mThreadsDumpMinLimit;
                if (i36 != i37) {
                    customInfo2.mThreadsDumpMinLimit = i37;
                    if (b.f11952d) {
                        JNIBridge.set(22, i37);
                    }
                    i6++;
                }
                int i38 = customInfo2.mInfoUpdateInterval;
                int i39 = customInfo.mInfoUpdateInterval;
                if (i38 != i39) {
                    if (i38 <= 0 && i39 > 0) {
                        a.a(false);
                    }
                    customInfo2.mInfoUpdateInterval = customInfo.mInfoUpdateInterval;
                    i6++;
                }
                int i40 = customInfo2.mInfoSaveFrequency;
                int i41 = customInfo.mInfoSaveFrequency;
                if (i40 != i41) {
                    customInfo2.mInfoSaveFrequency = i41;
                    i6++;
                }
                long j7 = customInfo2.mDisableBackgroundSignals;
                long j8 = customInfo.mDisableBackgroundSignals;
                if (j7 != j8) {
                    customInfo2.mDisableBackgroundSignals = j8;
                    if (b.f11952d) {
                        JNIBridge.set(9, j8);
                    }
                    i6++;
                }
                boolean z36 = customInfo2.mEnableStatReport;
                boolean z37 = customInfo.mEnableStatReport;
                if (z36 != z37) {
                    customInfo2.mEnableStatReport = z37;
                    if (z37) {
                        e.B();
                    }
                    i6++;
                }
                boolean z38 = customInfo2.mEnableCrpStat;
                boolean z39 = customInfo.mEnableCrpStat;
                if (z38 != z39) {
                    customInfo2.mEnableCrpStat = z39;
                    i6++;
                }
                boolean z40 = customInfo2.mEnableStatToWPKDirect;
                boolean z41 = customInfo.mEnableStatToWPKDirect;
                if (z40 != z41) {
                    customInfo2.mEnableStatToWPKDirect = z41;
                    i6++;
                }
                boolean z42 = customInfo2.mIsInternational;
                boolean z43 = customInfo.mIsInternational;
                if (z42 != z43) {
                    customInfo2.mIsInternational = z43;
                    if (b.f11952d) {
                        JNIBridge.set(23, z43);
                    }
                    e.l();
                    com.uc.crashsdk.a.d.c();
                    h.k();
                    i6++;
                }
                boolean z44 = customInfo2.mAutoDetectLifeCycle;
                boolean z45 = customInfo.mAutoDetectLifeCycle;
                if (z44 != z45) {
                    customInfo2.mAutoDetectLifeCycle = z45;
                    if (z45) {
                        b.C();
                    }
                    i6++;
                }
                boolean z46 = customInfo2.mMonitorBattery;
                boolean z47 = customInfo.mMonitorBattery;
                if (z46 != z47) {
                    customInfo2.mMonitorBattery = z47;
                    e.c(b.B());
                    i6++;
                }
                int i42 = customInfo2.mUnexpSubTypes;
                int i43 = customInfo.mUnexpSubTypes;
                if (i42 != i43) {
                    customInfo2.mUnexpSubTypes = i43;
                    i6++;
                }
                boolean z48 = customInfo2.mEnableMemoryGroup;
                boolean z49 = customInfo.mEnableMemoryGroup;
                if (z48 != z49) {
                    customInfo2.mEnableMemoryGroup = z49;
                    if (b.f11952d) {
                        JNIBridge.set(35, z49);
                    }
                    i6++;
                }
                boolean z50 = customInfo2.mEnableLibcMallocDetail;
                boolean z51 = customInfo.mEnableLibcMallocDetail;
                if (z50 != z51) {
                    customInfo2.mEnableLibcMallocDetail = z51;
                    if (b.f11952d) {
                        JNIBridge.set(36, z51);
                    }
                    i6++;
                }
                String str4 = customInfo2.mLibcMallocDetailConfig;
                String str5 = customInfo.mLibcMallocDetailConfig;
                if (str4 != str5) {
                    customInfo2.mLibcMallocDetailConfig = str5;
                    if (b.f11952d) {
                        JNIBridge.set(131, str5);
                    }
                    i6++;
                }
                if (!a(customInfo.mUserId, customInfo2.mUserId)) {
                    customInfo2.mUserId = customInfo.mUserId;
                    i6++;
                }
                if (!a(customInfo.mChannel, customInfo2.mChannel)) {
                    customInfo2.mChannel = customInfo.mChannel;
                    i6++;
                }
                if (!a(customInfo2.mCrashLogUploadUrl, customInfo.mCrashLogUploadUrl)) {
                    customInfo2.mCrashLogUploadUrl = customInfo.mCrashLogUploadUrl;
                    i6++;
                }
                if (!a(customInfo2.mCrashRateUploadUrl, customInfo.mCrashRateUploadUrl)) {
                    String str6 = customInfo.mCrashRateUploadUrl;
                    customInfo2.mCrashRateUploadUrl = str6;
                    i6++;
                    if (b.f11952d) {
                        JNIBridge.set(38, str6);
                    }
                }
                if (!a(customInfo2.mCrashSDKAuthUrl, customInfo.mCrashSDKAuthUrl)) {
                    String str7 = customInfo.mCrashSDKAuthUrl;
                    customInfo2.mCrashSDKAuthUrl = str7;
                    i6++;
                    if (b.f11952d) {
                        JNIBridge.set(39, str7);
                    }
                }
                i5 = i6;
            }
        }
        return i5;
    }

    public static CustomInfo a(CustomInfo customInfo, Bundle bundle) {
        if (customInfo == null) {
            CustomInfo customInfo2 = f12034d;
            if (customInfo2 == null) {
                customInfo = new CustomInfo();
            } else {
                customInfo = new CustomInfo(customInfo2);
            }
        }
        Field[] fields = customInfo.getClass().getFields();
        for (String str : bundle.keySet()) {
            for (Field field : fields) {
                if (field.getName().equals(str)) {
                    Object obj = bundle.get(str);
                    try {
                        field.set(customInfo, obj);
                    } catch (Exception e5) {
                        com.uc.crashsdk.a.g.a(e5);
                        StringBuilder sb = new StringBuilder("Field ");
                        sb.append(str);
                        sb.append(" must be a ");
                        sb.append(field.getType().getName());
                        sb.append(", but give a ");
                        sb.append(obj != null ? obj.getClass().getName() : "(null)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return customInfo;
    }

    public static VersionInfo a(Bundle bundle) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2 = f12035e;
        if (versionInfo2 == null) {
            versionInfo = new VersionInfo();
        } else {
            versionInfo = new VersionInfo(versionInfo2);
        }
        String string = bundle.getString("mVersion");
        if (!com.uc.crashsdk.a.g.a(string)) {
            versionInfo.mVersion = string;
        }
        String string2 = bundle.getString("mSubVersion");
        if (!com.uc.crashsdk.a.g.a(string2)) {
            versionInfo.mSubVersion = string2;
        }
        String string3 = bundle.getString("mBuildId");
        if (!com.uc.crashsdk.a.g.a(string3)) {
            versionInfo.mBuildId = string3;
        }
        String string4 = bundle.getString("crver");
        if (!com.uc.crashsdk.a.g.a(string4)) {
            a.f11870b = string4;
            ae();
        }
        return versionInfo;
    }

    private static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }
}
