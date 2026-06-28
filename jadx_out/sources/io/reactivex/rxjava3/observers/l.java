package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public final class l<T> implements p0<T>, io.reactivex.rxjava3.disposables.e {

    /* renamed from: a, reason: collision with root package name */
    final p0<? super T> f18727a;

    /* renamed from: b, reason: collision with root package name */
    io.reactivex.rxjava3.disposables.e f18728b;

    /* renamed from: c, reason: collision with root package name */
    boolean f18729c;

    public l(@l3.f p0<? super T> p0Var) {
        this.f18727a = p0Var;
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f18727a.onSubscribe(io.reactivex.rxjava3.internal.disposables.d.INSTANCE);
            try {
                this.f18727a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(nullPointerException, th2));
        }
    }

    void b() {
        this.f18729c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f18727a.onSubscribe(io.reactivex.rxjava3.internal.disposables.d.INSTANCE);
            try {
                this.f18727a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(nullPointerException, th2));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        this.f18728b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f18728b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (this.f18729c) {
            return;
        }
        this.f18729c = true;
        if (this.f18728b == null) {
            a();
            return;
        }
        try {
            this.f18727a.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(@l3.f Throwable th) {
        if (this.f18729c) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18729c = true;
        if (this.f18728b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f18727a.onSubscribe(io.reactivex.rxjava3.internal.disposables.d.INSTANCE);
                try {
                    this.f18727a.onError(new io.reactivex.rxjava3.exceptions.a(th, nullPointerException));
                    return;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = io.reactivex.rxjava3.internal.util.k.b("onError called with a null Throwable.");
        }
        try {
            this.f18727a.onError(th);
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.b.b(th4);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th4));
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(@l3.f T t5) {
        if (this.f18729c) {
            return;
        }
        if (this.f18728b == null) {
            b();
            return;
        }
        if (t5 == null) {
            NullPointerException b5 = io.reactivex.rxjava3.internal.util.k.b("onNext called with a null value.");
            try {
                this.f18728b.dispose();
                onError(b5);
                return;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                onError(new io.reactivex.rxjava3.exceptions.a(b5, th));
                return;
            }
        }
        try {
            this.f18727a.onNext(t5);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            try {
                this.f18728b.dispose();
                onError(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                onError(new io.reactivex.rxjava3.exceptions.a(th2, th3));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f18728b, eVar)) {
            this.f18728b = eVar;
            try {
                this.f18727a.onSubscribe(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18729c = true;
                try {
                    eVar.dispose();
                    io.reactivex.rxjava3.plugins.a.Y(th);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
                }
            }
        }
    }
}
