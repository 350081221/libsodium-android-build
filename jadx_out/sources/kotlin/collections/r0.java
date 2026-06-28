package kotlin.collections;

import java.util.Iterator;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0086\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", "index", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r0<T> implements Iterator<p0<? extends T>>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Iterator<T> f19183a;

    /* renamed from: b, reason: collision with root package name */
    private int f19184b;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(@p4.l Iterator<? extends T> iterator) {
        kotlin.jvm.internal.l0.p(iterator, "iterator");
        this.f19183a = iterator;
    }

    @Override // java.util.Iterator
    @p4.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p0<T> next() {
        int i5 = this.f19184b;
        this.f19184b = i5 + 1;
        if (i5 < 0) {
            w.W();
        }
        return new p0<>(i5, this.f19183a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19183a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
