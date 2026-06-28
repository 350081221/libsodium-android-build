package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0086\b\u001a-\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a \u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a*\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\r\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a \u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\u0007H\u0000\u001a\u0019\u0010\u0011\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a!\u0010\u0013\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00020\u0007H\u0080\b\u001a(\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0080\b\u001a(\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a(\u0010\u001d\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001d\u0010\u0017\u001a)\u0010\u001f\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b\u001a(\u0010 \u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b \u0010\u0017\u001a(\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b!\u0010\u001b\u001a)\u0010\"\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b\u001a#\u0010$\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010#\u001a\u0004\u0018\u00010\nH\u0080\b\u001a\u0019\u0010%\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a\u0019\u0010'\u001a\u00020&\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a'\u0010*\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0080\b\u001a'\u0010\u001f\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0080\b\u001a'\u0010\"\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0080\b\u001a'\u0010+\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0080\b\"\u0014\u0010,\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"T", "Landroidx/collection/ArraySet;", "arraySetOf", "", "values", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "E", "", "hash", "binarySearchInternal", "", DatabaseFileArchive.COLUMN_KEY, "indexOf", "indexOfNull", "size", "Lkotlin/r2;", "allocArrays", "clearInternal", "minimumCapacity", "ensureCapacityInternal", "element", "", "containsInternal", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "indexOfInternal", "index", "valueAtInternal", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "isEmptyInternal", "addInternal", "array", "addAllInternal", "removeInternal", "removeAtInternal", "removeAllInternal", "other", "equalsInternal", "hashCodeInternal", "", "toStringInternal", "", "elements", "containsAllInternal", "retainAllInternal", "ARRAY_SET_BASE_SIZE", "I", "collection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(@l ArraySet<E> arraySet, @l ArraySet<? extends E> array) {
        l0.p(arraySet, "<this>");
        l0.p(array, "array");
        int i5 = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i5);
        if (arraySet.get_size$collection() != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                arraySet.add(array.valueAt(i6));
            }
            return;
        }
        if (i5 > 0) {
            o.I0(array.getHashes$collection(), arraySet.getHashes$collection(), 0, 0, i5, 6, null);
            o.K0(array.getArray$collection(), arraySet.getArray$collection(), 0, 0, i5, 6, null);
            if (arraySet.get_size$collection() == 0) {
                arraySet.set_size$collection(i5);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean addInternal(@l ArraySet<E> arraySet, E e5) {
        int i5;
        int indexOf;
        l0.p(arraySet, "<this>");
        int i6 = arraySet.get_size$collection();
        boolean z4 = false;
        if (e5 == null) {
            indexOf = indexOfNull(arraySet);
            i5 = 0;
        } else {
            int hashCode = e5.hashCode();
            i5 = hashCode;
            indexOf = indexOf(arraySet, e5, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i7 = ~indexOf;
        if (i6 >= arraySet.getHashes$collection().length) {
            int i8 = 8;
            if (i6 >= 8) {
                i8 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i8 = 4;
            }
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i8);
            if (i6 == arraySet.get_size$collection()) {
                if (arraySet.getHashes$collection().length == 0) {
                    z4 = true;
                }
                if (!z4) {
                    o.I0(hashes$collection, arraySet.getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                    o.K0(array$collection, arraySet.getArray$collection(), 0, 0, array$collection.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i6) {
            int i9 = i7 + 1;
            o.z0(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i9, i7, i6);
            o.B0(arraySet.getArray$collection(), arraySet.getArray$collection(), i9, i7, i6);
        }
        if (i6 == arraySet.get_size$collection() && i7 < arraySet.getHashes$collection().length) {
            arraySet.getHashes$collection()[i7] = i5;
            arraySet.getArray$collection()[i7] = e5;
            arraySet.set_size$collection(arraySet.get_size$collection() + 1);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public static final <E> void allocArrays(@l ArraySet<E> arraySet, int i5) {
        l0.p(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i5]);
        arraySet.setArray$collection(new Object[i5]);
    }

    @l
    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(@l ArraySet<E> arraySet, int i5) {
        l0.p(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i5);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(@l ArraySet<E> arraySet) {
        l0.p(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(@l ArraySet<E> arraySet, @l Collection<? extends E> elements) {
        l0.p(arraySet, "<this>");
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(@l ArraySet<E> arraySet, E e5) {
        l0.p(arraySet, "<this>");
        if (arraySet.indexOf(e5) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void ensureCapacityInternal(@l ArraySet<E> arraySet, int i5) {
        l0.p(arraySet, "<this>");
        int i6 = arraySet.get_size$collection();
        if (arraySet.getHashes$collection().length < i5) {
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i5);
            if (arraySet.get_size$collection() > 0) {
                o.I0(hashes$collection, arraySet.getHashes$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
                o.K0(array$collection, arraySet.getArray$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
            }
        }
        if (arraySet.get_size$collection() == i6) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(@l ArraySet<E> arraySet, @m Object obj) {
        l0.p(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i5 = arraySet.get_size$collection();
            for (int i6 = 0; i6 < i5; i6++) {
                if (!((Set) obj).contains(arraySet.valueAt(i6))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(@l ArraySet<E> arraySet) {
        l0.p(arraySet, "<this>");
        int[] hashes$collection = arraySet.getHashes$collection();
        int i5 = arraySet.get_size$collection();
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += hashes$collection[i7];
        }
        return i6;
    }

    public static final <E> int indexOf(@l ArraySet<E> arraySet, @m Object obj, int i5) {
        l0.p(arraySet, "<this>");
        int i6 = arraySet.get_size$collection();
        if (i6 == 0) {
            return -1;
        }
        int binarySearchInternal = binarySearchInternal(arraySet, i5);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (l0.g(obj, arraySet.getArray$collection()[binarySearchInternal])) {
            return binarySearchInternal;
        }
        int i7 = binarySearchInternal + 1;
        while (i7 < i6 && arraySet.getHashes$collection()[i7] == i5) {
            if (l0.g(obj, arraySet.getArray$collection()[i7])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = binarySearchInternal - 1; i8 >= 0 && arraySet.getHashes$collection()[i8] == i5; i8--) {
            if (l0.g(obj, arraySet.getArray$collection()[i8])) {
                return i8;
            }
        }
        return ~i7;
    }

    public static final <E> int indexOfInternal(@l ArraySet<E> arraySet, @m Object obj) {
        l0.p(arraySet, "<this>");
        if (obj == null) {
            return indexOfNull(arraySet);
        }
        return indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(@l ArraySet<E> arraySet) {
        l0.p(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(@l ArraySet<E> arraySet) {
        l0.p(arraySet, "<this>");
        if (arraySet.get_size$collection() <= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean removeAllInternal(@l ArraySet<E> arraySet, @l ArraySet<? extends E> array) {
        l0.p(arraySet, "<this>");
        l0.p(array, "array");
        int i5 = array.get_size$collection();
        int i6 = arraySet.get_size$collection();
        for (int i7 = 0; i7 < i5; i7++) {
            arraySet.remove(array.valueAt(i7));
        }
        return i6 != arraySet.get_size$collection();
    }

    public static final <E> E removeAtInternal(@l ArraySet<E> arraySet, int i5) {
        l0.p(arraySet, "<this>");
        int i6 = arraySet.get_size$collection();
        E e5 = (E) arraySet.getArray$collection()[i5];
        if (i6 <= 1) {
            arraySet.clear();
        } else {
            int i7 = i6 - 1;
            int i8 = 8;
            if (arraySet.getHashes$collection().length > 8 && arraySet.get_size$collection() < arraySet.getHashes$collection().length / 3) {
                if (arraySet.get_size$collection() > 8) {
                    i8 = arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1);
                }
                int[] hashes$collection = arraySet.getHashes$collection();
                Object[] array$collection = arraySet.getArray$collection();
                allocArrays(arraySet, i8);
                if (i5 > 0) {
                    o.I0(hashes$collection, arraySet.getHashes$collection(), 0, 0, i5, 6, null);
                    o.K0(array$collection, arraySet.getArray$collection(), 0, 0, i5, 6, null);
                }
                if (i5 < i7) {
                    int i9 = i5 + 1;
                    int i10 = i7 + 1;
                    o.z0(hashes$collection, arraySet.getHashes$collection(), i5, i9, i10);
                    o.B0(array$collection, arraySet.getArray$collection(), i5, i9, i10);
                }
            } else {
                if (i5 < i7) {
                    int i11 = i5 + 1;
                    int i12 = i7 + 1;
                    o.z0(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i5, i11, i12);
                    o.B0(arraySet.getArray$collection(), arraySet.getArray$collection(), i5, i11, i12);
                }
                arraySet.getArray$collection()[i7] = null;
            }
            if (i6 == arraySet.get_size$collection()) {
                arraySet.set_size$collection(i7);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e5;
    }

    public static final <E> boolean removeInternal(@l ArraySet<E> arraySet, E e5) {
        l0.p(arraySet, "<this>");
        int indexOf = arraySet.indexOf(e5);
        if (indexOf >= 0) {
            arraySet.removeAt(indexOf);
            return true;
        }
        return false;
    }

    public static final <E> boolean retainAllInternal(@l ArraySet<E> arraySet, @l Collection<? extends E> elements) {
        boolean T1;
        l0.p(arraySet, "<this>");
        l0.p(elements, "elements");
        boolean z4 = false;
        for (int i5 = arraySet.get_size$collection() - 1; -1 < i5; i5--) {
            T1 = e0.T1(elements, arraySet.getArray$collection()[i5]);
            if (!T1) {
                arraySet.removeAt(i5);
                z4 = true;
            }
        }
        return z4;
    }

    @l
    public static final <E> String toStringInternal(@l ArraySet<E> arraySet) {
        l0.p(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(arraySet.get_size$collection() * 14);
        sb.append('{');
        int i5 = arraySet.get_size$collection();
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            E valueAt = arraySet.valueAt(i6);
            if (valueAt != arraySet) {
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

    public static final <E> E valueAtInternal(@l ArraySet<E> arraySet, int i5) {
        l0.p(arraySet, "<this>");
        return (E) arraySet.getArray$collection()[i5];
    }

    @l
    public static final <T> ArraySet<T> arraySetOf(@l T... values) {
        l0.p(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t5 : values) {
            arraySet.add(t5);
        }
        return arraySet;
    }

    public static final <E> boolean removeAllInternal(@l ArraySet<E> arraySet, @l Collection<? extends E> elements) {
        l0.p(arraySet, "<this>");
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= arraySet.remove(it.next());
        }
        return z4;
    }

    public static final <E> boolean addAllInternal(@l ArraySet<E> arraySet, @l Collection<? extends E> elements) {
        l0.p(arraySet, "<this>");
        l0.p(elements, "elements");
        arraySet.ensureCapacity(arraySet.get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= arraySet.add(it.next());
        }
        return z4;
    }
}
