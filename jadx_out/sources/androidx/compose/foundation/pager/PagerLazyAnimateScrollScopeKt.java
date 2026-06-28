package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import java.util.List;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"PagerLazyAnimateScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "state", "Landroidx/compose/foundation/pager/PagerState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerLazyAnimateScrollScopeKt {
    @l
    @ExperimentalFoundationApi
    public static final LazyLayoutAnimateScrollScope PagerLazyAnimateScrollScope(@l final PagerState pagerState) {
        return new LazyLayoutAnimateScrollScope() { // from class: androidx.compose.foundation.pager.PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public float calculateDistanceTo(int i5, int i6) {
                return ((i5 - PagerState.this.getCurrentPage()) * getVisibleItemsAverageSize()) + i6;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemIndex() {
                return PagerState.this.getFirstVisiblePage$foundation_release();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemScrollOffset() {
                return PagerState.this.getFirstVisiblePageOffset$foundation_release();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getItemCount() {
                return PagerState.this.getPageCount();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getLastVisibleItemIndex() {
                Object m32;
                m32 = e0.m3(PagerState.this.getLayoutInfo().getVisiblePagesInfo());
                return ((PageInfo) m32).getIndex();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getVisibleItemScrollOffset(int i5) {
                PageInfo pageInfo;
                boolean z4;
                List<PageInfo> visiblePagesInfo = PagerState.this.getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        pageInfo = visiblePagesInfo.get(i6);
                        if (pageInfo.getIndex() == i5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            break;
                        }
                        i6++;
                    } else {
                        pageInfo = null;
                        break;
                    }
                }
                PageInfo pageInfo2 = pageInfo;
                if (pageInfo2 == null) {
                    return 0;
                }
                return pageInfo2.getOffset();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getVisibleItemsAverageSize() {
                return PagerState.this.getPageSize$foundation_release() + PagerState.this.getPageSpacing$foundation_release();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            @m
            public Object scroll(@l p<? super ScrollScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar) {
                Object l5;
                Object scroll$default = ScrollableState.scroll$default(PagerState.this, null, pVar, dVar, 1, null);
                l5 = kotlin.coroutines.intrinsics.d.l();
                return scroll$default == l5 ? scroll$default : r2.f19517a;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public void snapToItem(@l ScrollScope scrollScope, int i5, int i6) {
                PagerState.this.snapToItem$foundation_release(i5, i6 / PagerState.this.getPageSizeWithSpacing$foundation_release());
            }
        };
    }
}
