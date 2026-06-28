package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.internal.StabilityInferred;
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
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J9\u0010\u0012\u001a\u00020\u00072'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "", "index", "getVisibleItemScrollOffset", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "Lkotlin/r2;", "snapToItem", "targetIndex", "targetItemOffset", "", "calculateDistanceTo", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "scroll", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getVisibleItemsAverageSize", "visibleItemsAverageSize", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,71:1\n116#2,2:72\n33#2,6:74\n118#2:80\n132#2,3:81\n33#2,4:84\n135#2,2:88\n38#2:90\n137#2:91\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n42#1:72,2\n42#1:74,6\n42#1:80\n67#1:81,3\n67#1:84,4\n67#1:88,2\n67#1:90\n67#1:91\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListAnimateScrollScope implements LazyLayoutAnimateScrollScope {
    public static final int $stable = 0;

    @l
    private final LazyListState state;

    public LazyListAnimateScrollScope(@l LazyListState lazyListState) {
        this.state = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public float calculateDistanceTo(int i5, int i6) {
        int visibleItemsAverageSize = getVisibleItemsAverageSize();
        int firstVisibleItemIndex = i5 - getFirstVisibleItemIndex();
        int min = Math.min(Math.abs(i6), visibleItemsAverageSize);
        if (i6 < 0) {
            min *= -1;
        }
        return ((visibleItemsAverageSize * firstVisibleItemIndex) + min) - getFirstVisibleItemScrollOffset();
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
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) s32;
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemScrollOffset(int i5) {
        LazyListItemInfo lazyListItemInfo;
        boolean z4;
        List<LazyListItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                lazyListItemInfo = visibleItemsInfo.get(i6);
                if (lazyListItemInfo.getIndex() == i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
                i6++;
            } else {
                lazyListItemInfo = null;
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
        if (lazyListItemInfo2 == null) {
            return 0;
        }
        return lazyListItemInfo2.getOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getVisibleItemsAverageSize() {
        LazyListLayoutInfo layoutInfo = this.state.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += visibleItemsInfo.get(i6).getSize();
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
        this.state.snapToItemIndexInternal$foundation_release(i5, i6);
    }
}
