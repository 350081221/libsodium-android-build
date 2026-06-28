package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001ai\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0010\u001aB\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001ak\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u00022\b\b\u0002\u0010\u0014\u001a\u0002H\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u0001H\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0016\u001aT\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001a3\u0010\u0018\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u0014\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\"\u001d\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u001a"}, d2 = {"isFinished", "", "Landroidx/compose/animation/core/AnimationState;", "(Landroidx/compose/animation/core/AnimationState;)Z", "AnimationState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "lastFrameTimeNanos", "", "finishedTimeNanos", "isRunning", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "copy", t0.b.f22420d, "velocityVector", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "velocity", "createZeroVectorFrom", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationStateKt {
    @l
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f5, float f6, long j5, long j6, boolean z4) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(a0.f19382a), Float.valueOf(f5), AnimationVectorsKt.AnimationVector(f6), j5, j6, z4);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f5, float f6, long j5, long j6, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        long j7 = (i5 & 4) != 0 ? Long.MIN_VALUE : j5;
        long j8 = (i5 & 8) == 0 ? j6 : Long.MIN_VALUE;
        if ((i5 & 16) != 0) {
            z4 = false;
        }
        return AnimationState(f5, f6, j7, j8, z4);
    }

    @l
    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(@l AnimationState<T, V> animationState, T t5, @m V v4, long j5, long j6, boolean z4) {
        return new AnimationState<>(animationState.getTypeConverter(), t5, v4, j5, j6, z4);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j5, long j6, boolean z4, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i5 & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        AnimationVector animationVector2 = animationVector;
        if ((i5 & 4) != 0) {
            j5 = animationState.getLastFrameTimeNanos();
        }
        long j7 = j5;
        if ((i5 & 8) != 0) {
            j6 = animationState.getFinishedTimeNanos();
        }
        long j8 = j6;
        if ((i5 & 16) != 0) {
            z4 = animationState.isRunning();
        }
        return copy((AnimationState<Object, AnimationVector>) animationState, obj, animationVector2, j7, j8, z4);
    }

    @l
    public static final <T, V extends AnimationVector> V createZeroVectorFrom(@l TwoWayConverter<T, V> twoWayConverter, T t5) {
        V invoke = twoWayConverter.getConvertToVector().invoke(t5);
        invoke.reset$animation_core_release();
        return invoke;
    }

    public static final boolean isFinished(@l AnimationState<?, ?> animationState) {
        return animationState.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    @l
    public static final AnimationState<Float, AnimationVector1D> copy(@l AnimationState<Float, AnimationVector1D> animationState, float f5, float f6, long j5, long j6, boolean z4) {
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f5), AnimationVectorsKt.AnimationVector(f6), j5, j6, z4);
    }

    @l
    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(@l TwoWayConverter<T, V> twoWayConverter, T t5, T t6, long j5, long j6, boolean z4) {
        return new AnimationState<>(twoWayConverter, t5, twoWayConverter.getConvertToVector().invoke(t6), j5, j6, z4);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f5, float f6, long j5, long j6, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i5 & 2) != 0) {
            f6 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        float f7 = f6;
        if ((i5 & 4) != 0) {
            j5 = animationState.getLastFrameTimeNanos();
        }
        long j7 = j5;
        if ((i5 & 8) != 0) {
            j6 = animationState.getFinishedTimeNanos();
        }
        long j8 = j6;
        if ((i5 & 16) != 0) {
            z4 = animationState.isRunning();
        }
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f5, f7, j7, j8, z4);
    }
}
