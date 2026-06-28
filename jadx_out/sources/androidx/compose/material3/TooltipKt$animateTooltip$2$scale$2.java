package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Landroidx/compose/animation/core/Transition$Segment;", "", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooltipKt$animateTooltip$2$scale$2 extends kotlin.jvm.internal.n0 implements v3.q<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final TooltipKt$animateTooltip$2$scale$2 INSTANCE = new TooltipKt$animateTooltip$2$scale$2();

    TooltipKt$animateTooltip$2$scale$2() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final FiniteAnimationSpec<Float> invoke(@p4.l Transition.Segment<Boolean> segment, @p4.m Composer composer, int i5) {
        TweenSpec tween$default;
        composer.startReplaceableGroup(386845748);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(386845748, i5, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:657)");
        }
        if (segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
            tween$default = AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
        } else {
            tween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
