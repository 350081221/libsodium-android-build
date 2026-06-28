package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m<T> f19618a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19619b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final v3.l<T, Boolean> f19620c;

    @i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Iterator<T> f19621a;

        /* renamed from: b, reason: collision with root package name */
        private int f19622b = -1;

        /* renamed from: c, reason: collision with root package name */
        @p4.m
        private T f19623c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h<T> f19624d;

        a(h<T> hVar) {
            this.f19624d = hVar;
            this.f19621a = ((h) hVar).f19618a.iterator();
        }

        private final void a() {
            while (this.f19621a.hasNext()) {
                T next = this.f19621a.next();
                if (((Boolean) ((h) this.f19624d).f19620c.invoke(next)).booleanValue() == ((h) this.f19624d).f19619b) {
                    this.f19623c = next;
                    this.f19622b = 1;
                    return;
                }
            }
            this.f19622b = 0;
        }

        @p4.l
        public final Iterator<T> b() {
            return this.f19621a;
        }

        @p4.m
        public final T c() {
            return this.f19623c;
        }

        public final int d() {
            return this.f19622b;
        }

        public final void e(@p4.m T t5) {
            this.f19623c = t5;
        }

        public final void g(int i5) {
            this.f19622b = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19622b == -1) {
                a();
            }
            if (this.f19622b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f19622b == -1) {
                a();
            }
            if (this.f19622b != 0) {
                T t5 = this.f19623c;
                this.f19623c = null;
                this.f19622b = -1;
                return t5;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@p4.l m<? extends T> sequence, boolean z4, @p4.l v3.l<? super T, Boolean> predicate) {
        l0.p(sequence, "sequence");
        l0.p(predicate, "predicate");
        this.f19618a = sequence;
        this.f19619b = z4;
        this.f19620c = predicate;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ h(m mVar, boolean z4, v3.l lVar, int i5, kotlin.jvm.internal.w wVar) {
        this(mVar, (i5 & 2) != 0 ? true : z4, lVar);
    }
}
