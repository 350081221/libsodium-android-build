package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.u;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ag\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0012*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0018\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0015*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001a\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u0015*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001am\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0012*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0082@¢\u0006\u0004\b \u0010!\u001au\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0012*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0082@¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010(\u001a\u00020\u0006*\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002\u001a*\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u00103\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0082\b\"\u001a\u00105\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0014\u00109\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u00106\"\u0014\u0010:\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00106\"\u0014\u0010<\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "animation", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "delta", "Lkotlin/r2;", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "T", "Lkotlin/ranges/f;", "component1", "(Lkotlin/ranges/f;)Ljava/lang/Comparable;", "component2", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "animateDecay", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cancelOffset", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateWithTarget", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", TypedValues.AttributesType.S_TARGET, "coerceToTarget", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "snappingOffset", "lowerBound", "upperBound", "calculateFinalOffset-Fhqu1e0", "(IFF)F", "calculateFinalOffset", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "F", "getMinFlingVelocityDp", "()F", "NoDistance", "NoVelocity", "", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,538:1\n534#1,4:550\n534#1,4:554\n534#1,4:558\n74#2:539\n67#3,3:540\n66#3:543\n1116#4,6:544\n154#5:562\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n381#1:550,4\n425#1:554,4\n508#1:558,4\n286#1:539\n288#1:540,3\n288#1:543\n288#1:544,6\n494#1:562\n*E\n"})
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = Dp.m6044constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    public static final /* synthetic */ Object access$animateDecay(ScrollScope scrollScope, float f5, AnimationState animationState, DecayAnimationSpec decayAnimationSpec, l lVar, d dVar) {
        return animateDecay(scrollScope, f5, animationState, decayAnimationSpec, lVar, dVar);
    }

    public static final /* synthetic */ Object access$animateWithTarget(ScrollScope scrollScope, float f5, float f6, AnimationState animationState, AnimationSpec animationSpec, l lVar, d dVar) {
        return animateWithTarget(scrollScope, f5, f6, animationState, animationSpec, lVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateDecay(androidx.compose.foundation.gestures.ScrollScope r5, float r6, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r7, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r8, v3.l<? super java.lang.Float, kotlin.r2> r9, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.F$0
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.k1$e r5 = (kotlin.jvm.internal.k1.e) r5
            java.lang.Object r7 = r0.L$0
            androidx.compose.animation.core.AnimationState r7 = (androidx.compose.animation.core.AnimationState) r7
            kotlin.e1.n(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e1.n(r10)
            kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
            r10.<init>()
            java.lang.Object r2 = r7.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>(r6, r10, r5, r9)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r5 = r5.element
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, l<? super Float, r2> lVar, float f5) {
        float scrollBy = scrollScope.scrollBy(f5);
        lVar.invoke(Float.valueOf(scrollBy));
        if (Math.abs(f5 - scrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object animateWithTarget(androidx.compose.foundation.gestures.ScrollScope r12, float r13, float r14, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r15, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r16, v3.l<? super java.lang.Float, kotlin.r2> r17, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r1.<init>(r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r7.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            float r1 = r7.F$1
            float r2 = r7.F$0
            java.lang.Object r3 = r7.L$1
            kotlin.jvm.internal.k1$e r3 = (kotlin.jvm.internal.k1.e) r3
            java.lang.Object r4 = r7.L$0
            androidx.compose.animation.core.AnimationState r4 = (androidx.compose.animation.core.AnimationState) r4
            kotlin.e1.n(r0)
            r10 = r2
            r0 = r4
            goto L8f
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L42:
            kotlin.e1.n(r0)
            kotlin.jvm.internal.k1$e r0 = new kotlin.jvm.internal.k1$e
            r0.<init>()
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.e(r13)
            java.lang.Object r2 = r15.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L69
            r2 = r3
            goto L6a
        L69:
            r2 = 0
        L6a:
            r5 = r2 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.L$0 = r9
            r7.L$1 = r0
            r10 = r13
            r7.F$0 = r10
            r7.F$1 = r8
            r7.label = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L8c
            return r1
        L8c:
            r3 = r0
            r1 = r8
            r0 = r9
        L8f:
            java.lang.Object r2 = r0.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = coerceToTarget(r2, r1)
            androidx.compose.foundation.gestures.snapping.AnimationResult r11 = new androidx.compose.foundation.gestures.snapping.AnimationResult
            float r1 = r3.element
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.e(r10)
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 29
            r9 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.copy$default(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    public static final Object approach(ScrollScope scrollScope, float f5, float f6, ApproachAnimation<Float, AnimationVector1D> approachAnimation, l<? super Float, r2> lVar, d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        return approachAnimation.approachAnimation(scrollScope, b.e(f5), b.e(f6), lVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (java.lang.Math.abs(r5) <= java.lang.Math.abs(r4)) goto L28;
     */
    /* renamed from: calculateFinalOffset-Fhqu1e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m428calculateFinalOffsetFhqu1e0(int r3, float r4, float r5) {
        /*
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r0 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r1 = r0.m425getClosestItembbeMdSM()
            boolean r1 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m421equalsimpl0(r3, r1)
            r2 = 0
            if (r1 == 0) goto L1a
            float r3 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L32
            goto L24
        L1a:
            int r1 = r0.m426getNextItembbeMdSM()
            boolean r1 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m421equalsimpl0(r3, r1)
            if (r1 == 0) goto L26
        L24:
            r4 = r5
            goto L32
        L26:
            int r5 = r0.m427getPreviousItembbeMdSM()
            boolean r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m421equalsimpl0(r3, r5)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r4 = r2
        L32:
            boolean r3 = calculateFinalOffset_Fhqu1e0$isValidDistance(r4)
            if (r3 == 0) goto L39
            r2 = r4
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.m428calculateFinalOffsetFhqu1e0(int, float, float):float");
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f5) {
        if (!(f5 == Float.POSITIVE_INFINITY)) {
            if (!(f5 == Float.NEGATIVE_INFINITY)) {
                return true;
            }
        }
        return false;
    }

    public static final float coerceToTarget(float f5, float f6) {
        float t5;
        float A;
        if (f6 == 0.0f) {
            return 0.0f;
        }
        if (f6 > 0.0f) {
            A = u.A(f5, f6);
            return A;
        }
        t5 = u.t(f5, f6);
        return t5;
    }

    private static final <T extends Comparable<? super T>> T component1(f<T> fVar) {
        return fVar.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(f<T> fVar) {
        return fVar.getEndInclusive();
    }

    private static final void debugLog(v3.a<String> aVar) {
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    @p4.l
    @Composable
    @ExperimentalFoundationApi
    public static final SnapFlingBehavior rememberSnapFlingBehavior(@p4.l SnapLayoutInfoProvider snapLayoutInfoProvider, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-473984552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i5, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:284)");
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(snapLayoutInfoProvider) | composer.changed(rememberSplineBasedDecay);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), rememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
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
}
