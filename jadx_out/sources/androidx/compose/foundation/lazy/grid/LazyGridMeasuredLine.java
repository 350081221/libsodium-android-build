package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0019\u001a\u00020\rJ)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "index", "", "items", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "isVertical", "", "mainAxisSpacing", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Landroidx/compose/foundation/lazy/grid/LazyGridSlots;Ljava/util/List;ZI)V", "getIndex", "()I", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "isEmpty", "position", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,86:1\n13579#2,2:87\n13644#2,3:89\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n46#1:87,2\n68#1:89,3\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;
    private final int index;
    private final boolean isVertical;

    @l
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;

    @l
    private final LazyGridSlots slots;

    @l
    private final List<GridItemSpan> spans;

    public LazyGridMeasuredLine(int i5, @l LazyGridMeasuredItem[] lazyGridMeasuredItemArr, @l LazyGridSlots lazyGridSlots, @l List<GridItemSpan> list, boolean z4, int i6) {
        int u4;
        this.index = i5;
        this.items = lazyGridMeasuredItemArr;
        this.slots = lazyGridSlots;
        this.spans = list;
        this.isVertical = z4;
        this.mainAxisSpacing = i6;
        int i7 = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            i7 = Math.max(i7, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = i7;
        u4 = u.u(i7 + this.mainAxisSpacing, 0);
        this.mainAxisSizeWithSpacings = u4;
    }

    public final int getIndex() {
        return this.index;
    }

    @l
    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    @l
    public final LazyGridMeasuredItem[] position(int i5, int i6, int i7) {
        int i8;
        int i9;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i10];
            int i13 = i11 + 1;
            int m674getCurrentLineSpanimpl = GridItemSpan.m674getCurrentLineSpanimpl(this.spans.get(i11).m677unboximpl());
            int i14 = this.slots.getPositions()[i12];
            boolean z4 = this.isVertical;
            if (z4) {
                i8 = this.index;
            } else {
                i8 = i12;
            }
            if (z4) {
                i9 = i12;
            } else {
                i9 = this.index;
            }
            lazyGridMeasuredItem.position(i5, i14, i6, i7, i8, i9);
            r2 r2Var = r2.f19517a;
            i12 += m674getCurrentLineSpanimpl;
            i10++;
            i11 = i13;
        }
        return this.items;
    }
}
