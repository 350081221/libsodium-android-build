package io.reactivex.rxjava3.internal.queue;

import io.reactivex.rxjava3.internal.fuseable.p;
import java.util.concurrent.atomic.AtomicReference;
import l3.g;

/* loaded from: classes3.dex */
public final class a<T> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<C0527a<T>> f18504a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<C0527a<T>> f18505b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.rxjava3.internal.queue.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0527a<E> extends AtomicReference<C0527a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        C0527a() {
        }

        public E getAndNullValue() {
            E lpValue = lpValue();
            spValue(null);
            return lpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public C0527a<E> lvNext() {
            return get();
        }

        public void soNext(C0527a<E> c0527a) {
            lazySet(c0527a);
        }

        public void spValue(E e5) {
            this.value = e5;
        }

        C0527a(E e5) {
            spValue(e5);
        }
    }

    public a() {
        C0527a<T> c0527a = new C0527a<>();
        d(c0527a);
        e(c0527a);
    }

    C0527a<T> a() {
        return this.f18505b.get();
    }

    C0527a<T> b() {
        return this.f18505b.get();
    }

    C0527a<T> c() {
        return this.f18504a.get();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    void d(C0527a<T> c0527a) {
        this.f18505b.lazySet(c0527a);
    }

    C0527a<T> e(C0527a<T> c0527a) {
        return this.f18504a.getAndSet(c0527a);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(T t5) {
        if (t5 != null) {
            C0527a<T> c0527a = new C0527a<>(t5);
            e(c0527a).soNext(c0527a);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.p, io.reactivex.rxjava3.internal.fuseable.q
    @g
    public T poll() {
        C0527a<T> lvNext;
        C0527a<T> a5 = a();
        C0527a<T> lvNext2 = a5.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            d(lvNext2);
            return andNullValue;
        }
        if (a5 == c()) {
            return null;
        }
        do {
            lvNext = a5.lvNext();
        } while (lvNext == null);
        T andNullValue2 = lvNext.getAndNullValue();
        d(lvNext);
        return andNullValue2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean offer(T t5, T t6) {
        offer(t5);
        offer(t6);
        return true;
    }
}
