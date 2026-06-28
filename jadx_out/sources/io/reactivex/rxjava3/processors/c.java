package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.t;
import org.reactivestreams.n;

/* loaded from: classes3.dex */
public abstract class c<T> extends o<T> implements n<T, T>, t<T> {
    @l3.d
    @l3.g
    public abstract Throwable n9();

    @l3.d
    public abstract boolean o9();

    @l3.d
    public abstract boolean p9();

    @l3.d
    public abstract boolean q9();

    @l3.d
    @l3.f
    public final c<T> r9() {
        if (this instanceof g) {
            return this;
        }
        return new g(this);
    }
}
