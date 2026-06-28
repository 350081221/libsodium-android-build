package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.o;
import kotlin.collections.t0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u001a*\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0007\u001a<\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\b*\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b\u001a0\u0010\u000b\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a2\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0007\u001a8\u0010\u0012\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a0\u0010\u0017\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a)\u0010\u001a\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b\u001a2\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001b\u0010\u0007\u001a\u0019\u0010\u001c\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a\u0019\u0010\u001d\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a!\u0010\u001e\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a(\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a0\u0010!\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b!\u0010\"\u001a!\u0010#\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b\u001a(\u0010$\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b$\u0010%\u001a!\u0010&\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b\u001a(\u0010'\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010)\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a0\u0010*\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b*\u0010\u0018\u001a\u0019\u0010,\u001a\u00020+\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a!\u0010-\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010.\u001a\u00020\n\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b.\u0010\u0018\u001a-\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a0\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b0\u0010\u0007\u001a9\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a/\u00105\u001a\u00020\r\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b5\u0010\u000e\u001aT\u0010:\u001a\u00020\n\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u000126\u00109\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\n06H\u0086\bø\u0001\u0000\u001a\u0016\u0010<\u001a\u00020;\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\"(\u0010F\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\f\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006G"}, d2 = {"E", "Landroidx/collection/LongSparseArray;", "", DatabaseFileArchive.COLUMN_KEY, "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "T", "commonGetInternal", "Lkotlin/r2;", "commonRemove", b.f22420d, "", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "", "index", "commonRemoveAt", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonGc", "commonPut", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "other", "commonPutAll", "commonPutIfAbsent", "commonSize", "commonIsEmpty", "commonKeyAt", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonContainsKey", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "contains", "set", "plus", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "(Landroidx/collection/LongSparseArray;JLv3/a;)Ljava/lang/Object;", "isNotEmpty", "remove", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/collections/t0;", "keyIterator", "", "valueIterator", "", "DELETED", "Ljava/lang/Object;", "getSize", "(Landroidx/collection/LongSparseArray;)I", "getSize$annotations", "(Landroidx/collection/LongSparseArray;)V", "size", "collection"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
/* loaded from: classes.dex */
public final class LongSparseArrayKt {

    @l
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(@l LongSparseArray<E> longSparseArray, long j5, E e5) {
        l0.p(longSparseArray, "<this>");
        int i5 = longSparseArray.size;
        if (i5 != 0 && j5 <= longSparseArray.keys[i5 - 1]) {
            longSparseArray.put(j5, e5);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i5 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj = objArr[i7];
                    if (obj != DELETED) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr[i6] = obj;
                            objArr[i7] = null;
                        }
                        i6++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i6;
            }
        }
        int i8 = longSparseArray.size;
        if (i8 >= longSparseArray.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i8 + 1);
            long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            longSparseArray.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            longSparseArray.values = copyOf2;
        }
        longSparseArray.keys[i8] = j5;
        longSparseArray.values[i8] = e5;
        longSparseArray.size = i8 + 1;
    }

    public static final <E> void commonClear(@l LongSparseArray<E> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        int i5 = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@l LongSparseArray<E> longSparseArray, long j5) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.indexOfKey(j5) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean commonContainsValue(@l LongSparseArray<E> longSparseArray, E e5) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.indexOfValue(e5) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void commonGc(@l LongSparseArray<E> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        int i5 = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != DELETED) {
                if (i7 != i6) {
                    jArr[i6] = jArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i6;
    }

    @m
    public static final <E> E commonGet(@l LongSparseArray<E> longSparseArray, long j5) {
        l0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j5);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[binarySearch];
    }

    public static final <T extends E, E> T commonGetInternal(@l LongSparseArray<E> longSparseArray, long j5, T t5) {
        l0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j5);
        if (binarySearch >= 0 && longSparseArray.values[binarySearch] != DELETED) {
            return (T) longSparseArray.values[binarySearch];
        }
        return t5;
    }

    public static final <E> int commonIndexOfKey(@l LongSparseArray<E> longSparseArray, long j5) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i5 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != DELETED) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i6;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j5);
    }

    public static final <E> int commonIndexOfValue(@l LongSparseArray<E> longSparseArray, E e5) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i5 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != DELETED) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i6;
        }
        int i8 = longSparseArray.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (longSparseArray.values[i9] == e5) {
                return i9;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@l LongSparseArray<E> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> long commonKeyAt(@l LongSparseArray<E> longSparseArray, int i5) {
        boolean z4;
        l0.p(longSparseArray, "<this>");
        if (i5 >= 0 && i5 < longSparseArray.size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (longSparseArray.garbage) {
                int i6 = longSparseArray.size;
                long[] jArr = longSparseArray.keys;
                Object[] objArr = longSparseArray.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i7;
            }
            return longSparseArray.keys[i5];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    public static final <E> void commonPut(@l LongSparseArray<E> longSparseArray, long j5, E e5) {
        l0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j5);
        if (binarySearch >= 0) {
            longSparseArray.values[binarySearch] = e5;
            return;
        }
        int i5 = ~binarySearch;
        if (i5 < longSparseArray.size && longSparseArray.values[i5] == DELETED) {
            longSparseArray.keys[i5] = j5;
            longSparseArray.values[i5] = e5;
            return;
        }
        if (longSparseArray.garbage) {
            int i6 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            if (i6 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i7;
                i5 = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i7, j5);
            }
        }
        int i9 = longSparseArray.size;
        if (i9 >= longSparseArray.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i9 + 1);
            long[] copyOf = Arrays.copyOf(longSparseArray.keys, idealLongArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            longSparseArray.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(longSparseArray.values, idealLongArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            longSparseArray.values = copyOf2;
        }
        int i10 = longSparseArray.size;
        if (i10 - i5 != 0) {
            long[] jArr2 = longSparseArray.keys;
            int i11 = i5 + 1;
            o.A0(jArr2, jArr2, i11, i5, i10);
            Object[] objArr2 = longSparseArray.values;
            o.B0(objArr2, objArr2, i11, i5, longSparseArray.size);
        }
        longSparseArray.keys[i5] = j5;
        longSparseArray.values[i5] = e5;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(@l LongSparseArray<E> longSparseArray, @l LongSparseArray<? extends E> other) {
        l0.p(longSparseArray, "<this>");
        l0.p(other, "other");
        int size = other.size();
        for (int i5 = 0; i5 < size; i5++) {
            longSparseArray.put(other.keyAt(i5), other.valueAt(i5));
        }
    }

    @m
    public static final <E> E commonPutIfAbsent(@l LongSparseArray<E> longSparseArray, long j5, E e5) {
        l0.p(longSparseArray, "<this>");
        E e6 = longSparseArray.get(j5);
        if (e6 == null) {
            longSparseArray.put(j5, e5);
        }
        return e6;
    }

    public static final <E> void commonRemove(@l LongSparseArray<E> longSparseArray, long j5) {
        l0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j5);
        if (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[binarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    public static final <E> void commonRemoveAt(@l LongSparseArray<E> longSparseArray, int i5) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.values[i5] != DELETED) {
            longSparseArray.values[i5] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    @m
    public static final <E> E commonReplace(@l LongSparseArray<E> longSparseArray, long j5, E e5) {
        l0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j5);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e6 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e5;
        return e6;
    }

    public static final <E> void commonSetValueAt(@l LongSparseArray<E> longSparseArray, int i5, E e5) {
        boolean z4;
        l0.p(longSparseArray, "<this>");
        if (i5 >= 0 && i5 < longSparseArray.size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (longSparseArray.garbage) {
                int i6 = longSparseArray.size;
                long[] jArr = longSparseArray.keys;
                Object[] objArr = longSparseArray.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i7;
            }
            longSparseArray.values[i5] = e5;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    public static final <E> int commonSize(@l LongSparseArray<E> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i5 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != DELETED) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i6;
        }
        return longSparseArray.size;
    }

    @l
    public static final <E> String commonToString(@l LongSparseArray<E> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(longSparseArray.size * 28);
        sb.append('{');
        int i5 = longSparseArray.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(longSparseArray.keyAt(i6));
            sb.append(o0.a.f20835h);
            E valueAt = longSparseArray.valueAt(i6);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <E> E commonValueAt(@l LongSparseArray<E> longSparseArray, int i5) {
        boolean z4;
        l0.p(longSparseArray, "<this>");
        if (i5 >= 0 && i5 < longSparseArray.size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (longSparseArray.garbage) {
                int i6 = longSparseArray.size;
                long[] jArr = longSparseArray.keys;
                Object[] objArr = longSparseArray.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i7;
            }
            return (E) longSparseArray.values[i5];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    public static final <T> boolean contains(@l LongSparseArray<T> longSparseArray, long j5) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.containsKey(j5);
    }

    public static final <T> void forEach(@l LongSparseArray<T> longSparseArray, @l p<? super Long, ? super T, r2> action) {
        l0.p(longSparseArray, "<this>");
        l0.p(action, "action");
        int size = longSparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i5)), longSparseArray.valueAt(i5));
        }
    }

    public static final <T> T getOrDefault(@l LongSparseArray<T> longSparseArray, long j5, T t5) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.get(j5, t5);
    }

    public static final <T> T getOrElse(@l LongSparseArray<T> longSparseArray, long j5, @l v3.a<? extends T> defaultValue) {
        l0.p(longSparseArray, "<this>");
        l0.p(defaultValue, "defaultValue");
        T t5 = longSparseArray.get(j5);
        if (t5 == null) {
            return defaultValue.invoke();
        }
        return t5;
    }

    public static final <T> int getSize(@l LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <T> boolean isNotEmpty(@l LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    @l
    public static final <T> t0 keyIterator(@l final LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new t0() { // from class: androidx.collection.LongSparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.t0
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return longSparseArray2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    @l
    public static final <T> LongSparseArray<T> plus(@l LongSparseArray<T> longSparseArray, @l LongSparseArray<T> other) {
        l0.p(longSparseArray, "<this>");
        l0.p(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    @k(level = kotlin.m.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j5, Object obj) {
        l0.p(longSparseArray, "<this>");
        return longSparseArray.remove(j5, obj);
    }

    public static final <T> void set(@l LongSparseArray<T> longSparseArray, long j5, T t5) {
        l0.p(longSparseArray, "<this>");
        longSparseArray.put(j5, t5);
    }

    @l
    public static final <T> Iterator<T> valueIterator(@l LongSparseArray<T> longSparseArray) {
        l0.p(longSparseArray, "<this>");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <E> E commonGet(@l LongSparseArray<E> longSparseArray, long j5, E e5) {
        l0.p(longSparseArray, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j5);
        return (binarySearch < 0 || longSparseArray.values[binarySearch] == DELETED) ? e5 : (E) longSparseArray.values[binarySearch];
    }

    public static final <E> boolean commonReplace(@l LongSparseArray<E> longSparseArray, long j5, E e5, E e6) {
        l0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j5);
        if (indexOfKey < 0 || !l0.g(longSparseArray.values[indexOfKey], e5)) {
            return false;
        }
        longSparseArray.values[indexOfKey] = e6;
        return true;
    }

    public static final <E> boolean commonRemove(@l LongSparseArray<E> longSparseArray, long j5, E e5) {
        l0.p(longSparseArray, "<this>");
        int indexOfKey = longSparseArray.indexOfKey(j5);
        if (indexOfKey < 0 || !l0.g(e5, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }
}
