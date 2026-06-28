package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n1#2:96\n69#3,6:97\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:97,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    @m
    public static final LazyListMeasuredItem findOrComposeLazyListHeader(@l List<LazyListMeasuredItem> list, @l LazyListMeasuredItemProvider lazyListMeasuredItemProvider, @l List<Integer> list2, int i5, int i6, int i7) {
        Object y22;
        int i8;
        Integer num;
        int G;
        y22 = e0.y2(list);
        int index = ((LazyListMeasuredItem) y22).getIndex();
        int size = list2.size();
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        while (i11 < size && list2.get(i11).intValue() <= index) {
            i9 = list2.get(i11).intValue();
            i11++;
            if (i11 >= 0) {
                G = w.G(list2);
                if (i11 <= G) {
                    num = list2.get(i11);
                    i10 = num.intValue();
                }
            }
            num = -1;
            i10 = num.intValue();
        }
        int size2 = list.size();
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < size2; i15++) {
            LazyListMeasuredItem lazyListMeasuredItem = list.get(i15);
            if (lazyListMeasuredItem.getIndex() == i9) {
                i12 = lazyListMeasuredItem.getOffset();
                i14 = i15;
            } else if (lazyListMeasuredItem.getIndex() == i10) {
                i13 = lazyListMeasuredItem.getOffset();
            }
        }
        if (i9 == -1) {
            return null;
        }
        LazyListMeasuredItem andMeasure = lazyListMeasuredItemProvider.getAndMeasure(i9);
        andMeasure.setNonScrollableItem(true);
        if (i12 != Integer.MIN_VALUE) {
            i8 = Math.max(-i5, i12);
        } else {
            i8 = -i5;
        }
        if (i13 != Integer.MIN_VALUE) {
            i8 = Math.min(i8, i13 - andMeasure.getSize());
        }
        andMeasure.position(i8, i6, i7);
        if (i14 != -1) {
            list.set(i14, andMeasure);
        } else {
            list.add(0, andMeasure);
        }
        return andMeasure;
    }
}
