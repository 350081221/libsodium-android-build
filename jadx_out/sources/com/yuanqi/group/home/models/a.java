package com.yuanqi.group.home.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yqtech.multiapp.R;

/* loaded from: classes3.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private String f14010a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f14011b;

    public a(Context context) {
        this.f14010a = context.getResources().getString(R.string.add_app);
        this.f14011b = context.getResources().getDrawable(R.drawable.ic_add_circle);
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canCreateShortcut() {
        return false;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canDelete() {
        return false;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canLaunch() {
        return false;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canReorder() {
        return false;
    }

    @Override // com.yuanqi.group.home.models.b
    public Drawable getIcon() {
        return this.f14011b;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getName() {
        return this.f14010a;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getPackageName() {
        return null;
    }

    @Override // com.yuanqi.group.home.models.b
    public int getUserId() {
        return -1;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean isFirstOpen() {
        return false;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean isLoading() {
        return false;
    }
}
