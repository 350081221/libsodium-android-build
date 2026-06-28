package com.zzhoujay.richtext;

import android.graphics.Color;
import androidx.annotation.ColorInt;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static final int f15665d = Color.parseColor("#4078C0");

    /* renamed from: a, reason: collision with root package name */
    private final String f15666a;

    /* renamed from: b, reason: collision with root package name */
    @ColorInt
    private int f15667b = f15665d;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15668c = true;

    public d(String str) {
        this.f15666a = str;
    }

    @ColorInt
    public int a() {
        return this.f15667b;
    }

    public String b() {
        return this.f15666a;
    }

    public boolean c() {
        return this.f15668c;
    }

    public void d(@ColorInt int i5) {
        this.f15667b = i5;
    }

    public void e(boolean z4) {
        this.f15668c = z4;
    }
}
