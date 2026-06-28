package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import u3.i;
import w3.b;
import w3.h;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0019\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001BB\u0013\b\u0007\u0012\b\b\u0002\u0010=\u001a\u00020\u0006¢\u0006\u0004\b>\u0010:B\u001b\b\u0016\u0012\u0010\u0010?\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b>\u0010@B\u0019\b\u0016\u0012\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&¢\u0006\u0004\b>\u0010AB\u001b\b\u0016\u0012\u0010\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u001a¢\u0006\u0004\b>\u00104J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0016\u0010\u0016\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\n2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0015\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0001\u0010\u001d2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001eJ\u0013\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u0016\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010\u0016\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010)\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00108¨\u0006C"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "Lkotlin/r2;", "clear", "", "minimumCapacity", "ensureCapacity", "element", "", "contains", "(Ljava/lang/Object;)Z", "", DatabaseFileArchive.COLUMN_KEY, "indexOf", "index", "valueAt", "(I)Ljava/lang/Object;", "isEmpty", "add", "array", "addAll", "remove", "removeAt", "removeAll", "", "toArray", "()[Ljava/lang/Object;", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "", "iterator", "", "elements", "containsAll", "retainAll", "", "hashes", "[I", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "[Ljava/lang/Object;", "getArray$collection", "setArray$collection", "([Ljava/lang/Object;)V", "_size", "I", "get_size$collection", "()I", "set_size$collection", "(I)V", "getSize", "size", "capacity", "<init>", "set", "(Landroidx/collection/ArraySet;)V", "(Ljava/util/Collection;)V", "ElementIterator", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, b, h {
    private int _size;

    @l
    private Object[] array;

    @l
    private int[] hashes;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "", "index", "elementAt", "(I)Ljava/lang/Object;", "Lkotlin/r2;", "removeAt", "<init>", "(Landroidx/collection/ArraySet;)V", "collection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int i5) {
            return ArraySet.this.valueAt(i5);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i5) {
            ArraySet.this.removeAt(i5);
        }
    }

    @i
    public ArraySet() {
        this(0, 1, null);
    }

    @i
    public ArraySet(int i5) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i5 > 0) {
            ArraySetKt.allocArrays(this, i5);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e5) {
        int i5;
        int indexOf;
        int i6 = get_size$collection();
        boolean z4 = false;
        if (e5 == null) {
            indexOf = ArraySetKt.indexOfNull(this);
            i5 = 0;
        } else {
            int hashCode = e5.hashCode();
            i5 = hashCode;
            indexOf = ArraySetKt.indexOf(this, e5, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i7 = ~indexOf;
        if (i6 >= getHashes$collection().length) {
            int i8 = 8;
            if (i6 >= 8) {
                i8 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i8 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i8);
            if (i6 == get_size$collection()) {
                if (getHashes$collection().length == 0) {
                    z4 = true;
                }
                if (!z4) {
                    o.I0(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                    o.K0(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i6) {
            int i9 = i7 + 1;
            o.z0(getHashes$collection(), getHashes$collection(), i9, i7, i6);
            o.B0(getArray$collection(), getArray$collection(), i9, i7, i6);
        }
        if (i6 == get_size$collection() && i7 < getHashes$collection().length) {
            getHashes$collection()[i7] = i5;
            getArray$collection()[i7] = e5;
            set_size$collection(get_size$collection() + 1);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public final void addAll(@l ArraySet<? extends E> array) {
        l0.p(array, "array");
        int i5 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i5);
        if (get_size$collection() != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                add(array.valueAt(i6));
            }
            return;
        }
        if (i5 > 0) {
            o.I0(array.getHashes$collection(), getHashes$collection(), 0, 0, i5, 6, null);
            o.K0(array.getArray$collection(), getArray$collection(), 0, 0, i5, 6, null);
            if (get_size$collection() == 0) {
                set_size$collection(i5);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@l Collection<? extends Object> elements) {
        l0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i5) {
        int i6 = get_size$collection();
        if (getHashes$collection().length < i5) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i5);
            if (get_size$collection() > 0) {
                o.I0(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, null);
                o.K0(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, null);
            }
        }
        if (get_size$collection() == i6) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int i5 = get_size$collection();
                for (int i6 = 0; i6 < i5; i6++) {
                    if (((Set) obj).contains(valueAt(i6))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @l
    public final Object[] getArray$collection() {
        return this.array;
    }

    @l
    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public int getSize() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i5 = get_size$collection();
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += hashes$collection[i7];
        }
        return i6;
    }

    public final int indexOf(@m Object obj) {
        return obj == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@l ArraySet<? extends E> array) {
        l0.p(array, "array");
        int i5 = array.get_size$collection();
        int i6 = get_size$collection();
        for (int i7 = 0; i7 < i5; i7++) {
            remove(array.valueAt(i7));
        }
        return i6 != get_size$collection();
    }

    public final E removeAt(int i5) {
        int i6 = get_size$collection();
        E e5 = (E) getArray$collection()[i5];
        if (i6 <= 1) {
            clear();
        } else {
            int i7 = i6 - 1;
            int i8 = 8;
            if (getHashes$collection().length > 8 && get_size$collection() < getHashes$collection().length / 3) {
                if (get_size$collection() > 8) {
                    i8 = get_size$collection() + (get_size$collection() >> 1);
                }
                int[] hashes$collection = getHashes$collection();
                Object[] array$collection = getArray$collection();
                ArraySetKt.allocArrays(this, i8);
                if (i5 > 0) {
                    o.I0(hashes$collection, getHashes$collection(), 0, 0, i5, 6, null);
                    o.K0(array$collection, getArray$collection(), 0, 0, i5, 6, null);
                }
                if (i5 < i7) {
                    int i9 = i5 + 1;
                    int i10 = i7 + 1;
                    o.z0(hashes$collection, getHashes$collection(), i5, i9, i10);
                    o.B0(array$collection, getArray$collection(), i5, i9, i10);
                }
            } else {
                if (i5 < i7) {
                    int i11 = i5 + 1;
                    int i12 = i7 + 1;
                    o.z0(getHashes$collection(), getHashes$collection(), i5, i11, i12);
                    o.B0(getArray$collection(), getArray$collection(), i5, i11, i12);
                }
                getArray$collection()[i7] = null;
            }
            if (i6 == get_size$collection()) {
                set_size$collection(i7);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@l Collection<? extends Object> elements) {
        boolean T1;
        l0.p(elements, "elements");
        boolean z4 = false;
        for (int i5 = get_size$collection() - 1; -1 < i5; i5--) {
            T1 = e0.T1(elements, getArray$collection()[i5]);
            if (!T1) {
                removeAt(i5);
                z4 = true;
            }
        }
        return z4;
    }

    public final void setArray$collection(@l Object[] objArr) {
        l0.p(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(@l int[] iArr) {
        l0.p(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i5) {
        this._size = i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    @l
    public final Object[] toArray() {
        Object[] l12;
        l12 = o.l1(this.array, 0, this._size);
        return l12;
    }

    @l
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append('{');
        int i5 = get_size$collection();
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i6);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final E valueAt(int i5) {
        return (E) getArray$collection()[i5];
    }

    @Override // java.util.Collection, java.util.Set
    @l
    public final <T> T[] toArray(@l T[] array) {
        l0.p(array, "array");
        T[] result = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        o.B0(this.array, result, 0, 0, this._size);
        l0.o(result, "result");
        return result;
    }

    public /* synthetic */ ArraySet(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@l Collection<? extends Object> elements) {
        l0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    public ArraySet(@m ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(@m Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@m E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator a5 = kotlin.jvm.internal.i.a(eArr);
            while (a5.hasNext()) {
                add(a5.next());
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@l Collection<? extends E> elements) {
        l0.p(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }
}
