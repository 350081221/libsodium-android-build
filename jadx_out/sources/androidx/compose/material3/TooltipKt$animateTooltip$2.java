package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,719:1\n1166#2:720\n1083#2,5:721\n1166#2:726\n1083#2,5:727\n81#3:732\n81#3:733\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n*L\n656#1:720\n656#1:721,5\n675#1:726\n675#1:727,5\n656#1:732\n675#1:733\n*E\n"})
/* loaded from: classes.dex */
public final class TooltipKt$animateTooltip$2 extends kotlin.jvm.internal.n0 implements v3.q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Transition<Boolean> $transition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$animateTooltip$2(Transition<Boolean> transition) {
        super(3);
        this.$transition = transition;
    }

    private static final float invoke$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float invoke$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1498516085);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1498516085, i5, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:655)");
        }
        Transition<Boolean> transition = this.$transition;
        TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = TooltipKt$animateTooltip$2$scale$2.INSTANCE;
        composer.startReplaceableGroup(-1338768149);
        kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f19382a;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(a0Var);
        composer.startReplaceableGroup(-142660079);
        boolean booleanValue = transition.getCurrentState().booleanValue();
        composer.startReplaceableGroup(-1553362193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:672)");
        }
        float f5 = booleanValue ? 1.0f : 0.8f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float valueOf = Float.valueOf(f5);
        boolean booleanValue2 = transition.getTargetState().booleanValue();
        composer.startReplaceableGroup(-1553362193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:672)");
        }
        float f6 = booleanValue2 ? 1.0f : 0.8f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, Float.valueOf(f6), tooltipKt$animateTooltip$2$scale$2.invoke((TooltipKt$animateTooltip$2$scale$2) transition.getSegment(), (Transition.Segment<Boolean>) composer, (Composer) 0), vectorConverter, "tooltip transition: scaling", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Transition<Boolean> transition2 = this.$transition;
        TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = TooltipKt$animateTooltip$2$alpha$2.INSTANCE;
        composer.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(a0Var);
        composer.startReplaceableGroup(-142660079);
        boolean booleanValue3 = transition2.getCurrentState().booleanValue();
        composer.startReplaceableGroup(2073045083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:691)");
        }
        float f7 = booleanValue3 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float valueOf2 = Float.valueOf(f7);
        boolean booleanValue4 = transition2.getTargetState().booleanValue();
        composer.startReplaceableGroup(2073045083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:691)");
        }
        float f8 = booleanValue4 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition2, valueOf2, Float.valueOf(f8), tooltipKt$animateTooltip$2$alpha$2.invoke((TooltipKt$animateTooltip$2$alpha$2) transition2.getSegment(), (Transition.Segment<Boolean>) composer, (Composer) 0), vectorConverter2, "tooltip transition: alpha", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier m3894graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3894graphicsLayerAp8cVGQ$default(modifier, invoke$lambda$1(createTransitionAnimation), invoke$lambda$1(createTransitionAnimation), invoke$lambda$3(createTransitionAnimation2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3894graphicsLayerAp8cVGQ$default;
    }
}
