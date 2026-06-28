package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.internal.util.a;
import io.reactivex.rxjava3.internal.util.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g<T> extends i<T> implements a.InterfaceC0531a<Object> {

    /* renamed from: a, reason: collision with root package name */
    final i<T> f18903a;

    /* renamed from: b, reason: collision with root package name */
    boolean f18904b;

    /* renamed from: c, reason: collision with root package name */
    io.reactivex.rxjava3.internal.util.a<Object> f18905c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f18906d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(i<T> iVar) {
        this.f18903a = iVar;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.g
    public Throwable I8() {
        return this.f18903a.I8();
    }

    @Override // io.reactivex.rxjava3.subjects.i
    public boolean J8() {
        return this.f18903a.J8();
    }

    @Override // io.reactivex.rxjava3.subjects.i
    public boolean K8() {
        return this.f18903a.K8();
    }

    @Override // io.reactivex.rxjava3.subjects.i
    public boolean L8() {
        return this.f18903a.L8();
    }

    void N8() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f18905c;
                if (aVar == null) {
                    this.f18904b = false;
                    return;
                }
                this.f18905c = null;
            }
            aVar.d(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        this.f18903a.subscribe(p0Var);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (this.f18906d) {
            return;
        }
        synchronized (this) {
            if (this.f18906d) {
                return;
            }
            this.f18906d = true;
            if (this.f18904b) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18905c;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18905c = aVar;
                }
                aVar.c(q.complete());
                return;
            }
            this.f18904b = true;
            this.f18903a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        if (this.f18906d) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        synchronized (this) {
            boolean z4 = true;
            if (!this.f18906d) {
                this.f18906d = true;
                if (this.f18904b) {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18905c;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f18905c = aVar;
                    }
                    aVar.f(q.error(th));
                    return;
                }
                this.f18904b = true;
                z4 = false;
            }
            if (z4) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18903a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        if (this.f18906d) {
            return;
        }
        synchronized (this) {
            if (this.f18906d) {
                return;
            }
            if (this.f18904b) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18905c;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18905c = aVar;
                }
                aVar.c(q.next(t5));
                return;
            }
            this.f18904b = true;
            this.f18903a.onNext(t5);
            N8();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        boolean z4 = true;
        if (!this.f18906d) {
            synchronized (this) {
                if (!this.f18906d) {
                    if (this.f18904b) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18905c;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                            this.f18905c = aVar;
                        }
                        aVar.c(q.disposable(eVar));
                        return;
                    }
                    this.f18904b = true;
                    z4 = false;
                }
            }
        }
        if (z4) {
            eVar.dispose();
        } else {
            this.f18903a.onSubscribe(eVar);
            N8();
        }
    }

    @Override // io.reactivex.rxjava3.internal.util.a.InterfaceC0531a, m3.r
    public boolean test(Object obj) {
        return q.acceptFull(obj, this.f18903a);
    }
}
