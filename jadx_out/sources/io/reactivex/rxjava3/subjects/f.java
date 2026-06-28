package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.p0;
import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.internal.util.k;
import io.reactivex.rxjava3.internal.util.q;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f<T> extends i<T> {

    /* renamed from: d, reason: collision with root package name */
    static final c[] f18897d = new c[0];

    /* renamed from: e, reason: collision with root package name */
    static final c[] f18898e = new c[0];

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f18899f = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    final b<T> f18900a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<c<T>[]> f18901b = new AtomicReference<>(f18897d);

    /* renamed from: c, reason: collision with root package name */
    boolean f18902c;

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
        void add(T t5);

        void addFinal(Object obj);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();

        @l3.g
        T getValue();

        T[] getValues(T[] tArr);

        void replay(c<T> cVar);

        int size();

        void trimHead();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final p0<? super T> downstream;
        Object index;
        final f<T> state;

        c(p0<? super T> p0Var, f<T> fVar) {
            this.downstream = p0Var;
            this.state = fVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.state.a9(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        volatile boolean done;
        volatile C0537f<Object> head;
        final long maxAge;
        final int maxSize;
        final q0 scheduler;
        int size;
        C0537f<Object> tail;
        final TimeUnit unit;

        d(int i5, long j5, TimeUnit timeUnit, q0 q0Var) {
            this.maxSize = i5;
            this.maxAge = j5;
            this.unit = timeUnit;
            this.scheduler = q0Var;
            C0537f<Object> c0537f = new C0537f<>(null, 0L);
            this.tail = c0537f;
            this.head = c0537f;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void add(T t5) {
            C0537f<Object> c0537f = new C0537f<>(t5, this.scheduler.d(this.unit));
            C0537f<Object> c0537f2 = this.tail;
            this.tail = c0537f;
            this.size++;
            c0537f2.set(c0537f);
            trim();
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void addFinal(Object obj) {
            C0537f<Object> c0537f = new C0537f<>(obj, Long.MAX_VALUE);
            C0537f<Object> c0537f2 = this.tail;
            this.tail = c0537f;
            this.size++;
            c0537f2.lazySet(c0537f);
            trimFinal();
            this.done = true;
        }

        C0537f<Object> getHead() {
            C0537f<Object> c0537f;
            C0537f<Object> c0537f2 = this.head;
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            C0537f<T> c0537f3 = c0537f2.get();
            while (true) {
                C0537f<T> c0537f4 = c0537f3;
                c0537f = c0537f2;
                c0537f2 = c0537f4;
                if (c0537f2 == null || c0537f2.time > d5) {
                    break;
                }
                c0537f3 = c0537f2.get();
            }
            return c0537f;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        @l3.g
        public T getValue() {
            T t5;
            C0537f<Object> c0537f = this.head;
            C0537f<Object> c0537f2 = null;
            while (true) {
                C0537f<T> c0537f3 = c0537f.get();
                if (c0537f3 == null) {
                    break;
                }
                c0537f2 = c0537f;
                c0537f = c0537f3;
            }
            if (c0537f.time < this.scheduler.d(this.unit) - this.maxAge || (t5 = (T) c0537f.value) == null) {
                return null;
            }
            if (!q.isComplete(t5) && !q.isError(t5)) {
                return t5;
            }
            return (T) c0537f2.value;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public T[] getValues(T[] tArr) {
            C0537f<T> head = getHead();
            int size = size(head);
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
            } else {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i5 = 0; i5 != size; i5++) {
                    head = head.get();
                    tArr[i5] = head.value;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void replay(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            p0<? super T> p0Var = cVar.downstream;
            C0537f<Object> c0537f = (C0537f) cVar.index;
            if (c0537f == null) {
                c0537f = getHead();
            }
            int i5 = 1;
            while (!cVar.cancelled) {
                C0537f<T> c0537f2 = c0537f.get();
                if (c0537f2 == null) {
                    cVar.index = c0537f;
                    i5 = cVar.addAndGet(-i5);
                    if (i5 == 0) {
                        return;
                    }
                } else {
                    T t5 = c0537f2.value;
                    if (this.done && c0537f2.get() == null) {
                        if (q.isComplete(t5)) {
                            p0Var.onComplete();
                        } else {
                            p0Var.onError(q.getError(t5));
                        }
                        cVar.index = null;
                        cVar.cancelled = true;
                        return;
                    }
                    p0Var.onNext(t5);
                    c0537f = c0537f2;
                }
            }
            cVar.index = null;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public int size() {
            return size(getHead());
        }

        void trim() {
            int i5 = this.size;
            if (i5 > this.maxSize) {
                this.size = i5 - 1;
                this.head = this.head.get();
            }
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            C0537f<Object> c0537f = this.head;
            while (this.size > 1) {
                C0537f<T> c0537f2 = c0537f.get();
                if (c0537f2.time > d5) {
                    this.head = c0537f;
                    return;
                } else {
                    this.size--;
                    c0537f = c0537f2;
                }
            }
            this.head = c0537f;
        }

        void trimFinal() {
            long d5 = this.scheduler.d(this.unit) - this.maxAge;
            C0537f<Object> c0537f = this.head;
            while (true) {
                C0537f<T> c0537f2 = c0537f.get();
                if (c0537f2.get() == null) {
                    if (c0537f.value != null) {
                        C0537f<Object> c0537f3 = new C0537f<>(null, 0L);
                        c0537f3.lazySet(c0537f.get());
                        this.head = c0537f3;
                        return;
                    }
                    this.head = c0537f;
                    return;
                }
                if (c0537f2.time > d5) {
                    if (c0537f.value != null) {
                        C0537f<Object> c0537f4 = new C0537f<>(null, 0L);
                        c0537f4.lazySet(c0537f.get());
                        this.head = c0537f4;
                        return;
                    }
                    this.head = c0537f;
                    return;
                }
                c0537f = c0537f2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void trimHead() {
            C0537f<Object> c0537f = this.head;
            if (c0537f.value != null) {
                C0537f<Object> c0537f2 = new C0537f<>(null, 0L);
                c0537f2.lazySet(c0537f.get());
                this.head = c0537f2;
            }
        }

        int size(C0537f<Object> c0537f) {
            int i5 = 0;
            while (i5 != Integer.MAX_VALUE) {
                C0537f<T> c0537f2 = c0537f.get();
                if (c0537f2 == null) {
                    Object obj = c0537f.value;
                    return (q.isComplete(obj) || q.isError(obj)) ? i5 - 1 : i5;
                }
                i5++;
                c0537f = c0537f2;
            }
            return i5;
        }
    }

    /* loaded from: classes3.dex */
    static final class e<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean done;
        volatile a<Object> head;
        final int maxSize;
        int size;
        a<Object> tail;

        e(int i5) {
            this.maxSize = i5;
            a<Object> aVar = new a<>(null);
            this.tail = aVar;
            this.head = aVar;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void add(T t5) {
            a<Object> aVar = new a<>(t5);
            a<Object> aVar2 = this.tail;
            this.tail = aVar;
            this.size++;
            aVar2.set(aVar);
            trim();
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void addFinal(Object obj) {
            a<Object> aVar = new a<>(obj);
            a<Object> aVar2 = this.tail;
            this.tail = aVar;
            this.size++;
            aVar2.lazySet(aVar);
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        @l3.g
        public T getValue() {
            a<Object> aVar = this.head;
            a<Object> aVar2 = null;
            while (true) {
                a<T> aVar3 = aVar.get();
                if (aVar3 == null) {
                    break;
                }
                aVar2 = aVar;
                aVar = aVar3;
            }
            T t5 = (T) aVar.value;
            if (t5 == null) {
                return null;
            }
            if (!q.isComplete(t5) && !q.isError(t5)) {
                return t5;
            }
            return (T) aVar2.value;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public T[] getValues(T[] tArr) {
            a<T> aVar = this.head;
            int size = size();
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
            } else {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i5 = 0; i5 != size; i5++) {
                    aVar = aVar.get();
                    tArr[i5] = aVar.value;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void replay(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            p0<? super T> p0Var = cVar.downstream;
            a<Object> aVar = (a) cVar.index;
            if (aVar == null) {
                aVar = this.head;
            }
            int i5 = 1;
            while (!cVar.cancelled) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    if (aVar.get() != null) {
                        continue;
                    } else {
                        cVar.index = aVar;
                        i5 = cVar.addAndGet(-i5);
                        if (i5 == 0) {
                            return;
                        }
                    }
                } else {
                    T t5 = aVar2.value;
                    if (this.done && aVar2.get() == null) {
                        if (q.isComplete(t5)) {
                            p0Var.onComplete();
                        } else {
                            p0Var.onError(q.getError(t5));
                        }
                        cVar.index = null;
                        cVar.cancelled = true;
                        return;
                    }
                    p0Var.onNext(t5);
                    aVar = aVar2;
                }
            }
            cVar.index = null;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public int size() {
            a<Object> aVar = this.head;
            int i5 = 0;
            while (i5 != Integer.MAX_VALUE) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    Object obj = aVar.value;
                    if (q.isComplete(obj) || q.isError(obj)) {
                        return i5 - 1;
                    }
                    return i5;
                }
                i5++;
                aVar = aVar2;
            }
            return i5;
        }

        void trim() {
            int i5 = this.size;
            if (i5 > this.maxSize) {
                this.size = i5 - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void trimHead() {
            a<Object> aVar = this.head;
            if (aVar.value != null) {
                a<Object> aVar2 = new a<>(null);
                aVar2.lazySet(aVar.get());
                this.head = aVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.rxjava3.subjects.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0537f<T> extends AtomicReference<C0537f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        C0537f(T t5, long j5) {
            this.value = t5;
            this.time = j5;
        }
    }

    /* loaded from: classes3.dex */
    static final class g<T> extends AtomicReference<Object> implements b<T> {
        private static final long serialVersionUID = -733876083048047795L;
        final List<Object> buffer;
        volatile boolean done;
        volatile int size;

        g(int i5) {
            this.buffer = new ArrayList(i5);
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void add(T t5) {
            this.buffer.add(t5);
            this.size++;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void addFinal(Object obj) {
            this.buffer.add(obj);
            trimHead();
            this.size++;
            this.done = true;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        @l3.g
        public T getValue() {
            int i5 = this.size;
            if (i5 == 0) {
                return null;
            }
            List<Object> list = this.buffer;
            T t5 = (T) list.get(i5 - 1);
            if (!q.isComplete(t5) && !q.isError(t5)) {
                return t5;
            }
            if (i5 == 1) {
                return null;
            }
            return (T) list.get(i5 - 2);
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public T[] getValues(T[] tArr) {
            int i5 = this.size;
            if (i5 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.buffer;
            Object obj = list.get(i5 - 1);
            if ((q.isComplete(obj) || q.isError(obj)) && i5 - 1 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
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

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void replay(c<T> cVar) {
            int i5;
            int i6;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.buffer;
            p0<? super T> p0Var = cVar.downstream;
            Integer num = (Integer) cVar.index;
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = 0;
                cVar.index = 0;
            }
            int i7 = 1;
            while (!cVar.cancelled) {
                int i8 = this.size;
                while (i8 != i5) {
                    if (cVar.cancelled) {
                        cVar.index = null;
                        return;
                    }
                    Object obj = list.get(i5);
                    if (this.done && (i6 = i5 + 1) == i8 && i6 == (i8 = this.size)) {
                        if (q.isComplete(obj)) {
                            p0Var.onComplete();
                        } else {
                            p0Var.onError(q.getError(obj));
                        }
                        cVar.index = null;
                        cVar.cancelled = true;
                        return;
                    }
                    p0Var.onNext(obj);
                    i5++;
                }
                if (i5 == this.size) {
                    cVar.index = Integer.valueOf(i5);
                    i7 = cVar.addAndGet(-i7);
                    if (i7 == 0) {
                        return;
                    }
                }
            }
            cVar.index = null;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public int size() {
            int i5 = this.size;
            if (i5 != 0) {
                int i6 = i5 - 1;
                Object obj = this.buffer.get(i6);
                if (!q.isComplete(obj) && !q.isError(obj)) {
                    return i5;
                }
                return i6;
            }
            return 0;
        }

        @Override // io.reactivex.rxjava3.subjects.f.b
        public void trimHead() {
        }
    }

    f(b<T> bVar) {
        this.f18900a = bVar;
    }

    @l3.d
    @l3.f
    public static <T> f<T> P8() {
        return new f<>(new g(16));
    }

    @l3.d
    @l3.f
    public static <T> f<T> Q8(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "capacityHint");
        return new f<>(new g(i5));
    }

    static <T> f<T> R8() {
        return new f<>(new e(Integer.MAX_VALUE));
    }

    @l3.d
    @l3.f
    public static <T> f<T> S8(int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxSize");
        return new f<>(new e(i5));
    }

    @l3.d
    @l3.f
    public static <T> f<T> T8(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var) {
        io.reactivex.rxjava3.internal.functions.b.c(j5, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return new f<>(new d(Integer.MAX_VALUE, j5, timeUnit, q0Var));
    }

    @l3.d
    @l3.f
    public static <T> f<T> U8(long j5, @l3.f TimeUnit timeUnit, @l3.f q0 q0Var, int i5) {
        io.reactivex.rxjava3.internal.functions.b.b(i5, "maxSize");
        io.reactivex.rxjava3.internal.functions.b.c(j5, "maxAge");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(q0Var, "scheduler is null");
        return new f<>(new d(i5, j5, timeUnit, q0Var));
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    @l3.g
    public Throwable I8() {
        Object obj = this.f18900a.get();
        if (q.isError(obj)) {
            return q.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean J8() {
        return q.isComplete(this.f18900a.get());
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean K8() {
        return this.f18901b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.i
    @l3.d
    public boolean L8() {
        return q.isError(this.f18900a.get());
    }

    boolean N8(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f18901b.get();
            if (cVarArr == f18898e) {
                return false;
            }
            int length = cVarArr.length;
            cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!androidx.compose.animation.core.h.a(this.f18901b, cVarArr, cVarArr2));
        return true;
    }

    public void O8() {
        this.f18900a.trimHead();
    }

    @l3.d
    @l3.g
    public T V8() {
        return this.f18900a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public Object[] W8() {
        Object[] objArr = f18899f;
        Object[] X8 = X8(objArr);
        if (X8 == objArr) {
            return new Object[0];
        }
        return X8;
    }

    @l3.d
    public T[] X8(T[] tArr) {
        return this.f18900a.getValues(tArr);
    }

    @l3.d
    public boolean Y8() {
        return this.f18900a.size() != 0;
    }

    @l3.d
    int Z8() {
        return this.f18901b.get().length;
    }

    void a9(c<T> cVar) {
        c<T>[] cVarArr;
        c[] cVarArr2;
        do {
            cVarArr = this.f18901b.get();
            if (cVarArr != f18898e && cVarArr != f18897d) {
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
                    cVarArr2 = f18897d;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i5);
                    System.arraycopy(cVarArr, i5 + 1, cVarArr3, i5, (length - i5) - 1);
                    cVarArr2 = cVarArr3;
                }
            } else {
                return;
            }
        } while (!androidx.compose.animation.core.h.a(this.f18901b, cVarArr, cVarArr2));
    }

    @l3.d
    int b9() {
        return this.f18900a.size();
    }

    c<T>[] c9(Object obj) {
        this.f18900a.compareAndSet(null, obj);
        return this.f18901b.getAndSet(f18898e);
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(p0<? super T> p0Var) {
        c<T> cVar = new c<>(p0Var, this);
        p0Var.onSubscribe(cVar);
        if (N8(cVar) && cVar.cancelled) {
            a9(cVar);
        } else {
            this.f18900a.replay(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (this.f18902c) {
            return;
        }
        this.f18902c = true;
        Object complete = q.complete();
        b<T> bVar = this.f18900a;
        bVar.addFinal(complete);
        for (c<T> cVar : c9(complete)) {
            bVar.replay(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        k.d(th, "onError called with a null Throwable.");
        if (this.f18902c) {
            io.reactivex.rxjava3.plugins.a.Y(th);
            return;
        }
        this.f18902c = true;
        Object error = q.error(th);
        b<T> bVar = this.f18900a;
        bVar.addFinal(error);
        for (c<T> cVar : c9(error)) {
            bVar.replay(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onNext(T t5) {
        k.d(t5, "onNext called with a null value.");
        if (this.f18902c) {
            return;
        }
        b<T> bVar = this.f18900a;
        bVar.add(t5);
        for (c<T> cVar : this.f18901b.get()) {
            bVar.replay(cVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (this.f18902c) {
            eVar.dispose();
        }
    }
}
