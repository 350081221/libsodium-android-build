package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {301, 304}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableKt$handlePressInteraction$2$delayJob$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ v3.a<Boolean> $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(v3.a<Boolean> aVar, long j5, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, kotlin.coroutines.d<? super ClickableKt$handlePressInteraction$2$delayJob$1> dVar) {
        super(2, dVar);
        this.$delayPressInteraction = aVar;
        this.$pressPoint = j5;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        PressInteraction.Press press;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    press = (PressInteraction.Press) this.L$0;
                    e1.n(obj);
                    this.$interactionData.setPressInteraction(press);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            if (this.$delayPressInteraction.invoke().booleanValue()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
                if (d1.b(tapIndicationDelay, this) == l5) {
                    return l5;
                }
            }
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.$pressPoint, null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press2;
        this.label = 2;
        if (mutableInteractionSource.emit(press2, this) == l5) {
            return l5;
        }
        press = press2;
        this.$interactionData.setPressInteraction(press);
        return r2.f19517a;
    }
}
