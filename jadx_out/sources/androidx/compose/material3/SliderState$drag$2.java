package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", i = {}, l = {1820}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SliderState$drag$2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ v3.p<DragScope, kotlin.coroutines.d<? super r2>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ SliderState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderState$drag$2(SliderState sliderState, MutatePriority mutatePriority, v3.p<? super DragScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, kotlin.coroutines.d<? super SliderState$drag$2> dVar) {
        super(2, dVar);
        this.this$0 = sliderState;
        this.$dragPriority = mutatePriority;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new SliderState$drag$2(this.this$0, this.$dragPriority, this.$block, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((SliderState$drag$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        MutatorMutex mutatorMutex;
        DragScope dragScope;
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
            this.this$0.setDragging(true);
            mutatorMutex = this.this$0.scrollMutex;
            dragScope = this.this$0.dragScope;
            MutatePriority mutatePriority = this.$dragPriority;
            v3.p<DragScope, kotlin.coroutines.d<? super r2>, Object> pVar = this.$block;
            this.label = 1;
            if (mutatorMutex.mutateWith(dragScope, mutatePriority, pVar, this) == l5) {
                return l5;
            }
        }
        this.this$0.setDragging(false);
        return r2.f19517a;
    }
}
