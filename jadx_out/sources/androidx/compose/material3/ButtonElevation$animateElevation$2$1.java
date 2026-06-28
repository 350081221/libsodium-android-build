package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {952, 960}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ButtonElevation$animateElevation$2$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ ButtonElevation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> animatable, float f5, boolean z4, ButtonElevation buttonElevation, Interaction interaction, kotlin.coroutines.d<? super ButtonElevation$animateElevation$2$1> dVar) {
        super(2, dVar);
        this.$animatable = animatable;
        this.$target = f5;
        this.$enabled = z4;
        this.this$0 = buttonElevation;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((ButtonElevation$animateElevation$2$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        float f5;
        float f6;
        float f7;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1 && i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            if (!Dp.m6049equalsimpl0(this.$animatable.getTargetValue().m6058unboximpl(), this.$target)) {
                if (!this.$enabled) {
                    Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
                    Dp m6042boximpl = Dp.m6042boximpl(this.$target);
                    this.label = 1;
                    if (animatable.snapTo(m6042boximpl, this) == l5) {
                        return l5;
                    }
                } else {
                    float m6058unboximpl = this.$animatable.getTargetValue().m6058unboximpl();
                    f5 = this.this$0.pressedElevation;
                    Interaction interaction = null;
                    if (Dp.m6049equalsimpl0(m6058unboximpl, f5)) {
                        interaction = new PressInteraction.Press(Offset.Companion.m3509getZeroF1C5BW0(), null);
                    } else {
                        f6 = this.this$0.hoveredElevation;
                        if (Dp.m6049equalsimpl0(m6058unboximpl, f6)) {
                            interaction = new HoverInteraction.Enter();
                        } else {
                            f7 = this.this$0.focusedElevation;
                            if (Dp.m6049equalsimpl0(m6058unboximpl, f7)) {
                                interaction = new FocusInteraction.Focus();
                            }
                        }
                    }
                    Animatable<Dp, AnimationVector1D> animatable2 = this.$animatable;
                    float f8 = this.$target;
                    Interaction interaction2 = this.$interaction;
                    this.label = 2;
                    if (ElevationKt.m1867animateElevationrAjV9yQ(animatable2, f8, interaction, interaction2, this) == l5) {
                        return l5;
                    }
                }
            }
        }
        return r2.f19517a;
    }
}
