package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/TextDragObserver;", "observer", "Lkotlin/r2;", "detectDragGesturesAfterLongPressWithObserver", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/d;)Ljava/lang/Object;", "detectDownAndDragGesturesWithObserver", "detectPreDragGesturesWithObserver", "detectDragGesturesWithObserver", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {
    @m
    public static final Object detectDownAndDragGesturesWithObserver(@l PointerInputScope pointerInputScope, @l TextDragObserver textDragObserver, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(pointerInputScope, textDragObserver, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    @m
    public static final Object detectDragGesturesAfterLongPressWithObserver(@l PointerInputScope pointerInputScope, @l TextDragObserver textDragObserver, @l d<? super r2> dVar) {
        Object l5;
        Object detectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5(textDragObserver), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return detectDragGesturesAfterLongPress == l5 ? detectDragGesturesAfterLongPress : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, d<? super r2> dVar) {
        Object l5;
        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(textDragObserver), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return detectDragGestures == l5 ? detectDragGestures : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }
}
