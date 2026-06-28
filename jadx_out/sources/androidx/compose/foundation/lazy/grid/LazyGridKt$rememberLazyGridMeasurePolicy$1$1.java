package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,376:1\n495#2,4:377\n500#2:386\n129#3,5:381\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n321#1:377,4\n321#1:386\n321#1:381,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends n0 implements p<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ a<LazyGridItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyGridSlotsProvider $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "line", "Ljava/util/ArrayList;", "Lkotlin/u0;", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/collections/ArrayList;", "invoke", "(I)Ljava/util/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n*L\n309#1:377,6\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Integer, ArrayList<u0<? extends Integer, ? extends Constraints>>> {
        final /* synthetic */ LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 $measuredLineProvider;
        final /* synthetic */ LazyGridSpanLayoutProvider $spanLayoutProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) {
            super(1);
            this.$spanLayoutProvider = lazyGridSpanLayoutProvider;
            this.$measuredLineProvider = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ ArrayList<u0<? extends Integer, ? extends Constraints>> invoke(Integer num) {
            return invoke(num.intValue());
        }

        @p4.l
        public final ArrayList<u0<Integer, Constraints>> invoke(int i5) {
            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.$spanLayoutProvider.getLineConfiguration(i5);
            int firstItemIndex = lineConfiguration.getFirstItemIndex();
            ArrayList<u0<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
            List<GridItemSpan> spans = lineConfiguration.getSpans();
            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = this.$measuredLineProvider;
            int size = spans.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                int m674getCurrentLineSpanimpl = GridItemSpan.m674getCurrentLineSpanimpl(spans.get(i7).m677unboximpl());
                arrayList.add(q1.a(Integer.valueOf(firstItemIndex), Constraints.m5988boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m696childConstraintsJhjzzOo$foundation_release(i6, m674getCurrentLineSpanimpl))));
                firstItemIndex++;
                i6 += m674getCurrentLineSpanimpl;
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placement", "Landroidx/compose/ui/layout/MeasureResult;", "invoke", "(IILv3/l;)Landroidx/compose/ui/layout/MeasureResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$3, reason: invalid class name */
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
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z4, PaddingValues paddingValues, boolean z5, a<? extends LazyGridItemProvider> aVar, LazyGridSlotsProvider lazyGridSlotsProvider, LazyGridState lazyGridState, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, s0 s0Var) {
        super(2);
        this.$isVertical = z4;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z5;
        this.$itemProviderLambda = aVar;
        this.$slots = lazyGridSlotsProvider;
        this.$state = lazyGridState;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$coroutineScope = s0Var;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m689invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6006unboximpl());
    }

    /* JADX WARN: Type inference failed for: r34v0, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
    @p4.l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridMeasureResult m689invoke0kLqBqw(@p4.l final LazyLayoutMeasureScope lazyLayoutMeasureScope, long j5) {
        Orientation orientation;
        int mo298roundToPx0680j_4;
        int mo298roundToPx0680j_42;
        int i5;
        int i6;
        float mo468getSpacingD9Ej5fM;
        int m6000getMaxWidthimpl;
        long IntOffset;
        int firstVisibleItemScrollOffset;
        int i7;
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
        int i8 = mo298roundToPx0680j_43 + mo298roundToPx0680j_44;
        int i9 = mo298roundToPx0680j_4 + mo298roundToPx0680j_42;
        boolean z4 = this.$isVertical;
        if (z4) {
            i5 = i8;
        } else {
            i5 = i9;
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
        final int i10 = i5 - i6;
        long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(j5, -i9, -i8);
        final LazyGridItemProvider invoke = this.$itemProviderLambda.invoke();
        final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
        final LazyGridSlots mo678invoke0kLqBqw = this.$slots.mo678invoke0kLqBqw(lazyLayoutMeasureScope, j5);
        int length = mo678invoke0kLqBqw.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope);
        this.$state.setSlotsPerLine$foundation_release(length);
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
                throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
            }
        }
        final int mo298roundToPx0680j_45 = lazyLayoutMeasureScope.mo298roundToPx0680j_4(mo468getSpacingD9Ej5fM);
        final int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m6000getMaxWidthimpl = Constraints.m5999getMaxHeightimpl(j5) - i8;
        } else {
            m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5) - i9;
        }
        int i11 = m6000getMaxWidthimpl;
        if (this.$reverseLayout && i11 <= 0) {
            boolean z5 = this.$isVertical;
            if (!z5) {
                mo298roundToPx0680j_4 += i11;
            }
            if (z5) {
                mo298roundToPx0680j_43 += i11;
            }
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_4, mo298roundToPx0680j_43);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mo298roundToPx0680j_4, mo298roundToPx0680j_43);
        }
        final long j6 = IntOffset;
        final LazyGridState lazyGridState = this.$state;
        final boolean z6 = this.$isVertical;
        final boolean z7 = this.$reverseLayout;
        final int i12 = i6;
        final ?? r34 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, mo298roundToPx0680j_45, lazyGridState, z6, z7, i12, i10, j6) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ LazyGridState $state;
            final /* synthetic */ LazyLayoutMeasureScope $this_null;
            final /* synthetic */ long $visualItemOffset;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$this_null = lazyLayoutMeasureScope;
                this.$state = lazyGridState;
                this.$isVertical = z6;
                this.$reverseLayout = z7;
                this.$beforeContentPadding = i12;
                this.$afterContentPadding = i10;
                this.$visualItemOffset = j6;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            @p4.l
            public LazyGridMeasuredItem createItem(int i13, @p4.l Object obj, @m Object obj2, int i14, int i15, @p4.l List<? extends Placeable> list) {
                return new LazyGridMeasuredItem(i13, obj, this.$isVertical, i14, i15, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, list, this.$visualItemOffset, obj2, this.$state.getPlacementAnimator$foundation_release(), null);
            }
        };
        final boolean z8 = this.$isVertical;
        ?? r9 = new LazyGridMeasuredLineProvider(z8, mo678invoke0kLqBqw, itemCount, mo298roundToPx0680j_45, r34, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ LazyGridSlots $resolvedSlots;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z8, mo678invoke0kLqBqw, itemCount, mo298roundToPx0680j_45, r34, spanLayoutProvider);
                this.$isVertical = z8;
                this.$resolvedSlots = mo678invoke0kLqBqw;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            @p4.l
            public LazyGridMeasuredLine createLine(int i13, @p4.l LazyGridMeasuredItem[] lazyGridMeasuredItemArr, @p4.l List<GridItemSpan> list, int i14) {
                return new LazyGridMeasuredLine(i13, lazyGridMeasuredItemArr, this.$resolvedSlots, list, this.$isVertical, i14);
            }
        };
        this.$state.setPrefetchInfoRetriever$foundation_release(new AnonymousClass1(spanLayoutProvider, r9));
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState2 = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState2.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState2.getFirstVisibleItemIndex());
                if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                    i7 = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                    firstVisibleItemScrollOffset = 0;
                    r2 r2Var = r2.f19517a;
                    createNonObservableSnapshot.dispose();
                    LazyGridMeasureResult m691measureLazyGridW2FL7xs = LazyGridMeasureKt.m691measureLazyGridW2FL7xs(itemCount, r9, r34, i11, i6, i10, mo298roundToPx0680j_45, i7, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m6016offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), this.$coroutineScope, this.$state.m698getPlacementScopeInvalidatorzYiylxw$foundation_release(), new AnonymousClass3(lazyLayoutMeasureScope, j5, i9, i8));
                    LazyGridState.applyMeasureResult$foundation_release$default(this.$state, m691measureLazyGridW2FL7xs, false, 2, null);
                    return m691measureLazyGridW2FL7xs;
                }
                int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
                i7 = lineIndexOfItem;
                r2 r2Var2 = r2.f19517a;
                createNonObservableSnapshot.dispose();
                LazyGridMeasureResult m691measureLazyGridW2FL7xs2 = LazyGridMeasureKt.m691measureLazyGridW2FL7xs(itemCount, r9, r34, i11, i6, i10, mo298roundToPx0680j_45, i7, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m6016offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), this.$coroutineScope, this.$state.m698getPlacementScopeInvalidatorzYiylxw$foundation_release(), new AnonymousClass3(lazyLayoutMeasureScope, j5, i9, i8));
                LazyGridState.applyMeasureResult$foundation_release$default(this.$state, m691measureLazyGridW2FL7xs2, false, 2, null);
                return m691measureLazyGridW2FL7xs2;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
