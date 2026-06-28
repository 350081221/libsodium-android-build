package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/grid/LazyGridSlots;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,563:1\n51#2:564\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberRowHeightSums$1$1\n*L\n191#1:564\n*E\n"})
/* loaded from: classes.dex */
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends n0 implements p<Density, Constraints, LazyGridSlots> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ GridCells $rows;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Vertical vertical) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$rows = gridCells;
        this.$verticalArrangement = vertical;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
        return m684invoke0kLqBqw(density, constraints.m6006unboximpl());
    }

    @l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridSlots m684invoke0kLqBqw(@l Density density, long j5) {
        boolean z4;
        int[] R5;
        if (Constraints.m5999getMaxHeightimpl(j5) != Integer.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5) - density.mo298roundToPx0680j_4(Dp.m6044constructorimpl(this.$contentPadding.mo506calculateTopPaddingD9Ej5fM() + this.$contentPadding.mo503calculateBottomPaddingD9Ej5fM()));
            GridCells gridCells = this.$rows;
            Arrangement.Vertical vertical = this.$verticalArrangement;
            R5 = e0.R5(gridCells.calculateCrossAxisCellSizes(density, m5999getMaxHeightimpl, density.mo298roundToPx0680j_4(vertical.mo468getSpacingD9Ej5fM())));
            int[] iArr = new int[R5.length];
            vertical.arrange(density, m5999getMaxHeightimpl, R5, iArr);
            return new LazyGridSlots(R5, iArr);
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
    }
}
