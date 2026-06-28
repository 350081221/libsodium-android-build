package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a<\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a \u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a+\u0010\u000b\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0080\b\u001a!\u0010\u0010\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b\u001a)\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\b\u001a2\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0007\u001a8\u0010\u0013\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002\u001a0\u0010\u0018\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0080\b\u001a2\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u0007\u001a\u0019\u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b\u001a\u0019\u0010\u001e\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b\u001a!\u0010\u001f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b\u001a(\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b \u0010\t\u001a0\u0010!\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b!\u0010\u0019\u001a!\u0010\"\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a(\u0010#\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b#\u0010$\u001a!\u0010%\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a(\u0010&\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b\u001a0\u0010)\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010\u0019\u001a\u0019\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b\"\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"E", "T", "Landroidx/collection/SparseArrayCompat;", "", DatabaseFileArchive.COLUMN_KEY, "defaultValue", "internalGet", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "Lkotlin/r2;", "commonRemove", "", b.f22420d, "", "index", "commonRemoveAt", "size", "commonRemoveAtRange", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "gc", "commonPut", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "other", "commonPutAll", "commonPutIfAbsent", "commonSize", "commonIsEmpty", "commonKeyAt", "commonValueAt", "commonSetValueAt", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonContainsKey", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "DELETED", "Ljava/lang/Object;", "collection"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
/* loaded from: classes.dex */
public final class SparseArrayCompatKt {

    @l
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(@l SparseArrayCompat<E> sparseArrayCompat, int i5, E e5) {
        l0.p(sparseArrayCompat, "<this>");
        int i6 = sparseArrayCompat.size;
        if (i6 != 0 && i5 <= sparseArrayCompat.keys[i6 - 1]) {
            sparseArrayCompat.put(i5, e5);
            return;
        }
        if (sparseArrayCompat.garbage && i6 >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
        }
        int i7 = sparseArrayCompat.size;
        if (i7 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
            int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            sparseArrayCompat.values = copyOf2;
        }
        sparseArrayCompat.keys[i7] = i5;
        sparseArrayCompat.values[i7] = e5;
        sparseArrayCompat.size = i7 + 1;
    }

    public static final <E> void commonClear(@l SparseArrayCompat<E> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        int i5 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@l SparseArrayCompat<E> sparseArrayCompat, int i5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.indexOfKey(i5) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean commonContainsValue(@l SparseArrayCompat<E> sparseArrayCompat, E e5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i5 = sparseArrayCompat.size;
        int i6 = 0;
        while (true) {
            if (i6 < i5) {
                if (sparseArrayCompat.values[i6] == e5) {
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

    @m
    public static final <E> E commonGet(@l SparseArrayCompat<E> sparseArrayCompat, int i5) {
        E e5;
        l0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
        if (binarySearch < 0 || (e5 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) {
            return null;
        }
        return e5;
    }

    public static final <E> int commonIndexOfKey(@l SparseArrayCompat<E> sparseArrayCompat, int i5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
    }

    public static final <E> int commonIndexOfValue(@l SparseArrayCompat<E> sparseArrayCompat, E e5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i5 = sparseArrayCompat.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (sparseArrayCompat.values[i6] == e5) {
                return i6;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@l SparseArrayCompat<E> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> int commonKeyAt(@l SparseArrayCompat<E> sparseArrayCompat, int i5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i5];
    }

    public static final <E> void commonPut(@l SparseArrayCompat<E> sparseArrayCompat, int i5, E e5) {
        l0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
        if (binarySearch >= 0) {
            sparseArrayCompat.values[binarySearch] = e5;
            return;
        }
        int i6 = ~binarySearch;
        if (i6 < sparseArrayCompat.size && sparseArrayCompat.values[i6] == DELETED) {
            sparseArrayCompat.keys[i6] = i5;
            sparseArrayCompat.values[i6] = e5;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
            i6 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
        }
        int i7 = sparseArrayCompat.size;
        if (i7 >= sparseArrayCompat.keys.length) {
            int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
            int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            sparseArrayCompat.values = copyOf2;
        }
        int i8 = sparseArrayCompat.size;
        if (i8 - i6 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i9 = i6 + 1;
            o.z0(iArr, iArr, i9, i6, i8);
            Object[] objArr = sparseArrayCompat.values;
            o.B0(objArr, objArr, i9, i6, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i6] = i5;
        sparseArrayCompat.values[i6] = e5;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(@l SparseArrayCompat<E> sparseArrayCompat, @l SparseArrayCompat<? extends E> other) {
        l0.p(sparseArrayCompat, "<this>");
        l0.p(other, "other");
        int size = other.size();
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = other.keyAt(i5);
            E valueAt = other.valueAt(i5);
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = valueAt;
            } else {
                int i6 = ~binarySearch;
                if (i6 < sparseArrayCompat.size && sparseArrayCompat.values[i6] == DELETED) {
                    sparseArrayCompat.keys[i6] = keyAt;
                    sparseArrayCompat.values[i6] = valueAt;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i6 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
                    }
                    int i7 = sparseArrayCompat.size;
                    if (i7 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
                        int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        l0.o(copyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        l0.o(copyOf2, "copyOf(this, newSize)");
                        sparseArrayCompat.values = copyOf2;
                    }
                    int i8 = sparseArrayCompat.size;
                    if (i8 - i6 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i9 = i6 + 1;
                        o.z0(iArr, iArr, i9, i6, i8);
                        Object[] objArr = sparseArrayCompat.values;
                        o.B0(objArr, objArr, i9, i6, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i6] = keyAt;
                    sparseArrayCompat.values[i6] = valueAt;
                    sparseArrayCompat.size++;
                }
            }
        }
    }

    @m
    public static final <E> E commonPutIfAbsent(@l SparseArrayCompat<E> sparseArrayCompat, int i5, E e5) {
        l0.p(sparseArrayCompat, "<this>");
        E e6 = (E) commonGet(sparseArrayCompat, i5);
        if (e6 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = e5;
            } else {
                int i6 = ~binarySearch;
                if (i6 < sparseArrayCompat.size && sparseArrayCompat.values[i6] == DELETED) {
                    sparseArrayCompat.keys[i6] = i5;
                    sparseArrayCompat.values[i6] = e5;
                } else {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i6 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
                    }
                    int i7 = sparseArrayCompat.size;
                    if (i7 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i7 + 1);
                        int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        l0.o(copyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        l0.o(copyOf2, "copyOf(this, newSize)");
                        sparseArrayCompat.values = copyOf2;
                    }
                    int i8 = sparseArrayCompat.size;
                    if (i8 - i6 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i9 = i6 + 1;
                        o.z0(iArr, iArr, i9, i6, i8);
                        Object[] objArr = sparseArrayCompat.values;
                        o.B0(objArr, objArr, i9, i6, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i6] = i5;
                    sparseArrayCompat.values[i6] = e5;
                    sparseArrayCompat.size++;
                }
            }
        }
        return e6;
    }

    public static final <E> void commonRemove(@l SparseArrayCompat<E> sparseArrayCompat, int i5) {
        l0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
        if (binarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[binarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[binarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(@l SparseArrayCompat<E> sparseArrayCompat, int i5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i5] != DELETED) {
            sparseArrayCompat.values[i5] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(@l SparseArrayCompat<E> sparseArrayCompat, int i5, int i6) {
        l0.p(sparseArrayCompat, "<this>");
        int min = Math.min(i6, i5 + i6);
        while (i5 < min) {
            sparseArrayCompat.removeAt(i5);
            i5++;
        }
    }

    @m
    public static final <E> E commonReplace(@l SparseArrayCompat<E> sparseArrayCompat, int i5, E e5) {
        l0.p(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i5);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e6 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e5;
        return e6;
    }

    public static final <E> void commonSetValueAt(@l SparseArrayCompat<E> sparseArrayCompat, int i5, E e5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i5] = e5;
    }

    public static final <E> int commonSize(@l SparseArrayCompat<E> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    @l
    public static final <E> String commonToString(@l SparseArrayCompat<E> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append('{');
        int i5 = sparseArrayCompat.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i6));
            sb.append(o0.a.f20835h);
            E valueAt = sparseArrayCompat.valueAt(i6);
            if (valueAt != sparseArrayCompat) {
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

    public static final <E> E commonValueAt(@l SparseArrayCompat<E> sparseArrayCompat, int i5) {
        l0.p(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i5 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != DELETED) {
                if (i7 != i6) {
                    iArr[i6] = iArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i6;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i5, T t5) {
        T t6;
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
        if (binarySearch >= 0 && (t6 = (T) sparseArrayCompat.values[binarySearch]) != DELETED) {
            return t6;
        }
        return t5;
    }

    public static final <E> E commonGet(@l SparseArrayCompat<E> sparseArrayCompat, int i5, E e5) {
        E e6;
        l0.p(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i5);
        return (binarySearch < 0 || (e6 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) ? e5 : e6;
    }

    public static final <E> boolean commonReplace(@l SparseArrayCompat<E> sparseArrayCompat, int i5, E e5, E e6) {
        l0.p(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i5);
        if (indexOfKey < 0 || !l0.g(sparseArrayCompat.values[indexOfKey], e5)) {
            return false;
        }
        sparseArrayCompat.values[indexOfKey] = e6;
        return true;
    }

    public static final <E> boolean commonRemove(@l SparseArrayCompat<E> sparseArrayCompat, int i5, @m Object obj) {
        l0.p(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i5);
        if (indexOfKey < 0 || !l0.g(obj, sparseArrayCompat.valueAt(indexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(indexOfKey);
        return true;
    }
}
