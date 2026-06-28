package com.bytedance.pangle.log;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f4471a;

    /* renamed from: b, reason: collision with root package name */
    private String f4472b;

    /* renamed from: c, reason: collision with root package name */
    private String f4473c;

    /* renamed from: d, reason: collision with root package name */
    private long f4474d;

    /* renamed from: e, reason: collision with root package name */
    private long f4475e;

    private a(String str, String str2, String str3) {
        this.f4471a = str;
        this.f4472b = str2;
        this.f4473c = str3;
        long currentTimeMillis = System.currentTimeMillis();
        this.f4475e = currentTimeMillis;
        this.f4474d = currentTimeMillis;
        ZeusLogger.i(this.f4471a, this.f4472b + String.format(" watcher[%s]-start", str3));
    }

    public static a a(String str, String str2, String str3) {
        return new a(str, str2, str3);
    }

    public final long a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - this.f4475e;
        long currentTimeMillis2 = System.currentTimeMillis() - this.f4474d;
        ZeusLogger.i(this.f4471a, this.f4472b + String.format(" watcher[%s]-%s cost=%s, total=%s", this.f4473c, str, Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis2)));
        return currentTimeMillis2;
    }

    public final long a() {
        return System.currentTimeMillis() - this.f4474d;
    }
}
