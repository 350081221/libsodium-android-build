package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f*\u0001:\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\bJ\u0010KJ(\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\n\u0010\bJ(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u000b\u0010\bJ0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0082\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0082\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002JJ\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJR\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0082@¢\u0006\u0004\b\"\u0010#J\u0014\u0010%\u001a\u00020\u0003*\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002J\u001c\u0010+\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b+\u0010\bJ\u0013\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u00101\u001a\u000200H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u00109R\u001a\u0010?\u001a\u00020>8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u00109R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020(0@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0018\u0010I\u001a\u000200*\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/material3/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "Landroidx/compose/material3/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "fling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/d;)Ljava/lang/Object;", "velocity", "shortSnap", "longSnap", "initialTargetOffset", "runApproach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/coroutines/d;)Ljava/lang/Object;", "", "T", "Lkotlin/ranges/f;", "component1", "(Lkotlin/ranges/f;)Ljava/lang/Comparable;", "component2", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "findClosestOffset", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "animateDecay", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cancelOffset", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "animateSnap", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", TypedValues.AttributesType.S_TARGET, "coerceToTarget", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "item", "calculateDistanceToDesiredSnapPosition", "performFling", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "velocityThreshold", "F", "androidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1", "motionScaleDuration", "Landroidx/compose/material3/SnapFlingBehavior$motionScaleDuration$1;", "DefaultScrollMotionDurationScaleFactor", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "getItemSize", "()F", "itemSize", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "singleAxisViewportSize", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,356:1\n1#2:357\n154#3:358\n132#4,3:359\n33#4,4:362\n135#4,2:366\n38#4:368\n137#4:369\n33#4,6:370\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/material3/SnapFlingBehavior\n*L\n346#1:358\n71#1:359,3\n71#1:362,4\n71#1:366,2\n71#1:368\n71#1:369\n199#1:370,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;

    @p4.l
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    @p4.l
    private final Density density;

    @p4.l
    private final LazyListState lazyListState;

    @p4.l
    private final AnimationSpec<Float> snapAnimationSpec;
    private final float velocityThreshold;

    @p4.l
    private SnapFlingBehavior$motionScaleDuration$1 motionScaleDuration = new MotionDurationScale() { // from class: androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1
        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r5, pVar);
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @p4.m
        public <E extends g.b> E get(@p4.l g.c<E> cVar) {
            return (E) MotionDurationScale.DefaultImpls.get(this, cVar);
        }

        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            float f5;
            f5 = SnapFlingBehavior.this.DefaultScrollMotionDurationScaleFactor;
            return f5;
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @p4.l
        public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
            return MotionDurationScale.DefaultImpls.minusKey(this, cVar);
        }

        @Override // kotlin.coroutines.g
        @p4.l
        public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
            return MotionDurationScale.DefaultImpls.plus(this, gVar);
        }
    };
    private final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private final float MinFlingVelocityDp = Dp.m6044constructorimpl(400);

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1] */
    public SnapFlingBehavior(@p4.l LazyListState lazyListState, @p4.l DecayAnimationSpec<Float> decayAnimationSpec, @p4.l AnimationSpec<Float> animationSpec, @p4.l Density density) {
        this.lazyListState = lazyListState;
        this.decayAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec;
        this.density = density;
        this.velocityThreshold = density.mo304toPx0680j_4(this.MinFlingVelocityDp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateDecay(androidx.compose.foundation.gestures.ScrollScope r6, float r7, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r8, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r9, kotlin.coroutines.d<? super androidx.compose.material3.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnapFlingBehavior$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.SnapFlingBehavior$animateDecay$1 r0 = (androidx.compose.material3.SnapFlingBehavior$animateDecay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnapFlingBehavior$animateDecay$1 r0 = new androidx.compose.material3.SnapFlingBehavior$animateDecay$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r7 = r0.F$0
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.k1$e r6 = (kotlin.jvm.internal.k1.e) r6
            java.lang.Object r8 = r0.L$0
            androidx.compose.animation.core.AnimationState r8 = (androidx.compose.animation.core.AnimationState) r8
            kotlin.e1.n(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.e1.n(r10)
            kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
            r10.<init>()
            java.lang.Object r2 = r8.getVelocity()
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
            androidx.compose.material3.SnapFlingBehavior$animateDecay$2 r4 = new androidx.compose.material3.SnapFlingBehavior$animateDecay$2
            r4.<init>(r7, r5, r10, r6)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.F$0 = r7
            r0.label = r3
            java.lang.Object r6 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay(r8, r9, r2, r4, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            r6 = r10
        L6b:
            androidx.compose.material3.AnimationResult r9 = new androidx.compose.material3.AnimationResult
            float r6 = r6.element
            float r7 = r7 - r6
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.b.e(r7)
            r9.<init>(r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.animateDecay(androidx.compose.foundation.gestures.ScrollScope, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.DecayAnimationSpec, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, float f5) {
        if (Math.abs(f5 - scrollScope.scrollBy(f5)) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateSnap(androidx.compose.foundation.gestures.ScrollScope r14, float r15, float r16, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r17, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r18, kotlin.coroutines.d<? super androidx.compose.material3.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.material3.SnapFlingBehavior$animateSnap$1
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.material3.SnapFlingBehavior$animateSnap$1 r2 = (androidx.compose.material3.SnapFlingBehavior$animateSnap$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            androidx.compose.material3.SnapFlingBehavior$animateSnap$1 r2 = new androidx.compose.material3.SnapFlingBehavior$animateSnap$1
            r2.<init>(r13, r1)
        L1b:
            r8 = r2
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 != r4) goto L3f
            float r2 = r8.F$1
            float r3 = r8.F$0
            java.lang.Object r4 = r8.L$2
            kotlin.jvm.internal.k1$e r4 = (kotlin.jvm.internal.k1.e) r4
            java.lang.Object r5 = r8.L$1
            androidx.compose.animation.core.AnimationState r5 = (androidx.compose.animation.core.AnimationState) r5
            java.lang.Object r6 = r8.L$0
            androidx.compose.material3.SnapFlingBehavior r6 = (androidx.compose.material3.SnapFlingBehavior) r6
            kotlin.e1.n(r1)
            r11 = r3
            r1 = r5
            goto L98
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L47:
            kotlin.e1.n(r1)
            kotlin.jvm.internal.k1$e r1 = new kotlin.jvm.internal.k1$e
            r1.<init>()
            java.lang.Object r3 = r17.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r9 = r3.floatValue()
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r15)
            java.lang.Object r3 = r17.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L6e
            r3 = r4
            goto L6f
        L6e:
            r3 = 0
        L6f:
            r6 = r3 ^ 1
            androidx.compose.material3.SnapFlingBehavior$animateSnap$2 r7 = new androidx.compose.material3.SnapFlingBehavior$animateSnap$2
            r3 = r14
            r10 = r16
            r7.<init>(r13, r10, r1, r14)
            r8.L$0 = r0
            r10 = r17
            r8.L$1 = r10
            r8.L$2 = r1
            r11 = r15
            r8.F$0 = r11
            r8.F$1 = r9
            r8.label = r4
            r3 = r17
            r4 = r5
            r5 = r18
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.animateTo(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L94
            return r2
        L94:
            r6 = r0
            r4 = r1
            r2 = r9
            r1 = r10
        L98:
            java.lang.Object r3 = r1.getVelocity()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = r6.coerceToTarget(r3, r2)
            androidx.compose.material3.AnimationResult r12 = new androidx.compose.material3.AnimationResult
            float r2 = r4.element
            float r11 = r11 - r2
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.b.e(r11)
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 29
            r10 = 0
            androidx.compose.animation.core.AnimationState r1 = androidx.compose.animation.core.AnimationStateKt.copy$default(r1, r2, r3, r4, r6, r8, r9, r10)
            r12.<init>(r11, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.animateSnap(androidx.compose.foundation.gestures.ScrollScope, float, float, androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.d):java.lang.Object");
    }

    private final float calculateDistanceToDesiredSnapPosition(LazyListLayoutInfo lazyListLayoutInfo, LazyListItemInfo lazyListItemInfo) {
        float f5 = 2;
        return lazyListItemInfo.getOffset() - ((((getSingleAxisViewportSize(lazyListLayoutInfo) - lazyListLayoutInfo.getBeforeContentPadding()) - lazyListLayoutInfo.getAfterContentPadding()) / f5) - (lazyListItemInfo.getSize() / f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float coerceToTarget(float f5, float f6) {
        float t5;
        float A;
        if (f6 == 0.0f) {
            return 0.0f;
        }
        if (f6 > 0.0f) {
            A = kotlin.ranges.u.A(f5, f6);
            return A;
        }
        t5 = kotlin.ranges.u.t(f5, f6);
        return t5;
    }

    private final <T extends Comparable<? super T>> T component1(kotlin.ranges.f<T> fVar) {
        return fVar.getStart();
    }

    private final <T extends Comparable<? super T>> T component2(kotlin.ranges.f<T> fVar) {
        return fVar.getEndInclusive();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (java.lang.Math.abs(r7) <= java.lang.Math.abs(r0)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float findClosestOffset(float r6, androidx.compose.foundation.lazy.LazyListState r7) {
        /*
            r5 = this;
            kotlin.ranges.f r7 = findClosestOffset$calculateSnappingOffsetBounds(r7, r5)
            java.lang.Comparable r0 = r5.component1(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r7 = r5.component2(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r6 = java.lang.Math.signum(r6)
            r1 = 0
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L25
            r2 = r3
            goto L26
        L25:
            r2 = r4
        L26:
            if (r2 == 0) goto L35
            float r6 = java.lang.Math.abs(r7)
            float r2 = java.lang.Math.abs(r0)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 > 0) goto L4e
            goto L40
        L35:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L3d
            r2 = r3
            goto L3e
        L3d:
            r2 = r4
        L3e:
            if (r2 == 0) goto L42
        L40:
            r0 = r7
            goto L4e
        L42:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L49
            goto L4a
        L49:
            r3 = r4
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r1
        L4e:
            boolean r6 = findClosestOffset$isValidDistance(r0)
            if (r6 == 0) goto L55
            r1 = r0
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.findClosestOffset(float, androidx.compose.foundation.lazy.LazyListState):float");
    }

    private static final kotlin.ranges.f<Float> findClosestOffset$calculateSnappingOffsetBounds(LazyListState lazyListState, SnapFlingBehavior snapFlingBehavior) {
        kotlin.ranges.f<Float> e5;
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        float f5 = Float.NEGATIVE_INFINITY;
        float f6 = Float.POSITIVE_INFINITY;
        for (int i5 = 0; i5 < size; i5++) {
            float calculateDistanceToDesiredSnapPosition = snapFlingBehavior.calculateDistanceToDesiredSnapPosition(layoutInfo, visibleItemsInfo.get(i5));
            if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f5) {
                f5 = calculateDistanceToDesiredSnapPosition;
            }
            if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f6) {
                f6 = calculateDistanceToDesiredSnapPosition;
            }
        }
        e5 = kotlin.ranges.t.e(f5, f6);
        return e5;
    }

    private static final boolean findClosestOffset$isValidDistance(float f5) {
        if (!(f5 == Float.POSITIVE_INFINITY)) {
            if (!(f5 == Float.NEGATIVE_INFINITY)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r6, float r7, kotlin.coroutines.d<? super androidx.compose.material3.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material3.SnapFlingBehavior$fling$1 r0 = (androidx.compose.material3.SnapFlingBehavior$fling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnapFlingBehavior$fling$1 r0 = new androidx.compose.material3.SnapFlingBehavior$fling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.e1.n(r8)
            androidx.compose.material3.SnapFlingBehavior$motionScaleDuration$1 r8 = r5.motionScaleDuration
            androidx.compose.material3.SnapFlingBehavior$fling$result$1 r2 = new androidx.compose.material3.SnapFlingBehavior$fling$result$1
            r4 = 0
            r2.<init>(r7, r5, r6, r4)
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.i.h(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            androidx.compose.material3.AnimationResult r8 = (androidx.compose.material3.AnimationResult) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.d):java.lang.Object");
    }

    private final float getItemSize() {
        if (!getVisibleItemsInfo().isEmpty()) {
            List<LazyListItemInfo> visibleItemsInfo = getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                i5 += visibleItemsInfo.get(i6).getSize();
            }
            return i5 / getVisibleItemsInfo().size();
        }
        return 0.0f;
    }

    private final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m6213getHeightimpl(lazyListLayoutInfo.mo660getViewportSizeYbymL2g()) : IntSize.m6214getWidthimpl(lazyListLayoutInfo.mo660getViewportSizeYbymL2g());
    }

    private final List<LazyListItemInfo> getVisibleItemsInfo() {
        return this.lazyListState.getLayoutInfo().getVisibleItemsInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b1 A[PHI: r3
      0x00b1: PHI (r3v13 java.lang.Object) = (r3v12 java.lang.Object), (r3v1 java.lang.Object) binds: [B:17:0x00ae, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object longSnap(androidx.compose.foundation.gestures.ScrollScope r23, float r24, kotlin.coroutines.d<? super androidx.compose.material3.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            boolean r4 = r3 instanceof androidx.compose.material3.SnapFlingBehavior$longSnap$1
            if (r4 == 0) goto L1b
            r4 = r3
            androidx.compose.material3.SnapFlingBehavior$longSnap$1 r4 = (androidx.compose.material3.SnapFlingBehavior$longSnap$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.label = r5
            goto L20
        L1b:
            androidx.compose.material3.SnapFlingBehavior$longSnap$1 r4 = new androidx.compose.material3.SnapFlingBehavior$longSnap$1
            r4.<init>(r0, r3)
        L20:
            r11 = r4
            java.lang.Object r3 = r11.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.l()
            int r5 = r11.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4b
            if (r5 == r7) goto L3e
            if (r5 != r6) goto L36
            kotlin.e1.n(r3)
            goto Lb1
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            java.lang.Object r1 = r11.L$1
            androidx.compose.foundation.gestures.ScrollScope r1 = (androidx.compose.foundation.gestures.ScrollScope) r1
            java.lang.Object r2 = r11.L$0
            androidx.compose.material3.SnapFlingBehavior r2 = (androidx.compose.material3.SnapFlingBehavior) r2
            kotlin.e1.n(r3)
            r5 = r2
            goto L7f
        L4b:
            kotlin.e1.n(r3)
            androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r3 = r0.decayAnimationSpec
            r5 = 0
            float r3 = androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(r3, r5, r2)
            float r3 = java.lang.Math.abs(r3)
            float r8 = r22.getItemSize()
            float r3 = r3 - r8
            float r3 = kotlin.ranges.s.t(r3, r5)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L68
            r5 = r7
            goto L69
        L68:
            r5 = 0
        L69:
            if (r5 == 0) goto L6c
            goto L71
        L6c:
            float r5 = java.lang.Math.signum(r24)
            float r3 = r3 * r5
        L71:
            r11.L$0 = r0
            r11.L$1 = r1
            r11.label = r7
            java.lang.Object r3 = r0.runApproach(r1, r3, r2, r11)
            if (r3 != r4) goto L7e
            return r4
        L7e:
            r5 = r0
        L7f:
            androidx.compose.material3.AnimationResult r3 = (androidx.compose.material3.AnimationResult) r3
            java.lang.Object r2 = r3.component1()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            androidx.compose.animation.core.AnimationState r12 = r3.component2()
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            androidx.compose.animation.core.AnimationState r9 = androidx.compose.animation.core.AnimationStateKt.copy$default(r12, r13, r14, r15, r17, r19, r20, r21)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r10 = r5.snapAnimationSpec
            r2 = 0
            r11.L$0 = r2
            r11.L$1 = r2
            r11.label = r6
            r6 = r1
            r7 = r8
            java.lang.Object r3 = r5.animateSnap(r6, r7, r8, r9, r10, r11)
            if (r3 != r4) goto Lb1
            return r4
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.longSnap(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runApproach(androidx.compose.foundation.gestures.ScrollScope r18, float r19, float r20, kotlin.coroutines.d<? super androidx.compose.material3.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r21
            boolean r1 = r0 instanceof androidx.compose.material3.SnapFlingBehavior$runApproach$1
            if (r1 == 0) goto L17
            r1 = r0
            androidx.compose.material3.SnapFlingBehavior$runApproach$1 r1 = (androidx.compose.material3.SnapFlingBehavior$runApproach$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            goto L1c
        L17:
            androidx.compose.material3.SnapFlingBehavior$runApproach$1 r1 = new androidx.compose.material3.SnapFlingBehavior$runApproach$1
            r1.<init>(r6, r0)
        L1c:
            r5 = r1
            java.lang.Object r0 = r5.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r1 = r5.L$0
            androidx.compose.material3.SnapFlingBehavior r1 = (androidx.compose.material3.SnapFlingBehavior) r1
            kotlin.e1.n(r0)
            goto L61
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.e1.n(r0)
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r20
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r8, r9, r10, r12, r14, r15, r16)
            androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r4 = r6.decayAnimationSpec
            r5.L$0 = r6
            r5.label = r2
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r0 = r0.animateDecay(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L60
            return r7
        L60:
            r1 = r6
        L61:
            androidx.compose.material3.AnimationResult r0 = (androidx.compose.material3.AnimationResult) r0
            androidx.compose.animation.core.AnimationState r0 = r0.component2()
            java.lang.Object r2 = r0.getVelocity()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            androidx.compose.foundation.lazy.LazyListState r3 = r1.lazyListState
            float r1 = r1.findClosestOffset(r2, r3)
            androidx.compose.material3.AnimationResult r2 = new androidx.compose.material3.AnimationResult
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.e(r1)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.runApproach(androidx.compose.foundation.gestures.ScrollScope, float, float, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shortSnap(ScrollScope scrollScope, float f5, kotlin.coroutines.d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        float findClosestOffset = findClosestOffset(0.0f, this.lazyListState);
        return animateSnap(scrollScope, findClosestOffset, findClosestOffset, AnimationStateKt.AnimationState$default(0.0f, f5, 0L, 0L, false, 28, null), this.snapAnimationSpec, dVar);
    }

    public boolean equals(@p4.m Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!kotlin.jvm.internal.l0.g(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) || !kotlin.jvm.internal.l0.g(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) || !kotlin.jvm.internal.l0.g(snapFlingBehavior.lazyListState, this.lazyListState) || !kotlin.jvm.internal.l0.g(snapFlingBehavior.density, this.density)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((0 + this.snapAnimationSpec.hashCode()) * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.lazyListState.hashCode()) * 31) + this.density.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(@p4.l androidx.compose.foundation.gestures.ScrollScope r5, float r6, @p4.l kotlin.coroutines.d<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.SnapFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.material3.SnapFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.material3.SnapFlingBehavior$performFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e1.n(r7)
            r0.label = r3
            java.lang.Object r7 = r4.fling(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            androidx.compose.material3.AnimationResult r7 = (androidx.compose.material3.AnimationResult) r7
            java.lang.Object r5 = r7.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.AnimationState r6 = r7.component2()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.d):java.lang.Object");
    }
}
