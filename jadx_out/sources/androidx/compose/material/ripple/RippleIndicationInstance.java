package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlinx.coroutines.s0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0014\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/s0;", "scope", "Lkotlin/r2;", "addRipple", "removeRipple", "Landroidx/compose/foundation/interaction/Interaction;", "updateStateLayer$material_ripple_release", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/s0;)V", "updateStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "Landroidx/compose/material/ripple/StateLayer;", "stateLayer", "Landroidx/compose/material/ripple/StateLayer;", "", "bounded", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZLandroidx/compose/runtime/State;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    public static final int $stable = 8;

    @l
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z4, @l State<RippleAlpha> state) {
        this.stateLayer = new StateLayer(z4, state);
    }

    public abstract void addRipple(@l PressInteraction.Press press, @l s0 s0Var);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1540drawStateLayerH2RKhps(@l DrawScope drawScope, float f5, long j5) {
        this.stateLayer.m1544drawStateLayerH2RKhps(drawScope, f5, j5);
    }

    public abstract void removeRipple(@l PressInteraction.Press press);

    public final void updateStateLayer$material_ripple_release(@l Interaction interaction, @l s0 s0Var) {
        this.stateLayer.handleInteraction(interaction, s0Var);
    }
}
