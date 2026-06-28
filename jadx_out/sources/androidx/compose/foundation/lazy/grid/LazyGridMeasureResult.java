package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010K\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0007\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00106\u001a\u00020\u0005\u0012\u0006\u00108\u001a\u00020\u0005¢\u0006\u0004\bL\u0010MJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b*\u0010\u0011R\u001a\u0010+\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b.\u0010\u0011R\u001a\u0010/\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\u0017R\u001a\u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011R\u001a\u00108\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b9\u0010\u0011R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00050:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010\u0011R\u0014\u0010B\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010\u0011R\u0011\u0010D\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u001a\u0010H\u001a\u00020E8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/r2;", "placeChildren", "", "delta", "", "tryToApplyScrollWithoutRemeasure", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLine", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getFirstVisibleLine", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLineScrollOffset", "I", "getFirstVisibleLineScrollOffset", "()I", "setFirstVisibleLineScrollOffset", "(I)V", "canScrollForward", "Z", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "", "consumedScroll", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "remeasureNeeded", "getRemeasureNeeded", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "visibleItemsInfo", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "viewportStartOffset", "getViewportStartOffset", "viewportEndOffset", "getViewportEndOffset", "totalItemsCount", "getTotalItemsCount", "reverseLayout", "getReverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "afterContentPadding", "getAfterContentPadding", "mainAxisItemSpacing", "getMainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "measureResult", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n33#2,6:125\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n110#1:125,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;

    @m
    private final LazyGridMeasuredLine firstVisibleLine;
    private int firstVisibleLineScrollOffset;
    private final int mainAxisItemSpacing;

    @l
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @l
    private final List<LazyGridMeasuredItem> visibleItemsInfo;

    public LazyGridMeasureResult(@m LazyGridMeasuredLine lazyGridMeasuredLine, int i5, boolean z4, float f5, @l MeasureResult measureResult, boolean z5, @l List<LazyGridMeasuredItem> list, int i6, int i7, int i8, boolean z6, @l Orientation orientation, int i9, int i10) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i5;
        this.canScrollForward = z4;
        this.consumedScroll = f5;
        this.remeasureNeeded = z5;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i6;
        this.viewportEndOffset = i7;
        this.totalItemsCount = i8;
        this.reverseLayout = z6;
        this.orientation = orientation;
        this.afterContentPadding = i9;
        this.mainAxisItemSpacing = i10;
        this.$$delegate_0 = measureResult;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @l
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @m
    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @l
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo690getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @l
    public List<LazyGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.$$delegate_0.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.$$delegate_0.placeChildren();
    }

    public final void setCanScrollForward(boolean z4) {
        this.canScrollForward = z4;
    }

    public final void setConsumedScroll(float f5) {
        this.consumedScroll = f5;
    }

    public final void setFirstVisibleLineScrollOffset(int i5) {
        this.firstVisibleLineScrollOffset = i5;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i5) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        boolean z4;
        Object y22;
        Object m32;
        boolean z5;
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || (lazyGridMeasuredLine = this.firstVisibleLine) == null) {
            return false;
        }
        int mainAxisSizeWithSpacings = lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
        int i6 = this.firstVisibleLineScrollOffset - i5;
        if (i6 >= 0 && i6 < mainAxisSizeWithSpacings) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        y22 = e0.y2(getVisibleItemsInfo());
        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) y22;
        m32 = e0.m3(getVisibleItemsInfo());
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) m32;
        if (lazyGridMeasuredItem.getNonScrollableItem() || lazyGridMeasuredItem2.getNonScrollableItem()) {
            return false;
        }
        if (i5 >= 0 ? Math.min(getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()), getViewportEndOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation())) > i5 : Math.min((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()) + lazyGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation()) + lazyGridMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i5)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        this.firstVisibleLineScrollOffset -= i5;
        List<LazyGridMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        for (int i7 = 0; i7 < size; i7++) {
            visibleItemsInfo.get(i7).applyScrollDelta(i5);
        }
        this.consumedScroll = i5;
        if (!this.canScrollForward && i5 > 0) {
            this.canScrollForward = true;
        }
        return true;
    }
}
