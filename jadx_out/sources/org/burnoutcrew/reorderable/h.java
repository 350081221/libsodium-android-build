package org.burnoutcrew.reorderable;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.s0;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u00126\u0010<\u001a2\u0012\u0013\u0012\u001107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0013\u0012\u001107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u000606\u0012:\b\u0002\u0010?\u001a4\u0012\u0013\u0012\u001107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(=\u0012\u0013\u0012\u001107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u000f\u0018\u000106\u0012:\b\u0002\u0010B\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u0006\u0018\u000106\u0012\b\b\u0002\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0019\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\u001b\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u001d\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u001f\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010!\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0018\u0010%\u001a\u00020\"*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010+R\u0014\u00101\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lorg/burnoutcrew/reorderable/h;", "Lorg/burnoutcrew/reorderable/l;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "", "index", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "M", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", bi.aL, "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "S", "()Landroidx/compose/foundation/lazy/grid/LazyGridState;", "gridState", "", "I", "()Z", "isVerticalScroll", "W", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;)I", "left", "X", "right", "Y", "top", "R", "bottom", "Z", "width", "T", "height", "U", "itemIndex", "", "V", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;)Ljava/lang/Object;", "itemKey", "", "G", "()Ljava/util/List;", "visibleItemsInfo", "F", "()I", "viewportStartOffset", "E", "viewportEndOffset", "firstVisibleItemIndex", bi.aK, "firstVisibleItemScrollOffset", "Lkotlinx/coroutines/s0;", "scope", "", "maxScrollPerFrame", "Lkotlin/Function2;", "Lorg/burnoutcrew/reorderable/d;", "Lkotlin/v0;", "name", "fromIndex", "toIndex", "onMove", "draggedOver", "dragging", "canDragOver", "startIndex", "endIndex", "onDragEnd", "Lorg/burnoutcrew/reorderable/b;", "dragCancelledAnimation", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlinx/coroutines/s0;FLv3/p;Lv3/p;Lv3/p;Lorg/burnoutcrew/reorderable/b;)V", "reorderable"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class h extends l<LazyGridItemInfo> {

    /* renamed from: u, reason: collision with root package name */
    public static final int f21103u = 0;

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    private final LazyGridState f21104t;

    public /* synthetic */ h(LazyGridState lazyGridState, s0 s0Var, float f5, p pVar, p pVar2, p pVar3, b bVar, int i5, w wVar) {
        this(lazyGridState, s0Var, f5, pVar, (i5 & 16) != 0 ? null : pVar2, (i5 & 32) != 0 ? null : pVar3, (i5 & 64) != 0 ? new m(0.0f, 1, null) : bVar);
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int E() {
        return this.f21104t.getLayoutInfo().getViewportEndOffset();
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int F() {
        return this.f21104t.getLayoutInfo().getViewportStartOffset();
    }

    @Override // org.burnoutcrew.reorderable.l
    @p4.l
    protected List<LazyGridItemInfo> G() {
        return this.f21104t.getLayoutInfo().getVisibleItemsInfo();
    }

    @Override // org.burnoutcrew.reorderable.l
    public boolean I() {
        return this.f21104t.getLayoutInfo().getOrientation() == Orientation.Vertical;
    }

    @Override // org.burnoutcrew.reorderable.l
    @p4.m
    protected Object M(int i5, int i6, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object scrollToItem = this.f21104t.scrollToItem(i5, i6, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scrollToItem == l5 ? scrollToItem : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public int l(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return IntOffset.m6173getYimpl(lazyGridItemInfo.mo687getOffsetnOccac()) + IntSize.m6213getHeightimpl(lazyGridItemInfo.mo688getSizeYbymL2g());
    }

    @p4.l
    public final LazyGridState S() {
        return this.f21104t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public int v(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return IntSize.m6213getHeightimpl(lazyGridItemInfo.mo688getSizeYbymL2g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public int x(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return lazyGridItemInfo.getIndex();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    @p4.l
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Object y(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return lazyGridItemInfo.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public int z(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return IntOffset.m6172getXimpl(lazyGridItemInfo.mo687getOffsetnOccac());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public int A(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return IntOffset.m6172getXimpl(lazyGridItemInfo.mo687getOffsetnOccac()) + IntSize.m6214getWidthimpl(lazyGridItemInfo.mo688getSizeYbymL2g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public int D(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return IntOffset.m6173getYimpl(lazyGridItemInfo.mo687getOffsetnOccac());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public int H(@p4.l LazyGridItemInfo lazyGridItemInfo) {
        l0.p(lazyGridItemInfo, "<this>");
        return IntSize.m6214getWidthimpl(lazyGridItemInfo.mo688getSizeYbymL2g());
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int t() {
        return this.f21104t.getFirstVisibleItemIndex();
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int u() {
        return this.f21104t.getFirstVisibleItemScrollOffset();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@p4.l LazyGridState gridState, @p4.l s0 scope, float f5, @p4.l p<? super d, ? super d, r2> onMove, @p4.m p<? super d, ? super d, Boolean> pVar, @p4.m p<? super Integer, ? super Integer, r2> pVar2, @p4.l b dragCancelledAnimation) {
        super(scope, f5, onMove, pVar, pVar2, dragCancelledAnimation);
        l0.p(gridState, "gridState");
        l0.p(scope, "scope");
        l0.p(onMove, "onMove");
        l0.p(dragCancelledAnimation, "dragCancelledAnimation");
        this.f21104t = gridState;
    }
}
