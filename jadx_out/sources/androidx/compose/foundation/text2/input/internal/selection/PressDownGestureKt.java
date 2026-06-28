package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;", "onDown", "Lkotlin/Function0;", "Lkotlin/r2;", "onUp", "detectPressDownGesture", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PressDownGestureKt {
    @m
    public static final Object detectPressDownGesture(@l PointerInputScope pointerInputScope, @l TapOnPosition tapOnPosition, @m a<r2> aVar, @l d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new PressDownGestureKt$detectPressDownGesture$2(tapOnPosition, aVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }

    public static /* synthetic */ Object detectPressDownGesture$default(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, a aVar, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        return detectPressDownGesture(pointerInputScope, tapOnPosition, aVar, dVar);
    }
}
