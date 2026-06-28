package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.u0;

/* loaded from: classes3.dex */
public enum h implements io.reactivex.rxjava3.core.t<Object>, p0<Object>, a0<Object>, u0<Object>, io.reactivex.rxjava3.core.f, org.reactivestreams.q, io.reactivex.rxjava3.disposables.e {
    INSTANCE;

    public static <T> p0<T> asObserver() {
        return INSTANCE;
    }

    public static <T> org.reactivestreams.p<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // org.reactivestreams.q
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return true;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        io.reactivex.rxjava3.plugins.a.Y(th);
    }

    @Override // org.reactivestreams.p
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        eVar.dispose();
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(Object obj) {
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(org.reactivestreams.q qVar) {
        qVar.cancel();
    }
}
