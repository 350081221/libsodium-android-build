package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\u000f\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/s0;", "scope", "Lkotlin/r2;", "handleInteraction", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "", "bounded", "Z", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "interactions", "Ljava/util/List;", "currentInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "<init>", "(ZLandroidx/compose/runtime/State;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,364:1\n137#2:365\n215#3,8:366\n262#3,11:374\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n313#1:365\n325#1:366,8\n325#1:374,11\n*E\n"})
/* loaded from: classes.dex */
public final class StateLayer {
    private final boolean bounded;

    @m
    private Interaction currentInteraction;

    @l
    private final State<RippleAlpha> rippleAlpha;

    @l
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    @l
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z4, @l State<RippleAlpha> state) {
        this.bounded = z4;
        this.rippleAlpha = state;
    }

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1544drawStateLayerH2RKhps(@l DrawScope drawScope, float f5, long j5) {
        float mo304toPx0680j_4;
        if (Float.isNaN(f5)) {
            mo304toPx0680j_4 = RippleAnimationKt.m1536getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo4277getSizeNHjbRc());
        } else {
            mo304toPx0680j_4 = drawScope.mo304toPx0680j_4(f5);
        }
        float f6 = mo304toPx0680j_4;
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(j5, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.bounded) {
                float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc());
                float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
                int m3723getIntersectrtfAjoo = ClipOp.Companion.m3723getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo4205clipRectN_I0leg(0.0f, 0.0f, m3562getWidthimpl, m3559getHeightimpl, m3723getIntersectrtfAjoo);
                DrawScope.m4259drawCircleVaOC9Bg$default(drawScope, m3733copywmQWz5c$default, f6, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
                return;
            }
            DrawScope.m4259drawCircleVaOC9Bg$default(drawScope, m3733copywmQWz5c$default, f6, 0L, 0.0f, null, null, 0, 124, null);
        }
    }

    public final void handleInteraction(@l Interaction interaction, @l s0 s0Var) {
        Object s32;
        float f5;
        boolean z4 = interaction instanceof HoverInteraction.Enter;
        if (z4) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (interaction instanceof DragInteraction.Cancel) {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        } else {
            return;
        }
        s32 = e0.s3(this.interactions);
        Interaction interaction2 = (Interaction) s32;
        if (!l0.g(this.currentInteraction, interaction2)) {
            if (interaction2 != null) {
                if (z4) {
                    f5 = this.rippleAlpha.getValue().getHoveredAlpha();
                } else if (interaction instanceof FocusInteraction.Focus) {
                    f5 = this.rippleAlpha.getValue().getFocusedAlpha();
                } else if (interaction instanceof DragInteraction.Start) {
                    f5 = this.rippleAlpha.getValue().getDraggedAlpha();
                } else {
                    f5 = 0.0f;
                }
                k.f(s0Var, null, null, new StateLayer$handleInteraction$1(this, f5, RippleKt.access$incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
            } else {
                k.f(s0Var, null, null, new StateLayer$handleInteraction$2(this, RippleKt.access$outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3, null);
            }
            this.currentInteraction = interaction2;
        }
    }
}
