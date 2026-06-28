package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
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
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/LazyListMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,353:1\n495#2,4:354\n500#2:363\n129#3,5:358\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n295#1:354,4\n295#1:363\n295#1:358,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends n0 implements p<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> {
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ a<LazyListItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placement", "Landroidx/compose/ui/layout/MeasureResult;", "invoke", "(IILv3/l;)Landroidx/compose/ui/layout/MeasureResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements q<Integer, Integer, l<? super Placeable.PlacementScope, ? extends r2>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j5, int i5, int i6) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(LazyListState lazyListState, boolean z4, PaddingValues paddingValues, boolean z5, a<? extends LazyListItemProvider> aVar, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i5, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.$state = lazyListState;
        this.$isVertical = z4;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z5;
        this.$itemProviderLambda = aVar;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$beyondBoundsItemCount = i5;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m658invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyListMeasureResult m658invoke0kLqBqw(@p4.l final LazyLayoutMeasureScope lazyLayoutMeasureScope, long j5) {
        boolean z4;
        Orientation orientation;
        int mo298roundToPx0680j_4;
        int mo298roundToPx0680j_42;
        int i5;
        int i6;
        float mo468getSpacingD9Ej5fM;
        int m6000getMaxWidthimpl;
        long IntOffset;
        float scrollToBeConsumed$foundation_release;
        if (!this.$state.getHasLookaheadPassOccurred$foundation_release() && !lazyLayoutMeasureScope.isLookingAhead()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z5 = z4;
        if (this.$isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m229checkScrollableContainerConstraintsK40F9xA(j5, orientation);
        if (this.$isVertical) {
            mo298roundToPx0680j_4 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo504calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo298roundToPx0680j_4 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            mo298roundToPx0680j_42 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo505calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            mo298roundToPx0680j_42 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int mo298roundToPx0680j_43 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo506calculateTopPaddingD9Ej5fM());
        int mo298roundToPx0680j_44 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(this.$contentPadding.mo503calculateBottomPaddingD9Ej5fM());
        int i7 = mo298roundToPx0680j_43 + mo298roundToPx0680j_44;
        int i8 = mo298roundToPx0680j_4 + mo298roundToPx0680j_42;
        boolean z6 = this.$isVertical;
        if (z6) {
            i5 = i7;
        } else {
            i5 = i8;
        }
        if (z6 && !this.$reverseLayout) {
            i6 = mo298roundToPx0680j_43;
        } else if (z6 && this.$reverseLayout) {
            i6 = mo298roundToPx0680j_44;
        } else if (!z6 && !this.$reverseLayout) {
            i6 = mo298roundToPx0680j_4;
        } else {
            i6 = mo298roundToPx0680j_42;
        }
        final int i9 = i5 - i6;
        final long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(j5, -i8, -i7);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        final LazyListItemProvider invoke = this.$itemProviderLambda.invoke();
        invoke.getItemScope().setMaxSize(Constraints.m6000getMaxWidthimpl(m6016offsetNN6EwU), Constraints.m5999getMaxHeightimpl(m6016offsetNN6EwU));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical != null) {
                mo468getSpacingD9Ej5fM = vertical.mo468getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal != null) {
                mo468getSpacingD9Ej5fM = horizontal.mo468getSpacingD9Ej5fM();
            } else {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
            }
        }
        final int mo298roundToPx0680j_45 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(mo468getSpacingD9Ej5fM);
        final int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m6000getMaxWidthimpl = Constraints.m5999getMaxHeightimpl(j5) - i7;
        } else {
            m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5) - i8;
        }
        int i10 = m6000getMaxWidthimpl;
        if (this.$reverseLayout && i10 <= 0) {
            boolean z7 = this.$isVertical;
            if (!z7) {
                mo298roundToPx0680j_4 += i10;
            }
            if (z7) {
                mo298roundToPx0680j_43 += i10;
            }
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_4, mo298roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_4, mo298roundToPx0680j_43);
        }
        final long j6 = IntOffset;
        final boolean z8 = this.$isVertical;
        final Alignment.Horizontal horizontal2 = this.$horizontalAlignment;
        final Alignment.Vertical vertical2 = this.$verticalAlignment;
        final boolean z9 = this.$reverseLayout;
        final LazyListState lazyListState = this.$state;
        final int i11 = i6;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m6016offsetNN6EwU, z8, invoke, lazyLayoutMeasureScope, itemCount, mo298roundToPx0680j_45, horizontal2, vertical2, z9, i11, i9, j6, lazyListState) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ int $itemsCount;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ int $spaceBetweenItems;
            final /* synthetic */ LazyListState $state;
            final /* synthetic */ LazyLayoutMeasureScope $this_null;
            final /* synthetic */ Alignment.Vertical $verticalAlignment;
            final /* synthetic */ long $visualItemOffset;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$isVertical = z8;
                this.$this_null = lazyLayoutMeasureScope;
                this.$itemsCount = itemCount;
                this.$spaceBetweenItems = mo298roundToPx0680j_45;
                this.$horizontalAlignment = horizontal2;
                this.$verticalAlignment = vertical2;
                this.$reverseLayout = z9;
                this.$beforeContentPadding = i11;
                this.$afterContentPadding = i9;
                this.$visualItemOffset = j6;
                this.$state = lazyListState;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            @p4.l
            public LazyListMeasuredItem createItem(int i12, @p4.l Object obj, @m Object obj2, @p4.l List<? extends Placeable> list) {
                int i13;
                if (i12 == this.$itemsCount - 1) {
                    i13 = 0;
                } else {
                    i13 = this.$spaceBetweenItems;
                }
                return new LazyListMeasuredItem(i12, list, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, i13, this.$visualItemOffset, obj, obj2, this.$state.getItemAnimator$foundation_release(), null);
            }
        };
        this.$state.m669setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.m666getChildConstraintsmsEJaDk());
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState2 = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState2.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState2.getFirstVisibleItemIndex());
                int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                r2 r2Var = r2.f19517a;
                createNonObservableSnapshot.dispose();
                List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release());
                if (!lazyLayoutMeasureScope.isLookingAhead() && z5) {
                    scrollToBeConsumed$foundation_release = this.$state.getScrollDeltaBetweenPasses$foundation_release();
                } else {
                    scrollToBeConsumed$foundation_release = this.$state.getScrollToBeConsumed$foundation_release();
                }
                float f5 = scrollToBeConsumed$foundation_release;
                boolean z10 = this.$isVertical;
                List<Integer> headerIndexes = invoke.getHeaderIndexes();
                Arrangement.Vertical vertical3 = this.$verticalArrangement;
                Arrangement.Horizontal horizontal3 = this.$horizontalArrangement;
                boolean z11 = this.$reverseLayout;
                LazyListItemAnimator itemAnimator$foundation_release = this.$state.getItemAnimator$foundation_release();
                int i12 = this.$beyondBoundsItemCount;
                boolean isLookingAhead = lazyLayoutMeasureScope.isLookingAhead();
                LazyListMeasureResult postLookaheadLayoutInfo$foundation_release = this.$state.getPostLookaheadLayoutInfo$foundation_release();
                s0 coroutineScope$foundation_release = this.$state.getCoroutineScope$foundation_release();
                if (coroutineScope$foundation_release != null) {
                    LazyListMeasureResult m662measureLazyList5IMabDg = LazyListMeasureKt.m662measureLazyList5IMabDg(itemCount, lazyListMeasuredItemProvider, i10, i6, i9, mo298roundToPx0680j_45, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f5, m6016offsetNN6EwU, z10, headerIndexes, vertical3, horizontal3, z11, lazyLayoutMeasureScope, itemAnimator$foundation_release, i12, calculateLazyLayoutPinnedIndices, z5, isLookingAhead, postLookaheadLayoutInfo$foundation_release, coroutineScope$foundation_release, this.$state.m667getPlacementScopeInvalidatorzYiylxw$foundation_release(), new AnonymousClass3(lazyLayoutMeasureScope, j5, i8, i7));
                    LazyListState.applyMeasureResult$foundation_release$default(this.$state, m662measureLazyList5IMabDg, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                    return m662measureLazyList5IMabDg;
                }
                throw new IllegalArgumentException("coroutineScope should be not null".toString());
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
