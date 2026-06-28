package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bP\u0010QJ\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003J'\u0010\u000b\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u00020\u001f8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00101\u001a\u0002008\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#R\u0017\u00103\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/R\u0017\u00105\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R\u0017\u00107\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010&R\u0017\u00109\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010F\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010J\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\bK\u0010/R\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010F\u001a\u00020\u0003*\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "", "itemIndex", "", "isFullSpan", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getSpanRange-lOCCd4c", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", "getSpanRange", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "", "pinnedItems", "Ljava/util/List;", "getPinnedItems", "()Ljava/util/List;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "getItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getResolvedSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "J", "getConstraints-msEJaDk", "()J", "isVertical", "Z", "()Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "getMeasureScope", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "mainAxisAvailableSize", "I", "getMainAxisAvailableSize", "()I", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "getContentOffset-nOcc-ac", "beforeContentPadding", "getBeforeContentPadding", "afterContentPadding", "getAfterContentPadding", "reverseLayout", "getReverseLayout", "mainAxisSpacing", "getMainAxisSpacing", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlinx/coroutines/s0;", "getCoroutineScope", "()Lkotlinx/coroutines/s0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getMeasuredItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneCount", "getLaneCount", "isFullSpan-SZVOQXA", "(J)Z", "getLaneInfo-SZVOQXA", "(J)I", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILkotlinx/coroutines/s0;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1225:1\n236#1:1231\n953#2:1226\n952#2:1227\n951#2:1229\n953#2:1232\n952#2:1233\n951#2:1235\n62#3:1228\n55#3:1230\n62#3:1234\n55#3:1236\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n239#1:1231\n236#1:1226\n236#1:1227\n236#1:1229\n239#1:1232\n239#1:1233\n239#1:1235\n236#1:1228\n236#1:1230\n239#1:1234\n239#1:1236\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;

    @l
    private final s0 coroutineScope;
    private final boolean isVertical;

    @l
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;

    @l
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;

    @l
    private final LazyLayoutMeasureScope measureScope;

    @l
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;

    @l
    private final List<Integer> pinnedItems;

    @l
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;

    @l
    private final LazyStaggeredGridState state;

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j5, final boolean z4, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i5, long j6, int i6, int i7, boolean z5, int i8, s0 s0Var) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j5;
        this.isVertical = z4;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i5;
        this.contentOffset = j6;
        this.beforeContentPadding = i6;
        this.afterContentPadding = i7;
        this.reverseLayout = z5;
        this.mainAxisSpacing = i8;
        this.coroutineScope = s0Var;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z4, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            @l
            public LazyStaggeredGridMeasuredItem createItem(int i9, int i10, int i11, @l Object obj, @m Object obj2, @l List<? extends Placeable> list2) {
                return new LazyStaggeredGridMeasuredItem(i9, obj, list2, LazyStaggeredGridMeasureContext.this.isVertical(), LazyStaggeredGridMeasureContext.this.getMainAxisSpacing(), i10, i11, LazyStaggeredGridMeasureContext.this.getBeforeContentPadding(), LazyStaggeredGridMeasureContext.this.getAfterContentPadding(), obj2, LazyStaggeredGridMeasureContext.this.getState().getPlacementAnimator$foundation_release());
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo$foundation_release();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j5, boolean z4, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i5, long j6, int i6, int i7, boolean z5, int i8, s0 s0Var, w wVar) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j5, z4, lazyLayoutMeasureScope, i5, j6, i6, i7, z5, i8, s0Var);
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m747getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name */
    public final long m748getContentOffsetnOccac() {
        return this.contentOffset;
    }

    @l
    public final s0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @l
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    @l
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m749getLaneInfoSZVOQXA(long j5) {
        int i5 = (int) (4294967295L & j5);
        int i6 = (int) (j5 >> 32);
        if (i5 - i6 != 1) {
            return -2;
        }
        return i6;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @l
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @l
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    @l
    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    @l
    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m750getSpanRangelOCCd4c(@l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i5, int i6) {
        int i7;
        boolean isFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i5);
        if (isFullSpan) {
            i7 = this.laneCount;
        } else {
            i7 = 1;
        }
        if (isFullSpan) {
            i6 = 0;
        }
        return SpanRange.m763constructorimpl(i6, i7);
    }

    @l
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(@l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i5) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i5);
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m751isFullSpanSZVOQXA(long j5) {
        return ((int) (4294967295L & j5)) - ((int) (j5 >> 32)) != 1;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }
}
