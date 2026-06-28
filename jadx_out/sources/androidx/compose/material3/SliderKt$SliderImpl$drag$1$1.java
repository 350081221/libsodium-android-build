package androidx.compose.material3;

import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$drag$1$1 extends kotlin.coroutines.jvm.internal.o implements v3.q<s0, Float, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ SliderState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(SliderState sliderState, kotlin.coroutines.d<? super SliderKt$SliderImpl$drag$1$1> dVar) {
        super(3, dVar);
        this.$state = sliderState;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Float f5, kotlin.coroutines.d<? super r2> dVar) {
        return invoke(s0Var, f5.floatValue(), dVar);
    }

    @p4.m
    public final Object invoke(@p4.l s0 s0Var, float f5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return new SliderKt$SliderImpl$drag$1$1(this.$state, dVar).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            this.$state.getGestureEndAction$material3_release().invoke();
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
