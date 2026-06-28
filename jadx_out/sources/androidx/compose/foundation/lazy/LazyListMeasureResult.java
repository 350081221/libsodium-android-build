package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
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
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010M\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0&\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u0006\u00101\u001a\u00020\u0007\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u0010:\u001a\u00020\u0005¢\u0006\u0004\bN\u0010OJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018R \u0010'\u001a\b\u0012\u0004\u0012\u00020\n0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u001a\u00101\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010\u0010\u001a\u0004\b;\u0010\u0012R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00050<8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010\u0012R\u0014\u0010D\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010\u0012R\u0011\u0010F\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bE\u0010\u0018R\u001a\u0010J\u001a\u00020G8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/r2;", "placeChildren", "", "delta", "", "updateAnimations", "tryToApplyScrollWithoutRemeasure", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItem", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItemScrollOffset", "I", "getFirstVisibleItemScrollOffset", "()I", "setFirstVisibleItemScrollOffset", "(I)V", "canScrollForward", "Z", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "", "consumedScroll", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "scrollBackAmount", "getScrollBackAmount", "remeasureNeeded", "getRemeasureNeeded", "", "visibleItemsInfo", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "viewportStartOffset", "getViewportStartOffset", "viewportEndOffset", "getViewportEndOffset", "totalItemsCount", "getTotalItemsCount", "reverseLayout", "getReverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "afterContentPadding", "getAfterContentPadding", "mainAxisItemSpacing", "getMainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "measureResult", "<init>", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n33#2,6:125\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n110#1:125,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;

    @m
    private final LazyListMeasuredItem firstVisibleItem;
    private int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;

    @l
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @l
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    public LazyListMeasureResult(@m LazyListMeasuredItem lazyListMeasuredItem, int i5, boolean z4, float f5, @l MeasureResult measureResult, float f6, boolean z5, @l List<LazyListMeasuredItem> list, int i6, int i7, int i8, boolean z6, @l Orientation orientation, int i9, int i10) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i5;
        this.canScrollForward = z4;
        this.consumedScroll = f5;
        this.scrollBackAmount = f6;
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

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @l
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @m
    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @l
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo660getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @l
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
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

    public final void setFirstVisibleItemScrollOffset(int i5) {
        this.firstVisibleItemScrollOffset = i5;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i5, boolean z4) {
        LazyListMeasuredItem lazyListMeasuredItem;
        boolean z5;
        Object y22;
        Object m32;
        boolean z6;
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || (lazyListMeasuredItem = this.firstVisibleItem) == null) {
            return false;
        }
        int sizeWithSpacings = lazyListMeasuredItem.getSizeWithSpacings();
        int i6 = this.firstVisibleItemScrollOffset - i5;
        if (i6 >= 0 && i6 < sizeWithSpacings) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        y22 = e0.y2(getVisibleItemsInfo());
        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) y22;
        m32 = e0.m3(getVisibleItemsInfo());
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) m32;
        if (lazyListMeasuredItem2.getNonScrollableItem() || lazyListMeasuredItem3.getNonScrollableItem()) {
            return false;
        }
        if (i5 >= 0 ? Math.min(getViewportStartOffset() - lazyListMeasuredItem2.getOffset(), getViewportEndOffset() - lazyListMeasuredItem3.getOffset()) > i5 : Math.min((lazyListMeasuredItem2.getOffset() + lazyListMeasuredItem2.getSizeWithSpacings()) - getViewportStartOffset(), (lazyListMeasuredItem3.getOffset() + lazyListMeasuredItem3.getSizeWithSpacings()) - getViewportEndOffset()) > (-i5)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        this.firstVisibleItemScrollOffset -= i5;
        List<LazyListMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        for (int i7 = 0; i7 < size; i7++) {
            visibleItemsInfo.get(i7).applyScrollDelta(i5, z4);
        }
        this.consumedScroll = i5;
        if (!this.canScrollForward && i5 > 0) {
            this.canScrollForward = true;
        }
        return true;
    }
}
