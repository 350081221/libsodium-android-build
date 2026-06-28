package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$1 extends n0 implements l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$1(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // v3.l
    @p4.l
    public final FiniteAnimationSpec<Float> invoke(@p4.l Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        FiniteAnimationSpec<Float> animationSpec;
        SpringSpec springSpec3;
        FiniteAnimationSpec<Float> animationSpec2;
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Fade fade = this.$enter.getData$animation_release().getFade();
            if (fade != null && (animationSpec2 = fade.getAnimationSpec()) != null) {
                return animationSpec2;
            }
            springSpec3 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            return springSpec3;
        }
        if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            Fade fade2 = this.$exit.getData$animation_release().getFade();
            if (fade2 != null && (animationSpec = fade2.getAnimationSpec()) != null) {
                return animationSpec;
            }
            springSpec2 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
            return springSpec2;
        }
        springSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
        return springSpec;
    }
}
