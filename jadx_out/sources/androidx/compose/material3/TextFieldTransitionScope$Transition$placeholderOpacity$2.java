package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/material3/InputPhase;", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$placeholderOpacity$2 extends kotlin.jvm.internal.n0 implements v3.q<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final TextFieldTransitionScope$Transition$placeholderOpacity$2 INSTANCE = new TextFieldTransitionScope$Transition$placeholderOpacity$2();

    TextFieldTransitionScope$Transition$placeholderOpacity$2() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final FiniteAnimationSpec<Float> invoke(@p4.l Transition.Segment<InputPhase> segment, @p4.m Composer composer, int i5) {
        FiniteAnimationSpec<Float> tween;
        composer.startReplaceableGroup(-1635067817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1635067817, i5, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
        }
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        if (segment.isTransitioningTo(inputPhase, inputPhase2)) {
            tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
        } else if (!segment.isTransitioningTo(inputPhase2, inputPhase) && !segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase2)) {
            tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        } else {
            tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween;
    }
}
