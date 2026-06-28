package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JY\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "BeyondBoundsPageCount", "", "LowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getLowVelocityAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "lowVelocityAnimationSpec", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "snapVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "snapPositionalThreshold", "flingBehavior-PfoAEA0", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFoundationApi
@r1({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,970:1\n74#2:971\n83#3,3:972\n1116#4,6:975\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n354#1:971\n355#1:972,3\n355#1:975,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int BeyondBoundsPageCount = 0;

    @l
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    @l
    private static final AnimationSpec<Float> LowVelocityAnimationSpec = AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null);
    public static final int $stable = 8;

    private PagerDefaults() {
    }

    @l
    @Composable
    public final SnapFlingBehavior flingBehavior(@l PagerState pagerState, @m PagerSnapDistance pagerSnapDistance, @m AnimationSpec<Float> animationSpec, @m DecayAnimationSpec<Float> decayAnimationSpec, @m AnimationSpec<Float> animationSpec2, @FloatRange(from = 0.0d, to = 1.0d) float f5, @m Composer composer, int i5, int i6) {
        boolean z4;
        SnapLayoutInfoProvider SnapLayoutInfoProvider;
        composer.startReplaceableGroup(-194065136);
        if ((i6 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.Companion.atMost(1);
        }
        if ((i6 & 4) != 0) {
            animationSpec = LowVelocityAnimationSpec;
        }
        if ((i6 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i6 & 16) != 0) {
            animationSpec2 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i6 & 32) != 0) {
            f5 = 0.5f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-194065136, i5, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:348)");
        }
        if (0.0f <= f5 && f5 <= 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Object[] objArr = {pagerState, animationSpec, decayAnimationSpec, animationSpec2, pagerSnapDistance, (Density) composer.consume(CompositionLocalsKt.getLocalDensity())};
            composer.startReplaceableGroup(-568225417);
            boolean z5 = false;
            for (int i7 = 0; i7 < 6; i7++) {
                z5 |= composer.changed(objArr[i7]);
            }
            Object rememberedValue = composer.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                SnapLayoutInfoProvider = PagerKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistance, decayAnimationSpec, f5);
                rememberedValue = new SnapFlingBehavior(SnapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return snapFlingBehavior;
        }
        throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f5).toString());
    }

    @l
    @Composable
    @k(message = "Please use the overload without snapVelocityThreshold. For Pagerthe functionalities provided by snapVelocityThreshold were already being provided byother APIS.")
    /* renamed from: flingBehavior-PfoAEA0, reason: not valid java name */
    public final SnapFlingBehavior m780flingBehaviorPfoAEA0(@l PagerState pagerState, @m PagerSnapDistance pagerSnapDistance, @m AnimationSpec<Float> animationSpec, @m DecayAnimationSpec<Float> decayAnimationSpec, @m AnimationSpec<Float> animationSpec2, float f5, float f6, @m Composer composer, int i5, int i6) {
        PagerSnapDistance pagerSnapDistance2;
        AnimationSpec<Float> animationSpec3;
        DecayAnimationSpec<Float> decayAnimationSpec2;
        AnimationSpec<Float> animationSpec4;
        float f7;
        composer.startReplaceableGroup(-705378306);
        if ((i6 & 2) != 0) {
            pagerSnapDistance2 = PagerSnapDistance.Companion.atMost(1);
        } else {
            pagerSnapDistance2 = pagerSnapDistance;
        }
        if ((i6 & 4) != 0) {
            animationSpec3 = AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null);
        } else {
            animationSpec3 = animationSpec;
        }
        if ((i6 & 8) != 0) {
            decayAnimationSpec2 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        } else {
            decayAnimationSpec2 = decayAnimationSpec;
        }
        if ((i6 & 16) != 0) {
            animationSpec4 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        } else {
            animationSpec4 = animationSpec2;
        }
        if ((i6 & 32) != 0) {
            SnapFlingBehaviorKt.getMinFlingVelocityDp();
        }
        if ((i6 & 64) != 0) {
            f7 = 0.5f;
        } else {
            f7 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-705378306, i5, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:470)");
        }
        SnapFlingBehavior flingBehavior = flingBehavior(pagerState, pagerSnapDistance2, animationSpec3, decayAnimationSpec2, animationSpec4, f7, composer, (i5 & 14) | 2134528 | (i5 & 112) | ((i5 >> 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flingBehavior;
    }

    @l
    public final AnimationSpec<Float> getLowVelocityAnimationSpec() {
        return LowVelocityAnimationSpec;
    }

    @l
    public final NestedScrollConnection pageNestedScrollConnection(@l PagerState pagerState, @l Orientation orientation) {
        return new DefaultPagerNestedScrollConnection(pagerState, orientation);
    }
}
