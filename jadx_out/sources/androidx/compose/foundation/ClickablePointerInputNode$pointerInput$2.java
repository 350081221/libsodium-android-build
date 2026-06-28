package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", i = {}, l = {984}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickablePointerInputNode$pointerInput$2 extends kotlin.coroutines.jvm.internal.o implements v3.q<PressGestureScope, Offset, kotlin.coroutines.d<? super r2>, Object> {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickablePointerInputNode$pointerInput$2(ClickablePointerInputNode clickablePointerInputNode, kotlin.coroutines.d<? super ClickablePointerInputNode$pointerInput$2> dVar) {
        super(3, dVar);
        this.this$0 = clickablePointerInputNode;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, kotlin.coroutines.d<? super r2> dVar) {
        return m245invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
    }

    @p4.m
    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m245invoked4ec7I(@p4.l PressGestureScope pressGestureScope, long j5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        ClickablePointerInputNode$pointerInput$2 clickablePointerInputNode$pointerInput$2 = new ClickablePointerInputNode$pointerInput$2(this.this$0, dVar);
        clickablePointerInputNode$pointerInput$2.L$0 = pressGestureScope;
        clickablePointerInputNode$pointerInput$2.J$0 = j5;
        return clickablePointerInputNode$pointerInput$2.invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
            long j5 = this.J$0;
            if (this.this$0.getEnabled()) {
                ClickablePointerInputNode clickablePointerInputNode = this.this$0;
                this.label = 1;
                if (clickablePointerInputNode.m175handlePressInteractiond4ec7I(pressGestureScope, j5, this) == l5) {
                    return l5;
                }
            }
        }
        return r2.f19517a;
    }
}
