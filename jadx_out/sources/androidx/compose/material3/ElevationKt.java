package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\t\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/foundation/interaction/Interaction;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Lkotlin/r2;", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "animateElevation", "Landroidx/compose/animation/core/Easing;", "OutgoingSpecEasing", "Landroidx/compose/animation/core/Easing;", "Landroidx/compose/animation/core/TweenSpec;", "DefaultIncomingSpec", "Landroidx/compose/animation/core/TweenSpec;", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ElevationKt {

    @p4.l
    private static final TweenSpec<Dp> DefaultIncomingSpec;

    @p4.l
    private static final TweenSpec<Dp> DefaultOutgoingSpec;

    @p4.l
    private static final TweenSpec<Dp> HoveredOutgoingSpec;

    @p4.l
    private static final Easing OutgoingSpecEasing;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        int i5 = 0;
        int i6 = 2;
        kotlin.jvm.internal.w wVar = null;
        DefaultOutgoingSpec = new TweenSpec<>(150, i5, cubicBezierEasing, i6, wVar);
        HoveredOutgoingSpec = new TweenSpec<>(120, i5, cubicBezierEasing, i6, wVar);
    }

    @p4.m
    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m1867animateElevationrAjV9yQ(@p4.l Animatable<Dp, ?> animatable, float f5, @p4.m Interaction interaction, @p4.m Interaction interaction2, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        AnimationSpec<Dp> animationSpec;
        Object l5;
        Object l6;
        if (interaction2 != null) {
            animationSpec = ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2);
        } else if (interaction != null) {
            animationSpec = ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction);
        } else {
            animationSpec = null;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if (animationSpec2 != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, Dp.m6042boximpl(f5), animationSpec2, null, null, dVar, 12, null);
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (animateTo$default == l6) {
                return animateTo$default;
            }
            return r2.f19517a;
        }
        Object snapTo = animatable.snapTo(Dp.m6042boximpl(f5), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (snapTo == l5) {
            return snapTo;
        }
        return r2.f19517a;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m1868animateElevationrAjV9yQ$default(Animatable animatable, float f5, Interaction interaction, Interaction interaction2, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            interaction = null;
        }
        if ((i5 & 4) != 0) {
            interaction2 = null;
        }
        return m1867animateElevationrAjV9yQ(animatable, f5, interaction, interaction2, dVar);
    }
}
