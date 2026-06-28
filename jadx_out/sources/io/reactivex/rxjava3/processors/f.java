package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.internal.subscriptions.j;
import io.reactivex.rxjava3.internal.util.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.p;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public final class f<T> extends io.reactivex.rxjava3.processors.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f18797e = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    static final c[] f18798f = new c[0];

    /* renamed from: g, reason: collision with root package name */
    static final c[] f18799g = new c[0];

    /* renamed from: b, reason: collision with root package name */
    final b<T> f18800b;

    /* renamed from: c, reason: collision with root package name */
    boolean f18801c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference<c<T>[]> f18802d = new AtomicReference<>(f18798f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        a(T t5) {
            this.value = t5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b<T> {
        void a(c<T> cVar);

        void complete();

        void error(Throwable th);

        Throwable getError();

        @l3.g
        T getValue();

        T[] getValues(T[] tArr);

        boolean isDone();

        void next(T t5);

        int size();

        void trimHead();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicInteger implements q {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final p<? super T> downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final f<T> state;

        c(p<? super T> pVar, f<T> fVar) {
            this.downstream = pVar;
            this.state = fVar;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.E9(this);
            }
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            if (j.validate(j5)) {
                io.reactivex.rxjava3.internal.util.d.a(this.requested, j5);
                this.state.f18800b.a(this);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        final int f18803a;

        /* renamed from: b, reason: collision with root package name */
        final long f18804b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f18805c;

        /* renamed from: d, reason: collision with root package name */
        final q0 f18806d;

        /* renamed from: e, reason: collision with root package name */
        int f18807e;

        /* renamed from: f, reason: collision with root package name */
        volatile C0533f<T> f18808f;

        /* renamed from: g, reason: collision with root package name */
        C0533f<T> f18809g;

        /* renamed from: h, reason: collision with root package name */
        Throwable f18810h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f18811i;

        d(int i5, long j5, TimeUnit timeUnit, q0 q0Var) {
            this.f18803a = i5;
            this.f18804b = j5;
            this.f18805c = timeUnit;
            this.f18806d = q0Var;
            C0533f<T> c0533f = new C0533f<>(null, 0L);
            this.f18809g = c0533f;
            this.f18808f = c0533f;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void a(c<T> cVar) {
            boolean z4;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            p<? super T> pVar = cVar.downstream;
            C0533f<T> c0533f = (C0533f) cVar.index;
            if (c0533f == null) {
                c0533f = b();
            }
            long j5 = cVar.emitted;
            int i5 = 1;
            do {
                long j6 = cVar.requested.get();
                while (j5 != j6) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    boolean z5 = this.f18811i;
                    C0533f<T> c0533f2 = c0533f.get();
                    if (c0533f2 == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        cVar.index = null;
                        cVar.cancelled = true;
                        Throwable th = this.f18810h;
                        if (th == null) {
                            pVar.onComplete();
                            return;
                        } else {
                            pVar.onError(th);
                            return;
                        }
                    }
                    if (z4) {
                        break;
                    }
                    pVar.onNext(c0533f2.value);
                    j5++;
                    c0533f = c0533f2;
                }
                if (j5 == j6) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    if (this.f18811i && c0533f.get() == null) {
                        cVar.index = null;
                        cVar.cancelled = true;
                        Throwable th2 = this.f18810h;
                        if (th2 == null) {
                            pVar.onComplete();
                            return;
                        } else {
                            pVar.onError(th2);
                            return;
                        }
                    }
                }
                cVar.index = c0533f;
                cVar.emitted = j5;
                i5 = cVar.addAndGet(-i5);
            } while (i5 != 0);
        }

        C0533f<T> b() {
            C0533f<T> c0533f;
            C0533f<T> c0533f2 = this.f18808f;
            long d5 = this.f18806d.d(this.f18805c) - this.f18804b;
            C0533f<T> c0533f3 = c0533f2.get();
            while (true) {
                C0533f<T> c0533f4 = c0533f3;
                c0533f = c0533f2;
                c0533f2 = c0533f4;
                if (c0533f2 == null || c0533f2.time > d5) {
                    break;
                }
                c0533f3 = c0533f2.get();
            }
            return c0533f;
        }

        int c(C0533f<T> c0533f) {
            int i5 = 0;
            while (i5 != Integer.MAX_VALUE && (c0533f = c0533f.get()) != null) {
                i5++;
            }
            return i5;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void complete() {
            e();
            this.f18811i = true;
        }

        void d() {
            int i5 = this.f18807e;
            if (i5 > this.f18803a) {
                this.f18807e = i5 - 1;
                this.f18808f = this.f18808f.get();
            }
            long d5 = this.f18806d.d(this.f18805c) - this.f18804b;
            C0533f<T> c0533f = this.f18808f;
            while (this.f18807e > 1) {
                C0533f<T> c0533f2 = c0533f.get();
                if (c0533f2.time > d5) {
                    this.f18808f = c0533f;
                    return;
                } else {
                    this.f18807e--;
                    c0533f = c0533f2;
                }
            }
            this.f18808f = c0533f;
        }

        void e() {
            long d5 = this.f18806d.d(this.f18805c) - this.f18804b;
            C0533f<T> c0533f = this.f18808f;
            while (true) {
                C0533f<T> c0533f2 = c0533f.get();
                if (c0533f2 == null) {
                    if (c0533f.value != null) {
                        this.f18808f = new C0533f<>(null, 0L);
                        return;
                    } else {
                        this.f18808f = c0533f;
                        return;
                    }
                }
                if (c0533f2.time > d5) {
                    if (c0533f.value != null) {
                        C0533f<T> c0533f3 = new C0533f<>(null, 0L);
                        c0533f3.lazySet(c0533f.get());
                        this.f18808f = c0533f3;
                        return;
                    }
                    this.f18808f = c0533f;
                    return;
                }
                c0533f = c0533f2;
            }
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void error(Throwable th) {
            e();
            this.f18810h = th;
            this.f18811i = true;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public Throwable getError() {
            return this.f18810h;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        @l3.g
        public T getValue() {
            C0533f<T> c0533f = this.f18808f;
            while (true) {
                C0533f<T> c0533f2 = c0533f.get();
                if (c0533f2 == null) {
                    break;
                }
                c0533f = c0533f2;
            }
            if (c0533f.time < this.f18806d.d(this.f18805c) - this.f18804b) {
                return null;
            }
            return c0533f.value;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public T[] getValues(T[] tArr) {
            C0533f<T> b5 = b();
            int c5 = c(b5);
            if (c5 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
            } else {
                if (tArr.length < c5) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), c5));
                }
                for (int i5 = 0; i5 != c5; i5++) {
                    b5 = b5.get();
                    tArr[i5] = b5.value;
                }
                if (tArr.length > c5) {
                    tArr[c5] = null;
                }
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public boolean isDone() {
            return this.f18811i;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void next(T t5) {
            C0533f<T> c0533f = new C0533f<>(t5, this.f18806d.d(this.f18805c));
            C0533f<T> c0533f2 = this.f18809g;
            this.f18809g = c0533f;
            this.f18807e++;
            c0533f2.set(c0533f);
            d();
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public int size() {
            return c(b());
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void trimHead() {
            if (this.f18808f.value != null) {
                C0533f<T> c0533f = new C0533f<>(null, 0L);
                c0533f.lazySet(this.f18808f.get());
                this.f18808f = c0533f;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class e<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        final int f18812a;

        /* renamed from: b, reason: collision with root package name */
        int f18813b;

        /* renamed from: c, reason: collision with root package name */
        volatile a<T> f18814c;

        /* renamed from: d, reason: collision with root package name */
        a<T> f18815d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f18816e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f18817f;

        e(int i5) {
            this.f18812a = i5;
            a<T> aVar = new a<>(null);
            this.f18815d = aVar;
            this.f18814c = aVar;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void a(c<T> cVar) {
            boolean z4;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            p<? super T> pVar = cVar.downstream;
            a<T> aVar = (a) cVar.index;
            if (aVar == null) {
                aVar = this.f18814c;
            }
            long j5 = cVar.emitted;
            int i5 = 1;
            do {
                long j6 = cVar.requested.get();
                while (j5 != j6) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    boolean z5 = this.f18817f;
                    a<T> aVar2 = aVar.get();
                    if (aVar2 == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5 && z4) {
                        cVar.index = null;
                        cVar.cancelled = true;
                        Throwable th = this.f18816e;
                        if (th == null) {
                            pVar.onComplete();
                            return;
                        } else {
                            pVar.onError(th);
                            return;
                        }
                    }
                    if (z4) {
                        break;
                    }
                    pVar.onNext(aVar2.value);
                    j5++;
                    aVar = aVar2;
                }
                if (j5 == j6) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    if (this.f18817f && aVar.get() == null) {
                        cVar.index = null;
                        cVar.cancelled = true;
                        Throwable th2 = this.f18816e;
                        if (th2 == null) {
                            pVar.onComplete();
                            return;
                        } else {
                            pVar.onError(th2);
                            return;
                        }
                    }
                }
                cVar.index = aVar;
                cVar.emitted = j5;
                i5 = cVar.addAndGet(-i5);
            } while (i5 != 0);
        }

        void b() {
            int i5 = this.f18813b;
            if (i5 > this.f18812a) {
                this.f18813b = i5 - 1;
                this.f18814c = this.f18814c.get();
            }
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void complete() {
            trimHead();
            this.f18817f = true;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void error(Throwable th) {
            this.f18816e = th;
            trimHead();
            this.f18817f = true;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public Throwable getError() {
            return this.f18816e;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public T getValue() {
            a<T> aVar = this.f18814c;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.value;
                }
                aVar = aVar2;
            }
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public T[] getValues(T[] tArr) {
            a<T> aVar = this.f18814c;
            a<T> aVar2 = aVar;
            int i5 = 0;
            while (true) {
                aVar2 = aVar2.get();
                if (aVar2 == null) {
                    break;
                }
                i5++;
            }
            if (tArr.length < i5) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i5));
            }
            for (int i6 = 0; i6 < i5; i6++) {
                aVar = aVar.get();
                tArr[i6] = aVar.value;
            }
            if (tArr.length > i5) {
                tArr[i5] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public boolean isDone() {
            return this.f18817f;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void next(T t5) {
            a<T> aVar = new a<>(t5);
            a<T> aVar2 = this.f18815d;
            this.f18815d = aVar;
            this.f18813b++;
            aVar2.set(aVar);
            b();
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public int size() {
            a<T> aVar = this.f18814c;
            int i5 = 0;
            while (i5 != Integer.MAX_VALUE && (aVar = aVar.get()) != null) {
                i5++;
            }
            return i5;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void trimHead() {
            if (this.f18814c.value != null) {
                a<T> aVar = new a<>(null);
                aVar.lazySet(this.f18814c.get());
                this.f18814c = aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.rxjava3.processors.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0533f<T> extends AtomicReference<C0533f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        C0533f(T t5, long j5) {
            this.value = t5;
            this.time = j5;
        }
    }

    /* loaded from: classes3.dex */
    static final class g<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        final List<T> f18818a;

        /* renamed from: b, reason: collision with root package name */
        Throwable f18819b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f18820c;

        /* renamed from: d, reason: collision with root package name */
        volatile int f18821d;

        g(int i5) {
            this.f18818a = new ArrayList(i5);
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void a(c<T> cVar) {
            int i5;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f18818a;
            p<? super T> pVar = cVar.downstream;
            Integer num = (Integer) cVar.index;
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = 0;
                cVar.index = 0;
            }
            long j5 = cVar.emitted;
            int i6 = 1;
            do {
                long j6 = cVar.requested.get();
                while (j5 != j6) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    boolean z4 = this.f18820c;
                    int i7 = this.f18821d;
                    if (z4 && i5 == i7) {
                        cVar.index = null;
                        cVar.cancelled = true;
                        Throwable th = this.f18819b;
                        if (th == null) {
                            pVar.onComplete();
                            return;
                        } else {
                            pVar.onError(th);
                            return;
                        }
                    }
                    if (i5 == i7) {
                        break;
                    }
                    pVar.onNext(list.get(i5));
                    i5++;
                    j5++;
                }
                if (j5 == j6) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    boolean z5 = this.f18820c;
                    int i8 = this.f18821d;
                    if (z5 && i5 == i8) {
                        cVar.index = null;
                        cVar.cancelled = true;
                        Throwable th2 = this.f18819b;
                        if (th2 == null) {
                            pVar.onComplete();
                            return;
                        } else {
                            pVar.onError(th2);
                            return;
                        }
                    }
                }
                cVar.index = Integer.valueOf(i5);
                cVar.emitted = j5;
                i6 = cVar.addAndGet(-i6);
            } while (i6 != 0);
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void complete() {
            this.f18820c = true;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void error(Throwable th) {
            this.f18819b = th;
            this.f18820c = true;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public Throwable getError() {
            return this.f18819b;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        @l3.g
        public T getValue() {
            int i5 = this.f18821d;
            if (i5 == 0) {
                return null;
            }
            return this.f18818a.get(i5 - 1);
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public T[] getValues(T[] tArr) {
            int i5 = this.f18821d;
            if (i5 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f18818a;
            if (tArr.length < i5) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i5));
            }
            for (int i6 = 0; i6 < i5; i6++) {
                tArr[i6] = list.get(i6);
            }
            if (tArr.length > i5) {
                tArr[i5] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public boolean isDone() {
            return this.f18820c;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void next(T t5) {
            this.f18818a.add(t5);
            this.f18821d++;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public int size() {
            return this.f18821d;
        }

        @Override // io.reactivex.rxjava3.processors.f.b
        public void trimHead() {
        }
    }

    f(b<T> bVar) {
        this.f18800b = bVar;
    }

    @l3.d
    @l3.f
    public static <T> f<T> u9() {
        return new f<>(new g(16));
    }

    @l3.d
    @l3.f
    public static <T> f<T> v9(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        return new f<>(new g(i5));
    }

    @l3.d
    static <T> f<T> w9() {
        return new f<>(new e(Integer.MAX_VALUE));
    }

    @l3.d
    @l3.f
    public static <T> f<T> x9(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxSize");
        return new f<>(new e(i5));
    }

    @l3.d
    @l3.f
    public static <T> f<T> y9(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        io.reactivex.rxjava3.internal.functions.b.c(j5, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return new f<>(new d(Integer.MAX_VALUE, j5, timeUnit, q0Var));
    }

    @l3.d
    @l3.f
    public static <T> f<T> z9(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxSize");
        io.reactivex.rxjava3.internal.functions.b.c(j5, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return new f<>(new d(i5, j5, timeUnit, q0Var));
    }

    @l3.d
    public T A9() {
        return this.f18800b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public Object[] B9() {
        Object[] objArr = f18797e;
        Object[] C9 = C9(objArr);
        if (C9 == objArr) {
            return new Object[0];
        }
        return C9;
    }

    @l3.d
    public T[] C9(T[] tArr) {
        return this.f18800b.getValues(tArr);
    }

    @l3.d
    public boolean D9() {
        return this.f18800b.size() != 0;
    }

    void E9(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f18802d.get();
            if (cVarArr != f18799g && cVarArr != f18798f) {
                int length = cVarArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        if (cVarArr[i5] == cVar) {
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
                    cVarArr2 = f18798f;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i5);
                    System.arraycopy(cVarArr, i5 + 1, cVarArr3, i5, (length - i5) - 1);
                    cVarArr2 = cVarArr3;
                }
            } else {
                return;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18802d, cVarArr, cVarArr2));
    }

    @l3.d
    int F9() {
        return this.f18800b.size();
    }

    @l3.d
    int G9() {
        return this.f18802d.get().length;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(p<? super T> pVar) {
        c<T> cVar = new c<>(pVar, this);
        pVar.onSubscribe(cVar);
        if (s9(cVar) && cVar.cancelled) {
            E9(cVar);
        } else {
            this.f18800b.a(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    @l3.g
    public Throwable n9() {
        b<T> bVar = this.f18800b;
        if (bVar.isDone()) {
            return bVar.getError();
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean o9() {
        b<T> bVar = this.f18800b;
        if (bVar.isDone() && bVar.getError() == null) {
            return true;
        }
        return false;
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (this.f18801c) {
            return;
        }
        this.f18801c = true;
        b<T> bVar = this.f18800b;
        bVar.complete();
        for (c<T> cVar : this.f18802d.getAndSet(f18799g)) {
            bVar.a(cVar);
        }
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (this.f18801c) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18801c = true;
        b<T> bVar = this.f18800b;
        bVar.error(th);
        for (c<T> cVar : this.f18802d.getAndSet(f18799g)) {
            bVar.a(cVar);
        }
    }

    @Override // org.reactivestreams.p
    public void onNext(T t5) {
        k.d(t5, "onNext called with a null value.");
        if (this.f18801c) {
            return;
        }
        b<T> bVar = this.f18800b;
        bVar.next(t5);
        for (c<T> cVar : this.f18802d.get()) {
            bVar.a(cVar);
        }
    }

    @Override // org.reactivestreams.p
    public void onSubscribe(q qVar) {
        if (this.f18801c) {
            qVar.cancel();
        } else {
            qVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean p9() {
        return this.f18802d.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.c
    @l3.d
    public boolean q9() {
        b<T> bVar = this.f18800b;
        if (bVar.isDone() && bVar.getError() != null) {
            return true;
        }
        return false;
    }

    boolean s9(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f18802d.get();
            if (cVarArr == f18799g) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!androidx.compose.animation.core.h.a(this.f18802d, cVarArr, cVarArr2));
        return true;
    }

    public void t9() {
        this.f18800b.trimHead();
    }
}
