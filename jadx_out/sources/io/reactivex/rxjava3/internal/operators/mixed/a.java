package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.n0;
import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a<R> extends i0<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.i f17441a;

    /* renamed from: b, reason: collision with root package name */
    final n0<? extends R> f17442b;

    /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0486a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements p0<R>, io.reactivex.rxjava3.core.f, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8948264376121066672L;
        final p0<? super R> downstream;
        n0<? extends R> other;

        C0486a(p0<? super R> p0Var, n0<? extends R> n0Var) {
            this.other = n0Var;
            this.downstream = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return io.reactivex.rxjava3.internal.disposables.c.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            n0<? extends R> n0Var = this.other;
            if (n0Var == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                n0Var.subscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(R r5) {
            this.downstream.onNext(r5);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            io.reactivex.rxjava3.internal.disposables.c.replace(this, eVar);
        }
    }

    public a(io.reactivex.rxjava3.core.i iVar, n0<? extends R> n0Var) {
        this.f17441a = iVar;
        this.f17442b = n0Var;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super R> p0Var) {
        C0486a c0486a = new C0486a(p0Var, this.f17442b);
        p0Var.onSubscribe(c0486a);
        this.f17441a.a(c0486a);
    }
}
