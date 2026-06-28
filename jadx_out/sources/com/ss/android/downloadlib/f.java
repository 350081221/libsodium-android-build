package com.ss.android.downloadlib;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f10045a;

    /* renamed from: b, reason: collision with root package name */
    private com.ss.android.download.api.config.f f10046b = null;

    private f() {
    }

    public static f a() {
        if (f10045a == null) {
            synchronized (f.class) {
                if (f10045a == null) {
                    f10045a = new f();
                }
            }
        }
        return f10045a;
    }

    public com.ss.android.download.api.config.f b() {
        return this.f10046b;
    }
}
