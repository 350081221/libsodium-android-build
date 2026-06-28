package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import u3.h;

@i0(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ar\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\b\u001a<\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\t0\b\u001aR\u0010\u000f\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00020\t0\b¨\u0006\u0010"}, d2 = {"", "K", "V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "Lkotlin/r2;", "fetchBlock", "recursiveFetchHashMap", "Landroidx/collection/LongSparseArray;", "recursiveFetchLongSparseArray", "Landroidx/collection/ArrayMap;", "recursiveFetchArrayMap", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
@h(name = "RelationUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class RelationUtil {
    public static final <K, V> void recursiveFetchArrayMap(@l ArrayMap<K, V> map, boolean z4, @l v3.l<? super ArrayMap<K, V>, r2> fetchBlock) {
        l0.p(map, "map");
        l0.p(fetchBlock, "fetchBlock");
        ArrayMap arrayMap = new ArrayMap(999);
        int size = map.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            if (z4) {
                arrayMap.put(map.keyAt(i5), map.valueAt(i5));
            } else {
                arrayMap.put(map.keyAt(i5), null);
            }
            i5++;
            i6++;
            if (i6 == 999) {
                fetchBlock.invoke(arrayMap);
                if (!z4) {
                    map.putAll((Map) arrayMap);
                }
                arrayMap.clear();
                i6 = 0;
            }
        }
        if (i6 > 0) {
            fetchBlock.invoke(arrayMap);
            if (!z4) {
                map.putAll((Map) arrayMap);
            }
        }
    }

    public static final <K, V> void recursiveFetchHashMap(@l HashMap<K, V> map, boolean z4, @l v3.l<? super HashMap<K, V>, r2> fetchBlock) {
        int i5;
        l0.p(map, "map");
        l0.p(fetchBlock, "fetchBlock");
        HashMap hashMap = new HashMap(999);
        loop0: while (true) {
            i5 = 0;
            for (K key : map.keySet()) {
                if (z4) {
                    l0.o(key, "key");
                    hashMap.put(key, map.get(key));
                } else {
                    l0.o(key, "key");
                    hashMap.put(key, null);
                }
                i5++;
                if (i5 == 999) {
                    fetchBlock.invoke(hashMap);
                    if (!z4) {
                        map.putAll(hashMap);
                    }
                    hashMap.clear();
                }
            }
            break loop0;
        }
        if (i5 > 0) {
            fetchBlock.invoke(hashMap);
            if (!z4) {
                map.putAll(hashMap);
            }
        }
    }

    public static final <V> void recursiveFetchLongSparseArray(@l LongSparseArray<V> map, boolean z4, @l v3.l<? super LongSparseArray<V>, r2> fetchBlock) {
        l0.p(map, "map");
        l0.p(fetchBlock, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray = new LongSparseArray<>(999);
        int size = map.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            if (z4) {
                longSparseArray.put(map.keyAt(i5), map.valueAt(i5));
            } else {
                longSparseArray.put(map.keyAt(i5), null);
            }
            i5++;
            i6++;
            if (i6 == 999) {
                fetchBlock.invoke(longSparseArray);
                if (!z4) {
                    map.putAll(longSparseArray);
                }
                longSparseArray.clear();
                i6 = 0;
            }
        }
        if (i6 > 0) {
            fetchBlock.invoke(longSparseArray);
            if (!z4) {
                map.putAll(longSparseArray);
            }
        }
    }
}
