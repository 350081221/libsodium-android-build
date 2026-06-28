package com.yuanqi.group.home.models;

import android.graphics.drawable.Drawable;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.remote.InstalledAppInfo;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class h extends b implements Serializable {
    public InstalledAppInfo appInfo;
    public Drawable icon;
    public String name;
    public String packageName;
    public int userId;

    public h(i iVar, int i5) {
        Drawable.ConstantState constantState;
        this.userId = i5;
        this.appInfo = VirtualCore.get().getInstalledAppInfo(iVar.f14033a, 0);
        this.isFirstOpen = !r0.isLaunched(i5);
        Drawable drawable = iVar.f14035c;
        if (drawable != null && (constantState = drawable.getConstantState()) != null) {
            this.icon = constantState.newDrawable();
        }
        this.name = iVar.f14034b;
        this.packageName = iVar.f14033a;
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
        return this.icon;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getName() {
        return this.name;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.yuanqi.group.home.models.b
    public int getUserId() {
        return this.userId;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean is64bit() {
        return this.appInfo.is64bit;
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
