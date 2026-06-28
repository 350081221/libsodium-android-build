package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,463:1\n51#2:464\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberRowSlots$1$1\n*L\n194#1:464\n*E\n"})
/* loaded from: classes.dex */
final class LazyStaggeredGridDslKt$rememberRowSlots$1$1 extends n0 implements p<Density, Constraints, LazyStaggeredGridSlots> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ StaggeredGridCells $rows;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridDslKt$rememberRowSlots$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$rows = staggeredGridCells;
        this.$verticalArrangement = vertical;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
        return m742invoke0kLqBqw(density, constraints.m6006unboximpl());
    }

    @l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyStaggeredGridSlots m742invoke0kLqBqw(@l Density density, long j5) {
        boolean z4;
        if (Constraints.m5999getMaxHeightimpl(j5) != Integer.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5) - density.mo298roundToPx0680j_4(Dp.m6044constructorimpl(this.$contentPadding.mo506calculateTopPaddingD9Ej5fM() + this.$contentPadding.mo503calculateBottomPaddingD9Ej5fM()));
            StaggeredGridCells staggeredGridCells = this.$rows;
            Arrangement.Vertical vertical = this.$verticalArrangement;
            int[] calculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, m5999getMaxHeightimpl, density.mo298roundToPx0680j_4(vertical.mo468getSpacingD9Ej5fM()));
            int[] iArr = new int[calculateCrossAxisCellSizes.length];
            vertical.arrange(density, m5999getMaxHeightimpl, calculateCrossAxisCellSizes, iArr);
            return new LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
        }
        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
    }
}
