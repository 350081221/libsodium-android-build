package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/r2;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends n0 implements l<MotionEvent, r2> {
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l MotionEvent motionEvent) {
        this.this$0.getOnTouchEvent().invoke(motionEvent);
    }
}
