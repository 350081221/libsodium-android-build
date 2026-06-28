package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J \u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020 ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "", "isVertical", "", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "(ZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "slot", "", "span", "childConstraints-JhjzzOo", "(II)J", "createItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "index", "lane", DatabaseFileArchive.COLUMN_KEY, "contentType", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "getAndMeasure", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getAndMeasure-jy6DScQ", "(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1225:1\n951#2:1226\n953#2:1228\n952#2:1229\n951#2:1231\n55#3:1227\n62#3:1230\n55#3:1232\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1074#1:1226\n1075#1:1228\n1075#1:1229\n1075#1:1231\n1074#1:1227\n1075#1:1230\n1075#1:1232\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyStaggeredGridMeasureProvider {
    public static final int $stable = 8;
    private final boolean isVertical;

    @l
    private final LazyStaggeredGridItemProvider itemProvider;

    @l
    private final LazyLayoutMeasureScope measureScope;

    @l
    private final LazyStaggeredGridSlots resolvedSlots;

    public LazyStaggeredGridMeasureProvider(boolean z4, @l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, @l LazyLayoutMeasureScope lazyLayoutMeasureScope, @l LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.isVertical = z4;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.resolvedSlots = lazyStaggeredGridSlots;
    }

    /* renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m757childConstraintsJhjzzOo(int i5, int i6) {
        int i7;
        if (i6 == 1) {
            i7 = this.resolvedSlots.getSizes()[i5];
        } else {
            int i8 = this.resolvedSlots.getPositions()[i5];
            int i9 = (i5 + i6) - 1;
            i7 = (this.resolvedSlots.getPositions()[i9] + this.resolvedSlots.getSizes()[i9]) - i8;
        }
        if (this.isVertical) {
            return Constraints.Companion.m6010fixedWidthOenEA2s(i7);
        }
        return Constraints.Companion.m6009fixedHeightOenEA2s(i7);
    }

    @l
    public abstract LazyStaggeredGridMeasuredItem createItem(int i5, int i6, int i7, @l Object obj, @m Object obj2, @l List<? extends Placeable> list);

    @l
    /* renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m758getAndMeasurejy6DScQ(int i5, long j5) {
        int B;
        int B2;
        Object key = this.itemProvider.getKey(i5);
        Object contentType = this.itemProvider.getContentType(i5);
        int length = this.resolvedSlots.getSizes().length;
        int i6 = (int) (j5 >> 32);
        B = u.B(i6, length - 1);
        B2 = u.B(((int) (j5 & 4294967295L)) - i6, length - B);
        return createItem(i5, B, B2, key, contentType, this.measureScope.mo717measure0kLqBqw(i5, m757childConstraintsJhjzzOo(B, B2)));
    }

    @l
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
