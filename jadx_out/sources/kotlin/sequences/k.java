package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.p0;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k<T> implements m<p0<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19636a;

    @i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<p0<? extends T>>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T> f19637a;

        /* renamed from: b, reason: collision with root package name */
        private int f19638b;

        a(k<T> kVar) {
            this.f19637a = ((k) kVar).f19636a.iterator();
        }

        public final int a() {
            return this.f19638b;
        }

        @p4.l
        public final Iterator<T> b() {
            return this.f19637a;
        }

        @Override // java.util.Iterator
        @p4.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p0<T> next() {
            int i5 = this.f19638b;
            this.f19638b = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.W();
            }
            return new p0<>(i5, this.f19637a.next());
        }

        public final void d(int i5) {
            this.f19638b = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19637a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@p4.l m<? extends T> sequence) {
        l0.p(sequence, "sequence");
        this.f19636a = sequence;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<p0<T>> iterator() {
        return new a(this);
    }
}
