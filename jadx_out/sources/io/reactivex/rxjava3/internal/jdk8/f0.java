package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.internal.jdk8.n;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class f0<T, R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final r0<T> f16343a;

    /* renamed from: b, reason: collision with root package name */
    final m3.o<? super T, ? extends Stream<? extends R>> f16344b;

    public f0(r0<T> r0Var, m3.o<? super T, ? extends Stream<? extends R>> oVar) {
        this.f16343a = r0Var;
        this.f16344b = oVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(@l3.f p0<? super R> p0Var) {
        this.f16343a.a(new n.a(p0Var, this.f16344b));
    }
}
