package com.yuanqi.group.home.models;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public String f14022a;

    /* renamed from: b, reason: collision with root package name */
    public String f14023b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f14024c;

    /* renamed from: d, reason: collision with root package name */
    public int f14025d;

    /* renamed from: e, reason: collision with root package name */
    public int f14026e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f14027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14028g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14029h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14030i = false;

    public d(String str, String str2, Drawable drawable, int i5) {
        this.f14022a = str;
        this.f14023b = str2;
        this.f14024c = drawable;
        this.f14025d = i5;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canCreateShortcut() {
        return super.canCreateShortcut();
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canDelete() {
        return super.canDelete();
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canLaunch() {
        return super.canLaunch();
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean canReorder() {
        return super.canReorder();
    }

    @Override // com.yuanqi.group.home.models.b
    public Drawable getIcon() {
        return this.f14024c;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getName() {
        return this.f14023b;
    }

    @Override // com.yuanqi.group.home.models.b
    public String getPackageName() {
        return this.f14022a;
    }

    @Override // com.yuanqi.group.home.models.b
    public int getUserId() {
        return this.f14025d;
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean is64bit() {
        return super.is64bit();
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean isFirstOpen() {
        return super.isFirstOpen();
    }

    @Override // com.yuanqi.group.home.models.b
    public boolean isLoading() {
        return super.isLoading();
    }
}
