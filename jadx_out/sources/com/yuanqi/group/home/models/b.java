package com.yuanqi.group.home.models;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public abstract class b {
    public Drawable appIcon;
    public String appName;
    public String appPackageName;
    public int appUserId;
    public Bitmap bitmap;
    public boolean isFirstOpen;
    public boolean isLoading;
    public int pid;
    public boolean isSelect = false;
    public boolean isShowPreview = false;
    public boolean isShowMask = false;

    public boolean canCreateShortcut() {
        return false;
    }

    public boolean canDelete() {
        return false;
    }

    public boolean canLaunch() {
        return false;
    }

    public boolean canReorder() {
        return false;
    }

    public Drawable getIcon() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getPackageName() {
        return null;
    }

    public int getUserId() {
        return 0;
    }

    public boolean is64bit() {
        return false;
    }

    public boolean isFirstOpen() {
        return this.isFirstOpen;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "AppData{pid=" + this.pid + ", bitmap=" + this.bitmap + ", isFirstOpen=" + this.isFirstOpen + ", isLoading=" + this.isLoading + ", isSelect=" + this.isSelect + ", isShowPreview=" + this.isShowPreview + ", isShowMask=" + this.isShowMask + '}';
    }
}
