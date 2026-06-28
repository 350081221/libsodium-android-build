package com.uyumao;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f13692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13694c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13695d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13696e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13697f;

    public p(Object obj, Object obj2) {
        String str;
        PackageManager packageManager = (PackageManager) obj;
        PackageInfo packageInfo = (PackageInfo) obj2;
        this.f13692a = packageInfo.packageName;
        this.f13694c = packageInfo.versionName;
        this.f13695d = packageInfo.firstInstallTime;
        this.f13696e = packageInfo.lastUpdateTime;
        this.f13697f = a(packageInfo);
        try {
            str = String.valueOf(packageManager.getApplicationLabel(packageInfo.applicationInfo));
        } catch (Throwable unused) {
            str = "";
        }
        this.f13693b = str;
    }

    public final int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            return -1;
        }
        int i5 = applicationInfo.flags;
        if ((i5 & 1) != 0 || (i5 & 128) != 0) {
            return 0;
        }
        return 1;
    }
}
