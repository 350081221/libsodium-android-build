package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/ripple/CommonRipple;", "Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance", "<init>", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,119:1\n50#2:120\n49#2:121\n1116#3,6:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRipple\n*L\n54#1:120\n54#1:121\n54#1:122,6\n*E\n"})
/* loaded from: classes.dex */
public final class CommonRipple extends Ripple {
    public static final int $stable = 0;

    private CommonRipple(boolean z4, float f5, State<Color> state) {
        super(z4, f5, state, null);
    }

    public /* synthetic */ CommonRipple(boolean z4, float f5, State state, w wVar) {
        this(z4, f5, state);
    }

    @Override // androidx.compose.material.ripple.Ripple
    @l
    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public RippleIndicationInstance mo1533rememberUpdatedRippleInstance942rkJo(@l InteractionSource interactionSource, boolean z4, float f5, @l State<Color> state, @l State<RippleAlpha> state2, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1768051227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1768051227, i5, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:52)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(interactionSource) | composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CommonRippleIndicationInstance(z4, f5, state, state2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return commonRippleIndicationInstance;
    }
}
