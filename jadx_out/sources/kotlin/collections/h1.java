package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlin/collections/ReversedListReadOnly;", "T", "Lkotlin/collections/AbstractList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "iterator", "", "listIterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class h1<T> extends c<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final List<T> f19128a;

    @kotlin.i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\r\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ListIterator<T>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final ListIterator<T> f19129a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1<T> f19130b;

        /* JADX WARN: Multi-variable type inference failed */
        a(h1<? extends T> h1Var, int i5) {
            int b12;
            this.f19130b = h1Var;
            List list = ((h1) h1Var).f19128a;
            b12 = c0.b1(h1Var, i5);
            this.f19129a = list.listIterator(b12);
        }

        @p4.l
        public final ListIterator<T> a() {
            return this.f19129a;
        }

        @Override // java.util.ListIterator
        public void add(T t5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19129a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19129a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f19129a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int a12;
            a12 = c0.a1(this.f19130b, this.f19129a.previousIndex());
            return a12;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f19129a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int a12;
            a12 = c0.a1(this.f19130b, this.f19129a.nextIndex());
            return a12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h1(@p4.l List<? extends T> delegate) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.f19128a = delegate;
    }

    @Override // kotlin.collections.c, java.util.List
    public T get(int i5) {
        int Z0;
        List<T> list = this.f19128a;
        Z0 = c0.Z0(this, i5);
        return list.get(Z0);
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    public int getSize() {
        return this.f19128a.size();
    }

    @Override // kotlin.collections.c, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @p4.l
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.c, java.util.List
    @p4.l
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.c, java.util.List
    @p4.l
    public ListIterator<T> listIterator(int i5) {
        return new a(this, i5);
    }
}
