package io.reactivex.rxjava3.internal.operators.single;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum a implements m3.s<NoSuchElementException> {
        INSTANCE;

        @Override // m3.s
        public NoSuchElementException get() {
            return new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum b implements m3.o<io.reactivex.rxjava3.core.x0, org.reactivestreams.o> {
        INSTANCE;

        @Override // m3.o
        public org.reactivestreams.o apply(io.reactivex.rxjava3.core.x0 x0Var) {
            return new a1(x0Var);
        }
    }

    /* loaded from: classes3.dex */
    static final class c<T> implements Iterable<io.reactivex.rxjava3.core.o<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Iterable<? extends io.reactivex.rxjava3.core.x0<? extends T>> f18402a;

        c(Iterable<? extends io.reactivex.rxjava3.core.x0<? extends T>> iterable) {
            this.f18402a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<io.reactivex.rxjava3.core.o<T>> iterator() {
            return new d(this.f18402a.iterator());
        }
    }

    /* loaded from: classes3.dex */
    static final class d<T> implements Iterator<io.reactivex.rxjava3.core.o<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<? extends io.reactivex.rxjava3.core.x0<? extends T>> f18403a;

        d(Iterator<? extends io.reactivex.rxjava3.core.x0<? extends T>> it) {
            this.f18403a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.rxjava3.core.o<T> next() {
            return new a1(this.f18403a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18403a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private l0() {
        throw new IllegalStateException("No instances!");
    }

    public static m3.s<NoSuchElementException> a() {
        return a.INSTANCE;
    }

    public static <T> Iterable<? extends io.reactivex.rxjava3.core.o<T>> b(Iterable<? extends io.reactivex.rxjava3.core.x0<? extends T>> iterable) {
        return new c(iterable);
    }

    public static <T> m3.o<io.reactivex.rxjava3.core.x0<? extends T>, org.reactivestreams.o<? extends T>> c() {
        return b.INSTANCE;
    }
}
