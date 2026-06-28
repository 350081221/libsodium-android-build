package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.k;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class e<T> extends c<T> {

    /* renamed from: d, reason: collision with root package name */
    static final a[] f18793d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    static final a[] f18794e = new a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18795b = new AtomicReference<>(f18794e);

    /* renamed from: c, reason: collision with root package name */
    Throwable f18796c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements q {
        private static final long serialVersionUID = 3562861878281475070L;
        final p<? super T> downstream;
        final e<T> parent;

        a(p<? super T> pVar, e<T> eVar) {
            this.downstream = pVar;
            this.parent = eVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.v9(this);
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        boolean isFull() {
            return get() == 0;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                io.reactivex.rxjava3.plugins.a.Y(th);
            }
        }

        public void onNext(T t5) {
            long j5 = get();
            if (j5 == Long.MIN_VALUE) {
                return;
            }
            if (j5 != 0) {
                this.downstream.onNext(t5);
                io.reactivex.rxjava3.internal.util.d.f(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.b(this, j5);
            }
        }
    }

    e() {
    }

    @l3.d
    @l3.f
    public static <T> e<T> t9() {
        return new e<>();
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(@l3.f p<? super T> pVar) {
        a<T> aVar = new a<>(pVar, this);
        pVar.onSubscribe(aVar);
        if (s9(aVar)) {
            if (aVar.isCancelled()) {
                v9(aVar);
            }
        } else {
            Throwable th = this.f18796c;
            if (th != null) {
                pVar.onError(th);
            } else {
                pVar.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    @l3.g
    public Throwable n9() {
        if (this.f18795b.get() == f18793d) {
            return this.f18796c;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean o9() {
        return this.f18795b.get() == f18793d && this.f18796c == null;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        a<T>[] aVarArr = this.f18795b.get();
        a<T>[] aVarArr2 = f18793d;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.f18795b.getAndSet(aVarArr2)) {
            aVar.onComplete();
        }
    }

    @Override // org.reactivestreams.p
    public void onError(@l3.f Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        a<T>[] aVarArr = this.f18795b.get();
        a<T>[] aVarArr2 = f18793d;
        if (aVarArr == aVarArr2) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18796c = th;
        for (a<T> aVar : this.f18795b.getAndSet(aVarArr2)) {
            aVar.onError(th);
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(@l3.f T t5) {
        k.d(t5, "onNext called with a null value.");
        for (a<T> aVar : this.f18795b.get()) {
            aVar.onNext(t5);
        }
    }

    @Override // org.reactivestreams.p
    public void onSubscribe(@l3.f q qVar) {
        if (this.f18795b.get() == f18793d) {
            qVar.cancel();
        } else {
            qVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean p9() {
        return this.f18795b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean q9() {
        return this.f18795b.get() == f18793d && this.f18796c != null;
    }

    boolean s9(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18795b.get();
            if (aVarArr == f18793d) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18795b, aVarArr, aVarArr2));
        return true;
    }

    @l3.d
    public boolean u9(@l3.f T t5) {
        k.d(t5, "offer called with a null value.");
        a<T>[] aVarArr = this.f18795b.get();
        for (a<T> aVar : aVarArr) {
            if (aVar.isFull()) {
                return false;
            }
        }
        for (a<T> aVar2 : aVarArr) {
            aVar2.onNext(t5);
        }
        return true;
    }

    void v9(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18795b.get();
            if (aVarArr != f18793d && aVarArr != f18794e) {
                int length = aVarArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (aVarArr[i5] == aVar) {
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
                    aVarArr2 = f18794e;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                    System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                    aVarArr2 = aVarArr3;
                }
            } else {
                return;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18795b, aVarArr, aVarArr2));
    }
}
