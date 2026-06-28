package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, PackageInfo> f13471a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static Object f13472b = new Object();

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f13473a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f13473a;
    }

    private b() {
    }

    public PackageInfo a(Context context, String str, int i5) {
        PackageInfo packageInfo;
        synchronized (f13472b) {
            if (f13471a.containsKey(str)) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", pkgInfo缓存命中，直接返回");
                packageInfo = f13471a.get(str);
            } else {
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, i5);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", 获取pkgInfo并缓存");
                    f13471a.put(str, packageInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    f13471a.put(str, null);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> pkg: " + str + "，目标包未安装。");
                    packageInfo = null;
                }
            }
        }
        return packageInfo;
    }
}
