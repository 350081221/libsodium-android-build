package com.huawei.secure.android.common.util;

/* loaded from: classes3.dex */
public class k extends Exception {

    /* renamed from: c, reason: collision with root package name */
    private static final long f9070c = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f9071a;

    /* renamed from: b, reason: collision with root package name */
    private String f9072b;

    public k() {
    }

    public String getMsgDes() {
        return this.f9072b;
    }

    public String getRetCd() {
        return this.f9071a;
    }

    public k(Throwable th) {
        super(th);
    }

    public k(String str, Throwable th) {
        super(str, th);
    }

    public k(String str) {
        super(str);
        this.f9072b = str;
    }

    public k(String str, String str2) {
        this.f9071a = str;
        this.f9072b = str2;
    }
}
