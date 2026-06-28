package androidx.compose.foundation;

import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", i = {}, l = {345, 346}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MarqueeModifierNode$restartAnimation$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ l2 $oldJob;
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$restartAnimation$1(l2 l2Var, MarqueeModifierNode marqueeModifierNode, kotlin.coroutines.d<? super MarqueeModifierNode$restartAnimation$1> dVar) {
        super(2, dVar);
        this.$oldJob = l2Var;
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new MarqueeModifierNode$restartAnimation$1(this.$oldJob, this.this$0, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((MarqueeModifierNode$restartAnimation$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Object runAnimation;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    e1.n(obj);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            l2 l2Var = this.$oldJob;
            if (l2Var != null) {
                this.label = 1;
                if (l2Var.b0(this) == l5) {
                    return l5;
                }
            }
        }
        MarqueeModifierNode marqueeModifierNode = this.this$0;
        this.label = 2;
        runAnimation = marqueeModifierNode.runAnimation(this);
        if (runAnimation == l5) {
            return l5;
        }
        return r2.f19517a;
    }
}
