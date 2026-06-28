package kotlin;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

@g1(version = "1.3")
@t
@u3.f
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "size", "", "constructor-impl", "(I)[B", "storage", "", "([B)[B", "getSize-impl", "([B)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-7apg3OU", "([BB)Z", "containsAll", "elements", "containsAll-impl", "([BLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([BLjava/lang/Object;)Z", "get", "index", "get-w2LRezQ", "([BI)B", TTDownloadField.TT_HASHCODE, "hashCode-impl", "isEmpty", "isEmpty-impl", "([B)Z", "iterator", "", "iterator-impl", "([B)Ljava/util/Iterator;", "set", "", t0.b.f22420d, "set-VurrAj0", "([BIB)V", "toString", "", "toString-impl", "([B)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
/* loaded from: classes3.dex */
public final class z1 implements Collection<y1>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final byte[] f19842a;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlin/UByteArray$Iterator;", "", "Lkotlin/UByte;", "array", "", "([B)V", "index", "", "hasNext", "", "next", "next-w2LRezQ", "()B", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<y1>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final byte[] f19843a;

        /* renamed from: b, reason: collision with root package name */
        private int f19844b;

        public a(@p4.l byte[] array) {
            kotlin.jvm.internal.l0.p(array, "array");
            this.f19843a = array;
        }

        public byte a() {
            int i5 = this.f19844b;
            byte[] bArr = this.f19843a;
            if (i5 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f19844b));
            }
            this.f19844b = i5 + 1;
            return y1.l(bArr[i5]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19844b < this.f19843a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ y1 next() {
            return y1.e(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    private /* synthetic */ z1(byte[] bArr) {
        this.f19842a = bArr;
    }

    public static final /* synthetic */ z1 c(byte[] bArr) {
        return new z1(bArr);
    }

    @p4.l
    public static byte[] e(int i5) {
        return g(new byte[i5]);
    }

    @p4.l
    @a1
    public static byte[] g(@p4.l byte[] storage) {
        kotlin.jvm.internal.l0.p(storage, "storage");
        return storage;
    }

    public static boolean j(byte[] bArr, byte b5) {
        boolean m8;
        m8 = kotlin.collections.p.m8(bArr, b5);
        return m8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:4:0x0016->B:17:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(byte[] r4, @p4.l java.util.Collection<kotlin.y1> r5) {
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
            boolean r2 = r0 instanceof kotlin.y1
            r3 = 0
            if (r2 == 0) goto L33
            kotlin.y1 r0 = (kotlin.y1) r0
            byte r0 = r0.j0()
            boolean r0 = kotlin.collections.l.m8(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.z1.k(byte[], java.util.Collection):boolean");
    }

    public static boolean l(byte[] bArr, Object obj) {
        return (obj instanceof z1) && kotlin.jvm.internal.l0.g(bArr, ((z1) obj).w());
    }

    public static final boolean m(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.l0.g(bArr, bArr2);
    }

    public static final byte n(byte[] bArr, int i5) {
        return y1.l(bArr[i5]);
    }

    public static int p(byte[] bArr) {
        return bArr.length;
    }

    @a1
    public static /* synthetic */ void q() {
    }

    public static int r(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean s(byte[] bArr) {
        return bArr.length == 0;
    }

    @p4.l
    public static Iterator<y1> t(byte[] bArr) {
        return new a(bArr);
    }

    public static final void u(byte[] bArr, int i5, byte b5) {
        bArr[i5] = b5;
    }

    public static String v(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public boolean a(byte b5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(y1 y1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends y1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y1) {
            return i(((y1) obj).j0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@p4.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return k(this.f19842a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f19842a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f19842a);
    }

    public boolean i(byte b5) {
        return j(this.f19842a, b5);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f19842a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @p4.l
    public Iterator<y1> iterator() {
        return t(this.f19842a);
    }

    @Override // java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return p(this.f19842a);
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
        return v(this.f19842a);
    }

    public final /* synthetic */ byte[] w() {
        return this.f19842a;
    }
}
