package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults;", "", "()V", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "reverseDirection", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseScrolling", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1021:1\n36#2:1022\n1116#3,6:1023\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n541#1:1022\n541#1:1023,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final int $stable = 0;

    @l
    public static final ScrollableDefaults INSTANCE = new ScrollableDefaults();

    private ScrollableDefaults() {
    }

    @l
    @ExperimentalFoundationApi
    public final BringIntoViewSpec bringIntoViewSpec() {
        return BringIntoViewSpec.Companion.getDefaultBringIntoViewSpec$foundation_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    @Composable
    public final FlingBehavior flingBehavior(@m Composer composer, int i5) {
        composer.startReplaceableGroup(1107739818);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1107739818, i5, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:538)");
        }
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(rememberSplineBasedDecay);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay, null, 2, 0 == true ? 1 : 0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFlingBehavior;
    }

    @l
    @Composable
    @ExperimentalFoundationApi
    public final OverscrollEffect overscrollEffect(@m Composer composer, int i5) {
        composer.startReplaceableGroup(1809802212);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809802212, i5, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:551)");
        }
        OverscrollEffect rememberOverscrollEffect = AndroidOverscroll_androidKt.rememberOverscrollEffect(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberOverscrollEffect;
    }

    public final boolean reverseDirection(@l LayoutDirection layoutDirection, @l Orientation orientation, boolean z4) {
        boolean z5 = true;
        boolean z6 = !z4;
        if (layoutDirection != LayoutDirection.Rtl) {
            z5 = false;
        }
        if (z5 && orientation != Orientation.Vertical) {
            return !z6;
        }
        return z6;
    }
}
