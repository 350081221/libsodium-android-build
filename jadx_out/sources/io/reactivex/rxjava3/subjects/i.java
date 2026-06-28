package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public abstract class i<T> extends i0<T> implements p0<T> {
    @l3.d
    @l3.g
    public abstract Throwable I8();

    @l3.d
    public abstract boolean J8();

    @l3.d
    public abstract boolean K8();

    @l3.d
    public abstract boolean L8();

    @l3.d
    @l3.f
    public final i<T> M8() {
        if (this instanceof g) {
            return this;
        }
        return new g(this);
    }
}
