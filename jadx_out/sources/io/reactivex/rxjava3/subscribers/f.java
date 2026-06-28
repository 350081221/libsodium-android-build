package io.reactivex.rxjava3.subscribers;

import androidx.compose.animation.core.h;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public class f<T> extends io.reactivex.rxjava3.observers.a<T, f<T>> implements t<T>, q {

    /* renamed from: i, reason: collision with root package name */
    private final p<? super T> f18938i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f18939j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<q> f18940k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicLong f18941l;

    /* loaded from: classes3.dex */
    enum a implements t<Object> {
        INSTANCE;

        @Override // org.reactivestreams.p
        public void onComplete() {
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.p
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(q qVar) {
        }
    }

    public f() {
        this(a.INSTANCE, Long.MAX_VALUE);
    }

    @l3.f
    public static <T> f<T> L() {
        return new f<>();
    }

    @l3.f
    public static <T> f<T> M(long j5) {
        return new f<>(j5);
    }

    public static <T> f<T> N(@l3.f p<? super T> pVar) {
        return new f<>(pVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.observers.a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final f<T> t() {
        if (this.f18940k.get() != null) {
            return this;
        }
        throw G("Not subscribed!");
    }

    public final boolean O() {
        return this.f18940k.get() != null;
    }

    public final boolean P() {
        return this.f18939j;
    }

    protected void Q() {
    }

    public final f<T> R(long j5) {
        request(j5);
        return this;
    }

    @Override // org.reactivestreams.q
    public final void cancel() {
        if (!this.f18939j) {
            this.f18939j = true;
            j.cancel(this.f18940k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.e
    public final void dispose() {
        cancel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.e
    public final boolean isDisposed() {
        return this.f18939j;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (!this.f18711f) {
            this.f18711f = true;
            if (this.f18940k.get() == null) {
                this.f18708c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f18710e = Thread.currentThread();
            this.f18709d++;
            this.f18938i.onComplete();
        } finally {
            this.f18706a.countDown();
        }
    }

    @Override // org.reactivestreams.p
    public void onError(@l3.f Throwable th) {
        if (!this.f18711f) {
            this.f18711f = true;
            if (this.f18940k.get() == null) {
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
            this.f18938i.onError(th);
        } finally {
            this.f18706a.countDown();
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(@l3.f T t5) {
        if (!this.f18711f) {
            this.f18711f = true;
            if (this.f18940k.get() == null) {
                this.f18708c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f18710e = Thread.currentThread();
        this.f18707b.add(t5);
        if (t5 == null) {
            this.f18708c.add(new NullPointerException("onNext received a null value"));
        }
        this.f18938i.onNext(t5);
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public void onSubscribe(@l3.f q qVar) {
        this.f18710e = Thread.currentThread();
        if (qVar == null) {
            this.f18708c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!h.a(this.f18940k, null, qVar)) {
            qVar.cancel();
            if (this.f18940k.get() != j.CANCELLED) {
                this.f18708c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + qVar));
                return;
            }
            return;
        }
        this.f18938i.onSubscribe(qVar);
        long andSet = this.f18941l.getAndSet(0L);
        if (andSet != 0) {
            qVar.request(andSet);
        }
        Q();
    }

    @Override // org.reactivestreams.q
    public final void request(long j5) {
        j.deferredRequest(this.f18940k, this.f18941l, j5);
    }

    public f(long j5) {
        this(a.INSTANCE, j5);
    }

    public f(@l3.f p<? super T> pVar) {
        this(pVar, Long.MAX_VALUE);
    }

    public f(@l3.f p<? super T> pVar, long j5) {
        if (j5 >= 0) {
            this.f18938i = pVar;
            this.f18940k = new AtomicReference<>();
            this.f18941l = new AtomicLong(j5);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
