package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"calculateLazyLayoutPinnedIndices", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,62:1\n33#2,6:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n50#1:63,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    @l
    public static final List<Integer> calculateLazyLayoutPinnedIndices(@l LazyLayoutItemProvider lazyLayoutItemProvider, @l LazyLayoutPinnedItemList lazyLayoutPinnedItemList, @l LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        kotlin.ranges.l a5;
        boolean z4;
        boolean z5;
        List<Integer> E;
        if (!lazyLayoutBeyondBoundsInfo.hasIntervals() && lazyLayoutPinnedItemList.isEmpty()) {
            E = w.E();
            return E;
        }
        ArrayList arrayList = new ArrayList();
        if (lazyLayoutBeyondBoundsInfo.hasIntervals()) {
            a5 = new kotlin.ranges.l(lazyLayoutBeyondBoundsInfo.getStart(), Math.min(lazyLayoutBeyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1));
        } else {
            a5 = kotlin.ranges.l.f19552e.a();
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i5 = 0; i5 < size; i5++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i5);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int e5 = a5.e();
            if (findIndexByKey <= a5.g() && e5 <= findIndexByKey) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                if (findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    arrayList.add(Integer.valueOf(findIndexByKey));
                }
            }
        }
        int e6 = a5.e();
        int g5 = a5.g();
        if (e6 <= g5) {
            while (true) {
                arrayList.add(Integer.valueOf(e6));
                if (e6 == g5) {
                    break;
                }
                e6++;
            }
        }
        return arrayList;
    }
}
