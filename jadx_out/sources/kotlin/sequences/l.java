package kotlin.sequences;

import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "transform", "Lkotlin/Function2;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l<T1, T2, V> implements m<V> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T1> f19639a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final m<T2> f19640b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final v3.p<T1, T2, V> f19641c;

    @i0(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "iterator1", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<V>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T1> f19642a;

        /* renamed from: b, reason: collision with root package name */
        @p4.l
        private final Iterator<T2> f19643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<T1, T2, V> f19644c;

        a(l<T1, T2, V> lVar) {
            this.f19644c = lVar;
            this.f19642a = ((l) lVar).f19639a.iterator();
            this.f19643b = ((l) lVar).f19640b.iterator();
        }

        @p4.l
        public final Iterator<T1> a() {
            return this.f19642a;
        }

        @p4.l
        public final Iterator<T2> b() {
            return this.f19643b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19642a.hasNext() && this.f19643b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((l) this.f19644c).f19641c.invoke(this.f19642a.next(), this.f19643b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@p4.l m<? extends T1> sequence1, @p4.l m<? extends T2> sequence2, @p4.l v3.p<? super T1, ? super T2, ? extends V> transform) {
        l0.p(sequence1, "sequence1");
        l0.p(sequence2, "sequence2");
        l0.p(transform, "transform");
        this.f19639a = sequence1;
        this.f19640b = sequence2;
        this.f19641c = transform;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<V> iterator() {
        return new a(this);
    }
}
