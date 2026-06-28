package com.yuanqi.group.home.models;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.lody.virtual.helper.InstalledInfoCache;
import com.lody.virtual.remote.InstalledAppInfo;

/* loaded from: classes3.dex */
public class i extends b {

    /* renamed from: a, reason: collision with root package name */
    public String f14033a;

    /* renamed from: b, reason: collision with root package name */
    public String f14034b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f14035c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14036d;

    public i(Context context, InstalledAppInfo installedAppInfo) {
        this.f14033a = installedAppInfo.packageName;
        this.isFirstOpen = !installedAppInfo.isLaunched(0);
        this.f14036d = installedAppInfo.is64bit;
        a(context, installedAppInfo.getApplicationInfo(installedAppInfo.getInstalledUsers()[0]));
    }

    private void a(Context context, ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            InstalledInfoCache.CacheItem cacheItem = InstalledInfoCache.get(applicationInfo.packageName);
            if (cacheItem == null) {
                this.f14034b = applicationInfo.loadLabel(packageManager).toString();
                this.f14035c = applicationInfo.loadIcon(packageManager);
            } else {
                this.f14034b = cacheItem.getLabel();
                this.f14035c = cacheItem.getIcon();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canCreateShortcut() {
        return true;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canDelete() {
        return true;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canLaunch() {
        return true;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canReorder() {
        return true;
    }

    @Override // com.yuanqi.group.home.models.b
    public Drawable getIcon() {
        return this.f14035c;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getName() {
        return this.f14034b;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getPackageName() {
        return this.f14033a;
    }

    @Override // com.yuanqi.group.home.models.b
    public int getUserId() {
        return 0;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean is64bit() {
        return this.f14036d;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean isFirstOpen() {
        return this.isFirstOpen;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean isLoading() {
        return this.isLoading;
    }
}
