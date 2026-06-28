package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final v3.a<T> f19631a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.l<T, T> f19632b;

    @i0(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.m
        private T f19633a;

        /* renamed from: b, reason: collision with root package name */
        private int f19634b = -2;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f19635c;

        a(j<T> jVar) {
            this.f19635c = jVar;
        }

        private final void a() {
            T t5;
            int i5;
            if (this.f19634b == -2) {
                t5 = (T) ((j) this.f19635c).f19631a.invoke();
            } else {
                v3.l lVar = ((j) this.f19635c).f19632b;
                T t6 = this.f19633a;
                l0.m(t6);
                t5 = (T) lVar.invoke(t6);
            }
            this.f19633a = t5;
            if (t5 == null) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            this.f19634b = i5;
        }

        @p4.m
        public final T b() {
            return this.f19633a;
        }

        public final int c() {
            return this.f19634b;
        }

        public final void d(@p4.m T t5) {
            this.f19633a = t5;
        }

        public final void e(int i5) {
            this.f19634b = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19634b < 0) {
                a();
            }
            if (this.f19634b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @p4.l
        public T next() {
            if (this.f19634b < 0) {
                a();
            }
            if (this.f19634b != 0) {
                T t5 = this.f19633a;
                l0.n(t5, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f19634b = -1;
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
    public j(@p4.l v3.a<? extends T> getInitialValue, @p4.l v3.l<? super T, ? extends T> getNextValue) {
        l0.p(getInitialValue, "getInitialValue");
        l0.p(getNextValue, "getNextValue");
        this.f19631a = getInitialValue;
        this.f19632b = getNextValue;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
