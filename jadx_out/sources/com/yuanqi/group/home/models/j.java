package com.yuanqi.group.home.models;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.lody.virtual.remote.InstalledAppInfo;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public String f14037a;

    /* renamed from: b, reason: collision with root package name */
    public int f14038b;

    /* renamed from: c, reason: collision with root package name */
    public String f14039c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f14040d;

    public j() {
    }

    private void a(Context context, ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            this.f14039c = applicationInfo.loadLabel(packageManager).toString();
            this.f14040d = applicationInfo.loadIcon(packageManager);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public j(Context context, InstalledAppInfo installedAppInfo, int i5) {
        this.f14037a = installedAppInfo == null ? null : installedAppInfo.packageName;
        this.f14038b = i5;
        if (installedAppInfo != null) {
            a(context, installedAppInfo.getApplicationInfo(installedAppInfo.getInstalledUsers()[0]));
        }
    }
}
