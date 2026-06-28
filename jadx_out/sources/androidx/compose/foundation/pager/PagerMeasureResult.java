package androidx.compose.foundation.pager;

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
@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\n\u0012\b\u0010*\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0007\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u00020\u0007¢\u0006\u0004\bO\u0010PJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010 \u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012R\u0019\u0010&\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010*\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0010\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#\"\u0004\b9\u0010:R\u0017\u0010;\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b;\u0010!\u001a\u0004\b<\u0010#R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00050=8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010\u0012R\u0014\u0010E\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010\u0012R\u001a\u0010I\u001a\u00020F8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0012R\u0011\u0010M\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bL\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/r2;", "placeChildren", "", "delta", "", "tryToApplyScrollWithoutRemeasure", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "visiblePagesInfo", "Ljava/util/List;", "getVisiblePagesInfo", "()Ljava/util/List;", "pageSize", "I", "getPageSize", "()I", "pageSpacing", "getPageSpacing", "afterContentPadding", "getAfterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "viewportStartOffset", "getViewportStartOffset", "viewportEndOffset", "getViewportEndOffset", "reverseLayout", "Z", "getReverseLayout", "()Z", "beyondBoundsPageCount", "getBeyondBoundsPageCount", "firstVisiblePage", "Landroidx/compose/foundation/pager/MeasuredPage;", "getFirstVisiblePage", "()Landroidx/compose/foundation/pager/MeasuredPage;", "currentPage", "getCurrentPage", "", "currentPageOffsetFraction", "F", "getCurrentPageOffsetFraction", "()F", "setCurrentPageOffsetFraction", "(F)V", "firstVisiblePageScrollOffset", "getFirstVisiblePageScrollOffset", "setFirstVisiblePageScrollOffset", "(I)V", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "(Z)V", "remeasureNeeded", "getRemeasureNeeded", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "getCanScrollBackward", "canScrollBackward", "measureResult", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/ui/layout/MeasureResult;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,120:1\n33#2,6:121\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n107#1:121,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private final int beyondBoundsPageCount;
    private boolean canScrollForward;

    @m
    private final MeasuredPage currentPage;
    private float currentPageOffsetFraction;

    @m
    private final MeasuredPage firstVisiblePage;
    private int firstVisiblePageScrollOffset;

    @l
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @l
    private final List<MeasuredPage> visiblePagesInfo;

    public PagerMeasureResult(@l List<MeasuredPage> list, int i5, int i6, int i7, @l Orientation orientation, int i8, int i9, boolean z4, int i10, @m MeasuredPage measuredPage, @m MeasuredPage measuredPage2, float f5, int i11, boolean z5, @l MeasureResult measureResult, boolean z6) {
        this.visiblePagesInfo = list;
        this.pageSize = i5;
        this.pageSpacing = i6;
        this.afterContentPadding = i7;
        this.orientation = orientation;
        this.viewportStartOffset = i8;
        this.viewportEndOffset = i9;
        this.reverseLayout = z4;
        this.beyondBoundsPageCount = i10;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f5;
        this.firstVisiblePageScrollOffset = i11;
        this.canScrollForward = z5;
        this.remeasureNeeded = z6;
        this.$$delegate_0 = measureResult;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @l
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondBoundsPageCount() {
        return this.beyondBoundsPageCount;
    }

    public final boolean getCanScrollBackward() {
        MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage != null ? measuredPage.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @m
    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    @m
    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @l
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo783getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @l
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
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

    public final void setCurrentPageOffsetFraction(float f5) {
        this.currentPageOffsetFraction = f5;
    }

    public final void setFirstVisiblePageScrollOffset(int i5) {
        this.firstVisiblePageScrollOffset = i5;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int i5) {
        boolean z4;
        float f5;
        Object y22;
        Object m32;
        boolean z5;
        int pageSize = getPageSize() + getPageSpacing();
        if (this.remeasureNeeded || getVisiblePagesInfo().isEmpty() || this.firstVisiblePage == null) {
            return false;
        }
        int i6 = this.firstVisiblePageScrollOffset - i5;
        if (i6 >= 0 && i6 < pageSize) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (pageSize != 0) {
            f5 = i5 / pageSize;
        } else {
            f5 = 0.0f;
        }
        float f6 = this.currentPageOffsetFraction - f5;
        if (this.currentPage == null || f6 >= 0.5f || f6 <= -0.5f) {
            return false;
        }
        y22 = e0.y2(getVisiblePagesInfo());
        MeasuredPage measuredPage = (MeasuredPage) y22;
        m32 = e0.m3(getVisiblePagesInfo());
        MeasuredPage measuredPage2 = (MeasuredPage) m32;
        if (i5 >= 0 ? Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) > i5 : Math.min((measuredPage.getOffset() + pageSize) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSize) - getViewportEndOffset()) > (-i5)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        this.currentPageOffsetFraction -= f5;
        this.firstVisiblePageScrollOffset -= i5;
        List<MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
        int size = visiblePagesInfo.size();
        for (int i7 = 0; i7 < size; i7++) {
            visiblePagesInfo.get(i7).applyScrollDelta(i5);
        }
        if (!this.canScrollForward && i5 > 0) {
            this.canScrollForward = true;
        }
        return true;
    }
}
