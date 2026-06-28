package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.i0;
import io.reactivex.rxjava3.core.p0;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class v<T> extends i0<T> {

    /* renamed from: a, reason: collision with root package name */
    final Stream<T> f16392a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> implements io.reactivex.rxjava3.internal.fuseable.l<T> {

        /* renamed from: a, reason: collision with root package name */
        final p0<? super T> f16393a;

        /* renamed from: b, reason: collision with root package name */
        Iterator<T> f16394b;

        /* renamed from: c, reason: collision with root package name */
        AutoCloseable f16395c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f16396d;

        /* renamed from: e, reason: collision with root package name */
        boolean f16397e;

        /* renamed from: f, reason: collision with root package name */
        boolean f16398f;

        a(p0<? super T> p0Var, Iterator<T> it, AutoCloseable autoCloseable) {
            this.f16393a = p0Var;
            this.f16394b = it;
            this.f16395c = autoCloseable;
        }

        public void a() {
            if (this.f16398f) {
                return;
            }
            Iterator<T> it = this.f16394b;
            p0<? super T> p0Var = this.f16393a;
            while (!this.f16396d) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                    if (!this.f16396d) {
                        p0Var.onNext(next);
                        if (!this.f16396d) {
                            try {
                                if (!it.hasNext()) {
                                    p0Var.onComplete();
                                    this.f16396d = true;
                                }
                            } catch (Throwable th) {
                                io.reactivex.rxjava3.exceptions.b.b(th);
                                p0Var.onError(th);
                                this.f16396d = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.b.b(th2);
                    p0Var.onError(th2);
                    this.f16396d = true;
                }
            }
            clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.f16394b = null;
            AutoCloseable autoCloseable = this.f16395c;
            this.f16395c = null;
            if (autoCloseable != null) {
                v.I8(autoCloseable);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f16396d = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f16396d;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            Iterator<T> it = this.f16394b;
            if (it != null) {
                if (this.f16397e && !it.hasNext()) {
                    clear();
                    return true;
                }
                return false;
            }
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(@l3.f T t5) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public T poll() {
            Iterator<T> it = this.f16394b;
            if (it == null) {
                return null;
            }
            if (!this.f16397e) {
                this.f16397e = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            T next = this.f16394b.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 1) == 0) {
                return 0;
            }
            this.f16398f = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean offer(@l3.f T t5, @l3.f T t6) {
            throw new UnsupportedOperationException();
        }
    }

    public v(Stream<T> stream) {
        this.f16392a = stream;
    }

    static void I8(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.plugins.a.Y(th);
        }
    }

    public static <T> void J8(p0<? super T> p0Var, Stream<T> stream) {
        try {
            Iterator<T> it = stream.iterator();
            if (!it.hasNext()) {
                io.reactivex.rxjava3.internal.disposables.d.complete(p0Var);
                I8(stream);
            } else {
                a aVar = new a(p0Var, it, stream);
                p0Var.onSubscribe(aVar);
                aVar.a();
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
            I8(stream);
        }
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        J8(p0Var, this.f16392a);
    }
}
