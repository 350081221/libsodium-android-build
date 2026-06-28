package kotlin.sequences;

import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes4.dex */
public final class d<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19607a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19608b;

    @i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T> f19609a;

        /* renamed from: b, reason: collision with root package name */
        private int f19610b;

        a(d<T> dVar) {
            this.f19609a = ((d) dVar).f19607a.iterator();
            this.f19610b = ((d) dVar).f19608b;
        }

        private final void a() {
            while (this.f19610b > 0 && this.f19609a.hasNext()) {
                this.f19609a.next();
                this.f19610b--;
            }
        }

        @p4.l
        public final Iterator<T> b() {
            return this.f19609a;
        }

        public final int c() {
            return this.f19610b;
        }

        public final void d(int i5) {
            this.f19610b = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f19609a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f19609a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@p4.l m<? extends T> sequence, int i5) {
        boolean z4;
        l0.p(sequence, "sequence");
        this.f19607a = sequence;
        this.f19608b = i5;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i5 + external.org.apache.commons.lang3.d.f15957a).toString());
    }

    @Override // kotlin.sequences.e
    @p4.l
    public m<T> a(int i5) {
        int i6 = this.f19608b + i5;
        return i6 < 0 ? new d(this, i5) : new d(this.f19607a, i6);
    }

    @Override // kotlin.sequences.e
    @p4.l
    public m<T> b(int i5) {
        int i6 = this.f19608b;
        int i7 = i6 + i5;
        return i7 < 0 ? new w(this, i5) : new v(this.f19607a, i6, i7);
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
