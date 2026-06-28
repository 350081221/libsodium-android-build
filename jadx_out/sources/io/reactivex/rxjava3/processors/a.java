package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class a<T> extends c<T> {

    /* renamed from: e, reason: collision with root package name */
    static final C0532a[] f18765e = new C0532a[0];

    /* renamed from: f, reason: collision with root package name */
    static final C0532a[] f18766f = new C0532a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<C0532a<T>[]> f18767b = new AtomicReference<>(f18765e);

    /* renamed from: c, reason: collision with root package name */
    Throwable f18768c;

    /* renamed from: d, reason: collision with root package name */
    T f18769d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.rxjava3.processors.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0532a<T> extends io.reactivex.rxjava3.internal.subscriptions.f<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final a<T> parent;

        C0532a(p<? super T> pVar, a<T> aVar) {
            super(pVar);
            this.parent = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.f, org.reactivestreams.q
        public void cancel() {
            if (super.tryCancel()) {
                this.parent.w9(this);
            }
        }

        void onComplete() {
            if (!isCancelled()) {
                this.downstream.onComplete();
            }
        }

        void onError(Throwable th) {
            if (isCancelled()) {
                io.reactivex.rxjava3.plugins.a.Y(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    a() {
    }

    @l3.d
    @l3.f
    public static <T> a<T> t9() {
        return new a<>();
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(@l3.f p<? super T> pVar) {
        C0532a<T> c0532a = new C0532a<>(pVar, this);
        pVar.onSubscribe(c0532a);
        if (s9(c0532a)) {
            if (c0532a.isCancelled()) {
                w9(c0532a);
                return;
            }
            return;
        }
        Throwable th = this.f18768c;
        if (th != null) {
            pVar.onError(th);
            return;
        }
        T t5 = this.f18769d;
        if (t5 != null) {
            c0532a.complete(t5);
        } else {
            c0532a.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    @l3.g
    public Throwable n9() {
        if (this.f18767b.get() == f18766f) {
            return this.f18768c;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean o9() {
        return this.f18767b.get() == f18766f && this.f18768c == null;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        C0532a<T>[] c0532aArr = this.f18767b.get();
        C0532a<T>[] c0532aArr2 = f18766f;
        if (c0532aArr == c0532aArr2) {
            return;
        }
        T t5 = this.f18769d;
        C0532a<T>[] andSet = this.f18767b.getAndSet(c0532aArr2);
        int i5 = 0;
        if (t5 == null) {
            int length = andSet.length;
            while (i5 < length) {
                andSet[i5].onComplete();
                i5++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i5 < length2) {
            andSet[i5].complete(t5);
            i5++;
        }
    }

    @Override // org.reactivestreams.p
    public void onError(@l3.f Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        C0532a<T>[] c0532aArr = this.f18767b.get();
        C0532a<T>[] c0532aArr2 = f18766f;
        if (c0532aArr == c0532aArr2) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18769d = null;
        this.f18768c = th;
        for (C0532a<T> c0532a : this.f18767b.getAndSet(c0532aArr2)) {
            c0532a.onError(th);
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(@l3.f T t5) {
        k.d(t5, "onNext called with a null value.");
        if (this.f18767b.get() == f18766f) {
            return;
        }
        this.f18769d = t5;
    }

    @Override // org.reactivestreams.p
    public void onSubscribe(@l3.f q qVar) {
        if (this.f18767b.get() == f18766f) {
            qVar.cancel();
        } else {
            qVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean p9() {
        return this.f18767b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean q9() {
        return this.f18767b.get() == f18766f && this.f18768c != null;
    }

    boolean s9(C0532a<T> c0532a) {
        C0532a<T>[] c0532aArr;
        C0532a[] c0532aArr2;
        do {
            c0532aArr = this.f18767b.get();
            if (c0532aArr == f18766f) {
                return false;
            }
            int length = c0532aArr.length;
            c0532aArr2 = new C0532a[length + 1];
            System.arraycopy(c0532aArr, 0, c0532aArr2, 0, length);
            c0532aArr2[length] = c0532a;
        } while (!androidx.compose.animation.core.h.a(this.f18767b, c0532aArr, c0532aArr2));
        return true;
    }

    @l3.d
    @l3.g
    public T u9() {
        if (this.f18767b.get() == f18766f) {
            return this.f18769d;
        }
        return null;
    }

    @l3.d
    public boolean v9() {
        return this.f18767b.get() == f18766f && this.f18769d != null;
    }

    void w9(C0532a<T> c0532a) {
        C0532a<T>[] c0532aArr;
        C0532a[] c0532aArr2;
        do {
            c0532aArr = this.f18767b.get();
            int length = c0532aArr.length;
            if (length == 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    if (c0532aArr[i5] == c0532a) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    i5 = -1;
                    break;
                }
            }
            if (i5 < 0) {
                return;
            }
            if (length == 1) {
                c0532aArr2 = f18765e;
            } else {
                C0532a[] c0532aArr3 = new C0532a[length - 1];
                System.arraycopy(c0532aArr, 0, c0532aArr3, 0, i5);
                System.arraycopy(c0532aArr, i5 + 1, c0532aArr3, i5, (length - i5) - 1);
                c0532aArr2 = c0532aArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18767b, c0532aArr, c0532aArr2));
    }
}
