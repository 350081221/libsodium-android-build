package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.s0;
import p4.l;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,167:1\n51#2:168\n51#2:169\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n93#1:168\n96#1:169\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 extends n0 implements p<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ a<LazyStaggeredGridItemProvider> $itemProviderLambda;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyGridStaggeredGridSlotsProvider $slots;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(Orientation orientation, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, a<? extends LazyStaggeredGridItemProvider> aVar, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z4, float f5, s0 s0Var) {
        super(2);
        this.$orientation = orientation;
        this.$slots = lazyGridStaggeredGridSlotsProvider;
        this.$itemProviderLambda = aVar;
        this.$state = lazyStaggeredGridState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z4;
        this.$mainAxisSpacing = f5;
        this.$coroutineScope = s0Var;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m756invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6006unboximpl());
    }

    @l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyStaggeredGridMeasureResult m756invoke0kLqBqw(@l LazyLayoutMeasureScope lazyLayoutMeasureScope, long j5) {
        boolean z4;
        float beforePadding;
        float afterPadding;
        float startPadding;
        int m6000getMaxWidthimpl;
        long IntOffset;
        CheckScrollableContainerConstraintsKt.m229checkScrollableContainerConstraintsK40F9xA(j5, this.$orientation);
        LazyStaggeredGridSlots mo738invoke0kLqBqw = this.$slots.mo738invoke0kLqBqw(lazyLayoutMeasureScope, j5);
        if (this.$orientation == Orientation.Vertical) {
            z4 = true;
        } else {
            z4 = false;
        }
        LazyStaggeredGridItemProvider invoke = this.$itemProviderLambda.invoke();
        this.$state.setSlots$foundation_release(mo738invoke0kLqBqw);
        this.$state.setVertical$foundation_release(z4);
        this.$state.setSpanProvider$foundation_release(invoke.getSpanProvider());
        beforePadding = LazyStaggeredGridMeasurePolicyKt.beforePadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo298roundToPx0680j_4 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(beforePadding);
        afterPadding = LazyStaggeredGridMeasurePolicyKt.afterPadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int mo298roundToPx0680j_42 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(afterPadding);
        startPadding = LazyStaggeredGridMeasurePolicyKt.startPadding(this.$contentPadding, this.$orientation, lazyLayoutMeasureScope.getLayoutDirection());
        int mo298roundToPx0680j_43 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(startPadding);
        if (z4) {
            m6000getMaxWidthimpl = Constraints.m5999getMaxHeightimpl(j5);
        } else {
            m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        }
        int i5 = (m6000getMaxWidthimpl - mo298roundToPx0680j_4) - mo298roundToPx0680j_42;
        if (z4) {
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_43, mo298roundToPx0680j_4);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_4, mo298roundToPx0680j_43);
        }
        long j6 = IntOffset;
        PaddingValues paddingValues = this.$contentPadding;
        int mo298roundToPx0680j_44 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.$contentPadding;
        boolean z5 = z4;
        LazyStaggeredGridMeasureResult m754measureStaggeredGridsdzDtKU = LazyStaggeredGridMeasureKt.m754measureStaggeredGridsdzDtKU(lazyLayoutMeasureScope, this.$state, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), invoke, mo738invoke0kLqBqw, Constraints.m5991copyZbe2FdA$default(j5, ConstraintsKt.m6014constrainWidthK40F9xA(j5, mo298roundToPx0680j_44), 0, ConstraintsKt.m6013constrainHeightK40F9xA(j5, lazyLayoutMeasureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(paddingValues2.mo506calculateTopPaddingD9Ej5fM() + paddingValues2.mo503calculateBottomPaddingD9Ej5fM()))), 0, 10, null), z5, this.$reverseLayout, j6, i5, lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$mainAxisSpacing), mo298roundToPx0680j_4, mo298roundToPx0680j_42, this.$coroutineScope);
        LazyStaggeredGridState.applyMeasureResult$foundation_release$default(this.$state, m754measureStaggeredGridsdzDtKU, false, 2, null);
        return m754measureStaggeredGridsdzDtKU;
    }
}
