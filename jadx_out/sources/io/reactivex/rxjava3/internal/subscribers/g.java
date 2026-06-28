package io.reactivex.rxjava3.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T>, org.reactivestreams.q, io.reactivex.rxjava3.disposables.e, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7251123623727029452L;
    final int bufferSize;
    int consumed;
    final int limit;
    final m3.a onComplete;
    final m3.g<? super Throwable> onError;
    final m3.g<? super T> onNext;
    final m3.g<? super org.reactivestreams.q> onSubscribe;

    public g(m3.g<? super T> gVar, m3.g<? super Throwable> gVar2, m3.a aVar, m3.g<? super org.reactivestreams.q> gVar3, int i5) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
        this.bufferSize = i5;
        this.limit = i5 - (i5 >> 2);
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean hasCustomOnError() {
        return this.onError != io.reactivex.rxjava3.internal.functions.a.f16254f;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return get() == io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        org.reactivestreams.q qVar = get();
        io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        if (qVar != jVar) {
            lazySet(jVar);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        org.reactivestreams.q qVar = get();
        io.reactivex.rxjava3.internal.subscriptions.j jVar = io.reactivex.rxjava3.internal.subscriptions.j.CANCELLED;
        if (qVar != jVar) {
            lazySet(jVar);
            try {
                this.onError.accept(th);
                return;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                io.reactivex.rxjava3.plugins.a.Y(new io.reactivex.rxjava3.exceptions.a(th, th2));
                return;
            }
        }
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t5);
                int i5 = this.consumed + 1;
                if (i5 == this.limit) {
                    this.consumed = 0;
                    get().request(this.limit);
                } else {
                    this.consumed = i5;
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                get().cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                qVar.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        get().request(j5);
    }
}
