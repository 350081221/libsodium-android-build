package kotlin.sequences;

import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/DropWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19611a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.l<T, Boolean> f19612b;

    @i0(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"kotlin/sequences/DropWhileSequence$iterator$1", "", "dropState", "", "getDropState", "()I", "setDropState", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "drop", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T> f19613a;

        /* renamed from: b, reason: collision with root package name */
        private int f19614b = -1;

        /* renamed from: c, reason: collision with root package name */
        @p4.m
        private T f19615c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<T> f19616d;

        a(f<T> fVar) {
            this.f19616d = fVar;
            this.f19613a = ((f) fVar).f19611a.iterator();
        }

        private final void a() {
            while (this.f19613a.hasNext()) {
                T next = this.f19613a.next();
                if (!((Boolean) ((f) this.f19616d).f19612b.invoke(next)).booleanValue()) {
                    this.f19615c = next;
                    this.f19614b = 1;
                    return;
                }
            }
            this.f19614b = 0;
        }

        public final int b() {
            return this.f19614b;
        }

        @p4.l
        public final Iterator<T> c() {
            return this.f19613a;
        }

        @p4.m
        public final T d() {
            return this.f19615c;
        }

        public final void e(int i5) {
            this.f19614b = i5;
        }

        public final void g(@p4.m T t5) {
            this.f19615c = t5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19614b == -1) {
                a();
            }
            if (this.f19614b == 1 || this.f19613a.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f19614b == -1) {
                a();
            }
            if (this.f19614b == 1) {
                T t5 = this.f19615c;
                this.f19615c = null;
                this.f19614b = 0;
                return t5;
            }
            return this.f19613a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@p4.l m<? extends T> sequence, @p4.l v3.l<? super T, Boolean> predicate) {
        l0.p(sequence, "sequence");
        l0.p(predicate, "predicate");
        this.f19611a = sequence;
        this.f19612b = predicate;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
