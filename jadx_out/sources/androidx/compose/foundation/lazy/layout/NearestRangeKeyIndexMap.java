package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", DatabaseFileArchive.COLUMN_KEY, "", "getIndex", "index", "getKey", "Landroidx/collection/ObjectIntMap;", "map", "Landroidx/collection/ObjectIntMap;", "", "keys", "[Ljava/lang/Object;", "keysStartIndex", "I", "Lkotlin/ranges/l;", "nearestRange", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "intervalContent", "<init>", "(Lkotlin/ranges/l;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n*L\n1#1,103:1\n1#2:104\n26#3:105\n360#4,5:106\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n73#1:105\n98#1:106,5\n*E\n"})
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    public static final int $stable = 8;

    @l
    private final Object[] keys;
    private final int keysStartIndex;

    @l
    private final ObjectIntMap<Object> map;

    public NearestRangeKeyIndexMap(@l kotlin.ranges.l lVar, @l LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        boolean z4;
        IntervalList<?> intervals = lazyLayoutIntervalContent.getIntervals();
        int e5 = lVar.e();
        if (e5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int min = Math.min(lVar.g(), intervals.getSize() - 1);
            if (min < e5) {
                this.map = ObjectIntMapKt.emptyObjectIntMap();
                this.keys = new Object[0];
                this.keysStartIndex = 0;
                return;
            } else {
                int i5 = (min - e5) + 1;
                this.keys = new Object[i5];
                this.keysStartIndex = e5;
                MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i5);
                intervals.forEach(e5, min, new NearestRangeKeyIndexMap$2$1(e5, min, mutableObjectIntMap, this));
                this.map = mutableObjectIntMap;
                return;
            }
        }
        throw new IllegalStateException("negative nearestRange.first".toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(@l Object obj) {
        ObjectIntMap<Object> objectIntMap = this.map;
        int findKeyIndex = objectIntMap.findKeyIndex(obj);
        if (findKeyIndex >= 0) {
            return objectIntMap.values[findKeyIndex];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    @m
    public Object getKey(int i5) {
        int we;
        Object[] objArr = this.keys;
        int i6 = i5 - this.keysStartIndex;
        if (i6 >= 0) {
            we = p.we(objArr);
            if (i6 <= we) {
                return objArr[i6];
            }
        }
        return null;
    }
}
