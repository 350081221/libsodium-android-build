package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J9\u0010\u0017\u001a\u00020\f2'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012¢\u0006\u0002\b\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0014\u0010&\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001d¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "", "isVertical", "", "calculateLineAverageMainAxisSize", "index", "getVisibleItemScrollOffset", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "Lkotlin/r2;", "snapToItem", "targetIndex", "targetItemOffset", "", "calculateDistanceTo", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "scroll", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getVisibleItemsAverageSize", "visibleItemsAverageSize", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n116#2,2:122\n33#2,6:124\n118#2:130\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n45#1:122,2\n45#1:124,6\n45#1:130\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridAnimateScrollScope implements LazyLayoutAnimateScrollScope {
    public static final int $stable = 0;

    @l
    private final LazyGridState state;

    public LazyGridAnimateScrollScope(@l LazyGridState lazyGridState) {
        this.state = lazyGridState;
    }

    private final int calculateLineAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo, boolean z4) {
        int m6214getWidthimpl;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 = new LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1(z4, visibleItemsInfo);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < visibleItemsInfo.size()) {
            int intValue = lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke((LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1) Integer.valueOf(i5)).intValue();
            if (intValue == -1) {
                i5++;
            } else {
                int i8 = 0;
                while (i5 < visibleItemsInfo.size() && lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke((LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1) Integer.valueOf(i5)).intValue() == intValue) {
                    if (z4) {
                        m6214getWidthimpl = IntSize.m6213getHeightimpl(visibleItemsInfo.get(i5).mo688getSizeYbymL2g());
                    } else {
                        m6214getWidthimpl = IntSize.m6214getWidthimpl(visibleItemsInfo.get(i5).mo688getSizeYbymL2g());
                    }
                    i8 = Math.max(i8, m6214getWidthimpl);
                    i5++;
                }
                i6 += i8;
                i7++;
            }
        }
        return (i6 / i7) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public float calculateDistanceTo(int i5, int i6) {
        boolean z4;
        int slotsPerLine$foundation_release = this.state.getSlotsPerLine$foundation_release();
        int visibleItemsAverageSize = getVisibleItemsAverageSize();
        int i7 = 1;
        if (i5 < getFirstVisibleItemIndex()) {
            z4 = true;
        } else {
            z4 = false;
        }
        int firstVisibleItemIndex = i5 - getFirstVisibleItemIndex();
        int i8 = slotsPerLine$foundation_release - 1;
        if (z4) {
            i7 = -1;
        }
        int i9 = (firstVisibleItemIndex + (i8 * i7)) / slotsPerLine$foundation_release;
        int min = Math.min(Math.abs(i6), visibleItemsAverageSize);
        if (i6 < 0) {
            min *= -1;
        }
        return ((visibleItemsAverageSize * i9) + min) - getFirstVisibleItemScrollOffset();
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
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) s32;
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemScrollOffset(int i5) {
        LazyGridItemInfo lazyGridItemInfo;
        int m6172getXimpl;
        boolean z4;
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                lazyGridItemInfo = visibleItemsInfo.get(i6);
                if (lazyGridItemInfo.getIndex() == i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
                i6++;
            } else {
                lazyGridItemInfo = null;
                break;
            }
        }
        LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 == null) {
            return 0;
        }
        if (this.state.isVertical$foundation_release()) {
            m6172getXimpl = IntOffset.m6173getYimpl(lazyGridItemInfo2.mo687getOffsetnOccac());
        } else {
            m6172getXimpl = IntOffset.m6172getXimpl(lazyGridItemInfo2.mo687getOffsetnOccac());
        }
        return m6172getXimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemsAverageSize() {
        return calculateLineAverageMainAxisSize(this.state.getLayoutInfo(), this.state.isVertical$foundation_release());
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
        this.state.snapToItemIndexInternal$foundation_release(i5, i6);
    }
}
