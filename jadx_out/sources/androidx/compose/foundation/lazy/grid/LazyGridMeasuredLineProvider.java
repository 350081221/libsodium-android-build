package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ%\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0007H&¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0007J\u001b\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "", "isVertical", "", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "gridItemsCount", "", "spaceBetweenLines", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "(ZLandroidx/compose/foundation/lazy/grid/LazyGridSlots;IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "startSlot", "span", "childConstraints-JhjzzOo$foundation_release", "(II)J", "createLine", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "index", "items", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "mainAxisSpacing", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getAndMeasure", "lineIndex", "itemConstraints", "itemIndex", "itemConstraints-OenEA2s", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 8;
    private final int gridItemsCount;
    private final boolean isVertical;

    @l
    private final LazyGridMeasuredItemProvider measuredItemProvider;

    @l
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;

    @l
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridMeasuredLineProvider(boolean z4, @l LazyGridSlots lazyGridSlots, int i5, int i6, @l LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, @l LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z4;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i5;
        this.spaceBetweenLines = i6;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m696childConstraintsJhjzzOo$foundation_release(int i5, int i6) {
        int i7;
        int u4;
        if (i6 == 1) {
            i7 = this.slots.getSizes()[i5];
        } else {
            int i8 = (i6 + i5) - 1;
            i7 = (this.slots.getPositions()[i8] + this.slots.getSizes()[i8]) - this.slots.getPositions()[i5];
        }
        u4 = u.u(i7, 0);
        if (this.isVertical) {
            return Constraints.Companion.m6010fixedWidthOenEA2s(u4);
        }
        return Constraints.Companion.m6009fixedHeightOenEA2s(u4);
    }

    @l
    public abstract LazyGridMeasuredLine createLine(int i5, @l LazyGridMeasuredItem[] lazyGridMeasuredItemArr, @l List<GridItemSpan> list, int i6);

    @l
    public final LazyGridMeasuredLine getAndMeasure(int i5) {
        int i6;
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i5);
        int size = lineConfiguration.getSpans().size();
        if (size != 0 && lineConfiguration.getFirstItemIndex() + size != this.gridItemsCount) {
            i6 = this.spaceBetweenLines;
        } else {
            i6 = 0;
        }
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int m674getCurrentLineSpanimpl = GridItemSpan.m674getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i8).m677unboximpl());
            LazyGridMeasuredItem m695getAndMeasure3p2s80s = this.measuredItemProvider.m695getAndMeasure3p2s80s(lineConfiguration.getFirstItemIndex() + i8, i6, m696childConstraintsJhjzzOo$foundation_release(i7, m674getCurrentLineSpanimpl));
            i7 += m674getCurrentLineSpanimpl;
            r2 r2Var = r2.f19517a;
            lazyGridMeasuredItemArr[i8] = m695getAndMeasure3p2s80s;
        }
        return createLine(i5, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i6);
    }

    @l
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }

    /* renamed from: itemConstraints-OenEA2s, reason: not valid java name */
    public final long m697itemConstraintsOenEA2s(int i5) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return m696childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(i5, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }
}
