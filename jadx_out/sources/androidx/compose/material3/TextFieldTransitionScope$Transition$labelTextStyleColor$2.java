package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/material3/InputPhase;", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$labelTextStyleColor$2 extends kotlin.jvm.internal.n0 implements v3.q<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>> {
    public static final TextFieldTransitionScope$Transition$labelTextStyleColor$2 INSTANCE = new TextFieldTransitionScope$Transition$labelTextStyleColor$2();

    TextFieldTransitionScope$Transition$labelTextStyleColor$2() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final FiniteAnimationSpec<Color> invoke(@p4.l Transition.Segment<InputPhase> segment, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(2041936647);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2041936647, i5, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
        }
        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
