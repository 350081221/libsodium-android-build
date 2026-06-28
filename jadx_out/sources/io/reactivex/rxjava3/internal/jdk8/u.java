package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class u<T> extends i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final CompletionStage<T> f16391a;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object obj, Throwable th) {
            accept2((a<T>) obj, th);
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(T t5, Throwable th) {
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(t5, th);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T> extends io.reactivex.rxjava3.internal.observers.m<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;
        final a<T> whenReference;

        b(p0<? super T> p0Var, a<T> aVar) {
            super(p0Var);
            this.whenReference = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object obj, Throwable th) {
            accept2((b<T>) obj, th);
        }

        @Override // io.reactivex.rxjava3.internal.observers.m, io.reactivex.rxjava3.disposables.e
        public void dispose() {
            super.dispose();
            this.whenReference.set(null);
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(T t5, Throwable th) {
            if (th != null) {
                this.downstream.onError(th);
            } else if (t5 != null) {
                complete(t5);
            } else {
                this.downstream.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }
    }

    public u(CompletionStage<T> completionStage) {
        this.f16391a = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        a aVar = new a();
        b bVar = new b(p0Var, aVar);
        aVar.lazySet(bVar);
        p0Var.onSubscribe(bVar);
        this.f16391a.whenComplete(aVar);
    }
}
