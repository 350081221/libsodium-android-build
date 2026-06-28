package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.t;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class m<T> extends io.reactivex.rxjava3.parallel.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.parallel.b<T> f18286a;

    /* renamed from: b, reason: collision with root package name */
    final m3.g<? super T> f18287b;

    /* renamed from: c, reason: collision with root package name */
    final m3.g<? super T> f18288c;

    /* renamed from: d, reason: collision with root package name */
    final m3.g<? super Throwable> f18289d;

    /* renamed from: e, reason: collision with root package name */
    final m3.a f18290e;

    /* renamed from: f, reason: collision with root package name */
    final m3.a f18291f;

    /* renamed from: g, reason: collision with root package name */
    final m3.g<? super org.reactivestreams.q> f18292g;

    /* renamed from: h, reason: collision with root package name */
    final m3.q f18293h;

    /* renamed from: i, reason: collision with root package name */
    final m3.a f18294i;

    /* loaded from: classes3.dex */
    static final class a<T> implements t<T>, org.reactivestreams.q {

        /* renamed from: a, reason: collision with root package name */
        final org.reactivestreams.p<? super T> f18295a;

        /* renamed from: b, reason: collision with root package name */
        final m<T> f18296b;

        /* renamed from: c, reason: collision with root package name */
        org.reactivestreams.q f18297c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18298d;

        a(org.reactivestreams.p<? super T> pVar, m<T> mVar) {
            this.f18295a = pVar;
            this.f18296b = mVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            try {
                this.f18296b.f18294i.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            this.f18297c.cancel();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.f18298d) {
                this.f18298d = true;
                try {
                    this.f18296b.f18290e.run();
                    this.f18295a.onComplete();
                    try {
                        this.f18296b.f18291f.run();
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        io.reactivex.rxjava3.plugins.a.Y(th);
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    this.f18295a.onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.f18298d) {
                io.reactivex.rxjava3.plugins.a.Y(th);
                return;
            }
            this.f18298d = true;
            try {
                this.f18296b.f18289d.accept(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                th = new io.reactivex.rxjava3.exceptions.a(th, th2);
            }
            this.f18295a.onError(th);
            try {
                this.f18296b.f18291f.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.b.b(th3);
                io.reactivex.rxjava3.plugins.a.Y(th3);
            }
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.f18298d) {
                try {
                    this.f18296b.f18287b.accept(t5);
                    this.f18295a.onNext(t5);
                    try {
                        this.f18296b.f18288c.accept(t5);
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.b.b(th);
                        onError(th);
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18297c, qVar)) {
                this.f18297c = qVar;
                try {
                    this.f18296b.f18292g.accept(qVar);
                    this.f18295a.onSubscribe(this);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    qVar.cancel();
                    this.f18295a.onSubscribe(io.reactivex.rxjava3.internal.subscriptions.g.INSTANCE);
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            try {
                this.f18296b.f18293h.a(j5);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
            this.f18297c.request(j5);
        }
    }

    public m(io.reactivex.rxjava3.parallel.b<T> bVar, m3.g<? super T> gVar, m3.g<? super T> gVar2, m3.g<? super Throwable> gVar3, m3.a aVar, m3.a aVar2, m3.g<? super org.reactivestreams.q> gVar4, m3.q qVar, m3.a aVar3) {
        this.f18286a = bVar;
        Objects.requireNonNull(gVar, "onNext is null");
        this.f18287b = gVar;
        Objects.requireNonNull(gVar2, "onAfterNext is null");
        this.f18288c = gVar2;
        Objects.requireNonNull(gVar3, "onError is null");
        this.f18289d = gVar3;
        Objects.requireNonNull(aVar, "onComplete is null");
        this.f18290e = aVar;
        Objects.requireNonNull(aVar2, "onAfterTerminated is null");
        this.f18291f = aVar2;
        Objects.requireNonNull(gVar4, "onSubscribe is null");
        this.f18292g = gVar4;
        Objects.requireNonNull(qVar, "onRequest is null");
        this.f18293h = qVar;
        Objects.requireNonNull(aVar3, "onCancel is null");
        this.f18294i = aVar3;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18286a.M();
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super T>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        org.reactivestreams.p<? super T>[] pVarArr2 = new org.reactivestreams.p[length];
        for (int i5 = 0; i5 < length; i5++) {
            pVarArr2[i5] = new a(pVarArr[i5], this);
        }
        this.f18286a.X(pVarArr2);
    }
}
