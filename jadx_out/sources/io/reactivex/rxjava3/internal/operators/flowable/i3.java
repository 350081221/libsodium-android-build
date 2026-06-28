package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class i3<T> extends io.reactivex.rxjava3.flowables.a<T> implements io.reactivex.rxjava3.internal.fuseable.j<T> {

    /* renamed from: f, reason: collision with root package name */
    static final m3.s f16797f = new b();

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.rxjava3.core.o<T> f16798b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<i<T>> f16799c;

    /* renamed from: d, reason: collision with root package name */
    final m3.s<? extends f<T>> f16800d;

    /* renamed from: e, reason: collision with root package name */
    final org.reactivestreams.o<T> f16801e;

    /* loaded from: classes3.dex */
    static abstract class a<T> extends AtomicReference<e> implements f<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        final boolean eagerTruncate;
        long index;
        int size;
        e tail;

        a(boolean z4) {
            this.eagerTruncate = z4;
            e eVar = new e(null, 0L);
            this.tail = eVar;
            set(eVar);
        }

        final void addLast(e eVar) {
            this.tail.set(eVar);
            this.tail = eVar;
            this.size++;
        }

        final void collect(Collection<? super T> collection) {
            e head = getHead();
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

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public final void complete() {
            Object enterTransform = enterTransform(io.reactivex.rxjava3.internal.util.q.complete(), true);
            long j5 = this.index + 1;
            this.index = j5;
            addLast(new e(enterTransform, j5));
            truncateFinal();
        }

        Object enterTransform(Object obj, boolean z4) {
            return obj;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public final void error(Throwable th) {
            Object enterTransform = enterTransform(io.reactivex.rxjava3.internal.util.q.error(th), true);
            long j5 = this.index + 1;
            this.index = j5;
            addLast(new e(enterTransform, j5));
            truncateFinal();
        }

        e getHead() {
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

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public final void next(T t5) {
            Object enterTransform = enterTransform(io.reactivex.rxjava3.internal.util.q.next(t5), false);
            long j5 = this.index + 1;
            this.index = j5;
            addLast(new e(enterTransform, j5));
            truncate();
        }

        final void removeFirst() {
            e eVar = get().get();
            if (eVar != null) {
                this.size--;
                setFirst(eVar);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }

        final void removeSome(int i5) {
            e eVar = get();
            while (i5 > 0) {
                eVar = eVar.get();
                i5--;
                this.size--;
            }
            setFirst(eVar);
            e eVar2 = get();
            if (eVar2.get() == null) {
                this.tail = eVar2;
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public final void replay(c<T> cVar) {
            boolean z4;
            synchronized (cVar) {
                if (cVar.emitting) {
                    cVar.missed = true;
                    return;
                }
                cVar.emitting = true;
                while (true) {
                    long j5 = cVar.get();
                    if (j5 == Long.MAX_VALUE) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    e eVar = (e) cVar.index();
                    if (eVar == null) {
                        eVar = getHead();
                        cVar.index = eVar;
                        io.reactivex.rxjava3.internal.util.d.a(cVar.totalRequested, eVar.index);
                    }
                    long j6 = 0;
                    while (j5 != 0) {
                        if (cVar.isDisposed()) {
                            cVar.index = null;
                            return;
                        }
                        e eVar2 = eVar.get();
                        if (eVar2 == null) {
                            break;
                        }
                        Object leaveTransform = leaveTransform(eVar2.value);
                        try {
                            if (io.reactivex.rxjava3.internal.util.q.accept(leaveTransform, cVar.child)) {
                                cVar.index = null;
                                return;
                            } else {
                                j6++;
                                j5--;
                                eVar = eVar2;
                            }
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            cVar.index = null;
                            cVar.dispose();
                            if (!io.reactivex.rxjava3.internal.util.q.isError(leaveTransform) && !io.reactivex.rxjava3.internal.util.q.isComplete(leaveTransform)) {
                                cVar.child.onError(th);
                                return;
                            } else {
                                io.reactivex.rxjava3.plugins.a.Y(th);
                                return;
                            }
                        }
                    }
                    if (j5 == 0 && cVar.isDisposed()) {
                        cVar.index = null;
                        return;
                    }
                    if (j6 != 0) {
                        cVar.index = eVar;
                        if (!z4) {
                            cVar.produced(j6);
                        }
                    }
                    synchronized (cVar) {
                        if (!cVar.missed) {
                            cVar.emitting = false;
                            return;
                        }
                        cVar.missed = false;
                    }
                }
            }
        }

        final void setFirst(e eVar) {
            if (this.eagerTruncate) {
                e eVar2 = new e(null, eVar.index);
                eVar2.lazySet(eVar.get());
                eVar = eVar2;
            }
            set(eVar);
        }

        final void trimHead() {
            e eVar = get();
            if (eVar.value != null) {
                e eVar2 = new e(null, 0L);
                eVar2.lazySet(eVar.get());
                set(eVar2);
            }
        }

        abstract void truncate();

        void truncateFinal() {
            trimHead();
        }
    }

    /* loaded from: classes3.dex */
    static final class b implements m3.s<Object> {
        b() {
        }

        @Override // m3.s
        public Object get() {
            return new m(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicLong implements org.reactivestreams.q, io.reactivex.rxjava3.disposables.e {
        static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final org.reactivestreams.p<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final i<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        c(i<T> iVar, org.reactivestreams.p<? super T> pVar) {
            this.parent = iVar;
            this.child = pVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.manageRequests();
                this.index = null;
            }
        }

        <U> U index() {
            return (U) this.index;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long j5) {
            return io.reactivex.rxjava3.internal.util.d.f(this, j5);
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.validate(j5) && io.reactivex.rxjava3.internal.util.d.b(this, j5) != Long.MIN_VALUE) {
                io.reactivex.rxjava3.internal.util.d.a(this.totalRequested, j5);
                this.parent.manageRequests();
                this.parent.buffer.replay(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d<R, U> extends io.reactivex.rxjava3.core.o<R> {

        /* renamed from: b, reason: collision with root package name */
        private final m3.s<? extends io.reactivex.rxjava3.flowables.a<U>> f16802b;

        /* renamed from: c, reason: collision with root package name */
        private final m3.o<? super io.reactivex.rxjava3.core.o<U>, ? extends org.reactivestreams.o<R>> f16803c;

        /* loaded from: classes3.dex */
        final class a implements m3.g<io.reactivex.rxjava3.disposables.e> {

            /* renamed from: a, reason: collision with root package name */
            private final io.reactivex.rxjava3.internal.subscribers.v<R> f16804a;

            a(io.reactivex.rxjava3.internal.subscribers.v<R> vVar) {
                this.f16804a = vVar;
            }

            @Override // m3.g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(io.reactivex.rxjava3.disposables.e eVar) {
                this.f16804a.setResource(eVar);
            }
        }

        d(m3.s<? extends io.reactivex.rxjava3.flowables.a<U>> sVar, m3.o<? super io.reactivex.rxjava3.core.o<U>, ? extends org.reactivestreams.o<R>> oVar) {
            this.f16802b = sVar;
            this.f16803c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.o
        protected void O6(org.reactivestreams.p<? super R> pVar) {
            try {
                io.reactivex.rxjava3.flowables.a aVar = (io.reactivex.rxjava3.flowables.a) io.reactivex.rxjava3.internal.util.k.d(this.f16802b.get(), "The connectableFactory returned a null ConnectableFlowable.");
                try {
                    org.reactivestreams.o oVar = (org.reactivestreams.o) io.reactivex.rxjava3.internal.util.k.d(this.f16803c.apply(aVar), "The selector returned a null Publisher.");
                    io.reactivex.rxjava3.internal.subscribers.v vVar = new io.reactivex.rxjava3.internal.subscribers.v(pVar);
                    oVar.subscribe(vVar);
                    aVar.r9(new a(vVar));
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.b.b(th2);
                io.reactivex.rxjava3.internal.subscriptions.g.error(th2, pVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e extends AtomicReference<e> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        e(Object obj, long j5) {
            this.value = obj;
            this.index = j5;
        }
    }

    /* loaded from: classes3.dex */
    interface f<T> {
        void complete();

        void error(Throwable th);

        void next(T t5);

        void replay(c<T> cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class g<T> implements m3.s<f<T>> {

        /* renamed from: a, reason: collision with root package name */
        final int f16806a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f16807b;

        g(int i5, boolean z4) {
            this.f16806a = i5;
            this.f16807b = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f<T> get() {
            return new l(this.f16806a, this.f16807b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class h<T> implements org.reactivestreams.o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<i<T>> f16808a;

        /* renamed from: b, reason: collision with root package name */
        private final m3.s<? extends f<T>> f16809b;

        h(AtomicReference<i<T>> atomicReference, m3.s<? extends f<T>> sVar) {
            this.f16808a = atomicReference;
            this.f16809b = sVar;
        }

        @Override // org.reactivestreams.o
        public void subscribe(org.reactivestreams.p<? super T> pVar) {
            i<T> iVar;
            while (true) {
                iVar = this.f16808a.get();
                if (iVar != null) {
                    break;
                }
                try {
                    i<T> iVar2 = new i<>(this.f16809b.get());
                    if (androidx.compose.animation.core.h.a(this.f16808a, null, iVar2)) {
                        iVar = iVar2;
                        break;
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    io.reactivex.rxjava3.internal.subscriptions.g.error(th, pVar);
                    return;
                }
            }
            c<T> cVar = new c<>(iVar, pVar);
            pVar.onSubscribe(cVar);
            iVar.add(cVar);
            if (cVar.isDisposed()) {
                iVar.remove(cVar);
            } else {
                iVar.manageRequests();
                iVar.buffer.replay(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class i<T> extends AtomicReference<org.reactivestreams.q> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.e {
        static final c[] EMPTY = new c[0];
        static final c[] TERMINATED = new c[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final f<T> buffer;
        boolean done;
        long requestedFromUpstream;
        final AtomicInteger management = new AtomicInteger();
        final AtomicReference<c<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        i(f<T> fVar) {
            this.buffer = fVar;
        }

        boolean add(c<T> cVar) {
            c<T>[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = this.subscribers.get();
                if (cVarArr == TERMINATED) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!androidx.compose.animation.core.h.a(this.subscribers, cVarArr, cVarArr2));
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.subscribers.set(TERMINATED);
            io.reactivex.rxjava3.internal.subscriptions.j.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        void manageRequests() {
            AtomicInteger atomicInteger = this.management;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int i5 = 1;
            while (!isDisposed()) {
                org.reactivestreams.q qVar = get();
                if (qVar != null) {
                    long j5 = this.requestedFromUpstream;
                    long j6 = j5;
                    for (c<T> cVar : this.subscribers.get()) {
                        j6 = Math.max(j6, cVar.totalRequested.get());
                    }
                    long j7 = j6 - j5;
                    if (j7 != 0) {
                        this.requestedFromUpstream = j6;
                        qVar.request(j7);
                    }
                }
                i5 = atomicInteger.addAndGet(-i5);
                if (i5 == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.complete();
                for (c<T> cVar : this.subscribers.getAndSet(TERMINATED)) {
                    this.buffer.replay(cVar);
                }
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th);
                for (c<T> cVar : this.subscribers.getAndSet(TERMINATED)) {
                    this.buffer.replay(cVar);
                }
                return;
            }
            io.reactivex.rxjava3.plugins.a.Y(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            if (!this.done) {
                this.buffer.next(t5);
                for (c<T> cVar : this.subscribers.get()) {
                    this.buffer.replay(cVar);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            if (io.reactivex.rxjava3.internal.subscriptions.j.setOnce(this, qVar)) {
                manageRequests();
                for (c<T> cVar : this.subscribers.get()) {
                    this.buffer.replay(cVar);
                }
            }
        }

        void remove(c<T> cVar) {
            c<T>[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = this.subscribers.get();
                int length = cVarArr.length;
                if (length == 0) {
                    return;
                }
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (cVarArr[i5].equals(cVar)) {
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
                    cVarArr2 = EMPTY;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i5);
                    System.arraycopy(cVarArr, i5 + 1, cVarArr3, i5, (length - i5) - 1);
                    cVarArr2 = cVarArr3;
                }
            } while (!androidx.compose.animation.core.h.a(this.subscribers, cVarArr, cVarArr2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class j<T> implements m3.s<f<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final int f16810a;

        /* renamed from: b, reason: collision with root package name */
        private final long f16811b;

        /* renamed from: c, reason: collision with root package name */
        private final TimeUnit f16812c;

        /* renamed from: d, reason: collision with root package name */
        private final io.reactivex.rxjava3.core.q0 f16813d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f16814e;

        j(int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            this.f16810a = i5;
            this.f16811b = j5;
            this.f16812c = timeUnit;
            this.f16813d = q0Var;
            this.f16814e = z4;
        }

        @Override // m3.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f<T> get() {
            return new k(this.f16810a, this.f16811b, this.f16812c, this.f16813d, this.f16814e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class k<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final io.reactivex.rxjava3.core.q0 scheduler;
        final TimeUnit unit;

        k(int i5, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
            super(z4);
            this.scheduler = q0Var;
            this.limit = i5;
            this.maxAge = j5;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.a
        Object enterTransform(Object obj, boolean z4) {
            return new io.reactivex.rxjava3.schedulers.d(obj, z4 ? Long.MAX_VALUE : this.scheduler.d(this.unit), this.unit);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.a
        e getHead() {
            e eVar;
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            e eVar2 = get();
            e eVar3 = eVar2.get();
            while (true) {
                e eVar4 = eVar3;
                eVar = eVar2;
                eVar2 = eVar4;
                if (eVar2 != null) {
                    io.reactivex.rxjava3.schedulers.d dVar = (io.reactivex.rxjava3.schedulers.d) eVar2.value;
                    if (io.reactivex.rxjava3.internal.util.q.isComplete(dVar.d()) || io.reactivex.rxjava3.internal.util.q.isError(dVar.d()) || dVar.a() > d5) {
                        break;
                    }
                    eVar3 = eVar2.get();
                } else {
                    break;
                }
            }
            return eVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.a
        Object leaveTransform(Object obj) {
            return ((io.reactivex.rxjava3.schedulers.d) obj).d();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.a
        void truncate() {
            e eVar;
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            e eVar2 = get();
            e eVar3 = eVar2.get();
            int i5 = 0;
            while (true) {
                e eVar4 = eVar3;
                eVar = eVar2;
                eVar2 = eVar4;
                int i6 = this.size;
                if (i6 > 1) {
                    if (i6 > this.limit) {
                        i5++;
                        this.size = i6 - 1;
                        eVar3 = eVar2.get();
                    } else {
                        if (((io.reactivex.rxjava3.schedulers.d) eVar2.value).a() > d5) {
                            break;
                        }
                        i5++;
                        this.size--;
                        eVar3 = eVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i5 != 0) {
                setFirst(eVar);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.a
        void truncateFinal() {
            e eVar;
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            e eVar2 = get();
            e eVar3 = eVar2.get();
            int i5 = 0;
            while (true) {
                e eVar4 = eVar3;
                eVar = eVar2;
                eVar2 = eVar4;
                if (this.size <= 1 || ((io.reactivex.rxjava3.schedulers.d) eVar2.value).a() > d5) {
                    break;
                }
                i5++;
                this.size--;
                eVar3 = eVar2.get();
            }
            if (i5 != 0) {
                setFirst(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class l<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        l(int i5, boolean z4) {
            super(z4);
            this.limit = i5;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.a
        void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class m<T> extends ArrayList<Object> implements f<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        m(int i5) {
            super(i5);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public void complete() {
            add(io.reactivex.rxjava3.internal.util.q.complete());
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public void error(Throwable th) {
            add(io.reactivex.rxjava3.internal.util.q.error(th));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public void next(T t5) {
            add(io.reactivex.rxjava3.internal.util.q.next(t5));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.i3.f
        public void replay(c<T> cVar) {
            int i5;
            synchronized (cVar) {
                if (cVar.emitting) {
                    cVar.missed = true;
                    return;
                }
                cVar.emitting = true;
                org.reactivestreams.p<? super T> pVar = cVar.child;
                while (!cVar.isDisposed()) {
                    int i6 = this.size;
                    Integer num = (Integer) cVar.index();
                    if (num != null) {
                        i5 = num.intValue();
                    } else {
                        i5 = 0;
                    }
                    long j5 = cVar.get();
                    long j6 = j5;
                    long j7 = 0;
                    while (j6 != 0 && i5 < i6) {
                        Object obj = get(i5);
                        try {
                            if (io.reactivex.rxjava3.internal.util.q.accept(obj, pVar) || cVar.isDisposed()) {
                                return;
                            }
                            i5++;
                            j6--;
                            j7++;
                        } catch (Throwable th) {
                            io.reactivex.rxjava3.exceptions.b.b(th);
                            cVar.dispose();
                            if (!io.reactivex.rxjava3.internal.util.q.isError(obj) && !io.reactivex.rxjava3.internal.util.q.isComplete(obj)) {
                                pVar.onError(th);
                                return;
                            } else {
                                io.reactivex.rxjava3.plugins.a.Y(th);
                                return;
                            }
                        }
                    }
                    if (j7 != 0) {
                        cVar.index = Integer.valueOf(i5);
                        if (j5 != Long.MAX_VALUE) {
                            cVar.produced(j7);
                        }
                    }
                    synchronized (cVar) {
                        if (!cVar.missed) {
                            cVar.emitting = false;
                            return;
                        }
                        cVar.missed = false;
                    }
                }
            }
        }
    }

    private i3(org.reactivestreams.o<T> oVar, io.reactivex.rxjava3.core.o<T> oVar2, AtomicReference<i<T>> atomicReference, m3.s<? extends f<T>> sVar) {
        this.f16801e = oVar;
        this.f16798b = oVar2;
        this.f16799c = atomicReference;
        this.f16800d = sVar;
    }

    public static <T> io.reactivex.rxjava3.flowables.a<T> A9(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, int i5, boolean z4) {
        return C9(oVar, new j(i5, j5, timeUnit, q0Var, z4));
    }

    public static <T> io.reactivex.rxjava3.flowables.a<T> B9(io.reactivex.rxjava3.core.o<T> oVar, long j5, TimeUnit timeUnit, io.reactivex.rxjava3.core.q0 q0Var, boolean z4) {
        return A9(oVar, j5, timeUnit, q0Var, Integer.MAX_VALUE, z4);
    }

    static <T> io.reactivex.rxjava3.flowables.a<T> C9(io.reactivex.rxjava3.core.o<T> oVar, m3.s<? extends f<T>> sVar) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.rxjava3.plugins.a.T(new i3(new h(atomicReference, sVar), oVar, atomicReference, sVar));
    }

    public static <T> io.reactivex.rxjava3.flowables.a<T> D9(io.reactivex.rxjava3.core.o<? extends T> oVar) {
        return C9(oVar, f16797f);
    }

    public static <U, R> io.reactivex.rxjava3.core.o<R> E9(m3.s<? extends io.reactivex.rxjava3.flowables.a<U>> sVar, m3.o<? super io.reactivex.rxjava3.core.o<U>, ? extends org.reactivestreams.o<R>> oVar) {
        return new d(sVar, oVar);
    }

    public static <T> io.reactivex.rxjava3.flowables.a<T> z9(io.reactivex.rxjava3.core.o<T> oVar, int i5, boolean z4) {
        if (i5 == Integer.MAX_VALUE) {
            return D9(oVar);
        }
        return C9(oVar, new g(i5, z4));
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        this.f16801e.subscribe(pVar);
    }

    @Override // io.reactivex.rxjava3.flowables.a
    public void r9(m3.g<? super io.reactivex.rxjava3.disposables.e> gVar) {
        i<T> iVar;
        boolean z4;
        while (true) {
            iVar = this.f16799c.get();
            if (iVar != null && !iVar.isDisposed()) {
                break;
            }
            try {
                i<T> iVar2 = new i<>(this.f16800d.get());
                if (androidx.compose.animation.core.h.a(this.f16799c, iVar, iVar2)) {
                    iVar = iVar2;
                    break;
                }
            } finally {
                io.reactivex.rxjava3.exceptions.b.b(th);
                RuntimeException i5 = io.reactivex.rxjava3.internal.util.k.i(th);
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
                this.f16798b.N6(iVar);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.b.b(th);
            if (z4) {
                iVar.shouldConnect.compareAndSet(true, false);
            }
            throw io.reactivex.rxjava3.internal.util.k.i(th);
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.j
    public org.reactivestreams.o<T> source() {
        return this.f16798b;
    }

    @Override // io.reactivex.rxjava3.flowables.a
    public void y9() {
        i<T> iVar = this.f16799c.get();
        if (iVar != null && iVar.isDisposed()) {
            androidx.compose.animation.core.h.a(this.f16799c, iVar, null);
        }
    }
}
