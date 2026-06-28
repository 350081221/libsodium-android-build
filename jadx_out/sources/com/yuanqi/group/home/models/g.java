package com.yuanqi.group.home.models;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.vloc.VLocation;

/* loaded from: classes3.dex */
public class g extends j {

    /* renamed from: e, reason: collision with root package name */
    public int f14031e;

    /* renamed from: f, reason: collision with root package name */
    public VLocation f14032f;

    public g() {
    }

    private void a(Context context, ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
            if (loadLabel != null) {
                this.f14039c = loadLabel.toString();
            }
            this.f14040d = applicationInfo.loadIcon(packageManager);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String toString() {
        return "LocationData{packageName='" + this.f14037a + "', userId=" + this.f14038b + ", location=" + this.f14032f + '}';
    }

    public g(Context context, InstalledAppInfo installedAppInfo, int i5) {
        this.f14037a = installedAppInfo.packageName;
        this.f14038b = i5;
        a(context, installedAppInfo.getApplicationInfo(installedAppInfo.getInstalledUsers()[0]));
    }
}
