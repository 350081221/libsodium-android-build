package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final i0<T> f17509a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f17510b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17511c;

    /* loaded from: classes3.dex */
    static final class a<T> implements p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: h, reason: collision with root package name */
        static final C0496a f17512h = new C0496a(null);

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f17513a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f17514b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f17515c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.util.c f17516d = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0496a> f17517e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f17518f;

        /* renamed from: g, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17519g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0496a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = -8003404460084760287L;
            final a<?> parent;

            C0496a(a<?> aVar) {
                this.parent = aVar;
            }

            void dispose() {
                io.reactivex.rxjava3.internal.disposables.c.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onComplete() {
                this.parent.b(this);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onError(Throwable th) {
                this.parent.c(this, th);
            }

            @Override // io.reactivex.rxjava3.core.f
            public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
                io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar);
            }
        }

        a(io.reactivex.rxjava3.core.f fVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4) {
            this.f17513a = fVar;
            this.f17514b = oVar;
            this.f17515c = z4;
        }

        void a() {
            AtomicReference<C0496a> atomicReference = this.f17517e;
            C0496a c0496a = f17512h;
            C0496a andSet = atomicReference.getAndSet(c0496a);
            if (andSet != null && andSet != c0496a) {
                andSet.dispose();
            }
        }

        void b(C0496a c0496a) {
            if (androidx.compose.animation.core.h.a(this.f17517e, c0496a, null) && this.f17518f) {
                this.f17516d.tryTerminateConsumer(this.f17513a);
            }
        }

        void c(C0496a c0496a, Throwable th) {
            if (androidx.compose.animation.core.h.a(this.f17517e, c0496a, null)) {
                if (this.f17516d.tryAddThrowableOrReport(th)) {
                    if (this.f17515c) {
                        if (this.f17518f) {
                            this.f17516d.tryTerminateConsumer(this.f17513a);
                            return;
                        }
                        return;
                    } else {
                        this.f17519g.dispose();
                        a();
                        this.f17516d.tryTerminateConsumer(this.f17513a);
                        return;
                    }
                }
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17519g.dispose();
            a();
            this.f17516d.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17517e.get() == f17512h;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            this.f17518f = true;
            if (this.f17517e.get() == null) {
                this.f17516d.tryTerminateConsumer(this.f17513a);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (this.f17516d.tryAddThrowableOrReport(th)) {
                if (this.f17515c) {
                    onComplete();
                } else {
                    a();
                    this.f17516d.tryTerminateConsumer(this.f17513a);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            C0496a c0496a;
            try {
                io.reactivex.rxjava3.core.i apply = this.f17514b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.i iVar = apply;
                C0496a c0496a2 = new C0496a(this);
                do {
                    c0496a = this.f17517e.get();
                    if (c0496a == f17512h) {
                        return;
                    }
                } while (!androidx.compose.animation.core.h.a(this.f17517e, c0496a, c0496a2));
                if (c0496a != null) {
                    c0496a.dispose();
                }
                iVar.a(c0496a2);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17519g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17519g, eVar)) {
                this.f17519g = eVar;
                this.f17513a.onSubscribe(this);
            }
        }
    }

    public t(i0<T> i0Var, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4) {
        this.f17509a = i0Var;
        this.f17510b = oVar;
        this.f17511c = z4;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        if (!w.a(this.f17509a, this.f17510b, fVar)) {
            this.f17509a.subscribe(new a(fVar, this.f17510b, this.f17511c));
        }
    }
}
