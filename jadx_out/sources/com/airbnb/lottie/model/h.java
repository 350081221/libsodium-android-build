package com.airbnb.lottie.model;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f1508d = "\r";

    /* renamed from: a, reason: collision with root package name */
    private final String f1509a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1510b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1511c;

    public h(String str, float f5, float f6) {
        this.f1509a = str;
        this.f1511c = f6;
        this.f1510b = f5;
    }

    public float a() {
        return this.f1511c;
    }

    public String b() {
        return this.f1509a;
    }

    public float c() {
        return this.f1510b;
    }

    public boolean d(String str) {
        if (this.f1509a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f1509a.endsWith(f1508d)) {
            String str2 = this.f1509a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
