package kotlin.sequences;

import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function2;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class y<T, R> implements m<R> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19688a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.p<Integer, T, R> f19689b;

    @i0(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<R>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T> f19690a;

        /* renamed from: b, reason: collision with root package name */
        private int f19691b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y<T, R> f19692c;

        a(y<T, R> yVar) {
            this.f19692c = yVar;
            this.f19690a = ((y) yVar).f19688a.iterator();
        }

        public final int a() {
            return this.f19691b;
        }

        @p4.l
        public final Iterator<T> b() {
            return this.f19690a;
        }

        public final void c(int i5) {
            this.f19691b = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19690a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            v3.p pVar = ((y) this.f19692c).f19689b;
            int i5 = this.f19691b;
            this.f19691b = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.W();
            }
            return (R) pVar.invoke(Integer.valueOf(i5), this.f19690a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@p4.l m<? extends T> sequence, @p4.l v3.p<? super Integer, ? super T, ? extends R> transformer) {
        l0.p(sequence, "sequence");
        l0.p(transformer, "transformer");
        this.f19688a = sequence;
        this.f19689b = transformer;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<R> iterator() {
        return new a(this);
    }
}
