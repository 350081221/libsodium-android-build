package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&R\u0014\u0010\u0010\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableState;", "", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "Lkotlin/u;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "", "isScrollInProgress", "()Z", "getCanScrollForward", "canScrollForward", "getCanScrollBackward", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ScrollableState {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(@l ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollBackward();
        }

        @Deprecated
        public static boolean getCanScrollForward(@l ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollForward();
        }
    }

    static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, p pVar, d dVar, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollableState.scroll(mutatePriority, pVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    float dispatchRawDelta(float f5);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    boolean isScrollInProgress();

    @m
    Object scroll(@l MutatePriority mutatePriority, @l p<? super ScrollScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar);
}
