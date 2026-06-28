package androidx.collection;

import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.i;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\nR\u0011\u0010!\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\n¨\u0006%"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "Lkotlin/r2;", "doubleCapacity", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "popFirst", "()Ljava/lang/Object;", "popLast", "clear", "", "count", "removeFromStart", "removeFromEnd", "index", "get", "(I)Ljava/lang/Object;", "size", "", "isEmpty", "", "elements", "[Ljava/lang/Object;", "head", "I", "tail", "capacityBitmask", "getFirst", "first", "getLast", "last", "minCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
/* loaded from: classes.dex */
public final class CircularArray<E> {
    private int capacityBitmask;

    @l
    private E[] elements;
    private int head;
    private int tail;

    @i
    public CircularArray() {
        this(0, 1, null);
    }

    @i
    public CircularArray(int i5) {
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (i5 <= 1073741824) {
            i5 = Integer.bitCount(i5) != 1 ? Integer.highestOneBit(i5 - 1) << 1 : i5;
            this.capacityBitmask = i5 - 1;
            this.elements = (E[]) new Object[i5];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30".toString());
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i5 = this.head;
        int i6 = length - i5;
        int i7 = length << 1;
        if (i7 >= 0) {
            E[] eArr2 = (E[]) new Object[i7];
            o.B0(eArr, eArr2, 0, i5, length);
            o.B0(this.elements, eArr2, i6, 0, this.head);
            this.elements = eArr2;
            this.head = 0;
            this.tail = length;
            this.capacityBitmask = i7 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void addFirst(E e5) {
        int i5 = (this.head - 1) & this.capacityBitmask;
        this.head = i5;
        this.elements[i5] = e5;
        if (i5 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e5) {
        E[] eArr = this.elements;
        int i5 = this.tail;
        eArr[i5] = e5;
        int i6 = this.capacityBitmask & (i5 + 1);
        this.tail = i6;
        if (i6 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final E get(int i5) {
        if (i5 >= 0 && i5 < size()) {
            E e5 = this.elements[this.capacityBitmask & (this.head + i5)];
            l0.m(e5);
            return e5;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getFirst() {
        int i5 = this.head;
        if (i5 != this.tail) {
            E e5 = this.elements[i5];
            l0.m(e5);
            return e5;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getLast() {
        int i5 = this.head;
        int i6 = this.tail;
        if (i5 != i6) {
            E e5 = this.elements[(i6 - 1) & this.capacityBitmask];
            l0.m(e5);
            return e5;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final E popFirst() {
        int i5 = this.head;
        if (i5 != this.tail) {
            E[] eArr = this.elements;
            E e5 = eArr[i5];
            eArr[i5] = null;
            this.head = (i5 + 1) & this.capacityBitmask;
            return e5;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E popLast() {
        int i5 = this.head;
        int i6 = this.tail;
        if (i5 != i6) {
            int i7 = this.capacityBitmask & (i6 - 1);
            E[] eArr = this.elements;
            E e5 = eArr[i7];
            eArr[i7] = null;
            this.tail = i7;
            return e5;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromEnd(int i5) {
        int i6;
        if (i5 <= 0) {
            return;
        }
        if (i5 <= size()) {
            int i7 = this.tail;
            if (i5 < i7) {
                i6 = i7 - i5;
            } else {
                i6 = 0;
            }
            for (int i8 = i6; i8 < i7; i8++) {
                this.elements[i8] = null;
            }
            int i9 = this.tail;
            int i10 = i9 - i6;
            int i11 = i5 - i10;
            this.tail = i9 - i10;
            if (i11 > 0) {
                int length = this.elements.length;
                this.tail = length;
                int i12 = length - i11;
                for (int i13 = i12; i13 < length; i13++) {
                    this.elements[i13] = null;
                }
                this.tail = i12;
                return;
            }
            return;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromStart(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 <= size()) {
            int length = this.elements.length;
            int i6 = this.head;
            if (i5 < length - i6) {
                length = i6 + i5;
            }
            while (i6 < length) {
                this.elements[i6] = null;
                i6++;
            }
            int i7 = this.head;
            int i8 = length - i7;
            int i9 = i5 - i8;
            this.head = this.capacityBitmask & (i7 + i8);
            if (i9 > 0) {
                for (int i10 = 0; i10 < i9; i10++) {
                    this.elements[i10] = null;
                }
                this.head = i9;
                return;
            }
            return;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public /* synthetic */ CircularArray(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 8 : i5);
    }
}
