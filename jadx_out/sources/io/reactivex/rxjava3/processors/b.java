package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.a;
import io.reactivex.rxjava3.internal.util.k;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class b<T> extends c<T> {

    /* renamed from: i, reason: collision with root package name */
    static final Object[] f18770i = new Object[0];

    /* renamed from: j, reason: collision with root package name */
    static final a[] f18771j = new a[0];

    /* renamed from: k, reason: collision with root package name */
    static final a[] f18772k = new a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<a<T>[]> f18773b;

    /* renamed from: c, reason: collision with root package name */
    final ReadWriteLock f18774c;

    /* renamed from: d, reason: collision with root package name */
    final Lock f18775d;

    /* renamed from: e, reason: collision with root package name */
    final Lock f18776e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference<Object> f18777f;

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference<Throwable> f18778g;

    /* renamed from: h, reason: collision with root package name */
    long f18779h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements q, a.InterfaceC0531a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final p<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        io.reactivex.rxjava3.internal.util.a<Object> queue;
        final b<T> state;

        a(p<? super T> pVar, b<T> bVar) {
            this.downstream = pVar;
            this.state = bVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.y9(this);
            }
        }

        void emitFirst() {
            boolean z4;
            if (this.cancelled) {
                return;
            }
            synchronized (this) {
                if (this.cancelled) {
                    return;
                }
                if (this.next) {
                    return;
                }
                b<T> bVar = this.state;
                Lock lock = bVar.f18775d;
                lock.lock();
                this.index = bVar.f18779h;
                Object obj = bVar.f18777f.get();
                lock.unlock();
                if (obj != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.emitting = z4;
                this.next = true;
                if (obj == null || test(obj)) {
                    return;
                }
                emitLoop();
            }
        }

        void emitLoop() {
            io.reactivex.rxjava3.internal.util.a<Object> aVar;
            while (!this.cancelled) {
                synchronized (this) {
                    aVar = this.queue;
                    if (aVar == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                }
                aVar.d(this);
            }
        }

        void emitNext(Object obj, long j5) {
            if (this.cancelled) {
                return;
            }
            if (!this.fastPath) {
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    if (this.index == j5) {
                        return;
                    }
                    if (this.emitting) {
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.queue;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                            this.queue = aVar;
                        }
                        aVar.c(obj);
                        return;
                    }
                    this.next = true;
                    this.fastPath = true;
                }
            }
            test(obj);
        }

        public boolean isFull() {
            return get() == 0;
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this, j5);
            }
        }

        @Override // io.reactivex.rxjava3.internal.util.a.InterfaceC0531a, m3.r
        public boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (io.reactivex.rxjava3.internal.util.q.isComplete(obj)) {
                this.downstream.onComplete();
                return true;
            }
            if (io.reactivex.rxjava3.internal.util.q.isError(obj)) {
                this.downstream.onError(io.reactivex.rxjava3.internal.util.q.getError(obj));
                return true;
            }
            long j5 = get();
            if (j5 != 0) {
                this.downstream.onNext((Object) io.reactivex.rxjava3.internal.util.q.getValue(obj));
                if (j5 != Long.MAX_VALUE) {
                    decrementAndGet();
                    return false;
                }
                return false;
            }
            cancel();
            this.downstream.onError(new io.reactivex.rxjava3.exceptions.c("Could not deliver value due to lack of requests"));
            return true;
        }
    }

    b() {
        this.f18777f = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f18774c = reentrantReadWriteLock;
        this.f18775d = reentrantReadWriteLock.readLock();
        this.f18776e = reentrantReadWriteLock.writeLock();
        this.f18773b = new AtomicReference<>(f18771j);
        this.f18778g = new AtomicReference<>();
    }

    @l3.d
    @l3.f
    public static <T> b<T> t9() {
        return new b<>();
    }

    @l3.d
    @l3.f
    public static <T> b<T> u9(T t5) {
        Objects.requireNonNull(t5, "defaultValue is null");
        return new b<>(t5);
    }

    @l3.d
    int A9() {
        return this.f18773b.get().length;
    }

    a<T>[] B9(Object obj) {
        z9(obj);
        return this.f18773b.getAndSet(f18772k);
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(@l3.f p<? super T> pVar) {
        a<T> aVar = new a<>(pVar, this);
        pVar.onSubscribe(aVar);
        if (s9(aVar)) {
            if (aVar.cancelled) {
                y9(aVar);
                return;
            } else {
                aVar.emitFirst();
                return;
            }
        }
        Throwable th = this.f18778g.get();
        if (th == k.f18688a) {
            pVar.onComplete();
        } else {
            pVar.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    @l3.g
    public Throwable n9() {
        Object obj = this.f18777f.get();
        if (io.reactivex.rxjava3.internal.util.q.isError(obj)) {
            return io.reactivex.rxjava3.internal.util.q.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean o9() {
        return io.reactivex.rxjava3.internal.util.q.isComplete(this.f18777f.get());
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (!androidx.compose.animation.core.h.a(this.f18778g, null, k.f18688a)) {
            return;
        }
        Object complete = io.reactivex.rxjava3.internal.util.q.complete();
        for (a<T> aVar : B9(complete)) {
            aVar.emitNext(complete, this.f18779h);
        }
    }

    @Override // org.reactivestreams.p
    public void onError(@l3.f Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (!androidx.compose.animation.core.h.a(this.f18778g, null, th)) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        Object error = io.reactivex.rxjava3.internal.util.q.error(th);
        for (a<T> aVar : B9(error)) {
            aVar.emitNext(error, this.f18779h);
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(@l3.f T t5) {
        k.d(t5, "onNext called with a null value.");
        if (this.f18778g.get() != null) {
            return;
        }
        Object next = io.reactivex.rxjava3.internal.util.q.next(t5);
        z9(next);
        for (a<T> aVar : this.f18773b.get()) {
            aVar.emitNext(next, this.f18779h);
        }
    }

    @Override // org.reactivestreams.p
    public void onSubscribe(@l3.f q qVar) {
        if (this.f18778g.get() != null) {
            qVar.cancel();
        } else {
            qVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean p9() {
        return this.f18773b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean q9() {
        return io.reactivex.rxjava3.internal.util.q.isError(this.f18777f.get());
    }

    boolean s9(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18773b.get();
            if (aVarArr == f18772k) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!androidx.compose.animation.core.h.a(this.f18773b, aVarArr, aVarArr2));
        return true;
    }

    @l3.d
    @l3.g
    public T v9() {
        Object obj = this.f18777f.get();
        if (!io.reactivex.rxjava3.internal.util.q.isComplete(obj) && !io.reactivex.rxjava3.internal.util.q.isError(obj)) {
            return (T) io.reactivex.rxjava3.internal.util.q.getValue(obj);
        }
        return null;
    }

    @l3.d
    public boolean w9() {
        Object obj = this.f18777f.get();
        if (obj != null && !io.reactivex.rxjava3.internal.util.q.isComplete(obj) && !io.reactivex.rxjava3.internal.util.q.isError(obj)) {
            return true;
        }
        return false;
    }

    @l3.d
    public boolean x9(@l3.f T t5) {
        k.d(t5, "offer called with a null value.");
        a<T>[] aVarArr = this.f18773b.get();
        for (a<T> aVar : aVarArr) {
            if (aVar.isFull()) {
                return false;
            }
        }
        Object next = io.reactivex.rxjava3.internal.util.q.next(t5);
        z9(next);
        for (a<T> aVar2 : aVarArr) {
            aVar2.emitNext(next, this.f18779h);
        }
        return true;
    }

    void y9(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f18773b.get();
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
                aVarArr2 = f18771j;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i5);
                System.arraycopy(aVarArr, i5 + 1, aVarArr3, i5, (length - i5) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18773b, aVarArr, aVarArr2));
    }

    void z9(Object obj) {
        Lock lock = this.f18776e;
        lock.lock();
        this.f18779h++;
        this.f18777f.lazySet(obj);
        lock.unlock();
    }

    b(T t5) {
        this();
        this.f18777f.lazySet(t5);
    }
}
