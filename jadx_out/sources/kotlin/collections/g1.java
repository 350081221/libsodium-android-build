package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0017\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "iterator", "", "listIterator", "", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class g1<T> extends f<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final List<T> f19125a;

    @kotlin.i0(d1 = {"\u0000%\n\u0000\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ListIterator<T>, w3.f {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final ListIterator<T> f19126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1<T> f19127b;

        a(g1<T> g1Var, int i5) {
            int b12;
            this.f19127b = g1Var;
            List list = ((g1) g1Var).f19125a;
            b12 = c0.b1(g1Var, i5);
            this.f19126a = list.listIterator(b12);
        }

        @p4.l
        public final ListIterator<T> a() {
            return this.f19126a;
        }

        @Override // java.util.ListIterator
        public void add(T t5) {
            this.f19126a.add(t5);
            this.f19126a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19126a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19126a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f19126a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int a12;
            a12 = c0.a1(this.f19127b, this.f19126a.previousIndex());
            return a12;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f19126a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int a12;
            a12 = c0.a1(this.f19127b, this.f19126a.nextIndex());
            return a12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f19126a.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t5) {
            this.f19126a.set(t5);
        }
    }

    public g1(@p4.l List<T> delegate) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.f19125a = delegate;
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public void add(int i5, T t5) {
        int b12;
        List<T> list = this.f19125a;
        b12 = c0.b1(this, i5);
        list.add(b12, t5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f19125a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i5) {
        int Z0;
        List<T> list = this.f19125a;
        Z0 = c0.Z0(this, i5);
        return list.get(Z0);
    }

    @Override // kotlin.collections.f
    public int getSize() {
        return this.f19125a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @p4.l
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @p4.l
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.f
    public T removeAt(int i5) {
        int Z0;
        List<T> list = this.f19125a;
        Z0 = c0.Z0(this, i5);
        return list.remove(Z0);
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public T set(int i5, T t5) {
        int Z0;
        List<T> list = this.f19125a;
        Z0 = c0.Z0(this, i5);
        return list.set(Z0, t5);
    }

    @Override // java.util.AbstractList, java.util.List
    @p4.l
    public ListIterator<T> listIterator(int i5) {
        return new a(this, i5);
    }
}
