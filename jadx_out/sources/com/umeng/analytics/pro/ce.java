package com.umeng.analytics.pro;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class ce implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12380a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f12381b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12382c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12383d;

    public ce(byte b5, boolean z4) {
        this.f12381b = b5;
        this.f12380a = false;
        this.f12382c = null;
        this.f12383d = z4;
    }

    public boolean a() {
        return this.f12380a;
    }

    public String b() {
        return this.f12382c;
    }

    public boolean c() {
        return this.f12381b == 12;
    }

    public boolean d() {
        byte b5 = this.f12381b;
        return b5 == 15 || b5 == 13 || b5 == 14;
    }

    public boolean e() {
        return this.f12383d;
    }

    public ce(byte b5) {
        this(b5, false);
    }

    public ce(byte b5, String str) {
        this.f12381b = b5;
        this.f12380a = true;
        this.f12382c = str;
        this.f12383d = false;
    }
}
