package com.tencent.mm.opensdk.diffdev.a;

/* loaded from: classes3.dex */
public enum d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);


    /* renamed from: a, reason: collision with root package name */
    private int f11279a;

    d(int i5) {
        this.f11279a = i5;
    }

    public int a() {
        return this.f11279a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f11279a;
    }
}
