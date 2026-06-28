package io.reactivex.rxjava3.internal.operators.completable;

/* loaded from: classes3.dex */
public final class k0 extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f16529a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f16530b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super Throwable> f16531c;

    /* renamed from: d, reason: collision with root package name */
    final m3.a f16532d;

    /* renamed from: e, reason: collision with root package name */
    final m3.a f16533e;

    /* renamed from: f, reason: collision with root package name */
    final m3.a f16534f;

    /* renamed from: g, reason: collision with root package name */
    final m3.a f16535g;

    /* loaded from: classes3.dex */
    final class a implements io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16536a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f16537b;

        a(io.reactivex.rxjava3.core.f fVar) {
            this.f16536a = fVar;
        }

        void a() {
            try {
                k0.this.f16534f.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            try {
                k0.this.f16535g.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            this.f16537b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16537b.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onComplete() {
            if (this.f16537b == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                return;
            }
            try {
                k0.this.f16532d.run();
                k0.this.f16533e.run();
                this.f16536a.onComplete();
                a();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f16536a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onError(Throwable th) {
            if (this.f16537b == io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            try {
                k0.this.f16531c.accept(th);
                k0.this.f16533e.run();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f16536a.onError(th);
            a();
        }

        @Override // io.reactivex.rxjava3.core.f
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            try {
                k0.this.f16530b.accept(eVar);
                if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16537b, eVar)) {
                    this.f16537b = eVar;
                    this.f16536a.onSubscribe(this);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                eVar.dispose();
                this.f16537b = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
                io.reactivex.rxjava3.internal.disposables.d.error(th, this.f16536a);
            }
        }
    }

    public k0(io.reactivex.rxjava3.core.i iVar, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.a aVar2, m3.a aVar3, m3.a aVar4) {
        this.f16529a = iVar;
        this.f16530b = gVar;
        this.f16531c = gVar2;
        this.f16532d = aVar;
        this.f16533e = aVar2;
        this.f16534f = aVar3;
        this.f16535g = aVar4;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        this.f16529a.a(new a(fVar));
    }
}
