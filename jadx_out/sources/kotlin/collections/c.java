package kotlin.collections;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@kotlin.g1(version = "1.1")
@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", TTDownloadField.TT_HASHCODE, "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
/* loaded from: classes3.dex */
public abstract class c<E> extends kotlin.collections.a<E> implements List<E>, w3.a {

    @p4.l
    public static final a Companion = new a(null);

    @kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\tJ\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012J%\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0002\b\u0018J\u0019\u0010\u0019\u001a\u00020\u00062\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "checkBoundsIndexes", "", "startIndex", "", "endIndex", "size", "checkBoundsIndexes$kotlin_stdlib", "checkElementIndex", "index", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final void a(int i5, int i6, int i7) {
            if (i5 >= 0 && i6 <= i7) {
                if (i5 <= i6) {
                    return;
                }
                throw new IllegalArgumentException("startIndex: " + i5 + " > endIndex: " + i6);
            }
            throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: " + i6 + ", size: " + i7);
        }

        public final void b(int i5, int i6) {
            if (i5 < 0 || i5 >= i6) {
                throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
            }
        }

        public final void c(int i5, int i6) {
            if (i5 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
            }
        }

        public final void d(int i5, int i6, int i7) {
            if (i5 >= 0 && i6 <= i7) {
                if (i5 <= i6) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i5 + " > toIndex: " + i6);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i6 + ", size: " + i7);
        }

        public final boolean e(@p4.l Collection<?> c5, @p4.l Collection<?> other) {
            kotlin.jvm.internal.l0.p(c5, "c");
            kotlin.jvm.internal.l0.p(other, "other");
            if (c5.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c5.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.l0.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(@p4.l Collection<?> c5) {
            int i5;
            kotlin.jvm.internal.l0.p(c5, "c");
            int i6 = 1;
            for (Object obj : c5) {
                int i7 = i6 * 31;
                if (obj != null) {
                    i5 = obj.hashCode();
                } else {
                    i5 = 0;
                }
                i6 = i7 + i5;
            }
            return i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public class b implements Iterator<E>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        private int f19106a;

        public b() {
        }

        protected final int a() {
            return this.f19106a;
        }

        protected final void b(int i5) {
            this.f19106a = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19106a < c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i5 = this.f19106a;
                this.f19106a = i5 + 1;
                return cVar.get(i5);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private class C0544c extends c<E>.b implements ListIterator<E>, w3.a {
        public C0544c(int i5) {
            super();
            c.Companion.c(i5, c.this.size());
            b(i5);
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                b(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final c<E> f19109a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19110b;

        /* renamed from: c, reason: collision with root package name */
        private int f19111c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@p4.l c<? extends E> list, int i5, int i6) {
            kotlin.jvm.internal.l0.p(list, "list");
            this.f19109a = list;
            this.f19110b = i5;
            c.Companion.d(i5, i6, list.size());
            this.f19111c = i6 - i5;
        }

        @Override // kotlin.collections.c, java.util.List
        public E get(int i5) {
            c.Companion.b(i5, this.f19111c);
            return this.f19109a.get(this.f19110b + i5);
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        public int getSize() {
            return this.f19111c;
        }
    }

    @Override // java.util.List
    public void add(int i5, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@p4.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return Companion.e(this, (Collection) obj);
    }

    public abstract E get(int i5);

    @Override // kotlin.collections.a
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.f(this);
    }

    public int indexOf(E e5) {
        Iterator<E> it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (!kotlin.jvm.internal.l0.g(it.next(), e5)) {
                i5++;
            } else {
                return i5;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @p4.l
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e5) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.l0.g(listIterator.previous(), e5)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @p4.l
    public ListIterator<E> listIterator() {
        return new C0544c(0);
    }

    @Override // java.util.List
    public E remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i5, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @p4.l
    public List<E> subList(int i5, int i6) {
        return new d(this, i5, i6);
    }

    @p4.l
    public ListIterator<E> listIterator(int i5) {
        return new C0544c(i5);
    }
}
