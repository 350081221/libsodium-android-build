package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.u0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class n<T> extends io.reactivex.rxjava3.observers.a<T, n<T>> implements p0<T>, io.reactivex.rxjava3.disposables.e, a0<T>, u0<T>, io.reactivex.rxjava3.core.f {

    /* renamed from: i, reason: collision with root package name */
    private final p0<? super T> f18737i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<io.reactivex.rxjava3.disposables.e> f18738j;

    /* loaded from: classes3.dex */
    enum a implements p0<Object> {
        INSTANCE;

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        }
    }

    public n() {
        this(a.INSTANCE);
    }

    @l3.f
    public static <T> n<T> L() {
        return new n<>();
    }

    @l3.f
    public static <T> n<T> M(@l3.f p0<? super T> p0Var) {
        return new n<>(p0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.observers.a
    @l3.f
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final n<T> t() {
        if (this.f18738j.get() != null) {
            return this;
        }
        throw G("Not subscribed!");
    }

    public final boolean N() {
        return this.f18738j.get() != null;
    }

    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        io.reactivex.rxjava3.internal.disposables.c.dispose(this.f18738j);
    }

    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return io.reactivex.rxjava3.internal.disposables.c.isDisposed(this.f18738j.get());
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (!this.f18711f) {
            this.f18711f = true;
            if (this.f18738j.get() == null) {
                this.f18708c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f18710e = Thread.currentThread();
            this.f18709d++;
            this.f18737i.onComplete();
        } finally {
            this.f18706a.countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(@l3.f Throwable th) {
        if (!this.f18711f) {
            this.f18711f = true;
            if (this.f18738j.get() == null) {
                this.f18708c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f18710e = Thread.currentThread();
            if (th == null) {
                this.f18708c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f18708c.add(th);
            }
            this.f18737i.onError(th);
        } finally {
            this.f18706a.countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(@l3.f T t5) {
        if (!this.f18711f) {
            this.f18711f = true;
            if (this.f18738j.get() == null) {
                this.f18708c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f18710e = Thread.currentThread();
        this.f18707b.add(t5);
        if (t5 == null) {
            this.f18708c.add(new NullPointerException("onNext received a null value"));
        }
        this.f18737i.onNext(t5);
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(@l3.f io.reactivex.rxjava3.disposables.e eVar) {
        this.f18710e = Thread.currentThread();
        if (eVar == null) {
            this.f18708c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!androidx.compose.animation.core.h.a(this.f18738j, null, eVar)) {
            eVar.dispose();
            if (this.f18738j.get() != io.reactivex.rxjava3.internal.disposables.c.DISPOSED) {
                this.f18708c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + eVar));
                return;
            }
            return;
        }
        this.f18737i.onSubscribe(eVar);
    }

    @Override // io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.u0
    public void onSuccess(@l3.f T t5) {
        onNext(t5);
        onComplete();
    }

    public n(@l3.f p0<? super T> p0Var) {
        this.f18738j = new AtomicReference<>();
        this.f18737i = p0Var;
    }
}
