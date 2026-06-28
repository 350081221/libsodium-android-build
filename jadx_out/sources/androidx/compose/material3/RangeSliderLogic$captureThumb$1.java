package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1580}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RangeSliderLogic$captureThumb$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ boolean $draggingStart;
    final /* synthetic */ Interaction $interaction;
    int label;
    final /* synthetic */ RangeSliderLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z4, Interaction interaction, kotlin.coroutines.d<? super RangeSliderLogic$captureThumb$1> dVar) {
        super(2, dVar);
        this.this$0 = rangeSliderLogic;
        this.$draggingStart = z4;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new RangeSliderLogic$captureThumb$1(this.this$0, this.$draggingStart, this.$interaction, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((RangeSliderLogic$captureThumb$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            MutableInteractionSource activeInteraction = this.this$0.activeInteraction(this.$draggingStart);
            Interaction interaction = this.$interaction;
            this.label = 1;
            if (activeInteraction.emit(interaction, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
