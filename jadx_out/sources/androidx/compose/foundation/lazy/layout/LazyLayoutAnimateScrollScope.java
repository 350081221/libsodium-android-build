package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J9\u0010\u0011\u001a\u00020\u00072'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "", "", "index", "getVisibleItemScrollOffset", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "Lkotlin/r2;", "snapToItem", "targetIndex", "targetItemOffset", "", "calculateDistanceTo", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/u;", "block", "scroll", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getVisibleItemsAverageSize", "visibleItemsAverageSize", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutAnimateScrollScope {
    float calculateDistanceTo(int i5, int i6);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    int getVisibleItemScrollOffset(int i5);

    int getVisibleItemsAverageSize();

    @m
    Object scroll(@l p<? super ScrollScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar);

    void snapToItem(@l ScrollScope scrollScope, int i5, int i6);
}
