package io.reactivex.rxjava3.flowables;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.disposables.e;
import io.reactivex.rxjava3.internal.operators.flowable.e3;
import io.reactivex.rxjava3.internal.operators.flowable.k;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l3.d;
import l3.f;
import l3.h;
import m3.g;

/* loaded from: classes3.dex */
public abstract class a<T> extends o<T> {
    @d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public o<T> n9() {
        return o9(1);
    }

    @d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public o<T> o9(int i5) {
        return p9(i5, io.reactivex.rxjava3.internal.functions.a.h());
    }

    @d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public o<T> p9(int i5, @f g<? super e> gVar) {
        Objects.requireNonNull(gVar, "connection is null");
        if (i5 <= 0) {
            r9(gVar);
            return io.reactivex.rxjava3.plugins.a.T(this);
        }
        return io.reactivex.rxjava3.plugins.a.P(new k(this, i5, gVar));
    }

    @h("none")
    @f
    public final e q9() {
        io.reactivex.rxjava3.internal.util.g gVar = new io.reactivex.rxjava3.internal.util.g();
        r9(gVar);
        return gVar.f18687a;
    }

    @h("none")
    public abstract void r9(@f g<? super e> gVar);

    @d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public o<T> s9() {
        return io.reactivex.rxjava3.plugins.a.P(new e3(this));
    }

    @d
    @f
    @h("none")
    @l3.b(l3.a.PASS_THROUGH)
    public final o<T> t9(int i5) {
        return v9(i5, 0L, TimeUnit.NANOSECONDS, io.reactivex.rxjava3.schedulers.b.j());
    }

    @d
    @f
    @h(h.f20735h)
    @l3.b(l3.a.PASS_THROUGH)
    public final o<T> u9(int i5, long j5, @f TimeUnit timeUnit) {
        return v9(i5, j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @d
    @f
    @h("custom")
    @l3.b(l3.a.PASS_THROUGH)
    public final o<T> v9(int i5, long j5, @f TimeUnit timeUnit, @f q0 q0Var) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "subscriberCount");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return io.reactivex.rxjava3.plugins.a.P(new e3(this, i5, j5, timeUnit, q0Var));
    }

    @d
    @f
    @h(h.f20735h)
    @l3.b(l3.a.PASS_THROUGH)
    public final o<T> w9(long j5, @f TimeUnit timeUnit) {
        return v9(1, j5, timeUnit, io.reactivex.rxjava3.schedulers.b.a());
    }

    @d
    @f
    @h("custom")
    @l3.b(l3.a.PASS_THROUGH)
    public final o<T> x9(long j5, @f TimeUnit timeUnit, @f q0 q0Var) {
        return v9(1, j5, timeUnit, q0Var);
    }

    @h("none")
    public abstract void y9();
}
