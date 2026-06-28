package kotlin.sequences;

import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z<T, R> implements m<R> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19693a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.l<T, R> f19694b;

    @i0(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<R>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T> f19695a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z<T, R> f19696b;

        a(z<T, R> zVar) {
            this.f19696b = zVar;
            this.f19695a = ((z) zVar).f19693a.iterator();
        }

        @p4.l
        public final Iterator<T> a() {
            return this.f19695a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19695a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((z) this.f19696b).f19694b.invoke(this.f19695a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@p4.l m<? extends T> sequence, @p4.l v3.l<? super T, ? extends R> transformer) {
        l0.p(sequence, "sequence");
        l0.p(transformer, "transformer");
        this.f19693a = sequence;
        this.f19694b = transformer;
    }

    @p4.l
    public final <E> m<E> e(@p4.l v3.l<? super R, ? extends Iterator<? extends E>> iterator) {
        l0.p(iterator, "iterator");
        return new i(this.f19693a, this.f19694b, iterator);
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<R> iterator() {
        return new a(this);
    }
}
