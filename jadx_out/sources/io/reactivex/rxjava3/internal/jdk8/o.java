package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.jdk8.g;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class o<T> extends io.reactivex.rxjava3.core.x<T> {

    /* renamed from: a, reason: collision with root package name */
    final CompletionStage<T> f16369a;

    /* loaded from: classes3.dex */
    static final class a<T> implements io.reactivex.rxjava3.disposables.e, BiConsumer<T, Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.a0<? super T> f16370a;

        /* renamed from: b, reason: collision with root package name */
        final g.a<T> f16371b;

        a(io.reactivex.rxjava3.core.a0<? super T> a0Var, g.a<T> aVar) {
            this.f16370a = a0Var;
            this.f16371b = aVar;
        }

        @Override // java.util.function.BiConsumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(T t5, Throwable th) {
            if (th != null) {
                this.f16370a.onError(th);
            } else if (t5 != null) {
                this.f16370a.onSuccess(t5);
            } else {
                this.f16370a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16371b.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16371b.get() == null;
        }
    }

    public o(CompletionStage<T> completionStage) {
        this.f16369a = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.x
    protected void U1(io.reactivex.rxjava3.core.a0<? super T> a0Var) {
        g.a aVar = new g.a();
        a aVar2 = new a(a0Var, aVar);
        aVar.lazySet(aVar2);
        a0Var.onSubscribe(aVar2);
        this.f16369a.whenComplete(aVar);
    }
}
