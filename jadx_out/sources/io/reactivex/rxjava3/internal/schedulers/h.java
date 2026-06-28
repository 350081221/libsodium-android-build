package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class h extends q0 {

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f18586b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f18583c = "RxNewThreadScheduler";

    /* renamed from: e, reason: collision with root package name */
    private static final String f18585e = "rx3.newthread-priority";

    /* renamed from: d, reason: collision with root package name */
    private static final k f18584d = new k(f18583c, Math.max(1, Math.min(10, Integer.getInteger(f18585e, 5).intValue())));

    public h() {
        this(f18584d);
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        return new i(this.f18586b);
    }

    public h(ThreadFactory threadFactory) {
        this.f18586b = threadFactory;
    }
}
