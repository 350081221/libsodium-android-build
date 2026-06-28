package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.util.q;
import org.reactivestreams.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g<T> extends c<T> {

    /* renamed from: b, reason: collision with root package name */
    final c<T> f18822b;

    /* renamed from: c, reason: collision with root package name */
    boolean f18823c;

    /* renamed from: d, reason: collision with root package name */
    io.reactivex.rxjava3.internal.util.a<Object> f18824d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f18825e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(c<T> cVar) {
        this.f18822b = cVar;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(p<? super T> pVar) {
        this.f18822b.subscribe(pVar);
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.g
    public Throwable n9() {
        return this.f18822b.n9();
    }

    @Override // io.reactivex.rxjava3.processors.c
    public boolean o9() {
        return this.f18822b.o9();
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (this.f18825e) {
            return;
        }
        synchronized (this) {
            if (this.f18825e) {
                return;
            }
            this.f18825e = true;
            if (this.f18823c) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18824d;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18824d = aVar;
                }
                aVar.c(q.complete());
                return;
            }
            this.f18823c = true;
            this.f18822b.onComplete();
        }
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        if (this.f18825e) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        synchronized (this) {
            boolean z4 = true;
            if (!this.f18825e) {
                this.f18825e = true;
                if (this.f18823c) {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18824d;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f18824d = aVar;
                    }
                    aVar.f(q.error(th));
                    return;
                }
                this.f18823c = true;
                z4 = false;
            }
            if (z4) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18822b.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        if (this.f18825e) {
            return;
        }
        synchronized (this) {
            if (this.f18825e) {
                return;
            }
            if (this.f18823c) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18824d;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18824d = aVar;
                }
                aVar.c(q.next(t5));
                return;
            }
            this.f18823c = true;
            this.f18822b.onNext(t5);
            s9();
        }
    }

    @Override // org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        boolean z4 = true;
        if (!this.f18825e) {
            synchronized (this) {
                if (!this.f18825e) {
                    if (this.f18823c) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18824d;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                            this.f18824d = aVar;
                        }
                        aVar.c(q.subscription(qVar));
                        return;
                    }
                    this.f18823c = true;
                    z4 = false;
                }
            }
        }
        if (z4) {
            qVar.cancel();
        } else {
            this.f18822b.onSubscribe(qVar);
            s9();
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    public boolean p9() {
        return this.f18822b.p9();
    }

    @Override // io.reactivex.rxjava3.processors.c
    public boolean q9() {
        return this.f18822b.q9();
    }

    void s9() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f18824d;
                if (aVar == null) {
                    this.f18823c = false;
                    return;
                }
                this.f18824d = null;
            }
            aVar.b(this.f18822b);
        }
    }
}
