package kotlin;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

@g1(version = "1.3")
@t
@u3.f
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "size", "", "constructor-impl", "(I)[S", "storage", "", "([S)[S", "getSize-impl", "([S)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-xj2QHRw", "([SS)Z", "containsAll", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([SLjava/lang/Object;)Z", "get", "index", "get-Mh2AYeg", "([SI)S", TTDownloadField.TT_HASHCODE, "hashCode-impl", "isEmpty", "isEmpty-impl", "([S)Z", "iterator", "", "iterator-impl", "([S)Ljava/util/Iterator;", "set", "", t0.b.f22420d, "set-01HTLdE", "([SIS)V", "toString", "", "toString-impl", "([S)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes3.dex */
public final class n2 implements Collection<m2>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final short[] f19509a;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "array", "", "([S)V", "index", "", "hasNext", "", "next", "next-Mh2AYeg", "()S", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<m2>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final short[] f19510a;

        /* renamed from: b, reason: collision with root package name */
        private int f19511b;

        public a(@p4.l short[] array) {
            kotlin.jvm.internal.l0.p(array, "array");
            this.f19510a = array;
        }

        public short a() {
            int i5 = this.f19511b;
            short[] sArr = this.f19510a;
            if (i5 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f19511b));
            }
            this.f19511b = i5 + 1;
            return m2.l(sArr[i5]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19511b < this.f19510a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ m2 next() {
            return m2.e(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    private /* synthetic */ n2(short[] sArr) {
        this.f19509a = sArr;
    }

    public static final /* synthetic */ n2 c(short[] sArr) {
        return new n2(sArr);
    }

    @p4.l
    public static short[] e(int i5) {
        return g(new short[i5]);
    }

    @p4.l
    @a1
    public static short[] g(@p4.l short[] storage) {
        kotlin.jvm.internal.l0.p(storage, "storage");
        return storage;
    }

    public static boolean j(short[] sArr, short s5) {
        boolean t8;
        t8 = kotlin.collections.p.t8(sArr, s5);
        return t8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0016->B:17:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(short[] r4, @p4.l java.util.Collection<kotlin.m2> r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L12
            goto L37
        L12:
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof kotlin.m2
            r3 = 0
            if (r2 == 0) goto L33
            kotlin.m2 r0 = (kotlin.m2) r0
            short r0 = r0.j0()
            boolean r0 = kotlin.collections.l.t8(r4, r0)
            if (r0 == 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r3
        L34:
            if (r0 != 0) goto L16
            r1 = r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.n2.k(short[], java.util.Collection):boolean");
    }

    public static boolean l(short[] sArr, Object obj) {
        return (obj instanceof n2) && kotlin.jvm.internal.l0.g(sArr, ((n2) obj).w());
    }

    public static final boolean m(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.l0.g(sArr, sArr2);
    }

    public static final short n(short[] sArr, int i5) {
        return m2.l(sArr[i5]);
    }

    public static int p(short[] sArr) {
        return sArr.length;
    }

    @a1
    public static /* synthetic */ void q() {
    }

    public static int r(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean s(short[] sArr) {
        return sArr.length == 0;
    }

    @p4.l
    public static Iterator<m2> t(short[] sArr) {
        return new a(sArr);
    }

    public static final void u(short[] sArr, int i5, short s5) {
        sArr[i5] = s5;
    }

    public static String v(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public boolean a(short s5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(m2 m2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends m2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m2) {
            return i(((m2) obj).j0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@p4.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return k(this.f19509a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f19509a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f19509a);
    }

    public boolean i(short s5) {
        return j(this.f19509a, s5);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f19509a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @p4.l
    public Iterator<m2> iterator() {
        return t(this.f19509a);
    }

    @Override // java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f19509a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l0.p(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }

    public String toString() {
        return v(this.f19509a);
    }

    public final /* synthetic */ short[] w() {
        return this.f19509a;
    }
}
