package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010#\u001a\u00020\"\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030%¢\u0006\u0004\b3\u00104BC\b\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030%\u0012\u0006\u00105\u001a\u00020\u0003¢\u0006\u0004\b3\u00106J<\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000f*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0004\b\u0017\u0010\u0011J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001a\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@¢\u0006\u0004\b\u001a\u0010\u000bJ\u0013\u0010\u001f\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010!\u001a\u00020 H\u0016R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\"\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/r2;", "onRemainingScrollOffsetUpdate", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "fling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", TypedValues.CycleType.S_WAVE_OFFSET, "velocity", "updateRemainingScrollOffset", "Landroidx/compose/animation/core/AnimationState;", "tryApproach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "initialTargetOffset", "Lkotlin/v0;", "name", "delta", "onAnimationStep", "runApproach", "", "isDecayApproachPossible", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;", "onSettlingDistanceUpdated", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/animation/core/AnimationSpec;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/MotionDurationScale;", "motionScaleDuration", "Landroidx/compose/ui/MotionDurationScale;", "getMotionScaleDuration$foundation_release", "()Landroidx/compose/ui/MotionDurationScale;", "setMotionScaleDuration$foundation_release", "(Landroidx/compose/ui/MotionDurationScale;)V", "<init>", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "shortSnapVelocityThreshold", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;F)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n534#2,4:539\n534#2,4:543\n534#2,4:547\n534#2,4:551\n1#3:555\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n153#1:539,4\n229#1:543,4\n232#1:547,4\n252#1:551,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;

    @l
    private final DecayAnimationSpec<Float> highVelocityAnimationSpec;

    @l
    private final AnimationSpec<Float> lowVelocityAnimationSpec;

    @l
    private MotionDurationScale motionScaleDuration;

    @l
    private final AnimationSpec<Float> snapAnimationSpec;

    @l
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;

    public SnapFlingBehavior(@l SnapLayoutInfoProvider snapLayoutInfoProvider, @l AnimationSpec<Float> animationSpec, @l DecayAnimationSpec<Float> decayAnimationSpec, @l AnimationSpec<Float> animationSpec2) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.lowVelocityAnimationSpec = animationSpec;
        this.highVelocityAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec2;
        this.motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r11, float r12, v3.l<? super java.lang.Float, kotlin.r2> r13, kotlin.coroutines.d<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.L$0
            r13 = r11
            v3.l r13 = (v3.l) r13
            kotlin.e1.n(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.e1.n(r14)
            androidx.compose.ui.MotionDurationScale r14 = r10.motionScaleDuration
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = kotlinx.coroutines.i.h(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.b.e(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    private final boolean isDecayApproachPossible(float f5, float f6) {
        if (Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.highVelocityAnimationSpec, 0.0f, f6)) >= Math.abs(f5)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f5, float f6, v3.l<? super Float, r2> lVar, d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        ApproachAnimation lowVelocityApproachAnimation;
        if (isDecayApproachPossible(f5, f6)) {
            lowVelocityApproachAnimation = new HighVelocityApproachAnimation(this.highVelocityAnimationSpec);
        } else {
            lowVelocityApproachAnimation = new LowVelocityApproachAnimation(this.lowVelocityAnimationSpec);
        }
        return SnapFlingBehaviorKt.access$approach(scrollScope, f5, f6, lowVelocityApproachAnimation, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryApproach(androidx.compose.foundation.gestures.ScrollScope r10, float r11, float r12, v3.l<? super java.lang.Float, kotlin.r2> r13, kotlin.coroutines.d<? super androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.e1.n(r14)
            goto L5e
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            kotlin.e1.n(r14)
            float r14 = java.lang.Math.abs(r11)
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r3 = 0
            if (r14 != 0) goto L41
            r14 = r2
            goto L42
        L41:
            r14 = r3
        L42:
            if (r14 != 0) goto L65
            float r14 = java.lang.Math.abs(r12)
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4d
            r3 = r2
        L4d:
            if (r3 == 0) goto L50
            goto L65
        L50:
            r6.label = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.runApproach(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L5e
            return r0
        L5e:
            androidx.compose.foundation.gestures.snapping.AnimationResult r14 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r14
            androidx.compose.animation.core.AnimationState r10 = r14.getCurrentAnimationState()
            goto L73
        L65:
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 28
            r8 = 0
            r0 = r11
            r1 = r12
            androidx.compose.animation.core.AnimationState r10 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r0, r1, r2, r4, r6, r7, r8)
        L73:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.tryApproach(androidx.compose.foundation.gestures.ScrollScope, float, float, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    public boolean equals(@m Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!l0.g(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) || !l0.g(snapFlingBehavior.highVelocityAnimationSpec, this.highVelocityAnimationSpec) || !l0.g(snapFlingBehavior.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) || !l0.g(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
            return false;
        }
        return true;
    }

    @l
    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public int hashCode() {
        return ((((((0 + this.snapAnimationSpec.hashCode()) * 31) + this.highVelocityAnimationSpec.hashCode()) * 31) + this.lowVelocityAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @m
    public Object performFling(@l ScrollScope scrollScope, float f5, @l d<? super Float> dVar) {
        return performFling(scrollScope, f5, SnapFlingBehavior$performFling$2.INSTANCE, dVar);
    }

    public final void setMotionScaleDuration$foundation_release(@l MotionDurationScale motionDurationScale) {
        this.motionScaleDuration = motionDurationScale;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performFling(@p4.l androidx.compose.foundation.gestures.ScrollScope r5, float r6, @p4.l v3.l<? super java.lang.Float, kotlin.r2> r7, @p4.l kotlin.coroutines.d<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e1.n(r8)
            r0.label = r3
            java.lang.Object r8 = r4.fling(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            androidx.compose.foundation.gestures.snapping.AnimationResult r8 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r8
            java.lang.Object r5 = r8.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r8.component2()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L54
        L53:
            r3 = 0
        L54:
            if (r3 == 0) goto L57
            goto L61
        L57:
            java.lang.Object r5 = r6.getVelocity()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L61:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @k(message = "Please use the constructor without the shortSnapVelocityThreshold. The functionality provided by shortSnapVelocityThreshold can be implemented by SnapLayoutInfoProvider.")
    public SnapFlingBehavior(@l SnapLayoutInfoProvider snapLayoutInfoProvider, @l AnimationSpec<Float> animationSpec, @l DecayAnimationSpec<Float> decayAnimationSpec, @l AnimationSpec<Float> animationSpec2, float f5) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2);
    }
}
