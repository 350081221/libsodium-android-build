package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J9\u0010\u0012\u001a\u00020\u00072'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "", "index", "getVisibleItemScrollOffset", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "Lkotlin/r2;", "snapToItem", "targetIndex", "targetItemOffset", "", "calculateDistanceTo", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "scroll", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getVisibleItemsAverageSize", "visibleItemsAverageSize", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,77:1\n132#2,3:78\n33#2,4:81\n135#2,2:85\n38#2:87\n137#2:88\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n71#1:78,3\n71#1:81,4\n71#1:85,2\n71#1:87\n71#1:88\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridAnimateScrollScope implements LazyLayoutAnimateScrollScope {
    public static final int $stable = 8;

    @l
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridAnimateScrollScope(@l LazyStaggeredGridState lazyStaggeredGridState) {
        this.state = lazyStaggeredGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public float calculateDistanceTo(int i5, int i6) {
        int visibleItemsAverageSize = getVisibleItemsAverageSize();
        int laneCount$foundation_release = (i5 / this.state.getLaneCount$foundation_release()) - (getFirstVisibleItemIndex() / this.state.getLaneCount$foundation_release());
        int min = Math.min(Math.abs(i6), visibleItemsAverageSize);
        if (i6 < 0) {
            min *= -1;
        }
        return ((visibleItemsAverageSize * laneCount$foundation_release) + min) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getLastVisibleItemIndex() {
        Object s32;
        s32 = e0.s3(this.state.getLayoutInfo().getVisibleItemsInfo());
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) s32;
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemScrollOffset(int i5) {
        int w4;
        w4 = w.w(this.state.getLayoutInfo().getVisibleItemsInfo(), 0, 0, new LazyStaggeredGridAnimateScrollScope$getVisibleItemScrollOffset$searchedIndex$1(i5), 3, null);
        long mo743getOffsetnOccac = this.state.getLayoutInfo().getVisibleItemsInfo().get(w4).mo743getOffsetnOccac();
        if (this.state.isVertical$foundation_release()) {
            return IntOffset.m6173getYimpl(mo743getOffsetnOccac);
        }
        return IntOffset.m6172getXimpl(mo743getOffsetnOccac);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemsAverageSize() {
        int m6214getWidthimpl;
        LazyStaggeredGridLayoutInfo layoutInfo = this.state.getLayoutInfo();
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i6);
            if (this.state.isVertical$foundation_release()) {
                m6214getWidthimpl = IntSize.m6213getHeightimpl(lazyStaggeredGridItemInfo.mo744getSizeYbymL2g());
            } else {
                m6214getWidthimpl = IntSize.m6214getWidthimpl(lazyStaggeredGridItemInfo.mo744getSizeYbymL2g());
            }
            i5 += m6214getWidthimpl;
        }
        return (i5 / visibleItemsInfo.size()) + layoutInfo.getMainAxisItemSpacing();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    @m
    public Object scroll(@l p<? super ScrollScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object scroll$default = ScrollableState.scroll$default(this.state, null, pVar, dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll$default == l5 ? scroll$default : r2.f19517a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public void snapToItem(@l ScrollScope scrollScope, int i5, int i6) {
        this.state.snapToItemInternal$foundation_release(scrollScope, i5, i6);
    }
}
