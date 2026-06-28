package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/grid/LazyGridSlots;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,563:1\n51#2:564\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n*L\n158#1:564\n*E\n"})
/* loaded from: classes.dex */
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends n0 implements p<Density, Constraints, LazyGridSlots> {
    final /* synthetic */ GridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = gridCells;
        this.$horizontalArrangement = horizontal;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
        return m683invoke0kLqBqw(density, constraints.m6006unboximpl());
    }

    @l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridSlots m683invoke0kLqBqw(@l Density density, long j5) {
        boolean z4;
        int[] R5;
        if (Constraints.m6000getMaxWidthimpl(j5) != Integer.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            PaddingValues paddingValues = this.$contentPadding;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5) - density.mo298roundToPx0680j_4(Dp.m6044constructorimpl(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) + PaddingKt.calculateEndPadding(this.$contentPadding, layoutDirection)));
            GridCells gridCells = this.$columns;
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            R5 = e0.R5(gridCells.calculateCrossAxisCellSizes(density, m6000getMaxWidthimpl, density.mo298roundToPx0680j_4(horizontal.mo468getSpacingD9Ej5fM())));
            int[] iArr = new int[R5.length];
            horizontal.arrange(density, m6000getMaxWidthimpl, R5, layoutDirection, iArr);
            return new LazyGridSlots(R5, iArr);
        }
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
    }
}
