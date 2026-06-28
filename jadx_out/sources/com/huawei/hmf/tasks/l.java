package com.huawei.hmf.tasks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    private static final l f8103d = new l();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f8105b = com.huawei.hmf.tasks.a.a.a();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f8104a = new a();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8106c = com.huawei.hmf.tasks.a.a.b();

    /* loaded from: classes3.dex */
    static final class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService a() {
        return f8103d.f8105b;
    }

    public static Executor b() {
        return f8103d.f8104a;
    }

    public static Executor c() {
        return f8103d.f8106c;
    }
}
