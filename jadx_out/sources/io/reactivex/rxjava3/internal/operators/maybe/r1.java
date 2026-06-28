package io.reactivex.rxjava3.internal.operators.maybe;

/* loaded from: classes3.dex */
public enum r1 implements m3.o<io.reactivex.rxjava3.core.d0<Object>, org.reactivestreams.o<Object>> {
    INSTANCE;

    public static <T> m3.o<io.reactivex.rxjava3.core.d0<T>, org.reactivestreams.o<T>> instance() {
        return INSTANCE;
    }

    @Override // m3.o
    public org.reactivestreams.o<Object> apply(io.reactivex.rxjava3.core.d0<Object> d0Var) {
        return new p1(d0Var);
    }
}
