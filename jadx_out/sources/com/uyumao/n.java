package com.uyumao;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static String f13684a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f13685b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f13686c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f13687d = "";

    public static String a() {
        if (TextUtils.isEmpty(f13686c)) {
            f13686c = Build.BOARD;
        }
        return f13686c;
    }

    public static String b() {
        if (TextUtils.isEmpty(f13684a)) {
            String str = Build.BRAND;
            f13684a = str;
            if (TextUtils.isEmpty(str)) {
                f13684a = Build.MANUFACTURER;
            }
        }
        return f13684a;
    }

    public static String c() {
        if (TextUtils.isEmpty(f13685b)) {
            f13685b = Build.MODEL;
        }
        return f13685b;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean c(Context context) {
        try {
            String b5 = b(context);
            String packageName = context.getApplicationContext().getPackageName();
            if (!TextUtils.isEmpty(b5) && !TextUtils.isEmpty(packageName)) {
                if (b5.equals(packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static Object a(Object obj, String str, int i5) {
        try {
            return ((PackageManager) obj).getPackageInfo(str, i5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (TextUtils.isEmpty(f13687d)) {
            try {
                String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
                if (TextUtils.isEmpty(processName)) {
                    int myPid = Process.myPid();
                    String a5 = a(myPid);
                    if (!TextUtils.isEmpty(a5)) {
                        f13687d = a5;
                    } else {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (next.pid == myPid) {
                                    f13687d = next.processName;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    f13687d = processName;
                }
            } catch (Throwable unused) {
            }
        }
        return f13687d;
    }

    public static String a(int i5) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i5 + "/cmdline"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                readLine = readLine.trim();
            }
            try {
                bufferedReader.close();
            } catch (Throwable unused2) {
            }
            return readLine;
        } catch (Throwable unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused4) {
                }
            }
            return null;
        }
    }

    public static boolean a(Context context) {
        return UMUtils.checkPermission(context, "android.permission.QUERY_ALL_PACKAGES");
    }
}
