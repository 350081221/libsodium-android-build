package org.burnoutcrew.reorderable;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.internal.StabilityInferred;
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
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A\u00126\u0010I\u001a2\u0012\u0013\u0012\u00110D¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110D¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(H\u0012\u0004\u0012\u00020\u00060C\u0012:\b\u0002\u0010L\u001a4\u0012\u0013\u0012\u00110D¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(J\u0012\u0013\u0012\u00110D¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u000b\u0018\u00010C\u0012:\b\u0002\u0010O\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u0006\u0018\u00010C\u0012\b\b\u0002\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J2\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0014R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010%\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0018\u0010'\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0018\u0010)\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0018\u0010+\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u0018\u0010-\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\"R\u0018\u0010/\u001a\u00020\u0003*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"R\u0018\u00103\u001a\u000200*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010<\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00108R\u0014\u0010>\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"Lorg/burnoutcrew/reorderable/j;", "Lorg/burnoutcrew/reorderable/l;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", "index", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "M", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "offsetX", "offsetY", "", "L", "(II)Z", "x", "y", "selected", "", "S", "draggedItemInfo", "items", "curX", "curY", "R", "Landroidx/compose/foundation/lazy/LazyListState;", bi.aL, "Landroidx/compose/foundation/lazy/LazyListState;", "Y", "()Landroidx/compose/foundation/lazy/LazyListState;", "listState", "I", "()Z", "isVerticalScroll", "X", "(Landroidx/compose/foundation/lazy/LazyListItemInfo;)I", "left", "a0", "top", "Z", "right", "T", "bottom", "b0", "width", "U", "height", "V", "itemIndex", "", "W", "(Landroidx/compose/foundation/lazy/LazyListItemInfo;)Ljava/lang/Object;", "itemKey", "G", "()Ljava/util/List;", "visibleItemsInfo", "F", "()I", "viewportStartOffset", "E", "viewportEndOffset", "firstVisibleItemIndex", bi.aK, "firstVisibleItemScrollOffset", "Lkotlinx/coroutines/s0;", "scope", "", "maxScrollPerFrame", "Lkotlin/Function2;", "Lorg/burnoutcrew/reorderable/d;", "Lkotlin/v0;", "name", "fromIndex", "toIndex", "onMove", "draggedOver", "dragging", "canDragOver", "startIndex", "endIndex", "onDragEnd", "Lorg/burnoutcrew/reorderable/b;", "dragCancelledAnimation", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/s0;FLv3/p;Lv3/p;Lv3/p;Lorg/burnoutcrew/reorderable/b;)V", "reorderable"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class j extends l<LazyListItemInfo> {

    /* renamed from: u, reason: collision with root package name */
    public static final int f21106u = 0;

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    private final LazyListState f21107t;

    public /* synthetic */ j(LazyListState lazyListState, s0 s0Var, float f5, p pVar, p pVar2, p pVar3, b bVar, int i5, w wVar) {
        this(lazyListState, s0Var, f5, pVar, (i5 & 16) != 0 ? null : pVar2, (i5 & 32) != 0 ? null : pVar3, (i5 & 64) != 0 ? new m(0.0f, 1, null) : bVar);
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int E() {
        return this.f21107t.getLayoutInfo().getViewportEndOffset();
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int F() {
        return this.f21107t.getLayoutInfo().getViewportStartOffset();
    }

    @Override // org.burnoutcrew.reorderable.l
    @p4.l
    protected List<LazyListItemInfo> G() {
        return this.f21107t.getLayoutInfo().getVisibleItemsInfo();
    }

    @Override // org.burnoutcrew.reorderable.l
    public boolean I() {
        return this.f21107t.getLayoutInfo().getOrientation() == Orientation.Vertical;
    }

    @Override // org.burnoutcrew.reorderable.l
    public boolean L(int i5, int i6) {
        if (I()) {
            return super.L(0, i6);
        }
        return super.L(i5, 0);
    }

    @Override // org.burnoutcrew.reorderable.l
    @p4.m
    protected Object M(int i5, int i6, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object scrollToItem = this.f21107t.scrollToItem(i5, i6, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scrollToItem == l5 ? scrollToItem : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    @p4.m
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public LazyListItemInfo j(@p4.m LazyListItemInfo lazyListItemInfo, @p4.l List<? extends LazyListItemInfo> items, int i5, int i6) {
        l0.p(items, "items");
        if (I()) {
            return (LazyListItemInfo) super.j(lazyListItemInfo, items, 0, i6);
        }
        return (LazyListItemInfo) super.j(lazyListItemInfo, items, i5, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    @p4.l
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<LazyListItemInfo> k(int i5, int i6, @p4.l LazyListItemInfo selected) {
        l0.p(selected, "selected");
        if (I()) {
            return super.k(0, i6, selected);
        }
        return super.k(i5, 0, selected);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public int l(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        if (!I()) {
            return 0;
        }
        if (this.f21107t.getLayoutInfo().getReverseLayout()) {
            return IntSize.m6213getHeightimpl(this.f21107t.getLayoutInfo().mo660getViewportSizeYbymL2g()) - lazyListItemInfo.getOffset();
        }
        return lazyListItemInfo.getSize() + lazyListItemInfo.getOffset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public int v(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        if (I()) {
            return lazyListItemInfo.getSize();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int x(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        return lazyListItemInfo.getIndex();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    @p4.l
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Object y(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        return lazyListItemInfo.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public int z(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        if (I()) {
            return 0;
        }
        if (this.f21107t.getLayoutInfo().getReverseLayout()) {
            return (IntSize.m6214getWidthimpl(this.f21107t.getLayoutInfo().mo660getViewportSizeYbymL2g()) - lazyListItemInfo.getOffset()) - lazyListItemInfo.getSize();
        }
        return lazyListItemInfo.getOffset();
    }

    @p4.l
    public final LazyListState Y() {
        return this.f21107t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public int A(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        if (I()) {
            return 0;
        }
        if (this.f21107t.getLayoutInfo().getReverseLayout()) {
            return IntSize.m6214getWidthimpl(this.f21107t.getLayoutInfo().mo660getViewportSizeYbymL2g()) - lazyListItemInfo.getOffset();
        }
        return lazyListItemInfo.getSize() + lazyListItemInfo.getOffset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public int D(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        if (!I()) {
            return 0;
        }
        if (this.f21107t.getLayoutInfo().getReverseLayout()) {
            return (IntSize.m6213getHeightimpl(this.f21107t.getLayoutInfo().mo660getViewportSizeYbymL2g()) - lazyListItemInfo.getOffset()) - lazyListItemInfo.getSize();
        }
        return lazyListItemInfo.getOffset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.burnoutcrew.reorderable.l
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int H(@p4.l LazyListItemInfo lazyListItemInfo) {
        l0.p(lazyListItemInfo, "<this>");
        if (I()) {
            return 0;
        }
        return lazyListItemInfo.getSize();
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int t() {
        return this.f21107t.getFirstVisibleItemIndex();
    }

    @Override // org.burnoutcrew.reorderable.l
    protected int u() {
        return this.f21107t.getFirstVisibleItemScrollOffset();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@p4.l LazyListState listState, @p4.l s0 scope, float f5, @p4.l p<? super d, ? super d, r2> onMove, @p4.m p<? super d, ? super d, Boolean> pVar, @p4.m p<? super Integer, ? super Integer, r2> pVar2, @p4.l b dragCancelledAnimation) {
        super(scope, f5, onMove, pVar, pVar2, dragCancelledAnimation);
        l0.p(listState, "listState");
        l0.p(scope, "scope");
        l0.p(onMove, "onMove");
        l0.p(dragCancelledAnimation, "dragCancelledAnimation");
        this.f21107t = listState;
    }
}
