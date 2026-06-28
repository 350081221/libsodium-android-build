package kotlin.collections;

import java.util.Iterator;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0006H\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/collections/IndexingIterable;", "T", "", "Lkotlin/collections/IndexedValue;", "iteratorFactory", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q0<T> implements Iterable<p0<? extends T>>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final v3.a<Iterator<T>> f19182a;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@p4.l v3.a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.l0.p(iteratorFactory, "iteratorFactory");
        this.f19182a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @p4.l
    public Iterator<p0<T>> iterator() {
        return new r0(this.f19182a.invoke());
    }
}
