package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w2<T> extends io.reactivex.rxjava3.observables.a<T> implements io.reactivex.rxjava3.internal.fuseable.i<T> {

    /* renamed from: e, reason: collision with root package name */
    static final b f18150e = new n();

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18151a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<i<T>> f18152b;

    /* renamed from: c, reason: collision with root package name */
    final b<T> f18153c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.rxjava3.core.n0<T> f18154d;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends AtomicReference<f> implements g<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        final boolean eagerTruncate;
        int size;
        f tail;

        a(boolean z4) {
            this.eagerTruncate = z4;
            f fVar = new f(null);
            this.tail = fVar;
            set(fVar);
        }

        final void addLast(f fVar) {
            this.tail.set(fVar);
            this.tail = fVar;
            this.size++;
        }

        final void collect(Collection<? super T> collection) {
            f head = getHead();
            while (true) {
                head = head.get();
                if (head != null) {
                    Object leaveTransform = leaveTransform(head.value);
                    if (!io.reactivex.rxjava3.internal.util.q.isComplete(leaveTransform) && !io.reactivex.rxjava3.internal.util.q.isError(leaveTransform)) {
                        collection.add((Object) io.reactivex.rxjava3.internal.util.q.getValue(leaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public final void complete() {
            addLast(new f(enterTransform(io.reactivex.rxjava3.internal.util.q.complete())));
            truncateFinal();
        }

        Object enterTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public final void error(Throwable th) {
            addLast(new f(enterTransform(io.reactivex.rxjava3.internal.util.q.error(th))));
            truncateFinal();
        }

        f getHead() {
            return get();
        }

        boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && io.reactivex.rxjava3.internal.util.q.isComplete(leaveTransform(obj));
        }

        boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && io.reactivex.rxjava3.internal.util.q.isError(leaveTransform(obj));
        }

        Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public final void next(T t5) {
            addLast(new f(enterTransform(io.reactivex.rxjava3.internal.util.q.next(t5))));
            truncate();
        }

        final void removeFirst() {
            this.size--;
            setFirst(get().get());
        }

        final void removeSome(int i5) {
            f fVar = get();
            while (i5 > 0) {
                fVar = fVar.get();
                i5--;
                this.size--;
            }
            setFirst(fVar);
            f fVar2 = get();
            if (fVar2.get() == null) {
                this.tail = fVar2;
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public final void replay(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int i5 = 1;
            do {
                f fVar = (f) dVar.index();
                if (fVar == null) {
                    fVar = getHead();
                    dVar.index = fVar;
                }
                while (!dVar.isDisposed()) {
                    f fVar2 = fVar.get();
                    if (fVar2 != null) {
                        if (io.reactivex.rxjava3.internal.util.q.accept(leaveTransform(fVar2.value), dVar.child)) {
                            dVar.index = null;
                            return;
                        }
                        fVar = fVar2;
                    } else {
                        dVar.index = fVar;
                        i5 = dVar.addAndGet(-i5);
                    }
                }
                dVar.index = null;
                return;
            } while (i5 != 0);
        }

        final void setFirst(f fVar) {
            if (this.eagerTruncate) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                fVar = fVar2;
            }
            set(fVar);
        }

        final void trimHead() {
            f fVar = get();
            if (fVar.value != null) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        abstract void truncate();

        void truncateFinal() {
            trimHead();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b<T> {
        g<T> call();
    }

    /* loaded from: classes3.dex */
    static final class c<R> implements m3.g<io.reactivex.rxjava3.disposables.e> {

        /* renamed from: a, reason: collision with root package name */
        private final s4<R> f18155a;

        c(s4<R> s4Var) {
            this.f18155a = s4Var;
        }

        @Override // m3.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(io.reactivex.rxjava3.disposables.e eVar) {
            this.f18155a.setResource(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final io.reactivex.rxjava3.core.p0<? super T> child;
        Object index;
        final i<T> parent;

        d(i<T> iVar, io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            this.parent = iVar;
            this.child = p0Var;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.parent.remove(this);
                this.index = null;
            }
        }

        <U> U index() {
            return (U) this.index;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e<R, U> extends io.reactivex.rxjava3.core.i0<R> {

        /* renamed from: a, reason: collision with root package name */
        private final m3.s<? extends io.reactivex.rxjava3.observables.a<U>> f18156a;

        /* renamed from: b, reason: collision with root package name */
        private final m3.o<? super io.reactivex.rxjava3.core.i0<U>, ? extends io.reactivex.rxjava3.core.n0<R>> f18157b;

        e(m3.s<? extends io.reactivex.rxjava3.observables.a<U>> sVar, m3.o<? super io.reactivex.rxjava3.core.i0<U>, ? extends io.reactivex.rxjava3.core.n0<R>> oVar) {
            this.f18156a = sVar;
            this.f18157b = oVar;
        }

        @Override // io.reactivex.rxjava3.core.i0
        protected void l6(io.reactivex.rxjava3.core.p0<? super R> p0Var) {
            try {
                io.reactivex.rxjava3.observables.a<U> aVar = this.f18156a.get();
                Objects.requireNonNull(aVar, "The connectableFactory returned a null ConnectableObservable");
                io.reactivex.rxjava3.observables.a<U> aVar2 = aVar;
                io.reactivex.rxjava3.core.n0<R> apply = this.f18157b.apply(aVar2);
                Objects.requireNonNull(apply, "The selector returned a null ObservableSource");
                io.reactivex.rxjava3.core.n0<R> n0Var = apply;
                s4 s4Var = new s4(p0Var);
                n0Var.subscribe(s4Var);
                aVar2.M8(new c(s4Var));
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                io.reactivex.rxjava3.internal.disposables.d.error(th, p0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        f(Object obj) {
            this.value = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface g<T> {
        void complete();

        void error(Throwable th);

        void next(T t5);

        void replay(d<T> dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class h<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        final int f18158a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f18159b;

        h(int i5, boolean z4) {
            this.f18158a = i5;
            this.f18159b = z4;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.b
        public g<T> call() {
            return new m(this.f18158a, this.f18159b);
        }
    }

    /* loaded from: classes3.dex */
    static final class i<T> extends AtomicReference<io.reactivex.rxjava3.disposables.e> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        static final d[] EMPTY = new d[0];
        static final d[] TERMINATED = new d[0];
        private static final long serialVersionUID = -533785617179540163L;
        final g<T> buffer;
        boolean done;
        final AtomicReference<d[]> observers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        i(g<T> gVar) {
            this.buffer = gVar;
        }

        boolean add(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.observers.get();
                if (dVarArr == TERMINATED) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!androidx.compose.animation.core.h.a(this.observers, dVarArr, dVarArr2));
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.observers.set(TERMINATED);
            io.reactivex.rxjava3.internal.disposables.c.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.complete();
                replayFinal();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th);
                replayFinal();
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            if (!this.done) {
                this.buffer.next(t5);
                replay();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.setOnce(this, eVar)) {
                replay();
            }
        }

        void remove(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.observers.get();
                int length = dVarArr.length;
                if (length == 0) {
                    return;
                }
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (dVarArr[i5].equals(dVar)) {
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
                    dVarArr2 = EMPTY;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr, 0, dVarArr3, 0, i5);
                    System.arraycopy(dVarArr, i5 + 1, dVarArr3, i5, (length - i5) - 1);
                    dVarArr2 = dVarArr3;
                }
            } while (!androidx.compose.animation.core.h.a(this.observers, dVarArr, dVarArr2));
        }

        void replay() {
            for (d<T> dVar : this.observers.get()) {
                this.buffer.replay(dVar);
            }
        }

        void replayFinal() {
            for (d<T> dVar : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class j<T> implements io.reactivex.rxjava3.core.n0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<i<T>> f18160a;

        /* renamed from: b, reason: collision with root package name */
        private final b<T> f18161b;

        j(AtomicReference<i<T>> atomicReference, b<T> bVar) {
            this.f18160a = atomicReference;
            this.f18161b = bVar;
        }

        @Override // io.reactivex.rxjava3.core.n0
        public void subscribe(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
            i<T> iVar;
            while (true) {
                iVar = this.f18160a.get();
                if (iVar != null) {
                    break;
                }
                i<T> iVar2 = new i<>(this.f18161b.call());
                if (androidx.compose.animation.core.h.a(this.f18160a, null, iVar2)) {
                    iVar = iVar2;
                    break;
                }
            }
            d<T> dVar = new d<>(iVar, p0Var);
            p0Var.onSubscribe(dVar);
            iVar.add(dVar);
            if (dVar.isDisposed()) {
                iVar.remove(dVar);
            } else {
                iVar.buffer.replay(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class k<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f18162a;

        /* renamed from: b, reason: collision with root package name */
        private final long f18163b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f18164c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.q0 f18165d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f18166e;

        k(int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.f18162a = i5;
            this.f18163b = j5;
            this.f18164c = timeUnit;
            this.f18165d = q0Var;
            this.f18166e = z4;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.b
        public g<T> call() {
            return new l(this.f18162a, this.f18163b, this.f18164c, this.f18165d, this.f18166e);
        }
    }

    /* loaded from: classes3.dex */
    static final class l<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final TimeUnit unit;

        l(int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            super(z4);
            this.scheduler = q0Var;
            this.limit = i5;
            this.maxAge = j5;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.a
        Object enterTransform(Object obj) {
            return new io.reactivex.rxjava3.schedulers.d(obj, this.scheduler.d(this.unit), this.unit);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.a
        f getHead() {
            f fVar;
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 != null) {
                    io.reactivex.rxjava3.schedulers.d dVar = (io.reactivex.rxjava3.schedulers.d) fVar2.value;
                    if (io.reactivex.rxjava3.internal.util.q.isComplete(dVar.d()) || io.reactivex.rxjava3.internal.util.q.isError(dVar.d()) || dVar.a() > d5) {
                        break;
                    }
                    fVar3 = fVar2.get();
                } else {
                    break;
                }
            }
            return fVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.a
        Object leaveTransform(Object obj) {
            return ((io.reactivex.rxjava3.schedulers.d) obj).d();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.a
        void truncate() {
            f fVar;
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i5 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                int i6 = this.size;
                if (i6 > 1) {
                    if (i6 > this.limit) {
                        i5++;
                        this.size = i6 - 1;
                        fVar3 = fVar2.get();
                    } else {
                        if (((io.reactivex.rxjava3.schedulers.d) fVar2.value).a() > d5) {
                            break;
                        }
                        i5++;
                        this.size--;
                        fVar3 = fVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i5 != 0) {
                setFirst(fVar);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.a
        void truncateFinal() {
            f fVar;
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i5 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (this.size <= 1 || ((io.reactivex.rxjava3.schedulers.d) fVar2.value).a() > d5) {
                    break;
                }
                i5++;
                this.size--;
                fVar3 = fVar2.get();
            }
            if (i5 != 0) {
                setFirst(fVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class m<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        m(int i5, boolean z4) {
            super(z4);
            this.limit = i5;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.a
        void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class n implements b<Object> {
        n() {
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.b
        public g<Object> call() {
            return new o(16);
        }
    }

    /* loaded from: classes3.dex */
    static final class o<T> extends ArrayList<Object> implements g<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        o(int i5) {
            super(i5);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public void complete() {
            add(io.reactivex.rxjava3.internal.util.q.complete());
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public void error(Throwable th) {
            add(io.reactivex.rxjava3.internal.util.q.error(th));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public void next(T t5) {
            add(io.reactivex.rxjava3.internal.util.q.next(t5));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.w2.g
        public void replay(d<T> dVar) {
            int i5;
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super T> p0Var = dVar.child;
            int i6 = 1;
            while (!dVar.isDisposed()) {
                int i7 = this.size;
                Integer num = (Integer) dVar.index();
                if (num != null) {
                    i5 = num.intValue();
                } else {
                    i5 = 0;
                }
                while (i5 < i7) {
                    if (io.reactivex.rxjava3.internal.util.q.accept(get(i5), p0Var) || dVar.isDisposed()) {
                        return;
                    } else {
                        i5++;
                    }
                }
                dVar.index = Integer.valueOf(i5);
                i6 = dVar.addAndGet(-i6);
                if (i6 == 0) {
                    return;
                }
            }
        }
    }

    private w2(io.reactivex.rxjava3.core.n0<T> n0Var, io.reactivex.rxjava3.core.n0<T> n0Var2, AtomicReference<i<T>> atomicReference, b<T> bVar) {
        this.f18154d = n0Var;
        this.f18151a = n0Var2;
        this.f18152b = atomicReference;
        this.f18153c = bVar;
    }

    public static <T> io.reactivex.rxjava3.observables.a<T> U8(io.reactivex.rxjava3.core.n0<T> n0Var, int i5, boolean z4) {
        if (i5 == Integer.MAX_VALUE) {
            return Y8(n0Var);
        }
        return X8(n0Var, new h(i5, z4));
    }

    public static <T> io.reactivex.rxjava3.observables.a<T> V8(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
        return X8(n0Var, new k(i5, j5, timeUnit, q0Var, z4));
    }

    public static <T> io.reactivex.rxjava3.observables.a<T> W8(io.reactivex.rxjava3.core.n0<T> n0Var, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        return V8(n0Var, j5, timeUnit, q0Var, Integer.MAX_VALUE, z4);
    }

    static <T> io.reactivex.rxjava3.observables.a<T> X8(io.reactivex.rxjava3.core.n0<T> n0Var, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.rxjava3.plugins.a.U(new w2(new j(atomicReference, bVar), n0Var, atomicReference, bVar));
    }

    public static <T> io.reactivex.rxjava3.observables.a<T> Y8(io.reactivex.rxjava3.core.n0<? extends T> n0Var) {
        return X8(n0Var, f18150e);
    }

    public static <U, R> io.reactivex.rxjava3.core.i0<R> Z8(m3.s<? extends io.reactivex.rxjava3.observables.a<U>> sVar, m3.o<? super io.reactivex.rxjava3.core.i0<U>, ? extends io.reactivex.rxjava3.core.n0<R>> oVar) {
        return io.reactivex.rxjava3.plugins.a.R(new e(sVar, oVar));
    }

    @Override // io.reactivex.rxjava3.observables.a
    public void M8(m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        i<T> iVar;
        boolean z4;
        while (true) {
            iVar = this.f18152b.get();
            if (iVar != null && !iVar.isDisposed()) {
                break;
            }
            i<T> iVar2 = new i<>(this.f18153c.call());
            if (androidx.compose.animation.core.h.a(this.f18152b, iVar, iVar2)) {
                iVar = iVar2;
                break;
            }
        }
        if (!iVar.shouldConnect.get() && iVar.shouldConnect.compareAndSet(false, true)) {
            z4 = true;
        } else {
            z4 = false;
        }
        try {
            gVar.accept(iVar);
            if (z4) {
                this.f18151a.subscribe(iVar);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            if (z4) {
                iVar.shouldConnect.compareAndSet(true, false);
            }
            io.reactivex.rxjava3.exceptions.b.b(th);
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }

    @Override // io.reactivex.rxjava3.observables.a
    public void T8() {
        i<T> iVar = this.f18152b.get();
        if (iVar != null && iVar.isDisposed()) {
            androidx.compose.animation.core.h.a(this.f18152b, iVar, null);
        }
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super T> p0Var) {
        this.f18154d.subscribe(p0Var);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.i
    public io.reactivex.rxjava3.core.n0<T> source() {
        return this.f18151a;
    }
}
