package androidx.collection;

import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import u3.i;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004J\u0011\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\""}, d2 = {"Landroidx/collection/CircularIntArray;", "", "Lkotlin/r2;", "doubleCapacity", "", "element", "addFirst", "addLast", "popFirst", "popLast", "clear", "count", "removeFromStart", "removeFromEnd", "index", "get", "size", "", "isEmpty", "", "elements", "[I", "head", "I", "tail", "capacityBitmask", "getFirst", "()I", "first", "getLast", "last", "minCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
/* loaded from: classes.dex */
public final class CircularIntArray {
    private int capacityBitmask;

    @l
    private int[] elements;
    private int head;
    private int tail;

    @i
    public CircularIntArray() {
        this(0, 1, null);
    }

    @i
    public CircularIntArray(int i5) {
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (i5 <= 1073741824) {
            i5 = Integer.bitCount(i5) != 1 ? Integer.highestOneBit(i5 - 1) << 1 : i5;
            this.capacityBitmask = i5 - 1;
            this.elements = new int[i5];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30".toString());
    }

    private final void doubleCapacity() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i5 = this.head;
        int i6 = length - i5;
        int i7 = length << 1;
        if (i7 >= 0) {
            int[] iArr2 = new int[i7];
            o.z0(iArr, iArr2, 0, i5, length);
            o.z0(this.elements, iArr2, i6, 0, this.head);
            this.elements = iArr2;
            this.head = 0;
            this.tail = length;
            this.capacityBitmask = i7 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void addFirst(int i5) {
        int i6 = (this.head - 1) & this.capacityBitmask;
        this.head = i6;
        this.elements[i6] = i5;
        if (i6 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(int i5) {
        int[] iArr = this.elements;
        int i6 = this.tail;
        iArr[i6] = i5;
        int i7 = this.capacityBitmask & (i6 + 1);
        this.tail = i7;
        if (i7 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        this.tail = this.head;
    }

    public final int get(int i5) {
        if (i5 >= 0 && i5 < size()) {
            return this.elements[this.capacityBitmask & (this.head + i5)];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getFirst() {
        int i5 = this.head;
        if (i5 != this.tail) {
            return this.elements[i5];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLast() {
        int i5 = this.head;
        int i6 = this.tail;
        if (i5 != i6) {
            return this.elements[(i6 - 1) & this.capacityBitmask];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final int popFirst() {
        int i5 = this.head;
        if (i5 != this.tail) {
            int i6 = this.elements[i5];
            this.head = (i5 + 1) & this.capacityBitmask;
            return i6;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int popLast() {
        int i5 = this.head;
        int i6 = this.tail;
        if (i5 != i6) {
            int i7 = this.capacityBitmask & (i6 - 1);
            int i8 = this.elements[i7];
            this.tail = i7;
            return i8;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromEnd(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 <= size()) {
            this.tail = this.capacityBitmask & (this.tail - i5);
        } else {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final void removeFromStart(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 <= size()) {
            this.head = this.capacityBitmask & (this.head + i5);
        } else {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public /* synthetic */ CircularIntArray(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 8 : i5);
    }
}
