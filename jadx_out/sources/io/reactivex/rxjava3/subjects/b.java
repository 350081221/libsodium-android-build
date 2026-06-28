package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.internal.util.a;
import io.reactivex.rxjava3.internal.util.k;
import io.reactivex.rxjava3.internal.util.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public final class b<T> extends i<T> {

    /* renamed from: h, reason: collision with root package name */
    static final a[] f18865h = new a[0];

    /* renamed from: i, reason: collision with root package name */
    static final a[] f18866i = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Object> f18867a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18868b;

    /* renamed from: c, reason: collision with root package name */
    final ReadWriteLock f18869c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f18870d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f18871e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference<Throwable> f18872f;

    /* renamed from: g, reason: collision with root package name */
    long f18873g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.e, a.InterfaceC0531a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final p0<? super T> f18874a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f18875b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18876c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18877d;

        /* renamed from: e, reason: collision with root package name */
        io.reactivex.rxjava3.internal.util.a<Object> f18878e;

        /* renamed from: f, reason: collision with root package name */
        boolean f18879f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f18880g;

        /* renamed from: h, reason: collision with root package name */
        long f18881h;

        a(p0<? super T> p0Var, b<T> bVar) {
            this.f18874a = p0Var;
            this.f18875b = bVar;
        }

        void a() {
            boolean z4;
            if (this.f18880g) {
                return;
            }
            synchronized (this) {
                if (this.f18880g) {
                    return;
                }
                if (this.f18876c) {
                    return;
                }
                b<T> bVar = this.f18875b;
                Lock lock = bVar.f18870d;
                lock.lock();
                this.f18881h = bVar.f18873g;
                Object obj = bVar.f18867a.get();
                lock.unlock();
                if (obj != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f18877d = z4;
                this.f18876c = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        void b() {
            io.reactivex.rxjava3.internal.util.a<Object> aVar;
            while (!this.f18880g) {
                synchronized (this) {
                    aVar = this.f18878e;
                    if (aVar == null) {
                        this.f18877d = false;
                        return;
                    }
                    this.f18878e = null;
                }
                aVar.d(this);
            }
        }

        void c(Object obj, long j5) {
            if (this.f18880g) {
                return;
            }
            if (!this.f18879f) {
                synchronized (this) {
                    if (this.f18880g) {
                        return;
                    }
                    if (this.f18881h == j5) {
                        return;
                    }
                    if (this.f18877d) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f18878e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                            this.f18878e = aVar;
                        }
                        aVar.c(obj);
                        return;
                    }
                    this.f18876c = true;
                    this.f18879f = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.f18880g) {
                this.f18880g = true;
                this.f18875b.S8(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18880g;
        }

        @Override // io.reactivex.rxjava3.internal.util.a.InterfaceC0531a, m3.r
        public boolean test(Object obj) {
            return this.f18880g || q.accept(obj, this.f18874a);
        }
    }

    b(T t5) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f18869c = reentrantReadWriteLock;
        this.f18870d = reentrantReadWriteLock.readLock();
        this.f18871e = reentrantReadWriteLock.writeLock();
        this.f18868b = new AtomicReference<>(f18865h);
        this.f18867a = new AtomicReference<>(t5);
        this.f18872f = new AtomicReference<>();
    }

    @l3.d
    @l3.f
    public static <T> b<T> O8() {
        return new b<>(null);
    }

    @l3.d
    @l3.f
    public static <T> b<T> P8(T t5) {
        Objects.requireNonNull(t5, "defaultValue is null");
        return new b<>(t5);
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    @l3.g
    public Throwable I8() {
        Object obj = this.f18867a.get();
        if (q.isError(obj)) {
            return q.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean J8() {
        return q.isComplete(this.f18867a.get());
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean K8() {
        return this.f18868b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean L8() {
        return q.isError(this.f18867a.get());
    }

    boolean N8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18868b.get();
            if (aVarArr == f18866i) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18868b, aVarArr, aVarArr2));
        return true;
    }

    @l3.d
    @l3.g
    public T Q8() {
        Object obj = this.f18867a.get();
        if (!q.isComplete(obj) && !q.isError(obj)) {
            return (T) q.getValue(obj);
        }
        return null;
    }

    @l3.d
    public boolean R8() {
        Object obj = this.f18867a.get();
        if (obj != null && !q.isComplete(obj) && !q.isError(obj)) {
            return true;
        }
        return false;
    }

    void S8(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18868b.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
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
                aVarArr2 = f18865h;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18868b, aVarArr, aVarArr2));
    }

    void T8(Object obj) {
        this.f18871e.lock();
        this.f18873g++;
        this.f18867a.lazySet(obj);
        this.f18871e.unlock();
    }

    @l3.d
    int U8() {
        return this.f18868b.get().length;
    }

    a<T>[] V8(Object obj) {
        T8(obj);
        return this.f18868b.getAndSet(f18866i);
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        a<T> aVar = new a<>(p0Var, this);
        p0Var.onSubscribe(aVar);
        if (N8(aVar)) {
            if (aVar.f18880g) {
                S8(aVar);
                return;
            } else {
                aVar.a();
                return;
            }
        }
        Throwable th = this.f18872f.get();
        if (th == k.f18688a) {
            p0Var.onComplete();
        } else {
            p0Var.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (!androidx.compose.animation.core.h.a(this.f18872f, null, k.f18688a)) {
            return;
        }
        Object complete = q.complete();
        for (a<T> aVar : V8(complete)) {
            aVar.c(complete, this.f18873g);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (!androidx.compose.animation.core.h.a(this.f18872f, null, th)) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        Object error = q.error(th);
        for (a<T> aVar : V8(error)) {
            aVar.c(error, this.f18873g);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        k.d(t5, "onNext called with a null value.");
        if (this.f18872f.get() != null) {
            return;
        }
        Object next = q.next(t5);
        T8(next);
        for (a<T> aVar : this.f18868b.get()) {
            aVar.c(next, this.f18873g);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18872f.get() != null) {
            eVar.dispose();
        }
    }
}
