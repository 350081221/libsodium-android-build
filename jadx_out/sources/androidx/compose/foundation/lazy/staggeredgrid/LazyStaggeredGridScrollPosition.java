package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import com.umeng.analytics.pro.bi;
import java.util.Arrays;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0002\u00126\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00020\u0019¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016RD\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010\u000f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R+\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u0016\u00103\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "indices", "", "calculateFirstVisibleIndex", "offsets", "calculateFirstVisibleScrollOffset", "Lkotlin/r2;", "update", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "updateFromMeasureResult", "scrollOffsets", "updateScrollOffset", "index", "scrollOffset", "requestPosition", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", bi.ay, "b", "", "equivalent", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "targetIndex", "laneCount", "fillIndices", "Lv3/p;", "<set-?>", "indices$delegate", "Landroidx/compose/runtime/MutableState;", "getIndices", "()[I", "setIndices", "([I)V", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "(I)V", "scrollOffsets$delegate", "getScrollOffsets", "setScrollOffsets", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "hadFirstNotEmptyLayout", "Z", "", "lastKnownFirstItemKey", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "initialIndices", "initialOffsets", "<init>", "([I[ILv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,178:1\n81#2:179\n107#2,2:180\n81#2:185\n107#2,2:186\n75#3:182\n108#3,2:183\n75#3:188\n108#3,2:189\n13600#4,2:191\n116#5,2:193\n33#5,6:195\n118#5:201\n495#6,4:202\n500#6:211\n129#7,5:206\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:179\n37#1:180,2\n41#1:185\n41#1:186,2\n39#1:182\n39#1:183,2\n43#1:188\n43#1:189,2\n50#1:191,2\n88#1:193,2\n88#1:195,6\n88#1:201\n96#1:202,4\n96#1:211\n96#1:206,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition implements SnapshotMutationPolicy<int[]> {
    public static final int $stable = 8;

    @l
    private final p<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;

    @l
    private final MutableIntState index$delegate;

    @l
    private final MutableState indices$delegate;

    @m
    private Object lastKnownFirstItemKey;

    @l
    private final LazyLayoutNearestRangeState nearestRangeState;

    @l
    private final MutableIntState scrollOffset$delegate;

    @l
    private final MutableState scrollOffsets$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(@l int[] iArr, @l int[] iArr2, @l p<? super Integer, ? super Integer, int[]> pVar) {
        Integer mn;
        int i5;
        this.fillIndices = pVar;
        this.indices$delegate = SnapshotStateKt.mutableStateOf(iArr, this);
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets$delegate = SnapshotStateKt.mutableStateOf(iArr2, this);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        mn = kotlin.collections.p.mn(iArr);
        if (mn != null) {
            i5 = mn.intValue();
        } else {
            i5 = 0;
        }
        this.nearestRangeState = new LazyLayoutNearestRangeState(i5, 90, 200);
    }

    private final int calculateFirstVisibleIndex(int[] iArr) {
        int i5 = Integer.MAX_VALUE;
        for (int i6 : iArr) {
            if (i6 <= 0) {
                return 0;
            }
            if (i5 > i6) {
                i5 = i6;
            }
        }
        if (i5 == Integer.MAX_VALUE) {
            return 0;
        }
        return i5;
    }

    private final int calculateFirstVisibleScrollOffset(int[] iArr, int[] iArr2) {
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(iArr);
        int length = iArr2.length;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < length; i6++) {
            if (iArr[i6] == calculateFirstVisibleIndex) {
                i5 = Math.min(i5, iArr2[i6]);
            }
        }
        if (i5 == Integer.MAX_VALUE) {
            return 0;
        }
        return i5;
    }

    private final void setIndex(int i5) {
        this.index$delegate.setIntValue(i5);
    }

    private final void setIndices(int[] iArr) {
        this.indices$delegate.setValue(iArr);
    }

    private final void setScrollOffset(int i5) {
        this.scrollOffset$delegate.setIntValue(i5);
    }

    private final void setScrollOffsets(int[] iArr) {
        this.scrollOffsets$delegate.setValue(iArr);
    }

    private final void update(int[] iArr, int[] iArr2) {
        setIndices(iArr);
        setIndex(calculateFirstVisibleIndex(iArr));
        setScrollOffsets(iArr2);
        setScrollOffset(calculateFirstVisibleScrollOffset(iArr, iArr2));
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final int[] getIndices() {
        return (int[]) this.indices$delegate.getValue();
    }

    @l
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final int[] getScrollOffsets() {
        return (int[]) this.scrollOffsets$delegate.getValue();
    }

    public final void requestPosition(int i5, int i6) {
        int[] invoke = this.fillIndices.invoke(Integer.valueOf(i5), Integer.valueOf(getIndices().length));
        int length = invoke.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = i6;
        }
        update(invoke, iArr);
        this.nearestRangeState.update(i5);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(@l LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        Object obj;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem;
        boolean z4;
        int calculateFirstVisibleIndex = calculateFirstVisibleIndex(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices());
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = lazyStaggeredGridMeasureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 < size) {
                lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i5);
                if (lazyStaggeredGridMeasuredItem.getIndex() == calculateFirstVisibleIndex) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                } else {
                    i5++;
                }
            } else {
                lazyStaggeredGridMeasuredItem = null;
                break;
            }
        }
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasuredItem;
        if (lazyStaggeredGridMeasuredItem2 != null) {
            obj = lazyStaggeredGridMeasuredItem2.getKey();
        }
        this.lastKnownFirstItemKey = obj;
        this.nearestRangeState.update(calculateFirstVisibleIndex);
        if (this.hadFirstNotEmptyLayout || lazyStaggeredGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    update(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
                    r2 r2Var = r2.f19517a;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    public final void updateScrollOffset(@l int[] iArr) {
        setScrollOffsets(iArr);
        setScrollOffset(calculateFirstVisibleScrollOffset(getIndices(), iArr));
    }

    @l
    @ExperimentalFoundationApi
    public final int[] updateScrollPositionIfTheFirstItemWasMoved(@l LazyLayoutItemProvider lazyLayoutItemProvider, @l int[] iArr) {
        Integer Ne;
        boolean q8;
        Object obj = this.lastKnownFirstItemKey;
        int i5 = 0;
        Ne = kotlin.collections.p.Ne(iArr, 0);
        if (Ne != null) {
            i5 = Ne.intValue();
        }
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, obj, i5);
        q8 = kotlin.collections.p.q8(iArr, findIndexByKey);
        if (!q8) {
            this.nearestRangeState.update(findIndexByKey);
            int[] invoke = this.fillIndices.invoke(Integer.valueOf(findIndexByKey), Integer.valueOf(iArr.length));
            setIndices(invoke);
            setIndex(calculateFirstVisibleIndex(invoke));
            return invoke;
        }
        return iArr;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(@l int[] iArr, @l int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }
}
