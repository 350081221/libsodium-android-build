package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class t {
    private t() {
    }

    public static List<f> a() {
        ArrayList arrayList = new ArrayList();
        try {
            for (File file : new File("/proc").listFiles()) {
                if (file != null && file.isDirectory()) {
                    try {
                        int parseInt = Integer.parseInt(file.getName());
                        f fVar = new f(-1);
                        int i5 = fVar.f11707b;
                        if ((i5 < 1000 || i5 > 9999) && !fVar.f11708c.contains(":") && !fVar.f11708c.contains("/")) {
                            arrayList.add(new f(parseInt));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    public static boolean b() {
        try {
            List<f> a5 = a();
            int myPid = Process.myPid();
            for (f fVar : a5) {
                if (fVar.f11709d == myPid && fVar.f11706a) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static List<ActivityManager.RunningAppProcessInfo> b(Context context) {
        try {
            List<f> a5 = a();
            ArrayList arrayList = new ArrayList();
            for (f fVar : a5) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo(fVar.f11708c, fVar.f11709d, null);
                runningAppProcessInfo.uid = fVar.f11707b;
                arrayList.add(runningAppProcessInfo);
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<f> a(Context context) {
        int i5;
        ArrayList arrayList = new ArrayList();
        try {
            File[] listFiles = new File("/proc").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file != null && file.isDirectory()) {
                        try {
                            f fVar = new f(Integer.parseInt(file.getName()));
                            if (fVar.f11706a && (((i5 = fVar.f11707b) < 1000 || i5 > 9999) && !fVar.f11708c.contains(":") && !fVar.f11708c.contains("/"))) {
                                arrayList.add(fVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    public static String a(Context context, int i5) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i5) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
