package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/material3/ElevationDefaults;", "", "()V", "incomingAnimationSpecForInteraction", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingAnimationSpecForInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ElevationDefaults {

    @p4.l
    public static final ElevationDefaults INSTANCE = new ElevationDefaults();

    private ElevationDefaults() {
    }

    @p4.m
    public final AnimationSpec<Dp> incomingAnimationSpecForInteraction(@p4.l Interaction interaction) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2;
        TweenSpec tweenSpec3;
        TweenSpec tweenSpec4;
        if (interaction instanceof PressInteraction.Press) {
            tweenSpec4 = ElevationKt.DefaultIncomingSpec;
            return tweenSpec4;
        }
        if (interaction instanceof DragInteraction.Start) {
            tweenSpec3 = ElevationKt.DefaultIncomingSpec;
            return tweenSpec3;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            tweenSpec2 = ElevationKt.DefaultIncomingSpec;
            return tweenSpec2;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            tweenSpec = ElevationKt.DefaultIncomingSpec;
            return tweenSpec;
        }
        return null;
    }

    @p4.m
    public final AnimationSpec<Dp> outgoingAnimationSpecForInteraction(@p4.l Interaction interaction) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2;
        TweenSpec tweenSpec3;
        TweenSpec tweenSpec4;
        if (interaction instanceof PressInteraction.Press) {
            tweenSpec4 = ElevationKt.DefaultOutgoingSpec;
            return tweenSpec4;
        }
        if (interaction instanceof DragInteraction.Start) {
            tweenSpec3 = ElevationKt.DefaultOutgoingSpec;
            return tweenSpec3;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            tweenSpec2 = ElevationKt.HoveredOutgoingSpec;
            return tweenSpec2;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            tweenSpec = ElevationKt.DefaultOutgoingSpec;
            return tweenSpec;
        }
        return null;
    }
}
