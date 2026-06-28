package io.reactivex.rxjava3.internal.jdk8;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class g<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final CompletionStage<T> f16345b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

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
    static final class b<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;
        final a<T> whenReference;

        b(org.reactivestreams.p<? super T> pVar, a<T> aVar) {
            super(pVar);
            this.whenReference = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public /* bridge */ /* synthetic */ void accept(Object obj, Throwable th) {
            accept2((b<T>) obj, th);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            super.cancel();
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

    public g(CompletionStage<T> completionStage) {
        this.f16345b = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a();
        b bVar = new b(pVar, aVar);
        aVar.lazySet(bVar);
        pVar.onSubscribe(bVar);
        this.f16345b.whenComplete(aVar);
    }
}
