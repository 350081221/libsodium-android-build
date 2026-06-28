package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes4.dex */
public final class v<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19672a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19673b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19674c;

    @i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T> f19675a;

        /* renamed from: b, reason: collision with root package name */
        private int f19676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v<T> f19677c;

        a(v<T> vVar) {
            this.f19677c = vVar;
            this.f19675a = ((v) vVar).f19672a.iterator();
        }

        private final void a() {
            while (this.f19676b < ((v) this.f19677c).f19673b && this.f19675a.hasNext()) {
                this.f19675a.next();
                this.f19676b++;
            }
        }

        @p4.l
        public final Iterator<T> b() {
            return this.f19675a;
        }

        public final int c() {
            return this.f19676b;
        }

        public final void d(int i5) {
            this.f19676b = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            if (this.f19676b < ((v) this.f19677c).f19674c && this.f19675a.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f19676b < ((v) this.f19677c).f19674c) {
                this.f19676b++;
                return this.f19675a.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@p4.l m<? extends T> sequence, int i5, int i6) {
        boolean z4;
        boolean z5;
        l0.p(sequence, "sequence");
        this.f19672a = sequence;
        this.f19673b = i5;
        this.f19674c = i6;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i6 >= i5) {
                    return;
                }
                throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i6 + " < " + i5).toString());
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i6).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i5).toString());
    }

    private final int f() {
        return this.f19674c - this.f19673b;
    }

    @Override // kotlin.sequences.e
    @p4.l
    public m<T> a(int i5) {
        m<T> g5;
        if (i5 < f()) {
            return new v(this.f19672a, this.f19673b + i5, this.f19674c);
        }
        g5 = s.g();
        return g5;
    }

    @Override // kotlin.sequences.e
    @p4.l
    public m<T> b(int i5) {
        if (i5 >= f()) {
            return this;
        }
        m<T> mVar = this.f19672a;
        int i6 = this.f19673b;
        return new v(mVar, i6, i5 + i6);
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
