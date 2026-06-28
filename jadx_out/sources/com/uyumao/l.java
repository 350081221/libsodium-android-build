package com.uyumao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static l f13680a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f13681b;

    public static l a() {
        if (f13680a == null) {
            synchronized (l.class) {
                if (f13680a == null) {
                    f13680a = new l();
                }
            }
        }
        return f13680a;
    }

    public ExecutorService b() {
        if (this.f13681b == null) {
            synchronized (l.class) {
                if (this.f13681b == null) {
                    this.f13681b = Executors.newSingleThreadExecutor();
                }
            }
        }
        return this.f13681b;
    }
}
