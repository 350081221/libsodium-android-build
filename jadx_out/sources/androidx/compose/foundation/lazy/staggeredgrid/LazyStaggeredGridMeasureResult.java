package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0085\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0005\u0012\u0006\u0010;\u001a\u00020\u0005¢\u0006\u0004\bM\u0010NJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010/\u001a\u00020.8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'R\u001a\u00105\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u001a\u00107\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u001a\u00109\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001a\u0010;\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00050B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010'R\u0014\u0010J\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010'R\u0011\u0010L\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bK\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/r2;", "placeChildren", "", "delta", "", "tryToApplyScrollWithoutRemeasure", "", "firstVisibleItemIndices", "[I", "getFirstVisibleItemIndices", "()[I", "firstVisibleItemScrollOffsets", "getFirstVisibleItemScrollOffsets", "", "consumedScroll", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "canScrollForward", "Z", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "isVertical", "remeasureNeeded", "getRemeasureNeeded", "totalItemsCount", "I", "getTotalItemsCount", "()I", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "visibleItemsInfo", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "J", "getViewportSize-YbymL2g", "()J", "viewportStartOffset", "getViewportStartOffset", "viewportEndOffset", "getViewportEndOffset", "beforeContentPadding", "getBeforeContentPadding", "afterContentPadding", "getAfterContentPadding", "mainAxisItemSpacing", "getMainAxisItemSpacing", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "<init>", "([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,249:1\n33#2,6:250\n33#2,6:256\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n181#1:250,6\n214#1:256,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;

    @l
    private final int[] firstVisibleItemIndices;

    @l
    private final int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;

    @l
    private final MeasureResult measureResult;

    @l
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;

    @l
    private final List<LazyStaggeredGridMeasuredItem> visibleItemsInfo;

    private LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f5, MeasureResult measureResult, boolean z4, boolean z5, boolean z6, int i5, List<LazyStaggeredGridMeasuredItem> list, long j5, int i6, int i7, int i8, int i9, int i10) {
        Orientation orientation;
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f5;
        this.measureResult = measureResult;
        this.canScrollForward = z4;
        this.isVertical = z5;
        this.remeasureNeeded = z6;
        this.totalItemsCount = i5;
        this.visibleItemsInfo = list;
        this.viewportSize = j5;
        this.viewportStartOffset = i6;
        this.viewportEndOffset = i7;
        this.beforeContentPadding = i8;
        this.afterContentPadding = i9;
        this.mainAxisItemSpacing = i10;
        if (z5) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        this.orientation = orientation;
    }

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f5, MeasureResult measureResult, boolean z4, boolean z5, boolean z6, int i5, List list, long j5, int i6, int i7, int i8, int i9, int i10, w wVar) {
        this(iArr, iArr2, f5, measureResult, z4, z5, z6, i5, list, j5, i6, i7, i8, i9, i10);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @l
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final boolean getCanScrollBackward() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @l
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    @l
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @l
    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @l
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo746getViewportSizeYbymL2g() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @l
    public List<LazyStaggeredGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    public final void setCanScrollForward(boolean z4) {
        this.canScrollForward = z4;
    }

    public final void setConsumedScroll(float f5) {
        this.consumedScroll = f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int r9) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult.tryToApplyScrollWithoutRemeasure(int):boolean");
    }
}
