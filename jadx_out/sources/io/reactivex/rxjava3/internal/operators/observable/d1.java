package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class d1<T> extends io.reactivex.rxjava3.core.i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final T[] f17602a;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.observers.c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super T> f17603a;

        /* renamed from: b, reason: collision with root package name */
        final T[] f17604b;

        /* renamed from: c, reason: collision with root package name */
        int f17605c;

        /* renamed from: d, reason: collision with root package name */
        boolean f17606d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f17607e;

        a(io.reactivex.rxjava3.core.p0<? super T> p0Var, T[] tArr) {
            this.f17603a = p0Var;
            this.f17604b = tArr;
        }

        void a() {
            T[] tArr = this.f17604b;
            int length = tArr.length;
            for (int i5 = 0; i5 < length && !isDisposed(); i5++) {
                T t5 = tArr[i5];
                if (t5 == null) {
                    this.f17603a.onError(new NullPointerException("The element at index " + i5 + " is null"));
                    return;
                }
                this.f17603a.onNext(t5);
            }
            if (!isDisposed()) {
                this.f17603a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.f17605c = this.f17604b.length;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17607e = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17607e;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.f17605c == this.f17604b.length;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            int i5 = this.f17605c;
            T[] tArr = this.f17604b;
            if (i5 != tArr.length) {
                this.f17605c = i5 + 1;
                T t5 = tArr[i5];
                Objects.requireNonNull(t5, "The array element is null");
                return t5;
            }
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 1) == 0) {
                return 0;
            }
            this.f17606d = true;
            return 1;
        }
    }

    public d1(T[] tArr) {
        this.f17602a = tArr;
    }

    @Override // io.reactivex.rxjava3.core.i0
    public void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        a aVar = new a(p0Var, this.f17602a);
        p0Var.onSubscribe(aVar);
        if (aVar.f17606d) {
            return;
        }
        aVar.a();
    }
}
