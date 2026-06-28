package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.internal.fuseable.l;
import l3.g;

/* loaded from: classes3.dex */
public enum d implements l<Object> {
    INSTANCE,
    NEVER;

    public static void complete(p0<?> p0Var) {
        p0Var.onSubscribe(INSTANCE);
        p0Var.onComplete();
    }

    public static void error(Throwable th, p0<?> p0Var) {
        p0Var.onSubscribe(INSTANCE);
        p0Var.onError(th);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this == INSTANCE;
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
    @g
    public Object poll() {
        return null;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.m
    public int requestFusion(int i5) {
        return i5 & 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(a0<?> a0Var) {
        a0Var.onSubscribe(INSTANCE);
        a0Var.onComplete();
    }

    public static void error(Throwable th, io.reactivex.rxjava3.core.f fVar) {
        fVar.onSubscribe(INSTANCE);
        fVar.onError(th);
    }

    public static void complete(io.reactivex.rxjava3.core.f fVar) {
        fVar.onSubscribe(INSTANCE);
        fVar.onComplete();
    }

    public static void error(Throwable th, u0<?> u0Var) {
        u0Var.onSubscribe(INSTANCE);
        u0Var.onError(th);
    }

    public static void error(Throwable th, a0<?> a0Var) {
        a0Var.onSubscribe(INSTANCE);
        a0Var.onError(th);
    }
}
