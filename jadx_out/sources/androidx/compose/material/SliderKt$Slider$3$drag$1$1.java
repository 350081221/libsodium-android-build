package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.q;

@f(c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "", "velocity", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderKt$Slider$3$drag$1$1 extends o implements q<s0, Float, d<? super r2>, Object> {
    final /* synthetic */ State<l<Float, r2>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$drag$1$1(State<? extends l<? super Float, r2>> state, d<? super SliderKt$Slider$3$drag$1$1> dVar) {
        super(3, dVar);
        this.$gestureEndAction = state;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Float f5, d<? super r2> dVar) {
        return invoke(s0Var, f5.floatValue(), dVar);
    }

    @m
    public final Object invoke(@p4.l s0 s0Var, float f5, @m d<? super r2> dVar) {
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, dVar);
        sliderKt$Slider$3$drag$1$1.F$0 = f5;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            this.$gestureEndAction.getValue().invoke(b.e(this.F$0));
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
