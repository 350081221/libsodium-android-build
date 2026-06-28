package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/Transition$Segment;", "", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabKt$TabTransition$color$2 extends n0 implements q<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>> {
    public static final TabKt$TabTransition$color$2 INSTANCE = new TabKt$TabTransition$color$2();

    TabKt$TabTransition$color$2() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    @l
    @Composable
    public final FiniteAnimationSpec<Color> invoke(@l Transition.Segment<Boolean> segment, @m Composer composer, int i5) {
        TweenSpec tween$default;
        composer.startReplaceableGroup(-2120892502);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2120892502, i5, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:272)");
        }
        if (segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
            tween$default = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
        } else {
            tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tween$default;
    }
}
