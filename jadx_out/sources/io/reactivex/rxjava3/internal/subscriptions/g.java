package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.fuseable.n;
import org.reactivestreams.p;

/* loaded from: classes3.dex */
public enum g implements n<Object> {
    INSTANCE;

    public static void complete(p<?> pVar) {
        pVar.onSubscribe(INSTANCE);
        pVar.onComplete();
    }

    public static void error(Throwable th, p<?> pVar) {
        pVar.onSubscribe(INSTANCE);
        pVar.onError(th);
    }

    @Override // org.reactivestreams.q
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    @l3.g
    public Object poll() {
        return null;
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        j.validate(j5);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.m
    public int requestFusion(int i5) {
        return i5 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
