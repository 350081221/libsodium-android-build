package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntSize;
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

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SizeAnimationModifierNode$animateTo$data$1$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j5, SizeAnimationModifierNode sizeAnimationModifierNode, d<? super SizeAnimationModifierNode$animateTo$data$1$1> dVar) {
        super(2, dVar);
        this.$this_apply = animData;
        this.$targetSize = j5;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        p<IntSize, IntSize, r2> listener;
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
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize m6206boximpl = IntSize.m6206boximpl(this.$targetSize);
            AnimationSpec<IntSize> animationSpec = this.this$0.getAnimationSpec();
            this.label = 1;
            obj = Animatable.animateTo$default(anim, m6206boximpl, animationSpec, null, null, this, 12, null);
            if (obj == l5) {
                return l5;
            }
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = this.this$0.getListener()) != 0) {
            listener.invoke(IntSize.m6206boximpl(this.$this_apply.m103getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return r2.f19517a;
    }
}
