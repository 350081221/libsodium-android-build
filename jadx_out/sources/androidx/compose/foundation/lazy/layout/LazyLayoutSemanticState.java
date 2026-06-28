package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "", "Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo", "", "delta", "Lkotlin/r2;", "animateScrollBy", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "", "index", "scrollToItem", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "pseudoScrollOffset", "pseudoMaxScrollOffset", "getFirstVisibleItemScrollOffset", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "", "getCanScrollForward", "()Z", "canScrollForward", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface LazyLayoutSemanticState {
    @m
    Object animateScrollBy(float f5, @l d<? super r2> dVar);

    @l
    CollectionInfo collectionInfo();

    boolean getCanScrollForward();

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    default float pseudoMaxScrollOffset() {
        if (getCanScrollForward()) {
            return pseudoScrollOffset() + 100;
        }
        return pseudoScrollOffset();
    }

    default float pseudoScrollOffset() {
        return getFirstVisibleItemScrollOffset() + (getFirstVisibleItemIndex() * 500);
    }

    @m
    Object scrollToItem(int i5, @l d<? super r2> dVar);
}
