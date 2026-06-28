package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.jdk8.g;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public final class a<T> extends io.reactivex.rxjava3.core.c {

    /* renamed from: a, reason: collision with root package name */
    final CompletionStage<T> f16291a;

    /* renamed from: io.reactivex.rxjava3.internal.jdk8.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0454a<T> implements io.reactivex.rxjava3.disposables.e, BiConsumer<T, Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.f f16292a;

        /* renamed from: b, reason: collision with root package name */
        final g.a<T> f16293b;

        C0454a(io.reactivex.rxjava3.core.f fVar, g.a<T> aVar) {
            this.f16292a = fVar;
            this.f16293b = aVar;
        }

        @Override // java.util.function.BiConsumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(T t5, Throwable th) {
            if (th != null) {
                this.f16292a.onError(th);
            } else {
                this.f16292a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16293b.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16293b.get() == null;
        }
    }

    public a(CompletionStage<T> completionStage) {
        this.f16291a = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.c
    protected void Y0(io.reactivex.rxjava3.core.f fVar) {
        g.a aVar = new g.a();
        C0454a c0454a = new C0454a(fVar, aVar);
        aVar.lazySet(c0454a);
        fVar.onSubscribe(c0454a);
        this.f16291a.whenComplete(aVar);
    }
}
