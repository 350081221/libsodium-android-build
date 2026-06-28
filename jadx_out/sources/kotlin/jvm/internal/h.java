package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/jvm/internal/ArrayIterator;", "T", "", "array", "", "([Ljava/lang/Object;)V", "getArray", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "index", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class h<T> implements Iterator<T>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final T[] f19408a;

    /* renamed from: b, reason: collision with root package name */
    private int f19409b;

    public h(@p4.l T[] array) {
        l0.p(array, "array");
        this.f19408a = array;
    }

    @p4.l
    public final T[] a() {
        return this.f19408a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19409b < this.f19408a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f19408a;
            int i5 = this.f19409b;
            this.f19409b = i5 + 1;
            return tArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f19409b--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
