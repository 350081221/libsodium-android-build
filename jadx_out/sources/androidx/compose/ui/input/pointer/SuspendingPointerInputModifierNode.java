package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R=\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0001\u0001\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Lkotlin/r2;", "resetPointerInputHandler", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "getPointerInputHandler", "()Lv3/p;", "setPointerInputHandler", "(Lv3/p;)V", "pointerInputHandler", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    @l
    p<PointerInputScope, d<? super r2>, Object> getPointerInputHandler();

    void resetPointerInputHandler();

    void setPointerInputHandler(@l p<? super PointerInputScope, ? super d<? super r2>, ? extends Object> pVar);
}
