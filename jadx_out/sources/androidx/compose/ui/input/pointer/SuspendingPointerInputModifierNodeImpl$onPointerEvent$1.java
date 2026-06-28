package androidx.compose.ui.input.pointer;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {TTAdConstant.STYLE_SIZE_RADIO_9_16}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends o implements p<s0, d<? super r2>, Object> {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, d<? super SuspendingPointerInputModifierNodeImpl$onPointerEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = suspendingPointerInputModifierNodeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
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
            p<PointerInputScope, d<? super r2>, Object> pointerInputHandler = this.this$0.getPointerInputHandler();
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.this$0;
            this.label = 1;
            if (pointerInputHandler.invoke(suspendingPointerInputModifierNodeImpl, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
