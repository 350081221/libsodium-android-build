package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a`\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0098\u0001\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u0017\u001ay\u0010\u001e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001ao\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\b\u0002\u0010\u001a\u001a\u00020\u00192%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0086@¢\u0006\u0004\b\u0010\u0010!\u001au\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0080@¢\u0006\u0004\b\r\u0010&\u001aY\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010'\"\u0004\b\u0001\u0010\u0012\"\b\b\u0002\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\"2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110$¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0004\b*\u0010+\u001a<\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0000\u001a\u0085\u0001\u00100\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0006\u0010(\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0002\u001a\u0085\u0001\u00102\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0006\u0010(\u001a\u00020$2\u0006\u00101\u001a\u00020$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u00020\u000b0\u001b¢\u0006\u0002\b\u001dH\u0002\"\u0018\u0010.\u001a\u00020\u0000*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/v0;", "name", t0.b.f22420d, "velocity", "Lkotlin/r2;", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/u;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "callWithFrameNanos", "(Landroidx/compose/animation/core/Animation;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "state", "updateState", "durationScale", "anim", "doAnimationFrameWithScale", "playTimeNanos", "doAnimationFrame", "Lkotlin/coroutines/g;", "getDurationScale", "(Lkotlin/coroutines/g;)F", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    @m
    public static final Object animate(float f5, float f6, float f7, @l AnimationSpec<Float> animationSpec, @l p<? super Float, ? super Float, r2> pVar, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animate = animate(VectorConvertersKt.getVectorConverter(a0.f19382a), kotlin.coroutines.jvm.internal.b.e(f5), kotlin.coroutines.jvm.internal.b.e(f6), kotlin.coroutines.jvm.internal.b.e(f7), animationSpec, pVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animate == l5 ? animate : r2.f19517a;
    }

    public static /* synthetic */ Object animate$default(float f5, float f6, float f7, AnimationSpec animationSpec, p pVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        float f8 = (i5 & 4) != 0 ? 0.0f : f7;
        if ((i5 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f5, f6, f8, animationSpec, pVar, dVar);
    }

    @m
    public static final Object animateDecay(float f5, float f6, @l FloatDecayAnimationSpec floatDecayAnimationSpec, @l p<? super Float, ? super Float, r2> pVar, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animate$default = animate$default(AnimationStateKt.AnimationState$default(f5, f6, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f5, f6), 0L, new SuspendAnimationKt$animateDecay$2(pVar), dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animate$default == l5 ? animate$default : r2.f19517a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z4, v3.l lVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            lVar = SuspendAnimationKt$animateDecay$4.INSTANCE;
        }
        return animateDecay(animationState, decayAnimationSpec, z4, lVar, (kotlin.coroutines.d<? super r2>) dVar);
    }

    @m
    public static final <T, V extends AnimationVector> Object animateTo(@l AnimationState<T, V> animationState, T t5, @l AnimationSpec<T> animationSpec, boolean z4, @l v3.l<? super AnimationScope<T, V>, r2> lVar, @l kotlin.coroutines.d<? super r2> dVar) {
        long j5;
        Object l5;
        TargetBasedAnimation targetBasedAnimation = new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t5, animationState.getVelocityVector());
        if (z4) {
            j5 = animationState.getLastFrameTimeNanos();
        } else {
            j5 = Long.MIN_VALUE;
        }
        Object animate = animate(animationState, targetBasedAnimation, j5, lVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animate == l5) {
            return animate;
        }
        return r2.f19517a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z4, v3.l lVar, kotlin.coroutines.d dVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        if ((i5 & 8) != 0) {
            lVar = SuspendAnimationKt$animateTo$2.INSTANCE;
        }
        return animateTo(animationState, obj, animationSpec2, z5, lVar, dVar);
    }

    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, v3.l<? super Long, ? extends R> lVar, kotlin.coroutines.d<? super R> dVar) {
        if (animation.isInfinite()) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(lVar, dVar);
        }
        return MonotonicFrameClockKt.withFrameNanos(new SuspendAnimationKt$callWithFrameNanos$2(lVar), dVar);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j5, long j6, Animation<T, V> animation, AnimationState<T, V> animationState, v3.l<? super AnimationScope<T, V>, r2> lVar) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j5);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j6));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j6));
        if (animation.isFinishedFromNanos(j6)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        lVar.invoke(animationScope);
    }

    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j5, float f5, Animation<T, V> animation, AnimationState<T, V> animationState, v3.l<? super AnimationScope<T, V>, r2> lVar) {
        boolean z4;
        long startTimeNanos;
        if (f5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = ((float) (j5 - animationScope.getStartTimeNanos())) / f5;
        }
        doAnimationFrame(animationScope, j5, startTimeNanos, animation, animationState, lVar);
    }

    public static final float getDurationScale(@l kotlin.coroutines.g gVar) {
        float f5;
        boolean z4;
        MotionDurationScale motionDurationScale = (MotionDurationScale) gVar.get(MotionDurationScale.Key);
        if (motionDurationScale != null) {
            f5 = motionDurationScale.getScaleFactor();
        } else {
            f5 = 1.0f;
        }
        if (f5 >= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return f5;
        }
        throw new IllegalStateException("negative scale factor".toString());
    }

    public static final <T, V extends AnimationVector> void updateState(@l AnimationScope<T, V> animationScope, @l AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    @m
    public static final <T, V extends AnimationVector> Object animateDecay(@l AnimationState<T, V> animationState, @l DecayAnimationSpec<T> decayAnimationSpec, boolean z4, @l v3.l<? super AnimationScope<T, V>, r2> lVar, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object animate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) animationState.getTypeConverter(), (Object) animationState.getValue(), (AnimationVector) animationState.getVelocityVector()), z4 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animate == l5 ? animate : r2.f19517a;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j5, v3.l lVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = j5;
        if ((i5 & 4) != 0) {
            lVar = SuspendAnimationKt$animate$5.INSTANCE;
        }
        return animate(animationState, animation, j6, lVar, dVar);
    }

    @m
    public static final <T, V extends AnimationVector> Object animate(@l TwoWayConverter<T, V> twoWayConverter, T t5, T t6, @m T t7, @l AnimationSpec<T> animationSpec, @l p<? super T, ? super T, r2> pVar, @l kotlin.coroutines.d<? super r2> dVar) {
        V newInstance;
        Object l5;
        if (t7 == null || (newInstance = twoWayConverter.getConvertToVector().invoke(t7)) == null) {
            newInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t5));
        }
        Object animate$default = animate$default(new AnimationState(twoWayConverter, t5, newInstance, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t5, t6, newInstance), 0L, new SuspendAnimationKt$animate$3(pVar, twoWayConverter), dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animate$default == l5 ? animate$default : r2.f19517a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:12:0x005a, B:15:0x00e1, B:17:0x00ee), top: B:11:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(@p4.l androidx.compose.animation.core.AnimationState<T, V> r25, @p4.l androidx.compose.animation.core.Animation<T, V> r26, long r27, @p4.l v3.l<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.r2> r29, @p4.l kotlin.coroutines.d<? super kotlin.r2> r30) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, v3.l, kotlin.coroutines.d):java.lang.Object");
    }
}
