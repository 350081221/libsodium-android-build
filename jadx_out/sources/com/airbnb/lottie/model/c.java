package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1396a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1397b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1398c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1399d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private Typeface f1400e;

    public c(String str, String str2, String str3, float f5) {
        this.f1396a = str;
        this.f1397b = str2;
        this.f1398c = str3;
        this.f1399d = f5;
    }

    float a() {
        return this.f1399d;
    }

    public String b() {
        return this.f1396a;
    }

    public String c() {
        return this.f1397b;
    }

    public String d() {
        return this.f1398c;
    }

    @Nullable
    public Typeface e() {
        return this.f1400e;
    }

    public void f(@Nullable Typeface typeface) {
        this.f1400e = typeface;
    }
}
