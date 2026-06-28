package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bg f11502a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, Object> f11503b = new TreeMap();

    /* renamed from: c, reason: collision with root package name */
    private static final int f11504c = 10800000;

    private bg() {
        try {
            if (c()) {
                b();
                d();
                e();
            }
        } catch (Throwable unused) {
        }
    }

    public static bg a() {
        if (f11502a == null) {
            synchronized (bg.class) {
                if (f11502a == null) {
                    f11502a = new bg();
                }
            }
        }
        return f11502a;
    }

    private void b() {
        List<PackageInfo> d5;
        try {
            ArrayList arrayList = new ArrayList();
            if (y.a(21) && y.b(24)) {
                for (f fVar : t.a()) {
                    if (!fVar.f11708c.startsWith("android.") && !fVar.f11708c.equals("system")) {
                        arrayList.add(fVar.f11708c);
                    }
                }
            } else if (y.b(21)) {
                ActivityManager activityManager = (ActivityManager) ab.f11351g.getSystemService("activity");
                if (activityManager != null) {
                    PackageManager packageManager = ab.f11351g.getPackageManager();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (it.hasNext()) {
                            String str = it.next().processName;
                            try {
                                if (packageManager.getLaunchIntentForPackage(str) != null) {
                                    arrayList.add(str);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            } else if (y.b(30) && (d5 = k.d(ab.f11351g)) != null) {
                for (PackageInfo packageInfo : d5) {
                    int i5 = packageInfo.applicationInfo.flags;
                    if ((i5 & 1) == 0 && (i5 & 128) == 0 && (i5 & 2097152) == 0) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
            }
            f11503b.put("ras", arrayList.toString());
            i.setCollectRunningTime(System.currentTimeMillis());
        } catch (Throwable unused2) {
        }
    }

    private boolean c() {
        try {
            if (!ab.T.isAppListEnabled() || ab.S) {
                return false;
            }
            if (System.currentTimeMillis() - i.g() <= 10800000) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void d() {
        try {
            f11503b.put("aas", a(ab.f11351g).toString());
        } catch (Throwable unused) {
        }
    }

    private void e() {
        bv bvVar = new bv();
        bvVar.f11569b = com.umeng.analytics.pro.au.f12193a;
        bvVar.f11570c = "apps";
        bvVar.f11571d = f11503b;
        bvVar.f11568a = a.ENV;
        z.a().post(bvVar);
    }

    private List<String> a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (c()) {
            return arrayList;
        }
        if (y.a(30) && y.a(context, 30) && !y.c(context, "android.permission.QUERY_ALL_PACKAGES")) {
            return arrayList;
        }
        PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> d5 = k.d(context);
        if (d5 != null) {
            for (PackageInfo packageInfo : d5) {
                arrayList.add(packageInfo.packageName);
                try {
                    arrayList.add(y.b(packageManager.getApplicationLabel(packageInfo.applicationInfo).toString().getBytes()));
                } catch (Throwable unused) {
                    arrayList.add("");
                }
                if ((packageInfo.applicationInfo.flags & 1) > 0) {
                    arrayList.add("1");
                } else {
                    arrayList.add("0");
                }
            }
        }
        return arrayList;
    }
}
