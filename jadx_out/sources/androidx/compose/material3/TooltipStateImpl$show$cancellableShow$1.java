package androidx.compose.material3;

import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", i = {}, l = {720}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,719:1\n314#2,11:720\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipStateImpl$show$cancellableShow$1\n*L\n579#1:720,11\n*E\n"})
/* loaded from: classes.dex */
final class TooltipStateImpl$show$cancellableShow$1 extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super r2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TooltipStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$cancellableShow$1(TooltipStateImpl tooltipStateImpl, kotlin.coroutines.d<? super TooltipStateImpl$show$cancellableShow$1> dVar) {
        super(1, dVar);
        this.this$0 = tooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
        return new TooltipStateImpl$show$cancellableShow$1(this.this$0, dVar);
    }

    @Override // v3.l
    @p4.m
    public final Object invoke(@p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((TooltipStateImpl$show$cancellableShow$1) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        kotlin.coroutines.d e5;
        Object l6;
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
            TooltipStateImpl tooltipStateImpl = this.this$0;
            this.L$0 = tooltipStateImpl;
            this.label = 1;
            e5 = kotlin.coroutines.intrinsics.c.e(this);
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
            qVar.B();
            tooltipStateImpl.getTransition().setTargetState(kotlin.coroutines.jvm.internal.b.a(true));
            tooltipStateImpl.job = qVar;
            Object E = qVar.E();
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (E == l6) {
                kotlin.coroutines.jvm.internal.h.c(this);
            }
            if (E == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
