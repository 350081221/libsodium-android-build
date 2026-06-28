package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DState;", "", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/Drag2DScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "Lkotlin/u;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "delta", "dispatchRawDelta-k-4lQ0M", "(J)V", "dispatchRawDelta", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface Draggable2DState {
    static /* synthetic */ Object drag$default(Draggable2DState draggable2DState, MutatePriority mutatePriority, p pVar, d dVar, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return draggable2DState.drag(mutatePriority, pVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
    }

    /* renamed from: dispatchRawDelta-k-4lQ0M */
    void mo318dispatchRawDeltak4lQ0M(long j5);

    @m
    Object drag(@l MutatePriority mutatePriority, @l p<? super Drag2DScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar);
}
