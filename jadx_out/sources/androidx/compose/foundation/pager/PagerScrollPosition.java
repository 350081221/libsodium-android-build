package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b4\u00105J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\"\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010)\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "", "page", "", "pageOffsetFraction", "Lkotlin/r2;", "update", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measureResult", "updateFromMeasureResult", "index", "scrollOffsetFraction", "requestPosition", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "matchPageWithKey", "offsetFraction", "updateCurrentPageOffsetFraction", "currentScrollOffset", "delta", "applyScrollDelta", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "<set-?>", "currentPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentPage", "currentPageOffsetFraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getCurrentPageOffsetFraction", "()F", "setCurrentPageOffsetFraction", "(F)V", "currentPageOffsetFraction", "", "hadFirstNotEmptyLayout", "Z", "lastKnownCurrentPageKey", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "<init>", "(IFLandroidx/compose/foundation/pager/PagerState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,151:1\n75#2:152\n108#2,2:153\n76#3:155\n109#3,2:156\n147#4,4:158\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n40#1:152\n40#1:153,2\n43#1:155\n43#1:156,2\n124#1:158,4\n*E\n"})
/* loaded from: classes.dex */
public final class PagerScrollPosition {
    public static final int $stable = 8;

    @l
    private final MutableIntState currentPage$delegate;

    @l
    private final MutableFloatState currentPageOffsetFraction$delegate;
    private boolean hadFirstNotEmptyLayout;

    @m
    private Object lastKnownCurrentPageKey;

    @l
    private final LazyLayoutNearestRangeState nearestRangeState;

    @l
    private final PagerState state;

    public PagerScrollPosition(int i5, float f5, @l PagerState pagerState) {
        this.state = pagerState;
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(i5);
        this.currentPageOffsetFraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i5, 30, 100);
    }

    private final void setCurrentPage(int i5) {
        this.currentPage$delegate.setIntValue(i5);
    }

    private final void setCurrentPageOffsetFraction(float f5) {
        this.currentPageOffsetFraction$delegate.setFloatValue(f5);
    }

    private final void update(int i5, float f5) {
        boolean z4;
        setCurrentPage(i5);
        this.nearestRangeState.update(i5);
        if (Math.abs(f5) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f5 = 0.0f;
        }
        setCurrentPageOffsetFraction(f5);
    }

    public final void applyScrollDelta(int i5) {
        float pageSizeWithSpacing$foundation_release;
        if (this.state.getPageSizeWithSpacing$foundation_release() == 0) {
            pageSizeWithSpacing$foundation_release = 0.0f;
        } else {
            pageSizeWithSpacing$foundation_release = i5 / this.state.getPageSizeWithSpacing$foundation_release();
        }
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + pageSizeWithSpacing$foundation_release);
    }

    public final int currentScrollOffset() {
        int L0;
        L0 = d.L0((getCurrentPage() + getCurrentPageOffsetFraction()) * this.state.getPageSizeWithSpacing$foundation_release());
        return L0;
    }

    public final int getCurrentPage() {
        return this.currentPage$delegate.getIntValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction$delegate.getFloatValue();
    }

    @l
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    @l
    public final PagerState getState() {
        return this.state;
    }

    public final int matchPageWithKey(@l PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i5) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(pagerLazyLayoutItemProvider, this.lastKnownCurrentPageKey, i5);
        if (i5 != findIndexByKey) {
            setCurrentPage(findIndexByKey);
            this.nearestRangeState.update(i5);
        }
        return findIndexByKey;
    }

    public final void requestPosition(int i5, float f5) {
        update(i5, f5);
        this.lastKnownCurrentPageKey = null;
    }

    public final void updateCurrentPageOffsetFraction(float f5) {
        setCurrentPageOffsetFraction(f5);
    }

    public final void updateFromMeasureResult(@l PagerMeasureResult pagerMeasureResult) {
        Object obj;
        int i5;
        MeasuredPage currentPage = pagerMeasureResult.getCurrentPage();
        if (currentPage != null) {
            obj = currentPage.getKey();
        } else {
            obj = null;
        }
        this.lastKnownCurrentPageKey = obj;
        if (this.hadFirstNotEmptyLayout || (!pagerMeasureResult.getVisiblePagesInfo().isEmpty())) {
            this.hadFirstNotEmptyLayout = true;
            MeasuredPage currentPage2 = pagerMeasureResult.getCurrentPage();
            if (currentPage2 != null) {
                i5 = currentPage2.getIndex();
            } else {
                i5 = 0;
            }
            update(i5, pagerMeasureResult.getCurrentPageOffsetFraction());
        }
    }

    public /* synthetic */ PagerScrollPosition(int i5, float f5, PagerState pagerState, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5, (i6 & 2) != 0 ? 0.0f : f5, pagerState);
    }
}
