package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class q extends q0 implements io.reactivex.rxjava3.disposables.e {

    /* renamed from: e, reason: collision with root package name */
    static final io.reactivex.rxjava3.disposables.e f18595e = new g();

    /* renamed from: f, reason: collision with root package name */
    static final io.reactivex.rxjava3.disposables.e f18596f = io.reactivex.rxjava3.disposables.e.h();

    /* renamed from: b, reason: collision with root package name */
    private final q0 f18597b;

    /* renamed from: c, reason: collision with root package name */
    private final io.reactivex.rxjava3.processors.c<io.reactivex.rxjava3.core.o<io.reactivex.rxjava3.core.c>> f18598c;

    /* renamed from: d, reason: collision with root package name */
    private io.reactivex.rxjava3.disposables.e f18599d;

    /* loaded from: classes3.dex */
    static final class a implements m3.o<f, io.reactivex.rxjava3.core.c> {

        /* renamed from: a, reason: collision with root package name */
        final q0.c f18600a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.schedulers.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0530a extends io.reactivex.rxjava3.core.c {

            /* renamed from: a, reason: collision with root package name */
            final f f18601a;

            C0530a(f fVar) {
                this.f18601a = fVar;
            }

            @Override // io.reactivex.rxjava3.core.c
            protected void Y0(io.reactivex.rxjava3.core.f fVar) {
                fVar.onSubscribe(this.f18601a);
                this.f18601a.call(a.this.f18600a, fVar);
            }
        }

        a(q0.c cVar) {
            this.f18600a = cVar;
        }

        @Override // m3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.core.c apply(f fVar) {
            return new C0530a(fVar);
        }
    }

    /* loaded from: classes3.dex */
    static class b extends f {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        b(Runnable runnable, long j5, TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j5;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.q.f
        protected io.reactivex.rxjava3.disposables.e callActual(q0.c cVar, io.reactivex.rxjava3.core.f fVar) {
            return cVar.c(new d(this.action, fVar), this.delayTime, this.unit);
        }
    }

    /* loaded from: classes3.dex */
    static class c extends f {
        private final Runnable action;

        c(Runnable runnable) {
            this.action = runnable;
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.q.f
        protected io.reactivex.rxjava3.disposables.e callActual(q0.c cVar, io.reactivex.rxjava3.core.f fVar) {
            return cVar.b(new d(this.action, fVar));
        }
    }

    /* loaded from: classes3.dex */
    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f18603a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f18604b;

        d(Runnable runnable, io.reactivex.rxjava3.core.f fVar) {
            this.f18604b = runnable;
            this.f18603a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18604b.run();
            } finally {
                this.f18603a.onComplete();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class e extends q0.c {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f18605a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        private final io.reactivex.rxjava3.processors.c<f> f18606b;

        /* renamed from: c, reason: collision with root package name */
        private final q0.c f18607c;

        e(io.reactivex.rxjava3.processors.c<f> cVar, q0.c cVar2) {
            this.f18606b = cVar;
            this.f18607c = cVar2;
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e b(@l3.f Runnable runnable) {
            c cVar = new c(runnable);
            this.f18606b.onNext(cVar);
            return cVar;
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
            b bVar = new b(runnable, j5, timeUnit);
            this.f18606b.onNext(bVar);
            return bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (this.f18605a.compareAndSet(false, true)) {
                this.f18606b.onComplete();
                this.f18607c.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18605a.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class f extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.disposables.e {
        f() {
            super(q.f18595e);
        }

        void call(q0.c cVar, io.reactivex.rxjava3.core.f fVar) {
            io.reactivex.rxjava3.disposables.e eVar;
            io.reactivex.rxjava3.disposables.e eVar2 = get();
            if (eVar2 == q.f18596f || eVar2 != (eVar = q.f18595e)) {
                return;
            }
            io.reactivex.rxjava3.disposables.e callActual = callActual(cVar, fVar);
            if (!compareAndSet(eVar, callActual)) {
                callActual.dispose();
            }
        }

        protected abstract io.reactivex.rxjava3.disposables.e callActual(q0.c cVar, io.reactivex.rxjava3.core.f fVar);

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            getAndSet(q.f18596f).dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    /* loaded from: classes3.dex */
    static final class g implements io.reactivex.rxjava3.disposables.e {
        g() {
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(m3.o<io.reactivex.rxjava3.core.o<io.reactivex.rxjava3.core.o<io.reactivex.rxjava3.core.c>>, io.reactivex.rxjava3.core.c> oVar, q0 q0Var) {
        this.f18597b = q0Var;
        io.reactivex.rxjava3.processors.c r9 = io.reactivex.rxjava3.processors.h.t9().r9();
        this.f18598c = r9;
        try {
            this.f18599d = ((io.reactivex.rxjava3.core.c) oVar.apply(r9)).V0();
        } catch (Throwable th) {
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        q0.c c5 = this.f18597b.c();
        io.reactivex.rxjava3.processors.c<T> r9 = io.reactivex.rxjava3.processors.h.t9().r9();
        io.reactivex.rxjava3.core.o<io.reactivex.rxjava3.core.c> g42 = r9.g4(new a(c5));
        e eVar = new e(r9, c5);
        this.f18598c.onNext(g42);
        return eVar;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        this.f18599d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f18599d.isDisposed();
    }
}
