package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,221:1\n1#2:222\n495#3,4:223\n500#3:232\n129#4,5:227\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n149#1:223,4\n149#1:232\n149#1:227,5\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 extends n0 implements p<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> {
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ v3.a<PagerLazyLayoutItemProvider> $itemProviderLambda;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ v3.a<Integer> $pageCount;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ SnapPositionInLayout $snapPositionInLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placement", "Landroidx/compose/ui/layout/MeasureResult;", "invoke", "(IILv3/l;)Landroidx/compose/ui/layout/MeasureResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements q<Integer, Integer, l<? super Placeable.PlacementScope, ? extends r2>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j5, int i5, int i6) {
            super(3);
            this.$this_null = lazyLayoutMeasureScope;
            this.$containerConstraints = j5;
            this.$totalHorizontalPadding = i5;
            this.$totalVerticalPadding = i6;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, l<? super Placeable.PlacementScope, ? extends r2> lVar) {
            return invoke(num.intValue(), num2.intValue(), (l<? super Placeable.PlacementScope, r2>) lVar);
        }

        @p4.l
        public final MeasureResult invoke(int i5, int i6, @p4.l l<? super Placeable.PlacementScope, r2> lVar) {
            Map<AlignmentLine, Integer> z4;
            LazyLayoutMeasureScope lazyLayoutMeasureScope = this.$this_null;
            int m6014constrainWidthK40F9xA = ConstraintsKt.m6014constrainWidthK40F9xA(this.$containerConstraints, i5 + this.$totalHorizontalPadding);
            int m6013constrainHeightK40F9xA = ConstraintsKt.m6013constrainHeightK40F9xA(this.$containerConstraints, i6 + this.$totalVerticalPadding);
            z4 = a1.z();
            return lazyLayoutMeasureScope.layout(m6014constrainWidthK40F9xA, m6013constrainHeightK40F9xA, z4, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(Orientation orientation, PaddingValues paddingValues, boolean z4, PagerState pagerState, float f5, PageSize pageSize, v3.a<PagerLazyLayoutItemProvider> aVar, v3.a<Integer> aVar2, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i5, SnapPositionInLayout snapPositionInLayout) {
        super(2);
        this.$orientation = orientation;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z4;
        this.$state = pagerState;
        this.$pageSpacing = f5;
        this.$pageSize = pageSize;
        this.$itemProviderLambda = aVar;
        this.$pageCount = aVar2;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$beyondBoundsPageCount = i5;
        this.$snapPositionInLayout = snapPositionInLayout;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m788invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final PagerMeasureResult m788invoke0kLqBqw(@p4.l LazyLayoutMeasureScope lazyLayoutMeasureScope, long j5) {
        boolean z4;
        Orientation orientation;
        int mo298roundToPx0680j_4;
        int mo298roundToPx0680j_42;
        int i5;
        int i6;
        int m6000getMaxWidthimpl;
        long IntOffset;
        int i7;
        int i8;
        Orientation orientation2 = this.$orientation;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 == orientation3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            orientation = orientation3;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m229checkScrollableContainerConstraintsK40F9xA(j5, orientation);
        if (z4) {
            mo298roundToPx0680j_4 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo504calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo298roundToPx0680j_4 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (z4) {
            mo298roundToPx0680j_42 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo505calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo298roundToPx0680j_42 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo298roundToPx0680j_43 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo506calculateTopPaddingD9Ej5fM());
        int mo298roundToPx0680j_44 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo503calculateBottomPaddingD9Ej5fM());
        int i9 = mo298roundToPx0680j_43 + mo298roundToPx0680j_44;
        int i10 = mo298roundToPx0680j_4 + mo298roundToPx0680j_42;
        if (z4) {
            i5 = i9;
        } else {
            i5 = i10;
        }
        if (z4 && !this.$reverseLayout) {
            i6 = mo298roundToPx0680j_43;
        } else if (z4 && this.$reverseLayout) {
            i6 = mo298roundToPx0680j_44;
        } else if (!z4 && !this.$reverseLayout) {
            i6 = mo298roundToPx0680j_4;
        } else {
            i6 = mo298roundToPx0680j_42;
        }
        int i11 = i5 - i6;
        long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(j5, -i10, -i9);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        int mo298roundToPx0680j_45 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$pageSpacing);
        if (z4) {
            m6000getMaxWidthimpl = Constraints.m5999getMaxHeightimpl(j5) - i9;
        } else {
            m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5) - i10;
        }
        if (this.$reverseLayout && m6000getMaxWidthimpl <= 0) {
            if (!z4) {
                mo298roundToPx0680j_4 += m6000getMaxWidthimpl;
            }
            if (z4) {
                mo298roundToPx0680j_43 += m6000getMaxWidthimpl;
            }
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_4, mo298roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_4, mo298roundToPx0680j_43);
        }
        long j6 = IntOffset;
        int calculateMainAxisPageSize = this.$pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope, m6000getMaxWidthimpl, mo298roundToPx0680j_45);
        PagerState pagerState = this.$state;
        if (this.$orientation == orientation3) {
            i7 = Constraints.m6000getMaxWidthimpl(m6016offsetNN6EwU);
        } else {
            i7 = calculateMainAxisPageSize;
        }
        if (this.$orientation != orientation3) {
            i8 = Constraints.m5999getMaxHeightimpl(m6016offsetNN6EwU);
        } else {
            i8 = calculateMainAxisPageSize;
        }
        pagerState.m792setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, i7, 0, i8, 5, null));
        PagerLazyLayoutItemProvider invoke = this.$itemProviderLambda.invoke();
        int i12 = calculateMainAxisPageSize + mo298roundToPx0680j_45;
        Snapshot.Companion companion = Snapshot.Companion;
        PagerState pagerState2 = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                int calculateCurrentPageLayoutOffset = PagerMeasurePolicyKt.calculateCurrentPageLayoutOffset(pagerState2, i12);
                r2 r2Var = r2.f19517a;
                createNonObservableSnapshot.dispose();
                List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedPages$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release());
                int i13 = m6000getMaxWidthimpl;
                int i14 = i6;
                PagerMeasureResult m786measurePager_JDW0YA = PagerMeasureKt.m786measurePager_JDW0YA(lazyLayoutMeasureScope, this.$pageCount.invoke().intValue(), invoke, i13, i14, i11, mo298roundToPx0680j_45, matchScrollPositionWithKey$foundation_release, calculateCurrentPageLayoutOffset, m6016offsetNN6EwU, this.$orientation, this.$verticalAlignment, this.$horizontalAlignment, this.$reverseLayout, j6, calculateMainAxisPageSize, this.$beyondBoundsPageCount, calculateLazyLayoutPinnedIndices, this.$snapPositionInLayout, this.$state.m789getPlacementScopeInvalidatorzYiylxw$foundation_release(), new AnonymousClass2(lazyLayoutMeasureScope, j5, i10, i9));
                PagerState.applyMeasureResult$foundation_release$default(this.$state, m786measurePager_JDW0YA, false, 2, null);
                return m786measurePager_JDW0YA;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
