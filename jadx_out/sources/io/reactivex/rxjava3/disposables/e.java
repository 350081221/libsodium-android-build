package io.reactivex.rxjava3.disposables;

import java.util.Objects;
import java.util.concurrent.Future;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public interface e {
    @l3.f
    static e f(@l3.f Future<?> future, boolean z4) {
        Objects.requireNonNull(future, "future is null");
        return new g(future, z4);
    }

    @l3.f
    static e h() {
        return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
    }

    @l3.f
    static e i(@l3.f Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return f(future, true);
    }

    @l3.f
    static e j() {
        return m(io.reactivex.rxjava3.internal.functions.a.f16250b);
    }

    @l3.f
    static e k(@l3.f q qVar) {
        Objects.requireNonNull(qVar, "subscription is null");
        return new k(qVar);
    }

    @l3.f
    static AutoCloseable l(@l3.f final e eVar) {
        Objects.requireNonNull(eVar, "disposable is null");
        return new AutoCloseable() { // from class: io.reactivex.rxjava3.disposables.d
            @Override // java.lang.AutoCloseable
            public final void close() {
                e.this.dispose();
            }
        };
    }

    @l3.f
    static e m(@l3.f Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new i(runnable);
    }

    @l3.f
    static e n(@l3.f AutoCloseable autoCloseable) {
        Objects.requireNonNull(autoCloseable, "autoCloseable is null");
        return new b(autoCloseable);
    }

    @l3.f
    static e p(@l3.f m3.a aVar) {
        Objects.requireNonNull(aVar, "action is null");
        return new a(aVar);
    }

    void dispose();

    boolean isDisposed();
}
