package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.r2;
import kotlin.v2;

@kotlin.g1(version = "1.4")
@v2(markerClass = {kotlin.r.class})
@kotlin.i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", "head", "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
/* loaded from: classes3.dex */
public final class k<E> extends f<E> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static final a f19140d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final Object[] f19141e = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    private static final int f19142f = 2147483639;

    /* renamed from: g, reason: collision with root package name */
    private static final int f19143g = 10;

    /* renamed from: a, reason: collision with root package name */
    private int f19144a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private Object[] f19145b;

    /* renamed from: c, reason: collision with root package name */
    private int f19146c;

    @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "maxArraySize", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final int a(int i5, int i6) {
            int i7 = i5 + (i5 >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - k.f19142f <= 0) {
                return i7;
            }
            if (i6 > k.f19142f) {
                return Integer.MAX_VALUE;
            }
            return k.f19142f;
        }
    }

    public k(int i5) {
        Object[] objArr;
        if (i5 == 0) {
            objArr = f19141e;
        } else if (i5 > 0) {
            objArr = new Object[i5];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i5);
        }
        this.f19145b = objArr;
    }

    private final void a(int i5, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f19145b.length;
        while (i5 < length && it.hasNext()) {
            this.f19145b[i5] = it.next();
            i5++;
        }
        int i6 = this.f19144a;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.f19145b[i7] = it.next();
        }
        this.f19146c = size() + collection.size();
    }

    private final void c(int i5) {
        Object[] objArr = new Object[i5];
        Object[] objArr2 = this.f19145b;
        o.B0(objArr2, objArr, 0, this.f19144a, objArr2.length);
        Object[] objArr3 = this.f19145b;
        int length = objArr3.length;
        int i6 = this.f19144a;
        o.B0(objArr3, objArr, length - i6, 0, i6);
        this.f19144a = 0;
        this.f19145b = objArr;
    }

    private final int e(int i5) {
        int we;
        if (i5 != 0) {
            return i5 - 1;
        }
        we = p.we(this.f19145b);
        return we;
    }

    private final void ensureCapacity(int i5) {
        int u4;
        if (i5 >= 0) {
            Object[] objArr = this.f19145b;
            if (i5 <= objArr.length) {
                return;
            }
            if (objArr == f19141e) {
                u4 = kotlin.ranges.u.u(i5, 10);
                this.f19145b = new Object[u4];
                return;
            } else {
                c(f19140d.a(objArr.length, i5));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean g(v3.l<? super E, Boolean> lVar) {
        Object[] objArr;
        int p5;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (this.f19145b.length == 0) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr == false) {
                int p6 = p(this.f19144a + size());
                int i5 = this.f19144a;
                if (i5 < p6) {
                    p5 = i5;
                    while (i5 < p6) {
                        Object obj = this.f19145b[i5];
                        if (lVar.invoke(obj).booleanValue()) {
                            this.f19145b[p5] = obj;
                            p5++;
                        } else {
                            z4 = true;
                        }
                        i5++;
                    }
                    o.M1(this.f19145b, null, p5, p6);
                } else {
                    int length = this.f19145b.length;
                    boolean z5 = false;
                    int i6 = i5;
                    while (i5 < length) {
                        Object[] objArr2 = this.f19145b;
                        Object obj2 = objArr2[i5];
                        objArr2[i5] = null;
                        if (lVar.invoke(obj2).booleanValue()) {
                            this.f19145b[i6] = obj2;
                            i6++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    p5 = p(i6);
                    for (int i7 = 0; i7 < p6; i7++) {
                        Object[] objArr3 = this.f19145b;
                        Object obj3 = objArr3[i7];
                        objArr3[i7] = null;
                        if (lVar.invoke(obj3).booleanValue()) {
                            this.f19145b[p5] = obj3;
                            p5 = j(p5);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.f19146c = o(p5 - this.f19144a);
                }
            }
        }
        return z4;
    }

    private final int j(int i5) {
        int we;
        we = p.we(this.f19145b);
        if (i5 == we) {
            return 0;
        }
        return i5 + 1;
    }

    @kotlin.internal.f
    private final E k(int i5) {
        return (E) this.f19145b[i5];
    }

    @kotlin.internal.f
    private final int l(int i5) {
        return p(this.f19144a + i5);
    }

    private final int o(int i5) {
        return i5 < 0 ? i5 + this.f19145b.length : i5;
    }

    private final int p(int i5) {
        Object[] objArr = this.f19145b;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        addLast(e5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@p4.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(size() + elements.size());
        a(p(this.f19144a + size()), elements);
        return true;
    }

    public final void addFirst(E e5) {
        ensureCapacity(size() + 1);
        int e6 = e(this.f19144a);
        this.f19144a = e6;
        this.f19145b[e6] = e5;
        this.f19146c = size() + 1;
    }

    public final void addLast(E e5) {
        ensureCapacity(size() + 1);
        this.f19145b[p(this.f19144a + size())] = e5;
        this.f19146c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int p5 = p(this.f19144a + size());
        int i5 = this.f19144a;
        if (i5 < p5) {
            o.M1(this.f19145b, null, i5, p5);
        } else if (!isEmpty()) {
            Object[] objArr = this.f19145b;
            o.M1(objArr, null, this.f19144a, objArr.length);
            o.M1(this.f19145b, null, 0, p5);
        }
        this.f19144a = 0;
        this.f19146c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f19145b[this.f19144a];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        c.Companion.b(i5, size());
        return (E) this.f19145b[p(this.f19144a + i5)];
    }

    @Override // kotlin.collections.f
    public int getSize() {
        return this.f19146c;
    }

    @p4.m
    public final E i() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f19145b[this.f19144a];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i5;
        int p5 = p(this.f19144a + size());
        int i6 = this.f19144a;
        if (i6 < p5) {
            while (i6 < p5) {
                if (kotlin.jvm.internal.l0.g(obj, this.f19145b[i6])) {
                    i5 = this.f19144a;
                } else {
                    i6++;
                }
            }
            return -1;
        }
        if (i6 >= p5) {
            int length = this.f19145b.length;
            while (true) {
                if (i6 < length) {
                    if (kotlin.jvm.internal.l0.g(obj, this.f19145b[i6])) {
                        i5 = this.f19144a;
                        break;
                    }
                    i6++;
                } else {
                    for (int i7 = 0; i7 < p5; i7++) {
                        if (kotlin.jvm.internal.l0.g(obj, this.f19145b[i7])) {
                            i6 = i7 + this.f19145b.length;
                            i5 = this.f19144a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i6 - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        int G;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f19145b;
        int i5 = this.f19144a;
        G = w.G(this);
        return (E) objArr[p(i5 + G)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int we;
        int i5;
        int p5 = p(this.f19144a + size());
        int i6 = this.f19144a;
        if (i6 < p5) {
            we = p5 - 1;
            if (i6 <= we) {
                while (!kotlin.jvm.internal.l0.g(obj, this.f19145b[we])) {
                    if (we != i6) {
                        we--;
                    }
                }
                i5 = this.f19144a;
                return we - i5;
            }
            return -1;
        }
        if (i6 > p5) {
            int i7 = p5 - 1;
            while (true) {
                if (-1 < i7) {
                    if (kotlin.jvm.internal.l0.g(obj, this.f19145b[i7])) {
                        we = i7 + this.f19145b.length;
                        i5 = this.f19144a;
                        break;
                    }
                    i7--;
                } else {
                    we = p.we(this.f19145b);
                    int i8 = this.f19144a;
                    if (i8 <= we) {
                        while (!kotlin.jvm.internal.l0.g(obj, this.f19145b[we])) {
                            if (we != i8) {
                                we--;
                            }
                        }
                        i5 = this.f19144a;
                    }
                }
            }
        }
        return -1;
    }

    public final void m(@p4.l v3.p<? super Integer, ? super Object[], r2> structure) {
        int i5;
        int i6;
        kotlin.jvm.internal.l0.p(structure, "structure");
        int p5 = p(this.f19144a + size());
        if (!isEmpty() && (i6 = this.f19144a) >= p5) {
            i5 = i6 - this.f19145b.length;
        } else {
            i5 = this.f19144a;
        }
        structure.invoke(Integer.valueOf(i5), toArray());
    }

    @p4.m
    public final E n() {
        int G;
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.f19145b;
        int i5 = this.f19144a;
        G = w.G(this);
        return (E) objArr[p(i5 + G)];
    }

    @p4.m
    public final E q() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @p4.m
    public final E r() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@p4.l Collection<? extends Object> elements) {
        Object[] objArr;
        int p5;
        kotlin.jvm.internal.l0.p(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (this.f19145b.length == 0) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr == false) {
                int p6 = p(this.f19144a + size());
                int i5 = this.f19144a;
                if (i5 < p6) {
                    p5 = i5;
                    while (i5 < p6) {
                        Object obj = this.f19145b[i5];
                        if (!elements.contains(obj)) {
                            this.f19145b[p5] = obj;
                            p5++;
                        } else {
                            z4 = true;
                        }
                        i5++;
                    }
                    o.M1(this.f19145b, null, p5, p6);
                } else {
                    int length = this.f19145b.length;
                    boolean z5 = false;
                    int i6 = i5;
                    while (i5 < length) {
                        Object[] objArr2 = this.f19145b;
                        Object obj2 = objArr2[i5];
                        objArr2[i5] = null;
                        if (!elements.contains(obj2)) {
                            this.f19145b[i6] = obj2;
                            i6++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    p5 = p(i6);
                    for (int i7 = 0; i7 < p6; i7++) {
                        Object[] objArr3 = this.f19145b;
                        Object obj3 = objArr3[i7];
                        objArr3[i7] = null;
                        if (!elements.contains(obj3)) {
                            this.f19145b[p5] = obj3;
                            p5 = j(p5);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.f19146c = o(p5 - this.f19144a);
                }
            }
        }
        return z4;
    }

    @Override // kotlin.collections.f
    public E removeAt(int i5) {
        int G;
        int G2;
        c.Companion.b(i5, size());
        G = w.G(this);
        if (i5 == G) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        int p5 = p(this.f19144a + i5);
        E e5 = (E) this.f19145b[p5];
        if (i5 < (size() >> 1)) {
            int i6 = this.f19144a;
            if (p5 >= i6) {
                Object[] objArr = this.f19145b;
                o.B0(objArr, objArr, i6 + 1, i6, p5);
            } else {
                Object[] objArr2 = this.f19145b;
                o.B0(objArr2, objArr2, 1, 0, p5);
                Object[] objArr3 = this.f19145b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i7 = this.f19144a;
                o.B0(objArr3, objArr3, i7 + 1, i7, objArr3.length - 1);
            }
            Object[] objArr4 = this.f19145b;
            int i8 = this.f19144a;
            objArr4[i8] = null;
            this.f19144a = j(i8);
        } else {
            int i9 = this.f19144a;
            G2 = w.G(this);
            int p6 = p(i9 + G2);
            if (p5 <= p6) {
                Object[] objArr5 = this.f19145b;
                o.B0(objArr5, objArr5, p5, p5 + 1, p6 + 1);
            } else {
                Object[] objArr6 = this.f19145b;
                o.B0(objArr6, objArr6, p5, p5 + 1, objArr6.length);
                Object[] objArr7 = this.f19145b;
                objArr7[objArr7.length - 1] = objArr7[0];
                o.B0(objArr7, objArr7, 0, 1, p6 + 1);
            }
            this.f19145b[p6] = null;
        }
        this.f19146c = size() - 1;
        return e5;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f19145b;
            int i5 = this.f19144a;
            E e5 = (E) objArr[i5];
            objArr[i5] = null;
            this.f19144a = j(i5);
            this.f19146c = size() - 1;
            return e5;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        int G;
        if (!isEmpty()) {
            int i5 = this.f19144a;
            G = w.G(this);
            int p5 = p(i5 + G);
            Object[] objArr = this.f19145b;
            E e5 = (E) objArr[p5];
            objArr[p5] = null;
            this.f19146c = size() - 1;
            return e5;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@p4.l Collection<? extends Object> elements) {
        Object[] objArr;
        int p5;
        kotlin.jvm.internal.l0.p(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (this.f19145b.length == 0) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr == false) {
                int p6 = p(this.f19144a + size());
                int i5 = this.f19144a;
                if (i5 < p6) {
                    p5 = i5;
                    while (i5 < p6) {
                        Object obj = this.f19145b[i5];
                        if (elements.contains(obj)) {
                            this.f19145b[p5] = obj;
                            p5++;
                        } else {
                            z4 = true;
                        }
                        i5++;
                    }
                    o.M1(this.f19145b, null, p5, p6);
                } else {
                    int length = this.f19145b.length;
                    boolean z5 = false;
                    int i6 = i5;
                    while (i5 < length) {
                        Object[] objArr2 = this.f19145b;
                        Object obj2 = objArr2[i5];
                        objArr2[i5] = null;
                        if (elements.contains(obj2)) {
                            this.f19145b[i6] = obj2;
                            i6++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    p5 = p(i6);
                    for (int i7 = 0; i7 < p6; i7++) {
                        Object[] objArr3 = this.f19145b;
                        Object obj3 = objArr3[i7];
                        objArr3[i7] = null;
                        if (elements.contains(obj3)) {
                            this.f19145b[p5] = obj3;
                            p5 = j(p5);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.f19146c = o(p5 - this.f19144a);
                }
            }
        }
        return z4;
    }

    @p4.l
    public final Object[] s() {
        return toArray();
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public E set(int i5, E e5) {
        c.Companion.b(i5, size());
        int p5 = p(this.f19144a + i5);
        Object[] objArr = this.f19145b;
        E e6 = (E) objArr[p5];
        objArr[p5] = e5;
        return e6;
    }

    @p4.l
    public final <T> T[] t(@p4.l T[] array) {
        kotlin.jvm.internal.l0.p(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @p4.l
    public <T> T[] toArray(@p4.l T[] array) {
        kotlin.jvm.internal.l0.p(array, "array");
        if (array.length < size()) {
            array = (T[]) m.a(array, size());
        }
        int p5 = p(this.f19144a + size());
        int i5 = this.f19144a;
        if (i5 < p5) {
            o.K0(this.f19145b, array, 0, i5, p5, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f19145b;
            o.B0(objArr, array, 0, this.f19144a, objArr.length);
            Object[] objArr2 = this.f19145b;
            o.B0(objArr2, array, objArr2.length - this.f19144a, 0, p5);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public void add(int i5, E e5) {
        c.Companion.c(i5, size());
        if (i5 == size()) {
            addLast(e5);
            return;
        }
        if (i5 == 0) {
            addFirst(e5);
            return;
        }
        ensureCapacity(size() + 1);
        int p5 = p(this.f19144a + i5);
        if (i5 < ((size() + 1) >> 1)) {
            int e6 = e(p5);
            int e7 = e(this.f19144a);
            int i6 = this.f19144a;
            if (e6 >= i6) {
                Object[] objArr = this.f19145b;
                objArr[e7] = objArr[i6];
                o.B0(objArr, objArr, i6, i6 + 1, e6 + 1);
            } else {
                Object[] objArr2 = this.f19145b;
                o.B0(objArr2, objArr2, i6 - 1, i6, objArr2.length);
                Object[] objArr3 = this.f19145b;
                objArr3[objArr3.length - 1] = objArr3[0];
                o.B0(objArr3, objArr3, 0, 1, e6 + 1);
            }
            this.f19145b[e6] = e5;
            this.f19144a = e7;
        } else {
            int p6 = p(this.f19144a + size());
            if (p5 < p6) {
                Object[] objArr4 = this.f19145b;
                o.B0(objArr4, objArr4, p5 + 1, p5, p6);
            } else {
                Object[] objArr5 = this.f19145b;
                o.B0(objArr5, objArr5, 1, 0, p6);
                Object[] objArr6 = this.f19145b;
                objArr6[0] = objArr6[objArr6.length - 1];
                o.B0(objArr6, objArr6, p5 + 1, p5, objArr6.length - 1);
            }
            this.f19145b[p5] = e5;
        }
        this.f19146c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i5, @p4.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        c.Companion.c(i5, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i5 == size()) {
            return addAll(elements);
        }
        ensureCapacity(size() + elements.size());
        int p5 = p(this.f19144a + size());
        int p6 = p(this.f19144a + i5);
        int size = elements.size();
        if (i5 < ((size() + 1) >> 1)) {
            int i6 = this.f19144a;
            int i7 = i6 - size;
            if (p6 < i6) {
                Object[] objArr = this.f19145b;
                o.B0(objArr, objArr, i7, i6, objArr.length);
                if (size >= p6) {
                    Object[] objArr2 = this.f19145b;
                    o.B0(objArr2, objArr2, objArr2.length - size, 0, p6);
                } else {
                    Object[] objArr3 = this.f19145b;
                    o.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f19145b;
                    o.B0(objArr4, objArr4, 0, size, p6);
                }
            } else if (i7 >= 0) {
                Object[] objArr5 = this.f19145b;
                o.B0(objArr5, objArr5, i7, i6, p6);
            } else {
                Object[] objArr6 = this.f19145b;
                i7 += objArr6.length;
                int i8 = p6 - i6;
                int length = objArr6.length - i7;
                if (length >= i8) {
                    o.B0(objArr6, objArr6, i7, i6, p6);
                } else {
                    o.B0(objArr6, objArr6, i7, i6, i6 + length);
                    Object[] objArr7 = this.f19145b;
                    o.B0(objArr7, objArr7, 0, this.f19144a + length, p6);
                }
            }
            this.f19144a = i7;
            a(o(p6 - size), elements);
        } else {
            int i9 = p6 + size;
            if (p6 < p5) {
                int i10 = size + p5;
                Object[] objArr8 = this.f19145b;
                if (i10 <= objArr8.length) {
                    o.B0(objArr8, objArr8, i9, p6, p5);
                } else if (i9 >= objArr8.length) {
                    o.B0(objArr8, objArr8, i9 - objArr8.length, p6, p5);
                } else {
                    int length2 = p5 - (i10 - objArr8.length);
                    o.B0(objArr8, objArr8, 0, length2, p5);
                    Object[] objArr9 = this.f19145b;
                    o.B0(objArr9, objArr9, i9, p6, length2);
                }
            } else {
                Object[] objArr10 = this.f19145b;
                o.B0(objArr10, objArr10, size, 0, p5);
                Object[] objArr11 = this.f19145b;
                if (i9 >= objArr11.length) {
                    o.B0(objArr11, objArr11, i9 - objArr11.length, p6, objArr11.length);
                } else {
                    o.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f19145b;
                    o.B0(objArr12, objArr12, i9, p6, objArr12.length - size);
                }
            }
            a(p6, elements);
        }
        return true;
    }

    public k() {
        this.f19145b = f19141e;
    }

    public k(@p4.l Collection<? extends E> elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f19145b = array;
        this.f19146c = array.length;
        if (array.length == 0) {
            this.f19145b = f19141e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @p4.l
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
