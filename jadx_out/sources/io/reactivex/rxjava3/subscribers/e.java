package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.k;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class e<T> implements t<T>, q {

    /* renamed from: g, reason: collision with root package name */
    static final int f18931g = 4;

    /* renamed from: a, reason: collision with root package name */
    final p<? super T> f18932a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f18933b;

    /* renamed from: c, reason: collision with root package name */
    q f18934c;

    /* renamed from: d, reason: collision with root package name */
    boolean f18935d;

    /* renamed from: e, reason: collision with root package name */
    io.reactivex.rxjava3.internal.util.a<Object> f18936e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f18937f;

    public e(p<? super T> pVar) {
        this(pVar, false);
    }

    void a() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f18936e;
                if (aVar == null) {
                    this.f18935d = false;
                    return;
                }
                this.f18936e = null;
            }
        } while (!aVar.b(this.f18932a));
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        this.f18934c.cancel();
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (this.f18937f) {
            return;
        }
        synchronized (this) {
            if (this.f18937f) {
                return;
            }
            if (this.f18935d) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18936e;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18936e = aVar;
                }
                aVar.c(io.reactivex.rxjava3.internal.util.q.complete());
                return;
            }
            this.f18937f = true;
            this.f18935d = true;
            this.f18932a.onComplete();
        }
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        if (this.f18937f) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        synchronized (this) {
            boolean z4 = true;
            if (!this.f18937f) {
                if (this.f18935d) {
                    this.f18937f = true;
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18936e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f18936e = aVar;
                    }
                    Object error = io.reactivex.rxjava3.internal.util.q.error(th);
                    if (this.f18933b) {
                        aVar.c(error);
                    } else {
                        aVar.f(error);
                    }
                    return;
                }
                this.f18937f = true;
                this.f18935d = true;
                z4 = false;
            }
            if (z4) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.f18932a.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(@l3.f T t5) {
        if (this.f18937f) {
            return;
        }
        if (t5 == null) {
            this.f18934c.cancel();
            onError(k.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            if (this.f18937f) {
                return;
            }
            if (this.f18935d) {
                io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18936e;
                if (aVar == null) {
                    aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                    this.f18936e = aVar;
                }
                aVar.c(io.reactivex.rxjava3.internal.util.q.next(t5));
                return;
            }
            this.f18935d = true;
            this.f18932a.onNext(t5);
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(@l3.f q qVar) {
        if (j.validate(this.f18934c, qVar)) {
            this.f18934c = qVar;
            this.f18932a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        this.f18934c.request(j5);
    }

    public e(@l3.f p<? super T> pVar, boolean z4) {
        this.f18932a = pVar;
        this.f18933b = z4;
    }
}
