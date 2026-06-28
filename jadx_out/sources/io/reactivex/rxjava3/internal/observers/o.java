package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public final class o<T> implements p0<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    final p0<? super T> f16432a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super io.reactivex.rxjava3.disposables.e> f16433b;

    /* renamed from: c, reason: collision with root package name */
    final m3.a f16434c;

    /* renamed from: d, reason: collision with root package name */
    io.reactivex.rxjava3.disposables.e f16435d;

    public o(p0<? super T> p0Var, m3.g<? super io.reactivex.rxjava3.disposables.e> gVar, m3.a aVar) {
        this.f16432a = p0Var;
        this.f16433b = gVar;
        this.f16434c = aVar;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        io.reactivex.rxjava3.disposables.e eVar = this.f16435d;
        io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        if (eVar != cVar) {
            this.f16435d = cVar;
            try {
                this.f16434c.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            eVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f16435d.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        io.reactivex.rxjava3.disposables.e eVar = this.f16435d;
        io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        if (eVar != cVar) {
            this.f16435d = cVar;
            this.f16432a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.e eVar = this.f16435d;
        io.reactivex.rxjava3.internal.disposables.c cVar = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
        if (eVar != cVar) {
            this.f16435d = cVar;
            this.f16432a.onError(th);
        } else {
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        this.f16432a.onNext(t5);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        try {
            this.f16433b.accept(eVar);
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16435d, eVar)) {
                this.f16435d = eVar;
                this.f16432a.onSubscribe(this);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            eVar.dispose();
            this.f16435d = io.reactivex.rxjava3.internal.disposables.c.DISPOSED;
            io.reactivex.rxjava3.internal.disposables.d.error(th, this.f16432a);
        }
    }
}
