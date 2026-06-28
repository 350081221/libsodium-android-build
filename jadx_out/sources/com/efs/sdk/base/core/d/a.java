package com.efs.sdk.base.core.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f6584a;

    /* renamed from: b, reason: collision with root package name */
    public byte f6585b;

    /* renamed from: c, reason: collision with root package name */
    public int f6586c = 0;

    /* renamed from: d, reason: collision with root package name */
    public String f6587d = "none";

    /* renamed from: e, reason: collision with root package name */
    public int f6588e = 1;

    /* renamed from: f, reason: collision with root package name */
    long f6589f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f6590g = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, byte b5) {
        this.f6585b = (byte) 2;
        this.f6584a = str;
        if (b5 > 0 && 3 >= b5) {
            this.f6585b = b5;
            return;
        }
        throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b5)));
    }
}
