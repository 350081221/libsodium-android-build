package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class e extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f18550b = new e();

    /* renamed from: c, reason: collision with root package name */
    static final q0.c f18551c = new a();

    /* renamed from: d, reason: collision with root package name */
    static final io.reactivex.rxjava3.disposables.e f18552d;

    /* loaded from: classes3.dex */
    static final class a extends q0.c {
        a() {
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e b(@l3.f Runnable runnable) {
            runnable.run();
            return e.f18552d;
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e d(@l3.f Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return false;
        }
    }

    static {
        io.reactivex.rxjava3.disposables.e j5 = io.reactivex.rxjava3.disposables.e.j();
        f18552d = j5;
        j5.dispose();
    }

    private e() {
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        return f18551c;
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e e(@l3.f Runnable runnable) {
        runnable.run();
        return f18552d;
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e g(@l3.f Runnable runnable, long j5, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e o(@l3.f Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
}
