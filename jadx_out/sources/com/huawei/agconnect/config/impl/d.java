package com.huawei.agconnect.config.impl;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f7764a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7765b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7766c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7767d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7768e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7769f;

    /* renamed from: g, reason: collision with root package name */
    private int f7770g;

    public d(String str, String str2, String str3, String str4, String str5, int i5) {
        this.f7770g = 0;
        this.f7764a = str;
        this.f7765b = str2;
        this.f7766c = str3;
        this.f7767d = str4;
        this.f7768e = str5;
        this.f7769f = i5;
        if (str != null) {
            this.f7770g = str.length() / 2;
        }
    }

    public boolean a() {
        return (TextUtils.isEmpty(this.f7764a) || TextUtils.isEmpty(this.f7765b) || TextUtils.isEmpty(this.f7766c) || TextUtils.isEmpty(this.f7767d) || this.f7764a.length() != this.f7765b.length() || this.f7765b.length() != this.f7766c.length() || this.f7766c.length() != this.f7770g * 2 || this.f7769f < 0 || TextUtils.isEmpty(this.f7768e)) ? false : true;
    }

    public String b() {
        return this.f7764a;
    }

    public String c() {
        return this.f7765b;
    }

    public String d() {
        return this.f7766c;
    }

    public String e() {
        return this.f7767d;
    }

    public String f() {
        return this.f7768e;
    }

    public int g() {
        return this.f7769f;
    }

    public int h() {
        return this.f7770g;
    }
}
