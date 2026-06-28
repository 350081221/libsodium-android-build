package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"LazyLayoutSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "isVertical", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    @l
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(@l final PagerState pagerState, final boolean z4) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @m
            public Object animateScrollBy(float f5, @l d<? super r2> dVar) {
                Object l5;
                Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(PagerState.this, f5, null, dVar, 2, null);
                l5 = kotlin.coroutines.intrinsics.d.l();
                return animateScrollBy$default == l5 ? animateScrollBy$default : r2.f19517a;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @l
            public CollectionInfo collectionInfo() {
                if (z4) {
                    return new CollectionInfo(PagerState.this.getPageCount(), 1);
                }
                return new CollectionInfo(1, PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public boolean getCanScrollForward() {
                return PagerState.this.getCanScrollForward();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getFirstVisibleItemIndex() {
                return PagerState.this.getFirstVisiblePage$foundation_release();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getFirstVisibleItemScrollOffset() {
                return PagerState.this.getFirstVisiblePageOffset$foundation_release();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @m
            public Object scrollToItem(int i5, @l d<? super r2> dVar) {
                Object l5;
                Object scrollToPage$default = PagerState.scrollToPage$default(PagerState.this, i5, 0.0f, dVar, 2, null);
                l5 = kotlin.coroutines.intrinsics.d.l();
                return scrollToPage$default == l5 ? scrollToPage$default : r2.f19517a;
            }
        };
    }
}
