package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.internal.fuseable.p;
import io.reactivex.rxjava3.internal.util.t;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import l3.g;

/* loaded from: classes3.dex */
public final class c<T> implements p<T> {

    /* renamed from: i, reason: collision with root package name */
    static final int f18506i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j, reason: collision with root package name */
    private static final Object f18507j = new Object();

    /* renamed from: b, reason: collision with root package name */
    int f18509b;

    /* renamed from: c, reason: collision with root package name */
    long f18510c;

    /* renamed from: d, reason: collision with root package name */
    final int f18511d;

    /* renamed from: e, reason: collision with root package name */
    AtomicReferenceArray<Object> f18512e;

    /* renamed from: f, reason: collision with root package name */
    final int f18513f;

    /* renamed from: g, reason: collision with root package name */
    AtomicReferenceArray<Object> f18514g;

    /* renamed from: a, reason: collision with root package name */
    final AtomicLong f18508a = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f18515h = new AtomicLong();

    public c(int i5) {
        int b5 = t.b(Math.max(8, i5));
        int i6 = b5 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b5 + 1);
        this.f18512e = atomicReferenceArray;
        this.f18511d = i6;
        a(b5);
        this.f18514g = atomicReferenceArray;
        this.f18513f = i6;
        this.f18510c = i6 - 1;
        q(0L);
    }

    private void a(int i5) {
        this.f18509b = Math.min(i5 / 4, f18506i);
    }

    private static int b(int i5) {
        return i5;
    }

    private static int c(long j5, int i5) {
        return b(((int) j5) & i5);
    }

    private long d() {
        return this.f18515h.get();
    }

    private long e() {
        return this.f18508a.get();
    }

    private long f() {
        return this.f18515h.get();
    }

    private static Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i5) {
        return atomicReferenceArray.get(i5);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i5) {
        int b5 = b(i5);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, b5);
        o(atomicReferenceArray, b5, null);
        return atomicReferenceArray2;
    }

    private long i() {
        return this.f18508a.get();
    }

    private T j(AtomicReferenceArray<Object> atomicReferenceArray, long j5, int i5) {
        this.f18514g = atomicReferenceArray;
        return (T) g(atomicReferenceArray, c(j5, i5));
    }

    private T k(AtomicReferenceArray<Object> atomicReferenceArray, long j5, int i5) {
        this.f18514g = atomicReferenceArray;
        int c5 = c(j5, i5);
        T t5 = (T) g(atomicReferenceArray, c5);
        if (t5 != null) {
            o(atomicReferenceArray, c5, null);
            n(j5 + 1);
        }
        return t5;
    }

    private void l(AtomicReferenceArray<Object> atomicReferenceArray, long j5, int i5, T t5, long j6) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f18512e = atomicReferenceArray2;
        this.f18510c = (j6 + j5) - 1;
        o(atomicReferenceArray2, i5, t5);
        p(atomicReferenceArray, atomicReferenceArray2);
        o(atomicReferenceArray, i5, f18507j);
        q(j5 + 1);
    }

    private void n(long j5) {
        this.f18515h.lazySet(j5);
    }

    private static void o(AtomicReferenceArray<Object> atomicReferenceArray, int i5, Object obj) {
        atomicReferenceArray.lazySet(i5, obj);
    }

    private void p(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        o(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void q(long j5) {
        this.f18508a.lazySet(j5);
    }

    private boolean r(AtomicReferenceArray<Object> atomicReferenceArray, T t5, long j5, int i5) {
        o(atomicReferenceArray, i5, t5);
        q(j5 + 1);
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean isEmpty() {
        return i() == f();
    }

    public int m() {
        long f5 = f();
        while (true) {
            long i5 = i();
            long f6 = f();
            if (f5 == f6) {
                return (int) (i5 - f6);
            }
            f5 = f6;
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(T t5) {
        if (t5 != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f18512e;
            long e5 = e();
            int i5 = this.f18511d;
            int c5 = c(e5, i5);
            if (e5 < this.f18510c) {
                return r(atomicReferenceArray, t5, e5, c5);
            }
            long j5 = this.f18509b + e5;
            if (g(atomicReferenceArray, c(j5, i5)) == null) {
                this.f18510c = j5 - 1;
                return r(atomicReferenceArray, t5, e5, c5);
            }
            if (g(atomicReferenceArray, c(1 + e5, i5)) == null) {
                return r(atomicReferenceArray, t5, e5, c5);
            }
            l(atomicReferenceArray, e5, c5, t5, i5);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f18514g;
        long d5 = d();
        int i5 = this.f18513f;
        T t5 = (T) g(atomicReferenceArray, c(d5, i5));
        if (t5 == f18507j) {
            return j(h(atomicReferenceArray, i5 + 1), d5, i5);
        }
        return t5;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.p, io.reactivex.rxjava3.internal.fuseable.q
    @g
    public T poll() {
        boolean z4;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f18514g;
        long d5 = d();
        int i5 = this.f18513f;
        int c5 = c(d5, i5);
        T t5 = (T) g(atomicReferenceArray, c5);
        if (t5 == f18507j) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (t5 != null && !z4) {
            o(atomicReferenceArray, c5, null);
            n(d5 + 1);
            return t5;
        }
        if (!z4) {
            return null;
        }
        return k(h(atomicReferenceArray, i5 + 1), d5, i5);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(T t5, T t6) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f18512e;
        long i5 = i();
        int i6 = this.f18511d;
        long j5 = 2 + i5;
        if (g(atomicReferenceArray, c(j5, i6)) == null) {
            int c5 = c(i5, i6);
            o(atomicReferenceArray, c5 + 1, t6);
            o(atomicReferenceArray, c5, t5);
            q(j5);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f18512e = atomicReferenceArray2;
        int c6 = c(i5, i6);
        o(atomicReferenceArray2, c6 + 1, t6);
        o(atomicReferenceArray2, c6, t5);
        p(atomicReferenceArray, atomicReferenceArray2);
        o(atomicReferenceArray, c6, f18507j);
        q(j5);
        return true;
    }
}
