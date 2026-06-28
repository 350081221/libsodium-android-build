package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016JA\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0002\b\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/DragScope;", "", "pixels", "Lkotlin/r2;", "dragBy", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "setScrollLogic", "(Landroidx/compose/foundation/gestures/ScrollingLogic;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "latestScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "getLatestScrollScope", "()Landroidx/compose/foundation/gestures/ScrollScope;", "setLatestScrollScope", "(Landroidx/compose/foundation/gestures/ScrollScope;)V", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollDraggableState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1021:1\n1#2:1022\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollDraggableState implements DraggableState, DragScope {

    @l
    private ScrollScope latestScrollScope;

    @l
    private ScrollingLogic scrollLogic;

    public ScrollDraggableState(@l ScrollingLogic scrollingLogic) {
        ScrollScope scrollScope;
        this.scrollLogic = scrollingLogic;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.latestScrollScope = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f5) {
        ScrollingLogic scrollingLogic = this.scrollLogic;
        scrollingLogic.m396performRawScrollMKHz9U(scrollingLogic.m402toOffsettuRUvjQ(f5));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @m
    public Object drag(@l MutatePriority mutatePriority, @l p<? super DragScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object scroll = this.scrollLogic.getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, pVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll == l5 ? scroll : r2.f19517a;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public void dragBy(float f5) {
        ScrollingLogic scrollingLogic = this.scrollLogic;
        scrollingLogic.m393dispatchScroll3eAAhYA(this.latestScrollScope, scrollingLogic.m402toOffsettuRUvjQ(f5), NestedScrollSource.Companion.m4766getDragWNlRxjI());
    }

    @l
    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    @l
    public final ScrollingLogic getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(@l ScrollScope scrollScope) {
        this.latestScrollScope = scrollScope;
    }

    public final void setScrollLogic(@l ScrollingLogic scrollingLogic) {
        this.scrollLogic = scrollingLogic;
    }
}
