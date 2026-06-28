package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"B1\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J/\u0010\n\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/VectorizedRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "playTimeNanos", "repetitionPlayTimeNanos", "start", "startVelocity", "end", "repetitionStartVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "getVelocityFromNanos", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "", "iterations", "I", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "durationNanos", "J", "getDurationNanos$animation_core_release", "()J", "initialOffsetNanos", "<init>", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/w;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;

    @l
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;

    @l
    private final RepeatMode repeatMode;

    private VectorizedRepeatableSpec(int i5, VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j5) {
        this.iterations = i5;
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        if (i5 >= 1) {
            this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * AnimationKt.MillisToNanos;
            this.initialOffsetNanos = j5 * AnimationKt.MillisToNanos;
            return;
        }
        throw new IllegalArgumentException("Iterations count can't be less than 1");
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i5, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j5, w wVar) {
        this(i5, vectorizedDurationBasedAnimationSpec, repeatMode, j5);
    }

    private final long repetitionPlayTimeNanos(long j5) {
        long j6 = this.initialOffsetNanos;
        if (j5 + j6 <= 0) {
            return 0L;
        }
        long j7 = j5 + j6;
        long min = Math.min(j7 / this.durationNanos, this.iterations - 1);
        if (this.repeatMode != RepeatMode.Restart && min % 2 != 0) {
            return ((min + 1) * this.durationNanos) - j7;
        }
        return j7 - (min * this.durationNanos);
    }

    private final V repetitionStartVelocity(long j5, V v4, V v5, V v6) {
        long j6 = this.initialOffsetNanos;
        long j7 = j5 + j6;
        long j8 = this.durationNanos;
        if (j7 > j8) {
            return getVelocityFromNanos(j8 - j6, v4, v5, v6);
        }
        return v5;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@l V v4, @l V v5, @l V v6) {
        return (this.iterations * this.durationNanos) - this.initialOffsetNanos;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public V getValueFromNanos(long j5, @l V v4, @l V v5, @l V v6) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j5), v4, v5, repetitionStartVelocity(j5, v4, v6, v5));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public V getVelocityFromNanos(long j5, @l V v4, @l V v5, @l V v6) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j5), v4, v5, repetitionStartVelocity(j5, v4, v6, v5));
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i5, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j5, int i6, w wVar) {
        this(i5, vectorizedDurationBasedAnimationSpec, (i6 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i6 & 8) != 0 ? StartOffset.m139constructorimpl$default(0, 0, 2, null) : j5, (w) null);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i5, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i6, w wVar) {
        this(i5, vectorizedDurationBasedAnimationSpec, (i6 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @k(level = m.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedRepeatableSpec(int i5, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i5, vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m139constructorimpl$default(0, 0, 2, null), (w) null);
    }
}
