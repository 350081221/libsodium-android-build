package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.internal.util.q;

/* loaded from: classes3.dex */
public final class m<T> implements p0<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: g, reason: collision with root package name */
    static final int f18730g = 4;

    /* renamed from: a, reason: collision with root package name */
    final p0<? super T> f18731a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f18732b;

    /* renamed from: c, reason: collision with root package name */
    io.reactivex.rxjava3.disposables.e f18733c;

    /* renamed from: d, reason: collision with root package name */
    boolean f18734d;

    /* renamed from: e, reason: collision with root package name */
    io.reactivex.rxjava3.internal.util.a<Object> f18735e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f18736f;

    public m(@l3.f p0<? super T> p0Var) {
        this(p0Var, false);
    }

    void a() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f18735e;
                if (aVar == null) {
                    this.f18734d = false;
                    return;
                }
                this.f18735e = null;
            }
        } while (!aVar.a(this.f18731a));
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        this.f18736f = true;
        this.f18733c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f18733c.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (this.f18736f) {
            return;
        }
        synchronized (this) {
            if (this.f18736f) {
                return;
            }
            if (this.f18734d) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18735e;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18735e = aVar;
                }
                aVar.c(q.complete());
                return;
            }
            this.f18736f = true;
            this.f18734d = true;
            this.f18731a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(@l3.f Throwable th) {
        if (this.f18736f) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        synchronized (this) {
            boolean z4 = true;
            if (!this.f18736f) {
                if (this.f18734d) {
                    this.f18736f = true;
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18735e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f18735e = aVar;
                    }
                    Object error = q.error(th);
                    if (this.f18732b) {
                        aVar.c(error);
                    } else {
                        aVar.f(error);
                    }
                    return;
                }
                this.f18736f = true;
                this.f18734d = true;
                z4 = false;
            }
            if (z4) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18731a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(@l3.f T t5) {
        if (this.f18736f) {
            return;
        }
        if (t5 == null) {
            this.f18733c.dispose();
            onError(io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            if (this.f18736f) {
                return;
            }
            if (this.f18734d) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18735e;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18735e = aVar;
                }
                aVar.c(q.next(t5));
                return;
            }
            this.f18734d = true;
            this.f18731a.onNext(t5);
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18733c, eVar)) {
            this.f18733c = eVar;
            this.f18731a.onSubscribe(this);
        }
    }

    public m(@l3.f p0<? super T> p0Var, boolean z4) {
        this.f18731a = p0Var;
        this.f18732b = z4;
    }
}
