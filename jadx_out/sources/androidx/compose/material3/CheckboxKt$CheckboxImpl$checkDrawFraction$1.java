package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.state.ToggleableState;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/ui/state/ToggleableState;", "invoke", "(Landroidx/compose/animation/core/Transition$Segment;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CheckboxKt$CheckboxImpl$checkDrawFraction$1 extends kotlin.jvm.internal.n0 implements v3.q<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public static final CheckboxKt$CheckboxImpl$checkDrawFraction$1 INSTANCE = new CheckboxKt$CheckboxImpl$checkDrawFraction$1();

    CheckboxKt$CheckboxImpl$checkDrawFraction$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @p4.l
    @Composable
    public final FiniteAnimationSpec<Float> invoke(@p4.l Transition.Segment<ToggleableState> segment, @p4.m Composer composer, int i5) {
        FiniteAnimationSpec<Float> snap;
        composer.startReplaceableGroup(1373301606);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1373301606, i5, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:267)");
        }
        ToggleableState initialState = segment.getInitialState();
        ToggleableState toggleableState = ToggleableState.Off;
        if (initialState == toggleableState) {
            snap = AnimationSpecKt.tween$default(100, 0, null, 6, null);
        } else {
            snap = segment.getTargetState() == toggleableState ? AnimationSpecKt.snap(100) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snap;
    }
}
