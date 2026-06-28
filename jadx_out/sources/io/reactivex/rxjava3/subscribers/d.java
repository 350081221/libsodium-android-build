package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.subscriptions.g;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.k;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class d<T> implements t<T>, q {

    /* renamed from: a, reason: collision with root package name */
    final p<? super T> f18928a;

    /* renamed from: b, reason: collision with root package name */
    q f18929b;

    /* renamed from: c, reason: collision with root package name */
    boolean f18930c;

    public d(@l3.f p<? super T> pVar) {
        this.f18928a = pVar;
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f18928a.onSubscribe(g.INSTANCE);
            try {
                this.f18928a.onError(nullPointerException);
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
        this.f18930c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f18928a.onSubscribe(g.INSTANCE);
            try {
                this.f18928a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(nullPointerException, th2));
        }
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        try {
            this.f18929b.cancel();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (this.f18930c) {
            return;
        }
        this.f18930c = true;
        if (this.f18929b == null) {
            a();
            return;
        }
        try {
            this.f18928a.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    @Override // org.reactivestreams.p
    public void onError(@l3.f Throwable th) {
        if (this.f18930c) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18930c = true;
        if (this.f18929b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.f18928a.onSubscribe(g.INSTANCE);
                try {
                    this.f18928a.onError(new io.reactivex.rxjava3.exceptions.a(th, nullPointerException));
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
            th = k.b("onError called with a null Throwable.");
        }
        try {
            this.f18928a.onError(th);
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.b.b(th4);
            io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th4));
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(@l3.f T t5) {
        if (this.f18930c) {
            return;
        }
        if (this.f18929b == null) {
            b();
            return;
        }
        if (t5 == null) {
            NullPointerException b5 = k.b("onNext called with a null Throwable.");
            try {
                this.f18929b.cancel();
                onError(b5);
                return;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                onError(new io.reactivex.rxjava3.exceptions.a(b5, th));
                return;
            }
        }
        try {
            this.f18928a.onNext(t5);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.b.b(th2);
            try {
                this.f18929b.cancel();
                onError(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                onError(new io.reactivex.rxjava3.exceptions.a(th2, th3));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(@l3.f q qVar) {
        if (j.validate(this.f18929b, qVar)) {
            this.f18929b = qVar;
            try {
                this.f18928a.onSubscribe(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f18930c = true;
                try {
                    qVar.cancel();
                    io.reactivex.rxjava3.plugins.a.Y(th);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        try {
            this.f18929b.request(j5);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            try {
                this.f18929b.cancel();
                io.reactivex.rxjava3.plugins.a.Y(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
            }
        }
    }
}
