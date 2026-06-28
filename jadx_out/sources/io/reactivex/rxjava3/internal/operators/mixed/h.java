package io.reactivex.rxjava3.internal.operators.mixed;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f17465a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f17466b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17467c;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: h, reason: collision with root package name */
        static final C0490a f17468h = new C0490a(null);

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f17469a;

        /* renamed from: b, reason: collision with root package name */
        final m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> f17470b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f17471c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.rxjava3.internal.util.c f17472d = new io.reactivex.rxjava3.internal.util.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0490a> f17473e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f17474f;

        /* renamed from: g, reason: collision with root package name */
        org.reactivestreams.q f17475g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0490a extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.f {
            private static final long serialVersionUID = -8003404460084760287L;
            final a<?> parent;

            C0490a(a<?> aVar) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(io.reactivex.rxjava3.core.f fVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar, boolean z4) {
            this.f17469a = fVar;
            this.f17470b = oVar;
            this.f17471c = z4;
        }

        void a() {
            AtomicReference<C0490a> atomicReference = this.f17473e;
            C0490a c0490a = f17468h;
            C0490a andSet = atomicReference.getAndSet(c0490a);
            if (andSet != null && andSet != c0490a) {
                andSet.dispose();
            }
        }

        void b(C0490a c0490a) {
            if (androidx.compose.animation.core.h.a(this.f17473e, c0490a, null) && this.f17474f) {
                this.f17472d.tryTerminateConsumer(this.f17469a);
            }
        }

        void c(C0490a c0490a, Throwable th) {
            if (androidx.compose.animation.core.h.a(this.f17473e, c0490a, null)) {
                if (this.f17472d.tryAddThrowableOrReport(th)) {
                    if (this.f17471c) {
                        if (this.f17474f) {
                            this.f17472d.tryTerminateConsumer(this.f17469a);
                            return;
                        }
                        return;
                    } else {
                        this.f17475g.cancel();
                        a();
                        this.f17472d.tryTerminateConsumer(this.f17469a);
                        return;
                    }
                }
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17475g.cancel();
            a();
            this.f17472d.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17473e.get() == f17468h;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f17474f = true;
            if (this.f17473e.get() == null) {
                this.f17472d.tryTerminateConsumer(this.f17469a);
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f17472d.tryAddThrowableOrReport(th)) {
                if (this.f17471c) {
                    onComplete();
                } else {
                    a();
                    this.f17472d.tryTerminateConsumer(this.f17469a);
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            C0490a c0490a;
            try {
                io.reactivex.rxjava3.core.i apply = this.f17470b.apply(t5);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                io.reactivex.rxjava3.core.i iVar = apply;
                C0490a c0490a2 = new C0490a(this);
                do {
                    c0490a = this.f17473e.get();
                    if (c0490a == f17468h) {
                        return;
                    }
                } while (!androidx.compose.animation.core.h.a(this.f17473e, c0490a, c0490a2));
                if (c0490a != null) {
                    c0490a.dispose();
                }
                iVar.a(c0490a2);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17475g.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f17475g, qVar)) {
                this.f17475g = qVar;
                this.f17469a.onSubscribe(this);
                qVar.request(Long.MAX_VALUE);
            }
        }
    }

    public h(io.reactivex.rxjava3.core.o<T> oVar, m3.o<? super T, ? extends io.reactivex.rxjava3.core.i> oVar2, boolean z4) {
        this.f17465a = oVar;
        this.f17466b = oVar2;
        this.f17467c = z4;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f17465a.N6(new a(fVar, this.f17466b, this.f17467c));
    }
}
