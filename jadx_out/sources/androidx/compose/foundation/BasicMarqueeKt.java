package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aH\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001aR\u0010&\u001a\u00020'*\u00020'2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\"\u001c\u0010\u0000\u001a\u00020\u00018GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u001c\u0010\t\u001a\u00020\n8GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u000e\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0013\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"DefaultMarqueeDelayMillis", "", "getDefaultMarqueeDelayMillis$annotations", "()V", "getDefaultMarqueeDelayMillis", "()I", "DefaultMarqueeIterations", "getDefaultMarqueeIterations$annotations", "getDefaultMarqueeIterations", "DefaultMarqueeSpacing", "Landroidx/compose/foundation/MarqueeSpacing;", "getDefaultMarqueeSpacing$annotations", "getDefaultMarqueeSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "DefaultMarqueeVelocity", "Landroidx/compose/ui/unit/Dp;", "getDefaultMarqueeVelocity$annotations", "getDefaultMarqueeVelocity", "()F", "F", "MarqueeSpacing", "spacing", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "createMarqueeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "iterations", "targetValue", "initialDelayMillis", "delayMillis", "velocity", "density", "Landroidx/compose/ui/unit/Density;", "createMarqueeAnimationSpec-Z4HSEVQ", "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "velocityBasedTween", "Landroidx/compose/animation/core/TweenSpec;", "basicMarquee", "Landroidx/compose/ui/Modifier;", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,515:1\n1#2:516\n154#3:517\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n95#1:517\n*E\n"})
/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    private static final int DefaultMarqueeDelayMillis = 1200;
    private static final int DefaultMarqueeIterations = 3;

    @p4.l
    private static final MarqueeSpacing DefaultMarqueeSpacing = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);
    private static final float DefaultMarqueeVelocity = Dp.m6044constructorimpl(30);

    @p4.l
    @ExperimentalFoundationApi
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m204MarqueeSpacing0680j_4(final float f5) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.c
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i5, int i6) {
                int MarqueeSpacing_0680j_4$lambda$1;
                MarqueeSpacing_0680j_4$lambda$1 = BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(f5, density, i5, i6);
                return MarqueeSpacing_0680j_4$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MarqueeSpacing_0680j_4$lambda$1(float f5, Density density, int i5, int i6) {
        return density.mo298roundToPx0680j_4(f5);
    }

    @Stable
    @p4.l
    @ExperimentalFoundationApi
    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m206basicMarquee1Mj1MLw(@p4.l Modifier modifier, int i5, int i6, int i7, int i8, @p4.l MarqueeSpacing marqueeSpacing, float f5) {
        return modifier.then(new MarqueeModifierElement(i5, i6, i7, i8, marqueeSpacing, f5, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m207basicMarquee1Mj1MLw$default(Modifier modifier, int i5, int i6, int i7, int i8, MarqueeSpacing marqueeSpacing, float f5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = DefaultMarqueeIterations;
        }
        if ((i9 & 2) != 0) {
            i6 = MarqueeAnimationMode.Companion.m281getImmediatelyZbEOnfQ();
        }
        int i10 = i6;
        if ((i9 & 4) != 0) {
            i7 = DefaultMarqueeDelayMillis;
        }
        int i11 = i7;
        if ((i9 & 8) != 0) {
            if (MarqueeAnimationMode.m275equalsimpl0(i10, MarqueeAnimationMode.Companion.m281getImmediatelyZbEOnfQ())) {
                i8 = i11;
            } else {
                i8 = 0;
            }
        }
        int i12 = i8;
        if ((i9 & 16) != 0) {
            marqueeSpacing = DefaultMarqueeSpacing;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i9 & 32) != 0) {
            f5 = DefaultMarqueeVelocity;
        }
        return m206basicMarquee1Mj1MLw(modifier, i5, i10, i11, i12, marqueeSpacing2, f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m208createMarqueeAnimationSpecZ4HSEVQ(int i5, float f5, int i6, int i7, float f6, Density density) {
        TweenSpec<Float> velocityBasedTween = velocityBasedTween(Math.abs(density.mo304toPx0680j_4(f6)), f5, i7);
        long m139constructorimpl$default = StartOffset.m139constructorimpl$default((-i7) + i6, 0, 2, null);
        if (i5 == Integer.MAX_VALUE) {
            return AnimationSpecKt.m119infiniteRepeatable9IiC70o$default(velocityBasedTween, null, m139constructorimpl$default, 2, null);
        }
        return AnimationSpecKt.m121repeatable91I0pcU$default(i5, velocityBasedTween, null, m139constructorimpl$default, 4, null);
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeDelayMillis() {
        return DefaultMarqueeDelayMillis;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeDelayMillis$annotations() {
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeIterations() {
        return DefaultMarqueeIterations;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeIterations$annotations() {
    }

    @p4.l
    @ExperimentalFoundationApi
    public static final MarqueeSpacing getDefaultMarqueeSpacing() {
        return DefaultMarqueeSpacing;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeSpacing$annotations() {
    }

    @ExperimentalFoundationApi
    public static final float getDefaultMarqueeVelocity() {
        return DefaultMarqueeVelocity;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeVelocity$annotations() {
    }

    private static final TweenSpec<Float> velocityBasedTween(float f5, float f6, int i5) {
        return AnimationSpecKt.tween((int) Math.ceil(f6 / (f5 / 1000.0f)), i5, EasingKt.getLinearEasing());
    }
}
