package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "", "index", "scrollOffset", "Lkotlin/r2;", "update", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureResult", "updateFromMeasureResult", "updateScrollOffset", "requestPosition", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "(I)V", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n75#2:129\n108#2,2:130\n75#2:132\n108#2,2:133\n1#3:135\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:129\n34#1:130,2\n36#1:132\n36#1:133,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;

    @l
    private final MutableIntState index$delegate;

    @m
    private Object lastKnownFirstItemKey;

    @l
    private final LazyLayoutNearestRangeState nearestRangeState;

    @l
    private final MutableIntState scrollOffset$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LazyListScrollPosition() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListScrollPosition.<init>():void");
    }

    public LazyListScrollPosition(int i5, int i6) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i5);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i6);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i5, 30, 100);
    }

    private final void setScrollOffset(int i5) {
        this.scrollOffset$delegate.setIntValue(i5);
    }

    private final void update(int i5, int i6) {
        boolean z4;
        if (i5 >= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setIndex(i5);
            this.nearestRangeState.update(i5);
            setScrollOffset(i6);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i5 + ')').toString());
        }
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    @l
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final void requestPosition(int i5, int i6) {
        update(i5, i6);
        this.lastKnownFirstItemKey = null;
    }

    public final void setIndex(int i5) {
        this.index$delegate.setIntValue(i5);
    }

    public final void updateFromMeasureResult(@l LazyListMeasureResult lazyListMeasureResult) {
        Object obj;
        LazyListMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        if (firstVisibleItem != null) {
            obj = firstVisibleItem.getKey();
        } else {
            obj = null;
        }
        this.lastKnownFirstItemKey = obj;
        if (this.hadFirstNotEmptyLayout || lazyListMeasureResult.getTotalItemsCount() > 0) {
            boolean z4 = true;
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = lazyListMeasureResult.getFirstVisibleItemScrollOffset();
            int i5 = 0;
            if (firstVisibleItemScrollOffset < 0.0f) {
                z4 = false;
            }
            if (z4) {
                LazyListMeasuredItem firstVisibleItem2 = lazyListMeasureResult.getFirstVisibleItem();
                if (firstVisibleItem2 != null) {
                    i5 = firstVisibleItem2.getIndex();
                }
                update(i5, firstVisibleItemScrollOffset);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
        }
    }

    public final void updateScrollOffset(int i5) {
        boolean z4;
        if (i5 >= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setScrollOffset(i5);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i5 + ')').toString());
    }

    @ExperimentalFoundationApi
    public final int updateScrollPositionIfTheFirstItemWasMoved(@l LazyListItemProvider lazyListItemProvider, int i5) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, this.lastKnownFirstItemKey, i5);
        if (i5 != findIndexByKey) {
            setIndex(findIndexByKey);
            this.nearestRangeState.update(i5);
        }
        return findIndexByKey;
    }

    public /* synthetic */ LazyListScrollPosition(int i5, int i6, int i7, w wVar) {
        this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6);
    }
}
