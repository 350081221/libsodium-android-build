package io.reactivex.rxjava3.observables;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.disposables.e;
import io.reactivex.rxjava3.internal.operators.observable.k;
import io.reactivex.rxjava3.internal.operators.observable.s2;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l3.d;
import l3.f;
import l3.h;
import m3.g;

/* loaded from: classes3.dex */
public abstract class a<T> extends i0<T> {
    @d
    @h("none")
    @f
    public i0<T> I8() {
        return J8(1);
    }

    @d
    @h("none")
    @f
    public i0<T> J8(int i5) {
        return K8(i5, io.reactivex.rxjava3.internal.functions.a.h());
    }

    @d
    @h("none")
    @f
    public i0<T> K8(int i5, @f g<? super e> gVar) {
        Objects.requireNonNull(gVar, "connection is null");
        if (i5 <= 0) {
            M8(gVar);
            return io.reactivex.rxjava3.plugins.a.U(this);
        }
        return io.reactivex.rxjava3.plugins.a.R(new k(this, i5, gVar));
    }

    @h("none")
    @f
    public final e L8() {
        io.reactivex.rxjava3.internal.util.g gVar = new io.reactivex.rxjava3.internal.util.g();
        M8(gVar);
        return gVar.f18687a;
    }

    @h("none")
    public abstract void M8(@f g<? super e> gVar);

    @d
    @h("none")
    @f
    public i0<T> N8() {
        return io.reactivex.rxjava3.plugins.a.R(new s2(this));
    }

    @d
    @h("none")
    @f
    public final i0<T> O8(int i5) {
        return Q8(i5, 0L, TimeUnit.NANOSECONDS, io.reactivex.rxjava3.schedulers.b.j());
    }

    @d
    @h(h.f20735h)
    @f
    public final i0<T> P8(int i5, long j5, @f TimeUnit timeUnit) {
        return Q8(i5, j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @d
    @h("custom")
    @f
    public final i0<T> Q8(int i5, long j5, @f TimeUnit timeUnit, @f q0 q0Var) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "subscriberCount");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.R(new s2(this, i5, j5, timeUnit, q0Var));
    }

    @d
    @h(h.f20735h)
    @f
    public final i0<T> R8(long j5, @f TimeUnit timeUnit) {
        return Q8(1, j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @d
    @h("custom")
    @f
    public final i0<T> S8(long j5, @f TimeUnit timeUnit, @f q0 q0Var) {
        return Q8(1, j5, timeUnit, q0Var);
    }

    @h("none")
    public abstract void T8();
}
