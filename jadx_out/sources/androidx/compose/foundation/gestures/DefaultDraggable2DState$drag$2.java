package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
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

@f(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DefaultDraggable2DState$drag$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ p<Drag2DScope, d<? super r2>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ DefaultDraggable2DState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggable2DState$drag$2(DefaultDraggable2DState defaultDraggable2DState, MutatePriority mutatePriority, p<? super Drag2DScope, ? super d<? super r2>, ? extends Object> pVar, d<? super DefaultDraggable2DState$drag$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultDraggable2DState;
        this.$dragPriority = mutatePriority;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new DefaultDraggable2DState$drag$2(this.this$0, this.$dragPriority, this.$block, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((DefaultDraggable2DState$drag$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        MutatorMutex mutatorMutex;
        Drag2DScope drag2DScope;
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
            mutatorMutex = this.this$0.drag2DMutex;
            drag2DScope = this.this$0.drag2DScope;
            MutatePriority mutatePriority = this.$dragPriority;
            p<Drag2DScope, d<? super r2>, Object> pVar = this.$block;
            this.label = 1;
            if (mutatorMutex.mutateWith(drag2DScope, mutatePriority, pVar, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
