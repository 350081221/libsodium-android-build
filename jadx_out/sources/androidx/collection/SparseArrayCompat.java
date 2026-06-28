package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.b1;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.e;
import u3.h;
import u3.i;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u00106\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\tJ'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J!\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\tJ\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\nH\u0016J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\b\u0010*\u001a\u00020)H\u0016R\u0016\u0010+\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r008\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0012\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0011\u0010\u001d\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "clone", "", DatabaseFileArchive.COLUMN_KEY, "get", "(I)Ljava/lang/Object;", "defaultValue", "(ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/r2;", "delete", "remove", "", b.f22420d, "", "index", "removeAt", "size", "removeAtRange", "replace", "oldValue", "newValue", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "put", "(ILjava/lang/Object;)V", "other", "putAll", "putIfAbsent", "isEmpty", "keyAt", "valueAt", "setValueAt", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "clear", "append", "", "toString", "garbage", "Z", "", "keys", "[I", "", "values", "[Ljava/lang/Object;", "I", "getIsEmpty", "()Z", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    @e
    public /* synthetic */ boolean garbage;

    @e
    public /* synthetic */ int[] keys;

    @e
    public /* synthetic */ int size;

    @e
    public /* synthetic */ Object[] values;

    @i
    public SparseArrayCompat() {
        this(0, 1, null);
    }

    @i
    public SparseArrayCompat(int i5) {
        if (i5 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i5);
            this.keys = new int[idealIntArraySize];
            this.values = new Object[idealIntArraySize];
        }
    }

    public void append(int i5, E e5) {
        int i6 = this.size;
        if (i6 != 0 && i5 <= this.keys[i6 - 1]) {
            put(i5, e5);
            return;
        }
        if (this.garbage && i6 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i7 = this.size;
        if (i7 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i7] = i5;
        this.values[i7] = e5;
        this.size = i7 + 1;
    }

    public void clear() {
        int i5 = this.size;
        Object[] objArr = this.values;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(int i5) {
        return indexOfKey(i5) >= 0;
    }

    public boolean containsValue(E e5) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i5 = this.size;
        int i6 = 0;
        while (true) {
            if (i6 < i5) {
                if (this.values[i6] == e5) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 < 0) {
            return false;
        }
        return true;
    }

    @k(message = "Alias for remove(int).", replaceWith = @b1(expression = "remove(key)", imports = {}))
    public void delete(int i5) {
        remove(i5);
    }

    @m
    public E get(int i5) {
        return (E) SparseArrayCompatKt.commonGet(this, i5);
    }

    @h(name = "getIsEmpty")
    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i5) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i5);
    }

    public int indexOfValue(E e5) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i5 = this.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.values[i6] == e5) {
                return i6;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i5) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[i5];
    }

    public void put(int i5, E e5) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i5);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e5;
            return;
        }
        int i6 = ~binarySearch;
        if (i6 < this.size && this.values[i6] == SparseArrayCompatKt.DELETED) {
            this.keys[i6] = i5;
            this.values[i6] = e5;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i6 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i5);
        }
        int i7 = this.size;
        if (i7 >= this.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i8 = this.size;
        if (i8 - i6 != 0) {
            int[] iArr = this.keys;
            int i9 = i6 + 1;
            o.z0(iArr, iArr, i9, i6, i8);
            Object[] objArr = this.values;
            o.B0(objArr, objArr, i9, i6, this.size);
        }
        this.keys[i6] = i5;
        this.values[i6] = e5;
        this.size++;
    }

    public void putAll(@l SparseArrayCompat<? extends E> other) {
        l0.p(other, "other");
        int size = other.size();
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = other.keyAt(i5);
            E valueAt = other.valueAt(i5);
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
            if (binarySearch >= 0) {
                this.values[binarySearch] = valueAt;
            } else {
                int i6 = ~binarySearch;
                if (i6 < this.size && this.values[i6] == SparseArrayCompatKt.DELETED) {
                    this.keys[i6] = keyAt;
                    this.values[i6] = valueAt;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i6 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
                    }
                    int i7 = this.size;
                    if (i7 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
                        int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                        l0.o(copyOf, "copyOf(this, newSize)");
                        this.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                        l0.o(copyOf2, "copyOf(this, newSize)");
                        this.values = copyOf2;
                    }
                    int i8 = this.size;
                    if (i8 - i6 != 0) {
                        int[] iArr = this.keys;
                        int i9 = i6 + 1;
                        o.z0(iArr, iArr, i9, i6, i8);
                        Object[] objArr = this.values;
                        o.B0(objArr, objArr, i9, i6, this.size);
                    }
                    this.keys[i6] = keyAt;
                    this.values[i6] = valueAt;
                    this.size++;
                }
            }
        }
    }

    @m
    public E putIfAbsent(int i5, E e5) {
        E e6 = (E) SparseArrayCompatKt.commonGet(this, i5);
        if (e6 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i5);
            if (binarySearch >= 0) {
                this.values[binarySearch] = e5;
            } else {
                int i6 = ~binarySearch;
                if (i6 < this.size && this.values[i6] == SparseArrayCompatKt.DELETED) {
                    this.keys[i6] = i5;
                    this.values[i6] = e5;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i6 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i5);
                    }
                    int i7 = this.size;
                    if (i7 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
                        int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                        l0.o(copyOf, "copyOf(this, newSize)");
                        this.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                        l0.o(copyOf2, "copyOf(this, newSize)");
                        this.values = copyOf2;
                    }
                    int i8 = this.size;
                    if (i8 - i6 != 0) {
                        int[] iArr = this.keys;
                        int i9 = i6 + 1;
                        o.z0(iArr, iArr, i9, i6, i8);
                        Object[] objArr = this.values;
                        o.B0(objArr, objArr, i9, i6, this.size);
                    }
                    this.keys[i6] = i5;
                    this.values[i6] = e5;
                    this.size++;
                }
            }
        }
        return e6;
    }

    public void remove(int i5) {
        SparseArrayCompatKt.commonRemove(this, i5);
    }

    public void removeAt(int i5) {
        if (this.values[i5] != SparseArrayCompatKt.DELETED) {
            this.values[i5] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i5, int i6) {
        int min = Math.min(i6, i5 + i6);
        while (i5 < min) {
            removeAt(i5);
            i5++;
        }
    }

    @m
    public E replace(int i5, E e5) {
        int indexOfKey = indexOfKey(i5);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e6 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e5;
        return e6;
    }

    public void setValueAt(int i5, E e5) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[i5] = e5;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    @l
    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i5 = this.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i6));
            sb.append(o0.a.f20835h);
            E valueAt = valueAt(i6);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        l0.o(sb2, "buffer.toString()");
        return sb2;
    }

    public E valueAt(int i5) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return (E) this.values[i5];
    }

    @l
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m26clone() {
        Object clone = super.clone();
        l0.n(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i5, E e5) {
        return (E) SparseArrayCompatKt.commonGet(this, i5, e5);
    }

    public boolean remove(int i5, @m Object obj) {
        int indexOfKey = indexOfKey(i5);
        if (indexOfKey < 0 || !l0.g(obj, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(int i5, E e5, E e6) {
        int indexOfKey = indexOfKey(i5);
        if (indexOfKey < 0 || !l0.g(this.values[indexOfKey], e5)) {
            return false;
        }
        this.values[indexOfKey] = e6;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 10 : i5);
    }
}
