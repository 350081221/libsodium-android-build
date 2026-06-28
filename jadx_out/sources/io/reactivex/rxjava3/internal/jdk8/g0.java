package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.r0;
import io.reactivex.rxjava3.core.u0;
import io.reactivex.rxjava3.internal.jdk8.g;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class g0<T> extends r0<T> {

    /* renamed from: a, reason: collision with root package name */
    final CompletionStage<T> f16346a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.disposables.e, BiConsumer<T, Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final u0<? super T> f16347a;

        /* renamed from: b, reason: collision with root package name */
        final g.a<T> f16348b;

        a(u0<? super T> u0Var, g.a<T> aVar) {
            this.f16347a = u0Var;
            this.f16348b = aVar;
        }

        @Override // java.util.function.BiConsumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(T t5, Throwable th) {
            if (th != null) {
                this.f16347a.onError(th);
            } else if (t5 != null) {
                this.f16347a.onSuccess(t5);
            } else {
                this.f16347a.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16348b.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16348b.get() == null;
        }
    }

    public g0(CompletionStage<T> completionStage) {
        this.f16346a = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.r0
    protected void M1(u0<? super T> u0Var) {
        g.a aVar = new g.a();
        a aVar2 = new a(u0Var, aVar);
        aVar.lazySet(aVar2);
        u0Var.onSubscribe(aVar2);
        this.f16346a.whenComplete(aVar);
    }
}
